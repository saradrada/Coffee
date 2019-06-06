package com.coffee.generator

import com.coffee.hlvl.Model
import com.coffee.hlvl.Relation
import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.Decomposition
import java.util.Map

/**
 * Interface to define the methods a code generator for the PLEC language
 * should implement, all generators implementation implement this interface
 * implemented by (THLCLGenerator, XCSP3Generator)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */

interface IGenerator {
	//For particular instances of the abstract generator
	def  CharSequence parseModel(Model model);
		
	// For the abstract generator
	def  CharSequence parseElements(Model model);
	def  CharSequence parseRelations(Model model);
	def  CharSequence parseRelation(Relation exp);

	// getters and setters
	def  String getModelName();
	def  Dialect getDialect();
	def  void addParents(Decomposition exp);
	def  Map <String, ElmDeclaration> getParents();
	def void setFactory( TransformationRules factory)
	def String getOperations(long time)
	
	
	
	
}