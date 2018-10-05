package com.coffee.generator.THLCL

import com.coffee.generator.variabilityTree.Node
import java.util.Map
import com.coffee.pLEC.VarDeclaration

class THLCLCardinalityFactory extends IntegerFactory{
	private Map<String, Node> tree
	
	new (Map<String, Node> tree){
		this.tree= tree
	}
	
	// we adjust the relations considering the number of instances of each child
	override getMandatory(VarDeclaration parent, VarDeclaration child) {
		if (tree.get(child.name).min >0)
			return parent.name + " = " + child.name
		else
			getOptional(parent, child)
	}
	
	

	
}