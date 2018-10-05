package com.coffee.generator.THLCL;

import com.coffee.generator.THLCL.IntegerFactory;
import com.coffee.generator.variabilityTree.Node;
import com.coffee.pLEC.VarDeclaration;
import java.util.Map;

@SuppressWarnings("all")
public class THLCLCardinalityFactory extends IntegerFactory {
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
}
