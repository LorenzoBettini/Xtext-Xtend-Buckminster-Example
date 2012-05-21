package org.xtext.example.hellobuck.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	HelloBuckParserTest.class,
	HelloBuckCompilerTest.class
})
class HelloBuckAllTests {
	
}