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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'elements:'", "'relations:'", "'operations:'", "'att'", "'boolean'", "'integer'", "'symbolic'", "'comment:'", "'{'", "'}'", "'is'", "'variants:'", "'..'", "'['", "']'", "':'", "'common'", "'('", "')'", "'implies'", "'mutex'", "','", "'decomposition'", "'group'", "'*'", "'visibility'", "'before'", "'after'", "'expression'", "'<=>'", "'=>'", "'OR'", "'AND'", "'='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'/'", "'mod'", "'~'", "'abs'", "'sqrt'", "'instances'", "'entailed'", "'pow'", "'dist'", "'min'", "'max'", "'if'", "'true'", "'false'", "'.'", "'validConfiguration'", "'validModel'", "'numberOfConfigurations'", "'findConfiguration'", "'findAllConfigurations'"
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

                if ( ((LA1_0>=15 && LA1_0<=18)) ) {
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
    // InternalHlvl.g:183:1: ruleElmDeclaration returns [EObject current=null] : ( () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )? ) ;
    public final EObject ruleElmDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_att_1_0=null;
        Token lv_dataType_2_1=null;
        Token lv_dataType_2_2=null;
        Token lv_dataType_2_3=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_comment_7_0=null;
        Token otherlv_8=null;
        EObject lv_declaration_4_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:189:2: ( ( () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )? ) )
            // InternalHlvl.g:190:2: ( () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )? )
            {
            // InternalHlvl.g:190:2: ( () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )? )
            // InternalHlvl.g:191:3: () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )?
            {
            // InternalHlvl.g:191:3: ()
            // InternalHlvl.g:192:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElmDeclarationAccess().getElmDeclarationAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:198:3: ( (lv_att_1_0= 'att' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHlvl.g:199:4: (lv_att_1_0= 'att' )
                    {
                    // InternalHlvl.g:199:4: (lv_att_1_0= 'att' )
                    // InternalHlvl.g:200:5: lv_att_1_0= 'att'
                    {
                    lv_att_1_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_att_1_0, grammarAccess.getElmDeclarationAccess().getAttAttKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getElmDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "att", lv_att_1_0, "att");
                    				

                    }


                    }
                    break;

            }

            // InternalHlvl.g:212:3: ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) )
            // InternalHlvl.g:213:4: ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) )
            {
            // InternalHlvl.g:213:4: ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) )
            // InternalHlvl.g:214:5: (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' )
            {
            // InternalHlvl.g:214:5: (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalHlvl.g:215:6: lv_dataType_2_1= 'boolean'
                    {
                    lv_dataType_2_1=(Token)match(input,16,FOLLOW_3); 

                    						newLeafNode(lv_dataType_2_1, grammarAccess.getElmDeclarationAccess().getDataTypeBooleanKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "dataType", lv_dataType_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:226:6: lv_dataType_2_2= 'integer'
                    {
                    lv_dataType_2_2=(Token)match(input,17,FOLLOW_3); 

                    						newLeafNode(lv_dataType_2_2, grammarAccess.getElmDeclarationAccess().getDataTypeIntegerKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "dataType", lv_dataType_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:237:6: lv_dataType_2_3= 'symbolic'
                    {
                    lv_dataType_2_3=(Token)match(input,18,FOLLOW_3); 

                    						newLeafNode(lv_dataType_2_3, grammarAccess.getElmDeclarationAccess().getDataTypeSymbolicKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "dataType", lv_dataType_2_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalHlvl.g:250:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalHlvl.g:251:4: (lv_name_3_0= RULE_ID )
            {
            // InternalHlvl.g:251:4: (lv_name_3_0= RULE_ID )
            // InternalHlvl.g:252:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getElmDeclarationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElmDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalHlvl.g:268:3: ( (lv_declaration_4_0= ruleDeclaration ) )
            // InternalHlvl.g:269:4: (lv_declaration_4_0= ruleDeclaration )
            {
            // InternalHlvl.g:269:4: (lv_declaration_4_0= ruleDeclaration )
            // InternalHlvl.g:270:5: lv_declaration_4_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getElmDeclarationAccess().getDeclarationDeclarationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_declaration_4_0=ruleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElmDeclarationRule());
            					}
            					set(
            						current,
            						"declaration",
            						lv_declaration_4_0,
            						"com.coffee.Hlvl.Declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:287:3: (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHlvl.g:288:4: otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getElmDeclarationAccess().getCommentKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getElmDeclarationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalHlvl.g:296:4: ( (lv_comment_7_0= RULE_STRING ) )
                    // InternalHlvl.g:297:5: (lv_comment_7_0= RULE_STRING )
                    {
                    // InternalHlvl.g:297:5: (lv_comment_7_0= RULE_STRING )
                    // InternalHlvl.g:298:6: lv_comment_7_0= RULE_STRING
                    {
                    lv_comment_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_comment_7_0, grammarAccess.getElmDeclarationAccess().getCommentSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getElmDeclarationAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // InternalHlvl.g:323:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalHlvl.g:323:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalHlvl.g:324:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalHlvl.g:330:1: ruleDeclaration returns [EObject current=null] : (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantDecl_0 = null;

        EObject this_VariableDecl_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:336:2: ( (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) )
            // InternalHlvl.g:337:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            {
            // InternalHlvl.g:337:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||LA7_0==13||(LA7_0>=15 && LA7_0<=19)||LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHlvl.g:338:3: this_ConstantDecl_0= ruleConstantDecl
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
                    // InternalHlvl.g:347:3: this_VariableDecl_1= ruleVariableDecl
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
    // InternalHlvl.g:359:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // InternalHlvl.g:359:53: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // InternalHlvl.g:360:2: iv_ruleConstantDecl= ruleConstantDecl EOF
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
    // InternalHlvl.g:366:1: ruleConstantDecl returns [EObject current=null] : ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )? ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:372:2: ( ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )? ) )
            // InternalHlvl.g:373:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )? )
            {
            // InternalHlvl.g:373:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )? )
            // InternalHlvl.g:374:3: () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )?
            {
            // InternalHlvl.g:374:3: ()
            // InternalHlvl.g:375:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantDeclAccess().getConstantDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:381:3: (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHlvl.g:382:4: otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstantDeclAccess().getIsKeyword_1_0());
                    			
                    // InternalHlvl.g:386:4: ( (lv_value_2_0= ruleRelational ) )
                    // InternalHlvl.g:387:5: (lv_value_2_0= ruleRelational )
                    {
                    // InternalHlvl.g:387:5: (lv_value_2_0= ruleRelational )
                    // InternalHlvl.g:388:6: lv_value_2_0= ruleRelational
                    {

                    						newCompositeNode(grammarAccess.getConstantDeclAccess().getValueRelationalParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleRelational();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantDeclRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"com.coffee.Hlvl.Relational");
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
    // InternalHlvl.g:410:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalHlvl.g:410:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalHlvl.g:411:2: iv_ruleVariableDecl= ruleVariableDecl EOF
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
    // InternalHlvl.g:417:1: ruleVariableDecl returns [EObject current=null] : ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variants_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:423:2: ( ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) )
            // InternalHlvl.g:424:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            {
            // InternalHlvl.g:424:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            // InternalHlvl.g:425:3: () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            {
            // InternalHlvl.g:425:3: ()
            // InternalHlvl.g:426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableDeclAccess().getVariableDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:432:3: (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            // InternalHlvl.g:433:4: otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            {
            otherlv_1=(Token)match(input,23,FOLLOW_15); 

            				newLeafNode(otherlv_1, grammarAccess.getVariableDeclAccess().getVariantsKeyword_1_0());
            			
            // InternalHlvl.g:437:4: ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            // InternalHlvl.g:438:5: (lv_variants_2_0= ruleOptionsDeclaration )
            {
            // InternalHlvl.g:438:5: (lv_variants_2_0= ruleOptionsDeclaration )
            // InternalHlvl.g:439:6: lv_variants_2_0= ruleOptionsDeclaration
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
    // InternalHlvl.g:461:1: entryRuleOptionsDeclaration returns [EObject current=null] : iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF ;
    public final EObject entryRuleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionsDeclaration = null;


        try {
            // InternalHlvl.g:461:59: (iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF )
            // InternalHlvl.g:462:2: iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF
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
    // InternalHlvl.g:468:1: ruleOptionsDeclaration returns [EObject current=null] : (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Interval_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:474:2: ( (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) )
            // InternalHlvl.g:475:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            {
            // InternalHlvl.g:475:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHlvl.g:476:3: this_Interval_0= ruleInterval
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
                    // InternalHlvl.g:485:3: this_Enumeration_1= ruleEnumeration
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
    // InternalHlvl.g:497:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalHlvl.g:497:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalHlvl.g:498:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalHlvl.g:504:1: ruleInterval returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:510:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalHlvl.g:511:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalHlvl.g:511:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalHlvl.g:512:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalHlvl.g:512:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalHlvl.g:513:4: (lv_start_0_0= RULE_INT )
            {
            // InternalHlvl.g:513:4: (lv_start_0_0= RULE_INT )
            // InternalHlvl.g:514:5: lv_start_0_0= RULE_INT
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

            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
            		
            // InternalHlvl.g:534:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalHlvl.g:535:4: (lv_end_2_0= RULE_INT )
            {
            // InternalHlvl.g:535:4: (lv_end_2_0= RULE_INT )
            // InternalHlvl.g:536:5: lv_end_2_0= RULE_INT
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
    // InternalHlvl.g:556:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalHlvl.g:556:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalHlvl.g:557:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalHlvl.g:563:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:569:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalHlvl.g:570:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalHlvl.g:570:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalHlvl.g:571:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHlvl.g:575:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalHlvl.g:576:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalHlvl.g:576:4: (lv_list_1_0= ruleListOfValues )
            // InternalHlvl.g:577:5: lv_list_1_0= ruleListOfValues
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

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

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
    // InternalHlvl.g:602:1: entryRuleRelDeclaration returns [EObject current=null] : iv_ruleRelDeclaration= ruleRelDeclaration EOF ;
    public final EObject entryRuleRelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelDeclaration = null;


        try {
            // InternalHlvl.g:602:55: (iv_ruleRelDeclaration= ruleRelDeclaration EOF )
            // InternalHlvl.g:603:2: iv_ruleRelDeclaration= ruleRelDeclaration EOF
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
    // InternalHlvl.g:609:1: ruleRelDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) ) ) ;
    public final EObject ruleRelDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:615:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) ) ) )
            // InternalHlvl.g:616:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) ) )
            {
            // InternalHlvl.g:616:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) ) )
            // InternalHlvl.g:617:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) )
            {
            // InternalHlvl.g:617:3: ()
            // InternalHlvl.g:618:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelDeclarationAccess().getRelDeclarationAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:624:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHlvl.g:625:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHlvl.g:625:4: (lv_name_1_0= RULE_ID )
            // InternalHlvl.g:626:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getRelDeclarationAccess().getColonKeyword_2());
            		
            // InternalHlvl.g:646:3: ( (lv_exp_3_0= ruleRelation ) )
            // InternalHlvl.g:647:4: (lv_exp_3_0= ruleRelation )
            {
            // InternalHlvl.g:647:4: (lv_exp_3_0= ruleRelation )
            // InternalHlvl.g:648:5: lv_exp_3_0= ruleRelation
            {

            					newCompositeNode(grammarAccess.getRelDeclarationAccess().getExpRelationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelDeclarationRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
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
    // InternalHlvl.g:669:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalHlvl.g:669:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalHlvl.g:670:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalHlvl.g:676:1: ruleRelation returns [EObject current=null] : (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Common_0 = null;

        EObject this_Pair_1 = null;

        EObject this_VarList_2 = null;

        EObject this_Order_3 = null;

        EObject this_Decomposition_4 = null;

        EObject this_Group_5 = null;

        EObject this_Constraint_6 = null;

        EObject this_Visibility_7 = null;

        EObject this_ComplexImplies_8 = null;

        EObject this_ComplexMutex_9 = null;



        	enterRule();

        try {
            // InternalHlvl.g:682:2: ( (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex ) )
            // InternalHlvl.g:683:2: (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex )
            {
            // InternalHlvl.g:683:2: (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex )
            int alt10=10;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalHlvl.g:684:3: this_Common_0= ruleCommon
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
                    // InternalHlvl.g:693:3: this_Pair_1= rulePair
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
                    // InternalHlvl.g:702:3: this_VarList_2= ruleVarList
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
                    // InternalHlvl.g:711:3: this_Order_3= ruleOrder
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getOrderParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Order_3=ruleOrder();

                    state._fsp--;


                    			current = this_Order_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalHlvl.g:720:3: this_Decomposition_4= ruleDecomposition
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getDecompositionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decomposition_4=ruleDecomposition();

                    state._fsp--;


                    			current = this_Decomposition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalHlvl.g:729:3: this_Group_5= ruleGroup
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getGroupParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_5=ruleGroup();

                    state._fsp--;


                    			current = this_Group_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalHlvl.g:738:3: this_Constraint_6= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getConstraintParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_6=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalHlvl.g:747:3: this_Visibility_7= ruleVisibility
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
                    // InternalHlvl.g:756:3: this_ComplexImplies_8= ruleComplexImplies
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getComplexImpliesParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexImplies_8=ruleComplexImplies();

                    state._fsp--;


                    			current = this_ComplexImplies_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalHlvl.g:765:3: this_ComplexMutex_9= ruleComplexMutex
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getComplexMutexParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexMutex_9=ruleComplexMutex();

                    state._fsp--;


                    			current = this_ComplexMutex_9;
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
    // InternalHlvl.g:777:1: entryRuleCommon returns [EObject current=null] : iv_ruleCommon= ruleCommon EOF ;
    public final EObject entryRuleCommon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommon = null;


        try {
            // InternalHlvl.g:777:47: (iv_ruleCommon= ruleCommon EOF )
            // InternalHlvl.g:778:2: iv_ruleCommon= ruleCommon EOF
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
    // InternalHlvl.g:784:1: ruleCommon returns [EObject current=null] : ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' ) ;
    public final EObject ruleCommon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:790:2: ( ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' ) )
            // InternalHlvl.g:791:2: ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' )
            {
            // InternalHlvl.g:791:2: ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')' )
            // InternalHlvl.g:792:3: () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleListOfIDs ) ) otherlv_4= ')'
            {
            // InternalHlvl.g:792:3: ()
            // InternalHlvl.g:793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommonAccess().getCommonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonAccess().getCommonKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCommonAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:807:3: ( (lv_elements_3_0= ruleListOfIDs ) )
            // InternalHlvl.g:808:4: (lv_elements_3_0= ruleListOfIDs )
            {
            // InternalHlvl.g:808:4: (lv_elements_3_0= ruleListOfIDs )
            // InternalHlvl.g:809:5: lv_elements_3_0= ruleListOfIDs
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

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

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
                    // InternalHlvl.g:852:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,31,FOLLOW_21); 

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
                    lv_operator_0_2=(Token)match(input,32,FOLLOW_21); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

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
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getPairAccess().getVar1ElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_3); 

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
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getPairAccess().getVar2ElmDeclarationCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalHlvl.g:925:1: ruleComplexImplies returns [EObject current=null] : (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) ;
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
            // InternalHlvl.g:931:2: ( (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) )
            // InternalHlvl.g:932:2: (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalHlvl.g:932:2: (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            // InternalHlvl.g:933:3: otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexImpliesAccess().getImpliesKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:945:3: ( (lv_exp_3_0= ruleRelational ) )
            // InternalHlvl.g:946:4: (lv_exp_3_0= ruleRelational )
            {
            // InternalHlvl.g:946:4: (lv_exp_3_0= ruleRelational )
            // InternalHlvl.g:947:5: lv_exp_3_0= ruleRelational
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

            otherlv_4=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexImpliesAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexImpliesAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexImpliesAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalHlvl.g:976:3: ( (lv_elements_7_0= ruleListOfIDs ) )
            // InternalHlvl.g:977:4: (lv_elements_7_0= ruleListOfIDs )
            {
            // InternalHlvl.g:977:4: (lv_elements_7_0= ruleListOfIDs )
            // InternalHlvl.g:978:5: lv_elements_7_0= ruleListOfIDs
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

            otherlv_8=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexImpliesAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,30,FOLLOW_2); 

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
    // InternalHlvl.g:1007:1: entryRuleComplexMutex returns [EObject current=null] : iv_ruleComplexMutex= ruleComplexMutex EOF ;
    public final EObject entryRuleComplexMutex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexMutex = null;


        try {
            // InternalHlvl.g:1007:53: (iv_ruleComplexMutex= ruleComplexMutex EOF )
            // InternalHlvl.g:1008:2: iv_ruleComplexMutex= ruleComplexMutex EOF
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
    // InternalHlvl.g:1014:1: ruleComplexMutex returns [EObject current=null] : (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) ;
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
            // InternalHlvl.g:1020:2: ( (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) )
            // InternalHlvl.g:1021:2: (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalHlvl.g:1021:2: (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            // InternalHlvl.g:1022:3: otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleListOfIDs ) ) otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexMutexAccess().getMutexKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexMutexAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexMutexAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1034:3: ( (lv_exp_3_0= ruleRelational ) )
            // InternalHlvl.g:1035:4: (lv_exp_3_0= ruleRelational )
            {
            // InternalHlvl.g:1035:4: (lv_exp_3_0= ruleRelational )
            // InternalHlvl.g:1036:5: lv_exp_3_0= ruleRelational
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

            otherlv_4=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexMutexAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexMutexAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexMutexAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalHlvl.g:1065:3: ( (lv_elements_7_0= ruleListOfIDs ) )
            // InternalHlvl.g:1066:4: (lv_elements_7_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1066:4: (lv_elements_7_0= ruleListOfIDs )
            // InternalHlvl.g:1067:5: lv_elements_7_0= ruleListOfIDs
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

            otherlv_8=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexMutexAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,30,FOLLOW_2); 

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
    // InternalHlvl.g:1096:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalHlvl.g:1096:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalHlvl.g:1097:2: iv_ruleVarList= ruleVarList EOF
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
    // InternalHlvl.g:1103:1: ruleVarList returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
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
            // InternalHlvl.g:1109:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1110:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1110:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1111:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleListOfIDs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            // InternalHlvl.g:1111:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHlvl.g:1112:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHlvl.g:1112:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHlvl.g:1113:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHlvl.g:1113:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
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
                    // InternalHlvl.g:1114:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,31,FOLLOW_21); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getVarListAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarListRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1125:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,32,FOLLOW_21); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1142:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:1143:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:1143:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:1144:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarListRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getVarListAccess().getVar1ElmDeclarationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getVarListAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVarListAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1163:3: ( (lv_list_5_0= ruleListOfIDs ) )
            // InternalHlvl.g:1164:4: (lv_list_5_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1164:4: (lv_list_5_0= ruleListOfIDs )
            // InternalHlvl.g:1165:5: lv_list_5_0= ruleListOfIDs
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

            otherlv_6=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getVarListAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDecomposition"
    // InternalHlvl.g:1194:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // InternalHlvl.g:1194:54: (iv_ruleDecomposition= ruleDecomposition EOF )
            // InternalHlvl.g:1195:2: iv_ruleDecomposition= ruleDecomposition EOF
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
    // InternalHlvl.g:1201:1: ruleDecomposition returns [EObject current=null] : ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' ) ;
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
            // InternalHlvl.g:1207:2: ( ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' ) )
            // InternalHlvl.g:1208:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' )
            {
            // InternalHlvl.g:1208:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' )
            // InternalHlvl.g:1209:3: () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')'
            {
            // InternalHlvl.g:1209:3: ()
            // InternalHlvl.g:1210:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecompositionAccess().getDecompositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecompositionKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1224:3: ( (otherlv_3= RULE_ID ) )
            // InternalHlvl.g:1225:4: (otherlv_3= RULE_ID )
            {
            // InternalHlvl.g:1225:4: (otherlv_3= RULE_ID )
            // InternalHlvl.g:1226:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getDecompositionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHlvl.g:1245:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHlvl.g:1246:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1246:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHlvl.g:1247:5: lv_children_6_0= ruleListOfIDs
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

            otherlv_7=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalHlvl.g:1276:3: ( (lv_min_10_0= RULE_INT ) )
            // InternalHlvl.g:1277:4: (lv_min_10_0= RULE_INT )
            {
            // InternalHlvl.g:1277:4: (lv_min_10_0= RULE_INT )
            // InternalHlvl.g:1278:5: lv_min_10_0= RULE_INT
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

            otherlv_11=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getDecompositionAccess().getCommaKeyword_11());
            		
            // InternalHlvl.g:1298:3: ( (lv_max_12_0= RULE_INT ) )
            // InternalHlvl.g:1299:4: (lv_max_12_0= RULE_INT )
            {
            // InternalHlvl.g:1299:4: (lv_max_12_0= RULE_INT )
            // InternalHlvl.g:1300:5: lv_max_12_0= RULE_INT
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

            otherlv_13=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,30,FOLLOW_2); 

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
    // InternalHlvl.g:1328:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalHlvl.g:1328:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalHlvl.g:1329:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalHlvl.g:1335:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' ) ;
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
            // InternalHlvl.g:1341:2: ( ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' ) )
            // InternalHlvl.g:1342:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' )
            {
            // InternalHlvl.g:1342:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' )
            // InternalHlvl.g:1343:3: () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')'
            {
            // InternalHlvl.g:1343:3: ()
            // InternalHlvl.g:1344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1358:3: ( (otherlv_3= RULE_ID ) )
            // InternalHlvl.g:1359:4: (otherlv_3= RULE_ID )
            {
            // InternalHlvl.g:1359:4: (otherlv_3= RULE_ID )
            // InternalHlvl.g:1360:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHlvl.g:1379:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHlvl.g:1380:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1380:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHlvl.g:1381:5: lv_children_6_0= ruleListOfIDs
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

            otherlv_7=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalHlvl.g:1410:3: ( (lv_min_10_0= RULE_INT ) )
            // InternalHlvl.g:1411:4: (lv_min_10_0= RULE_INT )
            {
            // InternalHlvl.g:1411:4: (lv_min_10_0= RULE_INT )
            // InternalHlvl.g:1412:5: lv_min_10_0= RULE_INT
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

            otherlv_11=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getCommaKeyword_11());
            		
            // InternalHlvl.g:1432:3: ( (lv_max_12_0= ruleRange ) )
            // InternalHlvl.g:1433:4: (lv_max_12_0= ruleRange )
            {
            // InternalHlvl.g:1433:4: (lv_max_12_0= ruleRange )
            // InternalHlvl.g:1434:5: lv_max_12_0= ruleRange
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

            otherlv_13=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,30,FOLLOW_2); 

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
    // InternalHlvl.g:1463:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalHlvl.g:1463:46: (iv_ruleRange= ruleRange EOF )
            // InternalHlvl.g:1464:2: iv_ruleRange= ruleRange EOF
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
    // InternalHlvl.g:1470:1: ruleRange returns [EObject current=null] : ( () ( (lv_value_1_0= ruleWildcard ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1476:2: ( ( () ( (lv_value_1_0= ruleWildcard ) ) ) )
            // InternalHlvl.g:1477:2: ( () ( (lv_value_1_0= ruleWildcard ) ) )
            {
            // InternalHlvl.g:1477:2: ( () ( (lv_value_1_0= ruleWildcard ) ) )
            // InternalHlvl.g:1478:3: () ( (lv_value_1_0= ruleWildcard ) )
            {
            // InternalHlvl.g:1478:3: ()
            // InternalHlvl.g:1479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeAccess().getRangeAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:1485:3: ( (lv_value_1_0= ruleWildcard ) )
            // InternalHlvl.g:1486:4: (lv_value_1_0= ruleWildcard )
            {
            // InternalHlvl.g:1486:4: (lv_value_1_0= ruleWildcard )
            // InternalHlvl.g:1487:5: lv_value_1_0= ruleWildcard
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getValueWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"com.coffee.Hlvl.Wildcard");
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


    // $ANTLR start "entryRuleWildcard"
    // InternalHlvl.g:1508:1: entryRuleWildcard returns [String current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final String entryRuleWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildcard = null;


        try {
            // InternalHlvl.g:1508:48: (iv_ruleWildcard= ruleWildcard EOF )
            // InternalHlvl.g:1509:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalHlvl.g:1515:1: ruleWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:1521:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalHlvl.g:1522:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalHlvl.g:1522:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalHlvl.g:1523:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getWildcardAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1531:3: kw= '*'
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
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleVisibility"
    // InternalHlvl.g:1540:1: entryRuleVisibility returns [EObject current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final EObject entryRuleVisibility() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibility = null;


        try {
            // InternalHlvl.g:1540:51: (iv_ruleVisibility= ruleVisibility EOF )
            // InternalHlvl.g:1541:2: iv_ruleVisibility= ruleVisibility EOF
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
    // InternalHlvl.g:1547:1: ruleVisibility returns [EObject current=null] : (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')' ) ;
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
            // InternalHlvl.g:1553:2: ( (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1554:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1554:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1555:3: otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibilityAccess().getVisibilityKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getVisibilityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1563:3: ( (lv_condition_2_0= ruleRelational ) )
            // InternalHlvl.g:1564:4: (lv_condition_2_0= ruleRelational )
            {
            // InternalHlvl.g:1564:4: (lv_condition_2_0= ruleRelational )
            // InternalHlvl.g:1565:5: lv_condition_2_0= ruleRelational
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

            otherlv_3=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getVisibilityAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVisibilityAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1590:3: ( (lv_list_5_0= ruleMixedList ) )
            // InternalHlvl.g:1591:4: (lv_list_5_0= ruleMixedList )
            {
            // InternalHlvl.g:1591:4: (lv_list_5_0= ruleMixedList )
            // InternalHlvl.g:1592:5: lv_list_5_0= ruleMixedList
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getListMixedListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_list_5_0=ruleMixedList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_5_0,
            						"com.coffee.Hlvl.MixedList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getVisibilityAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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
    // InternalHlvl.g:1621:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalHlvl.g:1621:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalHlvl.g:1622:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalHlvl.g:1628:1: ruleOrder returns [EObject current=null] : ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) ;
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
            // InternalHlvl.g:1634:2: ( ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) )
            // InternalHlvl.g:1635:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            {
            // InternalHlvl.g:1635:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==39) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHlvl.g:1636:3: ( (lv_operator_0_0= 'before' ) )
                    {
                    // InternalHlvl.g:1636:3: ( (lv_operator_0_0= 'before' ) )
                    // InternalHlvl.g:1637:4: (lv_operator_0_0= 'before' )
                    {
                    // InternalHlvl.g:1637:4: (lv_operator_0_0= 'before' )
                    // InternalHlvl.g:1638:5: lv_operator_0_0= 'before'
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
                    // InternalHlvl.g:1651:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    {
                    // InternalHlvl.g:1651:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    // InternalHlvl.g:1652:4: otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getAfterKeyword_1_0());
                    			
                    // InternalHlvl.g:1656:4: ( (otherlv_2= RULE_ID ) )
                    // InternalHlvl.g:1657:5: (otherlv_2= RULE_ID )
                    {
                    // InternalHlvl.g:1657:5: (otherlv_2= RULE_ID )
                    // InternalHlvl.g:1658:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getLeftElmDeclarationCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrderAccess().getCommaKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getLeftSquareBracketKeyword_1_3());
                    			
                    // InternalHlvl.g:1677:4: ( (lv_right_5_0= ruleListOfIDs ) )
                    // InternalHlvl.g:1678:5: (lv_right_5_0= ruleListOfIDs )
                    {
                    // InternalHlvl.g:1678:5: (lv_right_5_0= ruleListOfIDs )
                    // InternalHlvl.g:1679:6: lv_right_5_0= ruleListOfIDs
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

                    otherlv_6=(Token)match(input,26,FOLLOW_2); 

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


    // $ANTLR start "entryRuleConstraint"
    // InternalHlvl.g:1705:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalHlvl.g:1705:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalHlvl.g:1706:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalHlvl.g:1712:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1718:2: ( (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) )
            // InternalHlvl.g:1719:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            {
            // InternalHlvl.g:1719:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            // InternalHlvl.g:1720:3: otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1728:3: ( (lv_exp_2_0= ruleRelational ) )
            // InternalHlvl.g:1729:4: (lv_exp_2_0= ruleRelational )
            {
            // InternalHlvl.g:1729:4: (lv_exp_2_0= ruleRelational )
            // InternalHlvl.g:1730:5: lv_exp_2_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getExpRelationalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_exp_2_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleRelational"
    // InternalHlvl.g:1755:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalHlvl.g:1755:51: (iv_ruleRelational= ruleRelational EOF )
            // InternalHlvl.g:1756:2: iv_ruleRelational= ruleRelational EOF
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
    // InternalHlvl.g:1762:1: ruleRelational returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1768:2: (this_Iff_0= ruleIff )
            // InternalHlvl.g:1769:2: this_Iff_0= ruleIff
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
    // InternalHlvl.g:1780:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // InternalHlvl.g:1780:44: (iv_ruleIff= ruleIff EOF )
            // InternalHlvl.g:1781:2: iv_ruleIff= ruleIff EOF
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
    // InternalHlvl.g:1787:1: ruleIff returns [EObject current=null] : (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implies_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1793:2: ( (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) )
            // InternalHlvl.g:1794:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            {
            // InternalHlvl.g:1794:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            // InternalHlvl.g:1795:3: this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            {

            			newCompositeNode(grammarAccess.getIffAccess().getImpliesParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Implies_0=ruleImplies();

            state._fsp--;


            			current = this_Implies_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1803:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHlvl.g:1804:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) )
            	    {
            	    // InternalHlvl.g:1804:4: ()
            	    // InternalHlvl.g:1805:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getIffAccess().getIffLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1815:4: ( (lv_right_3_0= ruleImplies ) )
            	    // InternalHlvl.g:1816:5: (lv_right_3_0= ruleImplies )
            	    {
            	    // InternalHlvl.g:1816:5: (lv_right_3_0= ruleImplies )
            	    // InternalHlvl.g:1817:6: lv_right_3_0= ruleImplies
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
    // InternalHlvl.g:1839:1: entryRuleImplies returns [EObject current=null] : iv_ruleImplies= ruleImplies EOF ;
    public final EObject entryRuleImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplies = null;


        try {
            // InternalHlvl.g:1839:48: (iv_ruleImplies= ruleImplies EOF )
            // InternalHlvl.g:1840:2: iv_ruleImplies= ruleImplies EOF
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
    // InternalHlvl.g:1846:1: ruleImplies returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1852:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalHlvl.g:1853:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalHlvl.g:1853:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalHlvl.g:1854:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1862:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHlvl.g:1863:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalHlvl.g:1863:4: ()
            	    // InternalHlvl.g:1864:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImpliesAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1874:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalHlvl.g:1875:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalHlvl.g:1875:5: (lv_right_3_0= ruleOr )
            	    // InternalHlvl.g:1876:6: lv_right_3_0= ruleOr
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
    // InternalHlvl.g:1898:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalHlvl.g:1898:43: (iv_ruleOr= ruleOr EOF )
            // InternalHlvl.g:1899:2: iv_ruleOr= ruleOr EOF
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
    // InternalHlvl.g:1905:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1911:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalHlvl.g:1912:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalHlvl.g:1912:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalHlvl.g:1913:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1921:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHlvl.g:1922:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalHlvl.g:1922:4: ()
            	    // InternalHlvl.g:1923:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1933:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalHlvl.g:1934:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalHlvl.g:1934:5: (lv_right_3_0= ruleAnd )
            	    // InternalHlvl.g:1935:6: lv_right_3_0= ruleAnd
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
    // InternalHlvl.g:1957:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalHlvl.g:1957:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalHlvl.g:1958:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalHlvl.g:1964:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1970:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalHlvl.g:1971:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalHlvl.g:1971:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalHlvl.g:1972:3: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1980:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==44) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHlvl.g:1981:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalHlvl.g:1981:4: ()
            	    // InternalHlvl.g:1982:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1992:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalHlvl.g:1993:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalHlvl.g:1993:5: (lv_right_3_0= ruleEquality )
            	    // InternalHlvl.g:1994:6: lv_right_3_0= ruleEquality
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
    // InternalHlvl.g:2016:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalHlvl.g:2016:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalHlvl.g:2017:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalHlvl.g:2023:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2029:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalHlvl.g:2030:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalHlvl.g:2030:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalHlvl.g:2031:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2039:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=45 && LA20_0<=46)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHlvl.g:2040:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalHlvl.g:2040:4: ()
            	    // InternalHlvl.g:2041:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2047:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) )
            	    // InternalHlvl.g:2048:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalHlvl.g:2048:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    // InternalHlvl.g:2049:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    {
            	    // InternalHlvl.g:2049:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==45) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==46) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalHlvl.g:2050:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,45,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2061:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,46,FOLLOW_14); 

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

            	    // InternalHlvl.g:2074:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalHlvl.g:2075:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalHlvl.g:2075:5: (lv_right_3_0= ruleComparison )
            	    // InternalHlvl.g:2076:6: lv_right_3_0= ruleComparison
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
    // InternalHlvl.g:2098:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalHlvl.g:2098:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalHlvl.g:2099:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalHlvl.g:2105:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalHlvl.g:2111:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalHlvl.g:2112:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalHlvl.g:2112:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalHlvl.g:2113:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2121:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=47 && LA22_0<=50)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalHlvl.g:2122:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalHlvl.g:2122:4: ()
            	    // InternalHlvl.g:2123:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2129:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalHlvl.g:2130:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalHlvl.g:2130:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalHlvl.g:2131:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalHlvl.g:2131:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 50:
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
            	            // InternalHlvl.g:2132:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,47,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2143:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,48,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2154:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,49,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalHlvl.g:2165:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,50,FOLLOW_14); 

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

            	    // InternalHlvl.g:2178:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalHlvl.g:2179:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalHlvl.g:2179:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalHlvl.g:2180:6: lv_right_3_0= rulePlusOrMinus
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
    // InternalHlvl.g:2202:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalHlvl.g:2202:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalHlvl.g:2203:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalHlvl.g:2209:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2215:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalHlvl.g:2216:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalHlvl.g:2216:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalHlvl.g:2217:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2225:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=51 && LA24_0<=52)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalHlvl.g:2226:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalHlvl.g:2226:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==51) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==52) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalHlvl.g:2227:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalHlvl.g:2227:5: ( () otherlv_2= '+' )
            	            // InternalHlvl.g:2228:6: () otherlv_2= '+'
            	            {
            	            // InternalHlvl.g:2228:6: ()
            	            // InternalHlvl.g:2229:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,51,FOLLOW_14); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2241:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalHlvl.g:2241:5: ( () otherlv_4= '-' )
            	            // InternalHlvl.g:2242:6: () otherlv_4= '-'
            	            {
            	            // InternalHlvl.g:2242:6: ()
            	            // InternalHlvl.g:2243:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,52,FOLLOW_14); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalHlvl.g:2255:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalHlvl.g:2256:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalHlvl.g:2256:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalHlvl.g:2257:6: lv_right_5_0= ruleMulOrDiv
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
    // InternalHlvl.g:2279:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalHlvl.g:2279:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalHlvl.g:2280:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalHlvl.g:2286:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2292:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalHlvl.g:2293:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalHlvl.g:2293:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalHlvl.g:2294:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2302:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==36||(LA26_0>=53 && LA26_0<=54)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalHlvl.g:2303:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalHlvl.g:2303:4: ()
            	    // InternalHlvl.g:2304:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2310:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
            	    // InternalHlvl.g:2311:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    {
            	    // InternalHlvl.g:2311:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    // InternalHlvl.g:2312:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    {
            	    // InternalHlvl.g:2312:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 54:
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
            	            // InternalHlvl.g:2313:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2324:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,53,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2335:7: lv_op_2_3= 'mod'
            	            {
            	            lv_op_2_3=(Token)match(input,54,FOLLOW_14); 

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

            	    // InternalHlvl.g:2348:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalHlvl.g:2349:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalHlvl.g:2349:5: (lv_right_3_0= rulePrimary )
            	    // InternalHlvl.g:2350:6: lv_right_3_0= rulePrimary
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
    // InternalHlvl.g:2372:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalHlvl.g:2372:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalHlvl.g:2373:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalHlvl.g:2379:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' ) | ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) | ( () ( ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) ) ) otherlv_23= '(' ( (lv_left_24_0= rulePrimary ) ) otherlv_25= ',' ( (lv_right_26_0= rulePrimary ) ) otherlv_27= ')' ) | this_Atomic_28= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_op_7_1=null;
        Token lv_op_7_2=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_number_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_op_22_1=null;
        Token lv_op_22_2=null;
        Token lv_op_22_3=null;
        Token lv_op_22_4=null;
        Token lv_op_22_5=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject this_Relational_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_left_24_0 = null;

        EObject lv_right_26_0 = null;

        EObject this_Atomic_28 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2385:2: ( ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' ) | ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) | ( () ( ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) ) ) otherlv_23= '(' ( (lv_left_24_0= rulePrimary ) ) otherlv_25= ',' ( (lv_right_26_0= rulePrimary ) ) otherlv_27= ')' ) | this_Atomic_28= ruleAtomic ) )
            // InternalHlvl.g:2386:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' ) | ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) | ( () ( ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) ) ) otherlv_23= '(' ( (lv_left_24_0= rulePrimary ) ) otherlv_25= ',' ( (lv_right_26_0= rulePrimary ) ) otherlv_27= ')' ) | this_Atomic_28= ruleAtomic )
            {
            // InternalHlvl.g:2386:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' ) | ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) | ( () ( ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) ) ) otherlv_23= '(' ( (lv_left_24_0= rulePrimary ) ) otherlv_25= ',' ( (lv_right_26_0= rulePrimary ) ) otherlv_27= ')' ) | this_Atomic_28= ruleAtomic )
            int alt29=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt29=1;
                }
                break;
            case 55:
                {
                alt29=2;
                }
                break;
            case 56:
            case 57:
                {
                alt29=3;
                }
                break;
            case 58:
                {
                alt29=4;
                }
                break;
            case 59:
                {
                alt29=5;
                }
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt29=6;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 65:
            case 66:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalHlvl.g:2387:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    {
                    // InternalHlvl.g:2387:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    // InternalHlvl.g:2388:4: otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getRelationalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_Relational_1=ruleRelational();

                    state._fsp--;


                    				current = this_Relational_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:2406:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalHlvl.g:2406:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalHlvl.g:2407:4: () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalHlvl.g:2407:4: ()
                    // InternalHlvl.g:2408:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNegationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,55,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getTildeKeyword_1_1());
                    			
                    // InternalHlvl.g:2418:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalHlvl.g:2419:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalHlvl.g:2419:5: (lv_expression_5_0= rulePrimary )
                    // InternalHlvl.g:2420:6: lv_expression_5_0= rulePrimary
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
                    // InternalHlvl.g:2439:3: ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalHlvl.g:2439:3: ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalHlvl.g:2440:4: () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalHlvl.g:2440:4: ()
                    // InternalHlvl.g:2441:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUnaryFunctionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2447:4: ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) )
                    // InternalHlvl.g:2448:5: ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) )
                    {
                    // InternalHlvl.g:2448:5: ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) )
                    // InternalHlvl.g:2449:6: (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' )
                    {
                    // InternalHlvl.g:2449:6: (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==56) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==57) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalHlvl.g:2450:7: lv_op_7_1= 'abs'
                            {
                            lv_op_7_1=(Token)match(input,56,FOLLOW_14); 

                            							newLeafNode(lv_op_7_1, grammarAccess.getPrimaryAccess().getOpAbsKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalHlvl.g:2461:7: lv_op_7_2= 'sqrt'
                            {
                            lv_op_7_2=(Token)match(input,57,FOLLOW_14); 

                            							newLeafNode(lv_op_7_2, grammarAccess.getPrimaryAccess().getOpSqrtKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalHlvl.g:2474:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalHlvl.g:2475:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalHlvl.g:2475:5: (lv_expression_8_0= rulePrimary )
                    // InternalHlvl.g:2476:6: lv_expression_8_0= rulePrimary
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
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalHlvl.g:2495:3: ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' )
                    {
                    // InternalHlvl.g:2495:3: ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' )
                    // InternalHlvl.g:2496:4: () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')'
                    {
                    // InternalHlvl.g:2496:4: ()
                    // InternalHlvl.g:2497:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getInstancesAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,58,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getInstancesKeyword_3_1());
                    			
                    otherlv_11=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalHlvl.g:2511:4: ( (otherlv_12= RULE_ID ) )
                    // InternalHlvl.g:2512:5: (otherlv_12= RULE_ID )
                    {
                    // InternalHlvl.g:2512:5: (otherlv_12= RULE_ID )
                    // InternalHlvl.g:2513:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_12, grammarAccess.getPrimaryAccess().getElementElmDeclarationCrossReference_3_3_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getCommaKeyword_3_4());
                    			
                    // InternalHlvl.g:2528:4: ( (lv_number_14_0= RULE_INT ) )
                    // InternalHlvl.g:2529:5: (lv_number_14_0= RULE_INT )
                    {
                    // InternalHlvl.g:2529:5: (lv_number_14_0= RULE_INT )
                    // InternalHlvl.g:2530:6: lv_number_14_0= RULE_INT
                    {
                    lv_number_14_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_number_14_0, grammarAccess.getPrimaryAccess().getNumberINTTerminalRuleCall_3_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_14_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_6());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHlvl.g:2552:3: ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
                    {
                    // InternalHlvl.g:2552:3: ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
                    // InternalHlvl.g:2553:4: () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')'
                    {
                    // InternalHlvl.g:2553:4: ()
                    // InternalHlvl.g:2554:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getEntailedAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_17=(Token)match(input,59,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrimaryAccess().getEntailedKeyword_4_1());
                    			
                    otherlv_18=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2());
                    			
                    // InternalHlvl.g:2568:4: ( (otherlv_19= RULE_ID ) )
                    // InternalHlvl.g:2569:5: (otherlv_19= RULE_ID )
                    {
                    // InternalHlvl.g:2569:5: (otherlv_19= RULE_ID )
                    // InternalHlvl.g:2570:6: otherlv_19= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    					
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_19, grammarAccess.getPrimaryAccess().getElementElmDeclarationCrossReference_4_3_0());
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHlvl.g:2587:3: ( () ( ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) ) ) otherlv_23= '(' ( (lv_left_24_0= rulePrimary ) ) otherlv_25= ',' ( (lv_right_26_0= rulePrimary ) ) otherlv_27= ')' )
                    {
                    // InternalHlvl.g:2587:3: ( () ( ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) ) ) otherlv_23= '(' ( (lv_left_24_0= rulePrimary ) ) otherlv_25= ',' ( (lv_right_26_0= rulePrimary ) ) otherlv_27= ')' )
                    // InternalHlvl.g:2588:4: () ( ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) ) ) otherlv_23= '(' ( (lv_left_24_0= rulePrimary ) ) otherlv_25= ',' ( (lv_right_26_0= rulePrimary ) ) otherlv_27= ')'
                    {
                    // InternalHlvl.g:2588:4: ()
                    // InternalHlvl.g:2589:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getBinaryFunctionAction_5_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2595:4: ( ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) ) )
                    // InternalHlvl.g:2596:5: ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) )
                    {
                    // InternalHlvl.g:2596:5: ( (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' ) )
                    // InternalHlvl.g:2597:6: (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' )
                    {
                    // InternalHlvl.g:2597:6: (lv_op_22_1= 'pow' | lv_op_22_2= 'dist' | lv_op_22_3= 'min' | lv_op_22_4= 'max' | lv_op_22_5= 'if' )
                    int alt28=5;
                    switch ( input.LA(1) ) {
                    case 60:
                        {
                        alt28=1;
                        }
                        break;
                    case 61:
                        {
                        alt28=2;
                        }
                        break;
                    case 62:
                        {
                        alt28=3;
                        }
                        break;
                    case 63:
                        {
                        alt28=4;
                        }
                        break;
                    case 64:
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
                            // InternalHlvl.g:2598:7: lv_op_22_1= 'pow'
                            {
                            lv_op_22_1=(Token)match(input,60,FOLLOW_21); 

                            							newLeafNode(lv_op_22_1, grammarAccess.getPrimaryAccess().getOpPowKeyword_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_22_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalHlvl.g:2609:7: lv_op_22_2= 'dist'
                            {
                            lv_op_22_2=(Token)match(input,61,FOLLOW_21); 

                            							newLeafNode(lv_op_22_2, grammarAccess.getPrimaryAccess().getOpDistKeyword_5_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_22_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalHlvl.g:2620:7: lv_op_22_3= 'min'
                            {
                            lv_op_22_3=(Token)match(input,62,FOLLOW_21); 

                            							newLeafNode(lv_op_22_3, grammarAccess.getPrimaryAccess().getOpMinKeyword_5_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_22_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalHlvl.g:2631:7: lv_op_22_4= 'max'
                            {
                            lv_op_22_4=(Token)match(input,63,FOLLOW_21); 

                            							newLeafNode(lv_op_22_4, grammarAccess.getPrimaryAccess().getOpMaxKeyword_5_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_22_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalHlvl.g:2642:7: lv_op_22_5= 'if'
                            {
                            lv_op_22_5=(Token)match(input,64,FOLLOW_21); 

                            							newLeafNode(lv_op_22_5, grammarAccess.getPrimaryAccess().getOpIfKeyword_5_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_22_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_23=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_5_2());
                    			
                    // InternalHlvl.g:2659:4: ( (lv_left_24_0= rulePrimary ) )
                    // InternalHlvl.g:2660:5: (lv_left_24_0= rulePrimary )
                    {
                    // InternalHlvl.g:2660:5: (lv_left_24_0= rulePrimary )
                    // InternalHlvl.g:2661:6: lv_left_24_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_left_24_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_24_0,
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,33,FOLLOW_14); 

                    				newLeafNode(otherlv_25, grammarAccess.getPrimaryAccess().getCommaKeyword_5_4());
                    			
                    // InternalHlvl.g:2682:4: ( (lv_right_26_0= rulePrimary ) )
                    // InternalHlvl.g:2683:5: (lv_right_26_0= rulePrimary )
                    {
                    // InternalHlvl.g:2683:5: (lv_right_26_0= rulePrimary )
                    // InternalHlvl.g:2684:6: lv_right_26_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getRightPrimaryParserRuleCall_5_5_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_right_26_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_26_0,
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_27, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_6());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHlvl.g:2707:3: this_Atomic_28= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_28=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_28;
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
    // InternalHlvl.g:2719:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalHlvl.g:2719:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalHlvl.g:2720:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalHlvl.g:2726:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_3=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        EObject lv_attribute_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2732:2: ( ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) ) )
            // InternalHlvl.g:2733:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) )
            {
            // InternalHlvl.g:2733:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 65:
            case 66:
                {
                alt31=1;
                }
                break;
            case RULE_ID:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==EOF||LA31_2==13||(LA31_2>=15 && LA31_2<=19)||LA31_2==26||LA31_2==30||LA31_2==33||LA31_2==36||(LA31_2>=41 && LA31_2<=54)) ) {
                    alt31=2;
                }
                else if ( (LA31_2==67) ) {
                    alt31=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt31=4;
                }
                break;
            case RULE_INT:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalHlvl.g:2734:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    {
                    // InternalHlvl.g:2734:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    // InternalHlvl.g:2735:4: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    {
                    // InternalHlvl.g:2735:4: ()
                    // InternalHlvl.g:2736:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2742:4: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    // InternalHlvl.g:2743:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    {
                    // InternalHlvl.g:2743:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    // InternalHlvl.g:2744:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    {
                    // InternalHlvl.g:2744:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==65) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==66) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalHlvl.g:2745:7: lv_value_1_1= 'true'
                            {
                            lv_value_1_1=(Token)match(input,65,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalHlvl.g:2756:7: lv_value_1_2= 'false'
                            {
                            lv_value_1_2=(Token)match(input,66,FOLLOW_2); 

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
                    // InternalHlvl.g:2771:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalHlvl.g:2771:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalHlvl.g:2772:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalHlvl.g:2772:4: ()
                    // InternalHlvl.g:2773:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2779:4: ( (otherlv_3= RULE_ID ) )
                    // InternalHlvl.g:2780:5: (otherlv_3= RULE_ID )
                    {
                    // InternalHlvl.g:2780:5: (otherlv_3= RULE_ID )
                    // InternalHlvl.g:2781:6: otherlv_3= RULE_ID
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
                    // InternalHlvl.g:2794:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    {
                    // InternalHlvl.g:2794:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    // InternalHlvl.g:2795:4: () ( (lv_attribute_5_0= ruleQualifiedName ) )
                    {
                    // InternalHlvl.g:2795:4: ()
                    // InternalHlvl.g:2796:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getAttributeRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2802:4: ( (lv_attribute_5_0= ruleQualifiedName ) )
                    // InternalHlvl.g:2803:5: (lv_attribute_5_0= ruleQualifiedName )
                    {
                    // InternalHlvl.g:2803:5: (lv_attribute_5_0= ruleQualifiedName )
                    // InternalHlvl.g:2804:6: lv_attribute_5_0= ruleQualifiedName
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
                    // InternalHlvl.g:2823:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalHlvl.g:2823:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalHlvl.g:2824:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalHlvl.g:2824:4: ()
                    // InternalHlvl.g:2825:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getSymbolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2831:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalHlvl.g:2832:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalHlvl.g:2832:5: (lv_value_7_0= RULE_STRING )
                    // InternalHlvl.g:2833:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalHlvl.g:2851:3: ( () ( (lv_value_9_0= RULE_INT ) ) )
                    {
                    // InternalHlvl.g:2851:3: ( () ( (lv_value_9_0= RULE_INT ) ) )
                    // InternalHlvl.g:2852:4: () ( (lv_value_9_0= RULE_INT ) )
                    {
                    // InternalHlvl.g:2852:4: ()
                    // InternalHlvl.g:2853:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2859:4: ( (lv_value_9_0= RULE_INT ) )
                    // InternalHlvl.g:2860:5: (lv_value_9_0= RULE_INT )
                    {
                    // InternalHlvl.g:2860:5: (lv_value_9_0= RULE_INT )
                    // InternalHlvl.g:2861:6: lv_value_9_0= RULE_INT
                    {
                    lv_value_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_9_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_9_0,
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
    // InternalHlvl.g:2882:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalHlvl.g:2882:54: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalHlvl.g:2883:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalHlvl.g:2889:1: ruleQualifiedName returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:2895:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalHlvl.g:2896:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalHlvl.g:2896:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalHlvl.g:2897:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalHlvl.g:2897:3: ( (otherlv_0= RULE_ID ) )
            // InternalHlvl.g:2898:4: (otherlv_0= RULE_ID )
            {
            // InternalHlvl.g:2898:4: (otherlv_0= RULE_ID )
            // InternalHlvl.g:2899:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedNameRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_0, grammarAccess.getQualifiedNameAccess().getElementElmDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1());
            		
            // InternalHlvl.g:2914:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:2915:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:2915:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:2916:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedNameRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getQualifiedNameAccess().getAttElmDeclarationCrossReference_2_0());
            				

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleOperations"
    // InternalHlvl.g:2931:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalHlvl.g:2931:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalHlvl.g:2932:2: iv_ruleOperations= ruleOperations EOF
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
    // InternalHlvl.g:2938:1: ruleOperations returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2944:2: ( ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) )
            // InternalHlvl.g:2945:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            {
            // InternalHlvl.g:2945:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            // InternalHlvl.g:2946:3: ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            {
            // InternalHlvl.g:2946:3: ( (lv_op_0_0= ruleOperation ) )
            // InternalHlvl.g:2947:4: (lv_op_0_0= ruleOperation )
            {
            // InternalHlvl.g:2947:4: (lv_op_0_0= ruleOperation )
            // InternalHlvl.g:2948:5: lv_op_0_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalHlvl.g:2965:3: ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==33) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalHlvl.g:2966:4: (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) )
            	    {
            	    // InternalHlvl.g:2966:4: (otherlv_1= ',' )+
            	    int cnt32=0;
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==33) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalHlvl.g:2967:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,33,FOLLOW_36); 

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

            	    // InternalHlvl.g:2972:4: ( (lv_op_2_0= ruleOperation ) )
            	    // InternalHlvl.g:2973:5: (lv_op_2_0= ruleOperation )
            	    {
            	    // InternalHlvl.g:2973:5: (lv_op_2_0= ruleOperation )
            	    // InternalHlvl.g:2974:6: lv_op_2_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // InternalHlvl.g:2996:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalHlvl.g:2996:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalHlvl.g:2997:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalHlvl.g:3003:1: ruleOperation returns [EObject current=null] : this_Sample_0= ruleSample ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Sample_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3009:2: (this_Sample_0= ruleSample )
            // InternalHlvl.g:3010:2: this_Sample_0= ruleSample
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
    // InternalHlvl.g:3021:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalHlvl.g:3021:47: (iv_ruleSample= ruleSample EOF )
            // InternalHlvl.g:3022:2: iv_ruleSample= ruleSample EOF
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
    // InternalHlvl.g:3028:1: ruleSample returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_valuations_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3034:2: ( ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) )
            // InternalHlvl.g:3035:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            {
            // InternalHlvl.g:3035:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=69 && LA34_0<=72)) ) {
                alt34=1;
            }
            else if ( (LA34_0==68) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalHlvl.g:3036:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    {
                    // InternalHlvl.g:3036:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    // InternalHlvl.g:3037:4: () ( (lv_name_1_0= ruleOperationName ) )
                    {
                    // InternalHlvl.g:3037:4: ()
                    // InternalHlvl.g:3038:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getSingleInstructionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:3044:4: ( (lv_name_1_0= ruleOperationName ) )
                    // InternalHlvl.g:3045:5: (lv_name_1_0= ruleOperationName )
                    {
                    // InternalHlvl.g:3045:5: (lv_name_1_0= ruleOperationName )
                    // InternalHlvl.g:3046:6: lv_name_1_0= ruleOperationName
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
                    // InternalHlvl.g:3065:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    {
                    // InternalHlvl.g:3065:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    // InternalHlvl.g:3066:4: () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')'
                    {
                    // InternalHlvl.g:3066:4: ()
                    // InternalHlvl.g:3067:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getValidConfAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,68,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getValidConfigurationKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalHlvl.g:3081:4: ( (lv_valuations_5_0= ruleListOfValuation ) )
                    // InternalHlvl.g:3082:5: (lv_valuations_5_0= ruleListOfValuation )
                    {
                    // InternalHlvl.g:3082:5: (lv_valuations_5_0= ruleListOfValuation )
                    // InternalHlvl.g:3083:6: lv_valuations_5_0= ruleListOfValuation
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

                    otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalHlvl.g:3109:1: entryRuleOperationName returns [String current=null] : iv_ruleOperationName= ruleOperationName EOF ;
    public final String entryRuleOperationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationName = null;


        try {
            // InternalHlvl.g:3109:53: (iv_ruleOperationName= ruleOperationName EOF )
            // InternalHlvl.g:3110:2: iv_ruleOperationName= ruleOperationName EOF
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
    // InternalHlvl.g:3116:1: ruleOperationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) ;
    public final AntlrDatatypeRuleToken ruleOperationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3122:2: ( (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) )
            // InternalHlvl.g:3123:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            {
            // InternalHlvl.g:3123:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt35=1;
                }
                break;
            case 70:
                {
                alt35=2;
                }
                break;
            case 71:
                {
                alt35=3;
                }
                break;
            case 72:
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
                    // InternalHlvl.g:3124:3: kw= 'validModel'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getValidModelKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3130:3: kw= 'numberOfConfigurations'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getNumberOfConfigurationsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3136:3: kw= 'findConfiguration'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getFindConfigurationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:3142:3: kw= 'findAllConfigurations'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

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


    // $ANTLR start "entryRuleListOfValues"
    // InternalHlvl.g:3151:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalHlvl.g:3151:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalHlvl.g:3152:2: iv_ruleListOfValues= ruleListOfValues EOF
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
    // InternalHlvl.g:3158:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3164:2: ( ( ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )* ) )
            // InternalHlvl.g:3165:2: ( ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )* )
            {
            // InternalHlvl.g:3165:2: ( ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )* )
            // InternalHlvl.g:3166:3: ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )*
            {
            // InternalHlvl.g:3166:3: ( (lv_values_0_0= ruleRelational ) )
            // InternalHlvl.g:3167:4: (lv_values_0_0= ruleRelational )
            {
            // InternalHlvl.g:3167:4: (lv_values_0_0= ruleRelational )
            // InternalHlvl.g:3168:5: lv_values_0_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesRelationalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_values_0_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:3185:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==33) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalHlvl.g:3186:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) )
            	    {
            	    // InternalHlvl.g:3186:4: (otherlv_1= ',' )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==33) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3187:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,33,FOLLOW_37); 

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

            	    // InternalHlvl.g:3192:4: ( (lv_values_2_0= ruleRelational ) )
            	    // InternalHlvl.g:3193:5: (lv_values_2_0= ruleRelational )
            	    {
            	    // InternalHlvl.g:3193:5: (lv_values_2_0= ruleRelational )
            	    // InternalHlvl.g:3194:6: lv_values_2_0= ruleRelational
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesRelationalParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_values_2_0=ruleRelational();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"com.coffee.Hlvl.Relational");
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
    // InternalHlvl.g:3216:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalHlvl.g:3216:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalHlvl.g:3217:2: iv_ruleListOfIDs= ruleListOfIDs EOF
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
    // InternalHlvl.g:3223:1: ruleListOfIDs returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHlvl.g:3229:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3230:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3230:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            // InternalHlvl.g:3231:3: () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3231:3: ()
            // InternalHlvl.g:3232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListOfIDsAccess().getListOfIDsAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:3238:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3239:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3239:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3240:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfIDsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_1_0());
            				

            }


            }

            // InternalHlvl.g:3251:3: ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==33) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalHlvl.g:3252:4: (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3252:4: (otherlv_2= ',' )+
            	    int cnt38=0;
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==33) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3253:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,33,FOLLOW_38); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getListOfIDsAccess().getCommaKeyword_2_0());
            	    	    				

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

            	    // InternalHlvl.g:3258:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalHlvl.g:3259:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalHlvl.g:3259:5: (otherlv_3= RULE_ID )
            	    // InternalHlvl.g:3260:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfIDsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    						newLeafNode(otherlv_3, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_2_1_0());
            	    					

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


    // $ANTLR start "entryRuleMixedList"
    // InternalHlvl.g:3276:1: entryRuleMixedList returns [EObject current=null] : iv_ruleMixedList= ruleMixedList EOF ;
    public final EObject entryRuleMixedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixedList = null;


        try {
            // InternalHlvl.g:3276:50: (iv_ruleMixedList= ruleMixedList EOF )
            // InternalHlvl.g:3277:2: iv_ruleMixedList= ruleMixedList EOF
            {
             newCompositeNode(grammarAccess.getMixedListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixedList=ruleMixedList();

            state._fsp--;

             current =iv_ruleMixedList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMixedList"


    // $ANTLR start "ruleMixedList"
    // InternalHlvl.g:3283:1: ruleMixedList returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleMixedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHlvl.g:3289:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3290:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3290:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            // InternalHlvl.g:3291:3: () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3291:3: ()
            // InternalHlvl.g:3292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMixedListAccess().getMixedListAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:3298:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3299:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3299:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3300:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixedListRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getMixedListAccess().getIdsNamedItemCrossReference_1_0());
            				

            }


            }

            // InternalHlvl.g:3311:3: ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==33) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalHlvl.g:3312:4: (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3312:4: (otherlv_2= ',' )+
            	    int cnt40=0;
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==33) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3313:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,33,FOLLOW_38); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getMixedListAccess().getCommaKeyword_2_0());
            	    	    				

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

            	    // InternalHlvl.g:3318:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalHlvl.g:3319:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalHlvl.g:3319:5: (otherlv_3= RULE_ID )
            	    // InternalHlvl.g:3320:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMixedListRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMixedListAccess().getIdsNamedItemCrossReference_2_1_0());
            	    					

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
    // $ANTLR end "ruleMixedList"


    // $ANTLR start "entryRuleValuation"
    // InternalHlvl.g:3336:1: entryRuleValuation returns [EObject current=null] : iv_ruleValuation= ruleValuation EOF ;
    public final EObject entryRuleValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuation = null;


        try {
            // InternalHlvl.g:3336:50: (iv_ruleValuation= ruleValuation EOF )
            // InternalHlvl.g:3337:2: iv_ruleValuation= ruleValuation EOF
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
    // InternalHlvl.g:3343:1: ruleValuation returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')' ) ;
    public final EObject ruleValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3349:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')' ) )
            // InternalHlvl.g:3350:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')' )
            {
            // InternalHlvl.g:3350:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')' )
            // InternalHlvl.g:3351:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValuationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalHlvl.g:3355:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3356:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3356:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3357:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValuationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getValuationAccess().getElementElmDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getValuationAccess().getCommaKeyword_2());
            		
            // InternalHlvl.g:3372:3: ( (lv_value_3_0= ruleRelational ) )
            // InternalHlvl.g:3373:4: (lv_value_3_0= ruleRelational )
            {
            // InternalHlvl.g:3373:4: (lv_value_3_0= ruleRelational )
            // InternalHlvl.g:3374:5: lv_value_3_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getValuationAccess().getValueRelationalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_3_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValuationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

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
    // InternalHlvl.g:3399:1: entryRuleListOfValuation returns [EObject current=null] : iv_ruleListOfValuation= ruleListOfValuation EOF ;
    public final EObject entryRuleListOfValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValuation = null;


        try {
            // InternalHlvl.g:3399:56: (iv_ruleListOfValuation= ruleListOfValuation EOF )
            // InternalHlvl.g:3400:2: iv_ruleListOfValuation= ruleListOfValuation EOF
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
    // InternalHlvl.g:3406:1: ruleListOfValuation returns [EObject current=null] : ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) ;
    public final EObject ruleListOfValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pairs_0_0 = null;

        EObject lv_pairs_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3412:2: ( ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) )
            // InternalHlvl.g:3413:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            {
            // InternalHlvl.g:3413:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            // InternalHlvl.g:3414:3: ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            {
            // InternalHlvl.g:3414:3: ( (lv_pairs_0_0= ruleValuation ) )
            // InternalHlvl.g:3415:4: (lv_pairs_0_0= ruleValuation )
            {
            // InternalHlvl.g:3415:4: (lv_pairs_0_0= ruleValuation )
            // InternalHlvl.g:3416:5: lv_pairs_0_0= ruleValuation
            {

            					newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalHlvl.g:3433:3: ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==33) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalHlvl.g:3434:4: (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) )
            	    {
            	    // InternalHlvl.g:3434:4: (otherlv_1= ',' )+
            	    int cnt42=0;
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==33) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3435:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,33,FOLLOW_39); 

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

            	    // InternalHlvl.g:3440:4: ( (lv_pairs_2_0= ruleValuation ) )
            	    // InternalHlvl.g:3441:5: (lv_pairs_2_0= ruleValuation )
            	    {
            	    // InternalHlvl.g:3441:5: (lv_pairs_2_0= ruleValuation )
            	    // InternalHlvl.g:3442:6: lv_pairs_2_0= ruleValuation
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\34\1\uffff\2\35\5\uffff\2\4\1\41\2\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\50\1\uffff\2\35\5\uffff\2\35\1\41\2\uffff\1\31\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\3\uffff\1\11\1\12\1\uffff\1\3\1\2";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\uffff\1\10\2\4\1\7",
            "",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\13\30\uffff\1\14",
            "\1\13\30\uffff\1\15",
            "\1\16",
            "",
            "",
            "\1\20\24\uffff\1\17",
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
            return "683:2: (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xFF80000020000070L,0x0000000000000007L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001ED90000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0060001000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xFF80000220000070L,0x0000000000000007L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000220000000L});

}