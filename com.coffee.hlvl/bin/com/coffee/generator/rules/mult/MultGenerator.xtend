package com.coffee.generator.rules.mult

import com.coffee.generator.AbstractGenerator
import com.coffee.generator.Dialect
import com.coffee.generator.CodeFactory
import javax.management.relation.Relation
import com.coffee.hlvl.MultInstantiation
import com.coffee.hlvl.QImplies
import com.coffee.hlvl.ComplexImplies

class MultGenerator extends AbstractGenerator {
	
		new(String name, Dialect dialect) {
		super(name, dialect)
		val CodeFactory factory = new MultFactory();
		setFactory(factory)
	}
	
	/**
	 * This method is used to determine he type of an expression and
	 * call the method in charge to produce the code.
	 * @param exp is a constraint expression
	 */

//	override parseRelation(Relation rel) {
//		
//		switch (rel){
//			MultInstantiation: '''n.y.i'''
//			QImplies: '''n.y.i'''
//			ComplexImplies: '''n.y.i'''
//			
//		}
//	}
	
	
}
