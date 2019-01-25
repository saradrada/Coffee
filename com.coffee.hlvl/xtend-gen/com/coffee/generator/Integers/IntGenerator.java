package com.coffee.generator.Integers;

import com.coffee.generator.AbstractGenerator;
import com.coffee.generator.CodeFactory;
import com.coffee.generator.Dialect;
import com.coffee.generator.Integers.AttFactory;
import com.coffee.generator.Integers.InstFactory;

@SuppressWarnings("all")
public class IntGenerator extends AbstractGenerator {
  public IntGenerator(final String name, final Dialect dialect) {
    super(name, dialect);
    CodeFactory factory = null;
    if (dialect != null) {
      switch (dialect) {
        case INST:
          InstFactory _instFactory = new InstFactory();
          factory = _instFactory;
          break;
        default:
          AttFactory _attFactory = new AttFactory();
          factory = _attFactory;
          break;
      }
    } else {
      AttFactory _attFactory = new AttFactory();
      factory = _attFactory;
    }
    this.setFactory(factory);
  }
}
