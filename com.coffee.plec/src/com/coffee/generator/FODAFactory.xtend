package com.coffee.generator

import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map
import com.coffee.pLEC.RootRefinement

/**
 * Interface to define the methods a codeFactory supporting the FODA constraints
 * should include
 * should implement, all Factories implement this interface
 * implemented by (DIMASFactory)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
interface FODAFactory {
	
	// Constraint related methods
	def  CharSequence getOptional(VarDeclaration parent, VarDeclaration child)
	def  CharSequence getMandatory(VarDeclaration parent, VarDeclaration child)
	def  CharSequence getExcludes(VarDeclaration left, VarDeclaration right)
	def  CharSequence getRequires(VarDeclaration left, VarDeclaration right)
	def  CharSequence getGroupCardinality(Structural exp, Map <String, VarDeclaration> parents)
	def  CharSequence getRootConstraint(RootRefinement exp)
	
	
}