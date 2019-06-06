package com.coffee.generator;

import com.coffee.hlvl.Core;
import com.coffee.hlvl.Decomposition;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Group;
import com.coffee.hlvl.Relational;
import com.coffee.hlvl.VarList;
import com.coffee.hlvl.Visibility;
import java.util.List;
import java.util.Map;

/**
 * Interface to define the methods a codeFactory for the PLEC language
 * should implement, all Factories implement this interface
 * implemented by (THLCLFactory, XCSP3Factory, DIMASFactory)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public abstract class TransformationRules {
  public abstract CharSequence getConstant(final ElmDeclaration element);
  
  public abstract CharSequence getElement(final ElmDeclaration element);
  
  public abstract CharSequence getCore(final Core core);
  
  public abstract CharSequence getCoreSingle(final ElmDeclaration element);
  
  public abstract CharSequence getDecomposition(final Decomposition rel, final Map<String, ElmDeclaration> parents);
  
  public abstract CharSequence getGroup(final Group rel, final Map<String, ElmDeclaration> parents);
  
  public abstract CharSequence getImpliesPair(final ElmDeclaration left, final ElmDeclaration right);
  
  public abstract CharSequence getMutexPair(final ElmDeclaration left, final ElmDeclaration right);
  
  public abstract CharSequence getImpliesList(final VarList rel);
  
  public abstract CharSequence getMutexList(final VarList rel);
  
  public abstract CharSequence getExpression(final Relational rel);
  
  public abstract CharSequence getVisibility(final Visibility rel, final List<CharSequence> relations);
}
