package com.coffee.generator.rules.att;

import com.coffee.generator.Dialect;
import com.coffee.generator.common.ExpressionsParser;
import com.coffee.generator.minizinc.IConstants;
import com.coffee.generator.rules.att.IAttributesFactory;
import com.coffee.generator.rules.bools.BoolFactory;
import com.coffee.hlvl.BoolVal;
import com.coffee.hlvl.ConstantDecl;
import com.coffee.hlvl.Declaration;
import com.coffee.hlvl.Decomposition;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Enumeration;
import com.coffee.hlvl.Group;
import com.coffee.hlvl.Interval;
import com.coffee.hlvl.OptionsDeclaration;
import com.coffee.hlvl.Relational;
import com.coffee.hlvl.Symbol;
import com.coffee.hlvl.Value;
import com.coffee.hlvl.VariableDecl;
import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AttFactory extends BoolFactory implements IAttributesFactory {
  private Map<String, Integer> symbolsTable;
  
  private Map<String, String> mapsTable;
  
  private ExpressionsParser expressionsParser;
  
  public AttFactory() {
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    this.symbolsTable = _hashMap;
    HashMap<String, String> _hashMap_1 = new HashMap<String, String>();
    this.mapsTable = _hashMap_1;
    ExpressionsParser _expressionsParser = new ExpressionsParser(this.symbolsTable);
    this.expressionsParser = _expressionsParser;
  }
  
  @Override
  public CharSequence getConstant(final ElmDeclaration element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int: ");
    String _name = element.getName();
    _builder.append(_name);
    _builder.append(" = ");
    Declaration _declaration = element.getDeclaration();
    Object _parseValue = this.parseValue(((ConstantDecl) _declaration).getValue());
    _builder.append(_parseValue);
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
          _builder.append(IConstants.VAR_DEF);
          _builder.append(" 0..1: ");
          String _name = element.getName();
          _builder.append(_name);
          _builder.append(" ");
          _builder.append(IConstants.SEMICOLON);
          _builder.newLineIfNotEmpty();
          _switchResult = _builder;
          break;
        case "integer":
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(IConstants.VAR_DEF);
          _builder_1.append(" ");
          CharSequence _domain = this.getDomain(element);
          _builder_1.append(_domain);
          _builder_1.append(" : ");
          String _name_1 = element.getName();
          _builder_1.append(_name_1);
          _builder_1.append(" ");
          _builder_1.append(IConstants.SEMICOLON);
          _builder_1.newLineIfNotEmpty();
          _switchResult = _builder_1;
          break;
        case "symbolic":
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("% Mapping  variants to integers");
          _builder_2.newLine();
          _builder_2.append(IConstants.VAR_DEF);
          _builder_2.append(" ");
          CharSequence _domain_1 = this.getDomain(element);
          _builder_2.append(_domain_1);
          _builder_2.append(" : ");
          String _name_2 = element.getName();
          _builder_2.append(_name_2);
          _builder_2.append(" ");
          _builder_2.append(IConstants.SEMICOLON);
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
  
  public Object parseValue(final Value aValue) {
    Object _switchResult = null;
    boolean _matched = false;
    if (aValue instanceof BoolVal) {
      _matched=true;
      CharSequence _xifexpression = null;
      String _value = ((BoolVal)aValue).getValue();
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
      if (aValue instanceof Symbol) {
        _matched=true;
        _switchResult = ((Symbol)aValue).getValue();
      }
    }
    if (!_matched) {
      if (aValue instanceof com.coffee.hlvl.Number) {
        _matched=true;
        _switchResult = Integer.valueOf(((com.coffee.hlvl.Number)aValue).getValue());
      }
    }
    return _switchResult;
  }
  
  @Override
  public CharSequence getCoreSingle(final ElmDeclaration element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IConstants.CONS_DEF);
    _builder.append(" ");
    String _name = element.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(IConstants.GT);
    _builder.append(" 0 ");
    _builder.append(IConstants.SEMICOLON);
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
          if (((!(element.getAtt() == null)) && Objects.equal(element.getAtt(), "att"))) {
            String _out = out;
            CharSequence _decompositionAtt = this.getDecompositionAtt(rel.getParent(), element);
            out = (_out + _decompositionAtt);
          } else {
            int _cardinality = rel.getCardinality();
            boolean _equals = (_cardinality == 1);
            if (_equals) {
              String _out_1 = out;
              StringConcatenation _builder = new StringConcatenation();
              _builder.append(IConstants.CONS_DEF);
              _builder.append(" ");
              String _name = rel.getParent().getName();
              _builder.append(_name);
              _builder.append(" ");
              _builder.append(IConstants.GT);
              _builder.append(" 0 ");
              _builder.append(IConstants.IFF);
              _builder.append(" ");
              String _name_1 = element.getName();
              _builder.append(_name_1);
              _builder.append(" ");
              _builder.append(IConstants.GT);
              _builder.append(" 0 ");
              _builder.append(IConstants.SEMICOLON);
              _builder.newLineIfNotEmpty();
              out = (_out_1 + _builder);
            } else {
              String _out_2 = out;
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append(IConstants.CONS_DEF);
              _builder_1.append(" ");
              String _name_2 = element.getName();
              _builder_1.append(_name_2);
              _builder_1.append(" ");
              _builder_1.append(IConstants.GT);
              _builder_1.append(" 0 ");
              _builder_1.append(IConstants.IMPLIES_LR);
              _builder_1.append(" ");
              String _name_3 = rel.getParent().getName();
              _builder_1.append(_name_3);
              _builder_1.append(" ");
              _builder_1.append(IConstants.GT);
              _builder_1.append(" 0 ");
              _builder_1.append(IConstants.SEMICOLON);
              _builder_1.newLineIfNotEmpty();
              out = (_out_2 + _builder_1);
            }
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
      if ((min == max)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(IConstants.CONS_DEF);
        _builder_1.append(" ");
        _builder_1.append(sum);
        _builder_1.append(" ");
        _builder_1.append(IConstants.LEQ);
        _builder_1.append(" ");
        _builder_1.append(max);
        _builder_1.append(" * ");
        String _name_1 = rel.getParent().getName();
        _builder_1.append(_name_1);
        _builder_1.append(" ");
        _builder_1.append(IConstants.SEMICOLON);
        _builder_1.newLineIfNotEmpty();
        out = _builder_1.toString();
      } else {
        if ((min == 1)) {
          String _out = out;
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(IConstants.CONS_DEF);
          _builder_2.append(" ");
          String _name_2 = rel.getParent().getName();
          _builder_2.append(_name_2);
          _builder_2.append(" ");
          _builder_2.append(IConstants.LEQ);
          _builder_2.append(" ");
          _builder_2.append(sum);
          _builder_2.append(" ");
          _builder_2.append(IConstants.SEMICOLON);
          _builder_2.newLineIfNotEmpty();
          out = (_out + _builder_2);
        } else {
          String _out_1 = out;
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append(IConstants.CONS_DEF);
          _builder_3.append(" ");
          _builder_3.append(min);
          _builder_3.append(" * ");
          String _name_3 = rel.getParent().getName();
          _builder_3.append(_name_3);
          _builder_3.append(" ");
          _builder_3.append(IConstants.LEQ);
          _builder_3.append(" ");
          _builder_3.append(sum);
          _builder_3.append(" ");
          _builder_3.append(IConstants.SEMICOLON);
          _builder_3.newLineIfNotEmpty();
          out = (_out_1 + _builder_3);
        }
        String _out_2 = out;
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(IConstants.CONS_DEF);
        _builder_4.append(" ");
        _builder_4.append(sum);
        _builder_4.append(" ");
        _builder_4.append(IConstants.LEQ);
        _builder_4.append(" ");
        _builder_4.append(max);
        _builder_4.append(" * ");
        String _name_4 = rel.getParent().getName();
        _builder_4.append(_name_4);
        _builder_4.append(" ");
        _builder_4.append(IConstants.SEMICOLON);
        _builder_4.newLineIfNotEmpty();
        out = (_out_2 + _builder_4);
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getImpliesPair(final ElmDeclaration left, final ElmDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IConstants.CONS_DEF);
    _builder.append(" ");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(" > 0 ");
    _builder.append(IConstants.IMPLIES_LR);
    _builder.append(" ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(" > 0 ");
    _builder.append(IConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getMutexPair(final ElmDeclaration left, final ElmDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IConstants.CONS_DEF);
    _builder.append(" ");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(" * ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(" ");
    _builder.append(IConstants.EQUIV);
    _builder.append(" 0 ");
    _builder.append(IConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence getDomain(final ElmDeclaration element) {
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
                  EList<Value> _values = ((Enumeration) _variants_1).getList().getValues();
                  for (final Value value : _values) {
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
              EList<Value> _values = ((Enumeration) _variants_1).getList().getValues();
              for (final Value value : _values) {
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
  public CharSequence getExpression(final Relational exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IConstants.CONS_DEF);
    _builder.append(" ");
    CharSequence _parse = this.expressionsParser.parse(exp, Dialect.ATT);
    _builder.append(_parse);
    _builder.append(" ");
    _builder.append(IConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * ++  Methods from AttributeFactory
   */
  @Override
  public CharSequence getDecompositionAtt(final ElmDeclaration parent, final ElmDeclaration attribute) {
    String _xblockexpression = null;
    {
      String out = "";
      String _out = out;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("% creating a variable for the attribute");
      _builder.newLine();
      _builder.append(IConstants.VAR_DEF);
      _builder.append(" ");
      CharSequence _domain = this.getDomain(attribute);
      _builder.append(_domain);
      _builder.append(" ");
      _builder.append(IConstants.COLON);
      _builder.append(" ");
      String _name = parent.getName();
      _builder.append(_name);
      _builder.append("_");
      String _name_1 = attribute.getName();
      _builder.append(_name_1);
      _builder.append(IConstants.SEMICOLON);
      _builder.newLineIfNotEmpty();
      out = (_out + _builder);
      String _out_1 = out;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("% declaring a constraint");
      _builder_1.newLine();
      _builder_1.append(IConstants.CONS_DEF);
      _builder_1.append(" ");
      String _name_2 = parent.getName();
      _builder_1.append(_name_2);
      _builder_1.append(" ");
      _builder_1.append(IConstants.GT);
      _builder_1.append(" 0 ");
      _builder_1.append(IConstants.IFF);
      _builder_1.append(" ");
      String _name_3 = parent.getName();
      _builder_1.append(_name_3);
      _builder_1.append("_");
      String _name_4 = attribute.getName();
      _builder_1.append(_name_4);
      _builder_1.append(" ");
      _builder_1.append(IConstants.GT);
      _builder_1.append(" 0 ");
      _builder_1.append(IConstants.SEMICOLON);
      _builder_1.newLineIfNotEmpty();
      out = (_out_1 + _builder_1);
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
}
