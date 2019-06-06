package com.coffee.generator

 /**
  * type of problem can be 
  * - SAT, for boolean variables and constraints 
  * - CSP, for mixed boolean and integer variables and constraints
  * - COP, for an optimization constraint problem
 */
enum TypeOfProblem {
	SAT,
	CSP,
	COP, 
	CSP_INST
	}