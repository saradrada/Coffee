package com.coffee.generator.integerParser;

import com.coffee.generator.AbstractHLVLParser;
import com.coffee.generator.Dialect;
import com.coffee.generator.integerParser.AttributesTranformationRules;

@SuppressWarnings("all")
public class AttributesParser extends AbstractHLVLParser {
  public AttributesParser(final String name) {
    super(name, Dialect.BASIC);
    AttributesTranformationRules _attributesTranformationRules = new AttributesTranformationRules();
    this.setTransformationRules(_attributesTranformationRules);
  }
}
