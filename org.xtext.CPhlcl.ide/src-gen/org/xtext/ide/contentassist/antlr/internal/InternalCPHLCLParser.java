package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.CPHLCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCPHLCLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'mod'", "'true'", "'false'", "'one'", "'two'", "'boolean'", "'integer'", "'symbolic'", "'at_most'", "'all_different'", "'pow'", "'dist'", "'min'", "'max'", "'abs'", "'sqrt'", "'model'", "'variables:'", "'constraints:'", "'strategy:'", "'domain:'", "'..'", "'['", "']'", "':'", "'<=>'", "'=>'", "'OR'", "'AND'", "'+'", "'-'", "'('", "')'", "'~'", "','"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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


        public InternalCPHLCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCPHLCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCPHLCLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCPHLCL.g"; }


    	private CPHLCLGrammarAccess grammarAccess;

    	public void setGrammarAccess(CPHLCLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalCPHLCL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCPHLCL.g:54:1: ( ruleModel EOF )
            // InternalCPHLCL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCPHLCL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalCPHLCL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalCPHLCL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalCPHLCL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalCPHLCL.g:69:3: ( rule__Model__Group__0 )
            // InternalCPHLCL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariable"
    // InternalCPHLCL.g:78:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalCPHLCL.g:79:1: ( ruleVariable EOF )
            // InternalCPHLCL.g:80:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalCPHLCL.g:87:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:91:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalCPHLCL.g:92:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalCPHLCL.g:92:2: ( ( rule__Variable__Group__0 ) )
            // InternalCPHLCL.g:93:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalCPHLCL.g:94:3: ( rule__Variable__Group__0 )
            // InternalCPHLCL.g:94:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleDomainDeclaration"
    // InternalCPHLCL.g:103:1: entryRuleDomainDeclaration : ruleDomainDeclaration EOF ;
    public final void entryRuleDomainDeclaration() throws RecognitionException {
        try {
            // InternalCPHLCL.g:104:1: ( ruleDomainDeclaration EOF )
            // InternalCPHLCL.g:105:1: ruleDomainDeclaration EOF
            {
             before(grammarAccess.getDomainDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainDeclaration();

            state._fsp--;

             after(grammarAccess.getDomainDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainDeclaration"


    // $ANTLR start "ruleDomainDeclaration"
    // InternalCPHLCL.g:112:1: ruleDomainDeclaration : ( ( rule__DomainDeclaration__Alternatives ) ) ;
    public final void ruleDomainDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:116:2: ( ( ( rule__DomainDeclaration__Alternatives ) ) )
            // InternalCPHLCL.g:117:2: ( ( rule__DomainDeclaration__Alternatives ) )
            {
            // InternalCPHLCL.g:117:2: ( ( rule__DomainDeclaration__Alternatives ) )
            // InternalCPHLCL.g:118:3: ( rule__DomainDeclaration__Alternatives )
            {
             before(grammarAccess.getDomainDeclarationAccess().getAlternatives()); 
            // InternalCPHLCL.g:119:3: ( rule__DomainDeclaration__Alternatives )
            // InternalCPHLCL.g:119:4: rule__DomainDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDomainDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainDeclaration"


    // $ANTLR start "entryRuleInterval"
    // InternalCPHLCL.g:128:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalCPHLCL.g:129:1: ( ruleInterval EOF )
            // InternalCPHLCL.g:130:1: ruleInterval EOF
            {
             before(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getIntervalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalCPHLCL.g:137:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:141:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalCPHLCL.g:142:2: ( ( rule__Interval__Group__0 ) )
            {
            // InternalCPHLCL.g:142:2: ( ( rule__Interval__Group__0 ) )
            // InternalCPHLCL.g:143:3: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // InternalCPHLCL.g:144:3: ( rule__Interval__Group__0 )
            // InternalCPHLCL.g:144:4: rule__Interval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleEnumeration"
    // InternalCPHLCL.g:153:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalCPHLCL.g:154:1: ( ruleEnumeration EOF )
            // InternalCPHLCL.g:155:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalCPHLCL.g:162:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:166:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalCPHLCL.g:167:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalCPHLCL.g:167:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalCPHLCL.g:168:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalCPHLCL.g:169:3: ( rule__Enumeration__Group__0 )
            // InternalCPHLCL.g:169:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleConstraint"
    // InternalCPHLCL.g:178:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalCPHLCL.g:179:1: ( ruleConstraint EOF )
            // InternalCPHLCL.g:180:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCPHLCL.g:187:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:191:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalCPHLCL.g:192:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalCPHLCL.g:192:2: ( ( rule__Constraint__Group__0 ) )
            // InternalCPHLCL.g:193:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalCPHLCL.g:194:3: ( rule__Constraint__Group__0 )
            // InternalCPHLCL.g:194:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleExpression"
    // InternalCPHLCL.g:203:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalCPHLCL.g:204:1: ( ruleExpression EOF )
            // InternalCPHLCL.g:205:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCPHLCL.g:212:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:216:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalCPHLCL.g:217:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalCPHLCL.g:217:2: ( ( rule__Expression__Alternatives ) )
            // InternalCPHLCL.g:218:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalCPHLCL.g:219:3: ( rule__Expression__Alternatives )
            // InternalCPHLCL.g:219:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleRelational"
    // InternalCPHLCL.g:228:1: entryRuleRelational : ruleRelational EOF ;
    public final void entryRuleRelational() throws RecognitionException {
        try {
            // InternalCPHLCL.g:229:1: ( ruleRelational EOF )
            // InternalCPHLCL.g:230:1: ruleRelational EOF
            {
             before(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_1);
            ruleRelational();

            state._fsp--;

             after(grammarAccess.getRelationalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelational"


    // $ANTLR start "ruleRelational"
    // InternalCPHLCL.g:237:1: ruleRelational : ( ruleIff ) ;
    public final void ruleRelational() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:241:2: ( ( ruleIff ) )
            // InternalCPHLCL.g:242:2: ( ruleIff )
            {
            // InternalCPHLCL.g:242:2: ( ruleIff )
            // InternalCPHLCL.g:243:3: ruleIff
            {
             before(grammarAccess.getRelationalAccess().getIffParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleIff();

            state._fsp--;

             after(grammarAccess.getRelationalAccess().getIffParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelational"


    // $ANTLR start "entryRuleIff"
    // InternalCPHLCL.g:253:1: entryRuleIff : ruleIff EOF ;
    public final void entryRuleIff() throws RecognitionException {
        try {
            // InternalCPHLCL.g:254:1: ( ruleIff EOF )
            // InternalCPHLCL.g:255:1: ruleIff EOF
            {
             before(grammarAccess.getIffRule()); 
            pushFollow(FOLLOW_1);
            ruleIff();

            state._fsp--;

             after(grammarAccess.getIffRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIff"


    // $ANTLR start "ruleIff"
    // InternalCPHLCL.g:262:1: ruleIff : ( ( rule__Iff__Group__0 ) ) ;
    public final void ruleIff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:266:2: ( ( ( rule__Iff__Group__0 ) ) )
            // InternalCPHLCL.g:267:2: ( ( rule__Iff__Group__0 ) )
            {
            // InternalCPHLCL.g:267:2: ( ( rule__Iff__Group__0 ) )
            // InternalCPHLCL.g:268:3: ( rule__Iff__Group__0 )
            {
             before(grammarAccess.getIffAccess().getGroup()); 
            // InternalCPHLCL.g:269:3: ( rule__Iff__Group__0 )
            // InternalCPHLCL.g:269:4: rule__Iff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Iff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIffAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIff"


    // $ANTLR start "entryRuleImplies"
    // InternalCPHLCL.g:278:1: entryRuleImplies : ruleImplies EOF ;
    public final void entryRuleImplies() throws RecognitionException {
        try {
            // InternalCPHLCL.g:279:1: ( ruleImplies EOF )
            // InternalCPHLCL.g:280:1: ruleImplies EOF
            {
             before(grammarAccess.getImpliesRule()); 
            pushFollow(FOLLOW_1);
            ruleImplies();

            state._fsp--;

             after(grammarAccess.getImpliesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplies"


    // $ANTLR start "ruleImplies"
    // InternalCPHLCL.g:287:1: ruleImplies : ( ( rule__Implies__Group__0 ) ) ;
    public final void ruleImplies() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:291:2: ( ( ( rule__Implies__Group__0 ) ) )
            // InternalCPHLCL.g:292:2: ( ( rule__Implies__Group__0 ) )
            {
            // InternalCPHLCL.g:292:2: ( ( rule__Implies__Group__0 ) )
            // InternalCPHLCL.g:293:3: ( rule__Implies__Group__0 )
            {
             before(grammarAccess.getImpliesAccess().getGroup()); 
            // InternalCPHLCL.g:294:3: ( rule__Implies__Group__0 )
            // InternalCPHLCL.g:294:4: rule__Implies__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Implies__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImpliesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalCPHLCL.g:303:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalCPHLCL.g:304:1: ( ruleOr EOF )
            // InternalCPHLCL.g:305:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalCPHLCL.g:312:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:316:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalCPHLCL.g:317:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalCPHLCL.g:317:2: ( ( rule__Or__Group__0 ) )
            // InternalCPHLCL.g:318:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalCPHLCL.g:319:3: ( rule__Or__Group__0 )
            // InternalCPHLCL.g:319:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalCPHLCL.g:328:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalCPHLCL.g:329:1: ( ruleAnd EOF )
            // InternalCPHLCL.g:330:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalCPHLCL.g:337:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:341:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalCPHLCL.g:342:2: ( ( rule__And__Group__0 ) )
            {
            // InternalCPHLCL.g:342:2: ( ( rule__And__Group__0 ) )
            // InternalCPHLCL.g:343:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalCPHLCL.g:344:3: ( rule__And__Group__0 )
            // InternalCPHLCL.g:344:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalCPHLCL.g:353:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalCPHLCL.g:354:1: ( ruleEquality EOF )
            // InternalCPHLCL.g:355:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalCPHLCL.g:362:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:366:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalCPHLCL.g:367:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalCPHLCL.g:367:2: ( ( rule__Equality__Group__0 ) )
            // InternalCPHLCL.g:368:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalCPHLCL.g:369:3: ( rule__Equality__Group__0 )
            // InternalCPHLCL.g:369:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalCPHLCL.g:378:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalCPHLCL.g:379:1: ( ruleComparison EOF )
            // InternalCPHLCL.g:380:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalCPHLCL.g:387:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:391:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalCPHLCL.g:392:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalCPHLCL.g:392:2: ( ( rule__Comparison__Group__0 ) )
            // InternalCPHLCL.g:393:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalCPHLCL.g:394:3: ( rule__Comparison__Group__0 )
            // InternalCPHLCL.g:394:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalCPHLCL.g:403:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalCPHLCL.g:404:1: ( rulePlusOrMinus EOF )
            // InternalCPHLCL.g:405:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalCPHLCL.g:412:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:416:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalCPHLCL.g:417:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalCPHLCL.g:417:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalCPHLCL.g:418:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalCPHLCL.g:419:3: ( rule__PlusOrMinus__Group__0 )
            // InternalCPHLCL.g:419:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalCPHLCL.g:428:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalCPHLCL.g:429:1: ( ruleMulOrDiv EOF )
            // InternalCPHLCL.g:430:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalCPHLCL.g:437:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:441:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalCPHLCL.g:442:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalCPHLCL.g:442:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalCPHLCL.g:443:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalCPHLCL.g:444:3: ( rule__MulOrDiv__Group__0 )
            // InternalCPHLCL.g:444:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalCPHLCL.g:453:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalCPHLCL.g:454:1: ( rulePrimary EOF )
            // InternalCPHLCL.g:455:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalCPHLCL.g:462:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:466:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalCPHLCL.g:467:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalCPHLCL.g:467:2: ( ( rule__Primary__Alternatives ) )
            // InternalCPHLCL.g:468:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalCPHLCL.g:469:3: ( rule__Primary__Alternatives )
            // InternalCPHLCL.g:469:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalCPHLCL.g:478:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalCPHLCL.g:479:1: ( ruleAtomic EOF )
            // InternalCPHLCL.g:480:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalCPHLCL.g:487:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:491:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalCPHLCL.g:492:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalCPHLCL.g:492:2: ( ( rule__Atomic__Alternatives ) )
            // InternalCPHLCL.g:493:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalCPHLCL.g:494:3: ( rule__Atomic__Alternatives )
            // InternalCPHLCL.g:494:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleGlobal"
    // InternalCPHLCL.g:503:1: entryRuleGlobal : ruleGlobal EOF ;
    public final void entryRuleGlobal() throws RecognitionException {
        try {
            // InternalCPHLCL.g:504:1: ( ruleGlobal EOF )
            // InternalCPHLCL.g:505:1: ruleGlobal EOF
            {
             before(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getGlobalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalCPHLCL.g:512:1: ruleGlobal : ( ( rule__Global__Group__0 ) ) ;
    public final void ruleGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:516:2: ( ( ( rule__Global__Group__0 ) ) )
            // InternalCPHLCL.g:517:2: ( ( rule__Global__Group__0 ) )
            {
            // InternalCPHLCL.g:517:2: ( ( rule__Global__Group__0 ) )
            // InternalCPHLCL.g:518:3: ( rule__Global__Group__0 )
            {
             before(grammarAccess.getGlobalAccess().getGroup()); 
            // InternalCPHLCL.g:519:3: ( rule__Global__Group__0 )
            // InternalCPHLCL.g:519:4: rule__Global__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleStrategy"
    // InternalCPHLCL.g:528:1: entryRuleStrategy : ruleStrategy EOF ;
    public final void entryRuleStrategy() throws RecognitionException {
        try {
            // InternalCPHLCL.g:529:1: ( ruleStrategy EOF )
            // InternalCPHLCL.g:530:1: ruleStrategy EOF
            {
             before(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getStrategyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalCPHLCL.g:537:1: ruleStrategy : ( ( rule__Strategy__Alternatives ) ) ;
    public final void ruleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:541:2: ( ( ( rule__Strategy__Alternatives ) ) )
            // InternalCPHLCL.g:542:2: ( ( rule__Strategy__Alternatives ) )
            {
            // InternalCPHLCL.g:542:2: ( ( rule__Strategy__Alternatives ) )
            // InternalCPHLCL.g:543:3: ( rule__Strategy__Alternatives )
            {
             before(grammarAccess.getStrategyAccess().getAlternatives()); 
            // InternalCPHLCL.g:544:3: ( rule__Strategy__Alternatives )
            // InternalCPHLCL.g:544:4: rule__Strategy__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Strategy__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStrategyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleBoolVal"
    // InternalCPHLCL.g:553:1: entryRuleBoolVal : ruleBoolVal EOF ;
    public final void entryRuleBoolVal() throws RecognitionException {
        try {
            // InternalCPHLCL.g:554:1: ( ruleBoolVal EOF )
            // InternalCPHLCL.g:555:1: ruleBoolVal EOF
            {
             before(grammarAccess.getBoolValRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolVal();

            state._fsp--;

             after(grammarAccess.getBoolValRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolVal"


    // $ANTLR start "ruleBoolVal"
    // InternalCPHLCL.g:562:1: ruleBoolVal : ( ( rule__BoolVal__ValueAssignment ) ) ;
    public final void ruleBoolVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:566:2: ( ( ( rule__BoolVal__ValueAssignment ) ) )
            // InternalCPHLCL.g:567:2: ( ( rule__BoolVal__ValueAssignment ) )
            {
            // InternalCPHLCL.g:567:2: ( ( rule__BoolVal__ValueAssignment ) )
            // InternalCPHLCL.g:568:3: ( rule__BoolVal__ValueAssignment )
            {
             before(grammarAccess.getBoolValAccess().getValueAssignment()); 
            // InternalCPHLCL.g:569:3: ( rule__BoolVal__ValueAssignment )
            // InternalCPHLCL.g:569:4: rule__BoolVal__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BoolVal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBoolValAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolVal"


    // $ANTLR start "entryRuleNumber"
    // InternalCPHLCL.g:578:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalCPHLCL.g:579:1: ( ruleNumber EOF )
            // InternalCPHLCL.g:580:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalCPHLCL.g:587:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:591:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalCPHLCL.g:592:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalCPHLCL.g:592:2: ( ( rule__Number__ValueAssignment ) )
            // InternalCPHLCL.g:593:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalCPHLCL.g:594:3: ( rule__Number__ValueAssignment )
            // InternalCPHLCL.g:594:4: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleSymbol"
    // InternalCPHLCL.g:603:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalCPHLCL.g:604:1: ( ruleSymbol EOF )
            // InternalCPHLCL.g:605:1: ruleSymbol EOF
            {
             before(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getSymbolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalCPHLCL.g:612:1: ruleSymbol : ( ( rule__Symbol__ValueAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:616:2: ( ( ( rule__Symbol__ValueAssignment ) ) )
            // InternalCPHLCL.g:617:2: ( ( rule__Symbol__ValueAssignment ) )
            {
            // InternalCPHLCL.g:617:2: ( ( rule__Symbol__ValueAssignment ) )
            // InternalCPHLCL.g:618:3: ( rule__Symbol__ValueAssignment )
            {
             before(grammarAccess.getSymbolAccess().getValueAssignment()); 
            // InternalCPHLCL.g:619:3: ( rule__Symbol__ValueAssignment )
            // InternalCPHLCL.g:619:4: rule__Symbol__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleValue"
    // InternalCPHLCL.g:628:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalCPHLCL.g:629:1: ( ruleValue EOF )
            // InternalCPHLCL.g:630:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalCPHLCL.g:637:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:641:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalCPHLCL.g:642:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalCPHLCL.g:642:2: ( ( rule__Value__Alternatives ) )
            // InternalCPHLCL.g:643:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalCPHLCL.g:644:3: ( rule__Value__Alternatives )
            // InternalCPHLCL.g:644:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleNonEnumerableValue"
    // InternalCPHLCL.g:653:1: entryRuleNonEnumerableValue : ruleNonEnumerableValue EOF ;
    public final void entryRuleNonEnumerableValue() throws RecognitionException {
        try {
            // InternalCPHLCL.g:654:1: ( ruleNonEnumerableValue EOF )
            // InternalCPHLCL.g:655:1: ruleNonEnumerableValue EOF
            {
             before(grammarAccess.getNonEnumerableValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNonEnumerableValue();

            state._fsp--;

             after(grammarAccess.getNonEnumerableValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonEnumerableValue"


    // $ANTLR start "ruleNonEnumerableValue"
    // InternalCPHLCL.g:662:1: ruleNonEnumerableValue : ( ( rule__NonEnumerableValue__Alternatives ) ) ;
    public final void ruleNonEnumerableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:666:2: ( ( ( rule__NonEnumerableValue__Alternatives ) ) )
            // InternalCPHLCL.g:667:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            {
            // InternalCPHLCL.g:667:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            // InternalCPHLCL.g:668:3: ( rule__NonEnumerableValue__Alternatives )
            {
             before(grammarAccess.getNonEnumerableValueAccess().getAlternatives()); 
            // InternalCPHLCL.g:669:3: ( rule__NonEnumerableValue__Alternatives )
            // InternalCPHLCL.g:669:4: rule__NonEnumerableValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NonEnumerableValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNonEnumerableValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonEnumerableValue"


    // $ANTLR start "entryRuleVarType"
    // InternalCPHLCL.g:678:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalCPHLCL.g:679:1: ( ruleVarType EOF )
            // InternalCPHLCL.g:680:1: ruleVarType EOF
            {
             before(grammarAccess.getVarTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getVarTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalCPHLCL.g:687:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:691:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalCPHLCL.g:692:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalCPHLCL.g:692:2: ( ( rule__VarType__Alternatives ) )
            // InternalCPHLCL.g:693:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalCPHLCL.g:694:3: ( rule__VarType__Alternatives )
            // InternalCPHLCL.g:694:4: rule__VarType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VarType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVarTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleGlobalOp"
    // InternalCPHLCL.g:703:1: entryRuleGlobalOp : ruleGlobalOp EOF ;
    public final void entryRuleGlobalOp() throws RecognitionException {
        try {
            // InternalCPHLCL.g:704:1: ( ruleGlobalOp EOF )
            // InternalCPHLCL.g:705:1: ruleGlobalOp EOF
            {
             before(grammarAccess.getGlobalOpRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalOp();

            state._fsp--;

             after(grammarAccess.getGlobalOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalOp"


    // $ANTLR start "ruleGlobalOp"
    // InternalCPHLCL.g:712:1: ruleGlobalOp : ( ( rule__GlobalOp__Alternatives ) ) ;
    public final void ruleGlobalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:716:2: ( ( ( rule__GlobalOp__Alternatives ) ) )
            // InternalCPHLCL.g:717:2: ( ( rule__GlobalOp__Alternatives ) )
            {
            // InternalCPHLCL.g:717:2: ( ( rule__GlobalOp__Alternatives ) )
            // InternalCPHLCL.g:718:3: ( rule__GlobalOp__Alternatives )
            {
             before(grammarAccess.getGlobalOpAccess().getAlternatives()); 
            // InternalCPHLCL.g:719:3: ( rule__GlobalOp__Alternatives )
            // InternalCPHLCL.g:719:4: rule__GlobalOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GlobalOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGlobalOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalOp"


    // $ANTLR start "entryRuleFunctionOp"
    // InternalCPHLCL.g:728:1: entryRuleFunctionOp : ruleFunctionOp EOF ;
    public final void entryRuleFunctionOp() throws RecognitionException {
        try {
            // InternalCPHLCL.g:729:1: ( ruleFunctionOp EOF )
            // InternalCPHLCL.g:730:1: ruleFunctionOp EOF
            {
             before(grammarAccess.getFunctionOpRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionOp();

            state._fsp--;

             after(grammarAccess.getFunctionOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionOp"


    // $ANTLR start "ruleFunctionOp"
    // InternalCPHLCL.g:737:1: ruleFunctionOp : ( ( rule__FunctionOp__Alternatives ) ) ;
    public final void ruleFunctionOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:741:2: ( ( ( rule__FunctionOp__Alternatives ) ) )
            // InternalCPHLCL.g:742:2: ( ( rule__FunctionOp__Alternatives ) )
            {
            // InternalCPHLCL.g:742:2: ( ( rule__FunctionOp__Alternatives ) )
            // InternalCPHLCL.g:743:3: ( rule__FunctionOp__Alternatives )
            {
             before(grammarAccess.getFunctionOpAccess().getAlternatives()); 
            // InternalCPHLCL.g:744:3: ( rule__FunctionOp__Alternatives )
            // InternalCPHLCL.g:744:4: rule__FunctionOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionOp"


    // $ANTLR start "entryRuleUnaryOp"
    // InternalCPHLCL.g:753:1: entryRuleUnaryOp : ruleUnaryOp EOF ;
    public final void entryRuleUnaryOp() throws RecognitionException {
        try {
            // InternalCPHLCL.g:754:1: ( ruleUnaryOp EOF )
            // InternalCPHLCL.g:755:1: ruleUnaryOp EOF
            {
             before(grammarAccess.getUnaryOpRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryOp();

            state._fsp--;

             after(grammarAccess.getUnaryOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryOp"


    // $ANTLR start "ruleUnaryOp"
    // InternalCPHLCL.g:762:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:766:2: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // InternalCPHLCL.g:767:2: ( ( rule__UnaryOp__Alternatives ) )
            {
            // InternalCPHLCL.g:767:2: ( ( rule__UnaryOp__Alternatives ) )
            // InternalCPHLCL.g:768:3: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // InternalCPHLCL.g:769:3: ( rule__UnaryOp__Alternatives )
            // InternalCPHLCL.g:769:4: rule__UnaryOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "entryRuleListOfValues"
    // InternalCPHLCL.g:778:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalCPHLCL.g:779:1: ( ruleListOfValues EOF )
            // InternalCPHLCL.g:780:1: ruleListOfValues EOF
            {
             before(grammarAccess.getListOfValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getListOfValuesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListOfValues"


    // $ANTLR start "ruleListOfValues"
    // InternalCPHLCL.g:787:1: ruleListOfValues : ( ( rule__ListOfValues__Group__0 ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:791:2: ( ( ( rule__ListOfValues__Group__0 ) ) )
            // InternalCPHLCL.g:792:2: ( ( rule__ListOfValues__Group__0 ) )
            {
            // InternalCPHLCL.g:792:2: ( ( rule__ListOfValues__Group__0 ) )
            // InternalCPHLCL.g:793:3: ( rule__ListOfValues__Group__0 )
            {
             before(grammarAccess.getListOfValuesAccess().getGroup()); 
            // InternalCPHLCL.g:794:3: ( rule__ListOfValues__Group__0 )
            // InternalCPHLCL.g:794:4: rule__ListOfValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOfValues"


    // $ANTLR start "entryRuleListOfListValues"
    // InternalCPHLCL.g:803:1: entryRuleListOfListValues : ruleListOfListValues EOF ;
    public final void entryRuleListOfListValues() throws RecognitionException {
        try {
            // InternalCPHLCL.g:804:1: ( ruleListOfListValues EOF )
            // InternalCPHLCL.g:805:1: ruleListOfListValues EOF
            {
             before(grammarAccess.getListOfListValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfListValues();

            state._fsp--;

             after(grammarAccess.getListOfListValuesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListOfListValues"


    // $ANTLR start "ruleListOfListValues"
    // InternalCPHLCL.g:812:1: ruleListOfListValues : ( ( rule__ListOfListValues__Group__0 ) ) ;
    public final void ruleListOfListValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:816:2: ( ( ( rule__ListOfListValues__Group__0 ) ) )
            // InternalCPHLCL.g:817:2: ( ( rule__ListOfListValues__Group__0 ) )
            {
            // InternalCPHLCL.g:817:2: ( ( rule__ListOfListValues__Group__0 ) )
            // InternalCPHLCL.g:818:3: ( rule__ListOfListValues__Group__0 )
            {
             before(grammarAccess.getListOfListValuesAccess().getGroup()); 
            // InternalCPHLCL.g:819:3: ( rule__ListOfListValues__Group__0 )
            // InternalCPHLCL.g:819:4: rule__ListOfListValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfListValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOfListValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalCPHLCL.g:828:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalCPHLCL.g:829:1: ( ruleListOfIDs EOF )
            // InternalCPHLCL.g:830:1: ruleListOfIDs EOF
            {
             before(grammarAccess.getListOfIDsRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getListOfIDsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListOfIDs"


    // $ANTLR start "ruleListOfIDs"
    // InternalCPHLCL.g:837:1: ruleListOfIDs : ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:841:2: ( ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) )
            // InternalCPHLCL.g:842:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            {
            // InternalCPHLCL.g:842:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            // InternalCPHLCL.g:843:3: ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* )
            {
            // InternalCPHLCL.g:843:3: ( ( rule__ListOfIDs__IdsAssignment ) )
            // InternalCPHLCL.g:844:4: ( rule__ListOfIDs__IdsAssignment )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            // InternalCPHLCL.g:845:4: ( rule__ListOfIDs__IdsAssignment )
            // InternalCPHLCL.g:845:5: rule__ListOfIDs__IdsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ListOfIDs__IdsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 

            }

            // InternalCPHLCL.g:848:3: ( ( rule__ListOfIDs__IdsAssignment )* )
            // InternalCPHLCL.g:849:4: ( rule__ListOfIDs__IdsAssignment )*
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            // InternalCPHLCL.g:850:4: ( rule__ListOfIDs__IdsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCPHLCL.g:850:5: rule__ListOfIDs__IdsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ListOfIDs__IdsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOfIDs"


    // $ANTLR start "rule__DomainDeclaration__Alternatives"
    // InternalCPHLCL.g:859:1: rule__DomainDeclaration__Alternatives : ( ( ruleInterval ) | ( ruleEnumeration ) );
    public final void rule__DomainDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:863:1: ( ( ruleInterval ) | ( ruleEnumeration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==41) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCPHLCL.g:864:2: ( ruleInterval )
                    {
                    // InternalCPHLCL.g:864:2: ( ruleInterval )
                    // InternalCPHLCL.g:865:3: ruleInterval
                    {
                     before(grammarAccess.getDomainDeclarationAccess().getIntervalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterval();

                    state._fsp--;

                     after(grammarAccess.getDomainDeclarationAccess().getIntervalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:870:2: ( ruleEnumeration )
                    {
                    // InternalCPHLCL.g:870:2: ( ruleEnumeration )
                    // InternalCPHLCL.g:871:3: ruleEnumeration
                    {
                     before(grammarAccess.getDomainDeclarationAccess().getEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getDomainDeclarationAccess().getEnumerationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalCPHLCL.g:880:1: rule__Expression__Alternatives : ( ( ruleRelational ) | ( ruleGlobal ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:884:1: ( ( ruleRelational ) | ( ruleGlobal ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||(LA3_0>=20 && LA3_0<=21)||(LA3_0>=29 && LA3_0<=34)||LA3_0==50||LA3_0==52) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=27 && LA3_0<=28)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCPHLCL.g:885:2: ( ruleRelational )
                    {
                    // InternalCPHLCL.g:885:2: ( ruleRelational )
                    // InternalCPHLCL.g:886:3: ruleRelational
                    {
                     before(grammarAccess.getExpressionAccess().getRelationalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRelational();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getRelationalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:891:2: ( ruleGlobal )
                    {
                    // InternalCPHLCL.g:891:2: ( ruleGlobal )
                    // InternalCPHLCL.g:892:3: ruleGlobal
                    {
                     before(grammarAccess.getExpressionAccess().getGlobalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGlobal();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getGlobalParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalCPHLCL.g:901:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '=' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:905:1: ( ( '=' ) | ( '!=' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCPHLCL.g:906:2: ( '=' )
                    {
                    // InternalCPHLCL.g:906:2: ( '=' )
                    // InternalCPHLCL.g:907:3: '='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:912:2: ( '!=' )
                    {
                    // InternalCPHLCL.g:912:2: ( '!=' )
                    // InternalCPHLCL.g:913:3: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // InternalCPHLCL.g:922:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:926:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCPHLCL.g:927:2: ( '>=' )
                    {
                    // InternalCPHLCL.g:927:2: ( '>=' )
                    // InternalCPHLCL.g:928:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:933:2: ( '<=' )
                    {
                    // InternalCPHLCL.g:933:2: ( '<=' )
                    // InternalCPHLCL.g:934:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:939:2: ( '>' )
                    {
                    // InternalCPHLCL.g:939:2: ( '>' )
                    // InternalCPHLCL.g:940:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:945:2: ( '<' )
                    {
                    // InternalCPHLCL.g:945:2: ( '<' )
                    // InternalCPHLCL.g:946:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalCPHLCL.g:955:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:959:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==48) ) {
                alt6=1;
            }
            else if ( (LA6_0==49) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCPHLCL.g:960:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalCPHLCL.g:960:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalCPHLCL.g:961:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalCPHLCL.g:962:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalCPHLCL.g:962:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:966:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalCPHLCL.g:966:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalCPHLCL.g:967:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalCPHLCL.g:968:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalCPHLCL.g:968:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_1_0"
    // InternalCPHLCL.g:976:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( 'mod' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:980:1: ( ( '*' ) | ( '/' ) | ( 'mod' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCPHLCL.g:981:2: ( '*' )
                    {
                    // InternalCPHLCL.g:981:2: ( '*' )
                    // InternalCPHLCL.g:982:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:987:2: ( '/' )
                    {
                    // InternalCPHLCL.g:987:2: ( '/' )
                    // InternalCPHLCL.g:988:3: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:993:2: ( 'mod' )
                    {
                    // InternalCPHLCL.g:993:2: ( 'mod' )
                    // InternalCPHLCL.g:994:3: 'mod'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpModKeyword_1_1_0_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpModKeyword_1_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalCPHLCL.g:1003:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1007:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt8=1;
                }
                break;
            case 52:
                {
                alt8=2;
                }
                break;
            case 33:
            case 34:
                {
                alt8=3;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt8=4;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 20:
            case 21:
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
                    // InternalCPHLCL.g:1008:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalCPHLCL.g:1008:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalCPHLCL.g:1009:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalCPHLCL.g:1010:3: ( rule__Primary__Group_0__0 )
                    // InternalCPHLCL.g:1010:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1014:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalCPHLCL.g:1014:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalCPHLCL.g:1015:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalCPHLCL.g:1016:3: ( rule__Primary__Group_1__0 )
                    // InternalCPHLCL.g:1016:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1020:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalCPHLCL.g:1020:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalCPHLCL.g:1021:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalCPHLCL.g:1022:3: ( rule__Primary__Group_2__0 )
                    // InternalCPHLCL.g:1022:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1026:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalCPHLCL.g:1026:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalCPHLCL.g:1027:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalCPHLCL.g:1028:3: ( rule__Primary__Group_3__0 )
                    // InternalCPHLCL.g:1028:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCPHLCL.g:1032:2: ( ruleAtomic )
                    {
                    // InternalCPHLCL.g:1032:2: ( ruleAtomic )
                    // InternalCPHLCL.g:1033:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalCPHLCL.g:1042:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1046:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCPHLCL.g:1047:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalCPHLCL.g:1047:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalCPHLCL.g:1048:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalCPHLCL.g:1049:3: ( rule__Atomic__Group_0__0 )
                    // InternalCPHLCL.g:1049:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1053:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalCPHLCL.g:1053:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalCPHLCL.g:1054:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalCPHLCL.g:1055:3: ( rule__Atomic__Group_1__0 )
                    // InternalCPHLCL.g:1055:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1059:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalCPHLCL.g:1059:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalCPHLCL.g:1060:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalCPHLCL.g:1061:3: ( rule__Atomic__Group_2__0 )
                    // InternalCPHLCL.g:1061:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_0_1_0"
    // InternalCPHLCL.g:1069:1: rule__Atomic__ValueAlternatives_0_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1073:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCPHLCL.g:1074:2: ( 'true' )
                    {
                    // InternalCPHLCL.g:1074:2: ( 'true' )
                    // InternalCPHLCL.g:1075:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1080:2: ( 'false' )
                    {
                    // InternalCPHLCL.g:1080:2: ( 'false' )
                    // InternalCPHLCL.g:1081:3: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_0_1_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAlternatives_0_1_0"


    // $ANTLR start "rule__Strategy__Alternatives"
    // InternalCPHLCL.g:1090:1: rule__Strategy__Alternatives : ( ( 'one' ) | ( 'two' ) );
    public final void rule__Strategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1094:1: ( ( 'one' ) | ( 'two' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCPHLCL.g:1095:2: ( 'one' )
                    {
                    // InternalCPHLCL.g:1095:2: ( 'one' )
                    // InternalCPHLCL.g:1096:3: 'one'
                    {
                     before(grammarAccess.getStrategyAccess().getOneKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getStrategyAccess().getOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1101:2: ( 'two' )
                    {
                    // InternalCPHLCL.g:1101:2: ( 'two' )
                    // InternalCPHLCL.g:1102:3: 'two'
                    {
                     before(grammarAccess.getStrategyAccess().getTwoKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getStrategyAccess().getTwoKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Alternatives"


    // $ANTLR start "rule__BoolVal__ValueAlternatives_0"
    // InternalCPHLCL.g:1111:1: rule__BoolVal__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BoolVal__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1115:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCPHLCL.g:1116:2: ( 'true' )
                    {
                    // InternalCPHLCL.g:1116:2: ( 'true' )
                    // InternalCPHLCL.g:1117:3: 'true'
                    {
                     before(grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1122:2: ( 'false' )
                    {
                    // InternalCPHLCL.g:1122:2: ( 'false' )
                    // InternalCPHLCL.g:1123:3: 'false'
                    {
                     before(grammarAccess.getBoolValAccess().getValueFalseKeyword_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBoolValAccess().getValueFalseKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolVal__ValueAlternatives_0"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalCPHLCL.g:1132:1: rule__Value__Alternatives : ( ( ruleNumber ) | ( ruleNonEnumerableValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1136:1: ( ( ruleNumber ) | ( ruleNonEnumerableValue ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID||(LA13_0>=20 && LA13_0<=21)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCPHLCL.g:1137:2: ( ruleNumber )
                    {
                    // InternalCPHLCL.g:1137:2: ( ruleNumber )
                    // InternalCPHLCL.g:1138:3: ruleNumber
                    {
                     before(grammarAccess.getValueAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1143:2: ( ruleNonEnumerableValue )
                    {
                    // InternalCPHLCL.g:1143:2: ( ruleNonEnumerableValue )
                    // InternalCPHLCL.g:1144:3: ruleNonEnumerableValue
                    {
                     before(grammarAccess.getValueAccess().getNonEnumerableValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonEnumerableValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNonEnumerableValueParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__NonEnumerableValue__Alternatives"
    // InternalCPHLCL.g:1153:1: rule__NonEnumerableValue__Alternatives : ( ( ruleBoolVal ) | ( ruleSymbol ) );
    public final void rule__NonEnumerableValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1157:1: ( ( ruleBoolVal ) | ( ruleSymbol ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=20 && LA14_0<=21)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCPHLCL.g:1158:2: ( ruleBoolVal )
                    {
                    // InternalCPHLCL.g:1158:2: ( ruleBoolVal )
                    // InternalCPHLCL.g:1159:3: ruleBoolVal
                    {
                     before(grammarAccess.getNonEnumerableValueAccess().getBoolValParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolVal();

                    state._fsp--;

                     after(grammarAccess.getNonEnumerableValueAccess().getBoolValParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1164:2: ( ruleSymbol )
                    {
                    // InternalCPHLCL.g:1164:2: ( ruleSymbol )
                    // InternalCPHLCL.g:1165:3: ruleSymbol
                    {
                     before(grammarAccess.getNonEnumerableValueAccess().getSymbolParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSymbol();

                    state._fsp--;

                     after(grammarAccess.getNonEnumerableValueAccess().getSymbolParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEnumerableValue__Alternatives"


    // $ANTLR start "rule__VarType__Alternatives"
    // InternalCPHLCL.g:1174:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1178:1: ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 26:
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
                    // InternalCPHLCL.g:1179:2: ( 'boolean' )
                    {
                    // InternalCPHLCL.g:1179:2: ( 'boolean' )
                    // InternalCPHLCL.g:1180:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1185:2: ( 'integer' )
                    {
                    // InternalCPHLCL.g:1185:2: ( 'integer' )
                    // InternalCPHLCL.g:1186:3: 'integer'
                    {
                     before(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1191:2: ( 'symbolic' )
                    {
                    // InternalCPHLCL.g:1191:2: ( 'symbolic' )
                    // InternalCPHLCL.g:1192:3: 'symbolic'
                    {
                     before(grammarAccess.getVarTypeAccess().getSymbolicKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getSymbolicKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarType__Alternatives"


    // $ANTLR start "rule__GlobalOp__Alternatives"
    // InternalCPHLCL.g:1201:1: rule__GlobalOp__Alternatives : ( ( 'at_most' ) | ( 'all_different' ) );
    public final void rule__GlobalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1205:1: ( ( 'at_most' ) | ( 'all_different' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCPHLCL.g:1206:2: ( 'at_most' )
                    {
                    // InternalCPHLCL.g:1206:2: ( 'at_most' )
                    // InternalCPHLCL.g:1207:3: 'at_most'
                    {
                     before(grammarAccess.getGlobalOpAccess().getAt_mostKeyword_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getGlobalOpAccess().getAt_mostKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1212:2: ( 'all_different' )
                    {
                    // InternalCPHLCL.g:1212:2: ( 'all_different' )
                    // InternalCPHLCL.g:1213:3: 'all_different'
                    {
                     before(grammarAccess.getGlobalOpAccess().getAll_differentKeyword_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getGlobalOpAccess().getAll_differentKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOp__Alternatives"


    // $ANTLR start "rule__FunctionOp__Alternatives"
    // InternalCPHLCL.g:1222:1: rule__FunctionOp__Alternatives : ( ( 'pow' ) | ( 'dist' ) | ( 'min' ) | ( 'max' ) );
    public final void rule__FunctionOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1226:1: ( ( 'pow' ) | ( 'dist' ) | ( 'min' ) | ( 'max' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalCPHLCL.g:1227:2: ( 'pow' )
                    {
                    // InternalCPHLCL.g:1227:2: ( 'pow' )
                    // InternalCPHLCL.g:1228:3: 'pow'
                    {
                     before(grammarAccess.getFunctionOpAccess().getPowKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getFunctionOpAccess().getPowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1233:2: ( 'dist' )
                    {
                    // InternalCPHLCL.g:1233:2: ( 'dist' )
                    // InternalCPHLCL.g:1234:3: 'dist'
                    {
                     before(grammarAccess.getFunctionOpAccess().getDistKeyword_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getFunctionOpAccess().getDistKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1239:2: ( 'min' )
                    {
                    // InternalCPHLCL.g:1239:2: ( 'min' )
                    // InternalCPHLCL.g:1240:3: 'min'
                    {
                     before(grammarAccess.getFunctionOpAccess().getMinKeyword_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getFunctionOpAccess().getMinKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1245:2: ( 'max' )
                    {
                    // InternalCPHLCL.g:1245:2: ( 'max' )
                    // InternalCPHLCL.g:1246:3: 'max'
                    {
                     before(grammarAccess.getFunctionOpAccess().getMaxKeyword_3()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getFunctionOpAccess().getMaxKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOp__Alternatives"


    // $ANTLR start "rule__UnaryOp__Alternatives"
    // InternalCPHLCL.g:1255:1: rule__UnaryOp__Alternatives : ( ( 'abs' ) | ( 'sqrt' ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1259:1: ( ( 'abs' ) | ( 'sqrt' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCPHLCL.g:1260:2: ( 'abs' )
                    {
                    // InternalCPHLCL.g:1260:2: ( 'abs' )
                    // InternalCPHLCL.g:1261:3: 'abs'
                    {
                     before(grammarAccess.getUnaryOpAccess().getAbsKeyword_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getAbsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1266:2: ( 'sqrt' )
                    {
                    // InternalCPHLCL.g:1266:2: ( 'sqrt' )
                    // InternalCPHLCL.g:1267:3: 'sqrt'
                    {
                     before(grammarAccess.getUnaryOpAccess().getSqrtKeyword_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getSqrtKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOp__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalCPHLCL.g:1276:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1280:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCPHLCL.g:1281:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalCPHLCL.g:1288:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1292:1: ( ( 'model' ) )
            // InternalCPHLCL.g:1293:1: ( 'model' )
            {
            // InternalCPHLCL.g:1293:1: ( 'model' )
            // InternalCPHLCL.g:1294:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalCPHLCL.g:1303:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1307:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalCPHLCL.g:1308:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalCPHLCL.g:1315:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1319:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalCPHLCL.g:1320:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalCPHLCL.g:1320:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalCPHLCL.g:1321:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalCPHLCL.g:1322:2: ( rule__Model__NameAssignment_1 )
            // InternalCPHLCL.g:1322:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalCPHLCL.g:1330:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1334:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalCPHLCL.g:1335:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalCPHLCL.g:1342:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1346:1: ( ( 'variables:' ) )
            // InternalCPHLCL.g:1347:1: ( 'variables:' )
            {
            // InternalCPHLCL.g:1347:1: ( 'variables:' )
            // InternalCPHLCL.g:1348:2: 'variables:'
            {
             before(grammarAccess.getModelAccess().getVariablesKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVariablesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalCPHLCL.g:1357:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1361:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalCPHLCL.g:1362:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalCPHLCL.g:1369:1: rule__Model__Group__3__Impl : ( ( rule__Model__VariablesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1373:1: ( ( ( rule__Model__VariablesAssignment_3 )* ) )
            // InternalCPHLCL.g:1374:1: ( ( rule__Model__VariablesAssignment_3 )* )
            {
            // InternalCPHLCL.g:1374:1: ( ( rule__Model__VariablesAssignment_3 )* )
            // InternalCPHLCL.g:1375:2: ( rule__Model__VariablesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment_3()); 
            // InternalCPHLCL.g:1376:2: ( rule__Model__VariablesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=24 && LA19_0<=26)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCPHLCL.g:1376:3: rule__Model__VariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__VariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVariablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalCPHLCL.g:1384:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1388:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalCPHLCL.g:1389:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalCPHLCL.g:1396:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1400:1: ( ( 'constraints:' ) )
            // InternalCPHLCL.g:1401:1: ( 'constraints:' )
            {
            // InternalCPHLCL.g:1401:1: ( 'constraints:' )
            // InternalCPHLCL.g:1402:2: 'constraints:'
            {
             before(grammarAccess.getModelAccess().getConstraintsKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getConstraintsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalCPHLCL.g:1411:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1415:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalCPHLCL.g:1416:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalCPHLCL.g:1423:1: rule__Model__Group__5__Impl : ( ( rule__Model__ConstraintsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1427:1: ( ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalCPHLCL.g:1428:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalCPHLCL.g:1428:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalCPHLCL.g:1429:2: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalCPHLCL.g:1430:2: ( rule__Model__ConstraintsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCPHLCL.g:1430:3: rule__Model__ConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ConstraintsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalCPHLCL.g:1438:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1442:1: ( rule__Model__Group__6__Impl )
            // InternalCPHLCL.g:1443:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalCPHLCL.g:1449:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )? ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1453:1: ( ( ( rule__Model__Group_6__0 )? ) )
            // InternalCPHLCL.g:1454:1: ( ( rule__Model__Group_6__0 )? )
            {
            // InternalCPHLCL.g:1454:1: ( ( rule__Model__Group_6__0 )? )
            // InternalCPHLCL.g:1455:2: ( rule__Model__Group_6__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // InternalCPHLCL.g:1456:2: ( rule__Model__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCPHLCL.g:1456:3: rule__Model__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group_6__0"
    // InternalCPHLCL.g:1465:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1469:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // InternalCPHLCL.g:1470:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__0"


    // $ANTLR start "rule__Model__Group_6__0__Impl"
    // InternalCPHLCL.g:1477:1: rule__Model__Group_6__0__Impl : ( 'strategy:' ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1481:1: ( ( 'strategy:' ) )
            // InternalCPHLCL.g:1482:1: ( 'strategy:' )
            {
            // InternalCPHLCL.g:1482:1: ( 'strategy:' )
            // InternalCPHLCL.g:1483:2: 'strategy:'
            {
             before(grammarAccess.getModelAccess().getStrategyKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getStrategyKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__0__Impl"


    // $ANTLR start "rule__Model__Group_6__1"
    // InternalCPHLCL.g:1492:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1496:1: ( rule__Model__Group_6__1__Impl )
            // InternalCPHLCL.g:1497:2: rule__Model__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__1"


    // $ANTLR start "rule__Model__Group_6__1__Impl"
    // InternalCPHLCL.g:1503:1: rule__Model__Group_6__1__Impl : ( ( rule__Model__StrategyAssignment_6_1 ) ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1507:1: ( ( ( rule__Model__StrategyAssignment_6_1 ) ) )
            // InternalCPHLCL.g:1508:1: ( ( rule__Model__StrategyAssignment_6_1 ) )
            {
            // InternalCPHLCL.g:1508:1: ( ( rule__Model__StrategyAssignment_6_1 ) )
            // InternalCPHLCL.g:1509:2: ( rule__Model__StrategyAssignment_6_1 )
            {
             before(grammarAccess.getModelAccess().getStrategyAssignment_6_1()); 
            // InternalCPHLCL.g:1510:2: ( rule__Model__StrategyAssignment_6_1 )
            // InternalCPHLCL.g:1510:3: rule__Model__StrategyAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__StrategyAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStrategyAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalCPHLCL.g:1519:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1523:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalCPHLCL.g:1524:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalCPHLCL.g:1531:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1535:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalCPHLCL.g:1536:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalCPHLCL.g:1536:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalCPHLCL.g:1537:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalCPHLCL.g:1538:2: ( rule__Variable__TypeAssignment_0 )
            // InternalCPHLCL.g:1538:3: rule__Variable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalCPHLCL.g:1546:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1550:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalCPHLCL.g:1551:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalCPHLCL.g:1558:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1562:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalCPHLCL.g:1563:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalCPHLCL.g:1563:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalCPHLCL.g:1564:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalCPHLCL.g:1565:2: ( rule__Variable__NameAssignment_1 )
            // InternalCPHLCL.g:1565:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalCPHLCL.g:1573:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1577:1: ( rule__Variable__Group__2__Impl )
            // InternalCPHLCL.g:1578:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalCPHLCL.g:1584:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__Group_2__0 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1588:1: ( ( ( rule__Variable__Group_2__0 )? ) )
            // InternalCPHLCL.g:1589:1: ( ( rule__Variable__Group_2__0 )? )
            {
            // InternalCPHLCL.g:1589:1: ( ( rule__Variable__Group_2__0 )? )
            // InternalCPHLCL.g:1590:2: ( rule__Variable__Group_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2()); 
            // InternalCPHLCL.g:1591:2: ( rule__Variable__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCPHLCL.g:1591:3: rule__Variable__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group_2__0"
    // InternalCPHLCL.g:1600:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1604:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // InternalCPHLCL.g:1605:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Variable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__0"


    // $ANTLR start "rule__Variable__Group_2__0__Impl"
    // InternalCPHLCL.g:1612:1: rule__Variable__Group_2__0__Impl : ( 'domain:' ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1616:1: ( ( 'domain:' ) )
            // InternalCPHLCL.g:1617:1: ( 'domain:' )
            {
            // InternalCPHLCL.g:1617:1: ( 'domain:' )
            // InternalCPHLCL.g:1618:2: 'domain:'
            {
             before(grammarAccess.getVariableAccess().getDomainKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getDomainKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_2__1"
    // InternalCPHLCL.g:1627:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1631:1: ( rule__Variable__Group_2__1__Impl )
            // InternalCPHLCL.g:1632:2: rule__Variable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__1"


    // $ANTLR start "rule__Variable__Group_2__1__Impl"
    // InternalCPHLCL.g:1638:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__DomainAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1642:1: ( ( ( rule__Variable__DomainAssignment_2_1 ) ) )
            // InternalCPHLCL.g:1643:1: ( ( rule__Variable__DomainAssignment_2_1 ) )
            {
            // InternalCPHLCL.g:1643:1: ( ( rule__Variable__DomainAssignment_2_1 ) )
            // InternalCPHLCL.g:1644:2: ( rule__Variable__DomainAssignment_2_1 )
            {
             before(grammarAccess.getVariableAccess().getDomainAssignment_2_1()); 
            // InternalCPHLCL.g:1645:2: ( rule__Variable__DomainAssignment_2_1 )
            // InternalCPHLCL.g:1645:3: rule__Variable__DomainAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__DomainAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getDomainAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__1__Impl"


    // $ANTLR start "rule__Interval__Group__0"
    // InternalCPHLCL.g:1654:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1658:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalCPHLCL.g:1659:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Interval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0"


    // $ANTLR start "rule__Interval__Group__0__Impl"
    // InternalCPHLCL.g:1666:1: rule__Interval__Group__0__Impl : ( ( rule__Interval__StartAssignment_0 ) ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1670:1: ( ( ( rule__Interval__StartAssignment_0 ) ) )
            // InternalCPHLCL.g:1671:1: ( ( rule__Interval__StartAssignment_0 ) )
            {
            // InternalCPHLCL.g:1671:1: ( ( rule__Interval__StartAssignment_0 ) )
            // InternalCPHLCL.g:1672:2: ( rule__Interval__StartAssignment_0 )
            {
             before(grammarAccess.getIntervalAccess().getStartAssignment_0()); 
            // InternalCPHLCL.g:1673:2: ( rule__Interval__StartAssignment_0 )
            // InternalCPHLCL.g:1673:3: rule__Interval__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Interval__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0__Impl"


    // $ANTLR start "rule__Interval__Group__1"
    // InternalCPHLCL.g:1681:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1685:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalCPHLCL.g:1686:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Interval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1"


    // $ANTLR start "rule__Interval__Group__1__Impl"
    // InternalCPHLCL.g:1693:1: rule__Interval__Group__1__Impl : ( '..' ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1697:1: ( ( '..' ) )
            // InternalCPHLCL.g:1698:1: ( '..' )
            {
            // InternalCPHLCL.g:1698:1: ( '..' )
            // InternalCPHLCL.g:1699:2: '..'
            {
             before(grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1__Impl"


    // $ANTLR start "rule__Interval__Group__2"
    // InternalCPHLCL.g:1708:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1712:1: ( rule__Interval__Group__2__Impl )
            // InternalCPHLCL.g:1713:2: rule__Interval__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2"


    // $ANTLR start "rule__Interval__Group__2__Impl"
    // InternalCPHLCL.g:1719:1: rule__Interval__Group__2__Impl : ( ( rule__Interval__EndAssignment_2 ) ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1723:1: ( ( ( rule__Interval__EndAssignment_2 ) ) )
            // InternalCPHLCL.g:1724:1: ( ( rule__Interval__EndAssignment_2 ) )
            {
            // InternalCPHLCL.g:1724:1: ( ( rule__Interval__EndAssignment_2 ) )
            // InternalCPHLCL.g:1725:2: ( rule__Interval__EndAssignment_2 )
            {
             before(grammarAccess.getIntervalAccess().getEndAssignment_2()); 
            // InternalCPHLCL.g:1726:2: ( rule__Interval__EndAssignment_2 )
            // InternalCPHLCL.g:1726:3: rule__Interval__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Interval__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalCPHLCL.g:1735:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1739:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalCPHLCL.g:1740:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalCPHLCL.g:1747:1: rule__Enumeration__Group__0__Impl : ( '[' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1751:1: ( ( '[' ) )
            // InternalCPHLCL.g:1752:1: ( '[' )
            {
            // InternalCPHLCL.g:1752:1: ( '[' )
            // InternalCPHLCL.g:1753:2: '['
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalCPHLCL.g:1762:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1766:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalCPHLCL.g:1767:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalCPHLCL.g:1774:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__ListAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1778:1: ( ( ( rule__Enumeration__ListAssignment_1 ) ) )
            // InternalCPHLCL.g:1779:1: ( ( rule__Enumeration__ListAssignment_1 ) )
            {
            // InternalCPHLCL.g:1779:1: ( ( rule__Enumeration__ListAssignment_1 ) )
            // InternalCPHLCL.g:1780:2: ( rule__Enumeration__ListAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getListAssignment_1()); 
            // InternalCPHLCL.g:1781:2: ( rule__Enumeration__ListAssignment_1 )
            // InternalCPHLCL.g:1781:3: rule__Enumeration__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalCPHLCL.g:1789:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1793:1: ( rule__Enumeration__Group__2__Impl )
            // InternalCPHLCL.g:1794:2: rule__Enumeration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalCPHLCL.g:1800:1: rule__Enumeration__Group__2__Impl : ( ']' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1804:1: ( ( ']' ) )
            // InternalCPHLCL.g:1805:1: ( ']' )
            {
            // InternalCPHLCL.g:1805:1: ( ']' )
            // InternalCPHLCL.g:1806:2: ']'
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalCPHLCL.g:1816:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1820:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalCPHLCL.g:1821:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalCPHLCL.g:1828:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1832:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalCPHLCL.g:1833:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalCPHLCL.g:1833:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalCPHLCL.g:1834:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalCPHLCL.g:1835:2: ( rule__Constraint__NameAssignment_0 )
            // InternalCPHLCL.g:1835:3: rule__Constraint__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalCPHLCL.g:1843:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1847:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalCPHLCL.g:1848:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalCPHLCL.g:1855:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1859:1: ( ( ':' ) )
            // InternalCPHLCL.g:1860:1: ( ':' )
            {
            // InternalCPHLCL.g:1860:1: ( ':' )
            // InternalCPHLCL.g:1861:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalCPHLCL.g:1870:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1874:1: ( rule__Constraint__Group__2__Impl )
            // InternalCPHLCL.g:1875:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalCPHLCL.g:1881:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1885:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalCPHLCL.g:1886:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalCPHLCL.g:1886:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalCPHLCL.g:1887:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalCPHLCL.g:1888:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalCPHLCL.g:1888:3: rule__Constraint__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Iff__Group__0"
    // InternalCPHLCL.g:1897:1: rule__Iff__Group__0 : rule__Iff__Group__0__Impl rule__Iff__Group__1 ;
    public final void rule__Iff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1901:1: ( rule__Iff__Group__0__Impl rule__Iff__Group__1 )
            // InternalCPHLCL.g:1902:2: rule__Iff__Group__0__Impl rule__Iff__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Iff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iff__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group__0"


    // $ANTLR start "rule__Iff__Group__0__Impl"
    // InternalCPHLCL.g:1909:1: rule__Iff__Group__0__Impl : ( ruleImplies ) ;
    public final void rule__Iff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1913:1: ( ( ruleImplies ) )
            // InternalCPHLCL.g:1914:1: ( ruleImplies )
            {
            // InternalCPHLCL.g:1914:1: ( ruleImplies )
            // InternalCPHLCL.g:1915:2: ruleImplies
            {
             before(grammarAccess.getIffAccess().getImpliesParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleImplies();

            state._fsp--;

             after(grammarAccess.getIffAccess().getImpliesParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group__0__Impl"


    // $ANTLR start "rule__Iff__Group__1"
    // InternalCPHLCL.g:1924:1: rule__Iff__Group__1 : rule__Iff__Group__1__Impl ;
    public final void rule__Iff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1928:1: ( rule__Iff__Group__1__Impl )
            // InternalCPHLCL.g:1929:2: rule__Iff__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iff__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group__1"


    // $ANTLR start "rule__Iff__Group__1__Impl"
    // InternalCPHLCL.g:1935:1: rule__Iff__Group__1__Impl : ( ( rule__Iff__Group_1__0 )* ) ;
    public final void rule__Iff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1939:1: ( ( ( rule__Iff__Group_1__0 )* ) )
            // InternalCPHLCL.g:1940:1: ( ( rule__Iff__Group_1__0 )* )
            {
            // InternalCPHLCL.g:1940:1: ( ( rule__Iff__Group_1__0 )* )
            // InternalCPHLCL.g:1941:2: ( rule__Iff__Group_1__0 )*
            {
             before(grammarAccess.getIffAccess().getGroup_1()); 
            // InternalCPHLCL.g:1942:2: ( rule__Iff__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCPHLCL.g:1942:3: rule__Iff__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Iff__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getIffAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group__1__Impl"


    // $ANTLR start "rule__Iff__Group_1__0"
    // InternalCPHLCL.g:1951:1: rule__Iff__Group_1__0 : rule__Iff__Group_1__0__Impl rule__Iff__Group_1__1 ;
    public final void rule__Iff__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1955:1: ( rule__Iff__Group_1__0__Impl rule__Iff__Group_1__1 )
            // InternalCPHLCL.g:1956:2: rule__Iff__Group_1__0__Impl rule__Iff__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Iff__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iff__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__0"


    // $ANTLR start "rule__Iff__Group_1__0__Impl"
    // InternalCPHLCL.g:1963:1: rule__Iff__Group_1__0__Impl : ( () ) ;
    public final void rule__Iff__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1967:1: ( ( () ) )
            // InternalCPHLCL.g:1968:1: ( () )
            {
            // InternalCPHLCL.g:1968:1: ( () )
            // InternalCPHLCL.g:1969:2: ()
            {
             before(grammarAccess.getIffAccess().getIffLeftAction_1_0()); 
            // InternalCPHLCL.g:1970:2: ()
            // InternalCPHLCL.g:1970:3: 
            {
            }

             after(grammarAccess.getIffAccess().getIffLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__0__Impl"


    // $ANTLR start "rule__Iff__Group_1__1"
    // InternalCPHLCL.g:1978:1: rule__Iff__Group_1__1 : rule__Iff__Group_1__1__Impl rule__Iff__Group_1__2 ;
    public final void rule__Iff__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1982:1: ( rule__Iff__Group_1__1__Impl rule__Iff__Group_1__2 )
            // InternalCPHLCL.g:1983:2: rule__Iff__Group_1__1__Impl rule__Iff__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Iff__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iff__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__1"


    // $ANTLR start "rule__Iff__Group_1__1__Impl"
    // InternalCPHLCL.g:1990:1: rule__Iff__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__Iff__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1994:1: ( ( '<=>' ) )
            // InternalCPHLCL.g:1995:1: ( '<=>' )
            {
            // InternalCPHLCL.g:1995:1: ( '<=>' )
            // InternalCPHLCL.g:1996:2: '<=>'
            {
             before(grammarAccess.getIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__1__Impl"


    // $ANTLR start "rule__Iff__Group_1__2"
    // InternalCPHLCL.g:2005:1: rule__Iff__Group_1__2 : rule__Iff__Group_1__2__Impl ;
    public final void rule__Iff__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2009:1: ( rule__Iff__Group_1__2__Impl )
            // InternalCPHLCL.g:2010:2: rule__Iff__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iff__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__2"


    // $ANTLR start "rule__Iff__Group_1__2__Impl"
    // InternalCPHLCL.g:2016:1: rule__Iff__Group_1__2__Impl : ( ( rule__Iff__RightAssignment_1_2 ) ) ;
    public final void rule__Iff__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2020:1: ( ( ( rule__Iff__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2021:1: ( ( rule__Iff__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2021:1: ( ( rule__Iff__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2022:2: ( rule__Iff__RightAssignment_1_2 )
            {
             before(grammarAccess.getIffAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2023:2: ( rule__Iff__RightAssignment_1_2 )
            // InternalCPHLCL.g:2023:3: rule__Iff__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Iff__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIffAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__2__Impl"


    // $ANTLR start "rule__Implies__Group__0"
    // InternalCPHLCL.g:2032:1: rule__Implies__Group__0 : rule__Implies__Group__0__Impl rule__Implies__Group__1 ;
    public final void rule__Implies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2036:1: ( rule__Implies__Group__0__Impl rule__Implies__Group__1 )
            // InternalCPHLCL.g:2037:2: rule__Implies__Group__0__Impl rule__Implies__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Implies__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implies__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group__0"


    // $ANTLR start "rule__Implies__Group__0__Impl"
    // InternalCPHLCL.g:2044:1: rule__Implies__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Implies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2048:1: ( ( ruleOr ) )
            // InternalCPHLCL.g:2049:1: ( ruleOr )
            {
            // InternalCPHLCL.g:2049:1: ( ruleOr )
            // InternalCPHLCL.g:2050:2: ruleOr
            {
             before(grammarAccess.getImpliesAccess().getOrParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImpliesAccess().getOrParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group__0__Impl"


    // $ANTLR start "rule__Implies__Group__1"
    // InternalCPHLCL.g:2059:1: rule__Implies__Group__1 : rule__Implies__Group__1__Impl ;
    public final void rule__Implies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2063:1: ( rule__Implies__Group__1__Impl )
            // InternalCPHLCL.g:2064:2: rule__Implies__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implies__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group__1"


    // $ANTLR start "rule__Implies__Group__1__Impl"
    // InternalCPHLCL.g:2070:1: rule__Implies__Group__1__Impl : ( ( rule__Implies__Group_1__0 )* ) ;
    public final void rule__Implies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2074:1: ( ( ( rule__Implies__Group_1__0 )* ) )
            // InternalCPHLCL.g:2075:1: ( ( rule__Implies__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2075:1: ( ( rule__Implies__Group_1__0 )* )
            // InternalCPHLCL.g:2076:2: ( rule__Implies__Group_1__0 )*
            {
             before(grammarAccess.getImpliesAccess().getGroup_1()); 
            // InternalCPHLCL.g:2077:2: ( rule__Implies__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCPHLCL.g:2077:3: rule__Implies__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Implies__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getImpliesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group__1__Impl"


    // $ANTLR start "rule__Implies__Group_1__0"
    // InternalCPHLCL.g:2086:1: rule__Implies__Group_1__0 : rule__Implies__Group_1__0__Impl rule__Implies__Group_1__1 ;
    public final void rule__Implies__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2090:1: ( rule__Implies__Group_1__0__Impl rule__Implies__Group_1__1 )
            // InternalCPHLCL.g:2091:2: rule__Implies__Group_1__0__Impl rule__Implies__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Implies__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implies__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__0"


    // $ANTLR start "rule__Implies__Group_1__0__Impl"
    // InternalCPHLCL.g:2098:1: rule__Implies__Group_1__0__Impl : ( () ) ;
    public final void rule__Implies__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2102:1: ( ( () ) )
            // InternalCPHLCL.g:2103:1: ( () )
            {
            // InternalCPHLCL.g:2103:1: ( () )
            // InternalCPHLCL.g:2104:2: ()
            {
             before(grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0()); 
            // InternalCPHLCL.g:2105:2: ()
            // InternalCPHLCL.g:2105:3: 
            {
            }

             after(grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__0__Impl"


    // $ANTLR start "rule__Implies__Group_1__1"
    // InternalCPHLCL.g:2113:1: rule__Implies__Group_1__1 : rule__Implies__Group_1__1__Impl rule__Implies__Group_1__2 ;
    public final void rule__Implies__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2117:1: ( rule__Implies__Group_1__1__Impl rule__Implies__Group_1__2 )
            // InternalCPHLCL.g:2118:2: rule__Implies__Group_1__1__Impl rule__Implies__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Implies__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implies__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__1"


    // $ANTLR start "rule__Implies__Group_1__1__Impl"
    // InternalCPHLCL.g:2125:1: rule__Implies__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__Implies__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2129:1: ( ( '=>' ) )
            // InternalCPHLCL.g:2130:1: ( '=>' )
            {
            // InternalCPHLCL.g:2130:1: ( '=>' )
            // InternalCPHLCL.g:2131:2: '=>'
            {
             before(grammarAccess.getImpliesAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getImpliesAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__1__Impl"


    // $ANTLR start "rule__Implies__Group_1__2"
    // InternalCPHLCL.g:2140:1: rule__Implies__Group_1__2 : rule__Implies__Group_1__2__Impl ;
    public final void rule__Implies__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2144:1: ( rule__Implies__Group_1__2__Impl )
            // InternalCPHLCL.g:2145:2: rule__Implies__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implies__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__2"


    // $ANTLR start "rule__Implies__Group_1__2__Impl"
    // InternalCPHLCL.g:2151:1: rule__Implies__Group_1__2__Impl : ( ( rule__Implies__RightAssignment_1_2 ) ) ;
    public final void rule__Implies__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2155:1: ( ( ( rule__Implies__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2156:1: ( ( rule__Implies__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2156:1: ( ( rule__Implies__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2157:2: ( rule__Implies__RightAssignment_1_2 )
            {
             before(grammarAccess.getImpliesAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2158:2: ( rule__Implies__RightAssignment_1_2 )
            // InternalCPHLCL.g:2158:3: rule__Implies__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Implies__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImpliesAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalCPHLCL.g:2167:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2171:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalCPHLCL.g:2172:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalCPHLCL.g:2179:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2183:1: ( ( ruleAnd ) )
            // InternalCPHLCL.g:2184:1: ( ruleAnd )
            {
            // InternalCPHLCL.g:2184:1: ( ruleAnd )
            // InternalCPHLCL.g:2185:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalCPHLCL.g:2194:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2198:1: ( rule__Or__Group__1__Impl )
            // InternalCPHLCL.g:2199:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalCPHLCL.g:2205:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2209:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalCPHLCL.g:2210:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2210:1: ( ( rule__Or__Group_1__0 )* )
            // InternalCPHLCL.g:2211:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalCPHLCL.g:2212:2: ( rule__Or__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCPHLCL.g:2212:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalCPHLCL.g:2221:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2225:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalCPHLCL.g:2226:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalCPHLCL.g:2233:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2237:1: ( ( () ) )
            // InternalCPHLCL.g:2238:1: ( () )
            {
            // InternalCPHLCL.g:2238:1: ( () )
            // InternalCPHLCL.g:2239:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalCPHLCL.g:2240:2: ()
            // InternalCPHLCL.g:2240:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalCPHLCL.g:2248:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2252:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalCPHLCL.g:2253:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalCPHLCL.g:2260:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2264:1: ( ( 'OR' ) )
            // InternalCPHLCL.g:2265:1: ( 'OR' )
            {
            // InternalCPHLCL.g:2265:1: ( 'OR' )
            // InternalCPHLCL.g:2266:2: 'OR'
            {
             before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getORKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalCPHLCL.g:2275:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2279:1: ( rule__Or__Group_1__2__Impl )
            // InternalCPHLCL.g:2280:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalCPHLCL.g:2286:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2290:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2291:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2291:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2292:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2293:2: ( rule__Or__RightAssignment_1_2 )
            // InternalCPHLCL.g:2293:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalCPHLCL.g:2302:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2306:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalCPHLCL.g:2307:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalCPHLCL.g:2314:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2318:1: ( ( ruleEquality ) )
            // InternalCPHLCL.g:2319:1: ( ruleEquality )
            {
            // InternalCPHLCL.g:2319:1: ( ruleEquality )
            // InternalCPHLCL.g:2320:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalCPHLCL.g:2329:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2333:1: ( rule__And__Group__1__Impl )
            // InternalCPHLCL.g:2334:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalCPHLCL.g:2340:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2344:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalCPHLCL.g:2345:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2345:1: ( ( rule__And__Group_1__0 )* )
            // InternalCPHLCL.g:2346:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalCPHLCL.g:2347:2: ( rule__And__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==47) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCPHLCL.g:2347:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalCPHLCL.g:2356:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2360:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalCPHLCL.g:2361:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalCPHLCL.g:2368:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2372:1: ( ( () ) )
            // InternalCPHLCL.g:2373:1: ( () )
            {
            // InternalCPHLCL.g:2373:1: ( () )
            // InternalCPHLCL.g:2374:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalCPHLCL.g:2375:2: ()
            // InternalCPHLCL.g:2375:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalCPHLCL.g:2383:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2387:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalCPHLCL.g:2388:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalCPHLCL.g:2395:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2399:1: ( ( 'AND' ) )
            // InternalCPHLCL.g:2400:1: ( 'AND' )
            {
            // InternalCPHLCL.g:2400:1: ( 'AND' )
            // InternalCPHLCL.g:2401:2: 'AND'
            {
             before(grammarAccess.getAndAccess().getANDKeyword_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getANDKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalCPHLCL.g:2410:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2414:1: ( rule__And__Group_1__2__Impl )
            // InternalCPHLCL.g:2415:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalCPHLCL.g:2421:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2425:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2426:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2426:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2427:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2428:2: ( rule__And__RightAssignment_1_2 )
            // InternalCPHLCL.g:2428:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalCPHLCL.g:2437:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2441:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalCPHLCL.g:2442:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalCPHLCL.g:2449:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2453:1: ( ( ruleComparison ) )
            // InternalCPHLCL.g:2454:1: ( ruleComparison )
            {
            // InternalCPHLCL.g:2454:1: ( ruleComparison )
            // InternalCPHLCL.g:2455:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalCPHLCL.g:2464:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2468:1: ( rule__Equality__Group__1__Impl )
            // InternalCPHLCL.g:2469:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalCPHLCL.g:2475:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2479:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalCPHLCL.g:2480:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2480:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalCPHLCL.g:2481:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalCPHLCL.g:2482:2: ( rule__Equality__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=11 && LA27_0<=12)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCPHLCL.g:2482:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalCPHLCL.g:2491:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2495:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalCPHLCL.g:2496:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalCPHLCL.g:2503:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2507:1: ( ( () ) )
            // InternalCPHLCL.g:2508:1: ( () )
            {
            // InternalCPHLCL.g:2508:1: ( () )
            // InternalCPHLCL.g:2509:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalCPHLCL.g:2510:2: ()
            // InternalCPHLCL.g:2510:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalCPHLCL.g:2518:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2522:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalCPHLCL.g:2523:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalCPHLCL.g:2530:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2534:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalCPHLCL.g:2535:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:2535:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalCPHLCL.g:2536:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalCPHLCL.g:2537:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalCPHLCL.g:2537:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalCPHLCL.g:2545:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2549:1: ( rule__Equality__Group_1__2__Impl )
            // InternalCPHLCL.g:2550:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalCPHLCL.g:2556:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2560:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2561:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2561:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2562:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2563:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalCPHLCL.g:2563:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalCPHLCL.g:2572:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2576:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalCPHLCL.g:2577:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalCPHLCL.g:2584:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2588:1: ( ( rulePlusOrMinus ) )
            // InternalCPHLCL.g:2589:1: ( rulePlusOrMinus )
            {
            // InternalCPHLCL.g:2589:1: ( rulePlusOrMinus )
            // InternalCPHLCL.g:2590:2: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalCPHLCL.g:2599:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2603:1: ( rule__Comparison__Group__1__Impl )
            // InternalCPHLCL.g:2604:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalCPHLCL.g:2610:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2614:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalCPHLCL.g:2615:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2615:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalCPHLCL.g:2616:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalCPHLCL.g:2617:2: ( rule__Comparison__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=13 && LA28_0<=16)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCPHLCL.g:2617:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalCPHLCL.g:2626:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2630:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalCPHLCL.g:2631:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalCPHLCL.g:2638:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2642:1: ( ( () ) )
            // InternalCPHLCL.g:2643:1: ( () )
            {
            // InternalCPHLCL.g:2643:1: ( () )
            // InternalCPHLCL.g:2644:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalCPHLCL.g:2645:2: ()
            // InternalCPHLCL.g:2645:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalCPHLCL.g:2653:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2657:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalCPHLCL.g:2658:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalCPHLCL.g:2665:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2669:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalCPHLCL.g:2670:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:2670:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalCPHLCL.g:2671:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalCPHLCL.g:2672:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalCPHLCL.g:2672:3: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalCPHLCL.g:2680:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2684:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalCPHLCL.g:2685:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalCPHLCL.g:2691:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2695:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2696:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2696:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2697:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2698:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalCPHLCL.g:2698:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalCPHLCL.g:2707:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2711:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalCPHLCL.g:2712:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalCPHLCL.g:2719:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2723:1: ( ( ruleMulOrDiv ) )
            // InternalCPHLCL.g:2724:1: ( ruleMulOrDiv )
            {
            // InternalCPHLCL.g:2724:1: ( ruleMulOrDiv )
            // InternalCPHLCL.g:2725:2: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalCPHLCL.g:2734:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2738:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalCPHLCL.g:2739:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalCPHLCL.g:2745:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2749:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalCPHLCL.g:2750:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2750:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalCPHLCL.g:2751:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalCPHLCL.g:2752:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=48 && LA29_0<=49)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCPHLCL.g:2752:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalCPHLCL.g:2761:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2765:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalCPHLCL.g:2766:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalCPHLCL.g:2773:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2777:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalCPHLCL.g:2778:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalCPHLCL.g:2778:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalCPHLCL.g:2779:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalCPHLCL.g:2780:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalCPHLCL.g:2780:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalCPHLCL.g:2788:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2792:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalCPHLCL.g:2793:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalCPHLCL.g:2799:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2803:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalCPHLCL.g:2804:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:2804:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalCPHLCL.g:2805:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalCPHLCL.g:2806:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalCPHLCL.g:2806:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalCPHLCL.g:2815:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2819:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalCPHLCL.g:2820:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_33);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalCPHLCL.g:2827:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2831:1: ( ( () ) )
            // InternalCPHLCL.g:2832:1: ( () )
            {
            // InternalCPHLCL.g:2832:1: ( () )
            // InternalCPHLCL.g:2833:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalCPHLCL.g:2834:2: ()
            // InternalCPHLCL.g:2834:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalCPHLCL.g:2842:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2846:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalCPHLCL.g:2847:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalCPHLCL.g:2853:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2857:1: ( ( '+' ) )
            // InternalCPHLCL.g:2858:1: ( '+' )
            {
            // InternalCPHLCL.g:2858:1: ( '+' )
            // InternalCPHLCL.g:2859:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalCPHLCL.g:2869:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2873:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalCPHLCL.g:2874:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_31);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalCPHLCL.g:2881:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2885:1: ( ( () ) )
            // InternalCPHLCL.g:2886:1: ( () )
            {
            // InternalCPHLCL.g:2886:1: ( () )
            // InternalCPHLCL.g:2887:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalCPHLCL.g:2888:2: ()
            // InternalCPHLCL.g:2888:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalCPHLCL.g:2896:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2900:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalCPHLCL.g:2901:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalCPHLCL.g:2907:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2911:1: ( ( '-' ) )
            // InternalCPHLCL.g:2912:1: ( '-' )
            {
            // InternalCPHLCL.g:2912:1: ( '-' )
            // InternalCPHLCL.g:2913:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalCPHLCL.g:2923:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2927:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalCPHLCL.g:2928:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalCPHLCL.g:2935:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2939:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:2940:1: ( rulePrimary )
            {
            // InternalCPHLCL.g:2940:1: ( rulePrimary )
            // InternalCPHLCL.g:2941:2: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalCPHLCL.g:2950:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2954:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalCPHLCL.g:2955:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalCPHLCL.g:2961:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2965:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalCPHLCL.g:2966:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2966:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalCPHLCL.g:2967:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalCPHLCL.g:2968:2: ( rule__MulOrDiv__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=17 && LA30_0<=19)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCPHLCL.g:2968:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalCPHLCL.g:2977:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2981:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalCPHLCL.g:2982:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalCPHLCL.g:2989:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2993:1: ( ( () ) )
            // InternalCPHLCL.g:2994:1: ( () )
            {
            // InternalCPHLCL.g:2994:1: ( () )
            // InternalCPHLCL.g:2995:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalCPHLCL.g:2996:2: ()
            // InternalCPHLCL.g:2996:3: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalCPHLCL.g:3004:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3008:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalCPHLCL.g:3009:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalCPHLCL.g:3016:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3020:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalCPHLCL.g:3021:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:3021:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalCPHLCL.g:3022:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalCPHLCL.g:3023:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalCPHLCL.g:3023:3: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__2"
    // InternalCPHLCL.g:3031:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3035:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalCPHLCL.g:3036:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2"


    // $ANTLR start "rule__MulOrDiv__Group_1__2__Impl"
    // InternalCPHLCL.g:3042:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3046:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:3047:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:3047:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:3048:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:3049:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalCPHLCL.g:3049:3: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalCPHLCL.g:3058:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3062:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalCPHLCL.g:3063:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalCPHLCL.g:3070:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3074:1: ( ( '(' ) )
            // InternalCPHLCL.g:3075:1: ( '(' )
            {
            // InternalCPHLCL.g:3075:1: ( '(' )
            // InternalCPHLCL.g:3076:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalCPHLCL.g:3085:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3089:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalCPHLCL.g:3090:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_36);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalCPHLCL.g:3097:1: rule__Primary__Group_0__1__Impl : ( ruleRelational ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3101:1: ( ( ruleRelational ) )
            // InternalCPHLCL.g:3102:1: ( ruleRelational )
            {
            // InternalCPHLCL.g:3102:1: ( ruleRelational )
            // InternalCPHLCL.g:3103:2: ruleRelational
            {
             before(grammarAccess.getPrimaryAccess().getRelationalParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleRelational();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getRelationalParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalCPHLCL.g:3112:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3116:1: ( rule__Primary__Group_0__2__Impl )
            // InternalCPHLCL.g:3117:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalCPHLCL.g:3123:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3127:1: ( ( ')' ) )
            // InternalCPHLCL.g:3128:1: ( ')' )
            {
            // InternalCPHLCL.g:3128:1: ( ')' )
            // InternalCPHLCL.g:3129:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalCPHLCL.g:3139:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3143:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalCPHLCL.g:3144:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalCPHLCL.g:3151:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3155:1: ( ( () ) )
            // InternalCPHLCL.g:3156:1: ( () )
            {
            // InternalCPHLCL.g:3156:1: ( () )
            // InternalCPHLCL.g:3157:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNegationAction_1_0()); 
            // InternalCPHLCL.g:3158:2: ()
            // InternalCPHLCL.g:3158:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNegationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalCPHLCL.g:3166:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3170:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalCPHLCL.g:3171:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalCPHLCL.g:3178:1: rule__Primary__Group_1__1__Impl : ( '~' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3182:1: ( ( '~' ) )
            // InternalCPHLCL.g:3183:1: ( '~' )
            {
            // InternalCPHLCL.g:3183:1: ( '~' )
            // InternalCPHLCL.g:3184:2: '~'
            {
             before(grammarAccess.getPrimaryAccess().getTildeKeyword_1_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getTildeKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalCPHLCL.g:3193:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3197:1: ( rule__Primary__Group_1__2__Impl )
            // InternalCPHLCL.g:3198:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalCPHLCL.g:3204:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3208:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalCPHLCL.g:3209:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:3209:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalCPHLCL.g:3210:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalCPHLCL.g:3211:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalCPHLCL.g:3211:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalCPHLCL.g:3220:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3224:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalCPHLCL.g:3225:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_38);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalCPHLCL.g:3232:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3236:1: ( ( () ) )
            // InternalCPHLCL.g:3237:1: ( () )
            {
            // InternalCPHLCL.g:3237:1: ( () )
            // InternalCPHLCL.g:3238:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getUnaryAction_2_0()); 
            // InternalCPHLCL.g:3239:2: ()
            // InternalCPHLCL.g:3239:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getUnaryAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalCPHLCL.g:3247:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3251:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalCPHLCL.g:3252:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalCPHLCL.g:3259:1: rule__Primary__Group_2__1__Impl : ( ( rule__Primary__OpAssignment_2_1 ) ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3263:1: ( ( ( rule__Primary__OpAssignment_2_1 ) ) )
            // InternalCPHLCL.g:3264:1: ( ( rule__Primary__OpAssignment_2_1 ) )
            {
            // InternalCPHLCL.g:3264:1: ( ( rule__Primary__OpAssignment_2_1 ) )
            // InternalCPHLCL.g:3265:2: ( rule__Primary__OpAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryAccess().getOpAssignment_2_1()); 
            // InternalCPHLCL.g:3266:2: ( rule__Primary__OpAssignment_2_1 )
            // InternalCPHLCL.g:3266:3: rule__Primary__OpAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__OpAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getOpAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalCPHLCL.g:3274:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3278:1: ( rule__Primary__Group_2__2__Impl )
            // InternalCPHLCL.g:3279:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalCPHLCL.g:3285:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExpressionAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3289:1: ( ( ( rule__Primary__ExpressionAssignment_2_2 ) ) )
            // InternalCPHLCL.g:3290:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            {
            // InternalCPHLCL.g:3290:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            // InternalCPHLCL.g:3291:2: ( rule__Primary__ExpressionAssignment_2_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            // InternalCPHLCL.g:3292:2: ( rule__Primary__ExpressionAssignment_2_2 )
            // InternalCPHLCL.g:3292:3: rule__Primary__ExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalCPHLCL.g:3301:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3305:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalCPHLCL.g:3306:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_39);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalCPHLCL.g:3313:1: rule__Primary__Group_3__0__Impl : ( () ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3317:1: ( ( () ) )
            // InternalCPHLCL.g:3318:1: ( () )
            {
            // InternalCPHLCL.g:3318:1: ( () )
            // InternalCPHLCL.g:3319:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getFunctionAction_3_0()); 
            // InternalCPHLCL.g:3320:2: ()
            // InternalCPHLCL.g:3320:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getFunctionAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalCPHLCL.g:3328:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3332:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalCPHLCL.g:3333:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_40);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalCPHLCL.g:3340:1: rule__Primary__Group_3__1__Impl : ( ( rule__Primary__OpAssignment_3_1 ) ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3344:1: ( ( ( rule__Primary__OpAssignment_3_1 ) ) )
            // InternalCPHLCL.g:3345:1: ( ( rule__Primary__OpAssignment_3_1 ) )
            {
            // InternalCPHLCL.g:3345:1: ( ( rule__Primary__OpAssignment_3_1 ) )
            // InternalCPHLCL.g:3346:2: ( rule__Primary__OpAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryAccess().getOpAssignment_3_1()); 
            // InternalCPHLCL.g:3347:2: ( rule__Primary__OpAssignment_3_1 )
            // InternalCPHLCL.g:3347:3: rule__Primary__OpAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__OpAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getOpAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalCPHLCL.g:3355:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3359:1: ( rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 )
            // InternalCPHLCL.g:3360:2: rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalCPHLCL.g:3367:1: rule__Primary__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3371:1: ( ( '(' ) )
            // InternalCPHLCL.g:3372:1: ( '(' )
            {
            // InternalCPHLCL.g:3372:1: ( '(' )
            // InternalCPHLCL.g:3373:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__3"
    // InternalCPHLCL.g:3382:1: rule__Primary__Group_3__3 : rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 ;
    public final void rule__Primary__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3386:1: ( rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 )
            // InternalCPHLCL.g:3387:2: rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4
            {
            pushFollow(FOLLOW_41);
            rule__Primary__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__3"


    // $ANTLR start "rule__Primary__Group_3__3__Impl"
    // InternalCPHLCL.g:3394:1: rule__Primary__Group_3__3__Impl : ( ( rule__Primary__LeftAssignment_3_3 ) ) ;
    public final void rule__Primary__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3398:1: ( ( ( rule__Primary__LeftAssignment_3_3 ) ) )
            // InternalCPHLCL.g:3399:1: ( ( rule__Primary__LeftAssignment_3_3 ) )
            {
            // InternalCPHLCL.g:3399:1: ( ( rule__Primary__LeftAssignment_3_3 ) )
            // InternalCPHLCL.g:3400:2: ( rule__Primary__LeftAssignment_3_3 )
            {
             before(grammarAccess.getPrimaryAccess().getLeftAssignment_3_3()); 
            // InternalCPHLCL.g:3401:2: ( rule__Primary__LeftAssignment_3_3 )
            // InternalCPHLCL.g:3401:3: rule__Primary__LeftAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__LeftAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getLeftAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__3__Impl"


    // $ANTLR start "rule__Primary__Group_3__4"
    // InternalCPHLCL.g:3409:1: rule__Primary__Group_3__4 : rule__Primary__Group_3__4__Impl rule__Primary__Group_3__5 ;
    public final void rule__Primary__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3413:1: ( rule__Primary__Group_3__4__Impl rule__Primary__Group_3__5 )
            // InternalCPHLCL.g:3414:2: rule__Primary__Group_3__4__Impl rule__Primary__Group_3__5
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__4"


    // $ANTLR start "rule__Primary__Group_3__4__Impl"
    // InternalCPHLCL.g:3421:1: rule__Primary__Group_3__4__Impl : ( ',' ) ;
    public final void rule__Primary__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3425:1: ( ( ',' ) )
            // InternalCPHLCL.g:3426:1: ( ',' )
            {
            // InternalCPHLCL.g:3426:1: ( ',' )
            // InternalCPHLCL.g:3427:2: ','
            {
             before(grammarAccess.getPrimaryAccess().getCommaKeyword_3_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getCommaKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__4__Impl"


    // $ANTLR start "rule__Primary__Group_3__5"
    // InternalCPHLCL.g:3436:1: rule__Primary__Group_3__5 : rule__Primary__Group_3__5__Impl rule__Primary__Group_3__6 ;
    public final void rule__Primary__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3440:1: ( rule__Primary__Group_3__5__Impl rule__Primary__Group_3__6 )
            // InternalCPHLCL.g:3441:2: rule__Primary__Group_3__5__Impl rule__Primary__Group_3__6
            {
            pushFollow(FOLLOW_36);
            rule__Primary__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__5"


    // $ANTLR start "rule__Primary__Group_3__5__Impl"
    // InternalCPHLCL.g:3448:1: rule__Primary__Group_3__5__Impl : ( ( rule__Primary__RightAssignment_3_5 ) ) ;
    public final void rule__Primary__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3452:1: ( ( ( rule__Primary__RightAssignment_3_5 ) ) )
            // InternalCPHLCL.g:3453:1: ( ( rule__Primary__RightAssignment_3_5 ) )
            {
            // InternalCPHLCL.g:3453:1: ( ( rule__Primary__RightAssignment_3_5 ) )
            // InternalCPHLCL.g:3454:2: ( rule__Primary__RightAssignment_3_5 )
            {
             before(grammarAccess.getPrimaryAccess().getRightAssignment_3_5()); 
            // InternalCPHLCL.g:3455:2: ( rule__Primary__RightAssignment_3_5 )
            // InternalCPHLCL.g:3455:3: rule__Primary__RightAssignment_3_5
            {
            pushFollow(FOLLOW_2);
            rule__Primary__RightAssignment_3_5();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getRightAssignment_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__5__Impl"


    // $ANTLR start "rule__Primary__Group_3__6"
    // InternalCPHLCL.g:3463:1: rule__Primary__Group_3__6 : rule__Primary__Group_3__6__Impl ;
    public final void rule__Primary__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3467:1: ( rule__Primary__Group_3__6__Impl )
            // InternalCPHLCL.g:3468:2: rule__Primary__Group_3__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__6"


    // $ANTLR start "rule__Primary__Group_3__6__Impl"
    // InternalCPHLCL.g:3474:1: rule__Primary__Group_3__6__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3478:1: ( ( ')' ) )
            // InternalCPHLCL.g:3479:1: ( ')' )
            {
            // InternalCPHLCL.g:3479:1: ( ')' )
            // InternalCPHLCL.g:3480:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__6__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalCPHLCL.g:3490:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3494:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalCPHLCL.g:3495:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_42);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalCPHLCL.g:3502:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3506:1: ( ( () ) )
            // InternalCPHLCL.g:3507:1: ( () )
            {
            // InternalCPHLCL.g:3507:1: ( () )
            // InternalCPHLCL.g:3508:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_0_0()); 
            // InternalCPHLCL.g:3509:2: ()
            // InternalCPHLCL.g:3509:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalCPHLCL.g:3517:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3521:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalCPHLCL.g:3522:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalCPHLCL.g:3528:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3532:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalCPHLCL.g:3533:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalCPHLCL.g:3533:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalCPHLCL.g:3534:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalCPHLCL.g:3535:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalCPHLCL.g:3535:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalCPHLCL.g:3544:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3548:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalCPHLCL.g:3549:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalCPHLCL.g:3556:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3560:1: ( ( () ) )
            // InternalCPHLCL.g:3561:1: ( () )
            {
            // InternalCPHLCL.g:3561:1: ( () )
            // InternalCPHLCL.g:3562:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_1_0()); 
            // InternalCPHLCL.g:3563:2: ()
            // InternalCPHLCL.g:3563:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableRefAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalCPHLCL.g:3571:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3575:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalCPHLCL.g:3576:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalCPHLCL.g:3582:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__VariableAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3586:1: ( ( ( rule__Atomic__VariableAssignment_1_1 ) ) )
            // InternalCPHLCL.g:3587:1: ( ( rule__Atomic__VariableAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:3587:1: ( ( rule__Atomic__VariableAssignment_1_1 ) )
            // InternalCPHLCL.g:3588:2: ( rule__Atomic__VariableAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_1_1()); 
            // InternalCPHLCL.g:3589:2: ( rule__Atomic__VariableAssignment_1_1 )
            // InternalCPHLCL.g:3589:3: rule__Atomic__VariableAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__VariableAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalCPHLCL.g:3598:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3602:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalCPHLCL.g:3603:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalCPHLCL.g:3610:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3614:1: ( ( () ) )
            // InternalCPHLCL.g:3615:1: ( () )
            {
            // InternalCPHLCL.g:3615:1: ( () )
            // InternalCPHLCL.g:3616:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_2_0()); 
            // InternalCPHLCL.g:3617:2: ()
            // InternalCPHLCL.g:3617:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalCPHLCL.g:3625:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3629:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalCPHLCL.g:3630:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalCPHLCL.g:3636:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3640:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalCPHLCL.g:3641:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalCPHLCL.g:3641:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalCPHLCL.g:3642:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalCPHLCL.g:3643:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalCPHLCL.g:3643:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Global__Group__0"
    // InternalCPHLCL.g:3652:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3656:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalCPHLCL.g:3657:2: rule__Global__Group__0__Impl rule__Global__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Global__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__0"


    // $ANTLR start "rule__Global__Group__0__Impl"
    // InternalCPHLCL.g:3664:1: rule__Global__Group__0__Impl : ( ( rule__Global__OpAssignment_0 ) ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3668:1: ( ( ( rule__Global__OpAssignment_0 ) ) )
            // InternalCPHLCL.g:3669:1: ( ( rule__Global__OpAssignment_0 ) )
            {
            // InternalCPHLCL.g:3669:1: ( ( rule__Global__OpAssignment_0 ) )
            // InternalCPHLCL.g:3670:2: ( rule__Global__OpAssignment_0 )
            {
             before(grammarAccess.getGlobalAccess().getOpAssignment_0()); 
            // InternalCPHLCL.g:3671:2: ( rule__Global__OpAssignment_0 )
            // InternalCPHLCL.g:3671:3: rule__Global__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Global__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__0__Impl"


    // $ANTLR start "rule__Global__Group__1"
    // InternalCPHLCL.g:3679:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3683:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalCPHLCL.g:3684:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Global__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__1"


    // $ANTLR start "rule__Global__Group__1__Impl"
    // InternalCPHLCL.g:3691:1: rule__Global__Group__1__Impl : ( '(' ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3695:1: ( ( '(' ) )
            // InternalCPHLCL.g:3696:1: ( '(' )
            {
            // InternalCPHLCL.g:3696:1: ( '(' )
            // InternalCPHLCL.g:3697:2: '('
            {
             before(grammarAccess.getGlobalAccess().getLeftParenthesisKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__1__Impl"


    // $ANTLR start "rule__Global__Group__2"
    // InternalCPHLCL.g:3706:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3710:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalCPHLCL.g:3711:2: rule__Global__Group__2__Impl rule__Global__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Global__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__2"


    // $ANTLR start "rule__Global__Group__2__Impl"
    // InternalCPHLCL.g:3718:1: rule__Global__Group__2__Impl : ( ( rule__Global__VarsAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3722:1: ( ( ( rule__Global__VarsAssignment_2 ) ) )
            // InternalCPHLCL.g:3723:1: ( ( rule__Global__VarsAssignment_2 ) )
            {
            // InternalCPHLCL.g:3723:1: ( ( rule__Global__VarsAssignment_2 ) )
            // InternalCPHLCL.g:3724:2: ( rule__Global__VarsAssignment_2 )
            {
             before(grammarAccess.getGlobalAccess().getVarsAssignment_2()); 
            // InternalCPHLCL.g:3725:2: ( rule__Global__VarsAssignment_2 )
            // InternalCPHLCL.g:3725:3: rule__Global__VarsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Global__VarsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getVarsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__2__Impl"


    // $ANTLR start "rule__Global__Group__3"
    // InternalCPHLCL.g:3733:1: rule__Global__Group__3 : rule__Global__Group__3__Impl rule__Global__Group__4 ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3737:1: ( rule__Global__Group__3__Impl rule__Global__Group__4 )
            // InternalCPHLCL.g:3738:2: rule__Global__Group__3__Impl rule__Global__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__Global__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__3"


    // $ANTLR start "rule__Global__Group__3__Impl"
    // InternalCPHLCL.g:3745:1: rule__Global__Group__3__Impl : ( ')' ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3749:1: ( ( ')' ) )
            // InternalCPHLCL.g:3750:1: ( ')' )
            {
            // InternalCPHLCL.g:3750:1: ( ')' )
            // InternalCPHLCL.g:3751:2: ')'
            {
             before(grammarAccess.getGlobalAccess().getRightParenthesisKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__3__Impl"


    // $ANTLR start "rule__Global__Group__4"
    // InternalCPHLCL.g:3760:1: rule__Global__Group__4 : rule__Global__Group__4__Impl ;
    public final void rule__Global__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3764:1: ( rule__Global__Group__4__Impl )
            // InternalCPHLCL.g:3765:2: rule__Global__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__4"


    // $ANTLR start "rule__Global__Group__4__Impl"
    // InternalCPHLCL.g:3771:1: rule__Global__Group__4__Impl : ( ( rule__Global__Group_4__0 )? ) ;
    public final void rule__Global__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3775:1: ( ( ( rule__Global__Group_4__0 )? ) )
            // InternalCPHLCL.g:3776:1: ( ( rule__Global__Group_4__0 )? )
            {
            // InternalCPHLCL.g:3776:1: ( ( rule__Global__Group_4__0 )? )
            // InternalCPHLCL.g:3777:2: ( rule__Global__Group_4__0 )?
            {
             before(grammarAccess.getGlobalAccess().getGroup_4()); 
            // InternalCPHLCL.g:3778:2: ( rule__Global__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCPHLCL.g:3778:3: rule__Global__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Global__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__4__Impl"


    // $ANTLR start "rule__Global__Group_4__0"
    // InternalCPHLCL.g:3787:1: rule__Global__Group_4__0 : rule__Global__Group_4__0__Impl rule__Global__Group_4__1 ;
    public final void rule__Global__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3791:1: ( rule__Global__Group_4__0__Impl rule__Global__Group_4__1 )
            // InternalCPHLCL.g:3792:2: rule__Global__Group_4__0__Impl rule__Global__Group_4__1
            {
            pushFollow(FOLLOW_43);
            rule__Global__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_4__0"


    // $ANTLR start "rule__Global__Group_4__0__Impl"
    // InternalCPHLCL.g:3799:1: rule__Global__Group_4__0__Impl : ( '[' ) ;
    public final void rule__Global__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3803:1: ( ( '[' ) )
            // InternalCPHLCL.g:3804:1: ( '[' )
            {
            // InternalCPHLCL.g:3804:1: ( '[' )
            // InternalCPHLCL.g:3805:2: '['
            {
             before(grammarAccess.getGlobalAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_4__0__Impl"


    // $ANTLR start "rule__Global__Group_4__1"
    // InternalCPHLCL.g:3814:1: rule__Global__Group_4__1 : rule__Global__Group_4__1__Impl rule__Global__Group_4__2 ;
    public final void rule__Global__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3818:1: ( rule__Global__Group_4__1__Impl rule__Global__Group_4__2 )
            // InternalCPHLCL.g:3819:2: rule__Global__Group_4__1__Impl rule__Global__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__Global__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_4__1"


    // $ANTLR start "rule__Global__Group_4__1__Impl"
    // InternalCPHLCL.g:3826:1: rule__Global__Group_4__1__Impl : ( ( rule__Global__ValuesAssignment_4_1 ) ) ;
    public final void rule__Global__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3830:1: ( ( ( rule__Global__ValuesAssignment_4_1 ) ) )
            // InternalCPHLCL.g:3831:1: ( ( rule__Global__ValuesAssignment_4_1 ) )
            {
            // InternalCPHLCL.g:3831:1: ( ( rule__Global__ValuesAssignment_4_1 ) )
            // InternalCPHLCL.g:3832:2: ( rule__Global__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getGlobalAccess().getValuesAssignment_4_1()); 
            // InternalCPHLCL.g:3833:2: ( rule__Global__ValuesAssignment_4_1 )
            // InternalCPHLCL.g:3833:3: rule__Global__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Global__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_4__1__Impl"


    // $ANTLR start "rule__Global__Group_4__2"
    // InternalCPHLCL.g:3841:1: rule__Global__Group_4__2 : rule__Global__Group_4__2__Impl ;
    public final void rule__Global__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3845:1: ( rule__Global__Group_4__2__Impl )
            // InternalCPHLCL.g:3846:2: rule__Global__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_4__2"


    // $ANTLR start "rule__Global__Group_4__2__Impl"
    // InternalCPHLCL.g:3852:1: rule__Global__Group_4__2__Impl : ( ']' ) ;
    public final void rule__Global__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3856:1: ( ( ']' ) )
            // InternalCPHLCL.g:3857:1: ( ']' )
            {
            // InternalCPHLCL.g:3857:1: ( ']' )
            // InternalCPHLCL.g:3858:2: ']'
            {
             before(grammarAccess.getGlobalAccess().getRightSquareBracketKeyword_4_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getRightSquareBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_4__2__Impl"


    // $ANTLR start "rule__ListOfValues__Group__0"
    // InternalCPHLCL.g:3868:1: rule__ListOfValues__Group__0 : rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 ;
    public final void rule__ListOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3872:1: ( rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 )
            // InternalCPHLCL.g:3873:2: rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ListOfValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__Group__0"


    // $ANTLR start "rule__ListOfValues__Group__0__Impl"
    // InternalCPHLCL.g:3880:1: rule__ListOfValues__Group__0__Impl : ( ( rule__ListOfValues__ValuesAssignment_0 ) ) ;
    public final void rule__ListOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3884:1: ( ( ( rule__ListOfValues__ValuesAssignment_0 ) ) )
            // InternalCPHLCL.g:3885:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            {
            // InternalCPHLCL.g:3885:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            // InternalCPHLCL.g:3886:2: ( rule__ListOfValues__ValuesAssignment_0 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_0()); 
            // InternalCPHLCL.g:3887:2: ( rule__ListOfValues__ValuesAssignment_0 )
            // InternalCPHLCL.g:3887:3: rule__ListOfValues__ValuesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__ValuesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListOfValuesAccess().getValuesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__Group__0__Impl"


    // $ANTLR start "rule__ListOfValues__Group__1"
    // InternalCPHLCL.g:3895:1: rule__ListOfValues__Group__1 : rule__ListOfValues__Group__1__Impl ;
    public final void rule__ListOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3899:1: ( rule__ListOfValues__Group__1__Impl )
            // InternalCPHLCL.g:3900:2: rule__ListOfValues__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__Group__1"


    // $ANTLR start "rule__ListOfValues__Group__1__Impl"
    // InternalCPHLCL.g:3906:1: rule__ListOfValues__Group__1__Impl : ( ( rule__ListOfValues__Group_1__0 )* ) ;
    public final void rule__ListOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3910:1: ( ( ( rule__ListOfValues__Group_1__0 )* ) )
            // InternalCPHLCL.g:3911:1: ( ( rule__ListOfValues__Group_1__0 )* )
            {
            // InternalCPHLCL.g:3911:1: ( ( rule__ListOfValues__Group_1__0 )* )
            // InternalCPHLCL.g:3912:2: ( rule__ListOfValues__Group_1__0 )*
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalCPHLCL.g:3913:2: ( rule__ListOfValues__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==53) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCPHLCL.g:3913:3: rule__ListOfValues__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__ListOfValues__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getListOfValuesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__Group__1__Impl"


    // $ANTLR start "rule__ListOfValues__Group_1__0"
    // InternalCPHLCL.g:3922:1: rule__ListOfValues__Group_1__0 : rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 ;
    public final void rule__ListOfValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3926:1: ( rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 )
            // InternalCPHLCL.g:3927:2: rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ListOfValues__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__Group_1__0"


    // $ANTLR start "rule__ListOfValues__Group_1__0__Impl"
    // InternalCPHLCL.g:3934:1: rule__ListOfValues__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3938:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalCPHLCL.g:3939:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalCPHLCL.g:3939:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalCPHLCL.g:3940:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalCPHLCL.g:3940:2: ( ( ',' ) )
            // InternalCPHLCL.g:3941:3: ( ',' )
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalCPHLCL.g:3942:3: ( ',' )
            // InternalCPHLCL.g:3942:4: ','
            {
            match(input,53,FOLLOW_44); 

            }

             after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 

            }

            // InternalCPHLCL.g:3945:2: ( ( ',' )* )
            // InternalCPHLCL.g:3946:3: ( ',' )*
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalCPHLCL.g:3947:3: ( ',' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==53) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCPHLCL.g:3947:4: ','
            	    {
            	    match(input,53,FOLLOW_44); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__Group_1__0__Impl"


    // $ANTLR start "rule__ListOfValues__Group_1__1"
    // InternalCPHLCL.g:3956:1: rule__ListOfValues__Group_1__1 : rule__ListOfValues__Group_1__1__Impl ;
    public final void rule__ListOfValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3960:1: ( rule__ListOfValues__Group_1__1__Impl )
            // InternalCPHLCL.g:3961:2: rule__ListOfValues__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__Group_1__1"


    // $ANTLR start "rule__ListOfValues__Group_1__1__Impl"
    // InternalCPHLCL.g:3967:1: rule__ListOfValues__Group_1__1__Impl : ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) ;
    public final void rule__ListOfValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3971:1: ( ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) )
            // InternalCPHLCL.g:3972:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:3972:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            // InternalCPHLCL.g:3973:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1()); 
            // InternalCPHLCL.g:3974:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            // InternalCPHLCL.g:3974:3: rule__ListOfValues__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__ValuesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__Group_1__1__Impl"


    // $ANTLR start "rule__ListOfListValues__Group__0"
    // InternalCPHLCL.g:3983:1: rule__ListOfListValues__Group__0 : rule__ListOfListValues__Group__0__Impl rule__ListOfListValues__Group__1 ;
    public final void rule__ListOfListValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3987:1: ( rule__ListOfListValues__Group__0__Impl rule__ListOfListValues__Group__1 )
            // InternalCPHLCL.g:3988:2: rule__ListOfListValues__Group__0__Impl rule__ListOfListValues__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ListOfListValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListValues__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group__0"


    // $ANTLR start "rule__ListOfListValues__Group__0__Impl"
    // InternalCPHLCL.g:3995:1: rule__ListOfListValues__Group__0__Impl : ( '[' ) ;
    public final void rule__ListOfListValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3999:1: ( ( '[' ) )
            // InternalCPHLCL.g:4000:1: ( '[' )
            {
            // InternalCPHLCL.g:4000:1: ( '[' )
            // InternalCPHLCL.g:4001:2: '['
            {
             before(grammarAccess.getListOfListValuesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getListOfListValuesAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group__0__Impl"


    // $ANTLR start "rule__ListOfListValues__Group__1"
    // InternalCPHLCL.g:4010:1: rule__ListOfListValues__Group__1 : rule__ListOfListValues__Group__1__Impl rule__ListOfListValues__Group__2 ;
    public final void rule__ListOfListValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4014:1: ( rule__ListOfListValues__Group__1__Impl rule__ListOfListValues__Group__2 )
            // InternalCPHLCL.g:4015:2: rule__ListOfListValues__Group__1__Impl rule__ListOfListValues__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ListOfListValues__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListValues__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group__1"


    // $ANTLR start "rule__ListOfListValues__Group__1__Impl"
    // InternalCPHLCL.g:4022:1: rule__ListOfListValues__Group__1__Impl : ( ( rule__ListOfListValues__ListAssignment_1 ) ) ;
    public final void rule__ListOfListValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4026:1: ( ( ( rule__ListOfListValues__ListAssignment_1 ) ) )
            // InternalCPHLCL.g:4027:1: ( ( rule__ListOfListValues__ListAssignment_1 ) )
            {
            // InternalCPHLCL.g:4027:1: ( ( rule__ListOfListValues__ListAssignment_1 ) )
            // InternalCPHLCL.g:4028:2: ( rule__ListOfListValues__ListAssignment_1 )
            {
             before(grammarAccess.getListOfListValuesAccess().getListAssignment_1()); 
            // InternalCPHLCL.g:4029:2: ( rule__ListOfListValues__ListAssignment_1 )
            // InternalCPHLCL.g:4029:3: rule__ListOfListValues__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListValues__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListOfListValuesAccess().getListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group__1__Impl"


    // $ANTLR start "rule__ListOfListValues__Group__2"
    // InternalCPHLCL.g:4037:1: rule__ListOfListValues__Group__2 : rule__ListOfListValues__Group__2__Impl rule__ListOfListValues__Group__3 ;
    public final void rule__ListOfListValues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4041:1: ( rule__ListOfListValues__Group__2__Impl rule__ListOfListValues__Group__3 )
            // InternalCPHLCL.g:4042:2: rule__ListOfListValues__Group__2__Impl rule__ListOfListValues__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__ListOfListValues__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListValues__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group__2"


    // $ANTLR start "rule__ListOfListValues__Group__2__Impl"
    // InternalCPHLCL.g:4049:1: rule__ListOfListValues__Group__2__Impl : ( ']' ) ;
    public final void rule__ListOfListValues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4053:1: ( ( ']' ) )
            // InternalCPHLCL.g:4054:1: ( ']' )
            {
            // InternalCPHLCL.g:4054:1: ( ']' )
            // InternalCPHLCL.g:4055:2: ']'
            {
             before(grammarAccess.getListOfListValuesAccess().getRightSquareBracketKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getListOfListValuesAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group__2__Impl"


    // $ANTLR start "rule__ListOfListValues__Group__3"
    // InternalCPHLCL.g:4064:1: rule__ListOfListValues__Group__3 : rule__ListOfListValues__Group__3__Impl ;
    public final void rule__ListOfListValues__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4068:1: ( rule__ListOfListValues__Group__3__Impl )
            // InternalCPHLCL.g:4069:2: rule__ListOfListValues__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListValues__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group__3"


    // $ANTLR start "rule__ListOfListValues__Group__3__Impl"
    // InternalCPHLCL.g:4075:1: rule__ListOfListValues__Group__3__Impl : ( ( rule__ListOfListValues__Group_3__0 )* ) ;
    public final void rule__ListOfListValues__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4079:1: ( ( ( rule__ListOfListValues__Group_3__0 )* ) )
            // InternalCPHLCL.g:4080:1: ( ( rule__ListOfListValues__Group_3__0 )* )
            {
            // InternalCPHLCL.g:4080:1: ( ( rule__ListOfListValues__Group_3__0 )* )
            // InternalCPHLCL.g:4081:2: ( rule__ListOfListValues__Group_3__0 )*
            {
             before(grammarAccess.getListOfListValuesAccess().getGroup_3()); 
            // InternalCPHLCL.g:4082:2: ( rule__ListOfListValues__Group_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==53) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCPHLCL.g:4082:3: rule__ListOfListValues__Group_3__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__ListOfListValues__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getListOfListValuesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group__3__Impl"


    // $ANTLR start "rule__ListOfListValues__Group_3__0"
    // InternalCPHLCL.g:4091:1: rule__ListOfListValues__Group_3__0 : rule__ListOfListValues__Group_3__0__Impl rule__ListOfListValues__Group_3__1 ;
    public final void rule__ListOfListValues__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4095:1: ( rule__ListOfListValues__Group_3__0__Impl rule__ListOfListValues__Group_3__1 )
            // InternalCPHLCL.g:4096:2: rule__ListOfListValues__Group_3__0__Impl rule__ListOfListValues__Group_3__1
            {
            pushFollow(FOLLOW_43);
            rule__ListOfListValues__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListValues__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group_3__0"


    // $ANTLR start "rule__ListOfListValues__Group_3__0__Impl"
    // InternalCPHLCL.g:4103:1: rule__ListOfListValues__Group_3__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfListValues__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4107:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalCPHLCL.g:4108:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalCPHLCL.g:4108:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalCPHLCL.g:4109:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalCPHLCL.g:4109:2: ( ( ',' ) )
            // InternalCPHLCL.g:4110:3: ( ',' )
            {
             before(grammarAccess.getListOfListValuesAccess().getCommaKeyword_3_0()); 
            // InternalCPHLCL.g:4111:3: ( ',' )
            // InternalCPHLCL.g:4111:4: ','
            {
            match(input,53,FOLLOW_44); 

            }

             after(grammarAccess.getListOfListValuesAccess().getCommaKeyword_3_0()); 

            }

            // InternalCPHLCL.g:4114:2: ( ( ',' )* )
            // InternalCPHLCL.g:4115:3: ( ',' )*
            {
             before(grammarAccess.getListOfListValuesAccess().getCommaKeyword_3_0()); 
            // InternalCPHLCL.g:4116:3: ( ',' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==53) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCPHLCL.g:4116:4: ','
            	    {
            	    match(input,53,FOLLOW_44); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getListOfListValuesAccess().getCommaKeyword_3_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group_3__0__Impl"


    // $ANTLR start "rule__ListOfListValues__Group_3__1"
    // InternalCPHLCL.g:4125:1: rule__ListOfListValues__Group_3__1 : rule__ListOfListValues__Group_3__1__Impl rule__ListOfListValues__Group_3__2 ;
    public final void rule__ListOfListValues__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4129:1: ( rule__ListOfListValues__Group_3__1__Impl rule__ListOfListValues__Group_3__2 )
            // InternalCPHLCL.g:4130:2: rule__ListOfListValues__Group_3__1__Impl rule__ListOfListValues__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__ListOfListValues__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListValues__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group_3__1"


    // $ANTLR start "rule__ListOfListValues__Group_3__1__Impl"
    // InternalCPHLCL.g:4137:1: rule__ListOfListValues__Group_3__1__Impl : ( '[' ) ;
    public final void rule__ListOfListValues__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4141:1: ( ( '[' ) )
            // InternalCPHLCL.g:4142:1: ( '[' )
            {
            // InternalCPHLCL.g:4142:1: ( '[' )
            // InternalCPHLCL.g:4143:2: '['
            {
             before(grammarAccess.getListOfListValuesAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getListOfListValuesAccess().getLeftSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group_3__1__Impl"


    // $ANTLR start "rule__ListOfListValues__Group_3__2"
    // InternalCPHLCL.g:4152:1: rule__ListOfListValues__Group_3__2 : rule__ListOfListValues__Group_3__2__Impl rule__ListOfListValues__Group_3__3 ;
    public final void rule__ListOfListValues__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4156:1: ( rule__ListOfListValues__Group_3__2__Impl rule__ListOfListValues__Group_3__3 )
            // InternalCPHLCL.g:4157:2: rule__ListOfListValues__Group_3__2__Impl rule__ListOfListValues__Group_3__3
            {
            pushFollow(FOLLOW_15);
            rule__ListOfListValues__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListValues__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group_3__2"


    // $ANTLR start "rule__ListOfListValues__Group_3__2__Impl"
    // InternalCPHLCL.g:4164:1: rule__ListOfListValues__Group_3__2__Impl : ( ( rule__ListOfListValues__ListAssignment_3_2 ) ) ;
    public final void rule__ListOfListValues__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4168:1: ( ( ( rule__ListOfListValues__ListAssignment_3_2 ) ) )
            // InternalCPHLCL.g:4169:1: ( ( rule__ListOfListValues__ListAssignment_3_2 ) )
            {
            // InternalCPHLCL.g:4169:1: ( ( rule__ListOfListValues__ListAssignment_3_2 ) )
            // InternalCPHLCL.g:4170:2: ( rule__ListOfListValues__ListAssignment_3_2 )
            {
             before(grammarAccess.getListOfListValuesAccess().getListAssignment_3_2()); 
            // InternalCPHLCL.g:4171:2: ( rule__ListOfListValues__ListAssignment_3_2 )
            // InternalCPHLCL.g:4171:3: rule__ListOfListValues__ListAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListValues__ListAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getListOfListValuesAccess().getListAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group_3__2__Impl"


    // $ANTLR start "rule__ListOfListValues__Group_3__3"
    // InternalCPHLCL.g:4179:1: rule__ListOfListValues__Group_3__3 : rule__ListOfListValues__Group_3__3__Impl ;
    public final void rule__ListOfListValues__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4183:1: ( rule__ListOfListValues__Group_3__3__Impl )
            // InternalCPHLCL.g:4184:2: rule__ListOfListValues__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListValues__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group_3__3"


    // $ANTLR start "rule__ListOfListValues__Group_3__3__Impl"
    // InternalCPHLCL.g:4190:1: rule__ListOfListValues__Group_3__3__Impl : ( ']' ) ;
    public final void rule__ListOfListValues__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4194:1: ( ( ']' ) )
            // InternalCPHLCL.g:4195:1: ( ']' )
            {
            // InternalCPHLCL.g:4195:1: ( ']' )
            // InternalCPHLCL.g:4196:2: ']'
            {
             before(grammarAccess.getListOfListValuesAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getListOfListValuesAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__Group_3__3__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalCPHLCL.g:4206:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4210:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4211:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:4211:2: ( RULE_ID )
            // InternalCPHLCL.g:4212:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__VariablesAssignment_3"
    // InternalCPHLCL.g:4221:1: rule__Model__VariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__Model__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4225:1: ( ( ruleVariable ) )
            // InternalCPHLCL.g:4226:2: ( ruleVariable )
            {
            // InternalCPHLCL.g:4226:2: ( ruleVariable )
            // InternalCPHLCL.g:4227:3: ruleVariable
            {
             before(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VariablesAssignment_3"


    // $ANTLR start "rule__Model__ConstraintsAssignment_5"
    // InternalCPHLCL.g:4236:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4240:1: ( ( ruleConstraint ) )
            // InternalCPHLCL.g:4241:2: ( ruleConstraint )
            {
            // InternalCPHLCL.g:4241:2: ( ruleConstraint )
            // InternalCPHLCL.g:4242:3: ruleConstraint
            {
             before(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConstraintsAssignment_5"


    // $ANTLR start "rule__Model__StrategyAssignment_6_1"
    // InternalCPHLCL.g:4251:1: rule__Model__StrategyAssignment_6_1 : ( ruleStrategy ) ;
    public final void rule__Model__StrategyAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4255:1: ( ( ruleStrategy ) )
            // InternalCPHLCL.g:4256:2: ( ruleStrategy )
            {
            // InternalCPHLCL.g:4256:2: ( ruleStrategy )
            // InternalCPHLCL.g:4257:3: ruleStrategy
            {
             before(grammarAccess.getModelAccess().getStrategyStrategyParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStrategyStrategyParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StrategyAssignment_6_1"


    // $ANTLR start "rule__Variable__TypeAssignment_0"
    // InternalCPHLCL.g:4266:1: rule__Variable__TypeAssignment_0 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4270:1: ( ( ruleVarType ) )
            // InternalCPHLCL.g:4271:2: ( ruleVarType )
            {
            // InternalCPHLCL.g:4271:2: ( ruleVarType )
            // InternalCPHLCL.g:4272:3: ruleVarType
            {
             before(grammarAccess.getVariableAccess().getTypeVarTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeVarTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalCPHLCL.g:4281:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4285:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4286:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:4286:2: ( RULE_ID )
            // InternalCPHLCL.g:4287:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__DomainAssignment_2_1"
    // InternalCPHLCL.g:4296:1: rule__Variable__DomainAssignment_2_1 : ( ruleDomainDeclaration ) ;
    public final void rule__Variable__DomainAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4300:1: ( ( ruleDomainDeclaration ) )
            // InternalCPHLCL.g:4301:2: ( ruleDomainDeclaration )
            {
            // InternalCPHLCL.g:4301:2: ( ruleDomainDeclaration )
            // InternalCPHLCL.g:4302:3: ruleDomainDeclaration
            {
             before(grammarAccess.getVariableAccess().getDomainDomainDeclarationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getDomainDomainDeclarationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__DomainAssignment_2_1"


    // $ANTLR start "rule__Interval__StartAssignment_0"
    // InternalCPHLCL.g:4311:1: rule__Interval__StartAssignment_0 : ( ruleNumber ) ;
    public final void rule__Interval__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4315:1: ( ( ruleNumber ) )
            // InternalCPHLCL.g:4316:2: ( ruleNumber )
            {
            // InternalCPHLCL.g:4316:2: ( ruleNumber )
            // InternalCPHLCL.g:4317:3: ruleNumber
            {
             before(grammarAccess.getIntervalAccess().getStartNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getStartNumberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__StartAssignment_0"


    // $ANTLR start "rule__Interval__EndAssignment_2"
    // InternalCPHLCL.g:4326:1: rule__Interval__EndAssignment_2 : ( ruleNumber ) ;
    public final void rule__Interval__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4330:1: ( ( ruleNumber ) )
            // InternalCPHLCL.g:4331:2: ( ruleNumber )
            {
            // InternalCPHLCL.g:4331:2: ( ruleNumber )
            // InternalCPHLCL.g:4332:3: ruleNumber
            {
             before(grammarAccess.getIntervalAccess().getEndNumberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getEndNumberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__EndAssignment_2"


    // $ANTLR start "rule__Enumeration__ListAssignment_1"
    // InternalCPHLCL.g:4341:1: rule__Enumeration__ListAssignment_1 : ( ruleListOfValues ) ;
    public final void rule__Enumeration__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4345:1: ( ( ruleListOfValues ) )
            // InternalCPHLCL.g:4346:2: ( ruleListOfValues )
            {
            // InternalCPHLCL.g:4346:2: ( ruleListOfValues )
            // InternalCPHLCL.g:4347:3: ruleListOfValues
            {
             before(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ListAssignment_1"


    // $ANTLR start "rule__Constraint__NameAssignment_0"
    // InternalCPHLCL.g:4356:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4360:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4361:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:4361:2: ( RULE_ID )
            // InternalCPHLCL.g:4362:3: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_0"


    // $ANTLR start "rule__Constraint__ExpAssignment_2"
    // InternalCPHLCL.g:4371:1: rule__Constraint__ExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4375:1: ( ( ruleExpression ) )
            // InternalCPHLCL.g:4376:2: ( ruleExpression )
            {
            // InternalCPHLCL.g:4376:2: ( ruleExpression )
            // InternalCPHLCL.g:4377:3: ruleExpression
            {
             before(grammarAccess.getConstraintAccess().getExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getExpExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ExpAssignment_2"


    // $ANTLR start "rule__Iff__RightAssignment_1_2"
    // InternalCPHLCL.g:4386:1: rule__Iff__RightAssignment_1_2 : ( ruleImplies ) ;
    public final void rule__Iff__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4390:1: ( ( ruleImplies ) )
            // InternalCPHLCL.g:4391:2: ( ruleImplies )
            {
            // InternalCPHLCL.g:4391:2: ( ruleImplies )
            // InternalCPHLCL.g:4392:3: ruleImplies
            {
             before(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImplies();

            state._fsp--;

             after(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__RightAssignment_1_2"


    // $ANTLR start "rule__Implies__RightAssignment_1_2"
    // InternalCPHLCL.g:4401:1: rule__Implies__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Implies__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4405:1: ( ( ruleOr ) )
            // InternalCPHLCL.g:4406:2: ( ruleOr )
            {
            // InternalCPHLCL.g:4406:2: ( ruleOr )
            // InternalCPHLCL.g:4407:3: ruleOr
            {
             before(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__RightAssignment_1_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalCPHLCL.g:4416:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4420:1: ( ( ruleAnd ) )
            // InternalCPHLCL.g:4421:2: ( ruleAnd )
            {
            // InternalCPHLCL.g:4421:2: ( ruleAnd )
            // InternalCPHLCL.g:4422:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalCPHLCL.g:4431:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4435:1: ( ( ruleEquality ) )
            // InternalCPHLCL.g:4436:2: ( ruleEquality )
            {
            // InternalCPHLCL.g:4436:2: ( ruleEquality )
            // InternalCPHLCL.g:4437:3: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalCPHLCL.g:4446:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4450:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalCPHLCL.g:4451:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalCPHLCL.g:4451:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalCPHLCL.g:4452:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalCPHLCL.g:4453:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalCPHLCL.g:4453:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalCPHLCL.g:4461:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4465:1: ( ( ruleComparison ) )
            // InternalCPHLCL.g:4466:2: ( ruleComparison )
            {
            // InternalCPHLCL.g:4466:2: ( ruleComparison )
            // InternalCPHLCL.g:4467:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // InternalCPHLCL.g:4476:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4480:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalCPHLCL.g:4481:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalCPHLCL.g:4481:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalCPHLCL.g:4482:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalCPHLCL.g:4483:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalCPHLCL.g:4483:4: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalCPHLCL.g:4491:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4495:1: ( ( rulePlusOrMinus ) )
            // InternalCPHLCL.g:4496:2: ( rulePlusOrMinus )
            {
            // InternalCPHLCL.g:4496:2: ( rulePlusOrMinus )
            // InternalCPHLCL.g:4497:3: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalCPHLCL.g:4506:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4510:1: ( ( ruleMulOrDiv ) )
            // InternalCPHLCL.g:4511:2: ( ruleMulOrDiv )
            {
            // InternalCPHLCL.g:4511:2: ( ruleMulOrDiv )
            // InternalCPHLCL.g:4512:3: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_1"
    // InternalCPHLCL.g:4521:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4525:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalCPHLCL.g:4526:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalCPHLCL.g:4526:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalCPHLCL.g:4527:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalCPHLCL.g:4528:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalCPHLCL.g:4528:4: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_2"
    // InternalCPHLCL.g:4536:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4540:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4541:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4541:2: ( rulePrimary )
            // InternalCPHLCL.g:4542:3: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalCPHLCL.g:4551:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4555:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4556:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4556:2: ( rulePrimary )
            // InternalCPHLCL.g:4557:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Primary__OpAssignment_2_1"
    // InternalCPHLCL.g:4566:1: rule__Primary__OpAssignment_2_1 : ( ruleUnaryOp ) ;
    public final void rule__Primary__OpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4570:1: ( ( ruleUnaryOp ) )
            // InternalCPHLCL.g:4571:2: ( ruleUnaryOp )
            {
            // InternalCPHLCL.g:4571:2: ( ruleUnaryOp )
            // InternalCPHLCL.g:4572:3: ruleUnaryOp
            {
             before(grammarAccess.getPrimaryAccess().getOpUnaryOpParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getOpUnaryOpParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__OpAssignment_2_1"


    // $ANTLR start "rule__Primary__ExpressionAssignment_2_2"
    // InternalCPHLCL.g:4581:1: rule__Primary__ExpressionAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4585:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4586:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4586:2: ( rulePrimary )
            // InternalCPHLCL.g:4587:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_2_2"


    // $ANTLR start "rule__Primary__OpAssignment_3_1"
    // InternalCPHLCL.g:4596:1: rule__Primary__OpAssignment_3_1 : ( ruleFunctionOp ) ;
    public final void rule__Primary__OpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4600:1: ( ( ruleFunctionOp ) )
            // InternalCPHLCL.g:4601:2: ( ruleFunctionOp )
            {
            // InternalCPHLCL.g:4601:2: ( ruleFunctionOp )
            // InternalCPHLCL.g:4602:3: ruleFunctionOp
            {
             before(grammarAccess.getPrimaryAccess().getOpFunctionOpParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionOp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getOpFunctionOpParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__OpAssignment_3_1"


    // $ANTLR start "rule__Primary__LeftAssignment_3_3"
    // InternalCPHLCL.g:4611:1: rule__Primary__LeftAssignment_3_3 : ( rulePrimary ) ;
    public final void rule__Primary__LeftAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4615:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4616:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4616:2: ( rulePrimary )
            // InternalCPHLCL.g:4617:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__LeftAssignment_3_3"


    // $ANTLR start "rule__Primary__RightAssignment_3_5"
    // InternalCPHLCL.g:4626:1: rule__Primary__RightAssignment_3_5 : ( rulePrimary ) ;
    public final void rule__Primary__RightAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4630:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4631:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4631:2: ( rulePrimary )
            // InternalCPHLCL.g:4632:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getRightPrimaryParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getRightPrimaryParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__RightAssignment_3_5"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalCPHLCL.g:4641:1: rule__Atomic__ValueAssignment_0_1 : ( ( rule__Atomic__ValueAlternatives_0_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4645:1: ( ( ( rule__Atomic__ValueAlternatives_0_1_0 ) ) )
            // InternalCPHLCL.g:4646:2: ( ( rule__Atomic__ValueAlternatives_0_1_0 ) )
            {
            // InternalCPHLCL.g:4646:2: ( ( rule__Atomic__ValueAlternatives_0_1_0 ) )
            // InternalCPHLCL.g:4647:3: ( rule__Atomic__ValueAlternatives_0_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_0_1_0()); 
            // InternalCPHLCL.g:4648:3: ( rule__Atomic__ValueAlternatives_0_1_0 )
            // InternalCPHLCL.g:4648:4: rule__Atomic__ValueAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_1_1"
    // InternalCPHLCL.g:4656:1: rule__Atomic__VariableAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4660:1: ( ( ( RULE_ID ) ) )
            // InternalCPHLCL.g:4661:2: ( ( RULE_ID ) )
            {
            // InternalCPHLCL.g:4661:2: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4662:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_1_1_0()); 
            // InternalCPHLCL.g:4663:3: ( RULE_ID )
            // InternalCPHLCL.g:4664:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__VariableAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalCPHLCL.g:4675:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4679:1: ( ( RULE_INT ) )
            // InternalCPHLCL.g:4680:2: ( RULE_INT )
            {
            // InternalCPHLCL.g:4680:2: ( RULE_INT )
            // InternalCPHLCL.g:4681:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Global__OpAssignment_0"
    // InternalCPHLCL.g:4690:1: rule__Global__OpAssignment_0 : ( ruleGlobalOp ) ;
    public final void rule__Global__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4694:1: ( ( ruleGlobalOp ) )
            // InternalCPHLCL.g:4695:2: ( ruleGlobalOp )
            {
            // InternalCPHLCL.g:4695:2: ( ruleGlobalOp )
            // InternalCPHLCL.g:4696:3: ruleGlobalOp
            {
             before(grammarAccess.getGlobalAccess().getOpGlobalOpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalOp();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getOpGlobalOpParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__OpAssignment_0"


    // $ANTLR start "rule__Global__VarsAssignment_2"
    // InternalCPHLCL.g:4705:1: rule__Global__VarsAssignment_2 : ( ruleListOfIDs ) ;
    public final void rule__Global__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4709:1: ( ( ruleListOfIDs ) )
            // InternalCPHLCL.g:4710:2: ( ruleListOfIDs )
            {
            // InternalCPHLCL.g:4710:2: ( ruleListOfIDs )
            // InternalCPHLCL.g:4711:3: ruleListOfIDs
            {
             before(grammarAccess.getGlobalAccess().getVarsListOfIDsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getVarsListOfIDsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__VarsAssignment_2"


    // $ANTLR start "rule__Global__ValuesAssignment_4_1"
    // InternalCPHLCL.g:4720:1: rule__Global__ValuesAssignment_4_1 : ( ruleListOfListValues ) ;
    public final void rule__Global__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4724:1: ( ( ruleListOfListValues ) )
            // InternalCPHLCL.g:4725:2: ( ruleListOfListValues )
            {
            // InternalCPHLCL.g:4725:2: ( ruleListOfListValues )
            // InternalCPHLCL.g:4726:3: ruleListOfListValues
            {
             before(grammarAccess.getGlobalAccess().getValuesListOfListValuesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfListValues();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getValuesListOfListValuesParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__ValuesAssignment_4_1"


    // $ANTLR start "rule__BoolVal__ValueAssignment"
    // InternalCPHLCL.g:4735:1: rule__BoolVal__ValueAssignment : ( ( rule__BoolVal__ValueAlternatives_0 ) ) ;
    public final void rule__BoolVal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4739:1: ( ( ( rule__BoolVal__ValueAlternatives_0 ) ) )
            // InternalCPHLCL.g:4740:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            {
            // InternalCPHLCL.g:4740:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            // InternalCPHLCL.g:4741:3: ( rule__BoolVal__ValueAlternatives_0 )
            {
             before(grammarAccess.getBoolValAccess().getValueAlternatives_0()); 
            // InternalCPHLCL.g:4742:3: ( rule__BoolVal__ValueAlternatives_0 )
            // InternalCPHLCL.g:4742:4: rule__BoolVal__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolVal__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolValAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolVal__ValueAssignment"


    // $ANTLR start "rule__Number__ValueAssignment"
    // InternalCPHLCL.g:4750:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4754:1: ( ( RULE_INT ) )
            // InternalCPHLCL.g:4755:2: ( RULE_INT )
            {
            // InternalCPHLCL.g:4755:2: ( RULE_INT )
            // InternalCPHLCL.g:4756:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment"


    // $ANTLR start "rule__Symbol__ValueAssignment"
    // InternalCPHLCL.g:4765:1: rule__Symbol__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Symbol__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4769:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4770:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:4770:2: ( RULE_ID )
            // InternalCPHLCL.g:4771:3: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSymbolAccess().getValueIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__ValueAssignment"


    // $ANTLR start "rule__ListOfValues__ValuesAssignment_0"
    // InternalCPHLCL.g:4780:1: rule__ListOfValues__ValuesAssignment_0 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4784:1: ( ( ruleValue ) )
            // InternalCPHLCL.g:4785:2: ( ruleValue )
            {
            // InternalCPHLCL.g:4785:2: ( ruleValue )
            // InternalCPHLCL.g:4786:3: ruleValue
            {
             before(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__ValuesAssignment_0"


    // $ANTLR start "rule__ListOfValues__ValuesAssignment_1_1"
    // InternalCPHLCL.g:4795:1: rule__ListOfValues__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4799:1: ( ( ruleValue ) )
            // InternalCPHLCL.g:4800:2: ( ruleValue )
            {
            // InternalCPHLCL.g:4800:2: ( ruleValue )
            // InternalCPHLCL.g:4801:3: ruleValue
            {
             before(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__ValuesAssignment_1_1"


    // $ANTLR start "rule__ListOfListValues__ListAssignment_1"
    // InternalCPHLCL.g:4810:1: rule__ListOfListValues__ListAssignment_1 : ( ruleListOfValues ) ;
    public final void rule__ListOfListValues__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4814:1: ( ( ruleListOfValues ) )
            // InternalCPHLCL.g:4815:2: ( ruleListOfValues )
            {
            // InternalCPHLCL.g:4815:2: ( ruleListOfValues )
            // InternalCPHLCL.g:4816:3: ruleListOfValues
            {
             before(grammarAccess.getListOfListValuesAccess().getListListOfValuesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getListOfListValuesAccess().getListListOfValuesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__ListAssignment_1"


    // $ANTLR start "rule__ListOfListValues__ListAssignment_3_2"
    // InternalCPHLCL.g:4825:1: rule__ListOfListValues__ListAssignment_3_2 : ( ruleListOfValues ) ;
    public final void rule__ListOfListValues__ListAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4829:1: ( ( ruleListOfValues ) )
            // InternalCPHLCL.g:4830:2: ( ruleListOfValues )
            {
            // InternalCPHLCL.g:4830:2: ( ruleListOfValues )
            // InternalCPHLCL.g:4831:3: ruleListOfValues
            {
             before(grammarAccess.getListOfListValuesAccess().getListListOfValuesParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getListOfListValuesAccess().getListListOfValuesParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListValues__ListAssignment_3_2"


    // $ANTLR start "rule__ListOfIDs__IdsAssignment"
    // InternalCPHLCL.g:4840:1: rule__ListOfIDs__IdsAssignment : ( RULE_ID ) ;
    public final void rule__ListOfIDs__IdsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4844:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4845:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:4845:2: ( RULE_ID )
            // InternalCPHLCL.g:4846:3: RULE_ID
            {
             before(grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfIDs__IdsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002007000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00140007F8300030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00140007E0300030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000002L});

}