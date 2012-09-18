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
		return Lists.newArrayList(DSL_GENERATOR_PROJECT_NAME);
	}
}
