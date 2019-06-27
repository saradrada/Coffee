package com.coffee.hlvl.generator.boolParser;

import com.coffee.hlvl.generator.TransformationRules;
import com.coffee.hlvl.generator.commons.IMiniZincConstants;
import com.coffee.hlvl.generator.expressionsParser.BooleanExpressionsParser;
import com.coffee.hlvl.hLVL.BoolVal;
import com.coffee.hlvl.hLVL.Common;
import com.coffee.hlvl.hLVL.ConstantDecl;
import com.coffee.hlvl.hLVL.Declaration;
import com.coffee.hlvl.hLVL.Decomposition;
import com.coffee.hlvl.hLVL.ElmDeclaration;
import com.coffee.hlvl.hLVL.Group;
import com.coffee.hlvl.hLVL.Relational;
import com.coffee.hlvl.hLVL.Value;
import com.coffee.hlvl.hLVL.VarList;
import com.coffee.hlvl.hLVL.Visibility;
import com.google.common.base.Objects;
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
 */
@SuppressWarnings("all")
public class BooleanRules extends TransformationRules implements IMiniZincConstants {
  /**
   * integer variable to produce the identifiers for the variables and constraints
   * in visibility relations
   */
  private int visibilityIdCounter;
  
  private BooleanExpressionsParser expressionsParser;
  
  public BooleanRules() {
    BooleanExpressionsParser _booleanExpressionsParser = new BooleanExpressionsParser();
    this.expressionsParser = _booleanExpressionsParser;
    this.visibilityIdCounter = 0;
  }
  
