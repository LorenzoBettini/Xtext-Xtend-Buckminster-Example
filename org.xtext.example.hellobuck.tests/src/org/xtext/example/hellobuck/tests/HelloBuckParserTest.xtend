package org.xtext.example.hellobuck.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.hellobuck.HelloBuckInjectorProvider
import org.xtext.example.hellobuck.helloBuck.Model
import org.junit.BeforeClass

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloBuckInjectorProvider))
class HelloBuckParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@BeforeClass
	def static void setNewLine() {
		System::setProperty("line.separator", "\n")
	}

	@Test
	def void testParsingAndValidation() {
		'''
			Hello foo!
			Hello bar!
		'''.parse.assertNoErrors
	}
}