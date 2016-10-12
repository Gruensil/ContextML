/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.adaptdsl.adaptDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.FunctionList#getThis <em>This</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.FunctionList#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getFunctionList()
 * @model
 * @generated
 */
public interface FunctionList extends EObject
{
  /**
   * Returns the value of the '<em><b>This</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>This</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>This</em>' containment reference.
   * @see #setThis(Function)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getFunctionList_This()
   * @model containment="true"
   * @generated
   */
  Function getThis();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.FunctionList#getThis <em>This</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>This</em>' containment reference.
   * @see #getThis()
   * @generated
   */
  void setThis(Function value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(FunctionList)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getFunctionList_Next()
   * @model containment="true"
   * @generated
   */
  FunctionList getNext();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.FunctionList#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(FunctionList value);

} // FunctionList