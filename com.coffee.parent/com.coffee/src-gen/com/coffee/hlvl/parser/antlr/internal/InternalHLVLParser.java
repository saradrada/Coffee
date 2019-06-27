package com.coffee.hlvl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.coffee.hlvl.services.HLVLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHLVLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'elements:'", "'relations:'", "'operations:'", "'att'", "'instantiable'", "'['", "','", "']'", "'comment:'", "'{'", "'}'", "'is'", "'variants:'", "'..'", "':'", "'common'", "'('", "')'", "'implies'", "'mutex'", "'decomposition'", "'<'", "'>'", "'group'", "'*'", "'visibility'", "'before'", "'after'", "'expression'", "'<=>'", "'=>'", "'OR'", "'AND'", "'='", "'!='", "'>='", "'<='", "'+'", "'-'", "'/'", "'mod'", "'~'", "'true'", "'false'", "'.'", "'validConfiguration'", "'validModel'", "'numberOfConfigurations'", "'findConfiguration'", "'findAllConfigurations'", "'boolean'", "'integer'", "'symbolic'", "'pow'", "'dist'", "'min'", "'max'", "'if'", "'abs'", "'sqrt'", "'instances'", "'entailed'"
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
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


        public InternalHLVLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHLVLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHLVLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHLVL.g"; }



     	private HLVLGrammarAccess grammarAccess;

        public InternalHLVLParser(TokenStream input, HLVLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected HLVLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHLVL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHLVL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalHLVL.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalHLVL.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )? ) ;
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
            // InternalHLVL.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )? ) )
            // InternalHLVL.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )? )
            {
            // InternalHLVL.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )? )
            // InternalHLVL.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'elements:' ( (lv_elements_3_0= ruleElmDeclaration ) )* otherlv_4= 'relations:' ( (lv_relations_5_0= ruleRelDeclaration ) )* (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalHLVL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHLVL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHLVL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalHLVL.g:85:5: lv_name_1_0= RULE_ID
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
            		
            // InternalHLVL.g:105:3: ( (lv_elements_3_0= ruleElmDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)||(LA1_0>=62 && LA1_0<=64)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHLVL.g:106:4: (lv_elements_3_0= ruleElmDeclaration )
            	    {
            	    // InternalHLVL.g:106:4: (lv_elements_3_0= ruleElmDeclaration )
            	    // InternalHLVL.g:107:5: lv_elements_3_0= ruleElmDeclaration
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
            	    						"com.coffee.hlvl.HLVL.ElmDeclaration");
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
            		
            // InternalHLVL.g:128:3: ( (lv_relations_5_0= ruleRelDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHLVL.g:129:4: (lv_relations_5_0= ruleRelDeclaration )
            	    {
            	    // InternalHLVL.g:129:4: (lv_relations_5_0= ruleRelDeclaration )
            	    // InternalHLVL.g:130:5: lv_relations_5_0= ruleRelDeclaration
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
            	    						"com.coffee.hlvl.HLVL.RelDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalHLVL.g:147:3: (otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHLVL.g:148:4: otherlv_6= 'operations:' ( (lv_operations_7_0= ruleOperations ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getOperationsKeyword_6_0());
                    			
                    // InternalHLVL.g:152:4: ( (lv_operations_7_0= ruleOperations ) )
                    // InternalHLVL.g:153:5: (lv_operations_7_0= ruleOperations )
                    {
                    // InternalHLVL.g:153:5: (lv_operations_7_0= ruleOperations )
                    // InternalHLVL.g:154:6: lv_operations_7_0= ruleOperations
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
                    							"com.coffee.hlvl.HLVL.Operations");
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
    // InternalHLVL.g:176:1: entryRuleElmDeclaration returns [EObject current=null] : iv_ruleElmDeclaration= ruleElmDeclaration EOF ;
    public final EObject entryRuleElmDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElmDeclaration = null;


        try {
            // InternalHLVL.g:176:55: (iv_ruleElmDeclaration= ruleElmDeclaration EOF )
            // InternalHLVL.g:177:2: iv_ruleElmDeclaration= ruleElmDeclaration EOF
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
    // InternalHLVL.g:183:1: ruleElmDeclaration returns [EObject current=null] : ( ( (lv_att_0_0= 'att' ) )? ( ( (lv_inst_1_0= 'instantiable' ) ) otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_dataType_7_0= ruleDataType ) ) ( (lv_name_8_0= RULE_ID ) ) ( (lv_declaration_9_0= ruleDeclaration ) ) (otherlv_10= 'comment:' otherlv_11= '{' ( (lv_comment_12_0= RULE_STRING ) ) otherlv_13= '}' )? ) ;
    public final EObject ruleElmDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_att_0_0=null;
        Token lv_inst_1_0=null;
        Token otherlv_2=null;
        Token lv_min_3_0=null;
        Token otherlv_4=null;
        Token lv_max_5_0=null;
        Token otherlv_6=null;
        Token lv_name_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_comment_12_0=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_dataType_7_0 = null;

        EObject lv_declaration_9_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:189:2: ( ( ( (lv_att_0_0= 'att' ) )? ( ( (lv_inst_1_0= 'instantiable' ) ) otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_dataType_7_0= ruleDataType ) ) ( (lv_name_8_0= RULE_ID ) ) ( (lv_declaration_9_0= ruleDeclaration ) ) (otherlv_10= 'comment:' otherlv_11= '{' ( (lv_comment_12_0= RULE_STRING ) ) otherlv_13= '}' )? ) )
            // InternalHLVL.g:190:2: ( ( (lv_att_0_0= 'att' ) )? ( ( (lv_inst_1_0= 'instantiable' ) ) otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_dataType_7_0= ruleDataType ) ) ( (lv_name_8_0= RULE_ID ) ) ( (lv_declaration_9_0= ruleDeclaration ) ) (otherlv_10= 'comment:' otherlv_11= '{' ( (lv_comment_12_0= RULE_STRING ) ) otherlv_13= '}' )? )
            {
            // InternalHLVL.g:190:2: ( ( (lv_att_0_0= 'att' ) )? ( ( (lv_inst_1_0= 'instantiable' ) ) otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_dataType_7_0= ruleDataType ) ) ( (lv_name_8_0= RULE_ID ) ) ( (lv_declaration_9_0= ruleDeclaration ) ) (otherlv_10= 'comment:' otherlv_11= '{' ( (lv_comment_12_0= RULE_STRING ) ) otherlv_13= '}' )? )
            // InternalHLVL.g:191:3: ( (lv_att_0_0= 'att' ) )? ( ( (lv_inst_1_0= 'instantiable' ) ) otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_dataType_7_0= ruleDataType ) ) ( (lv_name_8_0= RULE_ID ) ) ( (lv_declaration_9_0= ruleDeclaration ) ) (otherlv_10= 'comment:' otherlv_11= '{' ( (lv_comment_12_0= RULE_STRING ) ) otherlv_13= '}' )?
            {
            // InternalHLVL.g:191:3: ( (lv_att_0_0= 'att' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHLVL.g:192:4: (lv_att_0_0= 'att' )
                    {
                    // InternalHLVL.g:192:4: (lv_att_0_0= 'att' )
                    // InternalHLVL.g:193:5: lv_att_0_0= 'att'
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

            // InternalHLVL.g:205:3: ( ( (lv_inst_1_0= 'instantiable' ) ) otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalHLVL.g:206:4: ( (lv_inst_1_0= 'instantiable' ) ) otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= ']'
                    {
                    // InternalHLVL.g:206:4: ( (lv_inst_1_0= 'instantiable' ) )
                    // InternalHLVL.g:207:5: (lv_inst_1_0= 'instantiable' )
                    {
                    // InternalHLVL.g:207:5: (lv_inst_1_0= 'instantiable' )
                    // InternalHLVL.g:208:6: lv_inst_1_0= 'instantiable'
                    {
                    lv_inst_1_0=(Token)match(input,16,FOLLOW_9); 

                    						newLeafNode(lv_inst_1_0, grammarAccess.getElmDeclarationAccess().getInstInstantiableKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "inst", lv_inst_1_0, "instantiable");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getElmDeclarationAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalHLVL.g:224:4: ( (lv_min_3_0= RULE_INT ) )
                    // InternalHLVL.g:225:5: (lv_min_3_0= RULE_INT )
                    {
                    // InternalHLVL.g:225:5: (lv_min_3_0= RULE_INT )
                    // InternalHLVL.g:226:6: lv_min_3_0= RULE_INT
                    {
                    lv_min_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_min_3_0, grammarAccess.getElmDeclarationAccess().getMinINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"min",
                    							lv_min_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getElmDeclarationAccess().getCommaKeyword_1_3());
                    			
                    // InternalHLVL.g:246:4: ( (lv_max_5_0= RULE_INT ) )
                    // InternalHLVL.g:247:5: (lv_max_5_0= RULE_INT )
                    {
                    // InternalHLVL.g:247:5: (lv_max_5_0= RULE_INT )
                    // InternalHLVL.g:248:6: lv_max_5_0= RULE_INT
                    {
                    lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_max_5_0, grammarAccess.getElmDeclarationAccess().getMaxINTTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max",
                    							lv_max_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getElmDeclarationAccess().getRightSquareBracketKeyword_1_5());
                    			

                    }
                    break;

            }

            // InternalHLVL.g:269:3: ( (lv_dataType_7_0= ruleDataType ) )
            // InternalHLVL.g:270:4: (lv_dataType_7_0= ruleDataType )
            {
            // InternalHLVL.g:270:4: (lv_dataType_7_0= ruleDataType )
            // InternalHLVL.g:271:5: lv_dataType_7_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getElmDeclarationAccess().getDataTypeDataTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_dataType_7_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElmDeclarationRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_7_0,
            						"com.coffee.hlvl.HLVL.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHLVL.g:288:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalHLVL.g:289:4: (lv_name_8_0= RULE_ID )
            {
            // InternalHLVL.g:289:4: (lv_name_8_0= RULE_ID )
            // InternalHLVL.g:290:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_8_0, grammarAccess.getElmDeclarationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElmDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_8_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalHLVL.g:306:3: ( (lv_declaration_9_0= ruleDeclaration ) )
            // InternalHLVL.g:307:4: (lv_declaration_9_0= ruleDeclaration )
            {
            // InternalHLVL.g:307:4: (lv_declaration_9_0= ruleDeclaration )
            // InternalHLVL.g:308:5: lv_declaration_9_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getElmDeclarationAccess().getDeclarationDeclarationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_declaration_9_0=ruleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElmDeclarationRule());
            					}
            					set(
            						current,
            						"declaration",
            						lv_declaration_9_0,
            						"com.coffee.hlvl.HLVL.Declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHLVL.g:325:3: (otherlv_10= 'comment:' otherlv_11= '{' ( (lv_comment_12_0= RULE_STRING ) ) otherlv_13= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHLVL.g:326:4: otherlv_10= 'comment:' otherlv_11= '{' ( (lv_comment_12_0= RULE_STRING ) ) otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getElmDeclarationAccess().getCommentKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getElmDeclarationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalHLVL.g:334:4: ( (lv_comment_12_0= RULE_STRING ) )
                    // InternalHLVL.g:335:5: (lv_comment_12_0= RULE_STRING )
                    {
                    // InternalHLVL.g:335:5: (lv_comment_12_0= RULE_STRING )
                    // InternalHLVL.g:336:6: lv_comment_12_0= RULE_STRING
                    {
                    lv_comment_12_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_comment_12_0, grammarAccess.getElmDeclarationAccess().getCommentSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getElmDeclarationAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // InternalHLVL.g:361:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalHLVL.g:361:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalHLVL.g:362:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalHLVL.g:368:1: ruleDeclaration returns [EObject current=null] : (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantDecl_0 = null;

        EObject this_VariableDecl_1 = null;



        	enterRule();

        try {
            // InternalHLVL.g:374:2: ( (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) )
            // InternalHLVL.g:375:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            {
            // InternalHLVL.g:375:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||LA7_0==13||(LA7_0>=15 && LA7_0<=16)||LA7_0==20||LA7_0==23||(LA7_0>=62 && LA7_0<=64)) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHLVL.g:376:3: this_ConstantDecl_0= ruleConstantDecl
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
                    // InternalHLVL.g:385:3: this_VariableDecl_1= ruleVariableDecl
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
    // InternalHLVL.g:397:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // InternalHLVL.g:397:53: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // InternalHLVL.g:398:2: iv_ruleConstantDecl= ruleConstantDecl EOF
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
    // InternalHLVL.g:404:1: ruleConstantDecl returns [EObject current=null] : ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:410:2: ( ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? ) )
            // InternalHLVL.g:411:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? )
            {
            // InternalHLVL.g:411:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )? )
            // InternalHLVL.g:412:3: () (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )?
            {
            // InternalHLVL.g:412:3: ()
            // InternalHLVL.g:413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantDeclAccess().getConstantDeclAction_0(),
            					current);
            			

            }

            // InternalHLVL.g:419:3: (otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHLVL.g:420:4: otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstantDeclAccess().getIsKeyword_1_0());
                    			
                    // InternalHLVL.g:424:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalHLVL.g:425:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalHLVL.g:425:5: (lv_value_2_0= ruleValue )
                    // InternalHLVL.g:426:6: lv_value_2_0= ruleValue
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
                    							"com.coffee.hlvl.HLVL.Value");
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
    // InternalHLVL.g:448:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalHLVL.g:448:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalHLVL.g:449:2: iv_ruleVariableDecl= ruleVariableDecl EOF
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
    // InternalHLVL.g:455:1: ruleVariableDecl returns [EObject current=null] : ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variants_2_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:461:2: ( ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) )
            // InternalHLVL.g:462:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            {
            // InternalHLVL.g:462:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            // InternalHLVL.g:463:3: () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            {
            // InternalHLVL.g:463:3: ()
            // InternalHLVL.g:464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableDeclAccess().getVariableDeclAction_0(),
            					current);
            			

            }

            // InternalHLVL.g:470:3: (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            // InternalHLVL.g:471:4: otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            {
            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            				newLeafNode(otherlv_1, grammarAccess.getVariableDeclAccess().getVariantsKeyword_1_0());
            			
            // InternalHLVL.g:475:4: ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            // InternalHLVL.g:476:5: (lv_variants_2_0= ruleOptionsDeclaration )
            {
            // InternalHLVL.g:476:5: (lv_variants_2_0= ruleOptionsDeclaration )
            // InternalHLVL.g:477:6: lv_variants_2_0= ruleOptionsDeclaration
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
            							"com.coffee.hlvl.HLVL.OptionsDeclaration");
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
    // InternalHLVL.g:499:1: entryRuleOptionsDeclaration returns [EObject current=null] : iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF ;
    public final EObject entryRuleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionsDeclaration = null;


        try {
            // InternalHLVL.g:499:59: (iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF )
            // InternalHLVL.g:500:2: iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF
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
    // InternalHLVL.g:506:1: ruleOptionsDeclaration returns [EObject current=null] : (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Interval_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalHLVL.g:512:2: ( (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) )
            // InternalHLVL.g:513:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            {
            // InternalHLVL.g:513:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHLVL.g:514:3: this_Interval_0= ruleInterval
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
                    // InternalHLVL.g:523:3: this_Enumeration_1= ruleEnumeration
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
    // InternalHLVL.g:535:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalHLVL.g:535:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalHLVL.g:536:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalHLVL.g:542:1: ruleInterval returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalHLVL.g:548:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalHLVL.g:549:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalHLVL.g:549:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalHLVL.g:550:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalHLVL.g:550:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalHLVL.g:551:4: (lv_start_0_0= RULE_INT )
            {
            // InternalHLVL.g:551:4: (lv_start_0_0= RULE_INT )
            // InternalHLVL.g:552:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
            		
            // InternalHLVL.g:572:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalHLVL.g:573:4: (lv_end_2_0= RULE_INT )
            {
            // InternalHLVL.g:573:4: (lv_end_2_0= RULE_INT )
            // InternalHLVL.g:574:5: lv_end_2_0= RULE_INT
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
    // InternalHLVL.g:594:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalHLVL.g:594:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalHLVL.g:595:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalHLVL.g:601:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:607:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalHLVL.g:608:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalHLVL.g:608:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalHLVL.g:609:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHLVL.g:613:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalHLVL.g:614:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalHLVL.g:614:4: (lv_list_1_0= ruleListOfValues )
            // InternalHLVL.g:615:5: lv_list_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_list_1_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_1_0,
            						"com.coffee.hlvl.HLVL.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

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
    // InternalHLVL.g:640:1: entryRuleRelDeclaration returns [EObject current=null] : iv_ruleRelDeclaration= ruleRelDeclaration EOF ;
    public final EObject entryRuleRelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelDeclaration = null;


        try {
            // InternalHLVL.g:640:55: (iv_ruleRelDeclaration= ruleRelDeclaration EOF )
            // InternalHLVL.g:641:2: iv_ruleRelDeclaration= ruleRelDeclaration EOF
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
    // InternalHLVL.g:647:1: ruleRelDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) ) ;
    public final EObject ruleRelDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:653:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) ) )
            // InternalHLVL.g:654:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) )
            {
            // InternalHLVL.g:654:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) ) )
            // InternalHLVL.g:655:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleRelation ) )
            {
            // InternalHLVL.g:655:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalHLVL.g:656:4: (lv_name_0_0= RULE_ID )
            {
            // InternalHLVL.g:656:4: (lv_name_0_0= RULE_ID )
            // InternalHLVL.g:657:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getRelDeclarationAccess().getColonKeyword_1());
            		
            // InternalHLVL.g:677:3: ( (lv_exp_2_0= ruleRelation ) )
            // InternalHLVL.g:678:4: (lv_exp_2_0= ruleRelation )
            {
            // InternalHLVL.g:678:4: (lv_exp_2_0= ruleRelation )
            // InternalHLVL.g:679:5: lv_exp_2_0= ruleRelation
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
            						"com.coffee.hlvl.HLVL.Relation");
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
    // InternalHLVL.g:700:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalHLVL.g:700:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalHLVL.g:701:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalHLVL.g:707:1: ruleRelation returns [EObject current=null] : (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies | this_ComplexMutex_10= ruleComplexMutex ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Common_0 = null;

        EObject this_Hierarchy_1 = null;

        EObject this_Pair_2 = null;

        EObject this_VarList_3 = null;

        EObject this_Order_4 = null;

        EObject this_MultInstantiation_5 = null;

        EObject this_Expression_6 = null;

        EObject this_Visibility_7 = null;

        EObject this_QImplies_8 = null;

        EObject this_ComplexImplies_9 = null;

        EObject this_ComplexMutex_10 = null;



        	enterRule();

        try {
            // InternalHLVL.g:713:2: ( (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies | this_ComplexMutex_10= ruleComplexMutex ) )
            // InternalHLVL.g:714:2: (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies | this_ComplexMutex_10= ruleComplexMutex )
            {
            // InternalHLVL.g:714:2: (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies | this_ComplexMutex_10= ruleComplexMutex )
            int alt10=11;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalHLVL.g:715:3: this_Common_0= ruleCommon
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
                    // InternalHLVL.g:724:3: this_Hierarchy_1= ruleHierarchy
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
                    // InternalHLVL.g:733:3: this_Pair_2= rulePair
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
                    // InternalHLVL.g:742:3: this_VarList_3= ruleVarList
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
                    // InternalHLVL.g:751:3: this_Order_4= ruleOrder
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
                    // InternalHLVL.g:760:3: this_MultInstantiation_5= ruleMultInstantiation
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
                    // InternalHLVL.g:769:3: this_Expression_6= ruleExpression
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
                    // InternalHLVL.g:778:3: this_Visibility_7= ruleVisibility
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
                    // InternalHLVL.g:787:3: this_QImplies_8= ruleQImplies
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
                    // InternalHLVL.g:796:3: this_ComplexImplies_9= ruleComplexImplies
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getComplexImpliesParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexImplies_9=ruleComplexImplies();

                    state._fsp--;


                    			current = this_ComplexImplies_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalHLVL.g:805:3: this_ComplexMutex_10= ruleComplexMutex
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getComplexMutexParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexMutex_10=ruleComplexMutex();

                    state._fsp--;


                    			current = this_ComplexMutex_10;
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
    // InternalHLVL.g:817:1: entryRuleCommon returns [EObject current=null] : iv_ruleCommon= ruleCommon EOF ;
    public final EObject entryRuleCommon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommon = null;


        try {
            // InternalHLVL.g:817:47: (iv_ruleCommon= ruleCommon EOF )
            // InternalHLVL.g:818:2: iv_ruleCommon= ruleCommon EOF
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
    // InternalHLVL.g:824:1: ruleCommon returns [EObject current=null] : ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' ) ;
    public final EObject ruleCommon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:830:2: ( ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' ) )
            // InternalHLVL.g:831:2: ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' )
            {
            // InternalHLVL.g:831:2: ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' )
            // InternalHLVL.g:832:3: () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')'
            {
            // InternalHLVL.g:832:3: ()
            // InternalHLVL.g:833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommonAccess().getCommonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonAccess().getCommonKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCommonAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHLVL.g:847:3: ( (lv_elements_3_0= ruleListOfIDs ) )
            // InternalHLVL.g:848:4: (lv_elements_3_0= ruleListOfIDs )
            {
            // InternalHLVL.g:848:4: (lv_elements_3_0= ruleListOfIDs )
            // InternalHLVL.g:849:5: lv_elements_3_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getCommonAccess().getElementsListOfIDsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_elements_3_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommonRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"com.coffee.hlvl.HLVL.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMultInstantiation"
    // InternalHLVL.g:874:1: entryRuleMultInstantiation returns [EObject current=null] : iv_ruleMultInstantiation= ruleMultInstantiation EOF ;
    public final EObject entryRuleMultInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultInstantiation = null;


        try {
            // InternalHLVL.g:874:58: (iv_ruleMultInstantiation= ruleMultInstantiation EOF )
            // InternalHLVL.g:875:2: iv_ruleMultInstantiation= ruleMultInstantiation EOF
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
    // InternalHLVL.g:881:1: ruleMultInstantiation returns [EObject current=null] : (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' ) ;
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
            // InternalHLVL.g:887:2: ( (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' ) )
            // InternalHLVL.g:888:2: (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' )
            {
            // InternalHLVL.g:888:2: (otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']' )
            // InternalHLVL.g:889:3: otherlv_0= 'instantiable' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_min_3_0= ruleNumber ) ) otherlv_4= ',' ( (lv_max_5_0= ruleNumber ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultInstantiationAccess().getInstantiableKeyword_0());
            		
            // InternalHLVL.g:893:3: ( (otherlv_1= RULE_ID ) )
            // InternalHLVL.g:894:4: (otherlv_1= RULE_ID )
            {
            // InternalHLVL.g:894:4: (otherlv_1= RULE_ID )
            // InternalHLVL.g:895:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultInstantiationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getMultInstantiationAccess().getNameElmDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMultInstantiationAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalHLVL.g:910:3: ( (lv_min_3_0= ruleNumber ) )
            // InternalHLVL.g:911:4: (lv_min_3_0= ruleNumber )
            {
            // InternalHLVL.g:911:4: (lv_min_3_0= ruleNumber )
            // InternalHLVL.g:912:5: lv_min_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMultInstantiationAccess().getMinNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_min_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultInstantiationRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_3_0,
            						"com.coffee.hlvl.HLVL.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getMultInstantiationAccess().getCommaKeyword_4());
            		
            // InternalHLVL.g:933:3: ( (lv_max_5_0= ruleNumber ) )
            // InternalHLVL.g:934:4: (lv_max_5_0= ruleNumber )
            {
            // InternalHLVL.g:934:4: (lv_max_5_0= ruleNumber )
            // InternalHLVL.g:935:5: lv_max_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMultInstantiationAccess().getMaxNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_max_5_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultInstantiationRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_5_0,
            						"com.coffee.hlvl.HLVL.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalHLVL.g:960:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalHLVL.g:960:45: (iv_rulePair= rulePair EOF )
            // InternalHLVL.g:961:2: iv_rulePair= rulePair EOF
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
    // InternalHLVL.g:967:1: rulePair returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
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
            // InternalHLVL.g:973:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalHLVL.g:974:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalHLVL.g:974:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalHLVL.g:975:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalHLVL.g:975:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHLVL.g:976:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHLVL.g:976:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHLVL.g:977:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHLVL.g:977:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==31) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalHLVL.g:978:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,30,FOLLOW_23); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getPairAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPairRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHLVL.g:989:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,31,FOLLOW_23); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHLVL.g:1006:3: ( (otherlv_2= RULE_ID ) )
            // InternalHLVL.g:1007:4: (otherlv_2= RULE_ID )
            {
            // InternalHLVL.g:1007:4: (otherlv_2= RULE_ID )
            // InternalHLVL.g:1008:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getPairAccess().getVar1ElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPairAccess().getCommaKeyword_3());
            		
            // InternalHLVL.g:1023:3: ( (otherlv_4= RULE_ID ) )
            // InternalHLVL.g:1024:4: (otherlv_4= RULE_ID )
            {
            // InternalHLVL.g:1024:4: (otherlv_4= RULE_ID )
            // InternalHLVL.g:1025:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_4, grammarAccess.getPairAccess().getVar2ElmDeclarationCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalHLVL.g:1044:1: entryRuleComplexImplies returns [EObject current=null] : iv_ruleComplexImplies= ruleComplexImplies EOF ;
    public final EObject entryRuleComplexImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexImplies = null;


        try {
            // InternalHLVL.g:1044:55: (iv_ruleComplexImplies= ruleComplexImplies EOF )
            // InternalHLVL.g:1045:2: iv_ruleComplexImplies= ruleComplexImplies EOF
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
    // InternalHLVL.g:1051:1: ruleComplexImplies returns [EObject current=null] : (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) ;
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
            // InternalHLVL.g:1057:2: ( (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) )
            // InternalHLVL.g:1058:2: (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalHLVL.g:1058:2: (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            // InternalHLVL.g:1059:3: otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexImpliesAccess().getImpliesKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHLVL.g:1071:3: ( (lv_exp_3_0= ruleRelational ) )
            // InternalHLVL.g:1072:4: (lv_exp_3_0= ruleRelational )
            {
            // InternalHLVL.g:1072:4: (lv_exp_3_0= ruleRelational )
            // InternalHLVL.g:1073:5: lv_exp_3_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getComplexImpliesAccess().getExpRelationalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_exp_3_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexImpliesRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"com.coffee.hlvl.HLVL.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexImpliesAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexImpliesAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexImpliesAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalHLVL.g:1102:3: ( (lv_elements_7_0= ruleListOfIDs ) )
            // InternalHLVL.g:1103:4: (lv_elements_7_0= ruleListOfIDs )
            {
            // InternalHLVL.g:1103:4: (lv_elements_7_0= ruleListOfIDs )
            // InternalHLVL.g:1104:5: lv_elements_7_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getComplexImpliesAccess().getElementsListOfIDsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_elements_7_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexImpliesRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_7_0,
            						"com.coffee.hlvl.HLVL.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexImpliesAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,29,FOLLOW_2); 

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
    // InternalHLVL.g:1133:1: entryRuleComplexMutex returns [EObject current=null] : iv_ruleComplexMutex= ruleComplexMutex EOF ;
    public final EObject entryRuleComplexMutex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexMutex = null;


        try {
            // InternalHLVL.g:1133:53: (iv_ruleComplexMutex= ruleComplexMutex EOF )
            // InternalHLVL.g:1134:2: iv_ruleComplexMutex= ruleComplexMutex EOF
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
    // InternalHLVL.g:1140:1: ruleComplexMutex returns [EObject current=null] : (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) ;
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
            // InternalHLVL.g:1146:2: ( (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) )
            // InternalHLVL.g:1147:2: (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalHLVL.g:1147:2: (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            // InternalHLVL.g:1148:3: otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexMutexAccess().getMutexKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexMutexAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexMutexAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHLVL.g:1160:3: ( (lv_exp_3_0= ruleRelational ) )
            // InternalHLVL.g:1161:4: (lv_exp_3_0= ruleRelational )
            {
            // InternalHLVL.g:1161:4: (lv_exp_3_0= ruleRelational )
            // InternalHLVL.g:1162:5: lv_exp_3_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getComplexMutexAccess().getExpRelationalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_exp_3_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexMutexRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"com.coffee.hlvl.HLVL.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexMutexAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexMutexAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexMutexAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalHLVL.g:1191:3: ( (lv_elements_7_0= ruleListOfIDs ) )
            // InternalHLVL.g:1192:4: (lv_elements_7_0= ruleListOfIDs )
            {
            // InternalHLVL.g:1192:4: (lv_elements_7_0= ruleListOfIDs )
            // InternalHLVL.g:1193:5: lv_elements_7_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getComplexMutexAccess().getElementsListOfIDsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_elements_7_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexMutexRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_7_0,
            						"com.coffee.hlvl.HLVL.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexMutexAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "entryRuleQImplies"
    // InternalHLVL.g:1222:1: entryRuleQImplies returns [EObject current=null] : iv_ruleQImplies= ruleQImplies EOF ;
    public final EObject entryRuleQImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQImplies = null;


        try {
            // InternalHLVL.g:1222:49: (iv_ruleQImplies= ruleQImplies EOF )
            // InternalHLVL.g:1223:2: iv_ruleQImplies= ruleQImplies EOF
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
    // InternalHLVL.g:1229:1: ruleQImplies returns [EObject current=null] : (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) ) ) ;
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
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalHLVL.g:1235:2: ( (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) ) ) )
            // InternalHLVL.g:1236:2: (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) ) )
            {
            // InternalHLVL.g:1236:2: (otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) ) )
            // InternalHLVL.g:1237:3: otherlv_0= '[' ( (lv_mina_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_maxa_3_0= RULE_INT ) ) otherlv_4= ']' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'implies' otherlv_7= '[' ( (lv_minb_8_0= RULE_INT ) ) otherlv_9= ',' ( (lv_maxb_10_0= RULE_INT ) ) otherlv_11= ']' ( (otherlv_12= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getQImpliesAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHLVL.g:1241:3: ( (lv_mina_1_0= RULE_INT ) )
            // InternalHLVL.g:1242:4: (lv_mina_1_0= RULE_INT )
            {
            // InternalHLVL.g:1242:4: (lv_mina_1_0= RULE_INT )
            // InternalHLVL.g:1243:5: lv_mina_1_0= RULE_INT
            {
            lv_mina_1_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getQImpliesAccess().getCommaKeyword_2());
            		
            // InternalHLVL.g:1263:3: ( (lv_maxa_3_0= RULE_INT ) )
            // InternalHLVL.g:1264:4: (lv_maxa_3_0= RULE_INT )
            {
            // InternalHLVL.g:1264:4: (lv_maxa_3_0= RULE_INT )
            // InternalHLVL.g:1265:5: lv_maxa_3_0= RULE_INT
            {
            lv_maxa_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getQImpliesAccess().getRightSquareBracketKeyword_4());
            		
            // InternalHLVL.g:1285:3: ( (otherlv_5= RULE_ID ) )
            // InternalHLVL.g:1286:4: (otherlv_5= RULE_ID )
            {
            // InternalHLVL.g:1286:4: (otherlv_5= RULE_ID )
            // InternalHLVL.g:1287:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQImpliesRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_5, grammarAccess.getQImpliesAccess().getVar1ElmDeclarationCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getQImpliesAccess().getImpliesKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getQImpliesAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalHLVL.g:1306:3: ( (lv_minb_8_0= RULE_INT ) )
            // InternalHLVL.g:1307:4: (lv_minb_8_0= RULE_INT )
            {
            // InternalHLVL.g:1307:4: (lv_minb_8_0= RULE_INT )
            // InternalHLVL.g:1308:5: lv_minb_8_0= RULE_INT
            {
            lv_minb_8_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_9=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getQImpliesAccess().getCommaKeyword_9());
            		
            // InternalHLVL.g:1328:3: ( (lv_maxb_10_0= RULE_INT ) )
            // InternalHLVL.g:1329:4: (lv_maxb_10_0= RULE_INT )
            {
            // InternalHLVL.g:1329:4: (lv_maxb_10_0= RULE_INT )
            // InternalHLVL.g:1330:5: lv_maxb_10_0= RULE_INT
            {
            lv_maxb_10_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            otherlv_11=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getQImpliesAccess().getRightSquareBracketKeyword_11());
            		
            // InternalHLVL.g:1350:3: ( (otherlv_12= RULE_ID ) )
            // InternalHLVL.g:1351:4: (otherlv_12= RULE_ID )
            {
            // InternalHLVL.g:1351:4: (otherlv_12= RULE_ID )
            // InternalHLVL.g:1352:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQImpliesRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_12, grammarAccess.getQImpliesAccess().getVar2ElmDeclarationCrossReference_12_0());
            				

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
    // $ANTLR end "ruleQImplies"


    // $ANTLR start "entryRuleVarList"
    // InternalHLVL.g:1367:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalHLVL.g:1367:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalHLVL.g:1368:2: iv_ruleVarList= ruleVarList EOF
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
    // InternalHLVL.g:1374:1: ruleVarList returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
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
            // InternalHLVL.g:1380:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHLVL.g:1381:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHLVL.g:1381:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHLVL.g:1382:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            // InternalHLVL.g:1382:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHLVL.g:1383:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHLVL.g:1383:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHLVL.g:1384:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHLVL.g:1384:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalHLVL.g:1385:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,30,FOLLOW_23); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getVarListAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarListRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHLVL.g:1396:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,31,FOLLOW_23); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHLVL.g:1413:3: ( (otherlv_2= RULE_ID ) )
            // InternalHLVL.g:1414:4: (otherlv_2= RULE_ID )
            {
            // InternalHLVL.g:1414:4: (otherlv_2= RULE_ID )
            // InternalHLVL.g:1415:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarListRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getVarListAccess().getVar1ElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getVarListAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVarListAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHLVL.g:1434:3: ( (lv_list_5_0= ruleListOfIDs ) )
            // InternalHLVL.g:1435:4: (lv_list_5_0= ruleListOfIDs )
            {
            // InternalHLVL.g:1435:4: (lv_list_5_0= ruleListOfIDs )
            // InternalHLVL.g:1436:5: lv_list_5_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getListListOfIDsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_list_5_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarListRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_5_0,
            						"com.coffee.hlvl.HLVL.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getVarListAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalHLVL.g:1465:1: entryRuleHierarchy returns [EObject current=null] : iv_ruleHierarchy= ruleHierarchy EOF ;
    public final EObject entryRuleHierarchy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHierarchy = null;


        try {
            // InternalHLVL.g:1465:50: (iv_ruleHierarchy= ruleHierarchy EOF )
            // InternalHLVL.g:1466:2: iv_ruleHierarchy= ruleHierarchy EOF
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
    // InternalHLVL.g:1472:1: ruleHierarchy returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup ) ;
    public final EObject ruleHierarchy() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalHLVL.g:1478:2: ( (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup ) )
            // InternalHLVL.g:1479:2: (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup )
            {
            // InternalHLVL.g:1479:2: (this_Decomposition_0= ruleDecomposition | this_Group_1= ruleGroup )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalHLVL.g:1480:3: this_Decomposition_0= ruleDecomposition
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
                    // InternalHLVL.g:1489:3: this_Group_1= ruleGroup
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
    // InternalHLVL.g:1501:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // InternalHLVL.g:1501:54: (iv_ruleDecomposition= ruleDecomposition EOF )
            // InternalHLVL.g:1502:2: iv_ruleDecomposition= ruleDecomposition EOF
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
    // InternalHLVL.g:1508:1: ruleDecomposition returns [EObject current=null] : ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>' ) ;
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
            // InternalHLVL.g:1514:2: ( ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>' ) )
            // InternalHLVL.g:1515:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>' )
            {
            // InternalHLVL.g:1515:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>' )
            // InternalHLVL.g:1516:3: () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '<' ( (lv_cardinality_10_0= RULE_INT ) ) otherlv_11= '>'
            {
            // InternalHLVL.g:1516:3: ()
            // InternalHLVL.g:1517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecompositionAccess().getDecompositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecompositionKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHLVL.g:1531:3: ( (otherlv_3= RULE_ID ) )
            // InternalHLVL.g:1532:4: (otherlv_3= RULE_ID )
            {
            // InternalHLVL.g:1532:4: (otherlv_3= RULE_ID )
            // InternalHLVL.g:1533:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDecompositionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHLVL.g:1552:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHLVL.g:1553:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHLVL.g:1553:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHLVL.g:1554:5: lv_children_6_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getDecompositionAccess().getChildrenListOfIDsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_children_6_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecompositionRule());
            					}
            					set(
            						current,
            						"children",
            						lv_children_6_0,
            						"com.coffee.hlvl.HLVL.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getDecompositionAccess().getLessThanSignKeyword_9());
            		
            // InternalHLVL.g:1583:3: ( (lv_cardinality_10_0= RULE_INT ) )
            // InternalHLVL.g:1584:4: (lv_cardinality_10_0= RULE_INT )
            {
            // InternalHLVL.g:1584:4: (lv_cardinality_10_0= RULE_INT )
            // InternalHLVL.g:1585:5: lv_cardinality_10_0= RULE_INT
            {
            lv_cardinality_10_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_11=(Token)match(input,34,FOLLOW_2); 

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
    // InternalHLVL.g:1609:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalHLVL.g:1609:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalHLVL.g:1610:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalHLVL.g:1616:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' ) ;
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
            // InternalHLVL.g:1622:2: ( ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' ) )
            // InternalHLVL.g:1623:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' )
            {
            // InternalHLVL.g:1623:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' )
            // InternalHLVL.g:1624:3: () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ')' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']'
            {
            // InternalHLVL.g:1624:3: ()
            // InternalHLVL.g:1625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHLVL.g:1639:3: ( (otherlv_3= RULE_ID ) )
            // InternalHLVL.g:1640:4: (otherlv_3= RULE_ID )
            {
            // InternalHLVL.g:1640:4: (otherlv_3= RULE_ID )
            // InternalHLVL.g:1641:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHLVL.g:1660:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHLVL.g:1661:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHLVL.g:1661:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHLVL.g:1662:5: lv_children_6_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getChildrenListOfIDsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_children_6_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"children",
            						lv_children_6_0,
            						"com.coffee.hlvl.HLVL.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalHLVL.g:1691:3: ( (lv_min_10_0= RULE_INT ) )
            // InternalHLVL.g:1692:4: (lv_min_10_0= RULE_INT )
            {
            // InternalHLVL.g:1692:4: (lv_min_10_0= RULE_INT )
            // InternalHLVL.g:1693:5: lv_min_10_0= RULE_INT
            {
            lv_min_10_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_11=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getCommaKeyword_11());
            		
            // InternalHLVL.g:1713:3: ( (lv_max_12_0= ruleRange ) )
            // InternalHLVL.g:1714:4: (lv_max_12_0= ruleRange )
            {
            // InternalHLVL.g:1714:4: (lv_max_12_0= ruleRange )
            // InternalHLVL.g:1715:5: lv_max_12_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getMaxRangeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_12);
            lv_max_12_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_12_0,
            						"com.coffee.hlvl.HLVL.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

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
    // InternalHLVL.g:1740:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalHLVL.g:1740:46: (iv_ruleRange= ruleRange EOF )
            // InternalHLVL.g:1741:2: iv_ruleRange= ruleRange EOF
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
    // InternalHLVL.g:1747:1: ruleRange returns [EObject current=null] : ( () ( (lv_value_1_0= rulewildcard ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:1753:2: ( ( () ( (lv_value_1_0= rulewildcard ) ) ) )
            // InternalHLVL.g:1754:2: ( () ( (lv_value_1_0= rulewildcard ) ) )
            {
            // InternalHLVL.g:1754:2: ( () ( (lv_value_1_0= rulewildcard ) ) )
            // InternalHLVL.g:1755:3: () ( (lv_value_1_0= rulewildcard ) )
            {
            // InternalHLVL.g:1755:3: ()
            // InternalHLVL.g:1756:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeAccess().getRangeAction_0(),
            					current);
            			

            }

            // InternalHLVL.g:1762:3: ( (lv_value_1_0= rulewildcard ) )
            // InternalHLVL.g:1763:4: (lv_value_1_0= rulewildcard )
            {
            // InternalHLVL.g:1763:4: (lv_value_1_0= rulewildcard )
            // InternalHLVL.g:1764:5: lv_value_1_0= rulewildcard
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
            						"com.coffee.hlvl.HLVL.wildcard");
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
    // InternalHLVL.g:1785:1: entryRulewildcard returns [String current=null] : iv_rulewildcard= rulewildcard EOF ;
    public final String entryRulewildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewildcard = null;


        try {
            // InternalHLVL.g:1785:48: (iv_rulewildcard= rulewildcard EOF )
            // InternalHLVL.g:1786:2: iv_rulewildcard= rulewildcard EOF
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
    // InternalHLVL.g:1792:1: rulewildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken rulewildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalHLVL.g:1798:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalHLVL.g:1799:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalHLVL.g:1799:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
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
                    // InternalHLVL.g:1800:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getWildcardAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLVL.g:1808:3: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalHLVL.g:1817:1: entryRuleVisibility returns [EObject current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final EObject entryRuleVisibility() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibility = null;


        try {
            // InternalHLVL.g:1817:51: (iv_ruleVisibility= ruleVisibility EOF )
            // InternalHLVL.g:1818:2: iv_ruleVisibility= ruleVisibility EOF
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
    // InternalHLVL.g:1824:1: ruleVisibility returns [EObject current=null] : (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
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
            // InternalHLVL.g:1830:2: ( (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHLVL.g:1831:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHLVL.g:1831:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHLVL.g:1832:3: otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfRelRefs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibilityAccess().getVisibilityKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getVisibilityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHLVL.g:1840:3: ( (lv_condition_2_0= ruleRelational ) )
            // InternalHLVL.g:1841:4: (lv_condition_2_0= ruleRelational )
            {
            // InternalHLVL.g:1841:4: (lv_condition_2_0= ruleRelational )
            // InternalHLVL.g:1842:5: lv_condition_2_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getConditionRelationalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_2_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"com.coffee.hlvl.HLVL.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getVisibilityAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVisibilityAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHLVL.g:1867:3: ( (lv_list_5_0= ruleListOfRelRefs ) )
            // InternalHLVL.g:1868:4: (lv_list_5_0= ruleListOfRelRefs )
            {
            // InternalHLVL.g:1868:4: (lv_list_5_0= ruleListOfRelRefs )
            // InternalHLVL.g:1869:5: lv_list_5_0= ruleListOfRelRefs
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getListListOfRelRefsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_list_5_0=ruleListOfRelRefs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_5_0,
            						"com.coffee.hlvl.HLVL.ListOfRelRefs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getVisibilityAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalHLVL.g:1898:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalHLVL.g:1898:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalHLVL.g:1899:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalHLVL.g:1905:1: ruleOrder returns [EObject current=null] : ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) ;
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
            // InternalHLVL.g:1911:2: ( ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) )
            // InternalHLVL.g:1912:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            {
            // InternalHLVL.g:1912:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            else if ( (LA15_0==39) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalHLVL.g:1913:3: ( (lv_operator_0_0= 'before' ) )
                    {
                    // InternalHLVL.g:1913:3: ( (lv_operator_0_0= 'before' ) )
                    // InternalHLVL.g:1914:4: (lv_operator_0_0= 'before' )
                    {
                    // InternalHLVL.g:1914:4: (lv_operator_0_0= 'before' )
                    // InternalHLVL.g:1915:5: lv_operator_0_0= 'before'
                    {
                    lv_operator_0_0=(Token)match(input,38,FOLLOW_2); 

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
                    // InternalHLVL.g:1928:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    {
                    // InternalHLVL.g:1928:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    // InternalHLVL.g:1929:4: otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getAfterKeyword_1_0());
                    			
                    // InternalHLVL.g:1933:4: ( (otherlv_2= RULE_ID ) )
                    // InternalHLVL.g:1934:5: (otherlv_2= RULE_ID )
                    {
                    // InternalHLVL.g:1934:5: (otherlv_2= RULE_ID )
                    // InternalHLVL.g:1935:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getLeftElmDeclarationCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrderAccess().getCommaKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getLeftSquareBracketKeyword_1_3());
                    			
                    // InternalHLVL.g:1954:4: ( (lv_right_5_0= ruleListOfIDs ) )
                    // InternalHLVL.g:1955:5: (lv_right_5_0= ruleListOfIDs )
                    {
                    // InternalHLVL.g:1955:5: (lv_right_5_0= ruleListOfIDs )
                    // InternalHLVL.g:1956:6: lv_right_5_0= ruleListOfIDs
                    {

                    						newCompositeNode(grammarAccess.getOrderAccess().getRightListOfIDsParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_right_5_0=ruleListOfIDs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderRule());
                    						}
                    						add(
                    							current,
                    							"right",
                    							lv_right_5_0,
                    							"com.coffee.hlvl.HLVL.ListOfIDs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalHLVL.g:1982:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHLVL.g:1982:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHLVL.g:1983:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalHLVL.g:1989:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:1995:2: ( (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) )
            // InternalHLVL.g:1996:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            {
            // InternalHLVL.g:1996:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            // InternalHLVL.g:1997:3: otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHLVL.g:2005:3: ( (lv_exp_2_0= ruleRelational ) )
            // InternalHLVL.g:2006:4: (lv_exp_2_0= ruleRelational )
            {
            // InternalHLVL.g:2006:4: (lv_exp_2_0= ruleRelational )
            // InternalHLVL.g:2007:5: lv_exp_2_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpRelationalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_exp_2_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"com.coffee.hlvl.HLVL.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalHLVL.g:2032:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalHLVL.g:2032:51: (iv_ruleRelational= ruleRelational EOF )
            // InternalHLVL.g:2033:2: iv_ruleRelational= ruleRelational EOF
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
    // InternalHLVL.g:2039:1: ruleRelational returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:2045:2: (this_Iff_0= ruleIff )
            // InternalHLVL.g:2046:2: this_Iff_0= ruleIff
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
    // InternalHLVL.g:2057:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // InternalHLVL.g:2057:44: (iv_ruleIff= ruleIff EOF )
            // InternalHLVL.g:2058:2: iv_ruleIff= ruleIff EOF
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
    // InternalHLVL.g:2064:1: ruleIff returns [EObject current=null] : (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implies_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:2070:2: ( (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) )
            // InternalHLVL.g:2071:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            {
            // InternalHLVL.g:2071:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            // InternalHLVL.g:2072:3: this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            {

            			newCompositeNode(grammarAccess.getIffAccess().getImpliesParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Implies_0=ruleImplies();

            state._fsp--;


            			current = this_Implies_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHLVL.g:2080:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHLVL.g:2081:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) )
            	    {
            	    // InternalHLVL.g:2081:4: ()
            	    // InternalHLVL.g:2082:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getIffAccess().getIffLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHLVL.g:2092:4: ( (lv_right_3_0= ruleImplies ) )
            	    // InternalHLVL.g:2093:5: (lv_right_3_0= ruleImplies )
            	    {
            	    // InternalHLVL.g:2093:5: (lv_right_3_0= ruleImplies )
            	    // InternalHLVL.g:2094:6: lv_right_3_0= ruleImplies
            	    {

            	    						newCompositeNode(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleImplies();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIffRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.hlvl.HLVL.Implies");
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
    // $ANTLR end "ruleIff"


    // $ANTLR start "entryRuleImplies"
    // InternalHLVL.g:2116:1: entryRuleImplies returns [EObject current=null] : iv_ruleImplies= ruleImplies EOF ;
    public final EObject entryRuleImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplies = null;


        try {
            // InternalHLVL.g:2116:48: (iv_ruleImplies= ruleImplies EOF )
            // InternalHLVL.g:2117:2: iv_ruleImplies= ruleImplies EOF
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
    // InternalHLVL.g:2123:1: ruleImplies returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:2129:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalHLVL.g:2130:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalHLVL.g:2130:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalHLVL.g:2131:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHLVL.g:2139:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==42) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHLVL.g:2140:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalHLVL.g:2140:4: ()
            	    // InternalHLVL.g:2141:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImpliesAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHLVL.g:2151:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalHLVL.g:2152:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalHLVL.g:2152:5: (lv_right_3_0= ruleOr )
            	    // InternalHLVL.g:2153:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImpliesRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.hlvl.HLVL.Or");
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
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalHLVL.g:2175:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalHLVL.g:2175:43: (iv_ruleOr= ruleOr EOF )
            // InternalHLVL.g:2176:2: iv_ruleOr= ruleOr EOF
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
    // InternalHLVL.g:2182:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:2188:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalHLVL.g:2189:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalHLVL.g:2189:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalHLVL.g:2190:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHLVL.g:2198:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==43) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHLVL.g:2199:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalHLVL.g:2199:4: ()
            	    // InternalHLVL.g:2200:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalHLVL.g:2210:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalHLVL.g:2211:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalHLVL.g:2211:5: (lv_right_3_0= ruleAnd )
            	    // InternalHLVL.g:2212:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.hlvl.HLVL.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalHLVL.g:2234:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalHLVL.g:2234:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalHLVL.g:2235:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalHLVL.g:2241:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:2247:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalHLVL.g:2248:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalHLVL.g:2248:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalHLVL.g:2249:3: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHLVL.g:2257:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalHLVL.g:2258:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalHLVL.g:2258:4: ()
            	    // InternalHLVL.g:2259:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalHLVL.g:2269:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalHLVL.g:2270:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalHLVL.g:2270:5: (lv_right_3_0= ruleEquality )
            	    // InternalHLVL.g:2271:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.hlvl.HLVL.Equality");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalHLVL.g:2293:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalHLVL.g:2293:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalHLVL.g:2294:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalHLVL.g:2300:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:2306:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalHLVL.g:2307:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalHLVL.g:2307:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalHLVL.g:2308:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHLVL.g:2316:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=45 && LA21_0<=46)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalHLVL.g:2317:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalHLVL.g:2317:4: ()
            	    // InternalHLVL.g:2318:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHLVL.g:2324:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) )
            	    // InternalHLVL.g:2325:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalHLVL.g:2325:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    // InternalHLVL.g:2326:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    {
            	    // InternalHLVL.g:2326:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==45) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==46) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalHLVL.g:2327:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,45,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHLVL.g:2338:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,46,FOLLOW_25); 

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

            	    // InternalHLVL.g:2351:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalHLVL.g:2352:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalHLVL.g:2352:5: (lv_right_3_0= ruleComparison )
            	    // InternalHLVL.g:2353:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.hlvl.HLVL.Comparison");
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalHLVL.g:2375:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalHLVL.g:2375:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalHLVL.g:2376:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalHLVL.g:2382:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalHLVL.g:2388:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalHLVL.g:2389:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalHLVL.g:2389:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalHLVL.g:2390:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHLVL.g:2398:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=33 && LA23_0<=34)||(LA23_0>=47 && LA23_0<=48)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalHLVL.g:2399:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalHLVL.g:2399:4: ()
            	    // InternalHLVL.g:2400:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHLVL.g:2406:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalHLVL.g:2407:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalHLVL.g:2407:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalHLVL.g:2408:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalHLVL.g:2408:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt22=4;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalHLVL.g:2409:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,47,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHLVL.g:2420:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,48,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHLVL.g:2431:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,34,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalHLVL.g:2442:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,33,FOLLOW_25); 

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

            	    // InternalHLVL.g:2455:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalHLVL.g:2456:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalHLVL.g:2456:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalHLVL.g:2457:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.hlvl.HLVL.PlusOrMinus");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalHLVL.g:2479:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalHLVL.g:2479:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalHLVL.g:2480:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalHLVL.g:2486:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:2492:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalHLVL.g:2493:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalHLVL.g:2493:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalHLVL.g:2494:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHLVL.g:2502:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=49 && LA25_0<=50)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalHLVL.g:2503:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalHLVL.g:2503:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==49) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==50) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalHLVL.g:2504:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalHLVL.g:2504:5: ( () otherlv_2= '+' )
            	            // InternalHLVL.g:2505:6: () otherlv_2= '+'
            	            {
            	            // InternalHLVL.g:2505:6: ()
            	            // InternalHLVL.g:2506:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,49,FOLLOW_25); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalHLVL.g:2518:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalHLVL.g:2518:5: ( () otherlv_4= '-' )
            	            // InternalHLVL.g:2519:6: () otherlv_4= '-'
            	            {
            	            // InternalHLVL.g:2519:6: ()
            	            // InternalHLVL.g:2520:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,50,FOLLOW_25); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalHLVL.g:2532:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalHLVL.g:2533:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalHLVL.g:2533:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalHLVL.g:2534:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.coffee.hlvl.HLVL.MulOrDiv");
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalHLVL.g:2556:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalHLVL.g:2556:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalHLVL.g:2557:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalHLVL.g:2563:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:2569:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalHLVL.g:2570:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalHLVL.g:2570:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalHLVL.g:2571:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHLVL.g:2579:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36||(LA27_0>=51 && LA27_0<=52)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalHLVL.g:2580:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalHLVL.g:2580:4: ()
            	    // InternalHLVL.g:2581:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHLVL.g:2587:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
            	    // InternalHLVL.g:2588:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    {
            	    // InternalHLVL.g:2588:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    // InternalHLVL.g:2589:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    {
            	    // InternalHLVL.g:2589:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalHLVL.g:2590:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHLVL.g:2601:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,51,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHLVL.g:2612:7: lv_op_2_3= 'mod'
            	            {
            	            lv_op_2_3=(Token)match(input,52,FOLLOW_25); 

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

            	    // InternalHLVL.g:2625:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalHLVL.g:2626:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalHLVL.g:2626:5: (lv_right_3_0= rulePrimary )
            	    // InternalHLVL.g:2627:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.hlvl.HLVL.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalHLVL.g:2649:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalHLVL.g:2649:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalHLVL.g:2650:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalHLVL.g:2656:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic ) ;
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
            // InternalHLVL.g:2662:2: ( ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic ) )
            // InternalHLVL.g:2663:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic )
            {
            // InternalHLVL.g:2663:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' ) | ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' ) | this_Atomic_18= ruleAtomic )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt28=1;
                }
                break;
            case 53:
                {
                alt28=2;
                }
                break;
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt28=3;
                }
                break;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt28=4;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 54:
            case 55:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalHLVL.g:2664:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    {
                    // InternalHLVL.g:2664:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    // InternalHLVL.g:2665:4: otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getRelationalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_24);
                    this_Relational_1=ruleRelational();

                    state._fsp--;


                    				current = this_Relational_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHLVL.g:2683:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalHLVL.g:2683:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalHLVL.g:2684:4: () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalHLVL.g:2684:4: ()
                    // InternalHLVL.g:2685:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNegationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getTildeKeyword_1_1());
                    			
                    // InternalHLVL.g:2695:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalHLVL.g:2696:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalHLVL.g:2696:5: (lv_expression_5_0= rulePrimary )
                    // InternalHLVL.g:2697:6: lv_expression_5_0= rulePrimary
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
                    							"com.coffee.hlvl.HLVL.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHLVL.g:2716:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' )
                    {
                    // InternalHLVL.g:2716:3: ( () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')' )
                    // InternalHLVL.g:2717:4: () ( (lv_op_7_0= ruleUnaryOp ) ) otherlv_8= '(' ( (lv_expression_9_0= rulePrimary ) ) otherlv_10= ')'
                    {
                    // InternalHLVL.g:2717:4: ()
                    // InternalHLVL.g:2718:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUnaryAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHLVL.g:2724:4: ( (lv_op_7_0= ruleUnaryOp ) )
                    // InternalHLVL.g:2725:5: (lv_op_7_0= ruleUnaryOp )
                    {
                    // InternalHLVL.g:2725:5: (lv_op_7_0= ruleUnaryOp )
                    // InternalHLVL.g:2726:6: lv_op_7_0= ruleUnaryOp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getOpUnaryOpParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_op_7_0=ruleUnaryOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_7_0,
                    							"com.coffee.hlvl.HLVL.UnaryOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalHLVL.g:2747:4: ( (lv_expression_9_0= rulePrimary ) )
                    // InternalHLVL.g:2748:5: (lv_expression_9_0= rulePrimary )
                    {
                    // InternalHLVL.g:2748:5: (lv_expression_9_0= rulePrimary )
                    // InternalHLVL.g:2749:6: lv_expression_9_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_expression_9_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_9_0,
                    							"com.coffee.hlvl.HLVL.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHLVL.g:2772:3: ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' )
                    {
                    // InternalHLVL.g:2772:3: ( () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')' )
                    // InternalHLVL.g:2773:4: () ( (lv_op_12_0= ruleFunctionOp ) ) otherlv_13= '(' ( (lv_left_14_0= rulePrimary ) ) otherlv_15= ',' ( (lv_right_16_0= rulePrimary ) ) otherlv_17= ')'
                    {
                    // InternalHLVL.g:2773:4: ()
                    // InternalHLVL.g:2774:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getFunctionAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHLVL.g:2780:4: ( (lv_op_12_0= ruleFunctionOp ) )
                    // InternalHLVL.g:2781:5: (lv_op_12_0= ruleFunctionOp )
                    {
                    // InternalHLVL.g:2781:5: (lv_op_12_0= ruleFunctionOp )
                    // InternalHLVL.g:2782:6: lv_op_12_0= ruleFunctionOp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getOpFunctionOpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_op_12_0=ruleFunctionOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_12_0,
                    							"com.coffee.hlvl.HLVL.FunctionOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalHLVL.g:2803:4: ( (lv_left_14_0= rulePrimary ) )
                    // InternalHLVL.g:2804:5: (lv_left_14_0= rulePrimary )
                    {
                    // InternalHLVL.g:2804:5: (lv_left_14_0= rulePrimary )
                    // InternalHLVL.g:2805:6: lv_left_14_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_left_14_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_14_0,
                    							"com.coffee.hlvl.HLVL.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,18,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getCommaKeyword_3_4());
                    			
                    // InternalHLVL.g:2826:4: ( (lv_right_16_0= rulePrimary ) )
                    // InternalHLVL.g:2827:5: (lv_right_16_0= rulePrimary )
                    {
                    // InternalHLVL.g:2827:5: (lv_right_16_0= rulePrimary )
                    // InternalHLVL.g:2828:6: lv_right_16_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getRightPrimaryParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_right_16_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_16_0,
                    							"com.coffee.hlvl.HLVL.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_6());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHLVL.g:2851:3: this_Atomic_18= ruleAtomic
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
    // InternalHLVL.g:2863:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalHLVL.g:2863:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalHLVL.g:2864:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalHLVL.g:2870:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) ) ;
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
            // InternalHLVL.g:2876:2: ( ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) ) )
            // InternalHLVL.g:2877:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) )
            {
            // InternalHLVL.g:2877:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt30=4;
                    }
                    break;
                case 56:
                    {
                    alt30=3;
                    }
                    break;
                case EOF:
                case 18:
                case 29:
                case 33:
                case 34:
                case 36:
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
                case 52:
                    {
                    alt30=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt30=5;
                }
                break;
            case RULE_INT:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalHLVL.g:2878:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    {
                    // InternalHLVL.g:2878:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    // InternalHLVL.g:2879:4: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    {
                    // InternalHLVL.g:2879:4: ()
                    // InternalHLVL.g:2880:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHLVL.g:2886:4: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    // InternalHLVL.g:2887:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    {
                    // InternalHLVL.g:2887:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    // InternalHLVL.g:2888:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    {
                    // InternalHLVL.g:2888:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==54) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==55) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalHLVL.g:2889:7: lv_value_1_1= 'true'
                            {
                            lv_value_1_1=(Token)match(input,54,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalHLVL.g:2900:7: lv_value_1_2= 'false'
                            {
                            lv_value_1_2=(Token)match(input,55,FOLLOW_2); 

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
                    // InternalHLVL.g:2915:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalHLVL.g:2915:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalHLVL.g:2916:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalHLVL.g:2916:4: ()
                    // InternalHLVL.g:2917:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalHLVL.g:2923:4: ( (otherlv_3= RULE_ID ) )
                    // InternalHLVL.g:2924:5: (otherlv_3= RULE_ID )
                    {
                    // InternalHLVL.g:2924:5: (otherlv_3= RULE_ID )
                    // InternalHLVL.g:2925:6: otherlv_3= RULE_ID
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
                    // InternalHLVL.g:2938:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    {
                    // InternalHLVL.g:2938:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    // InternalHLVL.g:2939:4: () ( (lv_attribute_5_0= ruleQualifiedName ) )
                    {
                    // InternalHLVL.g:2939:4: ()
                    // InternalHLVL.g:2940:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getAttributeRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHLVL.g:2946:4: ( (lv_attribute_5_0= ruleQualifiedName ) )
                    // InternalHLVL.g:2947:5: (lv_attribute_5_0= ruleQualifiedName )
                    {
                    // InternalHLVL.g:2947:5: (lv_attribute_5_0= ruleQualifiedName )
                    // InternalHLVL.g:2948:6: lv_attribute_5_0= ruleQualifiedName
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
                    							"com.coffee.hlvl.HLVL.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalHLVL.g:2967:3: ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) )
                    {
                    // InternalHLVL.g:2967:3: ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) ) )
                    // InternalHLVL.g:2968:4: () ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (lv_value_9_0= ruleValue ) )
                    {
                    // InternalHLVL.g:2968:4: ()
                    // InternalHLVL.g:2969:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getAssignAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHLVL.g:2975:4: ( (otherlv_7= RULE_ID ) )
                    // InternalHLVL.g:2976:5: (otherlv_7= RULE_ID )
                    {
                    // InternalHLVL.g:2976:5: (otherlv_7= RULE_ID )
                    // InternalHLVL.g:2977:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableElmDeclarationCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getIsKeyword_3_2());
                    			
                    // InternalHLVL.g:2992:4: ( (lv_value_9_0= ruleValue ) )
                    // InternalHLVL.g:2993:5: (lv_value_9_0= ruleValue )
                    {
                    // InternalHLVL.g:2993:5: (lv_value_9_0= ruleValue )
                    // InternalHLVL.g:2994:6: lv_value_9_0= ruleValue
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
                    							"com.coffee.hlvl.HLVL.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalHLVL.g:3013:3: ( () ( (lv_value_11_0= RULE_STRING ) ) )
                    {
                    // InternalHLVL.g:3013:3: ( () ( (lv_value_11_0= RULE_STRING ) ) )
                    // InternalHLVL.g:3014:4: () ( (lv_value_11_0= RULE_STRING ) )
                    {
                    // InternalHLVL.g:3014:4: ()
                    // InternalHLVL.g:3015:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getSymbolConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalHLVL.g:3021:4: ( (lv_value_11_0= RULE_STRING ) )
                    // InternalHLVL.g:3022:5: (lv_value_11_0= RULE_STRING )
                    {
                    // InternalHLVL.g:3022:5: (lv_value_11_0= RULE_STRING )
                    // InternalHLVL.g:3023:6: lv_value_11_0= RULE_STRING
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
                    // InternalHLVL.g:3041:3: ( () ( (lv_value_13_0= RULE_INT ) ) )
                    {
                    // InternalHLVL.g:3041:3: ( () ( (lv_value_13_0= RULE_INT ) ) )
                    // InternalHLVL.g:3042:4: () ( (lv_value_13_0= RULE_INT ) )
                    {
                    // InternalHLVL.g:3042:4: ()
                    // InternalHLVL.g:3043:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_5_0(),
                    						current);
                    				

                    }

                    // InternalHLVL.g:3049:4: ( (lv_value_13_0= RULE_INT ) )
                    // InternalHLVL.g:3050:5: (lv_value_13_0= RULE_INT )
                    {
                    // InternalHLVL.g:3050:5: (lv_value_13_0= RULE_INT )
                    // InternalHLVL.g:3051:6: lv_value_13_0= RULE_INT
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
    // InternalHLVL.g:3072:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalHLVL.g:3072:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalHLVL.g:3073:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalHLVL.g:3079:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalHLVL.g:3085:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalHLVL.g:3086:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalHLVL.g:3086:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalHLVL.g:3087:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalHLVL.g:3094:3: (kw= '.' this_ID_2= RULE_ID )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==56) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalHLVL.g:3095:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,56,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_40); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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


            }


            }


            	leaveRule();

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
    // InternalHLVL.g:3112:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalHLVL.g:3112:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalHLVL.g:3113:2: iv_ruleOperations= ruleOperations EOF
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
    // InternalHLVL.g:3119:1: ruleOperations returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:3125:2: ( ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) )
            // InternalHLVL.g:3126:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            {
            // InternalHLVL.g:3126:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            // InternalHLVL.g:3127:3: ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            {
            // InternalHLVL.g:3127:3: ( (lv_op_0_0= ruleOperation ) )
            // InternalHLVL.g:3128:4: (lv_op_0_0= ruleOperation )
            {
            // InternalHLVL.g:3128:4: (lv_op_0_0= ruleOperation )
            // InternalHLVL.g:3129:5: lv_op_0_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_op_0_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsRule());
            					}
            					add(
            						current,
            						"op",
            						lv_op_0_0,
            						"com.coffee.hlvl.HLVL.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHLVL.g:3146:3: ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==18) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalHLVL.g:3147:4: (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) )
            	    {
            	    // InternalHLVL.g:3147:4: (otherlv_1= ',' )+
            	    int cnt32=0;
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==18) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalHLVL.g:3148:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,18,FOLLOW_42); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getOperationsAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt32 >= 1 ) break loop32;
            	                EarlyExitException eee =
            	                    new EarlyExitException(32, input);
            	                throw eee;
            	        }
            	        cnt32++;
            	    } while (true);

            	    // InternalHLVL.g:3153:4: ( (lv_op_2_0= ruleOperation ) )
            	    // InternalHLVL.g:3154:5: (lv_op_2_0= ruleOperation )
            	    {
            	    // InternalHLVL.g:3154:5: (lv_op_2_0= ruleOperation )
            	    // InternalHLVL.g:3155:6: lv_op_2_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_op_2_0=ruleOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"com.coffee.hlvl.HLVL.Operation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalHLVL.g:3177:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalHLVL.g:3177:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalHLVL.g:3178:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalHLVL.g:3184:1: ruleOperation returns [EObject current=null] : this_Sample_0= ruleSample ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Sample_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:3190:2: (this_Sample_0= ruleSample )
            // InternalHLVL.g:3191:2: this_Sample_0= ruleSample
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
    // InternalHLVL.g:3202:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalHLVL.g:3202:47: (iv_ruleSample= ruleSample EOF )
            // InternalHLVL.g:3203:2: iv_ruleSample= ruleSample EOF
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
    // InternalHLVL.g:3209:1: ruleSample returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_valuations_5_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:3215:2: ( ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) )
            // InternalHLVL.g:3216:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            {
            // InternalHLVL.g:3216:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=58 && LA34_0<=61)) ) {
                alt34=1;
            }
            else if ( (LA34_0==57) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalHLVL.g:3217:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    {
                    // InternalHLVL.g:3217:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    // InternalHLVL.g:3218:4: () ( (lv_name_1_0= ruleOperationName ) )
                    {
                    // InternalHLVL.g:3218:4: ()
                    // InternalHLVL.g:3219:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getSingleInstructionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHLVL.g:3225:4: ( (lv_name_1_0= ruleOperationName ) )
                    // InternalHLVL.g:3226:5: (lv_name_1_0= ruleOperationName )
                    {
                    // InternalHLVL.g:3226:5: (lv_name_1_0= ruleOperationName )
                    // InternalHLVL.g:3227:6: lv_name_1_0= ruleOperationName
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
                    							"com.coffee.hlvl.HLVL.OperationName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHLVL.g:3246:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    {
                    // InternalHLVL.g:3246:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    // InternalHLVL.g:3247:4: () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')'
                    {
                    // InternalHLVL.g:3247:4: ()
                    // InternalHLVL.g:3248:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getValidConfAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,57,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getValidConfigurationKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalHLVL.g:3262:4: ( (lv_valuations_5_0= ruleListOfValuation ) )
                    // InternalHLVL.g:3263:5: (lv_valuations_5_0= ruleListOfValuation )
                    {
                    // InternalHLVL.g:3263:5: (lv_valuations_5_0= ruleListOfValuation )
                    // InternalHLVL.g:3264:6: lv_valuations_5_0= ruleListOfValuation
                    {

                    						newCompositeNode(grammarAccess.getSampleAccess().getValuationsListOfValuationParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_valuations_5_0=ruleListOfValuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSampleRule());
                    						}
                    						set(
                    							current,
                    							"valuations",
                    							lv_valuations_5_0,
                    							"com.coffee.hlvl.HLVL.ListOfValuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalHLVL.g:3290:1: entryRuleOperationName returns [String current=null] : iv_ruleOperationName= ruleOperationName EOF ;
    public final String entryRuleOperationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationName = null;


        try {
            // InternalHLVL.g:3290:53: (iv_ruleOperationName= ruleOperationName EOF )
            // InternalHLVL.g:3291:2: iv_ruleOperationName= ruleOperationName EOF
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
    // InternalHLVL.g:3297:1: ruleOperationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) ;
    public final AntlrDatatypeRuleToken ruleOperationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHLVL.g:3303:2: ( (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) )
            // InternalHLVL.g:3304:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            {
            // InternalHLVL.g:3304:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt35=1;
                }
                break;
            case 59:
                {
                alt35=2;
                }
                break;
            case 60:
                {
                alt35=3;
                }
                break;
            case 61:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalHLVL.g:3305:3: kw= 'validModel'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getValidModelKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLVL.g:3311:3: kw= 'numberOfConfigurations'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getNumberOfConfigurationsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHLVL.g:3317:3: kw= 'findConfiguration'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getFindConfigurationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHLVL.g:3323:3: kw= 'findAllConfigurations'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

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
    // InternalHLVL.g:3332:1: entryRuleBoolVal returns [EObject current=null] : iv_ruleBoolVal= ruleBoolVal EOF ;
    public final EObject entryRuleBoolVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVal = null;


        try {
            // InternalHLVL.g:3332:48: (iv_ruleBoolVal= ruleBoolVal EOF )
            // InternalHLVL.g:3333:2: iv_ruleBoolVal= ruleBoolVal EOF
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
    // InternalHLVL.g:3339:1: ruleBoolVal returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalHLVL.g:3345:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalHLVL.g:3346:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalHLVL.g:3346:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalHLVL.g:3347:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalHLVL.g:3347:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalHLVL.g:3348:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalHLVL.g:3348:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            else if ( (LA36_0==55) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalHLVL.g:3349:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,54,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolValRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalHLVL.g:3360:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,55,FOLLOW_2); 

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
    // InternalHLVL.g:3376:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalHLVL.g:3376:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalHLVL.g:3377:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalHLVL.g:3383:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHLVL.g:3389:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalHLVL.g:3390:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalHLVL.g:3390:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalHLVL.g:3391:3: (lv_value_0_0= RULE_INT )
            {
            // InternalHLVL.g:3391:3: (lv_value_0_0= RULE_INT )
            // InternalHLVL.g:3392:4: lv_value_0_0= RULE_INT
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
    // InternalHLVL.g:3411:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalHLVL.g:3411:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalHLVL.g:3412:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalHLVL.g:3418:1: ruleSymbol returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHLVL.g:3424:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalHLVL.g:3425:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalHLVL.g:3425:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalHLVL.g:3426:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalHLVL.g:3426:3: (lv_value_0_0= RULE_STRING )
            // InternalHLVL.g:3427:4: lv_value_0_0= RULE_STRING
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
    // InternalHLVL.g:3446:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalHLVL.g:3446:46: (iv_ruleValue= ruleValue EOF )
            // InternalHLVL.g:3447:2: iv_ruleValue= ruleValue EOF
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
    // InternalHLVL.g:3453:1: ruleValue returns [EObject current=null] : (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_BoolVal_1 = null;

        EObject this_Symbol_2 = null;



        	enterRule();

        try {
            // InternalHLVL.g:3459:2: ( (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol ) )
            // InternalHLVL.g:3460:2: (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol )
            {
            // InternalHLVL.g:3460:2: (this_Number_0= ruleNumber | this_BoolVal_1= ruleBoolVal | this_Symbol_2= ruleSymbol )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt37=1;
                }
                break;
            case 54:
            case 55:
                {
                alt37=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalHLVL.g:3461:3: this_Number_0= ruleNumber
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
                    // InternalHLVL.g:3470:3: this_BoolVal_1= ruleBoolVal
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
                    // InternalHLVL.g:3479:3: this_Symbol_2= ruleSymbol
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
    // InternalHLVL.g:3491:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalHLVL.g:3491:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalHLVL.g:3492:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalHLVL.g:3498:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHLVL.g:3504:2: ( (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' ) )
            // InternalHLVL.g:3505:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            {
            // InternalHLVL.g:3505:2: (kw= 'boolean' | kw= 'integer' | kw= 'symbolic' )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt38=1;
                }
                break;
            case 63:
                {
                alt38=2;
                }
                break;
            case 64:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalHLVL.g:3506:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLVL.g:3512:3: kw= 'integer'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHLVL.g:3518:3: kw= 'symbolic'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

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
    // InternalHLVL.g:3527:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalHLVL.g:3527:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalHLVL.g:3528:2: iv_ruleListOfValues= ruleListOfValues EOF
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
    // InternalHLVL.g:3534:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:3540:2: ( ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* ) )
            // InternalHLVL.g:3541:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            {
            // InternalHLVL.g:3541:2: ( ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )* )
            // InternalHLVL.g:3542:3: ( (lv_values_0_0= ruleValue ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            {
            // InternalHLVL.g:3542:3: ( (lv_values_0_0= ruleValue ) )
            // InternalHLVL.g:3543:4: (lv_values_0_0= ruleValue )
            {
            // InternalHLVL.g:3543:4: (lv_values_0_0= ruleValue )
            // InternalHLVL.g:3544:5: lv_values_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_values_0_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"com.coffee.hlvl.HLVL.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHLVL.g:3561:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==18) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalHLVL.g:3562:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleValue ) )
            	    {
            	    // InternalHLVL.g:3562:4: (otherlv_1= ',' )+
            	    int cnt39=0;
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==18) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // InternalHLVL.g:3563:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,18,FOLLOW_43); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	    				

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

            	    // InternalHLVL.g:3568:4: ( (lv_values_2_0= ruleValue ) )
            	    // InternalHLVL.g:3569:5: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalHLVL.g:3569:5: (lv_values_2_0= ruleValue )
            	    // InternalHLVL.g:3570:6: lv_values_2_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"com.coffee.hlvl.HLVL.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleListOfValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalHLVL.g:3592:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalHLVL.g:3592:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalHLVL.g:3593:2: iv_ruleListOfIDs= ruleListOfIDs EOF
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
    // InternalHLVL.g:3599:1: ruleListOfIDs returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHLVL.g:3605:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalHLVL.g:3606:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalHLVL.g:3606:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            // InternalHLVL.g:3607:3: () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalHLVL.g:3607:3: ()
            // InternalHLVL.g:3608:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListOfIDsAccess().getListOfIDsAction_0(),
            					current);
            			

            }

            // InternalHLVL.g:3614:3: ( (otherlv_1= RULE_ID ) )
            // InternalHLVL.g:3615:4: (otherlv_1= RULE_ID )
            {
            // InternalHLVL.g:3615:4: (otherlv_1= RULE_ID )
            // InternalHLVL.g:3616:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfIDsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_1_0());
            				

            }


            }

            // InternalHLVL.g:3627:3: ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==18) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalHLVL.g:3628:4: (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalHLVL.g:3628:4: (otherlv_2= ',' )+
            	    int cnt41=0;
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==18) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalHLVL.g:3629:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,18,FOLLOW_44); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getListOfIDsAccess().getCommaKeyword_2_0());
            	    	    				

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

            	    // InternalHLVL.g:3634:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalHLVL.g:3635:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalHLVL.g:3635:5: (otherlv_3= RULE_ID )
            	    // InternalHLVL.g:3636:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfIDsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    						newLeafNode(otherlv_3, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_2_1_0());
            	    					

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
    // $ANTLR end "ruleListOfIDs"


    // $ANTLR start "entryRuleListOfRelRefs"
    // InternalHLVL.g:3652:1: entryRuleListOfRelRefs returns [EObject current=null] : iv_ruleListOfRelRefs= ruleListOfRelRefs EOF ;
    public final EObject entryRuleListOfRelRefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfRelRefs = null;


        try {
            // InternalHLVL.g:3652:54: (iv_ruleListOfRelRefs= ruleListOfRelRefs EOF )
            // InternalHLVL.g:3653:2: iv_ruleListOfRelRefs= ruleListOfRelRefs EOF
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
    // InternalHLVL.g:3659:1: ruleListOfRelRefs returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfRelRefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHLVL.g:3665:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalHLVL.g:3666:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalHLVL.g:3666:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            // InternalHLVL.g:3667:3: () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalHLVL.g:3667:3: ()
            // InternalHLVL.g:3668:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListOfRelRefsAccess().getListOfRelRefsAction_0(),
            					current);
            			

            }

            // InternalHLVL.g:3674:3: ( (otherlv_1= RULE_ID ) )
            // InternalHLVL.g:3675:4: (otherlv_1= RULE_ID )
            {
            // InternalHLVL.g:3675:4: (otherlv_1= RULE_ID )
            // InternalHLVL.g:3676:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfRelRefsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_1, grammarAccess.getListOfRelRefsAccess().getIdsRelDeclarationCrossReference_1_0());
            				

            }


            }

            // InternalHLVL.g:3687:3: ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==18) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalHLVL.g:3688:4: (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalHLVL.g:3688:4: (otherlv_2= ',' )+
            	    int cnt43=0;
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==18) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalHLVL.g:3689:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,18,FOLLOW_44); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getListOfRelRefsAccess().getCommaKeyword_2_0());
            	    	    				

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

            	    // InternalHLVL.g:3694:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalHLVL.g:3695:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalHLVL.g:3695:5: (otherlv_3= RULE_ID )
            	    // InternalHLVL.g:3696:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfRelRefsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    						newLeafNode(otherlv_3, grammarAccess.getListOfRelRefsAccess().getIdsRelDeclarationCrossReference_2_1_0());
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleListOfRelRefs"


    // $ANTLR start "entryRuleValuation"
    // InternalHLVL.g:3712:1: entryRuleValuation returns [EObject current=null] : iv_ruleValuation= ruleValuation EOF ;
    public final EObject entryRuleValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuation = null;


        try {
            // InternalHLVL.g:3712:50: (iv_ruleValuation= ruleValuation EOF )
            // InternalHLVL.g:3713:2: iv_ruleValuation= ruleValuation EOF
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
    // InternalHLVL.g:3719:1: ruleValuation returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:3725:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) )
            // InternalHLVL.g:3726:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            {
            // InternalHLVL.g:3726:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            // InternalHLVL.g:3727:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValuationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalHLVL.g:3731:3: ( (otherlv_1= RULE_ID ) )
            // InternalHLVL.g:3732:4: (otherlv_1= RULE_ID )
            {
            // InternalHLVL.g:3732:4: (otherlv_1= RULE_ID )
            // InternalHLVL.g:3733:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValuationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_1, grammarAccess.getValuationAccess().getElementElmDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getValuationAccess().getCommaKeyword_2());
            		
            // InternalHLVL.g:3748:3: ( (lv_value_3_0= ruleValue ) )
            // InternalHLVL.g:3749:4: (lv_value_3_0= ruleValue )
            {
            // InternalHLVL.g:3749:4: (lv_value_3_0= ruleValue )
            // InternalHLVL.g:3750:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getValuationAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValuationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"com.coffee.hlvl.HLVL.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalHLVL.g:3775:1: entryRuleListOfValuation returns [EObject current=null] : iv_ruleListOfValuation= ruleListOfValuation EOF ;
    public final EObject entryRuleListOfValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValuation = null;


        try {
            // InternalHLVL.g:3775:56: (iv_ruleListOfValuation= ruleListOfValuation EOF )
            // InternalHLVL.g:3776:2: iv_ruleListOfValuation= ruleListOfValuation EOF
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
    // InternalHLVL.g:3782:1: ruleListOfValuation returns [EObject current=null] : ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) ;
    public final EObject ruleListOfValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pairs_0_0 = null;

        EObject lv_pairs_2_0 = null;



        	enterRule();

        try {
            // InternalHLVL.g:3788:2: ( ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) )
            // InternalHLVL.g:3789:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            {
            // InternalHLVL.g:3789:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            // InternalHLVL.g:3790:3: ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            {
            // InternalHLVL.g:3790:3: ( (lv_pairs_0_0= ruleValuation ) )
            // InternalHLVL.g:3791:4: (lv_pairs_0_0= ruleValuation )
            {
            // InternalHLVL.g:3791:4: (lv_pairs_0_0= ruleValuation )
            // InternalHLVL.g:3792:5: lv_pairs_0_0= ruleValuation
            {

            					newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_pairs_0_0=ruleValuation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfValuationRule());
            					}
            					add(
            						current,
            						"pairs",
            						lv_pairs_0_0,
            						"com.coffee.hlvl.HLVL.Valuation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHLVL.g:3809:3: ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==18) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalHLVL.g:3810:4: (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) )
            	    {
            	    // InternalHLVL.g:3810:4: (otherlv_1= ',' )+
            	    int cnt45=0;
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==18) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // InternalHLVL.g:3811:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,18,FOLLOW_45); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuationAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt45 >= 1 ) break loop45;
            	                EarlyExitException eee =
            	                    new EarlyExitException(45, input);
            	                throw eee;
            	        }
            	        cnt45++;
            	    } while (true);

            	    // InternalHLVL.g:3816:4: ( (lv_pairs_2_0= ruleValuation ) )
            	    // InternalHLVL.g:3817:5: (lv_pairs_2_0= ruleValuation )
            	    {
            	    // InternalHLVL.g:3817:5: (lv_pairs_2_0= ruleValuation )
            	    // InternalHLVL.g:3818:6: lv_pairs_2_0= ruleValuation
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_pairs_2_0=ruleValuation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfValuationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pairs",
            	    							lv_pairs_2_0,
            	    							"com.coffee.hlvl.HLVL.Valuation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalHLVL.g:3840:1: entryRuleFunctionOp returns [String current=null] : iv_ruleFunctionOp= ruleFunctionOp EOF ;
    public final String entryRuleFunctionOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionOp = null;


        try {
            // InternalHLVL.g:3840:50: (iv_ruleFunctionOp= ruleFunctionOp EOF )
            // InternalHLVL.g:3841:2: iv_ruleFunctionOp= ruleFunctionOp EOF
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
    // InternalHLVL.g:3847:1: ruleFunctionOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' | kw= 'if' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHLVL.g:3853:2: ( (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' | kw= 'if' ) )
            // InternalHLVL.g:3854:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' | kw= 'if' )
            {
            // InternalHLVL.g:3854:2: (kw= 'pow' | kw= 'dist' | kw= 'min' | kw= 'max' | kw= 'if' )
            int alt47=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt47=1;
                }
                break;
            case 66:
                {
                alt47=2;
                }
                break;
            case 67:
                {
                alt47=3;
                }
                break;
            case 68:
                {
                alt47=4;
                }
                break;
            case 69:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalHLVL.g:3855:3: kw= 'pow'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getPowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLVL.g:3861:3: kw= 'dist'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getDistKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHLVL.g:3867:3: kw= 'min'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getMinKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHLVL.g:3873:3: kw= 'max'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionOpAccess().getMaxKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalHLVL.g:3879:3: kw= 'if'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

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
    // InternalHLVL.g:3888:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // InternalHLVL.g:3888:47: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalHLVL.g:3889:2: iv_ruleUnaryOp= ruleUnaryOp EOF
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
    // InternalHLVL.g:3895:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abs' | kw= 'sqrt' | kw= 'instances' | kw= 'entailed' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHLVL.g:3901:2: ( (kw= 'abs' | kw= 'sqrt' | kw= 'instances' | kw= 'entailed' ) )
            // InternalHLVL.g:3902:2: (kw= 'abs' | kw= 'sqrt' | kw= 'instances' | kw= 'entailed' )
            {
            // InternalHLVL.g:3902:2: (kw= 'abs' | kw= 'sqrt' | kw= 'instances' | kw= 'entailed' )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt48=1;
                }
                break;
            case 71:
                {
                alt48=2;
                }
                break;
            case 72:
                {
                alt48=3;
                }
                break;
            case 73:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalHLVL.g:3903:3: kw= 'abs'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getAbsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHLVL.g:3909:3: kw= 'sqrt'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getSqrtKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHLVL.g:3915:3: kw= 'instances'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getInstancesKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHLVL.g:3921:3: kw= 'entailed'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

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


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\20\2\uffff\2\34\5\uffff\2\4\1\uffff\1\22\1\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\50\2\uffff\2\34\5\uffff\2\34\1\uffff\1\22\1\uffff\1\21\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\10\1\11\2\uffff\1\12\1\uffff\1\13\1\uffff\1\4\1\3";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\11\11\uffff\1\1\2\uffff\1\3\1\4\1\2\2\uffff\1\2\1\uffff\1\10\2\5\1\7",
            "",
            "",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "\1\15\27\uffff\1\14",
            "\1\15\27\uffff\1\16",
            "",
            "\1\17",
            "",
            "\1\21\14\uffff\1\20",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "714:2: (this_Common_0= ruleCommon | this_Hierarchy_1= ruleHierarchy | this_Pair_2= rulePair | this_VarList_3= ruleVarList | this_Order_4= ruleOrder | this_MultInstantiation_5= ruleMultInstantiation | this_Expression_6= ruleExpression | this_Visibility_7= ruleVisibility | this_QImplies_8= ruleQImplies | this_ComplexImplies_9= ruleComplexImplies | this_ComplexMutex_10= ruleComplexMutex )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xC00000000001A000L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x3E00000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC000000000018000L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00C0000000000060L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000001E9C8030000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00E0000010000070L,0x00000000000003FEL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001800600000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0018001000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3E00000000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00C0000000040060L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000010040000L});

}