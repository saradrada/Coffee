package com.coffee.generator.rules.att

import com.coffee.generator.AbstractGenerator
import com.coffee.generator.Dialect
import com.coffee.generator.CodeFactory

class AttGenerator extends AbstractGenerator {
	
	new(String name, Dialect dialect) {
		super(name, dialect)
		val CodeFactory factory = new AttFactory();
		setFactory(factory)
	}
	
}
