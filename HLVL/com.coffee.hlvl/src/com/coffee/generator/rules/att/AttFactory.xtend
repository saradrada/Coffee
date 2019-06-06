package com.coffee.generator.rules.att

import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.Decomposition
import java.util.Map
import com.coffee.hlvl.Group
import com.coffee.hlvl.Interval
import com.coffee.hlvl.Enumeration
import com.coffee.hlvl.VariableDecl
import com.coffee.hlvl.ConstantDecl
import com.coffee.hlvl.Value
import com.coffee.hlvl.BoolVal
import com.coffee.hlvl.Symbol
import com.coffee.hlvl.Number
import com.coffee.hlvl.Relational
import com.coffee.generator.common.ExpressionsParser
import com.coffee.generator.Dialect
import com.coffee.generator.rules.bools.BoolFactory
import java.util.HashMap

class AttFactory extends BoolFactory implements IAttributesFactory{
	private Map<String, Integer> symbolsTable;
	private Map<String, String> mapsTable;
	private ExpressionsParser expressionsParser;
	
	new(){
		symbolsTable= new HashMap<String, Integer> ();
		mapsTable= new HashMap<String, String> ();
		expressionsParser= new ExpressionsParser(symbolsTable);
	}
	
	override getConstant(ElmDeclaration element) {
		
		'''
		int: «element.name» = «parseValue((element.declaration as ConstantDecl).value)»
		'''
//		switch element.dataType{
//			case "boolean": 
//		}
	}

	override getElement(ElmDeclaration element) {
		switch element.dataType{
			case "boolean": 
				'''«VAR_DEF» 0..1: «element.name» «SEMICOLON»
				'''
			case "integer" :
				'''«VAR_DEF» «getDomain(element)» : «element.name» «SEMICOLON»
				'''
			case "symbolic":
				'''
				% Mapping  variants to integers
				«VAR_DEF» «getDomain(element)» : «element.name» «SEMICOLON»
				% Map: «mapsTable.get(element.name)»
				'''
		}
	}

	def parseValue(Value aValue){
		switch aValue{
			BoolVal:{
				if(aValue.value== "true")
					'''1'''
				else
					'''0'''
			}
			Symbol: aValue.value // esto es temporal mientras decido que quiero hacer con los symbol
			Number: aValue.value
		}
	}
	
	override getCoreSingle(ElmDeclaration element){
		'''«CONS_DEF» «element.name» «GT» 0 «SEMICOLON»
		'''
	}
	
	override getDecomposition(Decomposition rel, Map<String, ElmDeclaration> parents) {
		var out = ""
		for(element: rel.children.values){
			parents.put(element.name, rel.parent)
			// The element is an attribute
			//println('''«element.name» , att= «element.att===null»''')
			if(!(element.att===null) && element.att=="att"){
				out+=getDecompositionAtt(rel.parent, element)
			}
			else if (rel.cardinality==1){
				out+=
				'''«CONS_DEF» «rel.parent.name» «GT» 0 «IFF» «element.name» «GT» 0 «SEMICOLON»
				'''
			}else{
				out+=
				'''«CONS_DEF» «element.name» «GT» 0 «IMPLIES_LR» «rel.parent.name» «GT» 0 «SEMICOLON»
				'''
			}
		}
		out
	}
	

	override getGroup(Group rel, Map<String, ElmDeclaration> parents) {
		var sum=""
		var out= ""
	
		for(child: rel.children.values){
			sum += '''«child.name» + '''
		}
		sum = sum.substring(0, sum.length()-2) 
		
		val min = rel.min
		var int max
		if (rel.max.value == "*"){
			max=rel.children.values.size
		}
		else{
			max=  Integer.parseInt(rel.max.value)
		}
		// there is just one part
		if (min == max){
			out= 
			'''
			«CONS_DEF» «sum» «LEQ» «max» * «rel.parent.name» «SEMICOLON»
			'''
		}
		else{ // the constraint has two parts
		
			// first part
			if (min == 1){
				out+= 
				'''
				«CONS_DEF» «rel.parent.name» «LEQ» «sum» «SEMICOLON»
				'''
			}
			else{
				out+=
				'''
				«CONS_DEF» «min» * «rel.parent.name» «LEQ» «sum» «SEMICOLON»
				'''
			}
			//second part
			out+= 
			'''
			«CONS_DEF» «sum» «LEQ» «max» * «rel.parent.name» «SEMICOLON»
			'''
		}
		// the output
		out
	}
		
	override getImpliesPair(ElmDeclaration left, ElmDeclaration right) {
		'''«CONS_DEF» «left.name» > 0 «IMPLIES_LR» «right.name» > 0 «SEMICOLON»
		'''
	}
	
	override getMutexPair(ElmDeclaration left, ElmDeclaration right) {
		'''«CONS_DEF» «left.name» * «right.name» «EQUIV» 0 «SEMICOLON»
		'''
	}
	
	
	def getDomain(ElmDeclaration element) {
		val declaration = element.declaration as VariableDecl 
		switch element.dataType{
			case "boolean":'''0..1'''
			
			case "integer":{
				switch declaration.variants{
					Interval: 
					'''«(declaration.variants as Interval).start»..«(declaration.variants as Interval).end»'''
					
					Enumeration:{
						var out ='''{'''
						for(value: (declaration.variants as Enumeration).list.values){
							out+= '''«parseValue(value)» , '''
						}
						out= out.subSequence(0, out.length -2)+'''} '''
					}
				}
			}
			case "symbolic":{
				var i=1
				var mapping=""
				var out ='''{'''
						for(value: (declaration.variants as Enumeration).list.values){
							var valParsed= parseValue(value).toString
							mapping += '''«valParsed» -> «i»,  '''
							symbolsTable.put(valParsed, i);
							out+= '''«i» , '''
							i++
						}
						mapsTable.put(element.name, mapping);
						out= out.subSequence(0, out.length -2)+'''} '''
			}
		}
	}
	
		override getExpression(Relational exp) {
		'''«CONS_DEF» «expressionsParser.parse(exp, Dialect.ATT)» «SEMICOLON»
		'''
	}
	/*********************************************************************************
	 * ++  Methods from AttributeFactory
	 * *******************************************************************************
	 */

		override CharSequence getDecompositionAtt(ElmDeclaration parent, ElmDeclaration attribute){
		var out = ""
		// declaring the variable related to the attribute
		out += 
		'''
		% creating a variable for the attribute
		«VAR_DEF» «getDomain(attribute)» «COLON» «parent.name»_«attribute.name»«SEMICOLON»
		'''
				
		// declaring the constraint
		out+=
		'''
		% declaring a constraint
		«CONS_DEF» «parent.name» «GT» 0 «IFF» «parent.name»_«attribute.name» «GT» 0 «SEMICOLON»
		'''
		out
	}
}