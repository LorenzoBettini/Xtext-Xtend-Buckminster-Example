/**
 * 
 */
package org.xtext.example.hellobuck.ui.wizard;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author bettini
 *
 */
public class HelloBuckProjectCreatorCustom extends HelloBuckProjectCreator {

	@Override
	protected List<String> getRequiredBundles() {
		return Lists.newArrayList(
				"com.ibm.icu",
				"org.eclipse.xtext", 
				"org.eclipse.xtext.generator",
				"org.eclipse.xtend",
				"org.eclipse.xtend.typesystem.emf",
				"org.eclipse.xpand",
				"org.eclipse.emf.mwe2.launch;resolution:=optional",
				DSL_GENERATOR_PROJECT_NAME);
	}
}
