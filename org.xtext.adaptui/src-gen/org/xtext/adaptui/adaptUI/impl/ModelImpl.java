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
import org.xtext.adaptui.adaptUI.AdaptationModel;
import org.xtext.adaptui.adaptUI.ContextModel;
import org.xtext.adaptui.adaptUI.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.ModelImpl#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.ModelImpl#getAdaptationModel <em>Adaptation Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getContextModel() <em>Context Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextModel()
   * @generated
   * @ordered
   */
  protected ContextModel contextModel;

  /**
   * The cached value of the '{@link #getAdaptationModel() <em>Adaptation Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdaptationModel()
   * @generated
   * @ordered
   */
  protected AdaptationModel adaptationModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return AdaptUIPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextModel getContextModel()
  {
    return contextModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextModel(ContextModel newContextModel, NotificationChain msgs)
  {
    ContextModel oldContextModel = contextModel;
    contextModel = newContextModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptUIPackage.MODEL__CONTEXT_MODEL, oldContextModel, newContextModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextModel(ContextModel newContextModel)
  {
    if (newContextModel != contextModel)
    {
      NotificationChain msgs = null;
      if (contextModel != null)
        msgs = ((InternalEObject)contextModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.MODEL__CONTEXT_MODEL, null, msgs);
      if (newContextModel != null)
        msgs = ((InternalEObject)newContextModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.MODEL__CONTEXT_MODEL, null, msgs);
      msgs = basicSetContextModel(newContextModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.MODEL__CONTEXT_MODEL, newContextModel, newContextModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModel getAdaptationModel()
  {
    return adaptationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdaptationModel(AdaptationModel newAdaptationModel, NotificationChain msgs)
  {
    AdaptationModel oldAdaptationModel = adaptationModel;
    adaptationModel = newAdaptationModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptUIPackage.MODEL__ADAPTATION_MODEL, oldAdaptationModel, newAdaptationModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdaptationModel(AdaptationModel newAdaptationModel)
  {
    if (newAdaptationModel != adaptationModel)
    {
      NotificationChain msgs = null;
      if (adaptationModel != null)
        msgs = ((InternalEObject)adaptationModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.MODEL__ADAPTATION_MODEL, null, msgs);
      if (newAdaptationModel != null)
        msgs = ((InternalEObject)newAdaptationModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptUIPackage.MODEL__ADAPTATION_MODEL, null, msgs);
      msgs = basicSetAdaptationModel(newAdaptationModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.MODEL__ADAPTATION_MODEL, newAdaptationModel, newAdaptationModel));
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
      case AdaptUIPackage.MODEL__CONTEXT_MODEL:
        return basicSetContextModel(null, msgs);
      case AdaptUIPackage.MODEL__ADAPTATION_MODEL:
        return basicSetAdaptationModel(null, msgs);
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
      case AdaptUIPackage.MODEL__CONTEXT_MODEL:
        return getContextModel();
      case AdaptUIPackage.MODEL__ADAPTATION_MODEL:
        return getAdaptationModel();
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
      case AdaptUIPackage.MODEL__CONTEXT_MODEL:
        setContextModel((ContextModel)newValue);
        return;
      case AdaptUIPackage.MODEL__ADAPTATION_MODEL:
        setAdaptationModel((AdaptationModel)newValue);
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
      case AdaptUIPackage.MODEL__CONTEXT_MODEL:
        setContextModel((ContextModel)null);
        return;
      case AdaptUIPackage.MODEL__ADAPTATION_MODEL:
        setAdaptationModel((AdaptationModel)null);
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
      case AdaptUIPackage.MODEL__CONTEXT_MODEL:
        return contextModel != null;
      case AdaptUIPackage.MODEL__ADAPTATION_MODEL:
        return adaptationModel != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
