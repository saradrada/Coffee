package com.coffee.generator

import com.coffee.pLEC.Rule
import com.coffee.pLEC.Refinement

/**
 * Interface to define the methods a codeFactory for generating 
 * the code related for the new constraints included inthe coffee framework
 * for models including attributes
 * should implement, all Factories implement this interface
 * implemented by (THLCLFactory, XCSP3Factory)
 * @author Angela Villota
 * @version PLEC V3
 * September 2018
 */

interface CoffeeFactory {
	def CharSequence getRule(CharSequence left, CharSequence right);
	def CharSequence getRefinement(Refinement exp);
	
}