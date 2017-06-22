/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.adaptui.adaptUI.AdaptUIPackage;
import org.xtext.adaptui.adaptUI.AddViewComponentOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add View Component Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.AddViewComponentOperationImpl#getViewComp <em>View Comp</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.impl.AddViewComponentOperationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddViewComponentOperationImpl extends MinimalEObjectImpl.Container implements AddViewComponentOperation
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
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddViewComponentOperationImpl()
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
    return AdaptUIPackage.Literals.ADD_VIEW_COMPONENT_OPERATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__VIEW_COMP, oldViewComp, viewComp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__TARGET, oldTarget, target));
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
      case AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__VIEW_COMP:
        return getViewComp();
      case AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__TARGET:
        return getTarget();
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
      case AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__VIEW_COMP:
        setViewComp((String)newValue);
        return;
      case AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__TARGET:
        setTarget((String)newValue);
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
      case AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__VIEW_COMP:
        setViewComp(VIEW_COMP_EDEFAULT);
        return;
      case AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__TARGET:
        setTarget(TARGET_EDEFAULT);
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
      case AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__VIEW_COMP:
        return VIEW_COMP_EDEFAULT == null ? viewComp != null : !VIEW_COMP_EDEFAULT.equals(viewComp);
      case AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
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
    result.append(", target: ");
    result.append(target);
    result.append(')');
    return result.toString();
  }

} //AddViewComponentOperationImpl
