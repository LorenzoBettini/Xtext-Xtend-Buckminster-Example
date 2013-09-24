package org.xtext.example.hellobuck.util

import org.xtext.example.hellobuck.helloBuck.Greeting

/**
 * Nothing special: just a class that will be used by the
 * ui plugin. This way we introduce a dependency.
 */
class HelloBuckUtil {
	
	def helloRepresentation(Greeting g) {
		g.name
	}
}