package com.coffee.generator.rules.att

import com.coffee.generator.AbstractGenerator
import com.coffee.generator.Dialect
import com.coffee.generator.TransformationRules

class AttGenerator extends AbstractGenerator {
	
	new(String name, Dialect dialect) {
		super(name, dialect)
		val TransformationRules factory = new AttFactory();
		setFactory(factory)
	}
	
}
