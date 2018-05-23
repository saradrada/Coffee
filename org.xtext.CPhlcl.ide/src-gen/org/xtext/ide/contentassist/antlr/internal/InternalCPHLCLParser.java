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


    // $ANTLR start "entryRuleListOfIDs"
    // InternalCPHLCL.g:803:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalCPHLCL.g:804:1: ( ruleListOfIDs EOF )
            // InternalCPHLCL.g:805:1: ruleListOfIDs EOF
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
    // InternalCPHLCL.g:812:1: ruleListOfIDs : ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:816:2: ( ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) )
            // InternalCPHLCL.g:817:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            {
            // InternalCPHLCL.g:817:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            // InternalCPHLCL.g:818:3: ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* )
            {
            // InternalCPHLCL.g:818:3: ( ( rule__ListOfIDs__IdsAssignment ) )
            // InternalCPHLCL.g:819:4: ( rule__ListOfIDs__IdsAssignment )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            // InternalCPHLCL.g:820:4: ( rule__ListOfIDs__IdsAssignment )
            // InternalCPHLCL.g:820:5: rule__ListOfIDs__IdsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ListOfIDs__IdsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 

            }

            // InternalCPHLCL.g:823:3: ( ( rule__ListOfIDs__IdsAssignment )* )
            // InternalCPHLCL.g:824:4: ( rule__ListOfIDs__IdsAssignment )*
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            // InternalCPHLCL.g:825:4: ( rule__ListOfIDs__IdsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCPHLCL.g:825:5: rule__ListOfIDs__IdsAssignment
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
    // InternalCPHLCL.g:834:1: rule__DomainDeclaration__Alternatives : ( ( ruleInterval ) | ( ruleEnumeration ) );
    public final void rule__DomainDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:838:1: ( ( ruleInterval ) | ( ruleEnumeration ) )
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
                    // InternalCPHLCL.g:839:2: ( ruleInterval )
                    {
                    // InternalCPHLCL.g:839:2: ( ruleInterval )
                    // InternalCPHLCL.g:840:3: ruleInterval
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
                    // InternalCPHLCL.g:845:2: ( ruleEnumeration )
                    {
                    // InternalCPHLCL.g:845:2: ( ruleEnumeration )
                    // InternalCPHLCL.g:846:3: ruleEnumeration
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
    // InternalCPHLCL.g:855:1: rule__Expression__Alternatives : ( ( ruleRelational ) | ( ruleGlobal ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:859:1: ( ( ruleRelational ) | ( ruleGlobal ) )
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
                    // InternalCPHLCL.g:860:2: ( ruleRelational )
                    {
                    // InternalCPHLCL.g:860:2: ( ruleRelational )
                    // InternalCPHLCL.g:861:3: ruleRelational
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
                    // InternalCPHLCL.g:866:2: ( ruleGlobal )
                    {
                    // InternalCPHLCL.g:866:2: ( ruleGlobal )
                    // InternalCPHLCL.g:867:3: ruleGlobal
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
    // InternalCPHLCL.g:876:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '=' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:880:1: ( ( '=' ) | ( '!=' ) )
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
                    // InternalCPHLCL.g:881:2: ( '=' )
                    {
                    // InternalCPHLCL.g:881:2: ( '=' )
                    // InternalCPHLCL.g:882:3: '='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:887:2: ( '!=' )
                    {
                    // InternalCPHLCL.g:887:2: ( '!=' )
                    // InternalCPHLCL.g:888:3: '!='
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
    // InternalCPHLCL.g:897:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:901:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
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
                    // InternalCPHLCL.g:902:2: ( '>=' )
                    {
                    // InternalCPHLCL.g:902:2: ( '>=' )
                    // InternalCPHLCL.g:903:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:908:2: ( '<=' )
                    {
                    // InternalCPHLCL.g:908:2: ( '<=' )
                    // InternalCPHLCL.g:909:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:914:2: ( '>' )
                    {
                    // InternalCPHLCL.g:914:2: ( '>' )
                    // InternalCPHLCL.g:915:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:920:2: ( '<' )
                    {
                    // InternalCPHLCL.g:920:2: ( '<' )
                    // InternalCPHLCL.g:921:3: '<'
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
    // InternalCPHLCL.g:930:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:934:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
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
                    // InternalCPHLCL.g:935:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalCPHLCL.g:935:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalCPHLCL.g:936:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalCPHLCL.g:937:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalCPHLCL.g:937:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalCPHLCL.g:941:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalCPHLCL.g:941:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalCPHLCL.g:942:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalCPHLCL.g:943:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalCPHLCL.g:943:4: rule__PlusOrMinus__Group_1_0_1__0
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
    // InternalCPHLCL.g:951:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( 'mod' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:955:1: ( ( '*' ) | ( '/' ) | ( 'mod' ) )
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
                    // InternalCPHLCL.g:956:2: ( '*' )
                    {
                    // InternalCPHLCL.g:956:2: ( '*' )
                    // InternalCPHLCL.g:957:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:962:2: ( '/' )
                    {
                    // InternalCPHLCL.g:962:2: ( '/' )
                    // InternalCPHLCL.g:963:3: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:968:2: ( 'mod' )
                    {
                    // InternalCPHLCL.g:968:2: ( 'mod' )
                    // InternalCPHLCL.g:969:3: 'mod'
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
    // InternalCPHLCL.g:978:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:982:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) )
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
                    // InternalCPHLCL.g:983:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalCPHLCL.g:983:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalCPHLCL.g:984:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalCPHLCL.g:985:3: ( rule__Primary__Group_0__0 )
                    // InternalCPHLCL.g:985:4: rule__Primary__Group_0__0
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
                    // InternalCPHLCL.g:989:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalCPHLCL.g:989:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalCPHLCL.g:990:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalCPHLCL.g:991:3: ( rule__Primary__Group_1__0 )
                    // InternalCPHLCL.g:991:4: rule__Primary__Group_1__0
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
                    // InternalCPHLCL.g:995:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalCPHLCL.g:995:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalCPHLCL.g:996:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalCPHLCL.g:997:3: ( rule__Primary__Group_2__0 )
                    // InternalCPHLCL.g:997:4: rule__Primary__Group_2__0
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
                    // InternalCPHLCL.g:1001:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalCPHLCL.g:1001:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalCPHLCL.g:1002:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalCPHLCL.g:1003:3: ( rule__Primary__Group_3__0 )
                    // InternalCPHLCL.g:1003:4: rule__Primary__Group_3__0
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
                    // InternalCPHLCL.g:1007:2: ( ruleAtomic )
                    {
                    // InternalCPHLCL.g:1007:2: ( ruleAtomic )
                    // InternalCPHLCL.g:1008:3: ruleAtomic
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
    // InternalCPHLCL.g:1017:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1021:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) )
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
                    // InternalCPHLCL.g:1022:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalCPHLCL.g:1022:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalCPHLCL.g:1023:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalCPHLCL.g:1024:3: ( rule__Atomic__Group_0__0 )
                    // InternalCPHLCL.g:1024:4: rule__Atomic__Group_0__0
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
                    // InternalCPHLCL.g:1028:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalCPHLCL.g:1028:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalCPHLCL.g:1029:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalCPHLCL.g:1030:3: ( rule__Atomic__Group_1__0 )
                    // InternalCPHLCL.g:1030:4: rule__Atomic__Group_1__0
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
                    // InternalCPHLCL.g:1034:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalCPHLCL.g:1034:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalCPHLCL.g:1035:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalCPHLCL.g:1036:3: ( rule__Atomic__Group_2__0 )
                    // InternalCPHLCL.g:1036:4: rule__Atomic__Group_2__0
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
    // InternalCPHLCL.g:1044:1: rule__Atomic__ValueAlternatives_0_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1048:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalCPHLCL.g:1049:2: ( 'true' )
                    {
                    // InternalCPHLCL.g:1049:2: ( 'true' )
                    // InternalCPHLCL.g:1050:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1055:2: ( 'false' )
                    {
                    // InternalCPHLCL.g:1055:2: ( 'false' )
                    // InternalCPHLCL.g:1056:3: 'false'
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
    // InternalCPHLCL.g:1065:1: rule__Strategy__Alternatives : ( ( 'one' ) | ( 'two' ) );
    public final void rule__Strategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1069:1: ( ( 'one' ) | ( 'two' ) )
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
                    // InternalCPHLCL.g:1070:2: ( 'one' )
                    {
                    // InternalCPHLCL.g:1070:2: ( 'one' )
                    // InternalCPHLCL.g:1071:3: 'one'
                    {
                     before(grammarAccess.getStrategyAccess().getOneKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getStrategyAccess().getOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1076:2: ( 'two' )
                    {
                    // InternalCPHLCL.g:1076:2: ( 'two' )
                    // InternalCPHLCL.g:1077:3: 'two'
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
    // InternalCPHLCL.g:1086:1: rule__BoolVal__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BoolVal__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1090:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalCPHLCL.g:1091:2: ( 'true' )
                    {
                    // InternalCPHLCL.g:1091:2: ( 'true' )
                    // InternalCPHLCL.g:1092:3: 'true'
                    {
                     before(grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1097:2: ( 'false' )
                    {
                    // InternalCPHLCL.g:1097:2: ( 'false' )
                    // InternalCPHLCL.g:1098:3: 'false'
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
    // InternalCPHLCL.g:1107:1: rule__Value__Alternatives : ( ( ruleNumber ) | ( ruleNonEnumerableValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1111:1: ( ( ruleNumber ) | ( ruleNonEnumerableValue ) )
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
                    // InternalCPHLCL.g:1112:2: ( ruleNumber )
                    {
                    // InternalCPHLCL.g:1112:2: ( ruleNumber )
                    // InternalCPHLCL.g:1113:3: ruleNumber
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
                    // InternalCPHLCL.g:1118:2: ( ruleNonEnumerableValue )
                    {
                    // InternalCPHLCL.g:1118:2: ( ruleNonEnumerableValue )
                    // InternalCPHLCL.g:1119:3: ruleNonEnumerableValue
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
    // InternalCPHLCL.g:1128:1: rule__NonEnumerableValue__Alternatives : ( ( ruleBoolVal ) | ( ruleSymbol ) );
    public final void rule__NonEnumerableValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1132:1: ( ( ruleBoolVal ) | ( ruleSymbol ) )
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
                    // InternalCPHLCL.g:1133:2: ( ruleBoolVal )
                    {
                    // InternalCPHLCL.g:1133:2: ( ruleBoolVal )
                    // InternalCPHLCL.g:1134:3: ruleBoolVal
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
                    // InternalCPHLCL.g:1139:2: ( ruleSymbol )
                    {
                    // InternalCPHLCL.g:1139:2: ( ruleSymbol )
                    // InternalCPHLCL.g:1140:3: ruleSymbol
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
    // InternalCPHLCL.g:1149:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1153:1: ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) )
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
                    // InternalCPHLCL.g:1154:2: ( 'boolean' )
                    {
                    // InternalCPHLCL.g:1154:2: ( 'boolean' )
                    // InternalCPHLCL.g:1155:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1160:2: ( 'integer' )
                    {
                    // InternalCPHLCL.g:1160:2: ( 'integer' )
                    // InternalCPHLCL.g:1161:3: 'integer'
                    {
                     before(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1166:2: ( 'symbolic' )
                    {
                    // InternalCPHLCL.g:1166:2: ( 'symbolic' )
                    // InternalCPHLCL.g:1167:3: 'symbolic'
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
    // InternalCPHLCL.g:1176:1: rule__GlobalOp__Alternatives : ( ( 'at_most' ) | ( 'all_different' ) );
    public final void rule__GlobalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1180:1: ( ( 'at_most' ) | ( 'all_different' ) )
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
                    // InternalCPHLCL.g:1181:2: ( 'at_most' )
                    {
                    // InternalCPHLCL.g:1181:2: ( 'at_most' )
                    // InternalCPHLCL.g:1182:3: 'at_most'
                    {
                     before(grammarAccess.getGlobalOpAccess().getAt_mostKeyword_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getGlobalOpAccess().getAt_mostKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1187:2: ( 'all_different' )
                    {
                    // InternalCPHLCL.g:1187:2: ( 'all_different' )
                    // InternalCPHLCL.g:1188:3: 'all_different'
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
    // InternalCPHLCL.g:1197:1: rule__FunctionOp__Alternatives : ( ( 'pow' ) | ( 'dist' ) | ( 'min' ) | ( 'max' ) );
    public final void rule__FunctionOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1201:1: ( ( 'pow' ) | ( 'dist' ) | ( 'min' ) | ( 'max' ) )
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
                    // InternalCPHLCL.g:1202:2: ( 'pow' )
                    {
                    // InternalCPHLCL.g:1202:2: ( 'pow' )
                    // InternalCPHLCL.g:1203:3: 'pow'
                    {
                     before(grammarAccess.getFunctionOpAccess().getPowKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getFunctionOpAccess().getPowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1208:2: ( 'dist' )
                    {
                    // InternalCPHLCL.g:1208:2: ( 'dist' )
                    // InternalCPHLCL.g:1209:3: 'dist'
                    {
                     before(grammarAccess.getFunctionOpAccess().getDistKeyword_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getFunctionOpAccess().getDistKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1214:2: ( 'min' )
                    {
                    // InternalCPHLCL.g:1214:2: ( 'min' )
                    // InternalCPHLCL.g:1215:3: 'min'
                    {
                     before(grammarAccess.getFunctionOpAccess().getMinKeyword_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getFunctionOpAccess().getMinKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1220:2: ( 'max' )
                    {
                    // InternalCPHLCL.g:1220:2: ( 'max' )
                    // InternalCPHLCL.g:1221:3: 'max'
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
    // InternalCPHLCL.g:1230:1: rule__UnaryOp__Alternatives : ( ( 'abs' ) | ( 'sqrt' ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1234:1: ( ( 'abs' ) | ( 'sqrt' ) )
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
                    // InternalCPHLCL.g:1235:2: ( 'abs' )
                    {
                    // InternalCPHLCL.g:1235:2: ( 'abs' )
                    // InternalCPHLCL.g:1236:3: 'abs'
                    {
                     before(grammarAccess.getUnaryOpAccess().getAbsKeyword_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getAbsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1241:2: ( 'sqrt' )
                    {
                    // InternalCPHLCL.g:1241:2: ( 'sqrt' )
                    // InternalCPHLCL.g:1242:3: 'sqrt'
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
    // InternalCPHLCL.g:1251:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1255:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCPHLCL.g:1256:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalCPHLCL.g:1263:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1267:1: ( ( 'model' ) )
            // InternalCPHLCL.g:1268:1: ( 'model' )
            {
            // InternalCPHLCL.g:1268:1: ( 'model' )
            // InternalCPHLCL.g:1269:2: 'model'
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
    // InternalCPHLCL.g:1278:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1282:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalCPHLCL.g:1283:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalCPHLCL.g:1290:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1294:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalCPHLCL.g:1295:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalCPHLCL.g:1295:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalCPHLCL.g:1296:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalCPHLCL.g:1297:2: ( rule__Model__NameAssignment_1 )
            // InternalCPHLCL.g:1297:3: rule__Model__NameAssignment_1
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
    // InternalCPHLCL.g:1305:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1309:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalCPHLCL.g:1310:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalCPHLCL.g:1317:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1321:1: ( ( 'variables:' ) )
            // InternalCPHLCL.g:1322:1: ( 'variables:' )
            {
            // InternalCPHLCL.g:1322:1: ( 'variables:' )
            // InternalCPHLCL.g:1323:2: 'variables:'
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
    // InternalCPHLCL.g:1332:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1336:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalCPHLCL.g:1337:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalCPHLCL.g:1344:1: rule__Model__Group__3__Impl : ( ( rule__Model__VariablesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1348:1: ( ( ( rule__Model__VariablesAssignment_3 )* ) )
            // InternalCPHLCL.g:1349:1: ( ( rule__Model__VariablesAssignment_3 )* )
            {
            // InternalCPHLCL.g:1349:1: ( ( rule__Model__VariablesAssignment_3 )* )
            // InternalCPHLCL.g:1350:2: ( rule__Model__VariablesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment_3()); 
            // InternalCPHLCL.g:1351:2: ( rule__Model__VariablesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=24 && LA19_0<=26)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCPHLCL.g:1351:3: rule__Model__VariablesAssignment_3
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
    // InternalCPHLCL.g:1359:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1363:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalCPHLCL.g:1364:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalCPHLCL.g:1371:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1375:1: ( ( 'constraints:' ) )
            // InternalCPHLCL.g:1376:1: ( 'constraints:' )
            {
            // InternalCPHLCL.g:1376:1: ( 'constraints:' )
            // InternalCPHLCL.g:1377:2: 'constraints:'
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
    // InternalCPHLCL.g:1386:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1390:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalCPHLCL.g:1391:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalCPHLCL.g:1398:1: rule__Model__Group__5__Impl : ( ( rule__Model__ConstraintsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1402:1: ( ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalCPHLCL.g:1403:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalCPHLCL.g:1403:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalCPHLCL.g:1404:2: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalCPHLCL.g:1405:2: ( rule__Model__ConstraintsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCPHLCL.g:1405:3: rule__Model__ConstraintsAssignment_5
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
    // InternalCPHLCL.g:1413:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1417:1: ( rule__Model__Group__6__Impl )
            // InternalCPHLCL.g:1418:2: rule__Model__Group__6__Impl
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
    // InternalCPHLCL.g:1424:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )? ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1428:1: ( ( ( rule__Model__Group_6__0 )? ) )
            // InternalCPHLCL.g:1429:1: ( ( rule__Model__Group_6__0 )? )
            {
            // InternalCPHLCL.g:1429:1: ( ( rule__Model__Group_6__0 )? )
            // InternalCPHLCL.g:1430:2: ( rule__Model__Group_6__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // InternalCPHLCL.g:1431:2: ( rule__Model__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCPHLCL.g:1431:3: rule__Model__Group_6__0
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
    // InternalCPHLCL.g:1440:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1444:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // InternalCPHLCL.g:1445:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
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
    // InternalCPHLCL.g:1452:1: rule__Model__Group_6__0__Impl : ( 'strategy:' ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1456:1: ( ( 'strategy:' ) )
            // InternalCPHLCL.g:1457:1: ( 'strategy:' )
            {
            // InternalCPHLCL.g:1457:1: ( 'strategy:' )
            // InternalCPHLCL.g:1458:2: 'strategy:'
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
    // InternalCPHLCL.g:1467:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1471:1: ( rule__Model__Group_6__1__Impl )
            // InternalCPHLCL.g:1472:2: rule__Model__Group_6__1__Impl
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
    // InternalCPHLCL.g:1478:1: rule__Model__Group_6__1__Impl : ( ( rule__Model__StrategyAssignment_6_1 ) ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1482:1: ( ( ( rule__Model__StrategyAssignment_6_1 ) ) )
            // InternalCPHLCL.g:1483:1: ( ( rule__Model__StrategyAssignment_6_1 ) )
            {
            // InternalCPHLCL.g:1483:1: ( ( rule__Model__StrategyAssignment_6_1 ) )
            // InternalCPHLCL.g:1484:2: ( rule__Model__StrategyAssignment_6_1 )
            {
             before(grammarAccess.getModelAccess().getStrategyAssignment_6_1()); 
            // InternalCPHLCL.g:1485:2: ( rule__Model__StrategyAssignment_6_1 )
            // InternalCPHLCL.g:1485:3: rule__Model__StrategyAssignment_6_1
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
    // InternalCPHLCL.g:1494:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1498:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalCPHLCL.g:1499:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalCPHLCL.g:1506:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1510:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalCPHLCL.g:1511:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalCPHLCL.g:1511:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalCPHLCL.g:1512:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalCPHLCL.g:1513:2: ( rule__Variable__TypeAssignment_0 )
            // InternalCPHLCL.g:1513:3: rule__Variable__TypeAssignment_0
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
    // InternalCPHLCL.g:1521:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1525:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalCPHLCL.g:1526:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalCPHLCL.g:1533:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1537:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalCPHLCL.g:1538:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalCPHLCL.g:1538:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalCPHLCL.g:1539:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalCPHLCL.g:1540:2: ( rule__Variable__NameAssignment_1 )
            // InternalCPHLCL.g:1540:3: rule__Variable__NameAssignment_1
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
    // InternalCPHLCL.g:1548:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1552:1: ( rule__Variable__Group__2__Impl )
            // InternalCPHLCL.g:1553:2: rule__Variable__Group__2__Impl
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
    // InternalCPHLCL.g:1559:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__Group_2__0 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1563:1: ( ( ( rule__Variable__Group_2__0 )? ) )
            // InternalCPHLCL.g:1564:1: ( ( rule__Variable__Group_2__0 )? )
            {
            // InternalCPHLCL.g:1564:1: ( ( rule__Variable__Group_2__0 )? )
            // InternalCPHLCL.g:1565:2: ( rule__Variable__Group_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2()); 
            // InternalCPHLCL.g:1566:2: ( rule__Variable__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCPHLCL.g:1566:3: rule__Variable__Group_2__0
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
    // InternalCPHLCL.g:1575:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1579:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // InternalCPHLCL.g:1580:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
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
    // InternalCPHLCL.g:1587:1: rule__Variable__Group_2__0__Impl : ( 'domain:' ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1591:1: ( ( 'domain:' ) )
            // InternalCPHLCL.g:1592:1: ( 'domain:' )
            {
            // InternalCPHLCL.g:1592:1: ( 'domain:' )
            // InternalCPHLCL.g:1593:2: 'domain:'
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
    // InternalCPHLCL.g:1602:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1606:1: ( rule__Variable__Group_2__1__Impl )
            // InternalCPHLCL.g:1607:2: rule__Variable__Group_2__1__Impl
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
    // InternalCPHLCL.g:1613:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__DomainAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1617:1: ( ( ( rule__Variable__DomainAssignment_2_1 ) ) )
            // InternalCPHLCL.g:1618:1: ( ( rule__Variable__DomainAssignment_2_1 ) )
            {
            // InternalCPHLCL.g:1618:1: ( ( rule__Variable__DomainAssignment_2_1 ) )
            // InternalCPHLCL.g:1619:2: ( rule__Variable__DomainAssignment_2_1 )
            {
             before(grammarAccess.getVariableAccess().getDomainAssignment_2_1()); 
            // InternalCPHLCL.g:1620:2: ( rule__Variable__DomainAssignment_2_1 )
            // InternalCPHLCL.g:1620:3: rule__Variable__DomainAssignment_2_1
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
    // InternalCPHLCL.g:1629:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1633:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalCPHLCL.g:1634:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
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
    // InternalCPHLCL.g:1641:1: rule__Interval__Group__0__Impl : ( ( rule__Interval__StartAssignment_0 ) ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1645:1: ( ( ( rule__Interval__StartAssignment_0 ) ) )
            // InternalCPHLCL.g:1646:1: ( ( rule__Interval__StartAssignment_0 ) )
            {
            // InternalCPHLCL.g:1646:1: ( ( rule__Interval__StartAssignment_0 ) )
            // InternalCPHLCL.g:1647:2: ( rule__Interval__StartAssignment_0 )
            {
             before(grammarAccess.getIntervalAccess().getStartAssignment_0()); 
            // InternalCPHLCL.g:1648:2: ( rule__Interval__StartAssignment_0 )
            // InternalCPHLCL.g:1648:3: rule__Interval__StartAssignment_0
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
    // InternalCPHLCL.g:1656:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1660:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalCPHLCL.g:1661:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
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
    // InternalCPHLCL.g:1668:1: rule__Interval__Group__1__Impl : ( '..' ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1672:1: ( ( '..' ) )
            // InternalCPHLCL.g:1673:1: ( '..' )
            {
            // InternalCPHLCL.g:1673:1: ( '..' )
            // InternalCPHLCL.g:1674:2: '..'
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
    // InternalCPHLCL.g:1683:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1687:1: ( rule__Interval__Group__2__Impl )
            // InternalCPHLCL.g:1688:2: rule__Interval__Group__2__Impl
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
    // InternalCPHLCL.g:1694:1: rule__Interval__Group__2__Impl : ( ( rule__Interval__EndAssignment_2 ) ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1698:1: ( ( ( rule__Interval__EndAssignment_2 ) ) )
            // InternalCPHLCL.g:1699:1: ( ( rule__Interval__EndAssignment_2 ) )
            {
            // InternalCPHLCL.g:1699:1: ( ( rule__Interval__EndAssignment_2 ) )
            // InternalCPHLCL.g:1700:2: ( rule__Interval__EndAssignment_2 )
            {
             before(grammarAccess.getIntervalAccess().getEndAssignment_2()); 
            // InternalCPHLCL.g:1701:2: ( rule__Interval__EndAssignment_2 )
            // InternalCPHLCL.g:1701:3: rule__Interval__EndAssignment_2
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
    // InternalCPHLCL.g:1710:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1714:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalCPHLCL.g:1715:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
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
    // InternalCPHLCL.g:1722:1: rule__Enumeration__Group__0__Impl : ( '[' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1726:1: ( ( '[' ) )
            // InternalCPHLCL.g:1727:1: ( '[' )
            {
            // InternalCPHLCL.g:1727:1: ( '[' )
            // InternalCPHLCL.g:1728:2: '['
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
    // InternalCPHLCL.g:1737:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1741:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalCPHLCL.g:1742:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
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
    // InternalCPHLCL.g:1749:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__ListAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1753:1: ( ( ( rule__Enumeration__ListAssignment_1 ) ) )
            // InternalCPHLCL.g:1754:1: ( ( rule__Enumeration__ListAssignment_1 ) )
            {
            // InternalCPHLCL.g:1754:1: ( ( rule__Enumeration__ListAssignment_1 ) )
            // InternalCPHLCL.g:1755:2: ( rule__Enumeration__ListAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getListAssignment_1()); 
            // InternalCPHLCL.g:1756:2: ( rule__Enumeration__ListAssignment_1 )
            // InternalCPHLCL.g:1756:3: rule__Enumeration__ListAssignment_1
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
    // InternalCPHLCL.g:1764:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1768:1: ( rule__Enumeration__Group__2__Impl )
            // InternalCPHLCL.g:1769:2: rule__Enumeration__Group__2__Impl
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
    // InternalCPHLCL.g:1775:1: rule__Enumeration__Group__2__Impl : ( ']' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1779:1: ( ( ']' ) )
            // InternalCPHLCL.g:1780:1: ( ']' )
            {
            // InternalCPHLCL.g:1780:1: ( ']' )
            // InternalCPHLCL.g:1781:2: ']'
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
    // InternalCPHLCL.g:1791:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1795:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalCPHLCL.g:1796:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalCPHLCL.g:1803:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1807:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalCPHLCL.g:1808:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalCPHLCL.g:1808:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalCPHLCL.g:1809:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalCPHLCL.g:1810:2: ( rule__Constraint__NameAssignment_0 )
            // InternalCPHLCL.g:1810:3: rule__Constraint__NameAssignment_0
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
    // InternalCPHLCL.g:1818:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1822:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalCPHLCL.g:1823:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalCPHLCL.g:1830:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1834:1: ( ( ':' ) )
            // InternalCPHLCL.g:1835:1: ( ':' )
            {
            // InternalCPHLCL.g:1835:1: ( ':' )
            // InternalCPHLCL.g:1836:2: ':'
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
    // InternalCPHLCL.g:1845:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1849:1: ( rule__Constraint__Group__2__Impl )
            // InternalCPHLCL.g:1850:2: rule__Constraint__Group__2__Impl
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
    // InternalCPHLCL.g:1856:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1860:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalCPHLCL.g:1861:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalCPHLCL.g:1861:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalCPHLCL.g:1862:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalCPHLCL.g:1863:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalCPHLCL.g:1863:3: rule__Constraint__ExpAssignment_2
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
    // InternalCPHLCL.g:1872:1: rule__Iff__Group__0 : rule__Iff__Group__0__Impl rule__Iff__Group__1 ;
    public final void rule__Iff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1876:1: ( rule__Iff__Group__0__Impl rule__Iff__Group__1 )
            // InternalCPHLCL.g:1877:2: rule__Iff__Group__0__Impl rule__Iff__Group__1
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
    // InternalCPHLCL.g:1884:1: rule__Iff__Group__0__Impl : ( ruleImplies ) ;
    public final void rule__Iff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1888:1: ( ( ruleImplies ) )
            // InternalCPHLCL.g:1889:1: ( ruleImplies )
            {
            // InternalCPHLCL.g:1889:1: ( ruleImplies )
            // InternalCPHLCL.g:1890:2: ruleImplies
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
    // InternalCPHLCL.g:1899:1: rule__Iff__Group__1 : rule__Iff__Group__1__Impl ;
    public final void rule__Iff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1903:1: ( rule__Iff__Group__1__Impl )
            // InternalCPHLCL.g:1904:2: rule__Iff__Group__1__Impl
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
    // InternalCPHLCL.g:1910:1: rule__Iff__Group__1__Impl : ( ( rule__Iff__Group_1__0 )* ) ;
    public final void rule__Iff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1914:1: ( ( ( rule__Iff__Group_1__0 )* ) )
            // InternalCPHLCL.g:1915:1: ( ( rule__Iff__Group_1__0 )* )
            {
            // InternalCPHLCL.g:1915:1: ( ( rule__Iff__Group_1__0 )* )
            // InternalCPHLCL.g:1916:2: ( rule__Iff__Group_1__0 )*
            {
             before(grammarAccess.getIffAccess().getGroup_1()); 
            // InternalCPHLCL.g:1917:2: ( rule__Iff__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCPHLCL.g:1917:3: rule__Iff__Group_1__0
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
    // InternalCPHLCL.g:1926:1: rule__Iff__Group_1__0 : rule__Iff__Group_1__0__Impl rule__Iff__Group_1__1 ;
    public final void rule__Iff__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1930:1: ( rule__Iff__Group_1__0__Impl rule__Iff__Group_1__1 )
            // InternalCPHLCL.g:1931:2: rule__Iff__Group_1__0__Impl rule__Iff__Group_1__1
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
    // InternalCPHLCL.g:1938:1: rule__Iff__Group_1__0__Impl : ( () ) ;
    public final void rule__Iff__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1942:1: ( ( () ) )
            // InternalCPHLCL.g:1943:1: ( () )
            {
            // InternalCPHLCL.g:1943:1: ( () )
            // InternalCPHLCL.g:1944:2: ()
            {
             before(grammarAccess.getIffAccess().getIffLeftAction_1_0()); 
            // InternalCPHLCL.g:1945:2: ()
            // InternalCPHLCL.g:1945:3: 
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
    // InternalCPHLCL.g:1953:1: rule__Iff__Group_1__1 : rule__Iff__Group_1__1__Impl rule__Iff__Group_1__2 ;
    public final void rule__Iff__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1957:1: ( rule__Iff__Group_1__1__Impl rule__Iff__Group_1__2 )
            // InternalCPHLCL.g:1958:2: rule__Iff__Group_1__1__Impl rule__Iff__Group_1__2
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
    // InternalCPHLCL.g:1965:1: rule__Iff__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__Iff__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1969:1: ( ( '<=>' ) )
            // InternalCPHLCL.g:1970:1: ( '<=>' )
            {
            // InternalCPHLCL.g:1970:1: ( '<=>' )
            // InternalCPHLCL.g:1971:2: '<=>'
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
    // InternalCPHLCL.g:1980:1: rule__Iff__Group_1__2 : rule__Iff__Group_1__2__Impl ;
    public final void rule__Iff__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1984:1: ( rule__Iff__Group_1__2__Impl )
            // InternalCPHLCL.g:1985:2: rule__Iff__Group_1__2__Impl
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
    // InternalCPHLCL.g:1991:1: rule__Iff__Group_1__2__Impl : ( ( rule__Iff__RightAssignment_1_2 ) ) ;
    public final void rule__Iff__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1995:1: ( ( ( rule__Iff__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:1996:1: ( ( rule__Iff__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:1996:1: ( ( rule__Iff__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:1997:2: ( rule__Iff__RightAssignment_1_2 )
            {
             before(grammarAccess.getIffAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:1998:2: ( rule__Iff__RightAssignment_1_2 )
            // InternalCPHLCL.g:1998:3: rule__Iff__RightAssignment_1_2
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
    // InternalCPHLCL.g:2007:1: rule__Implies__Group__0 : rule__Implies__Group__0__Impl rule__Implies__Group__1 ;
    public final void rule__Implies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2011:1: ( rule__Implies__Group__0__Impl rule__Implies__Group__1 )
            // InternalCPHLCL.g:2012:2: rule__Implies__Group__0__Impl rule__Implies__Group__1
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
    // InternalCPHLCL.g:2019:1: rule__Implies__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Implies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2023:1: ( ( ruleOr ) )
            // InternalCPHLCL.g:2024:1: ( ruleOr )
            {
            // InternalCPHLCL.g:2024:1: ( ruleOr )
            // InternalCPHLCL.g:2025:2: ruleOr
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
    // InternalCPHLCL.g:2034:1: rule__Implies__Group__1 : rule__Implies__Group__1__Impl ;
    public final void rule__Implies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2038:1: ( rule__Implies__Group__1__Impl )
            // InternalCPHLCL.g:2039:2: rule__Implies__Group__1__Impl
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
    // InternalCPHLCL.g:2045:1: rule__Implies__Group__1__Impl : ( ( rule__Implies__Group_1__0 )* ) ;
    public final void rule__Implies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2049:1: ( ( ( rule__Implies__Group_1__0 )* ) )
            // InternalCPHLCL.g:2050:1: ( ( rule__Implies__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2050:1: ( ( rule__Implies__Group_1__0 )* )
            // InternalCPHLCL.g:2051:2: ( rule__Implies__Group_1__0 )*
            {
             before(grammarAccess.getImpliesAccess().getGroup_1()); 
            // InternalCPHLCL.g:2052:2: ( rule__Implies__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCPHLCL.g:2052:3: rule__Implies__Group_1__0
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
    // InternalCPHLCL.g:2061:1: rule__Implies__Group_1__0 : rule__Implies__Group_1__0__Impl rule__Implies__Group_1__1 ;
    public final void rule__Implies__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2065:1: ( rule__Implies__Group_1__0__Impl rule__Implies__Group_1__1 )
            // InternalCPHLCL.g:2066:2: rule__Implies__Group_1__0__Impl rule__Implies__Group_1__1
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
    // InternalCPHLCL.g:2073:1: rule__Implies__Group_1__0__Impl : ( () ) ;
    public final void rule__Implies__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2077:1: ( ( () ) )
            // InternalCPHLCL.g:2078:1: ( () )
            {
            // InternalCPHLCL.g:2078:1: ( () )
            // InternalCPHLCL.g:2079:2: ()
            {
             before(grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0()); 
            // InternalCPHLCL.g:2080:2: ()
            // InternalCPHLCL.g:2080:3: 
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
    // InternalCPHLCL.g:2088:1: rule__Implies__Group_1__1 : rule__Implies__Group_1__1__Impl rule__Implies__Group_1__2 ;
    public final void rule__Implies__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2092:1: ( rule__Implies__Group_1__1__Impl rule__Implies__Group_1__2 )
            // InternalCPHLCL.g:2093:2: rule__Implies__Group_1__1__Impl rule__Implies__Group_1__2
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
    // InternalCPHLCL.g:2100:1: rule__Implies__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__Implies__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2104:1: ( ( '=>' ) )
            // InternalCPHLCL.g:2105:1: ( '=>' )
            {
            // InternalCPHLCL.g:2105:1: ( '=>' )
            // InternalCPHLCL.g:2106:2: '=>'
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
    // InternalCPHLCL.g:2115:1: rule__Implies__Group_1__2 : rule__Implies__Group_1__2__Impl ;
    public final void rule__Implies__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2119:1: ( rule__Implies__Group_1__2__Impl )
            // InternalCPHLCL.g:2120:2: rule__Implies__Group_1__2__Impl
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
    // InternalCPHLCL.g:2126:1: rule__Implies__Group_1__2__Impl : ( ( rule__Implies__RightAssignment_1_2 ) ) ;
    public final void rule__Implies__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2130:1: ( ( ( rule__Implies__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2131:1: ( ( rule__Implies__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2131:1: ( ( rule__Implies__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2132:2: ( rule__Implies__RightAssignment_1_2 )
            {
             before(grammarAccess.getImpliesAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2133:2: ( rule__Implies__RightAssignment_1_2 )
            // InternalCPHLCL.g:2133:3: rule__Implies__RightAssignment_1_2
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
    // InternalCPHLCL.g:2142:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2146:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalCPHLCL.g:2147:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalCPHLCL.g:2154:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2158:1: ( ( ruleAnd ) )
            // InternalCPHLCL.g:2159:1: ( ruleAnd )
            {
            // InternalCPHLCL.g:2159:1: ( ruleAnd )
            // InternalCPHLCL.g:2160:2: ruleAnd
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
    // InternalCPHLCL.g:2169:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2173:1: ( rule__Or__Group__1__Impl )
            // InternalCPHLCL.g:2174:2: rule__Or__Group__1__Impl
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
    // InternalCPHLCL.g:2180:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2184:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalCPHLCL.g:2185:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2185:1: ( ( rule__Or__Group_1__0 )* )
            // InternalCPHLCL.g:2186:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalCPHLCL.g:2187:2: ( rule__Or__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCPHLCL.g:2187:3: rule__Or__Group_1__0
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
    // InternalCPHLCL.g:2196:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2200:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalCPHLCL.g:2201:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalCPHLCL.g:2208:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2212:1: ( ( () ) )
            // InternalCPHLCL.g:2213:1: ( () )
            {
            // InternalCPHLCL.g:2213:1: ( () )
            // InternalCPHLCL.g:2214:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalCPHLCL.g:2215:2: ()
            // InternalCPHLCL.g:2215:3: 
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
    // InternalCPHLCL.g:2223:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2227:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalCPHLCL.g:2228:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalCPHLCL.g:2235:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2239:1: ( ( 'OR' ) )
            // InternalCPHLCL.g:2240:1: ( 'OR' )
            {
            // InternalCPHLCL.g:2240:1: ( 'OR' )
            // InternalCPHLCL.g:2241:2: 'OR'
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
    // InternalCPHLCL.g:2250:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2254:1: ( rule__Or__Group_1__2__Impl )
            // InternalCPHLCL.g:2255:2: rule__Or__Group_1__2__Impl
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
    // InternalCPHLCL.g:2261:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2265:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2266:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2266:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2267:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2268:2: ( rule__Or__RightAssignment_1_2 )
            // InternalCPHLCL.g:2268:3: rule__Or__RightAssignment_1_2
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
    // InternalCPHLCL.g:2277:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2281:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalCPHLCL.g:2282:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalCPHLCL.g:2289:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2293:1: ( ( ruleEquality ) )
            // InternalCPHLCL.g:2294:1: ( ruleEquality )
            {
            // InternalCPHLCL.g:2294:1: ( ruleEquality )
            // InternalCPHLCL.g:2295:2: ruleEquality
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
    // InternalCPHLCL.g:2304:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2308:1: ( rule__And__Group__1__Impl )
            // InternalCPHLCL.g:2309:2: rule__And__Group__1__Impl
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
    // InternalCPHLCL.g:2315:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2319:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalCPHLCL.g:2320:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2320:1: ( ( rule__And__Group_1__0 )* )
            // InternalCPHLCL.g:2321:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalCPHLCL.g:2322:2: ( rule__And__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==47) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCPHLCL.g:2322:3: rule__And__Group_1__0
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
    // InternalCPHLCL.g:2331:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2335:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalCPHLCL.g:2336:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalCPHLCL.g:2343:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2347:1: ( ( () ) )
            // InternalCPHLCL.g:2348:1: ( () )
            {
            // InternalCPHLCL.g:2348:1: ( () )
            // InternalCPHLCL.g:2349:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalCPHLCL.g:2350:2: ()
            // InternalCPHLCL.g:2350:3: 
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
    // InternalCPHLCL.g:2358:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2362:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalCPHLCL.g:2363:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalCPHLCL.g:2370:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2374:1: ( ( 'AND' ) )
            // InternalCPHLCL.g:2375:1: ( 'AND' )
            {
            // InternalCPHLCL.g:2375:1: ( 'AND' )
            // InternalCPHLCL.g:2376:2: 'AND'
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
    // InternalCPHLCL.g:2385:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2389:1: ( rule__And__Group_1__2__Impl )
            // InternalCPHLCL.g:2390:2: rule__And__Group_1__2__Impl
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
    // InternalCPHLCL.g:2396:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2400:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2401:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2401:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2402:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2403:2: ( rule__And__RightAssignment_1_2 )
            // InternalCPHLCL.g:2403:3: rule__And__RightAssignment_1_2
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
    // InternalCPHLCL.g:2412:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2416:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalCPHLCL.g:2417:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
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
    // InternalCPHLCL.g:2424:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2428:1: ( ( ruleComparison ) )
            // InternalCPHLCL.g:2429:1: ( ruleComparison )
            {
            // InternalCPHLCL.g:2429:1: ( ruleComparison )
            // InternalCPHLCL.g:2430:2: ruleComparison
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
    // InternalCPHLCL.g:2439:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2443:1: ( rule__Equality__Group__1__Impl )
            // InternalCPHLCL.g:2444:2: rule__Equality__Group__1__Impl
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
    // InternalCPHLCL.g:2450:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2454:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalCPHLCL.g:2455:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2455:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalCPHLCL.g:2456:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalCPHLCL.g:2457:2: ( rule__Equality__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=11 && LA27_0<=12)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCPHLCL.g:2457:3: rule__Equality__Group_1__0
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
    // InternalCPHLCL.g:2466:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2470:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalCPHLCL.g:2471:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
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
    // InternalCPHLCL.g:2478:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2482:1: ( ( () ) )
            // InternalCPHLCL.g:2483:1: ( () )
            {
            // InternalCPHLCL.g:2483:1: ( () )
            // InternalCPHLCL.g:2484:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalCPHLCL.g:2485:2: ()
            // InternalCPHLCL.g:2485:3: 
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
    // InternalCPHLCL.g:2493:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2497:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalCPHLCL.g:2498:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
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
    // InternalCPHLCL.g:2505:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2509:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalCPHLCL.g:2510:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:2510:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalCPHLCL.g:2511:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalCPHLCL.g:2512:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalCPHLCL.g:2512:3: rule__Equality__OpAssignment_1_1
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
    // InternalCPHLCL.g:2520:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2524:1: ( rule__Equality__Group_1__2__Impl )
            // InternalCPHLCL.g:2525:2: rule__Equality__Group_1__2__Impl
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
    // InternalCPHLCL.g:2531:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2535:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2536:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2536:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2537:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2538:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalCPHLCL.g:2538:3: rule__Equality__RightAssignment_1_2
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
    // InternalCPHLCL.g:2547:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2551:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalCPHLCL.g:2552:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalCPHLCL.g:2559:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2563:1: ( ( rulePlusOrMinus ) )
            // InternalCPHLCL.g:2564:1: ( rulePlusOrMinus )
            {
            // InternalCPHLCL.g:2564:1: ( rulePlusOrMinus )
            // InternalCPHLCL.g:2565:2: rulePlusOrMinus
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
    // InternalCPHLCL.g:2574:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2578:1: ( rule__Comparison__Group__1__Impl )
            // InternalCPHLCL.g:2579:2: rule__Comparison__Group__1__Impl
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
    // InternalCPHLCL.g:2585:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2589:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalCPHLCL.g:2590:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2590:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalCPHLCL.g:2591:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalCPHLCL.g:2592:2: ( rule__Comparison__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=13 && LA28_0<=16)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCPHLCL.g:2592:3: rule__Comparison__Group_1__0
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
    // InternalCPHLCL.g:2601:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2605:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalCPHLCL.g:2606:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalCPHLCL.g:2613:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2617:1: ( ( () ) )
            // InternalCPHLCL.g:2618:1: ( () )
            {
            // InternalCPHLCL.g:2618:1: ( () )
            // InternalCPHLCL.g:2619:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalCPHLCL.g:2620:2: ()
            // InternalCPHLCL.g:2620:3: 
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
    // InternalCPHLCL.g:2628:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2632:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalCPHLCL.g:2633:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
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
    // InternalCPHLCL.g:2640:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2644:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalCPHLCL.g:2645:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:2645:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalCPHLCL.g:2646:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalCPHLCL.g:2647:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalCPHLCL.g:2647:3: rule__Comparison__OpAssignment_1_1
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
    // InternalCPHLCL.g:2655:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2659:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalCPHLCL.g:2660:2: rule__Comparison__Group_1__2__Impl
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
    // InternalCPHLCL.g:2666:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2670:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:2671:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:2671:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:2672:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:2673:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalCPHLCL.g:2673:3: rule__Comparison__RightAssignment_1_2
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
    // InternalCPHLCL.g:2682:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2686:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalCPHLCL.g:2687:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
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
    // InternalCPHLCL.g:2694:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2698:1: ( ( ruleMulOrDiv ) )
            // InternalCPHLCL.g:2699:1: ( ruleMulOrDiv )
            {
            // InternalCPHLCL.g:2699:1: ( ruleMulOrDiv )
            // InternalCPHLCL.g:2700:2: ruleMulOrDiv
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
    // InternalCPHLCL.g:2709:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2713:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalCPHLCL.g:2714:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalCPHLCL.g:2720:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2724:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalCPHLCL.g:2725:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2725:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalCPHLCL.g:2726:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalCPHLCL.g:2727:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=48 && LA29_0<=49)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCPHLCL.g:2727:3: rule__PlusOrMinus__Group_1__0
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
    // InternalCPHLCL.g:2736:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2740:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalCPHLCL.g:2741:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
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
    // InternalCPHLCL.g:2748:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2752:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalCPHLCL.g:2753:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalCPHLCL.g:2753:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalCPHLCL.g:2754:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalCPHLCL.g:2755:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalCPHLCL.g:2755:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalCPHLCL.g:2763:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2767:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalCPHLCL.g:2768:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalCPHLCL.g:2774:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2778:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalCPHLCL.g:2779:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:2779:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalCPHLCL.g:2780:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalCPHLCL.g:2781:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalCPHLCL.g:2781:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalCPHLCL.g:2790:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2794:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalCPHLCL.g:2795:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
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
    // InternalCPHLCL.g:2802:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2806:1: ( ( () ) )
            // InternalCPHLCL.g:2807:1: ( () )
            {
            // InternalCPHLCL.g:2807:1: ( () )
            // InternalCPHLCL.g:2808:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalCPHLCL.g:2809:2: ()
            // InternalCPHLCL.g:2809:3: 
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
    // InternalCPHLCL.g:2817:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2821:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalCPHLCL.g:2822:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalCPHLCL.g:2828:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2832:1: ( ( '+' ) )
            // InternalCPHLCL.g:2833:1: ( '+' )
            {
            // InternalCPHLCL.g:2833:1: ( '+' )
            // InternalCPHLCL.g:2834:2: '+'
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
    // InternalCPHLCL.g:2844:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2848:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalCPHLCL.g:2849:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
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
    // InternalCPHLCL.g:2856:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2860:1: ( ( () ) )
            // InternalCPHLCL.g:2861:1: ( () )
            {
            // InternalCPHLCL.g:2861:1: ( () )
            // InternalCPHLCL.g:2862:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalCPHLCL.g:2863:2: ()
            // InternalCPHLCL.g:2863:3: 
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
    // InternalCPHLCL.g:2871:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2875:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalCPHLCL.g:2876:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalCPHLCL.g:2882:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2886:1: ( ( '-' ) )
            // InternalCPHLCL.g:2887:1: ( '-' )
            {
            // InternalCPHLCL.g:2887:1: ( '-' )
            // InternalCPHLCL.g:2888:2: '-'
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
    // InternalCPHLCL.g:2898:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2902:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalCPHLCL.g:2903:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
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
    // InternalCPHLCL.g:2910:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2914:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:2915:1: ( rulePrimary )
            {
            // InternalCPHLCL.g:2915:1: ( rulePrimary )
            // InternalCPHLCL.g:2916:2: rulePrimary
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
    // InternalCPHLCL.g:2925:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2929:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalCPHLCL.g:2930:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalCPHLCL.g:2936:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2940:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalCPHLCL.g:2941:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2941:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalCPHLCL.g:2942:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalCPHLCL.g:2943:2: ( rule__MulOrDiv__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=17 && LA30_0<=19)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCPHLCL.g:2943:3: rule__MulOrDiv__Group_1__0
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
    // InternalCPHLCL.g:2952:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2956:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalCPHLCL.g:2957:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
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
    // InternalCPHLCL.g:2964:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2968:1: ( ( () ) )
            // InternalCPHLCL.g:2969:1: ( () )
            {
            // InternalCPHLCL.g:2969:1: ( () )
            // InternalCPHLCL.g:2970:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalCPHLCL.g:2971:2: ()
            // InternalCPHLCL.g:2971:3: 
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
    // InternalCPHLCL.g:2979:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2983:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalCPHLCL.g:2984:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
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
    // InternalCPHLCL.g:2991:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2995:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalCPHLCL.g:2996:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:2996:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalCPHLCL.g:2997:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalCPHLCL.g:2998:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalCPHLCL.g:2998:3: rule__MulOrDiv__OpAssignment_1_1
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
    // InternalCPHLCL.g:3006:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3010:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalCPHLCL.g:3011:2: rule__MulOrDiv__Group_1__2__Impl
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
    // InternalCPHLCL.g:3017:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3021:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalCPHLCL.g:3022:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:3022:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalCPHLCL.g:3023:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalCPHLCL.g:3024:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalCPHLCL.g:3024:3: rule__MulOrDiv__RightAssignment_1_2
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
    // InternalCPHLCL.g:3033:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3037:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalCPHLCL.g:3038:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalCPHLCL.g:3045:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3049:1: ( ( '(' ) )
            // InternalCPHLCL.g:3050:1: ( '(' )
            {
            // InternalCPHLCL.g:3050:1: ( '(' )
            // InternalCPHLCL.g:3051:2: '('
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
    // InternalCPHLCL.g:3060:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3064:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalCPHLCL.g:3065:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
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
    // InternalCPHLCL.g:3072:1: rule__Primary__Group_0__1__Impl : ( ruleRelational ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3076:1: ( ( ruleRelational ) )
            // InternalCPHLCL.g:3077:1: ( ruleRelational )
            {
            // InternalCPHLCL.g:3077:1: ( ruleRelational )
            // InternalCPHLCL.g:3078:2: ruleRelational
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
    // InternalCPHLCL.g:3087:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3091:1: ( rule__Primary__Group_0__2__Impl )
            // InternalCPHLCL.g:3092:2: rule__Primary__Group_0__2__Impl
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
    // InternalCPHLCL.g:3098:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3102:1: ( ( ')' ) )
            // InternalCPHLCL.g:3103:1: ( ')' )
            {
            // InternalCPHLCL.g:3103:1: ( ')' )
            // InternalCPHLCL.g:3104:2: ')'
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
    // InternalCPHLCL.g:3114:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3118:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalCPHLCL.g:3119:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
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
    // InternalCPHLCL.g:3126:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3130:1: ( ( () ) )
            // InternalCPHLCL.g:3131:1: ( () )
            {
            // InternalCPHLCL.g:3131:1: ( () )
            // InternalCPHLCL.g:3132:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNegationAction_1_0()); 
            // InternalCPHLCL.g:3133:2: ()
            // InternalCPHLCL.g:3133:3: 
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
    // InternalCPHLCL.g:3141:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3145:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalCPHLCL.g:3146:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalCPHLCL.g:3153:1: rule__Primary__Group_1__1__Impl : ( '~' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3157:1: ( ( '~' ) )
            // InternalCPHLCL.g:3158:1: ( '~' )
            {
            // InternalCPHLCL.g:3158:1: ( '~' )
            // InternalCPHLCL.g:3159:2: '~'
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
    // InternalCPHLCL.g:3168:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3172:1: ( rule__Primary__Group_1__2__Impl )
            // InternalCPHLCL.g:3173:2: rule__Primary__Group_1__2__Impl
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
    // InternalCPHLCL.g:3179:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3183:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalCPHLCL.g:3184:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalCPHLCL.g:3184:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalCPHLCL.g:3185:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalCPHLCL.g:3186:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalCPHLCL.g:3186:3: rule__Primary__ExpressionAssignment_1_2
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
    // InternalCPHLCL.g:3195:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3199:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalCPHLCL.g:3200:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
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
    // InternalCPHLCL.g:3207:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3211:1: ( ( () ) )
            // InternalCPHLCL.g:3212:1: ( () )
            {
            // InternalCPHLCL.g:3212:1: ( () )
            // InternalCPHLCL.g:3213:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getUnaryAction_2_0()); 
            // InternalCPHLCL.g:3214:2: ()
            // InternalCPHLCL.g:3214:3: 
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
    // InternalCPHLCL.g:3222:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3226:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalCPHLCL.g:3227:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
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
    // InternalCPHLCL.g:3234:1: rule__Primary__Group_2__1__Impl : ( ( rule__Primary__OpAssignment_2_1 ) ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3238:1: ( ( ( rule__Primary__OpAssignment_2_1 ) ) )
            // InternalCPHLCL.g:3239:1: ( ( rule__Primary__OpAssignment_2_1 ) )
            {
            // InternalCPHLCL.g:3239:1: ( ( rule__Primary__OpAssignment_2_1 ) )
            // InternalCPHLCL.g:3240:2: ( rule__Primary__OpAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryAccess().getOpAssignment_2_1()); 
            // InternalCPHLCL.g:3241:2: ( rule__Primary__OpAssignment_2_1 )
            // InternalCPHLCL.g:3241:3: rule__Primary__OpAssignment_2_1
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
    // InternalCPHLCL.g:3249:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3253:1: ( rule__Primary__Group_2__2__Impl )
            // InternalCPHLCL.g:3254:2: rule__Primary__Group_2__2__Impl
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
    // InternalCPHLCL.g:3260:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExpressionAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3264:1: ( ( ( rule__Primary__ExpressionAssignment_2_2 ) ) )
            // InternalCPHLCL.g:3265:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            {
            // InternalCPHLCL.g:3265:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            // InternalCPHLCL.g:3266:2: ( rule__Primary__ExpressionAssignment_2_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            // InternalCPHLCL.g:3267:2: ( rule__Primary__ExpressionAssignment_2_2 )
            // InternalCPHLCL.g:3267:3: rule__Primary__ExpressionAssignment_2_2
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
    // InternalCPHLCL.g:3276:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3280:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalCPHLCL.g:3281:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
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
    // InternalCPHLCL.g:3288:1: rule__Primary__Group_3__0__Impl : ( () ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3292:1: ( ( () ) )
            // InternalCPHLCL.g:3293:1: ( () )
            {
            // InternalCPHLCL.g:3293:1: ( () )
            // InternalCPHLCL.g:3294:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getFunctionAction_3_0()); 
            // InternalCPHLCL.g:3295:2: ()
            // InternalCPHLCL.g:3295:3: 
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
    // InternalCPHLCL.g:3303:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3307:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalCPHLCL.g:3308:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
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
    // InternalCPHLCL.g:3315:1: rule__Primary__Group_3__1__Impl : ( ( rule__Primary__OpAssignment_3_1 ) ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3319:1: ( ( ( rule__Primary__OpAssignment_3_1 ) ) )
            // InternalCPHLCL.g:3320:1: ( ( rule__Primary__OpAssignment_3_1 ) )
            {
            // InternalCPHLCL.g:3320:1: ( ( rule__Primary__OpAssignment_3_1 ) )
            // InternalCPHLCL.g:3321:2: ( rule__Primary__OpAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryAccess().getOpAssignment_3_1()); 
            // InternalCPHLCL.g:3322:2: ( rule__Primary__OpAssignment_3_1 )
            // InternalCPHLCL.g:3322:3: rule__Primary__OpAssignment_3_1
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
    // InternalCPHLCL.g:3330:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3334:1: ( rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 )
            // InternalCPHLCL.g:3335:2: rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3
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
    // InternalCPHLCL.g:3342:1: rule__Primary__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3346:1: ( ( '(' ) )
            // InternalCPHLCL.g:3347:1: ( '(' )
            {
            // InternalCPHLCL.g:3347:1: ( '(' )
            // InternalCPHLCL.g:3348:2: '('
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
    // InternalCPHLCL.g:3357:1: rule__Primary__Group_3__3 : rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 ;
    public final void rule__Primary__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3361:1: ( rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 )
            // InternalCPHLCL.g:3362:2: rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4
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
    // InternalCPHLCL.g:3369:1: rule__Primary__Group_3__3__Impl : ( ( rule__Primary__LeftAssignment_3_3 ) ) ;
    public final void rule__Primary__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3373:1: ( ( ( rule__Primary__LeftAssignment_3_3 ) ) )
            // InternalCPHLCL.g:3374:1: ( ( rule__Primary__LeftAssignment_3_3 ) )
            {
            // InternalCPHLCL.g:3374:1: ( ( rule__Primary__LeftAssignment_3_3 ) )
            // InternalCPHLCL.g:3375:2: ( rule__Primary__LeftAssignment_3_3 )
            {
             before(grammarAccess.getPrimaryAccess().getLeftAssignment_3_3()); 
            // InternalCPHLCL.g:3376:2: ( rule__Primary__LeftAssignment_3_3 )
            // InternalCPHLCL.g:3376:3: rule__Primary__LeftAssignment_3_3
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
    // InternalCPHLCL.g:3384:1: rule__Primary__Group_3__4 : rule__Primary__Group_3__4__Impl rule__Primary__Group_3__5 ;
    public final void rule__Primary__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3388:1: ( rule__Primary__Group_3__4__Impl rule__Primary__Group_3__5 )
            // InternalCPHLCL.g:3389:2: rule__Primary__Group_3__4__Impl rule__Primary__Group_3__5
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
    // InternalCPHLCL.g:3396:1: rule__Primary__Group_3__4__Impl : ( ',' ) ;
    public final void rule__Primary__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3400:1: ( ( ',' ) )
            // InternalCPHLCL.g:3401:1: ( ',' )
            {
            // InternalCPHLCL.g:3401:1: ( ',' )
            // InternalCPHLCL.g:3402:2: ','
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
    // InternalCPHLCL.g:3411:1: rule__Primary__Group_3__5 : rule__Primary__Group_3__5__Impl rule__Primary__Group_3__6 ;
    public final void rule__Primary__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3415:1: ( rule__Primary__Group_3__5__Impl rule__Primary__Group_3__6 )
            // InternalCPHLCL.g:3416:2: rule__Primary__Group_3__5__Impl rule__Primary__Group_3__6
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
    // InternalCPHLCL.g:3423:1: rule__Primary__Group_3__5__Impl : ( ( rule__Primary__RightAssignment_3_5 ) ) ;
    public final void rule__Primary__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3427:1: ( ( ( rule__Primary__RightAssignment_3_5 ) ) )
            // InternalCPHLCL.g:3428:1: ( ( rule__Primary__RightAssignment_3_5 ) )
            {
            // InternalCPHLCL.g:3428:1: ( ( rule__Primary__RightAssignment_3_5 ) )
            // InternalCPHLCL.g:3429:2: ( rule__Primary__RightAssignment_3_5 )
            {
             before(grammarAccess.getPrimaryAccess().getRightAssignment_3_5()); 
            // InternalCPHLCL.g:3430:2: ( rule__Primary__RightAssignment_3_5 )
            // InternalCPHLCL.g:3430:3: rule__Primary__RightAssignment_3_5
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
    // InternalCPHLCL.g:3438:1: rule__Primary__Group_3__6 : rule__Primary__Group_3__6__Impl ;
    public final void rule__Primary__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3442:1: ( rule__Primary__Group_3__6__Impl )
            // InternalCPHLCL.g:3443:2: rule__Primary__Group_3__6__Impl
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
    // InternalCPHLCL.g:3449:1: rule__Primary__Group_3__6__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3453:1: ( ( ')' ) )
            // InternalCPHLCL.g:3454:1: ( ')' )
            {
            // InternalCPHLCL.g:3454:1: ( ')' )
            // InternalCPHLCL.g:3455:2: ')'
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
    // InternalCPHLCL.g:3465:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3469:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalCPHLCL.g:3470:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
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
    // InternalCPHLCL.g:3477:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3481:1: ( ( () ) )
            // InternalCPHLCL.g:3482:1: ( () )
            {
            // InternalCPHLCL.g:3482:1: ( () )
            // InternalCPHLCL.g:3483:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_0_0()); 
            // InternalCPHLCL.g:3484:2: ()
            // InternalCPHLCL.g:3484:3: 
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
    // InternalCPHLCL.g:3492:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3496:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalCPHLCL.g:3497:2: rule__Atomic__Group_0__1__Impl
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
    // InternalCPHLCL.g:3503:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3507:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalCPHLCL.g:3508:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalCPHLCL.g:3508:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalCPHLCL.g:3509:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalCPHLCL.g:3510:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalCPHLCL.g:3510:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalCPHLCL.g:3519:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3523:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalCPHLCL.g:3524:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
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
    // InternalCPHLCL.g:3531:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3535:1: ( ( () ) )
            // InternalCPHLCL.g:3536:1: ( () )
            {
            // InternalCPHLCL.g:3536:1: ( () )
            // InternalCPHLCL.g:3537:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_1_0()); 
            // InternalCPHLCL.g:3538:2: ()
            // InternalCPHLCL.g:3538:3: 
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
    // InternalCPHLCL.g:3546:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3550:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalCPHLCL.g:3551:2: rule__Atomic__Group_1__1__Impl
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
    // InternalCPHLCL.g:3557:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__VariableAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3561:1: ( ( ( rule__Atomic__VariableAssignment_1_1 ) ) )
            // InternalCPHLCL.g:3562:1: ( ( rule__Atomic__VariableAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:3562:1: ( ( rule__Atomic__VariableAssignment_1_1 ) )
            // InternalCPHLCL.g:3563:2: ( rule__Atomic__VariableAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_1_1()); 
            // InternalCPHLCL.g:3564:2: ( rule__Atomic__VariableAssignment_1_1 )
            // InternalCPHLCL.g:3564:3: rule__Atomic__VariableAssignment_1_1
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
    // InternalCPHLCL.g:3573:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3577:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalCPHLCL.g:3578:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
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
    // InternalCPHLCL.g:3585:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3589:1: ( ( () ) )
            // InternalCPHLCL.g:3590:1: ( () )
            {
            // InternalCPHLCL.g:3590:1: ( () )
            // InternalCPHLCL.g:3591:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_2_0()); 
            // InternalCPHLCL.g:3592:2: ()
            // InternalCPHLCL.g:3592:3: 
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
    // InternalCPHLCL.g:3600:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3604:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalCPHLCL.g:3605:2: rule__Atomic__Group_2__1__Impl
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
    // InternalCPHLCL.g:3611:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3615:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalCPHLCL.g:3616:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalCPHLCL.g:3616:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalCPHLCL.g:3617:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalCPHLCL.g:3618:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalCPHLCL.g:3618:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalCPHLCL.g:3627:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3631:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalCPHLCL.g:3632:2: rule__Global__Group__0__Impl rule__Global__Group__1
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
    // InternalCPHLCL.g:3639:1: rule__Global__Group__0__Impl : ( ( rule__Global__OpAssignment_0 ) ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3643:1: ( ( ( rule__Global__OpAssignment_0 ) ) )
            // InternalCPHLCL.g:3644:1: ( ( rule__Global__OpAssignment_0 ) )
            {
            // InternalCPHLCL.g:3644:1: ( ( rule__Global__OpAssignment_0 ) )
            // InternalCPHLCL.g:3645:2: ( rule__Global__OpAssignment_0 )
            {
             before(grammarAccess.getGlobalAccess().getOpAssignment_0()); 
            // InternalCPHLCL.g:3646:2: ( rule__Global__OpAssignment_0 )
            // InternalCPHLCL.g:3646:3: rule__Global__OpAssignment_0
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
    // InternalCPHLCL.g:3654:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3658:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalCPHLCL.g:3659:2: rule__Global__Group__1__Impl rule__Global__Group__2
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
    // InternalCPHLCL.g:3666:1: rule__Global__Group__1__Impl : ( '(' ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3670:1: ( ( '(' ) )
            // InternalCPHLCL.g:3671:1: ( '(' )
            {
            // InternalCPHLCL.g:3671:1: ( '(' )
            // InternalCPHLCL.g:3672:2: '('
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
    // InternalCPHLCL.g:3681:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3685:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalCPHLCL.g:3686:2: rule__Global__Group__2__Impl rule__Global__Group__3
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
    // InternalCPHLCL.g:3693:1: rule__Global__Group__2__Impl : ( ( rule__Global__VarsAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3697:1: ( ( ( rule__Global__VarsAssignment_2 ) ) )
            // InternalCPHLCL.g:3698:1: ( ( rule__Global__VarsAssignment_2 ) )
            {
            // InternalCPHLCL.g:3698:1: ( ( rule__Global__VarsAssignment_2 ) )
            // InternalCPHLCL.g:3699:2: ( rule__Global__VarsAssignment_2 )
            {
             before(grammarAccess.getGlobalAccess().getVarsAssignment_2()); 
            // InternalCPHLCL.g:3700:2: ( rule__Global__VarsAssignment_2 )
            // InternalCPHLCL.g:3700:3: rule__Global__VarsAssignment_2
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
    // InternalCPHLCL.g:3708:1: rule__Global__Group__3 : rule__Global__Group__3__Impl ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3712:1: ( rule__Global__Group__3__Impl )
            // InternalCPHLCL.g:3713:2: rule__Global__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__3__Impl();

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
    // InternalCPHLCL.g:3719:1: rule__Global__Group__3__Impl : ( ')' ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3723:1: ( ( ')' ) )
            // InternalCPHLCL.g:3724:1: ( ')' )
            {
            // InternalCPHLCL.g:3724:1: ( ')' )
            // InternalCPHLCL.g:3725:2: ')'
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


    // $ANTLR start "rule__ListOfValues__Group__0"
    // InternalCPHLCL.g:3735:1: rule__ListOfValues__Group__0 : rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 ;
    public final void rule__ListOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3739:1: ( rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 )
            // InternalCPHLCL.g:3740:2: rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1
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
    // InternalCPHLCL.g:3747:1: rule__ListOfValues__Group__0__Impl : ( ( rule__ListOfValues__ValuesAssignment_0 ) ) ;
    public final void rule__ListOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3751:1: ( ( ( rule__ListOfValues__ValuesAssignment_0 ) ) )
            // InternalCPHLCL.g:3752:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            {
            // InternalCPHLCL.g:3752:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            // InternalCPHLCL.g:3753:2: ( rule__ListOfValues__ValuesAssignment_0 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_0()); 
            // InternalCPHLCL.g:3754:2: ( rule__ListOfValues__ValuesAssignment_0 )
            // InternalCPHLCL.g:3754:3: rule__ListOfValues__ValuesAssignment_0
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
    // InternalCPHLCL.g:3762:1: rule__ListOfValues__Group__1 : rule__ListOfValues__Group__1__Impl ;
    public final void rule__ListOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3766:1: ( rule__ListOfValues__Group__1__Impl )
            // InternalCPHLCL.g:3767:2: rule__ListOfValues__Group__1__Impl
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
    // InternalCPHLCL.g:3773:1: rule__ListOfValues__Group__1__Impl : ( ( rule__ListOfValues__Group_1__0 )* ) ;
    public final void rule__ListOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3777:1: ( ( ( rule__ListOfValues__Group_1__0 )* ) )
            // InternalCPHLCL.g:3778:1: ( ( rule__ListOfValues__Group_1__0 )* )
            {
            // InternalCPHLCL.g:3778:1: ( ( rule__ListOfValues__Group_1__0 )* )
            // InternalCPHLCL.g:3779:2: ( rule__ListOfValues__Group_1__0 )*
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalCPHLCL.g:3780:2: ( rule__ListOfValues__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==53) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCPHLCL.g:3780:3: rule__ListOfValues__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__ListOfValues__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalCPHLCL.g:3789:1: rule__ListOfValues__Group_1__0 : rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 ;
    public final void rule__ListOfValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3793:1: ( rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 )
            // InternalCPHLCL.g:3794:2: rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1
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
    // InternalCPHLCL.g:3801:1: rule__ListOfValues__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3805:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalCPHLCL.g:3806:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalCPHLCL.g:3806:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalCPHLCL.g:3807:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalCPHLCL.g:3807:2: ( ( ',' ) )
            // InternalCPHLCL.g:3808:3: ( ',' )
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalCPHLCL.g:3809:3: ( ',' )
            // InternalCPHLCL.g:3809:4: ','
            {
            match(input,53,FOLLOW_43); 

            }

             after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 

            }

            // InternalCPHLCL.g:3812:2: ( ( ',' )* )
            // InternalCPHLCL.g:3813:3: ( ',' )*
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalCPHLCL.g:3814:3: ( ',' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==53) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCPHLCL.g:3814:4: ','
            	    {
            	    match(input,53,FOLLOW_43); 

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalCPHLCL.g:3823:1: rule__ListOfValues__Group_1__1 : rule__ListOfValues__Group_1__1__Impl ;
    public final void rule__ListOfValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3827:1: ( rule__ListOfValues__Group_1__1__Impl )
            // InternalCPHLCL.g:3828:2: rule__ListOfValues__Group_1__1__Impl
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
    // InternalCPHLCL.g:3834:1: rule__ListOfValues__Group_1__1__Impl : ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) ;
    public final void rule__ListOfValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3838:1: ( ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) )
            // InternalCPHLCL.g:3839:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:3839:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            // InternalCPHLCL.g:3840:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1()); 
            // InternalCPHLCL.g:3841:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            // InternalCPHLCL.g:3841:3: rule__ListOfValues__ValuesAssignment_1_1
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


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalCPHLCL.g:3850:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3854:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:3855:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:3855:2: ( RULE_ID )
            // InternalCPHLCL.g:3856:3: RULE_ID
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
    // InternalCPHLCL.g:3865:1: rule__Model__VariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__Model__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3869:1: ( ( ruleVariable ) )
            // InternalCPHLCL.g:3870:2: ( ruleVariable )
            {
            // InternalCPHLCL.g:3870:2: ( ruleVariable )
            // InternalCPHLCL.g:3871:3: ruleVariable
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
    // InternalCPHLCL.g:3880:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3884:1: ( ( ruleConstraint ) )
            // InternalCPHLCL.g:3885:2: ( ruleConstraint )
            {
            // InternalCPHLCL.g:3885:2: ( ruleConstraint )
            // InternalCPHLCL.g:3886:3: ruleConstraint
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
    // InternalCPHLCL.g:3895:1: rule__Model__StrategyAssignment_6_1 : ( ruleStrategy ) ;
    public final void rule__Model__StrategyAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3899:1: ( ( ruleStrategy ) )
            // InternalCPHLCL.g:3900:2: ( ruleStrategy )
            {
            // InternalCPHLCL.g:3900:2: ( ruleStrategy )
            // InternalCPHLCL.g:3901:3: ruleStrategy
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
    // InternalCPHLCL.g:3910:1: rule__Variable__TypeAssignment_0 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3914:1: ( ( ruleVarType ) )
            // InternalCPHLCL.g:3915:2: ( ruleVarType )
            {
            // InternalCPHLCL.g:3915:2: ( ruleVarType )
            // InternalCPHLCL.g:3916:3: ruleVarType
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
    // InternalCPHLCL.g:3925:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3929:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:3930:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:3930:2: ( RULE_ID )
            // InternalCPHLCL.g:3931:3: RULE_ID
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
    // InternalCPHLCL.g:3940:1: rule__Variable__DomainAssignment_2_1 : ( ruleDomainDeclaration ) ;
    public final void rule__Variable__DomainAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3944:1: ( ( ruleDomainDeclaration ) )
            // InternalCPHLCL.g:3945:2: ( ruleDomainDeclaration )
            {
            // InternalCPHLCL.g:3945:2: ( ruleDomainDeclaration )
            // InternalCPHLCL.g:3946:3: ruleDomainDeclaration
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
    // InternalCPHLCL.g:3955:1: rule__Interval__StartAssignment_0 : ( ruleNumber ) ;
    public final void rule__Interval__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3959:1: ( ( ruleNumber ) )
            // InternalCPHLCL.g:3960:2: ( ruleNumber )
            {
            // InternalCPHLCL.g:3960:2: ( ruleNumber )
            // InternalCPHLCL.g:3961:3: ruleNumber
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
    // InternalCPHLCL.g:3970:1: rule__Interval__EndAssignment_2 : ( ruleNumber ) ;
    public final void rule__Interval__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3974:1: ( ( ruleNumber ) )
            // InternalCPHLCL.g:3975:2: ( ruleNumber )
            {
            // InternalCPHLCL.g:3975:2: ( ruleNumber )
            // InternalCPHLCL.g:3976:3: ruleNumber
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
    // InternalCPHLCL.g:3985:1: rule__Enumeration__ListAssignment_1 : ( ruleListOfValues ) ;
    public final void rule__Enumeration__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3989:1: ( ( ruleListOfValues ) )
            // InternalCPHLCL.g:3990:2: ( ruleListOfValues )
            {
            // InternalCPHLCL.g:3990:2: ( ruleListOfValues )
            // InternalCPHLCL.g:3991:3: ruleListOfValues
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
    // InternalCPHLCL.g:4000:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4004:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4005:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:4005:2: ( RULE_ID )
            // InternalCPHLCL.g:4006:3: RULE_ID
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
    // InternalCPHLCL.g:4015:1: rule__Constraint__ExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4019:1: ( ( ruleExpression ) )
            // InternalCPHLCL.g:4020:2: ( ruleExpression )
            {
            // InternalCPHLCL.g:4020:2: ( ruleExpression )
            // InternalCPHLCL.g:4021:3: ruleExpression
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
    // InternalCPHLCL.g:4030:1: rule__Iff__RightAssignment_1_2 : ( ruleImplies ) ;
    public final void rule__Iff__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4034:1: ( ( ruleImplies ) )
            // InternalCPHLCL.g:4035:2: ( ruleImplies )
            {
            // InternalCPHLCL.g:4035:2: ( ruleImplies )
            // InternalCPHLCL.g:4036:3: ruleImplies
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
    // InternalCPHLCL.g:4045:1: rule__Implies__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Implies__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4049:1: ( ( ruleOr ) )
            // InternalCPHLCL.g:4050:2: ( ruleOr )
            {
            // InternalCPHLCL.g:4050:2: ( ruleOr )
            // InternalCPHLCL.g:4051:3: ruleOr
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
    // InternalCPHLCL.g:4060:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4064:1: ( ( ruleAnd ) )
            // InternalCPHLCL.g:4065:2: ( ruleAnd )
            {
            // InternalCPHLCL.g:4065:2: ( ruleAnd )
            // InternalCPHLCL.g:4066:3: ruleAnd
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
    // InternalCPHLCL.g:4075:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4079:1: ( ( ruleEquality ) )
            // InternalCPHLCL.g:4080:2: ( ruleEquality )
            {
            // InternalCPHLCL.g:4080:2: ( ruleEquality )
            // InternalCPHLCL.g:4081:3: ruleEquality
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
    // InternalCPHLCL.g:4090:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4094:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalCPHLCL.g:4095:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalCPHLCL.g:4095:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalCPHLCL.g:4096:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalCPHLCL.g:4097:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalCPHLCL.g:4097:4: rule__Equality__OpAlternatives_1_1_0
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
    // InternalCPHLCL.g:4105:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4109:1: ( ( ruleComparison ) )
            // InternalCPHLCL.g:4110:2: ( ruleComparison )
            {
            // InternalCPHLCL.g:4110:2: ( ruleComparison )
            // InternalCPHLCL.g:4111:3: ruleComparison
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
    // InternalCPHLCL.g:4120:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4124:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalCPHLCL.g:4125:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalCPHLCL.g:4125:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalCPHLCL.g:4126:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalCPHLCL.g:4127:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalCPHLCL.g:4127:4: rule__Comparison__OpAlternatives_1_1_0
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
    // InternalCPHLCL.g:4135:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4139:1: ( ( rulePlusOrMinus ) )
            // InternalCPHLCL.g:4140:2: ( rulePlusOrMinus )
            {
            // InternalCPHLCL.g:4140:2: ( rulePlusOrMinus )
            // InternalCPHLCL.g:4141:3: rulePlusOrMinus
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
    // InternalCPHLCL.g:4150:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4154:1: ( ( ruleMulOrDiv ) )
            // InternalCPHLCL.g:4155:2: ( ruleMulOrDiv )
            {
            // InternalCPHLCL.g:4155:2: ( ruleMulOrDiv )
            // InternalCPHLCL.g:4156:3: ruleMulOrDiv
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
    // InternalCPHLCL.g:4165:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4169:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalCPHLCL.g:4170:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalCPHLCL.g:4170:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalCPHLCL.g:4171:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalCPHLCL.g:4172:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalCPHLCL.g:4172:4: rule__MulOrDiv__OpAlternatives_1_1_0
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
    // InternalCPHLCL.g:4180:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4184:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4185:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4185:2: ( rulePrimary )
            // InternalCPHLCL.g:4186:3: rulePrimary
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
    // InternalCPHLCL.g:4195:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4199:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4200:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4200:2: ( rulePrimary )
            // InternalCPHLCL.g:4201:3: rulePrimary
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
    // InternalCPHLCL.g:4210:1: rule__Primary__OpAssignment_2_1 : ( ruleUnaryOp ) ;
    public final void rule__Primary__OpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4214:1: ( ( ruleUnaryOp ) )
            // InternalCPHLCL.g:4215:2: ( ruleUnaryOp )
            {
            // InternalCPHLCL.g:4215:2: ( ruleUnaryOp )
            // InternalCPHLCL.g:4216:3: ruleUnaryOp
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
    // InternalCPHLCL.g:4225:1: rule__Primary__ExpressionAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4229:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4230:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4230:2: ( rulePrimary )
            // InternalCPHLCL.g:4231:3: rulePrimary
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
    // InternalCPHLCL.g:4240:1: rule__Primary__OpAssignment_3_1 : ( ruleFunctionOp ) ;
    public final void rule__Primary__OpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4244:1: ( ( ruleFunctionOp ) )
            // InternalCPHLCL.g:4245:2: ( ruleFunctionOp )
            {
            // InternalCPHLCL.g:4245:2: ( ruleFunctionOp )
            // InternalCPHLCL.g:4246:3: ruleFunctionOp
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
    // InternalCPHLCL.g:4255:1: rule__Primary__LeftAssignment_3_3 : ( rulePrimary ) ;
    public final void rule__Primary__LeftAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4259:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4260:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4260:2: ( rulePrimary )
            // InternalCPHLCL.g:4261:3: rulePrimary
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
    // InternalCPHLCL.g:4270:1: rule__Primary__RightAssignment_3_5 : ( rulePrimary ) ;
    public final void rule__Primary__RightAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4274:1: ( ( rulePrimary ) )
            // InternalCPHLCL.g:4275:2: ( rulePrimary )
            {
            // InternalCPHLCL.g:4275:2: ( rulePrimary )
            // InternalCPHLCL.g:4276:3: rulePrimary
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
    // InternalCPHLCL.g:4285:1: rule__Atomic__ValueAssignment_0_1 : ( ( rule__Atomic__ValueAlternatives_0_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4289:1: ( ( ( rule__Atomic__ValueAlternatives_0_1_0 ) ) )
            // InternalCPHLCL.g:4290:2: ( ( rule__Atomic__ValueAlternatives_0_1_0 ) )
            {
            // InternalCPHLCL.g:4290:2: ( ( rule__Atomic__ValueAlternatives_0_1_0 ) )
            // InternalCPHLCL.g:4291:3: ( rule__Atomic__ValueAlternatives_0_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_0_1_0()); 
            // InternalCPHLCL.g:4292:3: ( rule__Atomic__ValueAlternatives_0_1_0 )
            // InternalCPHLCL.g:4292:4: rule__Atomic__ValueAlternatives_0_1_0
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
    // InternalCPHLCL.g:4300:1: rule__Atomic__VariableAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4304:1: ( ( ( RULE_ID ) ) )
            // InternalCPHLCL.g:4305:2: ( ( RULE_ID ) )
            {
            // InternalCPHLCL.g:4305:2: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4306:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_1_1_0()); 
            // InternalCPHLCL.g:4307:3: ( RULE_ID )
            // InternalCPHLCL.g:4308:4: RULE_ID
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
    // InternalCPHLCL.g:4319:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4323:1: ( ( RULE_INT ) )
            // InternalCPHLCL.g:4324:2: ( RULE_INT )
            {
            // InternalCPHLCL.g:4324:2: ( RULE_INT )
            // InternalCPHLCL.g:4325:3: RULE_INT
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
    // InternalCPHLCL.g:4334:1: rule__Global__OpAssignment_0 : ( ruleGlobalOp ) ;
    public final void rule__Global__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4338:1: ( ( ruleGlobalOp ) )
            // InternalCPHLCL.g:4339:2: ( ruleGlobalOp )
            {
            // InternalCPHLCL.g:4339:2: ( ruleGlobalOp )
            // InternalCPHLCL.g:4340:3: ruleGlobalOp
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
    // InternalCPHLCL.g:4349:1: rule__Global__VarsAssignment_2 : ( ruleListOfIDs ) ;
    public final void rule__Global__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4353:1: ( ( ruleListOfIDs ) )
            // InternalCPHLCL.g:4354:2: ( ruleListOfIDs )
            {
            // InternalCPHLCL.g:4354:2: ( ruleListOfIDs )
            // InternalCPHLCL.g:4355:3: ruleListOfIDs
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


    // $ANTLR start "rule__BoolVal__ValueAssignment"
    // InternalCPHLCL.g:4364:1: rule__BoolVal__ValueAssignment : ( ( rule__BoolVal__ValueAlternatives_0 ) ) ;
    public final void rule__BoolVal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4368:1: ( ( ( rule__BoolVal__ValueAlternatives_0 ) ) )
            // InternalCPHLCL.g:4369:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            {
            // InternalCPHLCL.g:4369:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            // InternalCPHLCL.g:4370:3: ( rule__BoolVal__ValueAlternatives_0 )
            {
             before(grammarAccess.getBoolValAccess().getValueAlternatives_0()); 
            // InternalCPHLCL.g:4371:3: ( rule__BoolVal__ValueAlternatives_0 )
            // InternalCPHLCL.g:4371:4: rule__BoolVal__ValueAlternatives_0
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
    // InternalCPHLCL.g:4379:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4383:1: ( ( RULE_INT ) )
            // InternalCPHLCL.g:4384:2: ( RULE_INT )
            {
            // InternalCPHLCL.g:4384:2: ( RULE_INT )
            // InternalCPHLCL.g:4385:3: RULE_INT
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
    // InternalCPHLCL.g:4394:1: rule__Symbol__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Symbol__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4398:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4399:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:4399:2: ( RULE_ID )
            // InternalCPHLCL.g:4400:3: RULE_ID
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
    // InternalCPHLCL.g:4409:1: rule__ListOfValues__ValuesAssignment_0 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4413:1: ( ( ruleValue ) )
            // InternalCPHLCL.g:4414:2: ( ruleValue )
            {
            // InternalCPHLCL.g:4414:2: ( ruleValue )
            // InternalCPHLCL.g:4415:3: ruleValue
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
    // InternalCPHLCL.g:4424:1: rule__ListOfValues__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4428:1: ( ( ruleValue ) )
            // InternalCPHLCL.g:4429:2: ( ruleValue )
            {
            // InternalCPHLCL.g:4429:2: ( ruleValue )
            // InternalCPHLCL.g:4430:3: ruleValue
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


    // $ANTLR start "rule__ListOfIDs__IdsAssignment"
    // InternalCPHLCL.g:4439:1: rule__ListOfIDs__IdsAssignment : ( RULE_ID ) ;
    public final void rule__ListOfIDs__IdsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:4443:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:4444:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:4444:2: ( RULE_ID )
            // InternalCPHLCL.g:4445:3: RULE_ID
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
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000002L});

}