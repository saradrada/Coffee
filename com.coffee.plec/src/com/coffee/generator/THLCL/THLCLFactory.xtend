package com.coffee.generator.THLCL

import com.coffee.generator.CodeFactory


abstract class THLCLFactory extends CodeFactory{
	
	private static final String HEADER="model"
	private static final String VARIABLES="variables:"
	private static final String CONSTRAINTS="constraints:"
	
	
	override getHeader() {
		return HEADER
	}
	
	override getVarLabel() {
		return VARIABLES
	}
	
	override getConsLabel() {
		return CONSTRAINTS
	}
	

	
}