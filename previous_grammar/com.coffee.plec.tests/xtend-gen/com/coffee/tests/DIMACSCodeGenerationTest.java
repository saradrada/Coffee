package com.coffee.tests;

import com.coffee.pLEC.Model;
import com.coffee.tests.PLECInjectorProvider;
import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.runner.RunWith;

/**
 * Class to test the product lines grammar and its parsing
 * @author Angela Villota
 * @version HLVL V1
 * October 2018
 */
@RunWith(XtextRunner.class)
@InjectWith(PLECInjectorProvider.class)
@SuppressWarnings("all")
public class DIMACSCodeGenerationTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Inject
  @Extension
  private ParseHelper _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
}
