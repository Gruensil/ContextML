/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.adaptdsl.adaptDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage;
import org.xtext.example.adaptdsl.adaptDsl.ServiceFunctionCallOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Function Call Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.ServiceFunctionCallOperationImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.ServiceFunctionCallOperationImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.ServiceFunctionCallOperationImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceFunctionCallOperationImpl extends MinimalEObjectImpl.Container implements ServiceFunctionCallOperation
{
  /**
   * The default value of the '{@link #getService() <em>Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected static final String SERVICE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected String service = SERVICE_EDEFAULT;

  /**
   * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected String function = FUNCTION_EDEFAULT;

  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final String VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected String val = VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceFunctionCallOperationImpl()
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
    return AdaptDslPackage.Literals.SERVICE_FUNCTION_CALL_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getService()
  {
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setService(String newService)
  {
    String oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__SERVICE, oldService, service));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(String newFunction)
  {
    String oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(String newVal)
  {
    String oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__VAL, oldVal, val));
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
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__SERVICE:
        return getService();
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__FUNCTION:
        return getFunction();
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__VAL:
        return getVal();
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
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__SERVICE:
        setService((String)newValue);
        return;
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__FUNCTION:
        setFunction((String)newValue);
        return;
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__VAL:
        setVal((String)newValue);
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
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__SERVICE:
        setService(SERVICE_EDEFAULT);
        return;
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__FUNCTION:
        setFunction(FUNCTION_EDEFAULT);
        return;
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__VAL:
        setVal(VAL_EDEFAULT);
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
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__SERVICE:
        return SERVICE_EDEFAULT == null ? service != null : !SERVICE_EDEFAULT.equals(service);
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__FUNCTION:
        return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
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
    result.append(" (service: ");
    result.append(service);
    result.append(", function: ");
    result.append(function);
    result.append(", val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //ServiceFunctionCallOperationImpl
