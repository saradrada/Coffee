package com.coffee.generator.Integers

import com.coffee.generator.AbstractGenerator
import com.coffee.generator.Dialect
import com.coffee.generator.CodeFactory

class IntGenerator extends AbstractGenerator {
	
	new(String name, Dialect dialect) {
		super(name, dialect)
		var CodeFactory factory;
		
		switch dialect{
			case Dialect.INST: factory= new InstFactory()
			default: {
				factory= new AttFactory()
			}
		}
		setFactory(factory)
	}
	
}