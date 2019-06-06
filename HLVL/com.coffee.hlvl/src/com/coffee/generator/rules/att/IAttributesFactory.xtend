package com.coffee.generator.rules.att

import com.coffee.hlvl.ElmDeclaration


interface IAttributesFactory {
	def CharSequence getDecompositionAtt(ElmDeclaration parent, ElmDeclaration attribute)
}