package com.coffee.generator.rules.bools

import com.coffee.generator.AbstractGenerator
import com.coffee.generator.Dialect

class BoolGenerator extends AbstractGenerator {
	
	new(String name) {
		super(name, Dialect.BOOL)
		setFactory(new BoolFactory())
	}
	

	
}