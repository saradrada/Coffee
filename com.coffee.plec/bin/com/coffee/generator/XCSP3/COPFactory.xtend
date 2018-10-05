package com.coffee.generator.XCSP3

import com.coffee.generator.TypeOfProblem

import com.coffee.generator.OptimizationFactory

class COPFactory extends CSPFactory implements OptimizationFactory{
	
	new(TypeOfProblem type) {
		super(type)
	}
	
	override getStrategy() {
		''''''
	}
	
	override optimizationConstraints() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getObjectives() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}	

	

	
}