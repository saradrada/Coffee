package com.coffee.generator.THLCL;

import com.coffee.generator.AttributesFactory;
import com.coffee.generator.CodeFactory;
import com.coffee.generator.CoffeeFactory;
import com.coffee.generator.FODAFactory;
import com.coffee.generator.OptimizationFactory;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.Refinement;
import com.coffee.pLEC.RootRefinement;
import com.coffee.pLEC.VarDeclaration;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Abstract class for XCSP code generation
 * this codeFactory implements the common elements in all XCSP code factories
 * This class is extended by CSPFactory, SATFactory, and COPFactory
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public abstract class THLCLFactory extends CodeFactory implements OptimizationFactory, FODAFactory, AttributesFactory, CoffeeFactory {
  /**
   * Strings in the Textual HLCL format
   */
  private final static String HEADER = "model";
  
  private final static String VARIABLES = "variables:";
  
  private final static String CONSTRAINTS = "constraints:";
  
  /**
   * ===================================================================
   * ===================================================================
   *  Getters and setters
   */
  public String getHeader() {
    return THLCLFactory.HEADER;
  }
  
  public String getVarLabel() {
    return THLCLFactory.VARIABLES;
  }
  
  public String getConsLabel() {
    return THLCLFactory.CONSTRAINTS;
  }
  
  @Override
  public CharSequence getRule(final CharSequence left, final CharSequence right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    _builder.append(left);
    _builder.append(") => (");
    _builder.append(right);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getRootConstraint(final RootRefinement exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = exp.getVar().getName();
    _builder.append(_name);
    _builder.append(" = 1");
    return _builder;
  }
  
  @Override
  public CharSequence getRefinement(final Refinement exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * ===================================================================
   * ===================================================================
   * Unsupported methods at this level
   */
  @Override
  public abstract CharSequence getVariable(final VarDeclaration variable);
  
  @Override
  public CharSequence getStrategy() {
    throw new UnsupportedOperationException("Error: The model cannot have a strategy section");
  }
  
  @Override
  public CharSequence optimizationConstraints() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getObjectives() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getAttributes(final Attributes exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
