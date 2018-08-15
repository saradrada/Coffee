package com.coffee.generator.THLCL;

import com.coffee.generator.CodeFactory;
import com.coffee.pLEC.VarDeclaration;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BooleanFactory extends CodeFactory {
  public final static String HEADER = "model";
  
  public final static String VARIABLES = "variables:";
  
  public final static String CONSTRAINTS = "constraints:";
  
  @Override
  public CharSequence getHeader() {
    return BooleanFactory.HEADER;
  }
  
  @Override
  public CharSequence getVarLabel() {
    return BooleanFactory.VARIABLES;
  }
  
  @Override
  public CharSequence getConsLabel() {
    return BooleanFactory.CONSTRAINTS;
  }
  
  @Override
  public CharSequence getOptional() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getMandatory() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getExcludes() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getIncludes() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getGroup() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getRule() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getVariable(final VarDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = variable.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
