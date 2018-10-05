package com.coffee.generator.THLCL

import com.coffee.generator.TypeOfProblem
import java.util.HashMap
import java.util.Map
import com.coffee.generator.variabilityTree.Node
import com.coffee.pLEC.Model
import com.coffee.pLEC.Structural
import com.coffee.pLEC.Attributes
import com.coffee.pLEC.FodaUN
import com.coffee.pLEC.FodaBin
import com.coffee.pLEC.RootRefinement

class THLCLCardinalityGenerator extends THLCLGenerator  {
	
	private THLCLCardinalityFactory factory;
	
	/**
	 * Name of the root variable
	 */
	private String root
	
	/**
	 * String for including the declaration of the variables
	 */
	private StringBuilder variablesDeclarations;
	
	/**
	 * String for including the declaration of the variables
	 */
	private StringBuilder constraintsDeclarations;
	
	/**
	 * 
	 */
	 private Map<String, Node> tree
	 private int cardConstraints=0
	
	new(String name, TypeOfProblem type) {
		super(name, type)
		setFactory(factory)
		variablesDeclarations= new StringBuilder();
		constraintsDeclarations= new StringBuilder();
		//initializing the data sctucture with the map of parents
		tree= new HashMap<String, Node>();
		factory= new THLCLCardinalityFactory(tree)
	}
	/**
	 * This method traverses the list of variables to parse each declaration
	 * The declaration is made by the factory 
	 * @param model
	 */
	override parseVariables(Model model) {
		'''
		«FOR node: tree.values»
			 boolean «node.id»
			 «IF node.id!=root && node.numInstances!=1 »
			 	integer «node.id»_card domain:«node.min»..«node.numInstances»
			 	«FOR instance: node.varsIds»
			 		boolean «instance»
			 	«ENDFOR»
			 «ENDIF»
		«ENDFOR»
		'''
	}
	
	def createTree(Model model){
		for( variable : model.vars){
			val Node node = new Node(variable.name)
			// puede no tener cardinalidad y ser null
			if(variable.min===null&& variable.max===null){
				node.setMin(1)
				node.setMax(1)
			}
			else{
				node.setMin(variable.min.value)
				node.setMax(variable.max.value)
			}
			tree.put(variable.name, node)	
		}
		for(c: model.constraints){
			if (c.exp instanceof Structural){
				val exp= c.exp as Structural
				val padre= tree.get(exp.parent.name)
				if(padre.id.equals(root)){
					padre.addVarId(padre.id)
				}
				if (exp.min===null && exp.max===null){ //no group cardinality
					//generate the tree and the instances
					for (childVar : exp.group.ids) {
						val childNode= tree.get(childVar.name) // esto puede ser null?
						childNode.setParent(padre)
						childNode.setNumInstances(padre.numInstances * childNode.max)
						var allInstances=""
						for (nameV: padre.varsIds){
							var sufixInstances=""
							for (var i=1; i<= childNode.max; i++){
								val instance= '''«nameV»_«childVar.name»«i»'''
								childNode.addVarId(instance)
								sufixInstances+= ''' «instance» +''' 
							}
							//restricciones de las instancias
							sufixInstances=sufixInstances.substring(0,sufixInstances.length -1)
							if (childNode.parent.id!=root && childNode.numInstances>1){
								generateInstanceCardinalityConstraint(sufixInstances, childNode, nameV)
//								constraintsDeclarations.append(
//								'''ac_«cardConstraints++»: «nameV» <=> ((«childNode.min» <= «sufixInstances») AND
//								(«childNode.max» >= «sufixInstances»))
//								''') // quitar el ultimo +
//								
//
							}
							// acumulando la suma de todas las instancias
							allInstances+= '''«sufixInstances» +'''
							
							
						}				
						padre.addChild(childNode)
						parents.put(childVar.name, exp.parent)
						if (childNode.id!=root && childNode.numInstances!=1){
							//restrucciones del nodo
							// cardinalidad de la feature
							allInstances=allInstances.substring(0,allInstances.length -1)
							generateFeatureCardinalityconstraints(allInstances, childNode)
//							constraintsDeclarations.append(
//								'''ac_«cardConstraints++»: «childVar.name»_card = «allInstances»
//								''')
//							//cantidad de instancias part1
//							constraintsDeclarations.append(
//								'''ac_«cardConstraints++»: «childNode.min»<= «allInstances»
//								''')
//							//cantidad de instancias part2
//							constraintsDeclarations.append(
//								'''ac_«cardConstraints++»: «childNode.numInstances» >= «allInstances»
//								''')
//							//feature=> card
//							constraintsDeclarations.append(
//								'''ac_«cardConstraints++»: «childNode.id» <=> «childVar.name»_card >0
//								''')
							}	
					}
				}else{ //group cardinalities
					//generate the tree and the instances
					for (childVar : exp.group.ids) {
						val childNode= tree.get(childVar.name) // esto puede ser null?
						childNode.setParent(padre)
						childNode.setNumInstances(padre.numInstances * childNode.max)
						for (nameV: padre.varsIds){
								for (var i=1; i<= childNode.max; i++){
									childNode.addVarId('''«nameV»_«childVar.name»«i»''')
								}
							}				
						padre.addChild(childNode)
					}
					//Now proceed to create the group cardinalities				
					constraintsDeclarations.append(parseConstraint(c.name, c.exp))
				}
			}
			else{	
				if(c.exp instanceof Attributes){
					val exp= c.exp as Attributes
					val padre= tree.get(exp.var1)
					for (att : exp.att.ids) {
						val childNode= tree.get(att.name)
						childNode.setParent(padre)
						childNode.numInstances = padre.numInstances * 1 // an attribute has one cardinality
						padre.addChild(childNode)
						for (nameV: padre.varsIds){
							for (var i=1; i<= childNode.max; i++){
								childNode.addVarId('''«nameV»_«att.name»_«i»''')
							}
						}
					}
					
				}
				else{
					if(c.exp instanceof RootRefinement){
						root= (c.exp as RootRefinement).getVar.name
						constraintsDeclarations.append(
						'''«c.name»: «root» = 1
						'''
						)
					}
					else 
						constraintsDeclarations.append(parseConstraint(c.name, c.exp))
				}
			}
		}
	}
	
