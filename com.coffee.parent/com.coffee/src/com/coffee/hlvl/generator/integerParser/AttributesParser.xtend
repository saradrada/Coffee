package com.coffee.hlvl.generator.integerParser

import com.coffee.hlvl.generator.Dialect
import com.coffee.hlvl.generator.AbstractHLVLParser

class AttributesParser  extends AbstractHLVLParser {
	
		new(String name) {
		super(name, Dialect.BOOL)
		setTransformationRules(new AttributesTranformationRules())
	}
	
}