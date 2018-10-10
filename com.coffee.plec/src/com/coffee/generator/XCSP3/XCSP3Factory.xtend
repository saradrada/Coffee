package com.coffee.generator.XCSP3

import com.coffee.generator.CodeFactory
import com.coffee.pLEC.VarDeclaration
import com.coffee.generator.TypeOfProblem
import com.coffee.pLEC.VariantDeclaration
import com.coffee.pLEC.VariantsInterval
import com.coffee.pLEC.VariantsEnumeration
import org.eclipse.emf.common.util.EList
import com.coffee.pLEC.Value
import com.coffee.pLEC.Number
import com.coffee.generator.OptimizationFactory
import com.coffee.generator.CardinalityFactory
import com.coffee.generator.AttributesFactory
import com.coffee.generator.CoffeeFactory
import com.coffee.pLEC.RootRefinement

/**
 * Abstract class for XCSP code generation
 * this codeFactory implements the common elements in all XCSP code factories
 * This class is extended by CSPFactory, SATFactory, and COPFactory  
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */

  abstract class XCSP3Factory extends CodeFactory implements OptimizationFactory,  AttributesFactory, CoffeeFactory {
	/**
	 * Strings in the XCSP format
	 */
	private  final String HEADER='''<instance format="XCSP3" type='''
	private static final String VARIABLES_OPEN='''<variables>'''
	private static final String VARIABLES_CLOSE='''</variables>'''
	private static final String CONSTRAINTS_OPEN='''<constraints>'''
	private static final String CONSTRAINTS_CLOSE='''</constraints>'''
	private static final String FOOTER='''</instance>'''
	
	/**
	 * frameworkType is of TypeOfProblem (CSP, COP)
	 */
	public TypeOfProblem frameworkType;
	
	/**
	 * Constructor 
	 * @param type is of type TypeOfProblem
	 */
	new (TypeOfProblem type){
		frameworkType= type
	}
	

	
	/*===================================================================
	 *===================================================================
	 * Implemented Methods from the CodeFactory interface
	 */
	 
	 /**
	  * All variables are integers, we are still not manangig symbolic variables
	  * boolean variables are integers in the domain {0,1}
	  * @param variable is of type VarDeclaration
	  * @returns the xcsp3 code for a variable declaration
	  */
	override getVariable(VarDeclaration variable) {
		'''
		<var id="«variable.name»">«getValuesDeclaration(variable, variable.variants)»</var>
		'''
	}
	
	 /**
	  * 
	  * @param variable is the variable to be declared
	  * @param variant is the set of value that should be declared
	  * @return the generated code for declaring a variables domain
	  */
	  override getValuesDeclaration(VarDeclaration variable, VariantDeclaration variant){
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
	
	override getRootConstraint(RootRefinement exp) {
		
		'''eq(«exp.getVar.name», 1)'''
		
	}
	
	/*===================================================================
	 *===================================================================
	 *  Getters and setters
	 */
	
	def  getList(EList<Value> l){
		var out="";
		for(var i=0; i<l.size(); i= i+1 ){
			out += (l.get(i) as Number).value ;
		}
		return out;
	}
	def getHeader() {
		//return HEADER + '''"«frameworkType»">'''
		return HEADER + '''"CSP">'''
	}
	
	def getVarLabel() {
		return VARIABLES_OPEN
	}
	
	def getConsLabel() {
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
	
	/*===================================================================
	 *===================================================================
	 * Unsuported methods at this level
	 * Optimization PRoblems
	 * */
	override getStrategy() {
		''''''
	}
	
	override optimizationConstraints() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getObjectives() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}	 

	
 	
 	
}