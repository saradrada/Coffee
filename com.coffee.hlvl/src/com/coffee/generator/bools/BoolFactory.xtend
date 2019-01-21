package com.coffee.generator.bools

import com.coffee.generator.CodeFactory
import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.OptionsDeclaration
import com.coffee.hlvl.Core
import com.coffee.hlvl.Decomposition
import java.util.Map
import com.coffee.hlvl.Group
import com.coffee.hlvl.Pair
import com.coffee.hlvl.VarList
import com.coffee.hlvl.Expression
import com.coffee.hlvl.Visibility
import com.coffee.generator.minizinc.IConstants
import com.coffee.hlvl.ConstantDecl

class BoolFactory extends CodeFactory implements IConstants{
	
	override getConstant(ElmDeclaration element) {
		val value= (element.declaration as ConstantDecl).value
		'''«BOOL_DOMAIN» «COLON» «element.name» «ASSIGN» «value»  «SEMICOLON»
		'''
	}
	
	override getElement(ElmDeclaration element) {
		//var String out=""
		//val declaration= element.declaration as VariableDecl
		'''«VAR_DEF» «BOOL_DOMAIN» «COLON» «element.name» «SEMICOLON»
		'''
	}
	
	//TODO consider to delete this method from the code generator or put it in a 
	// more specific interface, because it is not needed for booleans
	override getValuesDeclaration(ElmDeclaration variable, OptionsDeclaration variant) {
		''''''
	}
	
	override getCore(Core core) {
		println("inside getCore")
		var  String out=""
		for(element: core.elements.values){
			out+=
			'''«CONS_DEF» «element.name» «EQUIV» «TRUE_ATOM» «SEMICOLON»
			'''
		}
		println("getCore out "+ out)
		out
	}
	
	override getDecomposition(Decomposition rel, Map<String, ElmDeclaration> parents) {
		var out=""
		for(element: rel.children.values){
			parents.put(rel.parent.name, element)
			if(rel.cardinality==1){
				out+= '''«CONS_DEF» «rel.parent.name» «IFF» «element.name» «SEMICOLON»
				'''
			}
			else{
				out+= '''«CONS_DEF» «element.name» «IMPLIES_LR» «rel.parent.name» «SEMICOLON»
				'''
			}
		}
		out
	}
	
	override getGroup(Group rel, Map<String, ElmDeclaration> parents) {
		
		// groups [1, 1] alternative
		if(rel.min==1 && rel.max.value==1){
				getXor(rel, parents)		
		}
		// groups [1, *] OR groups
		else{
			getOR(rel, parents)
		}

		
	}
	def getXor(Group rel, Map<String, ElmDeclaration> parents){
		var out=""
		for(element: rel.children.values){
			parents.put(rel.parent.name, element)
			out+= '''«CONS_DEF» «element.name» «IFF» «OPEN_CALL»'''
			for(inElement: rel.children.values){
				if(element.name!= inElement.name){
					out+='''«NOT»«OPEN_CALL»«inElement.name»«CLOSE_CALL» «AND»'''
				}
			}
			out += '''«rel.parent.name»«CLOSE_CALL» «SEMICOLON»
			'''
		}
		out
	}
	def getOR(Group rel, Map<String, ElmDeclaration> parents){
		var out='''«CONS_DEF» «rel.parent.name» «IFF» «OPEN_CALL»'''
		for(element: rel.children.values){
			parents.put(rel.parent.name, element)
			out+= '''«element.name» «OR»'''
		}
		out+= out.subSequence(0, out.length-2) +'''«CLOSE_CALL» «SEMICOLON»
		'''
		out
	}
	
	override getImpliesPair(ElmDeclaration left, ElmDeclaration right) {
		'''«CONS_DEF» «left.name» «IMPLIES_LR» «right.name» «SEMICOLON»
		'''
	}
	
	override getMutexPair(ElmDeclaration left, ElmDeclaration right) {
		'''«CONS_DEF» «NOT» «OPEN_CALL»«left.name» «AND» «right.name»«OPEN_CALL»«SEMICOLON»
		'''
	}
	
	override getImpliesList(VarList rel) {
		var out=""
		for(element: rel.list.values){
			out+= getImpliesPair(rel.var1, element)
		}
		out
	}
	
	override getMutexList(VarList rel) {
		var out=""
		for(element: rel.list.values){
			out+= getMutexPair(rel.var1, element)
		}	
		out
	}
	
	override getExpression(Expression rel) {
		
	}
	
	override getVisibility(Visibility rel) {
		
	}
	

	
}