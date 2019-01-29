package com.coffee.generator.XCSP3;

import com.coffee.generator.OptimizationFactory;
import com.coffee.generator.TypeOfProblem;
import com.coffee.generator.XCSP3.CSPFactory;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class COPFactory extends CSPFactory implements OptimizationFactory {
  public COPFactory(final TypeOfProblem type) {
    super(type);
  }
  
  @Override
  public CharSequence getStrategy() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  @Override
  public CharSequence optimizationConstraints() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getObjectives() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
