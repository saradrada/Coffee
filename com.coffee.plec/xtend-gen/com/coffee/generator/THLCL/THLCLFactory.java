package com.coffee.generator.THLCL;

import com.coffee.generator.CodeFactory;

@SuppressWarnings("all")
public abstract class THLCLFactory extends CodeFactory {
  private final static String HEADER = "model";
  
  private final static String VARIABLES = "variables:";
  
  private final static String CONSTRAINTS = "constraints:";
  
  @Override
  public CharSequence getHeader() {
    return THLCLFactory.HEADER;
  }
  
  @Override
  public CharSequence getVarLabel() {
    return THLCLFactory.VARIABLES;
  }
  
  @Override
  public CharSequence getConsLabel() {
    return THLCLFactory.CONSTRAINTS;
  }
}
