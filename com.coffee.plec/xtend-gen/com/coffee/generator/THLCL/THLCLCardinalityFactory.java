package com.coffee.generator.THLCL;

import com.coffee.generator.CardinalityFactory;
import com.coffee.generator.THLCL.IntegerFactory;
import com.coffee.generator.variabilityTree.Node;
import com.coffee.pLEC.Quantifiable;
import com.coffee.pLEC.VarDeclaration;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class THLCLCardinalityFactory extends IntegerFactory implements CardinalityFactory {
  private Map<String, Node> tree;
  
  public THLCLCardinalityFactory(final Map<String, Node> tree) {
    this.tree = tree;
  }
  
  @Override
  public CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child) {
    CharSequence _xifexpression = null;
    int _min = this.tree.get(child.getName()).getMin();
    boolean _greaterThan = (_min > 0);
    if (_greaterThan) {
      String _name = parent.getName();
      String _plus = (_name + " = ");
      String _name_1 = child.getName();
      return (_plus + _name_1);
    } else {
      _xifexpression = this.getOptional(parent, child);
    }
    return _xifexpression;
  }
  
  public CharSequence declareVaribleNumInstances(final Node node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("integer ");
    String _id = node.getId();
    _builder.append(_id);
    _builder.append("_card domain:");
    int _min = node.getMin();
    _builder.append(_min);
    _builder.append("..");
    int _numInstances = node.getNumInstances();
    _builder.append(_numInstances);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * declare the instances
   */
  public CharSequence declareInstance(final String instanceName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("boolean ");
    _builder.append(instanceName);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getQuantifiableRequires(final Quantifiable exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((");
    int _value = exp.getMinV1().getValue();
    _builder.append(_value);
    _builder.append(" <= ");
    String _name = exp.getVar1().getName();
    _builder.append(_name);
    _builder.append("_card) AND (");
    String _name_1 = exp.getVar1().getName();
    _builder.append(_name_1);
    _builder.append("_card <= ");
    int _value_1 = exp.getMaxV1().getValue();
    _builder.append(_value_1);
    _builder.append("))");
    _builder.newLineIfNotEmpty();
    _builder.append("=> ");
    _builder.newLine();
    _builder.append("((");
    int _value_2 = exp.getMinV2().getValue();
    _builder.append(_value_2);
    _builder.append(" <= ");
    String _name_2 = exp.getVar2().getName();
    _builder.append(_name_2);
    _builder.append("_card) AND (");
    String _name_3 = exp.getVar2().getName();
    _builder.append(_name_3);
    _builder.append("_card <= ");
    int _value_3 = exp.getMaxV2().getValue();
    _builder.append(_value_3);
    _builder.append("))");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
