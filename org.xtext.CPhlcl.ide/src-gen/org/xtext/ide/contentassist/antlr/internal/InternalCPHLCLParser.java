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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCPHLCLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NOT'", "'one'", "'two'", "'true'", "'false'", "'AND'", "'OR'", "'XOR'", "'=>'", "'<=>'", "'>'", "'<'", "'>='", "'<='", "'='", "'!='", "'at_most'", "'all_different'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'pow'", "'dist'", "'bool'", "'integer'", "'symbolic'", "'model'", "'variables:'", "'constraints:'", "'strategy:'", "'domain:'", "'..'", "'['", "']'", "':'", "'('", "')'", "'if'", "'then'", "'else'", "'end_if'", "','"
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
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    // InternalCPHLCL.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCPHLCL.g:55:1: ( ruleModel EOF )
            // InternalCPHLCL.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalCPHLCL.g:68:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalCPHLCL.g:68:2: ( ( rule__Model__Group__0 ) )
            // InternalCPHLCL.g:69:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalCPHLCL.g:70:3: ( rule__Model__Group__0 )
            // InternalCPHLCL.g:70:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalCPHLCL.g:79:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalCPHLCL.g:80:1: ( ruleVarDeclaration EOF )
            // InternalCPHLCL.g:81:1: ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalCPHLCL.g:88:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:92:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalCPHLCL.g:93:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalCPHLCL.g:93:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalCPHLCL.g:94:3: ( rule__VarDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            }
            // InternalCPHLCL.g:95:3: ( rule__VarDeclaration__Group__0 )
            // InternalCPHLCL.g:95:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleDomainDeclaration"
    // InternalCPHLCL.g:104:1: entryRuleDomainDeclaration : ruleDomainDeclaration EOF ;
    public final void entryRuleDomainDeclaration() throws RecognitionException {
        try {
            // InternalCPHLCL.g:105:1: ( ruleDomainDeclaration EOF )
            // InternalCPHLCL.g:106:1: ruleDomainDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDomainDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:113:1: ruleDomainDeclaration : ( ( rule__DomainDeclaration__Alternatives ) ) ;
    public final void ruleDomainDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:117:2: ( ( ( rule__DomainDeclaration__Alternatives ) ) )
            // InternalCPHLCL.g:118:2: ( ( rule__DomainDeclaration__Alternatives ) )
            {
            // InternalCPHLCL.g:118:2: ( ( rule__DomainDeclaration__Alternatives ) )
            // InternalCPHLCL.g:119:3: ( rule__DomainDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:120:3: ( rule__DomainDeclaration__Alternatives )
            // InternalCPHLCL.g:120:4: rule__DomainDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDomainDeclaration"


    // $ANTLR start "entryRuleInterval"
    // InternalCPHLCL.g:129:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalCPHLCL.g:130:1: ( ruleInterval EOF )
            // InternalCPHLCL.g:131:1: ruleInterval EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInterval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:138:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:142:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalCPHLCL.g:143:2: ( ( rule__Interval__Group__0 ) )
            {
            // InternalCPHLCL.g:143:2: ( ( rule__Interval__Group__0 ) )
            // InternalCPHLCL.g:144:3: ( rule__Interval__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getGroup()); 
            }
            // InternalCPHLCL.g:145:3: ( rule__Interval__Group__0 )
            // InternalCPHLCL.g:145:4: rule__Interval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getGroup()); 
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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleEnumeration"
    // InternalCPHLCL.g:154:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalCPHLCL.g:155:1: ( ruleEnumeration EOF )
            // InternalCPHLCL.g:156:1: ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:163:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:167:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalCPHLCL.g:168:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalCPHLCL.g:168:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalCPHLCL.g:169:3: ( rule__Enumeration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup()); 
            }
            // InternalCPHLCL.g:170:3: ( rule__Enumeration__Group__0 )
            // InternalCPHLCL.g:170:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup()); 
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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleConstraint"
    // InternalCPHLCL.g:179:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalCPHLCL.g:180:1: ( ruleConstraint EOF )
            // InternalCPHLCL.g:181:1: ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:188:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:192:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalCPHLCL.g:193:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalCPHLCL.g:193:2: ( ( rule__Constraint__Group__0 ) )
            // InternalCPHLCL.g:194:3: ( rule__Constraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getGroup()); 
            }
            // InternalCPHLCL.g:195:3: ( rule__Constraint__Group__0 )
            // InternalCPHLCL.g:195:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getGroup()); 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleExpression"
    // InternalCPHLCL.g:204:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalCPHLCL.g:205:1: ( ruleExpression EOF )
            // InternalCPHLCL.g:206:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:213:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:217:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalCPHLCL.g:218:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalCPHLCL.g:218:2: ( ( rule__Expression__Alternatives ) )
            // InternalCPHLCL.g:219:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:220:3: ( rule__Expression__Alternatives )
            // InternalCPHLCL.g:220:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolTerm"
    // InternalCPHLCL.g:229:1: entryRuleBoolTerm : ruleBoolTerm EOF ;
    public final void entryRuleBoolTerm() throws RecognitionException {
        try {
            // InternalCPHLCL.g:230:1: ( ruleBoolTerm EOF )
            // InternalCPHLCL.g:231:1: ruleBoolTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBoolTerm"


    // $ANTLR start "ruleBoolTerm"
    // InternalCPHLCL.g:238:1: ruleBoolTerm : ( ( rule__BoolTerm__Alternatives ) ) ;
    public final void ruleBoolTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:242:2: ( ( ( rule__BoolTerm__Alternatives ) ) )
            // InternalCPHLCL.g:243:2: ( ( rule__BoolTerm__Alternatives ) )
            {
            // InternalCPHLCL.g:243:2: ( ( rule__BoolTerm__Alternatives ) )
            // InternalCPHLCL.g:244:3: ( rule__BoolTerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolTermAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:245:3: ( rule__BoolTerm__Alternatives )
            // InternalCPHLCL.g:245:4: rule__BoolTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolTerm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolTermAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBoolTerm"


    // $ANTLR start "entryRuleComplexTerm"
    // InternalCPHLCL.g:254:1: entryRuleComplexTerm : ruleComplexTerm EOF ;
    public final void entryRuleComplexTerm() throws RecognitionException {
        try {
            // InternalCPHLCL.g:255:1: ( ruleComplexTerm EOF )
            // InternalCPHLCL.g:256:1: ruleComplexTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComplexTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComplexTerm"


    // $ANTLR start "ruleComplexTerm"
    // InternalCPHLCL.g:263:1: ruleComplexTerm : ( ( rule__ComplexTerm__Alternatives ) ) ;
    public final void ruleComplexTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:267:2: ( ( ( rule__ComplexTerm__Alternatives ) ) )
            // InternalCPHLCL.g:268:2: ( ( rule__ComplexTerm__Alternatives ) )
            {
            // InternalCPHLCL.g:268:2: ( ( rule__ComplexTerm__Alternatives ) )
            // InternalCPHLCL.g:269:3: ( rule__ComplexTerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTermAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:270:3: ( rule__ComplexTerm__Alternatives )
            // InternalCPHLCL.g:270:4: rule__ComplexTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTerm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTermAccess().getAlternatives()); 
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
    // $ANTLR end "ruleComplexTerm"


    // $ANTLR start "entryRuleLogic"
    // InternalCPHLCL.g:279:1: entryRuleLogic : ruleLogic EOF ;
    public final void entryRuleLogic() throws RecognitionException {
        try {
            // InternalCPHLCL.g:280:1: ( ruleLogic EOF )
            // InternalCPHLCL.g:281:1: ruleLogic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogic"


    // $ANTLR start "ruleLogic"
    // InternalCPHLCL.g:288:1: ruleLogic : ( ( rule__Logic__Group__0 ) ) ;
    public final void ruleLogic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:292:2: ( ( ( rule__Logic__Group__0 ) ) )
            // InternalCPHLCL.g:293:2: ( ( rule__Logic__Group__0 ) )
            {
            // InternalCPHLCL.g:293:2: ( ( rule__Logic__Group__0 ) )
            // InternalCPHLCL.g:294:3: ( rule__Logic__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicAccess().getGroup()); 
            }
            // InternalCPHLCL.g:295:3: ( rule__Logic__Group__0 )
            // InternalCPHLCL.g:295:4: rule__Logic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Logic__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicAccess().getGroup()); 
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
    // $ANTLR end "ruleLogic"


    // $ANTLR start "entryRuleLogicUn"
    // InternalCPHLCL.g:304:1: entryRuleLogicUn : ruleLogicUn EOF ;
    public final void entryRuleLogicUn() throws RecognitionException {
        try {
            // InternalCPHLCL.g:305:1: ( ruleLogicUn EOF )
            // InternalCPHLCL.g:306:1: ruleLogicUn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicUnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogicUn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicUnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogicUn"


    // $ANTLR start "ruleLogicUn"
    // InternalCPHLCL.g:313:1: ruleLogicUn : ( ( rule__LogicUn__Group__0 ) ) ;
    public final void ruleLogicUn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:317:2: ( ( ( rule__LogicUn__Group__0 ) ) )
            // InternalCPHLCL.g:318:2: ( ( rule__LogicUn__Group__0 ) )
            {
            // InternalCPHLCL.g:318:2: ( ( rule__LogicUn__Group__0 ) )
            // InternalCPHLCL.g:319:3: ( rule__LogicUn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicUnAccess().getGroup()); 
            }
            // InternalCPHLCL.g:320:3: ( rule__LogicUn__Group__0 )
            // InternalCPHLCL.g:320:4: rule__LogicUn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicUn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicUnAccess().getGroup()); 
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
    // $ANTLR end "ruleLogicUn"


    // $ANTLR start "entryRuleRelational"
    // InternalCPHLCL.g:329:1: entryRuleRelational : ruleRelational EOF ;
    public final void entryRuleRelational() throws RecognitionException {
        try {
            // InternalCPHLCL.g:330:1: ( ruleRelational EOF )
            // InternalCPHLCL.g:331:1: ruleRelational EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelational();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:338:1: ruleRelational : ( ( rule__Relational__Group__0 ) ) ;
    public final void ruleRelational() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:342:2: ( ( ( rule__Relational__Group__0 ) ) )
            // InternalCPHLCL.g:343:2: ( ( rule__Relational__Group__0 ) )
            {
            // InternalCPHLCL.g:343:2: ( ( rule__Relational__Group__0 ) )
            // InternalCPHLCL.g:344:3: ( rule__Relational__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalAccess().getGroup()); 
            }
            // InternalCPHLCL.g:345:3: ( rule__Relational__Group__0 )
            // InternalCPHLCL.g:345:4: rule__Relational__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalAccess().getGroup()); 
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
    // $ANTLR end "ruleRelational"


    // $ANTLR start "entryRuleNumericTerm"
    // InternalCPHLCL.g:354:1: entryRuleNumericTerm : ruleNumericTerm EOF ;
    public final void entryRuleNumericTerm() throws RecognitionException {
        try {
            // InternalCPHLCL.g:355:1: ( ruleNumericTerm EOF )
            // InternalCPHLCL.g:356:1: ruleNumericTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumericTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumericTerm"


    // $ANTLR start "ruleNumericTerm"
    // InternalCPHLCL.g:363:1: ruleNumericTerm : ( ( rule__NumericTerm__Alternatives ) ) ;
    public final void ruleNumericTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:367:2: ( ( ( rule__NumericTerm__Alternatives ) ) )
            // InternalCPHLCL.g:368:2: ( ( rule__NumericTerm__Alternatives ) )
            {
            // InternalCPHLCL.g:368:2: ( ( rule__NumericTerm__Alternatives ) )
            // InternalCPHLCL.g:369:3: ( rule__NumericTerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericTermAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:370:3: ( rule__NumericTerm__Alternatives )
            // InternalCPHLCL.g:370:4: rule__NumericTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericTerm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericTermAccess().getAlternatives()); 
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
    // $ANTLR end "ruleNumericTerm"


    // $ANTLR start "entryRuleArithmetic"
    // InternalCPHLCL.g:379:1: entryRuleArithmetic : ruleArithmetic EOF ;
    public final void entryRuleArithmetic() throws RecognitionException {
        try {
            // InternalCPHLCL.g:380:1: ( ruleArithmetic EOF )
            // InternalCPHLCL.g:381:1: ruleArithmetic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArithmetic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArithmetic"


    // $ANTLR start "ruleArithmetic"
    // InternalCPHLCL.g:388:1: ruleArithmetic : ( ( rule__Arithmetic__Group__0 ) ) ;
    public final void ruleArithmetic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:392:2: ( ( ( rule__Arithmetic__Group__0 ) ) )
            // InternalCPHLCL.g:393:2: ( ( rule__Arithmetic__Group__0 ) )
            {
            // InternalCPHLCL.g:393:2: ( ( rule__Arithmetic__Group__0 ) )
            // InternalCPHLCL.g:394:3: ( rule__Arithmetic__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticAccess().getGroup()); 
            }
            // InternalCPHLCL.g:395:3: ( rule__Arithmetic__Group__0 )
            // InternalCPHLCL.g:395:4: rule__Arithmetic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticAccess().getGroup()); 
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
    // $ANTLR end "ruleArithmetic"


    // $ANTLR start "entryRuleGlobal"
    // InternalCPHLCL.g:404:1: entryRuleGlobal : ruleGlobal EOF ;
    public final void entryRuleGlobal() throws RecognitionException {
        try {
            // InternalCPHLCL.g:405:1: ( ruleGlobal EOF )
            // InternalCPHLCL.g:406:1: ruleGlobal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGlobal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:413:1: ruleGlobal : ( ( rule__Global__Group__0 ) ) ;
    public final void ruleGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:417:2: ( ( ( rule__Global__Group__0 ) ) )
            // InternalCPHLCL.g:418:2: ( ( rule__Global__Group__0 ) )
            {
            // InternalCPHLCL.g:418:2: ( ( rule__Global__Group__0 ) )
            // InternalCPHLCL.g:419:3: ( rule__Global__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalAccess().getGroup()); 
            }
            // InternalCPHLCL.g:420:3: ( rule__Global__Group__0 )
            // InternalCPHLCL.g:420:4: rule__Global__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalAccess().getGroup()); 
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
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleControl"
    // InternalCPHLCL.g:429:1: entryRuleControl : ruleControl EOF ;
    public final void entryRuleControl() throws RecognitionException {
        try {
            // InternalCPHLCL.g:430:1: ( ruleControl EOF )
            // InternalCPHLCL.g:431:1: ruleControl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleControl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleControl"


    // $ANTLR start "ruleControl"
    // InternalCPHLCL.g:438:1: ruleControl : ( ( rule__Control__Group__0 ) ) ;
    public final void ruleControl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:442:2: ( ( ( rule__Control__Group__0 ) ) )
            // InternalCPHLCL.g:443:2: ( ( rule__Control__Group__0 ) )
            {
            // InternalCPHLCL.g:443:2: ( ( rule__Control__Group__0 ) )
            // InternalCPHLCL.g:444:3: ( rule__Control__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getGroup()); 
            }
            // InternalCPHLCL.g:445:3: ( rule__Control__Group__0 )
            // InternalCPHLCL.g:445:4: rule__Control__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Control__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getGroup()); 
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
    // $ANTLR end "ruleControl"


    // $ANTLR start "entryRuleStrategy"
    // InternalCPHLCL.g:454:1: entryRuleStrategy : ruleStrategy EOF ;
    public final void entryRuleStrategy() throws RecognitionException {
        try {
            // InternalCPHLCL.g:455:1: ( ruleStrategy EOF )
            // InternalCPHLCL.g:456:1: ruleStrategy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrategyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrategyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:463:1: ruleStrategy : ( ( rule__Strategy__Alternatives ) ) ;
    public final void ruleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:467:2: ( ( ( rule__Strategy__Alternatives ) ) )
            // InternalCPHLCL.g:468:2: ( ( rule__Strategy__Alternatives ) )
            {
            // InternalCPHLCL.g:468:2: ( ( rule__Strategy__Alternatives ) )
            // InternalCPHLCL.g:469:3: ( rule__Strategy__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrategyAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:470:3: ( rule__Strategy__Alternatives )
            // InternalCPHLCL.g:470:4: rule__Strategy__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Strategy__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrategyAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleBoolVal"
    // InternalCPHLCL.g:479:1: entryRuleBoolVal : ruleBoolVal EOF ;
    public final void entryRuleBoolVal() throws RecognitionException {
        try {
            // InternalCPHLCL.g:480:1: ( ruleBoolVal EOF )
            // InternalCPHLCL.g:481:1: ruleBoolVal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolVal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:488:1: ruleBoolVal : ( ( rule__BoolVal__Alternatives ) ) ;
    public final void ruleBoolVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:492:2: ( ( ( rule__BoolVal__Alternatives ) ) )
            // InternalCPHLCL.g:493:2: ( ( rule__BoolVal__Alternatives ) )
            {
            // InternalCPHLCL.g:493:2: ( ( rule__BoolVal__Alternatives ) )
            // InternalCPHLCL.g:494:3: ( rule__BoolVal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:495:3: ( rule__BoolVal__Alternatives )
            // InternalCPHLCL.g:495:4: rule__BoolVal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolVal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBoolVal"


    // $ANTLR start "entryRuleBoolVar"
    // InternalCPHLCL.g:504:1: entryRuleBoolVar : ruleBoolVar EOF ;
    public final void entryRuleBoolVar() throws RecognitionException {
        try {
            // InternalCPHLCL.g:505:1: ( ruleBoolVar EOF )
            // InternalCPHLCL.g:506:1: ruleBoolVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolVarRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolVarRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBoolVar"


    // $ANTLR start "ruleBoolVar"
    // InternalCPHLCL.g:513:1: ruleBoolVar : ( ( rule__BoolVar__IdAssignment ) ) ;
    public final void ruleBoolVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:517:2: ( ( ( rule__BoolVar__IdAssignment ) ) )
            // InternalCPHLCL.g:518:2: ( ( rule__BoolVar__IdAssignment ) )
            {
            // InternalCPHLCL.g:518:2: ( ( rule__BoolVar__IdAssignment ) )
            // InternalCPHLCL.g:519:3: ( rule__BoolVar__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolVarAccess().getIdAssignment()); 
            }
            // InternalCPHLCL.g:520:3: ( rule__BoolVar__IdAssignment )
            // InternalCPHLCL.g:520:4: rule__BoolVar__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BoolVar__IdAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolVarAccess().getIdAssignment()); 
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
    // $ANTLR end "ruleBoolVar"


    // $ANTLR start "entryRuleNumber"
    // InternalCPHLCL.g:529:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalCPHLCL.g:530:1: ( ruleNumber EOF )
            // InternalCPHLCL.g:531:1: ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:538:1: ruleNumber : ( ( rule__Number__NumAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:542:2: ( ( ( rule__Number__NumAssignment ) ) )
            // InternalCPHLCL.g:543:2: ( ( rule__Number__NumAssignment ) )
            {
            // InternalCPHLCL.g:543:2: ( ( rule__Number__NumAssignment ) )
            // InternalCPHLCL.g:544:3: ( rule__Number__NumAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getNumAssignment()); 
            }
            // InternalCPHLCL.g:545:3: ( rule__Number__NumAssignment )
            // InternalCPHLCL.g:545:4: rule__Number__NumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__NumAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getNumAssignment()); 
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleIntVar"
    // InternalCPHLCL.g:554:1: entryRuleIntVar : ruleIntVar EOF ;
    public final void entryRuleIntVar() throws RecognitionException {
        try {
            // InternalCPHLCL.g:555:1: ( ruleIntVar EOF )
            // InternalCPHLCL.g:556:1: ruleIntVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntVarRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntVarRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntVar"


    // $ANTLR start "ruleIntVar"
    // InternalCPHLCL.g:563:1: ruleIntVar : ( ( rule__IntVar__IdAssignment ) ) ;
    public final void ruleIntVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:567:2: ( ( ( rule__IntVar__IdAssignment ) ) )
            // InternalCPHLCL.g:568:2: ( ( rule__IntVar__IdAssignment ) )
            {
            // InternalCPHLCL.g:568:2: ( ( rule__IntVar__IdAssignment ) )
            // InternalCPHLCL.g:569:3: ( rule__IntVar__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntVarAccess().getIdAssignment()); 
            }
            // InternalCPHLCL.g:570:3: ( rule__IntVar__IdAssignment )
            // InternalCPHLCL.g:570:4: rule__IntVar__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntVar__IdAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntVarAccess().getIdAssignment()); 
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
    // $ANTLR end "ruleIntVar"


    // $ANTLR start "entryRuleLogicOpBin"
    // InternalCPHLCL.g:579:1: entryRuleLogicOpBin : ruleLogicOpBin EOF ;
    public final void entryRuleLogicOpBin() throws RecognitionException {
        try {
            // InternalCPHLCL.g:580:1: ( ruleLogicOpBin EOF )
            // InternalCPHLCL.g:581:1: ruleLogicOpBin EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOpBinRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogicOpBin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOpBinRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogicOpBin"


    // $ANTLR start "ruleLogicOpBin"
    // InternalCPHLCL.g:588:1: ruleLogicOpBin : ( ( rule__LogicOpBin__Alternatives ) ) ;
    public final void ruleLogicOpBin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:592:2: ( ( ( rule__LogicOpBin__Alternatives ) ) )
            // InternalCPHLCL.g:593:2: ( ( rule__LogicOpBin__Alternatives ) )
            {
            // InternalCPHLCL.g:593:2: ( ( rule__LogicOpBin__Alternatives ) )
            // InternalCPHLCL.g:594:3: ( rule__LogicOpBin__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOpBinAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:595:3: ( rule__LogicOpBin__Alternatives )
            // InternalCPHLCL.g:595:4: rule__LogicOpBin__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicOpBin__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOpBinAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLogicOpBin"


    // $ANTLR start "entryRuleLogicOpUn"
    // InternalCPHLCL.g:604:1: entryRuleLogicOpUn : ruleLogicOpUn EOF ;
    public final void entryRuleLogicOpUn() throws RecognitionException {
        try {
            // InternalCPHLCL.g:605:1: ( ruleLogicOpUn EOF )
            // InternalCPHLCL.g:606:1: ruleLogicOpUn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOpUnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogicOpUn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOpUnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogicOpUn"


    // $ANTLR start "ruleLogicOpUn"
    // InternalCPHLCL.g:613:1: ruleLogicOpUn : ( 'NOT' ) ;
    public final void ruleLogicOpUn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:617:2: ( ( 'NOT' ) )
            // InternalCPHLCL.g:618:2: ( 'NOT' )
            {
            // InternalCPHLCL.g:618:2: ( 'NOT' )
            // InternalCPHLCL.g:619:3: 'NOT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOpUnAccess().getNOTKeyword()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOpUnAccess().getNOTKeyword()); 
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
    // $ANTLR end "ruleLogicOpUn"


    // $ANTLR start "entryRuleRelationalOp"
    // InternalCPHLCL.g:629:1: entryRuleRelationalOp : ruleRelationalOp EOF ;
    public final void entryRuleRelationalOp() throws RecognitionException {
        try {
            // InternalCPHLCL.g:630:1: ( ruleRelationalOp EOF )
            // InternalCPHLCL.g:631:1: ruleRelationalOp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalOpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationalOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalOpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // InternalCPHLCL.g:638:1: ruleRelationalOp : ( ( rule__RelationalOp__Alternatives ) ) ;
    public final void ruleRelationalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:642:2: ( ( ( rule__RelationalOp__Alternatives ) ) )
            // InternalCPHLCL.g:643:2: ( ( rule__RelationalOp__Alternatives ) )
            {
            // InternalCPHLCL.g:643:2: ( ( rule__RelationalOp__Alternatives ) )
            // InternalCPHLCL.g:644:3: ( rule__RelationalOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:645:3: ( rule__RelationalOp__Alternatives )
            // InternalCPHLCL.g:645:4: rule__RelationalOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalOpAccess().getAlternatives()); 
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
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRuleGlobalOp"
    // InternalCPHLCL.g:654:1: entryRuleGlobalOp : ruleGlobalOp EOF ;
    public final void entryRuleGlobalOp() throws RecognitionException {
        try {
            // InternalCPHLCL.g:655:1: ( ruleGlobalOp EOF )
            // InternalCPHLCL.g:656:1: ruleGlobalOp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalOpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGlobalOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalOpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:663:1: ruleGlobalOp : ( ( rule__GlobalOp__Alternatives ) ) ;
    public final void ruleGlobalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:667:2: ( ( ( rule__GlobalOp__Alternatives ) ) )
            // InternalCPHLCL.g:668:2: ( ( rule__GlobalOp__Alternatives ) )
            {
            // InternalCPHLCL.g:668:2: ( ( rule__GlobalOp__Alternatives ) )
            // InternalCPHLCL.g:669:3: ( rule__GlobalOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalOpAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:670:3: ( rule__GlobalOp__Alternatives )
            // InternalCPHLCL.g:670:4: rule__GlobalOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GlobalOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalOpAccess().getAlternatives()); 
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
    // $ANTLR end "ruleGlobalOp"


    // $ANTLR start "entryRuleArithmeticOp"
    // InternalCPHLCL.g:679:1: entryRuleArithmeticOp : ruleArithmeticOp EOF ;
    public final void entryRuleArithmeticOp() throws RecognitionException {
        try {
            // InternalCPHLCL.g:680:1: ( ruleArithmeticOp EOF )
            // InternalCPHLCL.g:681:1: ruleArithmeticOp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticOpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArithmeticOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticOpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArithmeticOp"


    // $ANTLR start "ruleArithmeticOp"
    // InternalCPHLCL.g:688:1: ruleArithmeticOp : ( ( rule__ArithmeticOp__Alternatives ) ) ;
    public final void ruleArithmeticOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:692:2: ( ( ( rule__ArithmeticOp__Alternatives ) ) )
            // InternalCPHLCL.g:693:2: ( ( rule__ArithmeticOp__Alternatives ) )
            {
            // InternalCPHLCL.g:693:2: ( ( rule__ArithmeticOp__Alternatives ) )
            // InternalCPHLCL.g:694:3: ( rule__ArithmeticOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticOpAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:695:3: ( rule__ArithmeticOp__Alternatives )
            // InternalCPHLCL.g:695:4: rule__ArithmeticOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticOpAccess().getAlternatives()); 
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
    // $ANTLR end "ruleArithmeticOp"


    // $ANTLR start "entryRuleValue"
    // InternalCPHLCL.g:704:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalCPHLCL.g:705:1: ( ruleValue EOF )
            // InternalCPHLCL.g:706:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:713:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:717:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalCPHLCL.g:718:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalCPHLCL.g:718:2: ( ( rule__Value__Alternatives ) )
            // InternalCPHLCL.g:719:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:720:3: ( rule__Value__Alternatives )
            // InternalCPHLCL.g:720:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEnumerableValue"
    // InternalCPHLCL.g:729:1: entryRuleEnumerableValue : ruleEnumerableValue EOF ;
    public final void entryRuleEnumerableValue() throws RecognitionException {
        try {
            // InternalCPHLCL.g:730:1: ( ruleEnumerableValue EOF )
            // InternalCPHLCL.g:731:1: ruleEnumerableValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerableValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumerableValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerableValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumerableValue"


    // $ANTLR start "ruleEnumerableValue"
    // InternalCPHLCL.g:738:1: ruleEnumerableValue : ( RULE_INT ) ;
    public final void ruleEnumerableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:742:2: ( ( RULE_INT ) )
            // InternalCPHLCL.g:743:2: ( RULE_INT )
            {
            // InternalCPHLCL.g:743:2: ( RULE_INT )
            // InternalCPHLCL.g:744:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerableValueAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerableValueAccess().getINTTerminalRuleCall()); 
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
    // $ANTLR end "ruleEnumerableValue"


    // $ANTLR start "entryRuleNonEnumerableValue"
    // InternalCPHLCL.g:754:1: entryRuleNonEnumerableValue : ruleNonEnumerableValue EOF ;
    public final void entryRuleNonEnumerableValue() throws RecognitionException {
        try {
            // InternalCPHLCL.g:755:1: ( ruleNonEnumerableValue EOF )
            // InternalCPHLCL.g:756:1: ruleNonEnumerableValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEnumerableValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNonEnumerableValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEnumerableValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:763:1: ruleNonEnumerableValue : ( ( rule__NonEnumerableValue__Alternatives ) ) ;
    public final void ruleNonEnumerableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:767:2: ( ( ( rule__NonEnumerableValue__Alternatives ) ) )
            // InternalCPHLCL.g:768:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            {
            // InternalCPHLCL.g:768:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            // InternalCPHLCL.g:769:3: ( rule__NonEnumerableValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEnumerableValueAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:770:3: ( rule__NonEnumerableValue__Alternatives )
            // InternalCPHLCL.g:770:4: rule__NonEnumerableValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NonEnumerableValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEnumerableValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleNonEnumerableValue"


    // $ANTLR start "entryRuleVarType"
    // InternalCPHLCL.g:779:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalCPHLCL.g:780:1: ( ruleVarType EOF )
            // InternalCPHLCL.g:781:1: ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:788:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:792:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalCPHLCL.g:793:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalCPHLCL.g:793:2: ( ( rule__VarType__Alternatives ) )
            // InternalCPHLCL.g:794:3: ( rule__VarType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            }
            // InternalCPHLCL.g:795:3: ( rule__VarType__Alternatives )
            // InternalCPHLCL.g:795:4: rule__VarType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VarType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleListOfValues"
    // InternalCPHLCL.g:804:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalCPHLCL.g:805:1: ( ruleListOfValues EOF )
            // InternalCPHLCL.g:806:1: ruleListOfValues EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfValuesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListOfValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfValuesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:813:1: ruleListOfValues : ( ( rule__ListOfValues__Group__0 ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:817:2: ( ( ( rule__ListOfValues__Group__0 ) ) )
            // InternalCPHLCL.g:818:2: ( ( rule__ListOfValues__Group__0 ) )
            {
            // InternalCPHLCL.g:818:2: ( ( rule__ListOfValues__Group__0 ) )
            // InternalCPHLCL.g:819:3: ( rule__ListOfValues__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfValuesAccess().getGroup()); 
            }
            // InternalCPHLCL.g:820:3: ( rule__ListOfValues__Group__0 )
            // InternalCPHLCL.g:820:4: rule__ListOfValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfValuesAccess().getGroup()); 
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
    // $ANTLR end "ruleListOfValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalCPHLCL.g:829:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalCPHLCL.g:830:1: ( ruleListOfIDs EOF )
            // InternalCPHLCL.g:831:1: ruleListOfIDs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfIDsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListOfIDs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfIDsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCPHLCL.g:838:1: ruleListOfIDs : ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:842:2: ( ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) )
            // InternalCPHLCL.g:843:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            {
            // InternalCPHLCL.g:843:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            // InternalCPHLCL.g:844:3: ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* )
            {
            // InternalCPHLCL.g:844:3: ( ( rule__ListOfIDs__IdsAssignment ) )
            // InternalCPHLCL.g:845:4: ( rule__ListOfIDs__IdsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            }
            // InternalCPHLCL.g:846:4: ( rule__ListOfIDs__IdsAssignment )
            // InternalCPHLCL.g:846:5: rule__ListOfIDs__IdsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ListOfIDs__IdsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            }

            }

            // InternalCPHLCL.g:849:3: ( ( rule__ListOfIDs__IdsAssignment )* )
            // InternalCPHLCL.g:850:4: ( rule__ListOfIDs__IdsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            }
            // InternalCPHLCL.g:851:4: ( rule__ListOfIDs__IdsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCPHLCL.g:851:5: rule__ListOfIDs__IdsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ListOfIDs__IdsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            }

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
    // InternalCPHLCL.g:860:1: rule__DomainDeclaration__Alternatives : ( ( ruleInterval ) | ( ruleEnumeration ) );
    public final void rule__DomainDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:864:1: ( ( ruleInterval ) | ( ruleEnumeration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==45) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCPHLCL.g:865:2: ( ruleInterval )
                    {
                    // InternalCPHLCL.g:865:2: ( ruleInterval )
                    // InternalCPHLCL.g:866:3: ruleInterval
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainDeclarationAccess().getIntervalParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInterval();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainDeclarationAccess().getIntervalParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:871:2: ( ruleEnumeration )
                    {
                    // InternalCPHLCL.g:871:2: ( ruleEnumeration )
                    // InternalCPHLCL.g:872:3: ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainDeclarationAccess().getEnumerationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainDeclarationAccess().getEnumerationParserRuleCall_1()); 
                    }

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
    // InternalCPHLCL.g:881:1: rule__Expression__Alternatives : ( ( ruleGlobal ) | ( ( ruleLogic ) ) | ( ( ruleRelational ) ) | ( ruleControl ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:885:1: ( ( ruleGlobal ) | ( ( ruleLogic ) ) | ( ( ruleRelational ) ) | ( ruleControl ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
                {
                alt3=1;
                }
                break;
            case 48:
                {
                int LA3_3 = input.LA(2);

                if ( (synpred4_InternalCPHLCL()) ) {
                    alt3=2;
                }
                else if ( (synpred5_InternalCPHLCL()) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA3_4 = input.LA(2);

                if ( (synpred4_InternalCPHLCL()) ) {
                    alt3=2;
                }
                else if ( (synpred5_InternalCPHLCL()) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt3=3;
                }
                break;
            case 50:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCPHLCL.g:886:2: ( ruleGlobal )
                    {
                    // InternalCPHLCL.g:886:2: ( ruleGlobal )
                    // InternalCPHLCL.g:887:3: ruleGlobal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGlobalParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGlobal();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getGlobalParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:892:2: ( ( ruleLogic ) )
                    {
                    // InternalCPHLCL.g:892:2: ( ( ruleLogic ) )
                    // InternalCPHLCL.g:893:3: ( ruleLogic )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getLogicParserRuleCall_1()); 
                    }
                    // InternalCPHLCL.g:894:3: ( ruleLogic )
                    // InternalCPHLCL.g:894:4: ruleLogic
                    {
                    pushFollow(FOLLOW_2);
                    ruleLogic();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getLogicParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:898:2: ( ( ruleRelational ) )
                    {
                    // InternalCPHLCL.g:898:2: ( ( ruleRelational ) )
                    // InternalCPHLCL.g:899:3: ( ruleRelational )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getRelationalParserRuleCall_2()); 
                    }
                    // InternalCPHLCL.g:900:3: ( ruleRelational )
                    // InternalCPHLCL.g:900:4: ruleRelational
                    {
                    pushFollow(FOLLOW_2);
                    ruleRelational();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getRelationalParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:904:2: ( ruleControl )
                    {
                    // InternalCPHLCL.g:904:2: ( ruleControl )
                    // InternalCPHLCL.g:905:3: ruleControl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getControlParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleControl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getControlParserRuleCall_3()); 
                    }

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


    // $ANTLR start "rule__BoolTerm__Alternatives"
    // InternalCPHLCL.g:914:1: rule__BoolTerm__Alternatives : ( ( ( rule__BoolTerm__Group_0__0 ) ) | ( ruleBoolVar ) );
    public final void rule__BoolTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:918:1: ( ( ( rule__BoolTerm__Group_0__0 ) ) | ( ruleBoolVar ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==48) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCPHLCL.g:919:2: ( ( rule__BoolTerm__Group_0__0 ) )
                    {
                    // InternalCPHLCL.g:919:2: ( ( rule__BoolTerm__Group_0__0 ) )
                    // InternalCPHLCL.g:920:3: ( rule__BoolTerm__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolTermAccess().getGroup_0()); 
                    }
                    // InternalCPHLCL.g:921:3: ( rule__BoolTerm__Group_0__0 )
                    // InternalCPHLCL.g:921:4: rule__BoolTerm__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolTerm__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolTermAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:925:2: ( ruleBoolVar )
                    {
                    // InternalCPHLCL.g:925:2: ( ruleBoolVar )
                    // InternalCPHLCL.g:926:3: ruleBoolVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolTermAccess().getBoolVarParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBoolVar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolTermAccess().getBoolVarParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__BoolTerm__Alternatives"


    // $ANTLR start "rule__ComplexTerm__Alternatives"
    // InternalCPHLCL.g:935:1: rule__ComplexTerm__Alternatives : ( ( ( ruleLogic ) ) | ( ( ruleRelational ) ) | ( ruleLogicUn ) );
    public final void rule__ComplexTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:939:1: ( ( ( ruleLogic ) ) | ( ( ruleRelational ) ) | ( ruleLogicUn ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred7_InternalCPHLCL()) ) {
                    alt5=1;
                }
                else if ( (synpred8_InternalCPHLCL()) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred7_InternalCPHLCL()) ) {
                    alt5=1;
                }
                else if ( (synpred8_InternalCPHLCL()) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case 11:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCPHLCL.g:940:2: ( ( ruleLogic ) )
                    {
                    // InternalCPHLCL.g:940:2: ( ( ruleLogic ) )
                    // InternalCPHLCL.g:941:3: ( ruleLogic )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTermAccess().getLogicParserRuleCall_0()); 
                    }
                    // InternalCPHLCL.g:942:3: ( ruleLogic )
                    // InternalCPHLCL.g:942:4: ruleLogic
                    {
                    pushFollow(FOLLOW_2);
                    ruleLogic();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComplexTermAccess().getLogicParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:946:2: ( ( ruleRelational ) )
                    {
                    // InternalCPHLCL.g:946:2: ( ( ruleRelational ) )
                    // InternalCPHLCL.g:947:3: ( ruleRelational )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTermAccess().getRelationalParserRuleCall_1()); 
                    }
                    // InternalCPHLCL.g:948:3: ( ruleRelational )
                    // InternalCPHLCL.g:948:4: ruleRelational
                    {
                    pushFollow(FOLLOW_2);
                    ruleRelational();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComplexTermAccess().getRelationalParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:952:2: ( ruleLogicUn )
                    {
                    // InternalCPHLCL.g:952:2: ( ruleLogicUn )
                    // InternalCPHLCL.g:953:3: ruleLogicUn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTermAccess().getLogicUnParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLogicUn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComplexTermAccess().getLogicUnParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__ComplexTerm__Alternatives"


    // $ANTLR start "rule__NumericTerm__Alternatives"
    // InternalCPHLCL.g:962:1: rule__NumericTerm__Alternatives : ( ( ( rule__NumericTerm__Group_0__0 ) ) | ( ruleNumber ) | ( ruleIntVar ) );
    public final void rule__NumericTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:966:1: ( ( ( rule__NumericTerm__Group_0__0 ) ) | ( ruleNumber ) | ( ruleIntVar ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCPHLCL.g:967:2: ( ( rule__NumericTerm__Group_0__0 ) )
                    {
                    // InternalCPHLCL.g:967:2: ( ( rule__NumericTerm__Group_0__0 ) )
                    // InternalCPHLCL.g:968:3: ( rule__NumericTerm__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericTermAccess().getGroup_0()); 
                    }
                    // InternalCPHLCL.g:969:3: ( rule__NumericTerm__Group_0__0 )
                    // InternalCPHLCL.g:969:4: rule__NumericTerm__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericTerm__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericTermAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:973:2: ( ruleNumber )
                    {
                    // InternalCPHLCL.g:973:2: ( ruleNumber )
                    // InternalCPHLCL.g:974:3: ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericTermAccess().getNumberParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericTermAccess().getNumberParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:979:2: ( ruleIntVar )
                    {
                    // InternalCPHLCL.g:979:2: ( ruleIntVar )
                    // InternalCPHLCL.g:980:3: ruleIntVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericTermAccess().getIntVarParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIntVar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericTermAccess().getIntVarParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__NumericTerm__Alternatives"


    // $ANTLR start "rule__Strategy__Alternatives"
    // InternalCPHLCL.g:989:1: rule__Strategy__Alternatives : ( ( 'one' ) | ( 'two' ) );
    public final void rule__Strategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:993:1: ( ( 'one' ) | ( 'two' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCPHLCL.g:994:2: ( 'one' )
                    {
                    // InternalCPHLCL.g:994:2: ( 'one' )
                    // InternalCPHLCL.g:995:3: 'one'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrategyAccess().getOneKeyword_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStrategyAccess().getOneKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1000:2: ( 'two' )
                    {
                    // InternalCPHLCL.g:1000:2: ( 'two' )
                    // InternalCPHLCL.g:1001:3: 'two'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrategyAccess().getTwoKeyword_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStrategyAccess().getTwoKeyword_1()); 
                    }

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


    // $ANTLR start "rule__BoolVal__Alternatives"
    // InternalCPHLCL.g:1010:1: rule__BoolVal__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BoolVal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1014:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCPHLCL.g:1015:2: ( 'true' )
                    {
                    // InternalCPHLCL.g:1015:2: ( 'true' )
                    // InternalCPHLCL.g:1016:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolValAccess().getTrueKeyword_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolValAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1021:2: ( 'false' )
                    {
                    // InternalCPHLCL.g:1021:2: ( 'false' )
                    // InternalCPHLCL.g:1022:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolValAccess().getFalseKeyword_1()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolValAccess().getFalseKeyword_1()); 
                    }

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
    // $ANTLR end "rule__BoolVal__Alternatives"


    // $ANTLR start "rule__LogicOpBin__Alternatives"
    // InternalCPHLCL.g:1031:1: rule__LogicOpBin__Alternatives : ( ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( '=>' ) | ( '<=>' ) );
    public final void rule__LogicOpBin__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1035:1: ( ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( '=>' ) | ( '<=>' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            case 20:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCPHLCL.g:1036:2: ( 'AND' )
                    {
                    // InternalCPHLCL.g:1036:2: ( 'AND' )
                    // InternalCPHLCL.g:1037:3: 'AND'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOpBinAccess().getANDKeyword_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOpBinAccess().getANDKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1042:2: ( 'OR' )
                    {
                    // InternalCPHLCL.g:1042:2: ( 'OR' )
                    // InternalCPHLCL.g:1043:3: 'OR'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOpBinAccess().getORKeyword_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOpBinAccess().getORKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1048:2: ( 'XOR' )
                    {
                    // InternalCPHLCL.g:1048:2: ( 'XOR' )
                    // InternalCPHLCL.g:1049:3: 'XOR'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOpBinAccess().getXORKeyword_2()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOpBinAccess().getXORKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1054:2: ( '=>' )
                    {
                    // InternalCPHLCL.g:1054:2: ( '=>' )
                    // InternalCPHLCL.g:1055:3: '=>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOpBinAccess().getEqualsSignGreaterThanSignKeyword_3()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOpBinAccess().getEqualsSignGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCPHLCL.g:1060:2: ( '<=>' )
                    {
                    // InternalCPHLCL.g:1060:2: ( '<=>' )
                    // InternalCPHLCL.g:1061:3: '<=>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOpBinAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_4()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOpBinAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_4()); 
                    }

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
    // $ANTLR end "rule__LogicOpBin__Alternatives"


    // $ANTLR start "rule__RelationalOp__Alternatives"
    // InternalCPHLCL.g:1070:1: rule__RelationalOp__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '!=' ) );
    public final void rule__RelationalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1074:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '!=' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            case 26:
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCPHLCL.g:1075:2: ( '>' )
                    {
                    // InternalCPHLCL.g:1075:2: ( '>' )
                    // InternalCPHLCL.g:1076:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_0()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1081:2: ( '<' )
                    {
                    // InternalCPHLCL.g:1081:2: ( '<' )
                    // InternalCPHLCL.g:1082:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_1()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1087:2: ( '>=' )
                    {
                    // InternalCPHLCL.g:1087:2: ( '>=' )
                    // InternalCPHLCL.g:1088:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1093:2: ( '<=' )
                    {
                    // InternalCPHLCL.g:1093:2: ( '<=' )
                    // InternalCPHLCL.g:1094:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCPHLCL.g:1099:2: ( '=' )
                    {
                    // InternalCPHLCL.g:1099:2: ( '=' )
                    // InternalCPHLCL.g:1100:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_4()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCPHLCL.g:1105:2: ( '!=' )
                    {
                    // InternalCPHLCL.g:1105:2: ( '!=' )
                    // InternalCPHLCL.g:1106:3: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getExclamationMarkEqualsSignKeyword_5()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getExclamationMarkEqualsSignKeyword_5()); 
                    }

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
    // $ANTLR end "rule__RelationalOp__Alternatives"


    // $ANTLR start "rule__GlobalOp__Alternatives"
    // InternalCPHLCL.g:1115:1: rule__GlobalOp__Alternatives : ( ( 'at_most' ) | ( 'all_different' ) );
    public final void rule__GlobalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1119:1: ( ( 'at_most' ) | ( 'all_different' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCPHLCL.g:1120:2: ( 'at_most' )
                    {
                    // InternalCPHLCL.g:1120:2: ( 'at_most' )
                    // InternalCPHLCL.g:1121:3: 'at_most'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGlobalOpAccess().getAt_mostKeyword_0()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGlobalOpAccess().getAt_mostKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1126:2: ( 'all_different' )
                    {
                    // InternalCPHLCL.g:1126:2: ( 'all_different' )
                    // InternalCPHLCL.g:1127:3: 'all_different'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGlobalOpAccess().getAll_differentKeyword_1()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGlobalOpAccess().getAll_differentKeyword_1()); 
                    }

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


    // $ANTLR start "rule__ArithmeticOp__Alternatives"
    // InternalCPHLCL.g:1136:1: rule__ArithmeticOp__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'mod' ) | ( 'pow' ) | ( 'dist' ) );
    public final void rule__ArithmeticOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1140:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'mod' ) | ( 'pow' ) | ( 'dist' ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 34:
                {
                alt12=6;
                }
                break;
            case 35:
                {
                alt12=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCPHLCL.g:1141:2: ( '+' )
                    {
                    // InternalCPHLCL.g:1141:2: ( '+' )
                    // InternalCPHLCL.g:1142:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticOpAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticOpAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1147:2: ( '-' )
                    {
                    // InternalCPHLCL.g:1147:2: ( '-' )
                    // InternalCPHLCL.g:1148:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticOpAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticOpAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1153:2: ( '*' )
                    {
                    // InternalCPHLCL.g:1153:2: ( '*' )
                    // InternalCPHLCL.g:1154:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticOpAccess().getAsteriskKeyword_2()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticOpAccess().getAsteriskKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCPHLCL.g:1159:2: ( '/' )
                    {
                    // InternalCPHLCL.g:1159:2: ( '/' )
                    // InternalCPHLCL.g:1160:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticOpAccess().getSolidusKeyword_3()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticOpAccess().getSolidusKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCPHLCL.g:1165:2: ( 'mod' )
                    {
                    // InternalCPHLCL.g:1165:2: ( 'mod' )
                    // InternalCPHLCL.g:1166:3: 'mod'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticOpAccess().getModKeyword_4()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticOpAccess().getModKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCPHLCL.g:1171:2: ( 'pow' )
                    {
                    // InternalCPHLCL.g:1171:2: ( 'pow' )
                    // InternalCPHLCL.g:1172:3: 'pow'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticOpAccess().getPowKeyword_5()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticOpAccess().getPowKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalCPHLCL.g:1177:2: ( 'dist' )
                    {
                    // InternalCPHLCL.g:1177:2: ( 'dist' )
                    // InternalCPHLCL.g:1178:3: 'dist'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticOpAccess().getDistKeyword_6()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticOpAccess().getDistKeyword_6()); 
                    }

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
    // $ANTLR end "rule__ArithmeticOp__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalCPHLCL.g:1187:1: rule__Value__Alternatives : ( ( ruleEnumerableValue ) | ( ruleNonEnumerableValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1191:1: ( ( ruleEnumerableValue ) | ( ruleNonEnumerableValue ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID||(LA13_0>=14 && LA13_0<=15)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCPHLCL.g:1192:2: ( ruleEnumerableValue )
                    {
                    // InternalCPHLCL.g:1192:2: ( ruleEnumerableValue )
                    // InternalCPHLCL.g:1193:3: ruleEnumerableValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getEnumerableValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnumerableValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getEnumerableValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1198:2: ( ruleNonEnumerableValue )
                    {
                    // InternalCPHLCL.g:1198:2: ( ruleNonEnumerableValue )
                    // InternalCPHLCL.g:1199:3: ruleNonEnumerableValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNonEnumerableValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNonEnumerableValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNonEnumerableValueParserRuleCall_1()); 
                    }

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
    // InternalCPHLCL.g:1208:1: rule__NonEnumerableValue__Alternatives : ( ( ruleBoolVal ) | ( RULE_ID ) );
    public final void rule__NonEnumerableValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1212:1: ( ( ruleBoolVal ) | ( RULE_ID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=14 && LA14_0<=15)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCPHLCL.g:1213:2: ( ruleBoolVal )
                    {
                    // InternalCPHLCL.g:1213:2: ( ruleBoolVal )
                    // InternalCPHLCL.g:1214:3: ruleBoolVal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonEnumerableValueAccess().getBoolValParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBoolVal();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonEnumerableValueAccess().getBoolValParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1219:2: ( RULE_ID )
                    {
                    // InternalCPHLCL.g:1219:2: ( RULE_ID )
                    // InternalCPHLCL.g:1220:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonEnumerableValueAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonEnumerableValueAccess().getIDTerminalRuleCall_1()); 
                    }

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
    // InternalCPHLCL.g:1229:1: rule__VarType__Alternatives : ( ( 'bool' ) | ( 'integer' ) | ( 'symbolic' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1233:1: ( ( 'bool' ) | ( 'integer' ) | ( 'symbolic' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalCPHLCL.g:1234:2: ( 'bool' )
                    {
                    // InternalCPHLCL.g:1234:2: ( 'bool' )
                    // InternalCPHLCL.g:1235:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getBoolKeyword_0()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getBoolKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPHLCL.g:1240:2: ( 'integer' )
                    {
                    // InternalCPHLCL.g:1240:2: ( 'integer' )
                    // InternalCPHLCL.g:1241:3: 'integer'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCPHLCL.g:1246:2: ( 'symbolic' )
                    {
                    // InternalCPHLCL.g:1246:2: ( 'symbolic' )
                    // InternalCPHLCL.g:1247:3: 'symbolic'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getSymbolicKeyword_2()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getSymbolicKeyword_2()); 
                    }

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


    // $ANTLR start "rule__Model__Group__0"
    // InternalCPHLCL.g:1256:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1260:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCPHLCL.g:1261:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1268:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1272:1: ( ( 'model' ) )
            // InternalCPHLCL.g:1273:1: ( 'model' )
            {
            // InternalCPHLCL.g:1273:1: ( 'model' )
            // InternalCPHLCL.g:1274:2: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelKeyword_0()); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalCPHLCL.g:1283:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1287:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalCPHLCL.g:1288:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1295:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1299:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalCPHLCL.g:1300:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalCPHLCL.g:1300:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalCPHLCL.g:1301:2: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // InternalCPHLCL.g:1302:2: ( rule__Model__NameAssignment_1 )
            // InternalCPHLCL.g:1302:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalCPHLCL.g:1310:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1314:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalCPHLCL.g:1315:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1322:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1326:1: ( ( 'variables:' ) )
            // InternalCPHLCL.g:1327:1: ( 'variables:' )
            {
            // InternalCPHLCL.g:1327:1: ( 'variables:' )
            // InternalCPHLCL.g:1328:2: 'variables:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVariablesKeyword_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVariablesKeyword_2()); 
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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalCPHLCL.g:1337:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1341:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalCPHLCL.g:1342:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1349:1: rule__Model__Group__3__Impl : ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1353:1: ( ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) )
            // InternalCPHLCL.g:1354:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            {
            // InternalCPHLCL.g:1354:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalCPHLCL.g:1355:2: ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalCPHLCL.g:1355:2: ( ( rule__Model__VarsAssignment_3 ) )
            // InternalCPHLCL.g:1356:3: ( rule__Model__VarsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            }
            // InternalCPHLCL.g:1357:3: ( rule__Model__VarsAssignment_3 )
            // InternalCPHLCL.g:1357:4: rule__Model__VarsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Model__VarsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            }

            }

            // InternalCPHLCL.g:1360:2: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalCPHLCL.g:1361:3: ( rule__Model__VarsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            }
            // InternalCPHLCL.g:1362:3: ( rule__Model__VarsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=36 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCPHLCL.g:1362:4: rule__Model__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__VarsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            }

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalCPHLCL.g:1371:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1375:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalCPHLCL.g:1376:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1383:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1387:1: ( ( 'constraints:' ) )
            // InternalCPHLCL.g:1388:1: ( 'constraints:' )
            {
            // InternalCPHLCL.g:1388:1: ( 'constraints:' )
            // InternalCPHLCL.g:1389:2: 'constraints:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getConstraintsKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getConstraintsKeyword_4()); 
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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalCPHLCL.g:1398:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1402:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalCPHLCL.g:1403:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1410:1: rule__Model__Group__5__Impl : ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1414:1: ( ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) )
            // InternalCPHLCL.g:1415:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            {
            // InternalCPHLCL.g:1415:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalCPHLCL.g:1416:2: ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalCPHLCL.g:1416:2: ( ( rule__Model__ConstraintsAssignment_5 ) )
            // InternalCPHLCL.g:1417:3: ( rule__Model__ConstraintsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            }
            // InternalCPHLCL.g:1418:3: ( rule__Model__ConstraintsAssignment_5 )
            // InternalCPHLCL.g:1418:4: rule__Model__ConstraintsAssignment_5
            {
            pushFollow(FOLLOW_3);
            rule__Model__ConstraintsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            }

            }

            // InternalCPHLCL.g:1421:2: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalCPHLCL.g:1422:3: ( rule__Model__ConstraintsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            }
            // InternalCPHLCL.g:1423:3: ( rule__Model__ConstraintsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCPHLCL.g:1423:4: rule__Model__ConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ConstraintsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            }

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalCPHLCL.g:1432:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1436:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalCPHLCL.g:1437:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Model__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1444:1: rule__Model__Group__6__Impl : ( 'strategy:' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1448:1: ( ( 'strategy:' ) )
            // InternalCPHLCL.g:1449:1: ( 'strategy:' )
            {
            // InternalCPHLCL.g:1449:1: ( 'strategy:' )
            // InternalCPHLCL.g:1450:2: 'strategy:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStrategyKeyword_6()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStrategyKeyword_6()); 
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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalCPHLCL.g:1459:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1463:1: ( rule__Model__Group__7__Impl )
            // InternalCPHLCL.g:1464:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalCPHLCL.g:1470:1: rule__Model__Group__7__Impl : ( ( rule__Model__StrategyAssignment_7 ) ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1474:1: ( ( ( rule__Model__StrategyAssignment_7 ) ) )
            // InternalCPHLCL.g:1475:1: ( ( rule__Model__StrategyAssignment_7 ) )
            {
            // InternalCPHLCL.g:1475:1: ( ( rule__Model__StrategyAssignment_7 ) )
            // InternalCPHLCL.g:1476:2: ( rule__Model__StrategyAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStrategyAssignment_7()); 
            }
            // InternalCPHLCL.g:1477:2: ( rule__Model__StrategyAssignment_7 )
            // InternalCPHLCL.g:1477:3: rule__Model__StrategyAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Model__StrategyAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStrategyAssignment_7()); 
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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalCPHLCL.g:1486:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1490:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalCPHLCL.g:1491:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalCPHLCL.g:1498:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1502:1: ( ( ( rule__VarDeclaration__TypeAssignment_0 ) ) )
            // InternalCPHLCL.g:1503:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            {
            // InternalCPHLCL.g:1503:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            // InternalCPHLCL.g:1504:2: ( rule__VarDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); 
            }
            // InternalCPHLCL.g:1505:2: ( rule__VarDeclaration__TypeAssignment_0 )
            // InternalCPHLCL.g:1505:3: rule__VarDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // InternalCPHLCL.g:1513:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1517:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalCPHLCL.g:1518:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalCPHLCL.g:1525:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1529:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // InternalCPHLCL.g:1530:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // InternalCPHLCL.g:1530:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // InternalCPHLCL.g:1531:2: ( rule__VarDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalCPHLCL.g:1532:2: ( rule__VarDeclaration__NameAssignment_1 )
            // InternalCPHLCL.g:1532:3: rule__VarDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__2"
    // InternalCPHLCL.g:1540:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1544:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalCPHLCL.g:1545:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__VarDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__2"


    // $ANTLR start "rule__VarDeclaration__Group__2__Impl"
    // InternalCPHLCL.g:1552:1: rule__VarDeclaration__Group__2__Impl : ( 'domain:' ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1556:1: ( ( 'domain:' ) )
            // InternalCPHLCL.g:1557:1: ( 'domain:' )
            {
            // InternalCPHLCL.g:1557:1: ( 'domain:' )
            // InternalCPHLCL.g:1558:2: 'domain:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getDomainKeyword_2()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getDomainKeyword_2()); 
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
    // $ANTLR end "rule__VarDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__3"
    // InternalCPHLCL.g:1567:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1571:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalCPHLCL.g:1572:2: rule__VarDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__3"


    // $ANTLR start "rule__VarDeclaration__Group__3__Impl"
    // InternalCPHLCL.g:1578:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__DomainAssignment_3 ) ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1582:1: ( ( ( rule__VarDeclaration__DomainAssignment_3 ) ) )
            // InternalCPHLCL.g:1583:1: ( ( rule__VarDeclaration__DomainAssignment_3 ) )
            {
            // InternalCPHLCL.g:1583:1: ( ( rule__VarDeclaration__DomainAssignment_3 ) )
            // InternalCPHLCL.g:1584:2: ( rule__VarDeclaration__DomainAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getDomainAssignment_3()); 
            }
            // InternalCPHLCL.g:1585:2: ( rule__VarDeclaration__DomainAssignment_3 )
            // InternalCPHLCL.g:1585:3: rule__VarDeclaration__DomainAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__DomainAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getDomainAssignment_3()); 
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
    // $ANTLR end "rule__VarDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Interval__Group__0"
    // InternalCPHLCL.g:1594:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1598:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalCPHLCL.g:1599:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Interval__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interval__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1606:1: rule__Interval__Group__0__Impl : ( ( rule__Interval__StartAssignment_0 ) ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1610:1: ( ( ( rule__Interval__StartAssignment_0 ) ) )
            // InternalCPHLCL.g:1611:1: ( ( rule__Interval__StartAssignment_0 ) )
            {
            // InternalCPHLCL.g:1611:1: ( ( rule__Interval__StartAssignment_0 ) )
            // InternalCPHLCL.g:1612:2: ( rule__Interval__StartAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getStartAssignment_0()); 
            }
            // InternalCPHLCL.g:1613:2: ( rule__Interval__StartAssignment_0 )
            // InternalCPHLCL.g:1613:3: rule__Interval__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Interval__StartAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getStartAssignment_0()); 
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
    // $ANTLR end "rule__Interval__Group__0__Impl"


    // $ANTLR start "rule__Interval__Group__1"
    // InternalCPHLCL.g:1621:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1625:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalCPHLCL.g:1626:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Interval__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interval__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1633:1: rule__Interval__Group__1__Impl : ( '..' ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1637:1: ( ( '..' ) )
            // InternalCPHLCL.g:1638:1: ( '..' )
            {
            // InternalCPHLCL.g:1638:1: ( '..' )
            // InternalCPHLCL.g:1639:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1()); 
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
    // $ANTLR end "rule__Interval__Group__1__Impl"


    // $ANTLR start "rule__Interval__Group__2"
    // InternalCPHLCL.g:1648:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1652:1: ( rule__Interval__Group__2__Impl )
            // InternalCPHLCL.g:1653:2: rule__Interval__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1659:1: rule__Interval__Group__2__Impl : ( ( rule__Interval__EndAssignment_2 ) ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1663:1: ( ( ( rule__Interval__EndAssignment_2 ) ) )
            // InternalCPHLCL.g:1664:1: ( ( rule__Interval__EndAssignment_2 ) )
            {
            // InternalCPHLCL.g:1664:1: ( ( rule__Interval__EndAssignment_2 ) )
            // InternalCPHLCL.g:1665:2: ( rule__Interval__EndAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getEndAssignment_2()); 
            }
            // InternalCPHLCL.g:1666:2: ( rule__Interval__EndAssignment_2 )
            // InternalCPHLCL.g:1666:3: rule__Interval__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Interval__EndAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getEndAssignment_2()); 
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
    // $ANTLR end "rule__Interval__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalCPHLCL.g:1675:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1679:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalCPHLCL.g:1680:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1687:1: rule__Enumeration__Group__0__Impl : ( '[' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1691:1: ( ( '[' ) )
            // InternalCPHLCL.g:1692:1: ( '[' )
            {
            // InternalCPHLCL.g:1692:1: ( '[' )
            // InternalCPHLCL.g:1693:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalCPHLCL.g:1702:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1706:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalCPHLCL.g:1707:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1714:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__ListAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1718:1: ( ( ( rule__Enumeration__ListAssignment_1 ) ) )
            // InternalCPHLCL.g:1719:1: ( ( rule__Enumeration__ListAssignment_1 ) )
            {
            // InternalCPHLCL.g:1719:1: ( ( rule__Enumeration__ListAssignment_1 ) )
            // InternalCPHLCL.g:1720:2: ( rule__Enumeration__ListAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getListAssignment_1()); 
            }
            // InternalCPHLCL.g:1721:2: ( rule__Enumeration__ListAssignment_1 )
            // InternalCPHLCL.g:1721:3: rule__Enumeration__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ListAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getListAssignment_1()); 
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
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalCPHLCL.g:1729:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1733:1: ( rule__Enumeration__Group__2__Impl )
            // InternalCPHLCL.g:1734:2: rule__Enumeration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1740:1: rule__Enumeration__Group__2__Impl : ( ']' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1744:1: ( ( ']' ) )
            // InternalCPHLCL.g:1745:1: ( ']' )
            {
            // InternalCPHLCL.g:1745:1: ( ']' )
            // InternalCPHLCL.g:1746:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_2()); 
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
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalCPHLCL.g:1756:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1760:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalCPHLCL.g:1761:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Constraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1768:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1772:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalCPHLCL.g:1773:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalCPHLCL.g:1773:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalCPHLCL.g:1774:2: ( rule__Constraint__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            }
            // InternalCPHLCL.g:1775:2: ( rule__Constraint__NameAssignment_0 )
            // InternalCPHLCL.g:1775:3: rule__Constraint__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalCPHLCL.g:1783:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1787:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalCPHLCL.g:1788:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Constraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1795:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1799:1: ( ( ':' ) )
            // InternalCPHLCL.g:1800:1: ( ':' )
            {
            // InternalCPHLCL.g:1800:1: ( ':' )
            // InternalCPHLCL.g:1801:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getColonKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalCPHLCL.g:1810:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1814:1: ( rule__Constraint__Group__2__Impl )
            // InternalCPHLCL.g:1815:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:1821:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1825:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalCPHLCL.g:1826:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalCPHLCL.g:1826:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalCPHLCL.g:1827:2: ( rule__Constraint__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            }
            // InternalCPHLCL.g:1828:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalCPHLCL.g:1828:3: rule__Constraint__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ExpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
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
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__BoolTerm__Group_0__0"
    // InternalCPHLCL.g:1837:1: rule__BoolTerm__Group_0__0 : rule__BoolTerm__Group_0__0__Impl rule__BoolTerm__Group_0__1 ;
    public final void rule__BoolTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1841:1: ( rule__BoolTerm__Group_0__0__Impl rule__BoolTerm__Group_0__1 )
            // InternalCPHLCL.g:1842:2: rule__BoolTerm__Group_0__0__Impl rule__BoolTerm__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__BoolTerm__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoolTerm__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolTerm__Group_0__0"


    // $ANTLR start "rule__BoolTerm__Group_0__0__Impl"
    // InternalCPHLCL.g:1849:1: rule__BoolTerm__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BoolTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1853:1: ( ( '(' ) )
            // InternalCPHLCL.g:1854:1: ( '(' )
            {
            // InternalCPHLCL.g:1854:1: ( '(' )
            // InternalCPHLCL.g:1855:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolTermAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolTermAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__BoolTerm__Group_0__0__Impl"


    // $ANTLR start "rule__BoolTerm__Group_0__1"
    // InternalCPHLCL.g:1864:1: rule__BoolTerm__Group_0__1 : rule__BoolTerm__Group_0__1__Impl rule__BoolTerm__Group_0__2 ;
    public final void rule__BoolTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1868:1: ( rule__BoolTerm__Group_0__1__Impl rule__BoolTerm__Group_0__2 )
            // InternalCPHLCL.g:1869:2: rule__BoolTerm__Group_0__1__Impl rule__BoolTerm__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__BoolTerm__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoolTerm__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolTerm__Group_0__1"


    // $ANTLR start "rule__BoolTerm__Group_0__1__Impl"
    // InternalCPHLCL.g:1876:1: rule__BoolTerm__Group_0__1__Impl : ( ruleComplexTerm ) ;
    public final void rule__BoolTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1880:1: ( ( ruleComplexTerm ) )
            // InternalCPHLCL.g:1881:1: ( ruleComplexTerm )
            {
            // InternalCPHLCL.g:1881:1: ( ruleComplexTerm )
            // InternalCPHLCL.g:1882:2: ruleComplexTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolTermAccess().getComplexTermParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleComplexTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolTermAccess().getComplexTermParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__BoolTerm__Group_0__1__Impl"


    // $ANTLR start "rule__BoolTerm__Group_0__2"
    // InternalCPHLCL.g:1891:1: rule__BoolTerm__Group_0__2 : rule__BoolTerm__Group_0__2__Impl ;
    public final void rule__BoolTerm__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1895:1: ( rule__BoolTerm__Group_0__2__Impl )
            // InternalCPHLCL.g:1896:2: rule__BoolTerm__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolTerm__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolTerm__Group_0__2"


    // $ANTLR start "rule__BoolTerm__Group_0__2__Impl"
    // InternalCPHLCL.g:1902:1: rule__BoolTerm__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BoolTerm__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1906:1: ( ( ')' ) )
            // InternalCPHLCL.g:1907:1: ( ')' )
            {
            // InternalCPHLCL.g:1907:1: ( ')' )
            // InternalCPHLCL.g:1908:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolTermAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolTermAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__BoolTerm__Group_0__2__Impl"


    // $ANTLR start "rule__Logic__Group__0"
    // InternalCPHLCL.g:1918:1: rule__Logic__Group__0 : rule__Logic__Group__0__Impl rule__Logic__Group__1 ;
    public final void rule__Logic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1922:1: ( rule__Logic__Group__0__Impl rule__Logic__Group__1 )
            // InternalCPHLCL.g:1923:2: rule__Logic__Group__0__Impl rule__Logic__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Logic__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Logic__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Group__0"


    // $ANTLR start "rule__Logic__Group__0__Impl"
    // InternalCPHLCL.g:1930:1: rule__Logic__Group__0__Impl : ( ( rule__Logic__LogicLeftAssignment_0 ) ) ;
    public final void rule__Logic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1934:1: ( ( ( rule__Logic__LogicLeftAssignment_0 ) ) )
            // InternalCPHLCL.g:1935:1: ( ( rule__Logic__LogicLeftAssignment_0 ) )
            {
            // InternalCPHLCL.g:1935:1: ( ( rule__Logic__LogicLeftAssignment_0 ) )
            // InternalCPHLCL.g:1936:2: ( rule__Logic__LogicLeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicAccess().getLogicLeftAssignment_0()); 
            }
            // InternalCPHLCL.g:1937:2: ( rule__Logic__LogicLeftAssignment_0 )
            // InternalCPHLCL.g:1937:3: rule__Logic__LogicLeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Logic__LogicLeftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicAccess().getLogicLeftAssignment_0()); 
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
    // $ANTLR end "rule__Logic__Group__0__Impl"


    // $ANTLR start "rule__Logic__Group__1"
    // InternalCPHLCL.g:1945:1: rule__Logic__Group__1 : rule__Logic__Group__1__Impl rule__Logic__Group__2 ;
    public final void rule__Logic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1949:1: ( rule__Logic__Group__1__Impl rule__Logic__Group__2 )
            // InternalCPHLCL.g:1950:2: rule__Logic__Group__1__Impl rule__Logic__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Logic__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Logic__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Group__1"


    // $ANTLR start "rule__Logic__Group__1__Impl"
    // InternalCPHLCL.g:1957:1: rule__Logic__Group__1__Impl : ( ( rule__Logic__LogicOpAssignment_1 ) ) ;
    public final void rule__Logic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1961:1: ( ( ( rule__Logic__LogicOpAssignment_1 ) ) )
            // InternalCPHLCL.g:1962:1: ( ( rule__Logic__LogicOpAssignment_1 ) )
            {
            // InternalCPHLCL.g:1962:1: ( ( rule__Logic__LogicOpAssignment_1 ) )
            // InternalCPHLCL.g:1963:2: ( rule__Logic__LogicOpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicAccess().getLogicOpAssignment_1()); 
            }
            // InternalCPHLCL.g:1964:2: ( rule__Logic__LogicOpAssignment_1 )
            // InternalCPHLCL.g:1964:3: rule__Logic__LogicOpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Logic__LogicOpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicAccess().getLogicOpAssignment_1()); 
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
    // $ANTLR end "rule__Logic__Group__1__Impl"


    // $ANTLR start "rule__Logic__Group__2"
    // InternalCPHLCL.g:1972:1: rule__Logic__Group__2 : rule__Logic__Group__2__Impl ;
    public final void rule__Logic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1976:1: ( rule__Logic__Group__2__Impl )
            // InternalCPHLCL.g:1977:2: rule__Logic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Logic__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Group__2"


    // $ANTLR start "rule__Logic__Group__2__Impl"
    // InternalCPHLCL.g:1983:1: rule__Logic__Group__2__Impl : ( ( rule__Logic__LogicRightAssignment_2 ) ) ;
    public final void rule__Logic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:1987:1: ( ( ( rule__Logic__LogicRightAssignment_2 ) ) )
            // InternalCPHLCL.g:1988:1: ( ( rule__Logic__LogicRightAssignment_2 ) )
            {
            // InternalCPHLCL.g:1988:1: ( ( rule__Logic__LogicRightAssignment_2 ) )
            // InternalCPHLCL.g:1989:2: ( rule__Logic__LogicRightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicAccess().getLogicRightAssignment_2()); 
            }
            // InternalCPHLCL.g:1990:2: ( rule__Logic__LogicRightAssignment_2 )
            // InternalCPHLCL.g:1990:3: rule__Logic__LogicRightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Logic__LogicRightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicAccess().getLogicRightAssignment_2()); 
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
    // $ANTLR end "rule__Logic__Group__2__Impl"


    // $ANTLR start "rule__LogicUn__Group__0"
    // InternalCPHLCL.g:1999:1: rule__LogicUn__Group__0 : rule__LogicUn__Group__0__Impl rule__LogicUn__Group__1 ;
    public final void rule__LogicUn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2003:1: ( rule__LogicUn__Group__0__Impl rule__LogicUn__Group__1 )
            // InternalCPHLCL.g:2004:2: rule__LogicUn__Group__0__Impl rule__LogicUn__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__LogicUn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicUn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicUn__Group__0"


    // $ANTLR start "rule__LogicUn__Group__0__Impl"
    // InternalCPHLCL.g:2011:1: rule__LogicUn__Group__0__Impl : ( ( rule__LogicUn__LogicOpAssignment_0 ) ) ;
    public final void rule__LogicUn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2015:1: ( ( ( rule__LogicUn__LogicOpAssignment_0 ) ) )
            // InternalCPHLCL.g:2016:1: ( ( rule__LogicUn__LogicOpAssignment_0 ) )
            {
            // InternalCPHLCL.g:2016:1: ( ( rule__LogicUn__LogicOpAssignment_0 ) )
            // InternalCPHLCL.g:2017:2: ( rule__LogicUn__LogicOpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicUnAccess().getLogicOpAssignment_0()); 
            }
            // InternalCPHLCL.g:2018:2: ( rule__LogicUn__LogicOpAssignment_0 )
            // InternalCPHLCL.g:2018:3: rule__LogicUn__LogicOpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LogicUn__LogicOpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicUnAccess().getLogicOpAssignment_0()); 
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
    // $ANTLR end "rule__LogicUn__Group__0__Impl"


    // $ANTLR start "rule__LogicUn__Group__1"
    // InternalCPHLCL.g:2026:1: rule__LogicUn__Group__1 : rule__LogicUn__Group__1__Impl rule__LogicUn__Group__2 ;
    public final void rule__LogicUn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2030:1: ( rule__LogicUn__Group__1__Impl rule__LogicUn__Group__2 )
            // InternalCPHLCL.g:2031:2: rule__LogicUn__Group__1__Impl rule__LogicUn__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__LogicUn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicUn__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicUn__Group__1"


    // $ANTLR start "rule__LogicUn__Group__1__Impl"
    // InternalCPHLCL.g:2038:1: rule__LogicUn__Group__1__Impl : ( '(' ) ;
    public final void rule__LogicUn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2042:1: ( ( '(' ) )
            // InternalCPHLCL.g:2043:1: ( '(' )
            {
            // InternalCPHLCL.g:2043:1: ( '(' )
            // InternalCPHLCL.g:2044:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicUnAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicUnAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__LogicUn__Group__1__Impl"


    // $ANTLR start "rule__LogicUn__Group__2"
    // InternalCPHLCL.g:2053:1: rule__LogicUn__Group__2 : rule__LogicUn__Group__2__Impl rule__LogicUn__Group__3 ;
    public final void rule__LogicUn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2057:1: ( rule__LogicUn__Group__2__Impl rule__LogicUn__Group__3 )
            // InternalCPHLCL.g:2058:2: rule__LogicUn__Group__2__Impl rule__LogicUn__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__LogicUn__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicUn__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicUn__Group__2"


    // $ANTLR start "rule__LogicUn__Group__2__Impl"
    // InternalCPHLCL.g:2065:1: rule__LogicUn__Group__2__Impl : ( ( rule__LogicUn__ExpAssignment_2 ) ) ;
    public final void rule__LogicUn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2069:1: ( ( ( rule__LogicUn__ExpAssignment_2 ) ) )
            // InternalCPHLCL.g:2070:1: ( ( rule__LogicUn__ExpAssignment_2 ) )
            {
            // InternalCPHLCL.g:2070:1: ( ( rule__LogicUn__ExpAssignment_2 ) )
            // InternalCPHLCL.g:2071:2: ( rule__LogicUn__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicUnAccess().getExpAssignment_2()); 
            }
            // InternalCPHLCL.g:2072:2: ( rule__LogicUn__ExpAssignment_2 )
            // InternalCPHLCL.g:2072:3: rule__LogicUn__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicUn__ExpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicUnAccess().getExpAssignment_2()); 
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
    // $ANTLR end "rule__LogicUn__Group__2__Impl"


    // $ANTLR start "rule__LogicUn__Group__3"
    // InternalCPHLCL.g:2080:1: rule__LogicUn__Group__3 : rule__LogicUn__Group__3__Impl ;
    public final void rule__LogicUn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2084:1: ( rule__LogicUn__Group__3__Impl )
            // InternalCPHLCL.g:2085:2: rule__LogicUn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicUn__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicUn__Group__3"


    // $ANTLR start "rule__LogicUn__Group__3__Impl"
    // InternalCPHLCL.g:2091:1: rule__LogicUn__Group__3__Impl : ( ')' ) ;
    public final void rule__LogicUn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2095:1: ( ( ')' ) )
            // InternalCPHLCL.g:2096:1: ( ')' )
            {
            // InternalCPHLCL.g:2096:1: ( ')' )
            // InternalCPHLCL.g:2097:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicUnAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicUnAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__LogicUn__Group__3__Impl"


    // $ANTLR start "rule__Relational__Group__0"
    // InternalCPHLCL.g:2107:1: rule__Relational__Group__0 : rule__Relational__Group__0__Impl rule__Relational__Group__1 ;
    public final void rule__Relational__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2111:1: ( rule__Relational__Group__0__Impl rule__Relational__Group__1 )
            // InternalCPHLCL.g:2112:2: rule__Relational__Group__0__Impl rule__Relational__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Relational__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Relational__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group__0"


    // $ANTLR start "rule__Relational__Group__0__Impl"
    // InternalCPHLCL.g:2119:1: rule__Relational__Group__0__Impl : ( ( rule__Relational__RelationalLeftAssignment_0 ) ) ;
    public final void rule__Relational__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2123:1: ( ( ( rule__Relational__RelationalLeftAssignment_0 ) ) )
            // InternalCPHLCL.g:2124:1: ( ( rule__Relational__RelationalLeftAssignment_0 ) )
            {
            // InternalCPHLCL.g:2124:1: ( ( rule__Relational__RelationalLeftAssignment_0 ) )
            // InternalCPHLCL.g:2125:2: ( rule__Relational__RelationalLeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalAccess().getRelationalLeftAssignment_0()); 
            }
            // InternalCPHLCL.g:2126:2: ( rule__Relational__RelationalLeftAssignment_0 )
            // InternalCPHLCL.g:2126:3: rule__Relational__RelationalLeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Relational__RelationalLeftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalAccess().getRelationalLeftAssignment_0()); 
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
    // $ANTLR end "rule__Relational__Group__0__Impl"


    // $ANTLR start "rule__Relational__Group__1"
    // InternalCPHLCL.g:2134:1: rule__Relational__Group__1 : rule__Relational__Group__1__Impl rule__Relational__Group__2 ;
    public final void rule__Relational__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2138:1: ( rule__Relational__Group__1__Impl rule__Relational__Group__2 )
            // InternalCPHLCL.g:2139:2: rule__Relational__Group__1__Impl rule__Relational__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Relational__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Relational__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group__1"


    // $ANTLR start "rule__Relational__Group__1__Impl"
    // InternalCPHLCL.g:2146:1: rule__Relational__Group__1__Impl : ( ( rule__Relational__RelationalOpAssignment_1 ) ) ;
    public final void rule__Relational__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2150:1: ( ( ( rule__Relational__RelationalOpAssignment_1 ) ) )
            // InternalCPHLCL.g:2151:1: ( ( rule__Relational__RelationalOpAssignment_1 ) )
            {
            // InternalCPHLCL.g:2151:1: ( ( rule__Relational__RelationalOpAssignment_1 ) )
            // InternalCPHLCL.g:2152:2: ( rule__Relational__RelationalOpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalAccess().getRelationalOpAssignment_1()); 
            }
            // InternalCPHLCL.g:2153:2: ( rule__Relational__RelationalOpAssignment_1 )
            // InternalCPHLCL.g:2153:3: rule__Relational__RelationalOpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relational__RelationalOpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalAccess().getRelationalOpAssignment_1()); 
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
    // $ANTLR end "rule__Relational__Group__1__Impl"


    // $ANTLR start "rule__Relational__Group__2"
    // InternalCPHLCL.g:2161:1: rule__Relational__Group__2 : rule__Relational__Group__2__Impl ;
    public final void rule__Relational__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2165:1: ( rule__Relational__Group__2__Impl )
            // InternalCPHLCL.g:2166:2: rule__Relational__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group__2"


    // $ANTLR start "rule__Relational__Group__2__Impl"
    // InternalCPHLCL.g:2172:1: rule__Relational__Group__2__Impl : ( ( rule__Relational__RelationalRightAssignment_2 ) ) ;
    public final void rule__Relational__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2176:1: ( ( ( rule__Relational__RelationalRightAssignment_2 ) ) )
            // InternalCPHLCL.g:2177:1: ( ( rule__Relational__RelationalRightAssignment_2 ) )
            {
            // InternalCPHLCL.g:2177:1: ( ( rule__Relational__RelationalRightAssignment_2 ) )
            // InternalCPHLCL.g:2178:2: ( rule__Relational__RelationalRightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalAccess().getRelationalRightAssignment_2()); 
            }
            // InternalCPHLCL.g:2179:2: ( rule__Relational__RelationalRightAssignment_2 )
            // InternalCPHLCL.g:2179:3: rule__Relational__RelationalRightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relational__RelationalRightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalAccess().getRelationalRightAssignment_2()); 
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
    // $ANTLR end "rule__Relational__Group__2__Impl"


    // $ANTLR start "rule__NumericTerm__Group_0__0"
    // InternalCPHLCL.g:2188:1: rule__NumericTerm__Group_0__0 : rule__NumericTerm__Group_0__0__Impl rule__NumericTerm__Group_0__1 ;
    public final void rule__NumericTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2192:1: ( rule__NumericTerm__Group_0__0__Impl rule__NumericTerm__Group_0__1 )
            // InternalCPHLCL.g:2193:2: rule__NumericTerm__Group_0__0__Impl rule__NumericTerm__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__NumericTerm__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NumericTerm__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTerm__Group_0__0"


    // $ANTLR start "rule__NumericTerm__Group_0__0__Impl"
    // InternalCPHLCL.g:2200:1: rule__NumericTerm__Group_0__0__Impl : ( '(' ) ;
    public final void rule__NumericTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2204:1: ( ( '(' ) )
            // InternalCPHLCL.g:2205:1: ( '(' )
            {
            // InternalCPHLCL.g:2205:1: ( '(' )
            // InternalCPHLCL.g:2206:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericTermAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericTermAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__NumericTerm__Group_0__0__Impl"


    // $ANTLR start "rule__NumericTerm__Group_0__1"
    // InternalCPHLCL.g:2215:1: rule__NumericTerm__Group_0__1 : rule__NumericTerm__Group_0__1__Impl rule__NumericTerm__Group_0__2 ;
    public final void rule__NumericTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2219:1: ( rule__NumericTerm__Group_0__1__Impl rule__NumericTerm__Group_0__2 )
            // InternalCPHLCL.g:2220:2: rule__NumericTerm__Group_0__1__Impl rule__NumericTerm__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__NumericTerm__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NumericTerm__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTerm__Group_0__1"


    // $ANTLR start "rule__NumericTerm__Group_0__1__Impl"
    // InternalCPHLCL.g:2227:1: rule__NumericTerm__Group_0__1__Impl : ( ruleArithmetic ) ;
    public final void rule__NumericTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2231:1: ( ( ruleArithmetic ) )
            // InternalCPHLCL.g:2232:1: ( ruleArithmetic )
            {
            // InternalCPHLCL.g:2232:1: ( ruleArithmetic )
            // InternalCPHLCL.g:2233:2: ruleArithmetic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericTermAccess().getArithmeticParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmetic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericTermAccess().getArithmeticParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__NumericTerm__Group_0__1__Impl"


    // $ANTLR start "rule__NumericTerm__Group_0__2"
    // InternalCPHLCL.g:2242:1: rule__NumericTerm__Group_0__2 : rule__NumericTerm__Group_0__2__Impl ;
    public final void rule__NumericTerm__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2246:1: ( rule__NumericTerm__Group_0__2__Impl )
            // InternalCPHLCL.g:2247:2: rule__NumericTerm__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericTerm__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTerm__Group_0__2"


    // $ANTLR start "rule__NumericTerm__Group_0__2__Impl"
    // InternalCPHLCL.g:2253:1: rule__NumericTerm__Group_0__2__Impl : ( ')' ) ;
    public final void rule__NumericTerm__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2257:1: ( ( ')' ) )
            // InternalCPHLCL.g:2258:1: ( ')' )
            {
            // InternalCPHLCL.g:2258:1: ( ')' )
            // InternalCPHLCL.g:2259:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericTermAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericTermAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__NumericTerm__Group_0__2__Impl"


    // $ANTLR start "rule__Arithmetic__Group__0"
    // InternalCPHLCL.g:2269:1: rule__Arithmetic__Group__0 : rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1 ;
    public final void rule__Arithmetic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2273:1: ( rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1 )
            // InternalCPHLCL.g:2274:2: rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Arithmetic__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Group__0"


    // $ANTLR start "rule__Arithmetic__Group__0__Impl"
    // InternalCPHLCL.g:2281:1: rule__Arithmetic__Group__0__Impl : ( ( rule__Arithmetic__LeftAssignment_0 ) ) ;
    public final void rule__Arithmetic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2285:1: ( ( ( rule__Arithmetic__LeftAssignment_0 ) ) )
            // InternalCPHLCL.g:2286:1: ( ( rule__Arithmetic__LeftAssignment_0 ) )
            {
            // InternalCPHLCL.g:2286:1: ( ( rule__Arithmetic__LeftAssignment_0 ) )
            // InternalCPHLCL.g:2287:2: ( rule__Arithmetic__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticAccess().getLeftAssignment_0()); 
            }
            // InternalCPHLCL.g:2288:2: ( rule__Arithmetic__LeftAssignment_0 )
            // InternalCPHLCL.g:2288:3: rule__Arithmetic__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__LeftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticAccess().getLeftAssignment_0()); 
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
    // $ANTLR end "rule__Arithmetic__Group__0__Impl"


    // $ANTLR start "rule__Arithmetic__Group__1"
    // InternalCPHLCL.g:2296:1: rule__Arithmetic__Group__1 : rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2 ;
    public final void rule__Arithmetic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2300:1: ( rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2 )
            // InternalCPHLCL.g:2301:2: rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Arithmetic__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Group__1"


    // $ANTLR start "rule__Arithmetic__Group__1__Impl"
    // InternalCPHLCL.g:2308:1: rule__Arithmetic__Group__1__Impl : ( ( rule__Arithmetic__ArithOperatorAssignment_1 ) ) ;
    public final void rule__Arithmetic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2312:1: ( ( ( rule__Arithmetic__ArithOperatorAssignment_1 ) ) )
            // InternalCPHLCL.g:2313:1: ( ( rule__Arithmetic__ArithOperatorAssignment_1 ) )
            {
            // InternalCPHLCL.g:2313:1: ( ( rule__Arithmetic__ArithOperatorAssignment_1 ) )
            // InternalCPHLCL.g:2314:2: ( rule__Arithmetic__ArithOperatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticAccess().getArithOperatorAssignment_1()); 
            }
            // InternalCPHLCL.g:2315:2: ( rule__Arithmetic__ArithOperatorAssignment_1 )
            // InternalCPHLCL.g:2315:3: rule__Arithmetic__ArithOperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__ArithOperatorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticAccess().getArithOperatorAssignment_1()); 
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
    // $ANTLR end "rule__Arithmetic__Group__1__Impl"


    // $ANTLR start "rule__Arithmetic__Group__2"
    // InternalCPHLCL.g:2323:1: rule__Arithmetic__Group__2 : rule__Arithmetic__Group__2__Impl ;
    public final void rule__Arithmetic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2327:1: ( rule__Arithmetic__Group__2__Impl )
            // InternalCPHLCL.g:2328:2: rule__Arithmetic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Group__2"


    // $ANTLR start "rule__Arithmetic__Group__2__Impl"
    // InternalCPHLCL.g:2334:1: rule__Arithmetic__Group__2__Impl : ( ( rule__Arithmetic__RightAssignment_2 ) ) ;
    public final void rule__Arithmetic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2338:1: ( ( ( rule__Arithmetic__RightAssignment_2 ) ) )
            // InternalCPHLCL.g:2339:1: ( ( rule__Arithmetic__RightAssignment_2 ) )
            {
            // InternalCPHLCL.g:2339:1: ( ( rule__Arithmetic__RightAssignment_2 ) )
            // InternalCPHLCL.g:2340:2: ( rule__Arithmetic__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticAccess().getRightAssignment_2()); 
            }
            // InternalCPHLCL.g:2341:2: ( rule__Arithmetic__RightAssignment_2 )
            // InternalCPHLCL.g:2341:3: rule__Arithmetic__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__RightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticAccess().getRightAssignment_2()); 
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
    // $ANTLR end "rule__Arithmetic__Group__2__Impl"


    // $ANTLR start "rule__Global__Group__0"
    // InternalCPHLCL.g:2350:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2354:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalCPHLCL.g:2355:2: rule__Global__Group__0__Impl rule__Global__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Global__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Global__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:2362:1: rule__Global__Group__0__Impl : ( ( rule__Global__OpAssignment_0 ) ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2366:1: ( ( ( rule__Global__OpAssignment_0 ) ) )
            // InternalCPHLCL.g:2367:1: ( ( rule__Global__OpAssignment_0 ) )
            {
            // InternalCPHLCL.g:2367:1: ( ( rule__Global__OpAssignment_0 ) )
            // InternalCPHLCL.g:2368:2: ( rule__Global__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalAccess().getOpAssignment_0()); 
            }
            // InternalCPHLCL.g:2369:2: ( rule__Global__OpAssignment_0 )
            // InternalCPHLCL.g:2369:3: rule__Global__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Global__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalAccess().getOpAssignment_0()); 
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
    // $ANTLR end "rule__Global__Group__0__Impl"


    // $ANTLR start "rule__Global__Group__1"
    // InternalCPHLCL.g:2377:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2381:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalCPHLCL.g:2382:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Global__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Global__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:2389:1: rule__Global__Group__1__Impl : ( '(' ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2393:1: ( ( '(' ) )
            // InternalCPHLCL.g:2394:1: ( '(' )
            {
            // InternalCPHLCL.g:2394:1: ( '(' )
            // InternalCPHLCL.g:2395:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__Global__Group__1__Impl"


    // $ANTLR start "rule__Global__Group__2"
    // InternalCPHLCL.g:2404:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2408:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalCPHLCL.g:2409:2: rule__Global__Group__2__Impl rule__Global__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Global__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Global__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:2416:1: rule__Global__Group__2__Impl : ( ( rule__Global__VarsAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2420:1: ( ( ( rule__Global__VarsAssignment_2 ) ) )
            // InternalCPHLCL.g:2421:1: ( ( rule__Global__VarsAssignment_2 ) )
            {
            // InternalCPHLCL.g:2421:1: ( ( rule__Global__VarsAssignment_2 ) )
            // InternalCPHLCL.g:2422:2: ( rule__Global__VarsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalAccess().getVarsAssignment_2()); 
            }
            // InternalCPHLCL.g:2423:2: ( rule__Global__VarsAssignment_2 )
            // InternalCPHLCL.g:2423:3: rule__Global__VarsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Global__VarsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalAccess().getVarsAssignment_2()); 
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
    // $ANTLR end "rule__Global__Group__2__Impl"


    // $ANTLR start "rule__Global__Group__3"
    // InternalCPHLCL.g:2431:1: rule__Global__Group__3 : rule__Global__Group__3__Impl ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2435:1: ( rule__Global__Group__3__Impl )
            // InternalCPHLCL.g:2436:2: rule__Global__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:2442:1: rule__Global__Group__3__Impl : ( ')' ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2446:1: ( ( ')' ) )
            // InternalCPHLCL.g:2447:1: ( ')' )
            {
            // InternalCPHLCL.g:2447:1: ( ')' )
            // InternalCPHLCL.g:2448:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Global__Group__3__Impl"


    // $ANTLR start "rule__Control__Group__0"
    // InternalCPHLCL.g:2458:1: rule__Control__Group__0 : rule__Control__Group__0__Impl rule__Control__Group__1 ;
    public final void rule__Control__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2462:1: ( rule__Control__Group__0__Impl rule__Control__Group__1 )
            // InternalCPHLCL.g:2463:2: rule__Control__Group__0__Impl rule__Control__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Control__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Control__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control__Group__0"


    // $ANTLR start "rule__Control__Group__0__Impl"
    // InternalCPHLCL.g:2470:1: rule__Control__Group__0__Impl : ( 'if' ) ;
    public final void rule__Control__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2474:1: ( ( 'if' ) )
            // InternalCPHLCL.g:2475:1: ( 'if' )
            {
            // InternalCPHLCL.g:2475:1: ( 'if' )
            // InternalCPHLCL.g:2476:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getIfKeyword_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__Control__Group__0__Impl"


    // $ANTLR start "rule__Control__Group__1"
    // InternalCPHLCL.g:2485:1: rule__Control__Group__1 : rule__Control__Group__1__Impl rule__Control__Group__2 ;
    public final void rule__Control__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2489:1: ( rule__Control__Group__1__Impl rule__Control__Group__2 )
            // InternalCPHLCL.g:2490:2: rule__Control__Group__1__Impl rule__Control__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Control__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Control__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control__Group__1"


    // $ANTLR start "rule__Control__Group__1__Impl"
    // InternalCPHLCL.g:2497:1: rule__Control__Group__1__Impl : ( '(' ) ;
    public final void rule__Control__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2501:1: ( ( '(' ) )
            // InternalCPHLCL.g:2502:1: ( '(' )
            {
            // InternalCPHLCL.g:2502:1: ( '(' )
            // InternalCPHLCL.g:2503:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__Control__Group__1__Impl"


    // $ANTLR start "rule__Control__Group__2"
    // InternalCPHLCL.g:2512:1: rule__Control__Group__2 : rule__Control__Group__2__Impl rule__Control__Group__3 ;
    public final void rule__Control__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2516:1: ( rule__Control__Group__2__Impl rule__Control__Group__3 )
            // InternalCPHLCL.g:2517:2: rule__Control__Group__2__Impl rule__Control__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Control__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Control__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control__Group__2"


    // $ANTLR start "rule__Control__Group__2__Impl"
    // InternalCPHLCL.g:2524:1: rule__Control__Group__2__Impl : ( ( rule__Control__CondAssignment_2 ) ) ;
    public final void rule__Control__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2528:1: ( ( ( rule__Control__CondAssignment_2 ) ) )
            // InternalCPHLCL.g:2529:1: ( ( rule__Control__CondAssignment_2 ) )
            {
            // InternalCPHLCL.g:2529:1: ( ( rule__Control__CondAssignment_2 ) )
            // InternalCPHLCL.g:2530:2: ( rule__Control__CondAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getCondAssignment_2()); 
            }
            // InternalCPHLCL.g:2531:2: ( rule__Control__CondAssignment_2 )
            // InternalCPHLCL.g:2531:3: rule__Control__CondAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Control__CondAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getCondAssignment_2()); 
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
    // $ANTLR end "rule__Control__Group__2__Impl"


    // $ANTLR start "rule__Control__Group__3"
    // InternalCPHLCL.g:2539:1: rule__Control__Group__3 : rule__Control__Group__3__Impl rule__Control__Group__4 ;
    public final void rule__Control__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2543:1: ( rule__Control__Group__3__Impl rule__Control__Group__4 )
            // InternalCPHLCL.g:2544:2: rule__Control__Group__3__Impl rule__Control__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Control__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Control__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control__Group__3"


    // $ANTLR start "rule__Control__Group__3__Impl"
    // InternalCPHLCL.g:2551:1: rule__Control__Group__3__Impl : ( ')' ) ;
    public final void rule__Control__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2555:1: ( ( ')' ) )
            // InternalCPHLCL.g:2556:1: ( ')' )
            {
            // InternalCPHLCL.g:2556:1: ( ')' )
            // InternalCPHLCL.g:2557:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Control__Group__3__Impl"


    // $ANTLR start "rule__Control__Group__4"
    // InternalCPHLCL.g:2566:1: rule__Control__Group__4 : rule__Control__Group__4__Impl rule__Control__Group__5 ;
    public final void rule__Control__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2570:1: ( rule__Control__Group__4__Impl rule__Control__Group__5 )
            // InternalCPHLCL.g:2571:2: rule__Control__Group__4__Impl rule__Control__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Control__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Control__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control__Group__4"


    // $ANTLR start "rule__Control__Group__4__Impl"
    // InternalCPHLCL.g:2578:1: rule__Control__Group__4__Impl : ( 'then' ) ;
    public final void rule__Control__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2582:1: ( ( 'then' ) )
            // InternalCPHLCL.g:2583:1: ( 'then' )
            {
            // InternalCPHLCL.g:2583:1: ( 'then' )
            // InternalCPHLCL.g:2584:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getThenKeyword_4()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getThenKeyword_4()); 
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
    // $ANTLR end "rule__Control__Group__4__Impl"


    // $ANTLR start "rule__Control__Group__5"
    // InternalCPHLCL.g:2593:1: rule__Control__Group__5 : rule__Control__Group__5__Impl rule__Control__Group__6 ;
    public final void rule__Control__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2597:1: ( rule__Control__Group__5__Impl rule__Control__Group__6 )
            // InternalCPHLCL.g:2598:2: rule__Control__Group__5__Impl rule__Control__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Control__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Control__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control__Group__5"


    // $ANTLR start "rule__Control__Group__5__Impl"
    // InternalCPHLCL.g:2605:1: rule__Control__Group__5__Impl : ( ( rule__Control__TrueStatementAssignment_5 ) ) ;
    public final void rule__Control__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2609:1: ( ( ( rule__Control__TrueStatementAssignment_5 ) ) )
            // InternalCPHLCL.g:2610:1: ( ( rule__Control__TrueStatementAssignment_5 ) )
            {
            // InternalCPHLCL.g:2610:1: ( ( rule__Control__TrueStatementAssignment_5 ) )
            // InternalCPHLCL.g:2611:2: ( rule__Control__TrueStatementAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getTrueStatementAssignment_5()); 
            }
            // InternalCPHLCL.g:2612:2: ( rule__Control__TrueStatementAssignment_5 )
            // InternalCPHLCL.g:2612:3: rule__Control__TrueStatementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Control__TrueStatementAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getTrueStatementAssignment_5()); 
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
    // $ANTLR end "rule__Control__Group__5__Impl"


    // $ANTLR start "rule__Control__Group__6"
    // InternalCPHLCL.g:2620:1: rule__Control__Group__6 : rule__Control__Group__6__Impl rule__Control__Group__7 ;
    public final void rule__Control__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2624:1: ( rule__Control__Group__6__Impl rule__Control__Group__7 )
            // InternalCPHLCL.g:2625:2: rule__Control__Group__6__Impl rule__Control__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Control__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Control__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control__Group__6"


    // $ANTLR start "rule__Control__Group__6__Impl"
    // InternalCPHLCL.g:2632:1: rule__Control__Group__6__Impl : ( 'else' ) ;
    public final void rule__Control__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2636:1: ( ( 'else' ) )
            // InternalCPHLCL.g:2637:1: ( 'else' )
            {
            // InternalCPHLCL.g:2637:1: ( 'else' )
            // InternalCPHLCL.g:2638:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getElseKeyword_6()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getElseKeyword_6()); 
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
    // $ANTLR end "rule__Control__Group__6__Impl"


    // $ANTLR start "rule__Control__Group__7"
    // InternalCPHLCL.g:2647:1: rule__Control__Group__7 : rule__Control__Group__7__Impl rule__Control__Group__8 ;
    public final void rule__Control__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2651:1: ( rule__Control__Group__7__Impl rule__Control__Group__8 )
            // InternalCPHLCL.g:2652:2: rule__Control__Group__7__Impl rule__Control__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Control__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Control__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control__Group__7"


    // $ANTLR start "rule__Control__Group__7__Impl"
    // InternalCPHLCL.g:2659:1: rule__Control__Group__7__Impl : ( ( rule__Control__ElseStatementAssignment_7 ) ) ;
    public final void rule__Control__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2663:1: ( ( ( rule__Control__ElseStatementAssignment_7 ) ) )
            // InternalCPHLCL.g:2664:1: ( ( rule__Control__ElseStatementAssignment_7 ) )
            {
            // InternalCPHLCL.g:2664:1: ( ( rule__Control__ElseStatementAssignment_7 ) )
            // InternalCPHLCL.g:2665:2: ( rule__Control__ElseStatementAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getElseStatementAssignment_7()); 
            }
            // InternalCPHLCL.g:2666:2: ( rule__Control__ElseStatementAssignment_7 )
            // InternalCPHLCL.g:2666:3: rule__Control__ElseStatementAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Control__ElseStatementAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getElseStatementAssignment_7()); 
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
    // $ANTLR end "rule__Control__Group__7__Impl"


    // $ANTLR start "rule__Control__Group__8"
    // InternalCPHLCL.g:2674:1: rule__Control__Group__8 : rule__Control__Group__8__Impl ;
    public final void rule__Control__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2678:1: ( rule__Control__Group__8__Impl )
            // InternalCPHLCL.g:2679:2: rule__Control__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Control__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control__Group__8"


    // $ANTLR start "rule__Control__Group__8__Impl"
    // InternalCPHLCL.g:2685:1: rule__Control__Group__8__Impl : ( 'end_if' ) ;
    public final void rule__Control__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2689:1: ( ( 'end_if' ) )
            // InternalCPHLCL.g:2690:1: ( 'end_if' )
            {
            // InternalCPHLCL.g:2690:1: ( 'end_if' )
            // InternalCPHLCL.g:2691:2: 'end_if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getEnd_ifKeyword_8()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getEnd_ifKeyword_8()); 
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
    // $ANTLR end "rule__Control__Group__8__Impl"


    // $ANTLR start "rule__ListOfValues__Group__0"
    // InternalCPHLCL.g:2701:1: rule__ListOfValues__Group__0 : rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 ;
    public final void rule__ListOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2705:1: ( rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 )
            // InternalCPHLCL.g:2706:2: rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ListOfValues__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:2713:1: rule__ListOfValues__Group__0__Impl : ( ( rule__ListOfValues__ValuesAssignment_0 ) ) ;
    public final void rule__ListOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2717:1: ( ( ( rule__ListOfValues__ValuesAssignment_0 ) ) )
            // InternalCPHLCL.g:2718:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            {
            // InternalCPHLCL.g:2718:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            // InternalCPHLCL.g:2719:2: ( rule__ListOfValues__ValuesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfValuesAccess().getValuesAssignment_0()); 
            }
            // InternalCPHLCL.g:2720:2: ( rule__ListOfValues__ValuesAssignment_0 )
            // InternalCPHLCL.g:2720:3: rule__ListOfValues__ValuesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__ValuesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfValuesAccess().getValuesAssignment_0()); 
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
    // $ANTLR end "rule__ListOfValues__Group__0__Impl"


    // $ANTLR start "rule__ListOfValues__Group__1"
    // InternalCPHLCL.g:2728:1: rule__ListOfValues__Group__1 : rule__ListOfValues__Group__1__Impl ;
    public final void rule__ListOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2732:1: ( rule__ListOfValues__Group__1__Impl )
            // InternalCPHLCL.g:2733:2: rule__ListOfValues__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:2739:1: rule__ListOfValues__Group__1__Impl : ( ( rule__ListOfValues__Group_1__0 )* ) ;
    public final void rule__ListOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2743:1: ( ( ( rule__ListOfValues__Group_1__0 )* ) )
            // InternalCPHLCL.g:2744:1: ( ( rule__ListOfValues__Group_1__0 )* )
            {
            // InternalCPHLCL.g:2744:1: ( ( rule__ListOfValues__Group_1__0 )* )
            // InternalCPHLCL.g:2745:2: ( rule__ListOfValues__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            }
            // InternalCPHLCL.g:2746:2: ( rule__ListOfValues__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==54) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCPHLCL.g:2746:3: rule__ListOfValues__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ListOfValues__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfValuesAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ListOfValues__Group__1__Impl"


    // $ANTLR start "rule__ListOfValues__Group_1__0"
    // InternalCPHLCL.g:2755:1: rule__ListOfValues__Group_1__0 : rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 ;
    public final void rule__ListOfValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2759:1: ( rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 )
            // InternalCPHLCL.g:2760:2: rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ListOfValues__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:2767:1: rule__ListOfValues__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2771:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalCPHLCL.g:2772:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalCPHLCL.g:2772:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalCPHLCL.g:2773:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalCPHLCL.g:2773:2: ( ( ',' ) )
            // InternalCPHLCL.g:2774:3: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            }
            // InternalCPHLCL.g:2775:3: ( ',' )
            // InternalCPHLCL.g:2775:4: ','
            {
            match(input,54,FOLLOW_31); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            }

            }

            // InternalCPHLCL.g:2778:2: ( ( ',' )* )
            // InternalCPHLCL.g:2779:3: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            }
            // InternalCPHLCL.g:2780:3: ( ',' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==54) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCPHLCL.g:2780:4: ','
            	    {
            	    match(input,54,FOLLOW_31); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            }

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
    // InternalCPHLCL.g:2789:1: rule__ListOfValues__Group_1__1 : rule__ListOfValues__Group_1__1__Impl ;
    public final void rule__ListOfValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2793:1: ( rule__ListOfValues__Group_1__1__Impl )
            // InternalCPHLCL.g:2794:2: rule__ListOfValues__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCPHLCL.g:2800:1: rule__ListOfValues__Group_1__1__Impl : ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) ;
    public final void rule__ListOfValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2804:1: ( ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) )
            // InternalCPHLCL.g:2805:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            {
            // InternalCPHLCL.g:2805:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            // InternalCPHLCL.g:2806:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1()); 
            }
            // InternalCPHLCL.g:2807:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            // InternalCPHLCL.g:2807:3: rule__ListOfValues__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfValues__ValuesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1()); 
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
    // $ANTLR end "rule__ListOfValues__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalCPHLCL.g:2816:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2820:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:2821:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:2821:2: ( RULE_ID )
            // InternalCPHLCL.g:2822:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__VarsAssignment_3"
    // InternalCPHLCL.g:2831:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2835:1: ( ( ruleVarDeclaration ) )
            // InternalCPHLCL.g:2836:2: ( ruleVarDeclaration )
            {
            // InternalCPHLCL.g:2836:2: ( ruleVarDeclaration )
            // InternalCPHLCL.g:2837:3: ruleVarDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Model__VarsAssignment_3"


    // $ANTLR start "rule__Model__ConstraintsAssignment_5"
    // InternalCPHLCL.g:2846:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2850:1: ( ( ruleConstraint ) )
            // InternalCPHLCL.g:2851:2: ( ruleConstraint )
            {
            // InternalCPHLCL.g:2851:2: ( ruleConstraint )
            // InternalCPHLCL.g:2852:3: ruleConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Model__ConstraintsAssignment_5"


    // $ANTLR start "rule__Model__StrategyAssignment_7"
    // InternalCPHLCL.g:2861:1: rule__Model__StrategyAssignment_7 : ( ruleStrategy ) ;
    public final void rule__Model__StrategyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2865:1: ( ( ruleStrategy ) )
            // InternalCPHLCL.g:2866:2: ( ruleStrategy )
            {
            // InternalCPHLCL.g:2866:2: ( ruleStrategy )
            // InternalCPHLCL.g:2867:3: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStrategyStrategyParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStrategyStrategyParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Model__StrategyAssignment_7"


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_0"
    // InternalCPHLCL.g:2876:1: rule__VarDeclaration__TypeAssignment_0 : ( ruleVarType ) ;
    public final void rule__VarDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2880:1: ( ( ruleVarType ) )
            // InternalCPHLCL.g:2881:2: ( ruleVarType )
            {
            // InternalCPHLCL.g:2881:2: ( ruleVarType )
            // InternalCPHLCL.g:2882:3: ruleVarType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VarDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__VarDeclaration__NameAssignment_1"
    // InternalCPHLCL.g:2891:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2895:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:2896:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:2896:2: ( RULE_ID )
            // InternalCPHLCL.g:2897:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__VarDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VarDeclaration__DomainAssignment_3"
    // InternalCPHLCL.g:2906:1: rule__VarDeclaration__DomainAssignment_3 : ( ruleDomainDeclaration ) ;
    public final void rule__VarDeclaration__DomainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2910:1: ( ( ruleDomainDeclaration ) )
            // InternalCPHLCL.g:2911:2: ( ruleDomainDeclaration )
            {
            // InternalCPHLCL.g:2911:2: ( ruleDomainDeclaration )
            // InternalCPHLCL.g:2912:3: ruleDomainDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getDomainDomainDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDomainDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getDomainDomainDeclarationParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__VarDeclaration__DomainAssignment_3"


    // $ANTLR start "rule__Interval__StartAssignment_0"
    // InternalCPHLCL.g:2921:1: rule__Interval__StartAssignment_0 : ( ruleEnumerableValue ) ;
    public final void rule__Interval__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2925:1: ( ( ruleEnumerableValue ) )
            // InternalCPHLCL.g:2926:2: ( ruleEnumerableValue )
            {
            // InternalCPHLCL.g:2926:2: ( ruleEnumerableValue )
            // InternalCPHLCL.g:2927:3: ruleEnumerableValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getStartEnumerableValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnumerableValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getStartEnumerableValueParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Interval__StartAssignment_0"


    // $ANTLR start "rule__Interval__EndAssignment_2"
    // InternalCPHLCL.g:2936:1: rule__Interval__EndAssignment_2 : ( ruleEnumerableValue ) ;
    public final void rule__Interval__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2940:1: ( ( ruleEnumerableValue ) )
            // InternalCPHLCL.g:2941:2: ( ruleEnumerableValue )
            {
            // InternalCPHLCL.g:2941:2: ( ruleEnumerableValue )
            // InternalCPHLCL.g:2942:3: ruleEnumerableValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getEndEnumerableValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnumerableValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getEndEnumerableValueParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Interval__EndAssignment_2"


    // $ANTLR start "rule__Enumeration__ListAssignment_1"
    // InternalCPHLCL.g:2951:1: rule__Enumeration__ListAssignment_1 : ( ruleListOfValues ) ;
    public final void rule__Enumeration__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2955:1: ( ( ruleListOfValues ) )
            // InternalCPHLCL.g:2956:2: ( ruleListOfValues )
            {
            // InternalCPHLCL.g:2956:2: ( ruleListOfValues )
            // InternalCPHLCL.g:2957:3: ruleListOfValues
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Enumeration__ListAssignment_1"


    // $ANTLR start "rule__Constraint__NameAssignment_0"
    // InternalCPHLCL.g:2966:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2970:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:2971:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:2971:2: ( RULE_ID )
            // InternalCPHLCL.g:2972:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Constraint__NameAssignment_0"


    // $ANTLR start "rule__Constraint__ExpAssignment_2"
    // InternalCPHLCL.g:2981:1: rule__Constraint__ExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:2985:1: ( ( ruleExpression ) )
            // InternalCPHLCL.g:2986:2: ( ruleExpression )
            {
            // InternalCPHLCL.g:2986:2: ( ruleExpression )
            // InternalCPHLCL.g:2987:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getExpExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getExpExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Constraint__ExpAssignment_2"


    // $ANTLR start "rule__Logic__LogicLeftAssignment_0"
    // InternalCPHLCL.g:2996:1: rule__Logic__LogicLeftAssignment_0 : ( ruleBoolTerm ) ;
    public final void rule__Logic__LogicLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3000:1: ( ( ruleBoolTerm ) )
            // InternalCPHLCL.g:3001:2: ( ruleBoolTerm )
            {
            // InternalCPHLCL.g:3001:2: ( ruleBoolTerm )
            // InternalCPHLCL.g:3002:3: ruleBoolTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicAccess().getLogicLeftBoolTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicAccess().getLogicLeftBoolTermParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Logic__LogicLeftAssignment_0"


    // $ANTLR start "rule__Logic__LogicOpAssignment_1"
    // InternalCPHLCL.g:3011:1: rule__Logic__LogicOpAssignment_1 : ( ruleLogicOpBin ) ;
    public final void rule__Logic__LogicOpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3015:1: ( ( ruleLogicOpBin ) )
            // InternalCPHLCL.g:3016:2: ( ruleLogicOpBin )
            {
            // InternalCPHLCL.g:3016:2: ( ruleLogicOpBin )
            // InternalCPHLCL.g:3017:3: ruleLogicOpBin
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicAccess().getLogicOpLogicOpBinParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicOpBin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicAccess().getLogicOpLogicOpBinParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Logic__LogicOpAssignment_1"


    // $ANTLR start "rule__Logic__LogicRightAssignment_2"
    // InternalCPHLCL.g:3026:1: rule__Logic__LogicRightAssignment_2 : ( ruleBoolTerm ) ;
    public final void rule__Logic__LogicRightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3030:1: ( ( ruleBoolTerm ) )
            // InternalCPHLCL.g:3031:2: ( ruleBoolTerm )
            {
            // InternalCPHLCL.g:3031:2: ( ruleBoolTerm )
            // InternalCPHLCL.g:3032:3: ruleBoolTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicAccess().getLogicRightBoolTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicAccess().getLogicRightBoolTermParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Logic__LogicRightAssignment_2"


    // $ANTLR start "rule__LogicUn__LogicOpAssignment_0"
    // InternalCPHLCL.g:3041:1: rule__LogicUn__LogicOpAssignment_0 : ( ruleLogicOpUn ) ;
    public final void rule__LogicUn__LogicOpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3045:1: ( ( ruleLogicOpUn ) )
            // InternalCPHLCL.g:3046:2: ( ruleLogicOpUn )
            {
            // InternalCPHLCL.g:3046:2: ( ruleLogicOpUn )
            // InternalCPHLCL.g:3047:3: ruleLogicOpUn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicUnAccess().getLogicOpLogicOpUnParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicOpUn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicUnAccess().getLogicOpLogicOpUnParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__LogicUn__LogicOpAssignment_0"


    // $ANTLR start "rule__LogicUn__ExpAssignment_2"
    // InternalCPHLCL.g:3056:1: rule__LogicUn__ExpAssignment_2 : ( ruleBoolTerm ) ;
    public final void rule__LogicUn__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3060:1: ( ( ruleBoolTerm ) )
            // InternalCPHLCL.g:3061:2: ( ruleBoolTerm )
            {
            // InternalCPHLCL.g:3061:2: ( ruleBoolTerm )
            // InternalCPHLCL.g:3062:3: ruleBoolTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicUnAccess().getExpBoolTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicUnAccess().getExpBoolTermParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__LogicUn__ExpAssignment_2"


    // $ANTLR start "rule__Relational__RelationalLeftAssignment_0"
    // InternalCPHLCL.g:3071:1: rule__Relational__RelationalLeftAssignment_0 : ( ruleNumericTerm ) ;
    public final void rule__Relational__RelationalLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3075:1: ( ( ruleNumericTerm ) )
            // InternalCPHLCL.g:3076:2: ( ruleNumericTerm )
            {
            // InternalCPHLCL.g:3076:2: ( ruleNumericTerm )
            // InternalCPHLCL.g:3077:3: ruleNumericTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalAccess().getRelationalLeftNumericTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNumericTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalAccess().getRelationalLeftNumericTermParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Relational__RelationalLeftAssignment_0"


    // $ANTLR start "rule__Relational__RelationalOpAssignment_1"
    // InternalCPHLCL.g:3086:1: rule__Relational__RelationalOpAssignment_1 : ( ruleRelationalOp ) ;
    public final void rule__Relational__RelationalOpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3090:1: ( ( ruleRelationalOp ) )
            // InternalCPHLCL.g:3091:2: ( ruleRelationalOp )
            {
            // InternalCPHLCL.g:3091:2: ( ruleRelationalOp )
            // InternalCPHLCL.g:3092:3: ruleRelationalOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalAccess().getRelationalOpRelationalOpParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationalOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalAccess().getRelationalOpRelationalOpParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Relational__RelationalOpAssignment_1"


    // $ANTLR start "rule__Relational__RelationalRightAssignment_2"
    // InternalCPHLCL.g:3101:1: rule__Relational__RelationalRightAssignment_2 : ( ruleNumericTerm ) ;
    public final void rule__Relational__RelationalRightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3105:1: ( ( ruleNumericTerm ) )
            // InternalCPHLCL.g:3106:2: ( ruleNumericTerm )
            {
            // InternalCPHLCL.g:3106:2: ( ruleNumericTerm )
            // InternalCPHLCL.g:3107:3: ruleNumericTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalAccess().getRelationalRightNumericTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNumericTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalAccess().getRelationalRightNumericTermParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Relational__RelationalRightAssignment_2"


    // $ANTLR start "rule__Arithmetic__LeftAssignment_0"
    // InternalCPHLCL.g:3116:1: rule__Arithmetic__LeftAssignment_0 : ( ruleNumericTerm ) ;
    public final void rule__Arithmetic__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3120:1: ( ( ruleNumericTerm ) )
            // InternalCPHLCL.g:3121:2: ( ruleNumericTerm )
            {
            // InternalCPHLCL.g:3121:2: ( ruleNumericTerm )
            // InternalCPHLCL.g:3122:3: ruleNumericTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticAccess().getLeftNumericTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNumericTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticAccess().getLeftNumericTermParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Arithmetic__LeftAssignment_0"


    // $ANTLR start "rule__Arithmetic__ArithOperatorAssignment_1"
    // InternalCPHLCL.g:3131:1: rule__Arithmetic__ArithOperatorAssignment_1 : ( ruleArithmeticOp ) ;
    public final void rule__Arithmetic__ArithOperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3135:1: ( ( ruleArithmeticOp ) )
            // InternalCPHLCL.g:3136:2: ( ruleArithmeticOp )
            {
            // InternalCPHLCL.g:3136:2: ( ruleArithmeticOp )
            // InternalCPHLCL.g:3137:3: ruleArithmeticOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticAccess().getArithOperatorArithmeticOpParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticAccess().getArithOperatorArithmeticOpParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Arithmetic__ArithOperatorAssignment_1"


    // $ANTLR start "rule__Arithmetic__RightAssignment_2"
    // InternalCPHLCL.g:3146:1: rule__Arithmetic__RightAssignment_2 : ( ruleNumericTerm ) ;
    public final void rule__Arithmetic__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3150:1: ( ( ruleNumericTerm ) )
            // InternalCPHLCL.g:3151:2: ( ruleNumericTerm )
            {
            // InternalCPHLCL.g:3151:2: ( ruleNumericTerm )
            // InternalCPHLCL.g:3152:3: ruleNumericTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticAccess().getRightNumericTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNumericTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticAccess().getRightNumericTermParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Arithmetic__RightAssignment_2"


    // $ANTLR start "rule__Global__OpAssignment_0"
    // InternalCPHLCL.g:3161:1: rule__Global__OpAssignment_0 : ( ruleGlobalOp ) ;
    public final void rule__Global__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3165:1: ( ( ruleGlobalOp ) )
            // InternalCPHLCL.g:3166:2: ( ruleGlobalOp )
            {
            // InternalCPHLCL.g:3166:2: ( ruleGlobalOp )
            // InternalCPHLCL.g:3167:3: ruleGlobalOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalAccess().getOpGlobalOpParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGlobalOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalAccess().getOpGlobalOpParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Global__OpAssignment_0"


    // $ANTLR start "rule__Global__VarsAssignment_2"
    // InternalCPHLCL.g:3176:1: rule__Global__VarsAssignment_2 : ( ruleListOfIDs ) ;
    public final void rule__Global__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3180:1: ( ( ruleListOfIDs ) )
            // InternalCPHLCL.g:3181:2: ( ruleListOfIDs )
            {
            // InternalCPHLCL.g:3181:2: ( ruleListOfIDs )
            // InternalCPHLCL.g:3182:3: ruleListOfIDs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalAccess().getVarsListOfIDsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalAccess().getVarsListOfIDsParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Global__VarsAssignment_2"


    // $ANTLR start "rule__Control__CondAssignment_2"
    // InternalCPHLCL.g:3191:1: rule__Control__CondAssignment_2 : ( ruleBoolTerm ) ;
    public final void rule__Control__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3195:1: ( ( ruleBoolTerm ) )
            // InternalCPHLCL.g:3196:2: ( ruleBoolTerm )
            {
            // InternalCPHLCL.g:3196:2: ( ruleBoolTerm )
            // InternalCPHLCL.g:3197:3: ruleBoolTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getCondBoolTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getCondBoolTermParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Control__CondAssignment_2"


    // $ANTLR start "rule__Control__TrueStatementAssignment_5"
    // InternalCPHLCL.g:3206:1: rule__Control__TrueStatementAssignment_5 : ( ruleExpression ) ;
    public final void rule__Control__TrueStatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3210:1: ( ( ruleExpression ) )
            // InternalCPHLCL.g:3211:2: ( ruleExpression )
            {
            // InternalCPHLCL.g:3211:2: ( ruleExpression )
            // InternalCPHLCL.g:3212:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getTrueStatementExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getTrueStatementExpressionParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Control__TrueStatementAssignment_5"


    // $ANTLR start "rule__Control__ElseStatementAssignment_7"
    // InternalCPHLCL.g:3221:1: rule__Control__ElseStatementAssignment_7 : ( ruleExpression ) ;
    public final void rule__Control__ElseStatementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3225:1: ( ( ruleExpression ) )
            // InternalCPHLCL.g:3226:2: ( ruleExpression )
            {
            // InternalCPHLCL.g:3226:2: ( ruleExpression )
            // InternalCPHLCL.g:3227:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlAccess().getElseStatementExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlAccess().getElseStatementExpressionParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Control__ElseStatementAssignment_7"


    // $ANTLR start "rule__BoolVar__IdAssignment"
    // InternalCPHLCL.g:3236:1: rule__BoolVar__IdAssignment : ( RULE_ID ) ;
    public final void rule__BoolVar__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3240:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:3241:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:3241:2: ( RULE_ID )
            // InternalCPHLCL.g:3242:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolVarAccess().getIdIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolVarAccess().getIdIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BoolVar__IdAssignment"


    // $ANTLR start "rule__Number__NumAssignment"
    // InternalCPHLCL.g:3251:1: rule__Number__NumAssignment : ( RULE_INT ) ;
    public final void rule__Number__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3255:1: ( ( RULE_INT ) )
            // InternalCPHLCL.g:3256:2: ( RULE_INT )
            {
            // InternalCPHLCL.g:3256:2: ( RULE_INT )
            // InternalCPHLCL.g:3257:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getNumINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getNumINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Number__NumAssignment"


    // $ANTLR start "rule__IntVar__IdAssignment"
    // InternalCPHLCL.g:3266:1: rule__IntVar__IdAssignment : ( RULE_ID ) ;
    public final void rule__IntVar__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3270:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:3271:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:3271:2: ( RULE_ID )
            // InternalCPHLCL.g:3272:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntVarAccess().getIdIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntVarAccess().getIdIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__IntVar__IdAssignment"


    // $ANTLR start "rule__ListOfValues__ValuesAssignment_0"
    // InternalCPHLCL.g:3281:1: rule__ListOfValues__ValuesAssignment_0 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3285:1: ( ( ruleValue ) )
            // InternalCPHLCL.g:3286:2: ( ruleValue )
            {
            // InternalCPHLCL.g:3286:2: ( ruleValue )
            // InternalCPHLCL.g:3287:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ListOfValues__ValuesAssignment_0"


    // $ANTLR start "rule__ListOfValues__ValuesAssignment_1_1"
    // InternalCPHLCL.g:3296:1: rule__ListOfValues__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3300:1: ( ( ruleValue ) )
            // InternalCPHLCL.g:3301:2: ( ruleValue )
            {
            // InternalCPHLCL.g:3301:2: ( ruleValue )
            // InternalCPHLCL.g:3302:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__ListOfValues__ValuesAssignment_1_1"


    // $ANTLR start "rule__ListOfIDs__IdsAssignment"
    // InternalCPHLCL.g:3311:1: rule__ListOfIDs__IdsAssignment : ( RULE_ID ) ;
    public final void rule__ListOfIDs__IdsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCPHLCL.g:3315:1: ( ( RULE_ID ) )
            // InternalCPHLCL.g:3316:2: ( RULE_ID )
            {
            // InternalCPHLCL.g:3316:2: ( RULE_ID )
            // InternalCPHLCL.g:3317:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ListOfIDs__IdsAssignment"

    // $ANTLR start synpred4_InternalCPHLCL
    public final void synpred4_InternalCPHLCL_fragment() throws RecognitionException {   
        // InternalCPHLCL.g:892:2: ( ( ( ruleLogic ) ) )
        // InternalCPHLCL.g:892:2: ( ( ruleLogic ) )
        {
        // InternalCPHLCL.g:892:2: ( ( ruleLogic ) )
        // InternalCPHLCL.g:893:3: ( ruleLogic )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getLogicParserRuleCall_1()); 
        }
        // InternalCPHLCL.g:894:3: ( ruleLogic )
        // InternalCPHLCL.g:894:4: ruleLogic
        {
        pushFollow(FOLLOW_2);
        ruleLogic();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalCPHLCL

    // $ANTLR start synpred5_InternalCPHLCL
    public final void synpred5_InternalCPHLCL_fragment() throws RecognitionException {   
        // InternalCPHLCL.g:898:2: ( ( ( ruleRelational ) ) )
        // InternalCPHLCL.g:898:2: ( ( ruleRelational ) )
        {
        // InternalCPHLCL.g:898:2: ( ( ruleRelational ) )
        // InternalCPHLCL.g:899:3: ( ruleRelational )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getRelationalParserRuleCall_2()); 
        }
        // InternalCPHLCL.g:900:3: ( ruleRelational )
        // InternalCPHLCL.g:900:4: ruleRelational
        {
        pushFollow(FOLLOW_2);
        ruleRelational();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalCPHLCL

    // $ANTLR start synpred7_InternalCPHLCL
    public final void synpred7_InternalCPHLCL_fragment() throws RecognitionException {   
        // InternalCPHLCL.g:940:2: ( ( ( ruleLogic ) ) )
        // InternalCPHLCL.g:940:2: ( ( ruleLogic ) )
        {
        // InternalCPHLCL.g:940:2: ( ( ruleLogic ) )
        // InternalCPHLCL.g:941:3: ( ruleLogic )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComplexTermAccess().getLogicParserRuleCall_0()); 
        }
        // InternalCPHLCL.g:942:3: ( ruleLogic )
        // InternalCPHLCL.g:942:4: ruleLogic
        {
        pushFollow(FOLLOW_2);
        ruleLogic();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalCPHLCL

    // $ANTLR start synpred8_InternalCPHLCL
    public final void synpred8_InternalCPHLCL_fragment() throws RecognitionException {   
        // InternalCPHLCL.g:946:2: ( ( ( ruleRelational ) ) )
        // InternalCPHLCL.g:946:2: ( ( ruleRelational ) )
        {
        // InternalCPHLCL.g:946:2: ( ( ruleRelational ) )
        // InternalCPHLCL.g:947:3: ( ruleRelational )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComplexTermAccess().getRelationalParserRuleCall_1()); 
        }
        // InternalCPHLCL.g:948:3: ( ruleRelational )
        // InternalCPHLCL.g:948:4: ruleRelational
        {
        pushFollow(FOLLOW_2);
        ruleRelational();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalCPHLCL

    // Delegated rules

    public final boolean synpred8_InternalCPHLCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalCPHLCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCPHLCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCPHLCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCPHLCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCPHLCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalCPHLCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalCPHLCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000C030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0005000018000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000000000830L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000FE0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000002L});

}