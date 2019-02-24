package com.coffee.generator;


/**
 * type of problem can be 
 * - BOOL, for models using the constructors 
 * - ATT, for attribute based 
 * - Inst, for cardinality-based 
*/
public enum Dialect {
	BOOL,
	ATT,
	INST

}
