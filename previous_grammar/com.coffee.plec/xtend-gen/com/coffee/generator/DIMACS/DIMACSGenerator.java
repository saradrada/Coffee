package com.coffee.generator.DIMACS;

import com.coffee.generator.AbstractGenerator;
import com.coffee.generator.DIMACS.DIMACSFactory;
import com.coffee.generator.TypeOfProblem;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.ConsExpression;
import com.coffee.pLEC.Model;
import com.coffee.pLEC.Quantifiable;
import com.coffee.pLEC.Rule;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Code generator for parsing from the PLEC language to the DIMACS format
 * This class implements the Generator interface
 * @author Angela Villota
 * @version PLEC V3
 * September 2018
 */
@SuppressWarnings("all")
public class DIMACSGenerator extends AbstractGenerator {
  /**
   * object to obtain the constraints regarding the type of the problem
   */
  private DIMACSFactory factory;
  
  /**
   * number of clauses in the problem
   */
  protected int numClauses;
  
  /**
   * Constructor method
   * @param name the name of the model
   * @param type is the TypeOfProblem (SAT, CSP)
   */
  public DIMACSGenerator(final String name, final TypeOfProblem type) {
    super(name, type);
    DIMACSFactory _dIMACSFactory = new DIMACSFactory();
    this.factory = _dIMACSFactory;
    this.setFactory(this.factory);
  }
  
  /**
   * Method to produce a sequence of characters with the
   * model represented as a Satisbiability Problem (SAT) using  the
   * textual DIMACS notation (model.CNF)
   * @param model is an ECORE syntax tree with the program
   * this syntax tree should be traversed.
   */
  @Override
  public CharSequence parseModel(final Model model) {
    String _xblockexpression = null;
    {
      String program = this.factory.getHeader();
      this.parseVariables(model);
      CharSequence clauses = this.parseConstraints(model);
      String _program = program;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("p cnf ");
      int _numClauses = this.factory.getNumClauses();
      _builder.append(_numClauses);
      _builder.append(" ");
      int _numVars = this.factory.getNumVars();
      _builder.append(_numVars);
      _builder.newLineIfNotEmpty();
      _builder.append(clauses);
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      program = (_program + _builder);
      _xblockexpression = program;
    }
    return _xblockexpression;
  }
  
  /**
   * Returns the generated code for a particular constraint in the DIMACS format
   * @param id is a String containing the identifier of the constraint
   * @param exp is a ConsExpression (to be parsed)
   */
  @Override
  public CharSequence parseConstraint(final String id, final ConsExpression exp) {
    return this.parseExpression(exp);
  }
  
  /**
   * Returns the code associated to a constraint of type Rule
   * @param rule is an expression of Type Rule
   */
  @Override
  public CharSequence parseRule(final Rule rule) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * @param exp is an expression of Type Attributes
   * @throws an UnsupportedOperationException
   */
  @Override
  public CharSequence parseAttributes(final Attributes exp) {
    throw new UnsupportedOperationException("Error: The model cannot have attributes");
  }
  
  @Override
  public CharSequence parseQuantifiable(final Quantifiable exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
