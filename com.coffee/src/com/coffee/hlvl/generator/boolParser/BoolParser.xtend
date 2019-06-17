package com.coffee.hlvl.generator.boolParser

import com.coffee.hlvl.generator.AbstractHLVLParser
import com.coffee.hlvl.generator.Dialect

class BoolParser extends AbstractHLVLParser  {
	
		new(String name) {
		super(name, Dialect.BOOL)
		setTransformationRules(new BooleanRules())
	}
	
}