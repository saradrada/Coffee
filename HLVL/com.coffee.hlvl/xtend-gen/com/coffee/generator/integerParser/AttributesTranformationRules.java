package com.coffee.generator.integerParser;

import com.coffee.generator.TransformationRules;
import com.coffee.generator.integerParser.IAttributesRules;
import com.coffee.hlvl.Common;
import com.coffee.hlvl.Decomposition;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Group;
import com.coffee.hlvl.Relational;
import com.coffee.hlvl.VarList;
import com.coffee.hlvl.Visibility;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class AttributesTranformationRules extends TransformationRules implements IAttributesRules {
  @Override
  public CharSequence getConstant(final ElmDeclaration element) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getCore(final Common core) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getCoreSingle(final ElmDeclaration element) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getDecomposition(final Decomposition rel, final Map<String, ElmDeclaration> parents) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getElement(final ElmDeclaration element) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getExpression(final Relational rel) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getGroup(final Group rel, final Map<String, ElmDeclaration> parents) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getImpliesList(final VarList rel) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getImpliesPair(final ElmDeclaration left, final ElmDeclaration right) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getMutexList(final VarList rel) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getMutexPair(final ElmDeclaration left, final ElmDeclaration right) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getVisibility(final Visibility rel, final List<CharSequence> relations) {
    return "n.y.i";
  }
  
  @Override
  public CharSequence getDecompositionAtt(final ElmDeclaration parent, final ElmDeclaration attribute) {
    return "n.y.i";
  }
}
