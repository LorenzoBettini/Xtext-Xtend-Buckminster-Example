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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloBuckInjectorProvider))
class CompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test
	def void testGeneratedJava() {
		'''
			entity Foo {
				name : String
				op doStuff(String x) : String {
					return x + ' ' + this.name
				}
			}
		'''.compile[
			val obj = it.compiledClass.newInstance
			obj.invoke('setName', 'Foo')
			assertEquals("Hello Foo", obj.invoke('doStuff','Hello'))
		]
	}
	
	@Test
	def void compareGeneratedJava() {
		'''
			entity Foo {
				name : String
			}
		'''.compile[assertEquals('''
			import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
			
			public class Foo {
			  public Foo() {
			  }
			  
			  public Foo(final Procedure1<Foo> initializer) {
			    initializer.apply(this);
			  }
			  
			  private String name;
			  
			  public String getName() {
			    return this.name;
			  }
			  
			  public void setName(final String name) {
			    this.name = name;
			  }
			  
			  public String toString() {
			    StringBuilder result = new StringBuilder("\nFoo {");
			    result.append("\n  name = ").append(String.valueOf(name).replace("\n","\n  "));
			    result.append("\n}");
			    return result.toString();
			    
			  }
			}
		'''.toString, generatedCode)
		]
	}
	
	
}