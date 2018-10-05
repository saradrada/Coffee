package com.coffee.tests;

import com.coffee.generator.THLCL.THLCLGenerator;
import com.coffee.generator.TypeOfProblem;
import com.coffee.pLEC.Model;
import com.coffee.tests.PLECInjectorProvider;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Class to test the product lines grammar and its parsing
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@RunWith(XtextRunner.class)
@InjectWith(PLECInjectorProvider.class)
@SuppressWarnings("all")
public class THLCLCodeGenerationTests {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Inject
  @Extension
  private ParseHelper _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  /**
   * Declaring boolean variables
   */
  @Test
  public void declaringBoolVariables() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean A");
      _builder.newLine();
      _builder.append("constraints:");
      _builder.newLine();
      final String program = _builder.toString();
      final Model model = this.parseHelper.parse(program);
      Assert.assertNotNull(model);
      this.printErrors(model);
      final THLCLGenerator generator = new THLCLGenerator("m1", TypeOfProblem.SAT);
      final CharSequence actual = generator.parseModel(model);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("model m1");
      _builder_1.newLine();
      _builder_1.append("variables:");
      _builder_1.newLine();
      _builder_1.append("boolean A");
      _builder_1.newLine();
      _builder_1.append("constraints:");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      Assert.assertEquals(expected.toString(), actual.toString());
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Method for testing the structural constraint without cardinality in
   * a Boolean constraint problem
   */
  @Test
  public void structuralNoCardBoolean() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean A");
      _builder.newLine();
      _builder.append("boolean B");
      _builder.newLine();
      _builder.append("boolean C");
      _builder.newLine();
      _builder.append("boolean D");
      _builder.newLine();
      _builder.append("constraints:");
      _builder.newLine();
      _builder.append("c1: structural: A variants: [B, C, D] ");
      _builder.newLine();
      final String program = _builder.toString();
      final Model model = this.parseHelper.parse(program);
      Assert.assertNotNull(model);
      this.printErrors(model);
      final THLCLGenerator generator = new THLCLGenerator("m1", TypeOfProblem.SAT);
      final CharSequence actual = generator.parseModel(model);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("model m1");
      _builder_1.newLine();
      _builder_1.append("variables:");
      _builder_1.newLine();
      _builder_1.append("boolean A");
      _builder_1.newLine();
      _builder_1.append("boolean B");
      _builder_1.newLine();
      _builder_1.append("boolean C");
      _builder_1.newLine();
      _builder_1.append("boolean D");
      _builder_1.newLine();
      _builder_1.append("constraints:");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      Assert.assertEquals(expected.toString(), actual.toString());
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Testing integer constraints
   */
  @Test
  public void declaringIntVariables() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A values: 1..3");
      _builder.newLine();
      _builder.append("integer B values: [2, 4, 6, 8, 10]");
      _builder.newLine();
      _builder.append("boolean C");
      _builder.newLine();
      _builder.append("boolean D values: [true, false]");
      _builder.newLine();
      _builder.append("constraints:");
      _builder.newLine();
      final String program = _builder.toString();
      final Model model = this.parseHelper.parse(program);
      Assert.assertNotNull(model);
      this.printErrors(model);
      final THLCLGenerator generator = new THLCLGenerator("m1", TypeOfProblem.CSP);
      final CharSequence actual = generator.parseModel(model);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("model m1");
      _builder_1.newLine();
      _builder_1.append("variables:");
      _builder_1.newLine();
      _builder_1.append("integer A domain: 1..3");
      _builder_1.newLine();
      _builder_1.append("integer B domain: [2, 4, 6, 8, 10]");
      _builder_1.newLine();
      _builder_1.append("boolean C ");
      _builder_1.newLine();
      _builder_1.append("boolean D ");
      _builder_1.newLine();
      _builder_1.append("constraints:");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      Assert.assertEquals(expected.toString(), actual.toString());
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Method for testing the structural constraint without cardinality in
   * an Integer constraint problem
   */
  @Test
  public void structuralNoCardInteger() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean A");
      _builder.newLine();
      _builder.append("boolean B");
      _builder.newLine();
      _builder.append("boolean C");
      _builder.newLine();
      _builder.append("boolean D");
      _builder.newLine();
      _builder.append("constraints:");
      _builder.newLine();
      _builder.append("c1: structural: A variants: [B, C, D] ");
      _builder.newLine();
      final String program = _builder.toString();
      final Model model = this.parseHelper.parse(program);
      Assert.assertNotNull(model);
      this.printErrors(model);
      final THLCLGenerator generator = new THLCLGenerator("m1", TypeOfProblem.CSP);
      final CharSequence actual = generator.parseModel(model);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("model m1");
      _builder_1.newLine();
      _builder_1.append("variables:");
      _builder_1.newLine();
      _builder_1.append("boolean A ");
      _builder_1.newLine();
      _builder_1.append("boolean B ");
      _builder_1.newLine();
      _builder_1.append("boolean C ");
      _builder_1.newLine();
      _builder_1.append("boolean D ");
      _builder_1.newLine();
      _builder_1.append("constraints:");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      Assert.assertEquals(expected.toString(), actual.toString());
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Method for testing the structural constraint with cardinality in
   * an Integer constraint problem
   */
  @Test
  public void structuralCardInteger() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean A");
      _builder.newLine();
      _builder.append("boolean B");
      _builder.newLine();
      _builder.append("boolean C");
      _builder.newLine();
      _builder.append("boolean D");
      _builder.newLine();
      _builder.append("boolean E");
      _builder.newLine();
      _builder.append("boolean F");
      _builder.newLine();
      _builder.append("boolean G");
      _builder.newLine();
      _builder.append("constraints:");
      _builder.newLine();
      _builder.append("c1: structural: A variants: [B, C] card: [0,0]");
      _builder.newLine();
      _builder.append("c2: structural: D variants: [E, F, G] card: [1,3] ");
      _builder.newLine();
      final String program = _builder.toString();
      final Model model = this.parseHelper.parse(program);
      Assert.assertNotNull(model);
      this.printErrors(model);
      final THLCLGenerator generator = new THLCLGenerator("m1", TypeOfProblem.CSP);
      final CharSequence actual = generator.parseModel(model);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("model m1");
      _builder_1.newLine();
      _builder_1.append("variables:");
      _builder_1.newLine();
      _builder_1.append("boolean A ");
      _builder_1.newLine();
      _builder_1.append("boolean B ");
      _builder_1.newLine();
      _builder_1.append("boolean C ");
      _builder_1.newLine();
      _builder_1.append("boolean D ");
      _builder_1.newLine();
      _builder_1.append("boolean E ");
      _builder_1.newLine();
      _builder_1.append("boolean F ");
      _builder_1.newLine();
      _builder_1.append("boolean G ");
      _builder_1.newLine();
      _builder_1.append("constraints:");
      _builder_1.newLine();
      _builder_1.append("c1: (B => A) AND (C => A) AND (A >= 1) => ((B + C  <= 0 ) AND (B + C  >= 0))");
      _builder_1.newLine();
      _builder_1.append("c2: (E => D) AND (F => D) AND (G => D) AND (D >= 1) => ((E + F + G  <= 1 ) AND (E + F + G  >= 3))");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      InputOutput.<CharSequence>print(actual);
      this.printErrors(model);
      Assert.assertEquals(expected.toString(), actual.toString());
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * to print the parsing errors
   */
  public void printErrors(final Model model) {
    boolean _isEmpty = model.eResource().getErrors().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Resource.Diagnostic> _errors = model.eResource().getErrors();
      for (final Resource.Diagnostic element : _errors) {
        InputOutput.<String>println(element.getMessage());
      }
    }
  }
}
