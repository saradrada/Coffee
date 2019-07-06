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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'elements:'", "'relations:'", "'operations:'", "'att'", "'comment:'", "'{'", "'}'", "'is'", "'variants:'", "'..'", "'['", "']'", "':'", "'common'", "'('", "')'", "'implies'", "'mutex'", "','", "'decomposition'", "'group'", "'*'", "'visibility'", "'before'", "'after'", "'expression'", "'<=>'", "'=>'", "'OR'", "'AND'", "'='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'/'", "'mod'", "'~'", "'true'", "'false'", "'.'", "'validConfiguration'", "'validModel'", "'numberOfConfigurations'", "'findConfiguration'", "'findAllConfigurations'", "'boolean'", "'integer'", "'symbolic'", "'pow'", "'dist'", "'min'", "'max'", "'if'", "'abs'", "'sqrt'", "'instances'", "'entailed'"
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
    public static final int RULE_INT=6;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
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

                if ( (LA1_0==15||(LA1_0>=61 && LA1_0<=63)) ) {
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
    // InternalHlvl.g:183:1: ruleElmDeclaration returns [EObject current=null] : ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) ) (otherlv_4= 'comment:' otherlv_5= '{' ( (lv_comment_6_0= RULE_STRING ) ) otherlv_7= '}' )? ) ;
    public final EObject ruleElmDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_att_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_comment_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_dataType_1_0 = null;

        EObject lv_declaration_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:189:2: ( ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) ) (otherlv_4= 'comment:' otherlv_5= '{' ( (lv_comment_6_0= RULE_STRING ) ) otherlv_7= '}' )? ) )
            // InternalHlvl.g:190:2: ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) ) (otherlv_4= 'comment:' otherlv_5= '{' ( (lv_comment_6_0= RULE_STRING ) ) otherlv_7= '}' )? )
            {
            // InternalHlvl.g:190:2: ( ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) ) (otherlv_4= 'comment:' otherlv_5= '{' ( (lv_comment_6_0= RULE_STRING ) ) otherlv_7= '}' )? )
            // InternalHlvl.g:191:3: ( (lv_att_0_0= 'att' ) )? ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_declaration_3_0= ruleDeclaration ) ) (otherlv_4= 'comment:' otherlv_5= '{' ( (lv_comment_6_0= RULE_STRING ) ) otherlv_7= '}' )?
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
            				
            pushFollow(FOLLOW_10);
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

            // InternalHlvl.g:261:3: (otherlv_4= 'comment:' otherlv_5= '{' ( (lv_comment_6_0= RULE_STRING ) ) otherlv_7= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalHlvl.g:262:4: otherlv_4= 'comment:' otherlv_5= '{' ( (lv_comment_6_0= RULE_STRING ) ) otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getElmDeclarationAccess().getCommentKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getElmDeclarationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalHlvl.g:270:4: ( (lv_comment_6_0= RULE_STRING ) )
                    // InternalHlvl.g:271:5: (lv_comment_6_0= RULE_STRING )
                    {
                    // InternalHlvl.g:271:5: (lv_comment_6_0= RULE_STRING )
                    // InternalHlvl.g:272:6: lv_comment_6_0= RULE_STRING
                    {
                    lv_comment_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_comment_6_0, grammarAccess.getElmDeclarationAccess().getCommentSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getElmDeclarationAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleElmDeclaration"


    // $ANTLR start "entryRuleDeclaration"
    // InternalHlvl.g:297:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalHlvl.g:297:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalHlvl.g:298:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalHlvl.g:304:1: ruleDeclaration returns [EObject current=null] : (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantDecl_0 = null;

        EObject this_VariableDecl_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:310:2: ( (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) )
            // InternalHlvl.g:311:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            {
            // InternalHlvl.g:311:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EOF||LA6_0==13||(LA6_0>=15 && LA6_0<=16)||LA6_0==19||(LA6_0>=61 && LA6_0<=63)) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHlvl.g:312:3: this_ConstantDecl_0= ruleConstantDecl
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
                    // InternalHlvl.g:321:3: this_VariableDecl_1= ruleVariableDecl
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
    // InternalHlvl.g:333:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // InternalHlvl.g:333:53: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // InternalHlvl.g:334:2: iv_ruleConstantDecl= ruleConstantDecl EOF
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
    // InternalHlvl.g:340:1: ruleConstantDecl returns [EObject current=null] : ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:346:2: ( ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? ) )
            // InternalHlvl.g:347:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? )
            {
            // InternalHlvl.g:347:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? )
            // InternalHlvl.g:348:3: () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )?
            {
            // InternalHlvl.g:348:3: ()
            // InternalHlvl.g:349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantDeclAccess().getConstantDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:355:3: (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHlvl.g:356:4: otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstantDeclAccess().getIsKeyword_1_0());
                    			
                    // InternalHlvl.g:360:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalHlvl.g:361:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalHlvl.g:361:5: (lv_value_2_0= ruleValue )
                    // InternalHlvl.g:362:6: lv_value_2_0= ruleValue
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
    // InternalHlvl.g:384:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalHlvl.g:384:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalHlvl.g:385:2: iv_ruleVariableDecl= ruleVariableDecl EOF
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
    // InternalHlvl.g:391:1: ruleVariableDecl returns [EObject current=null] : ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variants_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:397:2: ( ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) )
            // InternalHlvl.g:398:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            {
            // InternalHlvl.g:398:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            // InternalHlvl.g:399:3: () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            {
            // InternalHlvl.g:399:3: ()
            // InternalHlvl.g:400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableDeclAccess().getVariableDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:406:3: (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            // InternalHlvl.g:407:4: otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            {
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            				newLeafNode(otherlv_1, grammarAccess.getVariableDeclAccess().getVariantsKeyword_1_0());
            			
            // InternalHlvl.g:411:4: ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            // InternalHlvl.g:412:5: (lv_variants_2_0= ruleOptionsDeclaration )
            {
            // InternalHlvl.g:412:5: (lv_variants_2_0= ruleOptionsDeclaration )
            // InternalHlvl.g:413:6: lv_variants_2_0= ruleOptionsDeclaration
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
    // InternalHlvl.g:435:1: entryRuleOptionsDeclaration returns [EObject current=null] : iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF ;
    public final EObject entryRuleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionsDeclaration = null;


        try {
            // InternalHlvl.g:435:59: (iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF )
            // InternalHlvl.g:436:2: iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF
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
    // InternalHlvl.g:442:1: ruleOptionsDeclaration returns [EObject current=null] : (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Interval_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:448:2: ( (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) )
            // InternalHlvl.g:449:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            {
            // InternalHlvl.g:449:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalHlvl.g:450:3: this_Interval_0= ruleInterval
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
                    // InternalHlvl.g:459:3: this_Enumeration_1= ruleEnumeration
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
    // InternalHlvl.g:471:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalHlvl.g:471:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalHlvl.g:472:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalHlvl.g:478:1: ruleInterval returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:484:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalHlvl.g:485:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalHlvl.g:485:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalHlvl.g:486:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalHlvl.g:486:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalHlvl.g:487:4: (lv_start_0_0= RULE_INT )
            {
            // InternalHlvl.g:487:4: (lv_start_0_0= RULE_INT )
            // InternalHlvl.g:488:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
            		
            // InternalHlvl.g:508:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalHlvl.g:509:4: (lv_end_2_0= RULE_INT )
            {
            // InternalHlvl.g:509:4: (lv_end_2_0= RULE_INT )
            // InternalHlvl.g:510:5: lv_end_2_0= RULE_INT
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
    // InternalHlvl.g:530:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalHlvl.g:530:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalHlvl.g:531:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalHlvl.g:537:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:543:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalHlvl.g:544:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalHlvl.g:544:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalHlvl.g:545:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHlvl.g:549:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalHlvl.g:550:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalHlvl.g:550:4: (lv_list_1_0= ruleListOfValues )
            // InternalHlvl.g:551:5: lv_list_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

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
    // InternalHlvl.g:576:1: entryRuleRelDeclaration returns [EObject current=null] : iv_ruleRelDeclaration= ruleRelDeclaration EOF ;
    public final EObject entryRuleRelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelDeclaration = null;


        try {
            // InternalHlvl.g:576:55: (iv_ruleRelDeclaration= ruleRelDeclaration EOF )
            // InternalHlvl.g:577:2: iv_ruleRelDeclaration= ruleRelDeclaration EOF
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
    // InternalHlvl.g:583:1: ruleRelDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) ) ;
    public final EObject ruleRelDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:589:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) ) )
            // InternalHlvl.g:590:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) )
            {
            // InternalHlvl.g:590:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) )
            // InternalHlvl.g:591:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) )
            {
            // InternalHlvl.g:591:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalHlvl.g:592:4: (lv_name_0_0= RULE_ID )
            {
            // InternalHlvl.g:592:4: (lv_name_0_0= RULE_ID )
            // InternalHlvl.g:593:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRelDeclarationAccess().getColonKeyword_1());
            		
            // InternalHlvl.g:613:3: ( (lv_exp_2_0= ruleRelation ) )
            // InternalHlvl.g:614:4: (lv_exp_2_0= ruleRelation )
            {
            // InternalHlvl.g:614:4: (lv_exp_2_0= ruleRelation )
            // InternalHlvl.g:615:5: lv_exp_2_0= ruleRelation
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
    // InternalHlvl.g:636:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalHlvl.g:636:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalHlvl.g:637:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalHlvl.g:643:1: ruleRelation returns [EObject current=null] : (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_Expression_5= ruleExpression | this_Visibility_6= ruleVisibility | this_ComplexImplies_7= ruleComplexImplies | this_ComplexMutex_8= ruleComplexMutex ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Common_0 = null;

        EObject this_Hierarchy_1 = null;

        EObject this_Pair_2 = null;

        EObject this_VarList_3 = null;

        EObject this_Order_4 = null;

        EObject this_Expression_5 = null;

        EObject this_Visibility_6 = null;

        EObject this_ComplexImplies_7 = null;

        EObject this_ComplexMutex_8 = null;



        	enterRule();

        try {
            // InternalHlvl.g:649:2: ( (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_Expression_5= ruleExpression | this_Visibility_6= ruleVisibility | this_ComplexImplies_7= ruleComplexImplies | this_ComplexMutex_8= ruleComplexMutex ) )
            // InternalHlvl.g:650:2: (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_Expression_5= ruleExpression | this_Visibility_6= ruleVisibility | this_ComplexImplies_7= ruleComplexImplies | this_ComplexMutex_8= ruleComplexMutex )
            {
            // InternalHlvl.g:650:2: (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_Expression_5= ruleExpression | this_Visibility_6= ruleVisibility | this_ComplexImplies_7= ruleComplexImplies | this_ComplexMutex_8= ruleComplexMutex )
            int alt9=9;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalHlvl.g:651:3: this_Common_0= ruleCommon
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getCommonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Common_0=ruleCommon();

                    state._fsp--;


                    			current = this_Common_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:660:3: this_Hierarchy_1= ruleHierarchy
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
                    // InternalHlvl.g:669:3: this_Pair_2= rulePair
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
                    // InternalHlvl.g:678:3: this_VarList_3= ruleVarList
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
                    // InternalHlvl.g:687:3: this_Order_4= ruleOrder
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
                    // InternalHlvl.g:696:3: this_Expression_5= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalHlvl.g:705:3: this_Visibility_6= ruleVisibility
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getVisibilityParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visibility_6=ruleVisibility();

                    state._fsp--;


                    			current = this_Visibility_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalHlvl.g:714:3: this_ComplexImplies_7= ruleComplexImplies
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getComplexImpliesParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexImplies_7=ruleComplexImplies();

                    state._fsp--;


                    			current = this_ComplexImplies_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalHlvl.g:723:3: this_ComplexMutex_8= ruleComplexMutex
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getComplexMutexParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexMutex_8=ruleComplexMutex();

                    state._fsp--;


                    			current = this_ComplexMutex_8;
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


    // $ANTLR start "entryRuleCommon"
    // InternalHlvl.g:735:1: entryRuleCommon returns [EObject current=null] : iv_ruleCommon= ruleCommon EOF ;
    public final EObject entryRuleCommon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommon = null;


        try {
            // InternalHlvl.g:735:47: (iv_ruleCommon= ruleCommon EOF )
            // InternalHlvl.g:736:2: iv_ruleCommon= ruleCommon EOF
            {
             newCompositeNode(grammarAccess.getCommonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommon=ruleCommon();

            state._fsp--;

             current =iv_ruleCommon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommon"


    // $ANTLR start "ruleCommon"
    // InternalHlvl.g:742:1: ruleCommon returns [EObject current=null] : ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' ) ;
    public final EObject ruleCommon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:748:2: ( ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' ) )
            // InternalHlvl.g:749:2: ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' )
            {
            // InternalHlvl.g:749:2: ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' )
            // InternalHlvl.g:750:3: () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')'
            {
            // InternalHlvl.g:750:3: ()
            // InternalHlvl.g:751:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommonAccess().getCommonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonAccess().getCommonKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCommonAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:765:3: ( (lv_elements_3_0= ruleListOfIDs ) )
            // InternalHlvl.g:766:4: (lv_elements_3_0= ruleListOfIDs )
            {
            // InternalHlvl.g:766:4: (lv_elements_3_0= ruleListOfIDs )
            // InternalHlvl.g:767:5: lv_elements_3_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getCommonAccess().getElementsListOfIDsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_elements_3_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommonRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCommonAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCommon"


    // $ANTLR start "entryRulePair"
    // InternalHlvl.g:792:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalHlvl.g:792:45: (iv_rulePair= rulePair EOF )
            // InternalHlvl.g:793:2: iv_rulePair= rulePair EOF
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
    // InternalHlvl.g:799:1: rulePair returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
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
            // InternalHlvl.g:805:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalHlvl.g:806:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalHlvl.g:806:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalHlvl.g:807:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalHlvl.g:807:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHlvl.g:808:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHlvl.g:808:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHlvl.g:809:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHlvl.g:809:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalHlvl.g:810:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,28,FOLLOW_21); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getPairAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPairRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:821:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,29,FOLLOW_21); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:838:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:839:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:839:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:840:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getPairAccess().getVar1ElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPairAccess().getCommaKeyword_3());
            		
            // InternalHlvl.g:855:3: ( (otherlv_4= RULE_ID ) )
            // InternalHlvl.g:856:4: (otherlv_4= RULE_ID )
            {
            // InternalHlvl.g:856:4: (otherlv_4= RULE_ID )
            // InternalHlvl.g:857:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getPairAccess().getVar2ElmDeclarationCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

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
    // InternalHlvl.g:876:1: entryRuleComplexImplies returns [EObject current=null] : iv_ruleComplexImplies= ruleComplexImplies EOF ;
    public final EObject entryRuleComplexImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexImplies = null;


        try {
            // InternalHlvl.g:876:55: (iv_ruleComplexImplies= ruleComplexImplies EOF )
            // InternalHlvl.g:877:2: iv_ruleComplexImplies= ruleComplexImplies EOF
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
    // InternalHlvl.g:883:1: ruleComplexImplies returns [EObject current=null] : (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) ;
    public final EObject ruleComplexImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_exp_3_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:889:2: ( (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) )
            // InternalHlvl.g:890:2: (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalHlvl.g:890:2: (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            // InternalHlvl.g:891:3: otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexImpliesAccess().getImpliesKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:903:3: ( (lv_exp_3_0= ruleRelational ) )
            // InternalHlvl.g:904:4: (lv_exp_3_0= ruleRelational )
            {
            // InternalHlvl.g:904:4: (lv_exp_3_0= ruleRelational )
            // InternalHlvl.g:905:5: lv_exp_3_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getComplexImpliesAccess().getExpRelationalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_exp_3_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexImpliesRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexImpliesAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexImpliesAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexImpliesAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalHlvl.g:934:3: ( (lv_elements_7_0= ruleListOfIDs ) )
            // InternalHlvl.g:935:4: (lv_elements_7_0= ruleListOfIDs )
            {
            // InternalHlvl.g:935:4: (lv_elements_7_0= ruleListOfIDs )
            // InternalHlvl.g:936:5: lv_elements_7_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getComplexImpliesAccess().getElementsListOfIDsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_elements_7_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexImpliesRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_7_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexImpliesAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexImpliesAccess().getRightParenthesisKeyword_9());
            		

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


    // $ANTLR start "entryRuleComplexMutex"
    // InternalHlvl.g:965:1: entryRuleComplexMutex returns [EObject current=null] : iv_ruleComplexMutex= ruleComplexMutex EOF ;
    public final EObject entryRuleComplexMutex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexMutex = null;


        try {
            // InternalHlvl.g:965:53: (iv_ruleComplexMutex= ruleComplexMutex EOF )
            // InternalHlvl.g:966:2: iv_ruleComplexMutex= ruleComplexMutex EOF
            {
             newCompositeNode(grammarAccess.getComplexMutexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexMutex=ruleComplexMutex();

            state._fsp--;

             current =iv_ruleComplexMutex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexMutex"


    // $ANTLR start "ruleComplexMutex"
    // InternalHlvl.g:972:1: ruleComplexMutex returns [EObject current=null] : (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) ;
    public final EObject ruleComplexMutex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_exp_3_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:978:2: ( (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) )
            // InternalHlvl.g:979:2: (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalHlvl.g:979:2: (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            // InternalHlvl.g:980:3: otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexMutexAccess().getMutexKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexMutexAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexMutexAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:992:3: ( (lv_exp_3_0= ruleRelational ) )
            // InternalHlvl.g:993:4: (lv_exp_3_0= ruleRelational )
            {
            // InternalHlvl.g:993:4: (lv_exp_3_0= ruleRelational )
            // InternalHlvl.g:994:5: lv_exp_3_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getComplexMutexAccess().getExpRelationalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_exp_3_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexMutexRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexMutexAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexMutexAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexMutexAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalHlvl.g:1023:3: ( (lv_elements_7_0= ruleListOfIDs ) )
            // InternalHlvl.g:1024:4: (lv_elements_7_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1024:4: (lv_elements_7_0= ruleListOfIDs )
            // InternalHlvl.g:1025:5: lv_elements_7_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getComplexMutexAccess().getElementsListOfIDsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_elements_7_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexMutexRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_7_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexMutexAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexMutexAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleComplexMutex"


    // $ANTLR start "entryRuleVarList"
    // InternalHlvl.g:1054:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalHlvl.g:1054:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalHlvl.g:1055:2: iv_ruleVarList= ruleVarList EOF
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
    // InternalHlvl.g:1061:1: ruleVarList returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
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
            // InternalHlvl.g:1067:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1068:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1068:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1069:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            // InternalHlvl.g:1069:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHlvl.g:1070:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHlvl.g:1070:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHlvl.g:1071:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHlvl.g:1071:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalHlvl.g:1072:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,28,FOLLOW_21); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getVarListAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarListRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1083:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,29,FOLLOW_21); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1100:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:1101:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:1101:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:1102:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarListRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getVarListAccess().getVar1ElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getVarListAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVarListAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1121:3: ( (lv_list_5_0= ruleListOfIDs ) )
            // InternalHlvl.g:1122:4: (lv_list_5_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1122:4: (lv_list_5_0= ruleListOfIDs )
            // InternalHlvl.g:1123:5: lv_list_5_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getListListOfIDsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_6=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getVarListAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_2); 

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
    // InternalHlvl.g:1152:1: entryRuleHierarchy returns [EObject current=null] : iv_ruleHierarchy= ruleHierarchy EOF ;
    public final EObject entryRuleHierarchy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHierarchy = null;


        try {
            // InternalHlvl.g:1152:50: (iv_ruleHierarchy= ruleHierarchy EOF )
            // InternalHlvl.g:1153:2: iv_ruleHierarchy= ruleHierarchy EOF
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
    // InternalHlvl.g:1159:1: ruleHierarchy returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup ) ;
    public final EObject ruleHierarchy() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1165:2: ( (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup ) )
            // InternalHlvl.g:1166:2: (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup )
            {
            // InternalHlvl.g:1166:2: (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalHlvl.g:1167:3: this_Decomposition_0= ruleDecomposition
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
                    // InternalHlvl.g:1176:3: this_Group_1= ruleGroup
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
    // InternalHlvl.g:1188:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // InternalHlvl.g:1188:54: (iv_ruleDecomposition= ruleDecomposition EOF )
            // InternalHlvl.g:1189:2: iv_ruleDecomposition= ruleDecomposition EOF
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
    // InternalHlvl.g:1195:1: ruleDecomposition returns [EObject current=null] : ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' ) ;
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
        Token lv_min_10_0=null;
        Token otherlv_11=null;
        Token lv_max_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_children_6_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1201:2: ( ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' ) )
            // InternalHlvl.g:1202:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' )
            {
            // InternalHlvl.g:1202:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' )
            // InternalHlvl.g:1203:3: () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')'
            {
            // InternalHlvl.g:1203:3: ()
            // InternalHlvl.g:1204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecompositionAccess().getDecompositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecompositionKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1218:3: ( (otherlv_3= RULE_ID ) )
            // InternalHlvl.g:1219:4: (otherlv_3= RULE_ID )
            {
            // InternalHlvl.g:1219:4: (otherlv_3= RULE_ID )
            // InternalHlvl.g:1220:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getDecompositionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHlvl.g:1239:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHlvl.g:1240:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1240:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHlvl.g:1241:5: lv_children_6_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getDecompositionAccess().getChildrenListOfIDsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_7=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalHlvl.g:1270:3: ( (lv_min_10_0= RULE_INT ) )
            // InternalHlvl.g:1271:4: (lv_min_10_0= RULE_INT )
            {
            // InternalHlvl.g:1271:4: (lv_min_10_0= RULE_INT )
            // InternalHlvl.g:1272:5: lv_min_10_0= RULE_INT
            {
            lv_min_10_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_min_10_0, grammarAccess.getDecompositionAccess().getMinINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getDecompositionAccess().getCommaKeyword_11());
            		
            // InternalHlvl.g:1292:3: ( (lv_max_12_0= RULE_INT ) )
            // InternalHlvl.g:1293:4: (lv_max_12_0= RULE_INT )
            {
            // InternalHlvl.g:1293:4: (lv_max_12_0= RULE_INT )
            // InternalHlvl.g:1294:5: lv_max_12_0= RULE_INT
            {
            lv_max_12_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_max_12_0, grammarAccess.getDecompositionAccess().getMaxINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_14());
            		

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
    // InternalHlvl.g:1322:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalHlvl.g:1322:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalHlvl.g:1323:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalHlvl.g:1329:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' ) ;
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
        Token otherlv_14=null;
        EObject lv_children_6_0 = null;

        EObject lv_max_12_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1335:2: ( ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' ) )
            // InternalHlvl.g:1336:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' )
            {
            // InternalHlvl.g:1336:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' )
            // InternalHlvl.g:1337:3: () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')'
            {
            // InternalHlvl.g:1337:3: ()
            // InternalHlvl.g:1338:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1352:3: ( (otherlv_3= RULE_ID ) )
            // InternalHlvl.g:1353:4: (otherlv_3= RULE_ID )
            {
            // InternalHlvl.g:1353:4: (otherlv_3= RULE_ID )
            // InternalHlvl.g:1354:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHlvl.g:1373:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHlvl.g:1374:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1374:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHlvl.g:1375:5: lv_children_6_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getChildrenListOfIDsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_7=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalHlvl.g:1404:3: ( (lv_min_10_0= RULE_INT ) )
            // InternalHlvl.g:1405:4: (lv_min_10_0= RULE_INT )
            {
            // InternalHlvl.g:1405:4: (lv_min_10_0= RULE_INT )
            // InternalHlvl.g:1406:5: lv_min_10_0= RULE_INT
            {
            lv_min_10_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

            otherlv_11=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getCommaKeyword_11());
            		
            // InternalHlvl.g:1426:3: ( (lv_max_12_0= ruleRange ) )
            // InternalHlvl.g:1427:4: (lv_max_12_0= ruleRange )
            {
            // InternalHlvl.g:1427:4: (lv_max_12_0= ruleRange )
            // InternalHlvl.g:1428:5: lv_max_12_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getMaxRangeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_13=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getRightParenthesisKeyword_14());
            		

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
    // InternalHlvl.g:1457:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalHlvl.g:1457:46: (iv_ruleRange= ruleRange EOF )
            // InternalHlvl.g:1458:2: iv_ruleRange= ruleRange EOF
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
    // InternalHlvl.g:1464:1: ruleRange returns [EObject current=null] : ( () ( (lv_value_1_0= rulewildcard ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1470:2: ( ( () ( (lv_value_1_0= rulewildcard ) ) ) )
            // InternalHlvl.g:1471:2: ( () ( (lv_value_1_0= rulewildcard ) ) )
            {
            // InternalHlvl.g:1471:2: ( () ( (lv_value_1_0= rulewildcard ) ) )
            // InternalHlvl.g:1472:3: () ( (lv_value_1_0= rulewildcard ) )
            {
            // InternalHlvl.g:1472:3: ()
            // InternalHlvl.g:1473:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeAccess().getRangeAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:1479:3: ( (lv_value_1_0= rulewildcard ) )
            // InternalHlvl.g:1480:4: (lv_value_1_0= rulewildcard )
            {
            // InternalHlvl.g:1480:4: (lv_value_1_0= rulewildcard )
            // InternalHlvl.g:1481:5: lv_value_1_0= rulewildcard
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getValueWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=rulewildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"com.coffee.Hlvl.wildcard");
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRulewildcard"
    // InternalHlvl.g:1502:1: entryRulewildcard returns [String current=null] : iv_rulewildcard= rulewildcard EOF ;
    public final String entryRulewildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewildcard = null;


        try {
            // InternalHlvl.g:1502:48: (iv_rulewildcard= rulewildcard EOF )
            // InternalHlvl.g:1503:2: iv_rulewildcard= rulewildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewildcard=rulewildcard();

            state._fsp--;

             current =iv_rulewildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewildcard"


    // $ANTLR start "rulewildcard"
    // InternalHlvl.g:1509:1: rulewildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken rulewildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:1515:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalHlvl.g:1516:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalHlvl.g:1516:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalHlvl.g:1517:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getWildcardAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1525:3: kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWildcardAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "rulewildcard"


    // $ANTLR start "entryRuleVisibility"
    // InternalHlvl.g:1534:1: entryRuleVisibility returns [EObject current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final EObject entryRuleVisibility() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibility = null;


        try {
            // InternalHlvl.g:1534:51: (iv_ruleVisibility= ruleVisibility EOF )
            // InternalHlvl.g:1535:2: iv_ruleVisibility= ruleVisibility EOF
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
    // InternalHlvl.g:1541:1: ruleVisibility returns [EObject current=null] : (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
    public final EObject ruleVisibility() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_list_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1547:2: ( (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1548:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1548:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1549:3: otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibilityAccess().getVisibilityKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getVisibilityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1557:3: ( (lv_condition_2_0= ruleRelational ) )
            // InternalHlvl.g:1558:4: (lv_condition_2_0= ruleRelational )
            {
            // InternalHlvl.g:1558:4: (lv_condition_2_0= ruleRelational )
            // InternalHlvl.g:1559:5: lv_condition_2_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getConditionRelationalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getVisibilityAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVisibilityAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1584:3: ( (lv_list_5_0= ruleListOfRelRefs ) )
            // InternalHlvl.g:1585:4: (lv_list_5_0= ruleListOfRelRefs )
            {
            // InternalHlvl.g:1585:4: (lv_list_5_0= ruleListOfRelRefs )
            // InternalHlvl.g:1586:5: lv_list_5_0= ruleListOfRelRefs
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getListListOfRelRefsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_list_5_0=ruleListOfRelRefs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_5_0,
            						"com.coffee.Hlvl.ListOfRelRefs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getVisibilityAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_2); 

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
    // InternalHlvl.g:1615:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalHlvl.g:1615:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalHlvl.g:1616:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalHlvl.g:1622:1: ruleOrder returns [EObject current=null] : ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) ;
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
            // InternalHlvl.g:1628:2: ( ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) )
            // InternalHlvl.g:1629:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            {
            // InternalHlvl.g:1629:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHlvl.g:1630:3: ( (lv_operator_0_0= 'before' ) )
                    {
                    // InternalHlvl.g:1630:3: ( (lv_operator_0_0= 'before' ) )
                    // InternalHlvl.g:1631:4: (lv_operator_0_0= 'before' )
                    {
                    // InternalHlvl.g:1631:4: (lv_operator_0_0= 'before' )
                    // InternalHlvl.g:1632:5: lv_operator_0_0= 'before'
                    {
                    lv_operator_0_0=(Token)match(input,35,FOLLOW_2); 

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
                    // InternalHlvl.g:1645:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    {
                    // InternalHlvl.g:1645:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    // InternalHlvl.g:1646:4: otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getAfterKeyword_1_0());
                    			
                    // InternalHlvl.g:1650:4: ( (otherlv_2= RULE_ID ) )
                    // InternalHlvl.g:1651:5: (otherlv_2= RULE_ID )
                    {
                    // InternalHlvl.g:1651:5: (otherlv_2= RULE_ID )
                    // InternalHlvl.g:1652:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getLeftElmDeclarationCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrderAccess().getCommaKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getLeftSquareBracketKeyword_1_3());
                    			
                    // InternalHlvl.g:1671:4: ( (lv_right_5_0= ruleListOfIDs ) )
                    // InternalHlvl.g:1672:5: (lv_right_5_0= ruleListOfIDs )
                    {
                    // InternalHlvl.g:1672:5: (lv_right_5_0= ruleListOfIDs )
                    // InternalHlvl.g:1673:6: lv_right_5_0= ruleListOfIDs
                    {

                    						newCompositeNode(grammarAccess.getOrderAccess().getRightListOfIDsParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    otherlv_6=(Token)match(input,23,FOLLOW_2); 

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
    // InternalHlvl.g:1699:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHlvl.g:1699:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHlvl.g:1700:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalHlvl.g:1706:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1712:2: ( (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) )
            // InternalHlvl.g:1713:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            {
            // InternalHlvl.g:1713:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            // InternalHlvl.g:1714:3: otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1722:3: ( (lv_exp_2_0= ruleRelational ) )
            // InternalHlvl.g:1723:4: (lv_exp_2_0= ruleRelational )
            {
            // InternalHlvl.g:1723:4: (lv_exp_2_0= ruleRelational )
            // InternalHlvl.g:1724:5: lv_exp_2_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpRelationalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

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
    // InternalHlvl.g:1749:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalHlvl.g:1749:51: (iv_ruleRelational= ruleRelational EOF )
            // InternalHlvl.g:1750:2: iv_ruleRelational= ruleRelational EOF
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
    // InternalHlvl.g:1756:1: ruleRelational returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1762:2: (this_Iff_0= ruleIff )
            // InternalHlvl.g:1763:2: this_Iff_0= ruleIff
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
    // InternalHlvl.g:1774:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // InternalHlvl.g:1774:44: (iv_ruleIff= ruleIff EOF )
            // InternalHlvl.g:1775:2: iv_ruleIff= ruleIff EOF
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
    // InternalHlvl.g:1781:1: ruleIff returns [EObject current=null] : (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implies_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1787:2: ( (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) )
            // InternalHlvl.g:1788:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            {
            // InternalHlvl.g:1788:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            // InternalHlvl.g:1789:3: this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            {

            			newCompositeNode(grammarAccess.getIffAccess().getImpliesParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Implies_0=ruleImplies();

            state._fsp--;


            			current = this_Implies_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1797:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHlvl.g:1798:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) )
            	    {
            	    // InternalHlvl.g:1798:4: ()
            	    // InternalHlvl.g:1799:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getIffAccess().getIffLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1809:4: ( (lv_right_3_0= ruleImplies ) )
            	    // InternalHlvl.g:1810:5: (lv_right_3_0= ruleImplies )
            	    {
            	    // InternalHlvl.g:1810:5: (lv_right_3_0= ruleImplies )
            	    // InternalHlvl.g:1811:6: lv_right_3_0= ruleImplies
            	    {

            	    						newCompositeNode(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleIff"


    // $ANTLR start "entryRuleImplies"
    // InternalHlvl.g:1833:1: entryRuleImplies returns [EObject current=null] : iv_ruleImplies= ruleImplies EOF ;
    public final EObject entryRuleImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplies = null;


        try {
            // InternalHlvl.g:1833:48: (iv_ruleImplies= ruleImplies EOF )
            // InternalHlvl.g:1834:2: iv_ruleImplies= ruleImplies EOF
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
    // InternalHlvl.g:1840:1: ruleImplies returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1846:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalHlvl.g:1847:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalHlvl.g:1847:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalHlvl.g:1848:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1856:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHlvl.g:1857:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalHlvl.g:1857:4: ()
            	    // InternalHlvl.g:1858:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImpliesAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1868:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalHlvl.g:1869:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalHlvl.g:1869:5: (lv_right_3_0= ruleOr )
            	    // InternalHlvl.g:1870:6: lv_right_3_0= ruleOr
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
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalHlvl.g:1892:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalHlvl.g:1892:43: (iv_ruleOr= ruleOr EOF )
            // InternalHlvl.g:1893:2: iv_ruleOr= ruleOr EOF
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
    // InternalHlvl.g:1899:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1905:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalHlvl.g:1906:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalHlvl.g:1906:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalHlvl.g:1907:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1915:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHlvl.g:1916:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalHlvl.g:1916:4: ()
            	    // InternalHlvl.g:1917:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1927:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalHlvl.g:1928:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalHlvl.g:1928:5: (lv_right_3_0= ruleAnd )
            	    // InternalHlvl.g:1929:6: lv_right_3_0= ruleAnd
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalHlvl.g:1951:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalHlvl.g:1951:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalHlvl.g:1952:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalHlvl.g:1958:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1964:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalHlvl.g:1965:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalHlvl.g:1965:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalHlvl.g:1966:3: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1974:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHlvl.g:1975:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalHlvl.g:1975:4: ()
            	    // InternalHlvl.g:1976:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1986:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalHlvl.g:1987:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalHlvl.g:1987:5: (lv_right_3_0= ruleEquality )
            	    // InternalHlvl.g:1988:6: lv_right_3_0= ruleEquality
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalHlvl.g:2010:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalHlvl.g:2010:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalHlvl.g:2011:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalHlvl.g:2017:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2023:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalHlvl.g:2024:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalHlvl.g:2024:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalHlvl.g:2025:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2033:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=42 && LA20_0<=43)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHlvl.g:2034:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalHlvl.g:2034:4: ()
            	    // InternalHlvl.g:2035:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2041:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) )
            	    // InternalHlvl.g:2042:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalHlvl.g:2042:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    // InternalHlvl.g:2043:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    {
            	    // InternalHlvl.g:2043:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==42) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==43) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalHlvl.g:2044:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,42,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2055:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,43,FOLLOW_24); 

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

            	    // InternalHlvl.g:2068:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalHlvl.g:2069:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalHlvl.g:2069:5: (lv_right_3_0= ruleComparison )
            	    // InternalHlvl.g:2070:6: lv_right_3_0= ruleComparison
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalHlvl.g:2092:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalHlvl.g:2092:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalHlvl.g:2093:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalHlvl.g:2099:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalHlvl.g:2105:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalHlvl.g:2106:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalHlvl.g:2106:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalHlvl.g:2107:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2115:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=44 && LA22_0<=47)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalHlvl.g:2116:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalHlvl.g:2116:4: ()
            	    // InternalHlvl.g:2117:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2123:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalHlvl.g:2124:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalHlvl.g:2124:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalHlvl.g:2125:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalHlvl.g:2125:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case 44:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 47:
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
            	            // InternalHlvl.g:2126:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,44,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2137:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,45,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2148:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,46,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalHlvl.g:2159:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,47,FOLLOW_24); 

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

            	    // InternalHlvl.g:2172:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalHlvl.g:2173:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalHlvl.g:2173:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalHlvl.g:2174:6: lv_right_3_0= rulePlusOrMinus
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalHlvl.g:2196:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalHlvl.g:2196:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalHlvl.g:2197:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalHlvl.g:2203:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2209:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalHlvl.g:2210:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalHlvl.g:2210:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalHlvl.g:2211:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2219:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=48 && LA24_0<=49)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalHlvl.g:2220:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalHlvl.g:2220:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==48) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==49) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalHlvl.g:2221:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalHlvl.g:2221:5: ( () otherlv_2= '+' )
            	            // InternalHlvl.g:2222:6: () otherlv_2= '+'
            	            {
            	            // InternalHlvl.g:2222:6: ()
            	            // InternalHlvl.g:2223:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,48,FOLLOW_24); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2235:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalHlvl.g:2235:5: ( () otherlv_4= '-' )
            	            // InternalHlvl.g:2236:6: () otherlv_4= '-'
            	            {
            	            // InternalHlvl.g:2236:6: ()
            	            // InternalHlvl.g:2237:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,49,FOLLOW_24); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalHlvl.g:2249:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalHlvl.g:2250:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalHlvl.g:2250:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalHlvl.g:2251:6: lv_right_5_0= ruleMulOrDiv
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalHlvl.g:2273:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalHlvl.g:2273:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalHlvl.g:2274:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalHlvl.g:2280:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2286:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalHlvl.g:2287:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalHlvl.g:2287:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalHlvl.g:2288:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2296:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33||(LA26_0>=50 && LA26_0<=51)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalHlvl.g:2297:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalHlvl.g:2297:4: ()
            	    // InternalHlvl.g:2298:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2304:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
            	    // InternalHlvl.g:2305:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    {
            	    // InternalHlvl.g:2305:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    // InternalHlvl.g:2306:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    {
            	    // InternalHlvl.g:2306:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalHlvl.g:2307:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2318:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,50,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2329:7: lv_op_2_3= 'mod'
            	            {
            	            lv_op_2_3=(Token)match(input,51,FOLLOW_24); 

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

            	    // InternalHlvl.g:2342:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalHlvl.g:2343:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalHlvl.g:2343:5: (lv_right_3_0= rulePrimary )
            	    // InternalHlvl.g:2344:6: lv_right_3_0= rulePrimary
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
            	    break loop26;
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
    // InternalHlvl.g:2366:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalHlvl.g:2366:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalHlvl.g:2367:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalHlvl.g:2373:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic ) ;
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
            // InternalHlvl.g:2379:2: ( ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic ) )
            // InternalHlvl.g:2380:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic )
            {
            // InternalHlvl.g:2380:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt27=1;
                }
                break;
            case 52:
                {
                alt27=2;
                }
                break;
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt27=3;
                }
                break;
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt27=4;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 53:
            case 54:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalHlvl.g:2381:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    {
                    // InternalHlvl.g:2381:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    // InternalHlvl.g:2382:4: otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getRelationalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_Relational_1=ruleRelational();

                    state._fsp--;


                    				current = this_Relational_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:2400:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalHlvl.g:2400:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalHlvl.g:2401:4: () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalHlvl.g:2401:4: ()
                    // InternalHlvl.g:2402:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNegationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,52,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getTildeKeyword_1_1());
                    			
                    // InternalHlvl.g:2412:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalHlvl.g:2413:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalHlvl.g:2413:5: (lv_expression_5_0= rulePrimary )
                    // InternalHlvl.g:2414:6: lv_expression_5_0= rulePrimary
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
                    // InternalHlvl.g:2433:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' )
                    {
                    // InternalHlvl.g:2433:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' )
                    // InternalHlvl.g:2434:4: () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')'
                    {
                    // InternalHlvl.g:2434:4: ()
                    // InternalHlvl.g:2435:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUnaryAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2441:4: ( (lv_op_7_0= ruleUnaryOp ) )
                    // InternalHlvl.g:2442:5: (lv_op_7_0= ruleUnaryOp )
                    {
                    // InternalHlvl.g:2442:5: (lv_op_7_0= ruleUnaryOp )
                    // InternalHlvl.g:2443:6: lv_op_7_0= ruleUnaryOp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getOpUnaryOpParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    otherlv_8=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalHlvl.g:2464:4: ( (lv_expression_9_0= rulePrimary ) )
                    // InternalHlvl.g:2465:5: (lv_expression_9_0= rulePrimary )
                    {
                    // InternalHlvl.g:2465:5: (lv_expression_9_0= rulePrimary )
                    // InternalHlvl.g:2466:6: lv_expression_9_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    otherlv_10=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHlvl.g:2489:3: ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' )
                    {
                    // InternalHlvl.g:2489:3: ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' )
                    // InternalHlvl.g:2490:4: () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')'
                    {
                    // InternalHlvl.g:2490:4: ()
                    // InternalHlvl.g:2491:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getFunctionAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2497:4: ( (lv_op_12_0= ruleFunctionOp ) )
                    // InternalHlvl.g:2498:5: (lv_op_12_0= ruleFunctionOp )
                    {
                    // InternalHlvl.g:2498:5: (lv_op_12_0= ruleFunctionOp )
                    // InternalHlvl.g:2499:6: lv_op_12_0= ruleFunctionOp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getOpFunctionOpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    otherlv_13=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalHlvl.g:2520:4: ( (lv_left_14_0= rulePrimary ) )
                    // InternalHlvl.g:2521:5: (lv_left_14_0= rulePrimary )
                    {
                    // InternalHlvl.g:2521:5: (lv_left_14_0= rulePrimary )
                    // InternalHlvl.g:2522:6: lv_left_14_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    otherlv_15=(Token)match(input,30,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getCommaKeyword_3_4());
                    			
                    // InternalHlvl.g:2543:4: ( (lv_right_16_0= rulePrimary ) )
                    // InternalHlvl.g:2544:5: (lv_right_16_0= rulePrimary )
                    {
                    // InternalHlvl.g:2544:5: (lv_right_16_0= rulePrimary )
                    // InternalHlvl.g:2545:6: lv_right_16_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getRightPrimaryParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    otherlv_17=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_6());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHlvl.g:2568:3: this_Atomic_18= ruleAtomic
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
    // InternalHlvl.g:2580:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalHlvl.g:2580:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalHlvl.g:2581:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalHlvl.g:2587:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_value_11_0=null;
        Token lv_value_13_0=null;
        AntlrDatatypeRuleToken lv_attribute_5_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2593:2: ( ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) ) )
            // InternalHlvl.g:2594:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) )
            {
            // InternalHlvl.g:2594:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 53:
            case 54:
                {
                alt29=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    alt29=3;
                    }
                    break;
                case 19:
                    {
                    alt29=4;
                    }
                    break;
                case EOF:
                case 27:
                case 30:
                case 33:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                    {
                    alt29=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt29=5;
                }
                break;
            case RULE_INT:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalHlvl.g:2595:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    {
                    // InternalHlvl.g:2595:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    // InternalHlvl.g:2596:4: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    {
                    // InternalHlvl.g:2596:4: ()
                    // InternalHlvl.g:2597:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2603:4: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    // InternalHlvl.g:2604:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    {
                    // InternalHlvl.g:2604:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    // InternalHlvl.g:2605:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    {
                    // InternalHlvl.g:2605:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==53) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==54) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalHlvl.g:2606:7: lv_value_1_1= 'true'
                            {
                            lv_value_1_1=(Token)match(input,53,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalHlvl.g:2617:7: lv_value_1_2= 'false'
                            {
                            lv_value_1_2=(Token)match(input,54,FOLLOW_2); 

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
                    // InternalHlvl.g:2632:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalHlvl.g:2632:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalHlvl.g:2633:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalHlvl.g:2633:4: ()
                    // InternalHlvl.g:2634:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2640:4: ( (otherlv_3= RULE_ID ) )
                    // InternalHlvl.g:2641:5: (otherlv_3= RULE_ID )
                    {
                    // InternalHlvl.g:2641:5: (otherlv_3= RULE_ID )
                    // InternalHlvl.g:2642:6: otherlv_3= RULE_ID
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
                    // InternalHlvl.g:2655:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    {
                    // InternalHlvl.g:2655:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    // InternalHlvl.g:2656:4: () ( (lv_attribute_5_0= ruleQualifiedName ) )
                    {
                    // InternalHlvl.g:2656:4: ()
                    // InternalHlvl.g:2657:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getAttributeRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2663:4: ( (lv_attribute_5_0= ruleQualifiedName ) )
                    // InternalHlvl.g:2664:5: (lv_attribute_5_0= ruleQualifiedName )
                    {
                    // InternalHlvl.g:2664:5: (lv_attribute_5_0= ruleQualifiedName )
                    // InternalHlvl.g:2665:6: lv_attribute_5_0= ruleQualifiedName
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
                    // InternalHlvl.g:2684:3: ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) )
                    {
                    // InternalHlvl.g:2684:3: ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) )
                    // InternalHlvl.g:2685:4: () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) )
                    {
                    // InternalHlvl.g:2685:4: ()
                    // InternalHlvl.g:2686:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getAssignAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2692:4: ( (otherlv_7= RULE_ID ) )
                    // InternalHlvl.g:2693:5: (otherlv_7= RULE_ID )
                    {
                    // InternalHlvl.g:2693:5: (otherlv_7= RULE_ID )
                    // InternalHlvl.g:2694:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableElmDeclarationCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getIsKeyword_3_2());
                    			
                    // InternalHlvl.g:2709:4: ( (lv_value_9_0= ruleValue ) )
                    // InternalHlvl.g:2710:5: (lv_value_9_0= ruleValue )
                    {
                    // InternalHlvl.g:2710:5: (lv_value_9_0= ruleValue )
                    // InternalHlvl.g:2711:6: lv_value_9_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getValueValueParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_9_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"com.coffee.Hlvl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalHlvl.g:2730:3: ( () ( (lv_value_11_0= RULE_STRING ) ) )
                    {
                    // InternalHlvl.g:2730:3: ( () ( (lv_value_11_0= RULE_STRING ) ) )
                    // InternalHlvl.g:2731:4: () ( (lv_value_11_0= RULE_STRING ) )
                    {
                    // InternalHlvl.g:2731:4: ()
                    // InternalHlvl.g:2732:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getSymbolConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2738:4: ( (lv_value_11_0= RULE_STRING ) )
                    // InternalHlvl.g:2739:5: (lv_value_11_0= RULE_STRING )
                    {
                    // InternalHlvl.g:2739:5: (lv_value_11_0= RULE_STRING )
                    // InternalHlvl.g:2740:6: lv_value_11_0= RULE_STRING
                    {
                    lv_value_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_11_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalHlvl.g:2758:3: ( () ( (lv_value_13_0= RULE_INT ) ) )
                    {
                    // InternalHlvl.g:2758:3: ( () ( (lv_value_13_0= RULE_INT ) ) )
                    // InternalHlvl.g:2759:4: () ( (lv_value_13_0= RULE_INT ) )
                    {
                    // InternalHlvl.g:2759:4: ()
                    // InternalHlvl.g:2760:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_5_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2766:4: ( (lv_value_13_0= RULE_INT ) )
                    // InternalHlvl.g:2767:5: (lv_value_13_0= RULE_INT )
                    {
                    // InternalHlvl.g:2767:5: (lv_value_13_0= RULE_INT )
                    // InternalHlvl.g:2768:6: lv_value_13_0= RULE_INT
                    {
                    lv_value_13_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_13_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_13_0,
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
    // InternalHlvl.g:2789:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalHlvl.g:2789:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalHlvl.g:2790:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalHlvl.g:2796:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:2802:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalHlvl.g:2803:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalHlvl.g:2803:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalHlvl.g:2804:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalHlvl.g:2811:3: (kw= '.' this_ID_2= RULE_ID )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalHlvl.g:2812:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,55,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
    // InternalHlvl.g:2829:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalHlvl.g:2829:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalHlvl.g:2830:2: iv_ruleOperations= ruleOperations EOF
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
    // InternalHlvl.g:2836:1: ruleOperations returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2842:2: ( ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) )
            // InternalHlvl.g:2843:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            {
            // InternalHlvl.g:2843:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            // InternalHlvl.g:2844:3: ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            {
            // InternalHlvl.g:2844:3: ( (lv_op_0_0= ruleOperation ) )
            // InternalHlvl.g:2845:4: (lv_op_0_0= ruleOperation )
            {
            // InternalHlvl.g:2845:4: (lv_op_0_0= ruleOperation )
            // InternalHlvl.g:2846:5: lv_op_0_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalHlvl.g:2863:3: ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==30) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalHlvl.g:2864:4: (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) )
            	    {
            	    // InternalHlvl.g:2864:4: (otherlv_1= ',' )+
            	    int cnt31=0;
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==30) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalHlvl.g:2865:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,30,FOLLOW_39); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getOperationsAccess().getCommaKeyword_1_0());
            	    	    				

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

            	    // InternalHlvl.g:2870:4: ( (lv_op_2_0= ruleOperation ) )
            	    // InternalHlvl.g:2871:5: (lv_op_2_0= ruleOperation )
            	    {
            	    // InternalHlvl.g:2871:5: (lv_op_2_0= ruleOperation )
            	    // InternalHlvl.g:2872:6: lv_op_2_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleOperation"
    // InternalHlvl.g:2894:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalHlvl.g:2894:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalHlvl.g:2895:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalHlvl.g:2901:1: ruleOperation returns [EObject current=null] : this_Sample_0= ruleSample ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Sample_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2907:2: (this_Sample_0= ruleSample )
            // InternalHlvl.g:2908:2: this_Sample_0= ruleSample
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
    // InternalHlvl.g:2919:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalHlvl.g:2919:47: (iv_ruleSample= ruleSample EOF )
            // InternalHlvl.g:2920:2: iv_ruleSample= ruleSample EOF
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
    // InternalHlvl.g:2926:1: ruleSample returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_valuations_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2932:2: ( ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) )
            // InternalHlvl.g:2933:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            {
            // InternalHlvl.g:2933:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=57 && LA33_0<=60)) ) {
                alt33=1;
            }
            else if ( (LA33_0==56) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalHlvl.g:2934:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    {
                    // InternalHlvl.g:2934:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    // InternalHlvl.g:2935:4: () ( (lv_name_1_0= ruleOperationName ) )
                    {
                    // InternalHlvl.g:2935:4: ()
                    // InternalHlvl.g:2936:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getSingleInstructionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2942:4: ( (lv_name_1_0= ruleOperationName ) )
                    // InternalHlvl.g:2943:5: (lv_name_1_0= ruleOperationName )
                    {
                    // InternalHlvl.g:2943:5: (lv_name_1_0= ruleOperationName )
                    // InternalHlvl.g:2944:6: lv_name_1_0= ruleOperationName
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
                    // InternalHlvl.g:2963:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    {
                    // InternalHlvl.g:2963:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    // InternalHlvl.g:2964:4: () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')'
                    {
                    // InternalHlvl.g:2964:4: ()
                    // InternalHlvl.g:2965:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getValidConfAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,56,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getValidConfigurationKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalHlvl.g:2979:4: ( (lv_valuations_5_0= ruleListOfValuation ) )
                    // InternalHlvl.g:2980:5: (lv_valuations_5_0= ruleListOfValuation )
                    {
                    // InternalHlvl.g:2980:5: (lv_valuations_5_0= ruleListOfValuation )
                    // InternalHlvl.g:2981:6: lv_valuations_5_0= ruleListOfValuation
                    {

                    						newCompositeNode(grammarAccess.getSampleAccess().getValuationsListOfValuationParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    otherlv_6=(Token)match(input,27,FOLLOW_2); 

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
    // InternalHlvl.g:3007:1: entryRuleOperationName returns [String current=null] : iv_ruleOperationName= ruleOperationName EOF ;
    public final String entryRuleOperationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationName = null;


        try {
            // InternalHlvl.g:3007:53: (iv_ruleOperationName= ruleOperationName EOF )
            // InternalHlvl.g:3008:2: iv_ruleOperationName= ruleOperationName EOF
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
    // InternalHlvl.g:3014:1: ruleOperationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) ;
    public final AntlrDatatypeRuleToken ruleOperationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3020:2: ( (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) )
            // InternalHlvl.g:3021:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            {
            // InternalHlvl.g:3021:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt34=1;
                }
                break;
            case 58:
                {
                alt34=2;
                }
                break;
            case 59:
                {
                alt34=3;
                }
                break;
            case 60:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalHlvl.g:3022:3: kw= 'validModel'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getValidModelKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3028:3: kw= 'numberOfConfigurations'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getNumberOfConfigurationsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3034:3: kw= 'findConfiguration'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getFindConfigurationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:3040:3: kw= 'findAllConfigurations'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

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
    // InternalHlvl.g:3049:1: entryRuleBoolVal returns [EObject current=null] : iv_ruleBoolVal= ruleBoolVal EOF ;
    public final EObject entryRuleBoolVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVal = null;


        try {
            // InternalHlvl.g:3049:48: (iv_ruleBoolVal= ruleBoolVal EOF )
            // InternalHlvl.g:3050:2: iv_ruleBoolVal= ruleBoolVal EOF
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
    // InternalHlvl.g:3056:1: ruleBoolVal returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3062:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalHlvl.g:3063:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalHlvl.g:3063:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalHlvl.g:3064:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalHlvl.g:3064:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalHlvl.g:3065:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalHlvl.g:3065:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            else if ( (LA35_0==54) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalHlvl.g:3066:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,53,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolValRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3077:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,54,FOLLOW_2); 

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
    // InternalHlvl.g:3093:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalHlvl.g:3093:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalHlvl.g:3094:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalHlvl.g:3100:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:3106:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalHlvl.g:3107:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalHlvl.g:3107:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalHlvl.g:3108:3: (lv_value_0_0= RULE_INT )
            {
            // InternalHlvl.g:3108:3: (lv_value_0_0= RULE_INT )
            // InternalHlvl.g:3109:4: lv_value_0_0= RULE_INT
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
    // InternalHlvl.g:3128:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalHlvl.g:3128:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalHlvl.g:3129:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalHlvl.g:3135:1: ruleSymbol returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:3141:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalHlvl.g:3142:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalHlvl.g:3142:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalHlvl.g:3143:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalHlvl.g:3143:3: (lv_value_0_0= RULE_STRING )
            // InternalHlvl.g:3144:4: lv_value_0_0= RULE_STRING
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
    // InternalHlvl.g:3163:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalHlvl.g:3163:46: (iv_ruleValue= ruleValue EOF )
            // InternalHlvl.g:3164:2: iv_ruleValue= ruleValue EOF
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
    // InternalHlvl.g:3170:1: ruleValue returns [EObject current=null] : (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_BoolVal_1 = null;

        EObject this_Symbol_2 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3176:2: ( (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol ) )
            // InternalHlvl.g:3177:2: (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol )
            {
            // InternalHlvl.g:3177:2: (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol )
            int alt36=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt36=1;
                }
                break;
            case 53:
            case 54:
                {
                alt36=2;
                }
                break;
            case RULE_STRING:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalHlvl.g:3178:3: this_Number_0= ruleNumber
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
                    // InternalHlvl.g:3187:3: this_BoolVal_1= ruleBoolVal
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
                    // InternalHlvl.g:3196:3: this_Symbol_2= ruleSymbol
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
    // InternalHlvl.g:3208:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalHlvl.g:3208:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalHlvl.g:3209:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalHlvl.g:3215:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3221:2: ( (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) )
            // InternalHlvl.g:3222:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            {
            // InternalHlvl.g:3222:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt37=1;
                }
                break;
            case 62:
                {
                alt37=2;
                }
                break;
            case 63:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalHlvl.g:3223:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3229:3: kw= 'integer'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3235:3: kw= 'symbolic'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

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
    // InternalHlvl.g:3244:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalHlvl.g:3244:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalHlvl.g:3245:2: iv_ruleListOfValues= ruleListOfValues EOF
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
    // InternalHlvl.g:3251:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3257:2: ( ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) )
            // InternalHlvl.g:3258:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            {
            // InternalHlvl.g:3258:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            // InternalHlvl.g:3259:3: ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            {
            // InternalHlvl.g:3259:3: ( (lv_values_0_0= ruleValue ) )
            // InternalHlvl.g:3260:4: (lv_values_0_0= ruleValue )
            {
            // InternalHlvl.g:3260:4: (lv_values_0_0= ruleValue )
            // InternalHlvl.g:3261:5: lv_values_0_0= ruleValue
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

            // InternalHlvl.g:3278:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==30) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalHlvl.g:3279:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) )
            	    {
            	    // InternalHlvl.g:3279:4: (otherlv_1= ',' )+
            	    int cnt38=0;
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==30) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3280:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,30,FOLLOW_40); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	    				

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

            	    // InternalHlvl.g:3285:4: ( (lv_values_2_0= ruleValue ) )
            	    // InternalHlvl.g:3286:5: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalHlvl.g:3286:5: (lv_values_2_0= ruleValue )
            	    // InternalHlvl.g:3287:6: lv_values_2_0= ruleValue
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
    // $ANTLR end "ruleListOfValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalHlvl.g:3309:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalHlvl.g:3309:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalHlvl.g:3310:2: iv_ruleListOfIDs= ruleListOfIDs EOF
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
    // InternalHlvl.g:3316:1: ruleListOfIDs returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHlvl.g:3322:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3323:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3323:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            // InternalHlvl.g:3324:3: () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3324:3: ()
            // InternalHlvl.g:3325:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListOfIDsAccess().getListOfIDsAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:3331:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3332:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3332:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3333:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfIDsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_1_0());
            				

            }


            }

            // InternalHlvl.g:3344:3: ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==30) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalHlvl.g:3345:4: (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3345:4: (otherlv_2= ',' )+
            	    int cnt40=0;
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==30) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3346:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,30,FOLLOW_41); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getListOfIDsAccess().getCommaKeyword_2_0());
            	    	    				

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

            	    // InternalHlvl.g:3351:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalHlvl.g:3352:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalHlvl.g:3352:5: (otherlv_3= RULE_ID )
            	    // InternalHlvl.g:3353:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfIDsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    						newLeafNode(otherlv_3, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_2_1_0());
            	    					

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
    // $ANTLR end "ruleListOfIDs"


    // $ANTLR start "entryRuleListOfRelRefs"
    // InternalHlvl.g:3369:1: entryRuleListOfRelRefs returns [EObject current=null] : iv_ruleListOfRelRefs= ruleListOfRelRefs EOF ;
    public final EObject entryRuleListOfRelRefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfRelRefs = null;


        try {
            // InternalHlvl.g:3369:54: (iv_ruleListOfRelRefs= ruleListOfRelRefs EOF )
            // InternalHlvl.g:3370:2: iv_ruleListOfRelRefs= ruleListOfRelRefs EOF
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
    // InternalHlvl.g:3376:1: ruleListOfRelRefs returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfRelRefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHlvl.g:3382:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3383:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3383:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            // InternalHlvl.g:3384:3: () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3384:3: ()
            // InternalHlvl.g:3385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListOfRelRefsAccess().getListOfRelRefsAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:3391:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3392:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3392:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3393:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfRelRefsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_1, grammarAccess.getListOfRelRefsAccess().getIdsRelDeclarationCrossReference_1_0());
            				

            }


            }

            // InternalHlvl.g:3404:3: ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==30) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalHlvl.g:3405:4: (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3405:4: (otherlv_2= ',' )+
            	    int cnt42=0;
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==30) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3406:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,30,FOLLOW_41); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getListOfRelRefsAccess().getCommaKeyword_2_0());
            	    	    				

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

            	    // InternalHlvl.g:3411:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalHlvl.g:3412:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalHlvl.g:3412:5: (otherlv_3= RULE_ID )
            	    // InternalHlvl.g:3413:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfRelRefsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    						newLeafNode(otherlv_3, grammarAccess.getListOfRelRefsAccess().getIdsRelDeclarationCrossReference_2_1_0());
            	    					

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
    // $ANTLR end "ruleListOfRelRefs"


    // $ANTLR start "entryRuleValuation"
    // InternalHlvl.g:3429:1: entryRuleValuation returns [EObject current=null] : iv_ruleValuation= ruleValuation EOF ;
    public final EObject entryRuleValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuation = null;


        try {
            // InternalHlvl.g:3429:50: (iv_ruleValuation= ruleValuation EOF )
            // InternalHlvl.g:3430:2: iv_ruleValuation= ruleValuation EOF
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
    // InternalHlvl.g:3436:1: ruleValuation returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3442:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) )
            // InternalHlvl.g:3443:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            {
            // InternalHlvl.g:3443:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            // InternalHlvl.g:3444:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValuationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalHlvl.g:3448:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3449:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3449:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3450:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValuationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getValuationAccess().getElementElmDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getValuationAccess().getCommaKeyword_2());
            		
            // InternalHlvl.g:3465:3: ( (lv_value_3_0= ruleValue ) )
            // InternalHlvl.g:3466:4: (lv_value_3_0= ruleValue )
            {
            // InternalHlvl.g:3466:4: (lv_value_3_0= ruleValue )
            // InternalHlvl.g:3467:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getValuationAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

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
    // InternalHlvl.g:3492:1: entryRuleListOfValuation returns [EObject current=null] : iv_ruleListOfValuation= ruleListOfValuation EOF ;
    public final EObject entryRuleListOfValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValuation = null;


        try {
            // InternalHlvl.g:3492:56: (iv_ruleListOfValuation= ruleListOfValuation EOF )
            // InternalHlvl.g:3493:2: iv_ruleListOfValuation= ruleListOfValuation EOF
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
    // InternalHlvl.g:3499:1: ruleListOfValuation returns [EObject current=null] : ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) ;
    public final EObject ruleListOfValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pairs_0_0 = null;

        EObject lv_pairs_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3505:2: ( ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) )
            // InternalHlvl.g:3506:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            {
            // InternalHlvl.g:3506:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            // InternalHlvl.g:3507:3: ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            {
            // InternalHlvl.g:3507:3: ( (lv_pairs_0_0= ruleValuation ) )
            // InternalHlvl.g:3508:4: (lv_pairs_0_0= ruleValuation )
            {
            // InternalHlvl.g:3508:4: (lv_pairs_0_0= ruleValuation )
            // InternalHlvl.g:3509:5: lv_pairs_0_0= ruleValuation
            {

            					newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalHlvl.g:3526:3: ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==30) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalHlvl.g:3527:4: (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) )
            	    {
            	    // InternalHlvl.g:3527:4: (otherlv_1= ',' )+
            	    int cnt44=0;
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==30) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3528:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,30,FOLLOW_42); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuationAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt44 >= 1 ) break loop44;
            	                EarlyExitException eee =
            	                    new EarlyExitException(44, input);
            	                throw eee;
            	        }
            	        cnt44++;
            	    } while (true);

            	    // InternalHlvl.g:3533:4: ( (lv_pairs_2_0= ruleValuation ) )
            	    // InternalHlvl.g:3534:5: (lv_pairs_2_0= ruleValuation )
            	    {
            	    // InternalHlvl.g:3534:5: (lv_pairs_2_0= ruleValuation )
            	    // InternalHlvl.g:3535:6: lv_pairs_2_0= ruleValuation
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
            	    break loop45;
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
    // InternalHlvl.g:3557:1: entryRuleFunctionOp returns [String current=null] : iv_ruleFunctionOp= ruleFunctionOp EOF ;
    public final String entryRuleFunctionOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionOp = null;


        try {
            // InternalHlvl.g:3557:50: (iv_ruleFunctionOp= ruleFunctionOp EOF )
            // InternalHlvl.g:3558:2: iv_ruleFunctionOp= ruleFunctionOp EOF
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
    // InternalHlvl.g:3564:1: ruleFunctionOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' | kw= 'if' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3570:2: ( (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' | kw= 'if' ) )
            // InternalHlvl.g:3571:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' | kw= 'if' )
            {
            // InternalHlvl.g:3571:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' | kw= 'if' )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt46=1;
                }
                break;
            case 65:
                {
                alt46=2;
                }
                break;
            case 66:
                {
                alt46=3;
                }
                break;
            case 67:
                {
                alt46=4;
                }
                break;
            case 68:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalHlvl.g:3572:3: kw= 'pow'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getPowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3578:3: kw= 'dist'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getDistKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3584:3: kw= 'min'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getMinKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:3590:3: kw= 'max'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getMaxKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalHlvl.g:3596:3: kw= 'if'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getIfKeyword_4());
                    		

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
    // InternalHlvl.g:3605:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // InternalHlvl.g:3605:47: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalHlvl.g:3606:2: iv_ruleUnaryOp= ruleUnaryOp EOF
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
    // InternalHlvl.g:3612:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abs' | kw= 'sqrt' | kw= 'instances' | kw= 'entailed' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3618:2: ( (kw= 'abs' | kw= 'sqrt' | kw= 'instances' | kw= 'entailed' ) )
            // InternalHlvl.g:3619:2: (kw= 'abs' | kw= 'sqrt' | kw= 'instances' | kw= 'entailed' )
            {
            // InternalHlvl.g:3619:2: (kw= 'abs' | kw= 'sqrt' | kw= 'instances' | kw= 'entailed' )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt47=1;
                }
                break;
            case 70:
                {
                alt47=2;
                }
                break;
            case 71:
                {
                alt47=3;
                }
                break;
            case 72:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalHlvl.g:3620:3: kw= 'abs'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getAbsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3626:3: kw= 'sqrt'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getSqrtKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3632:3: kw= 'instances'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getInstancesKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:3638:3: kw= 'entailed'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getEntailedKeyword_3());
                    		

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


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\31\2\uffff\2\32\3\uffff\2\4\1\uffff\1\36\1\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\45\2\uffff\2\32\3\uffff\2\32\1\uffff\1\36\1\uffff\1\26\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\2\uffff\1\10\1\uffff\1\11\1\uffff\1\4\1\3";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\3\1\4\1\uffff\2\2\1\uffff\1\7\2\5\1\6",
            "",
            "",
            "\1\10",
            "\1\11",
            "",
            "",
            "",
            "\1\13\25\uffff\1\12",
            "\1\13\25\uffff\1\14",
            "",
            "\1\15",
            "",
            "\1\17\21\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "650:2: (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_Expression_5= ruleExpression | this_Visibility_6= ruleVisibility | this_ComplexImplies_7= ruleComplexImplies | this_ComplexMutex_8= ruleComplexMutex )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xE00000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1F00000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xE000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0060000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003DB2000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0070000004000070L,0x00000000000001FFL});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000C000200000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1F00000040000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0060000040000060L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000044000000L});

}