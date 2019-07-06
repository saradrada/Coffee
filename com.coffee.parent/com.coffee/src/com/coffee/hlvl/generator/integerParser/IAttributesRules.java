package com.coffee.hlvl.generator.integerParser;

import com.coffee.hlvl.hLVL.ElmDeclaration;

/**
 * Interface for the transformation rules used exclusively in the languages
 * including attributes
 * @author Angela Villota
 * @version HLVL V1.4
 * August 2018
 * updated on May 2019
 */

public interface IAttributesRules {
	/**
	 * Rule for creating the rules 
	 * @param parent
	 * @param attribute
	 * @return
	 */
	public CharSequence getDecompositionAtt(ElmDeclaration parent, ElmDeclaration attribute);

}
