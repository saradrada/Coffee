package com.coffee.generator.integerParser;

import com.coffee.generator.Dialect;
import com.coffee.generator.TransformationRules;
import com.coffee.generator.commons.IMiniZincConstants;
import com.coffee.generator.expressionsParser.IntegerExpressionsParser;
import com.coffee.hlvl.BoolConstant;
import com.coffee.hlvl.ConstantDecl;
import com.coffee.hlvl.Declaration;
import com.coffee.hlvl.Decomposition;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Enumeration;
import com.coffee.hlvl.Group;
import com.coffee.hlvl.IntConstant;
import com.coffee.hlvl.Interval;
import com.coffee.hlvl.OptionsDeclaration;
import com.coffee.hlvl.Relational;
import com.coffee.hlvl.SymbolConstant;
import com.coffee.hlvl.VariableDecl;
import com.coffee.hlvl.Visibility;
import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * class implementing the boolean transformation rules for in Benavides2010
 * for obtaining the HLCL representation in the MiniZinc language.
 * This class implements TransformationRules
 * @author Angela Villota
 * @version HLVL V1.4
 * August 2018
 * updated on May 2019
 * modified on July 2019 to comply with the modifications in the syntax method: getDecomposition
 * fixed a bug in the group with cardinality [1,1]
 */
@SuppressWarnings("all")
public class BasicIntegerRules extends TransformationRules implements IMiniZincConstants {
  /**
   * integer variable to produce the identifiers for the variables and constraints
   * in visibility relations
   */
  private int visibilityIdCounter;
  
  /**
   * expressions parser with an implementation for integer constraints
   */
  private IntegerExpressionsParser expressionsParser;
  
  private Map<String, Integer> symbolsTable;
  
  private Map<String, String> mapsTable;
  
  public BasicIntegerRules(final Dialect dialect) {
    IntegerExpressionsParser _integerExpressionsParser = new IntegerExpressionsParser(this.symbolsTable, dialect);
    this.expressionsParser = _integerExpressionsParser;
    this.visibilityIdCounter = 0;
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    this.symbolsTable = _hashMap;
    HashMap<String, String> _hashMap_1 = new HashMap<String, String>();
    this.mapsTable = _hashMap_1;
  }
  
  private Object parseValue(final Relational aValue) {
    Object _switchResult = null;
    boolean _matched = false;
    if (aValue instanceof BoolConstant) {
      _matched=true;
      CharSequence _xifexpression = null;
      String _value = ((BoolConstant)aValue).getValue();
      boolean _equals = Objects.equal(_value, "true");
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("1");
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("0");
        _xifexpression = _builder_1;
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (aValue instanceof SymbolConstant) {
        _matched=true;
        _switchResult = ((SymbolConstant)aValue).getValue();
      }
    }
    if (!_matched) {
      if (aValue instanceof IntConstant) {
        _matched=true;
        _switchResult = Integer.valueOf(((IntConstant)aValue).getValue());
      }
    }
    return _switchResult;
  }
  
