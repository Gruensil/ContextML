/**
 * generated by Xtext 2.12.0
 */
package org.xtext.contextml;

import org.xtext.contextml.ContextMLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ContextMLStandaloneSetup extends ContextMLStandaloneSetupGenerated {
  public static void doSetup() {
    new ContextMLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
