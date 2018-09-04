package com.coffee.generator.DIMACS

import com.coffee.generator.CodeFactory
import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map

class DIMACSFactory extends CodeFactory {
	
	override getHeader() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getVarLabel() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getConsLabel() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getVariable(VarDeclaration variable) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getOptional(VarDeclaration parent, VarDeclaration child) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getMandatory(VarDeclaration parent, VarDeclaration child) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getExcludes(VarDeclaration left, VarDeclaration right) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getRequires(VarDeclaration left, VarDeclaration right) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getGroupCardinality(Structural exp, Map<String, VarDeclaration> parents) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}