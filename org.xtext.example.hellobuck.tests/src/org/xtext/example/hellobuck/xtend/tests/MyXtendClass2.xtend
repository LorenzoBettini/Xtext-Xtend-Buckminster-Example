package org.xtext.example.hellobuck.xtend.tests

/**
 * Useless class; it just depends on an Xtend class (which in turn
 * depends on this class).
 */
class MyXtendClass2 {

	def bar2(MyXtendClass jc) {
		jc.toString
	}
}
