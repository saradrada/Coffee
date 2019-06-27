package com.coffee.hlvl.generator.expressionsParser;

import com.coffee.hlvl.generator.commons.IMiniZincConstants;
import com.coffee.hlvl.generator.expressionsParser.IBooleanExpressionsRules;
import com.coffee.hlvl.generator.expressionsParser.IExpressionsParser;
import com.coffee.hlvl.hLVL.And;
import com.coffee.hlvl.hLVL.Iff;
import com.coffee.hlvl.hLVL.Implies;
import com.coffee.hlvl.hLVL.Negation;
import com.coffee.hlvl.hLVL.Or;
import com.coffee.hlvl.hLVL.VariableRef;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Implementation of boolean rules
 * @author Angela Villota
 * @version HLVL V1.4
 *  May 2019
 */
@SuppressWarnings("all")
public class BooleanExpressionsRules implements IBooleanExpressionsRules, IMiniZincConstants {
  private IExpressionsParser parser;
  
  public BooleanExpressionsRules(final IExpressionsParser parser) {
    this.parser = parser;
  }
  
  @Override
  public CharSequence getAnd(final And exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _parse = this.parser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.AND);
    _builder.append(" ");
    CharSequence _parse_1 = this.parser.parse(exp.getRight());
    _builder.append(_parse_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getIff(final Iff exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _parse = this.parser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append("  ");
    _builder.append(IMiniZincConstants.IFF);
    _builder.append(" ");
    CharSequence _parse_1 = this.parser.parse(exp.getRight());
    _builder.append(_parse_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getImplies(final Implies exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _parse = this.parser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append("  ");
    _builder.append(IMiniZincConstants.IMPLIES_LR);
    _builder.append(" ");
    CharSequence _parse_1 = this.parser.parse(exp.getRight());
    _builder.append(_parse_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getNegation(final Negation exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IMiniZincConstants.NOT);
    _builder.append("(");
    CharSequence _parse = this.parser.parse(exp.getExpression());
    _builder.append(_parse);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getOr(final Or exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _parse = this.parser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.OR);
    _builder.append(" ");
    CharSequence _parse_1 = this.parser.parse(exp.getRight());
    _builder.append(_parse_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getVariable(final VariableRef exp) {
    return exp.getVariable().getName();
  }
}
