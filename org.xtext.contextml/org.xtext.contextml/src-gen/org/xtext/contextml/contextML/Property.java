/**
 * generated by Xtext 2.12.0
 */
package org.xtext.contextml.contextML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.contextml.contextML.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.Property#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.Property#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.Property#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see org.xtext.contextml.contextML.ContextMLPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TYPE)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getProperty_Type()
   * @model containment="true"
   * @generated
   */
  TYPE getType();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.Property#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TYPE value);

  /**
   * Returns the value of the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' reference.
   * @see #setProvider(Provider)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getProperty_Provider()
   * @model
   * @generated
   */
  Provider getProvider();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.Property#getProvider <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider</em>' reference.
   * @see #getProvider()
   * @generated
   */
  void setProvider(Provider value);

  /**
   * Returns the value of the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update</em>' containment reference.
   * @see #setUpdate(UpdateType)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getProperty_Update()
   * @model containment="true"
   * @generated
   */
  UpdateType getUpdate();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.Property#getUpdate <em>Update</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update</em>' containment reference.
   * @see #getUpdate()
   * @generated
   */
  void setUpdate(UpdateType value);

} // Property
