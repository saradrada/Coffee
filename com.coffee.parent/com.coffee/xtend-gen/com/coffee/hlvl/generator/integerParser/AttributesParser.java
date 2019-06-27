package com.coffee.hlvl.generator.integerParser;

import com.coffee.hlvl.generator.AbstractHLVLParser;
import com.coffee.hlvl.generator.Dialect;
import com.coffee.hlvl.generator.integerParser.AttributesTranformationRules;

@SuppressWarnings("all")
public class AttributesParser extends AbstractHLVLParser {
  public AttributesParser(final String name) {
    super(name, Dialect.BOOL);
    AttributesTranformationRules _attributesTranformationRules = new AttributesTranformationRules();
    this.setTransformationRules(_attributesTranformationRules);
  }
}
