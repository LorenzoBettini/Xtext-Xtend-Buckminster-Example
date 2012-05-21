
package org.xtext.example.hellobuck;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HelloBuckStandaloneSetup extends HelloBuckStandaloneSetupGenerated{

	public static void doSetup() {
		new HelloBuckStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

