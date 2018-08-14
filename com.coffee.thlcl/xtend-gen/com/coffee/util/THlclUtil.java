package com.coffee.util;

import com.coffee.tHLCL.Model;
import com.coffee.tHLCL.Variable;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;

/**
 * Class containing the methods for validation an typing of the CP-HLCL language
 * @author Angela Villota
 * @version CP-HLCL V2
 * May 2018
 */
@SuppressWarnings("all")
public class THlclUtil {
  /**
   * Method to determine if a variable is already defined
   */
  public static boolean variableIsDefinedBefore(final Variable e) {
    final EList<Variable> allVariables = EcoreUtil2.<Model>getContainerOfType(e, Model.class).getVariables();
    boolean found = false;
    for (final Variable element : allVariables) {
      String _name = element.getName();
      String _name_1 = e.getName();
      boolean _equals = Objects.equal(_name, _name_1);
      if (_equals) {
        found = true;
      }
    }
    return found;
  }
}
