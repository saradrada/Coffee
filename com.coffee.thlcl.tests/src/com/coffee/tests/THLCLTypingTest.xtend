package com.coffee.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import com.coffee.tHLCL.THLCLPackage
import com.coffee.tHLCL.Model
import com.coffee.tHLCL.Relational
import com.coffee.tHLCL.Constraint
import com.coffee.tHLCL.VariableRef
import com.coffee.tHLCL.IntConstant
import com.coffee.tHLCL.BoolConstant
import com.coffee.tHLCL.Plus
import com.coffee.tHLCL.Minus
import com.coffee.tHLCL.MulOrDiv
import com.coffee.tHLCL.Comparison
import com.coffee.tHLCL.Equality
import com.coffee.tHLCL.And
import com.coffee.tHLCL.Or
import com.coffee.tHLCL.Unary
import com.coffee.typing.TypeProvider
import com.coffee.typing.ExpressionsType
import com.coffee.validation.THLCLValidator

@RunWith(XtextRunner)
@InjectWith(THLCLInjectorProvider)
class THLCLTypingTest {
		@Inject
	ParseHelper<Model> parseHelper
	//@Inject
	//ParseHelper<Model> ValidationTestHelper
	@Inject extension ParseHelper
	@Inject extension ValidationTestHelper
	@Inject extension TypeProvider
	static val packageInstance = THLCLPackage.eINSTANCE
	
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
		model.assertError(packageInstance.and, 
			THLCLValidator::WRONG_TYPE,
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
		model.assertError(packageInstance.constraint, 
			THLCLValidator::WRONG_TYPE,
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