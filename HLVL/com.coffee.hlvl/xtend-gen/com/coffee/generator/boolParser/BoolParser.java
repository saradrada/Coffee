package com.coffee.generator.boolParser;

import com.coffee.generator.AbstractHLVLParser;
import com.coffee.generator.Dialect;
import com.coffee.generator.boolParser.BooleanRules;

@SuppressWarnings("all")
public class BoolParser extends AbstractHLVLParser {
  public BoolParser(final String name, final Dialect dialect) {
    super(name, dialect);
    BooleanRules _booleanRules = new BooleanRules(dialect);
    this.setTransformationRules(_booleanRules);
  }
}
