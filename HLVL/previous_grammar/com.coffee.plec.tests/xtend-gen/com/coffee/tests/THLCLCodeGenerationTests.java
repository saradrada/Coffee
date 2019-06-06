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
 * Modified on October 9 2018
 * HLVL V1
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
      _builder.append("integer B values: 0..1");
      _builder.newLine();
      _builder.append("integer C values: [0, 1]");
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
      _builder_1.append("//integer B domain: 0..1");
      _builder_1.newLine();
      _builder_1.append("//integer C domain: [0, 1]");
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
  public void booleanParentChild() {
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
      _builder.append("c0: A is root");
      _builder.newLine();
      _builder.append("c1: structural: A variants: [B, C, D] ");
      _builder.newLine();
      _builder.append("c2: B is mandatory");
      _builder.newLine();
      _builder.append("c3: C is optional");
      _builder.newLine();
      _builder.append("c4: D is mandatory");
      _builder.newLine();
      final String program = _builder.toString();
      final Model model = this.parseHelper.parse(program);
      Assert.assertNotNull(model);
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
      _builder_1.append("c0: A = 1");
      _builder_1.newLine();
      _builder_1.append("c2: A <=> B");
      _builder_1.newLine();
      _builder_1.append("c3: C => A");
      _builder_1.newLine();
      _builder_1.append("c4: A <=> D");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      Assert.assertEquals(expected.toString(), actual.toString());
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void structuralOR() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model satExample_GPL_from_splot");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean Gpl");
      _builder.newLine();
      _builder.append("boolean Algorithms");
      _builder.newLine();
      _builder.append("boolean connected");
      _builder.newLine();
      _builder.append("boolean stronglyc");
      _builder.newLine();
      _builder.append("boolean cycle");
      _builder.newLine();
      _builder.append("boolean mstprim");
      _builder.newLine();
      _builder.append("boolean mstkruskal");
      _builder.newLine();
      _builder.append("boolean shortest");
      _builder.newLine();
      _builder.append("constraints:");
      _builder.newLine();
      _builder.append("c0: Gpl is root");
      _builder.newLine();
      _builder.append("c1: structural: Gpl variants:[Algorithms]");
      _builder.newLine();
      _builder.append("c20: structural: Algorithms variants: [connected, stronglyc, cycle, mstprim, mstkruskal, shortest] card: [0,7]");
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
      _builder_1.append("boolean Gpl");
      _builder_1.newLine();
      _builder_1.append("boolean Algorithms");
      _builder_1.newLine();
      _builder_1.append("boolean connected");
      _builder_1.newLine();
      _builder_1.append("boolean stronglyc");
      _builder_1.newLine();
      _builder_1.append("boolean cycle");
      _builder_1.newLine();
      _builder_1.append("boolean mstprim");
      _builder_1.newLine();
      _builder_1.append("boolean mstkruskal");
      _builder_1.newLine();
      _builder_1.append("boolean shortest");
      _builder_1.newLine();
      _builder_1.append("constraints:");
      _builder_1.newLine();
      _builder_1.append("c0: Gpl = 1");
      _builder_1.newLine();
      _builder_1.append("c20: Algorithms <=> (connected OR stronglyc OR cycle OR mstprim OR mstkruskal OR shortest )");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      Assert.assertEquals(expected.toString(), actual.toString());
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void structuralAlternative() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model satExample_GPL_from_splot");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean Gpl");
      _builder.newLine();
      _builder.append("boolean Algorithms");
      _builder.newLine();
      _builder.append("boolean connected");
      _builder.newLine();
      _builder.append("boolean stronglyc");
      _builder.newLine();
      _builder.append("boolean cycle");
      _builder.newLine();
      _builder.append("boolean mstprim");
      _builder.newLine();
      _builder.append("boolean mstkruskal");
      _builder.newLine();
      _builder.append("boolean shortest");
      _builder.newLine();
      _builder.append("constraints:");
      _builder.newLine();
      _builder.append("c0: Gpl is root");
      _builder.newLine();
      _builder.append("c1: structural: Gpl variants:[Algorithms]");
      _builder.newLine();
      _builder.append("c20: structural: Algorithms variants: [connected, stronglyc, cycle, mstprim, mstkruskal, shortest] card: [1,1]");
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
      _builder_1.append("boolean Gpl");
      _builder_1.newLine();
      _builder_1.append("boolean Algorithms");
      _builder_1.newLine();
      _builder_1.append("boolean connected");
      _builder_1.newLine();
      _builder_1.append("boolean stronglyc");
      _builder_1.newLine();
      _builder_1.append("boolean cycle");
      _builder_1.newLine();
      _builder_1.append("boolean mstprim");
      _builder_1.newLine();
      _builder_1.append("boolean mstkruskal");
      _builder_1.newLine();
      _builder_1.append("boolean shortest");
      _builder_1.newLine();
      _builder_1.append("constraints:");
      _builder_1.newLine();
      _builder_1.append("c0: Gpl = 1");
      _builder_1.newLine();
      _builder_1.append("c20: (connected <=> (~stronglyc AND ~cycle AND ~mstprim AND ~mstkruskal AND ~shortest AND  Algorithms)) AND");
      _builder_1.newLine();
      _builder_1.append("(stronglyc <=> (~connected AND ~cycle AND ~mstprim AND ~mstkruskal AND ~shortest AND  Algorithms)) AND");
      _builder_1.newLine();
      _builder_1.append("(cycle <=> (~connected AND ~stronglyc AND ~mstprim AND ~mstkruskal AND ~shortest AND  Algorithms)) AND");
      _builder_1.newLine();
      _builder_1.append("(mstprim <=> (~connected AND ~stronglyc AND ~cycle AND ~mstkruskal AND ~shortest AND  Algorithms)) AND");
      _builder_1.newLine();
      _builder_1.append("(mstkruskal <=> (~connected AND ~stronglyc AND ~cycle AND ~mstprim AND ~shortest AND  Algorithms)) AND");
      _builder_1.newLine();
      _builder_1.append("(shortest <=> (~connected AND ~stronglyc AND ~cycle AND ~mstprim AND ~mstkruskal AND  Algorithms)) ");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      Assert.assertEquals(expected.toString(), actual.toString());
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Method for testing the generation of requires and excludes
   */
  @Test
  public void booleanRequiresExcludes() {
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
      _builder.append("c0: A is root");
      _builder.newLine();
      _builder.append("c1: structural: A variants: [B, C, D]");
      _builder.newLine();
      _builder.append("c2: B requires C");
      _builder.newLine();
      _builder.append("c3: B excludes D");
      _builder.newLine();
      final String program = _builder.toString();
      final Model model = this.parseHelper.parse(program);
      Assert.assertNotNull(model);
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
      _builder_1.append("c0: A = 1");
      _builder_1.newLine();
      _builder_1.append("c2: B => C");
      _builder_1.newLine();
      _builder_1.append("c3: ~(B AND D)");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      Assert.assertEquals(expected.toString(), actual.toString());
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Method for testing the generation of requires and excludes
   */
  @Test
  public void booleanAssignement() {
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
      _builder.append("constraints:");
      _builder.newLine();
      _builder.append("c0: A is selected");
      _builder.newLine();
      _builder.append("c1: B is unselected");
      _builder.newLine();
      final String program = _builder.toString();
      final Model model = this.parseHelper.parse(program);
      Assert.assertNotNull(model);
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
      _builder_1.append("constraints:");
      _builder_1.newLine();
      _builder_1.append("c0: A = 1");
      _builder_1.newLine();
      _builder_1.append("c1: B = 0");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      InputOutput.<CharSequence>print(actual);
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
      Assert.assertEquals(expected.toString(), actual.toString());
      this._validationTestHelper.assertNoErrors(model);
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
