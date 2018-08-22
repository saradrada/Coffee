package com.coffee.generator.XCSP3

import com.coffee.generator.CodeFactory
import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map
import com.coffee.generator.TypeOfProblem
import com.coffee.pLEC.VariantDeclaration
import com.coffee.pLEC.VariantsInterval
import com.coffee.pLEC.VariantsEnumeration
import org.eclipse.emf.common.util.EList
import com.coffee.pLEC.Value
import com.coffee.pLEC.Number

abstract class XCSP3Factory extends CodeFactory {
	private  final String HEADER=
	'''
	<instance format="XCSP3" type='''
	private static final String VARIABLES_OPEN='''<variables>'''
	private static final String VARIABLES_CLOSE='''</variables>'''
	private static final String CONSTRAINTS_OPEN='''<constraints>'''
	private static final String CONSTRAINTS_CLOSE='''</constraints>'''
	private static final String FOOTER='''</instance>'''
	
	public TypeOfProblem frameworkType;
	
	new (TypeOfProblem type){
		frameworkType= type
	}
	
	override getHeader() {
		return HEADER + '''"«frameworkType»">'''
	}
	
	override getVarLabel() {
		return VARIABLES_OPEN
	}
	
	override getConsLabel() {
		return CONSTRAINTS_OPEN
	}
	
	def getConsLabelClose() {
		return CONSTRAINTS_CLOSE
	}
	def getVarLabelClose() {
		return VARIABLES_CLOSE
	}
	def getFooter() {
		return FOOTER
	}
	
	override getVariable(VarDeclaration variable) {
		'''
		<var id="«variable.name»">«valuesDeclaration(variable, variable.variants)»</var>
		'''
	}
	
	def valuesDeclaration(VarDeclaration variable, VariantDeclaration variant){
		if( variable.type=="boolean"){
			'''0 1'''
		}
		else if (variant instanceof VariantsInterval)
		{
			'''«variant.start.value»..«variant.end.value»'''
		}
		else if (variant instanceof VariantsEnumeration){
			'''«getList(variant.list.values)»'''
		}
	}
	
	def  getList(EList<Value> l){
		var out="";
		for(var i=0; i<l.size(); i= i+1 ){
			out += (l.get(i) as Number).value ;
		}
		return out;
	}
	
}