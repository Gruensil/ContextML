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
import org.xtext.adaptui.adaptUI.ConditionalPrimary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Primary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.ConditionalPrimaryImpl#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalPrimaryImpl extends MinimalEObjectImpl.Container implements ConditionalPrimary
{
  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected EObject cond;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalPrimaryImpl()
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
    return AdaptUIPackage.Literals.CONDITIONAL_PRIMARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(EObject newCond, NotificationChain msgs)
  {
    EObject oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptUIPackage.CONDITIONAL_PRIMARY__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(EObject newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.CONDITIONAL_PRIMARY__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.CONDITIONAL_PRIMARY__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.CONDITIONAL_PRIMARY__COND, newCond, newCond));
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
      case AdaptUIPackage.CONDITIONAL_PRIMARY__COND:
        return basicSetCond(null, msgs);
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
      case AdaptUIPackage.CONDITIONAL_PRIMARY__COND:
        return getCond();
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
      case AdaptUIPackage.CONDITIONAL_PRIMARY__COND:
        setCond((EObject)newValue);
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
      case AdaptUIPackage.CONDITIONAL_PRIMARY__COND:
        setCond((EObject)null);
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
      case AdaptUIPackage.CONDITIONAL_PRIMARY__COND:
        return cond != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalPrimaryImpl
