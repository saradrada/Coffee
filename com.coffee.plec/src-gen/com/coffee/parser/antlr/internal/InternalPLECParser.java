package com.coffee.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.coffee.services.PLECGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPLECParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'variables:'", "'constraints:'", "'instantiable'", "'['", "','", "']'", "'values:'", "'..'", "':'", "'('", "')'", "'structural:'", "'variants:'", "'card:'", "'attributes:'", "'of'", "'is'", "'in'", "'vars:'", "'root'", "'-->'", "'requires'", "'selected'", "'unselected'", "'boolean'", "'integer'", "'symbolic'", "'excludes'", "'optional'", "'mandatory'", "'always'", "'next'", "'eventually'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPLECParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPLECParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPLECParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPLEC.g"; }



     	private PLECGrammarAccess grammarAccess;

        public InternalPLECParser(TokenStream input, PLECGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PLECGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPLEC.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPLEC.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPLEC.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalPLEC.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* ) ;
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
            // InternalPLEC.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* ) )
            // InternalPLEC.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* )
            {
            // InternalPLEC.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* )
            // InternalPLEC.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalPLEC.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPLEC.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPLEC.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalPLEC.g:85:5: lv_name_1_0= RULE_ID
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
            		
            // InternalPLEC.g:105:3: ( (lv_vars_3_0= ruleVarDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=36 && LA1_0<=38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPLEC.g:106:4: (lv_vars_3_0= ruleVarDeclaration )
            	    {
            	    // InternalPLEC.g:106:4: (lv_vars_3_0= ruleVarDeclaration )
            	    // InternalPLEC.g:107:5: lv_vars_3_0= ruleVarDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_vars_3_0=ruleVarDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_3_0,
            	    						"com.coffee.PLEC.VarDeclaration");
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
            		
            // InternalPLEC.g:128:3: ( (lv_constraints_5_0= ruleConstraint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPLEC.g:129:4: (lv_constraints_5_0= ruleConstraint )
            	    {
            	    // InternalPLEC.g:129:4: (lv_constraints_5_0= ruleConstraint )
            	    // InternalPLEC.g:130:5: lv_constraints_5_0= ruleConstraint
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
            	    						"com.coffee.PLEC.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalPLEC.g:151:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalPLEC.g:151:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalPLEC.g:152:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalPLEC.g:158:1: ruleVarDeclaration returns [EObject current=null] : ( ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )? ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_instantiable_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        EObject lv_min_2_0 = null;

        EObject lv_max_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;

        EObject lv_variants_9_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:164:2: ( ( ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )? ) )
            // InternalPLEC.g:165:2: ( ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )? )
            {
            // InternalPLEC.g:165:2: ( ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )? )
            // InternalPLEC.g:166:3: ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )?
            {
            // InternalPLEC.g:166:3: ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPLEC.g:167:4: ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']'
                    {
                    // InternalPLEC.g:167:4: ( (lv_instantiable_0_0= 'instantiable' ) )
                    // InternalPLEC.g:168:5: (lv_instantiable_0_0= 'instantiable' )
                    {
                    // InternalPLEC.g:168:5: (lv_instantiable_0_0= 'instantiable' )
                    // InternalPLEC.g:169:6: lv_instantiable_0_0= 'instantiable'
                    {
                    lv_instantiable_0_0=(Token)match(input,14,FOLLOW_7); 

                    						newLeafNode(lv_instantiable_0_0, grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "instantiable", lv_instantiable_0_0, "instantiable");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalPLEC.g:185:4: ( (lv_min_2_0= ruleNumber ) )
                    // InternalPLEC.g:186:5: (lv_min_2_0= ruleNumber )
                    {
                    // InternalPLEC.g:186:5: (lv_min_2_0= ruleNumber )
                    // InternalPLEC.g:187:6: lv_min_2_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getMinNumberParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_min_2_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_2_0,
                    							"com.coffee.PLEC.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_3());
                    			
                    // InternalPLEC.g:208:4: ( (lv_max_4_0= ruleNumber ) )
                    // InternalPLEC.g:209:5: (lv_max_4_0= ruleNumber )
                    {
                    // InternalPLEC.g:209:5: (lv_max_4_0= ruleNumber )
                    // InternalPLEC.g:210:6: lv_max_4_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getMaxNumberParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_max_4_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"max",
                    							lv_max_4_0,
                    							"com.coffee.PLEC.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getVarDeclarationAccess().getRightSquareBracketKeyword_0_5());
                    			

                    }
                    break;

            }

            // InternalPLEC.g:232:3: ( (lv_type_6_0= ruleVarType ) )
            // InternalPLEC.g:233:4: (lv_type_6_0= ruleVarType )
            {
            // InternalPLEC.g:233:4: (lv_type_6_0= ruleVarType )
            // InternalPLEC.g:234:5: lv_type_6_0= ruleVarType
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
            						"com.coffee.PLEC.VarType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPLEC.g:251:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalPLEC.g:252:4: (lv_name_7_0= RULE_ID )
            {
            // InternalPLEC.g:252:4: (lv_name_7_0= RULE_ID )
            // InternalPLEC.g:253:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalPLEC.g:269:3: (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPLEC.g:270:4: otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getVarDeclarationAccess().getValuesKeyword_3_0());
                    			
                    // InternalPLEC.g:274:4: ( (lv_variants_9_0= ruleVariantDeclaration ) )
                    // InternalPLEC.g:275:5: (lv_variants_9_0= ruleVariantDeclaration )
                    {
                    // InternalPLEC.g:275:5: (lv_variants_9_0= ruleVariantDeclaration )
                    // InternalPLEC.g:276:6: lv_variants_9_0= ruleVariantDeclaration
                    {

                    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_3_1_0());
                    					
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
                    							"com.coffee.PLEC.VariantDeclaration");
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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVariantDeclaration"
    // InternalPLEC.g:298:1: entryRuleVariantDeclaration returns [EObject current=null] : iv_ruleVariantDeclaration= ruleVariantDeclaration EOF ;
    public final EObject entryRuleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantDeclaration = null;


        try {
            // InternalPLEC.g:298:59: (iv_ruleVariantDeclaration= ruleVariantDeclaration EOF )
            // InternalPLEC.g:299:2: iv_ruleVariantDeclaration= ruleVariantDeclaration EOF
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
    // InternalPLEC.g:305:1: ruleVariantDeclaration returns [EObject current=null] : (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration ) ;
    public final EObject ruleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariantsInterval_0 = null;

        EObject this_VariantsEnumeration_1 = null;



        	enterRule();

        try {
            // InternalPLEC.g:311:2: ( (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration ) )
            // InternalPLEC.g:312:2: (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration )
            {
            // InternalPLEC.g:312:2: (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPLEC.g:313:3: this_VariantsInterval_0= ruleVariantsInterval
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
                    // InternalPLEC.g:322:3: this_VariantsEnumeration_1= ruleVariantsEnumeration
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
    // InternalPLEC.g:334:1: entryRuleVariantsInterval returns [EObject current=null] : iv_ruleVariantsInterval= ruleVariantsInterval EOF ;
    public final EObject entryRuleVariantsInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantsInterval = null;


        try {
            // InternalPLEC.g:334:57: (iv_ruleVariantsInterval= ruleVariantsInterval EOF )
            // InternalPLEC.g:335:2: iv_ruleVariantsInterval= ruleVariantsInterval EOF
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
    // InternalPLEC.g:341:1: ruleVariantsInterval returns [EObject current=null] : ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) ) ;
    public final EObject ruleVariantsInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:347:2: ( ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) ) )
            // InternalPLEC.g:348:2: ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) )
            {
            // InternalPLEC.g:348:2: ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) )
            // InternalPLEC.g:349:3: ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) )
            {
            // InternalPLEC.g:349:3: ( (lv_start_0_0= ruleNumber ) )
            // InternalPLEC.g:350:4: (lv_start_0_0= ruleNumber )
            {
            // InternalPLEC.g:350:4: (lv_start_0_0= ruleNumber )
            // InternalPLEC.g:351:5: lv_start_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getVariantsIntervalAccess().getStartNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_start_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantsIntervalRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_0_0,
            						"com.coffee.PLEC.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantsIntervalAccess().getFullStopFullStopKeyword_1());
            		
            // InternalPLEC.g:372:3: ( (lv_end_2_0= ruleNumber ) )
            // InternalPLEC.g:373:4: (lv_end_2_0= ruleNumber )
            {
            // InternalPLEC.g:373:4: (lv_end_2_0= ruleNumber )
            // InternalPLEC.g:374:5: lv_end_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getVariantsIntervalAccess().getEndNumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantsIntervalRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_2_0,
            						"com.coffee.PLEC.Number");
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
    // InternalPLEC.g:395:1: entryRuleVariantsEnumeration returns [EObject current=null] : iv_ruleVariantsEnumeration= ruleVariantsEnumeration EOF ;
    public final EObject entryRuleVariantsEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantsEnumeration = null;


        try {
            // InternalPLEC.g:395:60: (iv_ruleVariantsEnumeration= ruleVariantsEnumeration EOF )
            // InternalPLEC.g:396:2: iv_ruleVariantsEnumeration= ruleVariantsEnumeration EOF
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
    // InternalPLEC.g:402:1: ruleVariantsEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleVariantsEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:408:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalPLEC.g:409:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalPLEC.g:409:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalPLEC.g:410:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPLEC.g:414:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalPLEC.g:415:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalPLEC.g:415:4: (lv_list_1_0= ruleListOfValues )
            // InternalPLEC.g:416:5: lv_list_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getVariantsEnumerationAccess().getListListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_list_1_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantsEnumerationRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_1_0,
            						"com.coffee.PLEC.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_2());
            		

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
    // InternalPLEC.g:441:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalPLEC.g:441:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalPLEC.g:442:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalPLEC.g:448:1: ruleConstraint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:454:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) )
            // InternalPLEC.g:455:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            {
            // InternalPLEC.g:455:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            // InternalPLEC.g:456:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) )
            {
            // InternalPLEC.g:456:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPLEC.g:457:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPLEC.g:457:4: (lv_name_0_0= RULE_ID )
            // InternalPLEC.g:458:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getColonKeyword_1());
            		
            // InternalPLEC.g:478:3: ( (lv_exp_2_0= ruleConsExpression ) )
            // InternalPLEC.g:479:4: (lv_exp_2_0= ruleConsExpression )
            {
            // InternalPLEC.g:479:4: (lv_exp_2_0= ruleConsExpression )
            // InternalPLEC.g:480:5: lv_exp_2_0= ruleConsExpression
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
            						"com.coffee.PLEC.ConsExpression");
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
    // InternalPLEC.g:501:1: entryRuleConsExpression returns [EObject current=null] : iv_ruleConsExpression= ruleConsExpression EOF ;
    public final EObject entryRuleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsExpression = null;


        try {
            // InternalPLEC.g:501:55: (iv_ruleConsExpression= ruleConsExpression EOF )
            // InternalPLEC.g:502:2: iv_ruleConsExpression= ruleConsExpression EOF
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
    // InternalPLEC.g:508:1: ruleConsExpression returns [EObject current=null] : (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN | this_Attributes_6= ruleAttributes | this_Temporal_7= ruleTemporal | this_Quantifiable_8= ruleQuantifiable ) ;
    public final EObject ruleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IDCons_0 = null;

        EObject this_Refinement_1 = null;

        EObject this_Rule_2 = null;

        EObject this_FodaBin_3 = null;

        EObject this_Structural_4 = null;

        EObject this_FodaUN_5 = null;

        EObject this_Attributes_6 = null;

        EObject this_Temporal_7 = null;

        EObject this_Quantifiable_8 = null;



        	enterRule();

        try {
            // InternalPLEC.g:514:2: ( (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN | this_Attributes_6= ruleAttributes | this_Temporal_7= ruleTemporal | this_Quantifiable_8= ruleQuantifiable ) )
            // InternalPLEC.g:515:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN | this_Attributes_6= ruleAttributes | this_Temporal_7= ruleTemporal | this_Quantifiable_8= ruleQuantifiable )
            {
            // InternalPLEC.g:515:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN | this_Attributes_6= ruleAttributes | this_Temporal_7= ruleTemporal | this_Quantifiable_8= ruleQuantifiable )
            int alt6=9;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalPLEC.g:516:3: this_IDCons_0= ruleIDCons
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
                    // InternalPLEC.g:525:3: this_Refinement_1= ruleRefinement
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
                    // InternalPLEC.g:534:3: this_Rule_2= ruleRule
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
                    // InternalPLEC.g:543:3: this_FodaBin_3= ruleFodaBin
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
                    // InternalPLEC.g:552:3: this_Structural_4= ruleStructural
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
                    // InternalPLEC.g:561:3: this_FodaUN_5= ruleFodaUN
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getFodaUNParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FodaUN_5=ruleFodaUN();

                    state._fsp--;


                    			current = this_FodaUN_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPLEC.g:570:3: this_Attributes_6= ruleAttributes
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getAttributesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attributes_6=ruleAttributes();

                    state._fsp--;


                    			current = this_Attributes_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPLEC.g:579:3: this_Temporal_7= ruleTemporal
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getTemporalParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Temporal_7=ruleTemporal();

                    state._fsp--;


                    			current = this_Temporal_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalPLEC.g:588:3: this_Quantifiable_8= ruleQuantifiable
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getQuantifiableParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Quantifiable_8=ruleQuantifiable();

                    state._fsp--;


                    			current = this_Quantifiable_8;
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
    // InternalPLEC.g:600:1: entryRuleTerminalExp returns [EObject current=null] : iv_ruleTerminalExp= ruleTerminalExp EOF ;
    public final EObject entryRuleTerminalExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExp = null;


        try {
            // InternalPLEC.g:600:52: (iv_ruleTerminalExp= ruleTerminalExp EOF )
            // InternalPLEC.g:601:2: iv_ruleTerminalExp= ruleTerminalExp EOF
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
    // InternalPLEC.g:607:1: ruleTerminalExp returns [EObject current=null] : ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons ) ;
    public final EObject ruleTerminalExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConsExpression_1 = null;

        EObject this_IDCons_3 = null;



        	enterRule();

        try {
            // InternalPLEC.g:613:2: ( ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons ) )
            // InternalPLEC.g:614:2: ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons )
            {
            // InternalPLEC.g:614:2: ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
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
                    // InternalPLEC.g:615:3: (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' )
                    {
                    // InternalPLEC.g:615:3: (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' )
                    // InternalPLEC.g:616:4: otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpAccess().getConsExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_18);
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
                    // InternalPLEC.g:634:3: this_IDCons_3= ruleIDCons
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
    // InternalPLEC.g:646:1: entryRuleIDCons returns [EObject current=null] : iv_ruleIDCons= ruleIDCons EOF ;
    public final EObject entryRuleIDCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDCons = null;


        try {
            // InternalPLEC.g:646:47: (iv_ruleIDCons= ruleIDCons EOF )
            // InternalPLEC.g:647:2: iv_ruleIDCons= ruleIDCons EOF
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
    // InternalPLEC.g:653:1: ruleIDCons returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleIDCons() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPLEC.g:659:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPLEC.g:660:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPLEC.g:660:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPLEC.g:661:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPLEC.g:661:3: (lv_name_0_0= RULE_ID )
            // InternalPLEC.g:662:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleStructural"
    // InternalPLEC.g:681:1: entryRuleStructural returns [EObject current=null] : iv_ruleStructural= ruleStructural EOF ;
    public final EObject entryRuleStructural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructural = null;


        try {
            // InternalPLEC.g:681:51: (iv_ruleStructural= ruleStructural EOF )
            // InternalPLEC.g:682:2: iv_ruleStructural= ruleStructural EOF
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
    // InternalPLEC.g:688:1: ruleStructural returns [EObject current=null] : (otherlv_0= 'structural:' ( ( ruleParent ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )? ) ;
    public final EObject ruleStructural() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_group_4_0 = null;

        EObject lv_min_8_0 = null;

        EObject lv_max_10_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:694:2: ( (otherlv_0= 'structural:' ( ( ruleParent ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )? ) )
            // InternalPLEC.g:695:2: (otherlv_0= 'structural:' ( ( ruleParent ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )? )
            {
            // InternalPLEC.g:695:2: (otherlv_0= 'structural:' ( ( ruleParent ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )? )
            // InternalPLEC.g:696:3: otherlv_0= 'structural:' ( ( ruleParent ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStructuralAccess().getStructuralKeyword_0());
            		
            // InternalPLEC.g:700:3: ( ( ruleParent ) )
            // InternalPLEC.g:701:4: ( ruleParent )
            {
            // InternalPLEC.g:701:4: ( ruleParent )
            // InternalPLEC.g:702:5: ruleParent
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructuralRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStructuralAccess().getParentVarDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_19);
            ruleParent();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getStructuralAccess().getVariantsKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalPLEC.g:724:3: ( (lv_group_4_0= ruleListOfIDs ) )
            // InternalPLEC.g:725:4: (lv_group_4_0= ruleListOfIDs )
            {
            // InternalPLEC.g:725:4: (lv_group_4_0= ruleListOfIDs )
            // InternalPLEC.g:726:5: lv_group_4_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getStructuralAccess().getGroupListOfIDsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_group_4_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructuralRule());
            					}
            					set(
            						current,
            						"group",
            						lv_group_4_0,
            						"com.coffee.PLEC.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_5());
            		
            // InternalPLEC.g:747:3: (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPLEC.g:748:4: otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getStructuralAccess().getCardKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalPLEC.g:756:4: ( (lv_min_8_0= ruleNumber ) )
                    // InternalPLEC.g:757:5: (lv_min_8_0= ruleNumber )
                    {
                    // InternalPLEC.g:757:5: (lv_min_8_0= ruleNumber )
                    // InternalPLEC.g:758:6: lv_min_8_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getStructuralAccess().getMinNumberParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_min_8_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructuralRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_8_0,
                    							"com.coffee.PLEC.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getStructuralAccess().getCommaKeyword_6_3());
                    			
                    // InternalPLEC.g:779:4: ( (lv_max_10_0= ruleNumber ) )
                    // InternalPLEC.g:780:5: (lv_max_10_0= ruleNumber )
                    {
                    // InternalPLEC.g:780:5: (lv_max_10_0= ruleNumber )
                    // InternalPLEC.g:781:6: lv_max_10_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getStructuralAccess().getMaxNumberParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_max_10_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructuralRule());
                    						}
                    						set(
                    							current,
                    							"max",
                    							lv_max_10_0,
                    							"com.coffee.PLEC.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_6_5());
                    			

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


    // $ANTLR start "entryRuleParent"
    // InternalPLEC.g:807:1: entryRuleParent returns [String current=null] : iv_ruleParent= ruleParent EOF ;
    public final String entryRuleParent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParent = null;


        try {
            // InternalPLEC.g:807:46: (iv_ruleParent= ruleParent EOF )
            // InternalPLEC.g:808:2: iv_ruleParent= ruleParent EOF
            {
             newCompositeNode(grammarAccess.getParentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParent=ruleParent();

            state._fsp--;

             current =iv_ruleParent.getText(); 
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
    // $ANTLR end "entryRuleParent"


    // $ANTLR start "ruleParent"
    // InternalPLEC.g:814:1: ruleParent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleParent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalPLEC.g:820:2: (this_ID_0= RULE_ID )
            // InternalPLEC.g:821:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getParentAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleParent"


    // $ANTLR start "entryRuleAttributes"
    // InternalPLEC.g:831:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalPLEC.g:831:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalPLEC.g:832:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalPLEC.g:838:1: ruleAttributes returns [EObject current=null] : (otherlv_0= 'attributes:' otherlv_1= '[' ( (lv_att_2_0= ruleListOfIDs ) ) otherlv_3= ']' otherlv_4= 'of' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_att_2_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:844:2: ( (otherlv_0= 'attributes:' otherlv_1= '[' ( (lv_att_2_0= ruleListOfIDs ) ) otherlv_3= ']' otherlv_4= 'of' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPLEC.g:845:2: (otherlv_0= 'attributes:' otherlv_1= '[' ( (lv_att_2_0= ruleListOfIDs ) ) otherlv_3= ']' otherlv_4= 'of' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPLEC.g:845:2: (otherlv_0= 'attributes:' otherlv_1= '[' ( (lv_att_2_0= ruleListOfIDs ) ) otherlv_3= ']' otherlv_4= 'of' ( (otherlv_5= RULE_ID ) ) )
            // InternalPLEC.g:846:3: otherlv_0= 'attributes:' otherlv_1= '[' ( (lv_att_2_0= ruleListOfIDs ) ) otherlv_3= ']' otherlv_4= 'of' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributesAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPLEC.g:854:3: ( (lv_att_2_0= ruleListOfIDs ) )
            // InternalPLEC.g:855:4: (lv_att_2_0= ruleListOfIDs )
            {
            // InternalPLEC.g:855:4: (lv_att_2_0= ruleListOfIDs )
            // InternalPLEC.g:856:5: lv_att_2_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getAttributesAccess().getAttListOfIDsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_att_2_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributesRule());
            					}
            					set(
            						current,
            						"att",
            						lv_att_2_0,
            						"com.coffee.PLEC.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributesAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributesAccess().getOfKeyword_4());
            		
            // InternalPLEC.g:881:3: ( (otherlv_5= RULE_ID ) )
            // InternalPLEC.g:882:4: (otherlv_5= RULE_ID )
            {
            // InternalPLEC.g:882:4: (otherlv_5= RULE_ID )
            // InternalPLEC.g:883:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributesRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getAttributesAccess().getVar1VarDeclarationCrossReference_5_0());
            				

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
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleRefinement"
    // InternalPLEC.g:898:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // InternalPLEC.g:898:51: (iv_ruleRefinement= ruleRefinement EOF )
            // InternalPLEC.g:899:2: iv_ruleRefinement= ruleRefinement EOF
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
    // InternalPLEC.g:905:1: ruleRefinement returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement | this_RootRefinement_3= ruleRootRefinement ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_VarRefinement_1 = null;

        EObject this_SetRefinement_2 = null;

        EObject this_RootRefinement_3 = null;



        	enterRule();

        try {
            // InternalPLEC.g:911:2: ( (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement | this_RootRefinement_3= ruleRootRefinement ) )
            // InternalPLEC.g:912:2: (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement | this_RootRefinement_3= ruleRootRefinement )
            {
            // InternalPLEC.g:912:2: (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement | this_RootRefinement_3= ruleRootRefinement )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==28) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==31) ) {
                        alt9=4;
                    }
                    else if ( ((LA9_3>=RULE_ID && LA9_3<=RULE_INT)||(LA9_3>=34 && LA9_3<=35)) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_1==29) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==30) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPLEC.g:913:3: this_Assignment_0= ruleAssignment
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
                    // InternalPLEC.g:922:3: this_VarRefinement_1= ruleVarRefinement
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
                    // InternalPLEC.g:931:3: this_SetRefinement_2= ruleSetRefinement
                    {

                    			newCompositeNode(grammarAccess.getRefinementAccess().getSetRefinementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetRefinement_2=ruleSetRefinement();

                    state._fsp--;


                    			current = this_SetRefinement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPLEC.g:940:3: this_RootRefinement_3= ruleRootRefinement
                    {

                    			newCompositeNode(grammarAccess.getRefinementAccess().getRootRefinementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RootRefinement_3=ruleRootRefinement();

                    state._fsp--;


                    			current = this_RootRefinement_3;
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
    // InternalPLEC.g:952:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalPLEC.g:952:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalPLEC.g:953:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalPLEC.g:959:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_valu_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_valu_2_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:965:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_valu_2_0= ruleValue ) ) ) )
            // InternalPLEC.g:966:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_valu_2_0= ruleValue ) ) )
            {
            // InternalPLEC.g:966:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_valu_2_0= ruleValue ) ) )
            // InternalPLEC.g:967:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_valu_2_0= ruleValue ) )
            {
            // InternalPLEC.g:967:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLEC.g:968:4: (otherlv_0= RULE_ID )
            {
            // InternalPLEC.g:968:4: (otherlv_0= RULE_ID )
            // InternalPLEC.g:969:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getVariableVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getIsKeyword_1());
            		
            // InternalPLEC.g:984:3: ( (lv_valu_2_0= ruleValue ) )
            // InternalPLEC.g:985:4: (lv_valu_2_0= ruleValue )
            {
            // InternalPLEC.g:985:4: (lv_valu_2_0= ruleValue )
            // InternalPLEC.g:986:5: lv_valu_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValuValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valu_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"valu",
            						lv_valu_2_0,
            						"com.coffee.PLEC.Value");
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
    // InternalPLEC.g:1007:1: entryRuleVarRefinement returns [EObject current=null] : iv_ruleVarRefinement= ruleVarRefinement EOF ;
    public final EObject entryRuleVarRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefinement = null;


        try {
            // InternalPLEC.g:1007:54: (iv_ruleVarRefinement= ruleVarRefinement EOF )
            // InternalPLEC.g:1008:2: iv_ruleVarRefinement= ruleVarRefinement EOF
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
    // InternalPLEC.g:1014:1: ruleVarRefinement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) ) ;
    public final EObject ruleVarRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1020:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) ) )
            // InternalPLEC.g:1021:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) )
            {
            // InternalPLEC.g:1021:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) )
            // InternalPLEC.g:1022:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) )
            {
            // InternalPLEC.g:1022:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLEC.g:1023:4: (otherlv_0= RULE_ID )
            {
            // InternalPLEC.g:1023:4: (otherlv_0= RULE_ID )
            // InternalPLEC.g:1024:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRefinementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getVarRefinementAccess().getVarVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVarRefinementAccess().getInKeyword_1());
            		
            // InternalPLEC.g:1039:3: ( (lv_values_2_0= ruleVariantDeclaration ) )
            // InternalPLEC.g:1040:4: (lv_values_2_0= ruleVariantDeclaration )
            {
            // InternalPLEC.g:1040:4: (lv_values_2_0= ruleVariantDeclaration )
            // InternalPLEC.g:1041:5: lv_values_2_0= ruleVariantDeclaration
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
            						"com.coffee.PLEC.VariantDeclaration");
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
    // InternalPLEC.g:1062:1: entryRuleSetRefinement returns [EObject current=null] : iv_ruleSetRefinement= ruleSetRefinement EOF ;
    public final EObject entryRuleSetRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRefinement = null;


        try {
            // InternalPLEC.g:1062:54: (iv_ruleSetRefinement= ruleSetRefinement EOF )
            // InternalPLEC.g:1063:2: iv_ruleSetRefinement= ruleSetRefinement EOF
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
    // InternalPLEC.g:1069:1: ruleSetRefinement returns [EObject current=null] : (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants:' otherlv_5= '[' ( (lv_list_6_0= ruleListOfListsOfValues ) ) otherlv_7= ']' ) ;
    public final EObject ruleSetRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_vars_2_0 = null;

        EObject lv_list_6_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1075:2: ( (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants:' otherlv_5= '[' ( (lv_list_6_0= ruleListOfListsOfValues ) ) otherlv_7= ']' ) )
            // InternalPLEC.g:1076:2: (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants:' otherlv_5= '[' ( (lv_list_6_0= ruleListOfListsOfValues ) ) otherlv_7= ']' )
            {
            // InternalPLEC.g:1076:2: (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants:' otherlv_5= '[' ( (lv_list_6_0= ruleListOfListsOfValues ) ) otherlv_7= ']' )
            // InternalPLEC.g:1077:3: otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants:' otherlv_5= '[' ( (lv_list_6_0= ruleListOfListsOfValues ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSetRefinementAccess().getVarsKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPLEC.g:1085:3: ( (lv_vars_2_0= ruleListOfIDs ) )
            // InternalPLEC.g:1086:4: (lv_vars_2_0= ruleListOfIDs )
            {
            // InternalPLEC.g:1086:4: (lv_vars_2_0= ruleListOfIDs )
            // InternalPLEC.g:1087:5: lv_vars_2_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_vars_2_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRefinementRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_2_0,
            						"com.coffee.PLEC.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSetRefinementAccess().getVariantsKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalPLEC.g:1116:3: ( (lv_list_6_0= ruleListOfListsOfValues ) )
            // InternalPLEC.g:1117:4: (lv_list_6_0= ruleListOfListsOfValues )
            {
            // InternalPLEC.g:1117:4: (lv_list_6_0= ruleListOfListsOfValues )
            // InternalPLEC.g:1118:5: lv_list_6_0= ruleListOfListsOfValues
            {

            					newCompositeNode(grammarAccess.getSetRefinementAccess().getListListOfListsOfValuesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_list_6_0=ruleListOfListsOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRefinementRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_6_0,
            						"com.coffee.PLEC.ListOfListsOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleRootRefinement"
    // InternalPLEC.g:1143:1: entryRuleRootRefinement returns [EObject current=null] : iv_ruleRootRefinement= ruleRootRefinement EOF ;
    public final EObject entryRuleRootRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootRefinement = null;


        try {
            // InternalPLEC.g:1143:55: (iv_ruleRootRefinement= ruleRootRefinement EOF )
            // InternalPLEC.g:1144:2: iv_ruleRootRefinement= ruleRootRefinement EOF
            {
             newCompositeNode(grammarAccess.getRootRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootRefinement=ruleRootRefinement();

            state._fsp--;

             current =iv_ruleRootRefinement; 
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
    // $ANTLR end "entryRuleRootRefinement"


    // $ANTLR start "ruleRootRefinement"
    // InternalPLEC.g:1150:1: ruleRootRefinement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'root' ) ;
    public final EObject ruleRootRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPLEC.g:1156:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'root' ) )
            // InternalPLEC.g:1157:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'root' )
            {
            // InternalPLEC.g:1157:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'root' )
            // InternalPLEC.g:1158:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'root'
            {
            // InternalPLEC.g:1158:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLEC.g:1159:4: (otherlv_0= RULE_ID )
            {
            // InternalPLEC.g:1159:4: (otherlv_0= RULE_ID )
            // InternalPLEC.g:1160:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRootRefinementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getRootRefinementAccess().getVarVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getRootRefinementAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRootRefinementAccess().getRootKeyword_2());
            		

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
    // $ANTLR end "ruleRootRefinement"


    // $ANTLR start "entryRuleTemporal"
    // InternalPLEC.g:1183:1: entryRuleTemporal returns [EObject current=null] : iv_ruleTemporal= ruleTemporal EOF ;
    public final EObject entryRuleTemporal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporal = null;


        try {
            // InternalPLEC.g:1183:49: (iv_ruleTemporal= ruleTemporal EOF )
            // InternalPLEC.g:1184:2: iv_ruleTemporal= ruleTemporal EOF
            {
             newCompositeNode(grammarAccess.getTemporalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporal=ruleTemporal();

            state._fsp--;

             current =iv_ruleTemporal; 
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
    // $ANTLR end "entryRuleTemporal"


    // $ANTLR start "ruleTemporal"
    // InternalPLEC.g:1190:1: ruleTemporal returns [EObject current=null] : ( ( (lv_operator_0_0= ruleTempOP ) ) ( (lv_cons_1_0= ruleTerminalExp ) ) ) ;
    public final EObject ruleTemporal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_cons_1_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1196:2: ( ( ( (lv_operator_0_0= ruleTempOP ) ) ( (lv_cons_1_0= ruleTerminalExp ) ) ) )
            // InternalPLEC.g:1197:2: ( ( (lv_operator_0_0= ruleTempOP ) ) ( (lv_cons_1_0= ruleTerminalExp ) ) )
            {
            // InternalPLEC.g:1197:2: ( ( (lv_operator_0_0= ruleTempOP ) ) ( (lv_cons_1_0= ruleTerminalExp ) ) )
            // InternalPLEC.g:1198:3: ( (lv_operator_0_0= ruleTempOP ) ) ( (lv_cons_1_0= ruleTerminalExp ) )
            {
            // InternalPLEC.g:1198:3: ( (lv_operator_0_0= ruleTempOP ) )
            // InternalPLEC.g:1199:4: (lv_operator_0_0= ruleTempOP )
            {
            // InternalPLEC.g:1199:4: (lv_operator_0_0= ruleTempOP )
            // InternalPLEC.g:1200:5: lv_operator_0_0= ruleTempOP
            {

            					newCompositeNode(grammarAccess.getTemporalAccess().getOperatorTempOPParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_operator_0_0=ruleTempOP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemporalRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"com.coffee.PLEC.TempOP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPLEC.g:1217:3: ( (lv_cons_1_0= ruleTerminalExp ) )
            // InternalPLEC.g:1218:4: (lv_cons_1_0= ruleTerminalExp )
            {
            // InternalPLEC.g:1218:4: (lv_cons_1_0= ruleTerminalExp )
            // InternalPLEC.g:1219:5: lv_cons_1_0= ruleTerminalExp
            {

            					newCompositeNode(grammarAccess.getTemporalAccess().getConsTerminalExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cons_1_0=ruleTerminalExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemporalRule());
            					}
            					set(
            						current,
            						"cons",
            						lv_cons_1_0,
            						"com.coffee.PLEC.TerminalExp");
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
    // $ANTLR end "ruleTemporal"


    // $ANTLR start "entryRuleRule"
    // InternalPLEC.g:1240:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalPLEC.g:1240:45: (iv_ruleRule= ruleRule EOF )
            // InternalPLEC.g:1241:2: iv_ruleRule= ruleRule EOF
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
    // InternalPLEC.g:1247:1: ruleRule returns [EObject current=null] : ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_consequence_2_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1253:2: ( ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) ) )
            // InternalPLEC.g:1254:2: ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) )
            {
            // InternalPLEC.g:1254:2: ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) )
            // InternalPLEC.g:1255:3: ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) )
            {
            // InternalPLEC.g:1255:3: ( (lv_condition_0_0= ruleTerminalExp ) )
            // InternalPLEC.g:1256:4: (lv_condition_0_0= ruleTerminalExp )
            {
            // InternalPLEC.g:1256:4: (lv_condition_0_0= ruleTerminalExp )
            // InternalPLEC.g:1257:5: lv_condition_0_0= ruleTerminalExp
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionTerminalExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_condition_0_0=ruleTerminalExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"com.coffee.PLEC.TerminalExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalPLEC.g:1278:3: ( (lv_consequence_2_0= ruleTerminalExp ) )
            // InternalPLEC.g:1279:4: (lv_consequence_2_0= ruleTerminalExp )
            {
            // InternalPLEC.g:1279:4: (lv_consequence_2_0= ruleTerminalExp )
            // InternalPLEC.g:1280:5: lv_consequence_2_0= ruleTerminalExp
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
            						"com.coffee.PLEC.TerminalExp");
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
    // InternalPLEC.g:1301:1: entryRuleFodaUN returns [EObject current=null] : iv_ruleFodaUN= ruleFodaUN EOF ;
    public final EObject entryRuleFodaUN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFodaUN = null;


        try {
            // InternalPLEC.g:1301:47: (iv_ruleFodaUN= ruleFodaUN EOF )
            // InternalPLEC.g:1302:2: iv_ruleFodaUN= ruleFodaUN EOF
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
    // InternalPLEC.g:1308:1: ruleFodaUN returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) ) ;
    public final EObject ruleFodaUN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1314:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) ) )
            // InternalPLEC.g:1315:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) )
            {
            // InternalPLEC.g:1315:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) )
            // InternalPLEC.g:1316:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) )
            {
            // InternalPLEC.g:1316:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLEC.g:1317:4: (otherlv_0= RULE_ID )
            {
            // InternalPLEC.g:1317:4: (otherlv_0= RULE_ID )
            // InternalPLEC.g:1318:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaUNRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getFodaUNAccess().getVar1VarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getFodaUNAccess().getIsKeyword_1());
            		
            // InternalPLEC.g:1333:3: ( (lv_op_2_0= ruleUnaryOp ) )
            // InternalPLEC.g:1334:4: (lv_op_2_0= ruleUnaryOp )
            {
            // InternalPLEC.g:1334:4: (lv_op_2_0= ruleUnaryOp )
            // InternalPLEC.g:1335:5: lv_op_2_0= ruleUnaryOp
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
            						"com.coffee.PLEC.UnaryOp");
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
    // InternalPLEC.g:1356:1: entryRuleFodaBin returns [EObject current=null] : iv_ruleFodaBin= ruleFodaBin EOF ;
    public final EObject entryRuleFodaBin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFodaBin = null;


        try {
            // InternalPLEC.g:1356:48: (iv_ruleFodaBin= ruleFodaBin EOF )
            // InternalPLEC.g:1357:2: iv_ruleFodaBin= ruleFodaBin EOF
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
    // InternalPLEC.g:1363:1: ruleFodaBin returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleFodaBin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1369:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalPLEC.g:1370:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalPLEC.g:1370:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalPLEC.g:1371:3: ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalPLEC.g:1371:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLEC.g:1372:4: (otherlv_0= RULE_ID )
            {
            // InternalPLEC.g:1372:4: (otherlv_0= RULE_ID )
            // InternalPLEC.g:1373:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaBinRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_0, grammarAccess.getFodaBinAccess().getVar1VarDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalPLEC.g:1384:3: ( (lv_op_1_0= ruleBinOp ) )
            // InternalPLEC.g:1385:4: (lv_op_1_0= ruleBinOp )
            {
            // InternalPLEC.g:1385:4: (lv_op_1_0= ruleBinOp )
            // InternalPLEC.g:1386:5: lv_op_1_0= ruleBinOp
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
            						"com.coffee.PLEC.BinOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPLEC.g:1403:3: ( (otherlv_2= RULE_ID ) )
            // InternalPLEC.g:1404:4: (otherlv_2= RULE_ID )
            {
            // InternalPLEC.g:1404:4: (otherlv_2= RULE_ID )
            // InternalPLEC.g:1405:5: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRuleQuantifiable"
    // InternalPLEC.g:1420:1: entryRuleQuantifiable returns [EObject current=null] : iv_ruleQuantifiable= ruleQuantifiable EOF ;
    public final EObject entryRuleQuantifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiable = null;


        try {
            // InternalPLEC.g:1420:53: (iv_ruleQuantifiable= ruleQuantifiable EOF )
            // InternalPLEC.g:1421:2: iv_ruleQuantifiable= ruleQuantifiable EOF
            {
             newCompositeNode(grammarAccess.getQuantifiableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantifiable=ruleQuantifiable();

            state._fsp--;

             current =iv_ruleQuantifiable; 
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
    // $ANTLR end "entryRuleQuantifiable"


    // $ANTLR start "ruleQuantifiable"
    // InternalPLEC.g:1427:1: ruleQuantifiable returns [EObject current=null] : (otherlv_0= '[' ( (lv_minV1_1_0= ruleNumber ) ) otherlv_2= ',' ( (lv_maxV1_3_0= ruleNumber ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'requires' otherlv_7= '[' ( (lv_minV2_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_maxV2_10_0= ruleNumber ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) ) ) ;
    public final EObject ruleQuantifiable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_minV1_1_0 = null;

        EObject lv_maxV1_3_0 = null;

        EObject lv_minV2_8_0 = null;

        EObject lv_maxV2_10_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1433:2: ( (otherlv_0= '[' ( (lv_minV1_1_0= ruleNumber ) ) otherlv_2= ',' ( (lv_maxV1_3_0= ruleNumber ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'requires' otherlv_7= '[' ( (lv_minV2_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_maxV2_10_0= ruleNumber ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) ) ) )
            // InternalPLEC.g:1434:2: (otherlv_0= '[' ( (lv_minV1_1_0= ruleNumber ) ) otherlv_2= ',' ( (lv_maxV1_3_0= ruleNumber ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'requires' otherlv_7= '[' ( (lv_minV2_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_maxV2_10_0= ruleNumber ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) ) )
            {
            // InternalPLEC.g:1434:2: (otherlv_0= '[' ( (lv_minV1_1_0= ruleNumber ) ) otherlv_2= ',' ( (lv_maxV1_3_0= ruleNumber ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'requires' otherlv_7= '[' ( (lv_minV2_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_maxV2_10_0= ruleNumber ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) ) )
            // InternalPLEC.g:1435:3: otherlv_0= '[' ( (lv_minV1_1_0= ruleNumber ) ) otherlv_2= ',' ( (lv_maxV1_3_0= ruleNumber ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'requires' otherlv_7= '[' ( (lv_minV2_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_maxV2_10_0= ruleNumber ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getQuantifiableAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPLEC.g:1439:3: ( (lv_minV1_1_0= ruleNumber ) )
            // InternalPLEC.g:1440:4: (lv_minV1_1_0= ruleNumber )
            {
            // InternalPLEC.g:1440:4: (lv_minV1_1_0= ruleNumber )
            // InternalPLEC.g:1441:5: lv_minV1_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getQuantifiableAccess().getMinV1NumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_minV1_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifiableRule());
            					}
            					set(
            						current,
            						"minV1",
            						lv_minV1_1_0,
            						"com.coffee.PLEC.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getQuantifiableAccess().getCommaKeyword_2());
            		
            // InternalPLEC.g:1462:3: ( (lv_maxV1_3_0= ruleNumber ) )
            // InternalPLEC.g:1463:4: (lv_maxV1_3_0= ruleNumber )
            {
            // InternalPLEC.g:1463:4: (lv_maxV1_3_0= ruleNumber )
            // InternalPLEC.g:1464:5: lv_maxV1_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getQuantifiableAccess().getMaxV1NumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_maxV1_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifiableRule());
            					}
            					set(
            						current,
            						"maxV1",
            						lv_maxV1_3_0,
            						"com.coffee.PLEC.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getQuantifiableAccess().getRightSquareBracketKeyword_4());
            		
            // InternalPLEC.g:1485:3: ( (otherlv_5= RULE_ID ) )
            // InternalPLEC.g:1486:4: (otherlv_5= RULE_ID )
            {
            // InternalPLEC.g:1486:4: (otherlv_5= RULE_ID )
            // InternalPLEC.g:1487:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantifiableRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_5, grammarAccess.getQuantifiableAccess().getVar1VarDeclarationCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getQuantifiableAccess().getRequiresKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getQuantifiableAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalPLEC.g:1506:3: ( (lv_minV2_8_0= ruleNumber ) )
            // InternalPLEC.g:1507:4: (lv_minV2_8_0= ruleNumber )
            {
            // InternalPLEC.g:1507:4: (lv_minV2_8_0= ruleNumber )
            // InternalPLEC.g:1508:5: lv_minV2_8_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getQuantifiableAccess().getMinV2NumberParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_minV2_8_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifiableRule());
            					}
            					set(
            						current,
            						"minV2",
            						lv_minV2_8_0,
            						"com.coffee.PLEC.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getQuantifiableAccess().getCommaKeyword_9());
            		
            // InternalPLEC.g:1529:3: ( (lv_maxV2_10_0= ruleNumber ) )
            // InternalPLEC.g:1530:4: (lv_maxV2_10_0= ruleNumber )
            {
            // InternalPLEC.g:1530:4: (lv_maxV2_10_0= ruleNumber )
            // InternalPLEC.g:1531:5: lv_maxV2_10_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getQuantifiableAccess().getMaxV2NumberParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_maxV2_10_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifiableRule());
            					}
            					set(
            						current,
            						"maxV2",
            						lv_maxV2_10_0,
            						"com.coffee.PLEC.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getQuantifiableAccess().getRightSquareBracketKeyword_11());
            		
            // InternalPLEC.g:1552:3: ( (otherlv_12= RULE_ID ) )
            // InternalPLEC.g:1553:4: (otherlv_12= RULE_ID )
            {
            // InternalPLEC.g:1553:4: (otherlv_12= RULE_ID )
            // InternalPLEC.g:1554:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantifiableRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_12, grammarAccess.getQuantifiableAccess().getVar2VarDeclarationCrossReference_12_0());
            				

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
    // $ANTLR end "ruleQuantifiable"


    // $ANTLR start "entryRuleBoolVal"
    // InternalPLEC.g:1569:1: entryRuleBoolVal returns [EObject current=null] : iv_ruleBoolVal= ruleBoolVal EOF ;
    public final EObject entryRuleBoolVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVal = null;


        try {
            // InternalPLEC.g:1569:48: (iv_ruleBoolVal= ruleBoolVal EOF )
            // InternalPLEC.g:1570:2: iv_ruleBoolVal= ruleBoolVal EOF
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
    // InternalPLEC.g:1576:1: ruleBoolVal returns [EObject current=null] : ( ( (lv_value_0_1= 'selected' | lv_value_0_2= 'unselected' ) ) ) ;
    public final EObject ruleBoolVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalPLEC.g:1582:2: ( ( ( (lv_value_0_1= 'selected' | lv_value_0_2= 'unselected' ) ) ) )
            // InternalPLEC.g:1583:2: ( ( (lv_value_0_1= 'selected' | lv_value_0_2= 'unselected' ) ) )
            {
            // InternalPLEC.g:1583:2: ( ( (lv_value_0_1= 'selected' | lv_value_0_2= 'unselected' ) ) )
            // InternalPLEC.g:1584:3: ( (lv_value_0_1= 'selected' | lv_value_0_2= 'unselected' ) )
            {
            // InternalPLEC.g:1584:3: ( (lv_value_0_1= 'selected' | lv_value_0_2= 'unselected' ) )
            // InternalPLEC.g:1585:4: (lv_value_0_1= 'selected' | lv_value_0_2= 'unselected' )
            {
            // InternalPLEC.g:1585:4: (lv_value_0_1= 'selected' | lv_value_0_2= 'unselected' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPLEC.g:1586:5: lv_value_0_1= 'selected'
                    {
                    lv_value_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolValAccess().getValueSelectedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolValRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPLEC.g:1597:5: lv_value_0_2= 'unselected'
                    {
                    lv_value_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBoolValAccess().getValueUnselectedKeyword_0_1());
                    				

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
    // InternalPLEC.g:1613:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalPLEC.g:1613:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalPLEC.g:1614:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalPLEC.g:1620:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPLEC.g:1626:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalPLEC.g:1627:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalPLEC.g:1627:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalPLEC.g:1628:3: (lv_value_0_0= RULE_INT )
            {
            // InternalPLEC.g:1628:3: (lv_value_0_0= RULE_INT )
            // InternalPLEC.g:1629:4: lv_value_0_0= RULE_INT
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
    // InternalPLEC.g:1648:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalPLEC.g:1648:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalPLEC.g:1649:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalPLEC.g:1655:1: ruleSymbol returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPLEC.g:1661:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalPLEC.g:1662:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalPLEC.g:1662:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalPLEC.g:1663:3: (lv_value_0_0= RULE_ID )
            {
            // InternalPLEC.g:1663:3: (lv_value_0_0= RULE_ID )
            // InternalPLEC.g:1664:4: lv_value_0_0= RULE_ID
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
    // InternalPLEC.g:1683:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalPLEC.g:1683:46: (iv_ruleValue= ruleValue EOF )
            // InternalPLEC.g:1684:2: iv_ruleValue= ruleValue EOF
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
    // InternalPLEC.g:1690:1: ruleValue returns [EObject current=null] : (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_NonEnumerableValue_1 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1696:2: ( (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue ) )
            // InternalPLEC.g:1697:2: (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            {
            // InternalPLEC.g:1697:2: (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID||(LA11_0>=34 && LA11_0<=35)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPLEC.g:1698:3: this_Number_0= ruleNumber
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
                    // InternalPLEC.g:1707:3: this_NonEnumerableValue_1= ruleNonEnumerableValue
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
    // InternalPLEC.g:1719:1: entryRuleNonEnumerableValue returns [EObject current=null] : iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF ;
    public final EObject entryRuleNonEnumerableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonEnumerableValue = null;


        try {
            // InternalPLEC.g:1719:59: (iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF )
            // InternalPLEC.g:1720:2: iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF
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
    // InternalPLEC.g:1726:1: ruleNonEnumerableValue returns [EObject current=null] : (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol ) ;
    public final EObject ruleNonEnumerableValue() throws RecognitionException {
        EObject current = null;

        EObject this_BoolVal_0 = null;

        EObject this_Symbol_1 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1732:2: ( (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol ) )
            // InternalPLEC.g:1733:2: (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol )
            {
            // InternalPLEC.g:1733:2: (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=34 && LA12_0<=35)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPLEC.g:1734:3: this_BoolVal_0= ruleBoolVal
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
                    // InternalPLEC.g:1743:3: this_Symbol_1= ruleSymbol
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
    // InternalPLEC.g:1755:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalPLEC.g:1755:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalPLEC.g:1756:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalPLEC.g:1762:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLEC.g:1768:2: ( (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) )
            // InternalPLEC.g:1769:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            {
            // InternalPLEC.g:1769:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt13=1;
                }
                break;
            case 37:
                {
                alt13=2;
                }
                break;
            case 38:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPLEC.g:1770:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLEC.g:1776:3: kw= 'integer'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPLEC.g:1782:3: kw= 'symbolic'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

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


    // $ANTLR start "entryRuleListOfValues"
    // InternalPLEC.g:1791:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalPLEC.g:1791:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalPLEC.g:1792:2: iv_ruleListOfValues= ruleListOfValues EOF
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
    // InternalPLEC.g:1798:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1804:2: ( ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) )
            // InternalPLEC.g:1805:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            {
            // InternalPLEC.g:1805:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            // InternalPLEC.g:1806:3: ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            {
            // InternalPLEC.g:1806:3: ( (lv_values_0_0= ruleValue ) )
            // InternalPLEC.g:1807:4: (lv_values_0_0= ruleValue )
            {
            // InternalPLEC.g:1807:4: (lv_values_0_0= ruleValue )
            // InternalPLEC.g:1808:5: lv_values_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_values_0_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"com.coffee.PLEC.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPLEC.g:1825:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPLEC.g:1826:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) )
            	    {
            	    // InternalPLEC.g:1826:4: (otherlv_1= ',' )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==16) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalPLEC.g:1827:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,16,FOLLOW_32); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt14 >= 1 ) break loop14;
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);

            	    // InternalPLEC.g:1832:4: ( (lv_values_2_0= ruleValue ) )
            	    // InternalPLEC.g:1833:5: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalPLEC.g:1833:5: (lv_values_2_0= ruleValue )
            	    // InternalPLEC.g:1834:6: lv_values_2_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"com.coffee.PLEC.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalPLEC.g:1856:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalPLEC.g:1856:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalPLEC.g:1857:2: iv_ruleListOfIDs= ruleListOfIDs EOF
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
    // InternalPLEC.g:1863:1: ruleListOfIDs returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPLEC.g:1869:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalPLEC.g:1870:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalPLEC.g:1870:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            // InternalPLEC.g:1871:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalPLEC.g:1871:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLEC.g:1872:4: (otherlv_0= RULE_ID )
            {
            // InternalPLEC.g:1872:4: (otherlv_0= RULE_ID )
            // InternalPLEC.g:1873:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfIDsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_0, grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalPLEC.g:1884:3: ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPLEC.g:1885:4: (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) )
            	    {
            	    // InternalPLEC.g:1885:4: (otherlv_1= ',' )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==16) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalPLEC.g:1886:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,16,FOLLOW_33); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);

            	    // InternalPLEC.g:1891:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalPLEC.g:1892:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalPLEC.g:1892:5: (otherlv_2= RULE_ID )
            	    // InternalPLEC.g:1893:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfIDsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    						newLeafNode(otherlv_2, grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "entryRuleListOfListsOfValues"
    // InternalPLEC.g:1909:1: entryRuleListOfListsOfValues returns [EObject current=null] : iv_ruleListOfListsOfValues= ruleListOfListsOfValues EOF ;
    public final EObject entryRuleListOfListsOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfListsOfValues = null;


        try {
            // InternalPLEC.g:1909:60: (iv_ruleListOfListsOfValues= ruleListOfListsOfValues EOF )
            // InternalPLEC.g:1910:2: iv_ruleListOfListsOfValues= ruleListOfListsOfValues EOF
            {
             newCompositeNode(grammarAccess.getListOfListsOfValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfListsOfValues=ruleListOfListsOfValues();

            state._fsp--;

             current =iv_ruleListOfListsOfValues; 
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
    // $ANTLR end "entryRuleListOfListsOfValues"


    // $ANTLR start "ruleListOfListsOfValues"
    // InternalPLEC.g:1916:1: ruleListOfListsOfValues returns [EObject current=null] : (otherlv_0= '(' ( (lv_values_1_0= ruleListOfValues ) ) otherlv_2= ')' ( (otherlv_3= ',' )+ otherlv_4= '(' ( (lv_values_5_0= ruleListOfValues ) ) otherlv_6= ')' )* ) ;
    public final EObject ruleListOfListsOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_5_0 = null;



        	enterRule();

        try {
            // InternalPLEC.g:1922:2: ( (otherlv_0= '(' ( (lv_values_1_0= ruleListOfValues ) ) otherlv_2= ')' ( (otherlv_3= ',' )+ otherlv_4= '(' ( (lv_values_5_0= ruleListOfValues ) ) otherlv_6= ')' )* ) )
            // InternalPLEC.g:1923:2: (otherlv_0= '(' ( (lv_values_1_0= ruleListOfValues ) ) otherlv_2= ')' ( (otherlv_3= ',' )+ otherlv_4= '(' ( (lv_values_5_0= ruleListOfValues ) ) otherlv_6= ')' )* )
            {
            // InternalPLEC.g:1923:2: (otherlv_0= '(' ( (lv_values_1_0= ruleListOfValues ) ) otherlv_2= ')' ( (otherlv_3= ',' )+ otherlv_4= '(' ( (lv_values_5_0= ruleListOfValues ) ) otherlv_6= ')' )* )
            // InternalPLEC.g:1924:3: otherlv_0= '(' ( (lv_values_1_0= ruleListOfValues ) ) otherlv_2= ')' ( (otherlv_3= ',' )+ otherlv_4= '(' ( (lv_values_5_0= ruleListOfValues ) ) otherlv_6= ')' )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfListsOfValuesAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPLEC.g:1928:3: ( (lv_values_1_0= ruleListOfValues ) )
            // InternalPLEC.g:1929:4: (lv_values_1_0= ruleListOfValues )
            {
            // InternalPLEC.g:1929:4: (lv_values_1_0= ruleListOfValues )
            // InternalPLEC.g:1930:5: lv_values_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getListOfListsOfValuesAccess().getValuesListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_values_1_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfListsOfValuesRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_1_0,
            						"com.coffee.PLEC.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getListOfListsOfValuesAccess().getRightParenthesisKeyword_2());
            		
            // InternalPLEC.g:1951:3: ( (otherlv_3= ',' )+ otherlv_4= '(' ( (lv_values_5_0= ruleListOfValues ) ) otherlv_6= ')' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPLEC.g:1952:4: (otherlv_3= ',' )+ otherlv_4= '(' ( (lv_values_5_0= ruleListOfValues ) ) otherlv_6= ')'
            	    {
            	    // InternalPLEC.g:1952:4: (otherlv_3= ',' )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==16) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalPLEC.g:1953:5: otherlv_3= ','
            	    	    {
            	    	    otherlv_3=(Token)match(input,16,FOLLOW_34); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getListOfListsOfValuesAccess().getCommaKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt18 >= 1 ) break loop18;
            	                EarlyExitException eee =
            	                    new EarlyExitException(18, input);
            	                throw eee;
            	        }
            	        cnt18++;
            	    } while (true);

            	    otherlv_4=(Token)match(input,21,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getListOfListsOfValuesAccess().getLeftParenthesisKeyword_3_1());
            	    			
            	    // InternalPLEC.g:1962:4: ( (lv_values_5_0= ruleListOfValues ) )
            	    // InternalPLEC.g:1963:5: (lv_values_5_0= ruleListOfValues )
            	    {
            	    // InternalPLEC.g:1963:5: (lv_values_5_0= ruleListOfValues )
            	    // InternalPLEC.g:1964:6: lv_values_5_0= ruleListOfValues
            	    {

            	    						newCompositeNode(grammarAccess.getListOfListsOfValuesAccess().getValuesListOfValuesParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_values_5_0=ruleListOfValues();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfListsOfValuesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_5_0,
            	    							"com.coffee.PLEC.ListOfValues");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,22,FOLLOW_31); 

            	    				newLeafNode(otherlv_6, grammarAccess.getListOfListsOfValuesAccess().getRightParenthesisKeyword_3_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleListOfListsOfValues"


    // $ANTLR start "entryRuleBinOp"
    // InternalPLEC.g:1990:1: entryRuleBinOp returns [String current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final String entryRuleBinOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinOp = null;


        try {
            // InternalPLEC.g:1990:45: (iv_ruleBinOp= ruleBinOp EOF )
            // InternalPLEC.g:1991:2: iv_ruleBinOp= ruleBinOp EOF
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
    // InternalPLEC.g:1997:1: ruleBinOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' ) ;
    public final AntlrDatatypeRuleToken ruleBinOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLEC.g:2003:2: ( (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' ) )
            // InternalPLEC.g:2004:2: (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' )
            {
            // InternalPLEC.g:2004:2: (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 40:
                {
                alt20=3;
                }
                break;
            case 41:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPLEC.g:2005:3: kw= 'requires'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getRequiresKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLEC.g:2011:3: kw= 'excludes'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getExcludesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPLEC.g:2017:3: kw= 'optional'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getOptionalKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPLEC.g:2023:3: kw= 'mandatory'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalPLEC.g:2032:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // InternalPLEC.g:2032:47: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalPLEC.g:2033:2: iv_ruleUnaryOp= ruleUnaryOp EOF
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
    // InternalPLEC.g:2039:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'optional' | kw= 'mandatory' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLEC.g:2045:2: ( (kw= 'optional' | kw= 'mandatory' ) )
            // InternalPLEC.g:2046:2: (kw= 'optional' | kw= 'mandatory' )
            {
            // InternalPLEC.g:2046:2: (kw= 'optional' | kw= 'mandatory' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            else if ( (LA21_0==41) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPLEC.g:2047:3: kw= 'optional'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getOptionalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLEC.g:2053:3: kw= 'mandatory'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTempOP"
    // InternalPLEC.g:2062:1: entryRuleTempOP returns [String current=null] : iv_ruleTempOP= ruleTempOP EOF ;
    public final String entryRuleTempOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTempOP = null;


        try {
            // InternalPLEC.g:2062:46: (iv_ruleTempOP= ruleTempOP EOF )
            // InternalPLEC.g:2063:2: iv_ruleTempOP= ruleTempOP EOF
            {
             newCompositeNode(grammarAccess.getTempOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTempOP=ruleTempOP();

            state._fsp--;

             current =iv_ruleTempOP.getText(); 
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
    // $ANTLR end "entryRuleTempOP"


    // $ANTLR start "ruleTempOP"
    // InternalPLEC.g:2069:1: ruleTempOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'always' | kw= 'next' | kw= 'eventually' ) ;
    public final AntlrDatatypeRuleToken ruleTempOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLEC.g:2075:2: ( (kw= 'always' | kw= 'next' | kw= 'eventually' ) )
            // InternalPLEC.g:2076:2: (kw= 'always' | kw= 'next' | kw= 'eventually' )
            {
            // InternalPLEC.g:2076:2: (kw= 'always' | kw= 'next' | kw= 'eventually' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalPLEC.g:2077:3: kw= 'always'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTempOPAccess().getAlwaysKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLEC.g:2083:3: kw= 'next'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTempOPAccess().getNextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPLEC.g:2089:3: kw= 'eventually'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTempOPAccess().getEventuallyKeyword_2());
                    		

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
    // $ANTLR end "ruleTempOP"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\11\12\uffff";
    static final String dfa_3s = "\2\4\6\uffff\1\4\3\uffff";
    static final String dfa_4s = "\1\54\1\51\6\uffff\1\51\3\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\5\1\7\1\10\1\11\1\uffff\1\1\1\4\1\6";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\12\uffff\1\7\5\uffff\1\3\1\uffff\1\4\2\uffff\1\5\3\uffff\1\2\13\uffff\3\6",
            "\1\11\21\uffff\1\11\5\uffff\1\10\1\2\2\uffff\1\3\1\12\5\uffff\3\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\2\31\uffff\1\2\2\uffff\2\2\4\uffff\2\13",
            "",
            "",
            ""
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
            return "515:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN | this_Attributes_6= ruleAttributes | this_Temporal_7= ruleTemporal | this_Quantifiable_8= ruleQuantifiable )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000007000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000C00000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00001C0044A08010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000038200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000C00010030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000210000L});

}