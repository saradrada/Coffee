package com.coffee.generator.XCSP3


import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map
import com.coffee.generator.TypeOfProblem
import com.coffee.pLEC.Attributes
import com.coffee.pLEC.Rule
import com.coffee.pLEC.Refinement
import com.coffee.pLEC.Assignment

@Deprecated
class SATFactory  extends XCSP3Factory{
	new (TypeOfProblem type){
		super(type)
	}
	
	override getOptional(VarDeclaration parent, VarDeclaration child) {
		'''or(not(«child.name»), «parent.name»)'''
	}
	
	override getMandatory(VarDeclaration parent, VarDeclaration child) {
		// these should be two different constraints
		'''and(or(«parent.name», not(«child.name»)), or(not(«parent.name»,«child.name»)))'''
	}
	
	override getExcludes(VarDeclaration left, VarDeclaration right) {
		''' or(not(«left.name»), not(«right.name»))'''
	}
	
	override getRequires(VarDeclaration left, VarDeclaration right) {
		'''or(not(«left.name»), «right.name»)'''
	}
	
	override getGroupCardinality(Structural exp, Map<String, VarDeclaration> parents) {
		var output =""
		// an alternative relation
		if (exp.min.value==1 && exp.max.value==1){
			for (child : exp.group.ids) {
				parents.put(child.name, exp.parent)
				var childrenIds=""
				for (inChild : exp.group.ids) {
					if(!(child.name == inChild.name)){
						childrenIds+= '''not(«inChild.name»)'''
					}
				}
				output+= '''imp(«child.name», and(«childrenIds», «exp.parent.name»)), '''
			}
			output='''and(«output.substring(0, output.length() - 1)»)'''
		}
		// and AND relation   
		else if (exp.min.value==0 && exp.max.value==1){
			var childrenIds=""
			for (child : exp.group.ids) {
				childrenIds+= child.name +", "
				parents.put(child.name, exp.parent)
			}
			output= '''imp(«exp.parent.name», and(«childrenIds.substring(0, childrenIds.length() - 2)» ))'''
		}
		// an OR relation
		else if (exp.min.value==0 && exp.max.value >1){
			var childrenIds=""
			for (child : exp.group.ids) {
				childrenIds+= child.name +", "
				parents.put(child.name, exp.parent)
			}
			output= '''imp(«exp.parent.name», or(«childrenIds.substring(0, childrenIds.length() - 2)»))'''
		}
		output
	}
	
//	override getClonConstraints() {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
//	}
	
	override getStrategy() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override optimizationConstraints() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getObjectives() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
//	override getClonVariables(VarDeclaration variable) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
//	}
	
	override getAttributes(Attributes exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getRule(CharSequence left, CharSequence right) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getRefinement(Refinement exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getAssignement(Assignment exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	

	
		
}