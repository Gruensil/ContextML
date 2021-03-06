/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.AdaptationRule#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.AdaptationRule#getLevel <em>Level</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.AdaptationRule#getFactType <em>Fact Type</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.AdaptationRule#getFactName <em>Fact Name</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.AdaptationRule#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.AdaptationRule#getActionCollection <em>Action Collection</em>}</li>
 * </ul>
 *
 * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationRule()
 * @model
 * @generated
 */
public interface AdaptationRule extends EObject
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
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.AdaptationRule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(int)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationRule_Level()
   * @model
   * @generated
   */
  int getLevel();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.AdaptationRule#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(int value);

  /**
   * Returns the value of the '<em><b>Fact Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact Type</em>' attribute.
   * @see #setFactType(String)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationRule_FactType()
   * @model
   * @generated
   */
  String getFactType();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.AdaptationRule#getFactType <em>Fact Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact Type</em>' attribute.
   * @see #getFactType()
   * @generated
   */
  void setFactType(String value);

  /**
   * Returns the value of the '<em><b>Fact Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact Name</em>' containment reference.
   * @see #setFactName(FactName)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationRule_FactName()
   * @model containment="true"
   * @generated
   */
  FactName getFactName();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.AdaptationRule#getFactName <em>Fact Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact Name</em>' containment reference.
   * @see #getFactName()
   * @generated
   */
  void setFactName(FactName value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(ConditionalOrExpression)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationRule_Expr()
   * @model containment="true"
   * @generated
   */
  ConditionalOrExpression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.AdaptationRule#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(ConditionalOrExpression value);

  /**
   * Returns the value of the '<em><b>Action Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Collection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Collection</em>' containment reference.
   * @see #setActionCollection(Actions)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationRule_ActionCollection()
   * @model containment="true"
   * @generated
   */
  Actions getActionCollection();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.AdaptationRule#getActionCollection <em>Action Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Collection</em>' containment reference.
   * @see #getActionCollection()
   * @generated
   */
  void setActionCollection(Actions value);

} // AdaptationRule
