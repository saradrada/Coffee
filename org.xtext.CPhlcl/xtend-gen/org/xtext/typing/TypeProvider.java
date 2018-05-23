package org.xtext.typing;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.xtext.cPHLCL.And;
import org.xtext.cPHLCL.BoolConstant;
import org.xtext.cPHLCL.Comparison;
import org.xtext.cPHLCL.Equality;
import org.xtext.cPHLCL.Expression;
import org.xtext.cPHLCL.Function;
import org.xtext.cPHLCL.Global;
import org.xtext.cPHLCL.Iff;
import org.xtext.cPHLCL.Implies;
import org.xtext.cPHLCL.IntConstant;
import org.xtext.cPHLCL.Minus;
import org.xtext.cPHLCL.MulOrDiv;
import org.xtext.cPHLCL.Negation;
import org.xtext.cPHLCL.Or;
import org.xtext.cPHLCL.Plus;
import org.xtext.cPHLCL.Unary;
import org.xtext.cPHLCL.Variable;
import org.xtext.cPHLCL.VariableRef;
import org.xtext.typing.BoolType;
import org.xtext.typing.ExpressionsType;
import org.xtext.typing.IntType;
import org.xtext.typing.SymbolicType;
import org.xtext.util.CPHlclUtil;

/**
 * Class containing the methods for determine the type of  and expression in the CP-HLCL language
 * @author Angela Villota
 * @version CP-HLCL V2
 * May 2018
 */
@SuppressWarnings("all")
public class TypeProvider {
  public final static SymbolicType symType = new SymbolicType();
  
  public final static IntType intType = new IntType();
  
  public final static BoolType boolType = new BoolType();
  
  /**
   * Method to determine the type of an expression
   */
  protected ExpressionsType _typeFor(final Expression e) {
    ExpressionsType _switchResult = null;
    boolean _matched = false;
    if (e instanceof IntConstant) {
      _matched=true;
      _switchResult = TypeProvider.intType;
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = TypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Function) {
        _matched=true;
        _switchResult = TypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof Unary) {
        _matched=true;
        _switchResult = TypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        _switchResult = TypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        _matched=true;
        _switchResult = TypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        _switchResult = TypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        _switchResult = TypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = TypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        _switchResult = TypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Implies) {
        _matched=true;
        _switchResult = TypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Iff) {
        _matched=true;
        _switchResult = TypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Global) {
        _matched=true;
        _switchResult = TypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Negation) {
        _matched=true;
        _switchResult = TypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        _switchResult = TypeProvider.boolType;
      }
    }
    return _switchResult;
  }
  
  /**
   * Method to define the type of a variable, the type is the one assigned in the declaration
   */
  protected ExpressionsType _typeFor(final Variable variable) {
    String _type = variable.getType();
    boolean _equals = Objects.equal(_type, "boolean");
    if (_equals) {
      return TypeProvider.boolType;
    } else {
      String _type_1 = variable.getType();
      boolean _equals_1 = Objects.equal(_type_1, "integer");
      if (_equals_1) {
        return TypeProvider.intType;
      } else {
        String _type_2 = variable.getType();
        boolean _equals_2 = Objects.equal(_type_2, "symbolic");
        if (_equals_2) {
          return TypeProvider.symType;
        }
      }
    }
    return null;
  }
  
  /**
   * Method to determine the type of a reference to a variable
   * first is checked that the reference is correct (the variable exists previously), then
   * the method returns the type of the variable
   */
  protected ExpressionsType _typeFor(final VariableRef varRef) {
    if (((varRef.getVariable() == null) || (!CPHlclUtil.variableIsDefinedBefore(varRef.getVariable())))) {
      return null;
    } else {
      return this.typeFor(varRef.getVariable());
    }
  }
  
  public ExpressionsType typeFor(final EObject varRef) {
    if (varRef instanceof VariableRef) {
      return _typeFor((VariableRef)varRef);
    } else if (varRef instanceof Expression) {
      return _typeFor((Expression)varRef);
    } else if (varRef instanceof Variable) {
      return _typeFor((Variable)varRef);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(varRef).toString());
    }
  }
}
