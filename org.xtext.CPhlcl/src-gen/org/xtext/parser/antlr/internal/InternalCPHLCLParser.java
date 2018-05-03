package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.CPHLCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCPHLCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'variables:'", "'constraints:'", "'strategy:'", "'domain:'", "'..'", "'['", "']'", "':'", "'('", "')'", "'if'", "'then'", "'else'", "'end_if'", "'one'", "'two'", "'true'", "'false'", "'AND'", "'OR'", "'XOR'", "'=>'", "'<=>'", "'NOT'", "'>'", "'<'", "'>='", "'<='", "'='", "'!='", "'at_most'", "'all_different'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'pow'", "'dist'", "'bool'", "'integer'", "'symbolic'", "','"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCPHLCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCPHLCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCPHLCLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCPHLCL.g"; }



     	private CPHLCLGrammarAccess grammarAccess;

        public InternalCPHLCLParser(TokenStream input, CPHLCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CPHLCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCPHLCL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCPHLCL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCPHLCL.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCPHLCL.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_vars_3_0 = null;

        EObject lv_constraints_5_0 = null;

        AntlrDatatypeRuleToken lv_strategy_7_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) ) )
            // InternalCPHLCL.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) )
            {
            // InternalCPHLCL.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) )
            // InternalCPHLCL.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
              		
            }
            // InternalCPHLCL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCPHLCL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCPHLCL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalCPHLCL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getVariablesKeyword_2());
              		
            }
            // InternalCPHLCL.g:105:3: ( (lv_vars_3_0= ruleVarDeclaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=51 && LA1_0<=53)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCPHLCL.g:106:4: (lv_vars_3_0= ruleVarDeclaration )
            	    {
            	    // InternalCPHLCL.g:106:4: (lv_vars_3_0= ruleVarDeclaration )
            	    // InternalCPHLCL.g:107:5: lv_vars_3_0= ruleVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_vars_3_0=ruleVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"vars",
            	      						lv_vars_3_0,
            	      						"org.xtext.CPHLCL.VarDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getConstraintsKeyword_4());
              		
            }
            // InternalCPHLCL.g:128:3: ( (lv_constraints_5_0= ruleConstraint ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCPHLCL.g:129:4: (lv_constraints_5_0= ruleConstraint )
            	    {
            	    // InternalCPHLCL.g:129:4: (lv_constraints_5_0= ruleConstraint )
            	    // InternalCPHLCL.g:130:5: lv_constraints_5_0= ruleConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_constraints_5_0=ruleConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_5_0,
            	      						"org.xtext.CPHLCL.Constraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getStrategyKeyword_6());
              		
            }
            // InternalCPHLCL.g:151:3: ( (lv_strategy_7_0= ruleStrategy ) )
            // InternalCPHLCL.g:152:4: (lv_strategy_7_0= ruleStrategy )
            {
            // InternalCPHLCL.g:152:4: (lv_strategy_7_0= ruleStrategy )
            // InternalCPHLCL.g:153:5: lv_strategy_7_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getStrategyStrategyParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_strategy_7_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"strategy",
              						lv_strategy_7_0,
              						"org.xtext.CPHLCL.Strategy");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalCPHLCL.g:174:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalCPHLCL.g:174:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalCPHLCL.g:175:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalCPHLCL.g:181:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_domain_3_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:187:2: ( ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) ) )
            // InternalCPHLCL.g:188:2: ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) )
            {
            // InternalCPHLCL.g:188:2: ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) )
            // InternalCPHLCL.g:189:3: ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) )
            {
            // InternalCPHLCL.g:189:3: ( (lv_type_0_0= ruleVarType ) )
            // InternalCPHLCL.g:190:4: (lv_type_0_0= ruleVarType )
            {
            // InternalCPHLCL.g:190:4: (lv_type_0_0= ruleVarType )
            // InternalCPHLCL.g:191:5: lv_type_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.xtext.CPHLCL.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPHLCL.g:208:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCPHLCL.g:209:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCPHLCL.g:209:4: (lv_name_1_0= RULE_ID )
            // InternalCPHLCL.g:210:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVarDeclarationAccess().getDomainKeyword_2());
              		
            }
            // InternalCPHLCL.g:230:3: ( (lv_domain_3_0= ruleDomainDeclaration ) )
            // InternalCPHLCL.g:231:4: (lv_domain_3_0= ruleDomainDeclaration )
            {
            // InternalCPHLCL.g:231:4: (lv_domain_3_0= ruleDomainDeclaration )
            // InternalCPHLCL.g:232:5: lv_domain_3_0= ruleDomainDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarDeclarationAccess().getDomainDomainDeclarationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_domain_3_0=ruleDomainDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
              					}
              					set(
              						current,
              						"domain",
              						lv_domain_3_0,
              						"org.xtext.CPHLCL.DomainDeclaration");
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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleDomainDeclaration"
    // InternalCPHLCL.g:253:1: entryRuleDomainDeclaration returns [EObject current=null] : iv_ruleDomainDeclaration= ruleDomainDeclaration EOF ;
    public final EObject entryRuleDomainDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDeclaration = null;


        try {
            // InternalCPHLCL.g:253:58: (iv_ruleDomainDeclaration= ruleDomainDeclaration EOF )
            // InternalCPHLCL.g:254:2: iv_ruleDomainDeclaration= ruleDomainDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainDeclaration=ruleDomainDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainDeclaration"


    // $ANTLR start "ruleDomainDeclaration"
    // InternalCPHLCL.g:260:1: ruleDomainDeclaration returns [EObject current=null] : (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleDomainDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Interval_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:266:2: ( (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) )
            // InternalCPHLCL.g:267:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            {
            // InternalCPHLCL.g:267:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
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
                    // InternalCPHLCL.g:268:3: this_Interval_0= ruleInterval
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDomainDeclarationAccess().getIntervalParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Interval_0=ruleInterval();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Interval_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:277:3: this_Enumeration_1= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDomainDeclarationAccess().getEnumerationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Enumeration_1;
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
    // $ANTLR end "ruleDomainDeclaration"


    // $ANTLR start "entryRuleInterval"
    // InternalCPHLCL.g:289:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalCPHLCL.g:289:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalCPHLCL.g:290:2: iv_ruleInterval= ruleInterval EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntervalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterval; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalCPHLCL.g:296:1: ruleInterval returns [EObject current=null] : ( ( (lv_start_0_0= ruleEnumerableValue ) ) otherlv_1= '..' ( (lv_end_2_0= ruleEnumerableValue ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_start_0_0 = null;

        AntlrDatatypeRuleToken lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:302:2: ( ( ( (lv_start_0_0= ruleEnumerableValue ) ) otherlv_1= '..' ( (lv_end_2_0= ruleEnumerableValue ) ) ) )
            // InternalCPHLCL.g:303:2: ( ( (lv_start_0_0= ruleEnumerableValue ) ) otherlv_1= '..' ( (lv_end_2_0= ruleEnumerableValue ) ) )
            {
            // InternalCPHLCL.g:303:2: ( ( (lv_start_0_0= ruleEnumerableValue ) ) otherlv_1= '..' ( (lv_end_2_0= ruleEnumerableValue ) ) )
            // InternalCPHLCL.g:304:3: ( (lv_start_0_0= ruleEnumerableValue ) ) otherlv_1= '..' ( (lv_end_2_0= ruleEnumerableValue ) )
            {
            // InternalCPHLCL.g:304:3: ( (lv_start_0_0= ruleEnumerableValue ) )
            // InternalCPHLCL.g:305:4: (lv_start_0_0= ruleEnumerableValue )
            {
            // InternalCPHLCL.g:305:4: (lv_start_0_0= ruleEnumerableValue )
            // InternalCPHLCL.g:306:5: lv_start_0_0= ruleEnumerableValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntervalAccess().getStartEnumerableValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_start_0_0=ruleEnumerableValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntervalRule());
              					}
              					set(
              						current,
              						"start",
              						lv_start_0_0,
              						"org.xtext.CPHLCL.EnumerableValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalCPHLCL.g:327:3: ( (lv_end_2_0= ruleEnumerableValue ) )
            // InternalCPHLCL.g:328:4: (lv_end_2_0= ruleEnumerableValue )
            {
            // InternalCPHLCL.g:328:4: (lv_end_2_0= ruleEnumerableValue )
            // InternalCPHLCL.g:329:5: lv_end_2_0= ruleEnumerableValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntervalAccess().getEndEnumerableValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_end_2_0=ruleEnumerableValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntervalRule());
              					}
              					set(
              						current,
              						"end",
              						lv_end_2_0,
              						"org.xtext.CPHLCL.EnumerableValue");
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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleEnumeration"
    // InternalCPHLCL.g:350:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalCPHLCL.g:350:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalCPHLCL.g:351:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalCPHLCL.g:357:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:363:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalCPHLCL.g:364:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalCPHLCL.g:364:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalCPHLCL.g:365:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalCPHLCL.g:369:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalCPHLCL.g:370:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalCPHLCL.g:370:4: (lv_list_1_0= ruleListOfValues )
            // InternalCPHLCL.g:371:5: lv_list_1_0= ruleListOfValues
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_list_1_0=ruleListOfValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumerationRule());
              					}
              					set(
              						current,
              						"list",
              						lv_list_1_0,
              						"org.xtext.CPHLCL.ListOfValues");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_2());
              		
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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleConstraint"
    // InternalCPHLCL.g:396:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalCPHLCL.g:396:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCPHLCL.g:397:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCPHLCL.g:403:1: ruleConstraint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:409:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) ) ) )
            // InternalCPHLCL.g:410:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) ) )
            {
            // InternalCPHLCL.g:410:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) ) )
            // InternalCPHLCL.g:411:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) )
            {
            // InternalCPHLCL.g:411:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCPHLCL.g:412:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCPHLCL.g:412:4: (lv_name_0_0= RULE_ID )
            // InternalCPHLCL.g:413:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstraintRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getColonKeyword_1());
              		
            }
            // InternalCPHLCL.g:433:3: ( (lv_exp_2_0= ruleExpression ) )
            // InternalCPHLCL.g:434:4: (lv_exp_2_0= ruleExpression )
            {
            // InternalCPHLCL.g:434:4: (lv_exp_2_0= ruleExpression )
            // InternalCPHLCL.g:435:5: lv_exp_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstraintAccess().getExpExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstraintRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_2_0,
              						"org.xtext.CPHLCL.Expression");
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleExpression"
    // InternalCPHLCL.g:456:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCPHLCL.g:456:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCPHLCL.g:457:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCPHLCL.g:463:1: ruleExpression returns [EObject current=null] : (this_Global_0= ruleGlobal | ( ( ( ruleBoolTerm ) )=>this_Logic_1= ruleLogic ) | ( ( ( ruleNumericTerm ) )=>this_Relational_2= ruleRelational ) | this_Control_3= ruleControl ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Global_0 = null;

        EObject this_Logic_1 = null;

        EObject this_Relational_2 = null;

        EObject this_Control_3 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:469:2: ( (this_Global_0= ruleGlobal | ( ( ( ruleBoolTerm ) )=>this_Logic_1= ruleLogic ) | ( ( ( ruleNumericTerm ) )=>this_Relational_2= ruleRelational ) | this_Control_3= ruleControl ) )
            // InternalCPHLCL.g:470:2: (this_Global_0= ruleGlobal | ( ( ( ruleBoolTerm ) )=>this_Logic_1= ruleLogic ) | ( ( ( ruleNumericTerm ) )=>this_Relational_2= ruleRelational ) | this_Control_3= ruleControl )
            {
            // InternalCPHLCL.g:470:2: (this_Global_0= ruleGlobal | ( ( ( ruleBoolTerm ) )=>this_Logic_1= ruleLogic ) | ( ( ( ruleNumericTerm ) )=>this_Relational_2= ruleRelational ) | this_Control_3= ruleControl )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=42 && LA4_0<=43)) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                int LA4_3 = input.LA(2);

                if ( (synpred1_InternalCPHLCL()) ) {
                    alt4=2;
                }
                else if ( (synpred2_InternalCPHLCL()) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_4 = input.LA(2);

                if ( (synpred1_InternalCPHLCL()) ) {
                    alt4=2;
                }
                else if ( (synpred2_InternalCPHLCL()) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_INT) && (synpred2_InternalCPHLCL())) {
                alt4=3;
            }
            else if ( (LA4_0==22) ) {
                alt4=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCPHLCL.g:471:3: this_Global_0= ruleGlobal
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getGlobalParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Global_0=ruleGlobal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Global_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:480:3: ( ( ( ruleBoolTerm ) )=>this_Logic_1= ruleLogic )
                    {
                    // InternalCPHLCL.g:480:3: ( ( ( ruleBoolTerm ) )=>this_Logic_1= ruleLogic )
                    // InternalCPHLCL.g:481:4: ( ( ruleBoolTerm ) )=>this_Logic_1= ruleLogic
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getLogicParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Logic_1=ruleLogic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Logic_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:495:3: ( ( ( ruleNumericTerm ) )=>this_Relational_2= ruleRelational )
                    {
                    // InternalCPHLCL.g:495:3: ( ( ( ruleNumericTerm ) )=>this_Relational_2= ruleRelational )
                    // InternalCPHLCL.g:496:4: ( ( ruleNumericTerm ) )=>this_Relational_2= ruleRelational
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getRelationalParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Relational_2=ruleRelational();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Relational_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:510:3: this_Control_3= ruleControl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getControlParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Control_3=ruleControl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Control_3;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolTerm"
    // InternalCPHLCL.g:522:1: entryRuleBoolTerm returns [EObject current=null] : iv_ruleBoolTerm= ruleBoolTerm EOF ;
    public final EObject entryRuleBoolTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolTerm = null;


        try {
            // InternalCPHLCL.g:522:49: (iv_ruleBoolTerm= ruleBoolTerm EOF )
            // InternalCPHLCL.g:523:2: iv_ruleBoolTerm= ruleBoolTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolTerm=ruleBoolTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolTerm"


    // $ANTLR start "ruleBoolTerm"
    // InternalCPHLCL.g:529:1: ruleBoolTerm returns [EObject current=null] : ( (otherlv_0= '(' this_ComplexTerm_1= ruleComplexTerm otherlv_2= ')' ) | this_BoolVar_3= ruleBoolVar ) ;
    public final EObject ruleBoolTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ComplexTerm_1 = null;

        EObject this_BoolVar_3 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:535:2: ( ( (otherlv_0= '(' this_ComplexTerm_1= ruleComplexTerm otherlv_2= ')' ) | this_BoolVar_3= ruleBoolVar ) )
            // InternalCPHLCL.g:536:2: ( (otherlv_0= '(' this_ComplexTerm_1= ruleComplexTerm otherlv_2= ')' ) | this_BoolVar_3= ruleBoolVar )
            {
            // InternalCPHLCL.g:536:2: ( (otherlv_0= '(' this_ComplexTerm_1= ruleComplexTerm otherlv_2= ')' ) | this_BoolVar_3= ruleBoolVar )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCPHLCL.g:537:3: (otherlv_0= '(' this_ComplexTerm_1= ruleComplexTerm otherlv_2= ')' )
                    {
                    // InternalCPHLCL.g:537:3: (otherlv_0= '(' this_ComplexTerm_1= ruleComplexTerm otherlv_2= ')' )
                    // InternalCPHLCL.g:538:4: otherlv_0= '(' this_ComplexTerm_1= ruleComplexTerm otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getBoolTermAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBoolTermAccess().getComplexTermParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_ComplexTerm_1=ruleComplexTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ComplexTerm_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBoolTermAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:556:3: this_BoolVar_3= ruleBoolVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBoolTermAccess().getBoolVarParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoolVar_3=ruleBoolVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolVar_3;
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
    // $ANTLR end "ruleBoolTerm"


    // $ANTLR start "entryRuleComplexTerm"
    // InternalCPHLCL.g:568:1: entryRuleComplexTerm returns [EObject current=null] : iv_ruleComplexTerm= ruleComplexTerm EOF ;
    public final EObject entryRuleComplexTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTerm = null;


        try {
            // InternalCPHLCL.g:568:52: (iv_ruleComplexTerm= ruleComplexTerm EOF )
            // InternalCPHLCL.g:569:2: iv_ruleComplexTerm= ruleComplexTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComplexTerm=ruleComplexTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComplexTerm"


    // $ANTLR start "ruleComplexTerm"
    // InternalCPHLCL.g:575:1: ruleComplexTerm returns [EObject current=null] : ( ( ( ( ruleBoolTerm ) )=>this_Logic_0= ruleLogic ) | ( ( ( ruleNumericTerm ) )=>this_Relational_1= ruleRelational ) | this_LogicUn_2= ruleLogicUn ) ;
    public final EObject ruleComplexTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Logic_0 = null;

        EObject this_Relational_1 = null;

        EObject this_LogicUn_2 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:581:2: ( ( ( ( ( ruleBoolTerm ) )=>this_Logic_0= ruleLogic ) | ( ( ( ruleNumericTerm ) )=>this_Relational_1= ruleRelational ) | this_LogicUn_2= ruleLogicUn ) )
            // InternalCPHLCL.g:582:2: ( ( ( ( ruleBoolTerm ) )=>this_Logic_0= ruleLogic ) | ( ( ( ruleNumericTerm ) )=>this_Relational_1= ruleRelational ) | this_LogicUn_2= ruleLogicUn )
            {
            // InternalCPHLCL.g:582:2: ( ( ( ( ruleBoolTerm ) )=>this_Logic_0= ruleLogic ) | ( ( ( ruleNumericTerm ) )=>this_Relational_1= ruleRelational ) | this_LogicUn_2= ruleLogicUn )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred3_InternalCPHLCL()) ) {
                    alt6=1;
                }
                else if ( (synpred4_InternalCPHLCL()) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( (synpred3_InternalCPHLCL()) ) {
                    alt6=1;
                }
                else if ( (synpred4_InternalCPHLCL()) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_INT) && (synpred4_InternalCPHLCL())) {
                alt6=2;
            }
            else if ( (LA6_0==35) ) {
                alt6=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCPHLCL.g:583:3: ( ( ( ruleBoolTerm ) )=>this_Logic_0= ruleLogic )
                    {
                    // InternalCPHLCL.g:583:3: ( ( ( ruleBoolTerm ) )=>this_Logic_0= ruleLogic )
                    // InternalCPHLCL.g:584:4: ( ( ruleBoolTerm ) )=>this_Logic_0= ruleLogic
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComplexTermAccess().getLogicParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Logic_0=ruleLogic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Logic_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:598:3: ( ( ( ruleNumericTerm ) )=>this_Relational_1= ruleRelational )
                    {
                    // InternalCPHLCL.g:598:3: ( ( ( ruleNumericTerm ) )=>this_Relational_1= ruleRelational )
                    // InternalCPHLCL.g:599:4: ( ( ruleNumericTerm ) )=>this_Relational_1= ruleRelational
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComplexTermAccess().getRelationalParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Relational_1=ruleRelational();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Relational_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:613:3: this_LogicUn_2= ruleLogicUn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComplexTermAccess().getLogicUnParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LogicUn_2=ruleLogicUn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LogicUn_2;
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
    // $ANTLR end "ruleComplexTerm"


    // $ANTLR start "entryRuleLogic"
    // InternalCPHLCL.g:625:1: entryRuleLogic returns [EObject current=null] : iv_ruleLogic= ruleLogic EOF ;
    public final EObject entryRuleLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogic = null;


        try {
            // InternalCPHLCL.g:625:46: (iv_ruleLogic= ruleLogic EOF )
            // InternalCPHLCL.g:626:2: iv_ruleLogic= ruleLogic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogic=ruleLogic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogic"


    // $ANTLR start "ruleLogic"
    // InternalCPHLCL.g:632:1: ruleLogic returns [EObject current=null] : ( ( ( ( ruleBoolTerm ) )=> (lv_logicLeft_0_0= ruleBoolTerm ) ) ( (lv_logicOp_1_0= ruleLogicOpBin ) ) ( ( ( ruleBoolTerm ) )=> (lv_logicRight_2_0= ruleBoolTerm ) ) ) ;
    public final EObject ruleLogic() throws RecognitionException {
        EObject current = null;

        EObject lv_logicLeft_0_0 = null;

        AntlrDatatypeRuleToken lv_logicOp_1_0 = null;

        EObject lv_logicRight_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:638:2: ( ( ( ( ( ruleBoolTerm ) )=> (lv_logicLeft_0_0= ruleBoolTerm ) ) ( (lv_logicOp_1_0= ruleLogicOpBin ) ) ( ( ( ruleBoolTerm ) )=> (lv_logicRight_2_0= ruleBoolTerm ) ) ) )
            // InternalCPHLCL.g:639:2: ( ( ( ( ruleBoolTerm ) )=> (lv_logicLeft_0_0= ruleBoolTerm ) ) ( (lv_logicOp_1_0= ruleLogicOpBin ) ) ( ( ( ruleBoolTerm ) )=> (lv_logicRight_2_0= ruleBoolTerm ) ) )
            {
            // InternalCPHLCL.g:639:2: ( ( ( ( ruleBoolTerm ) )=> (lv_logicLeft_0_0= ruleBoolTerm ) ) ( (lv_logicOp_1_0= ruleLogicOpBin ) ) ( ( ( ruleBoolTerm ) )=> (lv_logicRight_2_0= ruleBoolTerm ) ) )
            // InternalCPHLCL.g:640:3: ( ( ( ruleBoolTerm ) )=> (lv_logicLeft_0_0= ruleBoolTerm ) ) ( (lv_logicOp_1_0= ruleLogicOpBin ) ) ( ( ( ruleBoolTerm ) )=> (lv_logicRight_2_0= ruleBoolTerm ) )
            {
            // InternalCPHLCL.g:640:3: ( ( ( ruleBoolTerm ) )=> (lv_logicLeft_0_0= ruleBoolTerm ) )
            // InternalCPHLCL.g:641:4: ( ( ruleBoolTerm ) )=> (lv_logicLeft_0_0= ruleBoolTerm )
            {
            // InternalCPHLCL.g:645:4: (lv_logicLeft_0_0= ruleBoolTerm )
            // InternalCPHLCL.g:646:5: lv_logicLeft_0_0= ruleBoolTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLogicAccess().getLogicLeftBoolTermParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_logicLeft_0_0=ruleBoolTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLogicRule());
              					}
              					set(
              						current,
              						"logicLeft",
              						lv_logicLeft_0_0,
              						"org.xtext.CPHLCL.BoolTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPHLCL.g:663:3: ( (lv_logicOp_1_0= ruleLogicOpBin ) )
            // InternalCPHLCL.g:664:4: (lv_logicOp_1_0= ruleLogicOpBin )
            {
            // InternalCPHLCL.g:664:4: (lv_logicOp_1_0= ruleLogicOpBin )
            // InternalCPHLCL.g:665:5: lv_logicOp_1_0= ruleLogicOpBin
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLogicAccess().getLogicOpLogicOpBinParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_logicOp_1_0=ruleLogicOpBin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLogicRule());
              					}
              					set(
              						current,
              						"logicOp",
              						lv_logicOp_1_0,
              						"org.xtext.CPHLCL.LogicOpBin");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPHLCL.g:682:3: ( ( ( ruleBoolTerm ) )=> (lv_logicRight_2_0= ruleBoolTerm ) )
            // InternalCPHLCL.g:683:4: ( ( ruleBoolTerm ) )=> (lv_logicRight_2_0= ruleBoolTerm )
            {
            // InternalCPHLCL.g:687:4: (lv_logicRight_2_0= ruleBoolTerm )
            // InternalCPHLCL.g:688:5: lv_logicRight_2_0= ruleBoolTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLogicAccess().getLogicRightBoolTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_logicRight_2_0=ruleBoolTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLogicRule());
              					}
              					set(
              						current,
              						"logicRight",
              						lv_logicRight_2_0,
              						"org.xtext.CPHLCL.BoolTerm");
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
    // $ANTLR end "ruleLogic"


    // $ANTLR start "entryRuleLogicUn"
    // InternalCPHLCL.g:709:1: entryRuleLogicUn returns [EObject current=null] : iv_ruleLogicUn= ruleLogicUn EOF ;
    public final EObject entryRuleLogicUn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicUn = null;


        try {
            // InternalCPHLCL.g:709:48: (iv_ruleLogicUn= ruleLogicUn EOF )
            // InternalCPHLCL.g:710:2: iv_ruleLogicUn= ruleLogicUn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicUnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicUn=ruleLogicUn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicUn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicUn"


    // $ANTLR start "ruleLogicUn"
    // InternalCPHLCL.g:716:1: ruleLogicUn returns [EObject current=null] : ( ( (lv_logicOp_0_0= ruleLogicOpUn ) ) otherlv_1= '(' ( (lv_exp_2_0= ruleBoolTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleLogicUn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_logicOp_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:722:2: ( ( ( (lv_logicOp_0_0= ruleLogicOpUn ) ) otherlv_1= '(' ( (lv_exp_2_0= ruleBoolTerm ) ) otherlv_3= ')' ) )
            // InternalCPHLCL.g:723:2: ( ( (lv_logicOp_0_0= ruleLogicOpUn ) ) otherlv_1= '(' ( (lv_exp_2_0= ruleBoolTerm ) ) otherlv_3= ')' )
            {
            // InternalCPHLCL.g:723:2: ( ( (lv_logicOp_0_0= ruleLogicOpUn ) ) otherlv_1= '(' ( (lv_exp_2_0= ruleBoolTerm ) ) otherlv_3= ')' )
            // InternalCPHLCL.g:724:3: ( (lv_logicOp_0_0= ruleLogicOpUn ) ) otherlv_1= '(' ( (lv_exp_2_0= ruleBoolTerm ) ) otherlv_3= ')'
            {
            // InternalCPHLCL.g:724:3: ( (lv_logicOp_0_0= ruleLogicOpUn ) )
            // InternalCPHLCL.g:725:4: (lv_logicOp_0_0= ruleLogicOpUn )
            {
            // InternalCPHLCL.g:725:4: (lv_logicOp_0_0= ruleLogicOpUn )
            // InternalCPHLCL.g:726:5: lv_logicOp_0_0= ruleLogicOpUn
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLogicUnAccess().getLogicOpLogicOpUnParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_logicOp_0_0=ruleLogicOpUn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLogicUnRule());
              					}
              					set(
              						current,
              						"logicOp",
              						lv_logicOp_0_0,
              						"org.xtext.CPHLCL.LogicOpUn");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLogicUnAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalCPHLCL.g:747:3: ( (lv_exp_2_0= ruleBoolTerm ) )
            // InternalCPHLCL.g:748:4: (lv_exp_2_0= ruleBoolTerm )
            {
            // InternalCPHLCL.g:748:4: (lv_exp_2_0= ruleBoolTerm )
            // InternalCPHLCL.g:749:5: lv_exp_2_0= ruleBoolTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLogicUnAccess().getExpBoolTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_exp_2_0=ruleBoolTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLogicUnRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_2_0,
              						"org.xtext.CPHLCL.BoolTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLogicUnAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleLogicUn"


    // $ANTLR start "entryRuleRelational"
    // InternalCPHLCL.g:774:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalCPHLCL.g:774:51: (iv_ruleRelational= ruleRelational EOF )
            // InternalCPHLCL.g:775:2: iv_ruleRelational= ruleRelational EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelational=ruleRelational();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelational; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelational"


    // $ANTLR start "ruleRelational"
    // InternalCPHLCL.g:781:1: ruleRelational returns [EObject current=null] : ( ( ( ( ruleNumericTerm ) )=> (lv_relationalLeft_0_0= ruleNumericTerm ) ) ( (lv_relationalOp_1_0= ruleRelationalOp ) ) ( ( ( ruleNumericTerm ) )=> (lv_relationalRight_2_0= ruleNumericTerm ) ) ) ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject lv_relationalLeft_0_0 = null;

        AntlrDatatypeRuleToken lv_relationalOp_1_0 = null;

        EObject lv_relationalRight_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:787:2: ( ( ( ( ( ruleNumericTerm ) )=> (lv_relationalLeft_0_0= ruleNumericTerm ) ) ( (lv_relationalOp_1_0= ruleRelationalOp ) ) ( ( ( ruleNumericTerm ) )=> (lv_relationalRight_2_0= ruleNumericTerm ) ) ) )
            // InternalCPHLCL.g:788:2: ( ( ( ( ruleNumericTerm ) )=> (lv_relationalLeft_0_0= ruleNumericTerm ) ) ( (lv_relationalOp_1_0= ruleRelationalOp ) ) ( ( ( ruleNumericTerm ) )=> (lv_relationalRight_2_0= ruleNumericTerm ) ) )
            {
            // InternalCPHLCL.g:788:2: ( ( ( ( ruleNumericTerm ) )=> (lv_relationalLeft_0_0= ruleNumericTerm ) ) ( (lv_relationalOp_1_0= ruleRelationalOp ) ) ( ( ( ruleNumericTerm ) )=> (lv_relationalRight_2_0= ruleNumericTerm ) ) )
            // InternalCPHLCL.g:789:3: ( ( ( ruleNumericTerm ) )=> (lv_relationalLeft_0_0= ruleNumericTerm ) ) ( (lv_relationalOp_1_0= ruleRelationalOp ) ) ( ( ( ruleNumericTerm ) )=> (lv_relationalRight_2_0= ruleNumericTerm ) )
            {
            // InternalCPHLCL.g:789:3: ( ( ( ruleNumericTerm ) )=> (lv_relationalLeft_0_0= ruleNumericTerm ) )
            // InternalCPHLCL.g:790:4: ( ( ruleNumericTerm ) )=> (lv_relationalLeft_0_0= ruleNumericTerm )
            {
            // InternalCPHLCL.g:794:4: (lv_relationalLeft_0_0= ruleNumericTerm )
            // InternalCPHLCL.g:795:5: lv_relationalLeft_0_0= ruleNumericTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationalAccess().getRelationalLeftNumericTermParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_relationalLeft_0_0=ruleNumericTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationalRule());
              					}
              					set(
              						current,
              						"relationalLeft",
              						lv_relationalLeft_0_0,
              						"org.xtext.CPHLCL.NumericTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPHLCL.g:812:3: ( (lv_relationalOp_1_0= ruleRelationalOp ) )
            // InternalCPHLCL.g:813:4: (lv_relationalOp_1_0= ruleRelationalOp )
            {
            // InternalCPHLCL.g:813:4: (lv_relationalOp_1_0= ruleRelationalOp )
            // InternalCPHLCL.g:814:5: lv_relationalOp_1_0= ruleRelationalOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationalAccess().getRelationalOpRelationalOpParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_relationalOp_1_0=ruleRelationalOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationalRule());
              					}
              					set(
              						current,
              						"relationalOp",
              						lv_relationalOp_1_0,
              						"org.xtext.CPHLCL.RelationalOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPHLCL.g:831:3: ( ( ( ruleNumericTerm ) )=> (lv_relationalRight_2_0= ruleNumericTerm ) )
            // InternalCPHLCL.g:832:4: ( ( ruleNumericTerm ) )=> (lv_relationalRight_2_0= ruleNumericTerm )
            {
            // InternalCPHLCL.g:836:4: (lv_relationalRight_2_0= ruleNumericTerm )
            // InternalCPHLCL.g:837:5: lv_relationalRight_2_0= ruleNumericTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationalAccess().getRelationalRightNumericTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_relationalRight_2_0=ruleNumericTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationalRule());
              					}
              					set(
              						current,
              						"relationalRight",
              						lv_relationalRight_2_0,
              						"org.xtext.CPHLCL.NumericTerm");
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
    // $ANTLR end "ruleRelational"


    // $ANTLR start "entryRuleNumericTerm"
    // InternalCPHLCL.g:858:1: entryRuleNumericTerm returns [EObject current=null] : iv_ruleNumericTerm= ruleNumericTerm EOF ;
    public final EObject entryRuleNumericTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericTerm = null;


        try {
            // InternalCPHLCL.g:858:52: (iv_ruleNumericTerm= ruleNumericTerm EOF )
            // InternalCPHLCL.g:859:2: iv_ruleNumericTerm= ruleNumericTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericTerm=ruleNumericTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericTerm"


    // $ANTLR start "ruleNumericTerm"
    // InternalCPHLCL.g:865:1: ruleNumericTerm returns [EObject current=null] : ( (otherlv_0= '(' this_Arithmetic_1= ruleArithmetic otherlv_2= ')' ) | this_Number_3= ruleNumber | this_IntVar_4= ruleIntVar ) ;
    public final EObject ruleNumericTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Arithmetic_1 = null;

        EObject this_Number_3 = null;

        EObject this_IntVar_4 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:871:2: ( ( (otherlv_0= '(' this_Arithmetic_1= ruleArithmetic otherlv_2= ')' ) | this_Number_3= ruleNumber | this_IntVar_4= ruleIntVar ) )
            // InternalCPHLCL.g:872:2: ( (otherlv_0= '(' this_Arithmetic_1= ruleArithmetic otherlv_2= ')' ) | this_Number_3= ruleNumber | this_IntVar_4= ruleIntVar )
            {
            // InternalCPHLCL.g:872:2: ( (otherlv_0= '(' this_Arithmetic_1= ruleArithmetic otherlv_2= ')' ) | this_Number_3= ruleNumber | this_IntVar_4= ruleIntVar )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCPHLCL.g:873:3: (otherlv_0= '(' this_Arithmetic_1= ruleArithmetic otherlv_2= ')' )
                    {
                    // InternalCPHLCL.g:873:3: (otherlv_0= '(' this_Arithmetic_1= ruleArithmetic otherlv_2= ')' )
                    // InternalCPHLCL.g:874:4: otherlv_0= '(' this_Arithmetic_1= ruleArithmetic otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getNumericTermAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNumericTermAccess().getArithmeticParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_Arithmetic_1=ruleArithmetic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Arithmetic_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNumericTermAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:892:3: this_Number_3= ruleNumber
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericTermAccess().getNumberParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Number_3=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Number_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:901:3: this_IntVar_4= ruleIntVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericTermAccess().getIntVarParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntVar_4=ruleIntVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntVar_4;
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
    // $ANTLR end "ruleNumericTerm"


    // $ANTLR start "entryRuleArithmetic"
    // InternalCPHLCL.g:913:1: entryRuleArithmetic returns [EObject current=null] : iv_ruleArithmetic= ruleArithmetic EOF ;
    public final EObject entryRuleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmetic = null;


        try {
            // InternalCPHLCL.g:913:51: (iv_ruleArithmetic= ruleArithmetic EOF )
            // InternalCPHLCL.g:914:2: iv_ruleArithmetic= ruleArithmetic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmetic=ruleArithmetic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmetic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmetic"


    // $ANTLR start "ruleArithmetic"
    // InternalCPHLCL.g:920:1: ruleArithmetic returns [EObject current=null] : ( ( (lv_left_0_0= ruleNumericTerm ) ) ( (lv_arithOperator_1_0= ruleArithmeticOp ) ) ( (lv_right_2_0= ruleNumericTerm ) ) ) ;
    public final EObject ruleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_arithOperator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:926:2: ( ( ( (lv_left_0_0= ruleNumericTerm ) ) ( (lv_arithOperator_1_0= ruleArithmeticOp ) ) ( (lv_right_2_0= ruleNumericTerm ) ) ) )
            // InternalCPHLCL.g:927:2: ( ( (lv_left_0_0= ruleNumericTerm ) ) ( (lv_arithOperator_1_0= ruleArithmeticOp ) ) ( (lv_right_2_0= ruleNumericTerm ) ) )
            {
            // InternalCPHLCL.g:927:2: ( ( (lv_left_0_0= ruleNumericTerm ) ) ( (lv_arithOperator_1_0= ruleArithmeticOp ) ) ( (lv_right_2_0= ruleNumericTerm ) ) )
            // InternalCPHLCL.g:928:3: ( (lv_left_0_0= ruleNumericTerm ) ) ( (lv_arithOperator_1_0= ruleArithmeticOp ) ) ( (lv_right_2_0= ruleNumericTerm ) )
            {
            // InternalCPHLCL.g:928:3: ( (lv_left_0_0= ruleNumericTerm ) )
            // InternalCPHLCL.g:929:4: (lv_left_0_0= ruleNumericTerm )
            {
            // InternalCPHLCL.g:929:4: (lv_left_0_0= ruleNumericTerm )
            // InternalCPHLCL.g:930:5: lv_left_0_0= ruleNumericTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithmeticAccess().getLeftNumericTermParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_left_0_0=ruleNumericTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArithmeticRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"org.xtext.CPHLCL.NumericTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPHLCL.g:947:3: ( (lv_arithOperator_1_0= ruleArithmeticOp ) )
            // InternalCPHLCL.g:948:4: (lv_arithOperator_1_0= ruleArithmeticOp )
            {
            // InternalCPHLCL.g:948:4: (lv_arithOperator_1_0= ruleArithmeticOp )
            // InternalCPHLCL.g:949:5: lv_arithOperator_1_0= ruleArithmeticOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithmeticAccess().getArithOperatorArithmeticOpParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_arithOperator_1_0=ruleArithmeticOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArithmeticRule());
              					}
              					set(
              						current,
              						"arithOperator",
              						lv_arithOperator_1_0,
              						"org.xtext.CPHLCL.ArithmeticOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPHLCL.g:966:3: ( (lv_right_2_0= ruleNumericTerm ) )
            // InternalCPHLCL.g:967:4: (lv_right_2_0= ruleNumericTerm )
            {
            // InternalCPHLCL.g:967:4: (lv_right_2_0= ruleNumericTerm )
            // InternalCPHLCL.g:968:5: lv_right_2_0= ruleNumericTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithmeticAccess().getRightNumericTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleNumericTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArithmeticRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_2_0,
              						"org.xtext.CPHLCL.NumericTerm");
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
    // $ANTLR end "ruleArithmetic"


    // $ANTLR start "entryRuleGlobal"
    // InternalCPHLCL.g:989:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalCPHLCL.g:989:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalCPHLCL.g:990:2: iv_ruleGlobal= ruleGlobal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalCPHLCL.g:996:1: ruleGlobal returns [EObject current=null] : ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1002:2: ( ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' ) )
            // InternalCPHLCL.g:1003:2: ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' )
            {
            // InternalCPHLCL.g:1003:2: ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' )
            // InternalCPHLCL.g:1004:3: ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')'
            {
            // InternalCPHLCL.g:1004:3: ( (lv_op_0_0= ruleGlobalOp ) )
            // InternalCPHLCL.g:1005:4: (lv_op_0_0= ruleGlobalOp )
            {
            // InternalCPHLCL.g:1005:4: (lv_op_0_0= ruleGlobalOp )
            // InternalCPHLCL.g:1006:5: lv_op_0_0= ruleGlobalOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGlobalAccess().getOpGlobalOpParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_op_0_0=ruleGlobalOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGlobalRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"org.xtext.CPHLCL.GlobalOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalCPHLCL.g:1027:3: ( (lv_vars_2_0= ruleListOfIDs ) )
            // InternalCPHLCL.g:1028:4: (lv_vars_2_0= ruleListOfIDs )
            {
            // InternalCPHLCL.g:1028:4: (lv_vars_2_0= ruleListOfIDs )
            // InternalCPHLCL.g:1029:5: lv_vars_2_0= ruleListOfIDs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGlobalAccess().getVarsListOfIDsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_vars_2_0=ruleListOfIDs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGlobalRule());
              					}
              					set(
              						current,
              						"vars",
              						lv_vars_2_0,
              						"org.xtext.CPHLCL.ListOfIDs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGlobalAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleControl"
    // InternalCPHLCL.g:1054:1: entryRuleControl returns [EObject current=null] : iv_ruleControl= ruleControl EOF ;
    public final EObject entryRuleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControl = null;


        try {
            // InternalCPHLCL.g:1054:48: (iv_ruleControl= ruleControl EOF )
            // InternalCPHLCL.g:1055:2: iv_ruleControl= ruleControl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getControlRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleControl=ruleControl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleControl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleControl"


    // $ANTLR start "ruleControl"
    // InternalCPHLCL.g:1061:1: ruleControl returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleBoolTerm ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_trueStatement_5_0= ruleExpression ) ) otherlv_6= 'else' ( (lv_elseStatement_7_0= ruleExpression ) ) otherlv_8= 'end_if' ) ;
    public final EObject ruleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_cond_2_0 = null;

        EObject lv_trueStatement_5_0 = null;

        EObject lv_elseStatement_7_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1067:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleBoolTerm ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_trueStatement_5_0= ruleExpression ) ) otherlv_6= 'else' ( (lv_elseStatement_7_0= ruleExpression ) ) otherlv_8= 'end_if' ) )
            // InternalCPHLCL.g:1068:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleBoolTerm ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_trueStatement_5_0= ruleExpression ) ) otherlv_6= 'else' ( (lv_elseStatement_7_0= ruleExpression ) ) otherlv_8= 'end_if' )
            {
            // InternalCPHLCL.g:1068:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleBoolTerm ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_trueStatement_5_0= ruleExpression ) ) otherlv_6= 'else' ( (lv_elseStatement_7_0= ruleExpression ) ) otherlv_8= 'end_if' )
            // InternalCPHLCL.g:1069:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleBoolTerm ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_trueStatement_5_0= ruleExpression ) ) otherlv_6= 'else' ( (lv_elseStatement_7_0= ruleExpression ) ) otherlv_8= 'end_if'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getControlAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getControlAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalCPHLCL.g:1077:3: ( (lv_cond_2_0= ruleBoolTerm ) )
            // InternalCPHLCL.g:1078:4: (lv_cond_2_0= ruleBoolTerm )
            {
            // InternalCPHLCL.g:1078:4: (lv_cond_2_0= ruleBoolTerm )
            // InternalCPHLCL.g:1079:5: lv_cond_2_0= ruleBoolTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getControlAccess().getCondBoolTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_cond_2_0=ruleBoolTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getControlRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_2_0,
              						"org.xtext.CPHLCL.BoolTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getControlAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getControlAccess().getThenKeyword_4());
              		
            }
            // InternalCPHLCL.g:1104:3: ( (lv_trueStatement_5_0= ruleExpression ) )
            // InternalCPHLCL.g:1105:4: (lv_trueStatement_5_0= ruleExpression )
            {
            // InternalCPHLCL.g:1105:4: (lv_trueStatement_5_0= ruleExpression )
            // InternalCPHLCL.g:1106:5: lv_trueStatement_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getControlAccess().getTrueStatementExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_trueStatement_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getControlRule());
              					}
              					set(
              						current,
              						"trueStatement",
              						lv_trueStatement_5_0,
              						"org.xtext.CPHLCL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getControlAccess().getElseKeyword_6());
              		
            }
            // InternalCPHLCL.g:1127:3: ( (lv_elseStatement_7_0= ruleExpression ) )
            // InternalCPHLCL.g:1128:4: (lv_elseStatement_7_0= ruleExpression )
            {
            // InternalCPHLCL.g:1128:4: (lv_elseStatement_7_0= ruleExpression )
            // InternalCPHLCL.g:1129:5: lv_elseStatement_7_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getControlAccess().getElseStatementExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_elseStatement_7_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getControlRule());
              					}
              					set(
              						current,
              						"elseStatement",
              						lv_elseStatement_7_0,
              						"org.xtext.CPHLCL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getControlAccess().getEnd_ifKeyword_8());
              		
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
    // $ANTLR end "ruleControl"


    // $ANTLR start "entryRuleStrategy"
    // InternalCPHLCL.g:1154:1: entryRuleStrategy returns [String current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final String entryRuleStrategy() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStrategy = null;


        try {
            // InternalCPHLCL.g:1154:48: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalCPHLCL.g:1155:2: iv_ruleStrategy= ruleStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrategyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStrategy.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalCPHLCL.g:1161:1: ruleStrategy returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'one' | kw= 'two' ) ;
    public final AntlrDatatypeRuleToken ruleStrategy() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1167:2: ( (kw= 'one' | kw= 'two' ) )
            // InternalCPHLCL.g:1168:2: (kw= 'one' | kw= 'two' )
            {
            // InternalCPHLCL.g:1168:2: (kw= 'one' | kw= 'two' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCPHLCL.g:1169:3: kw= 'one'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStrategyAccess().getOneKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1175:3: kw= 'two'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStrategyAccess().getTwoKeyword_1());
                      		
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
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleBoolVal"
    // InternalCPHLCL.g:1184:1: entryRuleBoolVal returns [String current=null] : iv_ruleBoolVal= ruleBoolVal EOF ;
    public final String entryRuleBoolVal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolVal = null;


        try {
            // InternalCPHLCL.g:1184:47: (iv_ruleBoolVal= ruleBoolVal EOF )
            // InternalCPHLCL.g:1185:2: iv_ruleBoolVal= ruleBoolVal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolVal=ruleBoolVal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolVal.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolVal"


    // $ANTLR start "ruleBoolVal"
    // InternalCPHLCL.g:1191:1: ruleBoolVal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolVal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1197:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCPHLCL.g:1198:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCPHLCL.g:1198:2: (kw= 'true' | kw= 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCPHLCL.g:1199:3: kw= 'true'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBoolValAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1205:3: kw= 'false'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBoolValAccess().getFalseKeyword_1());
                      		
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
    // $ANTLR end "ruleBoolVal"


    // $ANTLR start "entryRuleBoolVar"
    // InternalCPHLCL.g:1214:1: entryRuleBoolVar returns [EObject current=null] : iv_ruleBoolVar= ruleBoolVar EOF ;
    public final EObject entryRuleBoolVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVar = null;


        try {
            // InternalCPHLCL.g:1214:48: (iv_ruleBoolVar= ruleBoolVar EOF )
            // InternalCPHLCL.g:1215:2: iv_ruleBoolVar= ruleBoolVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolVar=ruleBoolVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolVar"


    // $ANTLR start "ruleBoolVar"
    // InternalCPHLCL.g:1221:1: ruleBoolVar returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleBoolVar() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1227:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalCPHLCL.g:1228:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalCPHLCL.g:1228:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalCPHLCL.g:1229:3: (lv_id_0_0= RULE_ID )
            {
            // InternalCPHLCL.g:1229:3: (lv_id_0_0= RULE_ID )
            // InternalCPHLCL.g:1230:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_id_0_0, grammarAccess.getBoolVarAccess().getIdIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getBoolVarRule());
              				}
              				setWithLastConsumed(
              					current,
              					"id",
              					lv_id_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
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
    // $ANTLR end "ruleBoolVar"


    // $ANTLR start "entryRuleNumber"
    // InternalCPHLCL.g:1249:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalCPHLCL.g:1249:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalCPHLCL.g:1250:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalCPHLCL.g:1256:1: ruleNumber returns [EObject current=null] : ( (lv_num_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_num_0_0=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1262:2: ( ( (lv_num_0_0= RULE_INT ) ) )
            // InternalCPHLCL.g:1263:2: ( (lv_num_0_0= RULE_INT ) )
            {
            // InternalCPHLCL.g:1263:2: ( (lv_num_0_0= RULE_INT ) )
            // InternalCPHLCL.g:1264:3: (lv_num_0_0= RULE_INT )
            {
            // InternalCPHLCL.g:1264:3: (lv_num_0_0= RULE_INT )
            // InternalCPHLCL.g:1265:4: lv_num_0_0= RULE_INT
            {
            lv_num_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_num_0_0, grammarAccess.getNumberAccess().getNumINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNumberRule());
              				}
              				setWithLastConsumed(
              					current,
              					"num",
              					lv_num_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleIntVar"
    // InternalCPHLCL.g:1284:1: entryRuleIntVar returns [EObject current=null] : iv_ruleIntVar= ruleIntVar EOF ;
    public final EObject entryRuleIntVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVar = null;


        try {
            // InternalCPHLCL.g:1284:47: (iv_ruleIntVar= ruleIntVar EOF )
            // InternalCPHLCL.g:1285:2: iv_ruleIntVar= ruleIntVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntVar=ruleIntVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntVar"


    // $ANTLR start "ruleIntVar"
    // InternalCPHLCL.g:1291:1: ruleIntVar returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleIntVar() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1297:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalCPHLCL.g:1298:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalCPHLCL.g:1298:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalCPHLCL.g:1299:3: (lv_id_0_0= RULE_ID )
            {
            // InternalCPHLCL.g:1299:3: (lv_id_0_0= RULE_ID )
            // InternalCPHLCL.g:1300:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_id_0_0, grammarAccess.getIntVarAccess().getIdIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntVarRule());
              				}
              				setWithLastConsumed(
              					current,
              					"id",
              					lv_id_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
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
    // $ANTLR end "ruleIntVar"


    // $ANTLR start "entryRuleLogicOpBin"
    // InternalCPHLCL.g:1319:1: entryRuleLogicOpBin returns [String current=null] : iv_ruleLogicOpBin= ruleLogicOpBin EOF ;
    public final String entryRuleLogicOpBin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicOpBin = null;


        try {
            // InternalCPHLCL.g:1319:50: (iv_ruleLogicOpBin= ruleLogicOpBin EOF )
            // InternalCPHLCL.g:1320:2: iv_ruleLogicOpBin= ruleLogicOpBin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicOpBinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicOpBin=ruleLogicOpBin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicOpBin.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicOpBin"


    // $ANTLR start "ruleLogicOpBin"
    // InternalCPHLCL.g:1326:1: ruleLogicOpBin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' | kw= 'XOR' | kw= '=>' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleLogicOpBin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1332:2: ( (kw= 'AND' | kw= 'OR' | kw= 'XOR' | kw= '=>' | kw= '<=>' ) )
            // InternalCPHLCL.g:1333:2: (kw= 'AND' | kw= 'OR' | kw= 'XOR' | kw= '=>' | kw= '<=>' )
            {
            // InternalCPHLCL.g:1333:2: (kw= 'AND' | kw= 'OR' | kw= 'XOR' | kw= '=>' | kw= '<=>' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 34:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCPHLCL.g:1334:3: kw= 'AND'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLogicOpBinAccess().getANDKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1340:3: kw= 'OR'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLogicOpBinAccess().getORKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1346:3: kw= 'XOR'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLogicOpBinAccess().getXORKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1352:3: kw= '=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLogicOpBinAccess().getEqualsSignGreaterThanSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCPHLCL.g:1358:3: kw= '<=>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLogicOpBinAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_4());
                      		
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
    // $ANTLR end "ruleLogicOpBin"


    // $ANTLR start "entryRuleLogicOpUn"
    // InternalCPHLCL.g:1367:1: entryRuleLogicOpUn returns [String current=null] : iv_ruleLogicOpUn= ruleLogicOpUn EOF ;
    public final String entryRuleLogicOpUn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicOpUn = null;


        try {
            // InternalCPHLCL.g:1367:49: (iv_ruleLogicOpUn= ruleLogicOpUn EOF )
            // InternalCPHLCL.g:1368:2: iv_ruleLogicOpUn= ruleLogicOpUn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicOpUnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicOpUn=ruleLogicOpUn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicOpUn.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicOpUn"


    // $ANTLR start "ruleLogicOpUn"
    // InternalCPHLCL.g:1374:1: ruleLogicOpUn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NOT' ;
    public final AntlrDatatypeRuleToken ruleLogicOpUn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1380:2: (kw= 'NOT' )
            // InternalCPHLCL.g:1381:2: kw= 'NOT'
            {
            kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getLogicOpUnAccess().getNOTKeyword());
              	
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
    // $ANTLR end "ruleLogicOpUn"


    // $ANTLR start "entryRuleRelationalOp"
    // InternalCPHLCL.g:1389:1: entryRuleRelationalOp returns [String current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final String entryRuleRelationalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOp = null;


        try {
            // InternalCPHLCL.g:1389:52: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalCPHLCL.g:1390:2: iv_ruleRelationalOp= ruleRelationalOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOp=ruleRelationalOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // InternalCPHLCL.g:1396:1: ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1402:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' ) )
            // InternalCPHLCL.g:1403:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' )
            {
            // InternalCPHLCL.g:1403:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            case 40:
                {
                alt11=5;
                }
                break;
            case 41:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCPHLCL.g:1404:3: kw= '>'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1410:3: kw= '<'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1416:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1422:3: kw= '<='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCPHLCL.g:1428:3: kw= '='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalCPHLCL.g:1434:3: kw= '!='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getExclamationMarkEqualsSignKeyword_5());
                      		
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
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRuleGlobalOp"
    // InternalCPHLCL.g:1443:1: entryRuleGlobalOp returns [String current=null] : iv_ruleGlobalOp= ruleGlobalOp EOF ;
    public final String entryRuleGlobalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGlobalOp = null;


        try {
            // InternalCPHLCL.g:1443:48: (iv_ruleGlobalOp= ruleGlobalOp EOF )
            // InternalCPHLCL.g:1444:2: iv_ruleGlobalOp= ruleGlobalOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobalOp=ruleGlobalOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGlobalOp"


    // $ANTLR start "ruleGlobalOp"
    // InternalCPHLCL.g:1450:1: ruleGlobalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'at_most' | kw= 'all_different' ) ;
    public final AntlrDatatypeRuleToken ruleGlobalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1456:2: ( (kw= 'at_most' | kw= 'all_different' ) )
            // InternalCPHLCL.g:1457:2: (kw= 'at_most' | kw= 'all_different' )
            {
            // InternalCPHLCL.g:1457:2: (kw= 'at_most' | kw= 'all_different' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==42) ) {
                alt12=1;
            }
            else if ( (LA12_0==43) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCPHLCL.g:1458:3: kw= 'at_most'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getGlobalOpAccess().getAt_mostKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1464:3: kw= 'all_different'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getGlobalOpAccess().getAll_differentKeyword_1());
                      		
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
    // $ANTLR end "ruleGlobalOp"


    // $ANTLR start "entryRuleArithmeticOp"
    // InternalCPHLCL.g:1473:1: entryRuleArithmeticOp returns [String current=null] : iv_ruleArithmeticOp= ruleArithmeticOp EOF ;
    public final String entryRuleArithmeticOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArithmeticOp = null;


        try {
            // InternalCPHLCL.g:1473:52: (iv_ruleArithmeticOp= ruleArithmeticOp EOF )
            // InternalCPHLCL.g:1474:2: iv_ruleArithmeticOp= ruleArithmeticOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticOp=ruleArithmeticOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmeticOp"


    // $ANTLR start "ruleArithmeticOp"
    // InternalCPHLCL.g:1480:1: ruleArithmeticOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' | kw= 'pow' | kw= 'dist' ) ;
    public final AntlrDatatypeRuleToken ruleArithmeticOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1486:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' | kw= 'pow' | kw= 'dist' ) )
            // InternalCPHLCL.g:1487:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' | kw= 'pow' | kw= 'dist' )
            {
            // InternalCPHLCL.g:1487:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' | kw= 'pow' | kw= 'dist' )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt13=1;
                }
                break;
            case 45:
                {
                alt13=2;
                }
                break;
            case 46:
                {
                alt13=3;
                }
                break;
            case 47:
                {
                alt13=4;
                }
                break;
            case 48:
                {
                alt13=5;
                }
                break;
            case 49:
                {
                alt13=6;
                }
                break;
            case 50:
                {
                alt13=7;
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
                    // InternalCPHLCL.g:1488:3: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArithmeticOpAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1494:3: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArithmeticOpAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1500:3: kw= '*'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArithmeticOpAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1506:3: kw= '/'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArithmeticOpAccess().getSolidusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCPHLCL.g:1512:3: kw= 'mod'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArithmeticOpAccess().getModKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalCPHLCL.g:1518:3: kw= 'pow'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArithmeticOpAccess().getPowKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalCPHLCL.g:1524:3: kw= 'dist'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArithmeticOpAccess().getDistKeyword_6());
                      		
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
    // $ANTLR end "ruleArithmeticOp"


    // $ANTLR start "entryRuleValue"
    // InternalCPHLCL.g:1533:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalCPHLCL.g:1533:45: (iv_ruleValue= ruleValue EOF )
            // InternalCPHLCL.g:1534:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalCPHLCL.g:1540:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumerableValue_0= ruleEnumerableValue | this_NonEnumerableValue_1= ruleNonEnumerableValue ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EnumerableValue_0 = null;

        AntlrDatatypeRuleToken this_NonEnumerableValue_1 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1546:2: ( (this_EnumerableValue_0= ruleEnumerableValue | this_NonEnumerableValue_1= ruleNonEnumerableValue ) )
            // InternalCPHLCL.g:1547:2: (this_EnumerableValue_0= ruleEnumerableValue | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            {
            // InternalCPHLCL.g:1547:2: (this_EnumerableValue_0= ruleEnumerableValue | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID||(LA14_0>=28 && LA14_0<=29)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCPHLCL.g:1548:3: this_EnumerableValue_0= ruleEnumerableValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getEnumerableValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumerableValue_0=ruleEnumerableValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EnumerableValue_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1559:3: this_NonEnumerableValue_1= ruleNonEnumerableValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getNonEnumerableValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NonEnumerableValue_1=ruleNonEnumerableValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NonEnumerableValue_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEnumerableValue"
    // InternalCPHLCL.g:1573:1: entryRuleEnumerableValue returns [String current=null] : iv_ruleEnumerableValue= ruleEnumerableValue EOF ;
    public final String entryRuleEnumerableValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumerableValue = null;


        try {
            // InternalCPHLCL.g:1573:55: (iv_ruleEnumerableValue= ruleEnumerableValue EOF )
            // InternalCPHLCL.g:1574:2: iv_ruleEnumerableValue= ruleEnumerableValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerableValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerableValue=ruleEnumerableValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerableValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerableValue"


    // $ANTLR start "ruleEnumerableValue"
    // InternalCPHLCL.g:1580:1: ruleEnumerableValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEnumerableValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1586:2: (this_INT_0= RULE_INT )
            // InternalCPHLCL.g:1587:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getEnumerableValueAccess().getINTTerminalRuleCall());
              	
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
    // $ANTLR end "ruleEnumerableValue"


    // $ANTLR start "entryRuleNonEnumerableValue"
    // InternalCPHLCL.g:1597:1: entryRuleNonEnumerableValue returns [String current=null] : iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF ;
    public final String entryRuleNonEnumerableValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonEnumerableValue = null;


        try {
            // InternalCPHLCL.g:1597:58: (iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF )
            // InternalCPHLCL.g:1598:2: iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonEnumerableValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNonEnumerableValue=ruleNonEnumerableValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonEnumerableValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNonEnumerableValue"


    // $ANTLR start "ruleNonEnumerableValue"
    // InternalCPHLCL.g:1604:1: ruleNonEnumerableValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BoolVal_0= ruleBoolVal | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleNonEnumerableValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_BoolVal_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1610:2: ( (this_BoolVal_0= ruleBoolVal | this_ID_1= RULE_ID ) )
            // InternalCPHLCL.g:1611:2: (this_BoolVal_0= ruleBoolVal | this_ID_1= RULE_ID )
            {
            // InternalCPHLCL.g:1611:2: (this_BoolVal_0= ruleBoolVal | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=28 && LA15_0<=29)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
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
                    // InternalCPHLCL.g:1612:3: this_BoolVal_0= ruleBoolVal
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonEnumerableValueAccess().getBoolValParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoolVal_0=ruleBoolVal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BoolVal_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1623:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getNonEnumerableValueAccess().getIDTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleNonEnumerableValue"


    // $ANTLR start "entryRuleVarType"
    // InternalCPHLCL.g:1634:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalCPHLCL.g:1634:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalCPHLCL.g:1635:2: iv_ruleVarType= ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarType=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalCPHLCL.g:1641:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool' | kw= 'integer' | kw= 'symbolic' ) ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1647:2: ( (kw= 'bool' | kw= 'integer' | kw= 'symbolic' ) )
            // InternalCPHLCL.g:1648:2: (kw= 'bool' | kw= 'integer' | kw= 'symbolic' )
            {
            // InternalCPHLCL.g:1648:2: (kw= 'bool' | kw= 'integer' | kw= 'symbolic' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt16=1;
                }
                break;
            case 52:
                {
                alt16=2;
                }
                break;
            case 53:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCPHLCL.g:1649:3: kw= 'bool'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVarTypeAccess().getBoolKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1655:3: kw= 'integer'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVarTypeAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1661:3: kw= 'symbolic'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVarTypeAccess().getSymbolicKeyword_2());
                      		
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
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleListOfValues"
    // InternalCPHLCL.g:1670:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalCPHLCL.g:1670:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalCPHLCL.g:1671:2: iv_ruleListOfValues= ruleListOfValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListOfValuesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListOfValues=ruleListOfValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListOfValues; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListOfValues"


    // $ANTLR start "ruleListOfValues"
    // InternalCPHLCL.g:1677:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_values_0_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1683:2: ( ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) )
            // InternalCPHLCL.g:1684:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            {
            // InternalCPHLCL.g:1684:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            // InternalCPHLCL.g:1685:3: ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            {
            // InternalCPHLCL.g:1685:3: ( (lv_values_0_0= ruleValue ) )
            // InternalCPHLCL.g:1686:4: (lv_values_0_0= ruleValue )
            {
            // InternalCPHLCL.g:1686:4: (lv_values_0_0= ruleValue )
            // InternalCPHLCL.g:1687:5: lv_values_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_values_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListOfValuesRule());
              					}
              					add(
              						current,
              						"values",
              						lv_values_0_0,
              						"org.xtext.CPHLCL.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPHLCL.g:1704:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==54) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCPHLCL.g:1705:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) )
            	    {
            	    // InternalCPHLCL.g:1705:4: (otherlv_1= ',' )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==54) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalCPHLCL.g:1706:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,54,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    // InternalCPHLCL.g:1711:4: ( (lv_values_2_0= ruleValue ) )
            	    // InternalCPHLCL.g:1712:5: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalCPHLCL.g:1712:5: (lv_values_2_0= ruleValue )
            	    // InternalCPHLCL.g:1713:6: lv_values_2_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"values",
            	      							lv_values_2_0,
            	      							"org.xtext.CPHLCL.Value");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleListOfValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalCPHLCL.g:1735:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalCPHLCL.g:1735:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalCPHLCL.g:1736:2: iv_ruleListOfIDs= ruleListOfIDs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListOfIDsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListOfIDs=ruleListOfIDs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListOfIDs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListOfIDs"


    // $ANTLR start "ruleListOfIDs"
    // InternalCPHLCL.g:1742:1: ruleListOfIDs returns [EObject current=null] : ( (lv_ids_0_0= RULE_ID ) )+ ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token lv_ids_0_0=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1748:2: ( ( (lv_ids_0_0= RULE_ID ) )+ )
            // InternalCPHLCL.g:1749:2: ( (lv_ids_0_0= RULE_ID ) )+
            {
            // InternalCPHLCL.g:1749:2: ( (lv_ids_0_0= RULE_ID ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCPHLCL.g:1750:3: (lv_ids_0_0= RULE_ID )
            	    {
            	    // InternalCPHLCL.g:1750:3: (lv_ids_0_0= RULE_ID )
            	    // InternalCPHLCL.g:1751:4: lv_ids_0_0= RULE_ID
            	    {
            	    lv_ids_0_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(lv_ids_0_0, grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getListOfIDsRule());
            	      				}
            	      				addWithLastConsumed(
            	      					current,
            	      					"ids",
            	      					lv_ids_0_0,
            	      					"org.eclipse.xtext.common.Terminals.ID");
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // $ANTLR end "ruleListOfIDs"

    // $ANTLR start synpred1_InternalCPHLCL
    public final void synpred1_InternalCPHLCL_fragment() throws RecognitionException {   
        // InternalCPHLCL.g:481:4: ( ( ruleBoolTerm ) )
        // InternalCPHLCL.g:481:5: ( ruleBoolTerm )
        {
        // InternalCPHLCL.g:481:5: ( ruleBoolTerm )
        // InternalCPHLCL.g:482:5: ruleBoolTerm
        {
        pushFollow(FOLLOW_2);
        ruleBoolTerm();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCPHLCL

    // $ANTLR start synpred2_InternalCPHLCL
    public final void synpred2_InternalCPHLCL_fragment() throws RecognitionException {   
        // InternalCPHLCL.g:496:4: ( ( ruleNumericTerm ) )
        // InternalCPHLCL.g:496:5: ( ruleNumericTerm )
        {
        // InternalCPHLCL.g:496:5: ( ruleNumericTerm )
        // InternalCPHLCL.g:497:5: ruleNumericTerm
        {
        pushFollow(FOLLOW_2);
        ruleNumericTerm();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalCPHLCL

    // $ANTLR start synpred3_InternalCPHLCL
    public final void synpred3_InternalCPHLCL_fragment() throws RecognitionException {   
        // InternalCPHLCL.g:584:4: ( ( ruleBoolTerm ) )
        // InternalCPHLCL.g:584:5: ( ruleBoolTerm )
        {
        // InternalCPHLCL.g:584:5: ( ruleBoolTerm )
        // InternalCPHLCL.g:585:5: ruleBoolTerm
        {
        pushFollow(FOLLOW_2);
        ruleBoolTerm();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalCPHLCL

    // $ANTLR start synpred4_InternalCPHLCL
    public final void synpred4_InternalCPHLCL_fragment() throws RecognitionException {   
        // InternalCPHLCL.g:599:4: ( ( ruleNumericTerm ) )
        // InternalCPHLCL.g:599:5: ( ruleNumericTerm )
        {
        // InternalCPHLCL.g:599:5: ( ruleNumericTerm )
        // InternalCPHLCL.g:600:5: ruleNumericTerm
        {
        pushFollow(FOLLOW_2);
        ruleNumericTerm();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalCPHLCL

    // Delegated rules

    public final boolean synpred2_InternalCPHLCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCPHLCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCPHLCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCPHLCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCPHLCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCPHLCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCPHLCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCPHLCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0038000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000030000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000C0000500030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800100030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000003F000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0007F00000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0040000030000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000012L});

}