package com.coffee.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import com.coffee.pLEC.Model
import com.coffee.generator.TypeOfProblem
import com.coffee.generator.THLCL.THLCLGenerator

/**
 * Class to test the product lines grammar and its parsing
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */

@RunWith(XtextRunner)
@InjectWith(PLECInjectorProvider)

class THLCLCodeGenerationTests {
	@Inject
	ParseHelper<Model> parseHelper
	@Inject extension ParseHelper // gracias a esta linea se puede hacer el llamado .parse
	@Inject extension ValidationTestHelper
	
 /*
  * Testing boolean constraints
  */
 	/**
 	* Declaring boolean variables
	 */
	@Test
	def void declaringBoolVariables() {
		// model is a program in PLEC
		val program = 
		'''
		model m1
		variables:
		boolean A
		constraints:
		'''
		//empty is an empty model
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		printErrors(model)
		val generator = new THLCLGenerator("m1", TypeOfProblem.SAT)
		val actual= generator.parseModel(model)
		
		/*
		 * The expected model contains an extra variable and 
		 * an extra constraint for the model
		*/
		val expected='''
		model m1
		variables:
		boolean A
		constraints:
		'''
		Assert.assertEquals(expected.toString, actual.toString)
		Assert.assertTrue(model.eResource.errors.isEmpty)	
	}
	/**
	 * Method for testing the structural constraint without cardinality in 
	 * a Boolean constraint problem 
	 */
	@Test
	def void structuralNoCardBoolean() {
		// model is a program in PLEC
		val program = 
		'''
		model m1
		variables:
		boolean A
		boolean B
		boolean C
		boolean D
		constraints:
		c1: structural: A variants: [B, C, D] 
		'''
		//empty is an empty model
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		printErrors(model)
		val generator = new THLCLGenerator("m1", TypeOfProblem.SAT)
		val actual= generator.parseModel(model)
		
		/*
		 * The expected model contains an extra variable and 
		 * an extra constraint for the model
		*/
		val expected='''
		model m1
		variables:
		boolean A
		boolean B
		boolean C
		boolean D
		constraints:
		'''

		Assert.assertEquals(expected.toString, actual.toString)
		Assert.assertTrue(model.eResource.errors.isEmpty)
		
	}
	

/*****************************************************************************
 * Testing integer constraints
 */
 	@Test
	def void declaringIntVariables() {
		// model is a program in PLEC
		val program = 
		'''
		model m1
		variables:
		integer A values: 1..3
		integer B values: [2, 4, 6, 8, 10]
		boolean C
		boolean D values: [true, false]
		constraints:
		'''
		//empty is an empty model
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		printErrors(model)
		/*  
		* To generate integer constraints and variable declaration the
		* Type of problem should be CSP 
		*/ 
		val generator = new THLCLGenerator("m1", TypeOfProblem.CSP)
		val actual= generator.parseModel(model)
		
		/*
		 * The expected model contains an extra variable and 
		 * an extra constraint for the model
		*/
		val expected='''
		model m1
		variables:
		integer A domain: 1..3
		integer B domain: [2, 4, 6, 8, 10]
		boolean C 
		boolean D 
		constraints:
		'''
		Assert.assertEquals(expected.toString, actual.toString)
		Assert.assertTrue(model.eResource.errors.isEmpty)	
	}
	/**
	 * Method for testing the structural constraint without cardinality in 
	 * an Integer constraint problem 
	 */
	@Test
	def void structuralNoCardInteger() {
		// model is a program in PLEC
		val program = 
		'''
		model m1
		variables:
		boolean A
		boolean B
		boolean C
		boolean D
		constraints:
		c1: structural: A variants: [B, C, D] 
		'''
		//empty is an empty model
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		printErrors(model)
		val generator = new THLCLGenerator("m1", TypeOfProblem.CSP)
		val actual= generator.parseModel(model)
		
		/*
		 * The expected model contains an extra variable and 
		 * an extra constraint for the model
		*/
		val expected='''
		model m1
		variables:
		boolean A 
		boolean B 
		boolean C 
		boolean D 
		constraints:
		'''
		//print(actual)
		//printErrors(model)
		Assert.assertEquals(expected.toString, actual.toString)
		Assert.assertTrue(model.eResource.errors.isEmpty)
	}
	
	/**
	 * Method for testing the structural constraint with cardinality in 
	 * an Integer constraint problem 
	 */
	@Test
	def void structuralCardInteger() {
		// model is a program in PLEC
		val program = 
		'''
		model m1
		variables:
		boolean A
		boolean B
		boolean C
		boolean D
		boolean E
		boolean F
		boolean G
		constraints:
		c1: structural: A variants: [B, C] card: [0,0]
		c2: structural: D variants: [E, F, G] card: [1,3] 
		'''
		//empty is an empty model
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		printErrors(model)
		val generator = new THLCLGenerator("m1", TypeOfProblem.CSP)
		val actual= generator.parseModel(model)
		
		/*
		 * The expected model contains an extra variable and 
		 * an extra constraint for the model
		*/
		val expected='''
		model m1
		variables:
		boolean A 
		boolean B 
		boolean C 
		boolean D 
		boolean E 
		boolean F 
		boolean G 
		constraints:
		c1: (B => A) AND (C => A) AND (A >= 1) => ((B + C  <= 0 ) AND (B + C  >= 0))
		c2: (E => D) AND (F => D) AND (G => D) AND (D >= 1) => ((E + F + G  <= 1 ) AND (E + F + G  >= 3))
		'''
		print(actual)
		printErrors(model)
		Assert.assertEquals(expected.toString, actual.toString)
		Assert.assertTrue(model.eResource.errors.isEmpty)	
	}

	
 
 
		
/**********************************************************************************************************
* Auxiliar methods for testing
*/

	/**to print the parsing errors */
	def void printErrors(Model model){
		if (!model.eResource.errors.isEmpty){
			for (element : model.eResource.errors) {
				println( element.message)
			}
		}
		
	}

		
	
	
}