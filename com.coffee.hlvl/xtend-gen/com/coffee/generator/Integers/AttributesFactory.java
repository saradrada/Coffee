package com.coffee.generator.Integers;

import com.coffee.hlvl.ElmDeclaration;

@SuppressWarnings("all")
public interface AttributesFactory {
  public abstract CharSequence getDecompositionAtt(final ElmDeclaration parent, final ElmDeclaration attribute);
}
