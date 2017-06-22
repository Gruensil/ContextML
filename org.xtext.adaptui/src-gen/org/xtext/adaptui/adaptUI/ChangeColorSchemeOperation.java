/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Color Scheme Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.ChangeColorSchemeOperation#getColorPrimary <em>Color Primary</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.ChangeColorSchemeOperation#getColorSecondary <em>Color Secondary</em>}</li>
 * </ul>
 *
 * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getChangeColorSchemeOperation()
 * @model
 * @generated
 */
public interface ChangeColorSchemeOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Color Primary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color Primary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color Primary</em>' attribute.
   * @see #setColorPrimary(String)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getChangeColorSchemeOperation_ColorPrimary()
   * @model
   * @generated
   */
  String getColorPrimary();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.ChangeColorSchemeOperation#getColorPrimary <em>Color Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Primary</em>' attribute.
   * @see #getColorPrimary()
   * @generated
   */
  void setColorPrimary(String value);

  /**
   * Returns the value of the '<em><b>Color Secondary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color Secondary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color Secondary</em>' attribute.
   * @see #setColorSecondary(String)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getChangeColorSchemeOperation_ColorSecondary()
   * @model
   * @generated
   */
  String getColorSecondary();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.ChangeColorSchemeOperation#getColorSecondary <em>Color Secondary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Secondary</em>' attribute.
   * @see #getColorSecondary()
   * @generated
   */
  void setColorSecondary(String value);

} // ChangeColorSchemeOperation
