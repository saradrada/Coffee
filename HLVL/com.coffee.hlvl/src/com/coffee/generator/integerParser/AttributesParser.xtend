package com.coffee.generator.integerParser;

import com.coffee.generator.Dialect

class AttributesParser  extends BasicIntegerParser {
	
		new(String name, Dialect dialect) {
		super(name, dialect)
		setTransformationRules(new BasicIntegerRules(dialect))
	}
	
}