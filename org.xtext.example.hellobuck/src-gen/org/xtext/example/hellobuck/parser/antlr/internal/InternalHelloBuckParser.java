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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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
    public static final int T__76=76;
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

                if ( (LA3_1==EOF||(LA3_1>=RULE_ID && LA3_1<=RULE_DECIMAL)||LA3_1==14||(LA3_1>=16 && LA3_1<=45)||(LA3_1>=47 && LA3_1<=73)) ) {
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
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_DECIMAL)||LA3_0==14||LA3_0==25||(LA3_0>=32 && LA3_0<=33)||LA3_0==43||LA3_0==45||LA3_0==49||LA3_0==51||LA3_0==53||(LA3_0>=57 && LA3_0<=59)||LA3_0==62||(LA3_0>=64 && LA3_0<=71)) ) {
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:905:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:908:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:909:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:909:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 24:
                {
                alt13=4;
                }
                break;
            case 25:
                {
                alt13=5;
                }
                break;
            case 29:
                {
                alt13=6;
                }
                break;
            case 30:
                {
                alt13=7;
                }
                break;
            case 31:
                {
                alt13=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:930:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:930:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:931:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:936:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==24) && (synpred8_InternalHelloBuck())) {
                            alt11=1;
                        }
                        else if ( (LA11_1==EOF||(LA11_1>=RULE_ID && LA11_1<=RULE_DECIMAL)||LA11_1==14||LA11_1==25||(LA11_1>=32 && LA11_1<=33)||LA11_1==43||LA11_1==45||LA11_1==49||LA11_1==51||LA11_1==53||(LA11_1>=57 && LA11_1<=59)||LA11_1==62||(LA11_1>=64 && LA11_1<=71)) ) {
                            alt11=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:936:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:936:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:936:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:940:5: (kw= '>' kw= '>' )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:941:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2292); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2305); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:954:2: kw= '>'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2326); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:960:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:960:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:961:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:966:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==25) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred9_InternalHelloBuck()) ) {
                            alt12=1;
                        }
                        else if ( (true) ) {
                            alt12=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:966:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:966:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:966:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:970:5: (kw= '<' kw= '<' )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:971:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2379); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2392); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:984:2: kw= '<'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2413); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:991:2: kw= '<>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:998:2: kw= '?:'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1005:2: kw= '<=>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2472); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1018:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1019:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1020:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2512);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2522); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1027:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1030:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1031:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1031:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1032:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2569);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred10_InternalHelloBuck()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==33) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred10_InternalHelloBuck()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1045:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1045:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1045:7: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1046:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1051:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1052:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1052:1: ( ruleOpAdd )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1053:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2622);
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

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1066:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1067:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1067:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1068:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2645);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1092:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1093:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1094:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2684);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2695); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1101:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1104:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1105:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1105:1: (kw= '+' | kw= '-' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1106:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd2733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1113:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd2752); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1126:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1127:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1128:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2792);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2802); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1135:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1138:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1139:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1139:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1140:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2849);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred11_InternalHelloBuck()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred11_InternalHelloBuck()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred11_InternalHelloBuck()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 37:
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
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1153:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1153:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1153:7: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1154:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1159:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1160:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1160:1: ( ruleOpMulti )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1161:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2902);
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

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1174:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1175:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1175:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1176:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2925);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1200:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1201:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1202:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti2964);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti2975); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1209:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1212:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1213:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1213:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case 36:
                {
                alt17=3;
                }
                break;
            case 37:
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1214:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1221:2: kw= '**'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1228:2: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1235:2: kw= '%'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3070); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1248:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1249:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1250:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3110);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3120); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1257:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1260:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1261:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1261:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14||(LA18_0>=32 && LA18_0<=33)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_DECIMAL)||LA18_0==25||LA18_0==43||LA18_0==45||LA18_0==49||LA18_0==51||LA18_0==53||(LA18_0>=57 && LA18_0<=59)||LA18_0==62||(LA18_0>=64 && LA18_0<=71)) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1261:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1261:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1261:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1261:3: ()
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1262:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1267:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1268:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1268:1: ( ruleOpUnary )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1269:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3178);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1282:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1283:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1283:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1284:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3199);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1302:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3228);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1318:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1319:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1320:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3264);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3275); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1327:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1330:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1331:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1331:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case 32:
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1332:2: kw= '!'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleOpUnary3313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1339:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1346:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3351); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1359:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1360:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1361:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3391);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3401); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1368:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1371:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1372:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1372:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1373:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3448);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred12_InternalHelloBuck()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1383:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1383:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1383:6: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1384:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXCastedExpression3483); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1393:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1394:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1394:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1395:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3506);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1419:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1420:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1421:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3544);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3554); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1428:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1431:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1432:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1432:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1433:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3601);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop28:
            do {
                int alt28=3;
                switch ( input.LA(1) ) {
                case 39:
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
                case 40:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred14_InternalHelloBuck()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 41:
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
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1447:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1447:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1447:26: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1448:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3650); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1457:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1458:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1458:1: ( ruleValidID )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1459:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3673);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3689);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1480:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1481:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1481:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1482:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3711);
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
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1515:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1515:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1515:8: ()
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1516:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1521:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 41:
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
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1521:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3797); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1526:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1526:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1527:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1527:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1528:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall3821); if (state.failed) return current;
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
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1542:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1542:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1543:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1543:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1544:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3858); if (state.failed) return current;
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

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1557:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==25) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1557:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall3887); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1561:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1562:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1562:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1563:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3908);
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

            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1579:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==42) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1579:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3921); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1583:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1584:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1584:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1585:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3942);
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

            	            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall3956); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1605:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1606:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1606:1: ( ruleValidID )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1607:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3981);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1620:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt26=2;
            	    alt26 = dfa26.predict(input);
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1620:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1620:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1620:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1627:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1628:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4015); if (state.failed) return current;
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

            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt25=3;
            	            alt25 = dfa25.predict(input);
            	            switch (alt25) {
            	                case 1 :
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1658:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1659:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4100);
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
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1676:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1676:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1676:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1676:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1677:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1677:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1678:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4128);
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

            	                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1694:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop24:
            	                    do {
            	                        int alt24=2;
            	                        int LA24_0 = input.LA(1);

            	                        if ( (LA24_0==42) ) {
            	                            alt24=1;
            	                        }


            	                        switch (alt24) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1694:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4141); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1698:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1699:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1699:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1700:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4162);
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

            	            otherlv_21=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4179); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1720:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1720:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1723:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1724:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4214);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1748:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1749:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1750:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4254);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4264); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1757:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1760:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1761:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1761:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt29=13;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1762:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4311);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1772:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4338);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1782:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4365);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1792:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4392);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1802:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4419);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1812:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4446);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1822:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4473);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1832:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4500);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1842:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4527);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1852:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4554);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1862:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4581);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1872:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4608);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1882:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4635);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1898:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1899:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1900:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4670);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4680); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1907:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1910:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt30=6;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) && (synpred18_InternalHelloBuck())) {
                alt30=1;
            }
            else if ( ((LA30_0>=65 && LA30_0<=66)) ) {
                alt30=2;
            }
            else if ( ((LA30_0>=RULE_HEX && LA30_0<=RULE_DECIMAL)) ) {
                alt30=3;
            }
            else if ( (LA30_0==67) ) {
                alt30=4;
            }
            else if ( (LA30_0==RULE_STRING) ) {
                alt30=5;
            }
            else if ( (LA30_0==68) ) {
                alt30=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4740);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1924:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4768);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1934:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4795);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1944:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4822);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1954:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4849);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1964:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4876);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1980:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1981:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1982:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4911);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4921); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1989:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1992:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1993:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1993:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1993:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1993:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1993:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1995:5: ( () otherlv_1= '[' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1995:6: () otherlv_1= '['
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1995:6: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1996:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXClosure4981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2005:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2005:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2020:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2020:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2020:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID||LA32_0==28||LA32_0==43) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2020:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2020:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2021:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2021:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2022:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5054);
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

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2038:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==42) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2038:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5067); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2042:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2043:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2043:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2044:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5088);
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

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2060:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2061:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2061:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2062:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2075:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2076:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2076:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2077:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5147);
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

            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2105:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2106:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2107:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5195);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5205); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2114:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2117:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2118:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2118:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2118:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2118:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2119:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2124:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_DECIMAL)||LA35_0==14||LA35_0==25||(LA35_0>=32 && LA35_0<=33)||LA35_0==43||LA35_0==45||LA35_0==49||LA35_0==51||LA35_0==53||(LA35_0>=57 && LA35_0<=62)||(LA35_0>=64 && LA35_0<=71)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2124:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2124:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2125:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2125:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2126:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5261);
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

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2142:2: (otherlv_2= ';' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==48) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2142:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXExpressionInClosure5274); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2154:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2155:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2156:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5314);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5324); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2163:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2166:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2167:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2167:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2167:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2167:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2167:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2183:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2183:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2183:7: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2184:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2189:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==28||LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2189:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2189:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2190:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2190:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2191:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5432);
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

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2207:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==42) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2207:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXShortClosure5445); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2211:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2212:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2212:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2213:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5466);
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2229:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2230:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2230:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2231:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,46,FOLLOW_46_in_ruleXShortClosure5488); if (state.failed) return current;
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2244:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2245:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2245:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2246:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5524);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2270:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2271:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2272:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5560);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5570); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2279:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2282:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2283:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2283:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2283:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXParenthesizedExpression5607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5629);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression5640); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2308:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2309:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2310:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5676);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5686); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2317:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2320:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2321:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2321:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2321:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2321:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2322:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression5732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2335:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2336:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2336:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2337:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5765);
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

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression5777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2357:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2358:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2358:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2359:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5798);
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2375:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred22_InternalHelloBuck()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2375:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2375:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2375:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression5819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2380:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2381:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2381:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2382:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5841);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2406:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2407:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2408:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5879);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5889); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2415:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2418:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2419:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2419:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2419:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2419:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2420:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression5935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_DECIMAL)||LA40_0==14||LA40_0==25||(LA40_0>=32 && LA40_0<=33)||LA40_0==45||LA40_0==49||LA40_0==51||LA40_0==53||(LA40_0>=57 && LA40_0<=59)||LA40_0==62||(LA40_0>=64 && LA40_0<=71)) ) {
                alt40=1;
            }
            else if ( (LA40_0==43) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==RULE_ID) ) {
                    int LA40_3 = input.LA(3);

                    if ( ((LA40_3>=15 && LA40_3<=41)||(LA40_3>=43 && LA40_3<=45)||LA40_3==63) ) {
                        alt40=1;
                    }
                    else if ( (LA40_3==52) && (synpred24_InternalHelloBuck())) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA40_2>=RULE_STRING && LA40_2<=RULE_DECIMAL)||LA40_2==14||LA40_2==25||(LA40_2>=32 && LA40_2<=33)||LA40_2==43||LA40_2==45||LA40_2==49||LA40_2==51||LA40_2==53||(LA40_2>=57 && LA40_2<=59)||LA40_2==62||(LA40_2>=64 && LA40_2<=71)) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        int LA39_1 = input.LA(2);

                        if ( (LA39_1==52) && (synpred23_InternalHelloBuck())) {
                            alt39=1;
                        }
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2434:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2434:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2434:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2435:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2435:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2436:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5978);
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

                            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression5990); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2456:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2457:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2457:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2458:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6014);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2475:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2475:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2475:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2475:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2475:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2481:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2481:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXSwitchExpression6058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2485:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2486:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2486:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2487:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6079);
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

                    otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2507:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2508:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2508:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2509:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6114);
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

                    otherlv_9=(Token)match(input,44,FOLLOW_44_in_ruleXSwitchExpression6126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2533:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==28||LA41_0==43||LA41_0==52||LA41_0==56) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2534:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2534:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2535:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6161);
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2551:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2551:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2559:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2560:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2560:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2561:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6208);
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

            otherlv_15=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6222); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2589:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2590:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2591:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6258);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6268); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2598:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2601:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2602:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2602:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2602:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2602:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==28||LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2603:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2603:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2604:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6314);
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2620:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2620:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart6328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2624:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2625:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2625:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2626:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6349);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2646:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2647:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2647:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2648:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6384);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2672:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2673:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2674:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6420);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6430); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2681:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2684:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2685:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2685:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2685:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2685:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2686:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression6476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXForLoopExpression6488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2699:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2700:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2700:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2701:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6509);
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

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXForLoopExpression6521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2721:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2722:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2722:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2723:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6542);
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

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression6554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2743:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2744:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2744:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2745:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6575);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2769:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2770:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2771:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6611);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6621); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2778:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2781:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2782:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2782:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2782:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2782:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2783:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXWhileExpression6667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXWhileExpression6679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2796:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2797:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2797:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2798:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6700);
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

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression6712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2818:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2819:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2819:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2820:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6733);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2844:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2845:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2846:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6769);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6779); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2853:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2856:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2857:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2857:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2857:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2857:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2858:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression6825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2867:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2868:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2868:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2869:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6846);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression6858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXDoWhileExpression6870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2893:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2894:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2894:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2895:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6891);
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

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression6903); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2923:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2924:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2925:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6939);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6949); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2932:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2935:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2936:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2936:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2936:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2936:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2937:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression6995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2946:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_DECIMAL)||LA46_0==14||LA46_0==25||(LA46_0>=32 && LA46_0<=33)||LA46_0==43||LA46_0==45||LA46_0==49||LA46_0==51||LA46_0==53||(LA46_0>=57 && LA46_0<=62)||(LA46_0>=64 && LA46_0<=71)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2946:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2946:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2947:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2947:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2948:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7017);
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

            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2964:2: (otherlv_3= ';' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==48) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2964:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXBlockExpression7030); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression7046); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2980:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2981:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2982:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7082);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7092); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2989:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2992:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2993:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2993:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=60 && LA47_0<=61)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_DECIMAL)||LA47_0==14||LA47_0==25||(LA47_0>=32 && LA47_0<=33)||LA47_0==43||LA47_0==45||LA47_0==49||LA47_0==51||LA47_0==53||(LA47_0>=57 && LA47_0<=59)||LA47_0==62||(LA47_0>=64 && LA47_0<=71)) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2994:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7139);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3004:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7166);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3020:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3021:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3022:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7201);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7211); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3029:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3032:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3033:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3033:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3033:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3033:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3034:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3039:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==60) ) {
                alt48=1;
            }
            else if ( (LA48_0==61) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3039:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3039:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3040:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3040:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3041:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7264); if (state.failed) return current;
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3055:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration7295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3059:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred25_InternalHelloBuck()) ) {
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
            else if ( (LA49_0==43) && (synpred25_InternalHelloBuck())) {
                alt49=1;
            }
            else if ( (LA49_0==28) && (synpred25_InternalHelloBuck())) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3059:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3059:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3059:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3067:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3067:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3067:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3068:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3068:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3069:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7343);
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

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3085:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3086:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3086:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3087:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7364);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3104:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3104:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3105:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3105:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3106:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7393);
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3122:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==15) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3122:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXVariableDeclaration7407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3126:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3127:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3127:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3128:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7428);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3152:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3153:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3154:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7466);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7476); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3161:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3164:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3165:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3165:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3165:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3165:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ID||LA51_1==25||LA51_1==39||LA51_1==45) ) {
                    alt51=1;
                }
            }
            else if ( (LA51_0==28||LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3166:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3166:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3167:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7522);
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3183:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3184:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3184:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3185:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7544);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3209:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3210:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3211:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7580);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7590); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3218:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3221:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3222:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3222:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3222:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3222:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3223:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3223:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3224:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7636);
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3240:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3241:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3241:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3242:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7657);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3266:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3267:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3268:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7693);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7703); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3275:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3278:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3279:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3279:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3279:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3279:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3280:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3285:2: ( ( ruleStaticQualifier ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==63) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3286:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3286:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3287:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7760);
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3300:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==25) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3300:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall7774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3304:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3305:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3305:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3306:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7795);
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

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3322:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==42) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3322:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall7808); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3326:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3327:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3327:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3328:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7829);
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

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall7843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3348:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3349:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3349:1: ( ruleIdOrSuper )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3350:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7868);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3363:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3363:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3363:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3363:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3370:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3371:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7902); if (state.failed) return current;
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

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3384:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt56=3;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3384:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3384:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3384:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3401:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3402:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7987);
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
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3419:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3419:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3419:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3419:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3420:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3420:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3421:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8015);
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

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3437:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==42) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3437:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall8028); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3441:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3442:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3442:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3443:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8049);
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

                    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3463:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3463:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3466:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3467:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8101);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3491:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3492:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3493:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8139);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8150); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3500:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3503:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3504:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3504:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==62) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3505:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8197);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3517:2: kw= 'super'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleIdOrSuper8221); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3530:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3531:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3532:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8262);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8273); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3539:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3542:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3543:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3543:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==63) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3544:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8320);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleStaticQualifier8338); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3568:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3569:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3570:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8379);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8389); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3577:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3580:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3581:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3581:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3581:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3581:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3582:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXConstructorCall8435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3591:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3592:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3592:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3593:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8458);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3606:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3606:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3606:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3606:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3611:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3612:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3612:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3613:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8501);
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

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3629:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==42) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3629:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8514); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3633:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3634:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3634:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3635:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8535);
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

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall8549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3655:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3655:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3655:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3655:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3677:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3678:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8645);
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
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3695:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3695:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3695:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3695:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3696:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3696:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3697:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8673);
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

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3713:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==42) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3713:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8686); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3717:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3718:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3718:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3719:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8707);
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

                    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3739:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3739:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3742:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3743:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8759);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3767:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3768:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3769:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8796);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8806); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3776:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3779:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3780:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3780:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3780:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3780:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3781:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3786:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==65) ) {
                alt67=1;
            }
            else if ( (LA67_0==66) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3786:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral8853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3791:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3791:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3792:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3792:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3793:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral8877); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3814:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3815:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3816:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8927);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8937); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3823:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3826:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3827:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3827:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3827:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3827:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3828:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXNullLiteral8983); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3845:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3846:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3847:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9019);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9029); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3854:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3857:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3858:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3858:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3858:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3858:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3859:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3864:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3865:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3865:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3866:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9084);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3890:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3891:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3892:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9120);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9130); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3899:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3902:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3903:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3903:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3903:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3903:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3904:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3909:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3910:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3910:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3911:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9181); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3935:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3936:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3937:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9222);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9232); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3944:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3947:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3948:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3948:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3948:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3948:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3949:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTypeLiteral9278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXTypeLiteral9290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3962:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3963:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3963:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3964:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9313);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9325); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3989:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3990:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3991:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9361);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9371); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3998:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4001:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4002:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4002:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4002:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4002:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4003:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXThrowExpression9417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4012:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4013:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4013:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4014:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9438);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4038:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4039:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4040:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9474);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9484); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4047:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4050:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4051:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4051:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4051:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4051:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4052:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXReturnExpression9530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4061:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4061:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4066:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4067:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9561);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4091:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4092:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4093:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9598);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9608); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4100:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4103:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4104:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4104:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4104:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4104:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4105:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4114:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4115:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4115:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4116:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9675);
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

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4132:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==73) ) {
                alt71=1;
            }
            else if ( (LA71_0==72) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4132:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4132:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4132:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4132:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==73) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred34_InternalHelloBuck()) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4132:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4134:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4135:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9705);
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

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4151:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==72) ) {
                        int LA70_1 = input.LA(2);

                        if ( (synpred35_InternalHelloBuck()) ) {
                            alt70=1;
                        }
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4151:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4151:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4151:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9727); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4156:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4157:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4157:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4158:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9749);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4175:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4175:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4175:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4179:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4180:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4180:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4181:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9792);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4205:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4206:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4207:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9830);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9840); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4214:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4217:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4218:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4218:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4218:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4218:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4218:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleXCatchClause9885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXCatchClause9898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4227:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4228:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4228:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4229:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9919);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause9931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4249:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4250:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4250:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4251:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9952);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4275:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4276:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4277:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9989);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10000); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4284:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4287:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4288:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4288:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4289:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10047);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4299:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==39) ) {
                    int LA72_2 = input.LA(2);

                    if ( (LA72_2==RULE_ID) ) {
                        int LA72_3 = input.LA(3);

                        if ( (synpred37_InternalHelloBuck()) ) {
                            alt72=1;
                        }


                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4299:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4299:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4299:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName10075); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10098);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4326:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4330:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4331:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10152);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10163); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4341:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4345:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4346:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4346:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4346:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4354:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4354:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4354:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4354:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4354:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10235); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4362:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10261); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4369:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==39) ) {
                        int LA75_1 = input.LA(2);

                        if ( ((LA75_1>=RULE_INT && LA75_1<=RULE_DECIMAL)) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4370:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,39,FOLLOW_39_in_ruleNumber10281); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4375:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4375:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10297); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4383:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10323); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4401:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4402:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4403:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10376);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10386); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4410:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4413:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4414:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4414:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                alt78=1;
            }
            else if ( (LA78_0==28||LA78_0==43) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4414:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4414:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4415:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10434);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4423:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==45) ) {
                            int LA77_2 = input.LA(2);

                            if ( (LA77_2==47) ) {
                                int LA77_3 = input.LA(3);

                                if ( (synpred38_InternalHelloBuck()) ) {
                                    alt77=1;
                                }


                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4423:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4426:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4426:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4426:6: ()
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4427:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleJvmTypeReference10472); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleJvmTypeReference10484); if (state.failed) return current;
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4442:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10516);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4458:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4459:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4460:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10551);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10561); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4467:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4470:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4471:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4471:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4471:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4471:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==43) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4471:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4475:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_ID||LA80_0==28||LA80_0==43) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4475:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4475:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4476:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4476:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4477:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10621);
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

                            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4493:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==42) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4493:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef10634); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4497:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4498:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4498:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4499:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10655);
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

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleXFunctionTypeRef10685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4523:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4524:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4524:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4525:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10706);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4549:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4550:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4551:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10742);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10752); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4558:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4561:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4562:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4562:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4562:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4562:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4563:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4563:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4564:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10800);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4577:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4577:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4577:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4577:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference10821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4582:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4583:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4583:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4584:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10843);
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

                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4600:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==42) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4600:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleJvmParameterizedTypeReference10856); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4604:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4605:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4605:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4606:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10877);
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

                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference10891); if (state.failed) return current;
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4634:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4635:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4636:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10929);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10939); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4643:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4646:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4647:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4647:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID||LA84_0==28||LA84_0==43) ) {
                alt84=1;
            }
            else if ( (LA84_0==74) ) {
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4648:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10986);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4658:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11013);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4674:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4675:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4676:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11048);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11058); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4683:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4686:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4687:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4687:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4687:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4687:2: ()
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4688:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleJvmWildcardTypeReference11104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4697:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt85=3;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==75) ) {
                alt85=1;
            }
            else if ( (LA85_0==62) ) {
                alt85=2;
            }
            switch (alt85) {
                case 1 :
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4697:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4697:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4698:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4698:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4699:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11126);
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
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4716:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4716:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4717:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4717:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4718:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11153);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4742:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4743:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4744:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11191);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11201); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4751:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4754:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4755:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4755:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4755:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBound11238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4759:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4760:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4760:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4761:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11259);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4785:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4786:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4787:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11295);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11305); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4794:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4797:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4798:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4798:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4798:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBoundAnded11342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4802:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4803:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4803:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4804:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11363);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4828:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4829:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4830:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11399);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11409); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4837:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4840:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4841:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4841:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4841:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleJvmLowerBound11446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4845:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4846:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4846:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4847:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11467);
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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4873:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4874:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4875:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11506);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11517); if (state.failed) return current;

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
    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4882:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4885:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4886:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11556); if (state.failed) return current;
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
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:936:3: ( ( '>' '>' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:936:4: ( '>' '>' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:936:4: ( '>' '>' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:937:2: '>' '>'
        {
        match(input,24,FOLLOW_24_in_synpred8_InternalHelloBuck2276); if (state.failed) return ;
        match(input,24,FOLLOW_24_in_synpred8_InternalHelloBuck2281); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalHelloBuck

    // $ANTLR start synpred9_InternalHelloBuck
    public final void synpred9_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:966:3: ( ( '<' '<' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:966:4: ( '<' '<' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:966:4: ( '<' '<' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:967:2: '<' '<'
        {
        match(input,25,FOLLOW_25_in_synpred9_InternalHelloBuck2363); if (state.failed) return ;
        match(input,25,FOLLOW_25_in_synpred9_InternalHelloBuck2368); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalHelloBuck

    // $ANTLR start synpred10_InternalHelloBuck
    public final void synpred10_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1040:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1041:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1041:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1042:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1042:1: ( ruleOpAdd )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1043:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHelloBuck2590);
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
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1148:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1149:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1149:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1150:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1150:1: ( ruleOpMulti )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1151:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHelloBuck2870);
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
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:3: ( ( () 'as' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:4: ( () 'as' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:4: ( () 'as' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:5: () 'as'
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1381:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1382:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred12_InternalHelloBuck3464); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHelloBuck

    // $ANTLR start synpred13_InternalHelloBuck
    public final void synpred13_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1441:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1442:1: 
        {
        }

        match(input,39,FOLLOW_39_in_synpred13_InternalHelloBuck3618); if (state.failed) return ;
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1443:1: ( ( ruleValidID ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1444:1: ( ruleValidID )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1444:1: ( ruleValidID )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1445:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalHelloBuck3627);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloBuck3633);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloBuck

    // $ANTLR start synpred14_InternalHelloBuck
    public final void synpred14_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1499:10: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1500:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1500:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt86=3;
        switch ( input.LA(1) ) {
        case 39:
            {
            alt86=1;
            }
            break;
        case 40:
            {
            alt86=2;
            }
            break;
        case 41:
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
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1500:4: '.'
                {
                match(input,39,FOLLOW_39_in_synpred14_InternalHelloBuck3736); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1502:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1502:6: ( ( '?.' ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1503:1: ( '?.' )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1503:1: ( '?.' )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1504:2: '?.'
                {
                match(input,40,FOLLOW_40_in_synpred14_InternalHelloBuck3750); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1509:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1509:6: ( ( '*.' ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1510:1: ( '*.' )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1510:1: ( '*.' )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1511:2: '*.'
                {
                match(input,41,FOLLOW_41_in_synpred14_InternalHelloBuck3770); if (state.failed) return ;

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
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1620:4: ( ( '(' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1621:1: ( '(' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1621:1: ( '(' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1622:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred15_InternalHelloBuck3997); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloBuck

    // $ANTLR start synpred16_InternalHelloBuck
    public final void synpred16_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1641:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1642:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1642:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==28||LA88_0==43) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1642:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1642:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1643:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1643:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1644:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloBuck4049);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1646:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==42) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1646:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred16_InternalHelloBuck4056); if (state.failed) return ;
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1647:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1648:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1648:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1649:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloBuck4063);
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

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1651:6: ( ( '|' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1652:1: ( '|' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1652:1: ( '|' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1653:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred16_InternalHelloBuck4077); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloBuck

    // $ANTLR start synpred17_InternalHelloBuck
    public final void synpred17_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1720:4: ( ( () '[' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1720:5: ( () '[' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1720:5: ( () '[' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1720:6: () '['
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1720:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1721:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred17_InternalHelloBuck4197); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHelloBuck

    // $ANTLR start synpred18_InternalHelloBuck
    public final void synpred18_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:3: ( ( () '[' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:4: ( () '[' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:4: ( () '[' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:5: () '['
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1911:5: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:1912:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred18_InternalHelloBuck4721); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHelloBuck

    // $ANTLR start synpred20_InternalHelloBuck
    public final void synpred20_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2005:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2005:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2005:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2005:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2005:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==28||LA90_0==43) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2005:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2005:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2006:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2006:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2007:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloBuck5000);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2009:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==42) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2009:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred20_InternalHelloBuck5007); if (state.failed) return ;
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2010:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2011:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2011:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2012:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloBuck5014);
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

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2014:6: ( ( '|' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2015:1: ( '|' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2015:1: ( '|' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2016:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred20_InternalHelloBuck5028); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHelloBuck

    // $ANTLR start synpred22_InternalHelloBuck
    public final void synpred22_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2375:4: ( 'else' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2375:6: 'else'
        {
        match(input,50,FOLLOW_50_in_synpred22_InternalHelloBuck5811); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHelloBuck

    // $ANTLR start synpred23_InternalHelloBuck
    public final void synpred23_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2429:6: ( ( ruleValidID ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2430:1: ( ruleValidID )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2430:1: ( ruleValidID )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2431:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHelloBuck5953);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,52,FOLLOW_52_in_synpred23_InternalHelloBuck5959); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHelloBuck

    // $ANTLR start synpred24_InternalHelloBuck
    public final void synpred24_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2475:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2475:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2475:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2475:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,43,FOLLOW_43_in_synpred24_InternalHelloBuck6035); if (state.failed) return ;
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2476:1: ( ( ruleValidID ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2477:1: ( ruleValidID )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2477:1: ( ruleValidID )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:2478:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalHelloBuck6042);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,52,FOLLOW_52_in_synpred24_InternalHelloBuck6048); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloBuck

    // $ANTLR start synpred25_InternalHelloBuck
    public final void synpred25_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3059:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3059:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3059:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3059:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3059:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3060:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3060:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3061:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloBuck7313);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3063:2: ( ( ruleValidID ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3064:1: ( ruleValidID )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3064:1: ( ruleValidID )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3065:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalHelloBuck7322);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHelloBuck

    // $ANTLR start synpred26_InternalHelloBuck
    public final void synpred26_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3363:4: ( ( '(' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3364:1: ( '(' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3364:1: ( '(' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3365:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred26_InternalHelloBuck7884); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloBuck

    // $ANTLR start synpred27_InternalHelloBuck
    public final void synpred27_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3384:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3384:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3384:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3384:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3384:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3385:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3385:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==28||LA94_0==43) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3385:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3385:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3386:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3386:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3387:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloBuck7936);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3389:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==42) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3389:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred27_InternalHelloBuck7943); if (state.failed) return ;
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3390:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3391:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3391:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3392:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloBuck7950);
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

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3394:6: ( ( '|' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3395:1: ( '|' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3395:1: ( '|' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3396:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred27_InternalHelloBuck7964); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHelloBuck

    // $ANTLR start synpred28_InternalHelloBuck
    public final void synpred28_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3463:4: ( ( () '[' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3463:5: ( () '[' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3463:5: ( () '[' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3463:6: () '['
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3463:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3464:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred28_InternalHelloBuck8084); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHelloBuck

    // $ANTLR start synpred29_InternalHelloBuck
    public final void synpred29_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3606:4: ( '<' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3606:6: '<'
        {
        match(input,25,FOLLOW_25_in_synpred29_InternalHelloBuck8471); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalHelloBuck

    // $ANTLR start synpred30_InternalHelloBuck
    public final void synpred30_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3655:5: ( '(' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3655:7: '('
        {
        match(input,43,FOLLOW_43_in_synpred30_InternalHelloBuck8564); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloBuck

    // $ANTLR start synpred31_InternalHelloBuck
    public final void synpred31_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3660:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3661:1: 
        {
        }

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3661:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==28||LA96_0==43) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3661:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3661:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3662:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3662:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3663:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloBuck8594);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3665:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==42) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3665:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred31_InternalHelloBuck8601); if (state.failed) return ;
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3666:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3667:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3667:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3668:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloBuck8608);
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

        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3670:6: ( ( '|' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3671:1: ( '|' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3671:1: ( '|' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3672:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred31_InternalHelloBuck8622); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHelloBuck

    // $ANTLR start synpred32_InternalHelloBuck
    public final void synpred32_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3739:4: ( ( () '[' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3739:5: ( () '[' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3739:5: ( () '[' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3739:6: () '['
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3739:6: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:3740:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred32_InternalHelloBuck8742); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalHelloBuck

    // $ANTLR start synpred33_InternalHelloBuck
    public final void synpred33_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4061:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4062:1: ( ruleXExpression )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4062:1: ( ruleXExpression )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4063:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalHelloBuck9544);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalHelloBuck

    // $ANTLR start synpred34_InternalHelloBuck
    public final void synpred34_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4132:5: ( 'catch' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4132:7: 'catch'
        {
        match(input,73,FOLLOW_73_in_synpred34_InternalHelloBuck9689); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalHelloBuck

    // $ANTLR start synpred35_InternalHelloBuck
    public final void synpred35_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4151:5: ( 'finally' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4151:7: 'finally'
        {
        match(input,72,FOLLOW_72_in_synpred35_InternalHelloBuck9719); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloBuck

    // $ANTLR start synpred37_InternalHelloBuck
    public final void synpred37_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4299:3: ( '.' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4300:2: '.'
        {
        match(input,39,FOLLOW_39_in_synpred37_InternalHelloBuck10066); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHelloBuck

    // $ANTLR start synpred38_InternalHelloBuck
    public final void synpred38_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4423:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4423:3: ( () '[' ']' )
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4423:3: ( () '[' ']' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4423:4: () '[' ']'
        {
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4423:4: ()
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4424:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred38_InternalHelloBuck10449); if (state.failed) return ;
        match(input,47,FOLLOW_47_in_synpred38_InternalHelloBuck10453); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalHelloBuck

    // $ANTLR start synpred39_InternalHelloBuck
    public final void synpred39_InternalHelloBuck_fragment() throws RecognitionException {   
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4577:4: ( '<' )
        // ../org.xtext.example.hellobuck/src-gen/org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.g:4577:6: '<'
        {
        match(input,25,FOLLOW_25_in_synpred39_InternalHelloBuck10813); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalHelloBuck

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
    public final boolean synpred39_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalHelloBuck_fragment(); // can never throw exception
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
    public final boolean synpred38_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalHelloBuck_fragment(); // can never throw exception
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
    public final boolean synpred34_InternalHelloBuck() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalHelloBuck_fragment(); // can never throw exception
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
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
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
        "\13\uffff";
    static final String DFA10_eofS =
        "\1\1\12\uffff";
    static final String DFA10_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA10_maxS =
        "\1\111\1\uffff\10\0\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA10_specialS =
        "\2\uffff\1\0\1\4\1\5\1\3\1\1\1\2\1\7\1\6\1\uffff}>";
    static final String[] DFA10_transitionS = {
            "\5\1\5\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\16\1\1\uffff\20\1\1\uffff\12\1",
            "",
            "\1\uffff",
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
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloBuck()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_8);
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
    static final String DFA26_eotS =
        "\101\uffff";
    static final String DFA26_eofS =
        "\1\2\100\uffff";
    static final String DFA26_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA26_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA26_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA26_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\20\2\1\uffff\12"+
            "\2",
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
            return "1620:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred15_InternalHelloBuck()) ) {s = 64;}

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
        "\1\107\2\0\33\uffff";
    static final String DFA25_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA25_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\4\5\5\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
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
            return "1641:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA25_0==43) ) {s = 2;}

                        else if ( (LA25_0==28) && (synpred16_InternalHelloBuck())) {s = 3;}

                        else if ( (LA25_0==46) && (synpred16_InternalHelloBuck())) {s = 4;}

                        else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_DECIMAL)||LA25_0==14||LA25_0==25||(LA25_0>=32 && LA25_0<=33)||LA25_0==45||LA25_0==49||LA25_0==51||LA25_0==53||(LA25_0>=57 && LA25_0<=59)||LA25_0==62||(LA25_0>=64 && LA25_0<=71)) ) {s = 5;}

                        else if ( (LA25_0==44) ) {s = 29;}

                         
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
        "\101\uffff";
    static final String DFA27_eofS =
        "\1\2\100\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA27_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA27_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\35\2\1\1\1\uffff\20\2\1\uffff\12\2",
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
            return "1720:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred17_InternalHelloBuck()) ) {s = 64;}

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
    static final String DFA29_eotS =
        "\16\uffff";
    static final String DFA29_eofS =
        "\16\uffff";
    static final String DFA29_minS =
        "\1\4\15\uffff";
    static final String DFA29_maxS =
        "\1\107\15\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA29_specialS =
        "\16\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\4\4\5\20\uffff\1\4\21\uffff\1\15\1\uffff\1\5\3\uffff\1\6"+
            "\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1"+
            "\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
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

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1761:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA33_eotS =
        "\40\uffff";
    static final String DFA33_eofS =
        "\40\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA33_maxS =
        "\1\107\2\0\35\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\4\5\5\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
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
            return "2005:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA33_0==43) ) {s = 2;}

                        else if ( (LA33_0==28) && (synpred20_InternalHelloBuck())) {s = 3;}

                        else if ( (LA33_0==46) && (synpred20_InternalHelloBuck())) {s = 4;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_DECIMAL)||LA33_0==14||LA33_0==25||(LA33_0>=32 && LA33_0<=33)||LA33_0==45||LA33_0==47||LA33_0==49||LA33_0==51||LA33_0==53||(LA33_0>=57 && LA33_0<=62)||(LA33_0>=64 && LA33_0<=71)) ) {s = 5;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloBuck()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA57_eofS =
        "\1\2\100\uffff";
    static final String DFA57_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA57_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA57_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA57_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\20\2\1\uffff\12"+
            "\2",
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
            return "3363:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalHelloBuck()) ) {s = 64;}

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
        "\1\107\2\0\33\uffff";
    static final String DFA56_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA56_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\4\5\5\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
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
            return "3384:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA56_0==43) ) {s = 2;}

                        else if ( (LA56_0==28) && (synpred27_InternalHelloBuck())) {s = 3;}

                        else if ( (LA56_0==46) && (synpred27_InternalHelloBuck())) {s = 4;}

                        else if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_DECIMAL)||LA56_0==14||LA56_0==25||(LA56_0>=32 && LA56_0<=33)||LA56_0==45||LA56_0==49||LA56_0==51||LA56_0==53||(LA56_0>=57 && LA56_0<=59)||LA56_0==62||(LA56_0>=64 && LA56_0<=71)) ) {s = 5;}

                        else if ( (LA56_0==44) ) {s = 29;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloBuck()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA58_eofS =
        "\1\2\100\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA58_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA58_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\35\2\1\1\1\uffff\20\2\1\uffff\12\2",
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
            return "3463:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalHelloBuck()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA62_eofS =
        "\1\2\100\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA62_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA62_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\20\2\1\uffff"+
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
            return "3606:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred29_InternalHelloBuck()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA65_eofS =
        "\1\2\100\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA65_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\20\2\1\uffff\12"+
            "\2",
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
            return "3655:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred30_InternalHelloBuck()) ) {s = 64;}

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
        "\1\107\2\0\33\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\4\5\5\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
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
            return "3660:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA64_0==43) ) {s = 2;}

                        else if ( (LA64_0==28) && (synpred31_InternalHelloBuck())) {s = 3;}

                        else if ( (LA64_0==46) && (synpred31_InternalHelloBuck())) {s = 4;}

                        else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||LA64_0==14||LA64_0==25||(LA64_0>=32 && LA64_0<=33)||LA64_0==45||LA64_0==49||LA64_0==51||LA64_0==53||(LA64_0>=57 && LA64_0<=59)||LA64_0==62||(LA64_0>=64 && LA64_0<=71)) ) {s = 5;}

                        else if ( (LA64_0==44) ) {s = 29;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloBuck()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA66_eofS =
        "\1\2\100\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA66_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\35\2\1\1\1\uffff\20\2\1\uffff\12\2",
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
            return "3739:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred32_InternalHelloBuck()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA68_eofS =
        "\1\33\100\uffff";
    static final String DFA68_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA68_maxS =
        "\1\111\32\0\46\uffff";
    static final String DFA68_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\46\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\5\uffff\1\2\1\uffff\11\33\1\10\6\33"+
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
            return "4061:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_3 = input.LA(1);

                         
                        int index68_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA68_4 = input.LA(1);

                         
                        int index68_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA68_5 = input.LA(1);

                         
                        int index68_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA68_6 = input.LA(1);

                         
                        int index68_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA68_7 = input.LA(1);

                         
                        int index68_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA68_8 = input.LA(1);

                         
                        int index68_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA68_9 = input.LA(1);

                         
                        int index68_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA68_10 = input.LA(1);

                         
                        int index68_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA68_11 = input.LA(1);

                         
                        int index68_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA68_12 = input.LA(1);

                         
                        int index68_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA68_13 = input.LA(1);

                         
                        int index68_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA68_14 = input.LA(1);

                         
                        int index68_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA68_15 = input.LA(1);

                         
                        int index68_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA68_16 = input.LA(1);

                         
                        int index68_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA68_17 = input.LA(1);

                         
                        int index68_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA68_18 = input.LA(1);

                         
                        int index68_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA68_19 = input.LA(1);

                         
                        int index68_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA68_20 = input.LA(1);

                         
                        int index68_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA68_21 = input.LA(1);

                         
                        int index68_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA68_22 = input.LA(1);

                         
                        int index68_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA68_23 = input.LA(1);

                         
                        int index68_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA68_24 = input.LA(1);

                         
                        int index68_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA68_25 = input.LA(1);

                         
                        int index68_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA68_26 = input.LA(1);

                         
                        int index68_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloBuck()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA83_eofS =
        "\1\2\100\uffff";
    static final String DFA83_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA83_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA83_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA83_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA83_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\20\2\1\uffff"+
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
            return "4577:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred39_InternalHelloBuck()) ) {s = 64;}

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
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment457 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment507 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment560 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
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
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression908 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression931 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpOr1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1114 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1167 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1190 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpAnd1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1373 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1426 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1449 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpEquality1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1653 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_21_in_ruleXRelationalExpression1689 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1712 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1773 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1796 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare1836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpCompare1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2039 = new BitSet(new long[]{0x00000000FF000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2092 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2115 = new BitSet(new long[]{0x00000000FF000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2261 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2292 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2348 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2379 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2569 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2622 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2645 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2849 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2902 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2925 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3178 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpUnary3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3448 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleXCastedExpression3483 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3506 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3601 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3673 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3689 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3711 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3797 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall3821 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3858 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall3887 = new BitSet(new long[]{0x0000080010000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3908 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3921 = new BitSet(new long[]{0x0000080010000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3942 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall3956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3981 = new BitSet(new long[]{0x00002B8000000002L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4015 = new BitSet(new long[]{0x4E2A7803120041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4100 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4128 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4141 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4162 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4179 = new BitSet(new long[]{0x0000238000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4214 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXClosure4981 = new BitSet(new long[]{0x7E2AE803120041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5054 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5067 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5088 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5110 = new BitSet(new long[]{0x7E2AA803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5147 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5261 = new BitSet(new long[]{0x7E2B2803020041F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_48_in_ruleXExpressionInClosure5274 = new BitSet(new long[]{0x7E2A2803020041F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5432 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleXShortClosure5445 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5466 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleXShortClosure5488 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXParenthesizedExpression5607 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5629 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression5732 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5744 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5765 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression5777 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5798 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression5819 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression5935 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5978 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression5990 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6014 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43_in_ruleXSwitchExpression6058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6079 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6091 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6114 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXSwitchExpression6126 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6140 = new BitSet(new long[]{0x0110080010000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6161 = new BitSet(new long[]{0x01D0080010000010L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6175 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6187 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6208 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6314 = new BitSet(new long[]{0x0110000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart6328 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6349 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6363 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression6476 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXForLoopExpression6488 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6509 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXForLoopExpression6521 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6542 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression6554 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXWhileExpression6667 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXWhileExpression6679 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6700 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression6712 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression6825 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6846 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression6858 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXDoWhileExpression6870 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6891 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression6995 = new BitSet(new long[]{0x7EAA2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7017 = new BitSet(new long[]{0x7EAB2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_48_in_ruleXBlockExpression7030 = new BitSet(new long[]{0x7EAA2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7264 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration7295 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7364 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7393 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleXVariableDeclaration7407 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7760 = new BitSet(new long[]{0x4000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall7774 = new BitSet(new long[]{0x0000080010000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7795 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall7808 = new BitSet(new long[]{0x0000080010000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7829 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall7843 = new BitSet(new long[]{0x4000000002000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7868 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7902 = new BitSet(new long[]{0x4E2A7803120041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7987 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8015 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall8028 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8049 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8066 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleIdOrSuper8221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8320 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleStaticQualifier8338 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXConstructorCall8435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8458 = new BitSet(new long[]{0x0000280002000002L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8479 = new BitSet(new long[]{0x0000080010000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8501 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8514 = new BitSet(new long[]{0x0000080010000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8535 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall8549 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8572 = new BitSet(new long[]{0x4E2A7803120041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8645 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8673 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8686 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8707 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8724 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral8877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXNullLiteral8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTypeLiteral9278 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXTypeLiteral9290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9313 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXThrowExpression9417 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXReturnExpression9530 = new BitSet(new long[]{0x4E2A2803020041F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9654 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9705 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9727 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9771 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXCatchClause9885 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXCatchClause9898 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9919 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause9931 = new BitSet(new long[]{0x4E2A2803020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10047 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName10075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10098 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10235 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10261 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleNumber10281 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10434 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleJvmTypeReference10472 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleJvmTypeReference10484 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10599 = new BitSet(new long[]{0x0000180010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10621 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef10634 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10655 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10671 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXFunctionTypeRef10685 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10800 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference10821 = new BitSet(new long[]{0x0000080010000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10843 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_42_in_ruleJvmParameterizedTypeReference10856 = new BitSet(new long[]{0x0000080010000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10877 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference10891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmWildcardTypeReference11104 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBound11238 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBoundAnded11342 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleJvmLowerBound11446 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloBuck528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloBuck876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloBuck1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloBuck1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred5_InternalHelloBuck1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloBuck1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloBuck2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred8_InternalHelloBuck2276 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred8_InternalHelloBuck2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred9_InternalHelloBuck2363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred9_InternalHelloBuck2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHelloBuck2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHelloBuck2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalHelloBuck3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred13_InternalHelloBuck3618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalHelloBuck3627 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloBuck3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred14_InternalHelloBuck3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred14_InternalHelloBuck3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalHelloBuck3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred15_InternalHelloBuck3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloBuck4049 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred16_InternalHelloBuck4056 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloBuck4063 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalHelloBuck4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred17_InternalHelloBuck4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred18_InternalHelloBuck4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloBuck5000 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred20_InternalHelloBuck5007 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloBuck5014 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred20_InternalHelloBuck5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred22_InternalHelloBuck5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHelloBuck5953 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred23_InternalHelloBuck5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred24_InternalHelloBuck6035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalHelloBuck6042 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred24_InternalHelloBuck6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloBuck7313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalHelloBuck7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred26_InternalHelloBuck7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloBuck7936 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred27_InternalHelloBuck7943 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloBuck7950 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred27_InternalHelloBuck7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred28_InternalHelloBuck8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred29_InternalHelloBuck8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred30_InternalHelloBuck8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloBuck8594 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred31_InternalHelloBuck8601 = new BitSet(new long[]{0x0000080010000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloBuck8608 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred31_InternalHelloBuck8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred32_InternalHelloBuck8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalHelloBuck9544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred34_InternalHelloBuck9689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred35_InternalHelloBuck9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred37_InternalHelloBuck10066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred38_InternalHelloBuck10449 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred38_InternalHelloBuck10453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred39_InternalHelloBuck10813 = new BitSet(new long[]{0x0000000000000002L});

}