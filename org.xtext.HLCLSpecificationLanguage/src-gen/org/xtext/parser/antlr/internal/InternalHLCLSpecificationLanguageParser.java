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
import org.xtext.services.HLCLSpecificationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHLCLSpecificationLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'variables:'", "'constraints:'", "'variants:'", "'instantiable'", "'::'", "'['", "']'", "':'", "'('", "')'", "'is'", "'in'", "'variants'", "','", "'-->'", "'selected'", "'unselected'", "'boolean'", "'numeric'", "'optional'", "'mandatory'", "'requires'", "'excludes'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalHLCLSpecificationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHLCLSpecificationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHLCLSpecificationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHLCLSpecificationLanguage.g"; }



     	private HLCLSpecificationLanguageGrammarAccess grammarAccess;

        public InternalHLCLSpecificationLanguageParser(TokenStream input, HLCLSpecificationLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected HLCLSpecificationLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHLCLSpecificationLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHLCLSpecificationLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalHLCLSpecificationLanguage.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalHLCLSpecificationLanguage.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_vars_3_0 = null;

        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ ) )
            // InternalHLCLSpecificationLanguage.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ )
            {
            // InternalHLCLSpecificationLanguage.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ )
            // InternalHLCLSpecificationLanguage.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalHLCLSpecificationLanguage.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:85:5: lv_name_1_0= RULE_ID
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
            		
            // InternalHLCLSpecificationLanguage.g:105:3: ( (lv_vars_3_0= ruleVarDeclaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=29 && LA1_0<=30)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:106:4: (lv_vars_3_0= ruleVarDeclaration )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:106:4: (lv_vars_3_0= ruleVarDeclaration )
            	    // InternalHLCLSpecificationLanguage.g:107:5: lv_vars_3_0= ruleVarDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_vars_3_0=ruleVarDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_3_0,
            	    						"org.xtext.HLCLSpecificationLanguage.VarDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getConstraintsKeyword_4());
            		
            // InternalHLCLSpecificationLanguage.g:128:3: ( (lv_constraints_5_0= ruleConstraint ) )+
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
            	    // InternalHLCLSpecificationLanguage.g:129:4: (lv_constraints_5_0= ruleConstraint )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:129:4: (lv_constraints_5_0= ruleConstraint )
            	    // InternalHLCLSpecificationLanguage.g:130:5: lv_constraints_5_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_constraints_5_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_5_0,
            	    						"org.xtext.HLCLSpecificationLanguage.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalHLCLSpecificationLanguage.g:151:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalHLCLSpecificationLanguage.g:151:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalHLCLSpecificationLanguage.g:152:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalHLCLSpecificationLanguage.g:158:1: ruleVarDeclaration returns [EObject current=null] : (this_Modifier_0= ruleModifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_dom_3_0= ruleVariantDeclaration ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject this_Modifier_0 = null;

        EObject lv_dom_3_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:164:2: ( (this_Modifier_0= ruleModifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_dom_3_0= ruleVariantDeclaration ) ) ) )
            // InternalHLCLSpecificationLanguage.g:165:2: (this_Modifier_0= ruleModifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_dom_3_0= ruleVariantDeclaration ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:165:2: (this_Modifier_0= ruleModifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_dom_3_0= ruleVariantDeclaration ) ) )
            // InternalHLCLSpecificationLanguage.g:166:3: this_Modifier_0= ruleModifier ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_dom_3_0= ruleVariantDeclaration ) )
            {

            			newCompositeNode(grammarAccess.getVarDeclarationAccess().getModifierParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_Modifier_0=ruleModifier();

            state._fsp--;


            			current = this_Modifier_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHLCLSpecificationLanguage.g:174:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:175:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:175:4: (lv_name_1_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:176:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getVarDeclarationAccess().getVariantsKeyword_2());
            		
            // InternalHLCLSpecificationLanguage.g:196:3: ( (lv_dom_3_0= ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:197:4: (lv_dom_3_0= ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:197:4: (lv_dom_3_0= ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:198:5: lv_dom_3_0= ruleVariantDeclaration
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getDomVariantDeclarationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dom_3_0=ruleVariantDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"dom",
            						lv_dom_3_0,
            						"org.xtext.HLCLSpecificationLanguage.VariantDeclaration");
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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleModifier"
    // InternalHLCLSpecificationLanguage.g:219:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalHLCLSpecificationLanguage.g:219:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalHLCLSpecificationLanguage.g:220:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalHLCLSpecificationLanguage.g:226:1: ruleModifier returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token lv_instantiable_1_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:232:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+ {...}?) ) ) )
            // InternalHLCLSpecificationLanguage.g:233:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalHLCLSpecificationLanguage.g:233:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+ {...}?) ) )
            // InternalHLCLSpecificationLanguage.g:234:3: ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+ {...}?) )
            {
            // InternalHLCLSpecificationLanguage.g:234:3: ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+ {...}?) )
            // InternalHLCLSpecificationLanguage.g:235:4: ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModifierAccess().getUnorderedGroup());
            			
            // InternalHLCLSpecificationLanguage.g:238:4: ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+ {...}?)
            // InternalHLCLSpecificationLanguage.g:239:5: ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+ {...}?
            {
            // InternalHLCLSpecificationLanguage.g:239:5: ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 >= 29 && LA3_0 <= 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:240:3: ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:240:3: ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) )
            	    // InternalHLCLSpecificationLanguage.g:241:4: {...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalHLCLSpecificationLanguage.g:241:102: ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) )
            	    // InternalHLCLSpecificationLanguage.g:242:5: ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalHLCLSpecificationLanguage.g:245:8: ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) )
            	    // InternalHLCLSpecificationLanguage.g:245:9: {...}? => ( (lv_instantiable_1_0= 'instantiable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "true");
            	    }
            	    // InternalHLCLSpecificationLanguage.g:245:18: ( (lv_instantiable_1_0= 'instantiable' ) )
            	    // InternalHLCLSpecificationLanguage.g:245:19: (lv_instantiable_1_0= 'instantiable' )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:245:19: (lv_instantiable_1_0= 'instantiable' )
            	    // InternalHLCLSpecificationLanguage.g:246:9: lv_instantiable_1_0= 'instantiable'
            	    {
            	    lv_instantiable_1_0=(Token)match(input,15,FOLLOW_10); 

            	    									newLeafNode(lv_instantiable_1_0, grammarAccess.getModifierAccess().getInstantiableInstantiableKeyword_0_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getModifierRule());
            	    									}
            	    									setWithLastConsumed(current, "instantiable", true, "instantiable");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHLCLSpecificationLanguage.g:263:3: ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:263:3: ({...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) ) )
            	    // InternalHLCLSpecificationLanguage.g:264:4: {...}? => ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalHLCLSpecificationLanguage.g:264:102: ( ({...}? => ( (lv_type_2_0= ruleVarType ) ) ) )
            	    // InternalHLCLSpecificationLanguage.g:265:5: ({...}? => ( (lv_type_2_0= ruleVarType ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalHLCLSpecificationLanguage.g:268:8: ({...}? => ( (lv_type_2_0= ruleVarType ) ) )
            	    // InternalHLCLSpecificationLanguage.g:268:9: {...}? => ( (lv_type_2_0= ruleVarType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "true");
            	    }
            	    // InternalHLCLSpecificationLanguage.g:268:18: ( (lv_type_2_0= ruleVarType ) )
            	    // InternalHLCLSpecificationLanguage.g:268:19: (lv_type_2_0= ruleVarType )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:268:19: (lv_type_2_0= ruleVarType )
            	    // InternalHLCLSpecificationLanguage.g:269:9: lv_type_2_0= ruleVarType
            	    {

            	    									newCompositeNode(grammarAccess.getModifierAccess().getTypeVarTypeParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_10);
            	    lv_type_2_0=ruleVarType();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModifierRule());
            	    									}
            	    									set(
            	    										current,
            	    										"type",
            	    										lv_type_2_0,
            	    										"org.xtext.HLCLSpecificationLanguage.VarType");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModifierAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleModifier", "getUnorderedGroupHelper().canLeave(grammarAccess.getModifierAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getModifierAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleVariantDeclaration"
    // InternalHLCLSpecificationLanguage.g:302:1: entryRuleVariantDeclaration returns [EObject current=null] : iv_ruleVariantDeclaration= ruleVariantDeclaration EOF ;
    public final EObject entryRuleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantDeclaration = null;


        try {
            // InternalHLCLSpecificationLanguage.g:302:59: (iv_ruleVariantDeclaration= ruleVariantDeclaration EOF )
            // InternalHLCLSpecificationLanguage.g:303:2: iv_ruleVariantDeclaration= ruleVariantDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariantDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariantDeclaration=ruleVariantDeclaration();

            state._fsp--;

             current =iv_ruleVariantDeclaration; 
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
    // $ANTLR end "entryRuleVariantDeclaration"


    // $ANTLR start "ruleVariantDeclaration"
    // InternalHLCLSpecificationLanguage.g:309:1: ruleVariantDeclaration returns [EObject current=null] : (this_variantsInterval_0= rulevariantsInterval | this_variantsEnumeration_1= rulevariantsEnumeration ) ;
    public final EObject ruleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_variantsInterval_0 = null;

        EObject this_variantsEnumeration_1 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:315:2: ( (this_variantsInterval_0= rulevariantsInterval | this_variantsEnumeration_1= rulevariantsEnumeration ) )
            // InternalHLCLSpecificationLanguage.g:316:2: (this_variantsInterval_0= rulevariantsInterval | this_variantsEnumeration_1= rulevariantsEnumeration )
            {
            // InternalHLCLSpecificationLanguage.g:316:2: (this_variantsInterval_0= rulevariantsInterval | this_variantsEnumeration_1= rulevariantsEnumeration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||(LA4_0>=27 && LA4_0<=28)) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:317:3: this_variantsInterval_0= rulevariantsInterval
                    {

                    			newCompositeNode(grammarAccess.getVariantDeclarationAccess().getVariantsIntervalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_variantsInterval_0=rulevariantsInterval();

                    state._fsp--;


                    			current = this_variantsInterval_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:326:3: this_variantsEnumeration_1= rulevariantsEnumeration
                    {

                    			newCompositeNode(grammarAccess.getVariantDeclarationAccess().getVariantsEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_variantsEnumeration_1=rulevariantsEnumeration();

                    state._fsp--;


                    			current = this_variantsEnumeration_1;
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
    // $ANTLR end "ruleVariantDeclaration"


    // $ANTLR start "entryRulevariantsInterval"
    // InternalHLCLSpecificationLanguage.g:338:1: entryRulevariantsInterval returns [EObject current=null] : iv_rulevariantsInterval= rulevariantsInterval EOF ;
    public final EObject entryRulevariantsInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariantsInterval = null;


        try {
            // InternalHLCLSpecificationLanguage.g:338:57: (iv_rulevariantsInterval= rulevariantsInterval EOF )
            // InternalHLCLSpecificationLanguage.g:339:2: iv_rulevariantsInterval= rulevariantsInterval EOF
            {
             newCompositeNode(grammarAccess.getVariantsIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariantsInterval=rulevariantsInterval();

            state._fsp--;

             current =iv_rulevariantsInterval; 
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
    // $ANTLR end "entryRulevariantsInterval"


    // $ANTLR start "rulevariantsInterval"
    // InternalHLCLSpecificationLanguage.g:345:1: rulevariantsInterval returns [EObject current=null] : ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) ) ) ;
    public final EObject rulevariantsInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_end_3_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:351:2: ( ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) ) ) )
            // InternalHLCLSpecificationLanguage.g:352:2: ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:352:2: ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) ) )
            // InternalHLCLSpecificationLanguage.g:353:3: () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) )
            {
            // InternalHLCLSpecificationLanguage.g:353:3: ()
            // InternalHLCLSpecificationLanguage.g:354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0(),
            					current);
            			

            }

            // InternalHLCLSpecificationLanguage.g:360:3: ( (lv_start_1_0= ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:361:4: (lv_start_1_0= ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:361:4: (lv_start_1_0= ruleValue )
            // InternalHLCLSpecificationLanguage.g:362:5: lv_start_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getVariantsIntervalAccess().getStartValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_start_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantsIntervalRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.xtext.HLCLSpecificationLanguage.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantsIntervalAccess().getColonColonKeyword_2());
            		
            // InternalHLCLSpecificationLanguage.g:383:3: ( (lv_end_3_0= ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:384:4: (lv_end_3_0= ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:384:4: (lv_end_3_0= ruleValue )
            // InternalHLCLSpecificationLanguage.g:385:5: lv_end_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getVariantsIntervalAccess().getEndValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantsIntervalRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_3_0,
            						"org.xtext.HLCLSpecificationLanguage.Value");
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
    // $ANTLR end "rulevariantsInterval"


    // $ANTLR start "entryRulevariantsEnumeration"
    // InternalHLCLSpecificationLanguage.g:406:1: entryRulevariantsEnumeration returns [EObject current=null] : iv_rulevariantsEnumeration= rulevariantsEnumeration EOF ;
    public final EObject entryRulevariantsEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariantsEnumeration = null;


        try {
            // InternalHLCLSpecificationLanguage.g:406:60: (iv_rulevariantsEnumeration= rulevariantsEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:407:2: iv_rulevariantsEnumeration= rulevariantsEnumeration EOF
            {
             newCompositeNode(grammarAccess.getVariantsEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariantsEnumeration=rulevariantsEnumeration();

            state._fsp--;

             current =iv_rulevariantsEnumeration; 
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
    // $ANTLR end "entryRulevariantsEnumeration"


    // $ANTLR start "rulevariantsEnumeration"
    // InternalHLCLSpecificationLanguage.g:413:1: rulevariantsEnumeration returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']' ) ;
    public final EObject rulevariantsEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:419:2: ( ( () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']' ) )
            // InternalHLCLSpecificationLanguage.g:420:2: ( () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']' )
            {
            // InternalHLCLSpecificationLanguage.g:420:2: ( () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']' )
            // InternalHLCLSpecificationLanguage.g:421:3: () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']'
            {
            // InternalHLCLSpecificationLanguage.g:421:3: ()
            // InternalHLCLSpecificationLanguage.g:422:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalHLCLSpecificationLanguage.g:432:3: ( (lv_list_2_0= ruleEnumeration ) )
            // InternalHLCLSpecificationLanguage.g:433:4: (lv_list_2_0= ruleEnumeration )
            {
            // InternalHLCLSpecificationLanguage.g:433:4: (lv_list_2_0= ruleEnumeration )
            // InternalHLCLSpecificationLanguage.g:434:5: lv_list_2_0= ruleEnumeration
            {

            					newCompositeNode(grammarAccess.getVariantsEnumerationAccess().getListEnumerationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_list_2_0=ruleEnumeration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantsEnumerationRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_2_0,
            						"org.xtext.HLCLSpecificationLanguage.Enumeration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "rulevariantsEnumeration"


    // $ANTLR start "entryRuleEnumeration"
    // InternalHLCLSpecificationLanguage.g:459:1: entryRuleEnumeration returns [String current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final String entryRuleEnumeration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumeration = null;


        try {
            // InternalHLCLSpecificationLanguage.g:459:51: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:460:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration.getText(); 
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
    // InternalHLCLSpecificationLanguage.g:466:1: ruleEnumeration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ListOfValues_0= ruleListOfValues | this_ListOfIDs_1= ruleListOfIDs ) ;
    public final AntlrDatatypeRuleToken ruleEnumeration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ListOfValues_0 = null;

        AntlrDatatypeRuleToken this_ListOfIDs_1 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:472:2: ( (this_ListOfValues_0= ruleListOfValues | this_ListOfIDs_1= ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:473:2: (this_ListOfValues_0= ruleListOfValues | this_ListOfIDs_1= ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:473:2: (this_ListOfValues_0= ruleListOfValues | this_ListOfIDs_1= ruleListOfIDs )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||(LA5_0>=27 && LA5_0<=28)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:474:3: this_ListOfValues_0= ruleListOfValues
                    {

                    			newCompositeNode(grammarAccess.getEnumerationAccess().getListOfValuesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListOfValues_0=ruleListOfValues();

                    state._fsp--;


                    			current.merge(this_ListOfValues_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:485:3: this_ListOfIDs_1= ruleListOfIDs
                    {

                    			newCompositeNode(grammarAccess.getEnumerationAccess().getListOfIDsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListOfIDs_1=ruleListOfIDs();

                    state._fsp--;


                    			current.merge(this_ListOfIDs_1);
                    		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleConstraint"
    // InternalHLCLSpecificationLanguage.g:499:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalHLCLSpecificationLanguage.g:499:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalHLCLSpecificationLanguage.g:500:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalHLCLSpecificationLanguage.g:506:1: ruleConstraint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:512:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) )
            // InternalHLCLSpecificationLanguage.g:513:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:513:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            // InternalHLCLSpecificationLanguage.g:514:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) )
            {
            // InternalHLCLSpecificationLanguage.g:514:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:515:4: (lv_name_0_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:515:4: (lv_name_0_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:516:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getColonKeyword_1());
            		
            // InternalHLCLSpecificationLanguage.g:536:3: ( (lv_exp_2_0= ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:537:4: (lv_exp_2_0= ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:537:4: (lv_exp_2_0= ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:538:5: lv_exp_2_0= ruleConsExpression
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getExpConsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleConsExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.xtext.HLCLSpecificationLanguage.ConsExpression");
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


    // $ANTLR start "entryRuleConsExpression"
    // InternalHLCLSpecificationLanguage.g:559:1: entryRuleConsExpression returns [EObject current=null] : iv_ruleConsExpression= ruleConsExpression EOF ;
    public final EObject entryRuleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsExpression = null;


        try {
            // InternalHLCLSpecificationLanguage.g:559:55: (iv_ruleConsExpression= ruleConsExpression EOF )
            // InternalHLCLSpecificationLanguage.g:560:2: iv_ruleConsExpression= ruleConsExpression EOF
            {
             newCompositeNode(grammarAccess.getConsExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsExpression=ruleConsExpression();

            state._fsp--;

             current =iv_ruleConsExpression; 
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
    // $ANTLR end "entryRuleConsExpression"


    // $ANTLR start "ruleConsExpression"
    // InternalHLCLSpecificationLanguage.g:566:1: ruleConsExpression returns [EObject current=null] : (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_SPLNotation_3= ruleSPLNotation ) ;
    public final EObject ruleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IDCons_0 = null;

        EObject this_Refinement_1 = null;

        EObject this_Rule_2 = null;

        EObject this_SPLNotation_3 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:572:2: ( (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_SPLNotation_3= ruleSPLNotation ) )
            // InternalHLCLSpecificationLanguage.g:573:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_SPLNotation_3= ruleSPLNotation )
            {
            // InternalHLCLSpecificationLanguage.g:573:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_SPLNotation_3= ruleSPLNotation )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 22:
                case 23:
                    {
                    alt6=2;
                    }
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    {
                    alt6=4;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 21:
                    {
                    alt6=1;
                    }
                    break;
                case 26:
                    {
                    alt6=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA6_0==20) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    int LA6_7 = input.LA(3);

                    if ( (LA6_7==25) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_7>=21 && LA6_7<=23)||LA6_7==26||(LA6_7>=31 && LA6_7<=34)) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 7, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_2==20) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:574:3: this_IDCons_0= ruleIDCons
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getIDConsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IDCons_0=ruleIDCons();

                    state._fsp--;


                    			current = this_IDCons_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:583:3: this_Refinement_1= ruleRefinement
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getRefinementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Refinement_1=ruleRefinement();

                    state._fsp--;


                    			current = this_Refinement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:592:3: this_Rule_2= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_2=ruleRule();

                    state._fsp--;


                    			current = this_Rule_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHLCLSpecificationLanguage.g:601:3: this_SPLNotation_3= ruleSPLNotation
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getSPLNotationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SPLNotation_3=ruleSPLNotation();

                    state._fsp--;


                    			current = this_SPLNotation_3;
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
    // $ANTLR end "ruleConsExpression"


    // $ANTLR start "entryRuleTerminalExp"
    // InternalHLCLSpecificationLanguage.g:613:1: entryRuleTerminalExp returns [EObject current=null] : iv_ruleTerminalExp= ruleTerminalExp EOF ;
    public final EObject entryRuleTerminalExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExp = null;


        try {
            // InternalHLCLSpecificationLanguage.g:613:52: (iv_ruleTerminalExp= ruleTerminalExp EOF )
            // InternalHLCLSpecificationLanguage.g:614:2: iv_ruleTerminalExp= ruleTerminalExp EOF
            {
             newCompositeNode(grammarAccess.getTerminalExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExp=ruleTerminalExp();

            state._fsp--;

             current =iv_ruleTerminalExp; 
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
    // $ANTLR end "entryRuleTerminalExp"


    // $ANTLR start "ruleTerminalExp"
    // InternalHLCLSpecificationLanguage.g:620:1: ruleTerminalExp returns [EObject current=null] : ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons ) ;
    public final EObject ruleTerminalExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConsExpression_1 = null;

        EObject this_IDCons_3 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:626:2: ( ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons ) )
            // InternalHLCLSpecificationLanguage.g:627:2: ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons )
            {
            // InternalHLCLSpecificationLanguage.g:627:2: ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:628:3: (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' )
                    {
                    // InternalHLCLSpecificationLanguage.g:628:3: (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' )
                    // InternalHLCLSpecificationLanguage.g:629:4: otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpAccess().getConsExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_ConsExpression_1=ruleConsExpression();

                    state._fsp--;


                    				current = this_ConsExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:647:3: this_IDCons_3= ruleIDCons
                    {

                    			newCompositeNode(grammarAccess.getTerminalExpAccess().getIDConsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IDCons_3=ruleIDCons();

                    state._fsp--;


                    			current = this_IDCons_3;
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
    // $ANTLR end "ruleTerminalExp"


    // $ANTLR start "entryRuleIDCons"
    // InternalHLCLSpecificationLanguage.g:659:1: entryRuleIDCons returns [EObject current=null] : iv_ruleIDCons= ruleIDCons EOF ;
    public final EObject entryRuleIDCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDCons = null;


        try {
            // InternalHLCLSpecificationLanguage.g:659:47: (iv_ruleIDCons= ruleIDCons EOF )
            // InternalHLCLSpecificationLanguage.g:660:2: iv_ruleIDCons= ruleIDCons EOF
            {
             newCompositeNode(grammarAccess.getIDConsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIDCons=ruleIDCons();

            state._fsp--;

             current =iv_ruleIDCons; 
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
    // $ANTLR end "entryRuleIDCons"


    // $ANTLR start "ruleIDCons"
    // InternalHLCLSpecificationLanguage.g:666:1: ruleIDCons returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleIDCons() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:672:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalHLCLSpecificationLanguage.g:673:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalHLCLSpecificationLanguage.g:673:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:674:3: (lv_name_0_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:674:3: (lv_name_0_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:675:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getIDConsAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIDConsRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleIDCons"


    // $ANTLR start "entryRuleRefinement"
    // InternalHLCLSpecificationLanguage.g:694:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // InternalHLCLSpecificationLanguage.g:694:51: (iv_ruleRefinement= ruleRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:695:2: iv_ruleRefinement= ruleRefinement EOF
            {
             newCompositeNode(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;

             current =iv_ruleRefinement; 
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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalHLCLSpecificationLanguage.g:701:1: ruleRefinement returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_VarRefinement_1 = null;

        EObject this_SetRefinement_2 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:707:2: ( (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement ) )
            // InternalHLCLSpecificationLanguage.g:708:2: (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement )
            {
            // InternalHLCLSpecificationLanguage.g:708:2: (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==23) ) {
                    alt8=2;
                }
                else if ( (LA8_1==22) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==20) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:709:3: this_Assignment_0= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getRefinementAccess().getAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:718:3: this_VarRefinement_1= ruleVarRefinement
                    {

                    			newCompositeNode(grammarAccess.getRefinementAccess().getVarRefinementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarRefinement_1=ruleVarRefinement();

                    state._fsp--;


                    			current = this_VarRefinement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:727:3: this_SetRefinement_2= ruleSetRefinement
                    {

                    			newCompositeNode(grammarAccess.getRefinementAccess().getSetRefinementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetRefinement_2=ruleSetRefinement();

                    state._fsp--;


                    			current = this_SetRefinement_2;
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
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleAssignment"
    // InternalHLCLSpecificationLanguage.g:739:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalHLCLSpecificationLanguage.g:739:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalHLCLSpecificationLanguage.g:740:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalHLCLSpecificationLanguage.g:746:1: ruleAssignment returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:752:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalHLCLSpecificationLanguage.g:753:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:753:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )
            // InternalHLCLSpecificationLanguage.g:754:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalHLCLSpecificationLanguage.g:754:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:755:4: (lv_var_0_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:755:4: (lv_var_0_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:756:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_var_0_0, grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getIsKeyword_1());
            		
            // InternalHLCLSpecificationLanguage.g:776:3: ( (lv_value_2_0= ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:777:4: (lv_value_2_0= ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:777:4: (lv_value_2_0= ruleValue )
            // InternalHLCLSpecificationLanguage.g:778:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.HLCLSpecificationLanguage.Value");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleVarRefinement"
    // InternalHLCLSpecificationLanguage.g:799:1: entryRuleVarRefinement returns [EObject current=null] : iv_ruleVarRefinement= ruleVarRefinement EOF ;
    public final EObject entryRuleVarRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefinement = null;


        try {
            // InternalHLCLSpecificationLanguage.g:799:54: (iv_ruleVarRefinement= ruleVarRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:800:2: iv_ruleVarRefinement= ruleVarRefinement EOF
            {
             newCompositeNode(grammarAccess.getVarRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarRefinement=ruleVarRefinement();

            state._fsp--;

             current =iv_ruleVarRefinement; 
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
    // $ANTLR end "entryRuleVarRefinement"


    // $ANTLR start "ruleVarRefinement"
    // InternalHLCLSpecificationLanguage.g:806:1: ruleVarRefinement returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_variants_2_0= ruleVariantDeclaration ) ) ) ;
    public final EObject ruleVarRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        EObject lv_variants_2_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:812:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_variants_2_0= ruleVariantDeclaration ) ) ) )
            // InternalHLCLSpecificationLanguage.g:813:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_variants_2_0= ruleVariantDeclaration ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:813:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_variants_2_0= ruleVariantDeclaration ) ) )
            // InternalHLCLSpecificationLanguage.g:814:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_variants_2_0= ruleVariantDeclaration ) )
            {
            // InternalHLCLSpecificationLanguage.g:814:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:815:4: (lv_var_0_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:815:4: (lv_var_0_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:816:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_var_0_0, grammarAccess.getVarRefinementAccess().getVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRefinementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVarRefinementAccess().getInKeyword_1());
            		
            // InternalHLCLSpecificationLanguage.g:836:3: ( (lv_variants_2_0= ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:837:4: (lv_variants_2_0= ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:837:4: (lv_variants_2_0= ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:838:5: lv_variants_2_0= ruleVariantDeclaration
            {

            					newCompositeNode(grammarAccess.getVarRefinementAccess().getVariantsVariantDeclarationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_variants_2_0=ruleVariantDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarRefinementRule());
            					}
            					set(
            						current,
            						"variants",
            						lv_variants_2_0,
            						"org.xtext.HLCLSpecificationLanguage.VariantDeclaration");
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
    // $ANTLR end "ruleVarRefinement"


    // $ANTLR start "entryRuleSetRefinement"
    // InternalHLCLSpecificationLanguage.g:859:1: entryRuleSetRefinement returns [EObject current=null] : iv_ruleSetRefinement= ruleSetRefinement EOF ;
    public final EObject entryRuleSetRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRefinement = null;


        try {
            // InternalHLCLSpecificationLanguage.g:859:54: (iv_ruleSetRefinement= ruleSetRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:860:2: iv_ruleSetRefinement= ruleSetRefinement EOF
            {
             newCompositeNode(grammarAccess.getSetRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetRefinement=ruleSetRefinement();

            state._fsp--;

             current =iv_ruleSetRefinement; 
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
    // $ANTLR end "entryRuleSetRefinement"


    // $ANTLR start "ruleSetRefinement"
    // InternalHLCLSpecificationLanguage.g:866:1: ruleSetRefinement returns [EObject current=null] : (otherlv_0= '(' ( (lv_vars_1_0= ruleListOfIDs ) ) otherlv_2= ')' otherlv_3= 'variants' otherlv_4= '[' otherlv_5= '(' ( (lv_head_6_0= ruleListOfValues ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_tail_10_0= ruleListOfValues ) ) otherlv_11= ')' )+ otherlv_12= ']' ) ;
    public final EObject ruleSetRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_vars_1_0 = null;

        AntlrDatatypeRuleToken lv_head_6_0 = null;

        AntlrDatatypeRuleToken lv_tail_10_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:872:2: ( (otherlv_0= '(' ( (lv_vars_1_0= ruleListOfIDs ) ) otherlv_2= ')' otherlv_3= 'variants' otherlv_4= '[' otherlv_5= '(' ( (lv_head_6_0= ruleListOfValues ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_tail_10_0= ruleListOfValues ) ) otherlv_11= ')' )+ otherlv_12= ']' ) )
            // InternalHLCLSpecificationLanguage.g:873:2: (otherlv_0= '(' ( (lv_vars_1_0= ruleListOfIDs ) ) otherlv_2= ')' otherlv_3= 'variants' otherlv_4= '[' otherlv_5= '(' ( (lv_head_6_0= ruleListOfValues ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_tail_10_0= ruleListOfValues ) ) otherlv_11= ')' )+ otherlv_12= ']' )
            {
            // InternalHLCLSpecificationLanguage.g:873:2: (otherlv_0= '(' ( (lv_vars_1_0= ruleListOfIDs ) ) otherlv_2= ')' otherlv_3= 'variants' otherlv_4= '[' otherlv_5= '(' ( (lv_head_6_0= ruleListOfValues ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_tail_10_0= ruleListOfValues ) ) otherlv_11= ')' )+ otherlv_12= ']' )
            // InternalHLCLSpecificationLanguage.g:874:3: otherlv_0= '(' ( (lv_vars_1_0= ruleListOfIDs ) ) otherlv_2= ')' otherlv_3= 'variants' otherlv_4= '[' otherlv_5= '(' ( (lv_head_6_0= ruleListOfValues ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_tail_10_0= ruleListOfValues ) ) otherlv_11= ')' )+ otherlv_12= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_0());
            		
            // InternalHLCLSpecificationLanguage.g:878:3: ( (lv_vars_1_0= ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:879:4: (lv_vars_1_0= ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:879:4: (lv_vars_1_0= ruleListOfIDs )
            // InternalHLCLSpecificationLanguage.g:880:5: lv_vars_1_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_vars_1_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRefinementRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_1_0,
            						"org.xtext.HLCLSpecificationLanguage.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getSetRefinementAccess().getVariantsKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_5());
            		
            // InternalHLCLSpecificationLanguage.g:913:3: ( (lv_head_6_0= ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:914:4: (lv_head_6_0= ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:914:4: (lv_head_6_0= ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:915:5: lv_head_6_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_head_6_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRefinementRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_6_0,
            						"org.xtext.HLCLSpecificationLanguage.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_7());
            		
            // InternalHLCLSpecificationLanguage.g:936:3: (otherlv_8= ',' otherlv_9= '(' ( (lv_tail_10_0= ruleListOfValues ) ) otherlv_11= ')' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:937:4: otherlv_8= ',' otherlv_9= '(' ( (lv_tail_10_0= ruleListOfValues ) ) otherlv_11= ')'
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_22); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSetRefinementAccess().getCommaKeyword_8_0());
            	    			
            	    otherlv_9=(Token)match(input,20,FOLLOW_12); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_8_1());
            	    			
            	    // InternalHLCLSpecificationLanguage.g:945:4: ( (lv_tail_10_0= ruleListOfValues ) )
            	    // InternalHLCLSpecificationLanguage.g:946:5: (lv_tail_10_0= ruleListOfValues )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:946:5: (lv_tail_10_0= ruleListOfValues )
            	    // InternalHLCLSpecificationLanguage.g:947:6: lv_tail_10_0= ruleListOfValues
            	    {

            	    						newCompositeNode(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_8_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_tail_10_0=ruleListOfValues();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSetRefinementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tail",
            	    							lv_tail_10_0,
            	    							"org.xtext.HLCLSpecificationLanguage.ListOfValues");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_11, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8_3());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSetRefinement"


    // $ANTLR start "entryRuleRule"
    // InternalHLCLSpecificationLanguage.g:977:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalHLCLSpecificationLanguage.g:977:45: (iv_ruleRule= ruleRule EOF )
            // InternalHLCLSpecificationLanguage.g:978:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalHLCLSpecificationLanguage.g:984:1: ruleRule returns [EObject current=null] : ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_consequence_2_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:990:2: ( ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) ) )
            // InternalHLCLSpecificationLanguage.g:991:2: ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:991:2: ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) )
            // InternalHLCLSpecificationLanguage.g:992:3: ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) )
            {
            // InternalHLCLSpecificationLanguage.g:992:3: ( (lv_condition_0_0= ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:993:4: (lv_condition_0_0= ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:993:4: (lv_condition_0_0= ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:994:5: lv_condition_0_0= ruleTerminalExp
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionTerminalExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_condition_0_0=ruleTerminalExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"org.xtext.HLCLSpecificationLanguage.TerminalExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalHLCLSpecificationLanguage.g:1015:3: ( (lv_consequence_2_0= ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:1016:4: (lv_consequence_2_0= ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:1016:4: (lv_consequence_2_0= ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:1017:5: lv_consequence_2_0= ruleTerminalExp
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConsequenceTerminalExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_consequence_2_0=ruleTerminalExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"consequence",
            						lv_consequence_2_0,
            						"org.xtext.HLCLSpecificationLanguage.TerminalExp");
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSPLNotation"
    // InternalHLCLSpecificationLanguage.g:1038:1: entryRuleSPLNotation returns [EObject current=null] : iv_ruleSPLNotation= ruleSPLNotation EOF ;
    public final EObject entryRuleSPLNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPLNotation = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1038:52: (iv_ruleSPLNotation= ruleSPLNotation EOF )
            // InternalHLCLSpecificationLanguage.g:1039:2: iv_ruleSPLNotation= ruleSPLNotation EOF
            {
             newCompositeNode(grammarAccess.getSPLNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPLNotation=ruleSPLNotation();

            state._fsp--;

             current =iv_ruleSPLNotation; 
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
    // $ANTLR end "entryRuleSPLNotation"


    // $ANTLR start "ruleSPLNotation"
    // InternalHLCLSpecificationLanguage.g:1045:1: ruleSPLNotation returns [EObject current=null] : ( ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleSPLop ) ) ( (lv_var2_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSPLNotation() throws RecognitionException {
        EObject current = null;

        Token lv_var1_0_0=null;
        Token lv_var2_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1051:2: ( ( ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleSPLop ) ) ( (lv_var2_2_0= RULE_ID ) ) ) )
            // InternalHLCLSpecificationLanguage.g:1052:2: ( ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleSPLop ) ) ( (lv_var2_2_0= RULE_ID ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:1052:2: ( ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleSPLop ) ) ( (lv_var2_2_0= RULE_ID ) ) )
            // InternalHLCLSpecificationLanguage.g:1053:3: ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleSPLop ) ) ( (lv_var2_2_0= RULE_ID ) )
            {
            // InternalHLCLSpecificationLanguage.g:1053:3: ( (lv_var1_0_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:1054:4: (lv_var1_0_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:1054:4: (lv_var1_0_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:1055:5: lv_var1_0_0= RULE_ID
            {
            lv_var1_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_var1_0_0, grammarAccess.getSPLNotationAccess().getVar1IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSPLNotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var1",
            						lv_var1_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalHLCLSpecificationLanguage.g:1071:3: ( (lv_op_1_0= ruleSPLop ) )
            // InternalHLCLSpecificationLanguage.g:1072:4: (lv_op_1_0= ruleSPLop )
            {
            // InternalHLCLSpecificationLanguage.g:1072:4: (lv_op_1_0= ruleSPLop )
            // InternalHLCLSpecificationLanguage.g:1073:5: lv_op_1_0= ruleSPLop
            {

            					newCompositeNode(grammarAccess.getSPLNotationAccess().getOpSPLopParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_op_1_0=ruleSPLop();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSPLNotationRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.HLCLSpecificationLanguage.SPLop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHLCLSpecificationLanguage.g:1090:3: ( (lv_var2_2_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:1091:4: (lv_var2_2_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:1091:4: (lv_var2_2_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:1092:5: lv_var2_2_0= RULE_ID
            {
            lv_var2_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var2_2_0, grammarAccess.getSPLNotationAccess().getVar2IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSPLNotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var2",
            						lv_var2_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleSPLNotation"


    // $ANTLR start "entryRuleValue"
    // InternalHLCLSpecificationLanguage.g:1112:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1112:45: (iv_ruleValue= ruleValue EOF )
            // InternalHLCLSpecificationLanguage.g:1113:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
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
    // InternalHLCLSpecificationLanguage.g:1119:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1125:2: ( (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' ) )
            // InternalHLCLSpecificationLanguage.g:1126:2: (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' )
            {
            // InternalHLCLSpecificationLanguage.g:1126:2: (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:1127:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:1135:3: kw= 'selected'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValueAccess().getSelectedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:1141:3: kw= 'unselected'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValueAccess().getUnselectedKeyword_2());
                    		

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


    // $ANTLR start "entryRuleVarType"
    // InternalHLCLSpecificationLanguage.g:1150:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1150:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalHLCLSpecificationLanguage.g:1151:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalHLCLSpecificationLanguage.g:1157:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'numeric' ) ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1163:2: ( (kw= 'boolean' | kw= 'numeric' ) )
            // InternalHLCLSpecificationLanguage.g:1164:2: (kw= 'boolean' | kw= 'numeric' )
            {
            // InternalHLCLSpecificationLanguage.g:1164:2: (kw= 'boolean' | kw= 'numeric' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:1165:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:1171:3: kw= 'numeric'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getNumericKeyword_1());
                    		

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


    // $ANTLR start "entryRuleListOfValues"
    // InternalHLCLSpecificationLanguage.g:1180:1: entryRuleListOfValues returns [String current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final String entryRuleListOfValues() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleListOfValues = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1180:52: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalHLCLSpecificationLanguage.g:1181:2: iv_ruleListOfValues= ruleListOfValues EOF
            {
             newCompositeNode(grammarAccess.getListOfValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfValues=ruleListOfValues();

            state._fsp--;

             current =iv_ruleListOfValues.getText(); 
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
    // InternalHLCLSpecificationLanguage.g:1187:1: ruleListOfValues returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Value_0= ruleValue (kw= ',' this_Value_2= ruleValue )+ ) ;
    public final AntlrDatatypeRuleToken ruleListOfValues() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Value_0 = null;

        AntlrDatatypeRuleToken this_Value_2 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1193:2: ( (this_Value_0= ruleValue (kw= ',' this_Value_2= ruleValue )+ ) )
            // InternalHLCLSpecificationLanguage.g:1194:2: (this_Value_0= ruleValue (kw= ',' this_Value_2= ruleValue )+ )
            {
            // InternalHLCLSpecificationLanguage.g:1194:2: (this_Value_0= ruleValue (kw= ',' this_Value_2= ruleValue )+ )
            // InternalHLCLSpecificationLanguage.g:1195:3: this_Value_0= ruleValue (kw= ',' this_Value_2= ruleValue )+
            {

            			newCompositeNode(grammarAccess.getListOfValuesAccess().getValueParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Value_0=ruleValue();

            state._fsp--;


            			current.merge(this_Value_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalHLCLSpecificationLanguage.g:1205:3: (kw= ',' this_Value_2= ruleValue )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1206:4: kw= ',' this_Value_2= ruleValue
            	    {
            	    kw=(Token)match(input,25,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getListOfValuesAccess().getValueParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_27);
            	    this_Value_2=ruleValue();

            	    state._fsp--;


            	    				current.merge(this_Value_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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


    // $ANTLR start "entryRuleListOfIDs"
    // InternalHLCLSpecificationLanguage.g:1226:1: entryRuleListOfIDs returns [String current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final String entryRuleListOfIDs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleListOfIDs = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1226:49: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalHLCLSpecificationLanguage.g:1227:2: iv_ruleListOfIDs= ruleListOfIDs EOF
            {
             newCompositeNode(grammarAccess.getListOfIDsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfIDs=ruleListOfIDs();

            state._fsp--;

             current =iv_ruleListOfIDs.getText(); 
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
    // InternalHLCLSpecificationLanguage.g:1233:1: ruleListOfIDs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleListOfIDs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1239:2: ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )+ ) )
            // InternalHLCLSpecificationLanguage.g:1240:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )+ )
            {
            // InternalHLCLSpecificationLanguage.g:1240:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )+ )
            // InternalHLCLSpecificationLanguage.g:1241:3: this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getListOfIDsAccess().getIDTerminalRuleCall_0());
            		
            // InternalHLCLSpecificationLanguage.g:1248:3: (kw= ',' this_ID_2= RULE_ID )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1249:4: kw= ',' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getListOfIDsAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // $ANTLR end "ruleListOfIDs"


    // $ANTLR start "entryRuleSPLop"
    // InternalHLCLSpecificationLanguage.g:1266:1: entryRuleSPLop returns [String current=null] : iv_ruleSPLop= ruleSPLop EOF ;
    public final String entryRuleSPLop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPLop = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1266:45: (iv_ruleSPLop= ruleSPLop EOF )
            // InternalHLCLSpecificationLanguage.g:1267:2: iv_ruleSPLop= ruleSPLop EOF
            {
             newCompositeNode(grammarAccess.getSPLopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPLop=ruleSPLop();

            state._fsp--;

             current =iv_ruleSPLop.getText(); 
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
    // $ANTLR end "entryRuleSPLop"


    // $ANTLR start "ruleSPLop"
    // InternalHLCLSpecificationLanguage.g:1273:1: ruleSPLop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'optional' | kw= 'mandatory' | kw= 'requires' | kw= 'excludes' ) ;
    public final AntlrDatatypeRuleToken ruleSPLop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1279:2: ( (kw= 'optional' | kw= 'mandatory' | kw= 'requires' | kw= 'excludes' ) )
            // InternalHLCLSpecificationLanguage.g:1280:2: (kw= 'optional' | kw= 'mandatory' | kw= 'requires' | kw= 'excludes' )
            {
            // InternalHLCLSpecificationLanguage.g:1280:2: (kw= 'optional' | kw= 'mandatory' | kw= 'requires' | kw= 'excludes' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            case 34:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:1281:3: kw= 'optional'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSPLopAccess().getOptionalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:1287:3: kw= 'mandatory'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSPLopAccess().getMandatoryKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:1293:3: kw= 'requires'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSPLopAccess().getRequiresKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHLCLSpecificationLanguage.g:1299:3: kw= 'excludes'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSPLopAccess().getExcludesKeyword_3());
                    		

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
    // $ANTLR end "ruleSPLop"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000060008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000006000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000018020020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000060008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000018000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000002L});

}
