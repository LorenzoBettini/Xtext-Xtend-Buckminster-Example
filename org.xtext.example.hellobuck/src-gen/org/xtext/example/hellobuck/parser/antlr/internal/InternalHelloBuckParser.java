package org.xtext.example.hellobuck.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.hellobuck.services.HelloBuckGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHelloBuckParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalHelloBuckParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloBuckParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloBuckParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g"; }



     	private HelloBuckGrammarAccess grammarAccess;
     	
        public InternalHelloBuckParser(TokenStream input, HelloBuckGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HelloBuckGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:79:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:82:3: lv_greetings_0_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"greetings",
            	              		lv_greetings_0_0, 
            	              		"Greeting");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:107:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:108:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:115:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:118:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:119:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGreeting213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGreetingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGreeting247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:153:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:154:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:155:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression283);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression293); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:162:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:165:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:167:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression339);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:183:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:184:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:185:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment373);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment383); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:192:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:195:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:196:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:196:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_ID && LA3_1<=RULE_DECIMAL)||LA3_1==14||(LA3_1>=16 && LA3_1<=44)||(LA3_1>=46 && LA3_1<=72)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==15) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_DECIMAL)||LA3_0==14||LA3_0==25||(LA3_0>=31 && LA3_0<=32)||LA3_0==42||LA3_0==44||LA3_0==48||LA3_0==50||LA3_0==52||(LA3_0>=56 && LA3_0<=58)||LA3_0==61||(LA3_0>=63 && LA3_0<=70)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:196:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:196:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:196:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:196:3: ()
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:197:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:202:2: ( ( ruleValidID ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:203:1: ( ruleValidID )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:203:1: ( ruleValidID )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:204:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment441);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment457);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:225:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:226:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:226:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:227:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment477);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:244:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:244:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:245:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment507);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:253:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==16) ) {
                        int LA2_1 = input.LA(2);

                        if ( (synpred1_InternalHelloBuck()) ) {
                            alt2=1;
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:253:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:253:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:253:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:258:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:258:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:258:7: ()
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:259:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:264:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:265:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:265:1: ( ruleOpMultiAssign )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:266:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment560);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:279:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:280:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:280:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:281:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment583);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:305:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:306:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:307:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign623);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign634); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:314:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:317:28: (kw= '=' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:319:2: kw= '='
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleOpSingleAssign671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:332:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:333:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:334:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign711);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign722); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:341:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:344:28: (kw= '+=' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:346:2: kw= '+='
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpMultiAssign759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:359:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:360:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:361:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression798);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression808); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:368:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:371:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:372:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:372:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:373:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression855);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:381:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred2_InternalHelloBuck()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:381:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:381:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:381:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:386:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:386:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:386:7: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:387:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:392:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:393:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:393:1: ( ruleOpOr )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:394:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression908);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:407:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:408:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:408:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:409:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression931);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:433:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:434:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:435:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr970);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr981); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:442:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:445:28: (kw= '||' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:447:2: kw= '||'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpOr1018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:460:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:461:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:462:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1057);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1067); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:469:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:472:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:473:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:473:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:474:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1114);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:482:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred3_InternalHelloBuck()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:482:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:482:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:482:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:487:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:487:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:487:7: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:488:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:493:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:494:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:494:1: ( ruleOpAnd )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:495:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1167);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:508:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:509:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:509:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:510:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1190);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:534:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:535:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:536:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1229);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1240); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:543:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:546:28: (kw= '&&' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:548:2: kw= '&&'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpAnd1277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:561:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:562:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:563:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1316);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1326); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:570:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:573:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:574:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:574:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:575:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1373);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:583:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred4_InternalHelloBuck()) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==20) ) {
                    int LA6_3 = input.LA(2);

                    if ( (synpred4_InternalHelloBuck()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:583:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:583:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:583:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:588:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:588:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:588:7: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:589:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:594:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:595:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:595:1: ( ruleOpEquality )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:596:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1426);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:609:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:610:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:610:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:611:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1449);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:635:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:636:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:637:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1488);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1499); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:644:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:647:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:648:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:648:1: (kw= '==' | kw= '!=' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:649:2: kw= '=='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpEquality1537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:656:2: kw= '!='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality1556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:669:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:670:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:671:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1596);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1606); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:678:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:681:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:682:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:682:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:683:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1653);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop8:
            do {
                int alt8=3;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (synpred6_InternalHelloBuck()) ) {
                        alt8=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (synpred6_InternalHelloBuck()) ) {
                        alt8=2;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (synpred5_InternalHelloBuck()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA8_5 = input.LA(2);

                    if ( (synpred6_InternalHelloBuck()) ) {
                        alt8=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA8_6 = input.LA(2);

                    if ( (synpred6_InternalHelloBuck()) ) {
                        alt8=2;
                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:693:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:693:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:693:6: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:694:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXRelationalExpression1689); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:703:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:704:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:704:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:705:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1712);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:727:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:727:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:727:7: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:728:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:733:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:734:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:734:1: ( ruleOpCompare )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:735:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1773);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:748:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:749:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:749:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:750:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1796);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:774:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:775:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:776:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare1836);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare1847); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:783:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:786:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:787:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:787:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:788:2: kw= '>='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpCompare1885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:795:2: kw= '<='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare1904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:802:2: kw= '>'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare1923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:809:2: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare1942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:822:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:823:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:824:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression1982);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression1992); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:831:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:834:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:835:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:835:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:836:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2039);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:844:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:844:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:844:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:844:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:849:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:849:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:849:7: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:850:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:855:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:856:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:856:1: ( ruleOpOther )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:857:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2092);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:870:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:871:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:871:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:872:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2115);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:896:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:897:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:898:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2154);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2165); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:905:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:908:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:909:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:909:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:910:2: kw= '->'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:917:2: kw= '..'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:924:2: kw= '=>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:930:6: (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:930:6: (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:931:2: kw= '>' kw= '>' ( ( '>' )=>kw= '>' )?
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1()); 
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:942:1: ( ( '>' )=>kw= '>' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) && (synpred8_InternalHelloBuck())) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:942:2: ( '>' )=>kw= '>'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2296); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:951:6: (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:951:6: (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:952:2: kw= '<' kw= '<' ( ( '<' )=>kw= '<' )?
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1()); 
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:963:1: ( ( '<' )=>kw= '<' )?
                    int alt12=2;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:963:2: ( '<' )=>kw= '<'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2354); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:972:6: (kw= '<' kw= '>' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:972:6: (kw= '<' kw= '>' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:973:2: kw= '<' kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_5_0()); 
                          
                    }
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:986:2: kw= '?:'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:993:2: kw= '<=>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1006:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1007:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1008:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2469);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2479); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1015:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1018:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1019:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1019:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1020:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2526);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1028:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred10_InternalHelloBuck()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==32) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred10_InternalHelloBuck()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1028:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1028:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1028:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1033:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1033:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1033:7: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1034:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1039:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:1: ( ruleOpAdd )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1041:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2579);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1054:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1055:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1055:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1056:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2602);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1080:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1081:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1082:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2641);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2652); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1089:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1092:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1093:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1093:1: (kw= '+' | kw= '-' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1094:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAdd2690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1101:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd2709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1114:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1115:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1116:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2749);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2759); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1123:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1126:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1127:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1127:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1128:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2806);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1136:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred11_InternalHelloBuck()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred11_InternalHelloBuck()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred11_InternalHelloBuck()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred11_InternalHelloBuck()) ) {
                        alt16=1;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1136:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1136:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1136:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1141:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1141:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1141:7: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1142:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1147:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:1: ( ruleOpMulti )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1149:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2859);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1162:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1163:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1163:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1164:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2882);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1188:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1189:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1190:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti2921);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti2932); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1197:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1200:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1201:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1201:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 35:
                {
                alt17=3;
                }
                break;
            case 36:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1202:2: kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti2970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1209:2: kw= '**'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti2989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1216:2: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1223:2: kw= '%'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1236:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1237:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1238:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3067);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3077); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1245:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1248:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1249:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1249:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14||(LA18_0>=31 && LA18_0<=32)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_DECIMAL)||LA18_0==25||LA18_0==42||LA18_0==44||LA18_0==48||LA18_0==50||LA18_0==52||(LA18_0>=56 && LA18_0<=58)||LA18_0==61||(LA18_0>=63 && LA18_0<=70)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1249:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1249:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1249:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1249:3: ()
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1250:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1255:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1256:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1256:1: ( ruleOpUnary )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1257:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3135);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1270:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1271:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1271:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1272:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3156);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1290:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3185);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1306:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1307:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1308:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3221);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1315:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1318:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1319:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1319:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 31:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1320:2: kw= '!'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleOpUnary3270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1327:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1334:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpUnary3308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1347:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1348:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1349:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3348);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3358); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1356:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1359:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1360:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1360:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1361:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3405);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1369:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred12_InternalHelloBuck()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1369:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1369:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1369:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1371:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1371:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1371:6: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1372:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXCastedExpression3440); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1382:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1382:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1383:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3463);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1407:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1408:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1409:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3501);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3511); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1416:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1419:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1420:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1420:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1421:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3558);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop28:
            do {
                int alt28=3;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred13_InternalHelloBuck()) ) {
                        alt28=1;
                    }
                    else if ( (synpred14_InternalHelloBuck()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred14_InternalHelloBuck()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred14_InternalHelloBuck()) ) {
                        alt28=2;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1435:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1435:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1435:26: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1436:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3607); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1445:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1446:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1446:1: ( ruleValidID )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1447:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3630);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3646);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1468:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1469:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1469:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1470:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3668);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1503:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1503:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1503:8: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1504:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1509:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1509:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3754); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1514:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1514:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1515:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1515:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1516:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3778); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1530:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1530:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1531:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1531:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1532:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall3815); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1545:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==25) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1545:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall3844); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1549:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1550:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1550:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1551:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3865);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1567:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==41) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1567:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3878); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1571:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1572:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1572:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1573:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3899);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop22;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall3913); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1593:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1594:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1594:1: ( ruleValidID )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1595:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3938);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1608:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt26=2;
            	    alt26 = dfa26.predict(input);
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1608:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1608:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1608:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1615:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1616:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3972); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1629:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt25=3;
            	            alt25 = dfa25.predict(input);
            	            switch (alt25) {
            	                case 1 :
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1629:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1629:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1629:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1646:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1647:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4057);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1664:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1664:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1664:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1664:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1665:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1665:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1666:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4085);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1682:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop24:
            	                    do {
            	                        int alt24=2;
            	                        int LA24_0 = input.LA(1);

            	                        if ( (LA24_0==41) ) {
            	                            alt24=1;
            	                        }


            	                        switch (alt24) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1682:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4098); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1686:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1687:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1687:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1688:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4119);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop24;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4136); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1708:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1708:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1713:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1714:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4169);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1738:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1739:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1740:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4209);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4219); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1747:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1750:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1751:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1751:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt29=13;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt29=1;
                }
                break;
            case 52:
                {
                alt29=2;
                }
                break;
            case 50:
                {
                alt29=3;
                }
                break;
            case RULE_ID:
            case 25:
            case 61:
                {
                alt29=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 44:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt29=5;
                }
                break;
            case 48:
                {
                alt29=6;
                }
                break;
            case 56:
                {
                alt29=7;
                }
                break;
            case 57:
                {
                alt29=8;
                }
                break;
            case 58:
                {
                alt29=9;
                }
                break;
            case 68:
                {
                alt29=10;
                }
                break;
            case 69:
                {
                alt29=11;
                }
                break;
            case 70:
                {
                alt29=12;
                }
                break;
            case 42:
                {
                alt29=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1752:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4266);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1762:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4293);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1772:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4320);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1782:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4347);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1792:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4374);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1802:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4401);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1812:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4428);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1822:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4455);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1832:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4482);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1842:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4509);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1852:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4536);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1862:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4563);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1872:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4590);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1888:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1889:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1890:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4625);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4635); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1897:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1900:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1901:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1901:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt30=1;
                }
                break;
            case 64:
            case 65:
                {
                alt30=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt30=3;
                }
                break;
            case 66:
                {
                alt30=4;
                }
                break;
            case RULE_STRING:
                {
                alt30=5;
                }
                break;
            case 67:
                {
                alt30=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1902:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4682);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1912:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4709);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1922:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4736);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1932:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4763);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1942:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4790);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1952:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4817);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1968:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1969:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1970:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4852);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4862); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1977:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1980:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1981:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1981:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1981:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1981:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1982:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXClosure4908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1991:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1991:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2006:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2006:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2006:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID||LA32_0==28||LA32_0==42) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2006:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2006:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2007:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2007:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2008:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4979);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2024:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==41) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2024:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXClosure4992); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2028:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2029:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2029:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2030:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5013);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2046:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2047:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2047:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2048:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2061:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2062:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2062:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2063:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5072);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2091:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2092:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2093:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5120);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5130); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2100:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2103:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2104:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2104:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2104:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2104:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2105:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2110:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_DECIMAL)||LA35_0==14||LA35_0==25||(LA35_0>=31 && LA35_0<=32)||LA35_0==42||LA35_0==44||LA35_0==48||LA35_0==50||LA35_0==52||(LA35_0>=56 && LA35_0<=61)||(LA35_0>=63 && LA35_0<=70)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2110:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2110:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2111:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2111:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2112:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5186);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2128:2: (otherlv_2= ';' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==47) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2128:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXExpressionInClosure5199); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2140:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2141:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2142:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5239);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5249); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2149:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2152:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2153:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2153:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2153:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2153:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2153:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2169:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2169:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2169:7: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2170:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2175:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==28||LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2175:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2175:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2176:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2176:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2177:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5357);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2193:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==41) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2193:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXShortClosure5370); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2197:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2198:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2198:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2199:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5391);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2215:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2216:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2216:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2217:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2230:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2231:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2231:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2232:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5449);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2256:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2257:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2258:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5485);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5495); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2265:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2268:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2269:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2269:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2269:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleXParenthesizedExpression5532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5554);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXParenthesizedExpression5565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2294:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2295:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2296:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5601);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5611); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2303:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2306:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2307:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2307:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2307:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2307:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2308:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression5657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression5669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2321:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2322:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2322:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2323:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5690);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2343:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2344:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2344:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2345:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5723);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2361:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred20_InternalHelloBuck()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2361:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2361:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2361:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression5744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2366:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2367:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2367:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2368:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5766);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2392:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2393:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2394:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5804);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5814); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2401:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2404:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2405:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2405:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2405:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2405:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2406:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression5860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_DECIMAL)||LA40_0==14||LA40_0==25||(LA40_0>=31 && LA40_0<=32)||LA40_0==44||LA40_0==48||LA40_0==50||LA40_0==52||(LA40_0>=56 && LA40_0<=58)||LA40_0==61||(LA40_0>=63 && LA40_0<=70)) ) {
                alt40=1;
            }
            else if ( (LA40_0==42) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==RULE_ID) ) {
                    int LA40_3 = input.LA(3);

                    if ( ((LA40_3>=15 && LA40_3<=40)||(LA40_3>=42 && LA40_3<=44)||LA40_3==62) ) {
                        alt40=1;
                    }
                    else if ( (LA40_3==51) && (synpred22_InternalHelloBuck())) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA40_2>=RULE_STRING && LA40_2<=RULE_DECIMAL)||LA40_2==14||LA40_2==25||(LA40_2>=31 && LA40_2<=32)||LA40_2==42||LA40_2==44||LA40_2==48||LA40_2==50||LA40_2==52||(LA40_2>=56 && LA40_2<=58)||LA40_2==61||(LA40_2>=63 && LA40_2<=70)) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        int LA39_1 = input.LA(2);

                        if ( (LA39_1==51) && (synpred21_InternalHelloBuck())) {
                            alt39=1;
                        }
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2420:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2420:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2420:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2421:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2421:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2422:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5903);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression5915); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2442:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2443:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2443:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2444:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5939);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2461:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2461:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2461:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2461:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2461:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2467:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2467:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleXSwitchExpression5983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2471:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2472:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2472:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2473:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6004);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2493:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2494:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2494:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2495:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6039);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleXSwitchExpression6051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2519:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==28||LA41_0==42||LA41_0==51||LA41_0==55) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2520:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2520:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2521:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6086);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2537:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2537:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2545:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2546:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2546:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2547:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6133);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2575:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2576:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2577:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6183);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6193); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2584:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2587:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2588:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2588:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2588:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2588:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==28||LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2589:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2589:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2590:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6239);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2606:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2606:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart6253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2610:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2611:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2611:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2612:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6274);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXCasePart6288); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2632:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2633:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2633:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2634:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6309);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2658:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2659:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2660:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6345);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6355); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2667:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2670:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2671:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2671:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2671:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2671:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2672:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression6401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXForLoopExpression6413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2685:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2686:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2686:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2687:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6434);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression6446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2707:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2708:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2708:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2709:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6467);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXForLoopExpression6479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2729:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2730:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2730:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2731:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6500);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2755:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2756:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2757:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6536);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6546); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2764:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2767:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2768:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2768:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2768:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2768:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2769:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXWhileExpression6592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXWhileExpression6604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2782:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2783:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2783:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2784:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6625);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXWhileExpression6637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2804:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2805:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2805:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2806:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6658);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2830:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2831:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2832:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6694);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6704); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2839:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2842:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2843:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2843:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2843:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2843:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2844:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression6750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2853:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2854:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2854:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2855:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6771);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression6783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXDoWhileExpression6795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2879:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2880:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2880:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2881:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6816);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXDoWhileExpression6828); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2909:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2910:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2911:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6864);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6874); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2918:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2921:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2922:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2922:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2922:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2922:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2923:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression6920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2932:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_DECIMAL)||LA46_0==14||LA46_0==25||(LA46_0>=31 && LA46_0<=32)||LA46_0==42||LA46_0==44||LA46_0==48||LA46_0==50||LA46_0==52||(LA46_0>=56 && LA46_0<=61)||(LA46_0>=63 && LA46_0<=70)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2932:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2932:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2933:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2933:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2934:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6942);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2950:2: (otherlv_3= ';' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==47) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2950:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXBlockExpression6955); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression6971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2966:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2967:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2968:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7007);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7017); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2975:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2978:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2979:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2979:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=59 && LA47_0<=60)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_DECIMAL)||LA47_0==14||LA47_0==25||(LA47_0>=31 && LA47_0<=32)||LA47_0==42||LA47_0==44||LA47_0==48||LA47_0==50||LA47_0==52||(LA47_0>=56 && LA47_0<=58)||LA47_0==61||(LA47_0>=63 && LA47_0<=70)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2980:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7064);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2990:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7091);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3006:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3007:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3008:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7126);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7136); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3015:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3018:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3019:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3019:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3019:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3019:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3020:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3025:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            else if ( (LA48_0==60) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3025:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3025:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3026:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3026:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3027:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration7189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3041:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3045:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred23_InternalHelloBuck()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==42) && (synpred23_InternalHelloBuck())) {
                alt49=1;
            }
            else if ( (LA49_0==28) && (synpred23_InternalHelloBuck())) {
                alt49=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3045:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3045:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3045:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3053:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3053:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3053:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3054:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3054:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3055:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7268);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3071:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3072:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3072:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3073:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7289);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3090:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3090:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3091:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3091:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3092:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7318);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3108:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==15) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3108:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXVariableDeclaration7332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3112:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3113:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3113:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3114:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7353);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3138:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3139:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3140:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7391);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7401); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3147:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3150:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3151:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3151:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3151:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3151:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ID||LA51_1==25||LA51_1==38||LA51_1==44) ) {
                    alt51=1;
                }
            }
            else if ( (LA51_0==28||LA51_0==42) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3152:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3152:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3153:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7447);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3169:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3170:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3170:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3171:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7469);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3195:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3196:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3197:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7505);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7515); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3204:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3207:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3208:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3208:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3208:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3208:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3209:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3209:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3210:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7561);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3226:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3227:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3227:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3228:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7582);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3252:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3253:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3254:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7618);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7628); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3261:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3264:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3265:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3265:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3265:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3265:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3266:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3271:2: ( ( ruleStaticQualifier ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==62) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3272:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3272:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3273:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7685);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3286:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==25) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3286:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall7699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3290:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3291:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3291:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3292:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7720);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3308:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==41) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3308:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7733); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3312:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3313:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3313:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3314:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7754);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall7768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3334:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3335:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3335:1: ( ruleIdOrSuper )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3336:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7793);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3349:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3349:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3349:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3349:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3356:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3357:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall7827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt56=3;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3387:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3388:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7912);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3405:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3405:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3405:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3405:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3406:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3406:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3407:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7940);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3423:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==41) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3423:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7953); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3427:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3428:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3428:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3429:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7974);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3449:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3449:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3454:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3455:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8024);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3479:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3480:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3481:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8062);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8073); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3488:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3491:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3492:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3492:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==61) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3493:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8120);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3505:2: kw= 'super'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleIdOrSuper8144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3518:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3519:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3520:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8185);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8196); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3527:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3530:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3531:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3531:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==62) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3532:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8243);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleStaticQualifier8261); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3556:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3557:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3558:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8302);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8312); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3565:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3568:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3569:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3569:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3569:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3569:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3570:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXConstructorCall8358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3579:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3580:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3580:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3581:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8381);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3594:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3594:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3594:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3594:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3599:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3600:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3600:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3601:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8424);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3617:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==41) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3617:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8437); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3621:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3622:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3622:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3623:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8458);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall8472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3643:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3643:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3643:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3643:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3648:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3648:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3648:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3648:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3665:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3666:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8568);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3683:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3683:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3683:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3683:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3684:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3684:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3685:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8596);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3701:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==41) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3701:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8609); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3705:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3706:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3706:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3707:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8630);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop63;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3727:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3727:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3732:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3733:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8680);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3757:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3758:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3759:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8717);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8727); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3766:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3769:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3770:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3770:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3770:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3770:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3771:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3776:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==64) ) {
                alt67=1;
            }
            else if ( (LA67_0==65) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3776:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral8774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3781:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3781:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3782:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3782:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3783:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral8798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3804:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3805:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3806:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8848);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8858); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3813:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3816:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3817:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3817:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3817:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3817:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3818:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXNullLiteral8904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3835:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3836:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3837:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral8940);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral8950); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3844:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3847:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3848:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3848:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3848:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3848:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3849:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3854:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3855:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3855:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3856:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9005);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3880:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3881:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3882:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9041);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9051); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3889:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3892:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3893:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3893:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3893:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3893:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3894:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3899:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3900:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3900:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3901:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3925:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3926:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3927:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9143);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9153); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3934:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3937:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3938:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3938:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3938:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3938:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3939:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral9199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXTypeLiteral9211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3952:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3953:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3953:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3954:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9234);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXTypeLiteral9246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3979:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3980:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3981:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9282);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9292); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3988:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3991:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3992:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3992:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3992:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3992:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3993:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXThrowExpression9338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4002:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4003:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4003:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4004:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9359);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4028:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4029:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4030:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9395);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9405); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4037:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4040:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4041:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4041:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4041:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4041:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4042:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXReturnExpression9451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4051:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4051:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4056:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4057:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9482);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4081:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4082:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4083:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9519);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9529); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4090:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4093:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4094:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4094:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4094:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4094:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4095:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression9575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4104:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4105:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4105:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4106:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9596);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4122:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==72) ) {
                alt71=1;
            }
            else if ( (LA71_0==71) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4122:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4122:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4122:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4122:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==72) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred32_InternalHelloBuck()) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4122:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4124:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4125:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9626);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4141:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==71) ) {
                        int LA70_1 = input.LA(2);

                        if ( (synpred33_InternalHelloBuck()) ) {
                            alt70=1;
                        }
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4141:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4141:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4141:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9648); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4146:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4147:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4147:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4148:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9670);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4165:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4165:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4165:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4169:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4170:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4170:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4171:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9713);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4195:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4196:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4197:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9751);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9761); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4204:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4207:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4208:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4208:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4208:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4208:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4208:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXCatchClause9806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXCatchClause9819); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4217:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4218:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4218:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4219:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9840);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXCatchClause9852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4239:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4240:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4240:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4241:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9873);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4265:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4266:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4267:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9910);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9921); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4274:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4277:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4278:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4278:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4279:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9968);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4289:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==38) ) {
                    int LA72_2 = input.LA(2);

                    if ( (LA72_2==RULE_ID) ) {
                        int LA72_3 = input.LA(3);

                        if ( (synpred35_InternalHelloBuck()) ) {
                            alt72=1;
                        }


                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4289:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4289:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4289:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleQualifiedName9996); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10019);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4316:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4320:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4321:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10073);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10084); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4331:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4335:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4336:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4336:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_HEX) ) {
                alt76=1;
            }
            else if ( ((LA76_0>=RULE_INT && LA76_0<=RULE_DECIMAL)) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4336:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4344:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4344:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4344:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4344:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_INT) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==RULE_DECIMAL) ) {
                        alt73=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4344:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10156); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4352:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10182); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4359:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==38) ) {
                        int LA75_1 = input.LA(2);

                        if ( ((LA75_1>=RULE_INT && LA75_1<=RULE_DECIMAL)) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4360:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleNumber10202); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4365:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==RULE_INT) ) {
                                alt74=1;
                            }
                            else if ( (LA74_0==RULE_DECIMAL) ) {
                                alt74=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 74, 0, input);

                                throw nvae;
                            }
                            switch (alt74) {
                                case 1 :
                                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4365:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10218); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4373:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10244); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4391:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4392:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4393:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10297);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10307); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4400:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4403:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4404:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4404:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                alt78=1;
            }
            else if ( (LA78_0==28||LA78_0==42) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4404:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4404:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4405:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10355);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4413:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==44) ) {
                            int LA77_2 = input.LA(2);

                            if ( (LA77_2==46) ) {
                                int LA77_3 = input.LA(3);

                                if ( (synpred36_InternalHelloBuck()) ) {
                                    alt77=1;
                                }


                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4413:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4416:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4416:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4416:6: ()
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4417:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleJvmTypeReference10393); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference10405); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4432:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10437);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4448:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4449:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4450:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10472);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10482); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4457:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4460:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4461:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4461:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4461:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4461:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==42) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4461:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef10520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4465:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_ID||LA80_0==28||LA80_0==42) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4465:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4465:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4466:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4466:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4467:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10542);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4483:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==41) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4483:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef10555); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4487:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4488:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4488:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4489:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10576);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop79;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleXFunctionTypeRef10606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4513:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4514:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4514:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4515:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10627);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4539:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4540:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4541:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10663);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10673); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4548:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4551:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4552:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4552:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4552:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4552:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4553:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4553:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4554:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10721);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4567:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4567:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4567:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4567:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference10742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4572:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4573:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4573:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4574:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10764);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4590:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==41) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4590:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleJvmParameterizedTypeReference10777); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4594:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4595:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4595:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4596:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10798);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference10812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4624:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4625:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4626:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10850);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10860); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4633:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4636:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4637:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4637:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID||LA84_0==28||LA84_0==42) ) {
                alt84=1;
            }
            else if ( (LA84_0==73) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4638:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10907);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4648:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10934);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4664:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4665:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4666:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10969);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10979); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4673:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4676:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4677:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4677:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4677:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4677:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4678:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleJvmWildcardTypeReference11025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4687:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt85=3;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==74) ) {
                alt85=1;
            }
            else if ( (LA85_0==61) ) {
                alt85=2;
            }
            switch (alt85) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4687:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4687:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4688:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4688:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4689:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11047);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4706:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4706:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4707:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4707:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4708:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11074);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4732:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4733:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4734:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11112);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11122); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4741:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4744:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4745:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4745:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4745:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBound11159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4749:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4750:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4750:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4751:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11180);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4775:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4776:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4777:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11216);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11226); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4784:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4787:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4788:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4788:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4788:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBoundAnded11263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4792:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4793:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4793:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4794:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11284);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4818:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4819:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4820:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11320);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11330); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4827:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4830:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4831:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4831:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4831:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleJvmLowerBound11367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4835:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4836:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4836:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4837:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11388);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4863:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4864:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4865:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11427);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11438); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4872:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4875:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4876:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalHelloBuck
    public final void synpred1_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:253:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:253:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:253:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:253:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:253:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:254:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:254:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:255:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:255:1: ( ruleOpMultiAssign )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:256:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloBuck528);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalHelloBuck

    // $ANTLR start synpred2_InternalHelloBuck
    public final void synpred2_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:381:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:381:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:381:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:381:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:381:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:382:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:382:2: ( ( ruleOpOr ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:383:1: ( ruleOpOr )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:383:1: ( ruleOpOr )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:384:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHelloBuck876);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalHelloBuck

    // $ANTLR start synpred3_InternalHelloBuck
    public final void synpred3_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:482:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:482:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:482:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:482:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:482:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:483:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:483:2: ( ( ruleOpAnd ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:484:1: ( ruleOpAnd )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:484:1: ( ruleOpAnd )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:485:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHelloBuck1135);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalHelloBuck

    // $ANTLR start synpred4_InternalHelloBuck
    public final void synpred4_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:583:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:583:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:583:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:583:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:583:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:584:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:584:2: ( ( ruleOpEquality ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:585:1: ( ruleOpEquality )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:585:1: ( ruleOpEquality )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:586:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHelloBuck1394);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalHelloBuck

    // $ANTLR start synpred5_InternalHelloBuck
    public final void synpred5_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:4: ( ( () 'instanceof' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:5: ( () 'instanceof' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:5: ( () 'instanceof' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:6: () 'instanceof'
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:691:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:692:1: 
        {
        }

        match(input,21,FOLLOW_21_in_synpred5_InternalHelloBuck1670); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloBuck

    // $ANTLR start synpred6_InternalHelloBuck
    public final void synpred6_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:722:10: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:723:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:723:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:724:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:724:1: ( ruleOpCompare )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:725:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloBuck1741);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalHelloBuck

    // $ANTLR start synpred7_InternalHelloBuck
    public final void synpred7_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:844:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:844:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:844:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:844:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:844:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:845:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:845:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:846:1: ( ruleOpOther )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:846:1: ( ruleOpOther )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:847:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloBuck2060);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalHelloBuck

    // $ANTLR start synpred8_InternalHelloBuck
    public final void synpred8_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:942:2: ( '>' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:943:2: '>'
        {
        match(input,24,FOLLOW_24_in_synpred8_InternalHelloBuck2287); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalHelloBuck

    // $ANTLR start synpred9_InternalHelloBuck
    public final void synpred9_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:963:2: ( '<' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:964:2: '<'
        {
        match(input,25,FOLLOW_25_in_synpred9_InternalHelloBuck2345); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalHelloBuck

    // $ANTLR start synpred10_InternalHelloBuck
    public final void synpred10_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1028:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1028:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1028:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1028:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1028:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1029:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1029:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1030:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1030:1: ( ruleOpAdd )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1031:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHelloBuck2547);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalHelloBuck

    // $ANTLR start synpred11_InternalHelloBuck
    public final void synpred11_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1136:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1136:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1136:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1136:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1136:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1137:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1137:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1138:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1138:1: ( ruleOpMulti )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1139:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHelloBuck2827);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalHelloBuck

    // $ANTLR start synpred12_InternalHelloBuck
    public final void synpred12_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1369:3: ( ( () 'as' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1369:4: ( () 'as' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1369:4: ( () 'as' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1369:5: () 'as'
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1369:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1370:1: 
        {
        }

        match(input,37,FOLLOW_37_in_synpred12_InternalHelloBuck3421); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHelloBuck

    // $ANTLR start synpred13_InternalHelloBuck
    public final void synpred13_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1429:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1430:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred13_InternalHelloBuck3575); if (state.failed) return ;
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1431:1: ( ( ruleValidID ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1432:1: ( ruleValidID )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1432:1: ( ruleValidID )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1433:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalHelloBuck3584);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloBuck3590);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloBuck

    // $ANTLR start synpred14_InternalHelloBuck
    public final void synpred14_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1487:10: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1488:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1488:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt86=3;
        switch ( input.LA(1) ) {
        case 38:
            {
            alt86=1;
            }
            break;
        case 39:
            {
            alt86=2;
            }
            break;
        case 40:
            {
            alt86=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 86, 0, input);

            throw nvae;
        }

        switch (alt86) {
            case 1 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1488:4: '.'
                {
                match(input,38,FOLLOW_38_in_synpred14_InternalHelloBuck3693); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1490:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1490:6: ( ( '?.' ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1491:1: ( '?.' )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1491:1: ( '?.' )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1492:2: '?.'
                {
                match(input,39,FOLLOW_39_in_synpred14_InternalHelloBuck3707); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1497:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1497:6: ( ( '*.' ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1498:1: ( '*.' )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1498:1: ( '*.' )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:2: '*.'
                {
                match(input,40,FOLLOW_40_in_synpred14_InternalHelloBuck3727); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloBuck

    // $ANTLR start synpred15_InternalHelloBuck
    public final void synpred15_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1608:4: ( ( '(' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1609:1: ( '(' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1609:1: ( '(' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1610:2: '('
        {
        match(input,42,FOLLOW_42_in_synpred15_InternalHelloBuck3954); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloBuck

    // $ANTLR start synpred16_InternalHelloBuck
    public final void synpred16_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1629:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1629:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1629:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1629:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1629:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1630:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1630:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==28||LA88_0==42) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1630:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1630:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1631:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1631:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1632:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloBuck4006);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1634:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==41) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1634:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred16_InternalHelloBuck4013); if (state.failed) return ;
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1635:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1636:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1636:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1637:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloBuck4020);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1639:6: ( ( '|' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1640:1: ( '|' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1640:1: ( '|' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred16_InternalHelloBuck4034); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloBuck

    // $ANTLR start synpred17_InternalHelloBuck
    public final void synpred17_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1708:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1709:1: ( ruleXClosure )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1709:1: ( ruleXClosure )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1710:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred17_InternalHelloBuck4152);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHelloBuck

    // $ANTLR start synpred18_InternalHelloBuck
    public final void synpred18_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1991:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1991:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1991:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1991:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1991:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==28||LA90_0==42) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1991:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1991:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1992:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1992:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1993:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalHelloBuck4925);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1995:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==41) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1995:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred18_InternalHelloBuck4932); if (state.failed) return ;
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1996:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1997:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1997:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1998:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalHelloBuck4939);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2000:6: ( ( '|' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2001:1: ( '|' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2001:1: ( '|' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2002:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred18_InternalHelloBuck4953); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalHelloBuck

    // $ANTLR start synpred20_InternalHelloBuck
    public final void synpred20_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2361:4: ( 'else' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2361:6: 'else'
        {
        match(input,49,FOLLOW_49_in_synpred20_InternalHelloBuck5736); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalHelloBuck

    // $ANTLR start synpred21_InternalHelloBuck
    public final void synpred21_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:6: ( ( ruleValidID ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2416:1: ( ruleValidID )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2416:1: ( ruleValidID )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2417:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalHelloBuck5878);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,51,FOLLOW_51_in_synpred21_InternalHelloBuck5884); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalHelloBuck

    // $ANTLR start synpred22_InternalHelloBuck
    public final void synpred22_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2461:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2461:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2461:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2461:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,42,FOLLOW_42_in_synpred22_InternalHelloBuck5960); if (state.failed) return ;
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2462:1: ( ( ruleValidID ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2463:1: ( ruleValidID )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2463:1: ( ruleValidID )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2464:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred22_InternalHelloBuck5967);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,51,FOLLOW_51_in_synpred22_InternalHelloBuck5973); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalHelloBuck

    // $ANTLR start synpred23_InternalHelloBuck
    public final void synpred23_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3045:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3045:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3045:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3045:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3045:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3046:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3046:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3047:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred23_InternalHelloBuck7238);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3049:2: ( ( ruleValidID ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3050:1: ( ruleValidID )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3050:1: ( ruleValidID )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3051:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHelloBuck7247);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalHelloBuck

    // $ANTLR start synpred24_InternalHelloBuck
    public final void synpred24_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3349:4: ( ( '(' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3350:1: ( '(' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3350:1: ( '(' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3351:2: '('
        {
        match(input,42,FOLLOW_42_in_synpred24_InternalHelloBuck7809); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloBuck

    // $ANTLR start synpred25_InternalHelloBuck
    public final void synpred25_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3371:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3371:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==28||LA94_0==42) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3371:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3371:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3372:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3372:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3373:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalHelloBuck7861);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3375:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==41) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3375:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred25_InternalHelloBuck7868); if (state.failed) return ;
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3376:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3377:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3377:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3378:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalHelloBuck7875);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3380:6: ( ( '|' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3381:1: ( '|' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3381:1: ( '|' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3382:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred25_InternalHelloBuck7889); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHelloBuck

    // $ANTLR start synpred26_InternalHelloBuck
    public final void synpred26_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3449:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3450:1: ( ruleXClosure )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3450:1: ( ruleXClosure )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3451:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred26_InternalHelloBuck8007);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloBuck

    // $ANTLR start synpred27_InternalHelloBuck
    public final void synpred27_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3594:4: ( '<' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3594:6: '<'
        {
        match(input,25,FOLLOW_25_in_synpred27_InternalHelloBuck8394); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalHelloBuck

    // $ANTLR start synpred28_InternalHelloBuck
    public final void synpred28_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3643:5: ( '(' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3643:7: '('
        {
        match(input,42,FOLLOW_42_in_synpred28_InternalHelloBuck8487); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalHelloBuck

    // $ANTLR start synpred29_InternalHelloBuck
    public final void synpred29_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3648:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3648:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3648:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3648:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3648:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3649:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3649:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==28||LA96_0==42) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3649:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3649:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3650:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3650:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3651:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalHelloBuck8517);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3653:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==41) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3653:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred29_InternalHelloBuck8524); if (state.failed) return ;
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3654:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3655:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3655:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3656:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalHelloBuck8531);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3658:6: ( ( '|' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3659:1: ( '|' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3659:1: ( '|' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred29_InternalHelloBuck8545); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalHelloBuck

    // $ANTLR start synpred30_InternalHelloBuck
    public final void synpred30_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3727:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3728:1: ( ruleXClosure )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3728:1: ( ruleXClosure )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3729:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred30_InternalHelloBuck8663);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalHelloBuck

    // $ANTLR start synpred31_InternalHelloBuck
    public final void synpred31_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4051:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4052:1: ( ruleXExpression )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4052:1: ( ruleXExpression )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4053:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred31_InternalHelloBuck9465);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalHelloBuck

    // $ANTLR start synpred32_InternalHelloBuck
    public final void synpred32_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4122:5: ( 'catch' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4122:7: 'catch'
        {
        match(input,72,FOLLOW_72_in_synpred32_InternalHelloBuck9610); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalHelloBuck

    // $ANTLR start synpred33_InternalHelloBuck
    public final void synpred33_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4141:5: ( 'finally' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4141:7: 'finally'
        {
        match(input,71,FOLLOW_71_in_synpred33_InternalHelloBuck9640); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalHelloBuck

    // $ANTLR start synpred35_InternalHelloBuck
    public final void synpred35_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4289:3: ( '.' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4290:2: '.'
        {
        match(input,38,FOLLOW_38_in_synpred35_InternalHelloBuck9987); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloBuck

    // $ANTLR start synpred36_InternalHelloBuck
    public final void synpred36_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4413:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4413:3: ( () '[' ']' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4413:3: ( () '[' ']' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4413:4: () '[' ']'
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4413:4: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4414:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred36_InternalHelloBuck10370); if (state.failed) return ;
        match(input,46,FOLLOW_46_in_synpred36_InternalHelloBuck10374); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred36_InternalHelloBuck

    // $ANTLR start synpred37_InternalHelloBuck
    public final void synpred37_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4567:4: ( '<' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4567:6: '<'
        {
        match(input,25,FOLLOW_25_in_synpred37_InternalHelloBuck10734); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHelloBuck

    // Delegated rules

    public final boolean synpred4_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalHelloBuck_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\1\1\11\uffff";
    static final String DFA10_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA10_maxS =
        "\1\110\1\uffff\7\0\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA10_specialS =
        "\2\uffff\1\6\1\4\1\5\1\3\1\2\1\1\1\0\1\uffff}>";
    static final String[] DFA10_transitionS = {
            "\5\1\5\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\16\1\1\uffff\20\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 844:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\1\30\4\uffff\1\30\4\uffff";
    static final String DFA13_maxS =
        "\1\36\4\uffff\1\31\4\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\6\1\5";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\4\1\5\1\1\1\2\1\3\1\6\1\7",
            "",
            "",
            "",
            "",
            "\1\10\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "909:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' )";
        }
    }
    static final String DFA12_eotS =
        "\35\uffff";
    static final String DFA12_eofS =
        "\1\2\34\uffff";
    static final String DFA12_minS =
        "\1\4\1\0\33\uffff";
    static final String DFA12_maxS =
        "\1\106\1\0\33\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\31\uffff\1\1";
    static final String DFA12_specialS =
        "\1\uffff\1\0\33\uffff}>";
    static final String[] DFA12_transitionS = {
            "\5\2\5\uffff\1\2\12\uffff\1\1\5\uffff\2\2\11\uffff\1\2\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2\2\uffff"+
            "\1\2\1\uffff\10\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "963:1: ( ( '<' )=>kw= '<' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalHelloBuck()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\100\uffff";
    static final String DFA26_eofS =
        "\1\2\77\uffff";
    static final String DFA26_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA26_maxS =
        "\1\110\1\0\76\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA26_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA26_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\32\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1608:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\36\uffff";
    static final String DFA25_eofS =
        "\36\uffff";
    static final String DFA25_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA25_maxS =
        "\1\106\2\0\33\uffff";
    static final String DFA25_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA25_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\4\5\5\uffff\1\5\12\uffff\1\5\2\uffff\1\3\2\uffff\2\5\11"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1629:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_0==RULE_ID) ) {s = 1;}

                        else if ( (LA25_0==42) ) {s = 2;}

                        else if ( (LA25_0==28) && (synpred16_InternalHelloBuck())) {s = 3;}

                        else if ( (LA25_0==45) && (synpred16_InternalHelloBuck())) {s = 4;}

                        else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_DECIMAL)||LA25_0==14||LA25_0==25||(LA25_0>=31 && LA25_0<=32)||LA25_0==44||LA25_0==48||LA25_0==50||LA25_0==52||(LA25_0>=56 && LA25_0<=58)||LA25_0==61||(LA25_0>=63 && LA25_0<=70)) ) {s = 5;}

                        else if ( (LA25_0==43) ) {s = 29;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\100\uffff";
    static final String DFA27_eofS =
        "\1\2\77\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA27_maxS =
        "\1\110\1\0\76\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA27_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\34\2\1\1\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1708:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\40\uffff";
    static final String DFA33_eofS =
        "\40\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA33_maxS =
        "\1\106\2\0\35\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\4\5\5\uffff\1\5\12\uffff\1\5\2\uffff\1\3\2\uffff\2\5\11"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1991:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==42) ) {s = 2;}

                        else if ( (LA33_0==28) && (synpred18_InternalHelloBuck())) {s = 3;}

                        else if ( (LA33_0==45) && (synpred18_InternalHelloBuck())) {s = 4;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_DECIMAL)||LA33_0==14||LA33_0==25||(LA33_0>=31 && LA33_0<=32)||LA33_0==44||LA33_0==46||LA33_0==48||LA33_0==50||LA33_0==52||(LA33_0>=56 && LA33_0<=61)||(LA33_0>=63 && LA33_0<=70)) ) {s = 5;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\100\uffff";
    static final String DFA57_eofS =
        "\1\2\77\uffff";
    static final String DFA57_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA57_maxS =
        "\1\110\1\0\76\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA57_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA57_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\32\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3349:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\36\uffff";
    static final String DFA56_eofS =
        "\36\uffff";
    static final String DFA56_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA56_maxS =
        "\1\106\2\0\33\uffff";
    static final String DFA56_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA56_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\4\5\5\uffff\1\5\12\uffff\1\5\2\uffff\1\3\2\uffff\2\5\11"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3370:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA56_0==RULE_ID) ) {s = 1;}

                        else if ( (LA56_0==42) ) {s = 2;}

                        else if ( (LA56_0==28) && (synpred25_InternalHelloBuck())) {s = 3;}

                        else if ( (LA56_0==45) && (synpred25_InternalHelloBuck())) {s = 4;}

                        else if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_DECIMAL)||LA56_0==14||LA56_0==25||(LA56_0>=31 && LA56_0<=32)||LA56_0==44||LA56_0==48||LA56_0==50||LA56_0==52||(LA56_0>=56 && LA56_0<=58)||LA56_0==61||(LA56_0>=63 && LA56_0<=70)) ) {s = 5;}

                        else if ( (LA56_0==43) ) {s = 29;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\100\uffff";
    static final String DFA58_eofS =
        "\1\2\77\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA58_maxS =
        "\1\110\1\0\76\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA58_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\34\2\1\1\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3449:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\100\uffff";
    static final String DFA62_eofS =
        "\1\2\77\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA62_maxS =
        "\1\110\1\0\76\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA62_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\11\2\1\1\23\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3594:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\100\uffff";
    static final String DFA65_eofS =
        "\1\2\77\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA65_maxS =
        "\1\110\1\0\76\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\32\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3643:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\36\uffff";
    static final String DFA64_eofS =
        "\36\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA64_maxS =
        "\1\106\2\0\33\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\4\5\5\uffff\1\5\12\uffff\1\5\2\uffff\1\3\2\uffff\2\5\11"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3648:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==42) ) {s = 2;}

                        else if ( (LA64_0==28) && (synpred29_InternalHelloBuck())) {s = 3;}

                        else if ( (LA64_0==45) && (synpred29_InternalHelloBuck())) {s = 4;}

                        else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||LA64_0==14||LA64_0==25||(LA64_0>=31 && LA64_0<=32)||LA64_0==44||LA64_0==48||LA64_0==50||LA64_0==52||(LA64_0>=56 && LA64_0<=58)||LA64_0==61||(LA64_0>=63 && LA64_0<=70)) ) {s = 5;}

                        else if ( (LA64_0==43) ) {s = 29;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\100\uffff";
    static final String DFA66_eofS =
        "\1\2\77\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA66_maxS =
        "\1\110\1\0\76\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\34\2\1\1\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3727:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\100\uffff";
    static final String DFA68_eofS =
        "\1\33\77\uffff";
    static final String DFA68_minS =
        "\1\4\32\0\45\uffff";
    static final String DFA68_maxS =
        "\1\110\32\0\45\uffff";
    static final String DFA68_acceptS =
        "\33\uffff\1\2\43\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\45\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\5\uffff\1\2\1\uffff\11\33\1\10\5\33"+
            "\1\4\1\3\11\33\1\32\1\33\1\12\1\uffff\2\33\1\23\1\33\1\7\1\33"+
            "\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13\1\14\1\20"+
            "\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "4051:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_3 = input.LA(1);

                         
                        int index68_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA68_4 = input.LA(1);

                         
                        int index68_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA68_5 = input.LA(1);

                         
                        int index68_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA68_6 = input.LA(1);

                         
                        int index68_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA68_7 = input.LA(1);

                         
                        int index68_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA68_8 = input.LA(1);

                         
                        int index68_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA68_9 = input.LA(1);

                         
                        int index68_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA68_10 = input.LA(1);

                         
                        int index68_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA68_11 = input.LA(1);

                         
                        int index68_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA68_12 = input.LA(1);

                         
                        int index68_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA68_13 = input.LA(1);

                         
                        int index68_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA68_14 = input.LA(1);

                         
                        int index68_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA68_15 = input.LA(1);

                         
                        int index68_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA68_16 = input.LA(1);

                         
                        int index68_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA68_17 = input.LA(1);

                         
                        int index68_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA68_18 = input.LA(1);

                         
                        int index68_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA68_19 = input.LA(1);

                         
                        int index68_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA68_20 = input.LA(1);

                         
                        int index68_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA68_21 = input.LA(1);

                         
                        int index68_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA68_22 = input.LA(1);

                         
                        int index68_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA68_23 = input.LA(1);

                         
                        int index68_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA68_24 = input.LA(1);

                         
                        int index68_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA68_25 = input.LA(1);

                         
                        int index68_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA68_26 = input.LA(1);

                         
                        int index68_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA83_eotS =
        "\100\uffff";
    static final String DFA83_eofS =
        "\1\2\77\uffff";
    static final String DFA83_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA83_maxS =
        "\1\110\1\0\76\uffff";
    static final String DFA83_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA83_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA83_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\11\2\1\1\23\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "4567:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_1 = input.LA(1);

                         
                        int index83_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalHelloBuck()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGreeting213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting230 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGreeting247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment441 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment457 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment507 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment560 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpSingleAssign671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpMultiAssign759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression855 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression908 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression931 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpOr1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1114 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1167 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1190 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpAnd1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1373 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1426 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1449 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpEquality1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1653 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_21_in_ruleXRelationalExpression1689 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1712 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1773 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1796 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare1836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpCompare1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2039 = new BitSet(new long[]{0x000000007F000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2092 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2115 = new BitSet(new long[]{0x000000007F000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2261 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2274 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2319 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2332 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2377 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2526 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2579 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2602 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAdd2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2806 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2859 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2882 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti2921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3135 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpUnary3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpUnary3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3405 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleXCastedExpression3440 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3463 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3558 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3630 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3646 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3668 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3754 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3778 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall3815 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall3844 = new BitSet(new long[]{0x0000040010000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3865 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3878 = new BitSet(new long[]{0x0000040010000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3899 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall3913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3938 = new BitSet(new long[]{0x000015C000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3972 = new BitSet(new long[]{0xA7153C01920041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4057 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4085 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4098 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4119 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4136 = new BitSet(new long[]{0x000011C000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4169 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXClosure4908 = new BitSet(new long[]{0xBF157401920041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4979 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_ruleXClosure4992 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5013 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5035 = new BitSet(new long[]{0xBF155401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5072 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5186 = new BitSet(new long[]{0xBF159401820041F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_47_in_ruleXExpressionInClosure5199 = new BitSet(new long[]{0xBF151401820041F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5357 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_ruleXShortClosure5370 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5391 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5413 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXParenthesizedExpression5532 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5554 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXParenthesizedExpression5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression5657 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression5669 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5690 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5702 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5723 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression5744 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression5860 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5903 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression5915 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5939 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42_in_ruleXSwitchExpression5983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6004 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6016 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6039 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXSwitchExpression6051 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6065 = new BitSet(new long[]{0x0088040010000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6086 = new BitSet(new long[]{0x00E8040010000010L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6100 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6112 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6133 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6239 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart6253 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6274 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXCasePart6288 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression6401 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXForLoopExpression6413 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6434 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression6446 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6467 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXForLoopExpression6479 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXWhileExpression6592 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXWhileExpression6604 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6625 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXWhileExpression6637 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression6750 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6771 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression6783 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXDoWhileExpression6795 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6816 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXDoWhileExpression6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression6920 = new BitSet(new long[]{0xBF551401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6942 = new BitSet(new long[]{0xBF559401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_47_in_ruleXBlockExpression6955 = new BitSet(new long[]{0xBF551401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration7189 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7220 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7289 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7318 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleXVariableDeclaration7332 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7685 = new BitSet(new long[]{0x2000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall7699 = new BitSet(new long[]{0x0000040010000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7720 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7733 = new BitSet(new long[]{0x0000040010000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7754 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall7768 = new BitSet(new long[]{0x2000000002000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7793 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall7827 = new BitSet(new long[]{0xA7153C01920041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7912 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7940 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7953 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7974 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7991 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIdOrSuper8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8243 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStaticQualifier8261 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXConstructorCall8358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8381 = new BitSet(new long[]{0x0000140002000002L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8402 = new BitSet(new long[]{0x0000040010000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8424 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8437 = new BitSet(new long[]{0x0000040010000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8458 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall8472 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8495 = new BitSet(new long[]{0xA7153C01920041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8568 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8596 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8609 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8630 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8647 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral8798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXNullLiteral8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral8940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral8950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral9199 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXTypeLiteral9211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9234 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXTypeLiteral9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXThrowExpression9338 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXReturnExpression9451 = new BitSet(new long[]{0xA7151401820041F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression9575 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9648 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9692 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXCatchClause9806 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXCatchClause9819 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9840 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXCatchClause9852 = new BitSet(new long[]{0xA7151401820041F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9968 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedName9996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10019 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10156 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10182 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleNumber10202 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10355 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleJvmTypeReference10393 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference10405 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef10520 = new BitSet(new long[]{0x00000C0010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10542 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef10555 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10576 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10592 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXFunctionTypeRef10606 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10721 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference10742 = new BitSet(new long[]{0x0000040010000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10764 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_41_in_ruleJvmParameterizedTypeReference10777 = new BitSet(new long[]{0x0000040010000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10798 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmWildcardTypeReference11025 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBound11159 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBoundAnded11263 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmLowerBound11367 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloBuck528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloBuck876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloBuck1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloBuck1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred5_InternalHelloBuck1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloBuck1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloBuck2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred8_InternalHelloBuck2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred9_InternalHelloBuck2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHelloBuck2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHelloBuck2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred12_InternalHelloBuck3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred13_InternalHelloBuck3575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalHelloBuck3584 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloBuck3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred14_InternalHelloBuck3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred14_InternalHelloBuck3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred14_InternalHelloBuck3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred15_InternalHelloBuck3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloBuck4006 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred16_InternalHelloBuck4013 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloBuck4020 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalHelloBuck4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred17_InternalHelloBuck4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalHelloBuck4925 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred18_InternalHelloBuck4932 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalHelloBuck4939 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred18_InternalHelloBuck4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred20_InternalHelloBuck5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalHelloBuck5878 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred21_InternalHelloBuck5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred22_InternalHelloBuck5960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred22_InternalHelloBuck5967 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred22_InternalHelloBuck5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred23_InternalHelloBuck7238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHelloBuck7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred24_InternalHelloBuck7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalHelloBuck7861 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred25_InternalHelloBuck7868 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalHelloBuck7875 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred25_InternalHelloBuck7889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred26_InternalHelloBuck8007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred27_InternalHelloBuck8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred28_InternalHelloBuck8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalHelloBuck8517 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred29_InternalHelloBuck8524 = new BitSet(new long[]{0x0000040010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalHelloBuck8531 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred29_InternalHelloBuck8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred30_InternalHelloBuck8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred31_InternalHelloBuck9465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred32_InternalHelloBuck9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred33_InternalHelloBuck9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred35_InternalHelloBuck9987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred36_InternalHelloBuck10370 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_synpred36_InternalHelloBuck10374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred37_InternalHelloBuck10734 = new BitSet(new long[]{0x0000000000000002L});

}