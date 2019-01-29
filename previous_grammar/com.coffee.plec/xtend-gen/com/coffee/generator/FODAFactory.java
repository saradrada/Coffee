package com.coffee.generator;

import com.coffee.pLEC.RootRefinement;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.VarDeclaration;
import java.util.Map;

/**
 * Interface to define the methods a codeFactory supporting the FODA constraints
 * should include
 * should implement, all Factories implement this interface
 * implemented by (DIMASFactory)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public interface FODAFactory {
  public abstract CharSequence getOptional(final VarDeclaration parent, final VarDeclaration child);
  
  public abstract CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child);
  
  public abstract CharSequence getExcludes(final VarDeclaration left, final VarDeclaration right);
  
  public abstract CharSequence getRequires(final VarDeclaration left, final VarDeclaration right);
  
  public abstract CharSequence getGroupCardinality(final Structural exp, final Map<String, VarDeclaration> parents);
  
  public abstract CharSequence getRootConstraint(final RootRefinement exp);
}
