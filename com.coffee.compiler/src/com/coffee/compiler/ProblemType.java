package com.coffee.compiler;


/**
 * type of problem can be 
 * - BOOL, for models using the constructors 
 * - ATT, for attribute based 
 * - Inst, for cardinality-based 
 * July 2019
 * CHANGES IN THE NAMES TO MATCH THE CHANGES IN THE HLVL PARSERXW
*/
public enum ProblemType {
	BASIC_BOOL,
	BASIC_INT,
	ATTRIBUTE,
	MULTIPLICITY;
}
