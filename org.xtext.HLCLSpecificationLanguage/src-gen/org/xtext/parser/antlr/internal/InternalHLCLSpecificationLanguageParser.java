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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'variables:'", "'constraints:'", "'instantiable'", "'variants:'", "'::'", "'['", "']'", "':'", "'('", "')'", "'is'", "'in'", "'variants'", "','", "'-->'", "'parent:'", "'group:'", "'card:'", "'selected'", "'unselected'", "'boolean'", "'numeric'", "'requires'", "'excludes'", "'optional'", "'mandatory'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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

                if ( (LA1_0==14||(LA1_0>=32 && LA1_0<=33)) ) {
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
    // InternalHLCLSpecificationLanguage.g:158:1: ruleVarDeclaration returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_instantiable_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_variants_5_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:164:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalHLCLSpecificationLanguage.g:165:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalHLCLSpecificationLanguage.g:165:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+ {...}?) ) )
            // InternalHLCLSpecificationLanguage.g:166:3: ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalHLCLSpecificationLanguage.g:166:3: ( ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+ {...}?) )
            // InternalHLCLSpecificationLanguage.g:167:4: ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
            			
            // InternalHLCLSpecificationLanguage.g:170:4: ( ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+ {...}?)
            // InternalHLCLSpecificationLanguage.g:171:5: ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+ {...}?
            {
            // InternalHLCLSpecificationLanguage.g:171:5: ( ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA3_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {
                        alt3=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA3_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA3_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
                        alt3=2;
                    }


                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:172:3: ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:172:3: ({...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) ) )
            	    // InternalHLCLSpecificationLanguage.g:173:4: {...}? => ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVarDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalHLCLSpecificationLanguage.g:173:108: ( ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) ) )
            	    // InternalHLCLSpecificationLanguage.g:174:5: ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalHLCLSpecificationLanguage.g:177:8: ({...}? => ( (lv_instantiable_1_0= 'instantiable' ) ) )
            	    // InternalHLCLSpecificationLanguage.g:177:9: {...}? => ( (lv_instantiable_1_0= 'instantiable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVarDeclaration", "true");
            	    }
            	    // InternalHLCLSpecificationLanguage.g:177:18: ( (lv_instantiable_1_0= 'instantiable' ) )
            	    // InternalHLCLSpecificationLanguage.g:177:19: (lv_instantiable_1_0= 'instantiable' )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:177:19: (lv_instantiable_1_0= 'instantiable' )
            	    // InternalHLCLSpecificationLanguage.g:178:9: lv_instantiable_1_0= 'instantiable'
            	    {
            	    lv_instantiable_1_0=(Token)match(input,14,FOLLOW_8); 

            	    									newLeafNode(lv_instantiable_1_0, grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getVarDeclarationRule());
            	    									}
            	    									setWithLastConsumed(current, "instantiable", true, "instantiable");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHLCLSpecificationLanguage.g:195:3: ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:195:3: ({...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) ) )
            	    // InternalHLCLSpecificationLanguage.g:196:4: {...}? => ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVarDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalHLCLSpecificationLanguage.g:196:108: ( ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) ) )
            	    // InternalHLCLSpecificationLanguage.g:197:5: ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalHLCLSpecificationLanguage.g:200:8: ({...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) ) )
            	    // InternalHLCLSpecificationLanguage.g:200:9: {...}? => ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVarDeclaration", "true");
            	    }
            	    // InternalHLCLSpecificationLanguage.g:200:18: ( ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) ) )
            	    // InternalHLCLSpecificationLanguage.g:200:19: ( (lv_type_2_0= ruleVarType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'variants:' ( (lv_variants_5_0= ruleVariantDeclaration ) )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:200:19: ( (lv_type_2_0= ruleVarType ) )
            	    // InternalHLCLSpecificationLanguage.g:201:9: (lv_type_2_0= ruleVarType )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:201:9: (lv_type_2_0= ruleVarType )
            	    // InternalHLCLSpecificationLanguage.g:202:10: lv_type_2_0= ruleVarType
            	    {

            	    										newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_type_2_0=ruleVarType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_2_0,
            	    											"org.xtext.HLCLSpecificationLanguage.VarType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalHLCLSpecificationLanguage.g:219:8: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalHLCLSpecificationLanguage.g:220:9: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:220:9: (lv_name_3_0= RULE_ID )
            	    // InternalHLCLSpecificationLanguage.g:221:10: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    										newLeafNode(lv_name_3_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getVarDeclarationRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_3_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    otherlv_4=(Token)match(input,15,FOLLOW_10); 

            	    								newLeafNode(otherlv_4, grammarAccess.getVarDeclarationAccess().getVariantsKeyword_1_2());
            	    							
            	    // InternalHLCLSpecificationLanguage.g:241:8: ( (lv_variants_5_0= ruleVariantDeclaration ) )
            	    // InternalHLCLSpecificationLanguage.g:242:9: (lv_variants_5_0= ruleVariantDeclaration )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:242:9: (lv_variants_5_0= ruleVariantDeclaration )
            	    // InternalHLCLSpecificationLanguage.g:243:10: lv_variants_5_0= ruleVariantDeclaration
            	    {

            	    										newCompositeNode(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_1_3_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_variants_5_0=ruleVariantDeclaration();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"variants",
            	    											lv_variants_5_0,
            	    											"org.xtext.HLCLSpecificationLanguage.VariantDeclaration");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
            	    				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleVarDeclaration", "getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
            			

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


    // $ANTLR start "entryRuleVariantDeclaration"
    // InternalHLCLSpecificationLanguage.g:277:1: entryRuleVariantDeclaration returns [EObject current=null] : iv_ruleVariantDeclaration= ruleVariantDeclaration EOF ;
    public final EObject entryRuleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantDeclaration = null;


        try {
            // InternalHLCLSpecificationLanguage.g:277:59: (iv_ruleVariantDeclaration= ruleVariantDeclaration EOF )
            // InternalHLCLSpecificationLanguage.g:278:2: iv_ruleVariantDeclaration= ruleVariantDeclaration EOF
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
    // InternalHLCLSpecificationLanguage.g:284:1: ruleVariantDeclaration returns [EObject current=null] : (this_variantsInterval_0= rulevariantsInterval | this_variantsEnumeration_1= rulevariantsEnumeration ) ;
    public final EObject ruleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_variantsInterval_0 = null;

        EObject this_variantsEnumeration_1 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:290:2: ( (this_variantsInterval_0= rulevariantsInterval | this_variantsEnumeration_1= rulevariantsEnumeration ) )
            // InternalHLCLSpecificationLanguage.g:291:2: (this_variantsInterval_0= rulevariantsInterval | this_variantsEnumeration_1= rulevariantsEnumeration )
            {
            // InternalHLCLSpecificationLanguage.g:291:2: (this_variantsInterval_0= rulevariantsInterval | this_variantsEnumeration_1= rulevariantsEnumeration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||(LA4_0>=30 && LA4_0<=31)) ) {
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
                    // InternalHLCLSpecificationLanguage.g:292:3: this_variantsInterval_0= rulevariantsInterval
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
                    // InternalHLCLSpecificationLanguage.g:301:3: this_variantsEnumeration_1= rulevariantsEnumeration
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
    // InternalHLCLSpecificationLanguage.g:313:1: entryRulevariantsInterval returns [EObject current=null] : iv_rulevariantsInterval= rulevariantsInterval EOF ;
    public final EObject entryRulevariantsInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariantsInterval = null;


        try {
            // InternalHLCLSpecificationLanguage.g:313:57: (iv_rulevariantsInterval= rulevariantsInterval EOF )
            // InternalHLCLSpecificationLanguage.g:314:2: iv_rulevariantsInterval= rulevariantsInterval EOF
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
    // InternalHLCLSpecificationLanguage.g:320:1: rulevariantsInterval returns [EObject current=null] : ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) ) ) ;
    public final EObject rulevariantsInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_end_3_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:326:2: ( ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) ) ) )
            // InternalHLCLSpecificationLanguage.g:327:2: ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:327:2: ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) ) )
            // InternalHLCLSpecificationLanguage.g:328:3: () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '::' ( (lv_end_3_0= ruleValue ) )
            {
            // InternalHLCLSpecificationLanguage.g:328:3: ()
            // InternalHLCLSpecificationLanguage.g:329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0(),
            					current);
            			

            }

            // InternalHLCLSpecificationLanguage.g:335:3: ( (lv_start_1_0= ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:336:4: (lv_start_1_0= ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:336:4: (lv_start_1_0= ruleValue )
            // InternalHLCLSpecificationLanguage.g:337:5: lv_start_1_0= ruleValue
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
            		
            // InternalHLCLSpecificationLanguage.g:358:3: ( (lv_end_3_0= ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:359:4: (lv_end_3_0= ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:359:4: (lv_end_3_0= ruleValue )
            // InternalHLCLSpecificationLanguage.g:360:5: lv_end_3_0= ruleValue
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
    // InternalHLCLSpecificationLanguage.g:381:1: entryRulevariantsEnumeration returns [EObject current=null] : iv_rulevariantsEnumeration= rulevariantsEnumeration EOF ;
    public final EObject entryRulevariantsEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariantsEnumeration = null;


        try {
            // InternalHLCLSpecificationLanguage.g:381:60: (iv_rulevariantsEnumeration= rulevariantsEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:382:2: iv_rulevariantsEnumeration= rulevariantsEnumeration EOF
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
    // InternalHLCLSpecificationLanguage.g:388:1: rulevariantsEnumeration returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']' ) ;
    public final EObject rulevariantsEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:394:2: ( ( () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']' ) )
            // InternalHLCLSpecificationLanguage.g:395:2: ( () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']' )
            {
            // InternalHLCLSpecificationLanguage.g:395:2: ( () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']' )
            // InternalHLCLSpecificationLanguage.g:396:3: () otherlv_1= '[' ( (lv_list_2_0= ruleEnumeration ) ) otherlv_3= ']'
            {
            // InternalHLCLSpecificationLanguage.g:396:3: ()
            // InternalHLCLSpecificationLanguage.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalHLCLSpecificationLanguage.g:407:3: ( (lv_list_2_0= ruleEnumeration ) )
            // InternalHLCLSpecificationLanguage.g:408:4: (lv_list_2_0= ruleEnumeration )
            {
            // InternalHLCLSpecificationLanguage.g:408:4: (lv_list_2_0= ruleEnumeration )
            // InternalHLCLSpecificationLanguage.g:409:5: lv_list_2_0= ruleEnumeration
            {

            					newCompositeNode(grammarAccess.getVariantsEnumerationAccess().getListEnumerationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_list_2_0=ruleEnumeration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantsEnumerationRule());
            					}
            					set(
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
    // InternalHLCLSpecificationLanguage.g:434:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalHLCLSpecificationLanguage.g:434:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:435:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalHLCLSpecificationLanguage.g:441:1: ruleEnumeration returns [EObject current=null] : ( ( (lv_values_0_0= ruleListOfValues ) ) | this_ListOfIDs_1= ruleListOfIDs ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject lv_values_0_0 = null;

        EObject this_ListOfIDs_1 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:447:2: ( ( ( (lv_values_0_0= ruleListOfValues ) ) | this_ListOfIDs_1= ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:448:2: ( ( (lv_values_0_0= ruleListOfValues ) ) | this_ListOfIDs_1= ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:448:2: ( ( (lv_values_0_0= ruleListOfValues ) ) | this_ListOfIDs_1= ruleListOfIDs )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||(LA5_0>=30 && LA5_0<=31)) ) {
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
                    // InternalHLCLSpecificationLanguage.g:449:3: ( (lv_values_0_0= ruleListOfValues ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:449:3: ( (lv_values_0_0= ruleListOfValues ) )
                    // InternalHLCLSpecificationLanguage.g:450:4: (lv_values_0_0= ruleListOfValues )
                    {
                    // InternalHLCLSpecificationLanguage.g:450:4: (lv_values_0_0= ruleListOfValues )
                    // InternalHLCLSpecificationLanguage.g:451:5: lv_values_0_0= ruleListOfValues
                    {

                    					newCompositeNode(grammarAccess.getEnumerationAccess().getValuesListOfValuesParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_values_0_0=ruleListOfValues();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    					}
                    					set(
                    						current,
                    						"values",
                    						lv_values_0_0,
                    						"org.xtext.HLCLSpecificationLanguage.ListOfValues");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:469:3: this_ListOfIDs_1= ruleListOfIDs
                    {

                    			newCompositeNode(grammarAccess.getEnumerationAccess().getListOfIDsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListOfIDs_1=ruleListOfIDs();

                    state._fsp--;


                    			current = this_ListOfIDs_1;
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
    // InternalHLCLSpecificationLanguage.g:481:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalHLCLSpecificationLanguage.g:481:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalHLCLSpecificationLanguage.g:482:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalHLCLSpecificationLanguage.g:488:1: ruleConstraint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:494:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) )
            // InternalHLCLSpecificationLanguage.g:495:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:495:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            // InternalHLCLSpecificationLanguage.g:496:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) )
            {
            // InternalHLCLSpecificationLanguage.g:496:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:497:4: (lv_name_0_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:497:4: (lv_name_0_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:498:5: lv_name_0_0= RULE_ID
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
            		
            // InternalHLCLSpecificationLanguage.g:518:3: ( (lv_exp_2_0= ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:519:4: (lv_exp_2_0= ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:519:4: (lv_exp_2_0= ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:520:5: lv_exp_2_0= ruleConsExpression
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
    // InternalHLCLSpecificationLanguage.g:541:1: entryRuleConsExpression returns [EObject current=null] : iv_ruleConsExpression= ruleConsExpression EOF ;
    public final EObject entryRuleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsExpression = null;


        try {
            // InternalHLCLSpecificationLanguage.g:541:55: (iv_ruleConsExpression= ruleConsExpression EOF )
            // InternalHLCLSpecificationLanguage.g:542:2: iv_ruleConsExpression= ruleConsExpression EOF
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
    // InternalHLCLSpecificationLanguage.g:548:1: ruleConsExpression returns [EObject current=null] : (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_FodaNary_4= ruleFodaNary | this_FodaUN_5= ruleFodaUN ) ;
    public final EObject ruleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IDCons_0 = null;

        EObject this_Refinement_1 = null;

        EObject this_Rule_2 = null;

        EObject this_FodaBin_3 = null;

        EObject this_FodaNary_4 = null;

        EObject this_FodaUN_5 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:554:2: ( (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_FodaNary_4= ruleFodaNary | this_FodaUN_5= ruleFodaUN ) )
            // InternalHLCLSpecificationLanguage.g:555:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_FodaNary_4= ruleFodaNary | this_FodaUN_5= ruleFodaUN )
            {
            // InternalHLCLSpecificationLanguage.g:555:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_FodaNary_4= ruleFodaNary | this_FodaUN_5= ruleFodaUN )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:556:3: this_IDCons_0= ruleIDCons
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
                    // InternalHLCLSpecificationLanguage.g:565:3: this_Refinement_1= ruleRefinement
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
                    // InternalHLCLSpecificationLanguage.g:574:3: this_Rule_2= ruleRule
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
                    // InternalHLCLSpecificationLanguage.g:583:3: this_FodaBin_3= ruleFodaBin
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getFodaBinParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FodaBin_3=ruleFodaBin();

                    state._fsp--;


                    			current = this_FodaBin_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalHLCLSpecificationLanguage.g:592:3: this_FodaNary_4= ruleFodaNary
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getFodaNaryParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FodaNary_4=ruleFodaNary();

                    state._fsp--;


                    			current = this_FodaNary_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalHLCLSpecificationLanguage.g:601:3: this_FodaUN_5= ruleFodaUN
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getFodaUNParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FodaUN_5=ruleFodaUN();

                    state._fsp--;


                    			current = this_FodaUN_5;
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

                if ( (LA8_1==22) ) {
                    alt8=1;
                }
                else if ( (LA8_1==23) ) {
                    alt8=2;
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

            otherlv_1=(Token)match(input,23,FOLLOW_10); 

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
        EObject lv_vars_1_0 = null;

        EObject lv_head_6_0 = null;

        EObject lv_tail_10_0 = null;



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

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

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


    // $ANTLR start "entryRuleFodaUN"
    // InternalHLCLSpecificationLanguage.g:1038:1: entryRuleFodaUN returns [EObject current=null] : iv_ruleFodaUN= ruleFodaUN EOF ;
    public final EObject entryRuleFodaUN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFodaUN = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1038:47: (iv_ruleFodaUN= ruleFodaUN EOF )
            // InternalHLCLSpecificationLanguage.g:1039:2: iv_ruleFodaUN= ruleFodaUN EOF
            {
             newCompositeNode(grammarAccess.getFodaUNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFodaUN=ruleFodaUN();

            state._fsp--;

             current =iv_ruleFodaUN; 
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
    // $ANTLR end "entryRuleFodaUN"


    // $ANTLR start "ruleFodaUN"
    // InternalHLCLSpecificationLanguage.g:1045:1: ruleFodaUN returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) ) ;
    public final EObject ruleFodaUN() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1051:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) ) )
            // InternalHLCLSpecificationLanguage.g:1052:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:1052:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) )
            // InternalHLCLSpecificationLanguage.g:1053:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) )
            {
            // InternalHLCLSpecificationLanguage.g:1053:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:1054:4: (lv_var_0_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:1054:4: (lv_var_0_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:1055:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_var_0_0, grammarAccess.getFodaUNAccess().getVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaUNRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFodaUNAccess().getIsKeyword_1());
            		
            // InternalHLCLSpecificationLanguage.g:1075:3: ( (lv_op_2_0= ruleUnaryOp ) )
            // InternalHLCLSpecificationLanguage.g:1076:4: (lv_op_2_0= ruleUnaryOp )
            {
            // InternalHLCLSpecificationLanguage.g:1076:4: (lv_op_2_0= ruleUnaryOp )
            // InternalHLCLSpecificationLanguage.g:1077:5: lv_op_2_0= ruleUnaryOp
            {

            					newCompositeNode(grammarAccess.getFodaUNAccess().getOpUnaryOpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_op_2_0=ruleUnaryOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFodaUNRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"org.xtext.HLCLSpecificationLanguage.UnaryOp");
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
    // $ANTLR end "ruleFodaUN"


    // $ANTLR start "entryRuleFodaBin"
    // InternalHLCLSpecificationLanguage.g:1098:1: entryRuleFodaBin returns [EObject current=null] : iv_ruleFodaBin= ruleFodaBin EOF ;
    public final EObject entryRuleFodaBin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFodaBin = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1098:48: (iv_ruleFodaBin= ruleFodaBin EOF )
            // InternalHLCLSpecificationLanguage.g:1099:2: iv_ruleFodaBin= ruleFodaBin EOF
            {
             newCompositeNode(grammarAccess.getFodaBinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFodaBin=ruleFodaBin();

            state._fsp--;

             current =iv_ruleFodaBin; 
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
    // $ANTLR end "entryRuleFodaBin"


    // $ANTLR start "ruleFodaBin"
    // InternalHLCLSpecificationLanguage.g:1105:1: ruleFodaBin returns [EObject current=null] : ( ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (lv_var2_2_0= RULE_ID ) ) ) ;
    public final EObject ruleFodaBin() throws RecognitionException {
        EObject current = null;

        Token lv_var1_0_0=null;
        Token lv_var2_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1111:2: ( ( ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (lv_var2_2_0= RULE_ID ) ) ) )
            // InternalHLCLSpecificationLanguage.g:1112:2: ( ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (lv_var2_2_0= RULE_ID ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:1112:2: ( ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (lv_var2_2_0= RULE_ID ) ) )
            // InternalHLCLSpecificationLanguage.g:1113:3: ( (lv_var1_0_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (lv_var2_2_0= RULE_ID ) )
            {
            // InternalHLCLSpecificationLanguage.g:1113:3: ( (lv_var1_0_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:1114:4: (lv_var1_0_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:1114:4: (lv_var1_0_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:1115:5: lv_var1_0_0= RULE_ID
            {
            lv_var1_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_var1_0_0, grammarAccess.getFodaBinAccess().getVar1IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaBinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var1",
            						lv_var1_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalHLCLSpecificationLanguage.g:1131:3: ( (lv_op_1_0= ruleBinOp ) )
            // InternalHLCLSpecificationLanguage.g:1132:4: (lv_op_1_0= ruleBinOp )
            {
            // InternalHLCLSpecificationLanguage.g:1132:4: (lv_op_1_0= ruleBinOp )
            // InternalHLCLSpecificationLanguage.g:1133:5: lv_op_1_0= ruleBinOp
            {

            					newCompositeNode(grammarAccess.getFodaBinAccess().getOpBinOpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_op_1_0=ruleBinOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFodaBinRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.HLCLSpecificationLanguage.BinOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHLCLSpecificationLanguage.g:1150:3: ( (lv_var2_2_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:1151:4: (lv_var2_2_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:1151:4: (lv_var2_2_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:1152:5: lv_var2_2_0= RULE_ID
            {
            lv_var2_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var2_2_0, grammarAccess.getFodaBinAccess().getVar2IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaBinRule());
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
    // $ANTLR end "ruleFodaBin"


    // $ANTLR start "entryRuleFodaNary"
    // InternalHLCLSpecificationLanguage.g:1172:1: entryRuleFodaNary returns [EObject current=null] : iv_ruleFodaNary= ruleFodaNary EOF ;
    public final EObject entryRuleFodaNary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFodaNary = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1172:49: (iv_ruleFodaNary= ruleFodaNary EOF )
            // InternalHLCLSpecificationLanguage.g:1173:2: iv_ruleFodaNary= ruleFodaNary EOF
            {
             newCompositeNode(grammarAccess.getFodaNaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFodaNary=ruleFodaNary();

            state._fsp--;

             current =iv_ruleFodaNary; 
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
    // $ANTLR end "entryRuleFodaNary"


    // $ANTLR start "ruleFodaNary"
    // InternalHLCLSpecificationLanguage.g:1179:1: ruleFodaNary returns [EObject current=null] : (otherlv_0= 'parent:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'group:' ( (lv_group_3_0= ruleListOfIDs ) ) otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ']' ) ;
    public final EObject ruleFodaNary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parent_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_min_6_0=null;
        Token otherlv_7=null;
        Token lv_max_8_0=null;
        Token otherlv_9=null;
        EObject lv_group_3_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1185:2: ( (otherlv_0= 'parent:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'group:' ( (lv_group_3_0= ruleListOfIDs ) ) otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ']' ) )
            // InternalHLCLSpecificationLanguage.g:1186:2: (otherlv_0= 'parent:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'group:' ( (lv_group_3_0= ruleListOfIDs ) ) otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1186:2: (otherlv_0= 'parent:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'group:' ( (lv_group_3_0= ruleListOfIDs ) ) otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ']' )
            // InternalHLCLSpecificationLanguage.g:1187:3: otherlv_0= 'parent:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'group:' ( (lv_group_3_0= ruleListOfIDs ) ) otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFodaNaryAccess().getParentKeyword_0());
            		
            // InternalHLCLSpecificationLanguage.g:1191:3: ( (lv_parent_1_0= RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:1192:4: (lv_parent_1_0= RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:1192:4: (lv_parent_1_0= RULE_ID )
            // InternalHLCLSpecificationLanguage.g:1193:5: lv_parent_1_0= RULE_ID
            {
            lv_parent_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_parent_1_0, grammarAccess.getFodaNaryAccess().getParentIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaNaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parent",
            						lv_parent_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFodaNaryAccess().getGroupKeyword_2());
            		
            // InternalHLCLSpecificationLanguage.g:1213:3: ( (lv_group_3_0= ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:1214:4: (lv_group_3_0= ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:1214:4: (lv_group_3_0= ruleListOfIDs )
            // InternalHLCLSpecificationLanguage.g:1215:5: lv_group_3_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getFodaNaryAccess().getGroupListOfIDsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_group_3_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFodaNaryRule());
            					}
            					set(
            						current,
            						"group",
            						lv_group_3_0,
            						"org.xtext.HLCLSpecificationLanguage.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getFodaNaryAccess().getCardKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getFodaNaryAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHLCLSpecificationLanguage.g:1240:3: ( (lv_min_6_0= RULE_INT ) )
            // InternalHLCLSpecificationLanguage.g:1241:4: (lv_min_6_0= RULE_INT )
            {
            // InternalHLCLSpecificationLanguage.g:1241:4: (lv_min_6_0= RULE_INT )
            // InternalHLCLSpecificationLanguage.g:1242:5: lv_min_6_0= RULE_INT
            {
            lv_min_6_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_min_6_0, grammarAccess.getFodaNaryAccess().getMinINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaNaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_31); 

            			newLeafNode(otherlv_7, grammarAccess.getFodaNaryAccess().getCommaKeyword_7());
            		
            // InternalHLCLSpecificationLanguage.g:1262:3: ( (lv_max_8_0= RULE_INT ) )
            // InternalHLCLSpecificationLanguage.g:1263:4: (lv_max_8_0= RULE_INT )
            {
            // InternalHLCLSpecificationLanguage.g:1263:4: (lv_max_8_0= RULE_INT )
            // InternalHLCLSpecificationLanguage.g:1264:5: lv_max_8_0= RULE_INT
            {
            lv_max_8_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_max_8_0, grammarAccess.getFodaNaryAccess().getMaxINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaNaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFodaNaryAccess().getRightSquareBracketKeyword_9());
            		

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
    // $ANTLR end "ruleFodaNary"


    // $ANTLR start "entryRuleValue"
    // InternalHLCLSpecificationLanguage.g:1288:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1288:45: (iv_ruleValue= ruleValue EOF )
            // InternalHLCLSpecificationLanguage.g:1289:2: iv_ruleValue= ruleValue EOF
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
    // InternalHLCLSpecificationLanguage.g:1295:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1301:2: ( (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' ) )
            // InternalHLCLSpecificationLanguage.g:1302:2: (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' )
            {
            // InternalHLCLSpecificationLanguage.g:1302:2: (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
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
                    // InternalHLCLSpecificationLanguage.g:1303:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:1311:3: kw= 'selected'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValueAccess().getSelectedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:1317:3: kw= 'unselected'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

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
    // InternalHLCLSpecificationLanguage.g:1326:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1326:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalHLCLSpecificationLanguage.g:1327:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalHLCLSpecificationLanguage.g:1333:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'numeric' ) ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1339:2: ( (kw= 'boolean' | kw= 'numeric' ) )
            // InternalHLCLSpecificationLanguage.g:1340:2: (kw= 'boolean' | kw= 'numeric' )
            {
            // InternalHLCLSpecificationLanguage.g:1340:2: (kw= 'boolean' | kw= 'numeric' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:1341:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:1347:3: kw= 'numeric'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

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
    // InternalHLCLSpecificationLanguage.g:1356:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1356:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalHLCLSpecificationLanguage.g:1357:2: iv_ruleListOfValues= ruleListOfValues EOF
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
    // InternalHLCLSpecificationLanguage.g:1363:1: ruleListOfValues returns [EObject current=null] : ( (lv_values_0_0= ruleValue ) )+ ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_values_0_0 = null;



        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1369:2: ( ( (lv_values_0_0= ruleValue ) )+ )
            // InternalHLCLSpecificationLanguage.g:1370:2: ( (lv_values_0_0= ruleValue ) )+
            {
            // InternalHLCLSpecificationLanguage.g:1370:2: ( (lv_values_0_0= ruleValue ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT||(LA12_0>=30 && LA12_0<=31)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1371:3: (lv_values_0_0= ruleValue )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:1371:3: (lv_values_0_0= ruleValue )
            	    // InternalHLCLSpecificationLanguage.g:1372:4: lv_values_0_0= ruleValue
            	    {

            	    				newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_32);
            	    lv_values_0_0=ruleValue();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            	    				}
            	    				add(
            	    					current,
            	    					"values",
            	    					lv_values_0_0,
            	    					"org.xtext.HLCLSpecificationLanguage.Value");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


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
    // InternalHLCLSpecificationLanguage.g:1392:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1392:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalHLCLSpecificationLanguage.g:1393:2: iv_ruleListOfIDs= ruleListOfIDs EOF
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
    // InternalHLCLSpecificationLanguage.g:1399:1: ruleListOfIDs returns [EObject current=null] : ( (lv_ids_0_0= RULE_ID ) )+ ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token lv_ids_0_0=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1405:2: ( ( (lv_ids_0_0= RULE_ID ) )+ )
            // InternalHLCLSpecificationLanguage.g:1406:2: ( (lv_ids_0_0= RULE_ID ) )+
            {
            // InternalHLCLSpecificationLanguage.g:1406:2: ( (lv_ids_0_0= RULE_ID ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1407:3: (lv_ids_0_0= RULE_ID )
            	    {
            	    // InternalHLCLSpecificationLanguage.g:1407:3: (lv_ids_0_0= RULE_ID )
            	    // InternalHLCLSpecificationLanguage.g:1408:4: lv_ids_0_0= RULE_ID
            	    {
            	    lv_ids_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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


    // $ANTLR start "entryRuleBinOp"
    // InternalHLCLSpecificationLanguage.g:1427:1: entryRuleBinOp returns [String current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final String entryRuleBinOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinOp = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1427:45: (iv_ruleBinOp= ruleBinOp EOF )
            // InternalHLCLSpecificationLanguage.g:1428:2: iv_ruleBinOp= ruleBinOp EOF
            {
             newCompositeNode(grammarAccess.getBinOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinOp=ruleBinOp();

            state._fsp--;

             current =iv_ruleBinOp.getText(); 
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
    // $ANTLR end "entryRuleBinOp"


    // $ANTLR start "ruleBinOp"
    // InternalHLCLSpecificationLanguage.g:1434:1: ruleBinOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' | kw= 'excludes' ) ;
    public final AntlrDatatypeRuleToken ruleBinOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1440:2: ( (kw= 'requires' | kw= 'excludes' ) )
            // InternalHLCLSpecificationLanguage.g:1441:2: (kw= 'requires' | kw= 'excludes' )
            {
            // InternalHLCLSpecificationLanguage.g:1441:2: (kw= 'requires' | kw= 'excludes' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==35) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:1442:3: kw= 'requires'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getRequiresKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:1448:3: kw= 'excludes'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getExcludesKeyword_1());
                    		

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
    // $ANTLR end "ruleBinOp"


    // $ANTLR start "entryRuleUnaryOp"
    // InternalHLCLSpecificationLanguage.g:1457:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // InternalHLCLSpecificationLanguage.g:1457:47: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalHLCLSpecificationLanguage.g:1458:2: iv_ruleUnaryOp= ruleUnaryOp EOF
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
    // InternalHLCLSpecificationLanguage.g:1464:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'optional' | kw= 'mandatory' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHLCLSpecificationLanguage.g:1470:2: ( (kw= 'optional' | kw= 'mandatory' ) )
            // InternalHLCLSpecificationLanguage.g:1471:2: (kw= 'optional' | kw= 'mandatory' )
            {
            // InternalHLCLSpecificationLanguage.g:1471:2: (kw= 'optional' | kw= 'mandatory' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            else if ( (LA15_0==37) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:1472:3: kw= 'optional'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getOptionalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:1478:3: kw= 'mandatory'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getMandatoryKeyword_1());
                    		

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

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\5\12\uffff";
    static final String dfa_3s = "\3\4\3\uffff\1\5\2\uffff\1\4\1\uffff\1\30";
    static final String dfa_4s = "\1\33\1\43\1\33\3\uffff\1\45\2\uffff\1\43\1\uffff\1\32";
    static final String dfa_5s = "\3\uffff\1\5\1\4\1\1\1\uffff\1\2\1\3\1\uffff\1\6\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\17\uffff\1\2\6\uffff\1\3",
            "\1\5\20\uffff\1\5\1\6\1\7\2\uffff\1\10\7\uffff\2\4",
            "\1\11\17\uffff\1\10\6\uffff\1\10",
            "",
            "",
            "",
            "\1\7\30\uffff\2\7\4\uffff\2\12",
            "",
            "",
            "\1\7\20\uffff\1\13\2\10\2\uffff\1\10\7\uffff\2\10",
            "",
            "\1\7\1\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "555:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_FodaNary_4= ruleFodaNary | this_FodaUN_5= ruleFodaUN )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000300006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000300004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000C0020020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000C0000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000C0000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008100010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000C0000022L});

}
