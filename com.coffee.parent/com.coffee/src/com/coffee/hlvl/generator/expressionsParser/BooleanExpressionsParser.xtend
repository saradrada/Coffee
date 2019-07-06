package com.coffee.hlvl.generator.expressionsParser

import com.coffee.hlvl.hLVL.Relational
import com.coffee.hlvl.generator.Dialect
import com.coffee.hlvl.hLVL.BoolConstant
import com.coffee.hlvl.hLVL.VariableRef
import com.coffee.hlvl.hLVL.Negation
import com.coffee.hlvl.hLVL.Iff
import com.coffee.hlvl.hLVL.Implies
import com.coffee.hlvl.hLVL.Or
import com.coffee.hlvl.hLVL.And


/**
 * Parser for boolean expressions 
 * @author Angela Villota
 * @version HLVL V1.4
 *  May 2019
 */

class BooleanExpressionsParser implements IExpressionsParser {
	/** 
	 * Tranformation rules
	 */
	private IBooleanExpressionsRules rules;
	
	private Dialect dialect;
	
	override setDialect(Dialect dialect) {
		this.dialect= dialect;
	}
	
	override parse(Relational exp) {
		
		switch(exp){
			BoolConstant: exp.value
			VariableRef: rules.getVariable(exp)
			Negation: rules.getNegation(exp)
			Iff: rules.getIff(exp)
			Implies: rules.getImplies(exp)
			Or: rules.getOr(exp)
			And: rules.getAnd(exp)
			//Equality: '''(«parse(exp.left)» = «parse(exp.right)»)'''

		}
	}
}