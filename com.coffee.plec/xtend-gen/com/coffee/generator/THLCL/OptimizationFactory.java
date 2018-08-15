package com.coffee.generator.THLCL;

import com.coffee.generator.THLCL.IntegerFactory;

@SuppressWarnings("all")
public class OptimizationFactory extends IntegerFactory {
  public final static String STRATEGY = "strategy:";
  
  @Override
  public CharSequence getStrategy() {
    return OptimizationFactory.STRATEGY;
  }
}
