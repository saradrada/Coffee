package com.coffee.generator.THLCL;

import com.coffee.generator.AbstractGenerator;
import com.coffee.generator.THLCL.BooleanFactory;
import com.coffee.generator.THLCL.IntegerFactory;
import com.coffee.generator.THLCL.OptimizationFactory;
import com.coffee.generator.THLCL.THLCLFactory;
import com.coffee.generator.TypeOfProblem;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.ConsExpression;
import com.coffee.pLEC.Expression;
import com.coffee.pLEC.Model;
import com.coffee.pLEC.Quantifiable;
import com.coffee.pLEC.Rule;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Code generator for parse from the PLEC language to the Textual High Level Constraint
 * Language (THLCL)
 * This class implements the Generator interface
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public class THLCLGenerator extends AbstractGenerator {
  /**
   * object to obtain the program sentences regarding the type of the problem
   */
  private THLCLFactory factory;
  
  /**
   * Constructor method
   * @param name the name of the model
   * @param type is the TypeOfProblem (SAT, CSP)
   */
  public THLCLGenerator(final String name, final TypeOfProblem type) {
    super(name, type);
    TypeOfProblem _typeOfProblem = this.getTypeOfProblem();
    if (_typeOfProblem != null) {
      switch (_typeOfProblem) {
        case SAT:
          BooleanFactory _booleanFactory = new BooleanFactory();
          this.factory = _booleanFactory;
          break;
        case CSP:
          IntegerFactory _integerFactory = new IntegerFactory();
          this.factory = _integerFactory;
          break;
        case COP:
          OptimizationFactory _optimizationFactory = new OptimizationFactory();
          this.factory = _optimizationFactory;
          break;
        case CSP_INST:
          IntegerFactory _integerFactory_1 = new IntegerFactory();
          this.factory = _integerFactory_1;
          break;
        default:
          break;
      }
    }
    this.setFactory(this.factory);
  }
  
  /**
   * Method to produce a sequence of characters with the
   * model represented as a constraint problem using  the
   * Textual HLCL language (model.hlcl)
   * @param model is an ECORE syntax tree with the program
   * this syntax tree should be traversed.
   */
  @Override
  public CharSequence parseModel(final Model model) {
    CharSequence _switchResult = null;
    TypeOfProblem _typeOfProblem = this.getTypeOfProblem();
    if (_typeOfProblem != null) {
      switch (_typeOfProblem) {
        case SAT:
          StringConcatenation _builder = new StringConcatenation();
          String _header = this.factory.getHeader();
          _builder.append(_header);
          _builder.append(" ");
          String _modelName = this.getModelName();
          _builder.append(_modelName);
          _builder.newLineIfNotEmpty();
          String _varLabel = this.factory.getVarLabel();
          _builder.append(_varLabel);
          _builder.newLineIfNotEmpty();
          CharSequence _parseVariables = this.parseVariables(model);
          _builder.append(_parseVariables);
          _builder.newLineIfNotEmpty();
          String _consLabel = this.factory.getConsLabel();
          _builder.append(_consLabel);
          _builder.newLineIfNotEmpty();
          CharSequence _parseConstraints = this.parseConstraints(model);
          _builder.append(_parseConstraints);
          _builder.newLineIfNotEmpty();
          _switchResult = _builder;
          break;
        case CSP:
          StringConcatenation _builder_1 = new StringConcatenation();
          String _header_1 = this.factory.getHeader();
          _builder_1.append(_header_1);
          _builder_1.append(" ");
          String _modelName_1 = this.getModelName();
          _builder_1.append(_modelName_1);
          _builder_1.newLineIfNotEmpty();
          String _varLabel_1 = this.factory.getVarLabel();
          _builder_1.append(_varLabel_1);
          _builder_1.newLineIfNotEmpty();
          CharSequence _parseVariables_1 = this.parseVariables(model);
          _builder_1.append(_parseVariables_1);
          _builder_1.newLineIfNotEmpty();
          String _consLabel_1 = this.factory.getConsLabel();
          _builder_1.append(_consLabel_1);
          _builder_1.newLineIfNotEmpty();
          CharSequence _parseConstraints_1 = this.parseConstraints(model);
          _builder_1.append(_parseConstraints_1);
          _builder_1.newLineIfNotEmpty();
          _switchResult = _builder_1;
          break;
        case COP:
          StringConcatenation _builder_2 = new StringConcatenation();
          String _header_2 = this.factory.getHeader();
          _builder_2.append(_header_2);
          _builder_2.append(" ");
          String _modelName_2 = this.getModelName();
          _builder_2.append(_modelName_2);
          _builder_2.newLineIfNotEmpty();
          String _varLabel_2 = this.factory.getVarLabel();
          _builder_2.append(_varLabel_2);
          _builder_2.newLineIfNotEmpty();
          CharSequence _parseVariables_2 = this.parseVariables(model);
          _builder_2.append(_parseVariables_2);
          _builder_2.newLineIfNotEmpty();
          String _consLabel_2 = this.factory.getConsLabel();
          _builder_2.append(_consLabel_2);
          _builder_2.newLineIfNotEmpty();
          CharSequence _parseConstraints_2 = this.parseConstraints(model);
          _builder_2.append(_parseConstraints_2);
          _builder_2.newLineIfNotEmpty();
          CharSequence _strategy = this.factory.getStrategy();
          _builder_2.append(_strategy);
          _builder_2.newLineIfNotEmpty();
          _switchResult = _builder_2;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  /**
   * Returns the code associated to a constraint of type Rule
   * This method first translates the constraints, then call a
   * factory for calling the rule
   * @param rule is an expression of Type Rule
   */
  @Override
  public CharSequence parseRule(final Rule rule) {
    CharSequence _xblockexpression = null;
    {
      Expression _condition = rule.getCondition();
      final CharSequence left = this.parseExpression(((ConsExpression) _condition));
      Expression _consequence = rule.getConsequence();
      final CharSequence right = this.parseExpression(((ConsExpression) _consequence));
      _xblockexpression = this.factory.getRule(left, right);
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence parseAttributes(final Attributes exp) {
    return this.factory.getAttributes(exp);
  }
  
  /**
   * Returns the generated code for a particular constraint in the Textual
   * HLCL format
   * @param id is a String containing the identifier of the constraint
   * @param exp is a ConsExpression (to be parsed)
   */
  @Override
  public CharSequence parseConstraint(final String id, final ConsExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(id);
    _builder.append(": ");
    CharSequence _parseExpression = this.parseExpression(exp);
    _builder.append(_parseExpression);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence parseQuantifiable(final Quantifiable exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