	def processStructural(Structural exp){
		val padre= tree.get(exp.parent.name)
		if(padre.id.equals(root)){
			padre.addVarId(padre.id)		
		}
		for (childVar : exp.group.ids) {
			val childNode= tree.get(childVar.name) // esto puede ser null?
			childNode.setParent(padre)
			childNode.setNumInstances(padre.numInstances * childNode.max)
			for (nameV: padre.varsIds){
				for (var i=1; i<= childNode.max; i++){
					childNode.addVarId('''«nameV»_«childVar.name»«i»''')
				}
			}				
			padre.addChild(childNode)
		}
		
	}
	
	/**
	 * Method to parse the constraints in a model.
	 * The constraints are contained in a collection 
	 * of constraints
	 * @param model 
	 */	
	override parseConstraints(Model model) {
		constraintsDeclarations.toString	
	}
	
		/**
	 * This method does not generate code, just keeps track 
	 * the parents of each element in an structural relation 
	 * @param exp is a Structural relation
	 */
	override parseStructuralNoCard(Structural exp) {
		addParents(exp)
		''''''
	}
	
	/**
	 * Method obtaining the representation of an structural expression
	 * this method calls the factory because the code is dependent of the type of
	 * problem and the type of file
	 * @param exp is an structural expression 
	 */
	override parseStructuralCard(Structural exp) {
		factory.getGroupCardinality(exp, parents)
	}
	
	/**
	 * Method obtaining the representation of FODA expression 
	 * this method calls the factory because the code is dependent of the type of
	 * problem and the type of file
	 * @param exp is Foda expression with two variables
	 */
	override parseFodaBinary(FodaBin exp) {
		'''
		«IF exp.op=="requires"»
			«factory.getRequires(exp.var1, exp.var2)»
		«ELSE»
			«IF exp.op=="excludes"»
				«factory.getExcludes(exp.var1, exp.var2)»
			«ELSE»
				«IF exp.op=="mandatory"»
					«factory.getMandatory(exp.var1, exp.var2)»
				«ELSE»
					«factory.getOptional(exp.var1, exp.var2)»
				«ENDIF»
			«ENDIF»
		«ENDIF»
		'''
	}
	
	/**
	 * Method for parsing FODA operations with just one variable
	 * this is allowed because there exists a structural expression defined before
	 * @param exp is an unary FODA expression
	 */
	override parseFodaUnary(FodaUN exp) {
		'''
		«IF exp.op=="optional"»
			«factory.getOptional(parents.get(exp.var1.name),exp.var1)»
		«ELSE»
			«IF exp.op=="mandatory"»
				«factory.getMandatory(parents.get(exp.var1.name),exp.var1)»
			«ELSE»
			«ENDIF»
		«ENDIF»
		'''
	}
	
		/**
	 * Method to produce a sequence of characters with the 
	 * model represented as a constraint problem using  the 
	 * Textual HLCL language (model.hlcl)
	 * @param model is an ECORE syntax tree with the program
	 * this syntax tree should be traversed. 
	 */
	override parseModel(Model model) {
		
		'''
		«createTree(model)»
		«factory.getHeader» «modelName»
		«factory.getVarLabel»
		«parseVariables(model)»
		«factory.getConsLabel»
		«parseConstraints(model)»
		'''
	}
	/*
	 * Methods for this notation
	 */
	def generateFeatureCardinalityconstraints(String allInstances, Node node){
		// restrucciones del nodo
		// cardinalidad de la feature
		
		constraintsDeclarations.append(
								'''ac_«cardConstraints++»: «node.id»_card = «allInstances»
		''')
		// cantidad de instancias part1
		constraintsDeclarations.append(
								'''ac_«cardConstraints++»: «node.min»<= «allInstances»
		''')
		// cantidad de instancias part2
		constraintsDeclarations.append(
								'''ac_«cardConstraints++»: «node.numInstances» >= «allInstances»
		''')
		// feature=> card
		constraintsDeclarations.append(
								'''ac_«cardConstraints++»: «node.id» <=> «node.id»_card >0
		''')
	}
	
	def generateInstanceCardinalityConstraint(String sufixInstances, Node node, String instanceName){
		constraintsDeclarations.append('''ac_«cardConstraints++»: «instanceName» <=> 
		((«node.min» <= «sufixInstances») AND
		(«node.max» >= «sufixInstances»))
		''') 
	}
}