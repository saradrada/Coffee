package com.coffee.hlvl.generator.boolParser;

import com.coffee.hlvl.generator.AbstractHLVLParser;
import com.coffee.hlvl.generator.Dialect;
import com.coffee.hlvl.generator.boolParser.BooleanRules;

@SuppressWarnings("all")
public class BoolParser extends AbstractHLVLParser {
  public BoolParser(final String name) {
    super(name, Dialect.BOOL);
    BooleanRules _booleanRules = new BooleanRules();
    this.setTransformationRules(_booleanRules);
  }
}
