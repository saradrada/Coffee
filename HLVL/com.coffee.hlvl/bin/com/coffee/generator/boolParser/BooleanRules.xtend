package com.coffee.generator.boolParser

import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.Common
import com.coffee.hlvl.Decomposition
import java.util.Map
import com.coffee.hlvl.Relational
import com.coffee.hlvl.Group
import com.coffee.hlvl.VarList
import com.coffee.hlvl.Visibility
import java.util.List
import com.coffee.hlvl.ConstantDecl
import com.coffee.hlvl.BoolVal
import com.coffee.generator.commons.IMiniZincConstants
import com.coffee.generator.TransformationRules
import com.coffee.generator.expressionsParser.BooleanExpressionsParser
import com.coffee.generator.Dialect

/**
 * class implementing the boolean transformation rules for in Benavides2010
 * for obtaining the HLCL representation in the MiniZinc language. 
 * This class implements TransformationRules
 * @author Angela Villota
 * @version HLVL V1.4
 * August 2018
 * updated on May 2019
 * modified on July 2019 to comply with the modifications in the syntax method: getDecomposition
 * fixed a bug in the group with cardinality [1,1]
 */

class BooleanRules extends TransformationRules implements IMiniZincConstants
 {
	/**
	 * integer variable to produce the identifiers for the variables and constraints
	 * in visibility relations
	 */
	private int visibilityIdCounter;
	
	private BooleanExpressionsParser expressionsParser;
	
	new(Dialect dialect){	
		expressionsParser= new BooleanExpressionsParser();
		expressionsParser.dialect = dialect
		visibilityIdCounter=0;
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
	
	override getCore(Common core) {
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
			//TODO modified by avillota to comply with the syntax changes
			if(rel.min==1 && rel.max==1){
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
	
	/**
	 * 
	 */
	override getGroup(Group rel, Map<String, ElmDeclaration> parents) {
		// groups [1, 1] alternative
		if(rel.min==1 && rel.max.value=="1"){
				getXor(rel, parents)		
		}
		//TODO include the [n, m] rule from literature
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
		'''«CONS_DEF» «expressionsParser.parse(exp)» «SEMICOLON»
		'''
	}
	
	override getVisibility(Visibility rel, List<CharSequence> relations) {
		var out= 
		'''
			var bool: B«visibilityIdCounter» ;
			constraint «expressionsParser.parse(rel.condition)» -> B«visibilityIdCounter»;
		'''
			for (r: relations){
				out+= 
				'''constraint B«visibilityIdCounter»  <-> «r.subSequence(10, r.length)»
			'''
			}
			visibilityIdCounter++
			out
	}
	
}
