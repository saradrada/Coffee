package com.coffee.generator;

import com.coffee.generator.Dialect;
import com.coffee.generator.TransformationRules;
import com.coffee.hlvl.Decomposition;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Model;
import com.coffee.hlvl.Relation;
import java.util.Map;

/**
 * Interface to define the methods a code generator for the PLEC language
 * should implement, all generators implementation implement this interface
 * implemented by (THLCLGenerator, XCSP3Generator)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public interface IGenerator {
  public abstract CharSequence parseModel(final Model model);
  
  public abstract CharSequence parseElements(final Model model);
  
  public abstract CharSequence parseRelations(final Model model);
  
  public abstract CharSequence parseRelation(final Relation exp);
  
  public abstract String getModelName();
  
  public abstract Dialect getDialect();
  
  public abstract void addParents(final Decomposition exp);
  
  public abstract Map<String, ElmDeclaration> getParents();
  
  public abstract void setFactory(final TransformationRules factory);
  
  public abstract String getOperations(final long time);
}
