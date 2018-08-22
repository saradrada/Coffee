package com.coffee.generator;

import com.coffee.pLEC.Structural;
import com.coffee.pLEC.VarDeclaration;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class CodeFactory {
  private final static String HEADER = "language header";
  
  private final static String VARIABLES = "language variable\'s separator";
  
  private final static String CONSTRAINTS = "language constraint\'s separator";
  
  private ArrayList<String> clonConstraints;
  
  public abstract CharSequence getHeader();
  
  public abstract CharSequence getVarLabel();
  
  public abstract CharSequence getConsLabel();
  
  /**
   * @return by default the strategy is the empty string
   */
  public CharSequence getStrategy() {
    return "";
  }
  
  public String getClonConstraints() {
    String _xblockexpression = null;
    {
      String out = "";
      if ((this.clonConstraints == null)) {
        out = "";
      } else {
        int id = 1;
        for (final String constraint : this.clonConstraints) {
          {
            String _out = out;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("cl");
            _builder.append(id);
            _builder.append(": ");
            String _string = constraint.toString();
            _builder.append(_string);
            out = (_out + _builder);
            id++;
          }
        }
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  public abstract CharSequence getVariable(final VarDeclaration variable);
  
  public abstract CharSequence getOptional(final VarDeclaration parent, final VarDeclaration child);
  
  public abstract CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child);
  
  public abstract CharSequence getExcludes(final VarDeclaration left, final VarDeclaration right);
  
  public abstract CharSequence getRequires(final VarDeclaration left, final VarDeclaration right);
  
  public abstract CharSequence getGroupCardinality(final Structural exp, final Map<String, VarDeclaration> parents);
}
