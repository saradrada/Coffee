package com.coffee.generator.THLCL


import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map
import com.coffee.pLEC.VariantDeclaration
import com.coffee.generator.FODAFactory
import com.coffee.pLEC.Attributes
import com.coffee.pLEC.Rule
import com.coffee.pLEC.Refinement
import com.coffee.pLEC.Assignment
import com.coffee.pLEC.BoolVal

class BooleanFactory extends THLCLFactory implements FODAFactory{

	/**
	 * All variables are boolean variables, there is no need to declare the domains
	 */
	override getVariable(VarDeclaration variable) '''
		«variable.type» «variable.name»
	'''
	
	override getOptional(VarDeclaration parent, VarDeclaration child) {
		'''«child.name» => «parent.name»''' 
	}
	
	override getMandatory(VarDeclaration parent, VarDeclaration child) {
		'''«parent.name» <=> «child.name»'''
	}
	
	override getExcludes(VarDeclaration left, VarDeclaration right) {
		'''~(«left.name» AND «right.name»)''' 
	}
	
	override getRequires(VarDeclaration left, VarDeclaration right) {
		'''«left.name» => «right.name»''' 
	}
	
	override getGroupCardinality(Structural exp, Map <String, VarDeclaration> parents) {
		var output =""
		// an alternative relation
		if (exp.min.value==1 && exp.max.value==1){
			for (child : exp.group.ids) {
				parents.put(child.name, exp.parent)
				var childrenIds=""
				for (inChild : exp.group.ids) {
					if(!(child.name == inChild.name)){
						childrenIds+= '''~«inChild.name» AND '''
					}
				}
				output+= 
				'''(«child.name» <=> («childrenIds» «exp.parent.name»)) AND
				'''
			}
			output=output.substring(0, output.length() - 4)
		}
		// and AND relation   
		else if (exp.min.value==0 && exp.max.value==1){
			var childrenIds=""
			for (child : exp.group.ids) {
				childrenIds+= child.name +" AND "
				parents.put(child.name, exp.parent)
			}
			output= '''«exp.parent.name» <=> («childrenIds.substring(0, childrenIds.length() - 4)» )'''
		}
		// an OR relation
		else if (exp.min.value==0 && exp.max.value >1){
			var childrenIds=""
			for (child : exp.group.ids) {
				childrenIds+= child.name +" OR "
				parents.put(child.name, exp.parent)
			}
			output= '''«exp.parent.name» <=> («childrenIds.substring(0, childrenIds.length() - 3)»)'''
		}
		output
	}
	override getAssignement(Assignment exp) {
		var output=""
		if((exp.valu as BoolVal).value == "selected")
			output='''«exp.variable.name» = 1'''
		else
			output='''«exp.variable.name» = 0'''
	}
	
	

	
	/*===================================================================
	 *===================================================================
	 * Unsupported methods for this notation
	 * */
	 	override getValuesDeclaration(VarDeclaration variable, VariantDeclaration variant) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	


	

	

	

	
	
	


	

	
}