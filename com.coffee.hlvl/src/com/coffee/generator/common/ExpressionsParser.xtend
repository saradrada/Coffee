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

class ExpressionsParser {

	
	static def CharSequence parse(Relational exp){
		
		switch(exp){
			BoolConstant: exp.value
			IntConstant: exp.value.toString
			VariableRef: exp.variable.name
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
			Negation: '''not(«parse(exp.expression)»)'''
			
			Iff: '''( «parse(exp.left)»  <-> «parse(exp.right)»)'''
			
			Implies: '''( «parse(exp.left)»  -> «parse(exp.right)»)'''
			
			Or: '''( «parse(exp.left)» \\/ «parse(exp.right)»)'''
			And: '''( «parse(exp.left)» /\\ «parse(exp.right)»)'''
			Equality: '''( «parse(exp.left)» = «parse(exp.right)»)'''
			Comparison:
			{
				if(exp.op==">="){
					'''( «parse(exp.left)» >= «parse(exp.right)»)'''
				}else if(exp.op=="<="){
					'''( «parse(exp.left)» <= «parse(exp.right)»)'''
				}else if(exp.op==">"){
					'''( «parse(exp.left)» > «parse(exp.right)»)'''
				}else if(exp.op=="<"){
					'''( «parse(exp.left)» < «parse(exp.right)»)'''
				}
			}
			Plus: '''( «parse(exp.left)» + «parse(exp.right)»)'''
			Minus: '''( «parse(exp.left)» - «parse(exp.right)»)'''
			MulOrDiv:
			{
				if (exp.op=="*"){
					'''( «parse(exp.left)» * «parse(exp.right)»)'''	
				}else if (exp.op == "/"){
					'''( «parse(exp.left)» / «parse(exp.right)»)'''
				}else{
					'''( «parse(exp.left)» mod «parse(exp.right)»)'''
				}
				
			}
			
		}


	}

}