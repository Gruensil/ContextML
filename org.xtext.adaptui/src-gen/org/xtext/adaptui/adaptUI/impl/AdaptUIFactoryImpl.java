/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.adaptui.adaptUI.ActionCategory;
import org.xtext.adaptui.adaptUI.Actions;
import org.xtext.adaptui.adaptUI.AdaptCssClassOperation;
import org.xtext.adaptui.adaptUI.AdaptUIFactory;
import org.xtext.adaptui.adaptUI.AdaptUIPackage;
import org.xtext.adaptui.adaptUI.AdaptationModel;
import org.xtext.adaptui.adaptUI.AdaptationRule;
import org.xtext.adaptui.adaptUI.AddNavLinkOperation;
import org.xtext.adaptui.adaptUI.AddViewComponentButtonOperation;
import org.xtext.adaptui.adaptUI.AddViewComponentOperation;
import org.xtext.adaptui.adaptUI.BoolValue;
import org.xtext.adaptui.adaptUI.BooleanCondition;
import org.xtext.adaptui.adaptUI.ChangeColorSchemeOperation;
import org.xtext.adaptui.adaptUI.ChangeFontOperation;
import org.xtext.adaptui.adaptUI.ChangeFontSizeOperation;
import org.xtext.adaptui.adaptUI.ChangeTableCssClassOperation;
import org.xtext.adaptui.adaptUI.ClearNavOperation;
import org.xtext.adaptui.adaptUI.ConditionalAndExpression;
import org.xtext.adaptui.adaptUI.ConditionalOrExpression;
import org.xtext.adaptui.adaptUI.ConditionalPrimary;
import org.xtext.adaptui.adaptUI.ContextModel;
import org.xtext.adaptui.adaptUI.DefType;
import org.xtext.adaptui.adaptUI.DefTypes;
import org.xtext.adaptui.adaptUI.DeleteNavLinkOperation;
import org.xtext.adaptui.adaptUI.DeleteViewComponentButtonOperation;
import org.xtext.adaptui.adaptUI.DeleteViewComponentOperation;
import org.xtext.adaptui.adaptUI.DisplayPropertyValue;
import org.xtext.adaptui.adaptUI.EditFactOperation;
import org.xtext.adaptui.adaptUI.Entity;
import org.xtext.adaptui.adaptUI.Enums;
import org.xtext.adaptui.adaptUI.Fact;
import org.xtext.adaptui.adaptUI.FactName;
import org.xtext.adaptui.adaptUI.FactProperty;
import org.xtext.adaptui.adaptUI.Function;
import org.xtext.adaptui.adaptUI.FunctionList;
import org.xtext.adaptui.adaptUI.IntValue;
import org.xtext.adaptui.adaptUI.Model;
import org.xtext.adaptui.adaptUI.NumberCondition;
import org.xtext.adaptui.adaptUI.ParentOperation;
import org.xtext.adaptui.adaptUI.Property;
import org.xtext.adaptui.adaptUI.Provider;
import org.xtext.adaptui.adaptUI.RedirectNavLinkOperation;
import org.xtext.adaptui.adaptUI.Service;
import org.xtext.adaptui.adaptUI.ServiceFunctionCallOperation;
import org.xtext.adaptui.adaptUI.ServiceList;
import org.xtext.adaptui.adaptUI.SetDisplayPropertyOperation;
import org.xtext.adaptui.adaptUI.StringCondition;
import org.xtext.adaptui.adaptUI.StringValue;
import org.xtext.adaptui.adaptUI.TYPE;
import org.xtext.adaptui.adaptUI.UpdateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptUIFactoryImpl extends EFactoryImpl implements AdaptUIFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdaptUIFactory init()
  {
    try
    {
      AdaptUIFactory theAdaptUIFactory = (AdaptUIFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptUIPackage.eNS_URI);
      if (theAdaptUIFactory != null)
      {
        return theAdaptUIFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdaptUIFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptUIFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AdaptUIPackage.MODEL: return createModel();
      case AdaptUIPackage.CONTEXT_MODEL: return createContextModel();
      case AdaptUIPackage.ADAPTATION_MODEL: return createAdaptationModel();
      case AdaptUIPackage.SERVICE_LIST: return createServiceList();
      case AdaptUIPackage.SERVICE: return createService();
      case AdaptUIPackage.FUNCTION_LIST: return createFunctionList();
      case AdaptUIPackage.FUNCTION: return createFunction();
      case AdaptUIPackage.ADAPTATION_RULE: return createAdaptationRule();
      case AdaptUIPackage.CONDITIONAL_OR_EXPRESSION: return createConditionalOrExpression();
      case AdaptUIPackage.CONDITIONAL_AND_EXPRESSION: return createConditionalAndExpression();
      case AdaptUIPackage.CONDITIONAL_PRIMARY: return createConditionalPrimary();
      case AdaptUIPackage.BOOLEAN_CONDITION: return createBooleanCondition();
      case AdaptUIPackage.NUMBER_CONDITION: return createNumberCondition();
      case AdaptUIPackage.STRING_CONDITION: return createStringCondition();
      case AdaptUIPackage.FACT: return createFact();
      case AdaptUIPackage.FACT_NAME: return createFactName();
      case AdaptUIPackage.FACT_PROPERTY: return createFactProperty();
      case AdaptUIPackage.ACTIONS: return createActions();
      case AdaptUIPackage.ACTION_CATEGORY: return createActionCategory();
      case AdaptUIPackage.PARENT_OPERATION: return createParentOperation();
      case AdaptUIPackage.SERVICE_FUNCTION_CALL_OPERATION: return createServiceFunctionCallOperation();
      case AdaptUIPackage.EDIT_FACT_OPERATION: return createEditFactOperation();
      case AdaptUIPackage.SET_DISPLAY_PROPERTY_OPERATION: return createSetDisplayPropertyOperation();
      case AdaptUIPackage.DISPLAY_PROPERTY_VALUE: return createDisplayPropertyValue();
      case AdaptUIPackage.INT_VALUE: return createIntValue();
      case AdaptUIPackage.STRING_VALUE: return createStringValue();
      case AdaptUIPackage.BOOL_VALUE: return createBoolValue();
      case AdaptUIPackage.ADD_VIEW_COMPONENT_OPERATION: return createAddViewComponentOperation();
      case AdaptUIPackage.DELETE_VIEW_COMPONENT_OPERATION: return createDeleteViewComponentOperation();
      case AdaptUIPackage.ADD_VIEW_COMPONENT_BUTTON_OPERATION: return createAddViewComponentButtonOperation();
      case AdaptUIPackage.DELETE_VIEW_COMPONENT_BUTTON_OPERATION: return createDeleteViewComponentButtonOperation();
      case AdaptUIPackage.ADD_NAV_LINK_OPERATION: return createAddNavLinkOperation();
      case AdaptUIPackage.DELETE_NAV_LINK_OPERATION: return createDeleteNavLinkOperation();
      case AdaptUIPackage.REDIRECT_NAV_LINK_OPERATION: return createRedirectNavLinkOperation();
      case AdaptUIPackage.CLEAR_NAV_OPERATION: return createClearNavOperation();
      case AdaptUIPackage.CHANGE_FONT_SIZE_OPERATION: return createChangeFontSizeOperation();
      case AdaptUIPackage.CHANGE_COLOR_SCHEME_OPERATION: return createChangeColorSchemeOperation();
      case AdaptUIPackage.CHANGE_FONT_OPERATION: return createChangeFontOperation();
      case AdaptUIPackage.CHANGE_TABLE_CSS_CLASS_OPERATION: return createChangeTableCssClassOperation();
      case AdaptUIPackage.ADAPT_CSS_CLASS_OPERATION: return createAdaptCssClassOperation();
      case AdaptUIPackage.ENTITY: return createEntity();
      case AdaptUIPackage.PROPERTY: return createProperty();
      case AdaptUIPackage.PROVIDER: return createProvider();
      case AdaptUIPackage.DEF_TYPES: return createDefTypes();
      case AdaptUIPackage.DEF_TYPE: return createDefType();
      case AdaptUIPackage.ENUMS: return createEnums();
      case AdaptUIPackage.ENUM: return createEnum();
      case AdaptUIPackage.TYPE: return createTYPE();
      case AdaptUIPackage.UPDATE_TYPE: return createUpdateType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextModel createContextModel()
  {
    ContextModelImpl contextModel = new ContextModelImpl();
    return contextModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModel createAdaptationModel()
  {
    AdaptationModelImpl adaptationModel = new AdaptationModelImpl();
    return adaptationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceList createServiceList()
  {
    ServiceListImpl serviceList = new ServiceListImpl();
    return serviceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionList createFunctionList()
  {
    FunctionListImpl functionList = new FunctionListImpl();
    return functionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationRule createAdaptationRule()
  {
    AdaptationRuleImpl adaptationRule = new AdaptationRuleImpl();
    return adaptationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalOrExpression createConditionalOrExpression()
  {
    ConditionalOrExpressionImpl conditionalOrExpression = new ConditionalOrExpressionImpl();
    return conditionalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalAndExpression createConditionalAndExpression()
  {
    ConditionalAndExpressionImpl conditionalAndExpression = new ConditionalAndExpressionImpl();
    return conditionalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalPrimary createConditionalPrimary()
  {
    ConditionalPrimaryImpl conditionalPrimary = new ConditionalPrimaryImpl();
    return conditionalPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanCondition createBooleanCondition()
  {
    BooleanConditionImpl booleanCondition = new BooleanConditionImpl();
    return booleanCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberCondition createNumberCondition()
  {
    NumberConditionImpl numberCondition = new NumberConditionImpl();
    return numberCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringCondition createStringCondition()
  {
    StringConditionImpl stringCondition = new StringConditionImpl();
    return stringCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fact createFact()
  {
    FactImpl fact = new FactImpl();
    return fact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactName createFactName()
  {
    FactNameImpl factName = new FactNameImpl();
    return factName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactProperty createFactProperty()
  {
    FactPropertyImpl factProperty = new FactPropertyImpl();
    return factProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actions createActions()
  {
    ActionsImpl actions = new ActionsImpl();
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionCategory createActionCategory()
  {
    ActionCategoryImpl actionCategory = new ActionCategoryImpl();
    return actionCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentOperation createParentOperation()
  {
    ParentOperationImpl parentOperation = new ParentOperationImpl();
    return parentOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceFunctionCallOperation createServiceFunctionCallOperation()
  {
    ServiceFunctionCallOperationImpl serviceFunctionCallOperation = new ServiceFunctionCallOperationImpl();
    return serviceFunctionCallOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditFactOperation createEditFactOperation()
  {
    EditFactOperationImpl editFactOperation = new EditFactOperationImpl();
    return editFactOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetDisplayPropertyOperation createSetDisplayPropertyOperation()
  {
    SetDisplayPropertyOperationImpl setDisplayPropertyOperation = new SetDisplayPropertyOperationImpl();
    return setDisplayPropertyOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisplayPropertyValue createDisplayPropertyValue()
  {
    DisplayPropertyValueImpl displayPropertyValue = new DisplayPropertyValueImpl();
    return displayPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolValue createBoolValue()
  {
    BoolValueImpl boolValue = new BoolValueImpl();
    return boolValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddViewComponentOperation createAddViewComponentOperation()
  {
    AddViewComponentOperationImpl addViewComponentOperation = new AddViewComponentOperationImpl();
    return addViewComponentOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteViewComponentOperation createDeleteViewComponentOperation()
  {
    DeleteViewComponentOperationImpl deleteViewComponentOperation = new DeleteViewComponentOperationImpl();
    return deleteViewComponentOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddViewComponentButtonOperation createAddViewComponentButtonOperation()
  {
    AddViewComponentButtonOperationImpl addViewComponentButtonOperation = new AddViewComponentButtonOperationImpl();
    return addViewComponentButtonOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteViewComponentButtonOperation createDeleteViewComponentButtonOperation()
  {
    DeleteViewComponentButtonOperationImpl deleteViewComponentButtonOperation = new DeleteViewComponentButtonOperationImpl();
    return deleteViewComponentButtonOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddNavLinkOperation createAddNavLinkOperation()
  {
    AddNavLinkOperationImpl addNavLinkOperation = new AddNavLinkOperationImpl();
    return addNavLinkOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteNavLinkOperation createDeleteNavLinkOperation()
  {
    DeleteNavLinkOperationImpl deleteNavLinkOperation = new DeleteNavLinkOperationImpl();
    return deleteNavLinkOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RedirectNavLinkOperation createRedirectNavLinkOperation()
  {
    RedirectNavLinkOperationImpl redirectNavLinkOperation = new RedirectNavLinkOperationImpl();
    return redirectNavLinkOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClearNavOperation createClearNavOperation()
  {
    ClearNavOperationImpl clearNavOperation = new ClearNavOperationImpl();
    return clearNavOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeFontSizeOperation createChangeFontSizeOperation()
  {
    ChangeFontSizeOperationImpl changeFontSizeOperation = new ChangeFontSizeOperationImpl();
    return changeFontSizeOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeColorSchemeOperation createChangeColorSchemeOperation()
  {
    ChangeColorSchemeOperationImpl changeColorSchemeOperation = new ChangeColorSchemeOperationImpl();
    return changeColorSchemeOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeFontOperation createChangeFontOperation()
  {
    ChangeFontOperationImpl changeFontOperation = new ChangeFontOperationImpl();
    return changeFontOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeTableCssClassOperation createChangeTableCssClassOperation()
  {
    ChangeTableCssClassOperationImpl changeTableCssClassOperation = new ChangeTableCssClassOperationImpl();
    return changeTableCssClassOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptCssClassOperation createAdaptCssClassOperation()
  {
    AdaptCssClassOperationImpl adaptCssClassOperation = new AdaptCssClassOperationImpl();
    return adaptCssClassOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Provider createProvider()
  {
    ProviderImpl provider = new ProviderImpl();
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefTypes createDefTypes()
  {
    DefTypesImpl defTypes = new DefTypesImpl();
    return defTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefType createDefType()
  {
    DefTypeImpl defType = new DefTypeImpl();
    return defType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enums createEnums()
  {
    EnumsImpl enums = new EnumsImpl();
    return enums;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.adaptui.adaptUI.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TYPE createTYPE()
  {
    TYPEImpl type = new TYPEImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateType createUpdateType()
  {
    UpdateTypeImpl updateType = new UpdateTypeImpl();
    return updateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptUIPackage getAdaptUIPackage()
  {
    return (AdaptUIPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdaptUIPackage getPackage()
  {
    return AdaptUIPackage.eINSTANCE;
  }

} //AdaptUIFactoryImpl
