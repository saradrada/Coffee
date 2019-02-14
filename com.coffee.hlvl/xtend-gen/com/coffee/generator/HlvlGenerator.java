/**
 * generated by Xtext 2.12.0
 */
package com.coffee.generator;

import com.coffee.generator.Dialect;
import com.coffee.generator.IGenerator;
import com.coffee.generator.Integers.IntGenerator;
import com.coffee.generator.bools.BoolGenerator;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Group;
import com.coffee.hlvl.Model;
import com.coffee.hlvl.MultInstantiation;
import com.coffee.hlvl.RelDeclaration;
import com.coffee.hlvl.Relation;
import com.google.common.base.Objects;
import java.util.Properties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Class autogenerated by xtext and edited to define the code generator
 * for the High Level Variability Language (HLVL)
 * @author Angela Villota
 * @version HLVL 1
 * August 201
 * Updated on January 2019 to the new HLVL grammar
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class HlvlGenerator extends AbstractGenerator {
  private boolean instantiable = false;
  
  private boolean attributes = false;
  
  private Properties operations = new Properties();
  
  private IGenerator generator;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final String modelName = this.modelName(((Model) _head));
    EObject _head_1 = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head_1);
    final Dialect dialect = this.setDialect(model);
    final long startTime = System.currentTimeMillis();
    boolean _equals = Objects.equal(dialect, Dialect.BASIC);
    if (_equals) {
      fsa.generateFile((modelName + "_bool.mzn"), this.toBoolean(model, modelName, fsa));
    } else {
      fsa.generateFile((modelName + "_int.mzn"), this.toInteger(model, modelName, dialect));
    }
    fsa.generateFile((modelName + "operations.json"), this.generator.getProperties());
    final long stopTime = System.currentTimeMillis();
    final long elapsedTime = (stopTime - startTime);
    System.out.println(elapsedTime);
  }
  
  /**
   * Method to obtain the name of the model
   * @param modes is of type Model
   * @returns String name with the name of the model
   */
  public String modelName(final Model model) {
    String name = StringExtensions.toFirstUpper(model.getName());
    return name;
  }
  
  /**
   * Method that determines the dialect used to specify the model
   * using the
   * @param model is an abstract representation of the model
   */
  public Dialect setDialect(final Model model) {
    if ((this.allBoolean(model) && this.booleanRelations(model))) {
      return Dialect.BASIC;
    } else {
      boolean _existInstantiable = this.existInstantiable();
      if (_existInstantiable) {
        return Dialect.INST;
      } else {
        return Dialect.ATT;
      }
    }
  }
  
  /**
   * Method to determine the type of the variables
   * If there are one variable that cannot be mapped into a boolean
   * variable, then the method returns CSP.
   * @param model
   * @return true if all elements are booleans
   */
  public boolean allBoolean(final Model model) {
    boolean isBoolean = true;
    EList<ElmDeclaration> _elements = model.getElements();
    for (final ElmDeclaration element : _elements) {
      {
        String _att = element.getAtt();
        boolean _tripleEquals = (_att == null);
        boolean _not = (!_tripleEquals);
        this.attributes = _not;
        String _dataType = element.getDataType();
        boolean _equals = Objects.equal(_dataType, "integer");
        if (_equals) {
          isBoolean = false;
          return isBoolean;
        }
      }
    }
    return isBoolean;
  }
  
  /**
   * Method to determine the type of the constraints
   * If there are one constraint that cannot be mapped into a boolean
   * constraint, then the method returns false.
   * @param model
   * @return true if all constraints can be mapped to boolean
   */
  public boolean booleanRelations(final Model model) {
    boolean allBoolean = true;
    EList<RelDeclaration> _relations = model.getRelations();
    for (final RelDeclaration rel : _relations) {
      Relation _exp = rel.getExp();
      if ((_exp instanceof MultInstantiation)) {
        this.instantiable = true;
        return false;
      } else {
        Relation _exp_1 = rel.getExp();
        if ((_exp_1 instanceof Group)) {
          Relation _exp_2 = rel.getExp();
          final int min = ((Group) _exp_2).getMin();
          Relation _exp_3 = rel.getExp();
          final int max = ((Group) _exp_3).getMax().getValue();
          Relation _exp_4 = rel.getExp();
          final int numChildren = ((Group) _exp_4).getChildren().getValues().size();
          if (((!((min == 1) && (max == 1))) && (!((min == 1) && (max == numChildren))))) {
            return false;
          }
        }
      }
    }
    return allBoolean;
  }
  
  public boolean existInstantiable() {
    return this.instantiable;
  }
  
  public CharSequence toBoolean(final Model model, final String modelName, final IFileSystemAccess2 fsa) {
    CharSequence _xblockexpression = null;
    {
      BoolGenerator _boolGenerator = new BoolGenerator(modelName);
      this.generator = _boolGenerator;
      _xblockexpression = this.generator.parseModel(model);
    }
    return _xblockexpression;
  }
  
  public CharSequence toInteger(final Model model, final String modelName, final Dialect dialect) {
    CharSequence _xblockexpression = null;
    {
      IntGenerator _intGenerator = new IntGenerator(modelName, dialect);
      this.generator = _intGenerator;
      _xblockexpression = this.generator.parseModel(model);
    }
    return _xblockexpression;
  }
  
  public Object PropertieswriteOperationsFile(final Dialect dialect) {
    return null;
  }
}
