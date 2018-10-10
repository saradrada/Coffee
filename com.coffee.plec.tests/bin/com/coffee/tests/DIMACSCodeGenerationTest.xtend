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
 * @version HLVL V1
 * October 2018
 */
 
@RunWith(XtextRunner)
@InjectWith(PLECInjectorProvider)
 
class DIMACSCodeGenerationTest {
	@Inject
	ParseHelper<Model> parseHelper
	@Inject extension ParseHelper // gracias a esta linea se puede hacer el llamado .parse
	@Inject extension ValidationTestHelper
	
}