/*
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.validation

import org.eclipse.xtext.validation.Check
import org.xtext.adaptui.adaptUI.AdaptUIPackage
import org.xtext.adaptui.adaptUI.Provider
import org.xtext.adaptui.adaptUI.Entity
import org.xtext.adaptui.adaptUI.ContextModel

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AdaptUIValidator extends AbstractAdaptUIValidator {
//	Not required anymore due to working ScopeProvider --->>>
//	@Check
//	//Loop trough all Defined Providers for all Provides mentioned in the Attributes an compare
//	def void isProviderDefined(Model model) {			
//		for(ent: model.getContextModel().getEntity()){
//			for(attr: ent.getProperty()){
//				var defined = false;
//				for(prov: model.getContextModel().getProvider()){
//					if(attr.getProvider().getName() == prov.getName()){
//						//the Provider is defined
//						defined = true;
//					}
//				}
//				if(!defined){
//					error('One of the Providers is not listed or misspelled.', AdaptDslPackage$Literals::MODEL__CONTEXT_MODEL);
//				}
//			}
//		}
//	}<<<---
	
	@Check
	def void isProviderNotEmpty(Provider provider) {		
		if(provider.getName() == ""){
			error('Provider Name shall not be empty', AdaptUIPackage$Literals::PROVIDER__NAME);
		}
	}
	
	@Check
	def void isEntityUnique(ContextModel contextModel) {
		var i = 0;
		for(firstEnt: contextModel.getEntity()){
			i += 1;
			var j = 0;
			for(secEnt: contextModel.getEntity()){
				j +=1;
				if(firstEnt.getName()==secEnt.getName() && i!=j){
					error('Entity names must be unique in a Context Model.', AdaptUIPackage$Literals::CONTEXT_MODEL__ENTITY)
				}
			}
		}
	}
	
	@Check
	def void isPropertyUnique(Entity entity) {
		var i = 0;
		for(firstProp: entity.getProperty()){
			i += 1;
			var j = 0;
			for(secProp: entity.getProperty()){
				j += 1;
				if(firstProp.getName() ==secProp.getName() && i!=j){
					error('Property names must be unique in an Entity.', AdaptUIPackage$Literals::ENTITY__PROPERTY)
				}
			}
		}
	}
	
	@Check
	def void isProviderUnique(ContextModel contextModel) {
		var i = 0;
		for(firstProv: contextModel.getProvider()){
			i += 1;
			var j = 0;
			for(secProv: contextModel.getProvider()){
				j += 1;
				if(firstProv.getName() ==secProv.getName() && i!=j){
					error('Provider names must be unique in a Context Model.', AdaptUIPackage$Literals::CONTEXT_MODEL__PROVIDER)
				}
			}
		}
	}
}

