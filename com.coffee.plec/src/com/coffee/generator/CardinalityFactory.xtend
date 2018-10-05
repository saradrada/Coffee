package com.coffee.generator

import com.coffee.pLEC.VarDeclaration

interface CardinalityFactory {
/**
 * Interface to define the methods a codeFactory for the PLEC language
 * should implement, all Factories implement this interface
 * implemented by (THLCLFactory, XCSP3Factory, DIMASFactory)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
 	def CharSequence getClonConstraints();
 	def CharSequence getClonVariables(VarDeclaration variable); 
 	
 	
}