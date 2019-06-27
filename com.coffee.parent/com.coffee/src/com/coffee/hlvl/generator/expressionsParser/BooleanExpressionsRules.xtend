package com.coffee.hlvl.generator.expressionsParser

import com.coffee.hlvl.hLVL.And
import com.coffee.hlvl.hLVL.Iff
import com.coffee.hlvl.hLVL.Implies
import com.coffee.hlvl.hLVL.Negation
import com.coffee.hlvl.hLVL.Or
import com.coffee.hlvl.hLVL.VariableRef
import com.coffee.hlvl.generator.commons.IMiniZincConstants


/**
 * Implementation of boolean rules
 * @author Angela Villota
 * @version HLVL V1.4
 *  May 2019
 */
class BooleanExpressionsRules implements IBooleanExpressionsRules, IMiniZincConstants{
	/**
	 * 
	 */
	private IExpressionsParser parser;
	
	new(IExpressionsParser parser) {
		this.parser = parser
		
	}
	override getAnd(And exp) {
		'''(«parser.parse(exp.left)» «AND» «parser.parse(exp.right)»)'''
	}
	
	override getIff(Iff exp) {
		'''(«parser.parse(exp.left)»  «IFF» «parser.parse(exp.right)»)'''
	}
	
	override getImplies(Implies exp) {
		'''(«parser.parse(exp.left)»  «IMPLIES_LR» «parser.parse(exp.right)»)'''
	}
	
	/**
	 * 
	 */
	override getNegation(Negation exp) {
		'''«NOT»(«parser.parse(exp.expression)»)'''
	}
	
	override getOr(Or exp) {
		'''(«parser.parse(exp.left)» «OR» «parser.parse(exp.right)»)'''
	}
	
	override getVariable(VariableRef exp) {
		return exp.variable.name
	}
	
}