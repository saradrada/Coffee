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
      String implies = "";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("and(");
      String output = _builder.toString();
      EList<VarDeclaration> _ids = exp.getGroup().getIds();
      for (final VarDeclaration child : _ids) {
        {
          String _implies = implies;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("imp(");
          String _name = child.getName();
          _builder_1.append(_name);
          _builder_1.append(", ");
          String _name_1 = exp.getParent().getName();
          _builder_1.append(_name_1);
          _builder_1.append("),");
          implies = (_implies + _builder_1);
          String _idsSum = idsSum;
          String _name_2 = child.getName();
          String _plus = (_name_2 + ", ");
          idsSum = (_idsSum + _plus);
          parents.put(child.getName(), exp.getParent());
        }
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("le(");
      int _length = idsSum.length();
      int _minus = (_length - 2);
      String _substring = idsSum.substring(0, _minus);
      _builder_1.append(_substring);
      _builder_1.append("), ");
      int _value = exp.getMin().getValue();
      _builder_1.append(_value);
      _builder_1.append(")");
      final String sumLessThan = _builder_1.toString();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("ge(");
      int _length_1 = idsSum.length();
      int _minus_1 = (_length_1 - 2);
      String _substring_1 = idsSum.substring(0, _minus_1);
      _builder_2.append(_substring_1);
      _builder_2.append("), ");
      int _value_1 = exp.getMax().getValue();
      _builder_2.append(_value_1);
      _builder_2.append(")");
      final String sumGreaterThan = _builder_2.toString();
      String _output = output;
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(implies);
      _builder_3.append(" imp(ge(");
      String _name = exp.getParent().getName();
      _builder_3.append(_name);
      _builder_3.append(", 1), and(");
      _builder_3.append(sumLessThan);
      _builder_3.append(", ");
      _builder_3.append(sumGreaterThan);
      _builder_3.append(")) )");
      _xblockexpression = output = (_output + _builder_3);
    }
    return _xblockexpression;
  }
}
