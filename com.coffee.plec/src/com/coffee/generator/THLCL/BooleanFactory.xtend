package com.coffee.generator.THLCL

import com.coffee.generator.CodeFactory
import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map

class BooleanFactory extends CodeFactory{
	public static val HEADER="model"
	public static val VARIABLES="variables:"
	public static val CONSTRAINTS="constraints:"
	
	
	override getHeader() {
		return HEADER
	}
	
	override getVarLabel() {
		return VARIABLES
	}
	
	override getConsLabel() {
		return CONSTRAINTS
	}
	
	override getOptional(VarDeclaration parent, VarDeclaration child) {
		'''«child.name» => «parent.name»''' 
	}
	
	override getMandatory(VarDeclaration parent, VarDeclaration child) {
		'''«parent.name» <=> «child.name»'''
	}
	
	override getExcludes(VarDeclaration left, VarDeclaration right) {
		''' NOT («left.name» AND «right.name»)''' 
	}
	
	override getRequires(VarDeclaration left, VarDeclaration right) {
		'''«left.name» => «right.name»''' 
	}
	
	override getGroupCardinality(Structural exp, Map <String, VarDeclaration> parents) {
		var idsSum=""
		var output =""
		for (child : exp.group.ids) {
			output += "(" + child.name + " => "+ exp.parent + ") AND \n"
			idsSum+= child.name +" + "
			parents.put(child.name, exp.parent)
		}
		output += "("+ exp.parent +" >= 1) => ("+ idsSum.substring(0, idsSum.length() - 2) +">= " 
					+ exp.min.value + ") AND \n" 
		output += "("+ exp.parent +" >= 1) => ("+ idsSum.substring(0, idsSum.length() - 2) + "<= "
					+ exp.max.value+ ")" 
		output
	}
	

	/**
	 * All variables are boolean variables, there is no need to declare variants
	 */
	override getVariable(VarDeclaration variable) '''
		«variable.type» «variable.name»
	'''
	

	
}