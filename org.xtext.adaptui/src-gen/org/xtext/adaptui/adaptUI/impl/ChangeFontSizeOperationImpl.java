/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.adaptui.adaptUI.AdaptUIPackage;
import org.xtext.adaptui.adaptUI.ChangeFontSizeOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Font Size Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.ChangeFontSizeOperationImpl#getSizePrimary <em>Size Primary</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.ChangeFontSizeOperationImpl#getSizeSecondary <em>Size Secondary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeFontSizeOperationImpl extends MinimalEObjectImpl.Container implements ChangeFontSizeOperation
{
  /**
   * The default value of the '{@link #getSizePrimary() <em>Size Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizePrimary()
   * @generated
   * @ordered
   */
  protected static final String SIZE_PRIMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSizePrimary() <em>Size Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizePrimary()
   * @generated
   * @ordered
   */
  protected String sizePrimary = SIZE_PRIMARY_EDEFAULT;

  /**
   * The default value of the '{@link #getSizeSecondary() <em>Size Secondary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizeSecondary()
   * @generated
   * @ordered
   */
  protected static final String SIZE_SECONDARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSizeSecondary() <em>Size Secondary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizeSecondary()
   * @generated
   * @ordered
   */
  protected String sizeSecondary = SIZE_SECONDARY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChangeFontSizeOperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AdaptUIPackage.Literals.CHANGE_FONT_SIZE_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSizePrimary()
  {
    return sizePrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSizePrimary(String newSizePrimary)
  {
    String oldSizePrimary = sizePrimary;
    sizePrimary = newSizePrimary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_PRIMARY, oldSizePrimary, sizePrimary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSizeSecondary()
  {
    return sizeSecondary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSizeSecondary(String newSizeSecondary)
  {
    String oldSizeSecondary = sizeSecondary;
    sizeSecondary = newSizeSecondary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_SECONDARY, oldSizeSecondary, sizeSecondary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_PRIMARY:
        return getSizePrimary();
      case AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_SECONDARY:
        return getSizeSecondary();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_PRIMARY:
        setSizePrimary((String)newValue);
        return;
      case AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_SECONDARY:
        setSizeSecondary((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_PRIMARY:
        setSizePrimary(SIZE_PRIMARY_EDEFAULT);
        return;
      case AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_SECONDARY:
        setSizeSecondary(SIZE_SECONDARY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_PRIMARY:
        return SIZE_PRIMARY_EDEFAULT == null ? sizePrimary != null : !SIZE_PRIMARY_EDEFAULT.equals(sizePrimary);
      case AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION__SIZE_SECONDARY:
        return SIZE_SECONDARY_EDEFAULT == null ? sizeSecondary != null : !SIZE_SECONDARY_EDEFAULT.equals(sizeSecondary);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sizePrimary: ");
    result.append(sizePrimary);
    result.append(", sizeSecondary: ");
    result.append(sizeSecondary);
    result.append(')');
    return result.toString();
  }

} //ChangeFontSizeOperationImpl
