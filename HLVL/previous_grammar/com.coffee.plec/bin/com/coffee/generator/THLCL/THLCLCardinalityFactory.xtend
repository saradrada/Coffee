package com.coffee.generator.THLCL

import com.coffee.generator.variabilityTree.Node
import java.util.Map
import com.coffee.pLEC.VarDeclaration
import com.coffee.generator.CardinalityFactory
import com.coffee.pLEC.Quantifiable

class THLCLCardinalityFactory extends IntegerFactory implements CardinalityFactory{
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
	
	def declareVaribleNumInstances(Node node){
		'''
		integer «node.id»_card domain:«node.min»..«node.numInstances»
		'''
	}
	
	/**
	 * declare the instances
	 */
	def declareInstance(String instanceName){
		'''
		boolean «instanceName»
		'''
	}
	

	override getQuantifiableRequires(Quantifiable exp) {
		'''
		 ((«exp.minV1.value» <= «exp.var1.name»_card) AND («exp.var1.name»_card <= «exp.maxV1.value»))
		 => 
		 ((«exp.minV2.value» <= «exp.var2.name»_card) AND («exp.var2.name»_card <= «exp.maxV2.value»))
		'''
	}
	

	
}