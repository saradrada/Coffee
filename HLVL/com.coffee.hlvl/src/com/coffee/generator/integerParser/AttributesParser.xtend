package com.coffee.generator.integerParser;

import com.coffee.generator.Dialect

class AttributesParser  extends BasicIntegerParser {
	
		new(String name) {
		super(name, Dialect.BASIC_BOOL)
		setTransformationRules(new AttributesTranformationRules(Dialect.BASIC_BOOL))
	}
	
}