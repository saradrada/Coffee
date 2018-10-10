package com.coffee.generator.XCSP3;

import com.coffee.generator.CardinalityFactory;
import com.coffee.generator.TypeOfProblem;
import com.coffee.generator.XCSP3.CSPFactory;
import com.coffee.generator.variabilityTree.Node;
import com.coffee.pLEC.Quantifiable;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XCSP3CardinalityFactory extends CSPFactory implements CardinalityFactory {
  private Map<String, Node> tree;
  
  public XCSP3CardinalityFactory(final TypeOfProblem type, final Map<String, Node> tree) {
    super(type);
    this.tree = tree;
  }
  
  /**
   * declare the instances
   */
  public CharSequence declareInstance(final String instanceName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<var id=\"");
    _builder.append(instanceName);
    _builder.append("\"> 0 1 </var>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence declareVaribleNumInstances(final Node node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<var id=\"");
    String _id = node.getId();
    _builder.append(_id);
    _builder.append("_card\"> ");
    int _min = node.getMin();
    _builder.append(_min);
    _builder.append("..");
    int _numInstances = node.getNumInstances();
    _builder.append(_numInstances);
    _builder.append("</var>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getQuantifiableRequires(final Quantifiable exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("imp(");
    _builder.newLine();
    _builder.append("and(lq(");
    int _value = exp.getMinV1().getValue();
    _builder.append(_value);
    _builder.append(",");
    String _name = exp.getVar1().getName();
    _builder.append(_name);
    _builder.append("_card), lq(");
    String _name_1 = exp.getVar1().getName();
    _builder.append(_name_1);
    _builder.append("_card, ");
    int _value_1 = exp.getMaxV1().getValue();
    _builder.append(_value_1);
    _builder.append(")), ");
    _builder.newLineIfNotEmpty();
    _builder.append("and(lq(");
    int _value_2 = exp.getMinV2().getValue();
    _builder.append(_value_2);
    _builder.append(",");
    String _name_2 = exp.getVar2().getName();
    _builder.append(_name_2);
    _builder.append("_card), lq(");
    String _name_3 = exp.getVar2().getName();
    _builder.append(_name_3);
    _builder.append("_card, ");
    int _value_3 = exp.getMaxV2().getValue();
    _builder.append(_value_3);
    _builder.append(")))");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
