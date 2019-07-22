package com.coffee.generator.expressionsParser;

import com.coffee.hlvl.And
import com.coffee.hlvl.Iff
import com.coffee.hlvl.Implies
import com.coffee.hlvl.Negation
import com.coffee.hlvl.Or
import com.coffee.hlvl.VariableRef
import com.coffee.generator.commons.IMiniZincConstants
import com.coffee.hlvl.BinaryFunction
import com.coffee.hlvl.Comparison
import com.coffee.hlvl.Minus
import com.coffee.hlvl.MulOrDiv
import com.coffee.hlvl.Plus
import com.coffee.hlvl.UnaryFunction
import com.coffee.generator.Dialect

/**
 * Implementation of boolean rules
 * @author Angela Villota
 * @version HLVL V1.4
 *  May 2019
 */
class IntegerExpressionsRules implements IIntegerExpressionsRules, IMiniZincConstants{
	/**
	 * 
	 */
	private IExpressionsParser parser;
	private Dialect dialect;
	new(IExpressionsParser parser, Dialect dialect) {
		this.parser = parser
		this.dialect = dialect
		
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
		if (exp.variable.dataType =="boolean" && 
			(dialect==Dialect.BASIC_INT || 
				dialect==Dialect.ATTRIBUTE ||
				dialect==Dialect.MULTIPLICITY)){
					return '''«exp.variable.name» > 0''' 
				}else{
					return exp.variable.name 
				}
	}
	
	override getBinaryFunction(BinaryFunction exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getComparison(Comparison exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getMinus(Minus exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getMulOrDiv(MulOrDiv exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getPlus(Plus exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getUnaryFunction(UnaryFunction exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}