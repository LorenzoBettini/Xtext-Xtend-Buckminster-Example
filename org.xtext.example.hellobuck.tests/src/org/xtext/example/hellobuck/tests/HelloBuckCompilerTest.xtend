package org.xtext.example.hellobuck.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.hellobuck.HelloBuckInjectorProvider

import static org.junit.Assert.*
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.BeforeClass

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloBuckInjectorProvider))
class HelloBuckCompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@BeforeClass
	def static void setNewLine() {
		System::setProperty("line.separator", "\n")
	}
	
	@Test
	def void testGeneratedJava() {
		'''
			Hello foo!
			Hello bar!
		'''.compile[
			val obj = it.compiledClass.newInstance
			obj.invoke('hellofoo')
			assertEquals("Hello foo", obj.invoke('hellofoo'))
		]
	}
	
	@Test
	def void compareGeneratedJava() {
		'''
			Hello foo!
			Hello bar!
		'''.compile[assertEquals(
'''
package greetings;

public class Greetings {
  public String hellofoo() {
    return "Hello foo";
  }
  
  public String hellobar() {
    return "Hello bar";
  }
}
'''.toString, generatedCode)
		]
	}
	
	
}