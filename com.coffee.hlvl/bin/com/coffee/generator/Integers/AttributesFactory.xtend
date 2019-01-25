package com.coffee.generator.Integers

import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.OptionsDeclaration
import com.coffee.hlvl.Decomposition

interface AttributesFactory {
	def CharSequence getDecompositionAtt(ElmDeclaration parent, ElmDeclaration attribute)
}