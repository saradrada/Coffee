package com.coffee.generator.THLCL;

import com.coffee.generator.CodeFactory;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.VarDeclaration;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
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
  public CharSequence getOptional(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = child.getName();
    _builder.append(_name);
    _builder.append(" => ");
    String _name_1 = parent.getName();
    _builder.append(_name_1);
    return _builder;
  }
  
  @Override
  public CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = parent.getName();
    _builder.append(_name);
    _builder.append(" <=> ");
    String _name_1 = child.getName();
    _builder.append(_name_1);
    return _builder;
  }
  
  @Override
  public CharSequence getExcludes(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("NOT (");
    String _name = left.getName();
    _builder.append(_name, " ");
    _builder.append(" AND ");
    String _name_1 = right.getName();
    _builder.append(_name_1, " ");
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getRequires(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(" => ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    return _builder;
  }
  
  @Override
  public CharSequence getGroupCardinality(final Structural exp, final Map<String, VarDeclaration> parents) {
    String _xblockexpression = null;
    {
      String idsSum = "";
      String output = "";
      EList<VarDeclaration> _ids = exp.getGroup().getIds();
      for (final VarDeclaration child : _ids) {
        {
          String _output = output;
          String _name = child.getName();
          String _plus = ("(" + _name);
          String _plus_1 = (_plus + " => ");
          VarDeclaration _parent = exp.getParent();
          String _plus_2 = (_plus_1 + _parent);
          String _plus_3 = (_plus_2 + ") AND \n");
          output = (_output + _plus_3);
          String _idsSum = idsSum;
          String _name_1 = child.getName();
          String _plus_4 = (_name_1 + " + ");
          idsSum = (_idsSum + _plus_4);
          parents.put(child.getName(), exp.getParent());
        }
      }
      String _output = output;
      VarDeclaration _parent = exp.getParent();
      String _plus = ("(" + _parent);
      String _plus_1 = (_plus + " >= 1) => (");
      int _length = idsSum.length();
      int _minus = (_length - 2);
      String _substring = idsSum.substring(0, _minus);
      String _plus_2 = (_plus_1 + _substring);
      String _plus_3 = (_plus_2 + ">= ");
      int _value = exp.getMin().getValue();
      String _plus_4 = (_plus_3 + Integer.valueOf(_value));
      String _plus_5 = (_plus_4 + ") AND \n");
      output = (_output + _plus_5);
      String _output_1 = output;
      VarDeclaration _parent_1 = exp.getParent();
      String _plus_6 = ("(" + _parent_1);
      String _plus_7 = (_plus_6 + " >= 1) => (");
      int _length_1 = idsSum.length();
      int _minus_1 = (_length_1 - 2);
      String _substring_1 = idsSum.substring(0, _minus_1);
      String _plus_8 = (_plus_7 + _substring_1);
      String _plus_9 = (_plus_8 + "<= ");
      int _value_1 = exp.getMax().getValue();
      String _plus_10 = (_plus_9 + Integer.valueOf(_value_1));
      String _plus_11 = (_plus_10 + ")");
      output = (_output_1 + _plus_11);
      _xblockexpression = output;
    }
    return _xblockexpression;
  }
  
  /**
   * All variables are boolean variables, there is no need to declare variants
   */
  @Override
  public CharSequence getVariable(final VarDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = variable.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
