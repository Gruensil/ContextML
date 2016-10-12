/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.adaptdsl.adaptDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.adaptdsl.adaptDsl.Actions;
import org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage;
import org.xtext.example.adaptdsl.adaptDsl.AdaptationRule;
import org.xtext.example.adaptdsl.adaptDsl.ConditionalOrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.AdaptationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.AdaptationRuleImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.AdaptationRuleImpl#getFactType <em>Fact Type</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.AdaptationRuleImpl#getFactName <em>Fact Name</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.AdaptationRuleImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.AdaptationRuleImpl#getActionCollection <em>Action Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptationRuleImpl extends MinimalEObjectImpl.Container implements AdaptationRule
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final int LEVEL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected int level = LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getFactType() <em>Fact Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactType()
   * @generated
   * @ordered
   */
  protected static final String FACT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactType() <em>Fact Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactType()
   * @generated
   * @ordered
   */
  protected String factType = FACT_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getFactName() <em>Fact Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactName()
   * @generated
   * @ordered
   */
  protected static final String FACT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactName() <em>Fact Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactName()
   * @generated
   * @ordered
   */
  protected String factName = FACT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected ConditionalOrExpression expr;

  /**
   * The cached value of the '{@link #getActionCollection() <em>Action Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionCollection()
   * @generated
   * @ordered
   */
  protected Actions actionCollection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdaptationRuleImpl()
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
    return AdaptDslPackage.Literals.ADAPTATION_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ADAPTATION_RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(int newLevel)
  {
    int oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ADAPTATION_RULE__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactType()
  {
    return factType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactType(String newFactType)
  {
    String oldFactType = factType;
    factType = newFactType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ADAPTATION_RULE__FACT_TYPE, oldFactType, factType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactName()
  {
    return factName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactName(String newFactName)
  {
    String oldFactName = factName;
    factName = newFactName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ADAPTATION_RULE__FACT_NAME, oldFactName, factName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalOrExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(ConditionalOrExpression newExpr, NotificationChain msgs)
  {
    ConditionalOrExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ADAPTATION_RULE__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(ConditionalOrExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptDslPackage.ADAPTATION_RULE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptDslPackage.ADAPTATION_RULE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ADAPTATION_RULE__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actions getActionCollection()
  {
    return actionCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionCollection(Actions newActionCollection, NotificationChain msgs)
  {
    Actions oldActionCollection = actionCollection;
    actionCollection = newActionCollection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ADAPTATION_RULE__ACTION_COLLECTION, oldActionCollection, newActionCollection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionCollection(Actions newActionCollection)
  {
    if (newActionCollection != actionCollection)
    {
      NotificationChain msgs = null;
      if (actionCollection != null)
        msgs = ((InternalEObject)actionCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptDslPackage.ADAPTATION_RULE__ACTION_COLLECTION, null, msgs);
      if (newActionCollection != null)
        msgs = ((InternalEObject)newActionCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptDslPackage.ADAPTATION_RULE__ACTION_COLLECTION, null, msgs);
      msgs = basicSetActionCollection(newActionCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.ADAPTATION_RULE__ACTION_COLLECTION, newActionCollection, newActionCollection));
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
      case AdaptDslPackage.ADAPTATION_RULE__EXPR:
        return basicSetExpr(null, msgs);
      case AdaptDslPackage.ADAPTATION_RULE__ACTION_COLLECTION:
        return basicSetActionCollection(null, msgs);
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
      case AdaptDslPackage.ADAPTATION_RULE__NAME:
        return getName();
      case AdaptDslPackage.ADAPTATION_RULE__LEVEL:
        return getLevel();
      case AdaptDslPackage.ADAPTATION_RULE__FACT_TYPE:
        return getFactType();
      case AdaptDslPackage.ADAPTATION_RULE__FACT_NAME:
        return getFactName();
      case AdaptDslPackage.ADAPTATION_RULE__EXPR:
        return getExpr();
      case AdaptDslPackage.ADAPTATION_RULE__ACTION_COLLECTION:
        return getActionCollection();
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
      case AdaptDslPackage.ADAPTATION_RULE__NAME:
        setName((String)newValue);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__LEVEL:
        setLevel((Integer)newValue);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__FACT_TYPE:
        setFactType((String)newValue);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__FACT_NAME:
        setFactName((String)newValue);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__EXPR:
        setExpr((ConditionalOrExpression)newValue);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__ACTION_COLLECTION:
        setActionCollection((Actions)newValue);
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
      case AdaptDslPackage.ADAPTATION_RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__FACT_TYPE:
        setFactType(FACT_TYPE_EDEFAULT);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__FACT_NAME:
        setFactName(FACT_NAME_EDEFAULT);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__EXPR:
        setExpr((ConditionalOrExpression)null);
        return;
      case AdaptDslPackage.ADAPTATION_RULE__ACTION_COLLECTION:
        setActionCollection((Actions)null);
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
      case AdaptDslPackage.ADAPTATION_RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdaptDslPackage.ADAPTATION_RULE__LEVEL:
        return level != LEVEL_EDEFAULT;
      case AdaptDslPackage.ADAPTATION_RULE__FACT_TYPE:
        return FACT_TYPE_EDEFAULT == null ? factType != null : !FACT_TYPE_EDEFAULT.equals(factType);
      case AdaptDslPackage.ADAPTATION_RULE__FACT_NAME:
        return FACT_NAME_EDEFAULT == null ? factName != null : !FACT_NAME_EDEFAULT.equals(factName);
      case AdaptDslPackage.ADAPTATION_RULE__EXPR:
        return expr != null;
      case AdaptDslPackage.ADAPTATION_RULE__ACTION_COLLECTION:
        return actionCollection != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", level: ");
    result.append(level);
    result.append(", factType: ");
    result.append(factType);
    result.append(", factName: ");
    result.append(factName);
    result.append(')');
    return result.toString();
  }

} //AdaptationRuleImpl