package com.coffee.generator.common;

import com.coffee.hlvl.And;
import com.coffee.hlvl.AttributeRef;
import com.coffee.hlvl.BoolConstant;
import com.coffee.hlvl.Comparison;
import com.coffee.hlvl.Equality;
import com.coffee.hlvl.Function;
import com.coffee.hlvl.Iff;
import com.coffee.hlvl.Implies;
import com.coffee.hlvl.IntConstant;
import com.coffee.hlvl.Minus;
import com.coffee.hlvl.MulOrDiv;
import com.coffee.hlvl.Negation;
import com.coffee.hlvl.Or;
import com.coffee.hlvl.Plus;
import com.coffee.hlvl.Relational;
import com.coffee.hlvl.Unary;
import com.coffee.hlvl.VariableRef;
import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ExpressionsParser {
  public static CharSequence parse(final Relational exp) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (exp instanceof BoolConstant) {
      _matched=true;
      _switchResult = ((BoolConstant)exp).getValue();
    }
    if (!_matched) {
      if (exp instanceof IntConstant) {
        _matched=true;
        _switchResult = Integer.valueOf(((IntConstant)exp).getValue()).toString();
      }
    }
    if (!_matched) {
      if (exp instanceof VariableRef) {
        _matched=true;
        _switchResult = ((VariableRef)exp).getVariable().getName();
      }
    }
    if (!_matched) {
      if (exp instanceof AttributeRef) {
        _matched=true;
        _switchResult = ((AttributeRef)exp).getAttribute().replace(".", "_");
      }
    }
    if (!_matched) {
      if (exp instanceof Function) {
        _matched=true;
        CharSequence _xifexpression = null;
        String _op = ((Function)exp).getOp();
        boolean _equals = Objects.equal(_op, "pow");
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("n.y.i");
          _xifexpression = _builder;
        } else {
          CharSequence _xifexpression_1 = null;
          String _op_1 = ((Function)exp).getOp();
          boolean _equals_1 = Objects.equal(_op_1, "dist");
          if (_equals_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("n.y.i");
            _xifexpression_1 = _builder_1;
          } else {
            CharSequence _xifexpression_2 = null;
            String _op_2 = ((Function)exp).getOp();
            boolean _equals_2 = Objects.equal(_op_2, "min");
            if (_equals_2) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("n.y.i");
              _xifexpression_2 = _builder_2;
            } else {
              CharSequence _xifexpression_3 = null;
              String _op_3 = ((Function)exp).getOp();
              boolean _equals_3 = Objects.equal(_op_3, "max");
              if (_equals_3) {
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("n.y.i");
                _xifexpression_3 = _builder_3;
              }
              _xifexpression_2 = _xifexpression_3;
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xifexpression = _xifexpression_1;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (exp instanceof Unary) {
        _matched=true;
        CharSequence _xifexpression = null;
        String _op = ((Unary)exp).getOp();
        boolean _equals = Objects.equal(_op, "instances");
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("n.y.i");
          _xifexpression = _builder;
        } else {
          CharSequence _xifexpression_1 = null;
          String _op_1 = ((Unary)exp).getOp();
          boolean _equals_1 = Objects.equal(_op_1, "abs");
          if (_equals_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("n.y.i");
            _xifexpression_1 = _builder_1;
          } else {
            CharSequence _xifexpression_2 = null;
            String _op_2 = ((Unary)exp).getOp();
            boolean _equals_2 = Objects.equal(_op_2, "sqrt");
            if (_equals_2) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("n.y.i");
              _xifexpression_2 = _builder_2;
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xifexpression = _xifexpression_1;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (exp instanceof Negation) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("not(");
        CharSequence _parse = ExpressionsParser.parse(((Negation)exp).getExpression());
        _builder.append(_parse);
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (exp instanceof Iff) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        CharSequence _parse = ExpressionsParser.parse(((Iff)exp).getLeft());
        _builder.append(_parse);
        _builder.append("  <-> ");
        CharSequence _parse_1 = ExpressionsParser.parse(((Iff)exp).getRight());
        _builder.append(_parse_1);
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (exp instanceof Implies) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        CharSequence _parse = ExpressionsParser.parse(((Implies)exp).getLeft());
        _builder.append(_parse);
        _builder.append("  -> ");
        CharSequence _parse_1 = ExpressionsParser.parse(((Implies)exp).getRight());
        _builder.append(_parse_1);
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (exp instanceof Or) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        CharSequence _parse = ExpressionsParser.parse(((Or)exp).getLeft());
        _builder.append(_parse);
        _builder.append(" \\/ ");
        CharSequence _parse_1 = ExpressionsParser.parse(((Or)exp).getRight());
        _builder.append(_parse_1);
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (exp instanceof And) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        CharSequence _parse = ExpressionsParser.parse(((And)exp).getLeft());
        _builder.append(_parse);
        _builder.append(" /\\ ");
        CharSequence _parse_1 = ExpressionsParser.parse(((And)exp).getRight());
        _builder.append(_parse_1);
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (exp instanceof Equality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        CharSequence _parse = ExpressionsParser.parse(((Equality)exp).getLeft());
        _builder.append(_parse);
        _builder.append(" = ");
        CharSequence _parse_1 = ExpressionsParser.parse(((Equality)exp).getRight());
        _builder.append(_parse_1);
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (exp instanceof Comparison) {
        _matched=true;
        CharSequence _xifexpression = null;
        String _op = ((Comparison)exp).getOp();
        boolean _equals = Objects.equal(_op, ">=");
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("(");
          CharSequence _parse = ExpressionsParser.parse(((Comparison)exp).getLeft());
          _builder.append(_parse);
          _builder.append(" >= ");
          CharSequence _parse_1 = ExpressionsParser.parse(((Comparison)exp).getRight());
          _builder.append(_parse_1);
          _builder.append(")");
          _xifexpression = _builder;
        } else {
          CharSequence _xifexpression_1 = null;
          String _op_1 = ((Comparison)exp).getOp();
          boolean _equals_1 = Objects.equal(_op_1, "<=");
          if (_equals_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("(");
            CharSequence _parse_2 = ExpressionsParser.parse(((Comparison)exp).getLeft());
            _builder_1.append(_parse_2);
            _builder_1.append(" <= ");
            CharSequence _parse_3 = ExpressionsParser.parse(((Comparison)exp).getRight());
            _builder_1.append(_parse_3);
            _builder_1.append(")");
            _xifexpression_1 = _builder_1;
          } else {
            CharSequence _xifexpression_2 = null;
            String _op_2 = ((Comparison)exp).getOp();
            boolean _equals_2 = Objects.equal(_op_2, ">");
            if (_equals_2) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("(");
              CharSequence _parse_4 = ExpressionsParser.parse(((Comparison)exp).getLeft());
              _builder_2.append(_parse_4);
              _builder_2.append(" > ");
              CharSequence _parse_5 = ExpressionsParser.parse(((Comparison)exp).getRight());
              _builder_2.append(_parse_5);
              _builder_2.append(")");
              _xifexpression_2 = _builder_2;
            } else {
              CharSequence _xifexpression_3 = null;
              String _op_3 = ((Comparison)exp).getOp();
              boolean _equals_3 = Objects.equal(_op_3, "<");
              if (_equals_3) {
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("(");
                CharSequence _parse_6 = ExpressionsParser.parse(((Comparison)exp).getLeft());
                _builder_3.append(_parse_6);
                _builder_3.append(" < ");
                CharSequence _parse_7 = ExpressionsParser.parse(((Comparison)exp).getRight());
                _builder_3.append(_parse_7);
                _builder_3.append(")");
                _xifexpression_3 = _builder_3;
              }
              _xifexpression_2 = _xifexpression_3;
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xifexpression = _xifexpression_1;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (exp instanceof Plus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        CharSequence _parse = ExpressionsParser.parse(((Plus)exp).getLeft());
        _builder.append(_parse);
        _builder.append(" + ");
        CharSequence _parse_1 = ExpressionsParser.parse(((Plus)exp).getRight());
        _builder.append(_parse_1);
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        CharSequence _parse = ExpressionsParser.parse(((Minus)exp).getLeft());
        _builder.append(_parse);
        _builder.append(" - ");
        CharSequence _parse_1 = ExpressionsParser.parse(((Minus)exp).getRight());
        _builder.append(_parse_1);
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (exp instanceof MulOrDiv) {
        _matched=true;
        CharSequence _xifexpression = null;
        String _op = ((MulOrDiv)exp).getOp();
        boolean _equals = Objects.equal(_op, "*");
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("( ");
          CharSequence _parse = ExpressionsParser.parse(((MulOrDiv)exp).getLeft());
          _builder.append(_parse);
          _builder.append(" * ");
          CharSequence _parse_1 = ExpressionsParser.parse(((MulOrDiv)exp).getRight());
          _builder.append(_parse_1);
          _builder.append(")");
          _xifexpression = _builder;
        } else {
          CharSequence _xifexpression_1 = null;
          String _op_1 = ((MulOrDiv)exp).getOp();
          boolean _equals_1 = Objects.equal(_op_1, "/");
          if (_equals_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("( ");
            CharSequence _parse_2 = ExpressionsParser.parse(((MulOrDiv)exp).getLeft());
            _builder_1.append(_parse_2);
            _builder_1.append(" / ");
            CharSequence _parse_3 = ExpressionsParser.parse(((MulOrDiv)exp).getRight());
            _builder_1.append(_parse_3);
            _builder_1.append(")");
            _xifexpression_1 = _builder_1;
          } else {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("( ");
            CharSequence _parse_4 = ExpressionsParser.parse(((MulOrDiv)exp).getLeft());
            _builder_2.append(_parse_4);
            _builder_2.append(" mod ");
            CharSequence _parse_5 = ExpressionsParser.parse(((MulOrDiv)exp).getRight());
            _builder_2.append(_parse_5);
            _builder_2.append(")");
            _xifexpression_1 = _builder_2;
          }
          _xifexpression = _xifexpression_1;
        }
        _switchResult = _xifexpression;
      }
    }
    return _switchResult;
  }
}
