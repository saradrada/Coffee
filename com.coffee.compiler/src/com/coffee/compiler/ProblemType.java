package com.coffee.compiler;


/**
 * type of problem can be 
 * - BOOL, for models using the constructors 
 * - ATT, for attribute based 
 * - Inst, for cardinality-based 
*/
public enum ProblemType {
	SAT,
	CSP,
	INST

}
