package com.coffee.generator.XCSP3


import com.coffee.generator.TypeOfProblem
import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map

class CSPFactory  extends XCSP3Factory{
	
	new(TypeOfProblem type) {
		super(type)
	}
	
	override getOptional(VarDeclaration parent, VarDeclaration child) {
		'''ge(«parent.name», «child.name»)'''
	}
	
	override getMandatory(VarDeclaration parent, VarDeclaration child) {
		'''eq(«parent.name», «child.name»)'''
	}
	
	override getExcludes(VarDeclaration left, VarDeclaration right) {
		'''le(add(«left.name», «right.name»), 1) '''
	}
	
	override getRequires(VarDeclaration left, VarDeclaration right) {
		'''imp(«left.name»,gt(«right.name»,1) )'''
	}
	
	override getGroupCardinality(Structural exp, Map<String, VarDeclaration> parents) {
		var idsSum="add("
		var implies=""
		var output ='''and('''
		for (child : exp.group.ids) {
			implies += '''imp(«child.name», «exp.parent.name»),'''
			idsSum+= child.name +", "
			parents.put(child.name, exp.parent)
		}
		val sumLessThan = '''le(«idsSum.substring(0, idsSum.length() - 2)»), «exp.min.value»)''' 
		val sumGreaterThan ='''ge(«idsSum.substring(0, idsSum.length() - 2)»), «exp.max.value»)'''
		output+= '''«implies» imp(ge(«exp.parent.name», 1), and(«sumLessThan», «sumGreaterThan»)) )'''

	}
	
	
	
}