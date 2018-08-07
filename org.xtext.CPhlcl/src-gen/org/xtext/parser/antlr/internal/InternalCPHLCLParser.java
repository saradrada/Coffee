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

@SuppressWarnings("all")
public class InternalCPHLCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'variables:'", "'constraints:'", "'strategy:'", "'domain:'", "'..'", "'['", "']'", "':'", "'<=>'", "'=>'", "'OR'", "'AND'", "'='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'('", "')'", "'~'", "','", "'true'", "'false'", "'one'", "'two'", "'boolean'", "'integer'", "'symbolic'", "'at_most'", "'all_different'", "'pow'", "'dist'", "'min'", "'max'", "'abs'", "'sqrt'"
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* (otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variables_3_0 = null;

        EObject lv_constraints_5_0 = null;

        AntlrDatatypeRuleToken lv_strategy_7_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* (otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) )? ) )
            // InternalCPHLCL.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* (otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) )? )
            {
            // InternalCPHLCL.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* (otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) )? )
            // InternalCPHLCL.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* (otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalCPHLCL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCPHLCL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCPHLCL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalCPHLCL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getVariablesKeyword_2());
            		
            // InternalCPHLCL.g:105:3: ( (lv_variables_3_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=43 && LA1_0<=45)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCPHLCL.g:106:4: (lv_variables_3_0= ruleVariable )
            	    {
            	    // InternalCPHLCL.g:106:4: (lv_variables_3_0= ruleVariable )
            	    // InternalCPHLCL.g:107:5: lv_variables_3_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_variables_3_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"org.xtext.CPHLCL.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getConstraintsKeyword_4());
            		
            // InternalCPHLCL.g:128:3: ( (lv_constraints_5_0= ruleConstraint ) )*
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

            	    					newCompositeNode(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_constraints_5_0=ruleConstraint();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCPHLCL.g:147:3: (otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCPHLCL.g:148:4: otherlv_6= 'strategy:' ( (lv_strategy_7_0= ruleStrategy ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getStrategyKeyword_6_0());
                    			
                    // InternalCPHLCL.g:152:4: ( (lv_strategy_7_0= ruleStrategy ) )
                    // InternalCPHLCL.g:153:5: (lv_strategy_7_0= ruleStrategy )
                    {
                    // InternalCPHLCL.g:153:5: (lv_strategy_7_0= ruleStrategy )
                    // InternalCPHLCL.g:154:6: lv_strategy_7_0= ruleStrategy
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getStrategyStrategyParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_strategy_7_0=ruleStrategy();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleVariable"
    // InternalCPHLCL.g:176:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalCPHLCL.g:176:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalCPHLCL.g:177:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalCPHLCL.g:183:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_domain_3_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:189:2: ( ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) )? ) )
            // InternalCPHLCL.g:190:2: ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) )? )
            {
            // InternalCPHLCL.g:190:2: ( ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) )? )
            // InternalCPHLCL.g:191:3: ( (lv_type_0_0= ruleVarType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) )?
            {
            // InternalCPHLCL.g:191:3: ( (lv_type_0_0= ruleVarType ) )
            // InternalCPHLCL.g:192:4: (lv_type_0_0= ruleVarType )
            {
            // InternalCPHLCL.g:192:4: (lv_type_0_0= ruleVarType )
            // InternalCPHLCL.g:193:5: lv_type_0_0= ruleVarType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeVarTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleVarType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.CPHLCL.VarType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCPHLCL.g:210:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCPHLCL.g:211:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCPHLCL.g:211:4: (lv_name_1_0= RULE_ID )
            // InternalCPHLCL.g:212:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCPHLCL.g:228:3: (otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCPHLCL.g:229:4: otherlv_2= 'domain:' ( (lv_domain_3_0= ruleDomainDeclaration ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getDomainKeyword_2_0());
                    			
                    // InternalCPHLCL.g:233:4: ( (lv_domain_3_0= ruleDomainDeclaration ) )
                    // InternalCPHLCL.g:234:5: (lv_domain_3_0= ruleDomainDeclaration )
                    {
                    // InternalCPHLCL.g:234:5: (lv_domain_3_0= ruleDomainDeclaration )
                    // InternalCPHLCL.g:235:6: lv_domain_3_0= ruleDomainDeclaration
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getDomainDomainDeclarationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_domain_3_0=ruleDomainDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
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
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleDomainDeclaration"
    // InternalCPHLCL.g:257:1: entryRuleDomainDeclaration returns [EObject current=null] : iv_ruleDomainDeclaration= ruleDomainDeclaration EOF ;
    public final EObject entryRuleDomainDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDeclaration = null;


        try {
            // InternalCPHLCL.g:257:58: (iv_ruleDomainDeclaration= ruleDomainDeclaration EOF )
            // InternalCPHLCL.g:258:2: iv_ruleDomainDeclaration= ruleDomainDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDomainDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainDeclaration=ruleDomainDeclaration();

            state._fsp--;

             current =iv_ruleDomainDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:264:1: ruleDomainDeclaration returns [EObject current=null] : (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleDomainDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Interval_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:270:2: ( (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) )
            // InternalCPHLCL.g:271:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            {
            // InternalCPHLCL.g:271:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCPHLCL.g:272:3: this_Interval_0= ruleInterval
                    {

                    			newCompositeNode(grammarAccess.getDomainDeclarationAccess().getIntervalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interval_0=ruleInterval();

                    state._fsp--;


                    			current = this_Interval_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:281:3: this_Enumeration_1= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getDomainDeclarationAccess().getEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalCPHLCL.g:293:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalCPHLCL.g:293:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalCPHLCL.g:294:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:300:1: ruleInterval returns [EObject current=null] : ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:306:2: ( ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) ) )
            // InternalCPHLCL.g:307:2: ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) )
            {
            // InternalCPHLCL.g:307:2: ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) )
            // InternalCPHLCL.g:308:3: ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) )
            {
            // InternalCPHLCL.g:308:3: ( (lv_start_0_0= ruleNumber ) )
            // InternalCPHLCL.g:309:4: (lv_start_0_0= ruleNumber )
            {
            // InternalCPHLCL.g:309:4: (lv_start_0_0= ruleNumber )
            // InternalCPHLCL.g:310:5: lv_start_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getStartNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_start_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.xtext.CPHLCL.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
            		
            // InternalCPHLCL.g:331:3: ( (lv_end_2_0= ruleNumber ) )
            // InternalCPHLCL.g:332:4: (lv_end_2_0= ruleNumber )
            {
            // InternalCPHLCL.g:332:4: (lv_end_2_0= ruleNumber )
            // InternalCPHLCL.g:333:5: lv_end_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getEndNumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_2_0,
            						"org.xtext.CPHLCL.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalCPHLCL.g:354:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalCPHLCL.g:354:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalCPHLCL.g:355:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:361:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:367:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalCPHLCL.g:368:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalCPHLCL.g:368:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalCPHLCL.g:369:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalCPHLCL.g:373:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalCPHLCL.g:374:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalCPHLCL.g:374:4: (lv_list_1_0= ruleListOfValues )
            // InternalCPHLCL.g:375:5: lv_list_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_list_1_0=ruleListOfValues();

            state._fsp--;


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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalCPHLCL.g:400:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalCPHLCL.g:400:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCPHLCL.g:401:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:407:1: ruleConstraint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:413:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) ) ) )
            // InternalCPHLCL.g:414:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) ) )
            {
            // InternalCPHLCL.g:414:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) ) )
            // InternalCPHLCL.g:415:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleExpression ) )
            {
            // InternalCPHLCL.g:415:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCPHLCL.g:416:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCPHLCL.g:416:4: (lv_name_0_0= RULE_ID )
            // InternalCPHLCL.g:417:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getColonKeyword_1());
            		
            // InternalCPHLCL.g:437:3: ( (lv_exp_2_0= ruleExpression ) )
            // InternalCPHLCL.g:438:4: (lv_exp_2_0= ruleExpression )
            {
            // InternalCPHLCL.g:438:4: (lv_exp_2_0= ruleExpression )
            // InternalCPHLCL.g:439:5: lv_exp_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getExpExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExpression();

            state._fsp--;


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


            	leaveRule();

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
    // InternalCPHLCL.g:460:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCPHLCL.g:460:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCPHLCL.g:461:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:467:1: ruleExpression returns [EObject current=null] : (this_Relational_0= ruleRelational | this_Global_1= ruleGlobal ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Relational_0 = null;

        EObject this_Global_1 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:473:2: ( (this_Relational_0= ruleRelational | this_Global_1= ruleGlobal ) )
            // InternalCPHLCL.g:474:2: (this_Relational_0= ruleRelational | this_Global_1= ruleGlobal )
            {
            // InternalCPHLCL.g:474:2: (this_Relational_0= ruleRelational | this_Global_1= ruleGlobal )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||LA6_0==35||LA6_0==37||(LA6_0>=39 && LA6_0<=40)||(LA6_0>=48 && LA6_0<=53)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=46 && LA6_0<=47)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCPHLCL.g:475:3: this_Relational_0= ruleRelational
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getRelationalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relational_0=ruleRelational();

                    state._fsp--;


                    			current = this_Relational_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:484:3: this_Global_1= ruleGlobal
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getGlobalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Global_1=ruleGlobal();

                    state._fsp--;


                    			current = this_Global_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleRelational"
    // InternalCPHLCL.g:496:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalCPHLCL.g:496:51: (iv_ruleRelational= ruleRelational EOF )
            // InternalCPHLCL.g:497:2: iv_ruleRelational= ruleRelational EOF
            {
             newCompositeNode(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelational=ruleRelational();

            state._fsp--;

             current =iv_ruleRelational; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:503:1: ruleRelational returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:509:2: (this_Iff_0= ruleIff )
            // InternalCPHLCL.g:510:2: this_Iff_0= ruleIff
            {

            		newCompositeNode(grammarAccess.getRelationalAccess().getIffParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Iff_0=ruleIff();

            state._fsp--;


            		current = this_Iff_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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


    // $ANTLR start "entryRuleIff"
    // InternalCPHLCL.g:521:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // InternalCPHLCL.g:521:44: (iv_ruleIff= ruleIff EOF )
            // InternalCPHLCL.g:522:2: iv_ruleIff= ruleIff EOF
            {
             newCompositeNode(grammarAccess.getIffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIff=ruleIff();

            state._fsp--;

             current =iv_ruleIff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIff"


    // $ANTLR start "ruleIff"
    // InternalCPHLCL.g:528:1: ruleIff returns [EObject current=null] : (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implies_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:534:2: ( (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) )
            // InternalCPHLCL.g:535:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            {
            // InternalCPHLCL.g:535:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            // InternalCPHLCL.g:536:3: this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            {

            			newCompositeNode(grammarAccess.getIffAccess().getImpliesParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Implies_0=ruleImplies();

            state._fsp--;


            			current = this_Implies_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCPHLCL.g:544:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCPHLCL.g:545:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) )
            	    {
            	    // InternalCPHLCL.g:545:4: ()
            	    // InternalCPHLCL.g:546:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getIffAccess().getIffLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalCPHLCL.g:556:4: ( (lv_right_3_0= ruleImplies ) )
            	    // InternalCPHLCL.g:557:5: (lv_right_3_0= ruleImplies )
            	    {
            	    // InternalCPHLCL.g:557:5: (lv_right_3_0= ruleImplies )
            	    // InternalCPHLCL.g:558:6: lv_right_3_0= ruleImplies
            	    {

            	    						newCompositeNode(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleImplies();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIffRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.CPHLCL.Implies");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIff"


    // $ANTLR start "entryRuleImplies"
    // InternalCPHLCL.g:580:1: entryRuleImplies returns [EObject current=null] : iv_ruleImplies= ruleImplies EOF ;
    public final EObject entryRuleImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplies = null;


        try {
            // InternalCPHLCL.g:580:48: (iv_ruleImplies= ruleImplies EOF )
            // InternalCPHLCL.g:581:2: iv_ruleImplies= ruleImplies EOF
            {
             newCompositeNode(grammarAccess.getImpliesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplies=ruleImplies();

            state._fsp--;

             current =iv_ruleImplies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplies"


    // $ANTLR start "ruleImplies"
    // InternalCPHLCL.g:587:1: ruleImplies returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:593:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalCPHLCL.g:594:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalCPHLCL.g:594:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalCPHLCL.g:595:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCPHLCL.g:603:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCPHLCL.g:604:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalCPHLCL.g:604:4: ()
            	    // InternalCPHLCL.g:605:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImpliesAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalCPHLCL.g:615:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalCPHLCL.g:616:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalCPHLCL.g:616:5: (lv_right_3_0= ruleOr )
            	    // InternalCPHLCL.g:617:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImpliesRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.CPHLCL.Or");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalCPHLCL.g:639:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalCPHLCL.g:639:43: (iv_ruleOr= ruleOr EOF )
            // InternalCPHLCL.g:640:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalCPHLCL.g:646:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:652:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalCPHLCL.g:653:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalCPHLCL.g:653:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalCPHLCL.g:654:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCPHLCL.g:662:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCPHLCL.g:663:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalCPHLCL.g:663:4: ()
            	    // InternalCPHLCL.g:664:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalCPHLCL.g:674:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalCPHLCL.g:675:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalCPHLCL.g:675:5: (lv_right_3_0= ruleAnd )
            	    // InternalCPHLCL.g:676:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.CPHLCL.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalCPHLCL.g:698:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalCPHLCL.g:698:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalCPHLCL.g:699:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalCPHLCL.g:705:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:711:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalCPHLCL.g:712:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalCPHLCL.g:712:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalCPHLCL.g:713:3: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCPHLCL.g:721:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCPHLCL.g:722:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalCPHLCL.g:722:4: ()
            	    // InternalCPHLCL.g:723:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalCPHLCL.g:733:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalCPHLCL.g:734:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalCPHLCL.g:734:5: (lv_right_3_0= ruleEquality )
            	    // InternalCPHLCL.g:735:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.CPHLCL.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalCPHLCL.g:757:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalCPHLCL.g:757:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalCPHLCL.g:758:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalCPHLCL.g:764:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:770:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalCPHLCL.g:771:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalCPHLCL.g:771:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalCPHLCL.g:772:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCPHLCL.g:780:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=24 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCPHLCL.g:781:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalCPHLCL.g:781:4: ()
            	    // InternalCPHLCL.g:782:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCPHLCL.g:788:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) )
            	    // InternalCPHLCL.g:789:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalCPHLCL.g:789:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    // InternalCPHLCL.g:790:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    {
            	    // InternalCPHLCL.g:790:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==24) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==25) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalCPHLCL.g:791:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,24,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCPHLCL.g:802:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,25,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCPHLCL.g:815:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalCPHLCL.g:816:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalCPHLCL.g:816:5: (lv_right_3_0= ruleComparison )
            	    // InternalCPHLCL.g:817:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.CPHLCL.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalCPHLCL.g:839:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalCPHLCL.g:839:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalCPHLCL.g:840:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalCPHLCL.g:846:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:852:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalCPHLCL.g:853:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalCPHLCL.g:853:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalCPHLCL.g:854:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCPHLCL.g:862:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=26 && LA14_0<=29)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCPHLCL.g:863:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalCPHLCL.g:863:4: ()
            	    // InternalCPHLCL.g:864:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCPHLCL.g:870:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalCPHLCL.g:871:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalCPHLCL.g:871:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalCPHLCL.g:872:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalCPHLCL.g:872:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt13=4;
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
            	    case 29:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // InternalCPHLCL.g:873:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCPHLCL.g:884:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCPHLCL.g:895:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,28,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalCPHLCL.g:906:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,29,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCPHLCL.g:919:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalCPHLCL.g:920:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalCPHLCL.g:920:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalCPHLCL.g:921:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.CPHLCL.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalCPHLCL.g:943:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalCPHLCL.g:943:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalCPHLCL.g:944:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalCPHLCL.g:950:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:956:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalCPHLCL.g:957:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalCPHLCL.g:957:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalCPHLCL.g:958:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCPHLCL.g:966:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=30 && LA16_0<=31)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCPHLCL.g:967:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalCPHLCL.g:967:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==30) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==31) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalCPHLCL.g:968:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalCPHLCL.g:968:5: ( () otherlv_2= '+' )
            	            // InternalCPHLCL.g:969:6: () otherlv_2= '+'
            	            {
            	            // InternalCPHLCL.g:969:6: ()
            	            // InternalCPHLCL.g:970:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,30,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCPHLCL.g:982:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalCPHLCL.g:982:5: ( () otherlv_4= '-' )
            	            // InternalCPHLCL.g:983:6: () otherlv_4= '-'
            	            {
            	            // InternalCPHLCL.g:983:6: ()
            	            // InternalCPHLCL.g:984:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,31,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalCPHLCL.g:996:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalCPHLCL.g:997:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalCPHLCL.g:997:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalCPHLCL.g:998:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.CPHLCL.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalCPHLCL.g:1020:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalCPHLCL.g:1020:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalCPHLCL.g:1021:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalCPHLCL.g:1027:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1033:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalCPHLCL.g:1034:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalCPHLCL.g:1034:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalCPHLCL.g:1035:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCPHLCL.g:1043:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=32 && LA18_0<=34)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCPHLCL.g:1044:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalCPHLCL.g:1044:4: ()
            	    // InternalCPHLCL.g:1045:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCPHLCL.g:1051:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
            	    // InternalCPHLCL.g:1052:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    {
            	    // InternalCPHLCL.g:1052:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    // InternalCPHLCL.g:1053:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    {
            	    // InternalCPHLCL.g:1053:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // InternalCPHLCL.g:1054:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCPHLCL.g:1065:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCPHLCL.g:1076:7: lv_op_2_3= 'mod'
            	            {
            	            lv_op_2_3=(Token)match(input,34,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpModKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCPHLCL.g:1089:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalCPHLCL.g:1090:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalCPHLCL.g:1090:5: (lv_right_3_0= rulePrimary )
            	    // InternalCPHLCL.g:1091:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.CPHLCL.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalCPHLCL.g:1113:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCPHLCL.g:1113:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCPHLCL.g:1114:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalCPHLCL.g:1120:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= ruleFunctionOp ) ) otherlv_11= '(' ( (lv_left_12_0= rulePrimary ) ) otherlv_13= ',' ( (lv_right_14_0= rulePrimary ) ) otherlv_15= ')' ) | this_Atomic_16= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_Relational_1 = null;

        EObject lv_expression_5_0 = null;

        AntlrDatatypeRuleToken lv_op_7_0 = null;

        EObject lv_expression_8_0 = null;

        AntlrDatatypeRuleToken lv_op_10_0 = null;

        EObject lv_left_12_0 = null;

        EObject lv_right_14_0 = null;

        EObject this_Atomic_16 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1126:2: ( ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= ruleFunctionOp ) ) otherlv_11= '(' ( (lv_left_12_0= rulePrimary ) ) otherlv_13= ',' ( (lv_right_14_0= rulePrimary ) ) otherlv_15= ')' ) | this_Atomic_16= ruleAtomic ) )
            // InternalCPHLCL.g:1127:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= ruleFunctionOp ) ) otherlv_11= '(' ( (lv_left_12_0= rulePrimary ) ) otherlv_13= ',' ( (lv_right_14_0= rulePrimary ) ) otherlv_15= ')' ) | this_Atomic_16= ruleAtomic )
            {
            // InternalCPHLCL.g:1127:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= ruleFunctionOp ) ) otherlv_11= '(' ( (lv_left_12_0= rulePrimary ) ) otherlv_13= ',' ( (lv_right_14_0= rulePrimary ) ) otherlv_15= ')' ) | this_Atomic_16= ruleAtomic )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 52:
            case 53:
                {
                alt19=3;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt19=4;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 39:
            case 40:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalCPHLCL.g:1128:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    {
                    // InternalCPHLCL.g:1128:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    // InternalCPHLCL.g:1129:4: otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getRelationalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_Relational_1=ruleRelational();

                    state._fsp--;


                    				current = this_Relational_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1147:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalCPHLCL.g:1147:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalCPHLCL.g:1148:4: () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalCPHLCL.g:1148:4: ()
                    // InternalCPHLCL.g:1149:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNegationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getTildeKeyword_1_1());
                    			
                    // InternalCPHLCL.g:1159:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalCPHLCL.g:1160:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalCPHLCL.g:1160:5: (lv_expression_5_0= rulePrimary )
                    // InternalCPHLCL.g:1161:6: lv_expression_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"org.xtext.CPHLCL.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1180:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalCPHLCL.g:1180:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalCPHLCL.g:1181:4: () ( (lv_op_7_0= ruleUnaryOp ) ) ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalCPHLCL.g:1181:4: ()
                    // InternalCPHLCL.g:1182:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUnaryAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCPHLCL.g:1188:4: ( (lv_op_7_0= ruleUnaryOp ) )
                    // InternalCPHLCL.g:1189:5: (lv_op_7_0= ruleUnaryOp )
                    {
                    // InternalCPHLCL.g:1189:5: (lv_op_7_0= ruleUnaryOp )
                    // InternalCPHLCL.g:1190:6: lv_op_7_0= ruleUnaryOp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getOpUnaryOpParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_op_7_0=ruleUnaryOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_7_0,
                    							"org.xtext.CPHLCL.UnaryOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCPHLCL.g:1207:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalCPHLCL.g:1208:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalCPHLCL.g:1208:5: (lv_expression_8_0= rulePrimary )
                    // InternalCPHLCL.g:1209:6: lv_expression_8_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"org.xtext.CPHLCL.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1228:3: ( () ( (lv_op_10_0= ruleFunctionOp ) ) otherlv_11= '(' ( (lv_left_12_0= rulePrimary ) ) otherlv_13= ',' ( (lv_right_14_0= rulePrimary ) ) otherlv_15= ')' )
                    {
                    // InternalCPHLCL.g:1228:3: ( () ( (lv_op_10_0= ruleFunctionOp ) ) otherlv_11= '(' ( (lv_left_12_0= rulePrimary ) ) otherlv_13= ',' ( (lv_right_14_0= rulePrimary ) ) otherlv_15= ')' )
                    // InternalCPHLCL.g:1229:4: () ( (lv_op_10_0= ruleFunctionOp ) ) otherlv_11= '(' ( (lv_left_12_0= rulePrimary ) ) otherlv_13= ',' ( (lv_right_14_0= rulePrimary ) ) otherlv_15= ')'
                    {
                    // InternalCPHLCL.g:1229:4: ()
                    // InternalCPHLCL.g:1230:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getFunctionAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCPHLCL.g:1236:4: ( (lv_op_10_0= ruleFunctionOp ) )
                    // InternalCPHLCL.g:1237:5: (lv_op_10_0= ruleFunctionOp )
                    {
                    // InternalCPHLCL.g:1237:5: (lv_op_10_0= ruleFunctionOp )
                    // InternalCPHLCL.g:1238:6: lv_op_10_0= ruleFunctionOp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getOpFunctionOpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_op_10_0=ruleFunctionOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_10_0,
                    							"org.xtext.CPHLCL.FunctionOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,35,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalCPHLCL.g:1259:4: ( (lv_left_12_0= rulePrimary ) )
                    // InternalCPHLCL.g:1260:5: (lv_left_12_0= rulePrimary )
                    {
                    // InternalCPHLCL.g:1260:5: (lv_left_12_0= rulePrimary )
                    // InternalCPHLCL.g:1261:6: lv_left_12_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_left_12_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_12_0,
                    							"org.xtext.CPHLCL.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,38,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getCommaKeyword_3_4());
                    			
                    // InternalCPHLCL.g:1282:4: ( (lv_right_14_0= rulePrimary ) )
                    // InternalCPHLCL.g:1283:5: (lv_right_14_0= rulePrimary )
                    {
                    // InternalCPHLCL.g:1283:5: (lv_right_14_0= rulePrimary )
                    // InternalCPHLCL.g:1284:6: lv_right_14_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getRightPrimaryParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_right_14_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_14_0,
                    							"org.xtext.CPHLCL.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_6());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCPHLCL.g:1307:3: this_Atomic_16= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_16=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalCPHLCL.g:1319:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalCPHLCL.g:1319:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalCPHLCL.g:1320:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalCPHLCL.g:1326:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1332:2: ( ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) )
            // InternalCPHLCL.g:1333:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            {
            // InternalCPHLCL.g:1333:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt21=1;
                }
                break;
            case RULE_ID:
                {
                alt21=2;
                }
                break;
            case RULE_INT:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalCPHLCL.g:1334:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    {
                    // InternalCPHLCL.g:1334:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    // InternalCPHLCL.g:1335:4: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    {
                    // InternalCPHLCL.g:1335:4: ()
                    // InternalCPHLCL.g:1336:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCPHLCL.g:1342:4: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    // InternalCPHLCL.g:1343:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    {
                    // InternalCPHLCL.g:1343:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    // InternalCPHLCL.g:1344:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    {
                    // InternalCPHLCL.g:1344:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==39) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==40) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalCPHLCL.g:1345:7: lv_value_1_1= 'true'
                            {
                            lv_value_1_1=(Token)match(input,39,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCPHLCL.g:1356:7: lv_value_1_2= 'false'
                            {
                            lv_value_1_2=(Token)match(input,40,FOLLOW_2); 

                            							newLeafNode(lv_value_1_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1371:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalCPHLCL.g:1371:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalCPHLCL.g:1372:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalCPHLCL.g:1372:4: ()
                    // InternalCPHLCL.g:1373:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCPHLCL.g:1379:4: ( (otherlv_3= RULE_ID ) )
                    // InternalCPHLCL.g:1380:5: (otherlv_3= RULE_ID )
                    {
                    // InternalCPHLCL.g:1380:5: (otherlv_3= RULE_ID )
                    // InternalCPHLCL.g:1381:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_1_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1394:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalCPHLCL.g:1394:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalCPHLCL.g:1395:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalCPHLCL.g:1395:4: ()
                    // InternalCPHLCL.g:1396:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCPHLCL.g:1402:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalCPHLCL.g:1403:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalCPHLCL.g:1403:5: (lv_value_5_0= RULE_INT )
                    // InternalCPHLCL.g:1404:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleGlobal"
    // InternalCPHLCL.g:1425:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalCPHLCL.g:1425:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalCPHLCL.g:1426:2: iv_ruleGlobal= ruleGlobal EOF
            {
             newCompositeNode(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;

             current =iv_ruleGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:1432:1: ruleGlobal returns [EObject current=null] : ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_vars_2_0 = null;

        EObject lv_values_5_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1438:2: ( ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )? ) )
            // InternalCPHLCL.g:1439:2: ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )? )
            {
            // InternalCPHLCL.g:1439:2: ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )? )
            // InternalCPHLCL.g:1440:3: ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )?
            {
            // InternalCPHLCL.g:1440:3: ( (lv_op_0_0= ruleGlobalOp ) )
            // InternalCPHLCL.g:1441:4: (lv_op_0_0= ruleGlobalOp )
            {
            // InternalCPHLCL.g:1441:4: (lv_op_0_0= ruleGlobalOp )
            // InternalCPHLCL.g:1442:5: lv_op_0_0= ruleGlobalOp
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getOpGlobalOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_op_0_0=ruleGlobalOp();

            state._fsp--;


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

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCPHLCL.g:1463:3: ( (lv_vars_2_0= ruleListOfIDs ) )
            // InternalCPHLCL.g:1464:4: (lv_vars_2_0= ruleListOfIDs )
            {
            // InternalCPHLCL.g:1464:4: (lv_vars_2_0= ruleListOfIDs )
            // InternalCPHLCL.g:1465:5: lv_vars_2_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getVarsListOfIDsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_vars_2_0=ruleListOfIDs();

            state._fsp--;


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

            otherlv_3=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalAccess().getRightParenthesisKeyword_3());
            		
            // InternalCPHLCL.g:1486:3: (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCPHLCL.g:1487:4: otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalCPHLCL.g:1491:4: ( (lv_values_5_0= ruleListOfListValues ) )
                    // InternalCPHLCL.g:1492:5: (lv_values_5_0= ruleListOfListValues )
                    {
                    // InternalCPHLCL.g:1492:5: (lv_values_5_0= ruleListOfListValues )
                    // InternalCPHLCL.g:1493:6: lv_values_5_0= ruleListOfListValues
                    {

                    						newCompositeNode(grammarAccess.getGlobalAccess().getValuesListOfListValuesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_values_5_0=ruleListOfListValues();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalRule());
                    						}
                    						set(
                    							current,
                    							"values",
                    							lv_values_5_0,
                    							"org.xtext.CPHLCL.ListOfListValues");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getGlobalAccess().getRightSquareBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleStrategy"
    // InternalCPHLCL.g:1519:1: entryRuleStrategy returns [String current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final String entryRuleStrategy() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStrategy = null;


        try {
            // InternalCPHLCL.g:1519:48: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalCPHLCL.g:1520:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:1526:1: ruleStrategy returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'one' | kw= 'two' ) ;
    public final AntlrDatatypeRuleToken ruleStrategy() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1532:2: ( (kw= 'one' | kw= 'two' ) )
            // InternalCPHLCL.g:1533:2: (kw= 'one' | kw= 'two' )
            {
            // InternalCPHLCL.g:1533:2: (kw= 'one' | kw= 'two' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            else if ( (LA23_0==42) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalCPHLCL.g:1534:3: kw= 'one'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStrategyAccess().getOneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1540:3: kw= 'two'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStrategyAccess().getTwoKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalCPHLCL.g:1549:1: entryRuleBoolVal returns [EObject current=null] : iv_ruleBoolVal= ruleBoolVal EOF ;
    public final EObject entryRuleBoolVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVal = null;


        try {
            // InternalCPHLCL.g:1549:48: (iv_ruleBoolVal= ruleBoolVal EOF )
            // InternalCPHLCL.g:1550:2: iv_ruleBoolVal= ruleBoolVal EOF
            {
             newCompositeNode(grammarAccess.getBoolValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolVal=ruleBoolVal();

            state._fsp--;

             current =iv_ruleBoolVal; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:1556:1: ruleBoolVal returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1562:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalCPHLCL.g:1563:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalCPHLCL.g:1563:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalCPHLCL.g:1564:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalCPHLCL.g:1564:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalCPHLCL.g:1565:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalCPHLCL.g:1565:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            else if ( (LA24_0==40) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCPHLCL.g:1566:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolValRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1577:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBoolValAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolValRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleNumber"
    // InternalCPHLCL.g:1593:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalCPHLCL.g:1593:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalCPHLCL.g:1594:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:1600:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1606:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalCPHLCL.g:1607:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalCPHLCL.g:1607:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalCPHLCL.g:1608:3: (lv_value_0_0= RULE_INT )
            {
            // InternalCPHLCL.g:1608:3: (lv_value_0_0= RULE_INT )
            // InternalCPHLCL.g:1609:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleSymbol"
    // InternalCPHLCL.g:1628:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalCPHLCL.g:1628:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalCPHLCL.g:1629:2: iv_ruleSymbol= ruleSymbol EOF
            {
             newCompositeNode(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;

             current =iv_ruleSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalCPHLCL.g:1635:1: ruleSymbol returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1641:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalCPHLCL.g:1642:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalCPHLCL.g:1642:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalCPHLCL.g:1643:3: (lv_value_0_0= RULE_ID )
            {
            // InternalCPHLCL.g:1643:3: (lv_value_0_0= RULE_ID )
            // InternalCPHLCL.g:1644:4: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getSymbolAccess().getValueIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSymbolRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleValue"
    // InternalCPHLCL.g:1663:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalCPHLCL.g:1663:46: (iv_ruleValue= ruleValue EOF )
            // InternalCPHLCL.g:1664:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:1670:1: ruleValue returns [EObject current=null] : (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_NonEnumerableValue_1 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1676:2: ( (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue ) )
            // InternalCPHLCL.g:1677:2: (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            {
            // InternalCPHLCL.g:1677:2: (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID||(LA25_0>=39 && LA25_0<=40)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCPHLCL.g:1678:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1687:3: this_NonEnumerableValue_1= ruleNonEnumerableValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNonEnumerableValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonEnumerableValue_1=ruleNonEnumerableValue();

                    state._fsp--;


                    			current = this_NonEnumerableValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleNonEnumerableValue"
    // InternalCPHLCL.g:1699:1: entryRuleNonEnumerableValue returns [EObject current=null] : iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF ;
    public final EObject entryRuleNonEnumerableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonEnumerableValue = null;


        try {
            // InternalCPHLCL.g:1699:59: (iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF )
            // InternalCPHLCL.g:1700:2: iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF
            {
             newCompositeNode(grammarAccess.getNonEnumerableValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonEnumerableValue=ruleNonEnumerableValue();

            state._fsp--;

             current =iv_ruleNonEnumerableValue; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:1706:1: ruleNonEnumerableValue returns [EObject current=null] : (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol ) ;
    public final EObject ruleNonEnumerableValue() throws RecognitionException {
        EObject current = null;

        EObject this_BoolVal_0 = null;

        EObject this_Symbol_1 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1712:2: ( (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol ) )
            // InternalCPHLCL.g:1713:2: (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol )
            {
            // InternalCPHLCL.g:1713:2: (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=39 && LA26_0<=40)) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCPHLCL.g:1714:3: this_BoolVal_0= ruleBoolVal
                    {

                    			newCompositeNode(grammarAccess.getNonEnumerableValueAccess().getBoolValParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolVal_0=ruleBoolVal();

                    state._fsp--;


                    			current = this_BoolVal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1723:3: this_Symbol_1= ruleSymbol
                    {

                    			newCompositeNode(grammarAccess.getNonEnumerableValueAccess().getSymbolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Symbol_1=ruleSymbol();

                    state._fsp--;


                    			current = this_Symbol_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalCPHLCL.g:1735:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalCPHLCL.g:1735:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalCPHLCL.g:1736:2: iv_ruleVarType= ruleVarType EOF
            {
             newCompositeNode(grammarAccess.getVarTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarType=ruleVarType();

            state._fsp--;

             current =iv_ruleVarType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:1742:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1748:2: ( (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) )
            // InternalCPHLCL.g:1749:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            {
            // InternalCPHLCL.g:1749:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt27=1;
                }
                break;
            case 44:
                {
                alt27=2;
                }
                break;
            case 45:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalCPHLCL.g:1750:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1756:3: kw= 'integer'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1762:3: kw= 'symbolic'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getSymbolicKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleGlobalOp"
    // InternalCPHLCL.g:1771:1: entryRuleGlobalOp returns [String current=null] : iv_ruleGlobalOp= ruleGlobalOp EOF ;
    public final String entryRuleGlobalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGlobalOp = null;


        try {
            // InternalCPHLCL.g:1771:48: (iv_ruleGlobalOp= ruleGlobalOp EOF )
            // InternalCPHLCL.g:1772:2: iv_ruleGlobalOp= ruleGlobalOp EOF
            {
             newCompositeNode(grammarAccess.getGlobalOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalOp=ruleGlobalOp();

            state._fsp--;

             current =iv_ruleGlobalOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:1778:1: ruleGlobalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'at_most' | kw= 'all_different' ) ;
    public final AntlrDatatypeRuleToken ruleGlobalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1784:2: ( (kw= 'at_most' | kw= 'all_different' ) )
            // InternalCPHLCL.g:1785:2: (kw= 'at_most' | kw= 'all_different' )
            {
            // InternalCPHLCL.g:1785:2: (kw= 'at_most' | kw= 'all_different' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            else if ( (LA28_0==47) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalCPHLCL.g:1786:3: kw= 'at_most'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getGlobalOpAccess().getAt_mostKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1792:3: kw= 'all_different'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getGlobalOpAccess().getAll_differentKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleFunctionOp"
    // InternalCPHLCL.g:1801:1: entryRuleFunctionOp returns [String current=null] : iv_ruleFunctionOp= ruleFunctionOp EOF ;
    public final String entryRuleFunctionOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionOp = null;


        try {
            // InternalCPHLCL.g:1801:50: (iv_ruleFunctionOp= ruleFunctionOp EOF )
            // InternalCPHLCL.g:1802:2: iv_ruleFunctionOp= ruleFunctionOp EOF
            {
             newCompositeNode(grammarAccess.getFunctionOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionOp=ruleFunctionOp();

            state._fsp--;

             current =iv_ruleFunctionOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionOp"


    // $ANTLR start "ruleFunctionOp"
    // InternalCPHLCL.g:1808:1: ruleFunctionOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1814:2: ( (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' ) )
            // InternalCPHLCL.g:1815:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' )
            {
            // InternalCPHLCL.g:1815:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt29=1;
                }
                break;
            case 49:
                {
                alt29=2;
                }
                break;
            case 50:
                {
                alt29=3;
                }
                break;
            case 51:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalCPHLCL.g:1816:3: kw= 'pow'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getPowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1822:3: kw= 'dist'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getDistKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1828:3: kw= 'min'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getMinKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1834:3: kw= 'max'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getMaxKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionOp"


    // $ANTLR start "entryRuleUnaryOp"
    // InternalCPHLCL.g:1843:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // InternalCPHLCL.g:1843:47: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalCPHLCL.g:1844:2: iv_ruleUnaryOp= ruleUnaryOp EOF
            {
             newCompositeNode(grammarAccess.getUnaryOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOp=ruleUnaryOp();

            state._fsp--;

             current =iv_ruleUnaryOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOp"


    // $ANTLR start "ruleUnaryOp"
    // InternalCPHLCL.g:1850:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abs' | kw= 'sqrt' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:1856:2: ( (kw= 'abs' | kw= 'sqrt' ) )
            // InternalCPHLCL.g:1857:2: (kw= 'abs' | kw= 'sqrt' )
            {
            // InternalCPHLCL.g:1857:2: (kw= 'abs' | kw= 'sqrt' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            else if ( (LA30_0==53) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCPHLCL.g:1858:3: kw= 'abs'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getAbsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1864:3: kw= 'sqrt'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getSqrtKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "entryRuleListOfValues"
    // InternalCPHLCL.g:1873:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalCPHLCL.g:1873:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalCPHLCL.g:1874:2: iv_ruleListOfValues= ruleListOfValues EOF
            {
             newCompositeNode(grammarAccess.getListOfValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfValues=ruleListOfValues();

            state._fsp--;

             current =iv_ruleListOfValues; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:1880:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1886:2: ( ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) )
            // InternalCPHLCL.g:1887:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            {
            // InternalCPHLCL.g:1887:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            // InternalCPHLCL.g:1888:3: ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            {
            // InternalCPHLCL.g:1888:3: ( (lv_values_0_0= ruleValue ) )
            // InternalCPHLCL.g:1889:4: (lv_values_0_0= ruleValue )
            {
            // InternalCPHLCL.g:1889:4: (lv_values_0_0= ruleValue )
            // InternalCPHLCL.g:1890:5: lv_values_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_values_0_0=ruleValue();

            state._fsp--;


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

            // InternalCPHLCL.g:1907:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCPHLCL.g:1908:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) )
            	    {
            	    // InternalCPHLCL.g:1908:4: (otherlv_1= ',' )+
            	    int cnt31=0;
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==38) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalCPHLCL.g:1909:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,38,FOLLOW_31); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt31 >= 1 ) break loop31;
            	                EarlyExitException eee =
            	                    new EarlyExitException(31, input);
            	                throw eee;
            	        }
            	        cnt31++;
            	    } while (true);

            	    // InternalCPHLCL.g:1914:4: ( (lv_values_2_0= ruleValue ) )
            	    // InternalCPHLCL.g:1915:5: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalCPHLCL.g:1915:5: (lv_values_2_0= ruleValue )
            	    // InternalCPHLCL.g:1916:6: lv_values_2_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleListOfListValues"
    // InternalCPHLCL.g:1938:1: entryRuleListOfListValues returns [EObject current=null] : iv_ruleListOfListValues= ruleListOfListValues EOF ;
    public final EObject entryRuleListOfListValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfListValues = null;


        try {
            // InternalCPHLCL.g:1938:57: (iv_ruleListOfListValues= ruleListOfListValues EOF )
            // InternalCPHLCL.g:1939:2: iv_ruleListOfListValues= ruleListOfListValues EOF
            {
             newCompositeNode(grammarAccess.getListOfListValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfListValues=ruleListOfListValues();

            state._fsp--;

             current =iv_ruleListOfListValues; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOfListValues"


    // $ANTLR start "ruleListOfListValues"
    // InternalCPHLCL.g:1945:1: ruleListOfListValues returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )* ) ;
    public final EObject ruleListOfListValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_5_0 = null;



        	enterRule();

        try {
            // InternalCPHLCL.g:1951:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )* ) )
            // InternalCPHLCL.g:1952:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )* )
            {
            // InternalCPHLCL.g:1952:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )* )
            // InternalCPHLCL.g:1953:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfListValuesAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalCPHLCL.g:1957:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalCPHLCL.g:1958:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalCPHLCL.g:1958:4: (lv_list_1_0= ruleListOfValues )
            // InternalCPHLCL.g:1959:5: lv_list_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getListOfListValuesAccess().getListListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_list_1_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfListValuesRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.xtext.CPHLCL.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getListOfListValuesAccess().getRightSquareBracketKeyword_2());
            		
            // InternalCPHLCL.g:1980:3: ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCPHLCL.g:1981:4: (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']'
            	    {
            	    // InternalCPHLCL.g:1981:4: (otherlv_3= ',' )+
            	    int cnt33=0;
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==38) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalCPHLCL.g:1982:5: otherlv_3= ','
            	    	    {
            	    	    otherlv_3=(Token)match(input,38,FOLLOW_32); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getListOfListValuesAccess().getCommaKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt33 >= 1 ) break loop33;
            	                EarlyExitException eee =
            	                    new EarlyExitException(33, input);
            	                throw eee;
            	        }
            	        cnt33++;
            	    } while (true);

            	    otherlv_4=(Token)match(input,17,FOLLOW_12); 

            	    				newLeafNode(otherlv_4, grammarAccess.getListOfListValuesAccess().getLeftSquareBracketKeyword_3_1());
            	    			
            	    // InternalCPHLCL.g:1991:4: ( (lv_list_5_0= ruleListOfValues ) )
            	    // InternalCPHLCL.g:1992:5: (lv_list_5_0= ruleListOfValues )
            	    {
            	    // InternalCPHLCL.g:1992:5: (lv_list_5_0= ruleListOfValues )
            	    // InternalCPHLCL.g:1993:6: lv_list_5_0= ruleListOfValues
            	    {

            	    						newCompositeNode(grammarAccess.getListOfListValuesAccess().getListListOfValuesParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_list_5_0=ruleListOfValues();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfListValuesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_5_0,
            	    							"org.xtext.CPHLCL.ListOfValues");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_30); 

            	    				newLeafNode(otherlv_6, grammarAccess.getListOfListValuesAccess().getRightSquareBracketKeyword_3_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOfListValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalCPHLCL.g:2019:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalCPHLCL.g:2019:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalCPHLCL.g:2020:2: iv_ruleListOfIDs= ruleListOfIDs EOF
            {
             newCompositeNode(grammarAccess.getListOfIDsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfIDs=ruleListOfIDs();

            state._fsp--;

             current =iv_ruleListOfIDs; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalCPHLCL.g:2026:1: ruleListOfIDs returns [EObject current=null] : ( (lv_ids_0_0= RULE_ID ) )+ ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token lv_ids_0_0=null;


        	enterRule();

        try {
            // InternalCPHLCL.g:2032:2: ( ( (lv_ids_0_0= RULE_ID ) )+ )
            // InternalCPHLCL.g:2033:2: ( (lv_ids_0_0= RULE_ID ) )+
            {
            // InternalCPHLCL.g:2033:2: ( (lv_ids_0_0= RULE_ID ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCPHLCL.g:2034:3: (lv_ids_0_0= RULE_ID )
            	    {
            	    // InternalCPHLCL.g:2034:3: (lv_ids_0_0= RULE_ID )
            	    // InternalCPHLCL.g:2035:4: lv_ids_0_0= RULE_ID
            	    {
            	    lv_ids_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    				newLeafNode(lv_ids_0_0, grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0());
            	    			

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
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000380000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000018000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x003FC1A800000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x003F01A800000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000001C000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000012L});

}