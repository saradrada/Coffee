package com.coffee.generator.DIMACS

import com.coffee.generator.CodeFactory
import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map
import java.util.HashMap
import com.coffee.generator.FODAFactory
import com.coffee.pLEC.VariantDeclaration
import com.coffee.pLEC.RootRefinement

class DIMACSFactory extends CodeFactory implements FODAFactory {
	/**
	 * Strings in the Textual DIMACS format
	 */
	private static final String HEADER=
		'''
		c
		c DIMACS code generated using the Coffee framework
		c
		'''
	/**
	 * number of clauses in the problem
	 */
	protected int numClauses
	
	/**
	 * Map of variables to obtain the numeric Id using the name of 
	 * the variable as key
	 */
	protected Map<String, Integer> variables
	
	/**
	 * Constructor 
	 */
	new(){
		numClauses=0
		variables= new HashMap<String, Integer>()
	}
	
	/**
	 * @returns returns the code generated for the 
	 * header of a CNF file in the DIMACS format
	 */
	def getHeader() {
		return HEADER
	}
	
	/**
	 * This method includes the variable name in a variables map to obtain an
	 * integer for the DIMACS transformation
	 * @param variable is a VarDeclaration
	 * @return the empty String, variables are not translated in the DIMCAS code
	 */
	override getVariable(VarDeclaration variable) {
		val id= variables.keySet.size + 1
		variables.put(variable.name, id)
		''''''
	}
	
	/**
	 * @param
	 * @param 
	 * @returns the CNF representation of an optional relation
	 */
	override getOptional(VarDeclaration parent, VarDeclaration child) {
		addNumClauses(1)
		'''
		-«variables.get(child.name)» «variables.get(parent.name)»
		'''
	}
	
	override getMandatory(VarDeclaration parent, VarDeclaration child) {
		addNumClauses(2)
		'''
		«variables.get(parent.name)» -«variables.get(child.name)»
		-«variables.get(parent.name)» «variables.get(child.name)»
		'''
	}
	
	override getExcludes(VarDeclaration left, VarDeclaration right) {
		addNumClauses(1)
		'''
		-«variables.get(left.name)» -«variables.get(right.name)»
		'''
	}
	
	override getRequires(VarDeclaration left, VarDeclaration right) {
		addNumClauses(1)
		'''
		-«variables.get(left.name)» «variables.get(right.name)»
		'''
	}
	
	override getGroupCardinality(Structural exp, Map<String, VarDeclaration> parents) {
		var output =""
		// an alternative relation
		if (exp.min.value==1 && exp.max.value==1){
			// There are n+1 clauses for each child
			for (child : exp.group.ids) {
				addNumClauses(exp.group.ids.size+ 1)
				parents.put(child.name, exp.parent)
				var singleClause='''-«variables.get(exp.parent.name)» «variables.get(child.name)»''' 
				var clauses=
				'''
				-«variables.get(child.name)» «variables.get(exp.parent.name)»
				'''
				
				for (inChild : exp.group.ids) {
					if(!(child.name == inChild.name)){
						singleClause+=''' «variables.get(inChild.name)»'''
						clauses+= 
						'''
						-«variables.get(child.name)» -«variables.get(inChild.name)»
						'''
					}
				}
				output+=
				'''
				«singleClause»
				«clauses»
				'''
			}
		}// an OR relation
		else 
			if (exp.min.value==0 && exp.max.value >1){
			// in total are |children| +1 clauses
			addNumClauses(exp.group.ids.size+ 1)
			var singleClause= '''-«variables.get(exp.parent.name)»''' 
			var clauses=""
			for (child : exp.group.ids) {
				singleClause+= ''' «variables.get(child.name)»''' 
				clauses+= 
				'''«variables.get(exp.parent.name)» -«variables.get(child.name)»
				'''
				parents.put(child.name, exp.parent)
			}
			output=
			'''
			«singleClause»
			«clauses»
			'''
		}
		output
	}
	
	override getRootConstraint(RootRefinement exp) {
		addNumClauses(1)
		'''«variables.get(exp.getVar.name)»'''
		
	}
	
	/*===================================================================
	 *===================================================================
	 * Methods used just in this notation
	 * */
	
	/** 
	 * Increased the count of clauses by the number in amount
	 * @param number of clauses to add
	 */
	 def void addNumClauses(int amount){
		numClauses+= amount
	}
	
	/**
	 * @return returns the number of variables in the problem
	 */
	def getNumVars(){
		return variables.keySet.size
	}
	/**
	 * @return returns the number of generated clauses
	 */
	def getNumClauses(){
		return numClauses
	}
	
	
	/*===================================================================
	 *===================================================================
	 * Unsupported methods for this notation
	 * */
	override getValuesDeclaration(VarDeclaration variable, VariantDeclaration variant) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	

	

	
}