package com.coffee.generator;

import com.coffee.pLEC.VarDeclaration;

@SuppressWarnings("all")
public interface CardinalityFactory {
  /**
   * Interface to define the methods a codeFactory for the PLEC language
   * should implement, all Factories implement this interface
   * implemented by (THLCLFactory, XCSP3Factory, DIMASFactory)
   * @author Angela Villota
   * @version PLEC V3
   * August 2018
   */
  public abstract CharSequence getClonConstraints();
  
  public abstract CharSequence getClonVariables(final VarDeclaration variable);
}
