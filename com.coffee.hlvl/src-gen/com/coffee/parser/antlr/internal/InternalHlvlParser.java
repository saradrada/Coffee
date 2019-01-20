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
import com.coffee.services.HlvlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHlvlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'elements:'", "'relations:'", "'configuration:'", "'att'", "'is'", "'variants:'", "'..'", "'['", "']'", "':'", "'coreElements'", "'('", "')'", "'instantiable'", "','", "'implies'", "'mutex'", "'decomposition'", "'<'", "'>'", "'group'", "'visibility'", "'before'", "'after'", "'expression'", "'<=>'", "'=>'", "'OR'", "'AND'", "'='", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'mod'", "'~'", "'true'", "'false'", "'.'", "'boolean'", "'integer'", "'symbolic'", "'at_most'", "'all_different'", "'pow'", "'dist'", "'min'", "'max'", "'abs'", "'sqrt'", "'instances'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


        public InternalHlvlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHlvlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHlvlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHlvl.g"; }



     	private HlvlGrammarAccess grammarAccess;

        public InternalHlvlParser(TokenStream input, HlvlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected HlvlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHlvl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHlvl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalHlvl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalHlvl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'configuration:' ( (lv_pairs_7_0= ruleListOfValuation ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_relations_5_0 = null;

        EObject lv_pairs_7_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'configuration:' ( (lv_pairs_7_0= ruleListOfValuation ) ) )* ) )
            // InternalHlvl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'configuration:' ( (lv_pairs_7_0= ruleListOfValuation ) ) )* )
            {
            // InternalHlvl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'configuration:' ( (lv_pairs_7_0= ruleListOfValuation ) ) )* )
            // InternalHlvl.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'configuration:' ( (lv_pairs_7_0= ruleListOfValuation ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalHlvl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHlvl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHlvl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalHlvl.g:85:5: lv_name_1_0= RULE_ID
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

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getElementsKeyword_2());
            		
            // InternalHlvl.g:105:3: ( (lv_elements_3_0= ruleElmDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==17||(LA1_0>=54 && LA1_0<=56)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHlvl.g:106:4: (lv_elements_3_0= ruleElmDeclaration )
            	    {
            	    // InternalHlvl.g:106:4: (lv_elements_3_0= ruleElmDeclaration )
            	    // InternalHlvl.g:107:5: lv_elements_3_0= ruleElmDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsElmDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleElmDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"com.coffee.Hlvl.ElmDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRelationsKeyword_4());
            		
            // InternalHlvl.g:128:3: ( (lv_relations_5_0= ruleRelDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHlvl.g:129:4: (lv_relations_5_0= ruleRelDeclaration )
            	    {
            	    // InternalHlvl.g:129:4: (lv_relations_5_0= ruleRelDeclaration )
            	    // InternalHlvl.g:130:5: lv_relations_5_0= ruleRelDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRelationsRelDeclarationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_relations_5_0=ruleRelDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_5_0,
            	    						"com.coffee.Hlvl.RelDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalHlvl.g:147:3: (otherlv_6= 'configuration:' ( (lv_pairs_7_0= ruleListOfValuation ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHlvl.g:148:4: otherlv_6= 'configuration:' ( (lv_pairs_7_0= ruleListOfValuation ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getConfigurationKeyword_6_0());
            	    			
            	    // InternalHlvl.g:152:4: ( (lv_pairs_7_0= ruleListOfValuation ) )
            	    // InternalHlvl.g:153:5: (lv_pairs_7_0= ruleListOfValuation )
            	    {
            	    // InternalHlvl.g:153:5: (lv_pairs_7_0= ruleListOfValuation )
            	    // InternalHlvl.g:154:6: lv_pairs_7_0= ruleListOfValuation
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getPairsListOfValuationParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_pairs_7_0=ruleListOfValuation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pairs",
            	    							lv_pairs_7_0,
            	    							"com.coffee.Hlvl.ListOfValuation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleElmDeclaration"
    // InternalHlvl.g:176:1: entryRuleElmDeclaration returns [EObject current=null] : iv_ruleElmDeclaration= ruleElmDeclaration EOF ;
    public final EObject entryRuleElmDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElmDeclaration = null;


        try {
            // InternalHlvl.g:176:55: (iv_ruleElmDeclaration= ruleElmDeclaration EOF )
            // InternalHlvl.g:177:2: iv_ruleElmDeclaration= ruleElmDeclaration EOF
            {
             newCompositeNode(grammarAccess.getElmDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElmDeclaration=ruleElmDeclaration();

            state._fsp--;

             current =iv_ruleElmDeclaration; 
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
    // $ANTLR end "entryRuleElmDeclaration"


    // $ANTLR start "ruleElmDeclaration"
    // InternalHlvl.g:183:1: ruleElmDeclaration returns [EObject current=null] : ( ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleConstDecl ) ) ) | this_VariableDecl_4= ruleVariableDecl ) ;
    public final EObject ruleElmDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_att_0_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_dataType_1_0 = null;

        EObject lv_declaration_3_0 = null;

        EObject this_VariableDecl_4 = null;



        	enterRule();

        try {
            // InternalHlvl.g:189:2: ( ( ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleConstDecl ) ) ) | this_VariableDecl_4= ruleVariableDecl ) )
            // InternalHlvl.g:190:2: ( ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleConstDecl ) ) ) | this_VariableDecl_4= ruleVariableDecl )
            {
            // InternalHlvl.g:190:2: ( ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleConstDecl ) ) ) | this_VariableDecl_4= ruleVariableDecl )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15||(LA5_0>=54 && LA5_0<=56)) ) {
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
                    // InternalHlvl.g:191:3: ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleConstDecl ) ) )
                    {
                    // InternalHlvl.g:191:3: ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleConstDecl ) ) )
                    // InternalHlvl.g:192:4: ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleConstDecl ) )
                    {
                    // InternalHlvl.g:192:4: ( (lv_att_0_0= 'att' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalHlvl.g:193:5: (lv_att_0_0= 'att' )
                            {
                            // InternalHlvl.g:193:5: (lv_att_0_0= 'att' )
                            // InternalHlvl.g:194:6: lv_att_0_0= 'att'
                            {
                            lv_att_0_0=(Token)match(input,15,FOLLOW_9); 

                            						newLeafNode(lv_att_0_0, grammarAccess.getElmDeclarationAccess().getAttAttKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getElmDeclarationRule());
                            						}
                            						setWithLastConsumed(current, "att", lv_att_0_0, "att");
                            					

                            }


                            }
                            break;

                    }

                    // InternalHlvl.g:206:4: ( (lv_dataType_1_0= ruleDataType ) )
                    // InternalHlvl.g:207:5: (lv_dataType_1_0= ruleDataType )
                    {
                    // InternalHlvl.g:207:5: (lv_dataType_1_0= ruleDataType )
                    // InternalHlvl.g:208:6: lv_dataType_1_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getElmDeclarationAccess().getDataTypeDataTypeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_dataType_1_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElmDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"dataType",
                    							lv_dataType_1_0,
                    							"com.coffee.Hlvl.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHlvl.g:225:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalHlvl.g:226:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalHlvl.g:226:5: (lv_name_2_0= RULE_ID )
                    // InternalHlvl.g:227:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getElmDeclarationAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalHlvl.g:243:4: ( (lv_declaration_3_0= ruleConstDecl ) )
                    // InternalHlvl.g:244:5: (lv_declaration_3_0= ruleConstDecl )
                    {
                    // InternalHlvl.g:244:5: (lv_declaration_3_0= ruleConstDecl )
                    // InternalHlvl.g:245:6: lv_declaration_3_0= ruleConstDecl
                    {

                    						newCompositeNode(grammarAccess.getElmDeclarationAccess().getDeclarationConstDeclParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_declaration_3_0=ruleConstDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElmDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"declaration",
                    							lv_declaration_3_0,
                    							"com.coffee.Hlvl.ConstDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:264:3: this_VariableDecl_4= ruleVariableDecl
                    {

                    			newCompositeNode(grammarAccess.getElmDeclarationAccess().getVariableDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDecl_4=ruleVariableDecl();

                    state._fsp--;


                    			current = this_VariableDecl_4;
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
    // $ANTLR end "ruleElmDeclaration"


    // $ANTLR start "entryRuleConstDecl"
    // InternalHlvl.g:276:1: entryRuleConstDecl returns [EObject current=null] : iv_ruleConstDecl= ruleConstDecl EOF ;
    public final EObject entryRuleConstDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDecl = null;


        try {
            // InternalHlvl.g:276:50: (iv_ruleConstDecl= ruleConstDecl EOF )
            // InternalHlvl.g:277:2: iv_ruleConstDecl= ruleConstDecl EOF
            {
             newCompositeNode(grammarAccess.getConstDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstDecl=ruleConstDecl();

            state._fsp--;

             current =iv_ruleConstDecl; 
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
    // $ANTLR end "entryRuleConstDecl"


    // $ANTLR start "ruleConstDecl"
    // InternalHlvl.g:283:1: ruleConstDecl returns [EObject current=null] : ( () (otherlv_1= 'is' ( (lv_value_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleConstDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:289:2: ( ( () (otherlv_1= 'is' ( (lv_value_2_0= RULE_INT ) ) )? ) )
            // InternalHlvl.g:290:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= RULE_INT ) ) )? )
            {
            // InternalHlvl.g:290:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= RULE_INT ) ) )? )
            // InternalHlvl.g:291:3: () (otherlv_1= 'is' ( (lv_value_2_0= RULE_INT ) ) )?
            {
            // InternalHlvl.g:291:3: ()
            // InternalHlvl.g:292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstDeclAccess().getConstantDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:298:3: (otherlv_1= 'is' ( (lv_value_2_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHlvl.g:299:4: otherlv_1= 'is' ( (lv_value_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstDeclAccess().getIsKeyword_1_0());
                    			
                    // InternalHlvl.g:303:4: ( (lv_value_2_0= RULE_INT ) )
                    // InternalHlvl.g:304:5: (lv_value_2_0= RULE_INT )
                    {
                    // InternalHlvl.g:304:5: (lv_value_2_0= RULE_INT )
                    // InternalHlvl.g:305:6: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getConstDeclAccess().getValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleConstDecl"


    // $ANTLR start "entryRuleVariableDecl"
    // InternalHlvl.g:326:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalHlvl.g:326:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalHlvl.g:327:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDecl=ruleVariableDecl();

            state._fsp--;

             current =iv_ruleVariableDecl; 
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
    // $ANTLR end "entryRuleVariableDecl"


    // $ANTLR start "ruleVariableDecl"
    // InternalHlvl.g:333:1: ruleVariableDecl returns [EObject current=null] : ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variants_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:339:2: ( ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) )
            // InternalHlvl.g:340:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            {
            // InternalHlvl.g:340:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            // InternalHlvl.g:341:3: () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            {
            // InternalHlvl.g:341:3: ()
            // InternalHlvl.g:342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableDeclAccess().getElementDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:348:3: (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            // InternalHlvl.g:349:4: otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            {
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            				newLeafNode(otherlv_1, grammarAccess.getVariableDeclAccess().getVariantsKeyword_1_0());
            			
            // InternalHlvl.g:353:4: ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            // InternalHlvl.g:354:5: (lv_variants_2_0= ruleOptionsDeclaration )
            {
            // InternalHlvl.g:354:5: (lv_variants_2_0= ruleOptionsDeclaration )
            // InternalHlvl.g:355:6: lv_variants_2_0= ruleOptionsDeclaration
            {

            						newCompositeNode(grammarAccess.getVariableDeclAccess().getVariantsOptionsDeclarationParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_variants_2_0=ruleOptionsDeclaration();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVariableDeclRule());
            						}
            						set(
            							current,
            							"variants",
            							lv_variants_2_0,
            							"com.coffee.Hlvl.OptionsDeclaration");
            						afterParserOrEnumRuleCall();
            					

            }


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
    // $ANTLR end "ruleVariableDecl"


    // $ANTLR start "entryRuleOptionsDeclaration"
    // InternalHlvl.g:377:1: entryRuleOptionsDeclaration returns [EObject current=null] : iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF ;
    public final EObject entryRuleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionsDeclaration = null;


        try {
            // InternalHlvl.g:377:59: (iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF )
            // InternalHlvl.g:378:2: iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF
            {
             newCompositeNode(grammarAccess.getOptionsDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionsDeclaration=ruleOptionsDeclaration();

            state._fsp--;

             current =iv_ruleOptionsDeclaration; 
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
    // $ANTLR end "entryRuleOptionsDeclaration"


    // $ANTLR start "ruleOptionsDeclaration"
    // InternalHlvl.g:384:1: ruleOptionsDeclaration returns [EObject current=null] : (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Interval_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:390:2: ( (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) )
            // InternalHlvl.g:391:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            {
            // InternalHlvl.g:391:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHlvl.g:392:3: this_Interval_0= ruleInterval
                    {

                    			newCompositeNode(grammarAccess.getOptionsDeclarationAccess().getIntervalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interval_0=ruleInterval();

                    state._fsp--;


                    			current = this_Interval_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:401:3: this_Enumeration_1= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getOptionsDeclarationAccess().getEnumerationParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleOptionsDeclaration"


    // $ANTLR start "entryRuleInterval"
    // InternalHlvl.g:413:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalHlvl.g:413:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalHlvl.g:414:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalHlvl.g:420:1: ruleInterval returns [EObject current=null] : ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:426:2: ( ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) ) )
            // InternalHlvl.g:427:2: ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) )
            {
            // InternalHlvl.g:427:2: ( ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) ) )
            // InternalHlvl.g:428:3: ( (lv_start_0_0= ruleNumber ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumber ) )
            {
            // InternalHlvl.g:428:3: ( (lv_start_0_0= ruleNumber ) )
            // InternalHlvl.g:429:4: (lv_start_0_0= ruleNumber )
            {
            // InternalHlvl.g:429:4: (lv_start_0_0= ruleNumber )
            // InternalHlvl.g:430:5: lv_start_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getStartNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_start_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_0_0,
            						"com.coffee.Hlvl.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
            		
            // InternalHlvl.g:451:3: ( (lv_end_2_0= ruleNumber ) )
            // InternalHlvl.g:452:4: (lv_end_2_0= ruleNumber )
            {
            // InternalHlvl.g:452:4: (lv_end_2_0= ruleNumber )
            // InternalHlvl.g:453:5: lv_end_2_0= ruleNumber
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
            						"com.coffee.Hlvl.Number");
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
    // InternalHlvl.g:474:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalHlvl.g:474:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalHlvl.g:475:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalHlvl.g:481:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:487:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalHlvl.g:488:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalHlvl.g:488:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalHlvl.g:489:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHlvl.g:493:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalHlvl.g:494:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalHlvl.g:494:4: (lv_list_1_0= ruleListOfValues )
            // InternalHlvl.g:495:5: lv_list_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_list_1_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_1_0,
            						"com.coffee.Hlvl.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRelDeclaration"
    // InternalHlvl.g:520:1: entryRuleRelDeclaration returns [EObject current=null] : iv_ruleRelDeclaration= ruleRelDeclaration EOF ;
    public final EObject entryRuleRelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelDeclaration = null;


        try {
            // InternalHlvl.g:520:55: (iv_ruleRelDeclaration= ruleRelDeclaration EOF )
            // InternalHlvl.g:521:2: iv_ruleRelDeclaration= ruleRelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelDeclaration=ruleRelDeclaration();

            state._fsp--;

             current =iv_ruleRelDeclaration; 
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
    // $ANTLR end "entryRuleRelDeclaration"


    // $ANTLR start "ruleRelDeclaration"
    // InternalHlvl.g:527:1: ruleRelDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) ) ;
    public final EObject ruleRelDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:533:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) ) )
            // InternalHlvl.g:534:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) )
            {
            // InternalHlvl.g:534:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) )
            // InternalHlvl.g:535:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) )
            {
            // InternalHlvl.g:535:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalHlvl.g:536:4: (lv_name_0_0= RULE_ID )
            {
            // InternalHlvl.g:536:4: (lv_name_0_0= RULE_ID )
            // InternalHlvl.g:537:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRelDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRelDeclarationAccess().getColonKeyword_1());
            		
            // InternalHlvl.g:557:3: ( (lv_exp_2_0= ruleRelation ) )
            // InternalHlvl.g:558:4: (lv_exp_2_0= ruleRelation )
            {
            // InternalHlvl.g:558:4: (lv_exp_2_0= ruleRelation )
            // InternalHlvl.g:559:5: lv_exp_2_0= ruleRelation
            {

            					newCompositeNode(grammarAccess.getRelDeclarationAccess().getExpRelationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelDeclarationRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"com.coffee.Hlvl.Relation");
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
    // $ANTLR end "ruleRelDeclaration"


    // $ANTLR start "entryRuleRelation"
    // InternalHlvl.g:580:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalHlvl.g:580:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalHlvl.g:581:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalHlvl.g:587:1: ruleRelation returns [EObject current=null] : (this_List_0= ruleList | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Hierarchy_3= ruleHierarchy | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_List_0 = null;

        EObject this_Pair_1 = null;

        EObject this_VarList_2 = null;

        EObject this_Hierarchy_3 = null;

        EObject this_Order_4 = null;

        EObject this_MultInstantiation_5 = null;

        EObject this_Expression_6 = null;

        EObject this_Visibility_7 = null;

        EObject this_QImplies_8 = null;

        EObject this_ComplexImplies_9 = null;



        	enterRule();

        try {
            // InternalHlvl.g:593:2: ( (this_List_0= ruleList | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Hierarchy_3= ruleHierarchy | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies ) )
            // InternalHlvl.g:594:2: (this_List_0= ruleList | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Hierarchy_3= ruleHierarchy | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies )
            {
            // InternalHlvl.g:594:2: (this_List_0= ruleList | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Hierarchy_3= ruleHierarchy | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalHlvl.g:595:3: this_List_0= ruleList
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_0=ruleList();

                    state._fsp--;


                    			current = this_List_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:604:3: this_Pair_1= rulePair
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getPairParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pair_1=rulePair();

                    state._fsp--;


                    			current = this_Pair_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:613:3: this_VarList_2= ruleVarList
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getVarListParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarList_2=ruleVarList();

                    state._fsp--;


                    			current = this_VarList_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:622:3: this_Hierarchy_3= ruleHierarchy
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getHierarchyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hierarchy_3=ruleHierarchy();

                    state._fsp--;


                    			current = this_Hierarchy_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalHlvl.g:631:3: this_Order_4= ruleOrder
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getOrderParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Order_4=ruleOrder();

                    state._fsp--;


                    			current = this_Order_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalHlvl.g:640:3: this_MultInstantiation_5= ruleMultInstantiation
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getMultInstantiationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultInstantiation_5=ruleMultInstantiation();

                    state._fsp--;


                    			current = this_MultInstantiation_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalHlvl.g:649:3: this_Expression_6= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_6=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalHlvl.g:658:3: this_Visibility_7= ruleVisibility
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getVisibilityParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visibility_7=ruleVisibility();

                    state._fsp--;


                    			current = this_Visibility_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalHlvl.g:667:3: this_QImplies_8= ruleQImplies
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getQImpliesParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_QImplies_8=ruleQImplies();

                    state._fsp--;


                    			current = this_QImplies_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalHlvl.g:676:3: this_ComplexImplies_9= ruleComplexImplies
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getComplexImpliesParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexImplies_9=ruleComplexImplies();

                    state._fsp--;


                    			current = this_ComplexImplies_9;
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleList"
    // InternalHlvl.g:688:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalHlvl.g:688:45: (iv_ruleList= ruleList EOF )
            // InternalHlvl.g:689:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalHlvl.g:695:1: ruleList returns [EObject current=null] : ( ( (lv_type_0_0= 'coreElements' ) ) otherlv_1= '(' ( (lv_elements_2_0= ruleListOfIDs ) ) otherlv_3= ')' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:701:2: ( ( ( (lv_type_0_0= 'coreElements' ) ) otherlv_1= '(' ( (lv_elements_2_0= ruleListOfIDs ) ) otherlv_3= ')' ) )
            // InternalHlvl.g:702:2: ( ( (lv_type_0_0= 'coreElements' ) ) otherlv_1= '(' ( (lv_elements_2_0= ruleListOfIDs ) ) otherlv_3= ')' )
            {
            // InternalHlvl.g:702:2: ( ( (lv_type_0_0= 'coreElements' ) ) otherlv_1= '(' ( (lv_elements_2_0= ruleListOfIDs ) ) otherlv_3= ')' )
            // InternalHlvl.g:703:3: ( (lv_type_0_0= 'coreElements' ) ) otherlv_1= '(' ( (lv_elements_2_0= ruleListOfIDs ) ) otherlv_3= ')'
            {
            // InternalHlvl.g:703:3: ( (lv_type_0_0= 'coreElements' ) )
            // InternalHlvl.g:704:4: (lv_type_0_0= 'coreElements' )
            {
            // InternalHlvl.g:704:4: (lv_type_0_0= 'coreElements' )
            // InternalHlvl.g:705:5: lv_type_0_0= 'coreElements'
            {
            lv_type_0_0=(Token)match(input,22,FOLLOW_7); 

            					newLeafNode(lv_type_0_0, grammarAccess.getListAccess().getTypeCoreElementsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "coreElements");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:721:3: ( (lv_elements_2_0= ruleListOfIDs ) )
            // InternalHlvl.g:722:4: (lv_elements_2_0= ruleListOfIDs )
            {
            // InternalHlvl.g:722:4: (lv_elements_2_0= ruleListOfIDs )
            // InternalHlvl.g:723:5: lv_elements_2_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getListAccess().getElementsListOfIDsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_elements_2_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleMultInstantiation"
    // InternalHlvl.g:748:1: entryRuleMultInstantiation returns [EObject current=null] : iv_ruleMultInstantiation= ruleMultInstantiation EOF ;
    public final EObject entryRuleMultInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultInstantiation = null;


        try {
            // InternalHlvl.g:748:58: (iv_ruleMultInstantiation= ruleMultInstantiation EOF )
            // InternalHlvl.g:749:2: iv_ruleMultInstantiation= ruleMultInstantiation EOF
            {
             newCompositeNode(grammarAccess.getMultInstantiationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultInstantiation=ruleMultInstantiation();

            state._fsp--;

             current =iv_ruleMultInstantiation; 
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
    // $ANTLR end "entryRuleMultInstantiation"


    // $ANTLR start "ruleMultInstantiation"
    // InternalHlvl.g:755:1: ruleMultInstantiation returns [EObject current=null] : (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' ) ;
    public final EObject ruleMultInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_min_3_0 = null;

        EObject lv_max_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:761:2: ( (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' ) )
            // InternalHlvl.g:762:2: (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' )
            {
            // InternalHlvl.g:762:2: (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' )
            // InternalHlvl.g:763:3: otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultInstantiationAccess().getInstantiableKeyword_0());
            		
            // InternalHlvl.g:767:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:768:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:768:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:769:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultInstantiationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getMultInstantiationAccess().getNameElmDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMultInstantiationAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalHlvl.g:784:3: ( (lv_min_3_0= ruleNumber ) )
            // InternalHlvl.g:785:4: (lv_min_3_0= ruleNumber )
            {
            // InternalHlvl.g:785:4: (lv_min_3_0= ruleNumber )
            // InternalHlvl.g:786:5: lv_min_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMultInstantiationAccess().getMinNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_min_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultInstantiationRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_3_0,
            						"com.coffee.Hlvl.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMultInstantiationAccess().getCommaKeyword_4());
            		
            // InternalHlvl.g:807:3: ( (lv_max_5_0= ruleNumber ) )
            // InternalHlvl.g:808:4: (lv_max_5_0= ruleNumber )
            {
            // InternalHlvl.g:808:4: (lv_max_5_0= ruleNumber )
            // InternalHlvl.g:809:5: lv_max_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMultInstantiationAccess().getMaxNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_max_5_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultInstantiationRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_5_0,
            						"com.coffee.Hlvl.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMultInstantiationAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMultInstantiation"


    // $ANTLR start "entryRulePair"
    // InternalHlvl.g:834:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalHlvl.g:834:45: (iv_rulePair= rulePair EOF )
            // InternalHlvl.g:835:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalHlvl.g:841:1: rulePair returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalHlvl.g:847:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalHlvl.g:848:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalHlvl.g:848:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalHlvl.g:849:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalHlvl.g:849:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHlvl.g:850:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHlvl.g:850:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHlvl.g:851:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHlvl.g:851:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHlvl.g:852:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,27,FOLLOW_7); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getPairAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPairRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:863:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,28,FOLLOW_7); 

                    						newLeafNode(lv_operator_0_2, grammarAccess.getPairAccess().getOperatorMutexKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPairRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:880:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:881:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:881:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:882:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getPairAccess().getVar1ElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPairAccess().getCommaKeyword_3());
            		
            // InternalHlvl.g:897:3: ( (otherlv_4= RULE_ID ) )
            // InternalHlvl.g:898:4: (otherlv_4= RULE_ID )
            {
            // InternalHlvl.g:898:4: (otherlv_4= RULE_ID )
            // InternalHlvl.g:899:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_4, grammarAccess.getPairAccess().getVar2ElmDeclarationCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPairAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleComplexImplies"
    // InternalHlvl.g:918:1: entryRuleComplexImplies returns [EObject current=null] : iv_ruleComplexImplies= ruleComplexImplies EOF ;
    public final EObject entryRuleComplexImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexImplies = null;


        try {
            // InternalHlvl.g:918:55: (iv_ruleComplexImplies= ruleComplexImplies EOF )
            // InternalHlvl.g:919:2: iv_ruleComplexImplies= ruleComplexImplies EOF
            {
             newCompositeNode(grammarAccess.getComplexImpliesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexImplies=ruleComplexImplies();

            state._fsp--;

             current =iv_ruleComplexImplies; 
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
    // $ANTLR end "entryRuleComplexImplies"


    // $ANTLR start "ruleComplexImplies"
    // InternalHlvl.g:925:1: ruleComplexImplies returns [EObject current=null] : (otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleComplexImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:931:2: ( (otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalHlvl.g:932:2: (otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalHlvl.g:932:2: (otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalHlvl.g:933:3: otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexImpliesAccess().getImpliesKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:941:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:942:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:942:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:943:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexImpliesRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getComplexImpliesAccess().getVar1ElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexImpliesAccess().getCommaKeyword_3());
            		
            // InternalHlvl.g:958:3: ( (lv_exp_4_0= ruleExpression ) )
            // InternalHlvl.g:959:4: (lv_exp_4_0= ruleExpression )
            {
            // InternalHlvl.g:959:4: (lv_exp_4_0= ruleExpression )
            // InternalHlvl.g:960:5: lv_exp_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getComplexImpliesAccess().getExpExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_exp_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexImpliesRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_4_0,
            						"com.coffee.Hlvl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexImpliesAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleComplexImplies"


    // $ANTLR start "entryRuleQImplies"
    // InternalHlvl.g:985:1: entryRuleQImplies returns [EObject current=null] : iv_ruleQImplies= ruleQImplies EOF ;
    public final EObject entryRuleQImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQImplies = null;


        try {
            // InternalHlvl.g:985:49: (iv_ruleQImplies= ruleQImplies EOF )
            // InternalHlvl.g:986:2: iv_ruleQImplies= ruleQImplies EOF
            {
             newCompositeNode(grammarAccess.getQImpliesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQImplies=ruleQImplies();

            state._fsp--;

             current =iv_ruleQImplies; 
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
    // $ANTLR end "entryRuleQImplies"


    // $ANTLR start "ruleQImplies"
    // InternalHlvl.g:992:1: ruleQImplies returns [EObject current=null] : (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' ) ;
    public final EObject ruleQImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mina_1_0=null;
        Token otherlv_2=null;
        Token lv_maxa_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_minb_8_0=null;
        Token otherlv_9=null;
        Token lv_maxb_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalHlvl.g:998:2: ( (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' ) )
            // InternalHlvl.g:999:2: (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' )
            {
            // InternalHlvl.g:999:2: (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' )
            // InternalHlvl.g:1000:3: otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getQImpliesAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHlvl.g:1004:3: ( (lv_mina_1_0= RULE_INT ) )
            // InternalHlvl.g:1005:4: (lv_mina_1_0= RULE_INT )
            {
            // InternalHlvl.g:1005:4: (lv_mina_1_0= RULE_INT )
            // InternalHlvl.g:1006:5: lv_mina_1_0= RULE_INT
            {
            lv_mina_1_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_mina_1_0, grammarAccess.getQImpliesAccess().getMinaINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQImpliesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mina",
            						lv_mina_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getQImpliesAccess().getCommaKeyword_2());
            		
            // InternalHlvl.g:1026:3: ( (lv_maxa_3_0= RULE_INT ) )
            // InternalHlvl.g:1027:4: (lv_maxa_3_0= RULE_INT )
            {
            // InternalHlvl.g:1027:4: (lv_maxa_3_0= RULE_INT )
            // InternalHlvl.g:1028:5: lv_maxa_3_0= RULE_INT
            {
            lv_maxa_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_maxa_3_0, grammarAccess.getQImpliesAccess().getMaxaINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQImpliesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxa",
            						lv_maxa_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getQImpliesAccess().getRightSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1048:3: ( (otherlv_5= RULE_ID ) )
            // InternalHlvl.g:1049:4: (otherlv_5= RULE_ID )
            {
            // InternalHlvl.g:1049:4: (otherlv_5= RULE_ID )
            // InternalHlvl.g:1050:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQImpliesRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_5, grammarAccess.getQImpliesAccess().getVar1ElmDeclarationCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getQImpliesAccess().getImpliesKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getQImpliesAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalHlvl.g:1069:3: ( (lv_minb_8_0= RULE_INT ) )
            // InternalHlvl.g:1070:4: (lv_minb_8_0= RULE_INT )
            {
            // InternalHlvl.g:1070:4: (lv_minb_8_0= RULE_INT )
            // InternalHlvl.g:1071:5: lv_minb_8_0= RULE_INT
            {
            lv_minb_8_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_minb_8_0, grammarAccess.getQImpliesAccess().getMinbINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQImpliesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minb",
            						lv_minb_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getQImpliesAccess().getCommaKeyword_9());
            		
            // InternalHlvl.g:1091:3: ( (lv_maxb_10_0= RULE_INT ) )
            // InternalHlvl.g:1092:4: (lv_maxb_10_0= RULE_INT )
            {
            // InternalHlvl.g:1092:4: (lv_maxb_10_0= RULE_INT )
            // InternalHlvl.g:1093:5: lv_maxb_10_0= RULE_INT
            {
            lv_maxb_10_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_maxb_10_0, grammarAccess.getQImpliesAccess().getMaxbINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQImpliesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxb",
            						lv_maxb_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getQImpliesAccess().getRightSquareBracketKeyword_11());
            		

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
    // $ANTLR end "ruleQImplies"


    // $ANTLR start "entryRuleVarList"
    // InternalHlvl.g:1117:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalHlvl.g:1117:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalHlvl.g:1118:2: iv_ruleVarList= ruleVarList EOF
            {
             newCompositeNode(grammarAccess.getVarListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarList=ruleVarList();

            state._fsp--;

             current =iv_ruleVarList; 
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
    // $ANTLR end "entryRuleVarList"


    // $ANTLR start "ruleVarList"
    // InternalHlvl.g:1124:1: ruleVarList returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
    public final EObject ruleVarList() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_list_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1130:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1131:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1131:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1132:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            // InternalHlvl.g:1132:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHlvl.g:1133:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHlvl.g:1133:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHlvl.g:1134:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHlvl.g:1134:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalHlvl.g:1135:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,27,FOLLOW_7); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getVarListAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarListRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1146:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,28,FOLLOW_7); 

                    						newLeafNode(lv_operator_0_2, grammarAccess.getVarListAccess().getOperatorMutexKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarListRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1163:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:1164:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:1164:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:1165:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarListRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getVarListAccess().getVar1ElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getVarListAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVarListAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1184:3: ( (lv_list_5_0= ruleListOfIDs ) )
            // InternalHlvl.g:1185:4: (lv_list_5_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1185:4: (lv_list_5_0= ruleListOfIDs )
            // InternalHlvl.g:1186:5: lv_list_5_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getListListOfIDsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_list_5_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarListRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_5_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getVarListAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVarListAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleVarList"


    // $ANTLR start "entryRuleHierarchy"
    // InternalHlvl.g:1215:1: entryRuleHierarchy returns [EObject current=null] : iv_ruleHierarchy= ruleHierarchy EOF ;
    public final EObject entryRuleHierarchy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHierarchy = null;


        try {
            // InternalHlvl.g:1215:50: (iv_ruleHierarchy= ruleHierarchy EOF )
            // InternalHlvl.g:1216:2: iv_ruleHierarchy= ruleHierarchy EOF
            {
             newCompositeNode(grammarAccess.getHierarchyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHierarchy=ruleHierarchy();

            state._fsp--;

             current =iv_ruleHierarchy; 
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
    // $ANTLR end "entryRuleHierarchy"


    // $ANTLR start "ruleHierarchy"
    // InternalHlvl.g:1222:1: ruleHierarchy returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup ) ;
    public final EObject ruleHierarchy() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1228:2: ( (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup ) )
            // InternalHlvl.g:1229:2: (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup )
            {
            // InternalHlvl.g:1229:2: (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
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
                    // InternalHlvl.g:1230:3: this_Decomposition_0= ruleDecomposition
                    {

                    			newCompositeNode(grammarAccess.getHierarchyAccess().getDecompositionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decomposition_0=ruleDecomposition();

                    state._fsp--;


                    			current = this_Decomposition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1239:3: this_Group_1= ruleGroup
                    {

                    			newCompositeNode(grammarAccess.getHierarchyAccess().getGroupParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_1=ruleGroup();

                    state._fsp--;


                    			current = this_Group_1;
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
    // $ANTLR end "ruleHierarchy"


    // $ANTLR start "entryRuleDecomposition"
    // InternalHlvl.g:1251:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // InternalHlvl.g:1251:54: (iv_ruleDecomposition= ruleDecomposition EOF )
            // InternalHlvl.g:1252:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
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
    // $ANTLR end "entryRuleDecomposition"


    // $ANTLR start "ruleDecomposition"
    // InternalHlvl.g:1258:1: ruleDecomposition returns [EObject current=null] : (otherlv_0= 'decomposition' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '<' ( (lv_cardinality_9_0= RULE_INT ) ) otherlv_10= '>' ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_cardinality_9_0=null;
        Token otherlv_10=null;
        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1264:2: ( (otherlv_0= 'decomposition' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '<' ( (lv_cardinality_9_0= RULE_INT ) ) otherlv_10= '>' ) )
            // InternalHlvl.g:1265:2: (otherlv_0= 'decomposition' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '<' ( (lv_cardinality_9_0= RULE_INT ) ) otherlv_10= '>' )
            {
            // InternalHlvl.g:1265:2: (otherlv_0= 'decomposition' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '<' ( (lv_cardinality_9_0= RULE_INT ) ) otherlv_10= '>' )
            // InternalHlvl.g:1266:3: otherlv_0= 'decomposition' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '<' ( (lv_cardinality_9_0= RULE_INT ) ) otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDecompositionAccess().getDecompositionKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1274:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:1275:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:1275:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:1276:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getDecompositionAccess().getParentElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1295:3: ( (lv_children_5_0= ruleListOfIDs ) )
            // InternalHlvl.g:1296:4: (lv_children_5_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1296:4: (lv_children_5_0= ruleListOfIDs )
            // InternalHlvl.g:1297:5: lv_children_5_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getDecompositionAccess().getChildrenListOfIDsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_children_5_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecompositionRule());
            					}
            					set(
            						current,
            						"children",
            						lv_children_5_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getLessThanSignKeyword_8());
            		
            // InternalHlvl.g:1326:3: ( (lv_cardinality_9_0= RULE_INT ) )
            // InternalHlvl.g:1327:4: (lv_cardinality_9_0= RULE_INT )
            {
            // InternalHlvl.g:1327:4: (lv_cardinality_9_0= RULE_INT )
            // InternalHlvl.g:1328:5: lv_cardinality_9_0= RULE_INT
            {
            lv_cardinality_9_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_cardinality_9_0, grammarAccess.getDecompositionAccess().getCardinalityINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDecompositionAccess().getGreaterThanSignKeyword_10());
            		

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
    // $ANTLR end "ruleDecomposition"


    // $ANTLR start "entryRuleGroup"
    // InternalHlvl.g:1352:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalHlvl.g:1352:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalHlvl.g:1353:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalHlvl.g:1359:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '[' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_max_11_0= ruleRange ) ) otherlv_12= ']' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_min_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_children_5_0 = null;

        EObject lv_max_11_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1365:2: ( (otherlv_0= 'group' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '[' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_max_11_0= ruleRange ) ) otherlv_12= ']' ) )
            // InternalHlvl.g:1366:2: (otherlv_0= 'group' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '[' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_max_11_0= ruleRange ) ) otherlv_12= ']' )
            {
            // InternalHlvl.g:1366:2: (otherlv_0= 'group' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '[' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_max_11_0= ruleRange ) ) otherlv_12= ']' )
            // InternalHlvl.g:1367:3: otherlv_0= 'group' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' otherlv_8= '[' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_max_11_0= ruleRange ) ) otherlv_12= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1375:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:1376:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:1376:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:1377:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getParentElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1396:3: ( (lv_children_5_0= ruleListOfIDs ) )
            // InternalHlvl.g:1397:4: (lv_children_5_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1397:4: (lv_children_5_0= ruleListOfIDs )
            // InternalHlvl.g:1398:5: lv_children_5_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getChildrenListOfIDsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_children_5_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"children",
            						lv_children_5_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalHlvl.g:1427:3: ( (lv_min_9_0= RULE_INT ) )
            // InternalHlvl.g:1428:4: (lv_min_9_0= RULE_INT )
            {
            // InternalHlvl.g:1428:4: (lv_min_9_0= RULE_INT )
            // InternalHlvl.g:1429:5: lv_min_9_0= RULE_INT
            {
            lv_min_9_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_min_9_0, grammarAccess.getGroupAccess().getMinINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getCommaKeyword_10());
            		
            // InternalHlvl.g:1449:3: ( (lv_max_11_0= ruleRange ) )
            // InternalHlvl.g:1450:4: (lv_max_11_0= ruleRange )
            {
            // InternalHlvl.g:1450:4: (lv_max_11_0= ruleRange )
            // InternalHlvl.g:1451:5: lv_max_11_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getMaxRangeParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_15);
            lv_max_11_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_11_0,
            						"com.coffee.Hlvl.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_12());
            		

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleRange"
    // InternalHlvl.g:1476:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalHlvl.g:1476:46: (iv_ruleRange= ruleRange EOF )
            // InternalHlvl.g:1477:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalHlvl.g:1483:1: ruleRange returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:1489:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalHlvl.g:1490:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalHlvl.g:1490:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalHlvl.g:1491:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalHlvl.g:1491:3: ()
            // InternalHlvl.g:1492:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeAccess().getRangeAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:1498:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalHlvl.g:1499:4: (lv_value_1_0= RULE_INT )
            {
            // InternalHlvl.g:1499:4: (lv_value_1_0= RULE_INT )
            // InternalHlvl.g:1500:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRangeAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleVisibility"
    // InternalHlvl.g:1520:1: entryRuleVisibility returns [EObject current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final EObject entryRuleVisibility() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibility = null;


        try {
            // InternalHlvl.g:1520:51: (iv_ruleVisibility= ruleVisibility EOF )
            // InternalHlvl.g:1521:2: iv_ruleVisibility= ruleVisibility EOF
            {
             newCompositeNode(grammarAccess.getVisibilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisibility=ruleVisibility();

            state._fsp--;

             current =iv_ruleVisibility; 
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
    // $ANTLR end "entryRuleVisibility"


    // $ANTLR start "ruleVisibility"
    // InternalHlvl.g:1527:1: ruleVisibility returns [EObject current=null] : (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleConsExpression ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
    public final EObject ruleVisibility() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1533:2: ( (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleConsExpression ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1534:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleConsExpression ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1534:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleConsExpression ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1535:3: otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleConsExpression ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibilityAccess().getVisibilityKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getVisibilityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1543:3: ( (lv_condition_2_0= ruleConsExpression ) )
            // InternalHlvl.g:1544:4: (lv_condition_2_0= ruleConsExpression )
            {
            // InternalHlvl.g:1544:4: (lv_condition_2_0= ruleConsExpression )
            // InternalHlvl.g:1545:5: lv_condition_2_0= ruleConsExpression
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getConditionConsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_condition_2_0=ruleConsExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"com.coffee.Hlvl.ConsExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getVisibilityAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVisibilityAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1570:3: ( (lv_children_5_0= ruleListOfRelRefs ) )
            // InternalHlvl.g:1571:4: (lv_children_5_0= ruleListOfRelRefs )
            {
            // InternalHlvl.g:1571:4: (lv_children_5_0= ruleListOfRelRefs )
            // InternalHlvl.g:1572:5: lv_children_5_0= ruleListOfRelRefs
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getChildrenListOfRelRefsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_children_5_0=ruleListOfRelRefs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					add(
            						current,
            						"children",
            						lv_children_5_0,
            						"com.coffee.Hlvl.ListOfRelRefs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getVisibilityAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVisibilityAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "entryRuleOrder"
    // InternalHlvl.g:1601:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalHlvl.g:1601:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalHlvl.g:1602:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalHlvl.g:1608:1: ruleOrder returns [EObject current=null] : ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1614:2: ( ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) )
            // InternalHlvl.g:1615:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            {
            // InternalHlvl.g:1615:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            else if ( (LA12_0==35) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalHlvl.g:1616:3: ( (lv_operator_0_0= 'before' ) )
                    {
                    // InternalHlvl.g:1616:3: ( (lv_operator_0_0= 'before' ) )
                    // InternalHlvl.g:1617:4: (lv_operator_0_0= 'before' )
                    {
                    // InternalHlvl.g:1617:4: (lv_operator_0_0= 'before' )
                    // InternalHlvl.g:1618:5: lv_operator_0_0= 'before'
                    {
                    lv_operator_0_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_operator_0_0, grammarAccess.getOrderAccess().getOperatorBeforeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOrderRule());
                    					}
                    					setWithLastConsumed(current, "operator", lv_operator_0_0, "before");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1631:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    {
                    // InternalHlvl.g:1631:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    // InternalHlvl.g:1632:4: otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getAfterKeyword_1_0());
                    			
                    // InternalHlvl.g:1636:4: ( (otherlv_2= RULE_ID ) )
                    // InternalHlvl.g:1637:5: (otherlv_2= RULE_ID )
                    {
                    // InternalHlvl.g:1637:5: (otherlv_2= RULE_ID )
                    // InternalHlvl.g:1638:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getLeftElmDeclarationCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrderAccess().getCommaKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getLeftSquareBracketKeyword_1_3());
                    			
                    // InternalHlvl.g:1657:4: ( (lv_right_5_0= ruleListOfIDs ) )
                    // InternalHlvl.g:1658:5: (lv_right_5_0= ruleListOfIDs )
                    {
                    // InternalHlvl.g:1658:5: (lv_right_5_0= ruleListOfIDs )
                    // InternalHlvl.g:1659:6: lv_right_5_0= ruleListOfIDs
                    {

                    						newCompositeNode(grammarAccess.getOrderAccess().getRightListOfIDsParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_right_5_0=ruleListOfIDs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderRule());
                    						}
                    						add(
                    							current,
                    							"right",
                    							lv_right_5_0,
                    							"com.coffee.Hlvl.ListOfIDs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getOrderAccess().getRightSquareBracketKeyword_1_5());
                    			

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleExpression"
    // InternalHlvl.g:1685:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHlvl.g:1685:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHlvl.g:1686:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalHlvl.g:1692:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleConsExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1698:2: ( (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleConsExpression ) ) otherlv_3= ')' ) )
            // InternalHlvl.g:1699:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleConsExpression ) ) otherlv_3= ')' )
            {
            // InternalHlvl.g:1699:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleConsExpression ) ) otherlv_3= ')' )
            // InternalHlvl.g:1700:3: otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleConsExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1708:3: ( (lv_exp_2_0= ruleConsExpression ) )
            // InternalHlvl.g:1709:4: (lv_exp_2_0= ruleConsExpression )
            {
            // InternalHlvl.g:1709:4: (lv_exp_2_0= ruleConsExpression )
            // InternalHlvl.g:1710:5: lv_exp_2_0= ruleConsExpression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpConsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_exp_2_0=ruleConsExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"com.coffee.Hlvl.ConsExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleConsExpression"
    // InternalHlvl.g:1735:1: entryRuleConsExpression returns [EObject current=null] : iv_ruleConsExpression= ruleConsExpression EOF ;
    public final EObject entryRuleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsExpression = null;


        try {
            // InternalHlvl.g:1735:55: (iv_ruleConsExpression= ruleConsExpression EOF )
            // InternalHlvl.g:1736:2: iv_ruleConsExpression= ruleConsExpression EOF
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
    // InternalHlvl.g:1742:1: ruleConsExpression returns [EObject current=null] : (this_Relational_0= ruleRelational | this_Global_1= ruleGlobal ) ;
    public final EObject ruleConsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Relational_0 = null;

        EObject this_Global_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1748:2: ( (this_Relational_0= ruleRelational | this_Global_1= ruleGlobal ) )
            // InternalHlvl.g:1749:2: (this_Relational_0= ruleRelational | this_Global_1= ruleGlobal )
            {
            // InternalHlvl.g:1749:2: (this_Relational_0= ruleRelational | this_Global_1= ruleGlobal )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==23||(LA13_0>=50 && LA13_0<=52)||(LA13_0>=59 && LA13_0<=65)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=57 && LA13_0<=58)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalHlvl.g:1750:3: this_Relational_0= ruleRelational
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getRelationalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relational_0=ruleRelational();

                    state._fsp--;


                    			current = this_Relational_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1759:3: this_Global_1= ruleGlobal
                    {

                    			newCompositeNode(grammarAccess.getConsExpressionAccess().getGlobalParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleConsExpression"


    // $ANTLR start "entryRuleRelational"
    // InternalHlvl.g:1771:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalHlvl.g:1771:51: (iv_ruleRelational= ruleRelational EOF )
            // InternalHlvl.g:1772:2: iv_ruleRelational= ruleRelational EOF
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
    // InternalHlvl.g:1778:1: ruleRelational returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1784:2: (this_Iff_0= ruleIff )
            // InternalHlvl.g:1785:2: this_Iff_0= ruleIff
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
    // InternalHlvl.g:1796:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // InternalHlvl.g:1796:44: (iv_ruleIff= ruleIff EOF )
            // InternalHlvl.g:1797:2: iv_ruleIff= ruleIff EOF
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
    // InternalHlvl.g:1803:1: ruleIff returns [EObject current=null] : (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implies_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1809:2: ( (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) )
            // InternalHlvl.g:1810:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            {
            // InternalHlvl.g:1810:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            // InternalHlvl.g:1811:3: this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            {

            			newCompositeNode(grammarAccess.getIffAccess().getImpliesParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Implies_0=ruleImplies();

            state._fsp--;


            			current = this_Implies_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1819:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHlvl.g:1820:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) )
            	    {
            	    // InternalHlvl.g:1820:4: ()
            	    // InternalHlvl.g:1821:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getIffAccess().getIffLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1831:4: ( (lv_right_3_0= ruleImplies ) )
            	    // InternalHlvl.g:1832:5: (lv_right_3_0= ruleImplies )
            	    {
            	    // InternalHlvl.g:1832:5: (lv_right_3_0= ruleImplies )
            	    // InternalHlvl.g:1833:6: lv_right_3_0= ruleImplies
            	    {

            	    						newCompositeNode(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleImplies();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIffRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Implies");
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
    // $ANTLR end "ruleIff"


    // $ANTLR start "entryRuleImplies"
    // InternalHlvl.g:1855:1: entryRuleImplies returns [EObject current=null] : iv_ruleImplies= ruleImplies EOF ;
    public final EObject entryRuleImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplies = null;


        try {
            // InternalHlvl.g:1855:48: (iv_ruleImplies= ruleImplies EOF )
            // InternalHlvl.g:1856:2: iv_ruleImplies= ruleImplies EOF
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
    // InternalHlvl.g:1862:1: ruleImplies returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1868:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalHlvl.g:1869:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalHlvl.g:1869:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalHlvl.g:1870:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1878:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHlvl.g:1879:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalHlvl.g:1879:4: ()
            	    // InternalHlvl.g:1880:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImpliesAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1890:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalHlvl.g:1891:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalHlvl.g:1891:5: (lv_right_3_0= ruleOr )
            	    // InternalHlvl.g:1892:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImpliesRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Or");
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
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalHlvl.g:1914:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalHlvl.g:1914:43: (iv_ruleOr= ruleOr EOF )
            // InternalHlvl.g:1915:2: iv_ruleOr= ruleOr EOF
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
    // InternalHlvl.g:1921:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1927:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalHlvl.g:1928:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalHlvl.g:1928:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalHlvl.g:1929:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1937:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHlvl.g:1938:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalHlvl.g:1938:4: ()
            	    // InternalHlvl.g:1939:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1949:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalHlvl.g:1950:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalHlvl.g:1950:5: (lv_right_3_0= ruleAnd )
            	    // InternalHlvl.g:1951:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalHlvl.g:1973:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalHlvl.g:1973:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalHlvl.g:1974:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalHlvl.g:1980:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1986:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalHlvl.g:1987:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalHlvl.g:1987:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalHlvl.g:1988:3: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1996:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHlvl.g:1997:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalHlvl.g:1997:4: ()
            	    // InternalHlvl.g:1998:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalHlvl.g:2008:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalHlvl.g:2009:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalHlvl.g:2009:5: (lv_right_3_0= ruleEquality )
            	    // InternalHlvl.g:2010:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalHlvl.g:2032:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalHlvl.g:2032:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalHlvl.g:2033:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalHlvl.g:2039:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2045:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalHlvl.g:2046:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalHlvl.g:2046:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalHlvl.g:2047:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2055:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=41 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalHlvl.g:2056:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalHlvl.g:2056:4: ()
            	    // InternalHlvl.g:2057:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2063:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) )
            	    // InternalHlvl.g:2064:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalHlvl.g:2064:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    // InternalHlvl.g:2065:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    {
            	    // InternalHlvl.g:2065:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==41) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==42) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalHlvl.g:2066:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2077:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_27); 

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

            	    // InternalHlvl.g:2090:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalHlvl.g:2091:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalHlvl.g:2091:5: (lv_right_3_0= ruleComparison )
            	    // InternalHlvl.g:2092:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalHlvl.g:2114:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalHlvl.g:2114:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalHlvl.g:2115:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalHlvl.g:2121:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalHlvl.g:2127:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalHlvl.g:2128:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalHlvl.g:2128:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalHlvl.g:2129:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2137:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=30 && LA21_0<=31)||(LA21_0>=43 && LA21_0<=44)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalHlvl.g:2138:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalHlvl.g:2138:4: ()
            	    // InternalHlvl.g:2139:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2145:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalHlvl.g:2146:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalHlvl.g:2146:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalHlvl.g:2147:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalHlvl.g:2147:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 30:
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
            	            // InternalHlvl.g:2148:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,43,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2159:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,44,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2170:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,31,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalHlvl.g:2181:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,30,FOLLOW_27); 

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

            	    // InternalHlvl.g:2194:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalHlvl.g:2195:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalHlvl.g:2195:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalHlvl.g:2196:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalHlvl.g:2218:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalHlvl.g:2218:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalHlvl.g:2219:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalHlvl.g:2225:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2231:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalHlvl.g:2232:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalHlvl.g:2232:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalHlvl.g:2233:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2241:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=45 && LA23_0<=46)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalHlvl.g:2242:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalHlvl.g:2242:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==45) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==46) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalHlvl.g:2243:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalHlvl.g:2243:5: ( () otherlv_2= '+' )
            	            // InternalHlvl.g:2244:6: () otherlv_2= '+'
            	            {
            	            // InternalHlvl.g:2244:6: ()
            	            // InternalHlvl.g:2245:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,45,FOLLOW_27); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2257:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalHlvl.g:2257:5: ( () otherlv_4= '-' )
            	            // InternalHlvl.g:2258:6: () otherlv_4= '-'
            	            {
            	            // InternalHlvl.g:2258:6: ()
            	            // InternalHlvl.g:2259:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,46,FOLLOW_27); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalHlvl.g:2271:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalHlvl.g:2272:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalHlvl.g:2272:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalHlvl.g:2273:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.coffee.Hlvl.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalHlvl.g:2295:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalHlvl.g:2295:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalHlvl.g:2296:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalHlvl.g:2302:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2308:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalHlvl.g:2309:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalHlvl.g:2309:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalHlvl.g:2310:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2318:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=47 && LA25_0<=49)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalHlvl.g:2319:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalHlvl.g:2319:4: ()
            	    // InternalHlvl.g:2320:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2326:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
            	    // InternalHlvl.g:2327:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    {
            	    // InternalHlvl.g:2327:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    // InternalHlvl.g:2328:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    {
            	    // InternalHlvl.g:2328:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // InternalHlvl.g:2329:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,47,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2340:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,48,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2351:7: lv_op_2_3= 'mod'
            	            {
            	            lv_op_2_3=(Token)match(input,49,FOLLOW_27); 

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

            	    // InternalHlvl.g:2364:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalHlvl.g:2365:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalHlvl.g:2365:5: (lv_right_3_0= rulePrimary )
            	    // InternalHlvl.g:2366:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalHlvl.g:2388:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalHlvl.g:2388:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalHlvl.g:2389:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalHlvl.g:2395:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject this_Relational_1 = null;

        EObject lv_expression_5_0 = null;

        AntlrDatatypeRuleToken lv_op_7_0 = null;

        EObject lv_expression_9_0 = null;

        AntlrDatatypeRuleToken lv_op_12_0 = null;

        EObject lv_left_14_0 = null;

        EObject lv_right_16_0 = null;

        EObject this_Atomic_18 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2401:2: ( ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic ) )
            // InternalHlvl.g:2402:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic )
            {
            // InternalHlvl.g:2402:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt26=1;
                }
                break;
            case 50:
                {
                alt26=2;
                }
                break;
            case 63:
            case 64:
            case 65:
                {
                alt26=3;
                }
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                {
                alt26=4;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 51:
            case 52:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalHlvl.g:2403:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    {
                    // InternalHlvl.g:2403:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    // InternalHlvl.g:2404:4: otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getRelationalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_Relational_1=ruleRelational();

                    state._fsp--;


                    				current = this_Relational_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:2422:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalHlvl.g:2422:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalHlvl.g:2423:4: () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalHlvl.g:2423:4: ()
                    // InternalHlvl.g:2424:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNegationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,50,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getTildeKeyword_1_1());
                    			
                    // InternalHlvl.g:2434:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalHlvl.g:2435:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalHlvl.g:2435:5: (lv_expression_5_0= rulePrimary )
                    // InternalHlvl.g:2436:6: lv_expression_5_0= rulePrimary
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
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHlvl.g:2455:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' )
                    {
                    // InternalHlvl.g:2455:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' )
                    // InternalHlvl.g:2456:4: () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')'
                    {
                    // InternalHlvl.g:2456:4: ()
                    // InternalHlvl.g:2457:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUnaryAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2463:4: ( (lv_op_7_0= ruleUnaryOp ) )
                    // InternalHlvl.g:2464:5: (lv_op_7_0= ruleUnaryOp )
                    {
                    // InternalHlvl.g:2464:5: (lv_op_7_0= ruleUnaryOp )
                    // InternalHlvl.g:2465:6: lv_op_7_0= ruleUnaryOp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getOpUnaryOpParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_op_7_0=ruleUnaryOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_7_0,
                    							"com.coffee.Hlvl.UnaryOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalHlvl.g:2486:4: ( (lv_expression_9_0= rulePrimary ) )
                    // InternalHlvl.g:2487:5: (lv_expression_9_0= rulePrimary )
                    {
                    // InternalHlvl.g:2487:5: (lv_expression_9_0= rulePrimary )
                    // InternalHlvl.g:2488:6: lv_expression_9_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_expression_9_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_9_0,
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHlvl.g:2511:3: ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' )
                    {
                    // InternalHlvl.g:2511:3: ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' )
                    // InternalHlvl.g:2512:4: () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')'
                    {
                    // InternalHlvl.g:2512:4: ()
                    // InternalHlvl.g:2513:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getFunctionAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2519:4: ( (lv_op_12_0= ruleFunctionOp ) )
                    // InternalHlvl.g:2520:5: (lv_op_12_0= ruleFunctionOp )
                    {
                    // InternalHlvl.g:2520:5: (lv_op_12_0= ruleFunctionOp )
                    // InternalHlvl.g:2521:6: lv_op_12_0= ruleFunctionOp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getOpFunctionOpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_op_12_0=ruleFunctionOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_12_0,
                    							"com.coffee.Hlvl.FunctionOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_27); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalHlvl.g:2542:4: ( (lv_left_14_0= rulePrimary ) )
                    // InternalHlvl.g:2543:5: (lv_left_14_0= rulePrimary )
                    {
                    // InternalHlvl.g:2543:5: (lv_left_14_0= rulePrimary )
                    // InternalHlvl.g:2544:6: lv_left_14_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_left_14_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_14_0,
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getCommaKeyword_3_4());
                    			
                    // InternalHlvl.g:2565:4: ( (lv_right_16_0= rulePrimary ) )
                    // InternalHlvl.g:2566:5: (lv_right_16_0= rulePrimary )
                    {
                    // InternalHlvl.g:2566:5: (lv_right_16_0= rulePrimary )
                    // InternalHlvl.g:2567:6: lv_right_16_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getRightPrimaryParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_right_16_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_16_0,
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_6());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHlvl.g:2590:3: this_Atomic_18= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_18=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_18;
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
    // InternalHlvl.g:2602:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalHlvl.g:2602:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalHlvl.g:2603:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalHlvl.g:2609:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_3=null;
        Token lv_value_7_0=null;
        AntlrDatatypeRuleToken lv_attribute_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2615:2: ( ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) )
            // InternalHlvl.g:2616:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            {
            // InternalHlvl.g:2616:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 51:
            case 52:
                {
                alt28=1;
                }
                break;
            case RULE_ID:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==EOF||LA28_2==24||LA28_2==26||(LA28_2>=30 && LA28_2<=31)||(LA28_2>=37 && LA28_2<=49)) ) {
                    alt28=2;
                }
                else if ( (LA28_2==53) ) {
                    alt28=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalHlvl.g:2617:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    {
                    // InternalHlvl.g:2617:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    // InternalHlvl.g:2618:4: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    {
                    // InternalHlvl.g:2618:4: ()
                    // InternalHlvl.g:2619:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2625:4: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    // InternalHlvl.g:2626:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    {
                    // InternalHlvl.g:2626:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    // InternalHlvl.g:2627:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    {
                    // InternalHlvl.g:2627:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==51) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==52) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalHlvl.g:2628:7: lv_value_1_1= 'true'
                            {
                            lv_value_1_1=(Token)match(input,51,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalHlvl.g:2639:7: lv_value_1_2= 'false'
                            {
                            lv_value_1_2=(Token)match(input,52,FOLLOW_2); 

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
                    // InternalHlvl.g:2654:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalHlvl.g:2654:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalHlvl.g:2655:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalHlvl.g:2655:4: ()
                    // InternalHlvl.g:2656:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2662:4: ( (otherlv_3= RULE_ID ) )
                    // InternalHlvl.g:2663:5: (otherlv_3= RULE_ID )
                    {
                    // InternalHlvl.g:2663:5: (otherlv_3= RULE_ID )
                    // InternalHlvl.g:2664:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getVariableElmDeclarationCrossReference_1_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHlvl.g:2677:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    {
                    // InternalHlvl.g:2677:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    // InternalHlvl.g:2678:4: () ( (lv_attribute_5_0= ruleQualifiedName ) )
                    {
                    // InternalHlvl.g:2678:4: ()
                    // InternalHlvl.g:2679:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getAttributeRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2685:4: ( (lv_attribute_5_0= ruleQualifiedName ) )
                    // InternalHlvl.g:2686:5: (lv_attribute_5_0= ruleQualifiedName )
                    {
                    // InternalHlvl.g:2686:5: (lv_attribute_5_0= ruleQualifiedName )
                    // InternalHlvl.g:2687:6: lv_attribute_5_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getAttributeQualifiedNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attribute_5_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_5_0,
                    							"com.coffee.Hlvl.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalHlvl.g:2706:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // InternalHlvl.g:2706:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // InternalHlvl.g:2707:4: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // InternalHlvl.g:2707:4: ()
                    // InternalHlvl.g:2708:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2714:4: ( (lv_value_7_0= RULE_INT ) )
                    // InternalHlvl.g:2715:5: (lv_value_7_0= RULE_INT )
                    {
                    // InternalHlvl.g:2715:5: (lv_value_7_0= RULE_INT )
                    // InternalHlvl.g:2716:6: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalHlvl.g:2737:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalHlvl.g:2737:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalHlvl.g:2738:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalHlvl.g:2744:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:2750:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalHlvl.g:2751:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalHlvl.g:2751:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalHlvl.g:2752:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalHlvl.g:2759:3: (kw= '.' this_ID_2= RULE_ID )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==53) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalHlvl.g:2760:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleGlobal"
    // InternalHlvl.g:2777:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalHlvl.g:2777:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalHlvl.g:2778:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalHlvl.g:2784:1: ruleGlobal returns [EObject current=null] : ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )? ) ;
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
            // InternalHlvl.g:2790:2: ( ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )? ) )
            // InternalHlvl.g:2791:2: ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )? )
            {
            // InternalHlvl.g:2791:2: ( ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )? )
            // InternalHlvl.g:2792:3: ( (lv_op_0_0= ruleGlobalOp ) ) otherlv_1= '(' ( (lv_vars_2_0= ruleListOfIDs ) ) otherlv_3= ')' (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )?
            {
            // InternalHlvl.g:2792:3: ( (lv_op_0_0= ruleGlobalOp ) )
            // InternalHlvl.g:2793:4: (lv_op_0_0= ruleGlobalOp )
            {
            // InternalHlvl.g:2793:4: (lv_op_0_0= ruleGlobalOp )
            // InternalHlvl.g:2794:5: lv_op_0_0= ruleGlobalOp
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getOpGlobalOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_op_0_0=ruleGlobalOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"com.coffee.Hlvl.GlobalOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:2815:3: ( (lv_vars_2_0= ruleListOfIDs ) )
            // InternalHlvl.g:2816:4: (lv_vars_2_0= ruleListOfIDs )
            {
            // InternalHlvl.g:2816:4: (lv_vars_2_0= ruleListOfIDs )
            // InternalHlvl.g:2817:5: lv_vars_2_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getVarsListOfIDsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_vars_2_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_2_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalAccess().getRightParenthesisKeyword_3());
            		
            // InternalHlvl.g:2838:3: (otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHlvl.g:2839:4: otherlv_4= '[' ( (lv_values_5_0= ruleListOfListValues ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalHlvl.g:2843:4: ( (lv_values_5_0= ruleListOfListValues ) )
                    // InternalHlvl.g:2844:5: (lv_values_5_0= ruleListOfListValues )
                    {
                    // InternalHlvl.g:2844:5: (lv_values_5_0= ruleListOfListValues )
                    // InternalHlvl.g:2845:6: lv_values_5_0= ruleListOfListValues
                    {

                    						newCompositeNode(grammarAccess.getGlobalAccess().getValuesListOfListValuesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_values_5_0=ruleListOfListValues();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalRule());
                    						}
                    						set(
                    							current,
                    							"values",
                    							lv_values_5_0,
                    							"com.coffee.Hlvl.ListOfListValues");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBoolVal"
    // InternalHlvl.g:2871:1: entryRuleBoolVal returns [EObject current=null] : iv_ruleBoolVal= ruleBoolVal EOF ;
    public final EObject entryRuleBoolVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVal = null;


        try {
            // InternalHlvl.g:2871:48: (iv_ruleBoolVal= ruleBoolVal EOF )
            // InternalHlvl.g:2872:2: iv_ruleBoolVal= ruleBoolVal EOF
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
    // InternalHlvl.g:2878:1: ruleBoolVal returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:2884:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalHlvl.g:2885:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalHlvl.g:2885:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalHlvl.g:2886:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalHlvl.g:2886:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalHlvl.g:2887:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalHlvl.g:2887:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            else if ( (LA31_0==52) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalHlvl.g:2888:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,51,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolValRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:2899:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,52,FOLLOW_2); 

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
    // InternalHlvl.g:2915:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalHlvl.g:2915:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalHlvl.g:2916:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalHlvl.g:2922:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:2928:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalHlvl.g:2929:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalHlvl.g:2929:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalHlvl.g:2930:3: (lv_value_0_0= RULE_INT )
            {
            // InternalHlvl.g:2930:3: (lv_value_0_0= RULE_INT )
            // InternalHlvl.g:2931:4: lv_value_0_0= RULE_INT
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
    // InternalHlvl.g:2950:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalHlvl.g:2950:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalHlvl.g:2951:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalHlvl.g:2957:1: ruleSymbol returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:2963:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalHlvl.g:2964:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalHlvl.g:2964:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalHlvl.g:2965:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalHlvl.g:2965:3: (lv_value_0_0= RULE_STRING )
            // InternalHlvl.g:2966:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getSymbolAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSymbolRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // InternalHlvl.g:2985:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalHlvl.g:2985:46: (iv_ruleValue= ruleValue EOF )
            // InternalHlvl.g:2986:2: iv_ruleValue= ruleValue EOF
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
    // InternalHlvl.g:2992:1: ruleValue returns [EObject current=null] : (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_NonEnumerableValue_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2998:2: ( (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue ) )
            // InternalHlvl.g:2999:2: (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            {
            // InternalHlvl.g:2999:2: (this_Number_0= ruleNumber | this_NonEnumerableValue_1= ruleNonEnumerableValue )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_STRING||(LA32_0>=51 && LA32_0<=52)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalHlvl.g:3000:3: this_Number_0= ruleNumber
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
                    // InternalHlvl.g:3009:3: this_NonEnumerableValue_1= ruleNonEnumerableValue
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
    // InternalHlvl.g:3021:1: entryRuleNonEnumerableValue returns [EObject current=null] : iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF ;
    public final EObject entryRuleNonEnumerableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonEnumerableValue = null;


        try {
            // InternalHlvl.g:3021:59: (iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF )
            // InternalHlvl.g:3022:2: iv_ruleNonEnumerableValue= ruleNonEnumerableValue EOF
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
    // InternalHlvl.g:3028:1: ruleNonEnumerableValue returns [EObject current=null] : (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol ) ;
    public final EObject ruleNonEnumerableValue() throws RecognitionException {
        EObject current = null;

        EObject this_BoolVal_0 = null;

        EObject this_Symbol_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3034:2: ( (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol ) )
            // InternalHlvl.g:3035:2: (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol )
            {
            // InternalHlvl.g:3035:2: (this_BoolVal_0= ruleBoolVal | this_Symbol_1= ruleSymbol )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=51 && LA33_0<=52)) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalHlvl.g:3036:3: this_BoolVal_0= ruleBoolVal
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
                    // InternalHlvl.g:3045:3: this_Symbol_1= ruleSymbol
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


    // $ANTLR start "entryRuleDataType"
    // InternalHlvl.g:3057:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalHlvl.g:3057:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalHlvl.g:3058:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalHlvl.g:3064:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3070:2: ( (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) )
            // InternalHlvl.g:3071:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            {
            // InternalHlvl.g:3071:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt34=1;
                }
                break;
            case 55:
                {
                alt34=2;
                }
                break;
            case 56:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalHlvl.g:3072:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3078:3: kw= 'integer'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3084:3: kw= 'symbolic'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getSymbolicKeyword_2());
                    		

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleListOfValues"
    // InternalHlvl.g:3093:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalHlvl.g:3093:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalHlvl.g:3094:2: iv_ruleListOfValues= ruleListOfValues EOF
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
    // InternalHlvl.g:3100:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3106:2: ( ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) )
            // InternalHlvl.g:3107:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            {
            // InternalHlvl.g:3107:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            // InternalHlvl.g:3108:3: ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            {
            // InternalHlvl.g:3108:3: ( (lv_values_0_0= ruleValue ) )
            // InternalHlvl.g:3109:4: (lv_values_0_0= ruleValue )
            {
            // InternalHlvl.g:3109:4: (lv_values_0_0= ruleValue )
            // InternalHlvl.g:3110:5: lv_values_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_values_0_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"com.coffee.Hlvl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:3127:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalHlvl.g:3128:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) )
            	    {
            	    // InternalHlvl.g:3128:4: (otherlv_1= ',' )+
            	    int cnt35=0;
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==26) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3129:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,26,FOLLOW_39); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	    				

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

            	    // InternalHlvl.g:3134:4: ( (lv_values_2_0= ruleValue ) )
            	    // InternalHlvl.g:3135:5: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalHlvl.g:3135:5: (lv_values_2_0= ruleValue )
            	    // InternalHlvl.g:3136:6: lv_values_2_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"com.coffee.Hlvl.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalHlvl.g:3158:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalHlvl.g:3158:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalHlvl.g:3159:2: iv_ruleListOfIDs= ruleListOfIDs EOF
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
    // InternalHlvl.g:3165:1: ruleListOfIDs returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3171:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3172:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3172:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            // InternalHlvl.g:3173:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3173:3: ( (otherlv_0= RULE_ID ) )
            // InternalHlvl.g:3174:4: (otherlv_0= RULE_ID )
            {
            // InternalHlvl.g:3174:4: (otherlv_0= RULE_ID )
            // InternalHlvl.g:3175:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfIDsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_0, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalHlvl.g:3186:3: ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalHlvl.g:3187:4: (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3187:4: (otherlv_1= ',' )+
            	    int cnt37=0;
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==26) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3188:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,26,FOLLOW_40); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt37 >= 1 ) break loop37;
            	                EarlyExitException eee =
            	                    new EarlyExitException(37, input);
            	                throw eee;
            	        }
            	        cnt37++;
            	    } while (true);

            	    // InternalHlvl.g:3193:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalHlvl.g:3194:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalHlvl.g:3194:5: (otherlv_2= RULE_ID )
            	    // InternalHlvl.g:3195:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfIDsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    						newLeafNode(otherlv_2, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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


    // $ANTLR start "entryRuleListOfRelRefs"
    // InternalHlvl.g:3211:1: entryRuleListOfRelRefs returns [EObject current=null] : iv_ruleListOfRelRefs= ruleListOfRelRefs EOF ;
    public final EObject entryRuleListOfRelRefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfRelRefs = null;


        try {
            // InternalHlvl.g:3211:54: (iv_ruleListOfRelRefs= ruleListOfRelRefs EOF )
            // InternalHlvl.g:3212:2: iv_ruleListOfRelRefs= ruleListOfRelRefs EOF
            {
             newCompositeNode(grammarAccess.getListOfRelRefsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfRelRefs=ruleListOfRelRefs();

            state._fsp--;

             current =iv_ruleListOfRelRefs; 
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
    // $ANTLR end "entryRuleListOfRelRefs"


    // $ANTLR start "ruleListOfRelRefs"
    // InternalHlvl.g:3218:1: ruleListOfRelRefs returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfRelRefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3224:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3225:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3225:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            // InternalHlvl.g:3226:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3226:3: ( (otherlv_0= RULE_ID ) )
            // InternalHlvl.g:3227:4: (otherlv_0= RULE_ID )
            {
            // InternalHlvl.g:3227:4: (otherlv_0= RULE_ID )
            // InternalHlvl.g:3228:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfRelRefsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_0, grammarAccess.getListOfRelRefsAccess().getIdsRelDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalHlvl.g:3239:3: ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==26) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalHlvl.g:3240:4: (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3240:4: (otherlv_1= ',' )+
            	    int cnt39=0;
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==26) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3241:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,26,FOLLOW_40); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfRelRefsAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt39 >= 1 ) break loop39;
            	                EarlyExitException eee =
            	                    new EarlyExitException(39, input);
            	                throw eee;
            	        }
            	        cnt39++;
            	    } while (true);

            	    // InternalHlvl.g:3246:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalHlvl.g:3247:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalHlvl.g:3247:5: (otherlv_2= RULE_ID )
            	    // InternalHlvl.g:3248:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfRelRefsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    						newLeafNode(otherlv_2, grammarAccess.getListOfRelRefsAccess().getIdsRelDeclarationCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleListOfRelRefs"


    // $ANTLR start "entryRuleValuation"
    // InternalHlvl.g:3264:1: entryRuleValuation returns [EObject current=null] : iv_ruleValuation= ruleValuation EOF ;
    public final EObject entryRuleValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuation = null;


        try {
            // InternalHlvl.g:3264:50: (iv_ruleValuation= ruleValuation EOF )
            // InternalHlvl.g:3265:2: iv_ruleValuation= ruleValuation EOF
            {
             newCompositeNode(grammarAccess.getValuationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValuation=ruleValuation();

            state._fsp--;

             current =iv_ruleValuation; 
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
    // $ANTLR end "entryRuleValuation"


    // $ANTLR start "ruleValuation"
    // InternalHlvl.g:3271:1: ruleValuation returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3277:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) )
            // InternalHlvl.g:3278:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            {
            // InternalHlvl.g:3278:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            // InternalHlvl.g:3279:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValuationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalHlvl.g:3283:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3284:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3284:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3285:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValuationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getValuationAccess().getElementElmDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getValuationAccess().getCommaKeyword_2());
            		
            // InternalHlvl.g:3300:3: ( (lv_value_3_0= ruleValue ) )
            // InternalHlvl.g:3301:4: (lv_value_3_0= ruleValue )
            {
            // InternalHlvl.g:3301:4: (lv_value_3_0= ruleValue )
            // InternalHlvl.g:3302:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getValuationAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValuationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"com.coffee.Hlvl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getValuationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleValuation"


    // $ANTLR start "entryRuleListOfValuation"
    // InternalHlvl.g:3327:1: entryRuleListOfValuation returns [EObject current=null] : iv_ruleListOfValuation= ruleListOfValuation EOF ;
    public final EObject entryRuleListOfValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValuation = null;


        try {
            // InternalHlvl.g:3327:56: (iv_ruleListOfValuation= ruleListOfValuation EOF )
            // InternalHlvl.g:3328:2: iv_ruleListOfValuation= ruleListOfValuation EOF
            {
             newCompositeNode(grammarAccess.getListOfValuationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfValuation=ruleListOfValuation();

            state._fsp--;

             current =iv_ruleListOfValuation; 
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
    // $ANTLR end "entryRuleListOfValuation"


    // $ANTLR start "ruleListOfValuation"
    // InternalHlvl.g:3334:1: ruleListOfValuation returns [EObject current=null] : ( ( (lv_valuations_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_valuations_2_0= ruleValuation ) ) )* ) ;
    public final EObject ruleListOfValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valuations_0_0 = null;

        EObject lv_valuations_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3340:2: ( ( ( (lv_valuations_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_valuations_2_0= ruleValuation ) ) )* ) )
            // InternalHlvl.g:3341:2: ( ( (lv_valuations_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_valuations_2_0= ruleValuation ) ) )* )
            {
            // InternalHlvl.g:3341:2: ( ( (lv_valuations_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_valuations_2_0= ruleValuation ) ) )* )
            // InternalHlvl.g:3342:3: ( (lv_valuations_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_valuations_2_0= ruleValuation ) ) )*
            {
            // InternalHlvl.g:3342:3: ( (lv_valuations_0_0= ruleValuation ) )
            // InternalHlvl.g:3343:4: (lv_valuations_0_0= ruleValuation )
            {
            // InternalHlvl.g:3343:4: (lv_valuations_0_0= ruleValuation )
            // InternalHlvl.g:3344:5: lv_valuations_0_0= ruleValuation
            {

            					newCompositeNode(grammarAccess.getListOfValuationAccess().getValuationsValuationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_valuations_0_0=ruleValuation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfValuationRule());
            					}
            					add(
            						current,
            						"valuations",
            						lv_valuations_0_0,
            						"com.coffee.Hlvl.Valuation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:3361:3: ( (otherlv_1= ',' )+ ( (lv_valuations_2_0= ruleValuation ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalHlvl.g:3362:4: (otherlv_1= ',' )+ ( (lv_valuations_2_0= ruleValuation ) )
            	    {
            	    // InternalHlvl.g:3362:4: (otherlv_1= ',' )+
            	    int cnt41=0;
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==26) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3363:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,26,FOLLOW_41); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuationAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt41 >= 1 ) break loop41;
            	                EarlyExitException eee =
            	                    new EarlyExitException(41, input);
            	                throw eee;
            	        }
            	        cnt41++;
            	    } while (true);

            	    // InternalHlvl.g:3368:4: ( (lv_valuations_2_0= ruleValuation ) )
            	    // InternalHlvl.g:3369:5: (lv_valuations_2_0= ruleValuation )
            	    {
            	    // InternalHlvl.g:3369:5: (lv_valuations_2_0= ruleValuation )
            	    // InternalHlvl.g:3370:6: lv_valuations_2_0= ruleValuation
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuationAccess().getValuationsValuationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_valuations_2_0=ruleValuation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfValuationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"valuations",
            	    							lv_valuations_2_0,
            	    							"com.coffee.Hlvl.Valuation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleListOfValuation"


    // $ANTLR start "entryRuleListOfListValues"
    // InternalHlvl.g:3392:1: entryRuleListOfListValues returns [EObject current=null] : iv_ruleListOfListValues= ruleListOfListValues EOF ;
    public final EObject entryRuleListOfListValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfListValues = null;


        try {
            // InternalHlvl.g:3392:57: (iv_ruleListOfListValues= ruleListOfListValues EOF )
            // InternalHlvl.g:3393:2: iv_ruleListOfListValues= ruleListOfListValues EOF
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
    // InternalHlvl.g:3399:1: ruleListOfListValues returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )* ) ;
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
            // InternalHlvl.g:3405:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )* ) )
            // InternalHlvl.g:3406:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )* )
            {
            // InternalHlvl.g:3406:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )* )
            // InternalHlvl.g:3407:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfListValuesAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHlvl.g:3411:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalHlvl.g:3412:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalHlvl.g:3412:4: (lv_list_1_0= ruleListOfValues )
            // InternalHlvl.g:3413:5: lv_list_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getListOfListValuesAccess().getListListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_list_1_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfListValuesRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_1_0,
            						"com.coffee.Hlvl.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getListOfListValuesAccess().getRightSquareBracketKeyword_2());
            		
            // InternalHlvl.g:3434:3: ( (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']' )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==26) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalHlvl.g:3435:4: (otherlv_3= ',' )+ otherlv_4= '[' ( (lv_list_5_0= ruleListOfValues ) ) otherlv_6= ']'
            	    {
            	    // InternalHlvl.g:3435:4: (otherlv_3= ',' )+
            	    int cnt43=0;
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==26) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3436:5: otherlv_3= ','
            	    	    {
            	    	    otherlv_3=(Token)match(input,26,FOLLOW_42); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getListOfListValuesAccess().getCommaKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt43 >= 1 ) break loop43;
            	                EarlyExitException eee =
            	                    new EarlyExitException(43, input);
            	                throw eee;
            	        }
            	        cnt43++;
            	    } while (true);

            	    otherlv_4=(Token)match(input,19,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getListOfListValuesAccess().getLeftSquareBracketKeyword_3_1());
            	    			
            	    // InternalHlvl.g:3445:4: ( (lv_list_5_0= ruleListOfValues ) )
            	    // InternalHlvl.g:3446:5: (lv_list_5_0= ruleListOfValues )
            	    {
            	    // InternalHlvl.g:3446:5: (lv_list_5_0= ruleListOfValues )
            	    // InternalHlvl.g:3447:6: lv_list_5_0= ruleListOfValues
            	    {

            	    						newCompositeNode(grammarAccess.getListOfListValuesAccess().getListListOfValuesParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_list_5_0=ruleListOfValues();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfListValuesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_5_0,
            	    							"com.coffee.Hlvl.ListOfValues");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,20,FOLLOW_38); 

            	    				newLeafNode(otherlv_6, grammarAccess.getListOfListValuesAccess().getRightSquareBracketKeyword_3_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop44;
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


    // $ANTLR start "entryRuleGlobalOp"
    // InternalHlvl.g:3473:1: entryRuleGlobalOp returns [String current=null] : iv_ruleGlobalOp= ruleGlobalOp EOF ;
    public final String entryRuleGlobalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGlobalOp = null;


        try {
            // InternalHlvl.g:3473:48: (iv_ruleGlobalOp= ruleGlobalOp EOF )
            // InternalHlvl.g:3474:2: iv_ruleGlobalOp= ruleGlobalOp EOF
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
    // InternalHlvl.g:3480:1: ruleGlobalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'at_most' | kw= 'all_different' ) ;
    public final AntlrDatatypeRuleToken ruleGlobalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3486:2: ( (kw= 'at_most' | kw= 'all_different' ) )
            // InternalHlvl.g:3487:2: (kw= 'at_most' | kw= 'all_different' )
            {
            // InternalHlvl.g:3487:2: (kw= 'at_most' | kw= 'all_different' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            else if ( (LA45_0==58) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalHlvl.g:3488:3: kw= 'at_most'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getGlobalOpAccess().getAt_mostKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3494:3: kw= 'all_different'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

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
    // InternalHlvl.g:3503:1: entryRuleFunctionOp returns [String current=null] : iv_ruleFunctionOp= ruleFunctionOp EOF ;
    public final String entryRuleFunctionOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionOp = null;


        try {
            // InternalHlvl.g:3503:50: (iv_ruleFunctionOp= ruleFunctionOp EOF )
            // InternalHlvl.g:3504:2: iv_ruleFunctionOp= ruleFunctionOp EOF
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
    // InternalHlvl.g:3510:1: ruleFunctionOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3516:2: ( (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' ) )
            // InternalHlvl.g:3517:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' )
            {
            // InternalHlvl.g:3517:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt46=1;
                }
                break;
            case 60:
                {
                alt46=2;
                }
                break;
            case 61:
                {
                alt46=3;
                }
                break;
            case 62:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalHlvl.g:3518:3: kw= 'pow'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getPowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3524:3: kw= 'dist'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getDistKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3530:3: kw= 'min'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getMinKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:3536:3: kw= 'max'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

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
    // InternalHlvl.g:3545:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // InternalHlvl.g:3545:47: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalHlvl.g:3546:2: iv_ruleUnaryOp= ruleUnaryOp EOF
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
    // InternalHlvl.g:3552:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abs' | kw= 'sqrt' | kw= 'instances' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3558:2: ( (kw= 'abs' | kw= 'sqrt' | kw= 'instances' ) )
            // InternalHlvl.g:3559:2: (kw= 'abs' | kw= 'sqrt' | kw= 'instances' )
            {
            // InternalHlvl.g:3559:2: (kw= 'abs' | kw= 'sqrt' | kw= 'instances' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt47=1;
                }
                break;
            case 64:
                {
                alt47=2;
                }
                break;
            case 65:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalHlvl.g:3560:3: kw= 'abs'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getAbsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3566:3: kw= 'sqrt'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getSqrtKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3572:3: kw= 'instances'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getInstancesKeyword_2());
                    		

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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\23\1\uffff\2\27\6\uffff\2\4\2\32\2\4\3\uffff";
    static final String dfa_3s = "\1\44\1\uffff\2\27\6\uffff\2\4\2\32\1\44\1\23\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\6\uffff\1\3\1\2\1\12";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\2\uffff\1\1\2\uffff\1\6\1\uffff\1\2\1\3\1\4\2\uffff\1\4\1\10\2\5\1\7",
            "",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\21\16\uffff\1\20\20\uffff\1\22",
            "\1\21\16\uffff\1\20",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "594:2: (this_List_0= ruleList | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Hierarchy_3= ruleHierarchy | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x01C000000002A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x01C0000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0018000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001F3A480000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xFE1C000000800030L,0x0000000000000003L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF81C000000800030L,0x0000000000000003L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00001800C0000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0018000004000060L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000004080000L});

}