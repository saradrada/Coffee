package com.coffee.generator.expressionsParser;

import com.coffee.generator.Dialect;
import com.coffee.generator.commons.IMiniZincConstants;
import com.coffee.generator.expressionsParser.IExpressionsParser;
import com.coffee.generator.expressionsParser.IIntegerExpressionsRules;
import com.coffee.hlvl.And;
import com.coffee.hlvl.BinaryFunction;
import com.coffee.hlvl.Comparison;
import com.coffee.hlvl.Iff;
import com.coffee.hlvl.Implies;
import com.coffee.hlvl.Minus;
import com.coffee.hlvl.MulOrDiv;
import com.coffee.hlvl.Negation;
import com.coffee.hlvl.Or;
import com.coffee.hlvl.Plus;
import com.coffee.hlvl.UnaryFunction;
import com.coffee.hlvl.VariableRef;
import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Implementation of boolean rules
 * @author Angela Villota
 * @version HLVL V1.4
 *  May 2019
 */
@SuppressWarnings("all")
public class IntegerExpressionsRules implements IIntegerExpressionsRules, IMiniZincConstants {
  private IExpressionsParser parser;
  
  private Dialect dialect;
  
  public IntegerExpressionsRules(final IExpressionsParser parser, final Dialect dialect) {
    this.parser = parser;
    this.dialect = dialect;
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
    if ((Objects.equal(exp.getVariable().getDataType(), "boolean") && ((Objects.equal(this.dialect, Dialect.BASIC_INT) || 
      Objects.equal(this.dialect, Dialect.ATTRIBUTE)) || 
      Objects.equal(this.dialect, Dialect.MULTIPLICITY)))) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = exp.getVariable().getName();
      _builder.append(_name);
      _builder.append(" > 0");
      return _builder;
    } else {
      return exp.getVariable().getName();
    }
  }
  
  @Override
  public CharSequence getBinaryFunction(final BinaryFunction exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getComparison(final Comparison exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getMinus(final Minus exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getMulOrDiv(final MulOrDiv exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getPlus(final Plus exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getUnaryFunction(final UnaryFunction exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
