/**
 * generated by Xtext 2.18.0
 */
package com.coffee;

import com.coffee.HlvlStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class HlvlStandaloneSetup extends HlvlStandaloneSetupGenerated {
  public static void doSetup() {
    new HlvlStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
