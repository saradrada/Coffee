package com.coffee.generator.Integers

import com.coffee.generator.CodeFactory
import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.OptionsDeclaration
import com.coffee.hlvl.Core
import com.coffee.hlvl.Decomposition
import java.util.Map
import com.coffee.hlvl.Group
import com.coffee.hlvl.VarList
import com.coffee.hlvl.Visibility
import com.coffee.hlvl.Relational
import java.util.List

class IntFactory extends CodeFactory{
	
	override getConstant(ElmDeclaration element) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getElement(ElmDeclaration element) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getValuesDeclaration(ElmDeclaration variable, OptionsDeclaration variant) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getCore(Core core) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getDecomposition(Decomposition rel, Map<String, ElmDeclaration> parents) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getGroup(Group rel, Map<String, ElmDeclaration> parents) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	override getImpliesList(VarList rel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getMutexList(VarList rel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getExpression(Relational rel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	override getImpliesPair(ElmDeclaration left, ElmDeclaration right) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getMutexPair(ElmDeclaration left, ElmDeclaration right) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getVisibility(Visibility rel, List<CharSequence> relations) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}