/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.adaptui.adaptUI.AdaptUIPackage;
import org.xtext.adaptui.adaptUI.Function;
import org.xtext.adaptui.adaptUI.FunctionList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.FunctionListImpl#getThis <em>This</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.FunctionListImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionListImpl extends MinimalEObjectImpl.Container implements FunctionList
{
  /**
   * The cached value of the '{@link #getThis() <em>This</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThis()
   * @generated
   * @ordered
   */
  protected Function this_;

  /**
   * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected FunctionList next;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionListImpl()
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
    return AdaptUIPackage.Literals.FUNCTION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getThis()
  {
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThis(Function newThis, NotificationChain msgs)
  {
    Function oldThis = this_;
    this_ = newThis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptUIPackage.FUNCTION_LIST__THIS, oldThis, newThis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThis(Function newThis)
  {
    if (newThis != this_)
    {
      NotificationChain msgs = null;
      if (this_ != null)
        msgs = ((InternalEObject)this_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.FUNCTION_LIST__THIS, null, msgs);
      if (newThis != null)
        msgs = ((InternalEObject)newThis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.FUNCTION_LIST__THIS, null, msgs);
      msgs = basicSetThis(newThis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.FUNCTION_LIST__THIS, newThis, newThis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionList getNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNext(FunctionList newNext, NotificationChain msgs)
  {
    FunctionList oldNext = next;
    next = newNext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptUIPackage.FUNCTION_LIST__NEXT, oldNext, newNext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(FunctionList newNext)
  {
    if (newNext != next)
    {
      NotificationChain msgs = null;
      if (next != null)
        msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.FUNCTION_LIST__NEXT, null, msgs);
      if (newNext != null)
        msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.FUNCTION_LIST__NEXT, null, msgs);
      msgs = basicSetNext(newNext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.FUNCTION_LIST__NEXT, newNext, newNext));
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
      case AdaptUIPackage.FUNCTION_LIST__THIS:
        return basicSetThis(null, msgs);
      case AdaptUIPackage.FUNCTION_LIST__NEXT:
        return basicSetNext(null, msgs);
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
      case AdaptUIPackage.FUNCTION_LIST__THIS:
        return getThis();
      case AdaptUIPackage.FUNCTION_LIST__NEXT:
        return getNext();
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
      case AdaptUIPackage.FUNCTION_LIST__THIS:
        setThis((Function)newValue);
        return;
      case AdaptUIPackage.FUNCTION_LIST__NEXT:
        setNext((FunctionList)newValue);
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
      case AdaptUIPackage.FUNCTION_LIST__THIS:
        setThis((Function)null);
        return;
      case AdaptUIPackage.FUNCTION_LIST__NEXT:
        setNext((FunctionList)null);
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
      case AdaptUIPackage.FUNCTION_LIST__THIS:
        return this_ != null;
      case AdaptUIPackage.FUNCTION_LIST__NEXT:
        return next != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionListImpl
