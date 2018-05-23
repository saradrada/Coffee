package org.xtext.typing

import org.xtext.cPHLCL.Expression
import org.xtext.cPHLCL.IntConstant
import org.xtext.cPHLCL.BoolConstant
import org.xtext.cPHLCL.Unary
import org.xtext.cPHLCL.Function
import org.xtext.cPHLCL.MulOrDiv
import org.xtext.cPHLCL.Plus
import org.xtext.cPHLCL.Minus
import org.xtext.cPHLCL.Comparison
import org.xtext.cPHLCL.And
import org.xtext.cPHLCL.Or
import org.xtext.cPHLCL.Implies
import org.xtext.cPHLCL.Iff
import org.xtext.cPHLCL.VariableRef
import org.xtext.cPHLCL.Variable
import  org.xtext.util.CPHlclUtil
import org.xtext.cPHLCL.Global
import org.xtext.cPHLCL.Negation
import org.xtext.cPHLCL.Equality

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
		if (varRef.variable === null || !CPHlclUtil.variableIsDefinedBefore(varRef.variable)) 
			return null
		else 
		return varRef.variable.typeFor 
	}
			
}