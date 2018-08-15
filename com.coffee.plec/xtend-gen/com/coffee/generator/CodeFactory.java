package com.coffee.generator;

import com.coffee.pLEC.VarDeclaration;

@SuppressWarnings("all")
public abstract class CodeFactory {
  public final static String HEADER = "language header";
  
  public final static String VARIABLES = "language variable\'s separator";
  
  public final static String CONSTRAINTS = "language constraint\'s separator";
  
  public abstract CharSequence getHeader();
  
  public abstract CharSequence getVarLabel();
  
  public abstract CharSequence getConsLabel();
  
  /**
   * @return by default the strategy is the empty string
   */
  public CharSequence getStrategy() {
    return "";
  }
  
  public abstract CharSequence getVariable(final VarDeclaration variable);
  
  public abstract CharSequence getOptional();
  
  public abstract CharSequence getMandatory();
  
  public abstract CharSequence getExcludes();
  
  public abstract CharSequence getIncludes();
  
  public abstract CharSequence getGroup();
  
  public abstract CharSequence getRule();
}
