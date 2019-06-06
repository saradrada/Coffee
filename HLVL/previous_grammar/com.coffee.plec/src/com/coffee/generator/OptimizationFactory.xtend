package com.coffee.generator

interface OptimizationFactory {
	def CharSequence getStrategy();
	def CharSequence optimizationConstraints();
	def CharSequence getObjectives();
}