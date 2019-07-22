package com.coffee.generator.integerParser;

import com.coffee.generator.Dialect;
import com.coffee.generator.integerParser.BasicIntegerParser;
import com.coffee.generator.integerParser.BasicIntegerRules;

@SuppressWarnings("all")
public class AttributesParser extends BasicIntegerParser {
  public AttributesParser(final String name, final Dialect dialect) {
    super(name, dialect);
    BasicIntegerRules _basicIntegerRules = new BasicIntegerRules(dialect);
    this.setTransformationRules(_basicIntegerRules);
  }
}
