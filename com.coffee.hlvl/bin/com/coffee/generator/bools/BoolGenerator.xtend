package com.coffee.generator.bools

import com.coffee.generator.AbstractGenerator
import com.coffee.hlvl.Relation
import com.coffee.generator.Dialect

class BoolGenerator extends AbstractGenerator {
	
	new(String name) {
		super(name, Dialect.BASIC)
		setFactory(new BoolFactory())
	}
	

	
}