/*
* generated by Xtext
*/
package org.xtext.example.hellobuck.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.hellobuck.services.HelloBuckGrammarAccess;

public class HelloBuckParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private HelloBuckGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.hellobuck.parser.antlr.internal.InternalHelloBuckParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.hellobuck.parser.antlr.internal.InternalHelloBuckParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public HelloBuckGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HelloBuckGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
