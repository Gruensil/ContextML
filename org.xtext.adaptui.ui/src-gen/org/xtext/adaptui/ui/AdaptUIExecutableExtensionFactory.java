/*
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.adaptui.ui.internal.AdaptuiActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AdaptUIExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AdaptuiActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AdaptuiActivator.getInstance().getInjector(AdaptuiActivator.ORG_XTEXT_ADAPTUI_ADAPTUI);
	}
	
}