/*
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.adaptui.AdaptUIRuntimeModule
import org.xtext.adaptui.AdaptUIStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class AdaptUIIdeSetup extends AdaptUIStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AdaptUIRuntimeModule, new AdaptUIIdeModule))
	}
	
}
