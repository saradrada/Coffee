package com.coffee.typing

import com.coffee.tHLCL.Expression
import com.coffee.tHLCL.IntConstant
import com.coffee.tHLCL.BoolConstant
import com.coffee.tHLCL.Unary
import com.coffee.tHLCL.Function
import com.coffee.tHLCL.MulOrDiv
import com.coffee.tHLCL.Plus
import com.coffee.tHLCL.Minus
import com.coffee.tHLCL.Comparison
import com.coffee.tHLCL.And
import com.coffee.tHLCL.Or
import com.coffee.tHLCL.Implies
import com.coffee.tHLCL.Iff
import com.coffee.tHLCL.VariableRef
import com.coffee.tHLCL.Variable
import  com.coffee.util.THlclUtil
import com.coffee.tHLCL.Global
import com.coffee.tHLCL.Negation
import com.coffee.tHLCL.Equality

/**
 * Class containing the methods for determine the type of  and expression in the CP-HLCL language 
 * @author Angela Villota
 * @version CP-HLCL V2
 * May 2018
 */
class TypeProvider {
	public static val symType =  new SymbolicType 
	public static val intType = new IntType 
	public static val boolType = new BoolType
	
	/*
	 * Method to determine the type of an expression
	 */
	def dispatch ExpressionsType typeFor(Expression e) { 
		switch (e) {
			//Constraints
			IntConstant: intType
			BoolConstant: boolType
			
			//Numeric expressions
			Function: intType
			Unary: intType
			MulOrDiv: intType
			Plus: intType
			Minus: intType
			// Boolean expressions
			Comparison: boolType
			And: boolType
			Or: boolType
			Implies: boolType
			Iff: boolType
			Global: boolType
			Negation: boolType
			Equality: boolType
		}		
	}
	/*
	 * Method to define the type of a variable, the type is the one assigned in the declaration
	 */
	def dispatch ExpressionsType typeFor(Variable variable) { 
		if (variable.type == "boolean") {
			 return boolType
		}
		else if(variable.type == "integer"){
			return intType
		}
		else if(variable.type == "symbolic"){
			return symType
		}
	}	
	/*
	 * Method to determine the type of a reference to a variable
	 * first is checked that the reference is correct (the variable exists previously), then
	 * the method returns the type of the variable 
	 */
	def dispatch ExpressionsType typeFor(VariableRef varRef) { 
		if (varRef.variable === null || !THlclUtil.variableIsDefinedBefore(varRef.variable)) 
			return null
		else 
		return varRef.variable.typeFor 
	}
			
}
