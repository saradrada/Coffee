package com.coffee.generator

import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.VariantDeclaration
import com.coffee.pLEC.Assignment


/**
 * Interface to define the methods a codeFactory for the PLEC language
 * should implement, all Factories implement this interface
 * implemented by (THLCLFactory, XCSP3Factory, DIMASFactory)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
abstract class CodeFactory implements FODAFactory{
	

	// Variables related methods
	def  CharSequence getVariable(VarDeclaration variable);
	def  CharSequence getValuesDeclaration(VarDeclaration variable, VariantDeclaration variant);
	def  CharSequence getAssignement(Assignment exp);
	
}