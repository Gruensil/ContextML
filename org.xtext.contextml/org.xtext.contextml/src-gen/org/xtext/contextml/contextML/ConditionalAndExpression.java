/**
 * generated by Xtext 2.12.0
 */
package org.xtext.contextml.contextML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.contextml.contextML.ConditionalAndExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.ConditionalAndExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.contextml.contextML.ContextMLPackage#getConditionalAndExpression()
 * @model
 * @generated
 */
public interface ConditionalAndExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ConditionalPrimary)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getConditionalAndExpression_Left()
   * @model containment="true"
   * @generated
   */
  ConditionalPrimary getLeft();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.ConditionalAndExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ConditionalPrimary value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ConditionalAndExpression)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getConditionalAndExpression_Right()
   * @model containment="true"
   * @generated
   */
  ConditionalAndExpression getRight();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.ConditionalAndExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ConditionalAndExpression value);

} // ConditionalAndExpression
