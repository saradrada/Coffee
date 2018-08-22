package com.coffee.generator.XCSP3;

import com.coffee.generator.TypeOfProblem;
import com.coffee.generator.XCSP3.XCSP3Factory;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.VarDeclaration;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CSPFactory extends XCSP3Factory {
  public CSPFactory(final TypeOfProblem type) {
    super(type);
  }
  
  @Override
  public CharSequence getOptional(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ge(");
    String _name = parent.getName();
    _builder.append(_name);
    _builder.append(", ");
    String _name_1 = child.getName();
    _builder.append(_name_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eq(");
    String _name = parent.getName();
    _builder.append(_name);
    _builder.append(", ");
    String _name_1 = child.getName();
    _builder.append(_name_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getExcludes(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("le(add(");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(", ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append("), 1) ");
    return _builder;
  }
  
  @Override
  public CharSequence getRequires(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("imp(");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(",gt(");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(",1) )");
    return _builder;
  }
  
  @Override
  public CharSequence getGroupCardinality(final Structural exp, final Map<String, VarDeclaration> parents) {
    String _xblockexpression = null;
    {
      String idsSum = "add(";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("and(");
      _builder.newLine();
      String output = _builder.toString();
      EList<VarDeclaration> _ids = exp.getGroup().getIds();
      for (final VarDeclaration child : _ids) {
        {
          String _output = output;
          String _name = child.getName();
          String _plus = ("imp(" + _name);
          String _plus_1 = (_plus + ", ");
          String _name_1 = exp.getParent().getName();
          String _plus_2 = (_plus_1 + _name_1);
          String _plus_3 = (_plus_2 + "), \n");
          output = (_output + _plus_3);
          String _idsSum = idsSum;
          String _name_2 = child.getName();
          String _plus_4 = (_name_2 + ", ");
          idsSum = (_idsSum + _plus_4);
          parents.put(child.getName(), exp.getParent());
        }
      }
      String _output = output;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("imp(ge( ");
      String _name = exp.getParent().getName();
      _builder_1.append(_name);
      _builder_1.append(", 1), ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.append("ge(");
      int _length = idsSum.length();
      int _minus = (_length - 2);
      String _substring = idsSum.substring(0, _minus);
      _builder_1.append(_substring, "    ");
      _builder_1.append("), ");
      int _value = exp.getMin().getValue();
      _builder_1.append(_value, "    ");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.append("),");
      output = (_output + _builder_1);
      String _output_1 = output;
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("imp(ge(");
      String _name_1 = exp.getParent().getName();
      _builder_2.append(_name_1);
      _builder_2.append(", 1),");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("    ");
      _builder_2.append("ge(");
      int _length_1 = idsSum.length();
      int _minus_1 = (_length_1 - 2);
      String _substring_1 = idsSum.substring(0, _minus_1);
      _builder_2.append(_substring_1, "    ");
      _builder_2.append(", ");
      int _value_1 = exp.getMax().getValue();
      _builder_2.append(_value_1, "    ");
      _builder_2.append(")");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("    ");
      _builder_2.append(")");
      _builder_2.newLine();
      _builder_2.append(") ");
      output = (_output_1 + _builder_2);
      _xblockexpression = output;
    }
    return _xblockexpression;
  }
}
