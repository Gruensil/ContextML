/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.adaptdsl.adaptDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage;
import org.xtext.example.adaptdsl.adaptDsl.DeleteViewComponentOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete View Component Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.DeleteViewComponentOperationImpl#getViewComp <em>View Comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteViewComponentOperationImpl extends MinimalEObjectImpl.Container implements DeleteViewComponentOperation
{
  /**
   * The default value of the '{@link #getViewComp() <em>View Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewComp()
   * @generated
   * @ordered
   */
  protected static final String VIEW_COMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewComp() <em>View Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewComp()
   * @generated
   * @ordered
   */
  protected String viewComp = VIEW_COMP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeleteViewComponentOperationImpl()
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
    return AdaptDslPackage.Literals.DELETE_VIEW_COMPONENT_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewComp()
  {
    return viewComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewComp(String newViewComp)
  {
    String oldViewComp = viewComp;
    viewComp = newViewComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.DELETE_VIEW_COMPONENT_OPERATION__VIEW_COMP, oldViewComp, viewComp));
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
      case AdaptDslPackage.DELETE_VIEW_COMPONENT_OPERATION__VIEW_COMP:
        return getViewComp();
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
      case AdaptDslPackage.DELETE_VIEW_COMPONENT_OPERATION__VIEW_COMP:
        setViewComp((String)newValue);
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
      case AdaptDslPackage.DELETE_VIEW_COMPONENT_OPERATION__VIEW_COMP:
        setViewComp(VIEW_COMP_EDEFAULT);
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
      case AdaptDslPackage.DELETE_VIEW_COMPONENT_OPERATION__VIEW_COMP:
        return VIEW_COMP_EDEFAULT == null ? viewComp != null : !VIEW_COMP_EDEFAULT.equals(viewComp);
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
    result.append(" (viewComp: ");
    result.append(viewComp);
    result.append(')');
    return result.toString();
  }

} //DeleteViewComponentOperationImpl
