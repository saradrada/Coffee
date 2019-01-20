package com.coffee.generator

 /**
  * type of problem can be 
  * - BASIC, for models using the constructors 
  * - ATT, for attribute based 
  * - Inst, for cardinality-based 
 */
enum Dialect {
		BASIC,
		ATT,
		INST
		
}