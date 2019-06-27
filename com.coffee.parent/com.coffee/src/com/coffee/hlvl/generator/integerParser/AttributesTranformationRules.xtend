package com.coffee.hlvl.generator.integerParser

import com.coffee.hlvl.generator.TransformationRules
import com.coffee.hlvl.hLVL.ElmDeclaration
import com.coffee.hlvl.hLVL.Common
import com.coffee.hlvl.hLVL.Decomposition
import java.util.Map
import com.coffee.hlvl.hLVL.Relational
import com.coffee.hlvl.hLVL.Group
import com.coffee.hlvl.hLVL.VarList
import com.coffee.hlvl.hLVL.Visibility
import java.util.List

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