/*
 * generated by Xtext 2.32.0
 */
package org.xtext.algorithme.algo;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AlgoStandaloneSetup extends AlgoStandaloneSetupGenerated {

	public static void doSetup() {
		new AlgoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