  private CharSequence getDomain(final ElmDeclaration element) {
    CharSequence _xblockexpression = null;
    {
      Declaration _declaration = element.getDeclaration();
      final VariableDecl declaration = ((VariableDecl) _declaration);
      CharSequence _switchResult = null;
      String _dataType = element.getDataType();
      if (_dataType != null) {
        switch (_dataType) {
          case "boolean":
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("0..1");
            _switchResult = _builder;
            break;
          case "integer":
            CharSequence _switchResult_1 = null;
            OptionsDeclaration _variants = declaration.getVariants();
            boolean _matched = false;
            if (_variants instanceof Interval) {
              _matched=true;
              StringConcatenation _builder_1 = new StringConcatenation();
              OptionsDeclaration _variants_1 = declaration.getVariants();
              int _start = ((Interval) _variants_1).getStart();
              _builder_1.append(_start);
              _builder_1.append("..");
              OptionsDeclaration _variants_2 = declaration.getVariants();
              int _end = ((Interval) _variants_2).getEnd();
              _builder_1.append(_end);
              _switchResult_1 = _builder_1;
            }
            if (!_matched) {
              if (_variants instanceof Enumeration) {
                _matched=true;
                String _xblockexpression_1 = null;
                {
                  StringConcatenation _builder_1 = new StringConcatenation();
                  _builder_1.append("{");
                  String out = _builder_1.toString();
                  OptionsDeclaration _variants_1 = declaration.getVariants();
                  EList<Relational> _values = ((Enumeration) _variants_1).getList().getValues();
                  for (final Relational value : _values) {
                    String _out = out;
                    StringConcatenation _builder_2 = new StringConcatenation();
                    Object _parseValue = this.parseValue(value);
                    _builder_2.append(_parseValue);
                    _builder_2.append(" , ");
                    out = (_out + _builder_2);
                  }
                  int _length = out.length();
                  int _minus = (_length - 2);
                  CharSequence _subSequence = out.subSequence(0, _minus);
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("} ");
                  String _plus = (_subSequence + _builder_3.toString());
                  _xblockexpression_1 = out = _plus;
                }
                _switchResult_1 = _xblockexpression_1;
              }
            }
            _switchResult = _switchResult_1;
            break;
          case "symbolic":
            String _xblockexpression_1 = null;
            {
              int i = 1;
              String mapping = "";
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("{");
              String out = _builder_1.toString();
              OptionsDeclaration _variants_1 = declaration.getVariants();
              EList<Relational> _values = ((Enumeration) _variants_1).getList().getValues();
              for (final Relational value : _values) {
                {
                  String valParsed = this.parseValue(value).toString();
                  String _mapping = mapping;
                  StringConcatenation _builder_2 = new StringConcatenation();
                  _builder_2.append(valParsed);
                  _builder_2.append(" -> ");
                  _builder_2.append(i);
                  _builder_2.append(",  ");
                  mapping = (_mapping + _builder_2);
                  this.symbolsTable.put(valParsed, Integer.valueOf(i));
                  String _out = out;
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append(i);
                  _builder_3.append(" , ");
                  out = (_out + _builder_3);
                  i++;
                }
              }
              this.mapsTable.put(element.getName(), mapping);
              int _length = out.length();
              int _minus = (_length - 2);
              CharSequence _subSequence = out.subSequence(0, _minus);
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("} ");
              String _plus = (_subSequence + _builder_2.toString());
              _xblockexpression_1 = out = _plus;
            }
            _switchResult = _xblockexpression_1;
            break;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getConstant(final ElmDeclaration element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IMiniZincConstants.BOOL_DOMAIN);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.COLON);
    _builder.append("  ");
    String _name = element.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.ASSIGN);
    _builder.append(" ");
    Declaration _declaration = element.getDeclaration();
    Object _parseValue = this.parseValue(((ConstantDecl) _declaration).getValue());
    _builder.append(_parseValue);
    _builder.append(IMiniZincConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getElement(final ElmDeclaration element) {
    CharSequence _switchResult = null;
    String _dataType = element.getDataType();
    if (_dataType != null) {
      switch (_dataType) {
        case "boolean":
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(IMiniZincConstants.VAR_DEF);
          _builder.append(" 0..1: ");
          String _name = element.getName();
          _builder.append(_name);
          _builder.append(IMiniZincConstants.SEMICOLON);
          _builder.newLineIfNotEmpty();
          _switchResult = _builder;
          break;
        case "integer":
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(IMiniZincConstants.VAR_DEF);
          _builder_1.append(" ");
          CharSequence _domain = this.getDomain(element);
          _builder_1.append(_domain);
          _builder_1.append(" : ");
          String _name_1 = element.getName();
          _builder_1.append(_name_1);
          _builder_1.append(IMiniZincConstants.SEMICOLON);
          _builder_1.newLineIfNotEmpty();
          _switchResult = _builder_1;
          break;
        case "symbolic":
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("% Mapping  variants to integers");
          _builder_2.newLine();
          _builder_2.append(IMiniZincConstants.VAR_DEF);
          _builder_2.append(" ");
          CharSequence _domain_1 = this.getDomain(element);
          _builder_2.append(_domain_1);
          _builder_2.append(" : ");
          String _name_2 = element.getName();
          _builder_2.append(_name_2);
          _builder_2.append(IMiniZincConstants.SEMICOLON);
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("% Map: ");
          String _get = this.mapsTable.get(element.getName());
          _builder_2.append(_get);
          _builder_2.newLineIfNotEmpty();
          _switchResult = _builder_2;
          break;
      }
    }
    return _switchResult;
  }
  
  @Override
  public CharSequence getCoreSingle(final ElmDeclaration element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IMiniZincConstants.CONS_DEF);
    _builder.append(" ");
    String _name = element.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.EQUIV);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.INT_TRUE);
    _builder.append(IMiniZincConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getDecomposition(final Decomposition rel, final Map<String, ElmDeclaration> parents) {
    String _xblockexpression = null;
    {
      String out = "";
      EList<ElmDeclaration> _values = rel.getChildren().getValues();
      for (final ElmDeclaration element : _values) {
        {
          parents.put(element.getName(), rel.getParent());
          if (((rel.getMin() == 1) && (rel.getMax() == 1))) {
            String _out = out;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append(IMiniZincConstants.CONS_DEF);
            _builder.append(" ");
            String _name = rel.getParent().getName();
            _builder.append(_name);
            _builder.append(" ");
            _builder.append(IMiniZincConstants.EQUIV);
            _builder.append(" ");
            String _name_1 = element.getName();
            _builder.append(_name_1);
            _builder.append(IMiniZincConstants.SEMICOLON);
            _builder.newLineIfNotEmpty();
            out = (_out + _builder);
          } else {
            String _out_1 = out;
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(IMiniZincConstants.CONS_DEF);
            _builder_1.append(" ");
            String _name_2 = rel.getParent().getName();
            _builder_1.append(_name_2);
            _builder_1.append(" ");
            _builder_1.append(IMiniZincConstants.GEQ);
            _builder_1.append(" ");
            String _name_3 = element.getName();
            _builder_1.append(_name_3);
            _builder_1.append(IMiniZincConstants.SEMICOLON);
            _builder_1.newLineIfNotEmpty();
            out = (_out_1 + _builder_1);
          }
        }
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getGroup(final Group rel, final Map<String, ElmDeclaration> parents) {
    String _xblockexpression = null;
    {
      String sum = "";
      String out = "";
      EList<ElmDeclaration> _values = rel.getChildren().getValues();
      for (final ElmDeclaration child : _values) {
        String _sum = sum;
        StringConcatenation _builder = new StringConcatenation();
        String _name = child.getName();
        _builder.append(_name);
        _builder.append(" + ");
        sum = (_sum + _builder);
      }
      int _length = sum.length();
      int _minus = (_length - 2);
      sum = sum.substring(0, _minus);
      final int min = rel.getMin();
      int max = 0;
      String _value = rel.getMax().getValue();
      boolean _equals = Objects.equal(_value, "*");
      if (_equals) {
        max = rel.getChildren().getValues().size();
      } else {
        max = Integer.parseInt(rel.getMax().getValue());
      }
      if ((min == 1)) {
        String _out = out;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(IMiniZincConstants.CONS_DEF);
        _builder_1.append(" ");
        String _name_1 = rel.getParent().getName();
        _builder_1.append(_name_1);
        _builder_1.append(" ");
        _builder_1.append(IMiniZincConstants.LEQ);
        _builder_1.append(" ");
        _builder_1.append(sum);
        _builder_1.append(IMiniZincConstants.SEMICOLON);
        _builder_1.newLineIfNotEmpty();
        out = (_out + _builder_1);
      } else {
        String _out_1 = out;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(IMiniZincConstants.CONS_DEF);
        _builder_2.append(" ");
        _builder_2.append(min);
        _builder_2.append(" ");
        _builder_2.append(IMiniZincConstants.TIMES);
        _builder_2.append(" ");
        String _name_2 = rel.getParent().getName();
        _builder_2.append(_name_2);
        _builder_2.append(" ");
        _builder_2.append(IMiniZincConstants.LEQ);
        _builder_2.append(" ");
        _builder_2.append(sum);
        _builder_2.append(IMiniZincConstants.SEMICOLON);
        _builder_2.newLineIfNotEmpty();
        out = (_out_1 + _builder_2);
      }
      if ((max == 1)) {
        String _out_2 = out;
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append(IMiniZincConstants.CONS_DEF);
        _builder_3.append(" ");
        _builder_3.append(sum);
        _builder_3.append(" ");
        _builder_3.append(IMiniZincConstants.LEQ);
        _builder_3.append(" ");
        String _name_3 = rel.getParent().getName();
        _builder_3.append(_name_3);
        _builder_3.append(IMiniZincConstants.SEMICOLON);
        _builder_3.newLineIfNotEmpty();
        out = (_out_2 + _builder_3);
      } else {
        String _out_3 = out;
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(IMiniZincConstants.CONS_DEF);
        _builder_4.append(" ");
        _builder_4.append(sum);
        _builder_4.append(" ");
        _builder_4.append(IMiniZincConstants.LEQ);
        _builder_4.append(" ");
        _builder_4.append(max);
        _builder_4.append(" ");
        _builder_4.append(IMiniZincConstants.TIMES);
        _builder_4.append(" ");
        String _name_4 = rel.getParent().getName();
        _builder_4.append(_name_4);
        _builder_4.append(IMiniZincConstants.SEMICOLON);
        _builder_4.newLineIfNotEmpty();
        out = (_out_3 + _builder_4);
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getImpliesPair(final ElmDeclaration left, final ElmDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IMiniZincConstants.CONS_DEF);
    _builder.append(" ");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.LEQ);
    _builder.append(" ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(IMiniZincConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getMutexPair(final ElmDeclaration left, final ElmDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IMiniZincConstants.CONS_DEF);
    _builder.append(" ");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.PLUS);
    _builder.append(" ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.LEQ);
    _builder.append(" 1 ");
    _builder.append(IMiniZincConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getExpression(final Relational exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IMiniZincConstants.CONS_DEF);
    _builder.append(" ");
    CharSequence _parse = this.expressionsParser.parse(exp);
    _builder.append(_parse);
    _builder.append(IMiniZincConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getVisibility(final Visibility rel, final List<CharSequence> relations) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var bool: B");
      _builder.append(this.visibilityIdCounter);
      _builder.append(" ;");
      _builder.newLineIfNotEmpty();
      _builder.append("constraint ");
      CharSequence _parse = this.expressionsParser.parse(rel.getCondition());
      _builder.append(_parse);
      _builder.append(" -> B");
      _builder.append(this.visibilityIdCounter);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String out = _builder.toString();
      for (final CharSequence r : relations) {
        String _out = out;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("constraint B");
        _builder_1.append(this.visibilityIdCounter);
        _builder_1.append("  <-> ");
        CharSequence _subSequence = r.subSequence(10, r.length());
        _builder_1.append(_subSequence);
        _builder_1.newLineIfNotEmpty();
        out = (_out + _builder_1);
      }
      this.visibilityIdCounter++;
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
}
