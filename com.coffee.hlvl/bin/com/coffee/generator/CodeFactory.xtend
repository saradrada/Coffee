package com.coffee.generator

import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.OptionsDeclaration
import com.coffee.hlvl.Core
import com.coffee.hlvl.Decomposition
import com.coffee.hlvl.Group
import com.coffee.hlvl.VarList
import java.util.Map
import com.coffee.hlvl.Visibility
import com.coffee.hlvl.Relational
import java.util.List

/**
 * Interface to define the methods a codeFactory for the PLEC language
 * should implement, all Factories implement this interface
 * implemented by (THLCLFactory, XCSP3Factory, DIMASFactory)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
abstract class CodeFactory {
	

	// Variables related methods
	def  CharSequence getConstant(ElmDeclaration element);
	def  CharSequence getElement(ElmDeclaration element);
	def  CharSequence getValuesDeclaration(ElmDeclaration variable, OptionsDeclaration variant);
	
	def CharSequence getCore(Core core)
	def CharSequence getDecomposition(Decomposition rel, Map<String,ElmDeclaration> parents)
	def CharSequence getGroup(Group rel, Map<String,ElmDeclaration> parents)
	def CharSequence getImpliesPair(ElmDeclaration left, ElmDeclaration right)
	def CharSequence getMutexPair(ElmDeclaration left, ElmDeclaration right)
	def CharSequence getImpliesList(VarList rel)
	def CharSequence getMutexList(VarList rel)
	def CharSequence getExpression(Relational rel)
	def CharSequence getVisibility(Visibility rel, List<CharSequence> relations)
	

	
}