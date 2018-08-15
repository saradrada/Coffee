package com.coffee.generator.THLCL

import com.coffee.generator.CodeFactory
import com.coffee.pLEC.VarDeclaration

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
	
	override getOptional() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getMandatory() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getExcludes() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getIncludes() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getGroup() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getRule() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getVariable(VarDeclaration variable) '''
		«variable.type» «variable.name» 
	'''
	

	
}