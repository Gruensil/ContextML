/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.adaptui.adaptUI.AdaptUIPackage;
import org.xtext.adaptui.adaptUI.DisplayPropertyValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.DisplayPropertyValueImpl#getPropertyClass <em>Property Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayPropertyValueImpl extends MinimalEObjectImpl.Container implements DisplayPropertyValue
{
  /**
   * The cached value of the '{@link #getPropertyClass() <em>Property Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyClass()
   * @generated
   * @ordered
   */
  protected EObject propertyClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DisplayPropertyValueImpl()
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
    return AdaptUIPackage.Literals.DISPLAY_PROPERTY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getPropertyClass()
  {
    return propertyClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertyClass(EObject newPropertyClass, NotificationChain msgs)
  {
    EObject oldPropertyClass = propertyClass;
    propertyClass = newPropertyClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptUIPackage.DISPLAY_PROPERTY_VALUE__PROPERTY_CLASS, oldPropertyClass, newPropertyClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyClass(EObject newPropertyClass)
  {
    if (newPropertyClass != propertyClass)
    {
      NotificationChain msgs = null;
      if (propertyClass != null)
        msgs = ((InternalEObject)propertyClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.DISPLAY_PROPERTY_VALUE__PROPERTY_CLASS, null, msgs);
      if (newPropertyClass != null)
        msgs = ((InternalEObject)newPropertyClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.DISPLAY_PROPERTY_VALUE__PROPERTY_CLASS, null, msgs);
      msgs = basicSetPropertyClass(newPropertyClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.DISPLAY_PROPERTY_VALUE__PROPERTY_CLASS, newPropertyClass, newPropertyClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AdaptUIPackage.DISPLAY_PROPERTY_VALUE__PROPERTY_CLASS:
        return basicSetPropertyClass(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AdaptUIPackage.DISPLAY_PROPERTY_VALUE__PROPERTY_CLASS:
        return getPropertyClass();
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
      case AdaptUIPackage.DISPLAY_PROPERTY_VALUE__PROPERTY_CLASS:
        setPropertyClass((EObject)newValue);
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
      case AdaptUIPackage.DISPLAY_PROPERTY_VALUE__PROPERTY_CLASS:
        setPropertyClass((EObject)null);
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
      case AdaptUIPackage.DISPLAY_PROPERTY_VALUE__PROPERTY_CLASS:
        return propertyClass != null;
    }
    return super.eIsSet(featureID);
  }

} //DisplayPropertyValueImpl
