package com.coffee.generator.bools;

import com.coffee.generator.CodeFactory;
import com.coffee.generator.minizinc.IConstants;
import com.coffee.hlvl.ConstantDecl;
import com.coffee.hlvl.Core;
import com.coffee.hlvl.Declaration;
import com.coffee.hlvl.Decomposition;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Expression;
import com.coffee.hlvl.Group;
import com.coffee.hlvl.OptionsDeclaration;
import com.coffee.hlvl.VarList;
import com.coffee.hlvl.Visibility;
import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class BoolFactory extends CodeFactory implements IConstants {
  @Override
  public CharSequence getConstant(final ElmDeclaration element) {
    CharSequence _xblockexpression = null;
    {
      Declaration _declaration = element.getDeclaration();
      final int value = ((ConstantDecl) _declaration).getValue();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(IConstants.BOOL_DOMAIN);
      _builder.append(" ");
      _builder.append(IConstants.COLON);
      _builder.append(" ");
      String _name = element.getName();
      _builder.append(_name);
      _builder.append(" ");
      _builder.append(IConstants.ASSIGN);
      _builder.append(" ");
      _builder.append(value);
      _builder.append("  ");
      _builder.append(IConstants.SEMICOLON);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getElement(final ElmDeclaration element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IConstants.VAR_DEF);
    _builder.append(" ");
    _builder.append(IConstants.BOOL_DOMAIN);
    _builder.append(" ");
    _builder.append(IConstants.COLON);
    _builder.append(" ");
    String _name = element.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(IConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getValuesDeclaration(final ElmDeclaration variable, final OptionsDeclaration variant) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  @Override
  public CharSequence getCore(final Core core) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("inside getCore");
      String out = "";
      EList<ElmDeclaration> _values = core.getElements().getValues();
      for (final ElmDeclaration element : _values) {
        String _out = out;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(IConstants.CONS_DEF);
        _builder.append(" ");
        String _name = element.getName();
        _builder.append(_name);
        _builder.append(" ");
        _builder.append(IConstants.EQUIV);
        _builder.append(" ");
        _builder.append(IConstants.TRUE_ATOM);
        _builder.append(" ");
        _builder.append(IConstants.SEMICOLON);
        _builder.newLineIfNotEmpty();
        out = (_out + _builder);
      }
      InputOutput.<String>println(("getCore out " + out));
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getDecomposition(final Decomposition rel, final Map<String, ElmDeclaration> parents) {
    String _xblockexpression = null;
    {
      String out = "";
      EList<ElmDeclaration> _values = rel.getChildren().getValues();
      for (final ElmDeclaration element : _values) {
        {
          parents.put(rel.getParent().getName(), element);
          int _cardinality = rel.getCardinality();
          boolean _equals = (_cardinality == 1);
          if (_equals) {
            String _out = out;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append(IConstants.CONS_DEF);
            _builder.append(" ");
            String _name = rel.getParent().getName();
            _builder.append(_name);
            _builder.append(" ");
            _builder.append(IConstants.IFF);
            _builder.append(" ");
            String _name_1 = element.getName();
            _builder.append(_name_1);
            _builder.append(" ");
            _builder.append(IConstants.SEMICOLON);
            _builder.newLineIfNotEmpty();
            out = (_out + _builder);
          } else {
            String _out_1 = out;
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(IConstants.CONS_DEF);
            _builder_1.append(" ");
            String _name_2 = element.getName();
            _builder_1.append(_name_2);
            _builder_1.append(" ");
            _builder_1.append(IConstants.IMPLIES_LR);
            _builder_1.append(" ");
            String _name_3 = rel.getParent().getName();
            _builder_1.append(_name_3);
            _builder_1.append(" ");
            _builder_1.append(IConstants.SEMICOLON);
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
    if (((rel.getMin() == 1) && (rel.getMax().getValue() == 1))) {
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
          parents.put(rel.getParent().getName(), element);
          String _out = out;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(IConstants.CONS_DEF);
          _builder.append(" ");
          String _name = element.getName();
          _builder.append(_name);
          _builder.append(" ");
          _builder.append(IConstants.IFF);
          _builder.append(" ");
          _builder.append(IConstants.OPEN_CALL);
          out = (_out + _builder);
          EList<ElmDeclaration> _values_1 = rel.getChildren().getValues();
          for (final ElmDeclaration inElement : _values_1) {
            String _name_1 = element.getName();
            String _name_2 = inElement.getName();
            boolean _notEquals = (!Objects.equal(_name_1, _name_2));
            if (_notEquals) {
              String _out_1 = out;
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append(IConstants.NOT);
              _builder_1.append(IConstants.OPEN_CALL);
              String _name_3 = inElement.getName();
              _builder_1.append(_name_3);
              _builder_1.append(IConstants.CLOSE_CALL);
              _builder_1.append(" ");
              _builder_1.append(IConstants.AND);
              out = (_out_1 + _builder_1);
            }
          }
          String _out_2 = out;
          StringConcatenation _builder_2 = new StringConcatenation();
          String _name_4 = rel.getParent().getName();
          _builder_2.append(_name_4);
          _builder_2.append(IConstants.CLOSE_CALL);
          _builder_2.append(" ");
          _builder_2.append(IConstants.SEMICOLON);
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
      _builder.append(IConstants.CONS_DEF);
      _builder.append(" ");
      String _name = rel.getParent().getName();
      _builder.append(_name);
      _builder.append(" ");
      _builder.append(IConstants.IFF);
      _builder.append(" ");
      _builder.append(IConstants.OPEN_CALL);
      String out = _builder.toString();
      EList<ElmDeclaration> _values = rel.getChildren().getValues();
      for (final ElmDeclaration element : _values) {
        {
          parents.put(rel.getParent().getName(), element);
          String _out = out;
          StringConcatenation _builder_1 = new StringConcatenation();
          String _name_1 = element.getName();
          _builder_1.append(_name_1);
          _builder_1.append(" ");
          _builder_1.append(IConstants.OR);
          out = (_out + _builder_1);
        }
      }
      String _out = out;
      int _length = out.length();
      int _minus = (_length - 2);
      CharSequence _subSequence = out.subSequence(0, _minus);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(IConstants.CLOSE_CALL);
      _builder_1.append(" ");
      _builder_1.append(IConstants.SEMICOLON);
      _builder_1.newLineIfNotEmpty();
      String _plus = (_subSequence + _builder_1.toString());
      out = (_out + _plus);
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
    _builder.append(" ");
    _builder.append(IConstants.IMPLIES_LR);
    _builder.append(" ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(" ");
    _builder.append(IConstants.SEMICOLON);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getMutexPair(final ElmDeclaration left, final ElmDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(IConstants.CONS_DEF);
    _builder.append(" ");
    _builder.append(IConstants.NOT);
    _builder.append(" ");
    _builder.append(IConstants.OPEN_CALL);
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(IConstants.AND);
    _builder.append(" ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(IConstants.OPEN_CALL);
    _builder.append(IConstants.SEMICOLON);
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
  public CharSequence getExpression(final Expression rel) {
    return null;
  }
  
  @Override
  public CharSequence getVisibility(final Visibility rel) {
    return null;
  }
}
