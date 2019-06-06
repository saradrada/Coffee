package com.coffee.generator.THLCL

import com.coffee.generator.CodeFactory
import com.coffee.generator.OptimizationFactory
import com.coffee.generator.CardinalityFactory
import com.coffee.generator.FODAFactory
import com.coffee.pLEC.VarDeclaration
import com.coffee.generator.AttributesFactory
import com.coffee.generator.CoffeeFactory
import com.coffee.pLEC.Attributes
import com.coffee.pLEC.Refinement
import com.coffee.pLEC.RootRefinement

/**
 * Abstract class for XCSP code generation
 * this codeFactory implements the common elements in all XCSP code factories
 * This class is extended by CSPFactory, SATFactory, and COPFactory  
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
abstract class THLCLFactory extends CodeFactory implements OptimizationFactory, FODAFactory, AttributesFactory, CoffeeFactory{
	/**
	 * Strings in the Textual HLCL format
	 */
	private static final String HEADER="model"
	private static final String VARIABLES="variables:"
	private static final String CONSTRAINTS="constraints:"
	
//	/*===================================================================
//	 *===================================================================
//	  Methods that should be implemented in an instance of the 
//	  * THLCLFactory (IntegerFactory, BooleanFactory)
//	  */
//	 /**
//	 * @return by default the strategy is the empty string
//	 */
//	 abstract override CharSequence getStrategy();
//	 abstract override CharSequence getClonConstraints();
	
	/*===================================================================
	 *===================================================================
	 *  Getters and setters
	 */
	def getHeader() {
		return HEADER
	}
	
	def getVarLabel() {
		return VARIABLES
	}
	
	def getConsLabel() {
		return CONSTRAINTS
	}
	

	
	/**
	 * 
	 */
	override getRule(CharSequence left, CharSequence right) {
		'''(«left») => («right»)'''
	}
	
	override getRootConstraint(RootRefinement exp) {
		'''«exp.^var.name» = 1'''
	}
	
	//TODO definir como se hace unrefinement a este nivel 
	override getRefinement(Refinement exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
		/*===================================================================
	 *===================================================================
	 * Unsupported methods at this level
	 * */
	 abstract override getVariable(VarDeclaration variable);
	override getStrategy() {
		throw new UnsupportedOperationException("Error: The model cannot have a strategy section")
	}
	
	override optimizationConstraints() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getObjectives() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
//	override getClonConstraints() {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
//	}
//	
//	override getClonVariables(VarDeclaration variable) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
//	}
	
	override getAttributes(Attributes exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	

	

	
}