package com.coffee.generator.integerParser;

import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.Common
import com.coffee.hlvl.Decomposition
import java.util.Map
import com.coffee.hlvl.Relational
import com.coffee.hlvl.Group
import com.coffee.hlvl.VarList
import com.coffee.hlvl.Visibility
import java.util.List
import com.coffee.generator.TransformationRules
import com.coffee.generator.Dialect

class AttributesTranformationRules extends BasicIntegerRules implements IAttributesRules {
	
	new(Dialect dialect) {
		super(dialect)
	}
	
	override getDecompositionAtt(ElmDeclaration parent, ElmDeclaration attribute) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	

	
}