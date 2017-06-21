/**
 * generated by Xtext 2.12.0
 */
package org.xtext.contextml.contextML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.contextml.contextML.DisplayPropertyValue#getPropertyClass <em>Property Class</em>}</li>
 * </ul>
 *
 * @see org.xtext.contextml.contextML.ContextMLPackage#getDisplayPropertyValue()
 * @model
 * @generated
 */
public interface DisplayPropertyValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Property Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Class</em>' containment reference.
   * @see #setPropertyClass(EObject)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getDisplayPropertyValue_PropertyClass()
   * @model containment="true"
   * @generated
   */
  EObject getPropertyClass();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.DisplayPropertyValue#getPropertyClass <em>Property Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Class</em>' containment reference.
   * @see #getPropertyClass()
   * @generated
   */
  void setPropertyClass(EObject value);

} // DisplayPropertyValue
