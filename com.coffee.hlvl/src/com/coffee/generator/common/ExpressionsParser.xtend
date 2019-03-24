package com.coffee.generator.common

import com.coffee.hlvl.BoolConstant
import com.coffee.hlvl.IntConstant
import com.coffee.hlvl.VariableRef
import com.coffee.hlvl.AttributeRef
import com.coffee.hlvl.Function
import com.coffee.hlvl.Unary
import com.coffee.hlvl.Negation
import com.coffee.hlvl.Relational
import com.coffee.hlvl.Iff
import com.coffee.hlvl.Implies
import com.coffee.hlvl.Or
import com.coffee.hlvl.And
import com.coffee.hlvl.Equality
import com.coffee.hlvl.Comparison
import com.coffee.hlvl.MulOrDiv
import com.coffee.hlvl.Plus
import com.coffee.hlvl.Minus
import com.coffee.generator.Dialect

class ExpressionsParser {

	
	static def CharSequence parse(Relational exp, Dialect dialect){
		
		switch(exp){
			BoolConstant: exp.value
			IntConstant: exp.value.toString
			VariableRef: 
			{
				println("datatype: "+ exp.variable.dataType+ " dialect "+ dialect)
				if (exp.variable.dataType =="boolean" && (dialect==Dialect.ATT || dialect==Dialect.INST)){
					println('''en el if:  
					bool2int(«exp.variable.name»)''' )
					return '''bool2int(«exp.variable.name»)''' 
				}else{
					println("en el else " + exp.variable.name)
					return exp.variable.name
				}
			}
			AttributeRef: exp.attribute.replace('.', '_')
			Function:
			{
				if (exp.op== "pow"){
					'''n.y.i'''
				}else if (exp.op =="dist" ){
					'''n.y.i'''
				}else if (exp.op =="min" ){
					'''n.y.i'''
				}else if (exp.op =="max" ){
					'''n.y.i'''
				}
			}
			Unary: 
			{
				if (exp.op== "instances"){
					'''n.y.i'''	
				}else if (exp.op =="abs" ){
					'''n.y.i'''
				}else if (exp.op =="sqrt" ){
					'''n.y.i'''
				}	
			}
			Negation: '''not(«parse(exp.expression, dialect)»)'''
			
			Iff: '''(«parse(exp.left, dialect)»  <-> «parse(exp.right, dialect)»)'''
			
			Implies: '''(«parse(exp.left, dialect)»  -> «parse(exp.right, dialect)»)'''
			
			Or: '''(«parse(exp.left, dialect)» \/ «parse(exp.right, dialect)»)'''
			And: '''(«parse(exp.left, dialect)» /\ «parse(exp.right, dialect)»)'''
			Equality: '''(«parse(exp.left, dialect)» = «parse(exp.right, dialect)»)'''
			Comparison:
			{
				if(exp.op==">="){
					'''(«parse(exp.left, dialect)» >= «parse(exp.right, dialect)»)'''
				}else if(exp.op=="<="){
					'''(«parse(exp.left, dialect)» <= «parse(exp.right, dialect)»)'''
				}else if(exp.op==">"){
					'''(«parse(exp.left, dialect)» > «parse(exp.right, dialect)»)'''
				}else if(exp.op=="<"){
					'''(«parse(exp.left, dialect)» < «parse(exp.right, dialect)»)'''
				}
			}
			Plus: '''(«parse(exp.left, dialect)» + «parse(exp.right, dialect)»)'''
			Minus: '''(«parse(exp.left, dialect)» - «parse(exp.right, dialect)»)'''
			MulOrDiv:
			{
				if (exp.op=="*"){
					'''( «parse(exp.left, dialect)» * «parse(exp.right, dialect)»)'''	
				}else if (exp.op == "/"){
					'''( «parse(exp.left, dialect)» / «parse(exp.right, dialect)»)'''
				}else{
					'''( «parse(exp.left, dialect)» mod «parse(exp.right, dialect)»)'''
				}
				
			}
			
		}


	}

}