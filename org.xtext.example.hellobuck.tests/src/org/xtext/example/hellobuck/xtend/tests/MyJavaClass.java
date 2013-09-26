package org.xtext.example.hellobuck.xtend.tests;

/**
 * Useless class; it just depends on an Xtend class (which in turn
 * depends on this class).
 */
public class MyJavaClass {

	public void foo(MyXtendClass c) {
		System.out.println(c);
	}
}