  @Override
  public CharSequence getConstant(final ElmDeclaration element) {
    CharSequence _xblockexpression = null;
    {
      Declaration _declaration = element.getDeclaration();
      final Value value = ((ConstantDecl) _declaration).getValue();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(IMiniZincConstants.BOOL_DOMAIN);
      _builder.append(" ");
      _builder.append(IMiniZincConstants.COLON);
      _builder.append(" ");
      String _name = element.getName();
      _builder.append(_name);
      _builder.append(" ");
      _builder.append(IMiniZincConstants.ASSIGN);
      _builder.append(" ");
      String _value = ((BoolVal) value).getValue();
      _builder.append(_value);
      _builder.append("  ");
      _builder.append(IMiniZincConstants.SEMICOLON);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getElement(final ElmDeclaration element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IMiniZincConstants.VAR_DEF);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.BOOL_DOMAIN);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.COLON);
    _builder.append(" ");
    String _name = element.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getCore(final Common core) {
    String _xblockexpression = null;
    {
      String out = "";
      EList<ElmDeclaration> _values = core.getElements().getValues();
      for (final ElmDeclaration element : _values) {
        String _out = out;
        CharSequence _coreSingle = this.getCoreSingle(element);
        out = (_out + _coreSingle);
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
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
    _builder.append(IMiniZincConstants.TRUE_ATOM);
    _builder.append(" ");
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
          int _cardinality = rel.getCardinality();
          boolean _equals = (_cardinality == 1);
          if (_equals) {
            String _out = out;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append(IMiniZincConstants.CONS_DEF);
            _builder.append(" ");
            String _name = rel.getParent().getName();
            _builder.append(_name);
            _builder.append(" ");
            _builder.append(IMiniZincConstants.IFF);
            _builder.append(" ");
            String _name_1 = element.getName();
            _builder.append(_name_1);
            _builder.append(" ");
            _builder.append(IMiniZincConstants.SEMICOLON);
            _builder.newLineIfNotEmpty();
            out = (_out + _builder);
          } else {
            String _out_1 = out;
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(IMiniZincConstants.CONS_DEF);
            _builder_1.append(" ");
            String _name_2 = element.getName();
            _builder_1.append(_name_2);
            _builder_1.append(" ");
            _builder_1.append(IMiniZincConstants.IMPLIES_LR);
            _builder_1.append(" ");
            String _name_3 = rel.getParent().getName();
            _builder_1.append(_name_3);
            _builder_1.append(" ");
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
    String _xifexpression = null;
    if (((rel.getMin() == 1) && Objects.equal(rel.getMax().getValue(), Integer.valueOf(1)))) {
      _xifexpression = this.getXor(rel, parents);
    } else {
      _xifexpression = this.getOR(rel, parents);
    }
    return _xifexpression;
  }
  
  public String getXor(final Group rel, final Map<String, ElmDeclaration> parents) {
    String _xblockexpression = null;
    {
      String out = "";
      EList<ElmDeclaration> _values = rel.getChildren().getValues();
      for (final ElmDeclaration element : _values) {
        {
          parents.put(element.getName(), rel.getParent());
          String _out = out;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(IMiniZincConstants.CONS_DEF);
          _builder.append(" ");
          String _name = element.getName();
          _builder.append(_name);
          _builder.append(" ");
          _builder.append(IMiniZincConstants.IFF);
          _builder.append(" ");
          _builder.append(IMiniZincConstants.OPEN_CALL);
          out = (_out + _builder);
          EList<ElmDeclaration> _values_1 = rel.getChildren().getValues();
          for (final ElmDeclaration inElement : _values_1) {
            String _name_1 = element.getName();
            String _name_2 = inElement.getName();
            boolean _notEquals = (!Objects.equal(_name_1, _name_2));
            if (_notEquals) {
              String _out_1 = out;
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append(IMiniZincConstants.NOT);
              _builder_1.append(IMiniZincConstants.OPEN_CALL);
              String _name_3 = inElement.getName();
              _builder_1.append(_name_3);
              _builder_1.append(IMiniZincConstants.CLOSE_CALL);
              _builder_1.append(" ");
              _builder_1.append(IMiniZincConstants.AND);
              _builder_1.append(" ");
              out = (_out_1 + _builder_1);
            }
          }
          String _out_2 = out;
          StringConcatenation _builder_2 = new StringConcatenation();
          String _name_4 = rel.getParent().getName();
          _builder_2.append(_name_4);
          _builder_2.append(IMiniZincConstants.CLOSE_CALL);
          _builder_2.append(" ");
          _builder_2.append(IMiniZincConstants.SEMICOLON);
          _builder_2.newLineIfNotEmpty();
          out = (_out_2 + _builder_2);
        }
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  public String getOR(final Group rel, final Map<String, ElmDeclaration> parents) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(IMiniZincConstants.CONS_DEF);
      _builder.append(" ");
      String _name = rel.getParent().getName();
      _builder.append(_name);
      _builder.append(" ");
      _builder.append(IMiniZincConstants.IFF);
      _builder.append(" ");
      _builder.append(IMiniZincConstants.OPEN_CALL);
      String out = _builder.toString();
      EList<ElmDeclaration> _values = rel.getChildren().getValues();
      for (final ElmDeclaration element : _values) {
        {
          parents.put(element.getName(), rel.getParent());
          String _out = out;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(" ");
          String _name_1 = element.getName();
          _builder_1.append(_name_1, " ");
          _builder_1.append(" ");
          _builder_1.append(IMiniZincConstants.OR, " ");
          out = (_out + _builder_1);
        }
      }
      int _length = out.length();
      int _minus = (_length - 2);
      CharSequence _subSequence = out.subSequence(0, _minus);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(IMiniZincConstants.CLOSE_CALL);
      _builder_1.append(" ");
      _builder_1.append(IMiniZincConstants.SEMICOLON);
      _builder_1.newLineIfNotEmpty();
      String _plus = (_subSequence + _builder_1.toString());
      out = _plus;
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
    _builder.append(IMiniZincConstants.IMPLIES_LR);
    _builder.append(" ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getMutexPair(final ElmDeclaration left, final ElmDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IMiniZincConstants.CONS_DEF);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.NOT);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.OPEN_CALL);
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(IMiniZincConstants.AND);
    _builder.append(" ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(IMiniZincConstants.CLOSE_CALL);
    _builder.append(IMiniZincConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getImpliesList(final VarList rel) {
    String _xblockexpression = null;
    {
      String out = "";
      EList<ElmDeclaration> _values = rel.getList().getValues();
      for (final ElmDeclaration element : _values) {
        String _out = out;
        CharSequence _impliesPair = this.getImpliesPair(rel.getVar1(), element);
        out = (_out + _impliesPair);
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getMutexList(final VarList rel) {
    String _xblockexpression = null;
    {
      String out = "";
      EList<ElmDeclaration> _values = rel.getList().getValues();
      for (final ElmDeclaration element : _values) {
        String _out = out;
        CharSequence _mutexPair = this.getMutexPair(rel.getVar1(), element);
        out = (_out + _mutexPair);
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getExpression(final Relational exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IMiniZincConstants.CONS_DEF);
    _builder.append(" ");
    CharSequence _parse = this.expressionsParser.parse(exp);
    _builder.append(_parse);
    _builder.append(" ");
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
