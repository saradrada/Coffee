package org.xtext.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.cPHLCL.CPHLCLPackage
import org.xtext.cPHLCL.Model
import org.xtext.cPHLCL.Relational
import org.xtext.cPHLCL.Constraint
import org.xtext.cPHLCL.VariableRef
import org.xtext.cPHLCL.IntConstant
import org.xtext.cPHLCL.BoolConstant
import org.xtext.cPHLCL.Plus
import org.xtext.cPHLCL.Minus
import org.xtext.cPHLCL.MulOrDiv
import org.xtext.cPHLCL.Comparison
import org.xtext.cPHLCL.Equality
import org.xtext.cPHLCL.And
import org.xtext.cPHLCL.Or
import org.xtext.cPHLCL.Unary
import org.xtext.typing.TypeProvider
import org.xtext.typing.ExpressionsType
import org.xtext.validation.CPHLCLValidator

@RunWith(XtextRunner)
@InjectWith(CPHLCLInjectorProvider)
class CPHLCLTypingTest {
		@Inject
	ParseHelper<Model> parseHelper
	//@Inject
	//ParseHelper<Model> ValidationTestHelper
	@Inject extension ParseHelper
	@Inject extension ValidationTestHelper
	@Inject extension TypeProvider
	
	@Test
	def void andTypesError(){
		val model= 
		'''
		model m1
		variables:
		integer A domain: 1..10
		integer B domain: 2..10
		constraints: 
		c1: A AND B 
		'''.parse
		model.assertError(CPHLCLPackage::eINSTANCE.and, 
			CPHLCLValidator::WRONG_TYPE,
			 "expected boolean type, but was integer"
		)
	}
	
	@Test
	def void constraintsTypesError(){
		val model= 
		'''
		model m1
		variables:
		integer A domain: 1..10
		integer B domain: 2..10
		constraints: 
		c1: A + B 
		'''.parse
		model.assertError(CPHLCLPackage::eINSTANCE.constraint, 
			CPHLCLValidator::WRONG_TYPE,
			 "expected boolean type, but was integer"
		)
	}
	@Test
	def void constraintsNoError(){
		val model= 
		'''
		model m1
		variables:
		integer A domain: 1..10
		integer B domain: 2..10
		constraints: 
		c1: A + B 
		'''
		val vacio = parseHelper.parse(model)
		Assert.assertNotNull(vacio)
		printErrors(vacio)
		Assert.assertTrue(vacio.eResource.errors.isEmpty)
	}
	
	/**
	 * auxiliar methods for tests
	 */
	def private assertType(CharSequence input, ExpressionsType expectedType) {
		val m1 = parseHelper.parse(input)
		Assert.assertNotNull(m1)
		Assert.assertTrue(m1.eResource.errors.isEmpty)
		Assert.assertSame(m1.constraints.last.typeFor, expectedType)
		
	}
	def assertSymType(CharSequence input) {
		input.assertType(TypeProvider.symType)
	}
	
	def assertIntType(CharSequence input) {
		input.assertType(TypeProvider.intType)
	}

	def assertBoolType(CharSequence input) {
		input.assertType(TypeProvider.boolType)		
	}
	
		/**to print the  errors */
	def void printErrors(Model model){
		if (!model.eResource.errors.isEmpty){
			for (element : model.eResource.errors) {
				println( element.message)
			}
		}
		
	}
}