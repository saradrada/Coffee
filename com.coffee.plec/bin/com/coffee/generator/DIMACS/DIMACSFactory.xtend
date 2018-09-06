package com.coffee.generator.DIMACS

import com.coffee.generator.CodeFactory
import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map
import java.util.HashMap

class DIMACSFactory extends CodeFactory {
	/**
	 * number of clauses in the problem
	 */
	protected int numClauses
	
	protected Map<String, Integer> variables
	
	new(){
		numClauses=0
		variables= new HashMap<String, Integer>()
	}
	
	override getHeader() {
		'''
		c
		c DIMACS code generated using the Coffee framework
		c
		'''
	}
	
	override getVarLabel() {
		''''''
	}
	
	override getConsLabel() {
		''''''
	}
	
	override getVariable(VarDeclaration variable) {
		val id= variables.keySet.size + 1
		variables.put(variable.name, id)
		''''''
	}
	
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
	
	def void addNumClauses(int amount){
		numClauses+= amount
	}
	def getNumVars(){
		return variables.keySet.size
	}
	
	def getNumClauses(){
		return numClauses
	}
	
}