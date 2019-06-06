package com.coffee.generator.rules.mult;

import com.coffee.generator.AbstractGenerator;
import com.coffee.generator.Dialect;
import com.coffee.generator.TransformationRules;
import com.coffee.generator.rules.mult.MultFactory;

@SuppressWarnings("all")
public class MultGenerator extends AbstractGenerator {
  public MultGenerator(final String name, final Dialect dialect) {
    super(name, dialect);
    final TransformationRules factory = new MultFactory();
    this.setFactory(factory);
  }
}
