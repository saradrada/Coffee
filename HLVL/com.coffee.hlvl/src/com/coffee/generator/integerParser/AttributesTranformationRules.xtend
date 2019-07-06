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

class AttributesTranformationRules extends TransformationRules implements IAttributesRules {
	
	override getConstant(ElmDeclaration element) {
		"n.y.i"
	}
	
	override getCore(Common core) {
		"n.y.i"
	}
	
	override getCoreSingle(ElmDeclaration element) {
		"n.y.i"
	}
	
	override getDecomposition(Decomposition rel, Map<String, ElmDeclaration> parents) {
		"n.y.i"
	}
	
	override getElement(ElmDeclaration element) {
		"n.y.i"
	}
	
	override getExpression(Relational rel) {
		"n.y.i"
	}
	
	override getGroup(Group rel, Map<String, ElmDeclaration> parents) {
		"n.y.i"
	}
	
	override getImpliesList(VarList rel) {
		"n.y.i"
	}
	
	override getImpliesPair(ElmDeclaration left, ElmDeclaration right) {
		"n.y.i"
	}
	
	override getMutexList(VarList rel) {
		"n.y.i"
	}
	
	override getMutexPair(ElmDeclaration left, ElmDeclaration right) {
		"n.y.i"
	}
	
	override getVisibility(Visibility rel, List<CharSequence> relations) {
		"n.y.i"
	}
	
	override getDecompositionAtt(ElmDeclaration parent, ElmDeclaration attribute) {
		"n.y.i"
	}
	
}