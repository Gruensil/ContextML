/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.adaptdsl.adaptDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.ConditionalPrimary#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getConditionalPrimary()
 * @model
 * @generated
 */
public interface ConditionalPrimary extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(EObject)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getConditionalPrimary_Cond()
   * @model containment="true"
   * @generated
   */
  EObject getCond();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.ConditionalPrimary#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(EObject value);

} // ConditionalPrimary
