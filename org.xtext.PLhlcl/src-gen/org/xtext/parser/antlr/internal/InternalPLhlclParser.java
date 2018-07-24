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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'variables:'", "'constraints:'", "'instantiable'", "'['", "','", "']'", "'values:'", "'..'", "':'", "'('", "')'", "'structural:'", "'variants:'", "'card:'", "'is'", "'in'", "'vars:'", "'variants'", "'-->'", "'true'", "'false'", "'boolean'", "'integer'", "'symbolic'", "'requires'", "'excludes'", "'optional'", "'mandatory'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    // InternalPLhlcl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* ) ;
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
            // InternalPLhlcl.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* ) )
            // InternalPLhlcl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* )
            {
            // InternalPLhlcl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )* )
            // InternalPLhlcl.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'variables:' ( (lv_vars_3_0= ruleVarDeclaration ) )* otherlv_4= 'constraints:' ( (lv_constraints_5_0= ruleConstraint ) )*
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
            		
            // InternalPLhlcl.g:105:3: ( (lv_vars_3_0= ruleVarDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=33 && LA1_0<=35)) ) {
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
            	    						"org.xtext.PLhlcl.VarDeclaration");
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
            		
            // InternalPLhlcl.g:128:3: ( (lv_constraints_5_0= ruleConstraint ) )*
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
            	    						"org.xtext.PLhlcl.Constraint");
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
    // InternalPLhlcl.g:158:1: ruleVarDeclaration returns [EObject current=null] : ( ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )? ) ;
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
            // InternalPLhlcl.g:164:2: ( ( ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )? ) )
            // InternalPLhlcl.g:165:2: ( ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )? )
            {
            // InternalPLhlcl.g:165:2: ( ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )? )
            // InternalPLhlcl.g:166:3: ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )? ( (lv_type_6_0= ruleVarType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )?
            {
            // InternalPLhlcl.g:166:3: ( ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPLhlcl.g:167:4: ( (lv_instantiable_0_0= 'instantiable' ) ) otherlv_1= '[' ( (lv_min_2_0= ruleNumber ) ) otherlv_3= ',' ( (lv_max_4_0= ruleNumber ) ) otherlv_5= ']'
                    {
                    // InternalPLhlcl.g:167:4: ( (lv_instantiable_0_0= 'instantiable' ) )
                    // InternalPLhlcl.g:168:5: (lv_instantiable_0_0= 'instantiable' )
                    {
                    // InternalPLhlcl.g:168:5: (lv_instantiable_0_0= 'instantiable' )
                    // InternalPLhlcl.g:169:6: lv_instantiable_0_0= 'instantiable'
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
                    			
                    // InternalPLhlcl.g:185:4: ( (lv_min_2_0= ruleNumber ) )
                    // InternalPLhlcl.g:186:5: (lv_min_2_0= ruleNumber )
                    {
                    // InternalPLhlcl.g:186:5: (lv_min_2_0= ruleNumber )
                    // InternalPLhlcl.g:187:6: lv_min_2_0= ruleNumber
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
                    							"org.xtext.PLhlcl.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_3());
                    			
                    // InternalPLhlcl.g:208:4: ( (lv_max_4_0= ruleNumber ) )
                    // InternalPLhlcl.g:209:5: (lv_max_4_0= ruleNumber )
                    {
                    // InternalPLhlcl.g:209:5: (lv_max_4_0= ruleNumber )
                    // InternalPLhlcl.g:210:6: lv_max_4_0= ruleNumber
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
                    							"org.xtext.PLhlcl.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getVarDeclarationAccess().getRightSquareBracketKeyword_0_5());
                    			

                    }
                    break;

            }

            // InternalPLhlcl.g:232:3: ( (lv_type_6_0= ruleVarType ) )
            // InternalPLhlcl.g:233:4: (lv_type_6_0= ruleVarType )
            {
            // InternalPLhlcl.g:233:4: (lv_type_6_0= ruleVarType )
            // InternalPLhlcl.g:234:5: lv_type_6_0= ruleVarType
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

            // InternalPLhlcl.g:251:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalPLhlcl.g:252:4: (lv_name_7_0= RULE_ID )
            {
            // InternalPLhlcl.g:252:4: (lv_name_7_0= RULE_ID )
            // InternalPLhlcl.g:253:5: lv_name_7_0= RULE_ID
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

            // InternalPLhlcl.g:269:3: (otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPLhlcl.g:270:4: otherlv_8= 'values:' ( (lv_variants_9_0= ruleVariantDeclaration ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getVarDeclarationAccess().getValuesKeyword_3_0());
                    			
                    // InternalPLhlcl.g:274:4: ( (lv_variants_9_0= ruleVariantDeclaration ) )
                    // InternalPLhlcl.g:275:5: (lv_variants_9_0= ruleVariantDeclaration )
                    {
                    // InternalPLhlcl.g:275:5: (lv_variants_9_0= ruleVariantDeclaration )
                    // InternalPLhlcl.g:276:6: lv_variants_9_0= ruleVariantDeclaration
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
                    							"org.xtext.PLhlcl.VariantDeclaration");
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
    // InternalPLhlcl.g:298:1: entryRuleVariantDeclaration returns [EObject current=null] : iv_ruleVariantDeclaration= ruleVariantDeclaration EOF ;
    public final EObject entryRuleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantDeclaration = null;


        try {
            // InternalPLhlcl.g:298:59: (iv_ruleVariantDeclaration= ruleVariantDeclaration EOF )
            // InternalPLhlcl.g:299:2: iv_ruleVariantDeclaration= ruleVariantDeclaration EOF
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
    // InternalPLhlcl.g:305:1: ruleVariantDeclaration returns [EObject current=null] : (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration ) ;
    public final EObject ruleVariantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariantsInterval_0 = null;

        EObject this_VariantsEnumeration_1 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:311:2: ( (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration ) )
            // InternalPLhlcl.g:312:2: (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration )
            {
            // InternalPLhlcl.g:312:2: (this_VariantsInterval_0= ruleVariantsInterval | this_VariantsEnumeration_1= ruleVariantsEnumeration )
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
                    // InternalPLhlcl.g:313:3: this_VariantsInterval_0= ruleVariantsInterval
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
                    // InternalPLhlcl.g:322:3: this_VariantsEnumeration_1= ruleVariantsEnumeration
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
    // InternalPLhlcl.g:334:1: entryRuleVariantsInterval returns [EObject current=null] : iv_ruleVariantsInterval= ruleVariantsInterval EOF ;
    public final EObject entryRuleVariantsInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantsInterval = null;


        try {
            // InternalPLhlcl.g:334:57: (iv_ruleVariantsInterval= ruleVariantsInterval EOF )
            // InternalPLhlcl.g:335:2: iv_ruleVariantsInterval= ruleVariantsInterval EOF
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
    // InternalPLhlcl.g:341:1: ruleVariantsInterval returns [EObject current=null] : ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) ) ;
    public final EObject ruleVariantsInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:347:2: ( ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) ) )
            // InternalPLhlcl.g:348:2: ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) )
            {
            // InternalPLhlcl.g:348:2: ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) )
            // InternalPLhlcl.g:349:3: ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) )
            {
            // InternalPLhlcl.g:349:3: ( (lv_start_0_0= ruleNumber ) )
            // InternalPLhlcl.g:350:4: (lv_start_0_0= ruleNumber )
            {
            // InternalPLhlcl.g:350:4: (lv_start_0_0= ruleNumber )
            // InternalPLhlcl.g:351:5: lv_start_0_0= ruleNumber
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
            						"org.xtext.PLhlcl.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantsIntervalAccess().getFullStopFullStopKeyword_1());
            		
            // InternalPLhlcl.g:372:3: ( (lv_end_2_0= ruleNumber ) )
            // InternalPLhlcl.g:373:4: (lv_end_2_0= ruleNumber )
            {
            // InternalPLhlcl.g:373:4: (lv_end_2_0= ruleNumber )
            // InternalPLhlcl.g:374:5: lv_end_2_0= ruleNumber
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
            						"org.xtext.PLhlcl.Number");
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
    // InternalPLhlcl.g:395:1: entryRuleVariantsEnumeration returns [EObject current=null] : iv_ruleVariantsEnumeration= ruleVariantsEnumeration EOF ;
    public final EObject entryRuleVariantsEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantsEnumeration = null;


        try {
            // InternalPLhlcl.g:395:60: (iv_ruleVariantsEnumeration= ruleVariantsEnumeration EOF )
            // InternalPLhlcl.g:396:2: iv_ruleVariantsEnumeration= ruleVariantsEnumeration EOF
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
    // InternalPLhlcl.g:402:1: ruleVariantsEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleVariantsEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:408:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalPLhlcl.g:409:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalPLhlcl.g:409:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalPLhlcl.g:410:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPLhlcl.g:414:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalPLhlcl.g:415:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalPLhlcl.g:415:4: (lv_list_1_0= ruleListOfValues )
            // InternalPLhlcl.g:416:5: lv_list_1_0= ruleListOfValues
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
            						"org.xtext.PLhlcl.ListOfValues");
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
    // InternalPLhlcl.g:441:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalPLhlcl.g:441:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalPLhlcl.g:442:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalPLhlcl.g:448:1: ruleConstraint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:454:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) ) )
            // InternalPLhlcl.g:455:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            {
            // InternalPLhlcl.g:455:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) ) )
            // InternalPLhlcl.g:456:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleConsExpression ) )
            {
            // InternalPLhlcl.g:456:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPLhlcl.g:457:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPLhlcl.g:457:4: (lv_name_0_0= RULE_ID )
            // InternalPLhlcl.g:458:5: lv_name_0_0= RULE_ID
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
            		
            // InternalPLhlcl.g:478:3: ( (lv_exp_2_0= ruleConsExpression ) )
            // InternalPLhlcl.g:479:4: (lv_exp_2_0= ruleConsExpression )
            {
            // InternalPLhlcl.g:479:4: (lv_exp_2_0= ruleConsExpression )
            // InternalPLhlcl.g:480:5: lv_exp_2_0= ruleConsExpression
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
    // InternalPLhlcl.g:501:1: entryRuleConsExpression returns [EObject current=null] : iv_ruleConsExpression= ruleConsExpression EOF ;
    public final EObject entryRuleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsExpression = null;


        try {
            // InternalPLhlcl.g:501:55: (iv_ruleConsExpression= ruleConsExpression EOF )
            // InternalPLhlcl.g:502:2: iv_ruleConsExpression= ruleConsExpression EOF
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
    // InternalPLhlcl.g:508:1: ruleConsExpression returns [EObject current=null] : (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN ) ;
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
            // InternalPLhlcl.g:514:2: ( (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN ) )
            // InternalPLhlcl.g:515:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN )
            {
            // InternalPLhlcl.g:515:2: (this_IDCons_0= ruleIDCons | this_Refinement_1= ruleRefinement | this_Rule_2= ruleRule | this_FodaBin_3= ruleFodaBin | this_Structural_4= ruleStructural | this_FodaUN_5= ruleFodaUN )
            int alt6=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt6=2;
                    }
                    break;
                case 30:
                    {
                    alt6=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 22:
                    {
                    alt6=1;
                    }
                    break;
                case 26:
                    {
                    int LA6_6 = input.LA(3);

                    if ( ((LA6_6>=RULE_ID && LA6_6<=RULE_INT)||(LA6_6>=31 && LA6_6<=32)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_6>=38 && LA6_6<=39)) ) {
                        alt6=6;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 36:
                case 37:
                case 38:
                case 39:
                    {
                    alt6=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPLhlcl.g:516:3: this_IDCons_0= ruleIDCons
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
                    // InternalPLhlcl.g:525:3: this_Refinement_1= ruleRefinement
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
                    // InternalPLhlcl.g:534:3: this_Rule_2= ruleRule
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
                    // InternalPLhlcl.g:543:3: this_FodaBin_3= ruleFodaBin
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
                    // InternalPLhlcl.g:552:3: this_Structural_4= ruleStructural
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
                    // InternalPLhlcl.g:561:3: this_FodaUN_5= ruleFodaUN
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
    // InternalPLhlcl.g:573:1: entryRuleTerminalExp returns [EObject current=null] : iv_ruleTerminalExp= ruleTerminalExp EOF ;
    public final EObject entryRuleTerminalExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExp = null;


        try {
            // InternalPLhlcl.g:573:52: (iv_ruleTerminalExp= ruleTerminalExp EOF )
            // InternalPLhlcl.g:574:2: iv_ruleTerminalExp= ruleTerminalExp EOF
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
    // InternalPLhlcl.g:580:1: ruleTerminalExp returns [EObject current=null] : ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons ) ;
    public final EObject ruleTerminalExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConsExpression_1 = null;

        EObject this_IDCons_3 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:586:2: ( ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons ) )
            // InternalPLhlcl.g:587:2: ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons )
            {
            // InternalPLhlcl.g:587:2: ( (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' ) | this_IDCons_3= ruleIDCons )
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
                    // InternalPLhlcl.g:588:3: (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' )
                    {
                    // InternalPLhlcl.g:588:3: (otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')' )
                    // InternalPLhlcl.g:589:4: otherlv_0= '(' this_ConsExpression_1= ruleConsExpression otherlv_2= ')'
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
                    // InternalPLhlcl.g:607:3: this_IDCons_3= ruleIDCons
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
    // InternalPLhlcl.g:619:1: entryRuleIDCons returns [EObject current=null] : iv_ruleIDCons= ruleIDCons EOF ;
    public final EObject entryRuleIDCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDCons = null;


        try {
            // InternalPLhlcl.g:619:47: (iv_ruleIDCons= ruleIDCons EOF )
            // InternalPLhlcl.g:620:2: iv_ruleIDCons= ruleIDCons EOF
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
    // InternalPLhlcl.g:626:1: ruleIDCons returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleIDCons() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:632:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPLhlcl.g:633:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPLhlcl.g:633:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPLhlcl.g:634:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPLhlcl.g:634:3: (lv_name_0_0= RULE_ID )
            // InternalPLhlcl.g:635:4: lv_name_0_0= RULE_ID
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
    // InternalPLhlcl.g:654:1: entryRuleStructural returns [EObject current=null] : iv_ruleStructural= ruleStructural EOF ;
    public final EObject entryRuleStructural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructural = null;


        try {
            // InternalPLhlcl.g:654:51: (iv_ruleStructural= ruleStructural EOF )
            // InternalPLhlcl.g:655:2: iv_ruleStructural= ruleStructural EOF
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
    // InternalPLhlcl.g:661:1: ruleStructural returns [EObject current=null] : (otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )? ) ;
    public final EObject ruleStructural() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parent_1_0=null;
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
            // InternalPLhlcl.g:667:2: ( (otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )? ) )
            // InternalPLhlcl.g:668:2: (otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )? )
            {
            // InternalPLhlcl.g:668:2: (otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )? )
            // InternalPLhlcl.g:669:3: otherlv_0= 'structural:' ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= 'variants:' otherlv_3= '[' ( (lv_group_4_0= ruleListOfIDs ) ) otherlv_5= ']' (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStructuralAccess().getStructuralKeyword_0());
            		
            // InternalPLhlcl.g:673:3: ( (lv_parent_1_0= RULE_ID ) )
            // InternalPLhlcl.g:674:4: (lv_parent_1_0= RULE_ID )
            {
            // InternalPLhlcl.g:674:4: (lv_parent_1_0= RULE_ID )
            // InternalPLhlcl.g:675:5: lv_parent_1_0= RULE_ID
            {
            lv_parent_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getStructuralAccess().getVariantsKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalPLhlcl.g:699:3: ( (lv_group_4_0= ruleListOfIDs ) )
            // InternalPLhlcl.g:700:4: (lv_group_4_0= ruleListOfIDs )
            {
            // InternalPLhlcl.g:700:4: (lv_group_4_0= ruleListOfIDs )
            // InternalPLhlcl.g:701:5: lv_group_4_0= ruleListOfIDs
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
            						"org.xtext.PLhlcl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_5());
            		
            // InternalPLhlcl.g:722:3: (otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPLhlcl.g:723:4: otherlv_6= 'card:' otherlv_7= '[' ( (lv_min_8_0= ruleNumber ) ) otherlv_9= ',' ( (lv_max_10_0= ruleNumber ) ) otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getStructuralAccess().getCardKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalPLhlcl.g:731:4: ( (lv_min_8_0= ruleNumber ) )
                    // InternalPLhlcl.g:732:5: (lv_min_8_0= ruleNumber )
                    {
                    // InternalPLhlcl.g:732:5: (lv_min_8_0= ruleNumber )
                    // InternalPLhlcl.g:733:6: lv_min_8_0= ruleNumber
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
                    							"org.xtext.PLhlcl.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getStructuralAccess().getCommaKeyword_6_3());
                    			
                    // InternalPLhlcl.g:754:4: ( (lv_max_10_0= ruleNumber ) )
                    // InternalPLhlcl.g:755:5: (lv_max_10_0= ruleNumber )
                    {
                    // InternalPLhlcl.g:755:5: (lv_max_10_0= ruleNumber )
                    // InternalPLhlcl.g:756:6: lv_max_10_0= ruleNumber
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
                    							"org.xtext.PLhlcl.Number");
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


    // $ANTLR start "entryRuleRefinement"
    // InternalPLhlcl.g:782:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // InternalPLhlcl.g:782:51: (iv_ruleRefinement= ruleRefinement EOF )
            // InternalPLhlcl.g:783:2: iv_ruleRefinement= ruleRefinement EOF
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
    // InternalPLhlcl.g:789:1: ruleRefinement returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_VarRefinement_1 = null;

        EObject this_SetRefinement_2 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:795:2: ( (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement ) )
            // InternalPLhlcl.g:796:2: (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement )
            {
            // InternalPLhlcl.g:796:2: (this_Assignment_0= ruleAssignment | this_VarRefinement_1= ruleVarRefinement | this_SetRefinement_2= ruleSetRefinement )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==27) ) {
                    alt9=2;
                }
                else if ( (LA9_1==26) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==28) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPLhlcl.g:797:3: this_Assignment_0= ruleAssignment
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
                    // InternalPLhlcl.g:806:3: this_VarRefinement_1= ruleVarRefinement
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
                    // InternalPLhlcl.g:815:3: this_SetRefinement_2= ruleSetRefinement
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
    // InternalPLhlcl.g:827:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalPLhlcl.g:827:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalPLhlcl.g:828:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalPLhlcl.g:834:1: ruleAssignment returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:840:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalPLhlcl.g:841:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalPLhlcl.g:841:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )
            // InternalPLhlcl.g:842:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalPLhlcl.g:842:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalPLhlcl.g:843:4: (lv_var_0_0= RULE_ID )
            {
            // InternalPLhlcl.g:843:4: (lv_var_0_0= RULE_ID )
            // InternalPLhlcl.g:844:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getIsKeyword_1());
            		
            // InternalPLhlcl.g:864:3: ( (lv_value_2_0= ruleValue ) )
            // InternalPLhlcl.g:865:4: (lv_value_2_0= ruleValue )
            {
            // InternalPLhlcl.g:865:4: (lv_value_2_0= ruleValue )
            // InternalPLhlcl.g:866:5: lv_value_2_0= ruleValue
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
    // InternalPLhlcl.g:887:1: entryRuleVarRefinement returns [EObject current=null] : iv_ruleVarRefinement= ruleVarRefinement EOF ;
    public final EObject entryRuleVarRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefinement = null;


        try {
            // InternalPLhlcl.g:887:54: (iv_ruleVarRefinement= ruleVarRefinement EOF )
            // InternalPLhlcl.g:888:2: iv_ruleVarRefinement= ruleVarRefinement EOF
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
    // InternalPLhlcl.g:894:1: ruleVarRefinement returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) ) ;
    public final EObject ruleVarRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:900:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) ) )
            // InternalPLhlcl.g:901:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) )
            {
            // InternalPLhlcl.g:901:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) ) )
            // InternalPLhlcl.g:902:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_values_2_0= ruleVariantDeclaration ) )
            {
            // InternalPLhlcl.g:902:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalPLhlcl.g:903:4: (lv_var_0_0= RULE_ID )
            {
            // InternalPLhlcl.g:903:4: (lv_var_0_0= RULE_ID )
            // InternalPLhlcl.g:904:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_1=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVarRefinementAccess().getInKeyword_1());
            		
            // InternalPLhlcl.g:924:3: ( (lv_values_2_0= ruleVariantDeclaration ) )
            // InternalPLhlcl.g:925:4: (lv_values_2_0= ruleVariantDeclaration )
            {
            // InternalPLhlcl.g:925:4: (lv_values_2_0= ruleVariantDeclaration )
            // InternalPLhlcl.g:926:5: lv_values_2_0= ruleVariantDeclaration
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
    // InternalPLhlcl.g:947:1: entryRuleSetRefinement returns [EObject current=null] : iv_ruleSetRefinement= ruleSetRefinement EOF ;
    public final EObject entryRuleSetRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRefinement = null;


        try {
            // InternalPLhlcl.g:947:54: (iv_ruleSetRefinement= ruleSetRefinement EOF )
            // InternalPLhlcl.g:948:2: iv_ruleSetRefinement= ruleSetRefinement EOF
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
    // InternalPLhlcl.g:954:1: ruleSetRefinement returns [EObject current=null] : (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']' ) ;
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
            // InternalPLhlcl.g:960:2: ( (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']' ) )
            // InternalPLhlcl.g:961:2: (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']' )
            {
            // InternalPLhlcl.g:961:2: (otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']' )
            // InternalPLhlcl.g:962:3: otherlv_0= 'vars:' otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' otherlv_4= 'variants' otherlv_5= '[' otherlv_6= '(' ( (lv_head_7_0= ruleListOfValues ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+ otherlv_13= ']'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getSetRefinementAccess().getVarsKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPLhlcl.g:970:3: ( (lv_vars_2_0= ruleListOfIDs ) )
            // InternalPLhlcl.g:971:4: (lv_vars_2_0= ruleListOfIDs )
            {
            // InternalPLhlcl.g:971:4: (lv_vars_2_0= ruleListOfIDs )
            // InternalPLhlcl.g:972:5: lv_vars_2_0= ruleListOfIDs
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
            						"org.xtext.PLhlcl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSetRefinementAccess().getVariantsKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_6());
            		
            // InternalPLhlcl.g:1005:3: ( (lv_head_7_0= ruleListOfValues ) )
            // InternalPLhlcl.g:1006:4: (lv_head_7_0= ruleListOfValues )
            {
            // InternalPLhlcl.g:1006:4: (lv_head_7_0= ruleListOfValues )
            // InternalPLhlcl.g:1007:5: lv_head_7_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_8=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8());
            		
            // InternalPLhlcl.g:1028:3: (otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPLhlcl.g:1029:4: otherlv_9= ',' otherlv_10= '(' ( (lv_tail_11_0= ruleListOfValues ) ) otherlv_12= ')'
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_23); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSetRefinementAccess().getCommaKeyword_9_0());
            	    			
            	    otherlv_10=(Token)match(input,21,FOLLOW_15); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_9_1());
            	    			
            	    // InternalPLhlcl.g:1037:4: ( (lv_tail_11_0= ruleListOfValues ) )
            	    // InternalPLhlcl.g:1038:5: (lv_tail_11_0= ruleListOfValues )
            	    {
            	    // InternalPLhlcl.g:1038:5: (lv_tail_11_0= ruleListOfValues )
            	    // InternalPLhlcl.g:1039:6: lv_tail_11_0= ruleListOfValues
            	    {

            	    						newCompositeNode(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_9_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
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

            	    otherlv_12=(Token)match(input,22,FOLLOW_25); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_9_3());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalPLhlcl.g:1069:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalPLhlcl.g:1069:45: (iv_ruleRule= ruleRule EOF )
            // InternalPLhlcl.g:1070:2: iv_ruleRule= ruleRule EOF
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
    // InternalPLhlcl.g:1076:1: ruleRule returns [EObject current=null] : ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_consequence_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:1082:2: ( ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) ) )
            // InternalPLhlcl.g:1083:2: ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) )
            {
            // InternalPLhlcl.g:1083:2: ( ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) ) )
            // InternalPLhlcl.g:1084:3: ( (lv_condition_0_0= ruleTerminalExp ) ) otherlv_1= '-->' ( (lv_consequence_2_0= ruleTerminalExp ) )
            {
            // InternalPLhlcl.g:1084:3: ( (lv_condition_0_0= ruleTerminalExp ) )
            // InternalPLhlcl.g:1085:4: (lv_condition_0_0= ruleTerminalExp )
            {
            // InternalPLhlcl.g:1085:4: (lv_condition_0_0= ruleTerminalExp )
            // InternalPLhlcl.g:1086:5: lv_condition_0_0= ruleTerminalExp
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionTerminalExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_1=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalPLhlcl.g:1107:3: ( (lv_consequence_2_0= ruleTerminalExp ) )
            // InternalPLhlcl.g:1108:4: (lv_consequence_2_0= ruleTerminalExp )
            {
            // InternalPLhlcl.g:1108:4: (lv_consequence_2_0= ruleTerminalExp )
            // InternalPLhlcl.g:1109:5: lv_consequence_2_0= ruleTerminalExp
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
    // InternalPLhlcl.g:1130:1: entryRuleFodaUN returns [EObject current=null] : iv_ruleFodaUN= ruleFodaUN EOF ;
    public final EObject entryRuleFodaUN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFodaUN = null;


        try {
            // InternalPLhlcl.g:1130:47: (iv_ruleFodaUN= ruleFodaUN EOF )
            // InternalPLhlcl.g:1131:2: iv_ruleFodaUN= ruleFodaUN EOF
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
    // InternalPLhlcl.g:1137:1: ruleFodaUN returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) ) ;
    public final EObject ruleFodaUN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:1143:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) ) )
            // InternalPLhlcl.g:1144:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) )
            {
            // InternalPLhlcl.g:1144:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) ) )
            // InternalPLhlcl.g:1145:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_op_2_0= ruleUnaryOp ) )
            {
            // InternalPLhlcl.g:1145:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLhlcl.g:1146:4: (otherlv_0= RULE_ID )
            {
            // InternalPLhlcl.g:1146:4: (otherlv_0= RULE_ID )
            // InternalPLhlcl.g:1147:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaUNRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getFodaUNAccess().getVar1VarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getFodaUNAccess().getIsKeyword_1());
            		
            // InternalPLhlcl.g:1162:3: ( (lv_op_2_0= ruleUnaryOp ) )
            // InternalPLhlcl.g:1163:4: (lv_op_2_0= ruleUnaryOp )
            {
            // InternalPLhlcl.g:1163:4: (lv_op_2_0= ruleUnaryOp )
            // InternalPLhlcl.g:1164:5: lv_op_2_0= ruleUnaryOp
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
    // InternalPLhlcl.g:1185:1: entryRuleFodaBin returns [EObject current=null] : iv_ruleFodaBin= ruleFodaBin EOF ;
    public final EObject entryRuleFodaBin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFodaBin = null;


        try {
            // InternalPLhlcl.g:1185:48: (iv_ruleFodaBin= ruleFodaBin EOF )
            // InternalPLhlcl.g:1186:2: iv_ruleFodaBin= ruleFodaBin EOF
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
    // InternalPLhlcl.g:1192:1: ruleFodaBin returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleFodaBin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:1198:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalPLhlcl.g:1199:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalPLhlcl.g:1199:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalPLhlcl.g:1200:3: ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleBinOp ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalPLhlcl.g:1200:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLhlcl.g:1201:4: (otherlv_0= RULE_ID )
            {
            // InternalPLhlcl.g:1201:4: (otherlv_0= RULE_ID )
            // InternalPLhlcl.g:1202:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFodaBinRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_0, grammarAccess.getFodaBinAccess().getVar1VarDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalPLhlcl.g:1213:3: ( (lv_op_1_0= ruleBinOp ) )
            // InternalPLhlcl.g:1214:4: (lv_op_1_0= ruleBinOp )
            {
            // InternalPLhlcl.g:1214:4: (lv_op_1_0= ruleBinOp )
            // InternalPLhlcl.g:1215:5: lv_op_1_0= ruleBinOp
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

            // InternalPLhlcl.g:1232:3: ( (otherlv_2= RULE_ID ) )
            // InternalPLhlcl.g:1233:4: (otherlv_2= RULE_ID )
            {
            // InternalPLhlcl.g:1233:4: (otherlv_2= RULE_ID )
            // InternalPLhlcl.g:1234:5: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRuleBoolVal"
    // InternalPLhlcl.g:1249:1: entryRuleBoolVal returns [EObject current=null] : iv_ruleBoolVal= ruleBoolVal EOF ;
    public final EObject entryRuleBoolVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVal = null;


        try {
            // InternalPLhlcl.g:1249:48: (iv_ruleBoolVal= ruleBoolVal EOF )
            // InternalPLhlcl.g:1250:2: iv_ruleBoolVal= ruleBoolVal EOF
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
    // InternalPLhlcl.g:1256:1: ruleBoolVal returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1262:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalPLhlcl.g:1263:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalPLhlcl.g:1263:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalPLhlcl.g:1264:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalPLhlcl.g:1264:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalPLhlcl.g:1265:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalPLhlcl.g:1265:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPLhlcl.g:1266:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolValRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:1277:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalPLhlcl.g:1293:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalPLhlcl.g:1293:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalPLhlcl.g:1294:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalPLhlcl.g:1300:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1306:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalPLhlcl.g:1307:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalPLhlcl.g:1307:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalPLhlcl.g:1308:3: (lv_value_0_0= RULE_INT )
            {
            // InternalPLhlcl.g:1308:3: (lv_value_0_0= RULE_INT )
            // InternalPLhlcl.g:1309:4: lv_value_0_0= RULE_INT
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
    // InternalPLhlcl.g:1328:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalPLhlcl.g:1328:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalPLhlcl.g:1329:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalPLhlcl.g:1335:1: ruleSymbol returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1341:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalPLhlcl.g:1342:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalPLhlcl.g:1342:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalPLhlcl.g:1343:3: (lv_value_0_0= RULE_ID )
            {
            // InternalPLhlcl.g:1343:3: (lv_value_0_0= RULE_ID )
            // InternalPLhlcl.g:1344:4: lv_value_0_0= RULE_ID
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
    // InternalPLhlcl.g:1363:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalPLhlcl.g:1363:46: (iv_ruleValue= ruleValue EOF )
            // InternalPLhlcl.g:1364:2: iv_ruleValue= ruleValue EOF
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
    // InternalPLhlcl.g:1370:1: ruleValue returns [EObject current=null] : (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_NonEnumerableValue_1 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:1376:2: ( (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue ) )
            // InternalPLhlcl.g:1377:2: (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            {
            // InternalPLhlcl.g:1377:2: (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID||(LA12_0>=31 && LA12_0<=32)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPLhlcl.g:1378:3: this_Number_0= ruleNumber
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
                    // InternalPLhlcl.g:1387:3: this_NonEnumerableValue_1= ruleNonEnumerableValue
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
    // InternalPLhlcl.g:1399:1: entryRuleNonEnumerableValue returns [EObject current=null] : iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF ;
    public final EObject entryRuleNonEnumerableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonEnumerableValue = null;


        try {
            // InternalPLhlcl.g:1399:59: (iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF )
            // InternalPLhlcl.g:1400:2: iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF
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
    // InternalPLhlcl.g:1406:1: ruleNonEnumerableValue returns [EObject current=null] : (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol ) ;
    public final EObject ruleNonEnumerableValue() throws RecognitionException {
        EObject current = null;

        EObject this_BoolVal_0 = null;

        EObject this_Symbol_1 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:1412:2: ( (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol ) )
            // InternalPLhlcl.g:1413:2: (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol )
            {
            // InternalPLhlcl.g:1413:2: (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=31 && LA13_0<=32)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPLhlcl.g:1414:3: this_BoolVal_0= ruleBoolVal
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
                    // InternalPLhlcl.g:1423:3: this_Symbol_1= ruleSymbol
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
    // InternalPLhlcl.g:1435:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalPLhlcl.g:1435:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalPLhlcl.g:1436:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalPLhlcl.g:1442:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1448:2: ( (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) )
            // InternalPLhlcl.g:1449:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            {
            // InternalPLhlcl.g:1449:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPLhlcl.g:1450:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:1456:3: kw= 'integer'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:1462:3: kw= 'symbolic'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

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
    // InternalPLhlcl.g:1471:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalPLhlcl.g:1471:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalPLhlcl.g:1472:2: iv_ruleListOfValues= ruleListOfValues EOF
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
    // InternalPLhlcl.g:1478:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalPLhlcl.g:1484:2: ( ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) )
            // InternalPLhlcl.g:1485:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            {
            // InternalPLhlcl.g:1485:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            // InternalPLhlcl.g:1486:3: ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            {
            // InternalPLhlcl.g:1486:3: ( (lv_values_0_0= ruleValue ) )
            // InternalPLhlcl.g:1487:4: (lv_values_0_0= ruleValue )
            {
            // InternalPLhlcl.g:1487:4: (lv_values_0_0= ruleValue )
            // InternalPLhlcl.g:1488:5: lv_values_0_0= ruleValue
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

            // InternalPLhlcl.g:1505:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPLhlcl.g:1506:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) )
            	    {
            	    // InternalPLhlcl.g:1506:4: (otherlv_1= ',' )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==16) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalPLhlcl.g:1507:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,16,FOLLOW_31); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt15 >= 1 ) break loop15;
            	                EarlyExitException eee =
            	                    new EarlyExitException(15, input);
            	                throw eee;
            	        }
            	        cnt15++;
            	    } while (true);

            	    // InternalPLhlcl.g:1512:4: ( (lv_values_2_0= ruleValue ) )
            	    // InternalPLhlcl.g:1513:5: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalPLhlcl.g:1513:5: (lv_values_2_0= ruleValue )
            	    // InternalPLhlcl.g:1514:6: lv_values_2_0= ruleValue
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
    // $ANTLR end "ruleListOfValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalPLhlcl.g:1536:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalPLhlcl.g:1536:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalPLhlcl.g:1537:2: iv_ruleListOfIDs= ruleListOfIDs EOF
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
    // InternalPLhlcl.g:1543:1: ruleListOfIDs returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1549:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalPLhlcl.g:1550:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalPLhlcl.g:1550:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            // InternalPLhlcl.g:1551:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalPLhlcl.g:1551:3: ( (otherlv_0= RULE_ID ) )
            // InternalPLhlcl.g:1552:4: (otherlv_0= RULE_ID )
            {
            // InternalPLhlcl.g:1552:4: (otherlv_0= RULE_ID )
            // InternalPLhlcl.g:1553:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfIDsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_0, grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalPLhlcl.g:1564:3: ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPLhlcl.g:1565:4: (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) )
            	    {
            	    // InternalPLhlcl.g:1565:4: (otherlv_1= ',' )+
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
            	    	    // InternalPLhlcl.g:1566:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,16,FOLLOW_32); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0());
            	    	    				

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

            	    // InternalPLhlcl.g:1571:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalPLhlcl.g:1572:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalPLhlcl.g:1572:5: (otherlv_2= RULE_ID )
            	    // InternalPLhlcl.g:1573:6: otherlv_2= RULE_ID
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
    // $ANTLR end "ruleListOfIDs"


    // $ANTLR start "entryRuleBinOp"
    // InternalPLhlcl.g:1589:1: entryRuleBinOp returns [String current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final String entryRuleBinOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinOp = null;


        try {
            // InternalPLhlcl.g:1589:45: (iv_ruleBinOp= ruleBinOp EOF )
            // InternalPLhlcl.g:1590:2: iv_ruleBinOp= ruleBinOp EOF
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
    // InternalPLhlcl.g:1596:1: ruleBinOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' ) ;
    public final AntlrDatatypeRuleToken ruleBinOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1602:2: ( (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' ) )
            // InternalPLhlcl.g:1603:2: (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' )
            {
            // InternalPLhlcl.g:1603:2: (kw= 'requires' | kw= 'excludes' | kw= 'optional' | kw= 'mandatory' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 38:
                {
                alt19=3;
                }
                break;
            case 39:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPLhlcl.g:1604:3: kw= 'requires'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getRequiresKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:1610:3: kw= 'excludes'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getExcludesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:1616:3: kw= 'optional'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinOpAccess().getOptionalKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPLhlcl.g:1622:3: kw= 'mandatory'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalPLhlcl.g:1631:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // InternalPLhlcl.g:1631:47: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalPLhlcl.g:1632:2: iv_ruleUnaryOp= ruleUnaryOp EOF
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
    // InternalPLhlcl.g:1638:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'optional' | kw= 'mandatory' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPLhlcl.g:1644:2: ( (kw= 'optional' | kw= 'mandatory' ) )
            // InternalPLhlcl.g:1645:2: (kw= 'optional' | kw= 'mandatory' )
            {
            // InternalPLhlcl.g:1645:2: (kw= 'optional' | kw= 'mandatory' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==39) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPLhlcl.g:1646:3: kw= 'optional'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getOptionalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:1652:3: kw= 'mandatory'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000E00006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010A00010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000180010030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010010L});

}