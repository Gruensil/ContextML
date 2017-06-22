/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.scoping;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.xtext.adaptui.adaptUI.AdaptUIPackage;
import org.xtext.adaptui.adaptUI.DefType;
import org.xtext.adaptui.adaptUI.Entity;
import org.xtext.adaptui.adaptUI.FactName;
import org.xtext.adaptui.adaptUI.Provider;
import org.xtext.adaptui.scoping.AbstractAdaptUIScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class AdaptUIScopeProvider extends AbstractAdaptUIScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if (((context instanceof Provider) && Objects.equal(reference, AdaptUIPackage.Literals.PROPERTY__PROVIDER))) {
      final EObject rootElement = EcoreUtil2.getRootContainer(context);
      final List<Provider> candidates = EcoreUtil2.<Provider>getAllContentsOfType(rootElement, Provider.class);
      return Scopes.scopeFor(candidates);
    } else {
      if (((context instanceof DefType) && Objects.equal(reference, AdaptUIPackage.Literals.TYPE__DEFTYPE))) {
        final EObject rootElement_1 = EcoreUtil2.getRootContainer(context);
        final List<DefType> candidates_1 = EcoreUtil2.<DefType>getAllContentsOfType(rootElement_1, DefType.class);
        return Scopes.scopeFor(candidates_1);
      } else {
        if (((context instanceof FactName) && Objects.equal(reference, AdaptUIPackage.Literals.FACT__FACT_NAME))) {
          final EObject rootElement_2 = EcoreUtil2.getRootContainer(context);
          final List<FactName> candidates_2 = EcoreUtil2.<FactName>getAllContentsOfType(rootElement_2, FactName.class);
          return Scopes.scopeFor(candidates_2);
        } else {
          if (((context instanceof Entity) && Objects.equal(reference, AdaptUIPackage.Literals.FACT__ENTITY))) {
            final EObject rootElement_3 = EcoreUtil2.getRootContainer(context);
            final List<Entity> candidates_3 = EcoreUtil2.<Entity>getAllContentsOfType(rootElement_3, Entity.class);
            return Scopes.scopeFor(candidates_3);
          }
        }
      }
    }
    return super.getScope(context, reference);
  }
}
