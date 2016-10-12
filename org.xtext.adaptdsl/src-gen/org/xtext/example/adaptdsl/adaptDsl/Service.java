/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.adaptdsl.adaptDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.Service#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.Service#getLoc <em>Loc</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.Service#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.Service#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getService_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.Service#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Loc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loc</em>' attribute.
   * @see #setLoc(String)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getService_Loc()
   * @model
   * @generated
   */
  String getLoc();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.Service#getLoc <em>Loc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc</em>' attribute.
   * @see #getLoc()
   * @generated
   */
  void setLoc(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getService_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.Service#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference.
   * @see #setFunctions(FunctionList)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getService_Functions()
   * @model containment="true"
   * @generated
   */
  FunctionList getFunctions();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.Service#getFunctions <em>Functions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functions</em>' containment reference.
   * @see #getFunctions()
   * @generated
   */
  void setFunctions(FunctionList value);

} // Service