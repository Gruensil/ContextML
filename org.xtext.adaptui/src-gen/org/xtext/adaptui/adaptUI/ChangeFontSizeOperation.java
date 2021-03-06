/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Font Size Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.ChangeFontSizeOperation#getSizePrimary <em>Size Primary</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.ChangeFontSizeOperation#getSizeSecondary <em>Size Secondary</em>}</li>
 * </ul>
 *
 * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getChangeFontSizeOperation()
 * @model
 * @generated
 */
public interface ChangeFontSizeOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Size Primary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size Primary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size Primary</em>' attribute.
   * @see #setSizePrimary(String)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getChangeFontSizeOperation_SizePrimary()
   * @model
   * @generated
   */
  String getSizePrimary();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.ChangeFontSizeOperation#getSizePrimary <em>Size Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size Primary</em>' attribute.
   * @see #getSizePrimary()
   * @generated
   */
  void setSizePrimary(String value);

  /**
   * Returns the value of the '<em><b>Size Secondary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size Secondary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size Secondary</em>' attribute.
   * @see #setSizeSecondary(String)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getChangeFontSizeOperation_SizeSecondary()
   * @model
   * @generated
   */
  String getSizeSecondary();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.ChangeFontSizeOperation#getSizeSecondary <em>Size Secondary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size Secondary</em>' attribute.
   * @see #getSizeSecondary()
   * @generated
   */
  void setSizeSecondary(String value);

} // ChangeFontSizeOperation
