package org.xtext.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.cPHLCL.CPHLCLPackage;
import org.xtext.cPHLCL.Constraint;
import org.xtext.cPHLCL.Model;
import org.xtext.tests.CPHLCLInjectorProvider;
import org.xtext.typing.ExpressionsType;
import org.xtext.typing.TypeProvider;
import org.xtext.validation.CPHLCLValidator;

@RunWith(XtextRunner.class)
@InjectWith(CPHLCLInjectorProvider.class)
@SuppressWarnings("all")
public class CPHLCLTypingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Inject
  @Extension
  private ParseHelper _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private TypeProvider _typeProvider;
  
  @Test
  public void andTypesError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: 1..10");
      _builder.newLine();
      _builder.append("integer B domain: 2..10");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      _builder.append("c1: A AND B ");
      _builder.newLine();
      final EObject model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, CPHLCLPackage.eINSTANCE.getAnd(), 
        CPHLCLValidator.WRONG_TYPE, 
        "expected boolean type, but was integer");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void constraintsTypesError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: 1..10");
      _builder.newLine();
      _builder.append("integer B domain: 2..10");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      _builder.append("c1: A + B ");
      _builder.newLine();
      final EObject model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, CPHLCLPackage.eINSTANCE.getConstraint(), 
        CPHLCLValidator.WRONG_TYPE, 
        "expected boolean type, but was integer");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void constraintsNoError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: 1..10");
      _builder.newLine();
      _builder.append("integer B domain: 2..10");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      _builder.append("c1: A + B ");
      _builder.newLine();
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      this.printErrors(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * auxiliar methods for tests
   */
  private void assertType(final CharSequence input, final ExpressionsType expectedType) {
    try {
      final Model m1 = this.parseHelper.parse(input);
      Assert.assertNotNull(m1);
      Assert.assertTrue(m1.eResource().getErrors().isEmpty());
      Assert.assertSame(this._typeProvider.typeFor(IterableExtensions.<Constraint>last(m1.getConstraints())), expectedType);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertSymType(final CharSequence input) {
    this.assertType(input, TypeProvider.symType);
  }
  
  public void assertIntType(final CharSequence input) {
    this.assertType(input, TypeProvider.intType);
  }
  
  public void assertBoolType(final CharSequence input) {
    this.assertType(input, TypeProvider.boolType);
  }
  
  /**
   * to print the  errors
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
