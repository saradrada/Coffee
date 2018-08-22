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
		var output =
		'''and(
		'''
		for (child : exp.group.ids) {
			output += "imp(" + child.name + ", "+ exp.parent.name + "), \n"
			idsSum+= child.name +", "
			parents.put(child.name, exp.parent)
		}
		output += 
		'''
		imp(ge( «exp.parent.name», 1), 
		    ge(«idsSum.substring(0, idsSum.length() - 2)»), «exp.min.value»)
		    ),''' 
		output +=
		'''
		 imp(ge(«exp.parent.name», 1),
		     ge(«idsSum.substring(0, idsSum.length() - 2)», «exp.max.value»)
		     )
		 ) '''
		output

	}
	
	
	
}