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
import org.xtext.services.PLhlclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPLhlclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'variables:'", "'constraints:'", "'instantiable'", "'['", "','", "']'", "'variants:'", "'..'", "':'", "'('", "')'", "'is'", "'in'", "'vars:'", "'variants'", "'-->'", "'structural:'", "'card:'", "'selected'", "'unselected'", "'boolean'", "'integer'", "'requires'", "'excludes'", "'optional'", "'mandatory'"
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


        public InternalPLhlclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPLhlclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPLhlclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPLhlcl.g"; }



     	private PLhlclGrammarAccess grammarAccess;

        public InternalPLhlclParser(TokenStream input, PLhlclGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PLhlclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPLhlcl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPLhlcl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPLhlcl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalPLhlcl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ ) ;
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
            // InternalPLhlcl.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ ) )
            // InternalPLhlcl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ )
            {
            // InternalPLhlcl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+ )
            // InternalPLhlcl.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )+ otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalPLhlcl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPLhlcl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPLhlcl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalPLhlcl.g:85:5: lv_name_1_0= RULE_ID
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
            		
            // InternalPLhlcl.g:105:3: ( (lv_vars_3_0= ruleVarDeclaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||(LA1_0>=32 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPLhlcl.g:106:4: (lv_vars_3_0= ruleVarDeclaration )
            	    {
            	    // InternalPLhlcl.g:106:4: (lv_vars_3_0= ruleVarDeclaration )
            	    // InternalPLhlcl.g:107:5: lv_vars_3_0= ruleVarDeclaration
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
            	    						"org.xtext.PLhlcl.VarDeclaration");
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
            		
            // InternalPLhlcl.g:128:3: ( (lv_constraints_5_0= ruleConstraint ) )+
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
            	    // InternalPLhlcl.g:129:4: (lv_constraints_5_0= ruleConstraint )
            	    {
            	    // InternalPLhlcl.g:129:4: (lv_constraints_5_0= ruleConstraint )
            	    // InternalPLhlcl.g:130:5: lv_constraints_5_0= ruleConstraint
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
            	    						"org.xtext.PLhlcl.Constraint");
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
    // InternalPLhlcl.g:151:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalPLhlcl.g:151:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalPLhlcl.g:152:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalPLhlcl.g:158:1: ruleVarDeclaration returns [EObject current=null] : ( ( ( (lv_instantiable_0_0= 'instantiable' ) )? otherlv_1= '[' ( (lv_min_2_0= RULE_INT ) )? otherlv_3= ',' ( (lv_max_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'variants:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_instantiable_0_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token otherlv_3=null;
        Token lv_max_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_type_6_0 = null;

        EObject lv_variants_9_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:164:2: ( ( ( ( (lv_instantiable_0_0= 'instantiable' ) )? otherlv_1= '[' ( (lv_min_2_0= RULE_INT ) )? otherlv_3= ',' ( (lv_max_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'variants:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) ) )
            // InternalPLhlcl.g:165:2: ( ( ( (lv_instantiable_0_0= 'instantiable' ) )? otherlv_1= '[' ( (lv_min_2_0= RULE_INT ) )? otherlv_3= ',' ( (lv_max_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'variants:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )
            {
            // InternalPLhlcl.g:165:2: ( ( ( (lv_instantiable_0_0= 'instantiable' ) )? otherlv_1= '[' ( (lv_min_2_0= RULE_INT ) )? otherlv_3= ',' ( (lv_max_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'variants:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )
            // InternalPLhlcl.g:166:3: ( ( (lv_instantiable_0_0= 'instantiable' ) )? otherlv_1= '[' ( (lv_min_2_0= RULE_INT ) )? otherlv_3= ',' ( (lv_max_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'variants:' ( (lv_variants_9_0= ruleVariantDeclaration ) )
            {
            // InternalPLhlcl.g:166:3: ( ( (lv_instantiable_0_0= 'instantiable' ) )? otherlv_1= '[' ( (lv_min_2_0= RULE_INT ) )? otherlv_3= ',' ( (lv_max_4_0= RULE_INT ) )? otherlv_5= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPLhlcl.g:167:4: ( (lv_instantiable_0_0= 'instantiable' ) )? otherlv_1= '[' ( (lv_min_2_0= RULE_INT ) )? otherlv_3= ',' ( (lv_max_4_0= RULE_INT ) )? otherlv_5= ']'
                    {
                    // InternalPLhlcl.g:167:4: ( (lv_instantiable_0_0= 'instantiable' ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalPLhlcl.g:168:5: (lv_instantiable_0_0= 'instantiable' )
                            {
                            // InternalPLhlcl.g:168:5: (lv_instantiable_0_0= 'instantiable' )
                            // InternalPLhlcl.g:169:6: lv_instantiable_0_0= 'instantiable'
                            {
                            lv_instantiable_0_0=(Token)match(input,14,FOLLOW_8); 

                            						newLeafNode(lv_instantiable_0_0, grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVarDeclarationRule());
                            						}
                            						setWithLastConsumed(current, "instantiable", lv_instantiable_0_0, "instantiable");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalPLhlcl.g:185:4: ( (lv_min_2_0= RULE_INT ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_INT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPLhlcl.g:186:5: (lv_min_2_0= RULE_INT )
                            {
                            // InternalPLhlcl.g:186:5: (lv_min_2_0= RULE_INT )
                            // InternalPLhlcl.g:187:6: lv_min_2_0= RULE_INT
                            {
                            lv_min_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                            						newLeafNode(lv_min_2_0, grammarAccess.getVarDeclarationAccess().getMinINTTerminalRuleCall_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVarDeclarationRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"min",
                            							lv_min_2_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_3());
                    			
                    // InternalPLhlcl.g:207:4: ( (lv_max_4_0= RULE_INT ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPLhlcl.g:208:5: (lv_max_4_0= RULE_INT )
                            {
                            // InternalPLhlcl.g:208:5: (lv_max_4_0= RULE_INT )
                            // InternalPLhlcl.g:209:6: lv_max_4_0= RULE_INT
                            {
                            lv_max_4_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                            						newLeafNode(lv_max_4_0, grammarAccess.getVarDeclarationAccess().getMaxINTTerminalRuleCall_0_4_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVarDeclarationRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"max",
                            							lv_max_4_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getVarDeclarationAccess().getRightSquareBracketKeyword_0_5());
                    			

                    }
                    break;

            }

            // InternalPLhlcl.g:230:3: ( (lv_type_6_0= ruleVarType ) )
            // InternalPLhlcl.g:231:4: (lv_type_6_0= ruleVarType )
            {
            // InternalPLhlcl.g:231:4: (lv_type_6_0= ruleVarType )
            // InternalPLhlcl.g:232:5: lv_type_6_0= ruleVarType
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_6_0=ruleVarType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"org.xtext.PLhlcl.VarType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPLhlcl.g:249:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalPLhlcl.g:250:4: (lv_name_7_0= RULE_ID )
            {
            // InternalPLhlcl.g:250:4: (lv_name_7_0= RULE_ID )
            // InternalPLhlcl.g:251:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_7_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getVarDeclarationAccess().getVariantsKeyword_3());
            		
            // InternalPLhlcl.g:271:3: ( (lv_variants_9_0= ruleVariantDeclaration ) )
            // InternalPLhlcl.g:272:4: (lv_variants_9_0= ruleVariantDeclaration )
            {
            // InternalPLhlcl.g:272:4: (lv_variants_9_0= ruleVariantDeclaration )
            // InternalPLhlcl.g:273:5: lv_variants_9_0= ruleVariantDeclaration
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_variants_9_0=ruleVariantDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"variants",
            						lv_variants_9_0,
            						"org.xtext.PLhlcl.VariantDeclaration");
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


    // $ANTLR start "entryRuleVariantDeclaration"
    // InternalPLhlcl.g:294:1: entryRuleVariantDeclaration returns [EObject current=null] : iv_ruleVariantDeclaration= ruleVariantDeclaration EOF ;
    public final EObject entryRuleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantDeclaration = null;


        try {
            // InternalPLhlcl.g:294:59: (iv_ruleVariantDeclaration= ruleVariantDeclaration EOF )
            // InternalPLhlcl.g:295:2: iv_ruleVariantDeclaration= ruleVariantDeclaration EOF
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
    // InternalPLhlcl.g:301:1: ruleVariantDeclaration returns [EObject current=null] : (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration ) ;
    public final EObject ruleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariantsInterval_0 = null;

        EObject this_VariantsEnumeration_1 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:307:2: ( (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration ) )
            // InternalPLhlcl.g:308:2: (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration )
            {
            // InternalPLhlcl.g:308:2: (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||(LA7_0>=30 && LA7_0<=31)) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPLhlcl.g:309:3: this_VariantsInterval_0= ruleVariantsInterval
                    {

                    			newCompositeNode(grammarAccess.getVariantDeclarationAccess().getVariantsIntervalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariantsInterval_0=ruleVariantsInterval();

                    state._fsp--;


                    			current = this_VariantsInterval_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:318:3: this_VariantsEnumeration_1= ruleVariantsEnumeration
                    {

                    			newCompositeNode(grammarAccess.getVariantDeclarationAccess().getVariantsEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariantsEnumeration_1=ruleVariantsEnumeration();

                    state._fsp--;


                    			current = this_VariantsEnumeration_1;
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


    // $ANTLR start "entryRuleVariantsInterval"
    // InternalPLhlcl.g:330:1: entryRuleVariantsInterval returns [EObject current=null] : iv_ruleVariantsInterval= ruleVariantsInterval EOF ;
    public final EObject entryRuleVariantsInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantsInterval = null;


        try {
            // InternalPLhlcl.g:330:57: (iv_ruleVariantsInterval= ruleVariantsInterval EOF )
            // InternalPLhlcl.g:331:2: iv_ruleVariantsInterval= ruleVariantsInterval EOF
            {
             newCompositeNode(grammarAccess.getVariantsIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariantsInterval=ruleVariantsInterval();

            state._fsp--;

             current =iv_ruleVariantsInterval; 
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
    // $ANTLR end "entryRuleVariantsInterval"


    // $ANTLR start "ruleVariantsInterval"
    // InternalPLhlcl.g:337:1: ruleVariantsInterval returns [EObject current=null] : ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '..' ( (lv_end_3_0= ruleValue ) ) ) ;
    public final EObject ruleVariantsInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_end_3_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:343:2: ( ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '..' ( (lv_end_3_0= ruleValue ) ) ) )
            // InternalPLhlcl.g:344:2: ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '..' ( (lv_end_3_0= ruleValue ) ) )
            {
            // InternalPLhlcl.g:344:2: ( () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '..' ( (lv_end_3_0= ruleValue ) ) )
            // InternalPLhlcl.g:345:3: () ( (lv_start_1_0= ruleValue ) ) otherlv_2= '..' ( (lv_end_3_0= ruleValue ) )
            {
            // InternalPLhlcl.g:345:3: ()
            // InternalPLhlcl.g:346:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0(),
            					current);
            			

            }

            // InternalPLhlcl.g:352:3: ( (lv_start_1_0= ruleValue ) )
            // InternalPLhlcl.g:353:4: (lv_start_1_0= ruleValue )
            {
            // InternalPLhlcl.g:353:4: (lv_start_1_0= ruleValue )
            // InternalPLhlcl.g:354:5: lv_start_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getVariantsIntervalAccess().getStartValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_start_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantsIntervalRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.xtext.PLhlcl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantsIntervalAccess().getFullStopFullStopKeyword_2());
            		
            // InternalPLhlcl.g:375:3: ( (lv_end_3_0= ruleValue ) )
            // InternalPLhlcl.g:376:4: (lv_end_3_0= ruleValue )
            {
            // InternalPLhlcl.g:376:4: (lv_end_3_0= ruleValue )
            // InternalPLhlcl.g:377:5: lv_end_3_0= ruleValue
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
            						"org.xtext.PLhlcl.Value");
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
    // $ANTLR end "ruleVariantsInterval"


    // $ANTLR start "entryRuleVariantsEnumeration"
    // InternalPLhlcl.g:398:1: entryRuleVariantsEnumeration returns [EObject current=null] : iv_ruleVariantsEnumeration= ruleVariantsEnumeration EOF ;
    public final EObject entryRuleVariantsEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantsEnumeration = null;


        try {
            // InternalPLhlcl.g:398:60: (iv_ruleVariantsEnumeration= ruleVariantsEnumeration EOF )
            // InternalPLhlcl.g:399:2: iv_ruleVariantsEnumeration= ruleVariantsEnumeration EOF
            {
             newCompositeNode(grammarAccess.getVariantsEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariantsEnumeration=ruleVariantsEnumeration();

            state._fsp--;

             current =iv_ruleVariantsEnumeration; 
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
    // $ANTLR end "entryRuleVariantsEnumeration"


    // $ANTLR start "ruleVariantsEnumeration"
    // InternalPLhlcl.g:405:1: ruleVariantsEnumeration returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_list_2_0= ruleListOfValues ) ) otherlv_3= ']' ) ;
    public final EObject ruleVariantsEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:411:2: ( ( () otherlv_1= '[' ( (lv_list_2_0= ruleListOfValues ) ) otherlv_3= ']' ) )
            // InternalPLhlcl.g:412:2: ( () otherlv_1= '[' ( (lv_list_2_0= ruleListOfValues ) ) otherlv_3= ']' )
            {
            // InternalPLhlcl.g:412:2: ( () otherlv_1= '[' ( (lv_list_2_0= ruleListOfValues ) ) otherlv_3= ']' )
            // InternalPLhlcl.g:413:3: () otherlv_1= '[' ( (lv_list_2_0= ruleListOfValues ) ) otherlv_3= ']'
            {
            // InternalPLhlcl.g:413:3: ()
            // InternalPLhlcl.g:414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPLhlcl.g:424:3: ( (lv_list_2_0= ruleListOfValues ) )
            // InternalPLhlcl.g:425:4: (lv_list_2_0= ruleListOfValues )
            {
            // InternalPLhlcl.g:425:4: (lv_list_2_0= ruleListOfValues )
            // InternalPLhlcl.g:426:5: lv_list_2_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getVariantsEnumerationAccess().getListListOfValuesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_list_2_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantsEnumerationRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_2_0,
            						"org.xtext.PLhlcl.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

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
    // $ANTLR end "ruleVariantsEnumeration"


    // $ANTLR start "entryRuleConstraint"
    // InternalPLhlcl.g:451:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalPLhlcl.g:451:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalPLhlcl.g:452:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalPLhlcl.g:458:1: ruleConstraint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:464:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) )
            // InternalPLhlcl.g:465:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            {
            // InternalPLhlcl.g:465:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            // InternalPLhlcl.g:466:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) )
            {
            // InternalPLhlcl.g:466:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPLhlcl.g:467:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPLhlcl.g:467:4: (lv_name_0_0= RULE_ID )
            // InternalPLhlcl.g:468:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getColonKeyword_1());
            		
            // InternalPLhlcl.g:488:3: ( (lv_exp_2_0= ruleConsExpression ) )
            // InternalPLhlcl.g:489:4: (lv_exp_2_0= ruleConsExpression )
            {
            // InternalPLhlcl.g:489:4: (lv_exp_2_0= ruleConsExpression )
            // InternalPLhlcl.g:490:5: lv_exp_2_0= ruleConsExpression
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
            						"org.xtext.PLhlcl.ConsExpression");
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
    // InternalPLhlcl.g:511:1: entryRuleConsExpression returns [EObject current=null] : iv_ruleConsExpression= ruleConsExpression EOF ;
    public final EObject entryRuleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsExpression = null;


        try {
            // InternalPLhlcl.g:511:55: (iv_ruleConsExpression= ruleConsExpression EOF )
            // InternalPLhlcl.g:512:2: iv_ruleConsExpression= ruleConsExpression EOF
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
    // InternalPLhlcl.g:518:1: ruleConsExpression returns [EObject current=null] : (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN ) ;
    public final EObject ruleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IDCons_0 = null;

        EObject this_Refinement_1 = null;

        EObject this_Rule_2 = null;

        EObject this_FodaBin_3 = null;

        EObject this_Structural_4 = null;

        EObject this_FodaUN_5 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:524:2: ( (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN ) )
            // InternalPLhlcl.g:525:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN )
            {
            // InternalPLhlcl.g:525:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 22:
                    {
                    alt8=1;
                    }
                    break;
                case 27:
                    {
                    alt8=3;
                    }
                    break;
                case 23:
                    {
                    int LA8_6 = input.LA(3);

                    if ( ((LA8_6>=36 && LA8_6<=37)) ) {
                        alt8=6;
                    }
                    else if ( (LA8_6==RULE_INT||(LA8_6>=30 && LA8_6<=31)) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 34:
                case 35:
                case 36:
                case 37:
                    {
                    alt8=4;
                    }
                    break;
                case 24:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPLhlcl.g:526:3: this_IDCons_0= ruleIDCons
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
                    // InternalPLhlcl.g:535:3: this_Refinement_1= ruleRefinement
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
                    // InternalPLhlcl.g:544:3: this_Rule_2= ruleRule
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
                    // InternalPLhlcl.g:553:3: this_FodaBin_3= ruleFodaBin
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
                    // InternalPLhlcl.g:562:3: this_Structural_4= ruleStructural
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getStructuralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Structural_4=ruleStructural();

                    state._fsp--;


                    			current = this_Structural_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPLhlcl.g:571:3: this_FodaUN_5= ruleFodaUN
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
    // InternalPLhlcl.g:583:1: entryRuleTerminalExp returns [EObject current=null] : iv_ruleTerminalExp= ruleTerminalExp EOF ;
    public final EObject entryRuleTerminalExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExp = null;


        try {
            // InternalPLhlcl.g:583:52: (iv_ruleTerminalExp= ruleTerminalExp EOF )
            // InternalPLhlcl.g:584:2: iv_ruleTerminalExp= ruleTerminalExp EOF
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
    // InternalPLhlcl.g:590:1: ruleTerminalExp returns [EObject current=null] : ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons ) ;
    public final EObject ruleTerminalExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConsExpression_1 = null;

        EObject this_IDCons_3 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:596:2: ( ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons ) )
            // InternalPLhlcl.g:597:2: ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons )
            {
            // InternalPLhlcl.g:597:2: ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPLhlcl.g:598:3: (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' )
                    {
                    // InternalPLhlcl.g:598:3: (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' )
                    // InternalPLhlcl.g:599:4: otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpAccess().getConsExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_ConsExpression_1=ruleConsExpression();

                    state._fsp--;


                    				current = this_ConsExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:617:3: this_IDCons_3= ruleIDCons
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
    // InternalPLhlcl.g:629:1: entryRuleIDCons returns [EObject current=null] : iv_ruleIDCons= ruleIDCons EOF ;
    public final EObject entryRuleIDCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDCons = null;


        try {
            // InternalPLhlcl.g:629:47: (iv_ruleIDCons= ruleIDCons EOF )
            // InternalPLhlcl.g:630:2: iv_ruleIDCons= ruleIDCons EOF
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
    // InternalPLhlcl.g:636:1: ruleIDCons returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleIDCons() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:642:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPLhlcl.g:643:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPLhlcl.g:643:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPLhlcl.g:644:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPLhlcl.g:644:3: (lv_name_0_0= RULE_ID )
            // InternalPLhlcl.g:645:4: lv_name_0_0= RULE_ID
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
    // InternalPLhlcl.g:664:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // InternalPLhlcl.g:664:51: (iv_ruleRefinement= ruleRefinement EOF )
            // InternalPLhlcl.g:665:2: iv_ruleRefinement= ruleRefinement EOF
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
    // InternalPLhlcl.g:671:1: ruleRefinement returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_VarRefinement_1 = null;

        EObject this_SetRefinement_2 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:677:2: ( (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement ) )
            // InternalPLhlcl.g:678:2: (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement )
            {
            // InternalPLhlcl.g:678:2: (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==23) ) {
                    alt10=1;
                }
                else if ( (LA10_1==24) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==25) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPLhlcl.g:679:3: this_Assignment_0= ruleAssignment
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
                    // InternalPLhlcl.g:688:3: this_VarRefinement_1= ruleVarRefinement
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
                    // InternalPLhlcl.g:697:3: this_SetRefinement_2= ruleSetRefinement
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
    // InternalPLhlcl.g:709:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalPLhlcl.g:709:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalPLhlcl.g:710:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalPLhlcl.g:716:1: ruleAssignment returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:722:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalPLhlcl.g:723:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalPLhlcl.g:723:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )
            // InternalPLhlcl.g:724:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalPLhlcl.g:724:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalPLhlcl.g:725:4: (lv_var_0_0= RULE_ID )
            {
            // InternalPLhlcl.g:725:4: (lv_var_0_0= RULE_ID )
            // InternalPLhlcl.g:726:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getIsKeyword_1());
            		
            // InternalPLhlcl.g:746:3: ( (lv_value_2_0= ruleValue ) )
            // InternalPLhlcl.g:747:4: (lv_value_2_0= ruleValue )
            {
            // InternalPLhlcl.g:747:4: (lv_value_2_0= ruleValue )
            // InternalPLhlcl.g:748:5: lv_value_2_0= ruleValue
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
            						"org.xtext.PLhlcl.Value");
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
    // InternalPLhlcl.g:769:1: entryRuleVarRefinement returns [EObject current=null] : iv_ruleVarRefinement= ruleVarRefinement EOF ;
    public final EObject entryRuleVarRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefinement = null;


        try {
            // InternalPLhlcl.g:769:54: (iv_ruleVarRefinement= ruleVarRefinement EOF )
            // InternalPLhlcl.g:770:2: iv_ruleVarRefinement= ruleVarRefinement EOF
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
    // InternalPLhlcl.g:776:1: ruleVarRefinement returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) ) ;
    public final EObject ruleVarRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:782:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) ) )
            // InternalPLhlcl.g:783:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) )
            {
            // InternalPLhlcl.g:783:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) )
            // InternalPLhlcl.g:784:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) )
            {
            // InternalPLhlcl.g:784:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalPLhlcl.g:785:4: (lv_var_0_0= RULE_ID )
            {
            // InternalPLhlcl.g:785:4: (lv_var_0_0= RULE_ID )
            // InternalPLhlcl.g:786:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getVarRefinementAccess().getInKeyword_1());
            		
            // InternalPLhlcl.g:806:3: ( (lv_values_2_0= ruleVariantDeclaration ) )
            // InternalPLhlcl.g:807:4: (lv_values_2_0= ruleVariantDeclaration )
            {
            // InternalPLhlcl.g:807:4: (lv_values_2_0= ruleVariantDeclaration )
            // InternalPLhlcl.g:808:5: lv_values_2_0= ruleVariantDeclaration
            {

            					newCompositeNode(grammarAccess.getVarRefinementAccess().getValuesVariantDeclarationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_values_2_0=ruleVariantDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarRefinementRule());
            					}
            					set(
            						current,
            						"values",
            						lv_values_2_0,
            						"org.xtext.PLhlcl.VariantDeclaration");
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
    // InternalPLhlcl.g:829:1: entryRuleSetRefinement returns [EObject current=null] : iv_ruleSetRefinement= ruleSetRefinement EOF ;
    public final EObject entryRuleSetRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRefinement = null;


        try {
            // InternalPLhlcl.g:829:54: (iv_ruleSetRefinement= ruleSetRefinement EOF )
            // InternalPLhlcl.g:830:2: iv_ruleSetRefinement= ruleSetRefinement EOF
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
    // InternalPLhlcl.g:836:1: ruleSetRefinement returns [EObject current=null] : (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']' ) ;
    public final EObject ruleSetRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_vars_2_0 = null;

        EObject lv_head_7_0 = null;

        EObject lv_tail_11_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:842:2: ( (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']' ) )
            // InternalPLhlcl.g:843:2: (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']' )
            {
            // InternalPLhlcl.g:843:2: (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']' )
            // InternalPLhlcl.g:844:3: otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSetRefinementAccess().getVarsKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPLhlcl.g:852:3: ( (lv_vars_2_0= ruleListOfIDs ) )
            // InternalPLhlcl.g:853:4: (lv_vars_2_0= ruleListOfIDs )
            {
            // InternalPLhlcl.g:853:4: (lv_vars_2_0= ruleListOfIDs )
            // InternalPLhlcl.g:854:5: lv_vars_2_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_vars_2_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRefinementRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_2_0,
            						"org.xtext.PLhlcl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSetRefinementAccess().getVariantsKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_6());
            		
            // InternalPLhlcl.g:887:3: ( (lv_head_7_0= ruleListOfValues ) )
            // InternalPLhlcl.g:888:4: (lv_head_7_0= ruleListOfValues )
            {
            // InternalPLhlcl.g:888:4: (lv_head_7_0= ruleListOfValues )
            // InternalPLhlcl.g:889:5: lv_head_7_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_19);
            lv_head_7_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRefinementRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_7_0,
            						"org.xtext.PLhlcl.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8());
            		
            // InternalPLhlcl.g:910:3: (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPLhlcl.g:911:4: otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')'
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_22); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSetRefinementAccess().getCommaKeyword_9_0());
            	    			
            	    otherlv_10=(Token)match(input,21,FOLLOW_16); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_9_1());
            	    			
            	    // InternalPLhlcl.g:919:4: ( (lv_tail_11_0= ruleListOfValues ) )
            	    // InternalPLhlcl.g:920:5: (lv_tail_11_0= ruleListOfValues )
            	    {
            	    // InternalPLhlcl.g:920:5: (lv_tail_11_0= ruleListOfValues )
            	    // InternalPLhlcl.g:921:6: lv_tail_11_0= ruleListOfValues
            	    {

            	    						newCompositeNode(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_9_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_tail_11_0=ruleListOfValues();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSetRefinementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tail",
            	    							lv_tail_11_0,
            	    							"org.xtext.PLhlcl.ListOfValues");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_12=(Token)match(input,22,FOLLOW_24); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_9_3());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_10());
            		

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
    // InternalPLhlcl.g:951:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalPLhlcl.g:951:45: (iv_ruleRule= ruleRule EOF )
            // InternalPLhlcl.g:952:2: iv_ruleRule= ruleRule EOF
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
    // InternalPLhlcl.g:958:1: ruleRule returns [EObject current=null] : ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_consequence_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:964:2: ( ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) ) )
            // InternalPLhlcl.g:965:2: ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) )
            {
            // InternalPLhlcl.g:965:2: ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) )
            // InternalPLhlcl.g:966:3: ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) )
            {
            // InternalPLhlcl.g:966:3: ( (lv_condition_0_0= ruleTerminalExp ) )
            // InternalPLhlcl.g:967:4: (lv_condition_0_0= ruleTerminalExp )
            {
            // InternalPLhlcl.g:967:4: (lv_condition_0_0= ruleTerminalExp )
            // InternalPLhlcl.g:968:5: lv_condition_0_0= ruleTerminalExp
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
            						"org.xtext.PLhlcl.TerminalExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalPLhlcl.g:989:3: ( (lv_consequence_2_0= ruleTerminalExp ) )
            // InternalPLhlcl.g:990:4: (lv_consequence_2_0= ruleTerminalExp )
            {
            // InternalPLhlcl.g:990:4: (lv_consequence_2_0= ruleTerminalExp )
            // InternalPLhlcl.g:991:5: lv_consequence_2_0= ruleTerminalExp
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
            						"org.xtext.PLhlcl.TerminalExp");
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
    // InternalPLhlcl.g:1012:1: entryRuleFodaUN returns [EObject current=null] : iv_ruleFodaUN= ruleFodaUN EOF ;
    public final EObject entryRuleFodaUN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFodaUN = null;


        try {
            // InternalPLhlcl.g:1012:47: (iv_ruleFodaUN= ruleFodaUN EOF )
            // InternalPLhlcl.g:1013:2: iv_ruleFodaUN= ruleFodaUN EOF
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
    // InternalPLhlcl.g:1019:1: ruleFodaUN returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) ) ;
    public final EObject ruleFodaUN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:1025:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) ) )
            // InternalPLhlcl.g:1026:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) )
            {
            // InternalPLhlcl.g:1026:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) )
            // InternalPLhlcl.g:1027:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) )
            {
            // InternalPLhlcl.g:1027:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLhlcl.g:1028:4: (otherlv_0= RULE_ID )
            {
            // InternalPLhlcl.g:1028:4: (otherlv_0= RULE_ID )
            // InternalPLhlcl.g:1029:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaUNRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getFodaUNAccess().getVar1VarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFodaUNAccess().getIsKeyword_1());
            		
            // InternalPLhlcl.g:1044:3: ( (lv_op_2_0= ruleUnaryOp ) )
            // InternalPLhlcl.g:1045:4: (lv_op_2_0= ruleUnaryOp )
            {
            // InternalPLhlcl.g:1045:4: (lv_op_2_0= ruleUnaryOp )
            // InternalPLhlcl.g:1046:5: lv_op_2_0= ruleUnaryOp
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
            						"org.xtext.PLhlcl.UnaryOp");
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
    // InternalPLhlcl.g:1067:1: entryRuleFodaBin returns [EObject current=null] : iv_ruleFodaBin= ruleFodaBin EOF ;
    public final EObject entryRuleFodaBin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFodaBin = null;


        try {
            // InternalPLhlcl.g:1067:48: (iv_ruleFodaBin= ruleFodaBin EOF )
            // InternalPLhlcl.g:1068:2: iv_ruleFodaBin= ruleFodaBin EOF
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
    // InternalPLhlcl.g:1074:1: ruleFodaBin returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleFodaBin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:1080:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalPLhlcl.g:1081:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalPLhlcl.g:1081:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalPLhlcl.g:1082:3: ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalPLhlcl.g:1082:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLhlcl.g:1083:4: (otherlv_0= RULE_ID )
            {
            // InternalPLhlcl.g:1083:4: (otherlv_0= RULE_ID )
            // InternalPLhlcl.g:1084:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaBinRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getFodaBinAccess().getVar1VarDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalPLhlcl.g:1095:3: ( (lv_op_1_0= ruleBinOp ) )
            // InternalPLhlcl.g:1096:4: (lv_op_1_0= ruleBinOp )
            {
            // InternalPLhlcl.g:1096:4: (lv_op_1_0= ruleBinOp )
            // InternalPLhlcl.g:1097:5: lv_op_1_0= ruleBinOp
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
            						"org.xtext.PLhlcl.BinOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPLhlcl.g:1114:3: ( (otherlv_2= RULE_ID ) )
            // InternalPLhlcl.g:1115:4: (otherlv_2= RULE_ID )
            {
            // InternalPLhlcl.g:1115:4: (otherlv_2= RULE_ID )
            // InternalPLhlcl.g:1116:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaBinRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getFodaBinAccess().getVar2VarDeclarationCrossReference_2_0());
            				

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


    // $ANTLR start "entryRuleStructural"
    // InternalPLhlcl.g:1131:1: entryRuleStructural returns [EObject current=null] : iv_ruleStructural= ruleStructural EOF ;
    public final EObject entryRuleStructural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructural = null;


        try {
            // InternalPLhlcl.g:1131:51: (iv_ruleStructural= ruleStructural EOF )
            // InternalPLhlcl.g:1132:2: iv_ruleStructural= ruleStructural EOF
            {
             newCompositeNode(grammarAccess.getStructuralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructural=ruleStructural();

            state._fsp--;

             current =iv_ruleStructural; 
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
    // $ANTLR end "entryRuleStructural"


    // $ANTLR start "ruleStructural"
    // InternalPLhlcl.g:1138:1: ruleStructural returns [EObject current=null] : (otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_group_3_0= ruleListOfIDs ) ) (otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) )? otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) )? otherlv_9= ']' )? ) ;
    public final EObject ruleStructural() throws RecognitionException {
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
            // InternalPLhlcl.g:1144:2: ( (otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_group_3_0= ruleListOfIDs ) ) (otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) )? otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) )? otherlv_9= ']' )? ) )
            // InternalPLhlcl.g:1145:2: (otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_group_3_0= ruleListOfIDs ) ) (otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) )? otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) )? otherlv_9= ']' )? )
            {
            // InternalPLhlcl.g:1145:2: (otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_group_3_0= ruleListOfIDs ) ) (otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) )? otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) )? otherlv_9= ']' )? )
            // InternalPLhlcl.g:1146:3: otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' ( (lv_group_3_0= ruleListOfIDs ) ) (otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) )? otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) )? otherlv_9= ']' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStructuralAccess().getStructuralKeyword_0());
            		
            // InternalPLhlcl.g:1150:3: ( (lv_parent_1_0= RULE_ID ) )
            // InternalPLhlcl.g:1151:4: (lv_parent_1_0= RULE_ID )
            {
            // InternalPLhlcl.g:1151:4: (lv_parent_1_0= RULE_ID )
            // InternalPLhlcl.g:1152:5: lv_parent_1_0= RULE_ID
            {
            lv_parent_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_parent_1_0, grammarAccess.getStructuralAccess().getParentIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructuralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parent",
            						lv_parent_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStructuralAccess().getVariantsKeyword_2());
            		
            // InternalPLhlcl.g:1172:3: ( (lv_group_3_0= ruleListOfIDs ) )
            // InternalPLhlcl.g:1173:4: (lv_group_3_0= ruleListOfIDs )
            {
            // InternalPLhlcl.g:1173:4: (lv_group_3_0= ruleListOfIDs )
            // InternalPLhlcl.g:1174:5: lv_group_3_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getStructuralAccess().getGroupListOfIDsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_group_3_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructuralRule());
            					}
            					set(
            						current,
            						"group",
            						lv_group_3_0,
            						"org.xtext.PLhlcl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPLhlcl.g:1191:3: (otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) )? otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) )? otherlv_9= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPLhlcl.g:1192:4: otherlv_4= 'card:' otherlv_5= '[' ( (lv_min_6_0= RULE_INT ) )? otherlv_7= ',' ( (lv_max_8_0= RULE_INT ) )? otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getStructuralAccess().getCardKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalPLhlcl.g:1200:4: ( (lv_min_6_0= RULE_INT ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_INT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPLhlcl.g:1201:5: (lv_min_6_0= RULE_INT )
                            {
                            // InternalPLhlcl.g:1201:5: (lv_min_6_0= RULE_INT )
                            // InternalPLhlcl.g:1202:6: lv_min_6_0= RULE_INT
                            {
                            lv_min_6_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                            						newLeafNode(lv_min_6_0, grammarAccess.getStructuralAccess().getMinINTTerminalRuleCall_4_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getStructuralRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"min",
                            							lv_min_6_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getStructuralAccess().getCommaKeyword_4_3());
                    			
                    // InternalPLhlcl.g:1222:4: ( (lv_max_8_0= RULE_INT ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalPLhlcl.g:1223:5: (lv_max_8_0= RULE_INT )
                            {
                            // InternalPLhlcl.g:1223:5: (lv_max_8_0= RULE_INT )
                            // InternalPLhlcl.g:1224:6: lv_max_8_0= RULE_INT
                            {
                            lv_max_8_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                            						newLeafNode(lv_max_8_0, grammarAccess.getStructuralAccess().getMaxINTTerminalRuleCall_4_4_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getStructuralRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"max",
                            							lv_max_8_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_4_5());
                    			

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
    // $ANTLR end "ruleStructural"


    // $ANTLR start "entryRuleValue"
    // InternalPLhlcl.g:1249:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalPLhlcl.g:1249:45: (iv_ruleValue= ruleValue EOF )
            // InternalPLhlcl.g:1250:2: iv_ruleValue= ruleValue EOF
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
    // InternalPLhlcl.g:1256:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1262:2: ( (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' ) )
            // InternalPLhlcl.g:1263:2: (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' )
            {
            // InternalPLhlcl.g:1263:2: (this_INT_0= RULE_INT | kw= 'selected' | kw= 'unselected' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPLhlcl.g:1264:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:1272:3: kw= 'selected'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValueAccess().getSelectedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:1278:3: kw= 'unselected'
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
    // InternalPLhlcl.g:1287:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalPLhlcl.g:1287:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalPLhlcl.g:1288:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalPLhlcl.g:1294:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' ) ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1300:2: ( (kw= 'boolean' | kw= 'integer' ) )
            // InternalPLhlcl.g:1301:2: (kw= 'boolean' | kw= 'integer' )
            {
            // InternalPLhlcl.g:1301:2: (kw= 'boolean' | kw= 'integer' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPLhlcl.g:1302:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:1308:3: kw= 'integer'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getIntegerKeyword_1());
                    		

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
    // InternalPLhlcl.g:1317:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalPLhlcl.g:1317:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalPLhlcl.g:1318:2: iv_ruleListOfValues= ruleListOfValues EOF
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
    // InternalPLhlcl.g:1324:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_values_0_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:1330:2: ( ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) )
            // InternalPLhlcl.g:1331:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            {
            // InternalPLhlcl.g:1331:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            // InternalPLhlcl.g:1332:3: ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            {
            // InternalPLhlcl.g:1332:3: ( (lv_values_0_0= ruleValue ) )
            // InternalPLhlcl.g:1333:4: (lv_values_0_0= ruleValue )
            {
            // InternalPLhlcl.g:1333:4: (lv_values_0_0= ruleValue )
            // InternalPLhlcl.g:1334:5: lv_values_0_0= ruleValue
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
            						"org.xtext.PLhlcl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPLhlcl.g:1351:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPLhlcl.g:1352:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) )
            	    {
            	    // InternalPLhlcl.g:1352:4: (otherlv_1= ',' )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==16) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalPLhlcl.g:1353:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,16,FOLLOW_31); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    // InternalPLhlcl.g:1358:4: ( (lv_values_2_0= ruleValue ) )
            	    // InternalPLhlcl.g:1359:5: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalPLhlcl.g:1359:5: (lv_values_2_0= ruleValue )
            	    // InternalPLhlcl.g:1360:6: lv_values_2_0= ruleValue
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
            	    							"org.xtext.PLhlcl.Value");
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
    // $ANTLR end "ruleListOfValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalPLhlcl.g:1382:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalPLhlcl.g:1382:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalPLhlcl.g:1383:2: iv_ruleListOfIDs= ruleListOfIDs EOF
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
    // InternalPLhlcl.g:1389:1: ruleListOfIDs returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1395:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalPLhlcl.g:1396:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalPLhlcl.g:1396:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            // InternalPLhlcl.g:1397:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalPLhlcl.g:1397:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLhlcl.g:1398:4: (otherlv_0= RULE_ID )
            {
            // InternalPLhlcl.g:1398:4: (otherlv_0= RULE_ID )
            // InternalPLhlcl.g:1399:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfIDsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_0, grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalPLhlcl.g:1410:3: ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPLhlcl.g:1411:4: (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) )
            	    {
            	    // InternalPLhlcl.g:1411:4: (otherlv_1= ',' )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==16) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalPLhlcl.g:1412:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,16,FOLLOW_32); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    // InternalPLhlcl.g:1417:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalPLhlcl.g:1418:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalPLhlcl.g:1418:5: (otherlv_2= RULE_ID )
            	    // InternalPLhlcl.g:1419:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfIDsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    						newLeafNode(otherlv_2, grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_1_1_0());
            	    					

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
    // InternalPLhlcl.g:1435:1: entryRuleBinOp returns [String current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final String entryRuleBinOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinOp = null;


        try {
            // InternalPLhlcl.g:1435:45: (iv_ruleBinOp= ruleBinOp EOF )
            // InternalPLhlcl.g:1436:2: iv_ruleBinOp= ruleBinOp EOF
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
    // InternalPLhlcl.g:1442:1: ruleBinOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' ) ;
    public final AntlrDatatypeRuleToken ruleBinOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1448:2: ( (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' ) )
            // InternalPLhlcl.g:1449:2: (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' )
            {
            // InternalPLhlcl.g:1449:2: (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt21=1;
                }
                break;
            case 35:
                {
                alt21=2;
                }
                break;
            case 36:
                {
                alt21=3;
                }
                break;
            case 37:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalPLhlcl.g:1450:3: kw= 'requires'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getRequiresKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:1456:3: kw= 'excludes'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getExcludesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:1462:3: kw= 'optional'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getOptionalKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPLhlcl.g:1468:3: kw= 'mandatory'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getMandatoryKeyword_3());
                    		

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
    // InternalPLhlcl.g:1477:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // InternalPLhlcl.g:1477:47: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalPLhlcl.g:1478:2: iv_ruleUnaryOp= ruleUnaryOp EOF
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
    // InternalPLhlcl.g:1484:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'optional' | kw= 'mandatory' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1490:2: ( (kw= 'optional' | kw= 'mandatory' ) )
            // InternalPLhlcl.g:1491:2: (kw= 'optional' | kw= 'mandatory' )
            {
            // InternalPLhlcl.g:1491:2: (kw= 'optional' | kw= 'mandatory' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==37) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPLhlcl.g:1492:3: kw= 'optional'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getOptionalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:1498:3: kw= 'mandatory'
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000030000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000030000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000C0008020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000012200010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000C0010020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010010L});

}