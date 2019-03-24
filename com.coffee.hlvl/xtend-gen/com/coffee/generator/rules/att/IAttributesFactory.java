package com.coffee.generator.rules.att;

import com.coffee.hlvl.ElmDeclaration;

@SuppressWarnings("all")
public interface IAttributesFactory {
  public abstract CharSequence getDecompositionAtt(final ElmDeclaration parent, final ElmDeclaration attribute);
}
