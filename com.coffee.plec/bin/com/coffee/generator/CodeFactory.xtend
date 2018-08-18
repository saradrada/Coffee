package com.coffee.generator

import com.coffee.pLEC.VarDeclaration
import java.util.Map
import com.coffee.pLEC.Structural
import java.util.ArrayList

abstract class CodeFactory {
	public static val HEADER="language header"
	public static val VARIABLES="language variable's separator"
	public static val CONSTRAINTS="language constraint's separator"
	private ArrayList <String> clonConstraints;


	
	// template related methods
	def abstract CharSequence getHeader()
	def abstract CharSequence getVarLabel()
	def abstract CharSequence getConsLabel()
	
	/**
	 * @return by default the strategy is the empty string
	 */
	def CharSequence getStrategy(){
		""
	}
	
	def getClonConstraints() {
		var out =""
		if (clonConstraints===null){
			out=""
		}
		else{
			var int id = 1
			for( constraint : clonConstraints){
			 	out += '''cl«id»: «constraint.toString»'''
			 	id++
			}
		}
		out
	}
	
	// Variables related methods
	def abstract CharSequence getVariable(VarDeclaration variable);
	
	// Constraint related methods
	def abstract CharSequence getOptional(VarDeclaration parent, VarDeclaration child)
	def abstract CharSequence getMandatory(VarDeclaration parent, VarDeclaration child)
	def abstract CharSequence getExcludes(VarDeclaration left, VarDeclaration right)
	def abstract CharSequence getRequires(VarDeclaration left, VarDeclaration right)
	def abstract CharSequence getGroupCardinality(Structural exp, Map <String, VarDeclaration> parents)

}