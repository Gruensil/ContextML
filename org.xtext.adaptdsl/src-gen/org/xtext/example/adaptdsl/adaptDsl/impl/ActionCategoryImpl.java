/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.adaptdsl.adaptDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.adaptdsl.adaptDsl.ActionCategory;
import org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage;
import org.xtext.example.adaptdsl.adaptDsl.ParentOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.ActionCategoryImpl#getActionCategory <em>Action Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionCategoryImpl extends MinimalEObjectImpl.Container implements ActionCategory
{
  /**
   * The cached value of the '{@link #getActionCategory() <em>Action Category</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionCategory()
   * @generated
   * @ordered
   */
  protected ParentOperation actionCategory;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionCategoryImpl()
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
    return AdaptDslPackage.Literals.ACTION_CATEGORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentOperation getActionCategory()
  {
    return actionCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionCategory(ParentOperation newActionCategory, NotificationChain msgs)
  {
    ParentOperation oldActionCategory = actionCategory;
    actionCategory = newActionCategory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ACTION_CATEGORY__ACTION_CATEGORY, oldActionCategory, newActionCategory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionCategory(ParentOperation newActionCategory)
  {
    if (newActionCategory != actionCategory)
    {
      NotificationChain msgs = null;
      if (actionCategory != null)
        msgs = ((InternalEObject)actionCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptDslPackage.ACTION_CATEGORY__ACTION_CATEGORY, null, msgs);
      if (newActionCategory != null)
        msgs = ((InternalEObject)newActionCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptDslPackage.ACTION_CATEGORY__ACTION_CATEGORY, null, msgs);
      msgs = basicSetActionCategory(newActionCategory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ACTION_CATEGORY__ACTION_CATEGORY, newActionCategory, newActionCategory));
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
      case AdaptDslPackage.ACTION_CATEGORY__ACTION_CATEGORY:
        return basicSetActionCategory(null, msgs);
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
      case AdaptDslPackage.ACTION_CATEGORY__ACTION_CATEGORY:
        return getActionCategory();
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
      case AdaptDslPackage.ACTION_CATEGORY__ACTION_CATEGORY:
        setActionCategory((ParentOperation)newValue);
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
      case AdaptDslPackage.ACTION_CATEGORY__ACTION_CATEGORY:
        setActionCategory((ParentOperation)null);
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
      case AdaptDslPackage.ACTION_CATEGORY__ACTION_CATEGORY:
        return actionCategory != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionCategoryImpl
