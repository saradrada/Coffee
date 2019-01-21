package com.coffee.generator.Integers;

import com.coffee.generator.CodeFactory;
import com.coffee.hlvl.Core;
import com.coffee.hlvl.Decomposition;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Group;
import com.coffee.hlvl.OptionsDeclaration;
import com.coffee.hlvl.Relational;
import com.coffee.hlvl.VarList;
import com.coffee.hlvl.Visibility;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class IntFactory extends CodeFactory {
  @Override
  public CharSequence getConstant(final ElmDeclaration element) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getElement(final ElmDeclaration element) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getValuesDeclaration(final ElmDeclaration variable, final OptionsDeclaration variant) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getCore(final Core core) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getDecomposition(final Decomposition rel, final Map<String, ElmDeclaration> parents) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getGroup(final Group rel, final Map<String, ElmDeclaration> parents) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getImpliesList(final VarList rel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getMutexList(final VarList rel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getExpression(final Relational rel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getImpliesPair(final ElmDeclaration left, final ElmDeclaration right) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getMutexPair(final ElmDeclaration left, final ElmDeclaration right) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getVisibility(final Visibility rel, final List<CharSequence> relations) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
