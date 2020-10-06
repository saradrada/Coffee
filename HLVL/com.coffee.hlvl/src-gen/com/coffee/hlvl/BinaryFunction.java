/**
 * generated by Xtext 2.22.0
 */
package com.coffee.hlvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.BinaryFunction#getOp <em>Op</em>}</li>
 *   <li>{@link com.coffee.hlvl.BinaryFunction#getLeft <em>Left</em>}</li>
 *   <li>{@link com.coffee.hlvl.BinaryFunction#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getBinaryFunction()
 * @model
 * @generated
 */
public interface BinaryFunction extends Relational
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.coffee.hlvl.HlvlPackage#getBinaryFunction_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.BinaryFunction#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Relational)
   * @see com.coffee.hlvl.HlvlPackage#getBinaryFunction_Left()
   * @model containment="true"
   * @generated
   */
  Relational getLeft();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.BinaryFunction#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Relational value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Relational)
   * @see com.coffee.hlvl.HlvlPackage#getBinaryFunction_Right()
   * @model containment="true"
   * @generated
   */
  Relational getRight();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.BinaryFunction#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Relational value);

} // BinaryFunction
