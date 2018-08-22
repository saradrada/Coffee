package com.coffee.generator.XCSP3;

import com.coffee.generator.CodeFactory;
import com.coffee.generator.TypeOfProblem;
import com.coffee.pLEC.Value;
import com.coffee.pLEC.VarDeclaration;
import com.coffee.pLEC.VariantDeclaration;
import com.coffee.pLEC.VariantsEnumeration;
import com.coffee.pLEC.VariantsInterval;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public abstract class XCSP3Factory extends CodeFactory {
  private final String HEADER = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<instance format=\"XCSP3\" type=");
      return _builder.toString();
    }
  }.apply();
  
  private final static String VARIABLES_OPEN = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<variables>");
      return _builder.toString();
    }
  }.apply();
  
  private final static String VARIABLES_CLOSE = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("</variables>");
      return _builder.toString();
    }
  }.apply();
  
  private final static String CONSTRAINTS_OPEN = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<constraints>");
      return _builder.toString();
    }
  }.apply();
  
  private final static String CONSTRAINTS_CLOSE = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("</constraints>");
      return _builder.toString();
    }
  }.apply();
  
  private final static String FOOTER = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("</instance>");
      return _builder.toString();
    }
  }.apply();
  
  public TypeOfProblem frameworkType;
  
  public XCSP3Factory(final TypeOfProblem type) {
    this.frameworkType = type;
  }
  
  @Override
  public CharSequence getHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    _builder.append(this.frameworkType);
    _builder.append("\">");
    return (this.HEADER + _builder);
  }
  
  @Override
  public CharSequence getVarLabel() {
    return XCSP3Factory.VARIABLES_OPEN;
  }
  
  @Override
  public CharSequence getConsLabel() {
    return XCSP3Factory.CONSTRAINTS_OPEN;
  }
  
  public String getConsLabelClose() {
    return XCSP3Factory.CONSTRAINTS_CLOSE;
  }
  
  public String getVarLabelClose() {
    return XCSP3Factory.VARIABLES_CLOSE;
  }
  
  public String getFooter() {
    return XCSP3Factory.FOOTER;
  }
  
  @Override
  public CharSequence getVariable(final VarDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<var id=\"");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append("\">");
    CharSequence _valuesDeclaration = this.valuesDeclaration(variable, variable.getVariants());
    _builder.append(_valuesDeclaration);
    _builder.append("</var>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence valuesDeclaration(final VarDeclaration variable, final VariantDeclaration variant) {
    CharSequence _xifexpression = null;
    String _type = variable.getType();
    boolean _equals = Objects.equal(_type, "boolean");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("0 1");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      if ((variant instanceof VariantsInterval)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        int _value = ((VariantsInterval)variant).getStart().getValue();
        _builder_1.append(_value);
        _builder_1.append("..");
        int _value_1 = ((VariantsInterval)variant).getEnd().getValue();
        _builder_1.append(_value_1);
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        if ((variant instanceof VariantsEnumeration)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          String _list = this.getList(((VariantsEnumeration)variant).getList().getValues());
          _builder_2.append(_list);
          _xifexpression_2 = _builder_2;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String getList(final EList<Value> l) {
    String out = "";
    for (int i = 0; (i < l.size()); i = (i + 1)) {
      String _out = out;
      Value _get = l.get(i);
      int _value = ((com.coffee.pLEC.Number) _get).getValue();
      out = (_out + Integer.valueOf(_value));
    }
    return out;
  }
}
