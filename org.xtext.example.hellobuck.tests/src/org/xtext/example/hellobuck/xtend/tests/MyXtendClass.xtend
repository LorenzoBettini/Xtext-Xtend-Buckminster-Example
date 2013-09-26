package org.xtext.example.hellobuck.xtend.tests

/**
 * Useless class; it just depends on a Java class (which in turn
 * depends on this Xtend class).
 */
class MyXtendClass {

	def bar(MyJavaClass jc) {
		jc.toString
	}
	
	def foo(MyXtendClass2 jc) {
		jc.toString
	}
}
