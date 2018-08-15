package com.coffee.generator

import com.coffee.pLEC.VarDeclaration

abstract class CodeFactory {
	public static val HEADER="language header"
	public static val VARIABLES="language variable's separator"
	public static val CONSTRAINTS="language constraint's separator"


	
	// template related methods
	def abstract CharSequence getHeader()
	def abstract CharSequence getVarLabel()
	def abstract CharSequence getConsLabel()
	
	/**
	 * @return by default the strategy is the empty string
	 */
	def CharSequence getStrategy(){
		""
	}
	// Variables related methods
	def abstract CharSequence getVariable(VarDeclaration variable);
	
	// Constraint related methods
	def abstract CharSequence getOptional()
	def abstract CharSequence getMandatory()
	def abstract CharSequence getExcludes()
	def abstract CharSequence getIncludes()
	def abstract CharSequence getGroup()
	def abstract CharSequence getRule()
}