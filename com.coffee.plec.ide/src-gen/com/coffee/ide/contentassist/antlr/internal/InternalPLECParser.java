package com.coffee.ide.contentassist.antlr.internal;

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
import com.coffee.services.PLECGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPLECParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'selected'", "'unselected'", "'boolean'", "'integer'", "'symbolic'", "'requires'", "'excludes'", "'optional'", "'mandatory'", "'always'", "'next'", "'eventually'", "'model'", "'variables:'", "'constraints:'", "'['", "','", "']'", "'values:'", "'..'", "':'", "'('", "')'", "'structural:'", "'variants:'", "'card:'", "'attributes:'", "'of'", "'is'", "'in'", "'vars:'", "'root'", "'-->'", "'instantiable'"
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

    	public void setGrammarAccess(PLECGrammarAccess grammarAccess) {
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
    // InternalPLEC.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPLEC.g:54:1: ( ruleModel EOF )
            // InternalPLEC.g:55:1: ruleModel EOF
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
    // InternalPLEC.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalPLEC.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalPLEC.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalPLEC.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalPLEC.g:69:3: ( rule__Model__Group__0 )
            // InternalPLEC.g:69:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalPLEC.g:78:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalPLEC.g:79:1: ( ruleVarDeclaration EOF )
            // InternalPLEC.g:80:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalPLEC.g:87:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:91:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalPLEC.g:92:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalPLEC.g:92:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalPLEC.g:93:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalPLEC.g:94:3: ( rule__VarDeclaration__Group__0 )
            // InternalPLEC.g:94:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariantDeclaration"
    // InternalPLEC.g:103:1: entryRuleVariantDeclaration : ruleVariantDeclaration EOF ;
    public final void entryRuleVariantDeclaration() throws RecognitionException {
        try {
            // InternalPLEC.g:104:1: ( ruleVariantDeclaration EOF )
            // InternalPLEC.g:105:1: ruleVariantDeclaration EOF
            {
             before(grammarAccess.getVariantDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVariantDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariantDeclaration"


    // $ANTLR start "ruleVariantDeclaration"
    // InternalPLEC.g:112:1: ruleVariantDeclaration : ( ( rule__VariantDeclaration__Alternatives ) ) ;
    public final void ruleVariantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:116:2: ( ( ( rule__VariantDeclaration__Alternatives ) ) )
            // InternalPLEC.g:117:2: ( ( rule__VariantDeclaration__Alternatives ) )
            {
            // InternalPLEC.g:117:2: ( ( rule__VariantDeclaration__Alternatives ) )
            // InternalPLEC.g:118:3: ( rule__VariantDeclaration__Alternatives )
            {
             before(grammarAccess.getVariantDeclarationAccess().getAlternatives()); 
            // InternalPLEC.g:119:3: ( rule__VariantDeclaration__Alternatives )
            // InternalPLEC.g:119:4: rule__VariantDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariantDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariantDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariantDeclaration"


    // $ANTLR start "entryRuleVariantsInterval"
    // InternalPLEC.g:128:1: entryRuleVariantsInterval : ruleVariantsInterval EOF ;
    public final void entryRuleVariantsInterval() throws RecognitionException {
        try {
            // InternalPLEC.g:129:1: ( ruleVariantsInterval EOF )
            // InternalPLEC.g:130:1: ruleVariantsInterval EOF
            {
             before(grammarAccess.getVariantsIntervalRule()); 
            pushFollow(FOLLOW_1);
            ruleVariantsInterval();

            state._fsp--;

             after(grammarAccess.getVariantsIntervalRule()); 
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
    // $ANTLR end "entryRuleVariantsInterval"


    // $ANTLR start "ruleVariantsInterval"
    // InternalPLEC.g:137:1: ruleVariantsInterval : ( ( rule__VariantsInterval__Group__0 ) ) ;
    public final void ruleVariantsInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:141:2: ( ( ( rule__VariantsInterval__Group__0 ) ) )
            // InternalPLEC.g:142:2: ( ( rule__VariantsInterval__Group__0 ) )
            {
            // InternalPLEC.g:142:2: ( ( rule__VariantsInterval__Group__0 ) )
            // InternalPLEC.g:143:3: ( rule__VariantsInterval__Group__0 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getGroup()); 
            // InternalPLEC.g:144:3: ( rule__VariantsInterval__Group__0 )
            // InternalPLEC.g:144:4: rule__VariantsInterval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantsIntervalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariantsInterval"


    // $ANTLR start "entryRuleVariantsEnumeration"
    // InternalPLEC.g:153:1: entryRuleVariantsEnumeration : ruleVariantsEnumeration EOF ;
    public final void entryRuleVariantsEnumeration() throws RecognitionException {
        try {
            // InternalPLEC.g:154:1: ( ruleVariantsEnumeration EOF )
            // InternalPLEC.g:155:1: ruleVariantsEnumeration EOF
            {
             before(grammarAccess.getVariantsEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariantsEnumeration();

            state._fsp--;

             after(grammarAccess.getVariantsEnumerationRule()); 
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
    // $ANTLR end "entryRuleVariantsEnumeration"


    // $ANTLR start "ruleVariantsEnumeration"
    // InternalPLEC.g:162:1: ruleVariantsEnumeration : ( ( rule__VariantsEnumeration__Group__0 ) ) ;
    public final void ruleVariantsEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:166:2: ( ( ( rule__VariantsEnumeration__Group__0 ) ) )
            // InternalPLEC.g:167:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            {
            // InternalPLEC.g:167:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            // InternalPLEC.g:168:3: ( rule__VariantsEnumeration__Group__0 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getGroup()); 
            // InternalPLEC.g:169:3: ( rule__VariantsEnumeration__Group__0 )
            // InternalPLEC.g:169:4: rule__VariantsEnumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantsEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariantsEnumeration"


    // $ANTLR start "entryRuleConstraint"
    // InternalPLEC.g:178:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalPLEC.g:179:1: ( ruleConstraint EOF )
            // InternalPLEC.g:180:1: ruleConstraint EOF
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
    // InternalPLEC.g:187:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:191:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalPLEC.g:192:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalPLEC.g:192:2: ( ( rule__Constraint__Group__0 ) )
            // InternalPLEC.g:193:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalPLEC.g:194:3: ( rule__Constraint__Group__0 )
            // InternalPLEC.g:194:4: rule__Constraint__Group__0
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


    // $ANTLR start "entryRuleConsExpression"
    // InternalPLEC.g:203:1: entryRuleConsExpression : ruleConsExpression EOF ;
    public final void entryRuleConsExpression() throws RecognitionException {
        try {
            // InternalPLEC.g:204:1: ( ruleConsExpression EOF )
            // InternalPLEC.g:205:1: ruleConsExpression EOF
            {
             before(grammarAccess.getConsExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleConsExpression();

            state._fsp--;

             after(grammarAccess.getConsExpressionRule()); 
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
    // $ANTLR end "entryRuleConsExpression"


    // $ANTLR start "ruleConsExpression"
    // InternalPLEC.g:212:1: ruleConsExpression : ( ( rule__ConsExpression__Alternatives ) ) ;
    public final void ruleConsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:216:2: ( ( ( rule__ConsExpression__Alternatives ) ) )
            // InternalPLEC.g:217:2: ( ( rule__ConsExpression__Alternatives ) )
            {
            // InternalPLEC.g:217:2: ( ( rule__ConsExpression__Alternatives ) )
            // InternalPLEC.g:218:3: ( rule__ConsExpression__Alternatives )
            {
             before(grammarAccess.getConsExpressionAccess().getAlternatives()); 
            // InternalPLEC.g:219:3: ( rule__ConsExpression__Alternatives )
            // InternalPLEC.g:219:4: rule__ConsExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConsExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConsExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConsExpression"


    // $ANTLR start "entryRuleTerminalExp"
    // InternalPLEC.g:228:1: entryRuleTerminalExp : ruleTerminalExp EOF ;
    public final void entryRuleTerminalExp() throws RecognitionException {
        try {
            // InternalPLEC.g:229:1: ( ruleTerminalExp EOF )
            // InternalPLEC.g:230:1: ruleTerminalExp EOF
            {
             before(grammarAccess.getTerminalExpRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminalExp();

            state._fsp--;

             after(grammarAccess.getTerminalExpRule()); 
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
    // $ANTLR end "entryRuleTerminalExp"


    // $ANTLR start "ruleTerminalExp"
    // InternalPLEC.g:237:1: ruleTerminalExp : ( ( rule__TerminalExp__Alternatives ) ) ;
    public final void ruleTerminalExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:241:2: ( ( ( rule__TerminalExp__Alternatives ) ) )
            // InternalPLEC.g:242:2: ( ( rule__TerminalExp__Alternatives ) )
            {
            // InternalPLEC.g:242:2: ( ( rule__TerminalExp__Alternatives ) )
            // InternalPLEC.g:243:3: ( rule__TerminalExp__Alternatives )
            {
             before(grammarAccess.getTerminalExpAccess().getAlternatives()); 
            // InternalPLEC.g:244:3: ( rule__TerminalExp__Alternatives )
            // InternalPLEC.g:244:4: rule__TerminalExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExp"


    // $ANTLR start "entryRuleIDCons"
    // InternalPLEC.g:253:1: entryRuleIDCons : ruleIDCons EOF ;
    public final void entryRuleIDCons() throws RecognitionException {
        try {
            // InternalPLEC.g:254:1: ( ruleIDCons EOF )
            // InternalPLEC.g:255:1: ruleIDCons EOF
            {
             before(grammarAccess.getIDConsRule()); 
            pushFollow(FOLLOW_1);
            ruleIDCons();

            state._fsp--;

             after(grammarAccess.getIDConsRule()); 
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
    // $ANTLR end "entryRuleIDCons"


    // $ANTLR start "ruleIDCons"
    // InternalPLEC.g:262:1: ruleIDCons : ( ( rule__IDCons__NameAssignment ) ) ;
    public final void ruleIDCons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:266:2: ( ( ( rule__IDCons__NameAssignment ) ) )
            // InternalPLEC.g:267:2: ( ( rule__IDCons__NameAssignment ) )
            {
            // InternalPLEC.g:267:2: ( ( rule__IDCons__NameAssignment ) )
            // InternalPLEC.g:268:3: ( rule__IDCons__NameAssignment )
            {
             before(grammarAccess.getIDConsAccess().getNameAssignment()); 
            // InternalPLEC.g:269:3: ( rule__IDCons__NameAssignment )
            // InternalPLEC.g:269:4: rule__IDCons__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IDCons__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIDConsAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDCons"


    // $ANTLR start "entryRuleStructural"
    // InternalPLEC.g:278:1: entryRuleStructural : ruleStructural EOF ;
    public final void entryRuleStructural() throws RecognitionException {
        try {
            // InternalPLEC.g:279:1: ( ruleStructural EOF )
            // InternalPLEC.g:280:1: ruleStructural EOF
            {
             before(grammarAccess.getStructuralRule()); 
            pushFollow(FOLLOW_1);
            ruleStructural();

            state._fsp--;

             after(grammarAccess.getStructuralRule()); 
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
    // $ANTLR end "entryRuleStructural"


    // $ANTLR start "ruleStructural"
    // InternalPLEC.g:287:1: ruleStructural : ( ( rule__Structural__Group__0 ) ) ;
    public final void ruleStructural() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:291:2: ( ( ( rule__Structural__Group__0 ) ) )
            // InternalPLEC.g:292:2: ( ( rule__Structural__Group__0 ) )
            {
            // InternalPLEC.g:292:2: ( ( rule__Structural__Group__0 ) )
            // InternalPLEC.g:293:3: ( rule__Structural__Group__0 )
            {
             before(grammarAccess.getStructuralAccess().getGroup()); 
            // InternalPLEC.g:294:3: ( rule__Structural__Group__0 )
            // InternalPLEC.g:294:4: rule__Structural__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Structural__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructuralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructural"


    // $ANTLR start "entryRuleParent"
    // InternalPLEC.g:303:1: entryRuleParent : ruleParent EOF ;
    public final void entryRuleParent() throws RecognitionException {
        try {
            // InternalPLEC.g:304:1: ( ruleParent EOF )
            // InternalPLEC.g:305:1: ruleParent EOF
            {
             before(grammarAccess.getParentRule()); 
            pushFollow(FOLLOW_1);
            ruleParent();

            state._fsp--;

             after(grammarAccess.getParentRule()); 
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
    // $ANTLR end "entryRuleParent"


    // $ANTLR start "ruleParent"
    // InternalPLEC.g:312:1: ruleParent : ( RULE_ID ) ;
    public final void ruleParent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:316:2: ( ( RULE_ID ) )
            // InternalPLEC.g:317:2: ( RULE_ID )
            {
            // InternalPLEC.g:317:2: ( RULE_ID )
            // InternalPLEC.g:318:3: RULE_ID
            {
             before(grammarAccess.getParentAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParentAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParent"


    // $ANTLR start "entryRuleAttributes"
    // InternalPLEC.g:328:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalPLEC.g:329:1: ( ruleAttributes EOF )
            // InternalPLEC.g:330:1: ruleAttributes EOF
            {
             before(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAttributesRule()); 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalPLEC.g:337:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:341:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalPLEC.g:342:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalPLEC.g:342:2: ( ( rule__Attributes__Group__0 ) )
            // InternalPLEC.g:343:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalPLEC.g:344:3: ( rule__Attributes__Group__0 )
            // InternalPLEC.g:344:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleRefinement"
    // InternalPLEC.g:353:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalPLEC.g:354:1: ( ruleRefinement EOF )
            // InternalPLEC.g:355:1: ruleRefinement EOF
            {
             before(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementRule()); 
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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalPLEC.g:362:1: ruleRefinement : ( ( rule__Refinement__Alternatives ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:366:2: ( ( ( rule__Refinement__Alternatives ) ) )
            // InternalPLEC.g:367:2: ( ( rule__Refinement__Alternatives ) )
            {
            // InternalPLEC.g:367:2: ( ( rule__Refinement__Alternatives ) )
            // InternalPLEC.g:368:3: ( rule__Refinement__Alternatives )
            {
             before(grammarAccess.getRefinementAccess().getAlternatives()); 
            // InternalPLEC.g:369:3: ( rule__Refinement__Alternatives )
            // InternalPLEC.g:369:4: rule__Refinement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Refinement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleAssignment"
    // InternalPLEC.g:378:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPLEC.g:379:1: ( ruleAssignment EOF )
            // InternalPLEC.g:380:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalPLEC.g:387:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:391:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalPLEC.g:392:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalPLEC.g:392:2: ( ( rule__Assignment__Group__0 ) )
            // InternalPLEC.g:393:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalPLEC.g:394:3: ( rule__Assignment__Group__0 )
            // InternalPLEC.g:394:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleVarRefinement"
    // InternalPLEC.g:403:1: entryRuleVarRefinement : ruleVarRefinement EOF ;
    public final void entryRuleVarRefinement() throws RecognitionException {
        try {
            // InternalPLEC.g:404:1: ( ruleVarRefinement EOF )
            // InternalPLEC.g:405:1: ruleVarRefinement EOF
            {
             before(grammarAccess.getVarRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleVarRefinement();

            state._fsp--;

             after(grammarAccess.getVarRefinementRule()); 
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
    // $ANTLR end "entryRuleVarRefinement"


    // $ANTLR start "ruleVarRefinement"
    // InternalPLEC.g:412:1: ruleVarRefinement : ( ( rule__VarRefinement__Group__0 ) ) ;
    public final void ruleVarRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:416:2: ( ( ( rule__VarRefinement__Group__0 ) ) )
            // InternalPLEC.g:417:2: ( ( rule__VarRefinement__Group__0 ) )
            {
            // InternalPLEC.g:417:2: ( ( rule__VarRefinement__Group__0 ) )
            // InternalPLEC.g:418:3: ( rule__VarRefinement__Group__0 )
            {
             before(grammarAccess.getVarRefinementAccess().getGroup()); 
            // InternalPLEC.g:419:3: ( rule__VarRefinement__Group__0 )
            // InternalPLEC.g:419:4: rule__VarRefinement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarRefinement"


    // $ANTLR start "entryRuleSetRefinement"
    // InternalPLEC.g:428:1: entryRuleSetRefinement : ruleSetRefinement EOF ;
    public final void entryRuleSetRefinement() throws RecognitionException {
        try {
            // InternalPLEC.g:429:1: ( ruleSetRefinement EOF )
            // InternalPLEC.g:430:1: ruleSetRefinement EOF
            {
             before(grammarAccess.getSetRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleSetRefinement();

            state._fsp--;

             after(grammarAccess.getSetRefinementRule()); 
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
    // $ANTLR end "entryRuleSetRefinement"


    // $ANTLR start "ruleSetRefinement"
    // InternalPLEC.g:437:1: ruleSetRefinement : ( ( rule__SetRefinement__Group__0 ) ) ;
    public final void ruleSetRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:441:2: ( ( ( rule__SetRefinement__Group__0 ) ) )
            // InternalPLEC.g:442:2: ( ( rule__SetRefinement__Group__0 ) )
            {
            // InternalPLEC.g:442:2: ( ( rule__SetRefinement__Group__0 ) )
            // InternalPLEC.g:443:3: ( rule__SetRefinement__Group__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup()); 
            // InternalPLEC.g:444:3: ( rule__SetRefinement__Group__0 )
            // InternalPLEC.g:444:4: rule__SetRefinement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetRefinement"


    // $ANTLR start "entryRuleRootRefinement"
    // InternalPLEC.g:453:1: entryRuleRootRefinement : ruleRootRefinement EOF ;
    public final void entryRuleRootRefinement() throws RecognitionException {
        try {
            // InternalPLEC.g:454:1: ( ruleRootRefinement EOF )
            // InternalPLEC.g:455:1: ruleRootRefinement EOF
            {
             before(grammarAccess.getRootRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleRootRefinement();

            state._fsp--;

             after(grammarAccess.getRootRefinementRule()); 
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
    // $ANTLR end "entryRuleRootRefinement"


    // $ANTLR start "ruleRootRefinement"
    // InternalPLEC.g:462:1: ruleRootRefinement : ( ( rule__RootRefinement__Group__0 ) ) ;
    public final void ruleRootRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:466:2: ( ( ( rule__RootRefinement__Group__0 ) ) )
            // InternalPLEC.g:467:2: ( ( rule__RootRefinement__Group__0 ) )
            {
            // InternalPLEC.g:467:2: ( ( rule__RootRefinement__Group__0 ) )
            // InternalPLEC.g:468:3: ( rule__RootRefinement__Group__0 )
            {
             before(grammarAccess.getRootRefinementAccess().getGroup()); 
            // InternalPLEC.g:469:3: ( rule__RootRefinement__Group__0 )
            // InternalPLEC.g:469:4: rule__RootRefinement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RootRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootRefinement"


    // $ANTLR start "entryRuleTemporal"
    // InternalPLEC.g:478:1: entryRuleTemporal : ruleTemporal EOF ;
    public final void entryRuleTemporal() throws RecognitionException {
        try {
            // InternalPLEC.g:479:1: ( ruleTemporal EOF )
            // InternalPLEC.g:480:1: ruleTemporal EOF
            {
             before(grammarAccess.getTemporalRule()); 
            pushFollow(FOLLOW_1);
            ruleTemporal();

            state._fsp--;

             after(grammarAccess.getTemporalRule()); 
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
    // $ANTLR end "entryRuleTemporal"


    // $ANTLR start "ruleTemporal"
    // InternalPLEC.g:487:1: ruleTemporal : ( ( rule__Temporal__Group__0 ) ) ;
    public final void ruleTemporal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:491:2: ( ( ( rule__Temporal__Group__0 ) ) )
            // InternalPLEC.g:492:2: ( ( rule__Temporal__Group__0 ) )
            {
            // InternalPLEC.g:492:2: ( ( rule__Temporal__Group__0 ) )
            // InternalPLEC.g:493:3: ( rule__Temporal__Group__0 )
            {
             before(grammarAccess.getTemporalAccess().getGroup()); 
            // InternalPLEC.g:494:3: ( rule__Temporal__Group__0 )
            // InternalPLEC.g:494:4: rule__Temporal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Temporal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemporalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemporal"


    // $ANTLR start "entryRuleRule"
    // InternalPLEC.g:503:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalPLEC.g:504:1: ( ruleRule EOF )
            // InternalPLEC.g:505:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalPLEC.g:512:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:516:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalPLEC.g:517:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalPLEC.g:517:2: ( ( rule__Rule__Group__0 ) )
            // InternalPLEC.g:518:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalPLEC.g:519:3: ( rule__Rule__Group__0 )
            // InternalPLEC.g:519:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFodaUN"
    // InternalPLEC.g:528:1: entryRuleFodaUN : ruleFodaUN EOF ;
    public final void entryRuleFodaUN() throws RecognitionException {
        try {
            // InternalPLEC.g:529:1: ( ruleFodaUN EOF )
            // InternalPLEC.g:530:1: ruleFodaUN EOF
            {
             before(grammarAccess.getFodaUNRule()); 
            pushFollow(FOLLOW_1);
            ruleFodaUN();

            state._fsp--;

             after(grammarAccess.getFodaUNRule()); 
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
    // $ANTLR end "entryRuleFodaUN"


    // $ANTLR start "ruleFodaUN"
    // InternalPLEC.g:537:1: ruleFodaUN : ( ( rule__FodaUN__Group__0 ) ) ;
    public final void ruleFodaUN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:541:2: ( ( ( rule__FodaUN__Group__0 ) ) )
            // InternalPLEC.g:542:2: ( ( rule__FodaUN__Group__0 ) )
            {
            // InternalPLEC.g:542:2: ( ( rule__FodaUN__Group__0 ) )
            // InternalPLEC.g:543:3: ( rule__FodaUN__Group__0 )
            {
             before(grammarAccess.getFodaUNAccess().getGroup()); 
            // InternalPLEC.g:544:3: ( rule__FodaUN__Group__0 )
            // InternalPLEC.g:544:4: rule__FodaUN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FodaUN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFodaUNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFodaUN"


    // $ANTLR start "entryRuleFodaBin"
    // InternalPLEC.g:553:1: entryRuleFodaBin : ruleFodaBin EOF ;
    public final void entryRuleFodaBin() throws RecognitionException {
        try {
            // InternalPLEC.g:554:1: ( ruleFodaBin EOF )
            // InternalPLEC.g:555:1: ruleFodaBin EOF
            {
             before(grammarAccess.getFodaBinRule()); 
            pushFollow(FOLLOW_1);
            ruleFodaBin();

            state._fsp--;

             after(grammarAccess.getFodaBinRule()); 
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
    // $ANTLR end "entryRuleFodaBin"


    // $ANTLR start "ruleFodaBin"
    // InternalPLEC.g:562:1: ruleFodaBin : ( ( rule__FodaBin__Group__0 ) ) ;
    public final void ruleFodaBin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:566:2: ( ( ( rule__FodaBin__Group__0 ) ) )
            // InternalPLEC.g:567:2: ( ( rule__FodaBin__Group__0 ) )
            {
            // InternalPLEC.g:567:2: ( ( rule__FodaBin__Group__0 ) )
            // InternalPLEC.g:568:3: ( rule__FodaBin__Group__0 )
            {
             before(grammarAccess.getFodaBinAccess().getGroup()); 
            // InternalPLEC.g:569:3: ( rule__FodaBin__Group__0 )
            // InternalPLEC.g:569:4: rule__FodaBin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFodaBinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFodaBin"


    // $ANTLR start "entryRuleQuantifiable"
    // InternalPLEC.g:578:1: entryRuleQuantifiable : ruleQuantifiable EOF ;
    public final void entryRuleQuantifiable() throws RecognitionException {
        try {
            // InternalPLEC.g:579:1: ( ruleQuantifiable EOF )
            // InternalPLEC.g:580:1: ruleQuantifiable EOF
            {
             before(grammarAccess.getQuantifiableRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantifiable();

            state._fsp--;

             after(grammarAccess.getQuantifiableRule()); 
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
    // $ANTLR end "entryRuleQuantifiable"


    // $ANTLR start "ruleQuantifiable"
    // InternalPLEC.g:587:1: ruleQuantifiable : ( ( rule__Quantifiable__Group__0 ) ) ;
    public final void ruleQuantifiable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:591:2: ( ( ( rule__Quantifiable__Group__0 ) ) )
            // InternalPLEC.g:592:2: ( ( rule__Quantifiable__Group__0 ) )
            {
            // InternalPLEC.g:592:2: ( ( rule__Quantifiable__Group__0 ) )
            // InternalPLEC.g:593:3: ( rule__Quantifiable__Group__0 )
            {
             before(grammarAccess.getQuantifiableAccess().getGroup()); 
            // InternalPLEC.g:594:3: ( rule__Quantifiable__Group__0 )
            // InternalPLEC.g:594:4: rule__Quantifiable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantifiable"


    // $ANTLR start "entryRuleBoolVal"
    // InternalPLEC.g:603:1: entryRuleBoolVal : ruleBoolVal EOF ;
    public final void entryRuleBoolVal() throws RecognitionException {
        try {
            // InternalPLEC.g:604:1: ( ruleBoolVal EOF )
            // InternalPLEC.g:605:1: ruleBoolVal EOF
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
    // InternalPLEC.g:612:1: ruleBoolVal : ( ( rule__BoolVal__ValueAssignment ) ) ;
    public final void ruleBoolVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:616:2: ( ( ( rule__BoolVal__ValueAssignment ) ) )
            // InternalPLEC.g:617:2: ( ( rule__BoolVal__ValueAssignment ) )
            {
            // InternalPLEC.g:617:2: ( ( rule__BoolVal__ValueAssignment ) )
            // InternalPLEC.g:618:3: ( rule__BoolVal__ValueAssignment )
            {
             before(grammarAccess.getBoolValAccess().getValueAssignment()); 
            // InternalPLEC.g:619:3: ( rule__BoolVal__ValueAssignment )
            // InternalPLEC.g:619:4: rule__BoolVal__ValueAssignment
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
    // InternalPLEC.g:628:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalPLEC.g:629:1: ( ruleNumber EOF )
            // InternalPLEC.g:630:1: ruleNumber EOF
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
    // InternalPLEC.g:637:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:641:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalPLEC.g:642:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalPLEC.g:642:2: ( ( rule__Number__ValueAssignment ) )
            // InternalPLEC.g:643:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalPLEC.g:644:3: ( rule__Number__ValueAssignment )
            // InternalPLEC.g:644:4: rule__Number__ValueAssignment
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
    // InternalPLEC.g:653:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalPLEC.g:654:1: ( ruleSymbol EOF )
            // InternalPLEC.g:655:1: ruleSymbol EOF
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
    // InternalPLEC.g:662:1: ruleSymbol : ( ( rule__Symbol__ValueAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:666:2: ( ( ( rule__Symbol__ValueAssignment ) ) )
            // InternalPLEC.g:667:2: ( ( rule__Symbol__ValueAssignment ) )
            {
            // InternalPLEC.g:667:2: ( ( rule__Symbol__ValueAssignment ) )
            // InternalPLEC.g:668:3: ( rule__Symbol__ValueAssignment )
            {
             before(grammarAccess.getSymbolAccess().getValueAssignment()); 
            // InternalPLEC.g:669:3: ( rule__Symbol__ValueAssignment )
            // InternalPLEC.g:669:4: rule__Symbol__ValueAssignment
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
    // InternalPLEC.g:678:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalPLEC.g:679:1: ( ruleValue EOF )
            // InternalPLEC.g:680:1: ruleValue EOF
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
    // InternalPLEC.g:687:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:691:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalPLEC.g:692:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalPLEC.g:692:2: ( ( rule__Value__Alternatives ) )
            // InternalPLEC.g:693:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalPLEC.g:694:3: ( rule__Value__Alternatives )
            // InternalPLEC.g:694:4: rule__Value__Alternatives
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
    // InternalPLEC.g:703:1: entryRuleNonEnumerableValue : ruleNonEnumerableValue EOF ;
    public final void entryRuleNonEnumerableValue() throws RecognitionException {
        try {
            // InternalPLEC.g:704:1: ( ruleNonEnumerableValue EOF )
            // InternalPLEC.g:705:1: ruleNonEnumerableValue EOF
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
    // InternalPLEC.g:712:1: ruleNonEnumerableValue : ( ( rule__NonEnumerableValue__Alternatives ) ) ;
    public final void ruleNonEnumerableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:716:2: ( ( ( rule__NonEnumerableValue__Alternatives ) ) )
            // InternalPLEC.g:717:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            {
            // InternalPLEC.g:717:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            // InternalPLEC.g:718:3: ( rule__NonEnumerableValue__Alternatives )
            {
             before(grammarAccess.getNonEnumerableValueAccess().getAlternatives()); 
            // InternalPLEC.g:719:3: ( rule__NonEnumerableValue__Alternatives )
            // InternalPLEC.g:719:4: rule__NonEnumerableValue__Alternatives
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
    // InternalPLEC.g:728:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalPLEC.g:729:1: ( ruleVarType EOF )
            // InternalPLEC.g:730:1: ruleVarType EOF
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
    // InternalPLEC.g:737:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:741:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalPLEC.g:742:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalPLEC.g:742:2: ( ( rule__VarType__Alternatives ) )
            // InternalPLEC.g:743:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalPLEC.g:744:3: ( rule__VarType__Alternatives )
            // InternalPLEC.g:744:4: rule__VarType__Alternatives
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


    // $ANTLR start "entryRuleListOfValues"
    // InternalPLEC.g:753:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalPLEC.g:754:1: ( ruleListOfValues EOF )
            // InternalPLEC.g:755:1: ruleListOfValues EOF
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
    // InternalPLEC.g:762:1: ruleListOfValues : ( ( rule__ListOfValues__Group__0 ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:766:2: ( ( ( rule__ListOfValues__Group__0 ) ) )
            // InternalPLEC.g:767:2: ( ( rule__ListOfValues__Group__0 ) )
            {
            // InternalPLEC.g:767:2: ( ( rule__ListOfValues__Group__0 ) )
            // InternalPLEC.g:768:3: ( rule__ListOfValues__Group__0 )
            {
             before(grammarAccess.getListOfValuesAccess().getGroup()); 
            // InternalPLEC.g:769:3: ( rule__ListOfValues__Group__0 )
            // InternalPLEC.g:769:4: rule__ListOfValues__Group__0
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
    // InternalPLEC.g:778:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalPLEC.g:779:1: ( ruleListOfIDs EOF )
            // InternalPLEC.g:780:1: ruleListOfIDs EOF
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
    // InternalPLEC.g:787:1: ruleListOfIDs : ( ( rule__ListOfIDs__Group__0 ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:791:2: ( ( ( rule__ListOfIDs__Group__0 ) ) )
            // InternalPLEC.g:792:2: ( ( rule__ListOfIDs__Group__0 ) )
            {
            // InternalPLEC.g:792:2: ( ( rule__ListOfIDs__Group__0 ) )
            // InternalPLEC.g:793:3: ( rule__ListOfIDs__Group__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup()); 
            // InternalPLEC.g:794:3: ( rule__ListOfIDs__Group__0 )
            // InternalPLEC.g:794:4: rule__ListOfIDs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfIDs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleListOfListsOfValues"
    // InternalPLEC.g:803:1: entryRuleListOfListsOfValues : ruleListOfListsOfValues EOF ;
    public final void entryRuleListOfListsOfValues() throws RecognitionException {
        try {
            // InternalPLEC.g:804:1: ( ruleListOfListsOfValues EOF )
            // InternalPLEC.g:805:1: ruleListOfListsOfValues EOF
            {
             before(grammarAccess.getListOfListsOfValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfListsOfValues();

            state._fsp--;

             after(grammarAccess.getListOfListsOfValuesRule()); 
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
    // $ANTLR end "entryRuleListOfListsOfValues"


    // $ANTLR start "ruleListOfListsOfValues"
    // InternalPLEC.g:812:1: ruleListOfListsOfValues : ( ( rule__ListOfListsOfValues__Group__0 ) ) ;
    public final void ruleListOfListsOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:816:2: ( ( ( rule__ListOfListsOfValues__Group__0 ) ) )
            // InternalPLEC.g:817:2: ( ( rule__ListOfListsOfValues__Group__0 ) )
            {
            // InternalPLEC.g:817:2: ( ( rule__ListOfListsOfValues__Group__0 ) )
            // InternalPLEC.g:818:3: ( rule__ListOfListsOfValues__Group__0 )
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getGroup()); 
            // InternalPLEC.g:819:3: ( rule__ListOfListsOfValues__Group__0 )
            // InternalPLEC.g:819:4: rule__ListOfListsOfValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfListsOfValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOfListsOfValues"


    // $ANTLR start "entryRuleBinOp"
    // InternalPLEC.g:828:1: entryRuleBinOp : ruleBinOp EOF ;
    public final void entryRuleBinOp() throws RecognitionException {
        try {
            // InternalPLEC.g:829:1: ( ruleBinOp EOF )
            // InternalPLEC.g:830:1: ruleBinOp EOF
            {
             before(grammarAccess.getBinOpRule()); 
            pushFollow(FOLLOW_1);
            ruleBinOp();

            state._fsp--;

             after(grammarAccess.getBinOpRule()); 
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
    // $ANTLR end "entryRuleBinOp"


    // $ANTLR start "ruleBinOp"
    // InternalPLEC.g:837:1: ruleBinOp : ( ( rule__BinOp__Alternatives ) ) ;
    public final void ruleBinOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:841:2: ( ( ( rule__BinOp__Alternatives ) ) )
            // InternalPLEC.g:842:2: ( ( rule__BinOp__Alternatives ) )
            {
            // InternalPLEC.g:842:2: ( ( rule__BinOp__Alternatives ) )
            // InternalPLEC.g:843:3: ( rule__BinOp__Alternatives )
            {
             before(grammarAccess.getBinOpAccess().getAlternatives()); 
            // InternalPLEC.g:844:3: ( rule__BinOp__Alternatives )
            // InternalPLEC.g:844:4: rule__BinOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinOp"


    // $ANTLR start "entryRuleUnaryOp"
    // InternalPLEC.g:853:1: entryRuleUnaryOp : ruleUnaryOp EOF ;
    public final void entryRuleUnaryOp() throws RecognitionException {
        try {
            // InternalPLEC.g:854:1: ( ruleUnaryOp EOF )
            // InternalPLEC.g:855:1: ruleUnaryOp EOF
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
    // InternalPLEC.g:862:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:866:2: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // InternalPLEC.g:867:2: ( ( rule__UnaryOp__Alternatives ) )
            {
            // InternalPLEC.g:867:2: ( ( rule__UnaryOp__Alternatives ) )
            // InternalPLEC.g:868:3: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // InternalPLEC.g:869:3: ( rule__UnaryOp__Alternatives )
            // InternalPLEC.g:869:4: rule__UnaryOp__Alternatives
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


    // $ANTLR start "entryRuleTempOP"
    // InternalPLEC.g:878:1: entryRuleTempOP : ruleTempOP EOF ;
    public final void entryRuleTempOP() throws RecognitionException {
        try {
            // InternalPLEC.g:879:1: ( ruleTempOP EOF )
            // InternalPLEC.g:880:1: ruleTempOP EOF
            {
             before(grammarAccess.getTempOPRule()); 
            pushFollow(FOLLOW_1);
            ruleTempOP();

            state._fsp--;

             after(grammarAccess.getTempOPRule()); 
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
    // $ANTLR end "entryRuleTempOP"


    // $ANTLR start "ruleTempOP"
    // InternalPLEC.g:887:1: ruleTempOP : ( ( rule__TempOP__Alternatives ) ) ;
    public final void ruleTempOP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:891:2: ( ( ( rule__TempOP__Alternatives ) ) )
            // InternalPLEC.g:892:2: ( ( rule__TempOP__Alternatives ) )
            {
            // InternalPLEC.g:892:2: ( ( rule__TempOP__Alternatives ) )
            // InternalPLEC.g:893:3: ( rule__TempOP__Alternatives )
            {
             before(grammarAccess.getTempOPAccess().getAlternatives()); 
            // InternalPLEC.g:894:3: ( rule__TempOP__Alternatives )
            // InternalPLEC.g:894:4: rule__TempOP__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TempOP__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTempOPAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTempOP"


    // $ANTLR start "rule__VariantDeclaration__Alternatives"
    // InternalPLEC.g:902:1: rule__VariantDeclaration__Alternatives : ( ( ruleVariantsInterval ) | ( ruleVariantsEnumeration ) );
    public final void rule__VariantDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:906:1: ( ( ruleVariantsInterval ) | ( ruleVariantsEnumeration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPLEC.g:907:2: ( ruleVariantsInterval )
                    {
                    // InternalPLEC.g:907:2: ( ruleVariantsInterval )
                    // InternalPLEC.g:908:3: ruleVariantsInterval
                    {
                     before(grammarAccess.getVariantDeclarationAccess().getVariantsIntervalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariantsInterval();

                    state._fsp--;

                     after(grammarAccess.getVariantDeclarationAccess().getVariantsIntervalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLEC.g:913:2: ( ruleVariantsEnumeration )
                    {
                    // InternalPLEC.g:913:2: ( ruleVariantsEnumeration )
                    // InternalPLEC.g:914:3: ruleVariantsEnumeration
                    {
                     before(grammarAccess.getVariantDeclarationAccess().getVariantsEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariantsEnumeration();

                    state._fsp--;

                     after(grammarAccess.getVariantDeclarationAccess().getVariantsEnumerationParserRuleCall_1()); 

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
    // $ANTLR end "rule__VariantDeclaration__Alternatives"


    // $ANTLR start "rule__ConsExpression__Alternatives"
    // InternalPLEC.g:923:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) | ( ruleAttributes ) | ( ruleTemporal ) | ( ruleQuantifiable ) );
    public final void rule__ConsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:927:1: ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) | ( ruleAttributes ) | ( ruleTemporal ) | ( ruleQuantifiable ) )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalPLEC.g:928:2: ( ruleIDCons )
                    {
                    // InternalPLEC.g:928:2: ( ruleIDCons )
                    // InternalPLEC.g:929:3: ruleIDCons
                    {
                     before(grammarAccess.getConsExpressionAccess().getIDConsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIDCons();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getIDConsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLEC.g:934:2: ( ruleRefinement )
                    {
                    // InternalPLEC.g:934:2: ( ruleRefinement )
                    // InternalPLEC.g:935:3: ruleRefinement
                    {
                     before(grammarAccess.getConsExpressionAccess().getRefinementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefinement();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getRefinementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLEC.g:940:2: ( ruleRule )
                    {
                    // InternalPLEC.g:940:2: ( ruleRule )
                    // InternalPLEC.g:941:3: ruleRule
                    {
                     before(grammarAccess.getConsExpressionAccess().getRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getRuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPLEC.g:946:2: ( ruleFodaBin )
                    {
                    // InternalPLEC.g:946:2: ( ruleFodaBin )
                    // InternalPLEC.g:947:3: ruleFodaBin
                    {
                     before(grammarAccess.getConsExpressionAccess().getFodaBinParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFodaBin();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getFodaBinParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPLEC.g:952:2: ( ruleStructural )
                    {
                    // InternalPLEC.g:952:2: ( ruleStructural )
                    // InternalPLEC.g:953:3: ruleStructural
                    {
                     before(grammarAccess.getConsExpressionAccess().getStructuralParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStructural();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getStructuralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPLEC.g:958:2: ( ruleFodaUN )
                    {
                    // InternalPLEC.g:958:2: ( ruleFodaUN )
                    // InternalPLEC.g:959:3: ruleFodaUN
                    {
                     before(grammarAccess.getConsExpressionAccess().getFodaUNParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleFodaUN();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getFodaUNParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPLEC.g:964:2: ( ruleAttributes )
                    {
                    // InternalPLEC.g:964:2: ( ruleAttributes )
                    // InternalPLEC.g:965:3: ruleAttributes
                    {
                     before(grammarAccess.getConsExpressionAccess().getAttributesParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributes();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getAttributesParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPLEC.g:970:2: ( ruleTemporal )
                    {
                    // InternalPLEC.g:970:2: ( ruleTemporal )
                    // InternalPLEC.g:971:3: ruleTemporal
                    {
                     before(grammarAccess.getConsExpressionAccess().getTemporalParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleTemporal();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getTemporalParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPLEC.g:976:2: ( ruleQuantifiable )
                    {
                    // InternalPLEC.g:976:2: ( ruleQuantifiable )
                    // InternalPLEC.g:977:3: ruleQuantifiable
                    {
                     before(grammarAccess.getConsExpressionAccess().getQuantifiableParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleQuantifiable();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getQuantifiableParserRuleCall_8()); 

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
    // $ANTLR end "rule__ConsExpression__Alternatives"


    // $ANTLR start "rule__TerminalExp__Alternatives"
    // InternalPLEC.g:986:1: rule__TerminalExp__Alternatives : ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) );
    public final void rule__TerminalExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:990:1: ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPLEC.g:991:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    {
                    // InternalPLEC.g:991:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    // InternalPLEC.g:992:3: ( rule__TerminalExp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpAccess().getGroup_0()); 
                    // InternalPLEC.g:993:3: ( rule__TerminalExp__Group_0__0 )
                    // InternalPLEC.g:993:4: rule__TerminalExp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLEC.g:997:2: ( ruleIDCons )
                    {
                    // InternalPLEC.g:997:2: ( ruleIDCons )
                    // InternalPLEC.g:998:3: ruleIDCons
                    {
                     before(grammarAccess.getTerminalExpAccess().getIDConsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIDCons();

                    state._fsp--;

                     after(grammarAccess.getTerminalExpAccess().getIDConsParserRuleCall_1()); 

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
    // $ANTLR end "rule__TerminalExp__Alternatives"


    // $ANTLR start "rule__Refinement__Alternatives"
    // InternalPLEC.g:1007:1: rule__Refinement__Alternatives : ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) | ( ruleRootRefinement ) );
    public final void rule__Refinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1011:1: ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) | ( ruleRootRefinement ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==39) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==42) ) {
                        alt4=4;
                    }
                    else if ( ((LA4_3>=RULE_ID && LA4_3<=RULE_INT)||(LA4_3>=11 && LA4_3<=12)) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==40) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==41) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPLEC.g:1012:2: ( ruleAssignment )
                    {
                    // InternalPLEC.g:1012:2: ( ruleAssignment )
                    // InternalPLEC.g:1013:3: ruleAssignment
                    {
                     before(grammarAccess.getRefinementAccess().getAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getRefinementAccess().getAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLEC.g:1018:2: ( ruleVarRefinement )
                    {
                    // InternalPLEC.g:1018:2: ( ruleVarRefinement )
                    // InternalPLEC.g:1019:3: ruleVarRefinement
                    {
                     before(grammarAccess.getRefinementAccess().getVarRefinementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVarRefinement();

                    state._fsp--;

                     after(grammarAccess.getRefinementAccess().getVarRefinementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLEC.g:1024:2: ( ruleSetRefinement )
                    {
                    // InternalPLEC.g:1024:2: ( ruleSetRefinement )
                    // InternalPLEC.g:1025:3: ruleSetRefinement
                    {
                     before(grammarAccess.getRefinementAccess().getSetRefinementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSetRefinement();

                    state._fsp--;

                     after(grammarAccess.getRefinementAccess().getSetRefinementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPLEC.g:1030:2: ( ruleRootRefinement )
                    {
                    // InternalPLEC.g:1030:2: ( ruleRootRefinement )
                    // InternalPLEC.g:1031:3: ruleRootRefinement
                    {
                     before(grammarAccess.getRefinementAccess().getRootRefinementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRootRefinement();

                    state._fsp--;

                     after(grammarAccess.getRefinementAccess().getRootRefinementParserRuleCall_3()); 

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
    // $ANTLR end "rule__Refinement__Alternatives"


    // $ANTLR start "rule__BoolVal__ValueAlternatives_0"
    // InternalPLEC.g:1040:1: rule__BoolVal__ValueAlternatives_0 : ( ( 'selected' ) | ( 'unselected' ) );
    public final void rule__BoolVal__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1044:1: ( ( 'selected' ) | ( 'unselected' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPLEC.g:1045:2: ( 'selected' )
                    {
                    // InternalPLEC.g:1045:2: ( 'selected' )
                    // InternalPLEC.g:1046:3: 'selected'
                    {
                     before(grammarAccess.getBoolValAccess().getValueSelectedKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBoolValAccess().getValueSelectedKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLEC.g:1051:2: ( 'unselected' )
                    {
                    // InternalPLEC.g:1051:2: ( 'unselected' )
                    // InternalPLEC.g:1052:3: 'unselected'
                    {
                     before(grammarAccess.getBoolValAccess().getValueUnselectedKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBoolValAccess().getValueUnselectedKeyword_0_1()); 

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
    // InternalPLEC.g:1061:1: rule__Value__Alternatives : ( ( ruleNumber ) | ( ruleNonEnumerableValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1065:1: ( ( ruleNumber ) | ( ruleNonEnumerableValue ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||(LA6_0>=11 && LA6_0<=12)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPLEC.g:1066:2: ( ruleNumber )
                    {
                    // InternalPLEC.g:1066:2: ( ruleNumber )
                    // InternalPLEC.g:1067:3: ruleNumber
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
                    // InternalPLEC.g:1072:2: ( ruleNonEnumerableValue )
                    {
                    // InternalPLEC.g:1072:2: ( ruleNonEnumerableValue )
                    // InternalPLEC.g:1073:3: ruleNonEnumerableValue
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
    // InternalPLEC.g:1082:1: rule__NonEnumerableValue__Alternatives : ( ( ruleBoolVal ) | ( ruleSymbol ) );
    public final void rule__NonEnumerableValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1086:1: ( ( ruleBoolVal ) | ( ruleSymbol ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=12)) ) {
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
                    // InternalPLEC.g:1087:2: ( ruleBoolVal )
                    {
                    // InternalPLEC.g:1087:2: ( ruleBoolVal )
                    // InternalPLEC.g:1088:3: ruleBoolVal
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
                    // InternalPLEC.g:1093:2: ( ruleSymbol )
                    {
                    // InternalPLEC.g:1093:2: ( ruleSymbol )
                    // InternalPLEC.g:1094:3: ruleSymbol
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
    // InternalPLEC.g:1103:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1107:1: ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPLEC.g:1108:2: ( 'boolean' )
                    {
                    // InternalPLEC.g:1108:2: ( 'boolean' )
                    // InternalPLEC.g:1109:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLEC.g:1114:2: ( 'integer' )
                    {
                    // InternalPLEC.g:1114:2: ( 'integer' )
                    // InternalPLEC.g:1115:3: 'integer'
                    {
                     before(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLEC.g:1120:2: ( 'symbolic' )
                    {
                    // InternalPLEC.g:1120:2: ( 'symbolic' )
                    // InternalPLEC.g:1121:3: 'symbolic'
                    {
                     before(grammarAccess.getVarTypeAccess().getSymbolicKeyword_2()); 
                    match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__BinOp__Alternatives"
    // InternalPLEC.g:1130:1: rule__BinOp__Alternatives : ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__BinOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1134:1: ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) )
            int alt9=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPLEC.g:1135:2: ( 'requires' )
                    {
                    // InternalPLEC.g:1135:2: ( 'requires' )
                    // InternalPLEC.g:1136:3: 'requires'
                    {
                     before(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLEC.g:1141:2: ( 'excludes' )
                    {
                    // InternalPLEC.g:1141:2: ( 'excludes' )
                    // InternalPLEC.g:1142:3: 'excludes'
                    {
                     before(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLEC.g:1147:2: ( 'optional' )
                    {
                    // InternalPLEC.g:1147:2: ( 'optional' )
                    // InternalPLEC.g:1148:3: 'optional'
                    {
                     before(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPLEC.g:1153:2: ( 'mandatory' )
                    {
                    // InternalPLEC.g:1153:2: ( 'mandatory' )
                    // InternalPLEC.g:1154:3: 'mandatory'
                    {
                     before(grammarAccess.getBinOpAccess().getMandatoryKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getMandatoryKeyword_3()); 

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
    // $ANTLR end "rule__BinOp__Alternatives"


    // $ANTLR start "rule__UnaryOp__Alternatives"
    // InternalPLEC.g:1163:1: rule__UnaryOp__Alternatives : ( ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1167:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPLEC.g:1168:2: ( 'optional' )
                    {
                    // InternalPLEC.g:1168:2: ( 'optional' )
                    // InternalPLEC.g:1169:3: 'optional'
                    {
                     before(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLEC.g:1174:2: ( 'mandatory' )
                    {
                    // InternalPLEC.g:1174:2: ( 'mandatory' )
                    // InternalPLEC.g:1175:3: 'mandatory'
                    {
                     before(grammarAccess.getUnaryOpAccess().getMandatoryKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getMandatoryKeyword_1()); 

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


    // $ANTLR start "rule__TempOP__Alternatives"
    // InternalPLEC.g:1184:1: rule__TempOP__Alternatives : ( ( 'always' ) | ( 'next' ) | ( 'eventually' ) );
    public final void rule__TempOP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1188:1: ( ( 'always' ) | ( 'next' ) | ( 'eventually' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPLEC.g:1189:2: ( 'always' )
                    {
                    // InternalPLEC.g:1189:2: ( 'always' )
                    // InternalPLEC.g:1190:3: 'always'
                    {
                     before(grammarAccess.getTempOPAccess().getAlwaysKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTempOPAccess().getAlwaysKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLEC.g:1195:2: ( 'next' )
                    {
                    // InternalPLEC.g:1195:2: ( 'next' )
                    // InternalPLEC.g:1196:3: 'next'
                    {
                     before(grammarAccess.getTempOPAccess().getNextKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTempOPAccess().getNextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLEC.g:1201:2: ( 'eventually' )
                    {
                    // InternalPLEC.g:1201:2: ( 'eventually' )
                    // InternalPLEC.g:1202:3: 'eventually'
                    {
                     before(grammarAccess.getTempOPAccess().getEventuallyKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTempOPAccess().getEventuallyKeyword_2()); 

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
    // $ANTLR end "rule__TempOP__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalPLEC.g:1211:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1215:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPLEC.g:1216:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalPLEC.g:1223:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1227:1: ( ( 'model' ) )
            // InternalPLEC.g:1228:1: ( 'model' )
            {
            // InternalPLEC.g:1228:1: ( 'model' )
            // InternalPLEC.g:1229:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPLEC.g:1238:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1242:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPLEC.g:1243:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalPLEC.g:1250:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1254:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalPLEC.g:1255:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalPLEC.g:1255:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalPLEC.g:1256:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalPLEC.g:1257:2: ( rule__Model__NameAssignment_1 )
            // InternalPLEC.g:1257:3: rule__Model__NameAssignment_1
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
    // InternalPLEC.g:1265:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1269:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPLEC.g:1270:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalPLEC.g:1277:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1281:1: ( ( 'variables:' ) )
            // InternalPLEC.g:1282:1: ( 'variables:' )
            {
            // InternalPLEC.g:1282:1: ( 'variables:' )
            // InternalPLEC.g:1283:2: 'variables:'
            {
             before(grammarAccess.getModelAccess().getVariablesKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPLEC.g:1292:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1296:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalPLEC.g:1297:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalPLEC.g:1304:1: rule__Model__Group__3__Impl : ( ( rule__Model__VarsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1308:1: ( ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalPLEC.g:1309:1: ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalPLEC.g:1309:1: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalPLEC.g:1310:2: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalPLEC.g:1311:2: ( rule__Model__VarsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=15)||LA12_0==44) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPLEC.g:1311:3: rule__Model__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__VarsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

            }


            }

        }
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
    // InternalPLEC.g:1319:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1323:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalPLEC.g:1324:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalPLEC.g:1331:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1335:1: ( ( 'constraints:' ) )
            // InternalPLEC.g:1336:1: ( 'constraints:' )
            {
            // InternalPLEC.g:1336:1: ( 'constraints:' )
            // InternalPLEC.g:1337:2: 'constraints:'
            {
             before(grammarAccess.getModelAccess().getConstraintsKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPLEC.g:1346:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1350:1: ( rule__Model__Group__5__Impl )
            // InternalPLEC.g:1351:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // InternalPLEC.g:1357:1: rule__Model__Group__5__Impl : ( ( rule__Model__ConstraintsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1361:1: ( ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalPLEC.g:1362:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalPLEC.g:1362:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalPLEC.g:1363:2: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalPLEC.g:1364:2: ( rule__Model__ConstraintsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPLEC.g:1364:3: rule__Model__ConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__ConstraintsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalPLEC.g:1373:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1377:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPLEC.g:1378:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

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
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalPLEC.g:1385:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__Group_0__0 )? ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1389:1: ( ( ( rule__VarDeclaration__Group_0__0 )? ) )
            // InternalPLEC.g:1390:1: ( ( rule__VarDeclaration__Group_0__0 )? )
            {
            // InternalPLEC.g:1390:1: ( ( rule__VarDeclaration__Group_0__0 )? )
            // InternalPLEC.g:1391:2: ( rule__VarDeclaration__Group_0__0 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup_0()); 
            // InternalPLEC.g:1392:2: ( rule__VarDeclaration__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPLEC.g:1392:3: rule__VarDeclaration__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarDeclarationAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalPLEC.g:1400:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1404:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalPLEC.g:1405:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__2();

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
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalPLEC.g:1412:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1416:1: ( ( ( rule__VarDeclaration__TypeAssignment_1 ) ) )
            // InternalPLEC.g:1417:1: ( ( rule__VarDeclaration__TypeAssignment_1 ) )
            {
            // InternalPLEC.g:1417:1: ( ( rule__VarDeclaration__TypeAssignment_1 ) )
            // InternalPLEC.g:1418:2: ( rule__VarDeclaration__TypeAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1()); 
            // InternalPLEC.g:1419:2: ( rule__VarDeclaration__TypeAssignment_1 )
            // InternalPLEC.g:1419:3: rule__VarDeclaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalPLEC.g:1427:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1431:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalPLEC.g:1432:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__VarDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__3();

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
    // $ANTLR end "rule__VarDeclaration__Group__2"


    // $ANTLR start "rule__VarDeclaration__Group__2__Impl"
    // InternalPLEC.g:1439:1: rule__VarDeclaration__Group__2__Impl : ( ( rule__VarDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1443:1: ( ( ( rule__VarDeclaration__NameAssignment_2 ) ) )
            // InternalPLEC.g:1444:1: ( ( rule__VarDeclaration__NameAssignment_2 ) )
            {
            // InternalPLEC.g:1444:1: ( ( rule__VarDeclaration__NameAssignment_2 ) )
            // InternalPLEC.g:1445:2: ( rule__VarDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_2()); 
            // InternalPLEC.g:1446:2: ( rule__VarDeclaration__NameAssignment_2 )
            // InternalPLEC.g:1446:3: rule__VarDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalPLEC.g:1454:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1458:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalPLEC.g:1459:2: rule__VarDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__VarDeclaration__Group__3"


    // $ANTLR start "rule__VarDeclaration__Group__3__Impl"
    // InternalPLEC.g:1465:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__Group_3__0 )? ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1469:1: ( ( ( rule__VarDeclaration__Group_3__0 )? ) )
            // InternalPLEC.g:1470:1: ( ( rule__VarDeclaration__Group_3__0 )? )
            {
            // InternalPLEC.g:1470:1: ( ( rule__VarDeclaration__Group_3__0 )? )
            // InternalPLEC.g:1471:2: ( rule__VarDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup_3()); 
            // InternalPLEC.g:1472:2: ( rule__VarDeclaration__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPLEC.g:1472:3: rule__VarDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarDeclarationAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__VarDeclaration__Group_0__0"
    // InternalPLEC.g:1481:1: rule__VarDeclaration__Group_0__0 : rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 ;
    public final void rule__VarDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1485:1: ( rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 )
            // InternalPLEC.g:1486:2: rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__VarDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0__1();

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
    // $ANTLR end "rule__VarDeclaration__Group_0__0"


    // $ANTLR start "rule__VarDeclaration__Group_0__0__Impl"
    // InternalPLEC.g:1493:1: rule__VarDeclaration__Group_0__0__Impl : ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) ) ;
    public final void rule__VarDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1497:1: ( ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) ) )
            // InternalPLEC.g:1498:1: ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) )
            {
            // InternalPLEC.g:1498:1: ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) )
            // InternalPLEC.g:1499:2: ( rule__VarDeclaration__InstantiableAssignment_0_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0_0()); 
            // InternalPLEC.g:1500:2: ( rule__VarDeclaration__InstantiableAssignment_0_0 )
            // InternalPLEC.g:1500:3: rule__VarDeclaration__InstantiableAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__InstantiableAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0__1"
    // InternalPLEC.g:1508:1: rule__VarDeclaration__Group_0__1 : rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2 ;
    public final void rule__VarDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1512:1: ( rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2 )
            // InternalPLEC.g:1513:2: rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__VarDeclaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0__2();

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
    // $ANTLR end "rule__VarDeclaration__Group_0__1"


    // $ANTLR start "rule__VarDeclaration__Group_0__1__Impl"
    // InternalPLEC.g:1520:1: rule__VarDeclaration__Group_0__1__Impl : ( '[' ) ;
    public final void rule__VarDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1524:1: ( ( '[' ) )
            // InternalPLEC.g:1525:1: ( '[' )
            {
            // InternalPLEC.g:1525:1: ( '[' )
            // InternalPLEC.g:1526:2: '['
            {
             before(grammarAccess.getVarDeclarationAccess().getLeftSquareBracketKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getLeftSquareBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0__2"
    // InternalPLEC.g:1535:1: rule__VarDeclaration__Group_0__2 : rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3 ;
    public final void rule__VarDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1539:1: ( rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3 )
            // InternalPLEC.g:1540:2: rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3
            {
            pushFollow(FOLLOW_12);
            rule__VarDeclaration__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0__3();

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
    // $ANTLR end "rule__VarDeclaration__Group_0__2"


    // $ANTLR start "rule__VarDeclaration__Group_0__2__Impl"
    // InternalPLEC.g:1547:1: rule__VarDeclaration__Group_0__2__Impl : ( ( rule__VarDeclaration__MinAssignment_0_2 ) ) ;
    public final void rule__VarDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1551:1: ( ( ( rule__VarDeclaration__MinAssignment_0_2 ) ) )
            // InternalPLEC.g:1552:1: ( ( rule__VarDeclaration__MinAssignment_0_2 ) )
            {
            // InternalPLEC.g:1552:1: ( ( rule__VarDeclaration__MinAssignment_0_2 ) )
            // InternalPLEC.g:1553:2: ( rule__VarDeclaration__MinAssignment_0_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getMinAssignment_0_2()); 
            // InternalPLEC.g:1554:2: ( rule__VarDeclaration__MinAssignment_0_2 )
            // InternalPLEC.g:1554:3: rule__VarDeclaration__MinAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__MinAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getMinAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0__3"
    // InternalPLEC.g:1562:1: rule__VarDeclaration__Group_0__3 : rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4 ;
    public final void rule__VarDeclaration__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1566:1: ( rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4 )
            // InternalPLEC.g:1567:2: rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4
            {
            pushFollow(FOLLOW_11);
            rule__VarDeclaration__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0__4();

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
    // $ANTLR end "rule__VarDeclaration__Group_0__3"


    // $ANTLR start "rule__VarDeclaration__Group_0__3__Impl"
    // InternalPLEC.g:1574:1: rule__VarDeclaration__Group_0__3__Impl : ( ',' ) ;
    public final void rule__VarDeclaration__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1578:1: ( ( ',' ) )
            // InternalPLEC.g:1579:1: ( ',' )
            {
            // InternalPLEC.g:1579:1: ( ',' )
            // InternalPLEC.g:1580:2: ','
            {
             before(grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__3__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0__4"
    // InternalPLEC.g:1589:1: rule__VarDeclaration__Group_0__4 : rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5 ;
    public final void rule__VarDeclaration__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1593:1: ( rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5 )
            // InternalPLEC.g:1594:2: rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5
            {
            pushFollow(FOLLOW_13);
            rule__VarDeclaration__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0__5();

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
    // $ANTLR end "rule__VarDeclaration__Group_0__4"


    // $ANTLR start "rule__VarDeclaration__Group_0__4__Impl"
    // InternalPLEC.g:1601:1: rule__VarDeclaration__Group_0__4__Impl : ( ( rule__VarDeclaration__MaxAssignment_0_4 ) ) ;
    public final void rule__VarDeclaration__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1605:1: ( ( ( rule__VarDeclaration__MaxAssignment_0_4 ) ) )
            // InternalPLEC.g:1606:1: ( ( rule__VarDeclaration__MaxAssignment_0_4 ) )
            {
            // InternalPLEC.g:1606:1: ( ( rule__VarDeclaration__MaxAssignment_0_4 ) )
            // InternalPLEC.g:1607:2: ( rule__VarDeclaration__MaxAssignment_0_4 )
            {
             before(grammarAccess.getVarDeclarationAccess().getMaxAssignment_0_4()); 
            // InternalPLEC.g:1608:2: ( rule__VarDeclaration__MaxAssignment_0_4 )
            // InternalPLEC.g:1608:3: rule__VarDeclaration__MaxAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__MaxAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getMaxAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__4__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0__5"
    // InternalPLEC.g:1616:1: rule__VarDeclaration__Group_0__5 : rule__VarDeclaration__Group_0__5__Impl ;
    public final void rule__VarDeclaration__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1620:1: ( rule__VarDeclaration__Group_0__5__Impl )
            // InternalPLEC.g:1621:2: rule__VarDeclaration__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0__5__Impl();

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
    // $ANTLR end "rule__VarDeclaration__Group_0__5"


    // $ANTLR start "rule__VarDeclaration__Group_0__5__Impl"
    // InternalPLEC.g:1627:1: rule__VarDeclaration__Group_0__5__Impl : ( ']' ) ;
    public final void rule__VarDeclaration__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1631:1: ( ( ']' ) )
            // InternalPLEC.g:1632:1: ( ']' )
            {
            // InternalPLEC.g:1632:1: ( ']' )
            // InternalPLEC.g:1633:2: ']'
            {
             before(grammarAccess.getVarDeclarationAccess().getRightSquareBracketKeyword_0_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getRightSquareBracketKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__5__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_3__0"
    // InternalPLEC.g:1643:1: rule__VarDeclaration__Group_3__0 : rule__VarDeclaration__Group_3__0__Impl rule__VarDeclaration__Group_3__1 ;
    public final void rule__VarDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1647:1: ( rule__VarDeclaration__Group_3__0__Impl rule__VarDeclaration__Group_3__1 )
            // InternalPLEC.g:1648:2: rule__VarDeclaration__Group_3__0__Impl rule__VarDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__VarDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_3__1();

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
    // $ANTLR end "rule__VarDeclaration__Group_3__0"


    // $ANTLR start "rule__VarDeclaration__Group_3__0__Impl"
    // InternalPLEC.g:1655:1: rule__VarDeclaration__Group_3__0__Impl : ( 'values:' ) ;
    public final void rule__VarDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1659:1: ( ( 'values:' ) )
            // InternalPLEC.g:1660:1: ( 'values:' )
            {
            // InternalPLEC.g:1660:1: ( 'values:' )
            // InternalPLEC.g:1661:2: 'values:'
            {
             before(grammarAccess.getVarDeclarationAccess().getValuesKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getValuesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_3__1"
    // InternalPLEC.g:1670:1: rule__VarDeclaration__Group_3__1 : rule__VarDeclaration__Group_3__1__Impl ;
    public final void rule__VarDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1674:1: ( rule__VarDeclaration__Group_3__1__Impl )
            // InternalPLEC.g:1675:2: rule__VarDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_3__1__Impl();

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
    // $ANTLR end "rule__VarDeclaration__Group_3__1"


    // $ANTLR start "rule__VarDeclaration__Group_3__1__Impl"
    // InternalPLEC.g:1681:1: rule__VarDeclaration__Group_3__1__Impl : ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) ) ;
    public final void rule__VarDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1685:1: ( ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) ) )
            // InternalPLEC.g:1686:1: ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) )
            {
            // InternalPLEC.g:1686:1: ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) )
            // InternalPLEC.g:1687:2: ( rule__VarDeclaration__VariantsAssignment_3_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_3_1()); 
            // InternalPLEC.g:1688:2: ( rule__VarDeclaration__VariantsAssignment_3_1 )
            // InternalPLEC.g:1688:3: rule__VarDeclaration__VariantsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VariantsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__VariantsInterval__Group__0"
    // InternalPLEC.g:1697:1: rule__VariantsInterval__Group__0 : rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 ;
    public final void rule__VariantsInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1701:1: ( rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 )
            // InternalPLEC.g:1702:2: rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__VariantsInterval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__1();

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
    // $ANTLR end "rule__VariantsInterval__Group__0"


    // $ANTLR start "rule__VariantsInterval__Group__0__Impl"
    // InternalPLEC.g:1709:1: rule__VariantsInterval__Group__0__Impl : ( ( rule__VariantsInterval__StartAssignment_0 ) ) ;
    public final void rule__VariantsInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1713:1: ( ( ( rule__VariantsInterval__StartAssignment_0 ) ) )
            // InternalPLEC.g:1714:1: ( ( rule__VariantsInterval__StartAssignment_0 ) )
            {
            // InternalPLEC.g:1714:1: ( ( rule__VariantsInterval__StartAssignment_0 ) )
            // InternalPLEC.g:1715:2: ( rule__VariantsInterval__StartAssignment_0 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartAssignment_0()); 
            // InternalPLEC.g:1716:2: ( rule__VariantsInterval__StartAssignment_0 )
            // InternalPLEC.g:1716:3: rule__VariantsInterval__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariantsIntervalAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__0__Impl"


    // $ANTLR start "rule__VariantsInterval__Group__1"
    // InternalPLEC.g:1724:1: rule__VariantsInterval__Group__1 : rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 ;
    public final void rule__VariantsInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1728:1: ( rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 )
            // InternalPLEC.g:1729:2: rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VariantsInterval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__2();

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
    // $ANTLR end "rule__VariantsInterval__Group__1"


    // $ANTLR start "rule__VariantsInterval__Group__1__Impl"
    // InternalPLEC.g:1736:1: rule__VariantsInterval__Group__1__Impl : ( '..' ) ;
    public final void rule__VariantsInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1740:1: ( ( '..' ) )
            // InternalPLEC.g:1741:1: ( '..' )
            {
            // InternalPLEC.g:1741:1: ( '..' )
            // InternalPLEC.g:1742:2: '..'
            {
             before(grammarAccess.getVariantsIntervalAccess().getFullStopFullStopKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVariantsIntervalAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__1__Impl"


    // $ANTLR start "rule__VariantsInterval__Group__2"
    // InternalPLEC.g:1751:1: rule__VariantsInterval__Group__2 : rule__VariantsInterval__Group__2__Impl ;
    public final void rule__VariantsInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1755:1: ( rule__VariantsInterval__Group__2__Impl )
            // InternalPLEC.g:1756:2: rule__VariantsInterval__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__2__Impl();

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
    // $ANTLR end "rule__VariantsInterval__Group__2"


    // $ANTLR start "rule__VariantsInterval__Group__2__Impl"
    // InternalPLEC.g:1762:1: rule__VariantsInterval__Group__2__Impl : ( ( rule__VariantsInterval__EndAssignment_2 ) ) ;
    public final void rule__VariantsInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1766:1: ( ( ( rule__VariantsInterval__EndAssignment_2 ) ) )
            // InternalPLEC.g:1767:1: ( ( rule__VariantsInterval__EndAssignment_2 ) )
            {
            // InternalPLEC.g:1767:1: ( ( rule__VariantsInterval__EndAssignment_2 ) )
            // InternalPLEC.g:1768:2: ( rule__VariantsInterval__EndAssignment_2 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndAssignment_2()); 
            // InternalPLEC.g:1769:2: ( rule__VariantsInterval__EndAssignment_2 )
            // InternalPLEC.g:1769:3: rule__VariantsInterval__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariantsIntervalAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__2__Impl"


    // $ANTLR start "rule__VariantsEnumeration__Group__0"
    // InternalPLEC.g:1778:1: rule__VariantsEnumeration__Group__0 : rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 ;
    public final void rule__VariantsEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1782:1: ( rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 )
            // InternalPLEC.g:1783:2: rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__VariantsEnumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__1();

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
    // $ANTLR end "rule__VariantsEnumeration__Group__0"


    // $ANTLR start "rule__VariantsEnumeration__Group__0__Impl"
    // InternalPLEC.g:1790:1: rule__VariantsEnumeration__Group__0__Impl : ( '[' ) ;
    public final void rule__VariantsEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1794:1: ( ( '[' ) )
            // InternalPLEC.g:1795:1: ( '[' )
            {
            // InternalPLEC.g:1795:1: ( '[' )
            // InternalPLEC.g:1796:2: '['
            {
             before(grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__0__Impl"


    // $ANTLR start "rule__VariantsEnumeration__Group__1"
    // InternalPLEC.g:1805:1: rule__VariantsEnumeration__Group__1 : rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 ;
    public final void rule__VariantsEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1809:1: ( rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 )
            // InternalPLEC.g:1810:2: rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__VariantsEnumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__2();

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
    // $ANTLR end "rule__VariantsEnumeration__Group__1"


    // $ANTLR start "rule__VariantsEnumeration__Group__1__Impl"
    // InternalPLEC.g:1817:1: rule__VariantsEnumeration__Group__1__Impl : ( ( rule__VariantsEnumeration__ListAssignment_1 ) ) ;
    public final void rule__VariantsEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1821:1: ( ( ( rule__VariantsEnumeration__ListAssignment_1 ) ) )
            // InternalPLEC.g:1822:1: ( ( rule__VariantsEnumeration__ListAssignment_1 ) )
            {
            // InternalPLEC.g:1822:1: ( ( rule__VariantsEnumeration__ListAssignment_1 ) )
            // InternalPLEC.g:1823:2: ( rule__VariantsEnumeration__ListAssignment_1 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListAssignment_1()); 
            // InternalPLEC.g:1824:2: ( rule__VariantsEnumeration__ListAssignment_1 )
            // InternalPLEC.g:1824:3: rule__VariantsEnumeration__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariantsEnumerationAccess().getListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__1__Impl"


    // $ANTLR start "rule__VariantsEnumeration__Group__2"
    // InternalPLEC.g:1832:1: rule__VariantsEnumeration__Group__2 : rule__VariantsEnumeration__Group__2__Impl ;
    public final void rule__VariantsEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1836:1: ( rule__VariantsEnumeration__Group__2__Impl )
            // InternalPLEC.g:1837:2: rule__VariantsEnumeration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__2__Impl();

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
    // $ANTLR end "rule__VariantsEnumeration__Group__2"


    // $ANTLR start "rule__VariantsEnumeration__Group__2__Impl"
    // InternalPLEC.g:1843:1: rule__VariantsEnumeration__Group__2__Impl : ( ']' ) ;
    public final void rule__VariantsEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1847:1: ( ( ']' ) )
            // InternalPLEC.g:1848:1: ( ']' )
            {
            // InternalPLEC.g:1848:1: ( ']' )
            // InternalPLEC.g:1849:2: ']'
            {
             before(grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalPLEC.g:1859:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1863:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalPLEC.g:1864:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPLEC.g:1871:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1875:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalPLEC.g:1876:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalPLEC.g:1876:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalPLEC.g:1877:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalPLEC.g:1878:2: ( rule__Constraint__NameAssignment_0 )
            // InternalPLEC.g:1878:3: rule__Constraint__NameAssignment_0
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
    // InternalPLEC.g:1886:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1890:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalPLEC.g:1891:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalPLEC.g:1898:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1902:1: ( ( ':' ) )
            // InternalPLEC.g:1903:1: ( ':' )
            {
            // InternalPLEC.g:1903:1: ( ':' )
            // InternalPLEC.g:1904:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPLEC.g:1913:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1917:1: ( rule__Constraint__Group__2__Impl )
            // InternalPLEC.g:1918:2: rule__Constraint__Group__2__Impl
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
    // InternalPLEC.g:1924:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1928:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalPLEC.g:1929:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalPLEC.g:1929:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalPLEC.g:1930:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalPLEC.g:1931:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalPLEC.g:1931:3: rule__Constraint__ExpAssignment_2
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


    // $ANTLR start "rule__TerminalExp__Group_0__0"
    // InternalPLEC.g:1940:1: rule__TerminalExp__Group_0__0 : rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 ;
    public final void rule__TerminalExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1944:1: ( rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 )
            // InternalPLEC.g:1945:2: rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__TerminalExp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExp__Group_0__1();

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
    // $ANTLR end "rule__TerminalExp__Group_0__0"


    // $ANTLR start "rule__TerminalExp__Group_0__0__Impl"
    // InternalPLEC.g:1952:1: rule__TerminalExp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1956:1: ( ( '(' ) )
            // InternalPLEC.g:1957:1: ( '(' )
            {
            // InternalPLEC.g:1957:1: ( '(' )
            // InternalPLEC.g:1958:2: '('
            {
             before(grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExp__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExp__Group_0__1"
    // InternalPLEC.g:1967:1: rule__TerminalExp__Group_0__1 : rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 ;
    public final void rule__TerminalExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1971:1: ( rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 )
            // InternalPLEC.g:1972:2: rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__TerminalExp__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExp__Group_0__2();

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
    // $ANTLR end "rule__TerminalExp__Group_0__1"


    // $ANTLR start "rule__TerminalExp__Group_0__1__Impl"
    // InternalPLEC.g:1979:1: rule__TerminalExp__Group_0__1__Impl : ( ruleConsExpression ) ;
    public final void rule__TerminalExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1983:1: ( ( ruleConsExpression ) )
            // InternalPLEC.g:1984:1: ( ruleConsExpression )
            {
            // InternalPLEC.g:1984:1: ( ruleConsExpression )
            // InternalPLEC.g:1985:2: ruleConsExpression
            {
             before(grammarAccess.getTerminalExpAccess().getConsExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleConsExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpAccess().getConsExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExp__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExp__Group_0__2"
    // InternalPLEC.g:1994:1: rule__TerminalExp__Group_0__2 : rule__TerminalExp__Group_0__2__Impl ;
    public final void rule__TerminalExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:1998:1: ( rule__TerminalExp__Group_0__2__Impl )
            // InternalPLEC.g:1999:2: rule__TerminalExp__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExp__Group_0__2__Impl();

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
    // $ANTLR end "rule__TerminalExp__Group_0__2"


    // $ANTLR start "rule__TerminalExp__Group_0__2__Impl"
    // InternalPLEC.g:2005:1: rule__TerminalExp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2009:1: ( ( ')' ) )
            // InternalPLEC.g:2010:1: ( ')' )
            {
            // InternalPLEC.g:2010:1: ( ')' )
            // InternalPLEC.g:2011:2: ')'
            {
             before(grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExp__Group_0__2__Impl"


    // $ANTLR start "rule__Structural__Group__0"
    // InternalPLEC.g:2021:1: rule__Structural__Group__0 : rule__Structural__Group__0__Impl rule__Structural__Group__1 ;
    public final void rule__Structural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2025:1: ( rule__Structural__Group__0__Impl rule__Structural__Group__1 )
            // InternalPLEC.g:2026:2: rule__Structural__Group__0__Impl rule__Structural__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Structural__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group__1();

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
    // $ANTLR end "rule__Structural__Group__0"


    // $ANTLR start "rule__Structural__Group__0__Impl"
    // InternalPLEC.g:2033:1: rule__Structural__Group__0__Impl : ( 'structural:' ) ;
    public final void rule__Structural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2037:1: ( ( 'structural:' ) )
            // InternalPLEC.g:2038:1: ( 'structural:' )
            {
            // InternalPLEC.g:2038:1: ( 'structural:' )
            // InternalPLEC.g:2039:2: 'structural:'
            {
             before(grammarAccess.getStructuralAccess().getStructuralKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getStructuralKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group__0__Impl"


    // $ANTLR start "rule__Structural__Group__1"
    // InternalPLEC.g:2048:1: rule__Structural__Group__1 : rule__Structural__Group__1__Impl rule__Structural__Group__2 ;
    public final void rule__Structural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2052:1: ( rule__Structural__Group__1__Impl rule__Structural__Group__2 )
            // InternalPLEC.g:2053:2: rule__Structural__Group__1__Impl rule__Structural__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Structural__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group__2();

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
    // $ANTLR end "rule__Structural__Group__1"


    // $ANTLR start "rule__Structural__Group__1__Impl"
    // InternalPLEC.g:2060:1: rule__Structural__Group__1__Impl : ( ( rule__Structural__ParentAssignment_1 ) ) ;
    public final void rule__Structural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2064:1: ( ( ( rule__Structural__ParentAssignment_1 ) ) )
            // InternalPLEC.g:2065:1: ( ( rule__Structural__ParentAssignment_1 ) )
            {
            // InternalPLEC.g:2065:1: ( ( rule__Structural__ParentAssignment_1 ) )
            // InternalPLEC.g:2066:2: ( rule__Structural__ParentAssignment_1 )
            {
             before(grammarAccess.getStructuralAccess().getParentAssignment_1()); 
            // InternalPLEC.g:2067:2: ( rule__Structural__ParentAssignment_1 )
            // InternalPLEC.g:2067:3: rule__Structural__ParentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Structural__ParentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructuralAccess().getParentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group__1__Impl"


    // $ANTLR start "rule__Structural__Group__2"
    // InternalPLEC.g:2075:1: rule__Structural__Group__2 : rule__Structural__Group__2__Impl rule__Structural__Group__3 ;
    public final void rule__Structural__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2079:1: ( rule__Structural__Group__2__Impl rule__Structural__Group__3 )
            // InternalPLEC.g:2080:2: rule__Structural__Group__2__Impl rule__Structural__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Structural__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group__3();

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
    // $ANTLR end "rule__Structural__Group__2"


    // $ANTLR start "rule__Structural__Group__2__Impl"
    // InternalPLEC.g:2087:1: rule__Structural__Group__2__Impl : ( 'variants:' ) ;
    public final void rule__Structural__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2091:1: ( ( 'variants:' ) )
            // InternalPLEC.g:2092:1: ( 'variants:' )
            {
            // InternalPLEC.g:2092:1: ( 'variants:' )
            // InternalPLEC.g:2093:2: 'variants:'
            {
             before(grammarAccess.getStructuralAccess().getVariantsKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getVariantsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group__2__Impl"


    // $ANTLR start "rule__Structural__Group__3"
    // InternalPLEC.g:2102:1: rule__Structural__Group__3 : rule__Structural__Group__3__Impl rule__Structural__Group__4 ;
    public final void rule__Structural__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2106:1: ( rule__Structural__Group__3__Impl rule__Structural__Group__4 )
            // InternalPLEC.g:2107:2: rule__Structural__Group__3__Impl rule__Structural__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Structural__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group__4();

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
    // $ANTLR end "rule__Structural__Group__3"


    // $ANTLR start "rule__Structural__Group__3__Impl"
    // InternalPLEC.g:2114:1: rule__Structural__Group__3__Impl : ( '[' ) ;
    public final void rule__Structural__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2118:1: ( ( '[' ) )
            // InternalPLEC.g:2119:1: ( '[' )
            {
            // InternalPLEC.g:2119:1: ( '[' )
            // InternalPLEC.g:2120:2: '['
            {
             before(grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group__3__Impl"


    // $ANTLR start "rule__Structural__Group__4"
    // InternalPLEC.g:2129:1: rule__Structural__Group__4 : rule__Structural__Group__4__Impl rule__Structural__Group__5 ;
    public final void rule__Structural__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2133:1: ( rule__Structural__Group__4__Impl rule__Structural__Group__5 )
            // InternalPLEC.g:2134:2: rule__Structural__Group__4__Impl rule__Structural__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Structural__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group__5();

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
    // $ANTLR end "rule__Structural__Group__4"


    // $ANTLR start "rule__Structural__Group__4__Impl"
    // InternalPLEC.g:2141:1: rule__Structural__Group__4__Impl : ( ( rule__Structural__GroupAssignment_4 ) ) ;
    public final void rule__Structural__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2145:1: ( ( ( rule__Structural__GroupAssignment_4 ) ) )
            // InternalPLEC.g:2146:1: ( ( rule__Structural__GroupAssignment_4 ) )
            {
            // InternalPLEC.g:2146:1: ( ( rule__Structural__GroupAssignment_4 ) )
            // InternalPLEC.g:2147:2: ( rule__Structural__GroupAssignment_4 )
            {
             before(grammarAccess.getStructuralAccess().getGroupAssignment_4()); 
            // InternalPLEC.g:2148:2: ( rule__Structural__GroupAssignment_4 )
            // InternalPLEC.g:2148:3: rule__Structural__GroupAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Structural__GroupAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStructuralAccess().getGroupAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group__4__Impl"


    // $ANTLR start "rule__Structural__Group__5"
    // InternalPLEC.g:2156:1: rule__Structural__Group__5 : rule__Structural__Group__5__Impl rule__Structural__Group__6 ;
    public final void rule__Structural__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2160:1: ( rule__Structural__Group__5__Impl rule__Structural__Group__6 )
            // InternalPLEC.g:2161:2: rule__Structural__Group__5__Impl rule__Structural__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Structural__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group__6();

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
    // $ANTLR end "rule__Structural__Group__5"


    // $ANTLR start "rule__Structural__Group__5__Impl"
    // InternalPLEC.g:2168:1: rule__Structural__Group__5__Impl : ( ']' ) ;
    public final void rule__Structural__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2172:1: ( ( ']' ) )
            // InternalPLEC.g:2173:1: ( ']' )
            {
            // InternalPLEC.g:2173:1: ( ']' )
            // InternalPLEC.g:2174:2: ']'
            {
             before(grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group__5__Impl"


    // $ANTLR start "rule__Structural__Group__6"
    // InternalPLEC.g:2183:1: rule__Structural__Group__6 : rule__Structural__Group__6__Impl ;
    public final void rule__Structural__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2187:1: ( rule__Structural__Group__6__Impl )
            // InternalPLEC.g:2188:2: rule__Structural__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structural__Group__6__Impl();

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
    // $ANTLR end "rule__Structural__Group__6"


    // $ANTLR start "rule__Structural__Group__6__Impl"
    // InternalPLEC.g:2194:1: rule__Structural__Group__6__Impl : ( ( rule__Structural__Group_6__0 )? ) ;
    public final void rule__Structural__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2198:1: ( ( ( rule__Structural__Group_6__0 )? ) )
            // InternalPLEC.g:2199:1: ( ( rule__Structural__Group_6__0 )? )
            {
            // InternalPLEC.g:2199:1: ( ( rule__Structural__Group_6__0 )? )
            // InternalPLEC.g:2200:2: ( rule__Structural__Group_6__0 )?
            {
             before(grammarAccess.getStructuralAccess().getGroup_6()); 
            // InternalPLEC.g:2201:2: ( rule__Structural__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPLEC.g:2201:3: rule__Structural__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structural__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructuralAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group__6__Impl"


    // $ANTLR start "rule__Structural__Group_6__0"
    // InternalPLEC.g:2210:1: rule__Structural__Group_6__0 : rule__Structural__Group_6__0__Impl rule__Structural__Group_6__1 ;
    public final void rule__Structural__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2214:1: ( rule__Structural__Group_6__0__Impl rule__Structural__Group_6__1 )
            // InternalPLEC.g:2215:2: rule__Structural__Group_6__0__Impl rule__Structural__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Structural__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_6__1();

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
    // $ANTLR end "rule__Structural__Group_6__0"


    // $ANTLR start "rule__Structural__Group_6__0__Impl"
    // InternalPLEC.g:2222:1: rule__Structural__Group_6__0__Impl : ( 'card:' ) ;
    public final void rule__Structural__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2226:1: ( ( 'card:' ) )
            // InternalPLEC.g:2227:1: ( 'card:' )
            {
            // InternalPLEC.g:2227:1: ( 'card:' )
            // InternalPLEC.g:2228:2: 'card:'
            {
             before(grammarAccess.getStructuralAccess().getCardKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getCardKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_6__0__Impl"


    // $ANTLR start "rule__Structural__Group_6__1"
    // InternalPLEC.g:2237:1: rule__Structural__Group_6__1 : rule__Structural__Group_6__1__Impl rule__Structural__Group_6__2 ;
    public final void rule__Structural__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2241:1: ( rule__Structural__Group_6__1__Impl rule__Structural__Group_6__2 )
            // InternalPLEC.g:2242:2: rule__Structural__Group_6__1__Impl rule__Structural__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__Structural__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_6__2();

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
    // $ANTLR end "rule__Structural__Group_6__1"


    // $ANTLR start "rule__Structural__Group_6__1__Impl"
    // InternalPLEC.g:2249:1: rule__Structural__Group_6__1__Impl : ( '[' ) ;
    public final void rule__Structural__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2253:1: ( ( '[' ) )
            // InternalPLEC.g:2254:1: ( '[' )
            {
            // InternalPLEC.g:2254:1: ( '[' )
            // InternalPLEC.g:2255:2: '['
            {
             before(grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_6__1__Impl"


    // $ANTLR start "rule__Structural__Group_6__2"
    // InternalPLEC.g:2264:1: rule__Structural__Group_6__2 : rule__Structural__Group_6__2__Impl rule__Structural__Group_6__3 ;
    public final void rule__Structural__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2268:1: ( rule__Structural__Group_6__2__Impl rule__Structural__Group_6__3 )
            // InternalPLEC.g:2269:2: rule__Structural__Group_6__2__Impl rule__Structural__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__Structural__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_6__3();

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
    // $ANTLR end "rule__Structural__Group_6__2"


    // $ANTLR start "rule__Structural__Group_6__2__Impl"
    // InternalPLEC.g:2276:1: rule__Structural__Group_6__2__Impl : ( ( rule__Structural__MinAssignment_6_2 ) ) ;
    public final void rule__Structural__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2280:1: ( ( ( rule__Structural__MinAssignment_6_2 ) ) )
            // InternalPLEC.g:2281:1: ( ( rule__Structural__MinAssignment_6_2 ) )
            {
            // InternalPLEC.g:2281:1: ( ( rule__Structural__MinAssignment_6_2 ) )
            // InternalPLEC.g:2282:2: ( rule__Structural__MinAssignment_6_2 )
            {
             before(grammarAccess.getStructuralAccess().getMinAssignment_6_2()); 
            // InternalPLEC.g:2283:2: ( rule__Structural__MinAssignment_6_2 )
            // InternalPLEC.g:2283:3: rule__Structural__MinAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Structural__MinAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getStructuralAccess().getMinAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_6__2__Impl"


    // $ANTLR start "rule__Structural__Group_6__3"
    // InternalPLEC.g:2291:1: rule__Structural__Group_6__3 : rule__Structural__Group_6__3__Impl rule__Structural__Group_6__4 ;
    public final void rule__Structural__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2295:1: ( rule__Structural__Group_6__3__Impl rule__Structural__Group_6__4 )
            // InternalPLEC.g:2296:2: rule__Structural__Group_6__3__Impl rule__Structural__Group_6__4
            {
            pushFollow(FOLLOW_11);
            rule__Structural__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_6__4();

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
    // $ANTLR end "rule__Structural__Group_6__3"


    // $ANTLR start "rule__Structural__Group_6__3__Impl"
    // InternalPLEC.g:2303:1: rule__Structural__Group_6__3__Impl : ( ',' ) ;
    public final void rule__Structural__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2307:1: ( ( ',' ) )
            // InternalPLEC.g:2308:1: ( ',' )
            {
            // InternalPLEC.g:2308:1: ( ',' )
            // InternalPLEC.g:2309:2: ','
            {
             before(grammarAccess.getStructuralAccess().getCommaKeyword_6_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getCommaKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_6__3__Impl"


    // $ANTLR start "rule__Structural__Group_6__4"
    // InternalPLEC.g:2318:1: rule__Structural__Group_6__4 : rule__Structural__Group_6__4__Impl rule__Structural__Group_6__5 ;
    public final void rule__Structural__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2322:1: ( rule__Structural__Group_6__4__Impl rule__Structural__Group_6__5 )
            // InternalPLEC.g:2323:2: rule__Structural__Group_6__4__Impl rule__Structural__Group_6__5
            {
            pushFollow(FOLLOW_13);
            rule__Structural__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_6__5();

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
    // $ANTLR end "rule__Structural__Group_6__4"


    // $ANTLR start "rule__Structural__Group_6__4__Impl"
    // InternalPLEC.g:2330:1: rule__Structural__Group_6__4__Impl : ( ( rule__Structural__MaxAssignment_6_4 ) ) ;
    public final void rule__Structural__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2334:1: ( ( ( rule__Structural__MaxAssignment_6_4 ) ) )
            // InternalPLEC.g:2335:1: ( ( rule__Structural__MaxAssignment_6_4 ) )
            {
            // InternalPLEC.g:2335:1: ( ( rule__Structural__MaxAssignment_6_4 ) )
            // InternalPLEC.g:2336:2: ( rule__Structural__MaxAssignment_6_4 )
            {
             before(grammarAccess.getStructuralAccess().getMaxAssignment_6_4()); 
            // InternalPLEC.g:2337:2: ( rule__Structural__MaxAssignment_6_4 )
            // InternalPLEC.g:2337:3: rule__Structural__MaxAssignment_6_4
            {
            pushFollow(FOLLOW_2);
            rule__Structural__MaxAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getStructuralAccess().getMaxAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_6__4__Impl"


    // $ANTLR start "rule__Structural__Group_6__5"
    // InternalPLEC.g:2345:1: rule__Structural__Group_6__5 : rule__Structural__Group_6__5__Impl ;
    public final void rule__Structural__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2349:1: ( rule__Structural__Group_6__5__Impl )
            // InternalPLEC.g:2350:2: rule__Structural__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structural__Group_6__5__Impl();

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
    // $ANTLR end "rule__Structural__Group_6__5"


    // $ANTLR start "rule__Structural__Group_6__5__Impl"
    // InternalPLEC.g:2356:1: rule__Structural__Group_6__5__Impl : ( ']' ) ;
    public final void rule__Structural__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2360:1: ( ( ']' ) )
            // InternalPLEC.g:2361:1: ( ']' )
            {
            // InternalPLEC.g:2361:1: ( ']' )
            // InternalPLEC.g:2362:2: ']'
            {
             before(grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_6_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_6__5__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalPLEC.g:2372:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2376:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalPLEC.g:2377:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

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
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalPLEC.g:2384:1: rule__Attributes__Group__0__Impl : ( 'attributes:' ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2388:1: ( ( 'attributes:' ) )
            // InternalPLEC.g:2389:1: ( 'attributes:' )
            {
            // InternalPLEC.g:2389:1: ( 'attributes:' )
            // InternalPLEC.g:2390:2: 'attributes:'
            {
             before(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalPLEC.g:2399:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl rule__Attributes__Group__2 ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2403:1: ( rule__Attributes__Group__1__Impl rule__Attributes__Group__2 )
            // InternalPLEC.g:2404:2: rule__Attributes__Group__1__Impl rule__Attributes__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Attributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__2();

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
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalPLEC.g:2411:1: rule__Attributes__Group__1__Impl : ( '[' ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2415:1: ( ( '[' ) )
            // InternalPLEC.g:2416:1: ( '[' )
            {
            // InternalPLEC.g:2416:1: ( '[' )
            // InternalPLEC.g:2417:2: '['
            {
             before(grammarAccess.getAttributesAccess().getLeftSquareBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attributes__Group__2"
    // InternalPLEC.g:2426:1: rule__Attributes__Group__2 : rule__Attributes__Group__2__Impl rule__Attributes__Group__3 ;
    public final void rule__Attributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2430:1: ( rule__Attributes__Group__2__Impl rule__Attributes__Group__3 )
            // InternalPLEC.g:2431:2: rule__Attributes__Group__2__Impl rule__Attributes__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Attributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__3();

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
    // $ANTLR end "rule__Attributes__Group__2"


    // $ANTLR start "rule__Attributes__Group__2__Impl"
    // InternalPLEC.g:2438:1: rule__Attributes__Group__2__Impl : ( ( rule__Attributes__AttAssignment_2 ) ) ;
    public final void rule__Attributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2442:1: ( ( ( rule__Attributes__AttAssignment_2 ) ) )
            // InternalPLEC.g:2443:1: ( ( rule__Attributes__AttAssignment_2 ) )
            {
            // InternalPLEC.g:2443:1: ( ( rule__Attributes__AttAssignment_2 ) )
            // InternalPLEC.g:2444:2: ( rule__Attributes__AttAssignment_2 )
            {
             before(grammarAccess.getAttributesAccess().getAttAssignment_2()); 
            // InternalPLEC.g:2445:2: ( rule__Attributes__AttAssignment_2 )
            // InternalPLEC.g:2445:3: rule__Attributes__AttAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__AttAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAttAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__2__Impl"


    // $ANTLR start "rule__Attributes__Group__3"
    // InternalPLEC.g:2453:1: rule__Attributes__Group__3 : rule__Attributes__Group__3__Impl rule__Attributes__Group__4 ;
    public final void rule__Attributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2457:1: ( rule__Attributes__Group__3__Impl rule__Attributes__Group__4 )
            // InternalPLEC.g:2458:2: rule__Attributes__Group__3__Impl rule__Attributes__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Attributes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__4();

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
    // $ANTLR end "rule__Attributes__Group__3"


    // $ANTLR start "rule__Attributes__Group__3__Impl"
    // InternalPLEC.g:2465:1: rule__Attributes__Group__3__Impl : ( ']' ) ;
    public final void rule__Attributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2469:1: ( ( ']' ) )
            // InternalPLEC.g:2470:1: ( ']' )
            {
            // InternalPLEC.g:2470:1: ( ']' )
            // InternalPLEC.g:2471:2: ']'
            {
             before(grammarAccess.getAttributesAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__3__Impl"


    // $ANTLR start "rule__Attributes__Group__4"
    // InternalPLEC.g:2480:1: rule__Attributes__Group__4 : rule__Attributes__Group__4__Impl rule__Attributes__Group__5 ;
    public final void rule__Attributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2484:1: ( rule__Attributes__Group__4__Impl rule__Attributes__Group__5 )
            // InternalPLEC.g:2485:2: rule__Attributes__Group__4__Impl rule__Attributes__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Attributes__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__5();

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
    // $ANTLR end "rule__Attributes__Group__4"


    // $ANTLR start "rule__Attributes__Group__4__Impl"
    // InternalPLEC.g:2492:1: rule__Attributes__Group__4__Impl : ( 'of' ) ;
    public final void rule__Attributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2496:1: ( ( 'of' ) )
            // InternalPLEC.g:2497:1: ( 'of' )
            {
            // InternalPLEC.g:2497:1: ( 'of' )
            // InternalPLEC.g:2498:2: 'of'
            {
             before(grammarAccess.getAttributesAccess().getOfKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__4__Impl"


    // $ANTLR start "rule__Attributes__Group__5"
    // InternalPLEC.g:2507:1: rule__Attributes__Group__5 : rule__Attributes__Group__5__Impl ;
    public final void rule__Attributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2511:1: ( rule__Attributes__Group__5__Impl )
            // InternalPLEC.g:2512:2: rule__Attributes__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__5__Impl();

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
    // $ANTLR end "rule__Attributes__Group__5"


    // $ANTLR start "rule__Attributes__Group__5__Impl"
    // InternalPLEC.g:2518:1: rule__Attributes__Group__5__Impl : ( ( rule__Attributes__Var1Assignment_5 ) ) ;
    public final void rule__Attributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2522:1: ( ( ( rule__Attributes__Var1Assignment_5 ) ) )
            // InternalPLEC.g:2523:1: ( ( rule__Attributes__Var1Assignment_5 ) )
            {
            // InternalPLEC.g:2523:1: ( ( rule__Attributes__Var1Assignment_5 ) )
            // InternalPLEC.g:2524:2: ( rule__Attributes__Var1Assignment_5 )
            {
             before(grammarAccess.getAttributesAccess().getVar1Assignment_5()); 
            // InternalPLEC.g:2525:2: ( rule__Attributes__Var1Assignment_5 )
            // InternalPLEC.g:2525:3: rule__Attributes__Var1Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Var1Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getVar1Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__5__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalPLEC.g:2534:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2538:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalPLEC.g:2539:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalPLEC.g:2546:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2550:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // InternalPLEC.g:2551:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // InternalPLEC.g:2551:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // InternalPLEC.g:2552:2: ( rule__Assignment__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            // InternalPLEC.g:2553:2: ( rule__Assignment__VariableAssignment_0 )
            // InternalPLEC.g:2553:3: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalPLEC.g:2561:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2565:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalPLEC.g:2566:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalPLEC.g:2573:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2577:1: ( ( 'is' ) )
            // InternalPLEC.g:2578:1: ( 'is' )
            {
            // InternalPLEC.g:2578:1: ( 'is' )
            // InternalPLEC.g:2579:2: 'is'
            {
             before(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalPLEC.g:2588:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2592:1: ( rule__Assignment__Group__2__Impl )
            // InternalPLEC.g:2593:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalPLEC.g:2599:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValuAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2603:1: ( ( ( rule__Assignment__ValuAssignment_2 ) ) )
            // InternalPLEC.g:2604:1: ( ( rule__Assignment__ValuAssignment_2 ) )
            {
            // InternalPLEC.g:2604:1: ( ( rule__Assignment__ValuAssignment_2 ) )
            // InternalPLEC.g:2605:2: ( rule__Assignment__ValuAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValuAssignment_2()); 
            // InternalPLEC.g:2606:2: ( rule__Assignment__ValuAssignment_2 )
            // InternalPLEC.g:2606:3: rule__Assignment__ValuAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValuAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValuAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__VarRefinement__Group__0"
    // InternalPLEC.g:2615:1: rule__VarRefinement__Group__0 : rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 ;
    public final void rule__VarRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2619:1: ( rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 )
            // InternalPLEC.g:2620:2: rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__VarRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarRefinement__Group__1();

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
    // $ANTLR end "rule__VarRefinement__Group__0"


    // $ANTLR start "rule__VarRefinement__Group__0__Impl"
    // InternalPLEC.g:2627:1: rule__VarRefinement__Group__0__Impl : ( ( rule__VarRefinement__VarAssignment_0 ) ) ;
    public final void rule__VarRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2631:1: ( ( ( rule__VarRefinement__VarAssignment_0 ) ) )
            // InternalPLEC.g:2632:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            {
            // InternalPLEC.g:2632:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            // InternalPLEC.g:2633:2: ( rule__VarRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 
            // InternalPLEC.g:2634:2: ( rule__VarRefinement__VarAssignment_0 )
            // InternalPLEC.g:2634:3: rule__VarRefinement__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarRefinement__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__Group__0__Impl"


    // $ANTLR start "rule__VarRefinement__Group__1"
    // InternalPLEC.g:2642:1: rule__VarRefinement__Group__1 : rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 ;
    public final void rule__VarRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2646:1: ( rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 )
            // InternalPLEC.g:2647:2: rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__VarRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarRefinement__Group__2();

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
    // $ANTLR end "rule__VarRefinement__Group__1"


    // $ANTLR start "rule__VarRefinement__Group__1__Impl"
    // InternalPLEC.g:2654:1: rule__VarRefinement__Group__1__Impl : ( 'in' ) ;
    public final void rule__VarRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2658:1: ( ( 'in' ) )
            // InternalPLEC.g:2659:1: ( 'in' )
            {
            // InternalPLEC.g:2659:1: ( 'in' )
            // InternalPLEC.g:2660:2: 'in'
            {
             before(grammarAccess.getVarRefinementAccess().getInKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVarRefinementAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__Group__1__Impl"


    // $ANTLR start "rule__VarRefinement__Group__2"
    // InternalPLEC.g:2669:1: rule__VarRefinement__Group__2 : rule__VarRefinement__Group__2__Impl ;
    public final void rule__VarRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2673:1: ( rule__VarRefinement__Group__2__Impl )
            // InternalPLEC.g:2674:2: rule__VarRefinement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarRefinement__Group__2__Impl();

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
    // $ANTLR end "rule__VarRefinement__Group__2"


    // $ANTLR start "rule__VarRefinement__Group__2__Impl"
    // InternalPLEC.g:2680:1: rule__VarRefinement__Group__2__Impl : ( ( rule__VarRefinement__ValuesAssignment_2 ) ) ;
    public final void rule__VarRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2684:1: ( ( ( rule__VarRefinement__ValuesAssignment_2 ) ) )
            // InternalPLEC.g:2685:1: ( ( rule__VarRefinement__ValuesAssignment_2 ) )
            {
            // InternalPLEC.g:2685:1: ( ( rule__VarRefinement__ValuesAssignment_2 ) )
            // InternalPLEC.g:2686:2: ( rule__VarRefinement__ValuesAssignment_2 )
            {
             before(grammarAccess.getVarRefinementAccess().getValuesAssignment_2()); 
            // InternalPLEC.g:2687:2: ( rule__VarRefinement__ValuesAssignment_2 )
            // InternalPLEC.g:2687:3: rule__VarRefinement__ValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarRefinement__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarRefinementAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__Group__2__Impl"


    // $ANTLR start "rule__SetRefinement__Group__0"
    // InternalPLEC.g:2696:1: rule__SetRefinement__Group__0 : rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 ;
    public final void rule__SetRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2700:1: ( rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 )
            // InternalPLEC.g:2701:2: rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SetRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__1();

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
    // $ANTLR end "rule__SetRefinement__Group__0"


    // $ANTLR start "rule__SetRefinement__Group__0__Impl"
    // InternalPLEC.g:2708:1: rule__SetRefinement__Group__0__Impl : ( 'vars:' ) ;
    public final void rule__SetRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2712:1: ( ( 'vars:' ) )
            // InternalPLEC.g:2713:1: ( 'vars:' )
            {
            // InternalPLEC.g:2713:1: ( 'vars:' )
            // InternalPLEC.g:2714:2: 'vars:'
            {
             before(grammarAccess.getSetRefinementAccess().getVarsKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getVarsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__0__Impl"


    // $ANTLR start "rule__SetRefinement__Group__1"
    // InternalPLEC.g:2723:1: rule__SetRefinement__Group__1 : rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 ;
    public final void rule__SetRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2727:1: ( rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 )
            // InternalPLEC.g:2728:2: rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SetRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__2();

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
    // $ANTLR end "rule__SetRefinement__Group__1"


    // $ANTLR start "rule__SetRefinement__Group__1__Impl"
    // InternalPLEC.g:2735:1: rule__SetRefinement__Group__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2739:1: ( ( '(' ) )
            // InternalPLEC.g:2740:1: ( '(' )
            {
            // InternalPLEC.g:2740:1: ( '(' )
            // InternalPLEC.g:2741:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__1__Impl"


    // $ANTLR start "rule__SetRefinement__Group__2"
    // InternalPLEC.g:2750:1: rule__SetRefinement__Group__2 : rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 ;
    public final void rule__SetRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2754:1: ( rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 )
            // InternalPLEC.g:2755:2: rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__SetRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__3();

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
    // $ANTLR end "rule__SetRefinement__Group__2"


    // $ANTLR start "rule__SetRefinement__Group__2__Impl"
    // InternalPLEC.g:2762:1: rule__SetRefinement__Group__2__Impl : ( ( rule__SetRefinement__VarsAssignment_2 ) ) ;
    public final void rule__SetRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2766:1: ( ( ( rule__SetRefinement__VarsAssignment_2 ) ) )
            // InternalPLEC.g:2767:1: ( ( rule__SetRefinement__VarsAssignment_2 ) )
            {
            // InternalPLEC.g:2767:1: ( ( rule__SetRefinement__VarsAssignment_2 ) )
            // InternalPLEC.g:2768:2: ( rule__SetRefinement__VarsAssignment_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getVarsAssignment_2()); 
            // InternalPLEC.g:2769:2: ( rule__SetRefinement__VarsAssignment_2 )
            // InternalPLEC.g:2769:3: rule__SetRefinement__VarsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__VarsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getVarsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__2__Impl"


    // $ANTLR start "rule__SetRefinement__Group__3"
    // InternalPLEC.g:2777:1: rule__SetRefinement__Group__3 : rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 ;
    public final void rule__SetRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2781:1: ( rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 )
            // InternalPLEC.g:2782:2: rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__SetRefinement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__4();

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
    // $ANTLR end "rule__SetRefinement__Group__3"


    // $ANTLR start "rule__SetRefinement__Group__3__Impl"
    // InternalPLEC.g:2789:1: rule__SetRefinement__Group__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2793:1: ( ( ')' ) )
            // InternalPLEC.g:2794:1: ( ')' )
            {
            // InternalPLEC.g:2794:1: ( ')' )
            // InternalPLEC.g:2795:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__3__Impl"


    // $ANTLR start "rule__SetRefinement__Group__4"
    // InternalPLEC.g:2804:1: rule__SetRefinement__Group__4 : rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 ;
    public final void rule__SetRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2808:1: ( rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 )
            // InternalPLEC.g:2809:2: rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__SetRefinement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__5();

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
    // $ANTLR end "rule__SetRefinement__Group__4"


    // $ANTLR start "rule__SetRefinement__Group__4__Impl"
    // InternalPLEC.g:2816:1: rule__SetRefinement__Group__4__Impl : ( 'variants:' ) ;
    public final void rule__SetRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2820:1: ( ( 'variants:' ) )
            // InternalPLEC.g:2821:1: ( 'variants:' )
            {
            // InternalPLEC.g:2821:1: ( 'variants:' )
            // InternalPLEC.g:2822:2: 'variants:'
            {
             before(grammarAccess.getSetRefinementAccess().getVariantsKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getVariantsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__4__Impl"


    // $ANTLR start "rule__SetRefinement__Group__5"
    // InternalPLEC.g:2831:1: rule__SetRefinement__Group__5 : rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 ;
    public final void rule__SetRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2835:1: ( rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 )
            // InternalPLEC.g:2836:2: rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__SetRefinement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__6();

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
    // $ANTLR end "rule__SetRefinement__Group__5"


    // $ANTLR start "rule__SetRefinement__Group__5__Impl"
    // InternalPLEC.g:2843:1: rule__SetRefinement__Group__5__Impl : ( '[' ) ;
    public final void rule__SetRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2847:1: ( ( '[' ) )
            // InternalPLEC.g:2848:1: ( '[' )
            {
            // InternalPLEC.g:2848:1: ( '[' )
            // InternalPLEC.g:2849:2: '['
            {
             before(grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__5__Impl"


    // $ANTLR start "rule__SetRefinement__Group__6"
    // InternalPLEC.g:2858:1: rule__SetRefinement__Group__6 : rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 ;
    public final void rule__SetRefinement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2862:1: ( rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 )
            // InternalPLEC.g:2863:2: rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__SetRefinement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__7();

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
    // $ANTLR end "rule__SetRefinement__Group__6"


    // $ANTLR start "rule__SetRefinement__Group__6__Impl"
    // InternalPLEC.g:2870:1: rule__SetRefinement__Group__6__Impl : ( ( rule__SetRefinement__ListAssignment_6 ) ) ;
    public final void rule__SetRefinement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2874:1: ( ( ( rule__SetRefinement__ListAssignment_6 ) ) )
            // InternalPLEC.g:2875:1: ( ( rule__SetRefinement__ListAssignment_6 ) )
            {
            // InternalPLEC.g:2875:1: ( ( rule__SetRefinement__ListAssignment_6 ) )
            // InternalPLEC.g:2876:2: ( rule__SetRefinement__ListAssignment_6 )
            {
             before(grammarAccess.getSetRefinementAccess().getListAssignment_6()); 
            // InternalPLEC.g:2877:2: ( rule__SetRefinement__ListAssignment_6 )
            // InternalPLEC.g:2877:3: rule__SetRefinement__ListAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__ListAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getListAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__6__Impl"


    // $ANTLR start "rule__SetRefinement__Group__7"
    // InternalPLEC.g:2885:1: rule__SetRefinement__Group__7 : rule__SetRefinement__Group__7__Impl ;
    public final void rule__SetRefinement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2889:1: ( rule__SetRefinement__Group__7__Impl )
            // InternalPLEC.g:2890:2: rule__SetRefinement__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__7__Impl();

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
    // $ANTLR end "rule__SetRefinement__Group__7"


    // $ANTLR start "rule__SetRefinement__Group__7__Impl"
    // InternalPLEC.g:2896:1: rule__SetRefinement__Group__7__Impl : ( ']' ) ;
    public final void rule__SetRefinement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2900:1: ( ( ']' ) )
            // InternalPLEC.g:2901:1: ( ']' )
            {
            // InternalPLEC.g:2901:1: ( ']' )
            // InternalPLEC.g:2902:2: ']'
            {
             before(grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__7__Impl"


    // $ANTLR start "rule__RootRefinement__Group__0"
    // InternalPLEC.g:2912:1: rule__RootRefinement__Group__0 : rule__RootRefinement__Group__0__Impl rule__RootRefinement__Group__1 ;
    public final void rule__RootRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2916:1: ( rule__RootRefinement__Group__0__Impl rule__RootRefinement__Group__1 )
            // InternalPLEC.g:2917:2: rule__RootRefinement__Group__0__Impl rule__RootRefinement__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RootRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootRefinement__Group__1();

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
    // $ANTLR end "rule__RootRefinement__Group__0"


    // $ANTLR start "rule__RootRefinement__Group__0__Impl"
    // InternalPLEC.g:2924:1: rule__RootRefinement__Group__0__Impl : ( ( rule__RootRefinement__VarAssignment_0 ) ) ;
    public final void rule__RootRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2928:1: ( ( ( rule__RootRefinement__VarAssignment_0 ) ) )
            // InternalPLEC.g:2929:1: ( ( rule__RootRefinement__VarAssignment_0 ) )
            {
            // InternalPLEC.g:2929:1: ( ( rule__RootRefinement__VarAssignment_0 ) )
            // InternalPLEC.g:2930:2: ( rule__RootRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getRootRefinementAccess().getVarAssignment_0()); 
            // InternalPLEC.g:2931:2: ( rule__RootRefinement__VarAssignment_0 )
            // InternalPLEC.g:2931:3: rule__RootRefinement__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RootRefinement__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRootRefinementAccess().getVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootRefinement__Group__0__Impl"


    // $ANTLR start "rule__RootRefinement__Group__1"
    // InternalPLEC.g:2939:1: rule__RootRefinement__Group__1 : rule__RootRefinement__Group__1__Impl rule__RootRefinement__Group__2 ;
    public final void rule__RootRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2943:1: ( rule__RootRefinement__Group__1__Impl rule__RootRefinement__Group__2 )
            // InternalPLEC.g:2944:2: rule__RootRefinement__Group__1__Impl rule__RootRefinement__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__RootRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootRefinement__Group__2();

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
    // $ANTLR end "rule__RootRefinement__Group__1"


    // $ANTLR start "rule__RootRefinement__Group__1__Impl"
    // InternalPLEC.g:2951:1: rule__RootRefinement__Group__1__Impl : ( 'is' ) ;
    public final void rule__RootRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2955:1: ( ( 'is' ) )
            // InternalPLEC.g:2956:1: ( 'is' )
            {
            // InternalPLEC.g:2956:1: ( 'is' )
            // InternalPLEC.g:2957:2: 'is'
            {
             before(grammarAccess.getRootRefinementAccess().getIsKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRootRefinementAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootRefinement__Group__1__Impl"


    // $ANTLR start "rule__RootRefinement__Group__2"
    // InternalPLEC.g:2966:1: rule__RootRefinement__Group__2 : rule__RootRefinement__Group__2__Impl ;
    public final void rule__RootRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2970:1: ( rule__RootRefinement__Group__2__Impl )
            // InternalPLEC.g:2971:2: rule__RootRefinement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootRefinement__Group__2__Impl();

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
    // $ANTLR end "rule__RootRefinement__Group__2"


    // $ANTLR start "rule__RootRefinement__Group__2__Impl"
    // InternalPLEC.g:2977:1: rule__RootRefinement__Group__2__Impl : ( 'root' ) ;
    public final void rule__RootRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2981:1: ( ( 'root' ) )
            // InternalPLEC.g:2982:1: ( 'root' )
            {
            // InternalPLEC.g:2982:1: ( 'root' )
            // InternalPLEC.g:2983:2: 'root'
            {
             before(grammarAccess.getRootRefinementAccess().getRootKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRootRefinementAccess().getRootKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootRefinement__Group__2__Impl"


    // $ANTLR start "rule__Temporal__Group__0"
    // InternalPLEC.g:2993:1: rule__Temporal__Group__0 : rule__Temporal__Group__0__Impl rule__Temporal__Group__1 ;
    public final void rule__Temporal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:2997:1: ( rule__Temporal__Group__0__Impl rule__Temporal__Group__1 )
            // InternalPLEC.g:2998:2: rule__Temporal__Group__0__Impl rule__Temporal__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Temporal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Temporal__Group__1();

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
    // $ANTLR end "rule__Temporal__Group__0"


    // $ANTLR start "rule__Temporal__Group__0__Impl"
    // InternalPLEC.g:3005:1: rule__Temporal__Group__0__Impl : ( ( rule__Temporal__OperatorAssignment_0 ) ) ;
    public final void rule__Temporal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3009:1: ( ( ( rule__Temporal__OperatorAssignment_0 ) ) )
            // InternalPLEC.g:3010:1: ( ( rule__Temporal__OperatorAssignment_0 ) )
            {
            // InternalPLEC.g:3010:1: ( ( rule__Temporal__OperatorAssignment_0 ) )
            // InternalPLEC.g:3011:2: ( rule__Temporal__OperatorAssignment_0 )
            {
             before(grammarAccess.getTemporalAccess().getOperatorAssignment_0()); 
            // InternalPLEC.g:3012:2: ( rule__Temporal__OperatorAssignment_0 )
            // InternalPLEC.g:3012:3: rule__Temporal__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Temporal__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTemporalAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temporal__Group__0__Impl"


    // $ANTLR start "rule__Temporal__Group__1"
    // InternalPLEC.g:3020:1: rule__Temporal__Group__1 : rule__Temporal__Group__1__Impl ;
    public final void rule__Temporal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3024:1: ( rule__Temporal__Group__1__Impl )
            // InternalPLEC.g:3025:2: rule__Temporal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Temporal__Group__1__Impl();

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
    // $ANTLR end "rule__Temporal__Group__1"


    // $ANTLR start "rule__Temporal__Group__1__Impl"
    // InternalPLEC.g:3031:1: rule__Temporal__Group__1__Impl : ( ( rule__Temporal__ConsAssignment_1 ) ) ;
    public final void rule__Temporal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3035:1: ( ( ( rule__Temporal__ConsAssignment_1 ) ) )
            // InternalPLEC.g:3036:1: ( ( rule__Temporal__ConsAssignment_1 ) )
            {
            // InternalPLEC.g:3036:1: ( ( rule__Temporal__ConsAssignment_1 ) )
            // InternalPLEC.g:3037:2: ( rule__Temporal__ConsAssignment_1 )
            {
             before(grammarAccess.getTemporalAccess().getConsAssignment_1()); 
            // InternalPLEC.g:3038:2: ( rule__Temporal__ConsAssignment_1 )
            // InternalPLEC.g:3038:3: rule__Temporal__ConsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Temporal__ConsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemporalAccess().getConsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temporal__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalPLEC.g:3047:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3051:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalPLEC.g:3052:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalPLEC.g:3059:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3063:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalPLEC.g:3064:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalPLEC.g:3064:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalPLEC.g:3065:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalPLEC.g:3066:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalPLEC.g:3066:3: rule__Rule__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalPLEC.g:3074:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3078:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalPLEC.g:3079:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalPLEC.g:3086:1: rule__Rule__Group__1__Impl : ( '-->' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3090:1: ( ( '-->' ) )
            // InternalPLEC.g:3091:1: ( '-->' )
            {
            // InternalPLEC.g:3091:1: ( '-->' )
            // InternalPLEC.g:3092:2: '-->'
            {
             before(grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalPLEC.g:3101:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3105:1: ( rule__Rule__Group__2__Impl )
            // InternalPLEC.g:3106:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalPLEC.g:3112:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConsequenceAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3116:1: ( ( ( rule__Rule__ConsequenceAssignment_2 ) ) )
            // InternalPLEC.g:3117:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            {
            // InternalPLEC.g:3117:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            // InternalPLEC.g:3118:2: ( rule__Rule__ConsequenceAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 
            // InternalPLEC.g:3119:2: ( rule__Rule__ConsequenceAssignment_2 )
            // InternalPLEC.g:3119:3: rule__Rule__ConsequenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConsequenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__FodaUN__Group__0"
    // InternalPLEC.g:3128:1: rule__FodaUN__Group__0 : rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 ;
    public final void rule__FodaUN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3132:1: ( rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 )
            // InternalPLEC.g:3133:2: rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__FodaUN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaUN__Group__1();

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
    // $ANTLR end "rule__FodaUN__Group__0"


    // $ANTLR start "rule__FodaUN__Group__0__Impl"
    // InternalPLEC.g:3140:1: rule__FodaUN__Group__0__Impl : ( ( rule__FodaUN__Var1Assignment_0 ) ) ;
    public final void rule__FodaUN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3144:1: ( ( ( rule__FodaUN__Var1Assignment_0 ) ) )
            // InternalPLEC.g:3145:1: ( ( rule__FodaUN__Var1Assignment_0 ) )
            {
            // InternalPLEC.g:3145:1: ( ( rule__FodaUN__Var1Assignment_0 ) )
            // InternalPLEC.g:3146:2: ( rule__FodaUN__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaUNAccess().getVar1Assignment_0()); 
            // InternalPLEC.g:3147:2: ( rule__FodaUN__Var1Assignment_0 )
            // InternalPLEC.g:3147:3: rule__FodaUN__Var1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FodaUN__Var1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFodaUNAccess().getVar1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Group__0__Impl"


    // $ANTLR start "rule__FodaUN__Group__1"
    // InternalPLEC.g:3155:1: rule__FodaUN__Group__1 : rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 ;
    public final void rule__FodaUN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3159:1: ( rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 )
            // InternalPLEC.g:3160:2: rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__FodaUN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaUN__Group__2();

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
    // $ANTLR end "rule__FodaUN__Group__1"


    // $ANTLR start "rule__FodaUN__Group__1__Impl"
    // InternalPLEC.g:3167:1: rule__FodaUN__Group__1__Impl : ( 'is' ) ;
    public final void rule__FodaUN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3171:1: ( ( 'is' ) )
            // InternalPLEC.g:3172:1: ( 'is' )
            {
            // InternalPLEC.g:3172:1: ( 'is' )
            // InternalPLEC.g:3173:2: 'is'
            {
             before(grammarAccess.getFodaUNAccess().getIsKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFodaUNAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Group__1__Impl"


    // $ANTLR start "rule__FodaUN__Group__2"
    // InternalPLEC.g:3182:1: rule__FodaUN__Group__2 : rule__FodaUN__Group__2__Impl ;
    public final void rule__FodaUN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3186:1: ( rule__FodaUN__Group__2__Impl )
            // InternalPLEC.g:3187:2: rule__FodaUN__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FodaUN__Group__2__Impl();

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
    // $ANTLR end "rule__FodaUN__Group__2"


    // $ANTLR start "rule__FodaUN__Group__2__Impl"
    // InternalPLEC.g:3193:1: rule__FodaUN__Group__2__Impl : ( ( rule__FodaUN__OpAssignment_2 ) ) ;
    public final void rule__FodaUN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3197:1: ( ( ( rule__FodaUN__OpAssignment_2 ) ) )
            // InternalPLEC.g:3198:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            {
            // InternalPLEC.g:3198:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            // InternalPLEC.g:3199:2: ( rule__FodaUN__OpAssignment_2 )
            {
             before(grammarAccess.getFodaUNAccess().getOpAssignment_2()); 
            // InternalPLEC.g:3200:2: ( rule__FodaUN__OpAssignment_2 )
            // InternalPLEC.g:3200:3: rule__FodaUN__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FodaUN__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFodaUNAccess().getOpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Group__2__Impl"


    // $ANTLR start "rule__FodaBin__Group__0"
    // InternalPLEC.g:3209:1: rule__FodaBin__Group__0 : rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 ;
    public final void rule__FodaBin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3213:1: ( rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 )
            // InternalPLEC.g:3214:2: rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__FodaBin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaBin__Group__1();

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
    // $ANTLR end "rule__FodaBin__Group__0"


    // $ANTLR start "rule__FodaBin__Group__0__Impl"
    // InternalPLEC.g:3221:1: rule__FodaBin__Group__0__Impl : ( ( rule__FodaBin__Var1Assignment_0 ) ) ;
    public final void rule__FodaBin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3225:1: ( ( ( rule__FodaBin__Var1Assignment_0 ) ) )
            // InternalPLEC.g:3226:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            {
            // InternalPLEC.g:3226:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            // InternalPLEC.g:3227:2: ( rule__FodaBin__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaBinAccess().getVar1Assignment_0()); 
            // InternalPLEC.g:3228:2: ( rule__FodaBin__Var1Assignment_0 )
            // InternalPLEC.g:3228:3: rule__FodaBin__Var1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__Var1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFodaBinAccess().getVar1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Group__0__Impl"


    // $ANTLR start "rule__FodaBin__Group__1"
    // InternalPLEC.g:3236:1: rule__FodaBin__Group__1 : rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 ;
    public final void rule__FodaBin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3240:1: ( rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 )
            // InternalPLEC.g:3241:2: rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__FodaBin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaBin__Group__2();

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
    // $ANTLR end "rule__FodaBin__Group__1"


    // $ANTLR start "rule__FodaBin__Group__1__Impl"
    // InternalPLEC.g:3248:1: rule__FodaBin__Group__1__Impl : ( ( rule__FodaBin__OpAssignment_1 ) ) ;
    public final void rule__FodaBin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3252:1: ( ( ( rule__FodaBin__OpAssignment_1 ) ) )
            // InternalPLEC.g:3253:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            {
            // InternalPLEC.g:3253:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            // InternalPLEC.g:3254:2: ( rule__FodaBin__OpAssignment_1 )
            {
             before(grammarAccess.getFodaBinAccess().getOpAssignment_1()); 
            // InternalPLEC.g:3255:2: ( rule__FodaBin__OpAssignment_1 )
            // InternalPLEC.g:3255:3: rule__FodaBin__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFodaBinAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Group__1__Impl"


    // $ANTLR start "rule__FodaBin__Group__2"
    // InternalPLEC.g:3263:1: rule__FodaBin__Group__2 : rule__FodaBin__Group__2__Impl ;
    public final void rule__FodaBin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3267:1: ( rule__FodaBin__Group__2__Impl )
            // InternalPLEC.g:3268:2: rule__FodaBin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__Group__2__Impl();

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
    // $ANTLR end "rule__FodaBin__Group__2"


    // $ANTLR start "rule__FodaBin__Group__2__Impl"
    // InternalPLEC.g:3274:1: rule__FodaBin__Group__2__Impl : ( ( rule__FodaBin__Var2Assignment_2 ) ) ;
    public final void rule__FodaBin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3278:1: ( ( ( rule__FodaBin__Var2Assignment_2 ) ) )
            // InternalPLEC.g:3279:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            {
            // InternalPLEC.g:3279:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            // InternalPLEC.g:3280:2: ( rule__FodaBin__Var2Assignment_2 )
            {
             before(grammarAccess.getFodaBinAccess().getVar2Assignment_2()); 
            // InternalPLEC.g:3281:2: ( rule__FodaBin__Var2Assignment_2 )
            // InternalPLEC.g:3281:3: rule__FodaBin__Var2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FodaBin__Var2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFodaBinAccess().getVar2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Group__2__Impl"


    // $ANTLR start "rule__Quantifiable__Group__0"
    // InternalPLEC.g:3290:1: rule__Quantifiable__Group__0 : rule__Quantifiable__Group__0__Impl rule__Quantifiable__Group__1 ;
    public final void rule__Quantifiable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3294:1: ( rule__Quantifiable__Group__0__Impl rule__Quantifiable__Group__1 )
            // InternalPLEC.g:3295:2: rule__Quantifiable__Group__0__Impl rule__Quantifiable__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Quantifiable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__1();

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
    // $ANTLR end "rule__Quantifiable__Group__0"


    // $ANTLR start "rule__Quantifiable__Group__0__Impl"
    // InternalPLEC.g:3302:1: rule__Quantifiable__Group__0__Impl : ( '[' ) ;
    public final void rule__Quantifiable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3306:1: ( ( '[' ) )
            // InternalPLEC.g:3307:1: ( '[' )
            {
            // InternalPLEC.g:3307:1: ( '[' )
            // InternalPLEC.g:3308:2: '['
            {
             before(grammarAccess.getQuantifiableAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getQuantifiableAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__0__Impl"


    // $ANTLR start "rule__Quantifiable__Group__1"
    // InternalPLEC.g:3317:1: rule__Quantifiable__Group__1 : rule__Quantifiable__Group__1__Impl rule__Quantifiable__Group__2 ;
    public final void rule__Quantifiable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3321:1: ( rule__Quantifiable__Group__1__Impl rule__Quantifiable__Group__2 )
            // InternalPLEC.g:3322:2: rule__Quantifiable__Group__1__Impl rule__Quantifiable__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Quantifiable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__2();

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
    // $ANTLR end "rule__Quantifiable__Group__1"


    // $ANTLR start "rule__Quantifiable__Group__1__Impl"
    // InternalPLEC.g:3329:1: rule__Quantifiable__Group__1__Impl : ( ( rule__Quantifiable__MinV1Assignment_1 ) ) ;
    public final void rule__Quantifiable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3333:1: ( ( ( rule__Quantifiable__MinV1Assignment_1 ) ) )
            // InternalPLEC.g:3334:1: ( ( rule__Quantifiable__MinV1Assignment_1 ) )
            {
            // InternalPLEC.g:3334:1: ( ( rule__Quantifiable__MinV1Assignment_1 ) )
            // InternalPLEC.g:3335:2: ( rule__Quantifiable__MinV1Assignment_1 )
            {
             before(grammarAccess.getQuantifiableAccess().getMinV1Assignment_1()); 
            // InternalPLEC.g:3336:2: ( rule__Quantifiable__MinV1Assignment_1 )
            // InternalPLEC.g:3336:3: rule__Quantifiable__MinV1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Quantifiable__MinV1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiableAccess().getMinV1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__1__Impl"


    // $ANTLR start "rule__Quantifiable__Group__2"
    // InternalPLEC.g:3344:1: rule__Quantifiable__Group__2 : rule__Quantifiable__Group__2__Impl rule__Quantifiable__Group__3 ;
    public final void rule__Quantifiable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3348:1: ( rule__Quantifiable__Group__2__Impl rule__Quantifiable__Group__3 )
            // InternalPLEC.g:3349:2: rule__Quantifiable__Group__2__Impl rule__Quantifiable__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Quantifiable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__3();

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
    // $ANTLR end "rule__Quantifiable__Group__2"


    // $ANTLR start "rule__Quantifiable__Group__2__Impl"
    // InternalPLEC.g:3356:1: rule__Quantifiable__Group__2__Impl : ( ',' ) ;
    public final void rule__Quantifiable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3360:1: ( ( ',' ) )
            // InternalPLEC.g:3361:1: ( ',' )
            {
            // InternalPLEC.g:3361:1: ( ',' )
            // InternalPLEC.g:3362:2: ','
            {
             before(grammarAccess.getQuantifiableAccess().getCommaKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQuantifiableAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__2__Impl"


    // $ANTLR start "rule__Quantifiable__Group__3"
    // InternalPLEC.g:3371:1: rule__Quantifiable__Group__3 : rule__Quantifiable__Group__3__Impl rule__Quantifiable__Group__4 ;
    public final void rule__Quantifiable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3375:1: ( rule__Quantifiable__Group__3__Impl rule__Quantifiable__Group__4 )
            // InternalPLEC.g:3376:2: rule__Quantifiable__Group__3__Impl rule__Quantifiable__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Quantifiable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__4();

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
    // $ANTLR end "rule__Quantifiable__Group__3"


    // $ANTLR start "rule__Quantifiable__Group__3__Impl"
    // InternalPLEC.g:3383:1: rule__Quantifiable__Group__3__Impl : ( ( rule__Quantifiable__MaxV1Assignment_3 ) ) ;
    public final void rule__Quantifiable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3387:1: ( ( ( rule__Quantifiable__MaxV1Assignment_3 ) ) )
            // InternalPLEC.g:3388:1: ( ( rule__Quantifiable__MaxV1Assignment_3 ) )
            {
            // InternalPLEC.g:3388:1: ( ( rule__Quantifiable__MaxV1Assignment_3 ) )
            // InternalPLEC.g:3389:2: ( rule__Quantifiable__MaxV1Assignment_3 )
            {
             before(grammarAccess.getQuantifiableAccess().getMaxV1Assignment_3()); 
            // InternalPLEC.g:3390:2: ( rule__Quantifiable__MaxV1Assignment_3 )
            // InternalPLEC.g:3390:3: rule__Quantifiable__MaxV1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Quantifiable__MaxV1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiableAccess().getMaxV1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__3__Impl"


    // $ANTLR start "rule__Quantifiable__Group__4"
    // InternalPLEC.g:3398:1: rule__Quantifiable__Group__4 : rule__Quantifiable__Group__4__Impl rule__Quantifiable__Group__5 ;
    public final void rule__Quantifiable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3402:1: ( rule__Quantifiable__Group__4__Impl rule__Quantifiable__Group__5 )
            // InternalPLEC.g:3403:2: rule__Quantifiable__Group__4__Impl rule__Quantifiable__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Quantifiable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__5();

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
    // $ANTLR end "rule__Quantifiable__Group__4"


    // $ANTLR start "rule__Quantifiable__Group__4__Impl"
    // InternalPLEC.g:3410:1: rule__Quantifiable__Group__4__Impl : ( ']' ) ;
    public final void rule__Quantifiable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3414:1: ( ( ']' ) )
            // InternalPLEC.g:3415:1: ( ']' )
            {
            // InternalPLEC.g:3415:1: ( ']' )
            // InternalPLEC.g:3416:2: ']'
            {
             before(grammarAccess.getQuantifiableAccess().getRightSquareBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQuantifiableAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__4__Impl"


    // $ANTLR start "rule__Quantifiable__Group__5"
    // InternalPLEC.g:3425:1: rule__Quantifiable__Group__5 : rule__Quantifiable__Group__5__Impl rule__Quantifiable__Group__6 ;
    public final void rule__Quantifiable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3429:1: ( rule__Quantifiable__Group__5__Impl rule__Quantifiable__Group__6 )
            // InternalPLEC.g:3430:2: rule__Quantifiable__Group__5__Impl rule__Quantifiable__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Quantifiable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__6();

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
    // $ANTLR end "rule__Quantifiable__Group__5"


    // $ANTLR start "rule__Quantifiable__Group__5__Impl"
    // InternalPLEC.g:3437:1: rule__Quantifiable__Group__5__Impl : ( ( rule__Quantifiable__Var1Assignment_5 ) ) ;
    public final void rule__Quantifiable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3441:1: ( ( ( rule__Quantifiable__Var1Assignment_5 ) ) )
            // InternalPLEC.g:3442:1: ( ( rule__Quantifiable__Var1Assignment_5 ) )
            {
            // InternalPLEC.g:3442:1: ( ( rule__Quantifiable__Var1Assignment_5 ) )
            // InternalPLEC.g:3443:2: ( rule__Quantifiable__Var1Assignment_5 )
            {
             before(grammarAccess.getQuantifiableAccess().getVar1Assignment_5()); 
            // InternalPLEC.g:3444:2: ( rule__Quantifiable__Var1Assignment_5 )
            // InternalPLEC.g:3444:3: rule__Quantifiable__Var1Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Quantifiable__Var1Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiableAccess().getVar1Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__5__Impl"


    // $ANTLR start "rule__Quantifiable__Group__6"
    // InternalPLEC.g:3452:1: rule__Quantifiable__Group__6 : rule__Quantifiable__Group__6__Impl rule__Quantifiable__Group__7 ;
    public final void rule__Quantifiable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3456:1: ( rule__Quantifiable__Group__6__Impl rule__Quantifiable__Group__7 )
            // InternalPLEC.g:3457:2: rule__Quantifiable__Group__6__Impl rule__Quantifiable__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Quantifiable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__7();

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
    // $ANTLR end "rule__Quantifiable__Group__6"


    // $ANTLR start "rule__Quantifiable__Group__6__Impl"
    // InternalPLEC.g:3464:1: rule__Quantifiable__Group__6__Impl : ( 'requires' ) ;
    public final void rule__Quantifiable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3468:1: ( ( 'requires' ) )
            // InternalPLEC.g:3469:1: ( 'requires' )
            {
            // InternalPLEC.g:3469:1: ( 'requires' )
            // InternalPLEC.g:3470:2: 'requires'
            {
             before(grammarAccess.getQuantifiableAccess().getRequiresKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuantifiableAccess().getRequiresKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__6__Impl"


    // $ANTLR start "rule__Quantifiable__Group__7"
    // InternalPLEC.g:3479:1: rule__Quantifiable__Group__7 : rule__Quantifiable__Group__7__Impl rule__Quantifiable__Group__8 ;
    public final void rule__Quantifiable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3483:1: ( rule__Quantifiable__Group__7__Impl rule__Quantifiable__Group__8 )
            // InternalPLEC.g:3484:2: rule__Quantifiable__Group__7__Impl rule__Quantifiable__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Quantifiable__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__8();

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
    // $ANTLR end "rule__Quantifiable__Group__7"


    // $ANTLR start "rule__Quantifiable__Group__7__Impl"
    // InternalPLEC.g:3491:1: rule__Quantifiable__Group__7__Impl : ( '[' ) ;
    public final void rule__Quantifiable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3495:1: ( ( '[' ) )
            // InternalPLEC.g:3496:1: ( '[' )
            {
            // InternalPLEC.g:3496:1: ( '[' )
            // InternalPLEC.g:3497:2: '['
            {
             before(grammarAccess.getQuantifiableAccess().getLeftSquareBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getQuantifiableAccess().getLeftSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__7__Impl"


    // $ANTLR start "rule__Quantifiable__Group__8"
    // InternalPLEC.g:3506:1: rule__Quantifiable__Group__8 : rule__Quantifiable__Group__8__Impl rule__Quantifiable__Group__9 ;
    public final void rule__Quantifiable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3510:1: ( rule__Quantifiable__Group__8__Impl rule__Quantifiable__Group__9 )
            // InternalPLEC.g:3511:2: rule__Quantifiable__Group__8__Impl rule__Quantifiable__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Quantifiable__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__9();

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
    // $ANTLR end "rule__Quantifiable__Group__8"


    // $ANTLR start "rule__Quantifiable__Group__8__Impl"
    // InternalPLEC.g:3518:1: rule__Quantifiable__Group__8__Impl : ( ( rule__Quantifiable__MinV2Assignment_8 ) ) ;
    public final void rule__Quantifiable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3522:1: ( ( ( rule__Quantifiable__MinV2Assignment_8 ) ) )
            // InternalPLEC.g:3523:1: ( ( rule__Quantifiable__MinV2Assignment_8 ) )
            {
            // InternalPLEC.g:3523:1: ( ( rule__Quantifiable__MinV2Assignment_8 ) )
            // InternalPLEC.g:3524:2: ( rule__Quantifiable__MinV2Assignment_8 )
            {
             before(grammarAccess.getQuantifiableAccess().getMinV2Assignment_8()); 
            // InternalPLEC.g:3525:2: ( rule__Quantifiable__MinV2Assignment_8 )
            // InternalPLEC.g:3525:3: rule__Quantifiable__MinV2Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Quantifiable__MinV2Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiableAccess().getMinV2Assignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__8__Impl"


    // $ANTLR start "rule__Quantifiable__Group__9"
    // InternalPLEC.g:3533:1: rule__Quantifiable__Group__9 : rule__Quantifiable__Group__9__Impl rule__Quantifiable__Group__10 ;
    public final void rule__Quantifiable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3537:1: ( rule__Quantifiable__Group__9__Impl rule__Quantifiable__Group__10 )
            // InternalPLEC.g:3538:2: rule__Quantifiable__Group__9__Impl rule__Quantifiable__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Quantifiable__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__10();

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
    // $ANTLR end "rule__Quantifiable__Group__9"


    // $ANTLR start "rule__Quantifiable__Group__9__Impl"
    // InternalPLEC.g:3545:1: rule__Quantifiable__Group__9__Impl : ( ',' ) ;
    public final void rule__Quantifiable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3549:1: ( ( ',' ) )
            // InternalPLEC.g:3550:1: ( ',' )
            {
            // InternalPLEC.g:3550:1: ( ',' )
            // InternalPLEC.g:3551:2: ','
            {
             before(grammarAccess.getQuantifiableAccess().getCommaKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQuantifiableAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__9__Impl"


    // $ANTLR start "rule__Quantifiable__Group__10"
    // InternalPLEC.g:3560:1: rule__Quantifiable__Group__10 : rule__Quantifiable__Group__10__Impl rule__Quantifiable__Group__11 ;
    public final void rule__Quantifiable__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3564:1: ( rule__Quantifiable__Group__10__Impl rule__Quantifiable__Group__11 )
            // InternalPLEC.g:3565:2: rule__Quantifiable__Group__10__Impl rule__Quantifiable__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Quantifiable__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__11();

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
    // $ANTLR end "rule__Quantifiable__Group__10"


    // $ANTLR start "rule__Quantifiable__Group__10__Impl"
    // InternalPLEC.g:3572:1: rule__Quantifiable__Group__10__Impl : ( ( rule__Quantifiable__MaxV2Assignment_10 ) ) ;
    public final void rule__Quantifiable__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3576:1: ( ( ( rule__Quantifiable__MaxV2Assignment_10 ) ) )
            // InternalPLEC.g:3577:1: ( ( rule__Quantifiable__MaxV2Assignment_10 ) )
            {
            // InternalPLEC.g:3577:1: ( ( rule__Quantifiable__MaxV2Assignment_10 ) )
            // InternalPLEC.g:3578:2: ( rule__Quantifiable__MaxV2Assignment_10 )
            {
             before(grammarAccess.getQuantifiableAccess().getMaxV2Assignment_10()); 
            // InternalPLEC.g:3579:2: ( rule__Quantifiable__MaxV2Assignment_10 )
            // InternalPLEC.g:3579:3: rule__Quantifiable__MaxV2Assignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Quantifiable__MaxV2Assignment_10();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiableAccess().getMaxV2Assignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__10__Impl"


    // $ANTLR start "rule__Quantifiable__Group__11"
    // InternalPLEC.g:3587:1: rule__Quantifiable__Group__11 : rule__Quantifiable__Group__11__Impl rule__Quantifiable__Group__12 ;
    public final void rule__Quantifiable__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3591:1: ( rule__Quantifiable__Group__11__Impl rule__Quantifiable__Group__12 )
            // InternalPLEC.g:3592:2: rule__Quantifiable__Group__11__Impl rule__Quantifiable__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__Quantifiable__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__12();

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
    // $ANTLR end "rule__Quantifiable__Group__11"


    // $ANTLR start "rule__Quantifiable__Group__11__Impl"
    // InternalPLEC.g:3599:1: rule__Quantifiable__Group__11__Impl : ( ']' ) ;
    public final void rule__Quantifiable__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3603:1: ( ( ']' ) )
            // InternalPLEC.g:3604:1: ( ']' )
            {
            // InternalPLEC.g:3604:1: ( ']' )
            // InternalPLEC.g:3605:2: ']'
            {
             before(grammarAccess.getQuantifiableAccess().getRightSquareBracketKeyword_11()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQuantifiableAccess().getRightSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__11__Impl"


    // $ANTLR start "rule__Quantifiable__Group__12"
    // InternalPLEC.g:3614:1: rule__Quantifiable__Group__12 : rule__Quantifiable__Group__12__Impl ;
    public final void rule__Quantifiable__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3618:1: ( rule__Quantifiable__Group__12__Impl )
            // InternalPLEC.g:3619:2: rule__Quantifiable__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantifiable__Group__12__Impl();

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
    // $ANTLR end "rule__Quantifiable__Group__12"


    // $ANTLR start "rule__Quantifiable__Group__12__Impl"
    // InternalPLEC.g:3625:1: rule__Quantifiable__Group__12__Impl : ( ( rule__Quantifiable__Var2Assignment_12 ) ) ;
    public final void rule__Quantifiable__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3629:1: ( ( ( rule__Quantifiable__Var2Assignment_12 ) ) )
            // InternalPLEC.g:3630:1: ( ( rule__Quantifiable__Var2Assignment_12 ) )
            {
            // InternalPLEC.g:3630:1: ( ( rule__Quantifiable__Var2Assignment_12 ) )
            // InternalPLEC.g:3631:2: ( rule__Quantifiable__Var2Assignment_12 )
            {
             before(grammarAccess.getQuantifiableAccess().getVar2Assignment_12()); 
            // InternalPLEC.g:3632:2: ( rule__Quantifiable__Var2Assignment_12 )
            // InternalPLEC.g:3632:3: rule__Quantifiable__Var2Assignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Quantifiable__Var2Assignment_12();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiableAccess().getVar2Assignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Group__12__Impl"


    // $ANTLR start "rule__ListOfValues__Group__0"
    // InternalPLEC.g:3641:1: rule__ListOfValues__Group__0 : rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 ;
    public final void rule__ListOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3645:1: ( rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 )
            // InternalPLEC.g:3646:2: rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPLEC.g:3653:1: rule__ListOfValues__Group__0__Impl : ( ( rule__ListOfValues__ValuesAssignment_0 ) ) ;
    public final void rule__ListOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3657:1: ( ( ( rule__ListOfValues__ValuesAssignment_0 ) ) )
            // InternalPLEC.g:3658:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            {
            // InternalPLEC.g:3658:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            // InternalPLEC.g:3659:2: ( rule__ListOfValues__ValuesAssignment_0 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_0()); 
            // InternalPLEC.g:3660:2: ( rule__ListOfValues__ValuesAssignment_0 )
            // InternalPLEC.g:3660:3: rule__ListOfValues__ValuesAssignment_0
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
    // InternalPLEC.g:3668:1: rule__ListOfValues__Group__1 : rule__ListOfValues__Group__1__Impl ;
    public final void rule__ListOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3672:1: ( rule__ListOfValues__Group__1__Impl )
            // InternalPLEC.g:3673:2: rule__ListOfValues__Group__1__Impl
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
    // InternalPLEC.g:3679:1: rule__ListOfValues__Group__1__Impl : ( ( rule__ListOfValues__Group_1__0 )* ) ;
    public final void rule__ListOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3683:1: ( ( ( rule__ListOfValues__Group_1__0 )* ) )
            // InternalPLEC.g:3684:1: ( ( rule__ListOfValues__Group_1__0 )* )
            {
            // InternalPLEC.g:3684:1: ( ( rule__ListOfValues__Group_1__0 )* )
            // InternalPLEC.g:3685:2: ( rule__ListOfValues__Group_1__0 )*
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalPLEC.g:3686:2: ( rule__ListOfValues__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPLEC.g:3686:3: rule__ListOfValues__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ListOfValues__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalPLEC.g:3695:1: rule__ListOfValues__Group_1__0 : rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 ;
    public final void rule__ListOfValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3699:1: ( rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 )
            // InternalPLEC.g:3700:2: rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPLEC.g:3707:1: rule__ListOfValues__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3711:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalPLEC.g:3712:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalPLEC.g:3712:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalPLEC.g:3713:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalPLEC.g:3713:2: ( ( ',' ) )
            // InternalPLEC.g:3714:3: ( ',' )
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalPLEC.g:3715:3: ( ',' )
            // InternalPLEC.g:3715:4: ','
            {
            match(input,27,FOLLOW_32); 

            }

             after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 

            }

            // InternalPLEC.g:3718:2: ( ( ',' )* )
            // InternalPLEC.g:3719:3: ( ',' )*
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalPLEC.g:3720:3: ( ',' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPLEC.g:3720:4: ','
            	    {
            	    match(input,27,FOLLOW_32); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalPLEC.g:3729:1: rule__ListOfValues__Group_1__1 : rule__ListOfValues__Group_1__1__Impl ;
    public final void rule__ListOfValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3733:1: ( rule__ListOfValues__Group_1__1__Impl )
            // InternalPLEC.g:3734:2: rule__ListOfValues__Group_1__1__Impl
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
    // InternalPLEC.g:3740:1: rule__ListOfValues__Group_1__1__Impl : ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) ;
    public final void rule__ListOfValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3744:1: ( ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) )
            // InternalPLEC.g:3745:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            {
            // InternalPLEC.g:3745:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            // InternalPLEC.g:3746:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1()); 
            // InternalPLEC.g:3747:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            // InternalPLEC.g:3747:3: rule__ListOfValues__ValuesAssignment_1_1
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


    // $ANTLR start "rule__ListOfIDs__Group__0"
    // InternalPLEC.g:3756:1: rule__ListOfIDs__Group__0 : rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 ;
    public final void rule__ListOfIDs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3760:1: ( rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 )
            // InternalPLEC.g:3761:2: rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ListOfIDs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfIDs__Group__1();

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
    // $ANTLR end "rule__ListOfIDs__Group__0"


    // $ANTLR start "rule__ListOfIDs__Group__0__Impl"
    // InternalPLEC.g:3768:1: rule__ListOfIDs__Group__0__Impl : ( ( rule__ListOfIDs__IdsAssignment_0 ) ) ;
    public final void rule__ListOfIDs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3772:1: ( ( ( rule__ListOfIDs__IdsAssignment_0 ) ) )
            // InternalPLEC.g:3773:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            {
            // InternalPLEC.g:3773:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            // InternalPLEC.g:3774:2: ( rule__ListOfIDs__IdsAssignment_0 )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment_0()); 
            // InternalPLEC.g:3775:2: ( rule__ListOfIDs__IdsAssignment_0 )
            // InternalPLEC.g:3775:3: rule__ListOfIDs__IdsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfIDs__IdsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getIdsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfIDs__Group__0__Impl"


    // $ANTLR start "rule__ListOfIDs__Group__1"
    // InternalPLEC.g:3783:1: rule__ListOfIDs__Group__1 : rule__ListOfIDs__Group__1__Impl ;
    public final void rule__ListOfIDs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3787:1: ( rule__ListOfIDs__Group__1__Impl )
            // InternalPLEC.g:3788:2: rule__ListOfIDs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfIDs__Group__1__Impl();

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
    // $ANTLR end "rule__ListOfIDs__Group__1"


    // $ANTLR start "rule__ListOfIDs__Group__1__Impl"
    // InternalPLEC.g:3794:1: rule__ListOfIDs__Group__1__Impl : ( ( rule__ListOfIDs__Group_1__0 )* ) ;
    public final void rule__ListOfIDs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3798:1: ( ( ( rule__ListOfIDs__Group_1__0 )* ) )
            // InternalPLEC.g:3799:1: ( ( rule__ListOfIDs__Group_1__0 )* )
            {
            // InternalPLEC.g:3799:1: ( ( rule__ListOfIDs__Group_1__0 )* )
            // InternalPLEC.g:3800:2: ( rule__ListOfIDs__Group_1__0 )*
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalPLEC.g:3801:2: ( rule__ListOfIDs__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPLEC.g:3801:3: rule__ListOfIDs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ListOfIDs__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getListOfIDsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfIDs__Group__1__Impl"


    // $ANTLR start "rule__ListOfIDs__Group_1__0"
    // InternalPLEC.g:3810:1: rule__ListOfIDs__Group_1__0 : rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 ;
    public final void rule__ListOfIDs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3814:1: ( rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 )
            // InternalPLEC.g:3815:2: rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ListOfIDs__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfIDs__Group_1__1();

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
    // $ANTLR end "rule__ListOfIDs__Group_1__0"


    // $ANTLR start "rule__ListOfIDs__Group_1__0__Impl"
    // InternalPLEC.g:3822:1: rule__ListOfIDs__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfIDs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3826:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalPLEC.g:3827:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalPLEC.g:3827:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalPLEC.g:3828:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalPLEC.g:3828:2: ( ( ',' ) )
            // InternalPLEC.g:3829:3: ( ',' )
            {
             before(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 
            // InternalPLEC.g:3830:3: ( ',' )
            // InternalPLEC.g:3830:4: ','
            {
            match(input,27,FOLLOW_32); 

            }

             after(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 

            }

            // InternalPLEC.g:3833:2: ( ( ',' )* )
            // InternalPLEC.g:3834:3: ( ',' )*
            {
             before(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 
            // InternalPLEC.g:3835:3: ( ',' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPLEC.g:3835:4: ','
            	    {
            	    match(input,27,FOLLOW_32); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__ListOfIDs__Group_1__0__Impl"


    // $ANTLR start "rule__ListOfIDs__Group_1__1"
    // InternalPLEC.g:3844:1: rule__ListOfIDs__Group_1__1 : rule__ListOfIDs__Group_1__1__Impl ;
    public final void rule__ListOfIDs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3848:1: ( rule__ListOfIDs__Group_1__1__Impl )
            // InternalPLEC.g:3849:2: rule__ListOfIDs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfIDs__Group_1__1__Impl();

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
    // $ANTLR end "rule__ListOfIDs__Group_1__1"


    // $ANTLR start "rule__ListOfIDs__Group_1__1__Impl"
    // InternalPLEC.g:3855:1: rule__ListOfIDs__Group_1__1__Impl : ( ( rule__ListOfIDs__IdsAssignment_1_1 ) ) ;
    public final void rule__ListOfIDs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3859:1: ( ( ( rule__ListOfIDs__IdsAssignment_1_1 ) ) )
            // InternalPLEC.g:3860:1: ( ( rule__ListOfIDs__IdsAssignment_1_1 ) )
            {
            // InternalPLEC.g:3860:1: ( ( rule__ListOfIDs__IdsAssignment_1_1 ) )
            // InternalPLEC.g:3861:2: ( rule__ListOfIDs__IdsAssignment_1_1 )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment_1_1()); 
            // InternalPLEC.g:3862:2: ( rule__ListOfIDs__IdsAssignment_1_1 )
            // InternalPLEC.g:3862:3: rule__ListOfIDs__IdsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfIDs__IdsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getIdsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfIDs__Group_1__1__Impl"


    // $ANTLR start "rule__ListOfListsOfValues__Group__0"
    // InternalPLEC.g:3871:1: rule__ListOfListsOfValues__Group__0 : rule__ListOfListsOfValues__Group__0__Impl rule__ListOfListsOfValues__Group__1 ;
    public final void rule__ListOfListsOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3875:1: ( rule__ListOfListsOfValues__Group__0__Impl rule__ListOfListsOfValues__Group__1 )
            // InternalPLEC.g:3876:2: rule__ListOfListsOfValues__Group__0__Impl rule__ListOfListsOfValues__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ListOfListsOfValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__Group__1();

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
    // $ANTLR end "rule__ListOfListsOfValues__Group__0"


    // $ANTLR start "rule__ListOfListsOfValues__Group__0__Impl"
    // InternalPLEC.g:3883:1: rule__ListOfListsOfValues__Group__0__Impl : ( '(' ) ;
    public final void rule__ListOfListsOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3887:1: ( ( '(' ) )
            // InternalPLEC.g:3888:1: ( '(' )
            {
            // InternalPLEC.g:3888:1: ( '(' )
            // InternalPLEC.g:3889:2: '('
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getListOfListsOfValuesAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListsOfValues__Group__0__Impl"


    // $ANTLR start "rule__ListOfListsOfValues__Group__1"
    // InternalPLEC.g:3898:1: rule__ListOfListsOfValues__Group__1 : rule__ListOfListsOfValues__Group__1__Impl rule__ListOfListsOfValues__Group__2 ;
    public final void rule__ListOfListsOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3902:1: ( rule__ListOfListsOfValues__Group__1__Impl rule__ListOfListsOfValues__Group__2 )
            // InternalPLEC.g:3903:2: rule__ListOfListsOfValues__Group__1__Impl rule__ListOfListsOfValues__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ListOfListsOfValues__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__Group__2();

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
    // $ANTLR end "rule__ListOfListsOfValues__Group__1"


    // $ANTLR start "rule__ListOfListsOfValues__Group__1__Impl"
    // InternalPLEC.g:3910:1: rule__ListOfListsOfValues__Group__1__Impl : ( ( rule__ListOfListsOfValues__ValuesAssignment_1 ) ) ;
    public final void rule__ListOfListsOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3914:1: ( ( ( rule__ListOfListsOfValues__ValuesAssignment_1 ) ) )
            // InternalPLEC.g:3915:1: ( ( rule__ListOfListsOfValues__ValuesAssignment_1 ) )
            {
            // InternalPLEC.g:3915:1: ( ( rule__ListOfListsOfValues__ValuesAssignment_1 ) )
            // InternalPLEC.g:3916:2: ( rule__ListOfListsOfValues__ValuesAssignment_1 )
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getValuesAssignment_1()); 
            // InternalPLEC.g:3917:2: ( rule__ListOfListsOfValues__ValuesAssignment_1 )
            // InternalPLEC.g:3917:3: rule__ListOfListsOfValues__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListOfListsOfValuesAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListsOfValues__Group__1__Impl"


    // $ANTLR start "rule__ListOfListsOfValues__Group__2"
    // InternalPLEC.g:3925:1: rule__ListOfListsOfValues__Group__2 : rule__ListOfListsOfValues__Group__2__Impl rule__ListOfListsOfValues__Group__3 ;
    public final void rule__ListOfListsOfValues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3929:1: ( rule__ListOfListsOfValues__Group__2__Impl rule__ListOfListsOfValues__Group__3 )
            // InternalPLEC.g:3930:2: rule__ListOfListsOfValues__Group__2__Impl rule__ListOfListsOfValues__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ListOfListsOfValues__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__Group__3();

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
    // $ANTLR end "rule__ListOfListsOfValues__Group__2"


    // $ANTLR start "rule__ListOfListsOfValues__Group__2__Impl"
    // InternalPLEC.g:3937:1: rule__ListOfListsOfValues__Group__2__Impl : ( ')' ) ;
    public final void rule__ListOfListsOfValues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3941:1: ( ( ')' ) )
            // InternalPLEC.g:3942:1: ( ')' )
            {
            // InternalPLEC.g:3942:1: ( ')' )
            // InternalPLEC.g:3943:2: ')'
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getListOfListsOfValuesAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListsOfValues__Group__2__Impl"


    // $ANTLR start "rule__ListOfListsOfValues__Group__3"
    // InternalPLEC.g:3952:1: rule__ListOfListsOfValues__Group__3 : rule__ListOfListsOfValues__Group__3__Impl ;
    public final void rule__ListOfListsOfValues__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3956:1: ( rule__ListOfListsOfValues__Group__3__Impl )
            // InternalPLEC.g:3957:2: rule__ListOfListsOfValues__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__Group__3__Impl();

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
    // $ANTLR end "rule__ListOfListsOfValues__Group__3"


    // $ANTLR start "rule__ListOfListsOfValues__Group__3__Impl"
    // InternalPLEC.g:3963:1: rule__ListOfListsOfValues__Group__3__Impl : ( ( rule__ListOfListsOfValues__Group_3__0 )* ) ;
    public final void rule__ListOfListsOfValues__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3967:1: ( ( ( rule__ListOfListsOfValues__Group_3__0 )* ) )
            // InternalPLEC.g:3968:1: ( ( rule__ListOfListsOfValues__Group_3__0 )* )
            {
            // InternalPLEC.g:3968:1: ( ( rule__ListOfListsOfValues__Group_3__0 )* )
            // InternalPLEC.g:3969:2: ( rule__ListOfListsOfValues__Group_3__0 )*
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getGroup_3()); 
            // InternalPLEC.g:3970:2: ( rule__ListOfListsOfValues__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPLEC.g:3970:3: rule__ListOfListsOfValues__Group_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ListOfListsOfValues__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getListOfListsOfValuesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListsOfValues__Group__3__Impl"


    // $ANTLR start "rule__ListOfListsOfValues__Group_3__0"
    // InternalPLEC.g:3979:1: rule__ListOfListsOfValues__Group_3__0 : rule__ListOfListsOfValues__Group_3__0__Impl rule__ListOfListsOfValues__Group_3__1 ;
    public final void rule__ListOfListsOfValues__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3983:1: ( rule__ListOfListsOfValues__Group_3__0__Impl rule__ListOfListsOfValues__Group_3__1 )
            // InternalPLEC.g:3984:2: rule__ListOfListsOfValues__Group_3__0__Impl rule__ListOfListsOfValues__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__ListOfListsOfValues__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__Group_3__1();

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
    // $ANTLR end "rule__ListOfListsOfValues__Group_3__0"


    // $ANTLR start "rule__ListOfListsOfValues__Group_3__0__Impl"
    // InternalPLEC.g:3991:1: rule__ListOfListsOfValues__Group_3__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfListsOfValues__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:3995:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalPLEC.g:3996:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalPLEC.g:3996:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalPLEC.g:3997:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalPLEC.g:3997:2: ( ( ',' ) )
            // InternalPLEC.g:3998:3: ( ',' )
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getCommaKeyword_3_0()); 
            // InternalPLEC.g:3999:3: ( ',' )
            // InternalPLEC.g:3999:4: ','
            {
            match(input,27,FOLLOW_32); 

            }

             after(grammarAccess.getListOfListsOfValuesAccess().getCommaKeyword_3_0()); 

            }

            // InternalPLEC.g:4002:2: ( ( ',' )* )
            // InternalPLEC.g:4003:3: ( ',' )*
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getCommaKeyword_3_0()); 
            // InternalPLEC.g:4004:3: ( ',' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPLEC.g:4004:4: ','
            	    {
            	    match(input,27,FOLLOW_32); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getListOfListsOfValuesAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ListOfListsOfValues__Group_3__0__Impl"


    // $ANTLR start "rule__ListOfListsOfValues__Group_3__1"
    // InternalPLEC.g:4013:1: rule__ListOfListsOfValues__Group_3__1 : rule__ListOfListsOfValues__Group_3__1__Impl rule__ListOfListsOfValues__Group_3__2 ;
    public final void rule__ListOfListsOfValues__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4017:1: ( rule__ListOfListsOfValues__Group_3__1__Impl rule__ListOfListsOfValues__Group_3__2 )
            // InternalPLEC.g:4018:2: rule__ListOfListsOfValues__Group_3__1__Impl rule__ListOfListsOfValues__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ListOfListsOfValues__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__Group_3__2();

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
    // $ANTLR end "rule__ListOfListsOfValues__Group_3__1"


    // $ANTLR start "rule__ListOfListsOfValues__Group_3__1__Impl"
    // InternalPLEC.g:4025:1: rule__ListOfListsOfValues__Group_3__1__Impl : ( '(' ) ;
    public final void rule__ListOfListsOfValues__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4029:1: ( ( '(' ) )
            // InternalPLEC.g:4030:1: ( '(' )
            {
            // InternalPLEC.g:4030:1: ( '(' )
            // InternalPLEC.g:4031:2: '('
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getListOfListsOfValuesAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListsOfValues__Group_3__1__Impl"


    // $ANTLR start "rule__ListOfListsOfValues__Group_3__2"
    // InternalPLEC.g:4040:1: rule__ListOfListsOfValues__Group_3__2 : rule__ListOfListsOfValues__Group_3__2__Impl rule__ListOfListsOfValues__Group_3__3 ;
    public final void rule__ListOfListsOfValues__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4044:1: ( rule__ListOfListsOfValues__Group_3__2__Impl rule__ListOfListsOfValues__Group_3__3 )
            // InternalPLEC.g:4045:2: rule__ListOfListsOfValues__Group_3__2__Impl rule__ListOfListsOfValues__Group_3__3
            {
            pushFollow(FOLLOW_19);
            rule__ListOfListsOfValues__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__Group_3__3();

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
    // $ANTLR end "rule__ListOfListsOfValues__Group_3__2"


    // $ANTLR start "rule__ListOfListsOfValues__Group_3__2__Impl"
    // InternalPLEC.g:4052:1: rule__ListOfListsOfValues__Group_3__2__Impl : ( ( rule__ListOfListsOfValues__ValuesAssignment_3_2 ) ) ;
    public final void rule__ListOfListsOfValues__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4056:1: ( ( ( rule__ListOfListsOfValues__ValuesAssignment_3_2 ) ) )
            // InternalPLEC.g:4057:1: ( ( rule__ListOfListsOfValues__ValuesAssignment_3_2 ) )
            {
            // InternalPLEC.g:4057:1: ( ( rule__ListOfListsOfValues__ValuesAssignment_3_2 ) )
            // InternalPLEC.g:4058:2: ( rule__ListOfListsOfValues__ValuesAssignment_3_2 )
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getValuesAssignment_3_2()); 
            // InternalPLEC.g:4059:2: ( rule__ListOfListsOfValues__ValuesAssignment_3_2 )
            // InternalPLEC.g:4059:3: rule__ListOfListsOfValues__ValuesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__ValuesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getListOfListsOfValuesAccess().getValuesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListsOfValues__Group_3__2__Impl"


    // $ANTLR start "rule__ListOfListsOfValues__Group_3__3"
    // InternalPLEC.g:4067:1: rule__ListOfListsOfValues__Group_3__3 : rule__ListOfListsOfValues__Group_3__3__Impl ;
    public final void rule__ListOfListsOfValues__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4071:1: ( rule__ListOfListsOfValues__Group_3__3__Impl )
            // InternalPLEC.g:4072:2: rule__ListOfListsOfValues__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfListsOfValues__Group_3__3__Impl();

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
    // $ANTLR end "rule__ListOfListsOfValues__Group_3__3"


    // $ANTLR start "rule__ListOfListsOfValues__Group_3__3__Impl"
    // InternalPLEC.g:4078:1: rule__ListOfListsOfValues__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ListOfListsOfValues__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4082:1: ( ( ')' ) )
            // InternalPLEC.g:4083:1: ( ')' )
            {
            // InternalPLEC.g:4083:1: ( ')' )
            // InternalPLEC.g:4084:2: ')'
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getRightParenthesisKeyword_3_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getListOfListsOfValuesAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListsOfValues__Group_3__3__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalPLEC.g:4094:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4098:1: ( ( RULE_ID ) )
            // InternalPLEC.g:4099:2: ( RULE_ID )
            {
            // InternalPLEC.g:4099:2: ( RULE_ID )
            // InternalPLEC.g:4100:3: RULE_ID
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


    // $ANTLR start "rule__Model__VarsAssignment_3"
    // InternalPLEC.g:4109:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4113:1: ( ( ruleVarDeclaration ) )
            // InternalPLEC.g:4114:2: ( ruleVarDeclaration )
            {
            // InternalPLEC.g:4114:2: ( ruleVarDeclaration )
            // InternalPLEC.g:4115:3: ruleVarDeclaration
            {
             before(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalPLEC.g:4124:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4128:1: ( ( ruleConstraint ) )
            // InternalPLEC.g:4129:2: ( ruleConstraint )
            {
            // InternalPLEC.g:4129:2: ( ruleConstraint )
            // InternalPLEC.g:4130:3: ruleConstraint
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


    // $ANTLR start "rule__VarDeclaration__InstantiableAssignment_0_0"
    // InternalPLEC.g:4139:1: rule__VarDeclaration__InstantiableAssignment_0_0 : ( ( 'instantiable' ) ) ;
    public final void rule__VarDeclaration__InstantiableAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4143:1: ( ( ( 'instantiable' ) ) )
            // InternalPLEC.g:4144:2: ( ( 'instantiable' ) )
            {
            // InternalPLEC.g:4144:2: ( ( 'instantiable' ) )
            // InternalPLEC.g:4145:3: ( 'instantiable' )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 
            // InternalPLEC.g:4146:3: ( 'instantiable' )
            // InternalPLEC.g:4147:4: 'instantiable'
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 

            }

             after(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__InstantiableAssignment_0_0"


    // $ANTLR start "rule__VarDeclaration__MinAssignment_0_2"
    // InternalPLEC.g:4158:1: rule__VarDeclaration__MinAssignment_0_2 : ( ruleNumber ) ;
    public final void rule__VarDeclaration__MinAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4162:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4163:2: ( ruleNumber )
            {
            // InternalPLEC.g:4163:2: ( ruleNumber )
            // InternalPLEC.g:4164:3: ruleNumber
            {
             before(grammarAccess.getVarDeclarationAccess().getMinNumberParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getMinNumberParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__MinAssignment_0_2"


    // $ANTLR start "rule__VarDeclaration__MaxAssignment_0_4"
    // InternalPLEC.g:4173:1: rule__VarDeclaration__MaxAssignment_0_4 : ( ruleNumber ) ;
    public final void rule__VarDeclaration__MaxAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4177:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4178:2: ( ruleNumber )
            {
            // InternalPLEC.g:4178:2: ( ruleNumber )
            // InternalPLEC.g:4179:3: ruleNumber
            {
             before(grammarAccess.getVarDeclarationAccess().getMaxNumberParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getMaxNumberParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__MaxAssignment_0_4"


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_1"
    // InternalPLEC.g:4188:1: rule__VarDeclaration__TypeAssignment_1 : ( ruleVarType ) ;
    public final void rule__VarDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4192:1: ( ( ruleVarType ) )
            // InternalPLEC.g:4193:2: ( ruleVarType )
            {
            // InternalPLEC.g:4193:2: ( ruleVarType )
            // InternalPLEC.g:4194:3: ruleVarType
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__TypeAssignment_1"


    // $ANTLR start "rule__VarDeclaration__NameAssignment_2"
    // InternalPLEC.g:4203:1: rule__VarDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4207:1: ( ( RULE_ID ) )
            // InternalPLEC.g:4208:2: ( RULE_ID )
            {
            // InternalPLEC.g:4208:2: ( RULE_ID )
            // InternalPLEC.g:4209:3: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__NameAssignment_2"


    // $ANTLR start "rule__VarDeclaration__VariantsAssignment_3_1"
    // InternalPLEC.g:4218:1: rule__VarDeclaration__VariantsAssignment_3_1 : ( ruleVariantDeclaration ) ;
    public final void rule__VarDeclaration__VariantsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4222:1: ( ( ruleVariantDeclaration ) )
            // InternalPLEC.g:4223:2: ( ruleVariantDeclaration )
            {
            // InternalPLEC.g:4223:2: ( ruleVariantDeclaration )
            // InternalPLEC.g:4224:3: ruleVariantDeclaration
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__VariantsAssignment_3_1"


    // $ANTLR start "rule__VariantsInterval__StartAssignment_0"
    // InternalPLEC.g:4233:1: rule__VariantsInterval__StartAssignment_0 : ( ruleNumber ) ;
    public final void rule__VariantsInterval__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4237:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4238:2: ( ruleNumber )
            {
            // InternalPLEC.g:4238:2: ( ruleNumber )
            // InternalPLEC.g:4239:3: ruleNumber
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getVariantsIntervalAccess().getStartNumberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__StartAssignment_0"


    // $ANTLR start "rule__VariantsInterval__EndAssignment_2"
    // InternalPLEC.g:4248:1: rule__VariantsInterval__EndAssignment_2 : ( ruleNumber ) ;
    public final void rule__VariantsInterval__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4252:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4253:2: ( ruleNumber )
            {
            // InternalPLEC.g:4253:2: ( ruleNumber )
            // InternalPLEC.g:4254:3: ruleNumber
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndNumberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getVariantsIntervalAccess().getEndNumberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__EndAssignment_2"


    // $ANTLR start "rule__VariantsEnumeration__ListAssignment_1"
    // InternalPLEC.g:4263:1: rule__VariantsEnumeration__ListAssignment_1 : ( ruleListOfValues ) ;
    public final void rule__VariantsEnumeration__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4267:1: ( ( ruleListOfValues ) )
            // InternalPLEC.g:4268:2: ( ruleListOfValues )
            {
            // InternalPLEC.g:4268:2: ( ruleListOfValues )
            // InternalPLEC.g:4269:3: ruleListOfValues
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListListOfValuesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getVariantsEnumerationAccess().getListListOfValuesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__ListAssignment_1"


    // $ANTLR start "rule__Constraint__NameAssignment_0"
    // InternalPLEC.g:4278:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4282:1: ( ( RULE_ID ) )
            // InternalPLEC.g:4283:2: ( RULE_ID )
            {
            // InternalPLEC.g:4283:2: ( RULE_ID )
            // InternalPLEC.g:4284:3: RULE_ID
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
    // InternalPLEC.g:4293:1: rule__Constraint__ExpAssignment_2 : ( ruleConsExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4297:1: ( ( ruleConsExpression ) )
            // InternalPLEC.g:4298:2: ( ruleConsExpression )
            {
            // InternalPLEC.g:4298:2: ( ruleConsExpression )
            // InternalPLEC.g:4299:3: ruleConsExpression
            {
             before(grammarAccess.getConstraintAccess().getExpConsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConsExpression();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getExpConsExpressionParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__IDCons__NameAssignment"
    // InternalPLEC.g:4308:1: rule__IDCons__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDCons__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4312:1: ( ( RULE_ID ) )
            // InternalPLEC.g:4313:2: ( RULE_ID )
            {
            // InternalPLEC.g:4313:2: ( RULE_ID )
            // InternalPLEC.g:4314:3: RULE_ID
            {
             before(grammarAccess.getIDConsAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIDConsAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDCons__NameAssignment"


    // $ANTLR start "rule__Structural__ParentAssignment_1"
    // InternalPLEC.g:4323:1: rule__Structural__ParentAssignment_1 : ( ( ruleParent ) ) ;
    public final void rule__Structural__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4327:1: ( ( ( ruleParent ) ) )
            // InternalPLEC.g:4328:2: ( ( ruleParent ) )
            {
            // InternalPLEC.g:4328:2: ( ( ruleParent ) )
            // InternalPLEC.g:4329:3: ( ruleParent )
            {
             before(grammarAccess.getStructuralAccess().getParentVarDeclarationCrossReference_1_0()); 
            // InternalPLEC.g:4330:3: ( ruleParent )
            // InternalPLEC.g:4331:4: ruleParent
            {
             before(grammarAccess.getStructuralAccess().getParentVarDeclarationParentParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleParent();

            state._fsp--;

             after(grammarAccess.getStructuralAccess().getParentVarDeclarationParentParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getStructuralAccess().getParentVarDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__ParentAssignment_1"


    // $ANTLR start "rule__Structural__GroupAssignment_4"
    // InternalPLEC.g:4342:1: rule__Structural__GroupAssignment_4 : ( ruleListOfIDs ) ;
    public final void rule__Structural__GroupAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4346:1: ( ( ruleListOfIDs ) )
            // InternalPLEC.g:4347:2: ( ruleListOfIDs )
            {
            // InternalPLEC.g:4347:2: ( ruleListOfIDs )
            // InternalPLEC.g:4348:3: ruleListOfIDs
            {
             before(grammarAccess.getStructuralAccess().getGroupListOfIDsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getStructuralAccess().getGroupListOfIDsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__GroupAssignment_4"


    // $ANTLR start "rule__Structural__MinAssignment_6_2"
    // InternalPLEC.g:4357:1: rule__Structural__MinAssignment_6_2 : ( ruleNumber ) ;
    public final void rule__Structural__MinAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4361:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4362:2: ( ruleNumber )
            {
            // InternalPLEC.g:4362:2: ( ruleNumber )
            // InternalPLEC.g:4363:3: ruleNumber
            {
             before(grammarAccess.getStructuralAccess().getMinNumberParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getStructuralAccess().getMinNumberParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__MinAssignment_6_2"


    // $ANTLR start "rule__Structural__MaxAssignment_6_4"
    // InternalPLEC.g:4372:1: rule__Structural__MaxAssignment_6_4 : ( ruleNumber ) ;
    public final void rule__Structural__MaxAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4376:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4377:2: ( ruleNumber )
            {
            // InternalPLEC.g:4377:2: ( ruleNumber )
            // InternalPLEC.g:4378:3: ruleNumber
            {
             before(grammarAccess.getStructuralAccess().getMaxNumberParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getStructuralAccess().getMaxNumberParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__MaxAssignment_6_4"


    // $ANTLR start "rule__Attributes__AttAssignment_2"
    // InternalPLEC.g:4387:1: rule__Attributes__AttAssignment_2 : ( ruleListOfIDs ) ;
    public final void rule__Attributes__AttAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4391:1: ( ( ruleListOfIDs ) )
            // InternalPLEC.g:4392:2: ( ruleListOfIDs )
            {
            // InternalPLEC.g:4392:2: ( ruleListOfIDs )
            // InternalPLEC.g:4393:3: ruleListOfIDs
            {
             before(grammarAccess.getAttributesAccess().getAttListOfIDsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttListOfIDsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttAssignment_2"


    // $ANTLR start "rule__Attributes__Var1Assignment_5"
    // InternalPLEC.g:4402:1: rule__Attributes__Var1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Attributes__Var1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4406:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4407:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4407:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4408:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributesAccess().getVar1VarDeclarationCrossReference_5_0()); 
            // InternalPLEC.g:4409:3: ( RULE_ID )
            // InternalPLEC.g:4410:4: RULE_ID
            {
             before(grammarAccess.getAttributesAccess().getVar1VarDeclarationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getVar1VarDeclarationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAttributesAccess().getVar1VarDeclarationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Var1Assignment_5"


    // $ANTLR start "rule__Assignment__VariableAssignment_0"
    // InternalPLEC.g:4421:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4425:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4426:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4426:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4427:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getVariableVarDeclarationCrossReference_0_0()); 
            // InternalPLEC.g:4428:3: ( RULE_ID )
            // InternalPLEC.g:4429:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getVariableVarDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getVariableVarDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getVariableVarDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VariableAssignment_0"


    // $ANTLR start "rule__Assignment__ValuAssignment_2"
    // InternalPLEC.g:4440:1: rule__Assignment__ValuAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValuAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4444:1: ( ( ruleValue ) )
            // InternalPLEC.g:4445:2: ( ruleValue )
            {
            // InternalPLEC.g:4445:2: ( ruleValue )
            // InternalPLEC.g:4446:3: ruleValue
            {
             before(grammarAccess.getAssignmentAccess().getValuValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValuValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValuAssignment_2"


    // $ANTLR start "rule__VarRefinement__VarAssignment_0"
    // InternalPLEC.g:4455:1: rule__VarRefinement__VarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VarRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4459:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4460:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4460:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4461:3: ( RULE_ID )
            {
             before(grammarAccess.getVarRefinementAccess().getVarVarDeclarationCrossReference_0_0()); 
            // InternalPLEC.g:4462:3: ( RULE_ID )
            // InternalPLEC.g:4463:4: RULE_ID
            {
             before(grammarAccess.getVarRefinementAccess().getVarVarDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarRefinementAccess().getVarVarDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getVarRefinementAccess().getVarVarDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__VarAssignment_0"


    // $ANTLR start "rule__VarRefinement__ValuesAssignment_2"
    // InternalPLEC.g:4474:1: rule__VarRefinement__ValuesAssignment_2 : ( ruleVariantDeclaration ) ;
    public final void rule__VarRefinement__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4478:1: ( ( ruleVariantDeclaration ) )
            // InternalPLEC.g:4479:2: ( ruleVariantDeclaration )
            {
            // InternalPLEC.g:4479:2: ( ruleVariantDeclaration )
            // InternalPLEC.g:4480:3: ruleVariantDeclaration
            {
             before(grammarAccess.getVarRefinementAccess().getValuesVariantDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVarRefinementAccess().getValuesVariantDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__ValuesAssignment_2"


    // $ANTLR start "rule__SetRefinement__VarsAssignment_2"
    // InternalPLEC.g:4489:1: rule__SetRefinement__VarsAssignment_2 : ( ruleListOfIDs ) ;
    public final void rule__SetRefinement__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4493:1: ( ( ruleListOfIDs ) )
            // InternalPLEC.g:4494:2: ( ruleListOfIDs )
            {
            // InternalPLEC.g:4494:2: ( ruleListOfIDs )
            // InternalPLEC.g:4495:3: ruleListOfIDs
            {
             before(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__VarsAssignment_2"


    // $ANTLR start "rule__SetRefinement__ListAssignment_6"
    // InternalPLEC.g:4504:1: rule__SetRefinement__ListAssignment_6 : ( ruleListOfListsOfValues ) ;
    public final void rule__SetRefinement__ListAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4508:1: ( ( ruleListOfListsOfValues ) )
            // InternalPLEC.g:4509:2: ( ruleListOfListsOfValues )
            {
            // InternalPLEC.g:4509:2: ( ruleListOfListsOfValues )
            // InternalPLEC.g:4510:3: ruleListOfListsOfValues
            {
             before(grammarAccess.getSetRefinementAccess().getListListOfListsOfValuesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfListsOfValues();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getListListOfListsOfValuesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__ListAssignment_6"


    // $ANTLR start "rule__RootRefinement__VarAssignment_0"
    // InternalPLEC.g:4519:1: rule__RootRefinement__VarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RootRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4523:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4524:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4524:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4525:3: ( RULE_ID )
            {
             before(grammarAccess.getRootRefinementAccess().getVarVarDeclarationCrossReference_0_0()); 
            // InternalPLEC.g:4526:3: ( RULE_ID )
            // InternalPLEC.g:4527:4: RULE_ID
            {
             before(grammarAccess.getRootRefinementAccess().getVarVarDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRootRefinementAccess().getVarVarDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRootRefinementAccess().getVarVarDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootRefinement__VarAssignment_0"


    // $ANTLR start "rule__Temporal__OperatorAssignment_0"
    // InternalPLEC.g:4538:1: rule__Temporal__OperatorAssignment_0 : ( ruleTempOP ) ;
    public final void rule__Temporal__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4542:1: ( ( ruleTempOP ) )
            // InternalPLEC.g:4543:2: ( ruleTempOP )
            {
            // InternalPLEC.g:4543:2: ( ruleTempOP )
            // InternalPLEC.g:4544:3: ruleTempOP
            {
             before(grammarAccess.getTemporalAccess().getOperatorTempOPParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTempOP();

            state._fsp--;

             after(grammarAccess.getTemporalAccess().getOperatorTempOPParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temporal__OperatorAssignment_0"


    // $ANTLR start "rule__Temporal__ConsAssignment_1"
    // InternalPLEC.g:4553:1: rule__Temporal__ConsAssignment_1 : ( ruleTerminalExp ) ;
    public final void rule__Temporal__ConsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4557:1: ( ( ruleTerminalExp ) )
            // InternalPLEC.g:4558:2: ( ruleTerminalExp )
            {
            // InternalPLEC.g:4558:2: ( ruleTerminalExp )
            // InternalPLEC.g:4559:3: ruleTerminalExp
            {
             before(grammarAccess.getTemporalAccess().getConsTerminalExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExp();

            state._fsp--;

             after(grammarAccess.getTemporalAccess().getConsTerminalExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temporal__ConsAssignment_1"


    // $ANTLR start "rule__Rule__ConditionAssignment_0"
    // InternalPLEC.g:4568:1: rule__Rule__ConditionAssignment_0 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4572:1: ( ( ruleTerminalExp ) )
            // InternalPLEC.g:4573:2: ( ruleTerminalExp )
            {
            // InternalPLEC.g:4573:2: ( ruleTerminalExp )
            // InternalPLEC.g:4574:3: ruleTerminalExp
            {
             before(grammarAccess.getRuleAccess().getConditionTerminalExpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExp();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionTerminalExpParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_0"


    // $ANTLR start "rule__Rule__ConsequenceAssignment_2"
    // InternalPLEC.g:4583:1: rule__Rule__ConsequenceAssignment_2 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConsequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4587:1: ( ( ruleTerminalExp ) )
            // InternalPLEC.g:4588:2: ( ruleTerminalExp )
            {
            // InternalPLEC.g:4588:2: ( ruleTerminalExp )
            // InternalPLEC.g:4589:3: ruleTerminalExp
            {
             before(grammarAccess.getRuleAccess().getConsequenceTerminalExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExp();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConsequenceTerminalExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConsequenceAssignment_2"


    // $ANTLR start "rule__FodaUN__Var1Assignment_0"
    // InternalPLEC.g:4598:1: rule__FodaUN__Var1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FodaUN__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4602:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4603:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4603:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4604:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaUNAccess().getVar1VarDeclarationCrossReference_0_0()); 
            // InternalPLEC.g:4605:3: ( RULE_ID )
            // InternalPLEC.g:4606:4: RULE_ID
            {
             before(grammarAccess.getFodaUNAccess().getVar1VarDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaUNAccess().getVar1VarDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFodaUNAccess().getVar1VarDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__Var1Assignment_0"


    // $ANTLR start "rule__FodaUN__OpAssignment_2"
    // InternalPLEC.g:4617:1: rule__FodaUN__OpAssignment_2 : ( ruleUnaryOp ) ;
    public final void rule__FodaUN__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4621:1: ( ( ruleUnaryOp ) )
            // InternalPLEC.g:4622:2: ( ruleUnaryOp )
            {
            // InternalPLEC.g:4622:2: ( ruleUnaryOp )
            // InternalPLEC.g:4623:3: ruleUnaryOp
            {
             before(grammarAccess.getFodaUNAccess().getOpUnaryOpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOp();

            state._fsp--;

             after(grammarAccess.getFodaUNAccess().getOpUnaryOpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__OpAssignment_2"


    // $ANTLR start "rule__FodaBin__Var1Assignment_0"
    // InternalPLEC.g:4632:1: rule__FodaBin__Var1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FodaBin__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4636:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4637:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4637:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4638:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaBinAccess().getVar1VarDeclarationCrossReference_0_0()); 
            // InternalPLEC.g:4639:3: ( RULE_ID )
            // InternalPLEC.g:4640:4: RULE_ID
            {
             before(grammarAccess.getFodaBinAccess().getVar1VarDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaBinAccess().getVar1VarDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFodaBinAccess().getVar1VarDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Var1Assignment_0"


    // $ANTLR start "rule__FodaBin__OpAssignment_1"
    // InternalPLEC.g:4651:1: rule__FodaBin__OpAssignment_1 : ( ruleBinOp ) ;
    public final void rule__FodaBin__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4655:1: ( ( ruleBinOp ) )
            // InternalPLEC.g:4656:2: ( ruleBinOp )
            {
            // InternalPLEC.g:4656:2: ( ruleBinOp )
            // InternalPLEC.g:4657:3: ruleBinOp
            {
             before(grammarAccess.getFodaBinAccess().getOpBinOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinOp();

            state._fsp--;

             after(grammarAccess.getFodaBinAccess().getOpBinOpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__OpAssignment_1"


    // $ANTLR start "rule__FodaBin__Var2Assignment_2"
    // InternalPLEC.g:4666:1: rule__FodaBin__Var2Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FodaBin__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4670:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4671:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4671:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4672:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaBinAccess().getVar2VarDeclarationCrossReference_2_0()); 
            // InternalPLEC.g:4673:3: ( RULE_ID )
            // InternalPLEC.g:4674:4: RULE_ID
            {
             before(grammarAccess.getFodaBinAccess().getVar2VarDeclarationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaBinAccess().getVar2VarDeclarationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFodaBinAccess().getVar2VarDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaBin__Var2Assignment_2"


    // $ANTLR start "rule__Quantifiable__MinV1Assignment_1"
    // InternalPLEC.g:4685:1: rule__Quantifiable__MinV1Assignment_1 : ( ruleNumber ) ;
    public final void rule__Quantifiable__MinV1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4689:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4690:2: ( ruleNumber )
            {
            // InternalPLEC.g:4690:2: ( ruleNumber )
            // InternalPLEC.g:4691:3: ruleNumber
            {
             before(grammarAccess.getQuantifiableAccess().getMinV1NumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getQuantifiableAccess().getMinV1NumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__MinV1Assignment_1"


    // $ANTLR start "rule__Quantifiable__MaxV1Assignment_3"
    // InternalPLEC.g:4700:1: rule__Quantifiable__MaxV1Assignment_3 : ( ruleNumber ) ;
    public final void rule__Quantifiable__MaxV1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4704:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4705:2: ( ruleNumber )
            {
            // InternalPLEC.g:4705:2: ( ruleNumber )
            // InternalPLEC.g:4706:3: ruleNumber
            {
             before(grammarAccess.getQuantifiableAccess().getMaxV1NumberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getQuantifiableAccess().getMaxV1NumberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__MaxV1Assignment_3"


    // $ANTLR start "rule__Quantifiable__Var1Assignment_5"
    // InternalPLEC.g:4715:1: rule__Quantifiable__Var1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Quantifiable__Var1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4719:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4720:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4720:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4721:3: ( RULE_ID )
            {
             before(grammarAccess.getQuantifiableAccess().getVar1VarDeclarationCrossReference_5_0()); 
            // InternalPLEC.g:4722:3: ( RULE_ID )
            // InternalPLEC.g:4723:4: RULE_ID
            {
             before(grammarAccess.getQuantifiableAccess().getVar1VarDeclarationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuantifiableAccess().getVar1VarDeclarationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getQuantifiableAccess().getVar1VarDeclarationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Var1Assignment_5"


    // $ANTLR start "rule__Quantifiable__MinV2Assignment_8"
    // InternalPLEC.g:4734:1: rule__Quantifiable__MinV2Assignment_8 : ( ruleNumber ) ;
    public final void rule__Quantifiable__MinV2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4738:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4739:2: ( ruleNumber )
            {
            // InternalPLEC.g:4739:2: ( ruleNumber )
            // InternalPLEC.g:4740:3: ruleNumber
            {
             before(grammarAccess.getQuantifiableAccess().getMinV2NumberParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getQuantifiableAccess().getMinV2NumberParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__MinV2Assignment_8"


    // $ANTLR start "rule__Quantifiable__MaxV2Assignment_10"
    // InternalPLEC.g:4749:1: rule__Quantifiable__MaxV2Assignment_10 : ( ruleNumber ) ;
    public final void rule__Quantifiable__MaxV2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4753:1: ( ( ruleNumber ) )
            // InternalPLEC.g:4754:2: ( ruleNumber )
            {
            // InternalPLEC.g:4754:2: ( ruleNumber )
            // InternalPLEC.g:4755:3: ruleNumber
            {
             before(grammarAccess.getQuantifiableAccess().getMaxV2NumberParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getQuantifiableAccess().getMaxV2NumberParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__MaxV2Assignment_10"


    // $ANTLR start "rule__Quantifiable__Var2Assignment_12"
    // InternalPLEC.g:4764:1: rule__Quantifiable__Var2Assignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Quantifiable__Var2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4768:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4769:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4769:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4770:3: ( RULE_ID )
            {
             before(grammarAccess.getQuantifiableAccess().getVar2VarDeclarationCrossReference_12_0()); 
            // InternalPLEC.g:4771:3: ( RULE_ID )
            // InternalPLEC.g:4772:4: RULE_ID
            {
             before(grammarAccess.getQuantifiableAccess().getVar2VarDeclarationIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuantifiableAccess().getVar2VarDeclarationIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getQuantifiableAccess().getVar2VarDeclarationCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifiable__Var2Assignment_12"


    // $ANTLR start "rule__BoolVal__ValueAssignment"
    // InternalPLEC.g:4783:1: rule__BoolVal__ValueAssignment : ( ( rule__BoolVal__ValueAlternatives_0 ) ) ;
    public final void rule__BoolVal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4787:1: ( ( ( rule__BoolVal__ValueAlternatives_0 ) ) )
            // InternalPLEC.g:4788:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            {
            // InternalPLEC.g:4788:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            // InternalPLEC.g:4789:3: ( rule__BoolVal__ValueAlternatives_0 )
            {
             before(grammarAccess.getBoolValAccess().getValueAlternatives_0()); 
            // InternalPLEC.g:4790:3: ( rule__BoolVal__ValueAlternatives_0 )
            // InternalPLEC.g:4790:4: rule__BoolVal__ValueAlternatives_0
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
    // InternalPLEC.g:4798:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4802:1: ( ( RULE_INT ) )
            // InternalPLEC.g:4803:2: ( RULE_INT )
            {
            // InternalPLEC.g:4803:2: ( RULE_INT )
            // InternalPLEC.g:4804:3: RULE_INT
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
    // InternalPLEC.g:4813:1: rule__Symbol__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Symbol__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4817:1: ( ( RULE_ID ) )
            // InternalPLEC.g:4818:2: ( RULE_ID )
            {
            // InternalPLEC.g:4818:2: ( RULE_ID )
            // InternalPLEC.g:4819:3: RULE_ID
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
    // InternalPLEC.g:4828:1: rule__ListOfValues__ValuesAssignment_0 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4832:1: ( ( ruleValue ) )
            // InternalPLEC.g:4833:2: ( ruleValue )
            {
            // InternalPLEC.g:4833:2: ( ruleValue )
            // InternalPLEC.g:4834:3: ruleValue
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
    // InternalPLEC.g:4843:1: rule__ListOfValues__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4847:1: ( ( ruleValue ) )
            // InternalPLEC.g:4848:2: ( ruleValue )
            {
            // InternalPLEC.g:4848:2: ( ruleValue )
            // InternalPLEC.g:4849:3: ruleValue
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


    // $ANTLR start "rule__ListOfIDs__IdsAssignment_0"
    // InternalPLEC.g:4858:1: rule__ListOfIDs__IdsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListOfIDs__IdsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4862:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4863:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4863:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4864:3: ( RULE_ID )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_0_0()); 
            // InternalPLEC.g:4865:3: ( RULE_ID )
            // InternalPLEC.g:4866:4: RULE_ID
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfIDs__IdsAssignment_0"


    // $ANTLR start "rule__ListOfIDs__IdsAssignment_1_1"
    // InternalPLEC.g:4877:1: rule__ListOfIDs__IdsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListOfIDs__IdsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4881:1: ( ( ( RULE_ID ) ) )
            // InternalPLEC.g:4882:2: ( ( RULE_ID ) )
            {
            // InternalPLEC.g:4882:2: ( ( RULE_ID ) )
            // InternalPLEC.g:4883:3: ( RULE_ID )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_1_1_0()); 
            // InternalPLEC.g:4884:3: ( RULE_ID )
            // InternalPLEC.g:4885:4: RULE_ID
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfIDs__IdsAssignment_1_1"


    // $ANTLR start "rule__ListOfListsOfValues__ValuesAssignment_1"
    // InternalPLEC.g:4896:1: rule__ListOfListsOfValues__ValuesAssignment_1 : ( ruleListOfValues ) ;
    public final void rule__ListOfListsOfValues__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4900:1: ( ( ruleListOfValues ) )
            // InternalPLEC.g:4901:2: ( ruleListOfValues )
            {
            // InternalPLEC.g:4901:2: ( ruleListOfValues )
            // InternalPLEC.g:4902:3: ruleListOfValues
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getValuesListOfValuesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getListOfListsOfValuesAccess().getValuesListOfValuesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListsOfValues__ValuesAssignment_1"


    // $ANTLR start "rule__ListOfListsOfValues__ValuesAssignment_3_2"
    // InternalPLEC.g:4911:1: rule__ListOfListsOfValues__ValuesAssignment_3_2 : ( ruleListOfValues ) ;
    public final void rule__ListOfListsOfValues__ValuesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLEC.g:4915:1: ( ( ruleListOfValues ) )
            // InternalPLEC.g:4916:2: ( ruleListOfValues )
            {
            // InternalPLEC.g:4916:2: ( ruleListOfValues )
            // InternalPLEC.g:4917:3: ruleListOfValues
            {
             before(grammarAccess.getListOfListsOfValuesAccess().getValuesListOfValuesParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getListOfListsOfValuesAccess().getValuesListOfValuesParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfListsOfValues__ValuesAssignment_3_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\12\uffff";
    static final String dfa_3s = "\2\4\7\uffff\1\4\2\uffff";
    static final String dfa_4s = "\1\51\1\53\7\uffff\1\52\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\5\1\7\1\10\1\11\1\4\1\uffff\1\1\1\6";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\17\uffff\3\6\3\uffff\1\7\5\uffff\1\3\1\uffff\1\4\2\uffff\1\5\3\uffff\1\2",
            "\1\12\13\uffff\4\10\15\uffff\1\12\5\uffff\1\11\1\2\2\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\2\5\uffff\2\2\5\uffff\2\13\26\uffff\1\2",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "923:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) | ( ruleAttributes ) | ( ruleTemporal ) | ( ruleQuantifiable ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000010000200E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000010000000E002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000010000000E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000022504700010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000002L});

}