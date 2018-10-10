package com.coffee.generator.XCSP3

import com.coffee.generator.variabilityTree.Node
import java.util.Map
import com.coffee.generator.TypeOfProblem
import java.util.HashMap
import com.coffee.pLEC.Model
import com.coffee.pLEC.RootRefinement
import com.coffee.pLEC.Structural
import com.coffee.pLEC.Attributes
import com.coffee.pLEC.FodaUN
import com.coffee.pLEC.FodaBin
import com.coffee.pLEC.Quantifiable

class XCSP3CardinalityGenerator extends XCSP3Generator {
	
	private XCSP3CardinalityFactory factory;
	
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
		factory= new XCSP3CardinalityFactory(type, tree)
	}
	
	/**
	 * This method traverses the list of variables to parse each declaration
	 * The declaration is made by the factory 
	 * Revisar este código para reusar los métodos
	 * @param model
	 */
	override parseVariables(Model model) {
		'''
		«FOR node: tree.values»
			 «factory.getVariable(node.variable)»
			 «IF node.id!=root && node.numInstances!=1 »
			 	«factory.declareVaribleNumInstances(node)»
			 	«FOR instance: node.varsIds»
			 		declareInstance(«instance») 
			 	«ENDFOR»
			 «ENDIF»
		«ENDFOR»
		'''
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
	
	override  CharSequence parseQuantifiable(Quantifiable exp){
	 	factory.getQuantifiableRequires(exp)

	 }
	
	def createTree(Model model){
		for( variable : model.vars){
			val Node node = new Node(variable.name)
			node.setVariable(variable)
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
						var allInstances="add("
						for (nameV: padre.varsIds){
							var sufixInstances="add("
							for (var i=1; i<= childNode.max; i++){
								val instance= '''«nameV»_«childVar.name»«i»'''
								childNode.addVarId(instance)
								sufixInstances+= ''' «instance» ,''' 
							}
							//restricciones de las instancias
							sufixInstances=sufixInstances.substring(0,sufixInstances.length -1)+")"
							if (childNode.parent.id!=root && childNode.numInstances>1){
								generateInstanceCardinalityConstraint(sufixInstances, childNode, nameV)
							}
							// acumulando la suma de todas las instancias
							allInstances+= '''«sufixInstances» ,'''
						}				
						padre.addChild(childNode)
						parents.put(childVar.name, exp.parent)
						if (childNode.id!=root && childNode.numInstances!=1){
							//restrucciones del nodo
							// cardinalidad de la feature
							allInstances=allInstances.substring(0,allInstances.length -1)+")"
							generateFeatureCardinalityconstraints(allInstances, childNode)
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
					val padre= tree.get(exp.var1.name)
					println(exp.var1.name + " " + padre)
					for (att : exp.att.ids) {
						val childNode= tree.get(att.name)
						print(att.name + " " + childNode)
						childNode.setParent(padre)
						//childNode.numInstances = padre.numInstances * 1 // an attribute has one cardinality
						childNode.numInstances = 1
						padre.addChild(childNode)
						// esto esta comentado porque no se ha definido bien la semantica de los atributos
//						for (nameV: padre.varsIds){
//							for (var i=1; i<= childNode.max; i++){
//								childNode.addVarId('''«nameV»_«att.name»_«i»''')
//							}
//						}
					}
					constraintsDeclarations.append(parseConstraint(c.name, c.exp))
				}
				else{
					if(c.exp instanceof RootRefinement){
						root= (c.exp as RootRefinement).getVar.name
						constraintsDeclarations.append(//parseConstraint(c.name, c.exp)
						'''
						<intension id= "«c.name»""> 
							eq(«root», 1)
						</intension>
						'''
						)
					}
					else 
						constraintsDeclarations.append(parseConstraint(c.name, c.exp))
				}
			}
		}
	}
		/*
	 * Methods for this notation  estos metodos deben ir en el
	 */
	def generateFeatureCardinalityconstraints(String allInstances, Node node){
		// restrucciones del nodo
		// cardinalidad de la feature
		
		constraintsDeclarations.append(
				  '''
				  <intension id= "ac_«cardConstraints++»"> 
				  	eq(«node.id»_card, «allInstances») 
				  </intension>
				  ''')
		// cantidad de instancias part1
		constraintsDeclarations.append(
								'''
								<intension id= "ac_«cardConstraints++»">
									lq(«node.min», «allInstances»)
								</intension>
								''')
		// cantidad de instancias part2
		constraintsDeclarations.append(
								'''
								<intension id= "ac_«cardConstraints++»">
									gq(«node.numInstances», «allInstances»)
								</intension>
								''')
		// feature=> card
		constraintsDeclarations.append(
								'''
								<intension id= "ac_«cardConstraints++»">
									iff(«node.id», «node.id»_card >0)
								</intension>
								''')
	}
	
	def generateInstanceCardinalityConstraint(String sufixInstances, Node node, String instanceName){
		constraintsDeclarations.append(
		'''
		<intension id= "ac_«cardConstraints++»">
			imp(«instanceName», 
			and(le(«node.min», «sufixInstances»),
			ge(«node.max», «sufixInstances»)))
		</intension>
		''') 
	}
	
	
	
	/****
	 * METHODS INEED and dont know why
	 *  */
	 

	
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
}