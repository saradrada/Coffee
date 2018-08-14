package com.coffee.typing;

import com.coffee.tHLCL.And;
import com.coffee.tHLCL.BoolConstant;
import com.coffee.tHLCL.Comparison;
import com.coffee.tHLCL.Equality;
import com.coffee.tHLCL.Expression;
import com.coffee.tHLCL.Function;
import com.coffee.tHLCL.Global;
import com.coffee.tHLCL.Iff;
import com.coffee.tHLCL.Implies;
import com.coffee.tHLCL.IntConstant;
import com.coffee.tHLCL.Minus;
import com.coffee.tHLCL.MulOrDiv;
import com.coffee.tHLCL.Negation;
import com.coffee.tHLCL.Or;
import com.coffee.tHLCL.Plus;
import com.coffee.tHLCL.Unary;
import com.coffee.tHLCL.Variable;
import com.coffee.tHLCL.VariableRef;
import com.coffee.typing.BoolType;
import com.coffee.typing.ExpressionsType;
import com.coffee.typing.IntType;
import com.coffee.typing.SymbolicType;
import com.coffee.util.THlclUtil;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

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
    if (((varRef.getVariable() == null) || (!THlclUtil.variableIsDefinedBefore(varRef.getVariable())))) {
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
