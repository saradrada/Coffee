package com.coffee.generator.cnf

import com.coffee.generator.CodeFactory
import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.Core
import com.coffee.hlvl.Decomposition
import java.util.Map
import com.coffee.hlvl.Group
import com.coffee.hlvl.VarList
import com.coffee.hlvl.Visibility
import com.coffee.generator.minizinc.IConstants
import com.coffee.hlvl.ConstantDecl
import com.coffee.generator.common.ExpressionsParser
import com.coffee.hlvl.Relational
import java.util.List
import com.coffee.hlvl.BoolVal
import com.coffee.generator.Dialect

class CNFFactory extends CodeFactory implements IConstants{
	private int visibility=0
		private ExpressionsParser expressionsParser;
	
	new(){

		expressionsParser= new ExpressionsParser();
	}
	override getConstant(ElmDeclaration element) {
		val value= (element.declaration as ConstantDecl).value
		'''«BOOL_DOMAIN» «COLON» «element.name» «ASSIGN» «(value as BoolVal).value»  «SEMICOLON»
		'''
	}
	
	override getElement(ElmDeclaration element) {
		//var String out=""
		//val declaration= element.declaration as VariableDecl
		'''«VAR_DEF» «BOOL_DOMAIN» «COLON» «element.name» «SEMICOLON»
		'''
	}
		
	override getCore(Core core) {
		var  String out=""
		for(element: core.elements.values){
			out+= getCoreSingle(element)
			
		}
		out
	}
	
	override getCoreSingle(ElmDeclaration element){
		'''«CONS_DEF» «element.name» «EQUIV» «TRUE_ATOM» «SEMICOLON»
		'''
	}
	override getDecomposition(Decomposition rel, Map<String, ElmDeclaration> parents) {
		var out=""
		for(element: rel.children.values){
			parents.put(element.name, rel.parent)
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
			parents.put(element.name, rel.parent)
			out+= '''«CONS_DEF» «element.name» «IFF» «OPEN_CALL»'''
			for(inElement: rel.children.values){
				if(element.name!= inElement.name){
					out+='''«NOT»«OPEN_CALL»«inElement.name»«CLOSE_CALL» «AND» '''
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
			parents.put(element.name, rel.parent)
			out+= ''' «element.name» «OR»'''
		}
		out= out.subSequence(0, out.length-2) +'''«CLOSE_CALL» «SEMICOLON»
		'''
		out
	}
	
	override getImpliesPair(ElmDeclaration left, ElmDeclaration right) {
		'''«CONS_DEF» «left.name» «IMPLIES_LR» «right.name» «SEMICOLON»
		'''
	}
	
	override getMutexPair(ElmDeclaration left, ElmDeclaration right) {
		'''«CONS_DEF» «NOT» «OPEN_CALL»«left.name» «AND» «right.name»«CLOSE_CALL»«SEMICOLON»
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
	
	override getExpression(Relational exp) {
		'''«CONS_DEF» «expressionsParser.parse(exp, Dialect.BOOL)» «SEMICOLON»
		'''
	}
	
	override getVisibility(Visibility rel, List<CharSequence> relations) {
		var out= 
		'''
		var bool: B«visibility» ;
		constraint «expressionsParser.parse(rel.condition, Dialect.BOOL)» -> B«visibility»;
		'''
			for (r: relations){
				out+= 
				'''constraint B«visibility»  <-> «r.subSequence(10, r.length)»
				'''
			}
			visibility++
			out
	}
	

	
}