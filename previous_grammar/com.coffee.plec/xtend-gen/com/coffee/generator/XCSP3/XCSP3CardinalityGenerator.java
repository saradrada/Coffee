package com.coffee.generator.XCSP3;

import com.coffee.generator.TypeOfProblem;
import com.coffee.generator.XCSP3.XCSP3CardinalityFactory;
import com.coffee.generator.XCSP3.XCSP3Generator;
import com.coffee.generator.variabilityTree.Node;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.ConsExpression;
import com.coffee.pLEC.Constraint;
import com.coffee.pLEC.FodaBin;
import com.coffee.pLEC.FodaUN;
import com.coffee.pLEC.Model;
import com.coffee.pLEC.Quantifiable;
import com.coffee.pLEC.RootRefinement;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.VarDeclaration;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class XCSP3CardinalityGenerator extends XCSP3Generator {
  private XCSP3CardinalityFactory factory;
  
  /**
   * Name of the root variable
   */
  private String root;
  
  /**
   * String for including the declaration of the variables
   */
  private StringBuilder variablesDeclarations;
  
  /**
   * String for including the declaration of the variables
   */
  private StringBuilder constraintsDeclarations;
  
  private Map<String, Node> tree;
  
  private int cardConstraints = 0;
  
  public XCSP3CardinalityGenerator(final String name, final TypeOfProblem type) {
    super(name, type);
    this.setFactory(this.factory);
    StringBuilder _stringBuilder = new StringBuilder();
    this.variablesDeclarations = _stringBuilder;
    StringBuilder _stringBuilder_1 = new StringBuilder();
    this.constraintsDeclarations = _stringBuilder_1;
    HashMap<String, Node> _hashMap = new HashMap<String, Node>();
    this.tree = _hashMap;
    XCSP3CardinalityFactory _xCSP3CardinalityFactory = new XCSP3CardinalityFactory(type, this.tree);
    this.factory = _xCSP3CardinalityFactory;
  }
  
  /**
   * This method traverses the list of variables to parse each declaration
   * The declaration is made by the factory
   * Revisar este código para reusar los métodos
   * @param model
   */
  @Override
  public CharSequence parseVariables(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Collection<Node> _values = this.tree.values();
      for(final Node node : _values) {
        CharSequence _variable = this.factory.getVariable(node.getVariable());
        _builder.append(_variable);
        _builder.newLineIfNotEmpty();
        {
          if (((!Objects.equal(node.getId(), this.root)) && (node.getNumInstances() != 1))) {
            CharSequence _declareVaribleNumInstances = this.factory.declareVaribleNumInstances(node);
            _builder.append(_declareVaribleNumInstances);
            _builder.newLineIfNotEmpty();
            {
              List<String> _varsIds = node.getVarsIds();
              for(final String instance : _varsIds) {
                CharSequence _declareInstance = this.factory.declareInstance(instance);
                _builder.append(_declareInstance);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Method to parse the constraints in a model.
   * The constraints are contained in a collection
   * of constraints
   * @param model
   */
  @Override
  public CharSequence parseConstraints(final Model model) {
    return this.constraintsDeclarations.toString();
  }
  
  /**
   * Method to produce a sequence of characters with the
   * model represented as a constraint problem using  the
   * Textual HLCL language (model.hlcl)
   * @param model is an ECORE syntax tree with the program
   * this syntax tree should be traversed.
   */
  @Override
  public CharSequence parseModel(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    this.createTree(model);
    _builder.newLineIfNotEmpty();
    String _header = this.factory.getHeader();
    _builder.append(_header);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    String _varLabel = this.factory.getVarLabel();
    _builder.append(_varLabel);
    _builder.newLineIfNotEmpty();
    CharSequence _parseVariables = this.parseVariables(model);
    _builder.append(_parseVariables);
    _builder.newLineIfNotEmpty();
    String _varLabelClose = this.factory.getVarLabelClose();
    _builder.append(_varLabelClose);
    _builder.newLineIfNotEmpty();
    String _consLabel = this.factory.getConsLabel();
    _builder.append(_consLabel);
    _builder.newLineIfNotEmpty();
    CharSequence _parseConstraints = this.parseConstraints(model);
    _builder.append(_parseConstraints);
    _builder.newLineIfNotEmpty();
    String _consLabelClose = this.factory.getConsLabelClose();
    _builder.append(_consLabelClose);
    _builder.newLineIfNotEmpty();
    CharSequence _strategy = this.factory.getStrategy();
    _builder.append(_strategy);
    _builder.newLineIfNotEmpty();
    String _footer = this.factory.getFooter();
    _builder.append(_footer);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence parseQuantifiable(final Quantifiable exp) {
    return this.factory.getQuantifiableRequires(exp);
  }
  
  public void createTree(final Model model) {
    EList<VarDeclaration> _vars = model.getVars();
    for (final VarDeclaration variable : _vars) {
      {
        String _name = variable.getName();
        final Node node = new Node(_name);
        node.setVariable(variable);
        if (((variable.getMin() == null) && (variable.getMax() == null))) {
          node.setMin(1);
          node.setMax(1);
        } else {
          node.setMin(variable.getMin().getValue());
          node.setMax(variable.getMax().getValue());
        }
        this.tree.put(variable.getName(), node);
      }
    }
    EList<Constraint> _constraints = model.getConstraints();
    for (final Constraint c : _constraints) {
      ConsExpression _exp = c.getExp();
      if ((_exp instanceof Structural)) {
        ConsExpression _exp_1 = c.getExp();
        final Structural exp = ((Structural) _exp_1);
        final Node padre = this.tree.get(exp.getParent().getName());
        boolean _equals = padre.getId().equals(this.root);
        if (_equals) {
          padre.addVarId(padre.getId());
        }
        if (((exp.getMin() == null) && (exp.getMax() == null))) {
          EList<VarDeclaration> _ids = exp.getGroup().getIds();
          for (final VarDeclaration childVar : _ids) {
            {
              final Node childNode = this.tree.get(childVar.getName());
              childNode.setParent(padre);
              int _numInstances = padre.getNumInstances();
              int _max = childNode.getMax();
              int _multiply = (_numInstances * _max);
              childNode.setNumInstances(_multiply);
              String allInstances = "add(";
              List<String> _varsIds = padre.getVarsIds();
              for (final String nameV : _varsIds) {
                {
                  String sufixInstances = "add(";
                  for (int i = 1; (i <= childNode.getMax()); i++) {
                    {
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append(nameV);
                      _builder.append("_");
                      String _name = childVar.getName();
                      _builder.append(_name);
                      _builder.append(i);
                      final String instance = _builder.toString();
                      childNode.addVarId(instance);
                      String _sufixInstances = sufixInstances;
                      StringConcatenation _builder_1 = new StringConcatenation();
                      _builder_1.append(" ");
                      _builder_1.append(instance, " ");
                      _builder_1.append(" ,");
                      sufixInstances = (_sufixInstances + _builder_1);
                    }
                  }
                  int _length = sufixInstances.length();
                  int _minus = (_length - 1);
                  String _substring = sufixInstances.substring(0, _minus);
                  String _plus = (_substring + ")");
                  sufixInstances = _plus;
                  if (((!Objects.equal(childNode.getParent().getId(), this.root)) && (childNode.getNumInstances() > 1))) {
                    this.generateInstanceCardinalityConstraint(sufixInstances, childNode, nameV);
                  }
                  String _allInstances = allInstances;
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append(sufixInstances);
                  _builder.append(" ,");
                  allInstances = (_allInstances + _builder);
                }
              }
              padre.addChild(childNode);
              this.getParents().put(childVar.getName(), exp.getParent());
              if (((!Objects.equal(childNode.getId(), this.root)) && (childNode.getNumInstances() != 1))) {
                int _length = allInstances.length();
                int _minus = (_length - 1);
                String _substring = allInstances.substring(0, _minus);
                String _plus = (_substring + ")");
                allInstances = _plus;
                this.generateFeatureCardinalityconstraints(allInstances, childNode);
              }
            }
          }
        } else {
          EList<VarDeclaration> _ids_1 = exp.getGroup().getIds();
          for (final VarDeclaration childVar_1 : _ids_1) {
            {
              final Node childNode = this.tree.get(childVar_1.getName());
              childNode.setParent(padre);
              int _numInstances = padre.getNumInstances();
              int _max = childNode.getMax();
              int _multiply = (_numInstances * _max);
              childNode.setNumInstances(_multiply);
              List<String> _varsIds = padre.getVarsIds();
              for (final String nameV : _varsIds) {
                for (int i = 1; (i <= childNode.getMax()); i++) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append(nameV);
                  _builder.append("_");
                  String _name = childVar_1.getName();
                  _builder.append(_name);
                  _builder.append(i);
                  childNode.addVarId(_builder.toString());
                }
              }
              padre.addChild(childNode);
            }
          }
          this.constraintsDeclarations.append(this.parseConstraint(c.getName(), c.getExp()));
        }
      } else {
        ConsExpression _exp_2 = c.getExp();
        if ((_exp_2 instanceof Attributes)) {
          ConsExpression _exp_3 = c.getExp();
          final Attributes exp_1 = ((Attributes) _exp_3);
          final Node padre_1 = this.tree.get(exp_1.getVar1().getName());
          String _name = exp_1.getVar1().getName();
          String _plus = (_name + " ");
          String _plus_1 = (_plus + padre_1);
          InputOutput.<String>println(_plus_1);
          EList<VarDeclaration> _ids_2 = exp_1.getAtt().getIds();
          for (final VarDeclaration att : _ids_2) {
            {
              final Node childNode = this.tree.get(att.getName());
              String _name_1 = att.getName();
              String _plus_2 = (_name_1 + " ");
              String _plus_3 = (_plus_2 + childNode);
              InputOutput.<String>print(_plus_3);
              childNode.setParent(padre_1);
              childNode.setNumInstances(1);
              padre_1.addChild(childNode);
            }
          }
          this.constraintsDeclarations.append(this.parseConstraint(c.getName(), c.getExp()));
        } else {
          ConsExpression _exp_4 = c.getExp();
          if ((_exp_4 instanceof RootRefinement)) {
            ConsExpression _exp_5 = c.getExp();
            this.root = ((RootRefinement) _exp_5).getVar().getName();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("<intension id=\"");
            String _name_1 = c.getName();
            _builder.append(_name_1);
            _builder.append("\"> ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("eq(");
            _builder.append(this.root, "\t");
            _builder.append(", 1)");
            _builder.newLineIfNotEmpty();
            _builder.append("</intension>");
            _builder.newLine();
            this.constraintsDeclarations.append(_builder);
          } else {
            this.constraintsDeclarations.append(this.parseConstraint(c.getName(), c.getExp()));
          }
        }
      }
    }
  }
  
  /**
   * Methods for this notation  estos metodos deben ir en el
   */
  public StringBuilder generateFeatureCardinalityconstraints(final String allInstances, final Node node) {
    StringBuilder _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<intension id=\"ac_");
      int _plusPlus = this.cardConstraints++;
      _builder.append(_plusPlus);
      _builder.append("\"> ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("eq(");
      String _id = node.getId();
      _builder.append(_id, "\t");
      _builder.append("_card, ");
      _builder.append(allInstances, "\t");
      _builder.append(") ");
      _builder.newLineIfNotEmpty();
      _builder.append("</intension>");
      _builder.newLine();
      this.constraintsDeclarations.append(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<intension id=\"ac_");
      int _plusPlus_1 = this.cardConstraints++;
      _builder_1.append(_plusPlus_1);
      _builder_1.append("\">");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("le(");
      int _min = node.getMin();
      _builder_1.append(_min, "\t");
      _builder_1.append(", ");
      _builder_1.append(allInstances, "\t");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("</intension>");
      _builder_1.newLine();
      this.constraintsDeclarations.append(_builder_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("<intension id=\"ac_");
      int _plusPlus_2 = this.cardConstraints++;
      _builder_2.append(_plusPlus_2);
      _builder_2.append("\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      _builder_2.append("ge(");
      int _numInstances = node.getNumInstances();
      _builder_2.append(_numInstances, "\t");
      _builder_2.append(", ");
      _builder_2.append(allInstances, "\t");
      _builder_2.append(")");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("</intension>");
      _builder_2.newLine();
      this.constraintsDeclarations.append(_builder_2);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("<intension id=\"ac_");
      int _plusPlus_3 = this.cardConstraints++;
      _builder_3.append(_plusPlus_3);
      _builder_3.append("\">");
      _builder_3.newLineIfNotEmpty();
      _builder_3.append("\t");
      _builder_3.append("iff(");
      String _id_1 = node.getId();
      _builder_3.append(_id_1, "\t");
      _builder_3.append(", gt(");
      String _id_2 = node.getId();
      _builder_3.append(_id_2, "\t");
      _builder_3.append("_card,0))");
      _builder_3.newLineIfNotEmpty();
      _builder_3.append("</intension>");
      _builder_3.newLine();
      _xblockexpression = this.constraintsDeclarations.append(_builder_3);
    }
    return _xblockexpression;
  }
  
  public StringBuilder generateInstanceCardinalityConstraint(final String sufixInstances, final Node node, final String instanceName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<intension id= \"ac_");
    int _plusPlus = this.cardConstraints++;
    _builder.append(_plusPlus);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("imp(");
    _builder.append(instanceName, "\t");
    _builder.append(", ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("and(le(");
    int _min = node.getMin();
    _builder.append(_min, "\t");
    _builder.append(", ");
    _builder.append(sufixInstances, "\t");
    _builder.append("),");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ge(");
    int _max = node.getMax();
    _builder.append(_max, "\t");
    _builder.append(", ");
    _builder.append(sufixInstances, "\t");
    _builder.append(")))");
    _builder.newLineIfNotEmpty();
    _builder.append("</intension>");
    _builder.newLine();
    return this.constraintsDeclarations.append(_builder);
  }
  
  /**
   * This method does not generate code, just keeps track
   * the parents of each element in an structural relation
   * @param exp is a Structural relation
   */
  @Override
  public CharSequence parseStructuralNoCard(final Structural exp) {
    CharSequence _xblockexpression = null;
    {
      this.addParents(exp);
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * Method obtaining the representation of an structural expression
   * this method calls the factory because the code is dependent of the type of
   * problem and the type of file
   * @param exp is an structural expression
   */
  @Override
  public CharSequence parseStructuralCard(final Structural exp) {
    return this.factory.getGroupCardinality(exp, this.getParents());
  }
  
  /**
   * Method obtaining the representation of FODA expression
   * this method calls the factory because the code is dependent of the type of
   * problem and the type of file
   * @param exp is Foda expression with two variables
   */
  @Override
  public CharSequence parseFodaBinary(final FodaBin exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = exp.getOp();
      boolean _equals = Objects.equal(_op, "requires");
      if (_equals) {
        CharSequence _requires = this.factory.getRequires(exp.getVar1(), exp.getVar2());
        _builder.append(_requires);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _op_1 = exp.getOp();
          boolean _equals_1 = Objects.equal(_op_1, "excludes");
          if (_equals_1) {
            CharSequence _excludes = this.factory.getExcludes(exp.getVar1(), exp.getVar2());
            _builder.append(_excludes);
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _op_2 = exp.getOp();
              boolean _equals_2 = Objects.equal(_op_2, "mandatory");
              if (_equals_2) {
                CharSequence _mandatory = this.factory.getMandatory(exp.getVar1(), exp.getVar2());
                _builder.append(_mandatory);
                _builder.newLineIfNotEmpty();
              } else {
                CharSequence _optional = this.factory.getOptional(exp.getVar1(), exp.getVar2());
                _builder.append(_optional);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Method for parsing FODA operations with just one variable
   * this is allowed because there exists a structural expression defined before
   * @param exp is an unary FODA expression
   */
  @Override
  public CharSequence parseFodaUnary(final FodaUN exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = exp.getOp();
      boolean _equals = Objects.equal(_op, "optional");
      if (_equals) {
        CharSequence _optional = this.factory.getOptional(this.getParents().get(exp.getVar1().getName()), exp.getVar1());
        _builder.append(_optional);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _op_1 = exp.getOp();
          boolean _equals_1 = Objects.equal(_op_1, "mandatory");
          if (_equals_1) {
            CharSequence _mandatory = this.factory.getMandatory(this.getParents().get(exp.getVar1().getName()), exp.getVar1());
            _builder.append(_mandatory);
            _builder.newLineIfNotEmpty();
          } else {
          }
        }
      }
    }
    return _builder;
  }
}
