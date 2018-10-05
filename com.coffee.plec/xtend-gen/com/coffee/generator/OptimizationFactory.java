package com.coffee.generator;

@SuppressWarnings("all")
public interface OptimizationFactory {
  public abstract CharSequence getStrategy();
  
  public abstract CharSequence optimizationConstraints();
  
  public abstract CharSequence getObjectives();
}
