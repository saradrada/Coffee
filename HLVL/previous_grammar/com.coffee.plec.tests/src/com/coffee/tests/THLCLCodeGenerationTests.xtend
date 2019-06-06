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
 * Modified on October 9 2018
 * HLVL V1
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
		integer B values: 0..1
		integer C values: [0, 1]
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
		//integer B domain: 0..1
		//integer C domain: [0, 1]
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
	def void booleanParentChild() {
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
		c0: A is root
		c1: structural: A variants: [B, C, D] 
		c2: B is mandatory
		c3: C is optional
		c4: D is mandatory
		'''
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		//printErrors(model)
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
		c0: A = 1
		c2: A <=> B
		c3: C => A
		c4: A <=> D
		'''
		Assert.assertEquals(expected.toString, actual.toString)
		Assert.assertTrue(model.eResource.errors.isEmpty)	
	}
	
	@Test
	def void structuralOR() {
		// model is a program in PLEC
		val program = '''
		model satExample_GPL_from_splot
		variables:
		boolean Gpl
		boolean Algorithms
		boolean connected
		boolean stronglyc
		boolean cycle
		boolean mstprim
		boolean mstkruskal
		boolean shortest
		constraints:
		c0: Gpl is root
		c1: structural: Gpl variants:[Algorithms]
		c20: structural: Algorithms variants: [connected, stronglyc, cycle, mstprim, mstkruskal, shortest] card: [0,7]
'''
	//empty is an empty model
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		printErrors(model)
		val generator = new THLCLGenerator("m1", TypeOfProblem.SAT)
		val actual= generator.parseModel(model)
		
		val expected='''
		model m1
		variables:
		boolean Gpl
		boolean Algorithms
		boolean connected
		boolean stronglyc
		boolean cycle
		boolean mstprim
		boolean mstkruskal
		boolean shortest
		constraints:
		c0: Gpl = 1
		c20: Algorithms <=> (connected OR stronglyc OR cycle OR mstprim OR mstkruskal OR shortest )
		'''
		Assert.assertEquals(expected.toString, actual.toString)
		Assert.assertTrue(model.eResource.errors.isEmpty)
	}
	@Test
	def void structuralAlternative() {
		// model is a program in PLEC
		val program = '''
		model satExample_GPL_from_splot
		variables:
		boolean Gpl
		boolean Algorithms
		boolean connected
		boolean stronglyc
		boolean cycle
		boolean mstprim
		boolean mstkruskal
		boolean shortest
		constraints:
		c0: Gpl is root
		c1: structural: Gpl variants:[Algorithms]
		c20: structural: Algorithms variants: [connected, stronglyc, cycle, mstprim, mstkruskal, shortest] card: [1,1]
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
		boolean Gpl
		boolean Algorithms
		boolean connected
		boolean stronglyc
		boolean cycle
		boolean mstprim
		boolean mstkruskal
		boolean shortest
		constraints:
		c0: Gpl = 1
		c20: (connected <=> (~stronglyc AND ~cycle AND ~mstprim AND ~mstkruskal AND ~shortest AND  Algorithms)) AND
		(stronglyc <=> (~connected AND ~cycle AND ~mstprim AND ~mstkruskal AND ~shortest AND  Algorithms)) AND
		(cycle <=> (~connected AND ~stronglyc AND ~mstprim AND ~mstkruskal AND ~shortest AND  Algorithms)) AND
		(mstprim <=> (~connected AND ~stronglyc AND ~cycle AND ~mstkruskal AND ~shortest AND  Algorithms)) AND
		(mstkruskal <=> (~connected AND ~stronglyc AND ~cycle AND ~mstprim AND ~shortest AND  Algorithms)) AND
		(shortest <=> (~connected AND ~stronglyc AND ~cycle AND ~mstprim AND ~mstkruskal AND  Algorithms)) 
		'''
		Assert.assertEquals(expected.toString, actual.toString)
		Assert.assertTrue(model.eResource.errors.isEmpty)
	}
	
	/**
	 * Method for testing the generation of requires and excludes
	 */
	@Test
	def void booleanRequiresExcludes() {
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
		c0: A is root
		c1: structural: A variants: [B, C, D]
		c2: B requires C
		c3: B excludes D
		'''
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		val generator = new THLCLGenerator("m1", TypeOfProblem.SAT)
		val actual= generator.parseModel(model)
		val expected='''
		model m1
		variables:
		boolean A
		boolean B
		boolean C
		boolean D
		constraints:
		c0: A = 1
		c2: B => C
		c3: ~(B AND D)
		'''
		
		Assert.assertEquals(expected.toString, actual.toString)
		Assert.assertTrue(model.eResource.errors.isEmpty)	
	}
	
	/**
	 * Method for testing the generation of requires and excludes
	 */
	@Test
	def void booleanAssignement() {
		// model is a program in PLEC
		val program = 
		'''
		model m1
		variables:
		boolean A
		boolean B
		constraints:
		c0: A is selected
		c1: B is unselected
		'''
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		val generator = new THLCLGenerator("m1", TypeOfProblem.SAT)
		val actual= generator.parseModel(model)
		val expected='''
		model m1
		variables:
		boolean A
		boolean B
		constraints:
		c0: A = 1
		c1: B = 0
		'''
		print(actual)
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
		//printErrors(model)
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
		//printErrors(model)
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
		//print(actual)
		//printErrors(model)
		Assert.assertEquals(expected.toString, actual.toString)
		assertNoErrors(model)
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