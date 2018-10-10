package com.coffee.generator.XCSP3;

import com.coffee.generator.TypeOfProblem;
import com.coffee.generator.XCSP3.XCSP3Factory;
import com.coffee.pLEC.Assignment;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.Refinement;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.VarDeclaration;
import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@Deprecated
@SuppressWarnings("all")
public class SATFactory extends XCSP3Factory {
  public SATFactory(final TypeOfProblem type) {
    super(type);
  }
  
  @Override
  public CharSequence getOptional(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("or(not(");
    String _name = child.getName();
    _builder.append(_name);
    _builder.append("), ");
    String _name_1 = parent.getName();
    _builder.append(_name_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("and(or(");
    String _name = parent.getName();
    _builder.append(_name);
    _builder.append(", not(");
    String _name_1 = child.getName();
    _builder.append(_name_1);
    _builder.append(")), or(not(");
    String _name_2 = parent.getName();
    _builder.append(_name_2);
    _builder.append(",");
    String _name_3 = child.getName();
    _builder.append(_name_3);
    _builder.append(")))");
    return _builder;
  }
  
  @Override
  public CharSequence getExcludes(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("or(not(");
    String _name = left.getName();
    _builder.append(_name, " ");
    _builder.append("), not(");
    String _name_1 = right.getName();
    _builder.append(_name_1, " ");
    _builder.append("))");
    return _builder;
  }
  
  @Override
  public CharSequence getRequires(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("or(not(");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append("), ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getGroupCardinality(final Structural exp, final Map<String, VarDeclaration> parents) {
    String _xblockexpression = null;
    {
      String output = "";
      if (((exp.getMin().getValue() == 1) && (exp.getMax().getValue() == 1))) {
        EList<VarDeclaration> _ids = exp.getGroup().getIds();
        for (final VarDeclaration child : _ids) {
          {
            parents.put(child.getName(), exp.getParent());
            String childrenIds = "";
            EList<VarDeclaration> _ids_1 = exp.getGroup().getIds();
            for (final VarDeclaration inChild : _ids_1) {
              String _name = child.getName();
              String _name_1 = inChild.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              boolean _not = (!_equals);
              if (_not) {
                String _childrenIds = childrenIds;
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("not(");
                String _name_2 = inChild.getName();
                _builder.append(_name_2);
                _builder.append(")");
                childrenIds = (_childrenIds + _builder);
              }
            }
            String _output = output;
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("imp(");
            String _name_3 = child.getName();
            _builder_1.append(_name_3);
            _builder_1.append(", and(");
            _builder_1.append(childrenIds);
            _builder_1.append(", ");
            String _name_4 = exp.getParent().getName();
            _builder_1.append(_name_4);
            _builder_1.append(")), ");
            output = (_output + _builder_1);
          }
        }
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("and(");
        int _length = output.length();
        int _minus = (_length - 1);
        String _substring = output.substring(0, _minus);
        _builder.append(_substring);
        _builder.append(")");
        output = _builder.toString();
      } else {
        if (((exp.getMin().getValue() == 0) && (exp.getMax().getValue() == 1))) {
          String childrenIds = "";
          EList<VarDeclaration> _ids_1 = exp.getGroup().getIds();
          for (final VarDeclaration child_1 : _ids_1) {
            {
              String _childrenIds = childrenIds;
              String _name = child_1.getName();
              String _plus = (_name + ", ");
              childrenIds = (_childrenIds + _plus);
              parents.put(child_1.getName(), exp.getParent());
            }
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("imp(");
          String _name = exp.getParent().getName();
          _builder_1.append(_name);
          _builder_1.append(", and(");
          int _length_1 = childrenIds.length();
          int _minus_1 = (_length_1 - 2);
          String _substring_1 = childrenIds.substring(0, _minus_1);
          _builder_1.append(_substring_1);
          _builder_1.append(" ))");
          output = _builder_1.toString();
        } else {
          if (((exp.getMin().getValue() == 0) && (exp.getMax().getValue() > 1))) {
            String childrenIds_1 = "";
            EList<VarDeclaration> _ids_2 = exp.getGroup().getIds();
            for (final VarDeclaration child_2 : _ids_2) {
              {
                String _childrenIds = childrenIds_1;
                String _name_1 = child_2.getName();
                String _plus = (_name_1 + ", ");
                childrenIds_1 = (_childrenIds + _plus);
                parents.put(child_2.getName(), exp.getParent());
              }
            }
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("imp(");
            String _name_1 = exp.getParent().getName();
            _builder_2.append(_name_1);
            _builder_2.append(", or(");
            int _length_2 = childrenIds_1.length();
            int _minus_2 = (_length_2 - 2);
            String _substring_2 = childrenIds_1.substring(0, _minus_2);
            _builder_2.append(_substring_2);
            _builder_2.append("))");
            output = _builder_2.toString();
          }
        }
      }
      _xblockexpression = output;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getStrategy() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence optimizationConstraints() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getObjectives() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getAttributes(final Attributes exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getRule(final CharSequence left, final CharSequence right) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getRefinement(final Refinement exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getAssignement(final Assignment exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
