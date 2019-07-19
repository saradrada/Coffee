package com.coffee.generator.integerParser;

import com.coffee.generator.Dialect;
import com.coffee.generator.integerParser.AttributesTranformationRules;
import com.coffee.generator.integerParser.BasicIntegerParser;

@SuppressWarnings("all")
public class AttributesParser extends BasicIntegerParser {
  public AttributesParser(final String name) {
    super(name, Dialect.BASIC_BOOL);
    AttributesTranformationRules _attributesTranformationRules = new AttributesTranformationRules(Dialect.BASIC_BOOL);
    this.setTransformationRules(_attributesTranformationRules);
  }
}
