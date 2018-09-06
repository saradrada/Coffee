package com.coffee.generator;

import com.coffee.generator.CodeFactory;
import com.coffee.generator.Generator;
import com.coffee.generator.TypeOfProblem;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.ConsExpression;
import com.coffee.pLEC.Constraint;
import com.coffee.pLEC.FodaBin;
import com.coffee.pLEC.FodaUN;
import com.coffee.pLEC.IDCons;
import com.coffee.pLEC.Model;
import com.coffee.pLEC.Rule;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.VarDeclaration;
import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class AbstractGenerator implements Generator {
  /**
   * Name of the PL model
   */
  private String modelName;
  
  /**
   * type of problem can be
   * - SAT, for boolean variables and constraints
   * - CSP, for mixed boolean and integer variables and constraints
   * - COP, for an optimization constraint problem
   */
  private TypeOfProblem typeOfProblem;
  
  /**
   * object to obtain the program sentences regarding the type of the problem
   */
  private CodeFactory factory;
  
  /**
   * Map with the parent of each variable, for structural relations
   */
  private Map<String, VarDeclaration> parents;
  
  /**
   * Constructor method
   * @param the name of the model
   * @param type of the problem
   */
  public AbstractGenerator(final String name, final TypeOfProblem type) {
    this.modelName = name;
    this.typeOfProblem = type;
    HashMap<String, VarDeclaration> _hashMap = new HashMap<String, VarDeclaration>();
    this.parents = _hashMap;
  }
  
  /**
   * This method traverses the list of variables to parse each declaration
   * The declaration is made by the factory
   * @param model
   */
  @Override
  public CharSequence parseVariables(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<VarDeclaration> _vars = model.getVars();
      for(final VarDeclaration variable : _vars) {
        CharSequence _variable = this.factory.getVariable(variable);
        _builder.append(_variable);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * Method to parse the constraints in a model.
   * The constraints are contained in a collection
   * of constraints
   * @param model
   */
  @Override
  public CharSequence parseConstraints(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Constraint> _constraints = model.getConstraints();
      for(final Constraint c : _constraints) {
        {
          ConsExpression _exp = c.getExp();
          if ((_exp instanceof Structural)) {
            ConsExpression _exp_1 = c.getExp();
            Structural exp = ((Structural) _exp_1);
            _builder.newLineIfNotEmpty();
            {
              if (((exp.getMin() == null) && (exp.getMax() == null))) {
                CharSequence _parseStructuralNoCard = this.parseStructuralNoCard(exp);
                _builder.append(_parseStructuralNoCard);
                _builder.newLineIfNotEmpty();
              } else {
                CharSequence _parseConstraint = this.parseConstraint(c.getName(), c.getExp());
                _builder.append(_parseConstraint);
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            CharSequence _parseConstraint_1 = this.parseConstraint(c.getName(), c.getExp());
            _builder.append(_parseConstraint_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * This method is used to determine he type of an expression and
   * call the method in charge to produce the code.
   * @param exp is a constraint expression
   */
  @Override
  public CharSequence parseExpression(final ConsExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((exp instanceof IDCons)) {
        String _name = ((IDCons)exp).getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
      } else {
        {
          if ((exp instanceof FodaBin)) {
            CharSequence _parseFodaBinary = this.parseFodaBinary(((FodaBin)exp));
            _builder.append(_parseFodaBinary);
            _builder.newLineIfNotEmpty();
          } else {
            {
              if ((exp instanceof Rule)) {
                CharSequence _parseRule = this.parseRule(((Rule)exp));
                _builder.append(_parseRule);
                _builder.newLineIfNotEmpty();
              } else {
                {
                  if ((exp instanceof Structural)) {
                    CharSequence _parseStructuralCard = this.parseStructuralCard(((Structural)exp));
                    _builder.append(_parseStructuralCard);
                    _builder.newLineIfNotEmpty();
                  } else {
                    {
                      if ((exp instanceof FodaUN)) {
                        CharSequence _parseFodaUnary = this.parseFodaUnary(((FodaUN)exp));
                        _builder.append(_parseFodaUnary);
                        _builder.newLineIfNotEmpty();
                      } else {
                        {
                          if ((exp instanceof Attributes)) {
                            CharSequence _parseAttributes = this.parseAttributes(((Attributes)exp));
                            _builder.append(_parseAttributes);
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence parseStructuralNoCard(final Structural exp) {
    StringConcatenation _builder = new StringConcatenation();
    this.addParents(exp);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Method obtaining the representation of an structural expression
   * this method calls the factory because the code is dependent of the type of
   * problem and the type of file
   * @param exp is an structural expression
   */
  @Override
  public CharSequence parseStructuralCard(final Structural exp) {
    return this.factory.getGroupCardinality(exp, this.parents);
  }
  
  /**
   * Method obtaining the representation of FODA expression
   * this method calls the factory because the code is dependent of the type of
   * problem and the type of file
   * @param exp is Foda expression with two variables
   */
  @Override
  public CharSequence parseFodaBinary(final FodaBin exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = exp.getOp();
      boolean _equals = Objects.equal(_op, "requires");
      if (_equals) {
        CharSequence _requires = this.factory.getRequires(exp.getVar1(), exp.getVar2());
        _builder.append(_requires);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _op_1 = exp.getOp();
          boolean _equals_1 = Objects.equal(_op_1, "excludes");
          if (_equals_1) {
            CharSequence _excludes = this.factory.getExcludes(exp.getVar1(), exp.getVar2());
            _builder.append(_excludes);
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _op_2 = exp.getOp();
              boolean _equals_2 = Objects.equal(_op_2, "mandatory");
              if (_equals_2) {
                CharSequence _mandatory = this.factory.getMandatory(exp.getVar1(), exp.getVar2());
                _builder.append(_mandatory);
                _builder.newLineIfNotEmpty();
              } else {
                CharSequence _optional = this.factory.getOptional(exp.getVar1(), exp.getVar2());
                _builder.append(_optional);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Method for parsing FODA operations with just one variable
   * this is allowed because there exists a structural expression defined before
   * @param exp is an unary FODA expression
   */
  @Override
  public CharSequence parseFodaUnary(final FodaUN exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = exp.getOp();
      boolean _equals = Objects.equal(_op, "optional");
      if (_equals) {
        CharSequence _optional = this.factory.getOptional(this.parents.get(exp.getVar1().getName()), exp.getVar1());
        _builder.append(_optional);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _op_1 = exp.getOp();
          boolean _equals_1 = Objects.equal(_op_1, "mandatory");
          if (_equals_1) {
            CharSequence _mandatory = this.factory.getMandatory(this.parents.get(exp.getVar1().getName()), exp.getVar1());
            _builder.append(_mandatory);
            _builder.newLineIfNotEmpty();
          } else {
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Method to obtain a sequence of characters containing the
   * constraint program in the Textual HLCL language
   * @param model is an ECORE syntax tree with the program
   * this syntax tree should be traversed.
   */
  @Override
  public abstract CharSequence parseModel(final Model model);
  
  /**
   * Returns the code associated to a constraint of type Rule
   * @param rule is an expression of Type Rule
   */
  @Override
  public abstract CharSequence parseRule(final Rule rule);
  
  @Override
  public abstract CharSequence parseAttributes(final Attributes exp);
  
  @Override
  public abstract CharSequence putAutogeneratedCons();
  
  @Override
  public abstract CharSequence parseConstraint(final String id, final ConsExpression exp);
  
  /**
   * Getters and setters
   */
  @Override
  public String getModelName() {
    return this.modelName;
  }
  
  @Override
  public TypeOfProblem getTypeOfProblem() {
    return this.typeOfProblem;
  }
  
  @Override
  public void addParents(final Structural exp) {
    EList<VarDeclaration> _ids = exp.getGroup().getIds();
    for (final VarDeclaration element : _ids) {
      this.parents.put(element.getName(), exp.getParent());
    }
  }
  
  @Override
  public Map<String, VarDeclaration> getParents() {
    return this.parents;
  }
  
  @Override
  public void setFactory(final CodeFactory factory) {
    this.factory = factory;
  }
}
