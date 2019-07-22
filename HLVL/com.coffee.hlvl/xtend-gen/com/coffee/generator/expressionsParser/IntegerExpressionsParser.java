package com.coffee.generator.expressionsParser;

import com.coffee.generator.Dialect;
import com.coffee.generator.expressionsParser.BooleanExpressionsParser;
import com.coffee.generator.expressionsParser.IBooleanExpressionsRules;
import com.coffee.generator.expressionsParser.IExpressionsParser;
import com.coffee.generator.expressionsParser.IntegerExpressionsRules;
import com.coffee.hlvl.And;
import com.coffee.hlvl.BoolConstant;
import com.coffee.hlvl.Iff;
import com.coffee.hlvl.Implies;
import com.coffee.hlvl.IntConstant;
import com.coffee.hlvl.Negation;
import com.coffee.hlvl.Or;
import com.coffee.hlvl.Relational;
import com.coffee.hlvl.SymbolConstant;
import com.coffee.hlvl.VariableRef;
import java.util.Map;

/**
 * Parser for boolean expressions
 * @author Angela Villota
 * @version HLVL V1.4
 *  July 2019
 */
@SuppressWarnings("all")
public class IntegerExpressionsParser extends BooleanExpressionsParser implements IExpressionsParser {
  /**
   * Tranformation rules
   */
  private IBooleanExpressionsRules rules;
  
  private Dialect dialect;
  
  private Map<String, Integer> symbolsMap;
  
  public IntegerExpressionsParser(final Map<String, Integer> map, final Dialect dialect) {
    this.symbolsMap = map;
    this.dialect = dialect;
    IntegerExpressionsRules _integerExpressionsRules = new IntegerExpressionsRules(this, dialect);
    this.rules = _integerExpressionsRules;
  }
  
  @Override
  public void setDialect(final Dialect dialect) {
    this.dialect = dialect;
  }
  
  @Override
  public CharSequence parse(final Relational exp) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (exp instanceof BoolConstant) {
      _matched=true;
      _switchResult = ((BoolConstant)exp).getValue();
    }
    if (!_matched) {
      if (exp instanceof IntConstant) {
        _matched=true;
        _switchResult = Integer.valueOf(((IntConstant)exp).getValue()).toString();
      }
    }
    if (!_matched) {
      if (exp instanceof SymbolConstant) {
        _matched=true;
        _switchResult = this.symbolsMap.get(((SymbolConstant)exp).getValue()).toString();
      }
    }
    if (!_matched) {
      if (exp instanceof VariableRef) {
        _matched=true;
        _switchResult = this.rules.getVariable(((VariableRef)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Negation) {
        _matched=true;
        _switchResult = this.rules.getNegation(((Negation)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Iff) {
        _matched=true;
        _switchResult = this.rules.getIff(((Iff)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Implies) {
        _matched=true;
        _switchResult = this.rules.getImplies(((Implies)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Or) {
        _matched=true;
        _switchResult = this.rules.getOr(((Or)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof And) {
        _matched=true;
        _switchResult = this.rules.getAnd(((And)exp));
      }
    }
    return _switchResult;
  }
}
