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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'elements:'", "'relations:'", "'operations:'", "'att'", "'is'", "'variants:'", "'..'", "'['", "']'", "':'", "'coreElements'", "'('", "')'", "'instantiable'", "','", "'implies'", "'mutex'", "'decomposition'", "'<'", "'>'", "'group'", "'visibility'", "'before'", "'after'", "'expression'", "'<=>'", "'=>'", "'OR'", "'AND'", "'='", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'mod'", "'~'", "'true'", "'false'", "'.'", "'validConfiguration'", "'validModel'", "'numberOfConfigurations'", "'findConfiguration'", "'findAllConfigurations'", "'\"'", "'boolean'", "'integer'", "'symbolic'", "'pow'", "'dist'", "'min'", "'max'", "'abs'", "'sqrt'", "'instances'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
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
    // InternalHlvl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_relations_5_0 = null;

        EObject lv_operations_7_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )? ) )
            // InternalHlvl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )? )
            {
            // InternalHlvl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )? )
            // InternalHlvl.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )?
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

                if ( (LA1_0==15||(LA1_0>=60 && LA1_0<=62)) ) {
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

            // InternalHlvl.g:147:3: (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHlvl.g:148:4: otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getOperationsKeyword_6_0());
                    			
                    // InternalHlvl.g:152:4: ( (lv_operations_7_0= ruleOperations ) )
                    // InternalHlvl.g:153:5: (lv_operations_7_0= ruleOperations )
                    {
                    // InternalHlvl.g:153:5: (lv_operations_7_0= ruleOperations )
                    // InternalHlvl.g:154:6: lv_operations_7_0= ruleOperations
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getOperationsOperationsParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operations_7_0=ruleOperations();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"operations",
                    							lv_operations_7_0,
                    							"com.coffee.Hlvl.Operations");
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
    // InternalHlvl.g:183:1: ruleElmDeclaration returns [EObject current=null] : ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) ) ) ;
    public final EObject ruleElmDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_att_0_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_dataType_1_0 = null;

        EObject lv_declaration_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:189:2: ( ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) ) ) )
            // InternalHlvl.g:190:2: ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) ) )
            {
            // InternalHlvl.g:190:2: ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) ) )
            // InternalHlvl.g:191:3: ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) )
            {
            // InternalHlvl.g:191:3: ( (lv_att_0_0= 'att' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHlvl.g:192:4: (lv_att_0_0= 'att' )
                    {
                    // InternalHlvl.g:192:4: (lv_att_0_0= 'att' )
                    // InternalHlvl.g:193:5: lv_att_0_0= 'att'
                    {
                    lv_att_0_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_att_0_0, grammarAccess.getElmDeclarationAccess().getAttAttKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getElmDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "att", lv_att_0_0, "att");
                    				

                    }


                    }
                    break;

            }

            // InternalHlvl.g:205:3: ( (lv_dataType_1_0= ruleDataType ) )
            // InternalHlvl.g:206:4: (lv_dataType_1_0= ruleDataType )
            {
            // InternalHlvl.g:206:4: (lv_dataType_1_0= ruleDataType )
            // InternalHlvl.g:207:5: lv_dataType_1_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getElmDeclarationAccess().getDataTypeDataTypeParserRuleCall_1_0());
            				
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

            // InternalHlvl.g:224:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHlvl.g:225:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHlvl.g:225:4: (lv_name_2_0= RULE_ID )
            // InternalHlvl.g:226:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getElmDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            // InternalHlvl.g:242:3: ( (lv_declaration_3_0= ruleDeclaration ) )
            // InternalHlvl.g:243:4: (lv_declaration_3_0= ruleDeclaration )
            {
            // InternalHlvl.g:243:4: (lv_declaration_3_0= ruleDeclaration )
            // InternalHlvl.g:244:5: lv_declaration_3_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getElmDeclarationAccess().getDeclarationDeclarationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_declaration_3_0=ruleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElmDeclarationRule());
            					}
            					set(
            						current,
            						"declaration",
            						lv_declaration_3_0,
            						"com.coffee.Hlvl.Declaration");
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
    // $ANTLR end "ruleElmDeclaration"


    // $ANTLR start "entryRuleDeclaration"
    // InternalHlvl.g:265:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalHlvl.g:265:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalHlvl.g:266:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalHlvl.g:272:1: ruleDeclaration returns [EObject current=null] : (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantDecl_0 = null;

        EObject this_VariableDecl_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:278:2: ( (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) )
            // InternalHlvl.g:279:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            {
            // InternalHlvl.g:279:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||LA5_0==13||(LA5_0>=15 && LA5_0<=16)||(LA5_0>=60 && LA5_0<=62)) ) {
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
                    // InternalHlvl.g:280:3: this_ConstantDecl_0= ruleConstantDecl
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getConstantDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantDecl_0=ruleConstantDecl();

                    state._fsp--;


                    			current = this_ConstantDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:289:3: this_VariableDecl_1= ruleVariableDecl
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDecl_1=ruleVariableDecl();

                    state._fsp--;


                    			current = this_VariableDecl_1;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleConstantDecl"
    // InternalHlvl.g:301:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // InternalHlvl.g:301:53: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // InternalHlvl.g:302:2: iv_ruleConstantDecl= ruleConstantDecl EOF
            {
             newCompositeNode(grammarAccess.getConstantDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantDecl=ruleConstantDecl();

            state._fsp--;

             current =iv_ruleConstantDecl; 
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
    // $ANTLR end "entryRuleConstantDecl"


    // $ANTLR start "ruleConstantDecl"
    // InternalHlvl.g:308:1: ruleConstantDecl returns [EObject current=null] : ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:314:2: ( ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? ) )
            // InternalHlvl.g:315:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? )
            {
            // InternalHlvl.g:315:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? )
            // InternalHlvl.g:316:3: () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )?
            {
            // InternalHlvl.g:316:3: ()
            // InternalHlvl.g:317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantDeclAccess().getConstantDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:323:3: (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHlvl.g:324:4: otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstantDeclAccess().getIsKeyword_1_0());
                    			
                    // InternalHlvl.g:328:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalHlvl.g:329:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalHlvl.g:329:5: (lv_value_2_0= ruleValue )
                    // InternalHlvl.g:330:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getConstantDeclAccess().getValueValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantDeclRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"com.coffee.Hlvl.Value");
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
    // $ANTLR end "ruleConstantDecl"


    // $ANTLR start "entryRuleVariableDecl"
    // InternalHlvl.g:352:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalHlvl.g:352:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalHlvl.g:353:2: iv_ruleVariableDecl= ruleVariableDecl EOF
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
    // InternalHlvl.g:359:1: ruleVariableDecl returns [EObject current=null] : ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variants_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:365:2: ( ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) )
            // InternalHlvl.g:366:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            {
            // InternalHlvl.g:366:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            // InternalHlvl.g:367:3: () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            {
            // InternalHlvl.g:367:3: ()
            // InternalHlvl.g:368:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableDeclAccess().getVariableDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:374:3: (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            // InternalHlvl.g:375:4: otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            {
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            				newLeafNode(otherlv_1, grammarAccess.getVariableDeclAccess().getVariantsKeyword_1_0());
            			
            // InternalHlvl.g:379:4: ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            // InternalHlvl.g:380:5: (lv_variants_2_0= ruleOptionsDeclaration )
            {
            // InternalHlvl.g:380:5: (lv_variants_2_0= ruleOptionsDeclaration )
            // InternalHlvl.g:381:6: lv_variants_2_0= ruleOptionsDeclaration
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
    // InternalHlvl.g:403:1: entryRuleOptionsDeclaration returns [EObject current=null] : iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF ;
    public final EObject entryRuleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionsDeclaration = null;


        try {
            // InternalHlvl.g:403:59: (iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF )
            // InternalHlvl.g:404:2: iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF
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
    // InternalHlvl.g:410:1: ruleOptionsDeclaration returns [EObject current=null] : (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Interval_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:416:2: ( (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) )
            // InternalHlvl.g:417:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            {
            // InternalHlvl.g:417:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
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
                    // InternalHlvl.g:418:3: this_Interval_0= ruleInterval
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
                    // InternalHlvl.g:427:3: this_Enumeration_1= ruleEnumeration
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
    // InternalHlvl.g:439:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalHlvl.g:439:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalHlvl.g:440:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalHlvl.g:446:1: ruleInterval returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:452:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalHlvl.g:453:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalHlvl.g:453:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalHlvl.g:454:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalHlvl.g:454:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalHlvl.g:455:4: (lv_start_0_0= RULE_INT )
            {
            // InternalHlvl.g:455:4: (lv_start_0_0= RULE_INT )
            // InternalHlvl.g:456:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_start_0_0, grammarAccess.getIntervalAccess().getStartINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
            		
            // InternalHlvl.g:476:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalHlvl.g:477:4: (lv_end_2_0= RULE_INT )
            {
            // InternalHlvl.g:477:4: (lv_end_2_0= RULE_INT )
            // InternalHlvl.g:478:5: lv_end_2_0= RULE_INT
            {
            lv_end_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_end_2_0, grammarAccess.getIntervalAccess().getEndINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_2_0,
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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleEnumeration"
    // InternalHlvl.g:498:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalHlvl.g:498:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalHlvl.g:499:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalHlvl.g:505:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:511:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalHlvl.g:512:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalHlvl.g:512:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalHlvl.g:513:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHlvl.g:517:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalHlvl.g:518:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalHlvl.g:518:4: (lv_list_1_0= ruleListOfValues )
            // InternalHlvl.g:519:5: lv_list_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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
    // InternalHlvl.g:544:1: entryRuleRelDeclaration returns [EObject current=null] : iv_ruleRelDeclaration= ruleRelDeclaration EOF ;
    public final EObject entryRuleRelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelDeclaration = null;


        try {
            // InternalHlvl.g:544:55: (iv_ruleRelDeclaration= ruleRelDeclaration EOF )
            // InternalHlvl.g:545:2: iv_ruleRelDeclaration= ruleRelDeclaration EOF
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
    // InternalHlvl.g:551:1: ruleRelDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) ) ;
    public final EObject ruleRelDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:557:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) ) )
            // InternalHlvl.g:558:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) )
            {
            // InternalHlvl.g:558:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) )
            // InternalHlvl.g:559:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) )
            {
            // InternalHlvl.g:559:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalHlvl.g:560:4: (lv_name_0_0= RULE_ID )
            {
            // InternalHlvl.g:560:4: (lv_name_0_0= RULE_ID )
            // InternalHlvl.g:561:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRelDeclarationAccess().getColonKeyword_1());
            		
            // InternalHlvl.g:581:3: ( (lv_exp_2_0= ruleRelation ) )
            // InternalHlvl.g:582:4: (lv_exp_2_0= ruleRelation )
            {
            // InternalHlvl.g:582:4: (lv_exp_2_0= ruleRelation )
            // InternalHlvl.g:583:5: lv_exp_2_0= ruleRelation
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
    // InternalHlvl.g:604:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalHlvl.g:604:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalHlvl.g:605:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalHlvl.g:611:1: ruleRelation returns [EObject current=null] : (this_Core_0= ruleCore | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Core_0 = null;

        EObject this_Hierarchy_1 = null;

        EObject this_Pair_2 = null;

        EObject this_VarList_3 = null;

        EObject this_Order_4 = null;

        EObject this_MultInstantiation_5 = null;

        EObject this_Expression_6 = null;

        EObject this_Visibility_7 = null;

        EObject this_QImplies_8 = null;

        EObject this_ComplexImplies_9 = null;



        	enterRule();

        try {
            // InternalHlvl.g:617:2: ( (this_Core_0= ruleCore | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies ) )
            // InternalHlvl.g:618:2: (this_Core_0= ruleCore | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies )
            {
            // InternalHlvl.g:618:2: (this_Core_0= ruleCore | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalHlvl.g:619:3: this_Core_0= ruleCore
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getCoreParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Core_0=ruleCore();

                    state._fsp--;


                    			current = this_Core_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:628:3: this_Hierarchy_1= ruleHierarchy
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getHierarchyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hierarchy_1=ruleHierarchy();

                    state._fsp--;


                    			current = this_Hierarchy_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:637:3: this_Pair_2= rulePair
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getPairParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pair_2=rulePair();

                    state._fsp--;


                    			current = this_Pair_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:646:3: this_VarList_3= ruleVarList
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getVarListParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarList_3=ruleVarList();

                    state._fsp--;


                    			current = this_VarList_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalHlvl.g:655:3: this_Order_4= ruleOrder
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
                    // InternalHlvl.g:664:3: this_MultInstantiation_5= ruleMultInstantiation
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
                    // InternalHlvl.g:673:3: this_Expression_6= ruleExpression
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
                    // InternalHlvl.g:682:3: this_Visibility_7= ruleVisibility
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
                    // InternalHlvl.g:691:3: this_QImplies_8= ruleQImplies
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
                    // InternalHlvl.g:700:3: this_ComplexImplies_9= ruleComplexImplies
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


    // $ANTLR start "entryRuleCore"
    // InternalHlvl.g:712:1: entryRuleCore returns [EObject current=null] : iv_ruleCore= ruleCore EOF ;
    public final EObject entryRuleCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCore = null;


        try {
            // InternalHlvl.g:712:45: (iv_ruleCore= ruleCore EOF )
            // InternalHlvl.g:713:2: iv_ruleCore= ruleCore EOF
            {
             newCompositeNode(grammarAccess.getCoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCore=ruleCore();

            state._fsp--;

             current =iv_ruleCore; 
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
    // $ANTLR end "entryRuleCore"


    // $ANTLR start "ruleCore"
    // InternalHlvl.g:719:1: ruleCore returns [EObject current=null] : ( () otherlv_1= 'coreElements' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' ) ;
    public final EObject ruleCore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:725:2: ( ( () otherlv_1= 'coreElements' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' ) )
            // InternalHlvl.g:726:2: ( () otherlv_1= 'coreElements' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' )
            {
            // InternalHlvl.g:726:2: ( () otherlv_1= 'coreElements' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' )
            // InternalHlvl.g:727:3: () otherlv_1= 'coreElements' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')'
            {
            // InternalHlvl.g:727:3: ()
            // InternalHlvl.g:728:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoreAccess().getCoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCoreAccess().getCoreElementsKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCoreAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:742:3: ( (lv_elements_3_0= ruleListOfIDs ) )
            // InternalHlvl.g:743:4: (lv_elements_3_0= ruleListOfIDs )
            {
            // InternalHlvl.g:743:4: (lv_elements_3_0= ruleListOfIDs )
            // InternalHlvl.g:744:5: lv_elements_3_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getCoreAccess().getElementsListOfIDsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_elements_3_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoreRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCoreAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCore"


    // $ANTLR start "entryRuleMultInstantiation"
    // InternalHlvl.g:769:1: entryRuleMultInstantiation returns [EObject current=null] : iv_ruleMultInstantiation= ruleMultInstantiation EOF ;
    public final EObject entryRuleMultInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultInstantiation = null;


        try {
            // InternalHlvl.g:769:58: (iv_ruleMultInstantiation= ruleMultInstantiation EOF )
            // InternalHlvl.g:770:2: iv_ruleMultInstantiation= ruleMultInstantiation EOF
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
    // InternalHlvl.g:776:1: ruleMultInstantiation returns [EObject current=null] : (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' ) ;
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
            // InternalHlvl.g:782:2: ( (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' ) )
            // InternalHlvl.g:783:2: (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' )
            {
            // InternalHlvl.g:783:2: (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' )
            // InternalHlvl.g:784:3: otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultInstantiationAccess().getInstantiableKeyword_0());
            		
            // InternalHlvl.g:788:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:789:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:789:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:790:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultInstantiationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getMultInstantiationAccess().getNameElmDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMultInstantiationAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalHlvl.g:805:3: ( (lv_min_3_0= ruleNumber ) )
            // InternalHlvl.g:806:4: (lv_min_3_0= ruleNumber )
            {
            // InternalHlvl.g:806:4: (lv_min_3_0= ruleNumber )
            // InternalHlvl.g:807:5: lv_min_3_0= ruleNumber
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

            otherlv_4=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getMultInstantiationAccess().getCommaKeyword_4());
            		
            // InternalHlvl.g:828:3: ( (lv_max_5_0= ruleNumber ) )
            // InternalHlvl.g:829:4: (lv_max_5_0= ruleNumber )
            {
            // InternalHlvl.g:829:4: (lv_max_5_0= ruleNumber )
            // InternalHlvl.g:830:5: lv_max_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMultInstantiationAccess().getMaxNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
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
    // InternalHlvl.g:855:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalHlvl.g:855:45: (iv_rulePair= rulePair EOF )
            // InternalHlvl.g:856:2: iv_rulePair= rulePair EOF
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
    // InternalHlvl.g:862:1: rulePair returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
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
            // InternalHlvl.g:868:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalHlvl.g:869:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalHlvl.g:869:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalHlvl.g:870:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalHlvl.g:870:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHlvl.g:871:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHlvl.g:871:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHlvl.g:872:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHlvl.g:872:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
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
                    // InternalHlvl.g:873:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,27,FOLLOW_17); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getPairAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPairRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:884:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,28,FOLLOW_17); 

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
            		
            // InternalHlvl.g:901:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:902:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:902:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:903:5: otherlv_2= RULE_ID
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
            		
            // InternalHlvl.g:918:3: ( (otherlv_4= RULE_ID ) )
            // InternalHlvl.g:919:4: (otherlv_4= RULE_ID )
            {
            // InternalHlvl.g:919:4: (otherlv_4= RULE_ID )
            // InternalHlvl.g:920:5: otherlv_4= RULE_ID
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
    // InternalHlvl.g:939:1: entryRuleComplexImplies returns [EObject current=null] : iv_ruleComplexImplies= ruleComplexImplies EOF ;
    public final EObject entryRuleComplexImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexImplies = null;


        try {
            // InternalHlvl.g:939:55: (iv_ruleComplexImplies= ruleComplexImplies EOF )
            // InternalHlvl.g:940:2: iv_ruleComplexImplies= ruleComplexImplies EOF
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
    // InternalHlvl.g:946:1: ruleComplexImplies returns [EObject current=null] : (otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
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
            // InternalHlvl.g:952:2: ( (otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalHlvl.g:953:2: (otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalHlvl.g:953:2: (otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalHlvl.g:954:3: otherlv_0= 'implies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexImpliesAccess().getImpliesKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:962:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:963:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:963:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:964:5: otherlv_2= RULE_ID
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
            		
            // InternalHlvl.g:979:3: ( (lv_exp_4_0= ruleExpression ) )
            // InternalHlvl.g:980:4: (lv_exp_4_0= ruleExpression )
            {
            // InternalHlvl.g:980:4: (lv_exp_4_0= ruleExpression )
            // InternalHlvl.g:981:5: lv_exp_4_0= ruleExpression
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
    // InternalHlvl.g:1006:1: entryRuleQImplies returns [EObject current=null] : iv_ruleQImplies= ruleQImplies EOF ;
    public final EObject entryRuleQImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQImplies = null;


        try {
            // InternalHlvl.g:1006:49: (iv_ruleQImplies= ruleQImplies EOF )
            // InternalHlvl.g:1007:2: iv_ruleQImplies= ruleQImplies EOF
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
    // InternalHlvl.g:1013:1: ruleQImplies returns [EObject current=null] : (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' ) ;
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
            // InternalHlvl.g:1019:2: ( (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' ) )
            // InternalHlvl.g:1020:2: (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' )
            {
            // InternalHlvl.g:1020:2: (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' )
            // InternalHlvl.g:1021:3: otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getQImpliesAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHlvl.g:1025:3: ( (lv_mina_1_0= RULE_INT ) )
            // InternalHlvl.g:1026:4: (lv_mina_1_0= RULE_INT )
            {
            // InternalHlvl.g:1026:4: (lv_mina_1_0= RULE_INT )
            // InternalHlvl.g:1027:5: lv_mina_1_0= RULE_INT
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

            otherlv_2=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getQImpliesAccess().getCommaKeyword_2());
            		
            // InternalHlvl.g:1047:3: ( (lv_maxa_3_0= RULE_INT ) )
            // InternalHlvl.g:1048:4: (lv_maxa_3_0= RULE_INT )
            {
            // InternalHlvl.g:1048:4: (lv_maxa_3_0= RULE_INT )
            // InternalHlvl.g:1049:5: lv_maxa_3_0= RULE_INT
            {
            lv_maxa_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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
            		
            // InternalHlvl.g:1069:3: ( (otherlv_5= RULE_ID ) )
            // InternalHlvl.g:1070:4: (otherlv_5= RULE_ID )
            {
            // InternalHlvl.g:1070:4: (otherlv_5= RULE_ID )
            // InternalHlvl.g:1071:5: otherlv_5= RULE_ID
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
            		
            otherlv_7=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getQImpliesAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalHlvl.g:1090:3: ( (lv_minb_8_0= RULE_INT ) )
            // InternalHlvl.g:1091:4: (lv_minb_8_0= RULE_INT )
            {
            // InternalHlvl.g:1091:4: (lv_minb_8_0= RULE_INT )
            // InternalHlvl.g:1092:5: lv_minb_8_0= RULE_INT
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

            otherlv_9=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getQImpliesAccess().getCommaKeyword_9());
            		
            // InternalHlvl.g:1112:3: ( (lv_maxb_10_0= RULE_INT ) )
            // InternalHlvl.g:1113:4: (lv_maxb_10_0= RULE_INT )
            {
            // InternalHlvl.g:1113:4: (lv_maxb_10_0= RULE_INT )
            // InternalHlvl.g:1114:5: lv_maxb_10_0= RULE_INT
            {
            lv_maxb_10_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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
    // InternalHlvl.g:1138:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalHlvl.g:1138:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalHlvl.g:1139:2: iv_ruleVarList= ruleVarList EOF
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
    // InternalHlvl.g:1145:1: ruleVarList returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
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
            // InternalHlvl.g:1151:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1152:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1152:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1153:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            // InternalHlvl.g:1153:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHlvl.g:1154:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHlvl.g:1154:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHlvl.g:1155:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHlvl.g:1155:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
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
                    // InternalHlvl.g:1156:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,27,FOLLOW_17); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getVarListAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarListRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1167:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,28,FOLLOW_17); 

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
            		
            // InternalHlvl.g:1184:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:1185:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:1185:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:1186:5: otherlv_2= RULE_ID
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
            		
            // InternalHlvl.g:1205:3: ( (lv_list_5_0= ruleListOfIDs ) )
            // InternalHlvl.g:1206:4: (lv_list_5_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1206:4: (lv_list_5_0= ruleListOfIDs )
            // InternalHlvl.g:1207:5: lv_list_5_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getListListOfIDsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_list_5_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarListRule());
            					}
            					set(
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
    // InternalHlvl.g:1236:1: entryRuleHierarchy returns [EObject current=null] : iv_ruleHierarchy= ruleHierarchy EOF ;
    public final EObject entryRuleHierarchy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHierarchy = null;


        try {
            // InternalHlvl.g:1236:50: (iv_ruleHierarchy= ruleHierarchy EOF )
            // InternalHlvl.g:1237:2: iv_ruleHierarchy= ruleHierarchy EOF
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
    // InternalHlvl.g:1243:1: ruleHierarchy returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup ) ;
    public final EObject ruleHierarchy() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1249:2: ( (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup ) )
            // InternalHlvl.g:1250:2: (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup )
            {
            // InternalHlvl.g:1250:2: (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup )
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
                    // InternalHlvl.g:1251:3: this_Decomposition_0= ruleDecomposition
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
                    // InternalHlvl.g:1260:3: this_Group_1= ruleGroup
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
    // InternalHlvl.g:1272:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // InternalHlvl.g:1272:54: (iv_ruleDecomposition= ruleDecomposition EOF )
            // InternalHlvl.g:1273:2: iv_ruleDecomposition= ruleDecomposition EOF
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
    // InternalHlvl.g:1279:1: ruleDecomposition returns [EObject current=null] : ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>' ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_cardinality_10_0=null;
        Token otherlv_11=null;
        EObject lv_children_6_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1285:2: ( ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>' ) )
            // InternalHlvl.g:1286:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>' )
            {
            // InternalHlvl.g:1286:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>' )
            // InternalHlvl.g:1287:3: () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>'
            {
            // InternalHlvl.g:1287:3: ()
            // InternalHlvl.g:1288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecompositionAccess().getDecompositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecompositionKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1302:3: ( (otherlv_3= RULE_ID ) )
            // InternalHlvl.g:1303:4: (otherlv_3= RULE_ID )
            {
            // InternalHlvl.g:1303:4: (otherlv_3= RULE_ID )
            // InternalHlvl.g:1304:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getDecompositionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHlvl.g:1323:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHlvl.g:1324:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1324:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHlvl.g:1325:5: lv_children_6_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getDecompositionAccess().getChildrenListOfIDsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_children_6_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecompositionRule());
            					}
            					set(
            						current,
            						"children",
            						lv_children_6_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getDecompositionAccess().getLessThanSignKeyword_9());
            		
            // InternalHlvl.g:1354:3: ( (lv_cardinality_10_0= RULE_INT ) )
            // InternalHlvl.g:1355:4: (lv_cardinality_10_0= RULE_INT )
            {
            // InternalHlvl.g:1355:4: (lv_cardinality_10_0= RULE_INT )
            // InternalHlvl.g:1356:5: lv_cardinality_10_0= RULE_INT
            {
            lv_cardinality_10_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_cardinality_10_0, grammarAccess.getDecompositionAccess().getCardinalityINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDecompositionAccess().getGreaterThanSignKeyword_11());
            		

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
    // InternalHlvl.g:1380:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalHlvl.g:1380:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalHlvl.g:1381:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalHlvl.g:1387:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_min_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_children_6_0 = null;

        EObject lv_max_12_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1393:2: ( ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' ) )
            // InternalHlvl.g:1394:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' )
            {
            // InternalHlvl.g:1394:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' )
            // InternalHlvl.g:1395:3: () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']'
            {
            // InternalHlvl.g:1395:3: ()
            // InternalHlvl.g:1396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1410:3: ( (otherlv_3= RULE_ID ) )
            // InternalHlvl.g:1411:4: (otherlv_3= RULE_ID )
            {
            // InternalHlvl.g:1411:4: (otherlv_3= RULE_ID )
            // InternalHlvl.g:1412:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHlvl.g:1431:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHlvl.g:1432:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1432:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHlvl.g:1433:5: lv_children_6_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getChildrenListOfIDsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_children_6_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"children",
            						lv_children_6_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalHlvl.g:1462:3: ( (lv_min_10_0= RULE_INT ) )
            // InternalHlvl.g:1463:4: (lv_min_10_0= RULE_INT )
            {
            // InternalHlvl.g:1463:4: (lv_min_10_0= RULE_INT )
            // InternalHlvl.g:1464:5: lv_min_10_0= RULE_INT
            {
            lv_min_10_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_min_10_0, grammarAccess.getGroupAccess().getMinINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getCommaKeyword_11());
            		
            // InternalHlvl.g:1484:3: ( (lv_max_12_0= ruleRange ) )
            // InternalHlvl.g:1485:4: (lv_max_12_0= ruleRange )
            {
            // InternalHlvl.g:1485:4: (lv_max_12_0= ruleRange )
            // InternalHlvl.g:1486:5: lv_max_12_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getMaxRangeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_14);
            lv_max_12_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_12_0,
            						"com.coffee.Hlvl.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_13());
            		

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
    // InternalHlvl.g:1511:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalHlvl.g:1511:46: (iv_ruleRange= ruleRange EOF )
            // InternalHlvl.g:1512:2: iv_ruleRange= ruleRange EOF
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
    // InternalHlvl.g:1518:1: ruleRange returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:1524:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalHlvl.g:1525:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalHlvl.g:1525:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalHlvl.g:1526:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalHlvl.g:1526:3: ()
            // InternalHlvl.g:1527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeAccess().getRangeAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:1533:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalHlvl.g:1534:4: (lv_value_1_0= RULE_INT )
            {
            // InternalHlvl.g:1534:4: (lv_value_1_0= RULE_INT )
            // InternalHlvl.g:1535:5: lv_value_1_0= RULE_INT
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
    // InternalHlvl.g:1555:1: entryRuleVisibility returns [EObject current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final EObject entryRuleVisibility() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibility = null;


        try {
            // InternalHlvl.g:1555:51: (iv_ruleVisibility= ruleVisibility EOF )
            // InternalHlvl.g:1556:2: iv_ruleVisibility= ruleVisibility EOF
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
    // InternalHlvl.g:1562:1: ruleVisibility returns [EObject current=null] : (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
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
            // InternalHlvl.g:1568:2: ( (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1569:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1569:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1570:3: otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_children_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibilityAccess().getVisibilityKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getVisibilityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1578:3: ( (lv_condition_2_0= ruleRelational ) )
            // InternalHlvl.g:1579:4: (lv_condition_2_0= ruleRelational )
            {
            // InternalHlvl.g:1579:4: (lv_condition_2_0= ruleRelational )
            // InternalHlvl.g:1580:5: lv_condition_2_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getConditionRelationalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_condition_2_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getVisibilityAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVisibilityAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1605:3: ( (lv_children_5_0= ruleListOfRelRefs ) )
            // InternalHlvl.g:1606:4: (lv_children_5_0= ruleListOfRelRefs )
            {
            // InternalHlvl.g:1606:4: (lv_children_5_0= ruleListOfRelRefs )
            // InternalHlvl.g:1607:5: lv_children_5_0= ruleListOfRelRefs
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getChildrenListOfRelRefsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_children_5_0=ruleListOfRelRefs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					set(
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
    // InternalHlvl.g:1636:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalHlvl.g:1636:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalHlvl.g:1637:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalHlvl.g:1643:1: ruleOrder returns [EObject current=null] : ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) ;
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
            // InternalHlvl.g:1649:2: ( ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) )
            // InternalHlvl.g:1650:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            {
            // InternalHlvl.g:1650:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
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
                    // InternalHlvl.g:1651:3: ( (lv_operator_0_0= 'before' ) )
                    {
                    // InternalHlvl.g:1651:3: ( (lv_operator_0_0= 'before' ) )
                    // InternalHlvl.g:1652:4: (lv_operator_0_0= 'before' )
                    {
                    // InternalHlvl.g:1652:4: (lv_operator_0_0= 'before' )
                    // InternalHlvl.g:1653:5: lv_operator_0_0= 'before'
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
                    // InternalHlvl.g:1666:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    {
                    // InternalHlvl.g:1666:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    // InternalHlvl.g:1667:4: otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getAfterKeyword_1_0());
                    			
                    // InternalHlvl.g:1671:4: ( (otherlv_2= RULE_ID ) )
                    // InternalHlvl.g:1672:5: (otherlv_2= RULE_ID )
                    {
                    // InternalHlvl.g:1672:5: (otherlv_2= RULE_ID )
                    // InternalHlvl.g:1673:6: otherlv_2= RULE_ID
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
                    			
                    // InternalHlvl.g:1692:4: ( (lv_right_5_0= ruleListOfIDs ) )
                    // InternalHlvl.g:1693:5: (lv_right_5_0= ruleListOfIDs )
                    {
                    // InternalHlvl.g:1693:5: (lv_right_5_0= ruleListOfIDs )
                    // InternalHlvl.g:1694:6: lv_right_5_0= ruleListOfIDs
                    {

                    						newCompositeNode(grammarAccess.getOrderAccess().getRightListOfIDsParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_14);
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
    // InternalHlvl.g:1720:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHlvl.g:1720:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHlvl.g:1721:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalHlvl.g:1727:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1733:2: ( (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) )
            // InternalHlvl.g:1734:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            {
            // InternalHlvl.g:1734:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            // InternalHlvl.g:1735:3: otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1743:3: ( (lv_exp_2_0= ruleRelational ) )
            // InternalHlvl.g:1744:4: (lv_exp_2_0= ruleRelational )
            {
            // InternalHlvl.g:1744:4: (lv_exp_2_0= ruleRelational )
            // InternalHlvl.g:1745:5: lv_exp_2_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpRelationalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_exp_2_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"com.coffee.Hlvl.Relational");
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


    // $ANTLR start "entryRuleRelational"
    // InternalHlvl.g:1770:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalHlvl.g:1770:51: (iv_ruleRelational= ruleRelational EOF )
            // InternalHlvl.g:1771:2: iv_ruleRelational= ruleRelational EOF
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
    // InternalHlvl.g:1777:1: ruleRelational returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1783:2: (this_Iff_0= ruleIff )
            // InternalHlvl.g:1784:2: this_Iff_0= ruleIff
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
    // InternalHlvl.g:1795:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // InternalHlvl.g:1795:44: (iv_ruleIff= ruleIff EOF )
            // InternalHlvl.g:1796:2: iv_ruleIff= ruleIff EOF
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
    // InternalHlvl.g:1802:1: ruleIff returns [EObject current=null] : (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implies_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1808:2: ( (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) )
            // InternalHlvl.g:1809:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            {
            // InternalHlvl.g:1809:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            // InternalHlvl.g:1810:3: this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            {

            			newCompositeNode(grammarAccess.getIffAccess().getImpliesParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Implies_0=ruleImplies();

            state._fsp--;


            			current = this_Implies_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1818:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHlvl.g:1819:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) )
            	    {
            	    // InternalHlvl.g:1819:4: ()
            	    // InternalHlvl.g:1820:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getIffAccess().getIffLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1830:4: ( (lv_right_3_0= ruleImplies ) )
            	    // InternalHlvl.g:1831:5: (lv_right_3_0= ruleImplies )
            	    {
            	    // InternalHlvl.g:1831:5: (lv_right_3_0= ruleImplies )
            	    // InternalHlvl.g:1832:6: lv_right_3_0= ruleImplies
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
            	    break loop13;
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
    // InternalHlvl.g:1854:1: entryRuleImplies returns [EObject current=null] : iv_ruleImplies= ruleImplies EOF ;
    public final EObject entryRuleImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplies = null;


        try {
            // InternalHlvl.g:1854:48: (iv_ruleImplies= ruleImplies EOF )
            // InternalHlvl.g:1855:2: iv_ruleImplies= ruleImplies EOF
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
    // InternalHlvl.g:1861:1: ruleImplies returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1867:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalHlvl.g:1868:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalHlvl.g:1868:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalHlvl.g:1869:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1877:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHlvl.g:1878:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalHlvl.g:1878:4: ()
            	    // InternalHlvl.g:1879:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImpliesAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1889:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalHlvl.g:1890:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalHlvl.g:1890:5: (lv_right_3_0= ruleOr )
            	    // InternalHlvl.g:1891:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalHlvl.g:1913:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalHlvl.g:1913:43: (iv_ruleOr= ruleOr EOF )
            // InternalHlvl.g:1914:2: iv_ruleOr= ruleOr EOF
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
    // InternalHlvl.g:1920:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1926:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalHlvl.g:1927:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalHlvl.g:1927:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalHlvl.g:1928:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1936:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHlvl.g:1937:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalHlvl.g:1937:4: ()
            	    // InternalHlvl.g:1938:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1948:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalHlvl.g:1949:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalHlvl.g:1949:5: (lv_right_3_0= ruleAnd )
            	    // InternalHlvl.g:1950:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalHlvl.g:1972:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalHlvl.g:1972:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalHlvl.g:1973:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalHlvl.g:1979:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1985:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalHlvl.g:1986:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalHlvl.g:1986:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalHlvl.g:1987:3: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1995:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHlvl.g:1996:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalHlvl.g:1996:4: ()
            	    // InternalHlvl.g:1997:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalHlvl.g:2007:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalHlvl.g:2008:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalHlvl.g:2008:5: (lv_right_3_0= ruleEquality )
            	    // InternalHlvl.g:2009:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalHlvl.g:2031:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalHlvl.g:2031:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalHlvl.g:2032:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalHlvl.g:2038:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2044:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalHlvl.g:2045:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalHlvl.g:2045:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalHlvl.g:2046:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2054:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=41 && LA18_0<=42)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHlvl.g:2055:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalHlvl.g:2055:4: ()
            	    // InternalHlvl.g:2056:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2062:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) )
            	    // InternalHlvl.g:2063:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalHlvl.g:2063:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    // InternalHlvl.g:2064:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    {
            	    // InternalHlvl.g:2064:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==41) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==42) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalHlvl.g:2065:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2076:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_25); 

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

            	    // InternalHlvl.g:2089:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalHlvl.g:2090:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalHlvl.g:2090:5: (lv_right_3_0= ruleComparison )
            	    // InternalHlvl.g:2091:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalHlvl.g:2113:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalHlvl.g:2113:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalHlvl.g:2114:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalHlvl.g:2120:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalHlvl.g:2126:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalHlvl.g:2127:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalHlvl.g:2127:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalHlvl.g:2128:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2136:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=30 && LA20_0<=31)||(LA20_0>=43 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHlvl.g:2137:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalHlvl.g:2137:4: ()
            	    // InternalHlvl.g:2138:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2144:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalHlvl.g:2145:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalHlvl.g:2145:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalHlvl.g:2146:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalHlvl.g:2146:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 30:
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
            	            // InternalHlvl.g:2147:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,43,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2158:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,44,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2169:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,31,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalHlvl.g:2180:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,30,FOLLOW_25); 

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

            	    // InternalHlvl.g:2193:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalHlvl.g:2194:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalHlvl.g:2194:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalHlvl.g:2195:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalHlvl.g:2217:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalHlvl.g:2217:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalHlvl.g:2218:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalHlvl.g:2224:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2230:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalHlvl.g:2231:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalHlvl.g:2231:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalHlvl.g:2232:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2240:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=45 && LA22_0<=46)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalHlvl.g:2241:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalHlvl.g:2241:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==45) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==46) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalHlvl.g:2242:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalHlvl.g:2242:5: ( () otherlv_2= '+' )
            	            // InternalHlvl.g:2243:6: () otherlv_2= '+'
            	            {
            	            // InternalHlvl.g:2243:6: ()
            	            // InternalHlvl.g:2244:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,45,FOLLOW_25); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2256:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalHlvl.g:2256:5: ( () otherlv_4= '-' )
            	            // InternalHlvl.g:2257:6: () otherlv_4= '-'
            	            {
            	            // InternalHlvl.g:2257:6: ()
            	            // InternalHlvl.g:2258:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,46,FOLLOW_25); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalHlvl.g:2270:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalHlvl.g:2271:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalHlvl.g:2271:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalHlvl.g:2272:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop22;
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
    // InternalHlvl.g:2294:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalHlvl.g:2294:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalHlvl.g:2295:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalHlvl.g:2301:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2307:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalHlvl.g:2308:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalHlvl.g:2308:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalHlvl.g:2309:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2317:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=47 && LA24_0<=49)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalHlvl.g:2318:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalHlvl.g:2318:4: ()
            	    // InternalHlvl.g:2319:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2325:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
            	    // InternalHlvl.g:2326:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    {
            	    // InternalHlvl.g:2326:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    // InternalHlvl.g:2327:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    {
            	    // InternalHlvl.g:2327:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // InternalHlvl.g:2328:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,47,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2339:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,48,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2350:7: lv_op_2_3= 'mod'
            	            {
            	            lv_op_2_3=(Token)match(input,49,FOLLOW_25); 

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

            	    // InternalHlvl.g:2363:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalHlvl.g:2364:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalHlvl.g:2364:5: (lv_right_3_0= rulePrimary )
            	    // InternalHlvl.g:2365:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop24;
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
    // InternalHlvl.g:2387:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalHlvl.g:2387:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalHlvl.g:2388:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalHlvl.g:2394:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic ) ;
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
            // InternalHlvl.g:2400:2: ( ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic ) )
            // InternalHlvl.g:2401:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic )
            {
            // InternalHlvl.g:2401:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt25=1;
                }
                break;
            case 50:
                {
                alt25=2;
                }
                break;
            case 67:
            case 68:
            case 69:
                {
                alt25=3;
                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt25=4;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 51:
            case 52:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalHlvl.g:2402:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    {
                    // InternalHlvl.g:2402:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    // InternalHlvl.g:2403:4: otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_25); 

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
                    // InternalHlvl.g:2421:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalHlvl.g:2421:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalHlvl.g:2422:4: () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalHlvl.g:2422:4: ()
                    // InternalHlvl.g:2423:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNegationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getTildeKeyword_1_1());
                    			
                    // InternalHlvl.g:2433:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalHlvl.g:2434:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalHlvl.g:2434:5: (lv_expression_5_0= rulePrimary )
                    // InternalHlvl.g:2435:6: lv_expression_5_0= rulePrimary
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
                    // InternalHlvl.g:2454:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' )
                    {
                    // InternalHlvl.g:2454:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' )
                    // InternalHlvl.g:2455:4: () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')'
                    {
                    // InternalHlvl.g:2455:4: ()
                    // InternalHlvl.g:2456:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUnaryAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2462:4: ( (lv_op_7_0= ruleUnaryOp ) )
                    // InternalHlvl.g:2463:5: (lv_op_7_0= ruleUnaryOp )
                    {
                    // InternalHlvl.g:2463:5: (lv_op_7_0= ruleUnaryOp )
                    // InternalHlvl.g:2464:6: lv_op_7_0= ruleUnaryOp
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
                    							"com.coffee.Hlvl.UnaryOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalHlvl.g:2485:4: ( (lv_expression_9_0= rulePrimary ) )
                    // InternalHlvl.g:2486:5: (lv_expression_9_0= rulePrimary )
                    {
                    // InternalHlvl.g:2486:5: (lv_expression_9_0= rulePrimary )
                    // InternalHlvl.g:2487:6: lv_expression_9_0= rulePrimary
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
                    // InternalHlvl.g:2510:3: ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' )
                    {
                    // InternalHlvl.g:2510:3: ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' )
                    // InternalHlvl.g:2511:4: () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')'
                    {
                    // InternalHlvl.g:2511:4: ()
                    // InternalHlvl.g:2512:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getFunctionAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2518:4: ( (lv_op_12_0= ruleFunctionOp ) )
                    // InternalHlvl.g:2519:5: (lv_op_12_0= ruleFunctionOp )
                    {
                    // InternalHlvl.g:2519:5: (lv_op_12_0= ruleFunctionOp )
                    // InternalHlvl.g:2520:6: lv_op_12_0= ruleFunctionOp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getOpFunctionOpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

                    otherlv_13=(Token)match(input,23,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalHlvl.g:2541:4: ( (lv_left_14_0= rulePrimary ) )
                    // InternalHlvl.g:2542:5: (lv_left_14_0= rulePrimary )
                    {
                    // InternalHlvl.g:2542:5: (lv_left_14_0= rulePrimary )
                    // InternalHlvl.g:2543:6: lv_left_14_0= rulePrimary
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

                    otherlv_15=(Token)match(input,26,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getCommaKeyword_3_4());
                    			
                    // InternalHlvl.g:2564:4: ( (lv_right_16_0= rulePrimary ) )
                    // InternalHlvl.g:2565:5: (lv_right_16_0= rulePrimary )
                    {
                    // InternalHlvl.g:2565:5: (lv_right_16_0= rulePrimary )
                    // InternalHlvl.g:2566:6: lv_right_16_0= rulePrimary
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
                    // InternalHlvl.g:2589:3: this_Atomic_18= ruleAtomic
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
    // InternalHlvl.g:2601:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalHlvl.g:2601:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalHlvl.g:2602:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalHlvl.g:2608:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_3=null;
        Token lv_value_7_0=null;
        AntlrDatatypeRuleToken lv_attribute_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2614:2: ( ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) )
            // InternalHlvl.g:2615:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            {
            // InternalHlvl.g:2615:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 51:
            case 52:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==EOF||LA27_2==24||LA27_2==26||(LA27_2>=30 && LA27_2<=31)||(LA27_2>=37 && LA27_2<=49)) ) {
                    alt27=2;
                }
                else if ( (LA27_2==53) ) {
                    alt27=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalHlvl.g:2616:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    {
                    // InternalHlvl.g:2616:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    // InternalHlvl.g:2617:4: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    {
                    // InternalHlvl.g:2617:4: ()
                    // InternalHlvl.g:2618:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2624:4: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    // InternalHlvl.g:2625:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    {
                    // InternalHlvl.g:2625:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    // InternalHlvl.g:2626:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    {
                    // InternalHlvl.g:2626:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==51) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==52) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalHlvl.g:2627:7: lv_value_1_1= 'true'
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
                            // InternalHlvl.g:2638:7: lv_value_1_2= 'false'
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
                    // InternalHlvl.g:2653:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalHlvl.g:2653:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalHlvl.g:2654:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalHlvl.g:2654:4: ()
                    // InternalHlvl.g:2655:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2661:4: ( (otherlv_3= RULE_ID ) )
                    // InternalHlvl.g:2662:5: (otherlv_3= RULE_ID )
                    {
                    // InternalHlvl.g:2662:5: (otherlv_3= RULE_ID )
                    // InternalHlvl.g:2663:6: otherlv_3= RULE_ID
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
                    // InternalHlvl.g:2676:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    {
                    // InternalHlvl.g:2676:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    // InternalHlvl.g:2677:4: () ( (lv_attribute_5_0= ruleQualifiedName ) )
                    {
                    // InternalHlvl.g:2677:4: ()
                    // InternalHlvl.g:2678:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getAttributeRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2684:4: ( (lv_attribute_5_0= ruleQualifiedName ) )
                    // InternalHlvl.g:2685:5: (lv_attribute_5_0= ruleQualifiedName )
                    {
                    // InternalHlvl.g:2685:5: (lv_attribute_5_0= ruleQualifiedName )
                    // InternalHlvl.g:2686:6: lv_attribute_5_0= ruleQualifiedName
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
                    // InternalHlvl.g:2705:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // InternalHlvl.g:2705:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // InternalHlvl.g:2706:4: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // InternalHlvl.g:2706:4: ()
                    // InternalHlvl.g:2707:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2713:4: ( (lv_value_7_0= RULE_INT ) )
                    // InternalHlvl.g:2714:5: (lv_value_7_0= RULE_INT )
                    {
                    // InternalHlvl.g:2714:5: (lv_value_7_0= RULE_INT )
                    // InternalHlvl.g:2715:6: lv_value_7_0= RULE_INT
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
    // InternalHlvl.g:2736:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalHlvl.g:2736:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalHlvl.g:2737:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalHlvl.g:2743:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:2749:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalHlvl.g:2750:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalHlvl.g:2750:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalHlvl.g:2751:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalHlvl.g:2758:3: (kw= '.' this_ID_2= RULE_ID )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalHlvl.g:2759:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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


    // $ANTLR start "entryRuleOperations"
    // InternalHlvl.g:2776:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalHlvl.g:2776:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalHlvl.g:2777:2: iv_ruleOperations= ruleOperations EOF
            {
             newCompositeNode(grammarAccess.getOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperations=ruleOperations();

            state._fsp--;

             current =iv_ruleOperations; 
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
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalHlvl.g:2783:1: ruleOperations returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2789:2: ( ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) )
            // InternalHlvl.g:2790:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            {
            // InternalHlvl.g:2790:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            // InternalHlvl.g:2791:3: ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            {
            // InternalHlvl.g:2791:3: ( (lv_op_0_0= ruleOperation ) )
            // InternalHlvl.g:2792:4: (lv_op_0_0= ruleOperation )
            {
            // InternalHlvl.g:2792:4: (lv_op_0_0= ruleOperation )
            // InternalHlvl.g:2793:5: lv_op_0_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_op_0_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsRule());
            					}
            					add(
            						current,
            						"op",
            						lv_op_0_0,
            						"com.coffee.Hlvl.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:2810:3: ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalHlvl.g:2811:4: (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) )
            	    {
            	    // InternalHlvl.g:2811:4: (otherlv_1= ',' )+
            	    int cnt29=0;
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==26) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalHlvl.g:2812:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,26,FOLLOW_37); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getOperationsAccess().getCommaKeyword_1_0());
            	    	    				

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

            	    // InternalHlvl.g:2817:4: ( (lv_op_2_0= ruleOperation ) )
            	    // InternalHlvl.g:2818:5: (lv_op_2_0= ruleOperation )
            	    {
            	    // InternalHlvl.g:2818:5: (lv_op_2_0= ruleOperation )
            	    // InternalHlvl.g:2819:6: lv_op_2_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_op_2_0=ruleOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"com.coffee.Hlvl.Operation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleOperation"
    // InternalHlvl.g:2841:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalHlvl.g:2841:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalHlvl.g:2842:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalHlvl.g:2848:1: ruleOperation returns [EObject current=null] : this_Sample_0= ruleSample ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Sample_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2854:2: (this_Sample_0= ruleSample )
            // InternalHlvl.g:2855:2: this_Sample_0= ruleSample
            {

            		newCompositeNode(grammarAccess.getOperationAccess().getSampleParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Sample_0=ruleSample();

            state._fsp--;


            		current = this_Sample_0;
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSample"
    // InternalHlvl.g:2866:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalHlvl.g:2866:47: (iv_ruleSample= ruleSample EOF )
            // InternalHlvl.g:2867:2: iv_ruleSample= ruleSample EOF
            {
             newCompositeNode(grammarAccess.getSampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSample=ruleSample();

            state._fsp--;

             current =iv_ruleSample; 
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
    // $ANTLR end "entryRuleSample"


    // $ANTLR start "ruleSample"
    // InternalHlvl.g:2873:1: ruleSample returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_valuations_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2879:2: ( ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) )
            // InternalHlvl.g:2880:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            {
            // InternalHlvl.g:2880:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=55 && LA31_0<=58)) ) {
                alt31=1;
            }
            else if ( (LA31_0==54) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalHlvl.g:2881:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    {
                    // InternalHlvl.g:2881:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    // InternalHlvl.g:2882:4: () ( (lv_name_1_0= ruleOperationName ) )
                    {
                    // InternalHlvl.g:2882:4: ()
                    // InternalHlvl.g:2883:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getSingleInstructionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2889:4: ( (lv_name_1_0= ruleOperationName ) )
                    // InternalHlvl.g:2890:5: (lv_name_1_0= ruleOperationName )
                    {
                    // InternalHlvl.g:2890:5: (lv_name_1_0= ruleOperationName )
                    // InternalHlvl.g:2891:6: lv_name_1_0= ruleOperationName
                    {

                    						newCompositeNode(grammarAccess.getSampleAccess().getNameOperationNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleOperationName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSampleRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"com.coffee.Hlvl.OperationName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:2910:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    {
                    // InternalHlvl.g:2910:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    // InternalHlvl.g:2911:4: () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')'
                    {
                    // InternalHlvl.g:2911:4: ()
                    // InternalHlvl.g:2912:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getValidConfAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,54,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getValidConfigurationKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalHlvl.g:2926:4: ( (lv_valuations_5_0= ruleListOfValuation ) )
                    // InternalHlvl.g:2927:5: (lv_valuations_5_0= ruleListOfValuation )
                    {
                    // InternalHlvl.g:2927:5: (lv_valuations_5_0= ruleListOfValuation )
                    // InternalHlvl.g:2928:6: lv_valuations_5_0= ruleListOfValuation
                    {

                    						newCompositeNode(grammarAccess.getSampleAccess().getValuationsListOfValuationParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_valuations_5_0=ruleListOfValuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSampleRule());
                    						}
                    						set(
                    							current,
                    							"valuations",
                    							lv_valuations_5_0,
                    							"com.coffee.Hlvl.ListOfValuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSampleAccess().getRightParenthesisKeyword_1_4());
                    			

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
    // $ANTLR end "ruleSample"


    // $ANTLR start "entryRuleOperationName"
    // InternalHlvl.g:2954:1: entryRuleOperationName returns [String current=null] : iv_ruleOperationName= ruleOperationName EOF ;
    public final String entryRuleOperationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationName = null;


        try {
            // InternalHlvl.g:2954:53: (iv_ruleOperationName= ruleOperationName EOF )
            // InternalHlvl.g:2955:2: iv_ruleOperationName= ruleOperationName EOF
            {
             newCompositeNode(grammarAccess.getOperationNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationName=ruleOperationName();

            state._fsp--;

             current =iv_ruleOperationName.getText(); 
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
    // $ANTLR end "entryRuleOperationName"


    // $ANTLR start "ruleOperationName"
    // InternalHlvl.g:2961:1: ruleOperationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) ;
    public final AntlrDatatypeRuleToken ruleOperationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:2967:2: ( (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) )
            // InternalHlvl.g:2968:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            {
            // InternalHlvl.g:2968:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt32=1;
                }
                break;
            case 56:
                {
                alt32=2;
                }
                break;
            case 57:
                {
                alt32=3;
                }
                break;
            case 58:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalHlvl.g:2969:3: kw= 'validModel'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getValidModelKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:2975:3: kw= 'numberOfConfigurations'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getNumberOfConfigurationsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:2981:3: kw= 'findConfiguration'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getFindConfigurationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:2987:3: kw= 'findAllConfigurations'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getFindAllConfigurationsKeyword_3());
                    		

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
    // $ANTLR end "ruleOperationName"


    // $ANTLR start "entryRuleBoolVal"
    // InternalHlvl.g:2996:1: entryRuleBoolVal returns [EObject current=null] : iv_ruleBoolVal= ruleBoolVal EOF ;
    public final EObject entryRuleBoolVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVal = null;


        try {
            // InternalHlvl.g:2996:48: (iv_ruleBoolVal= ruleBoolVal EOF )
            // InternalHlvl.g:2997:2: iv_ruleBoolVal= ruleBoolVal EOF
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
    // InternalHlvl.g:3003:1: ruleBoolVal returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3009:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalHlvl.g:3010:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalHlvl.g:3010:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalHlvl.g:3011:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalHlvl.g:3011:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalHlvl.g:3012:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalHlvl.g:3012:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            else if ( (LA33_0==52) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalHlvl.g:3013:5: lv_value_0_1= 'true'
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
                    // InternalHlvl.g:3024:5: lv_value_0_2= 'false'
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
    // InternalHlvl.g:3040:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalHlvl.g:3040:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalHlvl.g:3041:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalHlvl.g:3047:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:3053:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalHlvl.g:3054:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalHlvl.g:3054:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalHlvl.g:3055:3: (lv_value_0_0= RULE_INT )
            {
            // InternalHlvl.g:3055:3: (lv_value_0_0= RULE_INT )
            // InternalHlvl.g:3056:4: lv_value_0_0= RULE_INT
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
    // InternalHlvl.g:3075:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalHlvl.g:3075:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalHlvl.g:3076:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalHlvl.g:3082:1: ruleSymbol returns [EObject current=null] : (otherlv_0= '\"' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '\"' ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3088:2: ( (otherlv_0= '\"' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '\"' ) )
            // InternalHlvl.g:3089:2: (otherlv_0= '\"' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '\"' )
            {
            // InternalHlvl.g:3089:2: (otherlv_0= '\"' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '\"' )
            // InternalHlvl.g:3090:3: otherlv_0= '\"' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getSymbolAccess().getQuotationMarkKeyword_0());
            		
            // InternalHlvl.g:3094:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalHlvl.g:3095:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalHlvl.g:3095:4: (lv_value_1_0= RULE_STRING )
            // InternalHlvl.g:3096:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_value_1_0, grammarAccess.getSymbolAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSymbolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSymbolAccess().getQuotationMarkKeyword_2());
            		

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
    // InternalHlvl.g:3120:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalHlvl.g:3120:46: (iv_ruleValue= ruleValue EOF )
            // InternalHlvl.g:3121:2: iv_ruleValue= ruleValue EOF
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
    // InternalHlvl.g:3127:1: ruleValue returns [EObject current=null] : (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_BoolVal_1 = null;

        EObject this_Symbol_2 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3133:2: ( (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol ) )
            // InternalHlvl.g:3134:2: (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol )
            {
            // InternalHlvl.g:3134:2: (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt34=1;
                }
                break;
            case 51:
            case 52:
                {
                alt34=2;
                }
                break;
            case 59:
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
                    // InternalHlvl.g:3135:3: this_Number_0= ruleNumber
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
                    // InternalHlvl.g:3144:3: this_BoolVal_1= ruleBoolVal
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBoolValParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolVal_1=ruleBoolVal();

                    state._fsp--;


                    			current = this_BoolVal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3153:3: this_Symbol_2= ruleSymbol
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getSymbolParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Symbol_2=ruleSymbol();

                    state._fsp--;


                    			current = this_Symbol_2;
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


    // $ANTLR start "entryRuleDataType"
    // InternalHlvl.g:3165:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalHlvl.g:3165:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalHlvl.g:3166:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalHlvl.g:3172:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3178:2: ( (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) )
            // InternalHlvl.g:3179:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            {
            // InternalHlvl.g:3179:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt35=1;
                }
                break;
            case 61:
                {
                alt35=2;
                }
                break;
            case 62:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalHlvl.g:3180:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3186:3: kw= 'integer'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3192:3: kw= 'symbolic'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

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
    // InternalHlvl.g:3201:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalHlvl.g:3201:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalHlvl.g:3202:2: iv_ruleListOfValues= ruleListOfValues EOF
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
    // InternalHlvl.g:3208:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3214:2: ( ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) )
            // InternalHlvl.g:3215:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            {
            // InternalHlvl.g:3215:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            // InternalHlvl.g:3216:3: ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            {
            // InternalHlvl.g:3216:3: ( (lv_values_0_0= ruleValue ) )
            // InternalHlvl.g:3217:4: (lv_values_0_0= ruleValue )
            {
            // InternalHlvl.g:3217:4: (lv_values_0_0= ruleValue )
            // InternalHlvl.g:3218:5: lv_values_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalHlvl.g:3235:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==26) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalHlvl.g:3236:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) )
            	    {
            	    // InternalHlvl.g:3236:4: (otherlv_1= ',' )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==26) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3237:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,26,FOLLOW_40); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt36 >= 1 ) break loop36;
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);

            	    // InternalHlvl.g:3242:4: ( (lv_values_2_0= ruleValue ) )
            	    // InternalHlvl.g:3243:5: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalHlvl.g:3243:5: (lv_values_2_0= ruleValue )
            	    // InternalHlvl.g:3244:6: lv_values_2_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop37;
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
    // InternalHlvl.g:3266:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalHlvl.g:3266:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalHlvl.g:3267:2: iv_ruleListOfIDs= ruleListOfIDs EOF
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
    // InternalHlvl.g:3273:1: ruleListOfIDs returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3279:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3280:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3280:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            // InternalHlvl.g:3281:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3281:3: ( (otherlv_0= RULE_ID ) )
            // InternalHlvl.g:3282:4: (otherlv_0= RULE_ID )
            {
            // InternalHlvl.g:3282:4: (otherlv_0= RULE_ID )
            // InternalHlvl.g:3283:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfIDsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_0, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalHlvl.g:3294:3: ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==26) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalHlvl.g:3295:4: (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3295:4: (otherlv_1= ',' )+
            	    int cnt38=0;
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==26) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3296:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,26,FOLLOW_41); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt38 >= 1 ) break loop38;
            	                EarlyExitException eee =
            	                    new EarlyExitException(38, input);
            	                throw eee;
            	        }
            	        cnt38++;
            	    } while (true);

            	    // InternalHlvl.g:3301:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalHlvl.g:3302:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalHlvl.g:3302:5: (otherlv_2= RULE_ID )
            	    // InternalHlvl.g:3303:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfIDsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            	    						newLeafNode(otherlv_2, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalHlvl.g:3319:1: entryRuleListOfRelRefs returns [EObject current=null] : iv_ruleListOfRelRefs= ruleListOfRelRefs EOF ;
    public final EObject entryRuleListOfRelRefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfRelRefs = null;


        try {
            // InternalHlvl.g:3319:54: (iv_ruleListOfRelRefs= ruleListOfRelRefs EOF )
            // InternalHlvl.g:3320:2: iv_ruleListOfRelRefs= ruleListOfRelRefs EOF
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
    // InternalHlvl.g:3326:1: ruleListOfRelRefs returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfRelRefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3332:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3333:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3333:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )* )
            // InternalHlvl.g:3334:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3334:3: ( (otherlv_0= RULE_ID ) )
            // InternalHlvl.g:3335:4: (otherlv_0= RULE_ID )
            {
            // InternalHlvl.g:3335:4: (otherlv_0= RULE_ID )
            // InternalHlvl.g:3336:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfRelRefsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_0, grammarAccess.getListOfRelRefsAccess().getIdsRelDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalHlvl.g:3347:3: ( (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==26) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalHlvl.g:3348:4: (otherlv_1= ',' )+ ( (otherlv_2= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3348:4: (otherlv_1= ',' )+
            	    int cnt40=0;
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==26) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3349:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,26,FOLLOW_41); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfRelRefsAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt40 >= 1 ) break loop40;
            	                EarlyExitException eee =
            	                    new EarlyExitException(40, input);
            	                throw eee;
            	        }
            	        cnt40++;
            	    } while (true);

            	    // InternalHlvl.g:3354:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalHlvl.g:3355:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalHlvl.g:3355:5: (otherlv_2= RULE_ID )
            	    // InternalHlvl.g:3356:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfRelRefsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            	    						newLeafNode(otherlv_2, grammarAccess.getListOfRelRefsAccess().getIdsRelDeclarationCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalHlvl.g:3372:1: entryRuleValuation returns [EObject current=null] : iv_ruleValuation= ruleValuation EOF ;
    public final EObject entryRuleValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuation = null;


        try {
            // InternalHlvl.g:3372:50: (iv_ruleValuation= ruleValuation EOF )
            // InternalHlvl.g:3373:2: iv_ruleValuation= ruleValuation EOF
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
    // InternalHlvl.g:3379:1: ruleValuation returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3385:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) )
            // InternalHlvl.g:3386:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            {
            // InternalHlvl.g:3386:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            // InternalHlvl.g:3387:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValuationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalHlvl.g:3391:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3392:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3392:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3393:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValuationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getValuationAccess().getElementElmDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getValuationAccess().getCommaKeyword_2());
            		
            // InternalHlvl.g:3408:3: ( (lv_value_3_0= ruleValue ) )
            // InternalHlvl.g:3409:4: (lv_value_3_0= ruleValue )
            {
            // InternalHlvl.g:3409:4: (lv_value_3_0= ruleValue )
            // InternalHlvl.g:3410:5: lv_value_3_0= ruleValue
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
    // InternalHlvl.g:3435:1: entryRuleListOfValuation returns [EObject current=null] : iv_ruleListOfValuation= ruleListOfValuation EOF ;
    public final EObject entryRuleListOfValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValuation = null;


        try {
            // InternalHlvl.g:3435:56: (iv_ruleListOfValuation= ruleListOfValuation EOF )
            // InternalHlvl.g:3436:2: iv_ruleListOfValuation= ruleListOfValuation EOF
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
    // InternalHlvl.g:3442:1: ruleListOfValuation returns [EObject current=null] : ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) ;
    public final EObject ruleListOfValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pairs_0_0 = null;

        EObject lv_pairs_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3448:2: ( ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) )
            // InternalHlvl.g:3449:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            {
            // InternalHlvl.g:3449:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            // InternalHlvl.g:3450:3: ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            {
            // InternalHlvl.g:3450:3: ( (lv_pairs_0_0= ruleValuation ) )
            // InternalHlvl.g:3451:4: (lv_pairs_0_0= ruleValuation )
            {
            // InternalHlvl.g:3451:4: (lv_pairs_0_0= ruleValuation )
            // InternalHlvl.g:3452:5: lv_pairs_0_0= ruleValuation
            {

            					newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_pairs_0_0=ruleValuation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfValuationRule());
            					}
            					add(
            						current,
            						"pairs",
            						lv_pairs_0_0,
            						"com.coffee.Hlvl.Valuation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:3469:3: ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==26) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalHlvl.g:3470:4: (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) )
            	    {
            	    // InternalHlvl.g:3470:4: (otherlv_1= ',' )+
            	    int cnt42=0;
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==26) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3471:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,26,FOLLOW_42); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuationAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt42 >= 1 ) break loop42;
            	                EarlyExitException eee =
            	                    new EarlyExitException(42, input);
            	                throw eee;
            	        }
            	        cnt42++;
            	    } while (true);

            	    // InternalHlvl.g:3476:4: ( (lv_pairs_2_0= ruleValuation ) )
            	    // InternalHlvl.g:3477:5: (lv_pairs_2_0= ruleValuation )
            	    {
            	    // InternalHlvl.g:3477:5: (lv_pairs_2_0= ruleValuation )
            	    // InternalHlvl.g:3478:6: lv_pairs_2_0= ruleValuation
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_pairs_2_0=ruleValuation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfValuationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pairs",
            	    							lv_pairs_2_0,
            	    							"com.coffee.Hlvl.Valuation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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


    // $ANTLR start "entryRuleFunctionOp"
    // InternalHlvl.g:3500:1: entryRuleFunctionOp returns [String current=null] : iv_ruleFunctionOp= ruleFunctionOp EOF ;
    public final String entryRuleFunctionOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionOp = null;


        try {
            // InternalHlvl.g:3500:50: (iv_ruleFunctionOp= ruleFunctionOp EOF )
            // InternalHlvl.g:3501:2: iv_ruleFunctionOp= ruleFunctionOp EOF
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
    // InternalHlvl.g:3507:1: ruleFunctionOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3513:2: ( (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' ) )
            // InternalHlvl.g:3514:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' )
            {
            // InternalHlvl.g:3514:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt44=1;
                }
                break;
            case 64:
                {
                alt44=2;
                }
                break;
            case 65:
                {
                alt44=3;
                }
                break;
            case 66:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalHlvl.g:3515:3: kw= 'pow'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getPowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3521:3: kw= 'dist'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getDistKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3527:3: kw= 'min'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getMinKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:3533:3: kw= 'max'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

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
    // InternalHlvl.g:3542:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // InternalHlvl.g:3542:47: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalHlvl.g:3543:2: iv_ruleUnaryOp= ruleUnaryOp EOF
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
    // InternalHlvl.g:3549:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abs' | kw= 'sqrt' | kw= 'instances' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3555:2: ( (kw= 'abs' | kw= 'sqrt' | kw= 'instances' ) )
            // InternalHlvl.g:3556:2: (kw= 'abs' | kw= 'sqrt' | kw= 'instances' )
            {
            // InternalHlvl.g:3556:2: (kw= 'abs' | kw= 'sqrt' | kw= 'instances' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt45=1;
                }
                break;
            case 68:
                {
                alt45=2;
                }
                break;
            case 69:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalHlvl.g:3557:3: kw= 'abs'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getAbsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3563:3: kw= 'sqrt'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getSqrtKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3569:3: kw= 'instances'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

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
    static final String dfa_2s = "\1\23\2\uffff\2\27\5\uffff\2\4\2\32\2\4\3\uffff";
    static final String dfa_3s = "\1\44\2\uffff\2\27\5\uffff\2\4\2\32\1\44\1\23\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\10\1\11\6\uffff\1\12\1\4\1\3";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\2\uffff\1\1\2\uffff\1\6\1\uffff\1\3\1\4\1\2\2\uffff\1\2\1\10\2\5\1\7",
            "",
            "",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\22\16\uffff\1\21\20\uffff\1\20",
            "\1\22\16\uffff\1\21",
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
            return "618:2: (this_Core_0= ruleCore | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x700000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x7000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0818000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001F3A480000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x801C000000800030L,0x000000000000003FL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001800C0000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x07C0000004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0818000004000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000004800000L});

}