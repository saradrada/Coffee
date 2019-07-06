package com.coffee.generator.boolParser

import com.coffee.generator.AbstractHLVLParser
import com.coffee.generator.Dialect

class BoolParser extends AbstractHLVLParser  {
	
		new(String name, Dialect dialect) {
		super(name, dialect)
		setTransformationRules(new BooleanRules(dialect))
	}
	
}