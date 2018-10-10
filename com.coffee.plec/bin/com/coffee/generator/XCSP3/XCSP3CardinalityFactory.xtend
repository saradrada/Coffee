package com.coffee.generator.XCSP3

import com.coffee.generator.TypeOfProblem
import java.util.Map
import com.coffee.generator.variabilityTree.Node
import com.coffee.generator.CardinalityFactory
import com.coffee.pLEC.Quantifiable
import com.coffee.pLEC.VarDeclaration

class XCSP3CardinalityFactory extends CSPFactory implements CardinalityFactory{
	
	
	private Map<String, Node> tree
	new(TypeOfProblem type, Map<String, Node> tree) {
		super(type)
		this.tree= tree
	}
	
	/**
	 * declare the instances
	 */
	def declareInstance(String instanceName){
		'''
		<var id="«instanceName»"> 0 1 </var>
		'''
	}
	
	/**
	 * 
	 */
	def declareVaribleNumInstances(Node node){
		'''
		<var id="«node.id»_card"> «node.min»..«node.numInstances»</var>
		'''
	}
	
	override getQuantifiableRequires(Quantifiable exp) {
		'''
		 imp(
		 and(lq(«exp.minV1.value»,«exp.var1.name»_card), lq(«exp.var1.name»_card, «exp.maxV1.value»)), 
		 and(lq(«exp.minV2.value»,«exp.var2.name»_card), lq(«exp.var2.name»_card, «exp.maxV2.value»)))
		'''
	}
	

	
	
	
	
}