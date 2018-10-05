package com.coffee.generator

import com.coffee.pLEC.Attributes

/**
 * Interface to define the methods a codeFactory should implement 
 * for supporting the code associated to the attributes and constraints
 * should implement, all Factories implement this interface
 * implemented by (THLCLFactory, XCSP3Factory, DIMASFactory)
 * @author Angela Villota
 * @version PLEC V3
 * September 2018
 */
interface AttributesFactory {
	def CharSequence getAttributes(Attributes exp);
	
	
}