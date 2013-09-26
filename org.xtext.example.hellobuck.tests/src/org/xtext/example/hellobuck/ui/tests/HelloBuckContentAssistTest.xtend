package org.xtext.example.hellobuck.ui.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.hellobuck.HelloBuckUiInjectorProvider
import org.xtext.example.hellobuck.ui.util.HelloBuckUiUtil

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloBuckUiInjectorProvider))
class HelloBuckContentAssistTest extends AbstractContentAssistTest {
	
	// we don't use it, it's just to depend on the UI plugin
	protected HelloBuckUiUtil util
	
	@Test def void testInitialCompletion() {
		newBuilder.assertText('Hello')
	}

}