package com.coffee.generator;

import com.coffee.generator.FODAFactory;
import com.coffee.pLEC.VarDeclaration;
import com.coffee.pLEC.VariantDeclaration;

/**
 * Interface to define the methods a codeFactory for the PLEC language
 * should implement, all Factories implement this interface
 * implemented by (THLCLFactory, XCSP3Factory, DIMASFactory)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public abstract class CodeFactory implements FODAFactory {
  public abstract CharSequence getVariable(final VarDeclaration variable);
  
  public abstract CharSequence getValuesDeclaration(final VarDeclaration variable, final VariantDeclaration variant);
}
