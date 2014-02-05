package org.xtext.example.hellobuck.util

import org.xtext.example.hellobuck.helloBuck.Greeting
import org.eclipse.emf.ecore.EObject
import org.xtext.example.hellobuck.helloBuck.Model

/**
 * Nothing special: just a class that will be used by the
 * ui plugin. This way we introduce a dependency.
 */
class HelloBuckUtil {
	
	def helloRepresentation(Greeting g) {
		g.name
	}

	def stringRepresentation(EObject o) {
		switch(o) {
			Model: "model"
			Greeting: "greeting"
			default: "don't know"
		}
	}
}