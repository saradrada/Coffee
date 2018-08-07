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
import org.xtext.services.PLhlclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPLhlclParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'boolean'", "'integer'", "'symbolic'", "'requires'", "'excludes'", "'optional'", "'mandatory'", "'model'", "'variables:'", "'constraints:'", "'['", "','", "']'", "'values:'", "'..'", "':'", "'('", "')'", "'structural:'", "'variants:'", "'card:'", "'attributes:'", "'of'", "'is'", "'in'", "'vars:'", "'variants'", "'-->'", "'instantiable'"
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
    public static final int T__40=40;
    public static final int T__41=41;
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

    	public void setGrammarAccess(PLhlclGrammarAccess grammarAccess) {
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
    // InternalPLhlcl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPLhlcl.g:54:1: ( ruleModel EOF )
            // InternalPLhlcl.g:55:1: ruleModel EOF
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
    // InternalPLhlcl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalPLhlcl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalPLhlcl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalPLhlcl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalPLhlcl.g:69:3: ( rule__Model__Group__0 )
            // InternalPLhlcl.g:69:4: rule__Model__Group__0
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
    // InternalPLhlcl.g:78:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalPLhlcl.g:79:1: ( ruleVarDeclaration EOF )
            // InternalPLhlcl.g:80:1: ruleVarDeclaration EOF
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
    // InternalPLhlcl.g:87:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:91:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalPLhlcl.g:92:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalPLhlcl.g:92:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalPLhlcl.g:93:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalPLhlcl.g:94:3: ( rule__VarDeclaration__Group__0 )
            // InternalPLhlcl.g:94:4: rule__VarDeclaration__Group__0
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
    // InternalPLhlcl.g:103:1: entryRuleVariantDeclaration : ruleVariantDeclaration EOF ;
    public final void entryRuleVariantDeclaration() throws RecognitionException {
        try {
            // InternalPLhlcl.g:104:1: ( ruleVariantDeclaration EOF )
            // InternalPLhlcl.g:105:1: ruleVariantDeclaration EOF
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
    // InternalPLhlcl.g:112:1: ruleVariantDeclaration : ( ( rule__VariantDeclaration__Alternatives ) ) ;
    public final void ruleVariantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:116:2: ( ( ( rule__VariantDeclaration__Alternatives ) ) )
            // InternalPLhlcl.g:117:2: ( ( rule__VariantDeclaration__Alternatives ) )
            {
            // InternalPLhlcl.g:117:2: ( ( rule__VariantDeclaration__Alternatives ) )
            // InternalPLhlcl.g:118:3: ( rule__VariantDeclaration__Alternatives )
            {
             before(grammarAccess.getVariantDeclarationAccess().getAlternatives()); 
            // InternalPLhlcl.g:119:3: ( rule__VariantDeclaration__Alternatives )
            // InternalPLhlcl.g:119:4: rule__VariantDeclaration__Alternatives
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
    // InternalPLhlcl.g:128:1: entryRuleVariantsInterval : ruleVariantsInterval EOF ;
    public final void entryRuleVariantsInterval() throws RecognitionException {
        try {
            // InternalPLhlcl.g:129:1: ( ruleVariantsInterval EOF )
            // InternalPLhlcl.g:130:1: ruleVariantsInterval EOF
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
    // InternalPLhlcl.g:137:1: ruleVariantsInterval : ( ( rule__VariantsInterval__Group__0 ) ) ;
    public final void ruleVariantsInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:141:2: ( ( ( rule__VariantsInterval__Group__0 ) ) )
            // InternalPLhlcl.g:142:2: ( ( rule__VariantsInterval__Group__0 ) )
            {
            // InternalPLhlcl.g:142:2: ( ( rule__VariantsInterval__Group__0 ) )
            // InternalPLhlcl.g:143:3: ( rule__VariantsInterval__Group__0 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getGroup()); 
            // InternalPLhlcl.g:144:3: ( rule__VariantsInterval__Group__0 )
            // InternalPLhlcl.g:144:4: rule__VariantsInterval__Group__0
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
    // InternalPLhlcl.g:153:1: entryRuleVariantsEnumeration : ruleVariantsEnumeration EOF ;
    public final void entryRuleVariantsEnumeration() throws RecognitionException {
        try {
            // InternalPLhlcl.g:154:1: ( ruleVariantsEnumeration EOF )
            // InternalPLhlcl.g:155:1: ruleVariantsEnumeration EOF
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
    // InternalPLhlcl.g:162:1: ruleVariantsEnumeration : ( ( rule__VariantsEnumeration__Group__0 ) ) ;
    public final void ruleVariantsEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:166:2: ( ( ( rule__VariantsEnumeration__Group__0 ) ) )
            // InternalPLhlcl.g:167:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            {
            // InternalPLhlcl.g:167:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            // InternalPLhlcl.g:168:3: ( rule__VariantsEnumeration__Group__0 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getGroup()); 
            // InternalPLhlcl.g:169:3: ( rule__VariantsEnumeration__Group__0 )
            // InternalPLhlcl.g:169:4: rule__VariantsEnumeration__Group__0
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
    // InternalPLhlcl.g:178:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalPLhlcl.g:179:1: ( ruleConstraint EOF )
            // InternalPLhlcl.g:180:1: ruleConstraint EOF
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
    // InternalPLhlcl.g:187:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:191:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalPLhlcl.g:192:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalPLhlcl.g:192:2: ( ( rule__Constraint__Group__0 ) )
            // InternalPLhlcl.g:193:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalPLhlcl.g:194:3: ( rule__Constraint__Group__0 )
            // InternalPLhlcl.g:194:4: rule__Constraint__Group__0
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
    // InternalPLhlcl.g:203:1: entryRuleConsExpression : ruleConsExpression EOF ;
    public final void entryRuleConsExpression() throws RecognitionException {
        try {
            // InternalPLhlcl.g:204:1: ( ruleConsExpression EOF )
            // InternalPLhlcl.g:205:1: ruleConsExpression EOF
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
    // InternalPLhlcl.g:212:1: ruleConsExpression : ( ( rule__ConsExpression__Alternatives ) ) ;
    public final void ruleConsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:216:2: ( ( ( rule__ConsExpression__Alternatives ) ) )
            // InternalPLhlcl.g:217:2: ( ( rule__ConsExpression__Alternatives ) )
            {
            // InternalPLhlcl.g:217:2: ( ( rule__ConsExpression__Alternatives ) )
            // InternalPLhlcl.g:218:3: ( rule__ConsExpression__Alternatives )
            {
             before(grammarAccess.getConsExpressionAccess().getAlternatives()); 
            // InternalPLhlcl.g:219:3: ( rule__ConsExpression__Alternatives )
            // InternalPLhlcl.g:219:4: rule__ConsExpression__Alternatives
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
    // InternalPLhlcl.g:228:1: entryRuleTerminalExp : ruleTerminalExp EOF ;
    public final void entryRuleTerminalExp() throws RecognitionException {
        try {
            // InternalPLhlcl.g:229:1: ( ruleTerminalExp EOF )
            // InternalPLhlcl.g:230:1: ruleTerminalExp EOF
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
    // InternalPLhlcl.g:237:1: ruleTerminalExp : ( ( rule__TerminalExp__Alternatives ) ) ;
    public final void ruleTerminalExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:241:2: ( ( ( rule__TerminalExp__Alternatives ) ) )
            // InternalPLhlcl.g:242:2: ( ( rule__TerminalExp__Alternatives ) )
            {
            // InternalPLhlcl.g:242:2: ( ( rule__TerminalExp__Alternatives ) )
            // InternalPLhlcl.g:243:3: ( rule__TerminalExp__Alternatives )
            {
             before(grammarAccess.getTerminalExpAccess().getAlternatives()); 
            // InternalPLhlcl.g:244:3: ( rule__TerminalExp__Alternatives )
            // InternalPLhlcl.g:244:4: rule__TerminalExp__Alternatives
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
    // InternalPLhlcl.g:253:1: entryRuleIDCons : ruleIDCons EOF ;
    public final void entryRuleIDCons() throws RecognitionException {
        try {
            // InternalPLhlcl.g:254:1: ( ruleIDCons EOF )
            // InternalPLhlcl.g:255:1: ruleIDCons EOF
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
    // InternalPLhlcl.g:262:1: ruleIDCons : ( ( rule__IDCons__NameAssignment ) ) ;
    public final void ruleIDCons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:266:2: ( ( ( rule__IDCons__NameAssignment ) ) )
            // InternalPLhlcl.g:267:2: ( ( rule__IDCons__NameAssignment ) )
            {
            // InternalPLhlcl.g:267:2: ( ( rule__IDCons__NameAssignment ) )
            // InternalPLhlcl.g:268:3: ( rule__IDCons__NameAssignment )
            {
             before(grammarAccess.getIDConsAccess().getNameAssignment()); 
            // InternalPLhlcl.g:269:3: ( rule__IDCons__NameAssignment )
            // InternalPLhlcl.g:269:4: rule__IDCons__NameAssignment
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
    // InternalPLhlcl.g:278:1: entryRuleStructural : ruleStructural EOF ;
    public final void entryRuleStructural() throws RecognitionException {
        try {
            // InternalPLhlcl.g:279:1: ( ruleStructural EOF )
            // InternalPLhlcl.g:280:1: ruleStructural EOF
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
    // InternalPLhlcl.g:287:1: ruleStructural : ( ( rule__Structural__Group__0 ) ) ;
    public final void ruleStructural() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:291:2: ( ( ( rule__Structural__Group__0 ) ) )
            // InternalPLhlcl.g:292:2: ( ( rule__Structural__Group__0 ) )
            {
            // InternalPLhlcl.g:292:2: ( ( rule__Structural__Group__0 ) )
            // InternalPLhlcl.g:293:3: ( rule__Structural__Group__0 )
            {
             before(grammarAccess.getStructuralAccess().getGroup()); 
            // InternalPLhlcl.g:294:3: ( rule__Structural__Group__0 )
            // InternalPLhlcl.g:294:4: rule__Structural__Group__0
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


    // $ANTLR start "entryRuleAttributes"
    // InternalPLhlcl.g:303:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalPLhlcl.g:304:1: ( ruleAttributes EOF )
            // InternalPLhlcl.g:305:1: ruleAttributes EOF
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
    // InternalPLhlcl.g:312:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:316:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalPLhlcl.g:317:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalPLhlcl.g:317:2: ( ( rule__Attributes__Group__0 ) )
            // InternalPLhlcl.g:318:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalPLhlcl.g:319:3: ( rule__Attributes__Group__0 )
            // InternalPLhlcl.g:319:4: rule__Attributes__Group__0
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
    // InternalPLhlcl.g:328:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalPLhlcl.g:329:1: ( ruleRefinement EOF )
            // InternalPLhlcl.g:330:1: ruleRefinement EOF
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
    // InternalPLhlcl.g:337:1: ruleRefinement : ( ( rule__Refinement__Alternatives ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:341:2: ( ( ( rule__Refinement__Alternatives ) ) )
            // InternalPLhlcl.g:342:2: ( ( rule__Refinement__Alternatives ) )
            {
            // InternalPLhlcl.g:342:2: ( ( rule__Refinement__Alternatives ) )
            // InternalPLhlcl.g:343:3: ( rule__Refinement__Alternatives )
            {
             before(grammarAccess.getRefinementAccess().getAlternatives()); 
            // InternalPLhlcl.g:344:3: ( rule__Refinement__Alternatives )
            // InternalPLhlcl.g:344:4: rule__Refinement__Alternatives
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
    // InternalPLhlcl.g:353:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPLhlcl.g:354:1: ( ruleAssignment EOF )
            // InternalPLhlcl.g:355:1: ruleAssignment EOF
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
    // InternalPLhlcl.g:362:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:366:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalPLhlcl.g:367:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalPLhlcl.g:367:2: ( ( rule__Assignment__Group__0 ) )
            // InternalPLhlcl.g:368:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalPLhlcl.g:369:3: ( rule__Assignment__Group__0 )
            // InternalPLhlcl.g:369:4: rule__Assignment__Group__0
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
    // InternalPLhlcl.g:378:1: entryRuleVarRefinement : ruleVarRefinement EOF ;
    public final void entryRuleVarRefinement() throws RecognitionException {
        try {
            // InternalPLhlcl.g:379:1: ( ruleVarRefinement EOF )
            // InternalPLhlcl.g:380:1: ruleVarRefinement EOF
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
    // InternalPLhlcl.g:387:1: ruleVarRefinement : ( ( rule__VarRefinement__Group__0 ) ) ;
    public final void ruleVarRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:391:2: ( ( ( rule__VarRefinement__Group__0 ) ) )
            // InternalPLhlcl.g:392:2: ( ( rule__VarRefinement__Group__0 ) )
            {
            // InternalPLhlcl.g:392:2: ( ( rule__VarRefinement__Group__0 ) )
            // InternalPLhlcl.g:393:3: ( rule__VarRefinement__Group__0 )
            {
             before(grammarAccess.getVarRefinementAccess().getGroup()); 
            // InternalPLhlcl.g:394:3: ( rule__VarRefinement__Group__0 )
            // InternalPLhlcl.g:394:4: rule__VarRefinement__Group__0
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
    // InternalPLhlcl.g:403:1: entryRuleSetRefinement : ruleSetRefinement EOF ;
    public final void entryRuleSetRefinement() throws RecognitionException {
        try {
            // InternalPLhlcl.g:404:1: ( ruleSetRefinement EOF )
            // InternalPLhlcl.g:405:1: ruleSetRefinement EOF
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
    // InternalPLhlcl.g:412:1: ruleSetRefinement : ( ( rule__SetRefinement__Group__0 ) ) ;
    public final void ruleSetRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:416:2: ( ( ( rule__SetRefinement__Group__0 ) ) )
            // InternalPLhlcl.g:417:2: ( ( rule__SetRefinement__Group__0 ) )
            {
            // InternalPLhlcl.g:417:2: ( ( rule__SetRefinement__Group__0 ) )
            // InternalPLhlcl.g:418:3: ( rule__SetRefinement__Group__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup()); 
            // InternalPLhlcl.g:419:3: ( rule__SetRefinement__Group__0 )
            // InternalPLhlcl.g:419:4: rule__SetRefinement__Group__0
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


    // $ANTLR start "entryRuleRule"
    // InternalPLhlcl.g:428:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalPLhlcl.g:429:1: ( ruleRule EOF )
            // InternalPLhlcl.g:430:1: ruleRule EOF
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
    // InternalPLhlcl.g:437:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:441:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalPLhlcl.g:442:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalPLhlcl.g:442:2: ( ( rule__Rule__Group__0 ) )
            // InternalPLhlcl.g:443:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalPLhlcl.g:444:3: ( rule__Rule__Group__0 )
            // InternalPLhlcl.g:444:4: rule__Rule__Group__0
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
    // InternalPLhlcl.g:453:1: entryRuleFodaUN : ruleFodaUN EOF ;
    public final void entryRuleFodaUN() throws RecognitionException {
        try {
            // InternalPLhlcl.g:454:1: ( ruleFodaUN EOF )
            // InternalPLhlcl.g:455:1: ruleFodaUN EOF
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
    // InternalPLhlcl.g:462:1: ruleFodaUN : ( ( rule__FodaUN__Group__0 ) ) ;
    public final void ruleFodaUN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:466:2: ( ( ( rule__FodaUN__Group__0 ) ) )
            // InternalPLhlcl.g:467:2: ( ( rule__FodaUN__Group__0 ) )
            {
            // InternalPLhlcl.g:467:2: ( ( rule__FodaUN__Group__0 ) )
            // InternalPLhlcl.g:468:3: ( rule__FodaUN__Group__0 )
            {
             before(grammarAccess.getFodaUNAccess().getGroup()); 
            // InternalPLhlcl.g:469:3: ( rule__FodaUN__Group__0 )
            // InternalPLhlcl.g:469:4: rule__FodaUN__Group__0
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
    // InternalPLhlcl.g:478:1: entryRuleFodaBin : ruleFodaBin EOF ;
    public final void entryRuleFodaBin() throws RecognitionException {
        try {
            // InternalPLhlcl.g:479:1: ( ruleFodaBin EOF )
            // InternalPLhlcl.g:480:1: ruleFodaBin EOF
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
    // InternalPLhlcl.g:487:1: ruleFodaBin : ( ( rule__FodaBin__Group__0 ) ) ;
    public final void ruleFodaBin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:491:2: ( ( ( rule__FodaBin__Group__0 ) ) )
            // InternalPLhlcl.g:492:2: ( ( rule__FodaBin__Group__0 ) )
            {
            // InternalPLhlcl.g:492:2: ( ( rule__FodaBin__Group__0 ) )
            // InternalPLhlcl.g:493:3: ( rule__FodaBin__Group__0 )
            {
             before(grammarAccess.getFodaBinAccess().getGroup()); 
            // InternalPLhlcl.g:494:3: ( rule__FodaBin__Group__0 )
            // InternalPLhlcl.g:494:4: rule__FodaBin__Group__0
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


    // $ANTLR start "entryRuleBoolVal"
    // InternalPLhlcl.g:503:1: entryRuleBoolVal : ruleBoolVal EOF ;
    public final void entryRuleBoolVal() throws RecognitionException {
        try {
            // InternalPLhlcl.g:504:1: ( ruleBoolVal EOF )
            // InternalPLhlcl.g:505:1: ruleBoolVal EOF
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
    // InternalPLhlcl.g:512:1: ruleBoolVal : ( ( rule__BoolVal__ValueAssignment ) ) ;
    public final void ruleBoolVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:516:2: ( ( ( rule__BoolVal__ValueAssignment ) ) )
            // InternalPLhlcl.g:517:2: ( ( rule__BoolVal__ValueAssignment ) )
            {
            // InternalPLhlcl.g:517:2: ( ( rule__BoolVal__ValueAssignment ) )
            // InternalPLhlcl.g:518:3: ( rule__BoolVal__ValueAssignment )
            {
             before(grammarAccess.getBoolValAccess().getValueAssignment()); 
            // InternalPLhlcl.g:519:3: ( rule__BoolVal__ValueAssignment )
            // InternalPLhlcl.g:519:4: rule__BoolVal__ValueAssignment
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
    // InternalPLhlcl.g:528:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalPLhlcl.g:529:1: ( ruleNumber EOF )
            // InternalPLhlcl.g:530:1: ruleNumber EOF
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
    // InternalPLhlcl.g:537:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:541:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalPLhlcl.g:542:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalPLhlcl.g:542:2: ( ( rule__Number__ValueAssignment ) )
            // InternalPLhlcl.g:543:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalPLhlcl.g:544:3: ( rule__Number__ValueAssignment )
            // InternalPLhlcl.g:544:4: rule__Number__ValueAssignment
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
    // InternalPLhlcl.g:553:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalPLhlcl.g:554:1: ( ruleSymbol EOF )
            // InternalPLhlcl.g:555:1: ruleSymbol EOF
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
    // InternalPLhlcl.g:562:1: ruleSymbol : ( ( rule__Symbol__ValueAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:566:2: ( ( ( rule__Symbol__ValueAssignment ) ) )
            // InternalPLhlcl.g:567:2: ( ( rule__Symbol__ValueAssignment ) )
            {
            // InternalPLhlcl.g:567:2: ( ( rule__Symbol__ValueAssignment ) )
            // InternalPLhlcl.g:568:3: ( rule__Symbol__ValueAssignment )
            {
             before(grammarAccess.getSymbolAccess().getValueAssignment()); 
            // InternalPLhlcl.g:569:3: ( rule__Symbol__ValueAssignment )
            // InternalPLhlcl.g:569:4: rule__Symbol__ValueAssignment
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
    // InternalPLhlcl.g:578:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalPLhlcl.g:579:1: ( ruleValue EOF )
            // InternalPLhlcl.g:580:1: ruleValue EOF
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
    // InternalPLhlcl.g:587:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:591:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalPLhlcl.g:592:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalPLhlcl.g:592:2: ( ( rule__Value__Alternatives ) )
            // InternalPLhlcl.g:593:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalPLhlcl.g:594:3: ( rule__Value__Alternatives )
            // InternalPLhlcl.g:594:4: rule__Value__Alternatives
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
    // InternalPLhlcl.g:603:1: entryRuleNonEnumerableValue : ruleNonEnumerableValue EOF ;
    public final void entryRuleNonEnumerableValue() throws RecognitionException {
        try {
            // InternalPLhlcl.g:604:1: ( ruleNonEnumerableValue EOF )
            // InternalPLhlcl.g:605:1: ruleNonEnumerableValue EOF
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
    // InternalPLhlcl.g:612:1: ruleNonEnumerableValue : ( ( rule__NonEnumerableValue__Alternatives ) ) ;
    public final void ruleNonEnumerableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:616:2: ( ( ( rule__NonEnumerableValue__Alternatives ) ) )
            // InternalPLhlcl.g:617:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            {
            // InternalPLhlcl.g:617:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            // InternalPLhlcl.g:618:3: ( rule__NonEnumerableValue__Alternatives )
            {
             before(grammarAccess.getNonEnumerableValueAccess().getAlternatives()); 
            // InternalPLhlcl.g:619:3: ( rule__NonEnumerableValue__Alternatives )
            // InternalPLhlcl.g:619:4: rule__NonEnumerableValue__Alternatives
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
    // InternalPLhlcl.g:628:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalPLhlcl.g:629:1: ( ruleVarType EOF )
            // InternalPLhlcl.g:630:1: ruleVarType EOF
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
    // InternalPLhlcl.g:637:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:641:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalPLhlcl.g:642:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalPLhlcl.g:642:2: ( ( rule__VarType__Alternatives ) )
            // InternalPLhlcl.g:643:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalPLhlcl.g:644:3: ( rule__VarType__Alternatives )
            // InternalPLhlcl.g:644:4: rule__VarType__Alternatives
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
    // InternalPLhlcl.g:653:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalPLhlcl.g:654:1: ( ruleListOfValues EOF )
            // InternalPLhlcl.g:655:1: ruleListOfValues EOF
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
    // InternalPLhlcl.g:662:1: ruleListOfValues : ( ( rule__ListOfValues__Group__0 ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:666:2: ( ( ( rule__ListOfValues__Group__0 ) ) )
            // InternalPLhlcl.g:667:2: ( ( rule__ListOfValues__Group__0 ) )
            {
            // InternalPLhlcl.g:667:2: ( ( rule__ListOfValues__Group__0 ) )
            // InternalPLhlcl.g:668:3: ( rule__ListOfValues__Group__0 )
            {
             before(grammarAccess.getListOfValuesAccess().getGroup()); 
            // InternalPLhlcl.g:669:3: ( rule__ListOfValues__Group__0 )
            // InternalPLhlcl.g:669:4: rule__ListOfValues__Group__0
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
    // InternalPLhlcl.g:678:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalPLhlcl.g:679:1: ( ruleListOfIDs EOF )
            // InternalPLhlcl.g:680:1: ruleListOfIDs EOF
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
    // InternalPLhlcl.g:687:1: ruleListOfIDs : ( ( rule__ListOfIDs__Group__0 ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:691:2: ( ( ( rule__ListOfIDs__Group__0 ) ) )
            // InternalPLhlcl.g:692:2: ( ( rule__ListOfIDs__Group__0 ) )
            {
            // InternalPLhlcl.g:692:2: ( ( rule__ListOfIDs__Group__0 ) )
            // InternalPLhlcl.g:693:3: ( rule__ListOfIDs__Group__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup()); 
            // InternalPLhlcl.g:694:3: ( rule__ListOfIDs__Group__0 )
            // InternalPLhlcl.g:694:4: rule__ListOfIDs__Group__0
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


    // $ANTLR start "entryRuleBinOp"
    // InternalPLhlcl.g:703:1: entryRuleBinOp : ruleBinOp EOF ;
    public final void entryRuleBinOp() throws RecognitionException {
        try {
            // InternalPLhlcl.g:704:1: ( ruleBinOp EOF )
            // InternalPLhlcl.g:705:1: ruleBinOp EOF
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
    // InternalPLhlcl.g:712:1: ruleBinOp : ( ( rule__BinOp__Alternatives ) ) ;
    public final void ruleBinOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:716:2: ( ( ( rule__BinOp__Alternatives ) ) )
            // InternalPLhlcl.g:717:2: ( ( rule__BinOp__Alternatives ) )
            {
            // InternalPLhlcl.g:717:2: ( ( rule__BinOp__Alternatives ) )
            // InternalPLhlcl.g:718:3: ( rule__BinOp__Alternatives )
            {
             before(grammarAccess.getBinOpAccess().getAlternatives()); 
            // InternalPLhlcl.g:719:3: ( rule__BinOp__Alternatives )
            // InternalPLhlcl.g:719:4: rule__BinOp__Alternatives
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
    // InternalPLhlcl.g:728:1: entryRuleUnaryOp : ruleUnaryOp EOF ;
    public final void entryRuleUnaryOp() throws RecognitionException {
        try {
            // InternalPLhlcl.g:729:1: ( ruleUnaryOp EOF )
            // InternalPLhlcl.g:730:1: ruleUnaryOp EOF
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
    // InternalPLhlcl.g:737:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:741:2: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // InternalPLhlcl.g:742:2: ( ( rule__UnaryOp__Alternatives ) )
            {
            // InternalPLhlcl.g:742:2: ( ( rule__UnaryOp__Alternatives ) )
            // InternalPLhlcl.g:743:3: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // InternalPLhlcl.g:744:3: ( rule__UnaryOp__Alternatives )
            // InternalPLhlcl.g:744:4: rule__UnaryOp__Alternatives
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


    // $ANTLR start "rule__VariantDeclaration__Alternatives"
    // InternalPLhlcl.g:752:1: rule__VariantDeclaration__Alternatives : ( ( ruleVariantsInterval ) | ( ruleVariantsEnumeration ) );
    public final void rule__VariantDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:756:1: ( ( ruleVariantsInterval ) | ( ruleVariantsEnumeration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPLhlcl.g:757:2: ( ruleVariantsInterval )
                    {
                    // InternalPLhlcl.g:757:2: ( ruleVariantsInterval )
                    // InternalPLhlcl.g:758:3: ruleVariantsInterval
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
                    // InternalPLhlcl.g:763:2: ( ruleVariantsEnumeration )
                    {
                    // InternalPLhlcl.g:763:2: ( ruleVariantsEnumeration )
                    // InternalPLhlcl.g:764:3: ruleVariantsEnumeration
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
    // InternalPLhlcl.g:773:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) | ( ruleAttributes ) );
    public final void rule__ConsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:777:1: ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) | ( ruleAttributes ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalPLhlcl.g:778:2: ( ruleIDCons )
                    {
                    // InternalPLhlcl.g:778:2: ( ruleIDCons )
                    // InternalPLhlcl.g:779:3: ruleIDCons
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
                    // InternalPLhlcl.g:784:2: ( ruleRefinement )
                    {
                    // InternalPLhlcl.g:784:2: ( ruleRefinement )
                    // InternalPLhlcl.g:785:3: ruleRefinement
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
                    // InternalPLhlcl.g:790:2: ( ruleRule )
                    {
                    // InternalPLhlcl.g:790:2: ( ruleRule )
                    // InternalPLhlcl.g:791:3: ruleRule
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
                    // InternalPLhlcl.g:796:2: ( ruleFodaBin )
                    {
                    // InternalPLhlcl.g:796:2: ( ruleFodaBin )
                    // InternalPLhlcl.g:797:3: ruleFodaBin
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
                    // InternalPLhlcl.g:802:2: ( ruleStructural )
                    {
                    // InternalPLhlcl.g:802:2: ( ruleStructural )
                    // InternalPLhlcl.g:803:3: ruleStructural
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
                    // InternalPLhlcl.g:808:2: ( ruleFodaUN )
                    {
                    // InternalPLhlcl.g:808:2: ( ruleFodaUN )
                    // InternalPLhlcl.g:809:3: ruleFodaUN
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
                    // InternalPLhlcl.g:814:2: ( ruleAttributes )
                    {
                    // InternalPLhlcl.g:814:2: ( ruleAttributes )
                    // InternalPLhlcl.g:815:3: ruleAttributes
                    {
                     before(grammarAccess.getConsExpressionAccess().getAttributesParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributes();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getAttributesParserRuleCall_6()); 

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
    // InternalPLhlcl.g:824:1: rule__TerminalExp__Alternatives : ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) );
    public final void rule__TerminalExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:828:1: ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
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
                    // InternalPLhlcl.g:829:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    {
                    // InternalPLhlcl.g:829:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    // InternalPLhlcl.g:830:3: ( rule__TerminalExp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpAccess().getGroup_0()); 
                    // InternalPLhlcl.g:831:3: ( rule__TerminalExp__Group_0__0 )
                    // InternalPLhlcl.g:831:4: rule__TerminalExp__Group_0__0
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
                    // InternalPLhlcl.g:835:2: ( ruleIDCons )
                    {
                    // InternalPLhlcl.g:835:2: ( ruleIDCons )
                    // InternalPLhlcl.g:836:3: ruleIDCons
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
    // InternalPLhlcl.g:845:1: rule__Refinement__Alternatives : ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) );
    public final void rule__Refinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:849:1: ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==37) ) {
                    alt4=2;
                }
                else if ( (LA4_1==36) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==38) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPLhlcl.g:850:2: ( ruleAssignment )
                    {
                    // InternalPLhlcl.g:850:2: ( ruleAssignment )
                    // InternalPLhlcl.g:851:3: ruleAssignment
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
                    // InternalPLhlcl.g:856:2: ( ruleVarRefinement )
                    {
                    // InternalPLhlcl.g:856:2: ( ruleVarRefinement )
                    // InternalPLhlcl.g:857:3: ruleVarRefinement
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
                    // InternalPLhlcl.g:862:2: ( ruleSetRefinement )
                    {
                    // InternalPLhlcl.g:862:2: ( ruleSetRefinement )
                    // InternalPLhlcl.g:863:3: ruleSetRefinement
                    {
                     before(grammarAccess.getRefinementAccess().getSetRefinementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSetRefinement();

                    state._fsp--;

                     after(grammarAccess.getRefinementAccess().getSetRefinementParserRuleCall_2()); 

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
    // InternalPLhlcl.g:872:1: rule__BoolVal__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BoolVal__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:876:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalPLhlcl.g:877:2: ( 'true' )
                    {
                    // InternalPLhlcl.g:877:2: ( 'true' )
                    // InternalPLhlcl.g:878:3: 'true'
                    {
                     before(grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:883:2: ( 'false' )
                    {
                    // InternalPLhlcl.g:883:2: ( 'false' )
                    // InternalPLhlcl.g:884:3: 'false'
                    {
                     before(grammarAccess.getBoolValAccess().getValueFalseKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalPLhlcl.g:893:1: rule__Value__Alternatives : ( ( ruleNumber ) | ( ruleNonEnumerableValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:897:1: ( ( ruleNumber ) | ( ruleNonEnumerableValue ) )
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
                    // InternalPLhlcl.g:898:2: ( ruleNumber )
                    {
                    // InternalPLhlcl.g:898:2: ( ruleNumber )
                    // InternalPLhlcl.g:899:3: ruleNumber
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
                    // InternalPLhlcl.g:904:2: ( ruleNonEnumerableValue )
                    {
                    // InternalPLhlcl.g:904:2: ( ruleNonEnumerableValue )
                    // InternalPLhlcl.g:905:3: ruleNonEnumerableValue
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
    // InternalPLhlcl.g:914:1: rule__NonEnumerableValue__Alternatives : ( ( ruleBoolVal ) | ( ruleSymbol ) );
    public final void rule__NonEnumerableValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:918:1: ( ( ruleBoolVal ) | ( ruleSymbol ) )
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
                    // InternalPLhlcl.g:919:2: ( ruleBoolVal )
                    {
                    // InternalPLhlcl.g:919:2: ( ruleBoolVal )
                    // InternalPLhlcl.g:920:3: ruleBoolVal
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
                    // InternalPLhlcl.g:925:2: ( ruleSymbol )
                    {
                    // InternalPLhlcl.g:925:2: ( ruleSymbol )
                    // InternalPLhlcl.g:926:3: ruleSymbol
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
    // InternalPLhlcl.g:935:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:939:1: ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) )
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
                    // InternalPLhlcl.g:940:2: ( 'boolean' )
                    {
                    // InternalPLhlcl.g:940:2: ( 'boolean' )
                    // InternalPLhlcl.g:941:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:946:2: ( 'integer' )
                    {
                    // InternalPLhlcl.g:946:2: ( 'integer' )
                    // InternalPLhlcl.g:947:3: 'integer'
                    {
                     before(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:952:2: ( 'symbolic' )
                    {
                    // InternalPLhlcl.g:952:2: ( 'symbolic' )
                    // InternalPLhlcl.g:953:3: 'symbolic'
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
    // InternalPLhlcl.g:962:1: rule__BinOp__Alternatives : ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__BinOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:966:1: ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) )
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
                    // InternalPLhlcl.g:967:2: ( 'requires' )
                    {
                    // InternalPLhlcl.g:967:2: ( 'requires' )
                    // InternalPLhlcl.g:968:3: 'requires'
                    {
                     before(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:973:2: ( 'excludes' )
                    {
                    // InternalPLhlcl.g:973:2: ( 'excludes' )
                    // InternalPLhlcl.g:974:3: 'excludes'
                    {
                     before(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:979:2: ( 'optional' )
                    {
                    // InternalPLhlcl.g:979:2: ( 'optional' )
                    // InternalPLhlcl.g:980:3: 'optional'
                    {
                     before(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPLhlcl.g:985:2: ( 'mandatory' )
                    {
                    // InternalPLhlcl.g:985:2: ( 'mandatory' )
                    // InternalPLhlcl.g:986:3: 'mandatory'
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
    // InternalPLhlcl.g:995:1: rule__UnaryOp__Alternatives : ( ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:999:1: ( ( 'optional' ) | ( 'mandatory' ) )
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
                    // InternalPLhlcl.g:1000:2: ( 'optional' )
                    {
                    // InternalPLhlcl.g:1000:2: ( 'optional' )
                    // InternalPLhlcl.g:1001:3: 'optional'
                    {
                     before(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:1006:2: ( 'mandatory' )
                    {
                    // InternalPLhlcl.g:1006:2: ( 'mandatory' )
                    // InternalPLhlcl.g:1007:3: 'mandatory'
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalPLhlcl.g:1016:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1020:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPLhlcl.g:1021:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPLhlcl.g:1028:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1032:1: ( ( 'model' ) )
            // InternalPLhlcl.g:1033:1: ( 'model' )
            {
            // InternalPLhlcl.g:1033:1: ( 'model' )
            // InternalPLhlcl.g:1034:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalPLhlcl.g:1043:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1047:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPLhlcl.g:1048:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalPLhlcl.g:1055:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1059:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalPLhlcl.g:1060:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalPLhlcl.g:1060:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalPLhlcl.g:1061:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalPLhlcl.g:1062:2: ( rule__Model__NameAssignment_1 )
            // InternalPLhlcl.g:1062:3: rule__Model__NameAssignment_1
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
    // InternalPLhlcl.g:1070:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1074:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPLhlcl.g:1075:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalPLhlcl.g:1082:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1086:1: ( ( 'variables:' ) )
            // InternalPLhlcl.g:1087:1: ( 'variables:' )
            {
            // InternalPLhlcl.g:1087:1: ( 'variables:' )
            // InternalPLhlcl.g:1088:2: 'variables:'
            {
             before(grammarAccess.getModelAccess().getVariablesKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalPLhlcl.g:1097:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1101:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalPLhlcl.g:1102:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalPLhlcl.g:1109:1: rule__Model__Group__3__Impl : ( ( rule__Model__VarsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1113:1: ( ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalPLhlcl.g:1114:1: ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalPLhlcl.g:1114:1: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalPLhlcl.g:1115:2: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalPLhlcl.g:1116:2: ( rule__Model__VarsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=13 && LA11_0<=15)||LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPLhlcl.g:1116:3: rule__Model__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__VarsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalPLhlcl.g:1124:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1128:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalPLhlcl.g:1129:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalPLhlcl.g:1136:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1140:1: ( ( 'constraints:' ) )
            // InternalPLhlcl.g:1141:1: ( 'constraints:' )
            {
            // InternalPLhlcl.g:1141:1: ( 'constraints:' )
            // InternalPLhlcl.g:1142:2: 'constraints:'
            {
             before(grammarAccess.getModelAccess().getConstraintsKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPLhlcl.g:1151:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1155:1: ( rule__Model__Group__5__Impl )
            // InternalPLhlcl.g:1156:2: rule__Model__Group__5__Impl
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
    // InternalPLhlcl.g:1162:1: rule__Model__Group__5__Impl : ( ( rule__Model__ConstraintsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1166:1: ( ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalPLhlcl.g:1167:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalPLhlcl.g:1167:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalPLhlcl.g:1168:2: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalPLhlcl.g:1169:2: ( rule__Model__ConstraintsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPLhlcl.g:1169:3: rule__Model__ConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__ConstraintsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalPLhlcl.g:1178:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1182:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPLhlcl.g:1183:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
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
    // InternalPLhlcl.g:1190:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__Group_0__0 )? ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1194:1: ( ( ( rule__VarDeclaration__Group_0__0 )? ) )
            // InternalPLhlcl.g:1195:1: ( ( rule__VarDeclaration__Group_0__0 )? )
            {
            // InternalPLhlcl.g:1195:1: ( ( rule__VarDeclaration__Group_0__0 )? )
            // InternalPLhlcl.g:1196:2: ( rule__VarDeclaration__Group_0__0 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup_0()); 
            // InternalPLhlcl.g:1197:2: ( rule__VarDeclaration__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPLhlcl.g:1197:3: rule__VarDeclaration__Group_0__0
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
    // InternalPLhlcl.g:1205:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1209:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalPLhlcl.g:1210:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
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
    // InternalPLhlcl.g:1217:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1221:1: ( ( ( rule__VarDeclaration__TypeAssignment_1 ) ) )
            // InternalPLhlcl.g:1222:1: ( ( rule__VarDeclaration__TypeAssignment_1 ) )
            {
            // InternalPLhlcl.g:1222:1: ( ( rule__VarDeclaration__TypeAssignment_1 ) )
            // InternalPLhlcl.g:1223:2: ( rule__VarDeclaration__TypeAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1()); 
            // InternalPLhlcl.g:1224:2: ( rule__VarDeclaration__TypeAssignment_1 )
            // InternalPLhlcl.g:1224:3: rule__VarDeclaration__TypeAssignment_1
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
    // InternalPLhlcl.g:1232:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1236:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalPLhlcl.g:1237:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
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
    // InternalPLhlcl.g:1244:1: rule__VarDeclaration__Group__2__Impl : ( ( rule__VarDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1248:1: ( ( ( rule__VarDeclaration__NameAssignment_2 ) ) )
            // InternalPLhlcl.g:1249:1: ( ( rule__VarDeclaration__NameAssignment_2 ) )
            {
            // InternalPLhlcl.g:1249:1: ( ( rule__VarDeclaration__NameAssignment_2 ) )
            // InternalPLhlcl.g:1250:2: ( rule__VarDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_2()); 
            // InternalPLhlcl.g:1251:2: ( rule__VarDeclaration__NameAssignment_2 )
            // InternalPLhlcl.g:1251:3: rule__VarDeclaration__NameAssignment_2
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
    // InternalPLhlcl.g:1259:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1263:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalPLhlcl.g:1264:2: rule__VarDeclaration__Group__3__Impl
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
    // InternalPLhlcl.g:1270:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__Group_3__0 )? ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1274:1: ( ( ( rule__VarDeclaration__Group_3__0 )? ) )
            // InternalPLhlcl.g:1275:1: ( ( rule__VarDeclaration__Group_3__0 )? )
            {
            // InternalPLhlcl.g:1275:1: ( ( rule__VarDeclaration__Group_3__0 )? )
            // InternalPLhlcl.g:1276:2: ( rule__VarDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup_3()); 
            // InternalPLhlcl.g:1277:2: ( rule__VarDeclaration__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPLhlcl.g:1277:3: rule__VarDeclaration__Group_3__0
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
    // InternalPLhlcl.g:1286:1: rule__VarDeclaration__Group_0__0 : rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 ;
    public final void rule__VarDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1290:1: ( rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 )
            // InternalPLhlcl.g:1291:2: rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1
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
    // InternalPLhlcl.g:1298:1: rule__VarDeclaration__Group_0__0__Impl : ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) ) ;
    public final void rule__VarDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1302:1: ( ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) ) )
            // InternalPLhlcl.g:1303:1: ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) )
            {
            // InternalPLhlcl.g:1303:1: ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) )
            // InternalPLhlcl.g:1304:2: ( rule__VarDeclaration__InstantiableAssignment_0_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0_0()); 
            // InternalPLhlcl.g:1305:2: ( rule__VarDeclaration__InstantiableAssignment_0_0 )
            // InternalPLhlcl.g:1305:3: rule__VarDeclaration__InstantiableAssignment_0_0
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
    // InternalPLhlcl.g:1313:1: rule__VarDeclaration__Group_0__1 : rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2 ;
    public final void rule__VarDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1317:1: ( rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2 )
            // InternalPLhlcl.g:1318:2: rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2
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
    // InternalPLhlcl.g:1325:1: rule__VarDeclaration__Group_0__1__Impl : ( '[' ) ;
    public final void rule__VarDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1329:1: ( ( '[' ) )
            // InternalPLhlcl.g:1330:1: ( '[' )
            {
            // InternalPLhlcl.g:1330:1: ( '[' )
            // InternalPLhlcl.g:1331:2: '['
            {
             before(grammarAccess.getVarDeclarationAccess().getLeftSquareBracketKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPLhlcl.g:1340:1: rule__VarDeclaration__Group_0__2 : rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3 ;
    public final void rule__VarDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1344:1: ( rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3 )
            // InternalPLhlcl.g:1345:2: rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3
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
    // InternalPLhlcl.g:1352:1: rule__VarDeclaration__Group_0__2__Impl : ( ( rule__VarDeclaration__MinAssignment_0_2 ) ) ;
    public final void rule__VarDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1356:1: ( ( ( rule__VarDeclaration__MinAssignment_0_2 ) ) )
            // InternalPLhlcl.g:1357:1: ( ( rule__VarDeclaration__MinAssignment_0_2 ) )
            {
            // InternalPLhlcl.g:1357:1: ( ( rule__VarDeclaration__MinAssignment_0_2 ) )
            // InternalPLhlcl.g:1358:2: ( rule__VarDeclaration__MinAssignment_0_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getMinAssignment_0_2()); 
            // InternalPLhlcl.g:1359:2: ( rule__VarDeclaration__MinAssignment_0_2 )
            // InternalPLhlcl.g:1359:3: rule__VarDeclaration__MinAssignment_0_2
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
    // InternalPLhlcl.g:1367:1: rule__VarDeclaration__Group_0__3 : rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4 ;
    public final void rule__VarDeclaration__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1371:1: ( rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4 )
            // InternalPLhlcl.g:1372:2: rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4
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
    // InternalPLhlcl.g:1379:1: rule__VarDeclaration__Group_0__3__Impl : ( ',' ) ;
    public final void rule__VarDeclaration__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1383:1: ( ( ',' ) )
            // InternalPLhlcl.g:1384:1: ( ',' )
            {
            // InternalPLhlcl.g:1384:1: ( ',' )
            // InternalPLhlcl.g:1385:2: ','
            {
             before(grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPLhlcl.g:1394:1: rule__VarDeclaration__Group_0__4 : rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5 ;
    public final void rule__VarDeclaration__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1398:1: ( rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5 )
            // InternalPLhlcl.g:1399:2: rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5
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
    // InternalPLhlcl.g:1406:1: rule__VarDeclaration__Group_0__4__Impl : ( ( rule__VarDeclaration__MaxAssignment_0_4 ) ) ;
    public final void rule__VarDeclaration__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1410:1: ( ( ( rule__VarDeclaration__MaxAssignment_0_4 ) ) )
            // InternalPLhlcl.g:1411:1: ( ( rule__VarDeclaration__MaxAssignment_0_4 ) )
            {
            // InternalPLhlcl.g:1411:1: ( ( rule__VarDeclaration__MaxAssignment_0_4 ) )
            // InternalPLhlcl.g:1412:2: ( rule__VarDeclaration__MaxAssignment_0_4 )
            {
             before(grammarAccess.getVarDeclarationAccess().getMaxAssignment_0_4()); 
            // InternalPLhlcl.g:1413:2: ( rule__VarDeclaration__MaxAssignment_0_4 )
            // InternalPLhlcl.g:1413:3: rule__VarDeclaration__MaxAssignment_0_4
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
    // InternalPLhlcl.g:1421:1: rule__VarDeclaration__Group_0__5 : rule__VarDeclaration__Group_0__5__Impl ;
    public final void rule__VarDeclaration__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1425:1: ( rule__VarDeclaration__Group_0__5__Impl )
            // InternalPLhlcl.g:1426:2: rule__VarDeclaration__Group_0__5__Impl
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
    // InternalPLhlcl.g:1432:1: rule__VarDeclaration__Group_0__5__Impl : ( ']' ) ;
    public final void rule__VarDeclaration__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1436:1: ( ( ']' ) )
            // InternalPLhlcl.g:1437:1: ( ']' )
            {
            // InternalPLhlcl.g:1437:1: ( ']' )
            // InternalPLhlcl.g:1438:2: ']'
            {
             before(grammarAccess.getVarDeclarationAccess().getRightSquareBracketKeyword_0_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPLhlcl.g:1448:1: rule__VarDeclaration__Group_3__0 : rule__VarDeclaration__Group_3__0__Impl rule__VarDeclaration__Group_3__1 ;
    public final void rule__VarDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1452:1: ( rule__VarDeclaration__Group_3__0__Impl rule__VarDeclaration__Group_3__1 )
            // InternalPLhlcl.g:1453:2: rule__VarDeclaration__Group_3__0__Impl rule__VarDeclaration__Group_3__1
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
    // InternalPLhlcl.g:1460:1: rule__VarDeclaration__Group_3__0__Impl : ( 'values:' ) ;
    public final void rule__VarDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1464:1: ( ( 'values:' ) )
            // InternalPLhlcl.g:1465:1: ( 'values:' )
            {
            // InternalPLhlcl.g:1465:1: ( 'values:' )
            // InternalPLhlcl.g:1466:2: 'values:'
            {
             before(grammarAccess.getVarDeclarationAccess().getValuesKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPLhlcl.g:1475:1: rule__VarDeclaration__Group_3__1 : rule__VarDeclaration__Group_3__1__Impl ;
    public final void rule__VarDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1479:1: ( rule__VarDeclaration__Group_3__1__Impl )
            // InternalPLhlcl.g:1480:2: rule__VarDeclaration__Group_3__1__Impl
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
    // InternalPLhlcl.g:1486:1: rule__VarDeclaration__Group_3__1__Impl : ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) ) ;
    public final void rule__VarDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1490:1: ( ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) ) )
            // InternalPLhlcl.g:1491:1: ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) )
            {
            // InternalPLhlcl.g:1491:1: ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) )
            // InternalPLhlcl.g:1492:2: ( rule__VarDeclaration__VariantsAssignment_3_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_3_1()); 
            // InternalPLhlcl.g:1493:2: ( rule__VarDeclaration__VariantsAssignment_3_1 )
            // InternalPLhlcl.g:1493:3: rule__VarDeclaration__VariantsAssignment_3_1
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
    // InternalPLhlcl.g:1502:1: rule__VariantsInterval__Group__0 : rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 ;
    public final void rule__VariantsInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1506:1: ( rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 )
            // InternalPLhlcl.g:1507:2: rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1
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
    // InternalPLhlcl.g:1514:1: rule__VariantsInterval__Group__0__Impl : ( ( rule__VariantsInterval__StartAssignment_0 ) ) ;
    public final void rule__VariantsInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1518:1: ( ( ( rule__VariantsInterval__StartAssignment_0 ) ) )
            // InternalPLhlcl.g:1519:1: ( ( rule__VariantsInterval__StartAssignment_0 ) )
            {
            // InternalPLhlcl.g:1519:1: ( ( rule__VariantsInterval__StartAssignment_0 ) )
            // InternalPLhlcl.g:1520:2: ( rule__VariantsInterval__StartAssignment_0 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartAssignment_0()); 
            // InternalPLhlcl.g:1521:2: ( rule__VariantsInterval__StartAssignment_0 )
            // InternalPLhlcl.g:1521:3: rule__VariantsInterval__StartAssignment_0
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
    // InternalPLhlcl.g:1529:1: rule__VariantsInterval__Group__1 : rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 ;
    public final void rule__VariantsInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1533:1: ( rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 )
            // InternalPLhlcl.g:1534:2: rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2
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
    // InternalPLhlcl.g:1541:1: rule__VariantsInterval__Group__1__Impl : ( '..' ) ;
    public final void rule__VariantsInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1545:1: ( ( '..' ) )
            // InternalPLhlcl.g:1546:1: ( '..' )
            {
            // InternalPLhlcl.g:1546:1: ( '..' )
            // InternalPLhlcl.g:1547:2: '..'
            {
             before(grammarAccess.getVariantsIntervalAccess().getFullStopFullStopKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPLhlcl.g:1556:1: rule__VariantsInterval__Group__2 : rule__VariantsInterval__Group__2__Impl ;
    public final void rule__VariantsInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1560:1: ( rule__VariantsInterval__Group__2__Impl )
            // InternalPLhlcl.g:1561:2: rule__VariantsInterval__Group__2__Impl
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
    // InternalPLhlcl.g:1567:1: rule__VariantsInterval__Group__2__Impl : ( ( rule__VariantsInterval__EndAssignment_2 ) ) ;
    public final void rule__VariantsInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1571:1: ( ( ( rule__VariantsInterval__EndAssignment_2 ) ) )
            // InternalPLhlcl.g:1572:1: ( ( rule__VariantsInterval__EndAssignment_2 ) )
            {
            // InternalPLhlcl.g:1572:1: ( ( rule__VariantsInterval__EndAssignment_2 ) )
            // InternalPLhlcl.g:1573:2: ( rule__VariantsInterval__EndAssignment_2 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndAssignment_2()); 
            // InternalPLhlcl.g:1574:2: ( rule__VariantsInterval__EndAssignment_2 )
            // InternalPLhlcl.g:1574:3: rule__VariantsInterval__EndAssignment_2
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
    // InternalPLhlcl.g:1583:1: rule__VariantsEnumeration__Group__0 : rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 ;
    public final void rule__VariantsEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1587:1: ( rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 )
            // InternalPLhlcl.g:1588:2: rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1
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
    // InternalPLhlcl.g:1595:1: rule__VariantsEnumeration__Group__0__Impl : ( '[' ) ;
    public final void rule__VariantsEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1599:1: ( ( '[' ) )
            // InternalPLhlcl.g:1600:1: ( '[' )
            {
            // InternalPLhlcl.g:1600:1: ( '[' )
            // InternalPLhlcl.g:1601:2: '['
            {
             before(grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPLhlcl.g:1610:1: rule__VariantsEnumeration__Group__1 : rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 ;
    public final void rule__VariantsEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1614:1: ( rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 )
            // InternalPLhlcl.g:1615:2: rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2
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
    // InternalPLhlcl.g:1622:1: rule__VariantsEnumeration__Group__1__Impl : ( ( rule__VariantsEnumeration__ListAssignment_1 ) ) ;
    public final void rule__VariantsEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1626:1: ( ( ( rule__VariantsEnumeration__ListAssignment_1 ) ) )
            // InternalPLhlcl.g:1627:1: ( ( rule__VariantsEnumeration__ListAssignment_1 ) )
            {
            // InternalPLhlcl.g:1627:1: ( ( rule__VariantsEnumeration__ListAssignment_1 ) )
            // InternalPLhlcl.g:1628:2: ( rule__VariantsEnumeration__ListAssignment_1 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListAssignment_1()); 
            // InternalPLhlcl.g:1629:2: ( rule__VariantsEnumeration__ListAssignment_1 )
            // InternalPLhlcl.g:1629:3: rule__VariantsEnumeration__ListAssignment_1
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
    // InternalPLhlcl.g:1637:1: rule__VariantsEnumeration__Group__2 : rule__VariantsEnumeration__Group__2__Impl ;
    public final void rule__VariantsEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1641:1: ( rule__VariantsEnumeration__Group__2__Impl )
            // InternalPLhlcl.g:1642:2: rule__VariantsEnumeration__Group__2__Impl
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
    // InternalPLhlcl.g:1648:1: rule__VariantsEnumeration__Group__2__Impl : ( ']' ) ;
    public final void rule__VariantsEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1652:1: ( ( ']' ) )
            // InternalPLhlcl.g:1653:1: ( ']' )
            {
            // InternalPLhlcl.g:1653:1: ( ']' )
            // InternalPLhlcl.g:1654:2: ']'
            {
             before(grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPLhlcl.g:1664:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1668:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalPLhlcl.g:1669:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalPLhlcl.g:1676:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1680:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalPLhlcl.g:1681:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalPLhlcl.g:1681:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalPLhlcl.g:1682:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalPLhlcl.g:1683:2: ( rule__Constraint__NameAssignment_0 )
            // InternalPLhlcl.g:1683:3: rule__Constraint__NameAssignment_0
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
    // InternalPLhlcl.g:1691:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1695:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalPLhlcl.g:1696:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalPLhlcl.g:1703:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1707:1: ( ( ':' ) )
            // InternalPLhlcl.g:1708:1: ( ':' )
            {
            // InternalPLhlcl.g:1708:1: ( ':' )
            // InternalPLhlcl.g:1709:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPLhlcl.g:1718:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1722:1: ( rule__Constraint__Group__2__Impl )
            // InternalPLhlcl.g:1723:2: rule__Constraint__Group__2__Impl
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
    // InternalPLhlcl.g:1729:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1733:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalPLhlcl.g:1734:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalPLhlcl.g:1734:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalPLhlcl.g:1735:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalPLhlcl.g:1736:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalPLhlcl.g:1736:3: rule__Constraint__ExpAssignment_2
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
    // InternalPLhlcl.g:1745:1: rule__TerminalExp__Group_0__0 : rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 ;
    public final void rule__TerminalExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1749:1: ( rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 )
            // InternalPLhlcl.g:1750:2: rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1
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
    // InternalPLhlcl.g:1757:1: rule__TerminalExp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1761:1: ( ( '(' ) )
            // InternalPLhlcl.g:1762:1: ( '(' )
            {
            // InternalPLhlcl.g:1762:1: ( '(' )
            // InternalPLhlcl.g:1763:2: '('
            {
             before(grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPLhlcl.g:1772:1: rule__TerminalExp__Group_0__1 : rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 ;
    public final void rule__TerminalExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1776:1: ( rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 )
            // InternalPLhlcl.g:1777:2: rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2
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
    // InternalPLhlcl.g:1784:1: rule__TerminalExp__Group_0__1__Impl : ( ruleConsExpression ) ;
    public final void rule__TerminalExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1788:1: ( ( ruleConsExpression ) )
            // InternalPLhlcl.g:1789:1: ( ruleConsExpression )
            {
            // InternalPLhlcl.g:1789:1: ( ruleConsExpression )
            // InternalPLhlcl.g:1790:2: ruleConsExpression
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
    // InternalPLhlcl.g:1799:1: rule__TerminalExp__Group_0__2 : rule__TerminalExp__Group_0__2__Impl ;
    public final void rule__TerminalExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1803:1: ( rule__TerminalExp__Group_0__2__Impl )
            // InternalPLhlcl.g:1804:2: rule__TerminalExp__Group_0__2__Impl
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
    // InternalPLhlcl.g:1810:1: rule__TerminalExp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1814:1: ( ( ')' ) )
            // InternalPLhlcl.g:1815:1: ( ')' )
            {
            // InternalPLhlcl.g:1815:1: ( ')' )
            // InternalPLhlcl.g:1816:2: ')'
            {
             before(grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPLhlcl.g:1826:1: rule__Structural__Group__0 : rule__Structural__Group__0__Impl rule__Structural__Group__1 ;
    public final void rule__Structural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1830:1: ( rule__Structural__Group__0__Impl rule__Structural__Group__1 )
            // InternalPLhlcl.g:1831:2: rule__Structural__Group__0__Impl rule__Structural__Group__1
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
    // InternalPLhlcl.g:1838:1: rule__Structural__Group__0__Impl : ( 'structural:' ) ;
    public final void rule__Structural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1842:1: ( ( 'structural:' ) )
            // InternalPLhlcl.g:1843:1: ( 'structural:' )
            {
            // InternalPLhlcl.g:1843:1: ( 'structural:' )
            // InternalPLhlcl.g:1844:2: 'structural:'
            {
             before(grammarAccess.getStructuralAccess().getStructuralKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPLhlcl.g:1853:1: rule__Structural__Group__1 : rule__Structural__Group__1__Impl rule__Structural__Group__2 ;
    public final void rule__Structural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1857:1: ( rule__Structural__Group__1__Impl rule__Structural__Group__2 )
            // InternalPLhlcl.g:1858:2: rule__Structural__Group__1__Impl rule__Structural__Group__2
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
    // InternalPLhlcl.g:1865:1: rule__Structural__Group__1__Impl : ( ( rule__Structural__ParentAssignment_1 ) ) ;
    public final void rule__Structural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1869:1: ( ( ( rule__Structural__ParentAssignment_1 ) ) )
            // InternalPLhlcl.g:1870:1: ( ( rule__Structural__ParentAssignment_1 ) )
            {
            // InternalPLhlcl.g:1870:1: ( ( rule__Structural__ParentAssignment_1 ) )
            // InternalPLhlcl.g:1871:2: ( rule__Structural__ParentAssignment_1 )
            {
             before(grammarAccess.getStructuralAccess().getParentAssignment_1()); 
            // InternalPLhlcl.g:1872:2: ( rule__Structural__ParentAssignment_1 )
            // InternalPLhlcl.g:1872:3: rule__Structural__ParentAssignment_1
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
    // InternalPLhlcl.g:1880:1: rule__Structural__Group__2 : rule__Structural__Group__2__Impl rule__Structural__Group__3 ;
    public final void rule__Structural__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1884:1: ( rule__Structural__Group__2__Impl rule__Structural__Group__3 )
            // InternalPLhlcl.g:1885:2: rule__Structural__Group__2__Impl rule__Structural__Group__3
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
    // InternalPLhlcl.g:1892:1: rule__Structural__Group__2__Impl : ( 'variants:' ) ;
    public final void rule__Structural__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1896:1: ( ( 'variants:' ) )
            // InternalPLhlcl.g:1897:1: ( 'variants:' )
            {
            // InternalPLhlcl.g:1897:1: ( 'variants:' )
            // InternalPLhlcl.g:1898:2: 'variants:'
            {
             before(grammarAccess.getStructuralAccess().getVariantsKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPLhlcl.g:1907:1: rule__Structural__Group__3 : rule__Structural__Group__3__Impl rule__Structural__Group__4 ;
    public final void rule__Structural__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1911:1: ( rule__Structural__Group__3__Impl rule__Structural__Group__4 )
            // InternalPLhlcl.g:1912:2: rule__Structural__Group__3__Impl rule__Structural__Group__4
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
    // InternalPLhlcl.g:1919:1: rule__Structural__Group__3__Impl : ( '[' ) ;
    public final void rule__Structural__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1923:1: ( ( '[' ) )
            // InternalPLhlcl.g:1924:1: ( '[' )
            {
            // InternalPLhlcl.g:1924:1: ( '[' )
            // InternalPLhlcl.g:1925:2: '['
            {
             before(grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPLhlcl.g:1934:1: rule__Structural__Group__4 : rule__Structural__Group__4__Impl rule__Structural__Group__5 ;
    public final void rule__Structural__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1938:1: ( rule__Structural__Group__4__Impl rule__Structural__Group__5 )
            // InternalPLhlcl.g:1939:2: rule__Structural__Group__4__Impl rule__Structural__Group__5
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
    // InternalPLhlcl.g:1946:1: rule__Structural__Group__4__Impl : ( ( rule__Structural__GroupAssignment_4 ) ) ;
    public final void rule__Structural__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1950:1: ( ( ( rule__Structural__GroupAssignment_4 ) ) )
            // InternalPLhlcl.g:1951:1: ( ( rule__Structural__GroupAssignment_4 ) )
            {
            // InternalPLhlcl.g:1951:1: ( ( rule__Structural__GroupAssignment_4 ) )
            // InternalPLhlcl.g:1952:2: ( rule__Structural__GroupAssignment_4 )
            {
             before(grammarAccess.getStructuralAccess().getGroupAssignment_4()); 
            // InternalPLhlcl.g:1953:2: ( rule__Structural__GroupAssignment_4 )
            // InternalPLhlcl.g:1953:3: rule__Structural__GroupAssignment_4
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
    // InternalPLhlcl.g:1961:1: rule__Structural__Group__5 : rule__Structural__Group__5__Impl rule__Structural__Group__6 ;
    public final void rule__Structural__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1965:1: ( rule__Structural__Group__5__Impl rule__Structural__Group__6 )
            // InternalPLhlcl.g:1966:2: rule__Structural__Group__5__Impl rule__Structural__Group__6
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
    // InternalPLhlcl.g:1973:1: rule__Structural__Group__5__Impl : ( ']' ) ;
    public final void rule__Structural__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1977:1: ( ( ']' ) )
            // InternalPLhlcl.g:1978:1: ( ']' )
            {
            // InternalPLhlcl.g:1978:1: ( ']' )
            // InternalPLhlcl.g:1979:2: ']'
            {
             before(grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPLhlcl.g:1988:1: rule__Structural__Group__6 : rule__Structural__Group__6__Impl ;
    public final void rule__Structural__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1992:1: ( rule__Structural__Group__6__Impl )
            // InternalPLhlcl.g:1993:2: rule__Structural__Group__6__Impl
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
    // InternalPLhlcl.g:1999:1: rule__Structural__Group__6__Impl : ( ( rule__Structural__Group_6__0 )? ) ;
    public final void rule__Structural__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2003:1: ( ( ( rule__Structural__Group_6__0 )? ) )
            // InternalPLhlcl.g:2004:1: ( ( rule__Structural__Group_6__0 )? )
            {
            // InternalPLhlcl.g:2004:1: ( ( rule__Structural__Group_6__0 )? )
            // InternalPLhlcl.g:2005:2: ( rule__Structural__Group_6__0 )?
            {
             before(grammarAccess.getStructuralAccess().getGroup_6()); 
            // InternalPLhlcl.g:2006:2: ( rule__Structural__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPLhlcl.g:2006:3: rule__Structural__Group_6__0
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
    // InternalPLhlcl.g:2015:1: rule__Structural__Group_6__0 : rule__Structural__Group_6__0__Impl rule__Structural__Group_6__1 ;
    public final void rule__Structural__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2019:1: ( rule__Structural__Group_6__0__Impl rule__Structural__Group_6__1 )
            // InternalPLhlcl.g:2020:2: rule__Structural__Group_6__0__Impl rule__Structural__Group_6__1
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
    // InternalPLhlcl.g:2027:1: rule__Structural__Group_6__0__Impl : ( 'card:' ) ;
    public final void rule__Structural__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2031:1: ( ( 'card:' ) )
            // InternalPLhlcl.g:2032:1: ( 'card:' )
            {
            // InternalPLhlcl.g:2032:1: ( 'card:' )
            // InternalPLhlcl.g:2033:2: 'card:'
            {
             before(grammarAccess.getStructuralAccess().getCardKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPLhlcl.g:2042:1: rule__Structural__Group_6__1 : rule__Structural__Group_6__1__Impl rule__Structural__Group_6__2 ;
    public final void rule__Structural__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2046:1: ( rule__Structural__Group_6__1__Impl rule__Structural__Group_6__2 )
            // InternalPLhlcl.g:2047:2: rule__Structural__Group_6__1__Impl rule__Structural__Group_6__2
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
    // InternalPLhlcl.g:2054:1: rule__Structural__Group_6__1__Impl : ( '[' ) ;
    public final void rule__Structural__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2058:1: ( ( '[' ) )
            // InternalPLhlcl.g:2059:1: ( '[' )
            {
            // InternalPLhlcl.g:2059:1: ( '[' )
            // InternalPLhlcl.g:2060:2: '['
            {
             before(grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPLhlcl.g:2069:1: rule__Structural__Group_6__2 : rule__Structural__Group_6__2__Impl rule__Structural__Group_6__3 ;
    public final void rule__Structural__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2073:1: ( rule__Structural__Group_6__2__Impl rule__Structural__Group_6__3 )
            // InternalPLhlcl.g:2074:2: rule__Structural__Group_6__2__Impl rule__Structural__Group_6__3
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
    // InternalPLhlcl.g:2081:1: rule__Structural__Group_6__2__Impl : ( ( rule__Structural__MinAssignment_6_2 ) ) ;
    public final void rule__Structural__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2085:1: ( ( ( rule__Structural__MinAssignment_6_2 ) ) )
            // InternalPLhlcl.g:2086:1: ( ( rule__Structural__MinAssignment_6_2 ) )
            {
            // InternalPLhlcl.g:2086:1: ( ( rule__Structural__MinAssignment_6_2 ) )
            // InternalPLhlcl.g:2087:2: ( rule__Structural__MinAssignment_6_2 )
            {
             before(grammarAccess.getStructuralAccess().getMinAssignment_6_2()); 
            // InternalPLhlcl.g:2088:2: ( rule__Structural__MinAssignment_6_2 )
            // InternalPLhlcl.g:2088:3: rule__Structural__MinAssignment_6_2
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
    // InternalPLhlcl.g:2096:1: rule__Structural__Group_6__3 : rule__Structural__Group_6__3__Impl rule__Structural__Group_6__4 ;
    public final void rule__Structural__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2100:1: ( rule__Structural__Group_6__3__Impl rule__Structural__Group_6__4 )
            // InternalPLhlcl.g:2101:2: rule__Structural__Group_6__3__Impl rule__Structural__Group_6__4
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
    // InternalPLhlcl.g:2108:1: rule__Structural__Group_6__3__Impl : ( ',' ) ;
    public final void rule__Structural__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2112:1: ( ( ',' ) )
            // InternalPLhlcl.g:2113:1: ( ',' )
            {
            // InternalPLhlcl.g:2113:1: ( ',' )
            // InternalPLhlcl.g:2114:2: ','
            {
             before(grammarAccess.getStructuralAccess().getCommaKeyword_6_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPLhlcl.g:2123:1: rule__Structural__Group_6__4 : rule__Structural__Group_6__4__Impl rule__Structural__Group_6__5 ;
    public final void rule__Structural__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2127:1: ( rule__Structural__Group_6__4__Impl rule__Structural__Group_6__5 )
            // InternalPLhlcl.g:2128:2: rule__Structural__Group_6__4__Impl rule__Structural__Group_6__5
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
    // InternalPLhlcl.g:2135:1: rule__Structural__Group_6__4__Impl : ( ( rule__Structural__MaxAssignment_6_4 ) ) ;
    public final void rule__Structural__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2139:1: ( ( ( rule__Structural__MaxAssignment_6_4 ) ) )
            // InternalPLhlcl.g:2140:1: ( ( rule__Structural__MaxAssignment_6_4 ) )
            {
            // InternalPLhlcl.g:2140:1: ( ( rule__Structural__MaxAssignment_6_4 ) )
            // InternalPLhlcl.g:2141:2: ( rule__Structural__MaxAssignment_6_4 )
            {
             before(grammarAccess.getStructuralAccess().getMaxAssignment_6_4()); 
            // InternalPLhlcl.g:2142:2: ( rule__Structural__MaxAssignment_6_4 )
            // InternalPLhlcl.g:2142:3: rule__Structural__MaxAssignment_6_4
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
    // InternalPLhlcl.g:2150:1: rule__Structural__Group_6__5 : rule__Structural__Group_6__5__Impl ;
    public final void rule__Structural__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2154:1: ( rule__Structural__Group_6__5__Impl )
            // InternalPLhlcl.g:2155:2: rule__Structural__Group_6__5__Impl
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
    // InternalPLhlcl.g:2161:1: rule__Structural__Group_6__5__Impl : ( ']' ) ;
    public final void rule__Structural__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2165:1: ( ( ']' ) )
            // InternalPLhlcl.g:2166:1: ( ']' )
            {
            // InternalPLhlcl.g:2166:1: ( ']' )
            // InternalPLhlcl.g:2167:2: ']'
            {
             before(grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_6_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPLhlcl.g:2177:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2181:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalPLhlcl.g:2182:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
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
    // InternalPLhlcl.g:2189:1: rule__Attributes__Group__0__Impl : ( 'attributes:' ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2193:1: ( ( 'attributes:' ) )
            // InternalPLhlcl.g:2194:1: ( 'attributes:' )
            {
            // InternalPLhlcl.g:2194:1: ( 'attributes:' )
            // InternalPLhlcl.g:2195:2: 'attributes:'
            {
             before(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPLhlcl.g:2204:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl rule__Attributes__Group__2 ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2208:1: ( rule__Attributes__Group__1__Impl rule__Attributes__Group__2 )
            // InternalPLhlcl.g:2209:2: rule__Attributes__Group__1__Impl rule__Attributes__Group__2
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
    // InternalPLhlcl.g:2216:1: rule__Attributes__Group__1__Impl : ( '[' ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2220:1: ( ( '[' ) )
            // InternalPLhlcl.g:2221:1: ( '[' )
            {
            // InternalPLhlcl.g:2221:1: ( '[' )
            // InternalPLhlcl.g:2222:2: '['
            {
             before(grammarAccess.getAttributesAccess().getLeftSquareBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPLhlcl.g:2231:1: rule__Attributes__Group__2 : rule__Attributes__Group__2__Impl rule__Attributes__Group__3 ;
    public final void rule__Attributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2235:1: ( rule__Attributes__Group__2__Impl rule__Attributes__Group__3 )
            // InternalPLhlcl.g:2236:2: rule__Attributes__Group__2__Impl rule__Attributes__Group__3
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
    // InternalPLhlcl.g:2243:1: rule__Attributes__Group__2__Impl : ( ( rule__Attributes__AttAssignment_2 ) ) ;
    public final void rule__Attributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2247:1: ( ( ( rule__Attributes__AttAssignment_2 ) ) )
            // InternalPLhlcl.g:2248:1: ( ( rule__Attributes__AttAssignment_2 ) )
            {
            // InternalPLhlcl.g:2248:1: ( ( rule__Attributes__AttAssignment_2 ) )
            // InternalPLhlcl.g:2249:2: ( rule__Attributes__AttAssignment_2 )
            {
             before(grammarAccess.getAttributesAccess().getAttAssignment_2()); 
            // InternalPLhlcl.g:2250:2: ( rule__Attributes__AttAssignment_2 )
            // InternalPLhlcl.g:2250:3: rule__Attributes__AttAssignment_2
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
    // InternalPLhlcl.g:2258:1: rule__Attributes__Group__3 : rule__Attributes__Group__3__Impl rule__Attributes__Group__4 ;
    public final void rule__Attributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2262:1: ( rule__Attributes__Group__3__Impl rule__Attributes__Group__4 )
            // InternalPLhlcl.g:2263:2: rule__Attributes__Group__3__Impl rule__Attributes__Group__4
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
    // InternalPLhlcl.g:2270:1: rule__Attributes__Group__3__Impl : ( ']' ) ;
    public final void rule__Attributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2274:1: ( ( ']' ) )
            // InternalPLhlcl.g:2275:1: ( ']' )
            {
            // InternalPLhlcl.g:2275:1: ( ']' )
            // InternalPLhlcl.g:2276:2: ']'
            {
             before(grammarAccess.getAttributesAccess().getRightSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPLhlcl.g:2285:1: rule__Attributes__Group__4 : rule__Attributes__Group__4__Impl rule__Attributes__Group__5 ;
    public final void rule__Attributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2289:1: ( rule__Attributes__Group__4__Impl rule__Attributes__Group__5 )
            // InternalPLhlcl.g:2290:2: rule__Attributes__Group__4__Impl rule__Attributes__Group__5
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
    // InternalPLhlcl.g:2297:1: rule__Attributes__Group__4__Impl : ( 'of' ) ;
    public final void rule__Attributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2301:1: ( ( 'of' ) )
            // InternalPLhlcl.g:2302:1: ( 'of' )
            {
            // InternalPLhlcl.g:2302:1: ( 'of' )
            // InternalPLhlcl.g:2303:2: 'of'
            {
             before(grammarAccess.getAttributesAccess().getOfKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPLhlcl.g:2312:1: rule__Attributes__Group__5 : rule__Attributes__Group__5__Impl ;
    public final void rule__Attributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2316:1: ( rule__Attributes__Group__5__Impl )
            // InternalPLhlcl.g:2317:2: rule__Attributes__Group__5__Impl
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
    // InternalPLhlcl.g:2323:1: rule__Attributes__Group__5__Impl : ( ( rule__Attributes__Var1Assignment_5 ) ) ;
    public final void rule__Attributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2327:1: ( ( ( rule__Attributes__Var1Assignment_5 ) ) )
            // InternalPLhlcl.g:2328:1: ( ( rule__Attributes__Var1Assignment_5 ) )
            {
            // InternalPLhlcl.g:2328:1: ( ( rule__Attributes__Var1Assignment_5 ) )
            // InternalPLhlcl.g:2329:2: ( rule__Attributes__Var1Assignment_5 )
            {
             before(grammarAccess.getAttributesAccess().getVar1Assignment_5()); 
            // InternalPLhlcl.g:2330:2: ( rule__Attributes__Var1Assignment_5 )
            // InternalPLhlcl.g:2330:3: rule__Attributes__Var1Assignment_5
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
    // InternalPLhlcl.g:2339:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2343:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalPLhlcl.g:2344:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalPLhlcl.g:2351:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2355:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalPLhlcl.g:2356:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalPLhlcl.g:2356:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalPLhlcl.g:2357:2: ( rule__Assignment__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            // InternalPLhlcl.g:2358:2: ( rule__Assignment__VarAssignment_0 )
            // InternalPLhlcl.g:2358:3: rule__Assignment__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 

            }


            }

        }
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
    // InternalPLhlcl.g:2366:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2370:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalPLhlcl.g:2371:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalPLhlcl.g:2378:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2382:1: ( ( 'is' ) )
            // InternalPLhlcl.g:2383:1: ( 'is' )
            {
            // InternalPLhlcl.g:2383:1: ( 'is' )
            // InternalPLhlcl.g:2384:2: 'is'
            {
             before(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPLhlcl.g:2393:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2397:1: ( rule__Assignment__Group__2__Impl )
            // InternalPLhlcl.g:2398:2: rule__Assignment__Group__2__Impl
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
    // InternalPLhlcl.g:2404:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2408:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalPLhlcl.g:2409:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalPLhlcl.g:2409:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalPLhlcl.g:2410:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalPLhlcl.g:2411:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalPLhlcl.g:2411:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
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
    // InternalPLhlcl.g:2420:1: rule__VarRefinement__Group__0 : rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 ;
    public final void rule__VarRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2424:1: ( rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 )
            // InternalPLhlcl.g:2425:2: rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1
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
    // InternalPLhlcl.g:2432:1: rule__VarRefinement__Group__0__Impl : ( ( rule__VarRefinement__VarAssignment_0 ) ) ;
    public final void rule__VarRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2436:1: ( ( ( rule__VarRefinement__VarAssignment_0 ) ) )
            // InternalPLhlcl.g:2437:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            {
            // InternalPLhlcl.g:2437:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            // InternalPLhlcl.g:2438:2: ( rule__VarRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 
            // InternalPLhlcl.g:2439:2: ( rule__VarRefinement__VarAssignment_0 )
            // InternalPLhlcl.g:2439:3: rule__VarRefinement__VarAssignment_0
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
    // InternalPLhlcl.g:2447:1: rule__VarRefinement__Group__1 : rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 ;
    public final void rule__VarRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2451:1: ( rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 )
            // InternalPLhlcl.g:2452:2: rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2
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
    // InternalPLhlcl.g:2459:1: rule__VarRefinement__Group__1__Impl : ( 'in' ) ;
    public final void rule__VarRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2463:1: ( ( 'in' ) )
            // InternalPLhlcl.g:2464:1: ( 'in' )
            {
            // InternalPLhlcl.g:2464:1: ( 'in' )
            // InternalPLhlcl.g:2465:2: 'in'
            {
             before(grammarAccess.getVarRefinementAccess().getInKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPLhlcl.g:2474:1: rule__VarRefinement__Group__2 : rule__VarRefinement__Group__2__Impl ;
    public final void rule__VarRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2478:1: ( rule__VarRefinement__Group__2__Impl )
            // InternalPLhlcl.g:2479:2: rule__VarRefinement__Group__2__Impl
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
    // InternalPLhlcl.g:2485:1: rule__VarRefinement__Group__2__Impl : ( ( rule__VarRefinement__ValuesAssignment_2 ) ) ;
    public final void rule__VarRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2489:1: ( ( ( rule__VarRefinement__ValuesAssignment_2 ) ) )
            // InternalPLhlcl.g:2490:1: ( ( rule__VarRefinement__ValuesAssignment_2 ) )
            {
            // InternalPLhlcl.g:2490:1: ( ( rule__VarRefinement__ValuesAssignment_2 ) )
            // InternalPLhlcl.g:2491:2: ( rule__VarRefinement__ValuesAssignment_2 )
            {
             before(grammarAccess.getVarRefinementAccess().getValuesAssignment_2()); 
            // InternalPLhlcl.g:2492:2: ( rule__VarRefinement__ValuesAssignment_2 )
            // InternalPLhlcl.g:2492:3: rule__VarRefinement__ValuesAssignment_2
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
    // InternalPLhlcl.g:2501:1: rule__SetRefinement__Group__0 : rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 ;
    public final void rule__SetRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2505:1: ( rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 )
            // InternalPLhlcl.g:2506:2: rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1
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
    // InternalPLhlcl.g:2513:1: rule__SetRefinement__Group__0__Impl : ( 'vars:' ) ;
    public final void rule__SetRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2517:1: ( ( 'vars:' ) )
            // InternalPLhlcl.g:2518:1: ( 'vars:' )
            {
            // InternalPLhlcl.g:2518:1: ( 'vars:' )
            // InternalPLhlcl.g:2519:2: 'vars:'
            {
             before(grammarAccess.getSetRefinementAccess().getVarsKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalPLhlcl.g:2528:1: rule__SetRefinement__Group__1 : rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 ;
    public final void rule__SetRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2532:1: ( rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 )
            // InternalPLhlcl.g:2533:2: rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2
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
    // InternalPLhlcl.g:2540:1: rule__SetRefinement__Group__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2544:1: ( ( '(' ) )
            // InternalPLhlcl.g:2545:1: ( '(' )
            {
            // InternalPLhlcl.g:2545:1: ( '(' )
            // InternalPLhlcl.g:2546:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPLhlcl.g:2555:1: rule__SetRefinement__Group__2 : rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 ;
    public final void rule__SetRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2559:1: ( rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 )
            // InternalPLhlcl.g:2560:2: rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3
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
    // InternalPLhlcl.g:2567:1: rule__SetRefinement__Group__2__Impl : ( ( rule__SetRefinement__VarsAssignment_2 ) ) ;
    public final void rule__SetRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2571:1: ( ( ( rule__SetRefinement__VarsAssignment_2 ) ) )
            // InternalPLhlcl.g:2572:1: ( ( rule__SetRefinement__VarsAssignment_2 ) )
            {
            // InternalPLhlcl.g:2572:1: ( ( rule__SetRefinement__VarsAssignment_2 ) )
            // InternalPLhlcl.g:2573:2: ( rule__SetRefinement__VarsAssignment_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getVarsAssignment_2()); 
            // InternalPLhlcl.g:2574:2: ( rule__SetRefinement__VarsAssignment_2 )
            // InternalPLhlcl.g:2574:3: rule__SetRefinement__VarsAssignment_2
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
    // InternalPLhlcl.g:2582:1: rule__SetRefinement__Group__3 : rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 ;
    public final void rule__SetRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2586:1: ( rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 )
            // InternalPLhlcl.g:2587:2: rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalPLhlcl.g:2594:1: rule__SetRefinement__Group__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2598:1: ( ( ')' ) )
            // InternalPLhlcl.g:2599:1: ( ')' )
            {
            // InternalPLhlcl.g:2599:1: ( ')' )
            // InternalPLhlcl.g:2600:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPLhlcl.g:2609:1: rule__SetRefinement__Group__4 : rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 ;
    public final void rule__SetRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2613:1: ( rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 )
            // InternalPLhlcl.g:2614:2: rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5
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
    // InternalPLhlcl.g:2621:1: rule__SetRefinement__Group__4__Impl : ( 'variants' ) ;
    public final void rule__SetRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2625:1: ( ( 'variants' ) )
            // InternalPLhlcl.g:2626:1: ( 'variants' )
            {
            // InternalPLhlcl.g:2626:1: ( 'variants' )
            // InternalPLhlcl.g:2627:2: 'variants'
            {
             before(grammarAccess.getSetRefinementAccess().getVariantsKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalPLhlcl.g:2636:1: rule__SetRefinement__Group__5 : rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 ;
    public final void rule__SetRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2640:1: ( rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 )
            // InternalPLhlcl.g:2641:2: rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6
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
    // InternalPLhlcl.g:2648:1: rule__SetRefinement__Group__5__Impl : ( '[' ) ;
    public final void rule__SetRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2652:1: ( ( '[' ) )
            // InternalPLhlcl.g:2653:1: ( '[' )
            {
            // InternalPLhlcl.g:2653:1: ( '[' )
            // InternalPLhlcl.g:2654:2: '['
            {
             before(grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPLhlcl.g:2663:1: rule__SetRefinement__Group__6 : rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 ;
    public final void rule__SetRefinement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2667:1: ( rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 )
            // InternalPLhlcl.g:2668:2: rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalPLhlcl.g:2675:1: rule__SetRefinement__Group__6__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2679:1: ( ( '(' ) )
            // InternalPLhlcl.g:2680:1: ( '(' )
            {
            // InternalPLhlcl.g:2680:1: ( '(' )
            // InternalPLhlcl.g:2681:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
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
    // InternalPLhlcl.g:2690:1: rule__SetRefinement__Group__7 : rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 ;
    public final void rule__SetRefinement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2694:1: ( rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 )
            // InternalPLhlcl.g:2695:2: rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__SetRefinement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__8();

            state._fsp--;


            }

        }
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
    // InternalPLhlcl.g:2702:1: rule__SetRefinement__Group__7__Impl : ( ( rule__SetRefinement__HeadAssignment_7 ) ) ;
    public final void rule__SetRefinement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2706:1: ( ( ( rule__SetRefinement__HeadAssignment_7 ) ) )
            // InternalPLhlcl.g:2707:1: ( ( rule__SetRefinement__HeadAssignment_7 ) )
            {
            // InternalPLhlcl.g:2707:1: ( ( rule__SetRefinement__HeadAssignment_7 ) )
            // InternalPLhlcl.g:2708:2: ( rule__SetRefinement__HeadAssignment_7 )
            {
             before(grammarAccess.getSetRefinementAccess().getHeadAssignment_7()); 
            // InternalPLhlcl.g:2709:2: ( rule__SetRefinement__HeadAssignment_7 )
            // InternalPLhlcl.g:2709:3: rule__SetRefinement__HeadAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__HeadAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getHeadAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__SetRefinement__Group__8"
    // InternalPLhlcl.g:2717:1: rule__SetRefinement__Group__8 : rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 ;
    public final void rule__SetRefinement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2721:1: ( rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 )
            // InternalPLhlcl.g:2722:2: rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__SetRefinement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__8"


    // $ANTLR start "rule__SetRefinement__Group__8__Impl"
    // InternalPLhlcl.g:2729:1: rule__SetRefinement__Group__8__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2733:1: ( ( ')' ) )
            // InternalPLhlcl.g:2734:1: ( ')' )
            {
            // InternalPLhlcl.g:2734:1: ( ')' )
            // InternalPLhlcl.g:2735:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__8__Impl"


    // $ANTLR start "rule__SetRefinement__Group__9"
    // InternalPLhlcl.g:2744:1: rule__SetRefinement__Group__9 : rule__SetRefinement__Group__9__Impl rule__SetRefinement__Group__10 ;
    public final void rule__SetRefinement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2748:1: ( rule__SetRefinement__Group__9__Impl rule__SetRefinement__Group__10 )
            // InternalPLhlcl.g:2749:2: rule__SetRefinement__Group__9__Impl rule__SetRefinement__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__SetRefinement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__9"


    // $ANTLR start "rule__SetRefinement__Group__9__Impl"
    // InternalPLhlcl.g:2756:1: rule__SetRefinement__Group__9__Impl : ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) ) ;
    public final void rule__SetRefinement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2760:1: ( ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) ) )
            // InternalPLhlcl.g:2761:1: ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) )
            {
            // InternalPLhlcl.g:2761:1: ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) )
            // InternalPLhlcl.g:2762:2: ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* )
            {
            // InternalPLhlcl.g:2762:2: ( ( rule__SetRefinement__Group_9__0 ) )
            // InternalPLhlcl.g:2763:3: ( rule__SetRefinement__Group_9__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_9()); 
            // InternalPLhlcl.g:2764:3: ( rule__SetRefinement__Group_9__0 )
            // InternalPLhlcl.g:2764:4: rule__SetRefinement__Group_9__0
            {
            pushFollow(FOLLOW_27);
            rule__SetRefinement__Group_9__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup_9()); 

            }

            // InternalPLhlcl.g:2767:2: ( ( rule__SetRefinement__Group_9__0 )* )
            // InternalPLhlcl.g:2768:3: ( rule__SetRefinement__Group_9__0 )*
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_9()); 
            // InternalPLhlcl.g:2769:3: ( rule__SetRefinement__Group_9__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPLhlcl.g:2769:4: rule__SetRefinement__Group_9__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__SetRefinement__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSetRefinementAccess().getGroup_9()); 

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
    // $ANTLR end "rule__SetRefinement__Group__9__Impl"


    // $ANTLR start "rule__SetRefinement__Group__10"
    // InternalPLhlcl.g:2778:1: rule__SetRefinement__Group__10 : rule__SetRefinement__Group__10__Impl ;
    public final void rule__SetRefinement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2782:1: ( rule__SetRefinement__Group__10__Impl )
            // InternalPLhlcl.g:2783:2: rule__SetRefinement__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__10"


    // $ANTLR start "rule__SetRefinement__Group__10__Impl"
    // InternalPLhlcl.g:2789:1: rule__SetRefinement__Group__10__Impl : ( ']' ) ;
    public final void rule__SetRefinement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2793:1: ( ( ']' ) )
            // InternalPLhlcl.g:2794:1: ( ']' )
            {
            // InternalPLhlcl.g:2794:1: ( ']' )
            // InternalPLhlcl.g:2795:2: ']'
            {
             before(grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group__10__Impl"


    // $ANTLR start "rule__SetRefinement__Group_9__0"
    // InternalPLhlcl.g:2805:1: rule__SetRefinement__Group_9__0 : rule__SetRefinement__Group_9__0__Impl rule__SetRefinement__Group_9__1 ;
    public final void rule__SetRefinement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2809:1: ( rule__SetRefinement__Group_9__0__Impl rule__SetRefinement__Group_9__1 )
            // InternalPLhlcl.g:2810:2: rule__SetRefinement__Group_9__0__Impl rule__SetRefinement__Group_9__1
            {
            pushFollow(FOLLOW_25);
            rule__SetRefinement__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_9__0"


    // $ANTLR start "rule__SetRefinement__Group_9__0__Impl"
    // InternalPLhlcl.g:2817:1: rule__SetRefinement__Group_9__0__Impl : ( ',' ) ;
    public final void rule__SetRefinement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2821:1: ( ( ',' ) )
            // InternalPLhlcl.g:2822:1: ( ',' )
            {
            // InternalPLhlcl.g:2822:1: ( ',' )
            // InternalPLhlcl.g:2823:2: ','
            {
             before(grammarAccess.getSetRefinementAccess().getCommaKeyword_9_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_9__0__Impl"


    // $ANTLR start "rule__SetRefinement__Group_9__1"
    // InternalPLhlcl.g:2832:1: rule__SetRefinement__Group_9__1 : rule__SetRefinement__Group_9__1__Impl rule__SetRefinement__Group_9__2 ;
    public final void rule__SetRefinement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2836:1: ( rule__SetRefinement__Group_9__1__Impl rule__SetRefinement__Group_9__2 )
            // InternalPLhlcl.g:2837:2: rule__SetRefinement__Group_9__1__Impl rule__SetRefinement__Group_9__2
            {
            pushFollow(FOLLOW_16);
            rule__SetRefinement__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_9__1"


    // $ANTLR start "rule__SetRefinement__Group_9__1__Impl"
    // InternalPLhlcl.g:2844:1: rule__SetRefinement__Group_9__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2848:1: ( ( '(' ) )
            // InternalPLhlcl.g:2849:1: ( '(' )
            {
            // InternalPLhlcl.g:2849:1: ( '(' )
            // InternalPLhlcl.g:2850:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_9__1__Impl"


    // $ANTLR start "rule__SetRefinement__Group_9__2"
    // InternalPLhlcl.g:2859:1: rule__SetRefinement__Group_9__2 : rule__SetRefinement__Group_9__2__Impl rule__SetRefinement__Group_9__3 ;
    public final void rule__SetRefinement__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2863:1: ( rule__SetRefinement__Group_9__2__Impl rule__SetRefinement__Group_9__3 )
            // InternalPLhlcl.g:2864:2: rule__SetRefinement__Group_9__2__Impl rule__SetRefinement__Group_9__3
            {
            pushFollow(FOLLOW_19);
            rule__SetRefinement__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_9__2"


    // $ANTLR start "rule__SetRefinement__Group_9__2__Impl"
    // InternalPLhlcl.g:2871:1: rule__SetRefinement__Group_9__2__Impl : ( ( rule__SetRefinement__TailAssignment_9_2 ) ) ;
    public final void rule__SetRefinement__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2875:1: ( ( ( rule__SetRefinement__TailAssignment_9_2 ) ) )
            // InternalPLhlcl.g:2876:1: ( ( rule__SetRefinement__TailAssignment_9_2 ) )
            {
            // InternalPLhlcl.g:2876:1: ( ( rule__SetRefinement__TailAssignment_9_2 ) )
            // InternalPLhlcl.g:2877:2: ( rule__SetRefinement__TailAssignment_9_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getTailAssignment_9_2()); 
            // InternalPLhlcl.g:2878:2: ( rule__SetRefinement__TailAssignment_9_2 )
            // InternalPLhlcl.g:2878:3: rule__SetRefinement__TailAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__TailAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getTailAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_9__2__Impl"


    // $ANTLR start "rule__SetRefinement__Group_9__3"
    // InternalPLhlcl.g:2886:1: rule__SetRefinement__Group_9__3 : rule__SetRefinement__Group_9__3__Impl ;
    public final void rule__SetRefinement__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2890:1: ( rule__SetRefinement__Group_9__3__Impl )
            // InternalPLhlcl.g:2891:2: rule__SetRefinement__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_9__3"


    // $ANTLR start "rule__SetRefinement__Group_9__3__Impl"
    // InternalPLhlcl.g:2897:1: rule__SetRefinement__Group_9__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2901:1: ( ( ')' ) )
            // InternalPLhlcl.g:2902:1: ( ')' )
            {
            // InternalPLhlcl.g:2902:1: ( ')' )
            // InternalPLhlcl.g:2903:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_9_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_9__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalPLhlcl.g:2913:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2917:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalPLhlcl.g:2918:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalPLhlcl.g:2925:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2929:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalPLhlcl.g:2930:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalPLhlcl.g:2930:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalPLhlcl.g:2931:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalPLhlcl.g:2932:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalPLhlcl.g:2932:3: rule__Rule__ConditionAssignment_0
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
    // InternalPLhlcl.g:2940:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2944:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalPLhlcl.g:2945:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalPLhlcl.g:2952:1: rule__Rule__Group__1__Impl : ( '-->' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2956:1: ( ( '-->' ) )
            // InternalPLhlcl.g:2957:1: ( '-->' )
            {
            // InternalPLhlcl.g:2957:1: ( '-->' )
            // InternalPLhlcl.g:2958:2: '-->'
            {
             before(grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalPLhlcl.g:2967:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2971:1: ( rule__Rule__Group__2__Impl )
            // InternalPLhlcl.g:2972:2: rule__Rule__Group__2__Impl
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
    // InternalPLhlcl.g:2978:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConsequenceAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2982:1: ( ( ( rule__Rule__ConsequenceAssignment_2 ) ) )
            // InternalPLhlcl.g:2983:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            {
            // InternalPLhlcl.g:2983:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            // InternalPLhlcl.g:2984:2: ( rule__Rule__ConsequenceAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 
            // InternalPLhlcl.g:2985:2: ( rule__Rule__ConsequenceAssignment_2 )
            // InternalPLhlcl.g:2985:3: rule__Rule__ConsequenceAssignment_2
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
    // InternalPLhlcl.g:2994:1: rule__FodaUN__Group__0 : rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 ;
    public final void rule__FodaUN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2998:1: ( rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 )
            // InternalPLhlcl.g:2999:2: rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1
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
    // InternalPLhlcl.g:3006:1: rule__FodaUN__Group__0__Impl : ( ( rule__FodaUN__Var1Assignment_0 ) ) ;
    public final void rule__FodaUN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3010:1: ( ( ( rule__FodaUN__Var1Assignment_0 ) ) )
            // InternalPLhlcl.g:3011:1: ( ( rule__FodaUN__Var1Assignment_0 ) )
            {
            // InternalPLhlcl.g:3011:1: ( ( rule__FodaUN__Var1Assignment_0 ) )
            // InternalPLhlcl.g:3012:2: ( rule__FodaUN__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaUNAccess().getVar1Assignment_0()); 
            // InternalPLhlcl.g:3013:2: ( rule__FodaUN__Var1Assignment_0 )
            // InternalPLhlcl.g:3013:3: rule__FodaUN__Var1Assignment_0
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
    // InternalPLhlcl.g:3021:1: rule__FodaUN__Group__1 : rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 ;
    public final void rule__FodaUN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3025:1: ( rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 )
            // InternalPLhlcl.g:3026:2: rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalPLhlcl.g:3033:1: rule__FodaUN__Group__1__Impl : ( 'is' ) ;
    public final void rule__FodaUN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3037:1: ( ( 'is' ) )
            // InternalPLhlcl.g:3038:1: ( 'is' )
            {
            // InternalPLhlcl.g:3038:1: ( 'is' )
            // InternalPLhlcl.g:3039:2: 'is'
            {
             before(grammarAccess.getFodaUNAccess().getIsKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPLhlcl.g:3048:1: rule__FodaUN__Group__2 : rule__FodaUN__Group__2__Impl ;
    public final void rule__FodaUN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3052:1: ( rule__FodaUN__Group__2__Impl )
            // InternalPLhlcl.g:3053:2: rule__FodaUN__Group__2__Impl
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
    // InternalPLhlcl.g:3059:1: rule__FodaUN__Group__2__Impl : ( ( rule__FodaUN__OpAssignment_2 ) ) ;
    public final void rule__FodaUN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3063:1: ( ( ( rule__FodaUN__OpAssignment_2 ) ) )
            // InternalPLhlcl.g:3064:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            {
            // InternalPLhlcl.g:3064:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            // InternalPLhlcl.g:3065:2: ( rule__FodaUN__OpAssignment_2 )
            {
             before(grammarAccess.getFodaUNAccess().getOpAssignment_2()); 
            // InternalPLhlcl.g:3066:2: ( rule__FodaUN__OpAssignment_2 )
            // InternalPLhlcl.g:3066:3: rule__FodaUN__OpAssignment_2
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
    // InternalPLhlcl.g:3075:1: rule__FodaBin__Group__0 : rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 ;
    public final void rule__FodaBin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3079:1: ( rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 )
            // InternalPLhlcl.g:3080:2: rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPLhlcl.g:3087:1: rule__FodaBin__Group__0__Impl : ( ( rule__FodaBin__Var1Assignment_0 ) ) ;
    public final void rule__FodaBin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3091:1: ( ( ( rule__FodaBin__Var1Assignment_0 ) ) )
            // InternalPLhlcl.g:3092:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            {
            // InternalPLhlcl.g:3092:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            // InternalPLhlcl.g:3093:2: ( rule__FodaBin__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaBinAccess().getVar1Assignment_0()); 
            // InternalPLhlcl.g:3094:2: ( rule__FodaBin__Var1Assignment_0 )
            // InternalPLhlcl.g:3094:3: rule__FodaBin__Var1Assignment_0
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
    // InternalPLhlcl.g:3102:1: rule__FodaBin__Group__1 : rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 ;
    public final void rule__FodaBin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3106:1: ( rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 )
            // InternalPLhlcl.g:3107:2: rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2
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
    // InternalPLhlcl.g:3114:1: rule__FodaBin__Group__1__Impl : ( ( rule__FodaBin__OpAssignment_1 ) ) ;
    public final void rule__FodaBin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3118:1: ( ( ( rule__FodaBin__OpAssignment_1 ) ) )
            // InternalPLhlcl.g:3119:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            {
            // InternalPLhlcl.g:3119:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            // InternalPLhlcl.g:3120:2: ( rule__FodaBin__OpAssignment_1 )
            {
             before(grammarAccess.getFodaBinAccess().getOpAssignment_1()); 
            // InternalPLhlcl.g:3121:2: ( rule__FodaBin__OpAssignment_1 )
            // InternalPLhlcl.g:3121:3: rule__FodaBin__OpAssignment_1
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
    // InternalPLhlcl.g:3129:1: rule__FodaBin__Group__2 : rule__FodaBin__Group__2__Impl ;
    public final void rule__FodaBin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3133:1: ( rule__FodaBin__Group__2__Impl )
            // InternalPLhlcl.g:3134:2: rule__FodaBin__Group__2__Impl
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
    // InternalPLhlcl.g:3140:1: rule__FodaBin__Group__2__Impl : ( ( rule__FodaBin__Var2Assignment_2 ) ) ;
    public final void rule__FodaBin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3144:1: ( ( ( rule__FodaBin__Var2Assignment_2 ) ) )
            // InternalPLhlcl.g:3145:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            {
            // InternalPLhlcl.g:3145:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            // InternalPLhlcl.g:3146:2: ( rule__FodaBin__Var2Assignment_2 )
            {
             before(grammarAccess.getFodaBinAccess().getVar2Assignment_2()); 
            // InternalPLhlcl.g:3147:2: ( rule__FodaBin__Var2Assignment_2 )
            // InternalPLhlcl.g:3147:3: rule__FodaBin__Var2Assignment_2
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


    // $ANTLR start "rule__ListOfValues__Group__0"
    // InternalPLhlcl.g:3156:1: rule__ListOfValues__Group__0 : rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 ;
    public final void rule__ListOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3160:1: ( rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 )
            // InternalPLhlcl.g:3161:2: rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1
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
    // InternalPLhlcl.g:3168:1: rule__ListOfValues__Group__0__Impl : ( ( rule__ListOfValues__ValuesAssignment_0 ) ) ;
    public final void rule__ListOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3172:1: ( ( ( rule__ListOfValues__ValuesAssignment_0 ) ) )
            // InternalPLhlcl.g:3173:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            {
            // InternalPLhlcl.g:3173:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            // InternalPLhlcl.g:3174:2: ( rule__ListOfValues__ValuesAssignment_0 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_0()); 
            // InternalPLhlcl.g:3175:2: ( rule__ListOfValues__ValuesAssignment_0 )
            // InternalPLhlcl.g:3175:3: rule__ListOfValues__ValuesAssignment_0
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
    // InternalPLhlcl.g:3183:1: rule__ListOfValues__Group__1 : rule__ListOfValues__Group__1__Impl ;
    public final void rule__ListOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3187:1: ( rule__ListOfValues__Group__1__Impl )
            // InternalPLhlcl.g:3188:2: rule__ListOfValues__Group__1__Impl
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
    // InternalPLhlcl.g:3194:1: rule__ListOfValues__Group__1__Impl : ( ( rule__ListOfValues__Group_1__0 )* ) ;
    public final void rule__ListOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3198:1: ( ( ( rule__ListOfValues__Group_1__0 )* ) )
            // InternalPLhlcl.g:3199:1: ( ( rule__ListOfValues__Group_1__0 )* )
            {
            // InternalPLhlcl.g:3199:1: ( ( rule__ListOfValues__Group_1__0 )* )
            // InternalPLhlcl.g:3200:2: ( rule__ListOfValues__Group_1__0 )*
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalPLhlcl.g:3201:2: ( rule__ListOfValues__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPLhlcl.g:3201:3: rule__ListOfValues__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalPLhlcl.g:3210:1: rule__ListOfValues__Group_1__0 : rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 ;
    public final void rule__ListOfValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3214:1: ( rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 )
            // InternalPLhlcl.g:3215:2: rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1
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
    // InternalPLhlcl.g:3222:1: rule__ListOfValues__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3226:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalPLhlcl.g:3227:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalPLhlcl.g:3227:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalPLhlcl.g:3228:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalPLhlcl.g:3228:2: ( ( ',' ) )
            // InternalPLhlcl.g:3229:3: ( ',' )
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:3230:3: ( ',' )
            // InternalPLhlcl.g:3230:4: ','
            {
            match(input,24,FOLLOW_27); 

            }

             after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 

            }

            // InternalPLhlcl.g:3233:2: ( ( ',' )* )
            // InternalPLhlcl.g:3234:3: ( ',' )*
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:3235:3: ( ',' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPLhlcl.g:3235:4: ','
            	    {
            	    match(input,24,FOLLOW_27); 

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
    // InternalPLhlcl.g:3244:1: rule__ListOfValues__Group_1__1 : rule__ListOfValues__Group_1__1__Impl ;
    public final void rule__ListOfValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3248:1: ( rule__ListOfValues__Group_1__1__Impl )
            // InternalPLhlcl.g:3249:2: rule__ListOfValues__Group_1__1__Impl
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
    // InternalPLhlcl.g:3255:1: rule__ListOfValues__Group_1__1__Impl : ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) ;
    public final void rule__ListOfValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3259:1: ( ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) )
            // InternalPLhlcl.g:3260:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            {
            // InternalPLhlcl.g:3260:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            // InternalPLhlcl.g:3261:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1()); 
            // InternalPLhlcl.g:3262:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            // InternalPLhlcl.g:3262:3: rule__ListOfValues__ValuesAssignment_1_1
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
    // InternalPLhlcl.g:3271:1: rule__ListOfIDs__Group__0 : rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 ;
    public final void rule__ListOfIDs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3275:1: ( rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 )
            // InternalPLhlcl.g:3276:2: rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1
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
    // InternalPLhlcl.g:3283:1: rule__ListOfIDs__Group__0__Impl : ( ( rule__ListOfIDs__IdsAssignment_0 ) ) ;
    public final void rule__ListOfIDs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3287:1: ( ( ( rule__ListOfIDs__IdsAssignment_0 ) ) )
            // InternalPLhlcl.g:3288:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            {
            // InternalPLhlcl.g:3288:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            // InternalPLhlcl.g:3289:2: ( rule__ListOfIDs__IdsAssignment_0 )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment_0()); 
            // InternalPLhlcl.g:3290:2: ( rule__ListOfIDs__IdsAssignment_0 )
            // InternalPLhlcl.g:3290:3: rule__ListOfIDs__IdsAssignment_0
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
    // InternalPLhlcl.g:3298:1: rule__ListOfIDs__Group__1 : rule__ListOfIDs__Group__1__Impl ;
    public final void rule__ListOfIDs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3302:1: ( rule__ListOfIDs__Group__1__Impl )
            // InternalPLhlcl.g:3303:2: rule__ListOfIDs__Group__1__Impl
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
    // InternalPLhlcl.g:3309:1: rule__ListOfIDs__Group__1__Impl : ( ( rule__ListOfIDs__Group_1__0 )* ) ;
    public final void rule__ListOfIDs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3313:1: ( ( ( rule__ListOfIDs__Group_1__0 )* ) )
            // InternalPLhlcl.g:3314:1: ( ( rule__ListOfIDs__Group_1__0 )* )
            {
            // InternalPLhlcl.g:3314:1: ( ( rule__ListOfIDs__Group_1__0 )* )
            // InternalPLhlcl.g:3315:2: ( rule__ListOfIDs__Group_1__0 )*
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalPLhlcl.g:3316:2: ( rule__ListOfIDs__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPLhlcl.g:3316:3: rule__ListOfIDs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalPLhlcl.g:3325:1: rule__ListOfIDs__Group_1__0 : rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 ;
    public final void rule__ListOfIDs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3329:1: ( rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 )
            // InternalPLhlcl.g:3330:2: rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1
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
    // InternalPLhlcl.g:3337:1: rule__ListOfIDs__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfIDs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3341:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalPLhlcl.g:3342:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalPLhlcl.g:3342:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalPLhlcl.g:3343:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalPLhlcl.g:3343:2: ( ( ',' ) )
            // InternalPLhlcl.g:3344:3: ( ',' )
            {
             before(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:3345:3: ( ',' )
            // InternalPLhlcl.g:3345:4: ','
            {
            match(input,24,FOLLOW_27); 

            }

             after(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 

            }

            // InternalPLhlcl.g:3348:2: ( ( ',' )* )
            // InternalPLhlcl.g:3349:3: ( ',' )*
            {
             before(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:3350:3: ( ',' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPLhlcl.g:3350:4: ','
            	    {
            	    match(input,24,FOLLOW_27); 

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
    // InternalPLhlcl.g:3359:1: rule__ListOfIDs__Group_1__1 : rule__ListOfIDs__Group_1__1__Impl ;
    public final void rule__ListOfIDs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3363:1: ( rule__ListOfIDs__Group_1__1__Impl )
            // InternalPLhlcl.g:3364:2: rule__ListOfIDs__Group_1__1__Impl
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
    // InternalPLhlcl.g:3370:1: rule__ListOfIDs__Group_1__1__Impl : ( ( rule__ListOfIDs__IdsAssignment_1_1 ) ) ;
    public final void rule__ListOfIDs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3374:1: ( ( ( rule__ListOfIDs__IdsAssignment_1_1 ) ) )
            // InternalPLhlcl.g:3375:1: ( ( rule__ListOfIDs__IdsAssignment_1_1 ) )
            {
            // InternalPLhlcl.g:3375:1: ( ( rule__ListOfIDs__IdsAssignment_1_1 ) )
            // InternalPLhlcl.g:3376:2: ( rule__ListOfIDs__IdsAssignment_1_1 )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment_1_1()); 
            // InternalPLhlcl.g:3377:2: ( rule__ListOfIDs__IdsAssignment_1_1 )
            // InternalPLhlcl.g:3377:3: rule__ListOfIDs__IdsAssignment_1_1
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


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalPLhlcl.g:3386:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3390:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3391:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3391:2: ( RULE_ID )
            // InternalPLhlcl.g:3392:3: RULE_ID
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
    // InternalPLhlcl.g:3401:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3405:1: ( ( ruleVarDeclaration ) )
            // InternalPLhlcl.g:3406:2: ( ruleVarDeclaration )
            {
            // InternalPLhlcl.g:3406:2: ( ruleVarDeclaration )
            // InternalPLhlcl.g:3407:3: ruleVarDeclaration
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
    // InternalPLhlcl.g:3416:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3420:1: ( ( ruleConstraint ) )
            // InternalPLhlcl.g:3421:2: ( ruleConstraint )
            {
            // InternalPLhlcl.g:3421:2: ( ruleConstraint )
            // InternalPLhlcl.g:3422:3: ruleConstraint
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
    // InternalPLhlcl.g:3431:1: rule__VarDeclaration__InstantiableAssignment_0_0 : ( ( 'instantiable' ) ) ;
    public final void rule__VarDeclaration__InstantiableAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3435:1: ( ( ( 'instantiable' ) ) )
            // InternalPLhlcl.g:3436:2: ( ( 'instantiable' ) )
            {
            // InternalPLhlcl.g:3436:2: ( ( 'instantiable' ) )
            // InternalPLhlcl.g:3437:3: ( 'instantiable' )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 
            // InternalPLhlcl.g:3438:3: ( 'instantiable' )
            // InternalPLhlcl.g:3439:4: 'instantiable'
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPLhlcl.g:3450:1: rule__VarDeclaration__MinAssignment_0_2 : ( ruleNumber ) ;
    public final void rule__VarDeclaration__MinAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3454:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3455:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3455:2: ( ruleNumber )
            // InternalPLhlcl.g:3456:3: ruleNumber
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
    // InternalPLhlcl.g:3465:1: rule__VarDeclaration__MaxAssignment_0_4 : ( ruleNumber ) ;
    public final void rule__VarDeclaration__MaxAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3469:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3470:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3470:2: ( ruleNumber )
            // InternalPLhlcl.g:3471:3: ruleNumber
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
    // InternalPLhlcl.g:3480:1: rule__VarDeclaration__TypeAssignment_1 : ( ruleVarType ) ;
    public final void rule__VarDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3484:1: ( ( ruleVarType ) )
            // InternalPLhlcl.g:3485:2: ( ruleVarType )
            {
            // InternalPLhlcl.g:3485:2: ( ruleVarType )
            // InternalPLhlcl.g:3486:3: ruleVarType
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
    // InternalPLhlcl.g:3495:1: rule__VarDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3499:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3500:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3500:2: ( RULE_ID )
            // InternalPLhlcl.g:3501:3: RULE_ID
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
    // InternalPLhlcl.g:3510:1: rule__VarDeclaration__VariantsAssignment_3_1 : ( ruleVariantDeclaration ) ;
    public final void rule__VarDeclaration__VariantsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3514:1: ( ( ruleVariantDeclaration ) )
            // InternalPLhlcl.g:3515:2: ( ruleVariantDeclaration )
            {
            // InternalPLhlcl.g:3515:2: ( ruleVariantDeclaration )
            // InternalPLhlcl.g:3516:3: ruleVariantDeclaration
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
    // InternalPLhlcl.g:3525:1: rule__VariantsInterval__StartAssignment_0 : ( ruleNumber ) ;
    public final void rule__VariantsInterval__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3529:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3530:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3530:2: ( ruleNumber )
            // InternalPLhlcl.g:3531:3: ruleNumber
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
    // InternalPLhlcl.g:3540:1: rule__VariantsInterval__EndAssignment_2 : ( ruleNumber ) ;
    public final void rule__VariantsInterval__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3544:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3545:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3545:2: ( ruleNumber )
            // InternalPLhlcl.g:3546:3: ruleNumber
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
    // InternalPLhlcl.g:3555:1: rule__VariantsEnumeration__ListAssignment_1 : ( ruleListOfValues ) ;
    public final void rule__VariantsEnumeration__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3559:1: ( ( ruleListOfValues ) )
            // InternalPLhlcl.g:3560:2: ( ruleListOfValues )
            {
            // InternalPLhlcl.g:3560:2: ( ruleListOfValues )
            // InternalPLhlcl.g:3561:3: ruleListOfValues
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
    // InternalPLhlcl.g:3570:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3574:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3575:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3575:2: ( RULE_ID )
            // InternalPLhlcl.g:3576:3: RULE_ID
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
    // InternalPLhlcl.g:3585:1: rule__Constraint__ExpAssignment_2 : ( ruleConsExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3589:1: ( ( ruleConsExpression ) )
            // InternalPLhlcl.g:3590:2: ( ruleConsExpression )
            {
            // InternalPLhlcl.g:3590:2: ( ruleConsExpression )
            // InternalPLhlcl.g:3591:3: ruleConsExpression
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
    // InternalPLhlcl.g:3600:1: rule__IDCons__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDCons__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3604:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3605:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3605:2: ( RULE_ID )
            // InternalPLhlcl.g:3606:3: RULE_ID
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
    // InternalPLhlcl.g:3615:1: rule__Structural__ParentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Structural__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3619:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3620:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3620:2: ( RULE_ID )
            // InternalPLhlcl.g:3621:3: RULE_ID
            {
             before(grammarAccess.getStructuralAccess().getParentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getParentIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalPLhlcl.g:3630:1: rule__Structural__GroupAssignment_4 : ( ruleListOfIDs ) ;
    public final void rule__Structural__GroupAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3634:1: ( ( ruleListOfIDs ) )
            // InternalPLhlcl.g:3635:2: ( ruleListOfIDs )
            {
            // InternalPLhlcl.g:3635:2: ( ruleListOfIDs )
            // InternalPLhlcl.g:3636:3: ruleListOfIDs
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
    // InternalPLhlcl.g:3645:1: rule__Structural__MinAssignment_6_2 : ( ruleNumber ) ;
    public final void rule__Structural__MinAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3649:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3650:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3650:2: ( ruleNumber )
            // InternalPLhlcl.g:3651:3: ruleNumber
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
    // InternalPLhlcl.g:3660:1: rule__Structural__MaxAssignment_6_4 : ( ruleNumber ) ;
    public final void rule__Structural__MaxAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3664:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3665:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3665:2: ( ruleNumber )
            // InternalPLhlcl.g:3666:3: ruleNumber
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
    // InternalPLhlcl.g:3675:1: rule__Attributes__AttAssignment_2 : ( ruleListOfIDs ) ;
    public final void rule__Attributes__AttAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3679:1: ( ( ruleListOfIDs ) )
            // InternalPLhlcl.g:3680:2: ( ruleListOfIDs )
            {
            // InternalPLhlcl.g:3680:2: ( ruleListOfIDs )
            // InternalPLhlcl.g:3681:3: ruleListOfIDs
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
    // InternalPLhlcl.g:3690:1: rule__Attributes__Var1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Attributes__Var1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3694:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3695:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3695:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3696:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributesAccess().getVar1VarDeclarationCrossReference_5_0()); 
            // InternalPLhlcl.g:3697:3: ( RULE_ID )
            // InternalPLhlcl.g:3698:4: RULE_ID
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


    // $ANTLR start "rule__Assignment__VarAssignment_0"
    // InternalPLhlcl.g:3709:1: rule__Assignment__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3713:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3714:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3714:2: ( RULE_ID )
            // InternalPLhlcl.g:3715:3: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VarAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalPLhlcl.g:3724:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3728:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3729:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3729:2: ( ruleValue )
            // InternalPLhlcl.g:3730:3: ruleValue
            {
             before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__VarRefinement__VarAssignment_0"
    // InternalPLhlcl.g:3739:1: rule__VarRefinement__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3743:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3744:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3744:2: ( RULE_ID )
            // InternalPLhlcl.g:3745:3: RULE_ID
            {
             before(grammarAccess.getVarRefinementAccess().getVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarRefinementAccess().getVarIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalPLhlcl.g:3754:1: rule__VarRefinement__ValuesAssignment_2 : ( ruleVariantDeclaration ) ;
    public final void rule__VarRefinement__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3758:1: ( ( ruleVariantDeclaration ) )
            // InternalPLhlcl.g:3759:2: ( ruleVariantDeclaration )
            {
            // InternalPLhlcl.g:3759:2: ( ruleVariantDeclaration )
            // InternalPLhlcl.g:3760:3: ruleVariantDeclaration
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
    // InternalPLhlcl.g:3769:1: rule__SetRefinement__VarsAssignment_2 : ( ruleListOfIDs ) ;
    public final void rule__SetRefinement__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3773:1: ( ( ruleListOfIDs ) )
            // InternalPLhlcl.g:3774:2: ( ruleListOfIDs )
            {
            // InternalPLhlcl.g:3774:2: ( ruleListOfIDs )
            // InternalPLhlcl.g:3775:3: ruleListOfIDs
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


    // $ANTLR start "rule__SetRefinement__HeadAssignment_7"
    // InternalPLhlcl.g:3784:1: rule__SetRefinement__HeadAssignment_7 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__HeadAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3788:1: ( ( ruleListOfValues ) )
            // InternalPLhlcl.g:3789:2: ( ruleListOfValues )
            {
            // InternalPLhlcl.g:3789:2: ( ruleListOfValues )
            // InternalPLhlcl.g:3790:3: ruleListOfValues
            {
             before(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__HeadAssignment_7"


    // $ANTLR start "rule__SetRefinement__TailAssignment_9_2"
    // InternalPLhlcl.g:3799:1: rule__SetRefinement__TailAssignment_9_2 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__TailAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3803:1: ( ( ruleListOfValues ) )
            // InternalPLhlcl.g:3804:2: ( ruleListOfValues )
            {
            // InternalPLhlcl.g:3804:2: ( ruleListOfValues )
            // InternalPLhlcl.g:3805:3: ruleListOfValues
            {
             before(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__TailAssignment_9_2"


    // $ANTLR start "rule__Rule__ConditionAssignment_0"
    // InternalPLhlcl.g:3814:1: rule__Rule__ConditionAssignment_0 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3818:1: ( ( ruleTerminalExp ) )
            // InternalPLhlcl.g:3819:2: ( ruleTerminalExp )
            {
            // InternalPLhlcl.g:3819:2: ( ruleTerminalExp )
            // InternalPLhlcl.g:3820:3: ruleTerminalExp
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
    // InternalPLhlcl.g:3829:1: rule__Rule__ConsequenceAssignment_2 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConsequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3833:1: ( ( ruleTerminalExp ) )
            // InternalPLhlcl.g:3834:2: ( ruleTerminalExp )
            {
            // InternalPLhlcl.g:3834:2: ( ruleTerminalExp )
            // InternalPLhlcl.g:3835:3: ruleTerminalExp
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
    // InternalPLhlcl.g:3844:1: rule__FodaUN__Var1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FodaUN__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3848:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3849:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3849:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3850:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaUNAccess().getVar1VarDeclarationCrossReference_0_0()); 
            // InternalPLhlcl.g:3851:3: ( RULE_ID )
            // InternalPLhlcl.g:3852:4: RULE_ID
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
    // InternalPLhlcl.g:3863:1: rule__FodaUN__OpAssignment_2 : ( ruleUnaryOp ) ;
    public final void rule__FodaUN__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3867:1: ( ( ruleUnaryOp ) )
            // InternalPLhlcl.g:3868:2: ( ruleUnaryOp )
            {
            // InternalPLhlcl.g:3868:2: ( ruleUnaryOp )
            // InternalPLhlcl.g:3869:3: ruleUnaryOp
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
    // InternalPLhlcl.g:3878:1: rule__FodaBin__Var1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FodaBin__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3882:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3883:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3883:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3884:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaBinAccess().getVar1VarDeclarationCrossReference_0_0()); 
            // InternalPLhlcl.g:3885:3: ( RULE_ID )
            // InternalPLhlcl.g:3886:4: RULE_ID
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
    // InternalPLhlcl.g:3897:1: rule__FodaBin__OpAssignment_1 : ( ruleBinOp ) ;
    public final void rule__FodaBin__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3901:1: ( ( ruleBinOp ) )
            // InternalPLhlcl.g:3902:2: ( ruleBinOp )
            {
            // InternalPLhlcl.g:3902:2: ( ruleBinOp )
            // InternalPLhlcl.g:3903:3: ruleBinOp
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
    // InternalPLhlcl.g:3912:1: rule__FodaBin__Var2Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FodaBin__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3916:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3917:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3917:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3918:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaBinAccess().getVar2VarDeclarationCrossReference_2_0()); 
            // InternalPLhlcl.g:3919:3: ( RULE_ID )
            // InternalPLhlcl.g:3920:4: RULE_ID
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


    // $ANTLR start "rule__BoolVal__ValueAssignment"
    // InternalPLhlcl.g:3931:1: rule__BoolVal__ValueAssignment : ( ( rule__BoolVal__ValueAlternatives_0 ) ) ;
    public final void rule__BoolVal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3935:1: ( ( ( rule__BoolVal__ValueAlternatives_0 ) ) )
            // InternalPLhlcl.g:3936:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            {
            // InternalPLhlcl.g:3936:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            // InternalPLhlcl.g:3937:3: ( rule__BoolVal__ValueAlternatives_0 )
            {
             before(grammarAccess.getBoolValAccess().getValueAlternatives_0()); 
            // InternalPLhlcl.g:3938:3: ( rule__BoolVal__ValueAlternatives_0 )
            // InternalPLhlcl.g:3938:4: rule__BoolVal__ValueAlternatives_0
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
    // InternalPLhlcl.g:3946:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3950:1: ( ( RULE_INT ) )
            // InternalPLhlcl.g:3951:2: ( RULE_INT )
            {
            // InternalPLhlcl.g:3951:2: ( RULE_INT )
            // InternalPLhlcl.g:3952:3: RULE_INT
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
    // InternalPLhlcl.g:3961:1: rule__Symbol__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Symbol__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3965:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3966:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3966:2: ( RULE_ID )
            // InternalPLhlcl.g:3967:3: RULE_ID
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
    // InternalPLhlcl.g:3976:1: rule__ListOfValues__ValuesAssignment_0 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3980:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3981:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3981:2: ( ruleValue )
            // InternalPLhlcl.g:3982:3: ruleValue
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
    // InternalPLhlcl.g:3991:1: rule__ListOfValues__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3995:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3996:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3996:2: ( ruleValue )
            // InternalPLhlcl.g:3997:3: ruleValue
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
    // InternalPLhlcl.g:4006:1: rule__ListOfIDs__IdsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListOfIDs__IdsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:4010:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:4011:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:4011:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:4012:3: ( RULE_ID )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_0_0()); 
            // InternalPLhlcl.g:4013:3: ( RULE_ID )
            // InternalPLhlcl.g:4014:4: RULE_ID
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
    // InternalPLhlcl.g:4025:1: rule__ListOfIDs__IdsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListOfIDs__IdsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:4029:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:4030:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:4030:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:4031:3: ( RULE_ID )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_1_1_0()); 
            // InternalPLhlcl.g:4032:3: ( RULE_ID )
            // InternalPLhlcl.g:4033:4: RULE_ID
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\uffff\1\6\10\uffff";
    static final String dfa_3s = "\2\4\5\uffff\1\4\2\uffff";
    static final String dfa_4s = "\1\46\1\50\5\uffff\1\23\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\5\1\7\1\1\1\uffff\1\4\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\30\uffff\1\3\1\uffff\1\4\2\uffff\1\5\3\uffff\1\2",
            "\1\6\13\uffff\4\10\12\uffff\1\6\5\uffff\1\7\1\2\2\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "\2\2\5\uffff\2\2\5\uffff\2\11",
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
            return "773:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) | ( ruleAttributes ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000002000040E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000002000000E002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000002000000E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000044A0000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000F0000L});

}