/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.adaptui.adaptUI.AdaptUIPackage
 * @generated
 */
public interface AdaptUIFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdaptUIFactory eINSTANCE = org.xtext.adaptui.adaptUI.impl.AdaptUIFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Context Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Model</em>'.
   * @generated
   */
  ContextModel createContextModel();

  /**
   * Returns a new object of class '<em>Adaptation Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Adaptation Model</em>'.
   * @generated
   */
  AdaptationModel createAdaptationModel();

  /**
   * Returns a new object of class '<em>Service List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service List</em>'.
   * @generated
   */
  ServiceList createServiceList();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Function List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function List</em>'.
   * @generated
   */
  FunctionList createFunctionList();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Adaptation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Adaptation Rule</em>'.
   * @generated
   */
  AdaptationRule createAdaptationRule();

  /**
   * Returns a new object of class '<em>Conditional Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Or Expression</em>'.
   * @generated
   */
  ConditionalOrExpression createConditionalOrExpression();

  /**
   * Returns a new object of class '<em>Conditional And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional And Expression</em>'.
   * @generated
   */
  ConditionalAndExpression createConditionalAndExpression();

  /**
   * Returns a new object of class '<em>Conditional Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Primary</em>'.
   * @generated
   */
  ConditionalPrimary createConditionalPrimary();

  /**
   * Returns a new object of class '<em>Boolean Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Condition</em>'.
   * @generated
   */
  BooleanCondition createBooleanCondition();

  /**
   * Returns a new object of class '<em>Number Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Condition</em>'.
   * @generated
   */
  NumberCondition createNumberCondition();

  /**
   * Returns a new object of class '<em>String Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Condition</em>'.
   * @generated
   */
  StringCondition createStringCondition();

  /**
   * Returns a new object of class '<em>Fact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fact</em>'.
   * @generated
   */
  Fact createFact();

  /**
   * Returns a new object of class '<em>Fact Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fact Name</em>'.
   * @generated
   */
  FactName createFactName();

  /**
   * Returns a new object of class '<em>Fact Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fact Property</em>'.
   * @generated
   */
  FactProperty createFactProperty();

  /**
   * Returns a new object of class '<em>Actions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actions</em>'.
   * @generated
   */
  Actions createActions();

  /**
   * Returns a new object of class '<em>Action Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Category</em>'.
   * @generated
   */
  ActionCategory createActionCategory();

  /**
   * Returns a new object of class '<em>Parent Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent Operation</em>'.
   * @generated
   */
  ParentOperation createParentOperation();

  /**
   * Returns a new object of class '<em>Service Function Call Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Function Call Operation</em>'.
   * @generated
   */
  ServiceFunctionCallOperation createServiceFunctionCallOperation();

  /**
   * Returns a new object of class '<em>Edit Fact Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edit Fact Operation</em>'.
   * @generated
   */
  EditFactOperation createEditFactOperation();

  /**
   * Returns a new object of class '<em>Set Display Property Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Display Property Operation</em>'.
   * @generated
   */
  SetDisplayPropertyOperation createSetDisplayPropertyOperation();

  /**
   * Returns a new object of class '<em>Display Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Display Property Value</em>'.
   * @generated
   */
  DisplayPropertyValue createDisplayPropertyValue();

  /**
   * Returns a new object of class '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Value</em>'.
   * @generated
   */
  IntValue createIntValue();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Bool Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Value</em>'.
   * @generated
   */
  BoolValue createBoolValue();

  /**
   * Returns a new object of class '<em>Add View Component Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add View Component Operation</em>'.
   * @generated
   */
  AddViewComponentOperation createAddViewComponentOperation();

  /**
   * Returns a new object of class '<em>Delete View Component Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete View Component Operation</em>'.
   * @generated
   */
  DeleteViewComponentOperation createDeleteViewComponentOperation();

  /**
   * Returns a new object of class '<em>Add View Component Button Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add View Component Button Operation</em>'.
   * @generated
   */
  AddViewComponentButtonOperation createAddViewComponentButtonOperation();

  /**
   * Returns a new object of class '<em>Delete View Component Button Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete View Component Button Operation</em>'.
   * @generated
   */
  DeleteViewComponentButtonOperation createDeleteViewComponentButtonOperation();

  /**
   * Returns a new object of class '<em>Add Nav Link Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Nav Link Operation</em>'.
   * @generated
   */
  AddNavLinkOperation createAddNavLinkOperation();

  /**
   * Returns a new object of class '<em>Delete Nav Link Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Nav Link Operation</em>'.
   * @generated
   */
  DeleteNavLinkOperation createDeleteNavLinkOperation();

  /**
   * Returns a new object of class '<em>Redirect Nav Link Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Redirect Nav Link Operation</em>'.
   * @generated
   */
  RedirectNavLinkOperation createRedirectNavLinkOperation();

  /**
   * Returns a new object of class '<em>Clear Nav Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clear Nav Operation</em>'.
   * @generated
   */
  ClearNavOperation createClearNavOperation();

  /**
   * Returns a new object of class '<em>Change Font Size Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Font Size Operation</em>'.
   * @generated
   */
  ChangeFontSizeOperation createChangeFontSizeOperation();

  /**
   * Returns a new object of class '<em>Change Color Scheme Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Color Scheme Operation</em>'.
   * @generated
   */
  ChangeColorSchemeOperation createChangeColorSchemeOperation();

  /**
   * Returns a new object of class '<em>Change Font Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Font Operation</em>'.
   * @generated
   */
  ChangeFontOperation createChangeFontOperation();

  /**
   * Returns a new object of class '<em>Change Table Css Class Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Table Css Class Operation</em>'.
   * @generated
   */
  ChangeTableCssClassOperation createChangeTableCssClassOperation();

  /**
   * Returns a new object of class '<em>Adapt Css Class Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Adapt Css Class Operation</em>'.
   * @generated
   */
  AdaptCssClassOperation createAdaptCssClassOperation();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provider</em>'.
   * @generated
   */
  Provider createProvider();

  /**
   * Returns a new object of class '<em>Def Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Types</em>'.
   * @generated
   */
  DefTypes createDefTypes();

  /**
   * Returns a new object of class '<em>Def Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Type</em>'.
   * @generated
   */
  DefType createDefType();

  /**
   * Returns a new object of class '<em>Enums</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enums</em>'.
   * @generated
   */
  Enums createEnums();

  /**
   * Returns a new object of class '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum</em>'.
   * @generated
   */
  Enum createEnum();

  /**
   * Returns a new object of class '<em>TYPE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TYPE</em>'.
   * @generated
   */
  TYPE createTYPE();

  /**
   * Returns a new object of class '<em>Update Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Type</em>'.
   * @generated
   */
  UpdateType createUpdateType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AdaptUIPackage getAdaptUIPackage();

} //AdaptUIFactory
