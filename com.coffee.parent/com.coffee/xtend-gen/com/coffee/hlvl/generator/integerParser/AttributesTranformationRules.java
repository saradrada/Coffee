package com.coffee.hlvl.generator.integerParser;

import com.coffee.hlvl.generator.TransformationRules;
import com.coffee.hlvl.generator.integerParser.IAttributesRules;
import com.coffee.hlvl.hLVL.Common;
import com.coffee.hlvl.hLVL.Decomposition;
import com.coffee.hlvl.hLVL.ElmDeclaration;
import com.coffee.hlvl.hLVL.Group;
import com.coffee.hlvl.hLVL.Relational;
import com.coffee.hlvl.hLVL.VarList;
import com.coffee.hlvl.hLVL.Visibility;
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
