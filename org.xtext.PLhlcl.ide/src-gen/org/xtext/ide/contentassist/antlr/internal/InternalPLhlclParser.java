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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'boolean'", "'integer'", "'symbolic'", "'requires'", "'excludes'", "'optional'", "'mandatory'", "'model'", "'variables:'", "'constraints:'", "'['", "','", "']'", "'values:'", "'..'", "':'", "'('", "')'", "'structural:'", "'variants:'", "'card:'", "'is'", "'in'", "'vars:'", "'variants'", "'-->'", "'instantiable'"
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


    // $ANTLR start "entryRuleRefinement"
    // InternalPLhlcl.g:303:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalPLhlcl.g:304:1: ( ruleRefinement EOF )
            // InternalPLhlcl.g:305:1: ruleRefinement EOF
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
    // InternalPLhlcl.g:312:1: ruleRefinement : ( ( rule__Refinement__Alternatives ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:316:2: ( ( ( rule__Refinement__Alternatives ) ) )
            // InternalPLhlcl.g:317:2: ( ( rule__Refinement__Alternatives ) )
            {
            // InternalPLhlcl.g:317:2: ( ( rule__Refinement__Alternatives ) )
            // InternalPLhlcl.g:318:3: ( rule__Refinement__Alternatives )
            {
             before(grammarAccess.getRefinementAccess().getAlternatives()); 
            // InternalPLhlcl.g:319:3: ( rule__Refinement__Alternatives )
            // InternalPLhlcl.g:319:4: rule__Refinement__Alternatives
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
    // InternalPLhlcl.g:328:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPLhlcl.g:329:1: ( ruleAssignment EOF )
            // InternalPLhlcl.g:330:1: ruleAssignment EOF
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
    // InternalPLhlcl.g:337:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:341:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalPLhlcl.g:342:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalPLhlcl.g:342:2: ( ( rule__Assignment__Group__0 ) )
            // InternalPLhlcl.g:343:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalPLhlcl.g:344:3: ( rule__Assignment__Group__0 )
            // InternalPLhlcl.g:344:4: rule__Assignment__Group__0
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
    // InternalPLhlcl.g:353:1: entryRuleVarRefinement : ruleVarRefinement EOF ;
    public final void entryRuleVarRefinement() throws RecognitionException {
        try {
            // InternalPLhlcl.g:354:1: ( ruleVarRefinement EOF )
            // InternalPLhlcl.g:355:1: ruleVarRefinement EOF
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
    // InternalPLhlcl.g:362:1: ruleVarRefinement : ( ( rule__VarRefinement__Group__0 ) ) ;
    public final void ruleVarRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:366:2: ( ( ( rule__VarRefinement__Group__0 ) ) )
            // InternalPLhlcl.g:367:2: ( ( rule__VarRefinement__Group__0 ) )
            {
            // InternalPLhlcl.g:367:2: ( ( rule__VarRefinement__Group__0 ) )
            // InternalPLhlcl.g:368:3: ( rule__VarRefinement__Group__0 )
            {
             before(grammarAccess.getVarRefinementAccess().getGroup()); 
            // InternalPLhlcl.g:369:3: ( rule__VarRefinement__Group__0 )
            // InternalPLhlcl.g:369:4: rule__VarRefinement__Group__0
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
    // InternalPLhlcl.g:378:1: entryRuleSetRefinement : ruleSetRefinement EOF ;
    public final void entryRuleSetRefinement() throws RecognitionException {
        try {
            // InternalPLhlcl.g:379:1: ( ruleSetRefinement EOF )
            // InternalPLhlcl.g:380:1: ruleSetRefinement EOF
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
    // InternalPLhlcl.g:387:1: ruleSetRefinement : ( ( rule__SetRefinement__Group__0 ) ) ;
    public final void ruleSetRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:391:2: ( ( ( rule__SetRefinement__Group__0 ) ) )
            // InternalPLhlcl.g:392:2: ( ( rule__SetRefinement__Group__0 ) )
            {
            // InternalPLhlcl.g:392:2: ( ( rule__SetRefinement__Group__0 ) )
            // InternalPLhlcl.g:393:3: ( rule__SetRefinement__Group__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup()); 
            // InternalPLhlcl.g:394:3: ( rule__SetRefinement__Group__0 )
            // InternalPLhlcl.g:394:4: rule__SetRefinement__Group__0
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
    // InternalPLhlcl.g:403:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalPLhlcl.g:404:1: ( ruleRule EOF )
            // InternalPLhlcl.g:405:1: ruleRule EOF
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
    // InternalPLhlcl.g:412:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:416:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalPLhlcl.g:417:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalPLhlcl.g:417:2: ( ( rule__Rule__Group__0 ) )
            // InternalPLhlcl.g:418:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalPLhlcl.g:419:3: ( rule__Rule__Group__0 )
            // InternalPLhlcl.g:419:4: rule__Rule__Group__0
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
    // InternalPLhlcl.g:428:1: entryRuleFodaUN : ruleFodaUN EOF ;
    public final void entryRuleFodaUN() throws RecognitionException {
        try {
            // InternalPLhlcl.g:429:1: ( ruleFodaUN EOF )
            // InternalPLhlcl.g:430:1: ruleFodaUN EOF
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
    // InternalPLhlcl.g:437:1: ruleFodaUN : ( ( rule__FodaUN__Group__0 ) ) ;
    public final void ruleFodaUN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:441:2: ( ( ( rule__FodaUN__Group__0 ) ) )
            // InternalPLhlcl.g:442:2: ( ( rule__FodaUN__Group__0 ) )
            {
            // InternalPLhlcl.g:442:2: ( ( rule__FodaUN__Group__0 ) )
            // InternalPLhlcl.g:443:3: ( rule__FodaUN__Group__0 )
            {
             before(grammarAccess.getFodaUNAccess().getGroup()); 
            // InternalPLhlcl.g:444:3: ( rule__FodaUN__Group__0 )
            // InternalPLhlcl.g:444:4: rule__FodaUN__Group__0
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
    // InternalPLhlcl.g:453:1: entryRuleFodaBin : ruleFodaBin EOF ;
    public final void entryRuleFodaBin() throws RecognitionException {
        try {
            // InternalPLhlcl.g:454:1: ( ruleFodaBin EOF )
            // InternalPLhlcl.g:455:1: ruleFodaBin EOF
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
    // InternalPLhlcl.g:462:1: ruleFodaBin : ( ( rule__FodaBin__Group__0 ) ) ;
    public final void ruleFodaBin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:466:2: ( ( ( rule__FodaBin__Group__0 ) ) )
            // InternalPLhlcl.g:467:2: ( ( rule__FodaBin__Group__0 ) )
            {
            // InternalPLhlcl.g:467:2: ( ( rule__FodaBin__Group__0 ) )
            // InternalPLhlcl.g:468:3: ( rule__FodaBin__Group__0 )
            {
             before(grammarAccess.getFodaBinAccess().getGroup()); 
            // InternalPLhlcl.g:469:3: ( rule__FodaBin__Group__0 )
            // InternalPLhlcl.g:469:4: rule__FodaBin__Group__0
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
    // InternalPLhlcl.g:478:1: entryRuleBoolVal : ruleBoolVal EOF ;
    public final void entryRuleBoolVal() throws RecognitionException {
        try {
            // InternalPLhlcl.g:479:1: ( ruleBoolVal EOF )
            // InternalPLhlcl.g:480:1: ruleBoolVal EOF
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
    // InternalPLhlcl.g:487:1: ruleBoolVal : ( ( rule__BoolVal__ValueAssignment ) ) ;
    public final void ruleBoolVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:491:2: ( ( ( rule__BoolVal__ValueAssignment ) ) )
            // InternalPLhlcl.g:492:2: ( ( rule__BoolVal__ValueAssignment ) )
            {
            // InternalPLhlcl.g:492:2: ( ( rule__BoolVal__ValueAssignment ) )
            // InternalPLhlcl.g:493:3: ( rule__BoolVal__ValueAssignment )
            {
             before(grammarAccess.getBoolValAccess().getValueAssignment()); 
            // InternalPLhlcl.g:494:3: ( rule__BoolVal__ValueAssignment )
            // InternalPLhlcl.g:494:4: rule__BoolVal__ValueAssignment
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
    // InternalPLhlcl.g:503:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalPLhlcl.g:504:1: ( ruleNumber EOF )
            // InternalPLhlcl.g:505:1: ruleNumber EOF
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
    // InternalPLhlcl.g:512:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:516:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalPLhlcl.g:517:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalPLhlcl.g:517:2: ( ( rule__Number__ValueAssignment ) )
            // InternalPLhlcl.g:518:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalPLhlcl.g:519:3: ( rule__Number__ValueAssignment )
            // InternalPLhlcl.g:519:4: rule__Number__ValueAssignment
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
    // InternalPLhlcl.g:528:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalPLhlcl.g:529:1: ( ruleSymbol EOF )
            // InternalPLhlcl.g:530:1: ruleSymbol EOF
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
    // InternalPLhlcl.g:537:1: ruleSymbol : ( ( rule__Symbol__ValueAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:541:2: ( ( ( rule__Symbol__ValueAssignment ) ) )
            // InternalPLhlcl.g:542:2: ( ( rule__Symbol__ValueAssignment ) )
            {
            // InternalPLhlcl.g:542:2: ( ( rule__Symbol__ValueAssignment ) )
            // InternalPLhlcl.g:543:3: ( rule__Symbol__ValueAssignment )
            {
             before(grammarAccess.getSymbolAccess().getValueAssignment()); 
            // InternalPLhlcl.g:544:3: ( rule__Symbol__ValueAssignment )
            // InternalPLhlcl.g:544:4: rule__Symbol__ValueAssignment
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
    // InternalPLhlcl.g:553:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalPLhlcl.g:554:1: ( ruleValue EOF )
            // InternalPLhlcl.g:555:1: ruleValue EOF
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
    // InternalPLhlcl.g:562:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:566:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalPLhlcl.g:567:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalPLhlcl.g:567:2: ( ( rule__Value__Alternatives ) )
            // InternalPLhlcl.g:568:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalPLhlcl.g:569:3: ( rule__Value__Alternatives )
            // InternalPLhlcl.g:569:4: rule__Value__Alternatives
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
    // InternalPLhlcl.g:578:1: entryRuleNonEnumerableValue : ruleNonEnumerableValue EOF ;
    public final void entryRuleNonEnumerableValue() throws RecognitionException {
        try {
            // InternalPLhlcl.g:579:1: ( ruleNonEnumerableValue EOF )
            // InternalPLhlcl.g:580:1: ruleNonEnumerableValue EOF
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
    // InternalPLhlcl.g:587:1: ruleNonEnumerableValue : ( ( rule__NonEnumerableValue__Alternatives ) ) ;
    public final void ruleNonEnumerableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:591:2: ( ( ( rule__NonEnumerableValue__Alternatives ) ) )
            // InternalPLhlcl.g:592:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            {
            // InternalPLhlcl.g:592:2: ( ( rule__NonEnumerableValue__Alternatives ) )
            // InternalPLhlcl.g:593:3: ( rule__NonEnumerableValue__Alternatives )
            {
             before(grammarAccess.getNonEnumerableValueAccess().getAlternatives()); 
            // InternalPLhlcl.g:594:3: ( rule__NonEnumerableValue__Alternatives )
            // InternalPLhlcl.g:594:4: rule__NonEnumerableValue__Alternatives
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
    // InternalPLhlcl.g:603:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalPLhlcl.g:604:1: ( ruleVarType EOF )
            // InternalPLhlcl.g:605:1: ruleVarType EOF
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
    // InternalPLhlcl.g:612:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:616:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalPLhlcl.g:617:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalPLhlcl.g:617:2: ( ( rule__VarType__Alternatives ) )
            // InternalPLhlcl.g:618:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalPLhlcl.g:619:3: ( rule__VarType__Alternatives )
            // InternalPLhlcl.g:619:4: rule__VarType__Alternatives
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
    // InternalPLhlcl.g:628:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalPLhlcl.g:629:1: ( ruleListOfValues EOF )
            // InternalPLhlcl.g:630:1: ruleListOfValues EOF
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
    // InternalPLhlcl.g:637:1: ruleListOfValues : ( ( rule__ListOfValues__Group__0 ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:641:2: ( ( ( rule__ListOfValues__Group__0 ) ) )
            // InternalPLhlcl.g:642:2: ( ( rule__ListOfValues__Group__0 ) )
            {
            // InternalPLhlcl.g:642:2: ( ( rule__ListOfValues__Group__0 ) )
            // InternalPLhlcl.g:643:3: ( rule__ListOfValues__Group__0 )
            {
             before(grammarAccess.getListOfValuesAccess().getGroup()); 
            // InternalPLhlcl.g:644:3: ( rule__ListOfValues__Group__0 )
            // InternalPLhlcl.g:644:4: rule__ListOfValues__Group__0
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
    // InternalPLhlcl.g:653:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalPLhlcl.g:654:1: ( ruleListOfIDs EOF )
            // InternalPLhlcl.g:655:1: ruleListOfIDs EOF
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
    // InternalPLhlcl.g:662:1: ruleListOfIDs : ( ( rule__ListOfIDs__Group__0 ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:666:2: ( ( ( rule__ListOfIDs__Group__0 ) ) )
            // InternalPLhlcl.g:667:2: ( ( rule__ListOfIDs__Group__0 ) )
            {
            // InternalPLhlcl.g:667:2: ( ( rule__ListOfIDs__Group__0 ) )
            // InternalPLhlcl.g:668:3: ( rule__ListOfIDs__Group__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup()); 
            // InternalPLhlcl.g:669:3: ( rule__ListOfIDs__Group__0 )
            // InternalPLhlcl.g:669:4: rule__ListOfIDs__Group__0
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
    // InternalPLhlcl.g:678:1: entryRuleBinOp : ruleBinOp EOF ;
    public final void entryRuleBinOp() throws RecognitionException {
        try {
            // InternalPLhlcl.g:679:1: ( ruleBinOp EOF )
            // InternalPLhlcl.g:680:1: ruleBinOp EOF
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
    // InternalPLhlcl.g:687:1: ruleBinOp : ( ( rule__BinOp__Alternatives ) ) ;
    public final void ruleBinOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:691:2: ( ( ( rule__BinOp__Alternatives ) ) )
            // InternalPLhlcl.g:692:2: ( ( rule__BinOp__Alternatives ) )
            {
            // InternalPLhlcl.g:692:2: ( ( rule__BinOp__Alternatives ) )
            // InternalPLhlcl.g:693:3: ( rule__BinOp__Alternatives )
            {
             before(grammarAccess.getBinOpAccess().getAlternatives()); 
            // InternalPLhlcl.g:694:3: ( rule__BinOp__Alternatives )
            // InternalPLhlcl.g:694:4: rule__BinOp__Alternatives
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
    // InternalPLhlcl.g:703:1: entryRuleUnaryOp : ruleUnaryOp EOF ;
    public final void entryRuleUnaryOp() throws RecognitionException {
        try {
            // InternalPLhlcl.g:704:1: ( ruleUnaryOp EOF )
            // InternalPLhlcl.g:705:1: ruleUnaryOp EOF
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
    // InternalPLhlcl.g:712:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:716:2: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // InternalPLhlcl.g:717:2: ( ( rule__UnaryOp__Alternatives ) )
            {
            // InternalPLhlcl.g:717:2: ( ( rule__UnaryOp__Alternatives ) )
            // InternalPLhlcl.g:718:3: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // InternalPLhlcl.g:719:3: ( rule__UnaryOp__Alternatives )
            // InternalPLhlcl.g:719:4: rule__UnaryOp__Alternatives
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
    // InternalPLhlcl.g:727:1: rule__VariantDeclaration__Alternatives : ( ( ruleVariantsInterval ) | ( ruleVariantsEnumeration ) );
    public final void rule__VariantDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:731:1: ( ( ruleVariantsInterval ) | ( ruleVariantsEnumeration ) )
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
                    // InternalPLhlcl.g:732:2: ( ruleVariantsInterval )
                    {
                    // InternalPLhlcl.g:732:2: ( ruleVariantsInterval )
                    // InternalPLhlcl.g:733:3: ruleVariantsInterval
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
                    // InternalPLhlcl.g:738:2: ( ruleVariantsEnumeration )
                    {
                    // InternalPLhlcl.g:738:2: ( ruleVariantsEnumeration )
                    // InternalPLhlcl.g:739:3: ruleVariantsEnumeration
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
    // InternalPLhlcl.g:748:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) );
    public final void rule__ConsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:752:1: ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt2=2;
                    }
                    break;
                case 34:
                    {
                    int LA2_5 = input.LA(3);

                    if ( ((LA2_5>=RULE_ID && LA2_5<=RULE_INT)||(LA2_5>=11 && LA2_5<=12)) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_5>=18 && LA2_5<=19)) ) {
                        alt2=6;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    alt2=3;
                    }
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                    {
                    alt2=4;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 30:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPLhlcl.g:753:2: ( ruleIDCons )
                    {
                    // InternalPLhlcl.g:753:2: ( ruleIDCons )
                    // InternalPLhlcl.g:754:3: ruleIDCons
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
                    // InternalPLhlcl.g:759:2: ( ruleRefinement )
                    {
                    // InternalPLhlcl.g:759:2: ( ruleRefinement )
                    // InternalPLhlcl.g:760:3: ruleRefinement
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
                    // InternalPLhlcl.g:765:2: ( ruleRule )
                    {
                    // InternalPLhlcl.g:765:2: ( ruleRule )
                    // InternalPLhlcl.g:766:3: ruleRule
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
                    // InternalPLhlcl.g:771:2: ( ruleFodaBin )
                    {
                    // InternalPLhlcl.g:771:2: ( ruleFodaBin )
                    // InternalPLhlcl.g:772:3: ruleFodaBin
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
                    // InternalPLhlcl.g:777:2: ( ruleStructural )
                    {
                    // InternalPLhlcl.g:777:2: ( ruleStructural )
                    // InternalPLhlcl.g:778:3: ruleStructural
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
                    // InternalPLhlcl.g:783:2: ( ruleFodaUN )
                    {
                    // InternalPLhlcl.g:783:2: ( ruleFodaUN )
                    // InternalPLhlcl.g:784:3: ruleFodaUN
                    {
                     before(grammarAccess.getConsExpressionAccess().getFodaUNParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleFodaUN();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getFodaUNParserRuleCall_5()); 

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
    // InternalPLhlcl.g:793:1: rule__TerminalExp__Alternatives : ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) );
    public final void rule__TerminalExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:797:1: ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) )
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
                    // InternalPLhlcl.g:798:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    {
                    // InternalPLhlcl.g:798:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    // InternalPLhlcl.g:799:3: ( rule__TerminalExp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpAccess().getGroup_0()); 
                    // InternalPLhlcl.g:800:3: ( rule__TerminalExp__Group_0__0 )
                    // InternalPLhlcl.g:800:4: rule__TerminalExp__Group_0__0
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
                    // InternalPLhlcl.g:804:2: ( ruleIDCons )
                    {
                    // InternalPLhlcl.g:804:2: ( ruleIDCons )
                    // InternalPLhlcl.g:805:3: ruleIDCons
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
    // InternalPLhlcl.g:814:1: rule__Refinement__Alternatives : ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) );
    public final void rule__Refinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:818:1: ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==34) ) {
                    alt4=1;
                }
                else if ( (LA4_1==35) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==36) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPLhlcl.g:819:2: ( ruleAssignment )
                    {
                    // InternalPLhlcl.g:819:2: ( ruleAssignment )
                    // InternalPLhlcl.g:820:3: ruleAssignment
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
                    // InternalPLhlcl.g:825:2: ( ruleVarRefinement )
                    {
                    // InternalPLhlcl.g:825:2: ( ruleVarRefinement )
                    // InternalPLhlcl.g:826:3: ruleVarRefinement
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
                    // InternalPLhlcl.g:831:2: ( ruleSetRefinement )
                    {
                    // InternalPLhlcl.g:831:2: ( ruleSetRefinement )
                    // InternalPLhlcl.g:832:3: ruleSetRefinement
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
    // InternalPLhlcl.g:841:1: rule__BoolVal__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BoolVal__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:845:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalPLhlcl.g:846:2: ( 'true' )
                    {
                    // InternalPLhlcl.g:846:2: ( 'true' )
                    // InternalPLhlcl.g:847:3: 'true'
                    {
                     before(grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:852:2: ( 'false' )
                    {
                    // InternalPLhlcl.g:852:2: ( 'false' )
                    // InternalPLhlcl.g:853:3: 'false'
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
    // InternalPLhlcl.g:862:1: rule__Value__Alternatives : ( ( ruleNumber ) | ( ruleNonEnumerableValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:866:1: ( ( ruleNumber ) | ( ruleNonEnumerableValue ) )
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
                    // InternalPLhlcl.g:867:2: ( ruleNumber )
                    {
                    // InternalPLhlcl.g:867:2: ( ruleNumber )
                    // InternalPLhlcl.g:868:3: ruleNumber
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
                    // InternalPLhlcl.g:873:2: ( ruleNonEnumerableValue )
                    {
                    // InternalPLhlcl.g:873:2: ( ruleNonEnumerableValue )
                    // InternalPLhlcl.g:874:3: ruleNonEnumerableValue
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
    // InternalPLhlcl.g:883:1: rule__NonEnumerableValue__Alternatives : ( ( ruleBoolVal ) | ( ruleSymbol ) );
    public final void rule__NonEnumerableValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:887:1: ( ( ruleBoolVal ) | ( ruleSymbol ) )
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
                    // InternalPLhlcl.g:888:2: ( ruleBoolVal )
                    {
                    // InternalPLhlcl.g:888:2: ( ruleBoolVal )
                    // InternalPLhlcl.g:889:3: ruleBoolVal
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
                    // InternalPLhlcl.g:894:2: ( ruleSymbol )
                    {
                    // InternalPLhlcl.g:894:2: ( ruleSymbol )
                    // InternalPLhlcl.g:895:3: ruleSymbol
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
    // InternalPLhlcl.g:904:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:908:1: ( ( 'boolean' ) | ( 'integer' ) | ( 'symbolic' ) )
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
                    // InternalPLhlcl.g:909:2: ( 'boolean' )
                    {
                    // InternalPLhlcl.g:909:2: ( 'boolean' )
                    // InternalPLhlcl.g:910:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:915:2: ( 'integer' )
                    {
                    // InternalPLhlcl.g:915:2: ( 'integer' )
                    // InternalPLhlcl.g:916:3: 'integer'
                    {
                     before(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:921:2: ( 'symbolic' )
                    {
                    // InternalPLhlcl.g:921:2: ( 'symbolic' )
                    // InternalPLhlcl.g:922:3: 'symbolic'
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
    // InternalPLhlcl.g:931:1: rule__BinOp__Alternatives : ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__BinOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:935:1: ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) )
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
                    // InternalPLhlcl.g:936:2: ( 'requires' )
                    {
                    // InternalPLhlcl.g:936:2: ( 'requires' )
                    // InternalPLhlcl.g:937:3: 'requires'
                    {
                     before(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:942:2: ( 'excludes' )
                    {
                    // InternalPLhlcl.g:942:2: ( 'excludes' )
                    // InternalPLhlcl.g:943:3: 'excludes'
                    {
                     before(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:948:2: ( 'optional' )
                    {
                    // InternalPLhlcl.g:948:2: ( 'optional' )
                    // InternalPLhlcl.g:949:3: 'optional'
                    {
                     before(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPLhlcl.g:954:2: ( 'mandatory' )
                    {
                    // InternalPLhlcl.g:954:2: ( 'mandatory' )
                    // InternalPLhlcl.g:955:3: 'mandatory'
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
    // InternalPLhlcl.g:964:1: rule__UnaryOp__Alternatives : ( ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:968:1: ( ( 'optional' ) | ( 'mandatory' ) )
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
                    // InternalPLhlcl.g:969:2: ( 'optional' )
                    {
                    // InternalPLhlcl.g:969:2: ( 'optional' )
                    // InternalPLhlcl.g:970:3: 'optional'
                    {
                     before(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:975:2: ( 'mandatory' )
                    {
                    // InternalPLhlcl.g:975:2: ( 'mandatory' )
                    // InternalPLhlcl.g:976:3: 'mandatory'
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
    // InternalPLhlcl.g:985:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:989:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPLhlcl.g:990:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPLhlcl.g:997:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1001:1: ( ( 'model' ) )
            // InternalPLhlcl.g:1002:1: ( 'model' )
            {
            // InternalPLhlcl.g:1002:1: ( 'model' )
            // InternalPLhlcl.g:1003:2: 'model'
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
    // InternalPLhlcl.g:1012:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1016:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPLhlcl.g:1017:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalPLhlcl.g:1024:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1028:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalPLhlcl.g:1029:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalPLhlcl.g:1029:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalPLhlcl.g:1030:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalPLhlcl.g:1031:2: ( rule__Model__NameAssignment_1 )
            // InternalPLhlcl.g:1031:3: rule__Model__NameAssignment_1
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
    // InternalPLhlcl.g:1039:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1043:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPLhlcl.g:1044:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalPLhlcl.g:1051:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1055:1: ( ( 'variables:' ) )
            // InternalPLhlcl.g:1056:1: ( 'variables:' )
            {
            // InternalPLhlcl.g:1056:1: ( 'variables:' )
            // InternalPLhlcl.g:1057:2: 'variables:'
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
    // InternalPLhlcl.g:1066:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1070:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalPLhlcl.g:1071:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalPLhlcl.g:1078:1: rule__Model__Group__3__Impl : ( ( rule__Model__VarsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1082:1: ( ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalPLhlcl.g:1083:1: ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalPLhlcl.g:1083:1: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalPLhlcl.g:1084:2: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalPLhlcl.g:1085:2: ( rule__Model__VarsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=13 && LA11_0<=15)||LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPLhlcl.g:1085:3: rule__Model__VarsAssignment_3
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
    // InternalPLhlcl.g:1093:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1097:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalPLhlcl.g:1098:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalPLhlcl.g:1105:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1109:1: ( ( 'constraints:' ) )
            // InternalPLhlcl.g:1110:1: ( 'constraints:' )
            {
            // InternalPLhlcl.g:1110:1: ( 'constraints:' )
            // InternalPLhlcl.g:1111:2: 'constraints:'
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
    // InternalPLhlcl.g:1120:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1124:1: ( rule__Model__Group__5__Impl )
            // InternalPLhlcl.g:1125:2: rule__Model__Group__5__Impl
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
    // InternalPLhlcl.g:1131:1: rule__Model__Group__5__Impl : ( ( rule__Model__ConstraintsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1135:1: ( ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalPLhlcl.g:1136:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalPLhlcl.g:1136:1: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalPLhlcl.g:1137:2: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalPLhlcl.g:1138:2: ( rule__Model__ConstraintsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPLhlcl.g:1138:3: rule__Model__ConstraintsAssignment_5
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
    // InternalPLhlcl.g:1147:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1151:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPLhlcl.g:1152:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
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
    // InternalPLhlcl.g:1159:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__Group_0__0 )? ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1163:1: ( ( ( rule__VarDeclaration__Group_0__0 )? ) )
            // InternalPLhlcl.g:1164:1: ( ( rule__VarDeclaration__Group_0__0 )? )
            {
            // InternalPLhlcl.g:1164:1: ( ( rule__VarDeclaration__Group_0__0 )? )
            // InternalPLhlcl.g:1165:2: ( rule__VarDeclaration__Group_0__0 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup_0()); 
            // InternalPLhlcl.g:1166:2: ( rule__VarDeclaration__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPLhlcl.g:1166:3: rule__VarDeclaration__Group_0__0
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
    // InternalPLhlcl.g:1174:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1178:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalPLhlcl.g:1179:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
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
    // InternalPLhlcl.g:1186:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1190:1: ( ( ( rule__VarDeclaration__TypeAssignment_1 ) ) )
            // InternalPLhlcl.g:1191:1: ( ( rule__VarDeclaration__TypeAssignment_1 ) )
            {
            // InternalPLhlcl.g:1191:1: ( ( rule__VarDeclaration__TypeAssignment_1 ) )
            // InternalPLhlcl.g:1192:2: ( rule__VarDeclaration__TypeAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1()); 
            // InternalPLhlcl.g:1193:2: ( rule__VarDeclaration__TypeAssignment_1 )
            // InternalPLhlcl.g:1193:3: rule__VarDeclaration__TypeAssignment_1
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
    // InternalPLhlcl.g:1201:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1205:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalPLhlcl.g:1206:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
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
    // InternalPLhlcl.g:1213:1: rule__VarDeclaration__Group__2__Impl : ( ( rule__VarDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1217:1: ( ( ( rule__VarDeclaration__NameAssignment_2 ) ) )
            // InternalPLhlcl.g:1218:1: ( ( rule__VarDeclaration__NameAssignment_2 ) )
            {
            // InternalPLhlcl.g:1218:1: ( ( rule__VarDeclaration__NameAssignment_2 ) )
            // InternalPLhlcl.g:1219:2: ( rule__VarDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_2()); 
            // InternalPLhlcl.g:1220:2: ( rule__VarDeclaration__NameAssignment_2 )
            // InternalPLhlcl.g:1220:3: rule__VarDeclaration__NameAssignment_2
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
    // InternalPLhlcl.g:1228:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1232:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalPLhlcl.g:1233:2: rule__VarDeclaration__Group__3__Impl
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
    // InternalPLhlcl.g:1239:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__Group_3__0 )? ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1243:1: ( ( ( rule__VarDeclaration__Group_3__0 )? ) )
            // InternalPLhlcl.g:1244:1: ( ( rule__VarDeclaration__Group_3__0 )? )
            {
            // InternalPLhlcl.g:1244:1: ( ( rule__VarDeclaration__Group_3__0 )? )
            // InternalPLhlcl.g:1245:2: ( rule__VarDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup_3()); 
            // InternalPLhlcl.g:1246:2: ( rule__VarDeclaration__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPLhlcl.g:1246:3: rule__VarDeclaration__Group_3__0
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
    // InternalPLhlcl.g:1255:1: rule__VarDeclaration__Group_0__0 : rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 ;
    public final void rule__VarDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1259:1: ( rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 )
            // InternalPLhlcl.g:1260:2: rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1
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
    // InternalPLhlcl.g:1267:1: rule__VarDeclaration__Group_0__0__Impl : ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) ) ;
    public final void rule__VarDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1271:1: ( ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) ) )
            // InternalPLhlcl.g:1272:1: ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) )
            {
            // InternalPLhlcl.g:1272:1: ( ( rule__VarDeclaration__InstantiableAssignment_0_0 ) )
            // InternalPLhlcl.g:1273:2: ( rule__VarDeclaration__InstantiableAssignment_0_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0_0()); 
            // InternalPLhlcl.g:1274:2: ( rule__VarDeclaration__InstantiableAssignment_0_0 )
            // InternalPLhlcl.g:1274:3: rule__VarDeclaration__InstantiableAssignment_0_0
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
    // InternalPLhlcl.g:1282:1: rule__VarDeclaration__Group_0__1 : rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2 ;
    public final void rule__VarDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1286:1: ( rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2 )
            // InternalPLhlcl.g:1287:2: rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2
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
    // InternalPLhlcl.g:1294:1: rule__VarDeclaration__Group_0__1__Impl : ( '[' ) ;
    public final void rule__VarDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1298:1: ( ( '[' ) )
            // InternalPLhlcl.g:1299:1: ( '[' )
            {
            // InternalPLhlcl.g:1299:1: ( '[' )
            // InternalPLhlcl.g:1300:2: '['
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
    // InternalPLhlcl.g:1309:1: rule__VarDeclaration__Group_0__2 : rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3 ;
    public final void rule__VarDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1313:1: ( rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3 )
            // InternalPLhlcl.g:1314:2: rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3
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
    // InternalPLhlcl.g:1321:1: rule__VarDeclaration__Group_0__2__Impl : ( ( rule__VarDeclaration__MinAssignment_0_2 ) ) ;
    public final void rule__VarDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1325:1: ( ( ( rule__VarDeclaration__MinAssignment_0_2 ) ) )
            // InternalPLhlcl.g:1326:1: ( ( rule__VarDeclaration__MinAssignment_0_2 ) )
            {
            // InternalPLhlcl.g:1326:1: ( ( rule__VarDeclaration__MinAssignment_0_2 ) )
            // InternalPLhlcl.g:1327:2: ( rule__VarDeclaration__MinAssignment_0_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getMinAssignment_0_2()); 
            // InternalPLhlcl.g:1328:2: ( rule__VarDeclaration__MinAssignment_0_2 )
            // InternalPLhlcl.g:1328:3: rule__VarDeclaration__MinAssignment_0_2
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
    // InternalPLhlcl.g:1336:1: rule__VarDeclaration__Group_0__3 : rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4 ;
    public final void rule__VarDeclaration__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1340:1: ( rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4 )
            // InternalPLhlcl.g:1341:2: rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4
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
    // InternalPLhlcl.g:1348:1: rule__VarDeclaration__Group_0__3__Impl : ( ',' ) ;
    public final void rule__VarDeclaration__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1352:1: ( ( ',' ) )
            // InternalPLhlcl.g:1353:1: ( ',' )
            {
            // InternalPLhlcl.g:1353:1: ( ',' )
            // InternalPLhlcl.g:1354:2: ','
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
    // InternalPLhlcl.g:1363:1: rule__VarDeclaration__Group_0__4 : rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5 ;
    public final void rule__VarDeclaration__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1367:1: ( rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5 )
            // InternalPLhlcl.g:1368:2: rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5
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
    // InternalPLhlcl.g:1375:1: rule__VarDeclaration__Group_0__4__Impl : ( ( rule__VarDeclaration__MaxAssignment_0_4 ) ) ;
    public final void rule__VarDeclaration__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1379:1: ( ( ( rule__VarDeclaration__MaxAssignment_0_4 ) ) )
            // InternalPLhlcl.g:1380:1: ( ( rule__VarDeclaration__MaxAssignment_0_4 ) )
            {
            // InternalPLhlcl.g:1380:1: ( ( rule__VarDeclaration__MaxAssignment_0_4 ) )
            // InternalPLhlcl.g:1381:2: ( rule__VarDeclaration__MaxAssignment_0_4 )
            {
             before(grammarAccess.getVarDeclarationAccess().getMaxAssignment_0_4()); 
            // InternalPLhlcl.g:1382:2: ( rule__VarDeclaration__MaxAssignment_0_4 )
            // InternalPLhlcl.g:1382:3: rule__VarDeclaration__MaxAssignment_0_4
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
    // InternalPLhlcl.g:1390:1: rule__VarDeclaration__Group_0__5 : rule__VarDeclaration__Group_0__5__Impl ;
    public final void rule__VarDeclaration__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1394:1: ( rule__VarDeclaration__Group_0__5__Impl )
            // InternalPLhlcl.g:1395:2: rule__VarDeclaration__Group_0__5__Impl
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
    // InternalPLhlcl.g:1401:1: rule__VarDeclaration__Group_0__5__Impl : ( ']' ) ;
    public final void rule__VarDeclaration__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1405:1: ( ( ']' ) )
            // InternalPLhlcl.g:1406:1: ( ']' )
            {
            // InternalPLhlcl.g:1406:1: ( ']' )
            // InternalPLhlcl.g:1407:2: ']'
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
    // InternalPLhlcl.g:1417:1: rule__VarDeclaration__Group_3__0 : rule__VarDeclaration__Group_3__0__Impl rule__VarDeclaration__Group_3__1 ;
    public final void rule__VarDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1421:1: ( rule__VarDeclaration__Group_3__0__Impl rule__VarDeclaration__Group_3__1 )
            // InternalPLhlcl.g:1422:2: rule__VarDeclaration__Group_3__0__Impl rule__VarDeclaration__Group_3__1
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
    // InternalPLhlcl.g:1429:1: rule__VarDeclaration__Group_3__0__Impl : ( 'values:' ) ;
    public final void rule__VarDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1433:1: ( ( 'values:' ) )
            // InternalPLhlcl.g:1434:1: ( 'values:' )
            {
            // InternalPLhlcl.g:1434:1: ( 'values:' )
            // InternalPLhlcl.g:1435:2: 'values:'
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
    // InternalPLhlcl.g:1444:1: rule__VarDeclaration__Group_3__1 : rule__VarDeclaration__Group_3__1__Impl ;
    public final void rule__VarDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1448:1: ( rule__VarDeclaration__Group_3__1__Impl )
            // InternalPLhlcl.g:1449:2: rule__VarDeclaration__Group_3__1__Impl
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
    // InternalPLhlcl.g:1455:1: rule__VarDeclaration__Group_3__1__Impl : ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) ) ;
    public final void rule__VarDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1459:1: ( ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) ) )
            // InternalPLhlcl.g:1460:1: ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) )
            {
            // InternalPLhlcl.g:1460:1: ( ( rule__VarDeclaration__VariantsAssignment_3_1 ) )
            // InternalPLhlcl.g:1461:2: ( rule__VarDeclaration__VariantsAssignment_3_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_3_1()); 
            // InternalPLhlcl.g:1462:2: ( rule__VarDeclaration__VariantsAssignment_3_1 )
            // InternalPLhlcl.g:1462:3: rule__VarDeclaration__VariantsAssignment_3_1
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
    // InternalPLhlcl.g:1471:1: rule__VariantsInterval__Group__0 : rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 ;
    public final void rule__VariantsInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1475:1: ( rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 )
            // InternalPLhlcl.g:1476:2: rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1
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
    // InternalPLhlcl.g:1483:1: rule__VariantsInterval__Group__0__Impl : ( ( rule__VariantsInterval__StartAssignment_0 ) ) ;
    public final void rule__VariantsInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1487:1: ( ( ( rule__VariantsInterval__StartAssignment_0 ) ) )
            // InternalPLhlcl.g:1488:1: ( ( rule__VariantsInterval__StartAssignment_0 ) )
            {
            // InternalPLhlcl.g:1488:1: ( ( rule__VariantsInterval__StartAssignment_0 ) )
            // InternalPLhlcl.g:1489:2: ( rule__VariantsInterval__StartAssignment_0 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartAssignment_0()); 
            // InternalPLhlcl.g:1490:2: ( rule__VariantsInterval__StartAssignment_0 )
            // InternalPLhlcl.g:1490:3: rule__VariantsInterval__StartAssignment_0
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
    // InternalPLhlcl.g:1498:1: rule__VariantsInterval__Group__1 : rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 ;
    public final void rule__VariantsInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1502:1: ( rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 )
            // InternalPLhlcl.g:1503:2: rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2
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
    // InternalPLhlcl.g:1510:1: rule__VariantsInterval__Group__1__Impl : ( '..' ) ;
    public final void rule__VariantsInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1514:1: ( ( '..' ) )
            // InternalPLhlcl.g:1515:1: ( '..' )
            {
            // InternalPLhlcl.g:1515:1: ( '..' )
            // InternalPLhlcl.g:1516:2: '..'
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
    // InternalPLhlcl.g:1525:1: rule__VariantsInterval__Group__2 : rule__VariantsInterval__Group__2__Impl ;
    public final void rule__VariantsInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1529:1: ( rule__VariantsInterval__Group__2__Impl )
            // InternalPLhlcl.g:1530:2: rule__VariantsInterval__Group__2__Impl
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
    // InternalPLhlcl.g:1536:1: rule__VariantsInterval__Group__2__Impl : ( ( rule__VariantsInterval__EndAssignment_2 ) ) ;
    public final void rule__VariantsInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1540:1: ( ( ( rule__VariantsInterval__EndAssignment_2 ) ) )
            // InternalPLhlcl.g:1541:1: ( ( rule__VariantsInterval__EndAssignment_2 ) )
            {
            // InternalPLhlcl.g:1541:1: ( ( rule__VariantsInterval__EndAssignment_2 ) )
            // InternalPLhlcl.g:1542:2: ( rule__VariantsInterval__EndAssignment_2 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndAssignment_2()); 
            // InternalPLhlcl.g:1543:2: ( rule__VariantsInterval__EndAssignment_2 )
            // InternalPLhlcl.g:1543:3: rule__VariantsInterval__EndAssignment_2
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
    // InternalPLhlcl.g:1552:1: rule__VariantsEnumeration__Group__0 : rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 ;
    public final void rule__VariantsEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1556:1: ( rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 )
            // InternalPLhlcl.g:1557:2: rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1
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
    // InternalPLhlcl.g:1564:1: rule__VariantsEnumeration__Group__0__Impl : ( '[' ) ;
    public final void rule__VariantsEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1568:1: ( ( '[' ) )
            // InternalPLhlcl.g:1569:1: ( '[' )
            {
            // InternalPLhlcl.g:1569:1: ( '[' )
            // InternalPLhlcl.g:1570:2: '['
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
    // InternalPLhlcl.g:1579:1: rule__VariantsEnumeration__Group__1 : rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 ;
    public final void rule__VariantsEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1583:1: ( rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 )
            // InternalPLhlcl.g:1584:2: rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2
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
    // InternalPLhlcl.g:1591:1: rule__VariantsEnumeration__Group__1__Impl : ( ( rule__VariantsEnumeration__ListAssignment_1 ) ) ;
    public final void rule__VariantsEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1595:1: ( ( ( rule__VariantsEnumeration__ListAssignment_1 ) ) )
            // InternalPLhlcl.g:1596:1: ( ( rule__VariantsEnumeration__ListAssignment_1 ) )
            {
            // InternalPLhlcl.g:1596:1: ( ( rule__VariantsEnumeration__ListAssignment_1 ) )
            // InternalPLhlcl.g:1597:2: ( rule__VariantsEnumeration__ListAssignment_1 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListAssignment_1()); 
            // InternalPLhlcl.g:1598:2: ( rule__VariantsEnumeration__ListAssignment_1 )
            // InternalPLhlcl.g:1598:3: rule__VariantsEnumeration__ListAssignment_1
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
    // InternalPLhlcl.g:1606:1: rule__VariantsEnumeration__Group__2 : rule__VariantsEnumeration__Group__2__Impl ;
    public final void rule__VariantsEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1610:1: ( rule__VariantsEnumeration__Group__2__Impl )
            // InternalPLhlcl.g:1611:2: rule__VariantsEnumeration__Group__2__Impl
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
    // InternalPLhlcl.g:1617:1: rule__VariantsEnumeration__Group__2__Impl : ( ']' ) ;
    public final void rule__VariantsEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1621:1: ( ( ']' ) )
            // InternalPLhlcl.g:1622:1: ( ']' )
            {
            // InternalPLhlcl.g:1622:1: ( ']' )
            // InternalPLhlcl.g:1623:2: ']'
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
    // InternalPLhlcl.g:1633:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1637:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalPLhlcl.g:1638:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalPLhlcl.g:1645:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1649:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalPLhlcl.g:1650:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalPLhlcl.g:1650:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalPLhlcl.g:1651:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalPLhlcl.g:1652:2: ( rule__Constraint__NameAssignment_0 )
            // InternalPLhlcl.g:1652:3: rule__Constraint__NameAssignment_0
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
    // InternalPLhlcl.g:1660:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1664:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalPLhlcl.g:1665:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalPLhlcl.g:1672:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1676:1: ( ( ':' ) )
            // InternalPLhlcl.g:1677:1: ( ':' )
            {
            // InternalPLhlcl.g:1677:1: ( ':' )
            // InternalPLhlcl.g:1678:2: ':'
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
    // InternalPLhlcl.g:1687:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1691:1: ( rule__Constraint__Group__2__Impl )
            // InternalPLhlcl.g:1692:2: rule__Constraint__Group__2__Impl
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
    // InternalPLhlcl.g:1698:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1702:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalPLhlcl.g:1703:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalPLhlcl.g:1703:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalPLhlcl.g:1704:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalPLhlcl.g:1705:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalPLhlcl.g:1705:3: rule__Constraint__ExpAssignment_2
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
    // InternalPLhlcl.g:1714:1: rule__TerminalExp__Group_0__0 : rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 ;
    public final void rule__TerminalExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1718:1: ( rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 )
            // InternalPLhlcl.g:1719:2: rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1
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
    // InternalPLhlcl.g:1726:1: rule__TerminalExp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1730:1: ( ( '(' ) )
            // InternalPLhlcl.g:1731:1: ( '(' )
            {
            // InternalPLhlcl.g:1731:1: ( '(' )
            // InternalPLhlcl.g:1732:2: '('
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
    // InternalPLhlcl.g:1741:1: rule__TerminalExp__Group_0__1 : rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 ;
    public final void rule__TerminalExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1745:1: ( rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 )
            // InternalPLhlcl.g:1746:2: rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2
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
    // InternalPLhlcl.g:1753:1: rule__TerminalExp__Group_0__1__Impl : ( ruleConsExpression ) ;
    public final void rule__TerminalExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1757:1: ( ( ruleConsExpression ) )
            // InternalPLhlcl.g:1758:1: ( ruleConsExpression )
            {
            // InternalPLhlcl.g:1758:1: ( ruleConsExpression )
            // InternalPLhlcl.g:1759:2: ruleConsExpression
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
    // InternalPLhlcl.g:1768:1: rule__TerminalExp__Group_0__2 : rule__TerminalExp__Group_0__2__Impl ;
    public final void rule__TerminalExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1772:1: ( rule__TerminalExp__Group_0__2__Impl )
            // InternalPLhlcl.g:1773:2: rule__TerminalExp__Group_0__2__Impl
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
    // InternalPLhlcl.g:1779:1: rule__TerminalExp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1783:1: ( ( ')' ) )
            // InternalPLhlcl.g:1784:1: ( ')' )
            {
            // InternalPLhlcl.g:1784:1: ( ')' )
            // InternalPLhlcl.g:1785:2: ')'
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
    // InternalPLhlcl.g:1795:1: rule__Structural__Group__0 : rule__Structural__Group__0__Impl rule__Structural__Group__1 ;
    public final void rule__Structural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1799:1: ( rule__Structural__Group__0__Impl rule__Structural__Group__1 )
            // InternalPLhlcl.g:1800:2: rule__Structural__Group__0__Impl rule__Structural__Group__1
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
    // InternalPLhlcl.g:1807:1: rule__Structural__Group__0__Impl : ( 'structural:' ) ;
    public final void rule__Structural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1811:1: ( ( 'structural:' ) )
            // InternalPLhlcl.g:1812:1: ( 'structural:' )
            {
            // InternalPLhlcl.g:1812:1: ( 'structural:' )
            // InternalPLhlcl.g:1813:2: 'structural:'
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
    // InternalPLhlcl.g:1822:1: rule__Structural__Group__1 : rule__Structural__Group__1__Impl rule__Structural__Group__2 ;
    public final void rule__Structural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1826:1: ( rule__Structural__Group__1__Impl rule__Structural__Group__2 )
            // InternalPLhlcl.g:1827:2: rule__Structural__Group__1__Impl rule__Structural__Group__2
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
    // InternalPLhlcl.g:1834:1: rule__Structural__Group__1__Impl : ( ( rule__Structural__ParentAssignment_1 ) ) ;
    public final void rule__Structural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1838:1: ( ( ( rule__Structural__ParentAssignment_1 ) ) )
            // InternalPLhlcl.g:1839:1: ( ( rule__Structural__ParentAssignment_1 ) )
            {
            // InternalPLhlcl.g:1839:1: ( ( rule__Structural__ParentAssignment_1 ) )
            // InternalPLhlcl.g:1840:2: ( rule__Structural__ParentAssignment_1 )
            {
             before(grammarAccess.getStructuralAccess().getParentAssignment_1()); 
            // InternalPLhlcl.g:1841:2: ( rule__Structural__ParentAssignment_1 )
            // InternalPLhlcl.g:1841:3: rule__Structural__ParentAssignment_1
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
    // InternalPLhlcl.g:1849:1: rule__Structural__Group__2 : rule__Structural__Group__2__Impl rule__Structural__Group__3 ;
    public final void rule__Structural__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1853:1: ( rule__Structural__Group__2__Impl rule__Structural__Group__3 )
            // InternalPLhlcl.g:1854:2: rule__Structural__Group__2__Impl rule__Structural__Group__3
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
    // InternalPLhlcl.g:1861:1: rule__Structural__Group__2__Impl : ( 'variants:' ) ;
    public final void rule__Structural__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1865:1: ( ( 'variants:' ) )
            // InternalPLhlcl.g:1866:1: ( 'variants:' )
            {
            // InternalPLhlcl.g:1866:1: ( 'variants:' )
            // InternalPLhlcl.g:1867:2: 'variants:'
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
    // InternalPLhlcl.g:1876:1: rule__Structural__Group__3 : rule__Structural__Group__3__Impl rule__Structural__Group__4 ;
    public final void rule__Structural__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1880:1: ( rule__Structural__Group__3__Impl rule__Structural__Group__4 )
            // InternalPLhlcl.g:1881:2: rule__Structural__Group__3__Impl rule__Structural__Group__4
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
    // InternalPLhlcl.g:1888:1: rule__Structural__Group__3__Impl : ( '[' ) ;
    public final void rule__Structural__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1892:1: ( ( '[' ) )
            // InternalPLhlcl.g:1893:1: ( '[' )
            {
            // InternalPLhlcl.g:1893:1: ( '[' )
            // InternalPLhlcl.g:1894:2: '['
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
    // InternalPLhlcl.g:1903:1: rule__Structural__Group__4 : rule__Structural__Group__4__Impl rule__Structural__Group__5 ;
    public final void rule__Structural__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1907:1: ( rule__Structural__Group__4__Impl rule__Structural__Group__5 )
            // InternalPLhlcl.g:1908:2: rule__Structural__Group__4__Impl rule__Structural__Group__5
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
    // InternalPLhlcl.g:1915:1: rule__Structural__Group__4__Impl : ( ( rule__Structural__GroupAssignment_4 ) ) ;
    public final void rule__Structural__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1919:1: ( ( ( rule__Structural__GroupAssignment_4 ) ) )
            // InternalPLhlcl.g:1920:1: ( ( rule__Structural__GroupAssignment_4 ) )
            {
            // InternalPLhlcl.g:1920:1: ( ( rule__Structural__GroupAssignment_4 ) )
            // InternalPLhlcl.g:1921:2: ( rule__Structural__GroupAssignment_4 )
            {
             before(grammarAccess.getStructuralAccess().getGroupAssignment_4()); 
            // InternalPLhlcl.g:1922:2: ( rule__Structural__GroupAssignment_4 )
            // InternalPLhlcl.g:1922:3: rule__Structural__GroupAssignment_4
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
    // InternalPLhlcl.g:1930:1: rule__Structural__Group__5 : rule__Structural__Group__5__Impl rule__Structural__Group__6 ;
    public final void rule__Structural__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1934:1: ( rule__Structural__Group__5__Impl rule__Structural__Group__6 )
            // InternalPLhlcl.g:1935:2: rule__Structural__Group__5__Impl rule__Structural__Group__6
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
    // InternalPLhlcl.g:1942:1: rule__Structural__Group__5__Impl : ( ']' ) ;
    public final void rule__Structural__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1946:1: ( ( ']' ) )
            // InternalPLhlcl.g:1947:1: ( ']' )
            {
            // InternalPLhlcl.g:1947:1: ( ']' )
            // InternalPLhlcl.g:1948:2: ']'
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
    // InternalPLhlcl.g:1957:1: rule__Structural__Group__6 : rule__Structural__Group__6__Impl ;
    public final void rule__Structural__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1961:1: ( rule__Structural__Group__6__Impl )
            // InternalPLhlcl.g:1962:2: rule__Structural__Group__6__Impl
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
    // InternalPLhlcl.g:1968:1: rule__Structural__Group__6__Impl : ( ( rule__Structural__Group_6__0 )? ) ;
    public final void rule__Structural__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1972:1: ( ( ( rule__Structural__Group_6__0 )? ) )
            // InternalPLhlcl.g:1973:1: ( ( rule__Structural__Group_6__0 )? )
            {
            // InternalPLhlcl.g:1973:1: ( ( rule__Structural__Group_6__0 )? )
            // InternalPLhlcl.g:1974:2: ( rule__Structural__Group_6__0 )?
            {
             before(grammarAccess.getStructuralAccess().getGroup_6()); 
            // InternalPLhlcl.g:1975:2: ( rule__Structural__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPLhlcl.g:1975:3: rule__Structural__Group_6__0
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
    // InternalPLhlcl.g:1984:1: rule__Structural__Group_6__0 : rule__Structural__Group_6__0__Impl rule__Structural__Group_6__1 ;
    public final void rule__Structural__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1988:1: ( rule__Structural__Group_6__0__Impl rule__Structural__Group_6__1 )
            // InternalPLhlcl.g:1989:2: rule__Structural__Group_6__0__Impl rule__Structural__Group_6__1
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
    // InternalPLhlcl.g:1996:1: rule__Structural__Group_6__0__Impl : ( 'card:' ) ;
    public final void rule__Structural__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2000:1: ( ( 'card:' ) )
            // InternalPLhlcl.g:2001:1: ( 'card:' )
            {
            // InternalPLhlcl.g:2001:1: ( 'card:' )
            // InternalPLhlcl.g:2002:2: 'card:'
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
    // InternalPLhlcl.g:2011:1: rule__Structural__Group_6__1 : rule__Structural__Group_6__1__Impl rule__Structural__Group_6__2 ;
    public final void rule__Structural__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2015:1: ( rule__Structural__Group_6__1__Impl rule__Structural__Group_6__2 )
            // InternalPLhlcl.g:2016:2: rule__Structural__Group_6__1__Impl rule__Structural__Group_6__2
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
    // InternalPLhlcl.g:2023:1: rule__Structural__Group_6__1__Impl : ( '[' ) ;
    public final void rule__Structural__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2027:1: ( ( '[' ) )
            // InternalPLhlcl.g:2028:1: ( '[' )
            {
            // InternalPLhlcl.g:2028:1: ( '[' )
            // InternalPLhlcl.g:2029:2: '['
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
    // InternalPLhlcl.g:2038:1: rule__Structural__Group_6__2 : rule__Structural__Group_6__2__Impl rule__Structural__Group_6__3 ;
    public final void rule__Structural__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2042:1: ( rule__Structural__Group_6__2__Impl rule__Structural__Group_6__3 )
            // InternalPLhlcl.g:2043:2: rule__Structural__Group_6__2__Impl rule__Structural__Group_6__3
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
    // InternalPLhlcl.g:2050:1: rule__Structural__Group_6__2__Impl : ( ( rule__Structural__MinAssignment_6_2 ) ) ;
    public final void rule__Structural__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2054:1: ( ( ( rule__Structural__MinAssignment_6_2 ) ) )
            // InternalPLhlcl.g:2055:1: ( ( rule__Structural__MinAssignment_6_2 ) )
            {
            // InternalPLhlcl.g:2055:1: ( ( rule__Structural__MinAssignment_6_2 ) )
            // InternalPLhlcl.g:2056:2: ( rule__Structural__MinAssignment_6_2 )
            {
             before(grammarAccess.getStructuralAccess().getMinAssignment_6_2()); 
            // InternalPLhlcl.g:2057:2: ( rule__Structural__MinAssignment_6_2 )
            // InternalPLhlcl.g:2057:3: rule__Structural__MinAssignment_6_2
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
    // InternalPLhlcl.g:2065:1: rule__Structural__Group_6__3 : rule__Structural__Group_6__3__Impl rule__Structural__Group_6__4 ;
    public final void rule__Structural__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2069:1: ( rule__Structural__Group_6__3__Impl rule__Structural__Group_6__4 )
            // InternalPLhlcl.g:2070:2: rule__Structural__Group_6__3__Impl rule__Structural__Group_6__4
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
    // InternalPLhlcl.g:2077:1: rule__Structural__Group_6__3__Impl : ( ',' ) ;
    public final void rule__Structural__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2081:1: ( ( ',' ) )
            // InternalPLhlcl.g:2082:1: ( ',' )
            {
            // InternalPLhlcl.g:2082:1: ( ',' )
            // InternalPLhlcl.g:2083:2: ','
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
    // InternalPLhlcl.g:2092:1: rule__Structural__Group_6__4 : rule__Structural__Group_6__4__Impl rule__Structural__Group_6__5 ;
    public final void rule__Structural__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2096:1: ( rule__Structural__Group_6__4__Impl rule__Structural__Group_6__5 )
            // InternalPLhlcl.g:2097:2: rule__Structural__Group_6__4__Impl rule__Structural__Group_6__5
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
    // InternalPLhlcl.g:2104:1: rule__Structural__Group_6__4__Impl : ( ( rule__Structural__MaxAssignment_6_4 ) ) ;
    public final void rule__Structural__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2108:1: ( ( ( rule__Structural__MaxAssignment_6_4 ) ) )
            // InternalPLhlcl.g:2109:1: ( ( rule__Structural__MaxAssignment_6_4 ) )
            {
            // InternalPLhlcl.g:2109:1: ( ( rule__Structural__MaxAssignment_6_4 ) )
            // InternalPLhlcl.g:2110:2: ( rule__Structural__MaxAssignment_6_4 )
            {
             before(grammarAccess.getStructuralAccess().getMaxAssignment_6_4()); 
            // InternalPLhlcl.g:2111:2: ( rule__Structural__MaxAssignment_6_4 )
            // InternalPLhlcl.g:2111:3: rule__Structural__MaxAssignment_6_4
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
    // InternalPLhlcl.g:2119:1: rule__Structural__Group_6__5 : rule__Structural__Group_6__5__Impl ;
    public final void rule__Structural__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2123:1: ( rule__Structural__Group_6__5__Impl )
            // InternalPLhlcl.g:2124:2: rule__Structural__Group_6__5__Impl
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
    // InternalPLhlcl.g:2130:1: rule__Structural__Group_6__5__Impl : ( ']' ) ;
    public final void rule__Structural__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2134:1: ( ( ']' ) )
            // InternalPLhlcl.g:2135:1: ( ']' )
            {
            // InternalPLhlcl.g:2135:1: ( ']' )
            // InternalPLhlcl.g:2136:2: ']'
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


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalPLhlcl.g:2146:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2150:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalPLhlcl.g:2151:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPLhlcl.g:2158:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2162:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalPLhlcl.g:2163:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalPLhlcl.g:2163:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalPLhlcl.g:2164:2: ( rule__Assignment__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            // InternalPLhlcl.g:2165:2: ( rule__Assignment__VarAssignment_0 )
            // InternalPLhlcl.g:2165:3: rule__Assignment__VarAssignment_0
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
    // InternalPLhlcl.g:2173:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2177:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalPLhlcl.g:2178:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalPLhlcl.g:2185:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2189:1: ( ( 'is' ) )
            // InternalPLhlcl.g:2190:1: ( 'is' )
            {
            // InternalPLhlcl.g:2190:1: ( 'is' )
            // InternalPLhlcl.g:2191:2: 'is'
            {
             before(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPLhlcl.g:2200:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2204:1: ( rule__Assignment__Group__2__Impl )
            // InternalPLhlcl.g:2205:2: rule__Assignment__Group__2__Impl
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
    // InternalPLhlcl.g:2211:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2215:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalPLhlcl.g:2216:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalPLhlcl.g:2216:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalPLhlcl.g:2217:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalPLhlcl.g:2218:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalPLhlcl.g:2218:3: rule__Assignment__ValueAssignment_2
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
    // InternalPLhlcl.g:2227:1: rule__VarRefinement__Group__0 : rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 ;
    public final void rule__VarRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2231:1: ( rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 )
            // InternalPLhlcl.g:2232:2: rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPLhlcl.g:2239:1: rule__VarRefinement__Group__0__Impl : ( ( rule__VarRefinement__VarAssignment_0 ) ) ;
    public final void rule__VarRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2243:1: ( ( ( rule__VarRefinement__VarAssignment_0 ) ) )
            // InternalPLhlcl.g:2244:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            {
            // InternalPLhlcl.g:2244:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            // InternalPLhlcl.g:2245:2: ( rule__VarRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 
            // InternalPLhlcl.g:2246:2: ( rule__VarRefinement__VarAssignment_0 )
            // InternalPLhlcl.g:2246:3: rule__VarRefinement__VarAssignment_0
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
    // InternalPLhlcl.g:2254:1: rule__VarRefinement__Group__1 : rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 ;
    public final void rule__VarRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2258:1: ( rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 )
            // InternalPLhlcl.g:2259:2: rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2
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
    // InternalPLhlcl.g:2266:1: rule__VarRefinement__Group__1__Impl : ( 'in' ) ;
    public final void rule__VarRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2270:1: ( ( 'in' ) )
            // InternalPLhlcl.g:2271:1: ( 'in' )
            {
            // InternalPLhlcl.g:2271:1: ( 'in' )
            // InternalPLhlcl.g:2272:2: 'in'
            {
             before(grammarAccess.getVarRefinementAccess().getInKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPLhlcl.g:2281:1: rule__VarRefinement__Group__2 : rule__VarRefinement__Group__2__Impl ;
    public final void rule__VarRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2285:1: ( rule__VarRefinement__Group__2__Impl )
            // InternalPLhlcl.g:2286:2: rule__VarRefinement__Group__2__Impl
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
    // InternalPLhlcl.g:2292:1: rule__VarRefinement__Group__2__Impl : ( ( rule__VarRefinement__ValuesAssignment_2 ) ) ;
    public final void rule__VarRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2296:1: ( ( ( rule__VarRefinement__ValuesAssignment_2 ) ) )
            // InternalPLhlcl.g:2297:1: ( ( rule__VarRefinement__ValuesAssignment_2 ) )
            {
            // InternalPLhlcl.g:2297:1: ( ( rule__VarRefinement__ValuesAssignment_2 ) )
            // InternalPLhlcl.g:2298:2: ( rule__VarRefinement__ValuesAssignment_2 )
            {
             before(grammarAccess.getVarRefinementAccess().getValuesAssignment_2()); 
            // InternalPLhlcl.g:2299:2: ( rule__VarRefinement__ValuesAssignment_2 )
            // InternalPLhlcl.g:2299:3: rule__VarRefinement__ValuesAssignment_2
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
    // InternalPLhlcl.g:2308:1: rule__SetRefinement__Group__0 : rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 ;
    public final void rule__SetRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2312:1: ( rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 )
            // InternalPLhlcl.g:2313:2: rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPLhlcl.g:2320:1: rule__SetRefinement__Group__0__Impl : ( 'vars:' ) ;
    public final void rule__SetRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2324:1: ( ( 'vars:' ) )
            // InternalPLhlcl.g:2325:1: ( 'vars:' )
            {
            // InternalPLhlcl.g:2325:1: ( 'vars:' )
            // InternalPLhlcl.g:2326:2: 'vars:'
            {
             before(grammarAccess.getSetRefinementAccess().getVarsKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPLhlcl.g:2335:1: rule__SetRefinement__Group__1 : rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 ;
    public final void rule__SetRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2339:1: ( rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 )
            // InternalPLhlcl.g:2340:2: rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2
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
    // InternalPLhlcl.g:2347:1: rule__SetRefinement__Group__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2351:1: ( ( '(' ) )
            // InternalPLhlcl.g:2352:1: ( '(' )
            {
            // InternalPLhlcl.g:2352:1: ( '(' )
            // InternalPLhlcl.g:2353:2: '('
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
    // InternalPLhlcl.g:2362:1: rule__SetRefinement__Group__2 : rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 ;
    public final void rule__SetRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2366:1: ( rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 )
            // InternalPLhlcl.g:2367:2: rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3
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
    // InternalPLhlcl.g:2374:1: rule__SetRefinement__Group__2__Impl : ( ( rule__SetRefinement__VarsAssignment_2 ) ) ;
    public final void rule__SetRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2378:1: ( ( ( rule__SetRefinement__VarsAssignment_2 ) ) )
            // InternalPLhlcl.g:2379:1: ( ( rule__SetRefinement__VarsAssignment_2 ) )
            {
            // InternalPLhlcl.g:2379:1: ( ( rule__SetRefinement__VarsAssignment_2 ) )
            // InternalPLhlcl.g:2380:2: ( rule__SetRefinement__VarsAssignment_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getVarsAssignment_2()); 
            // InternalPLhlcl.g:2381:2: ( rule__SetRefinement__VarsAssignment_2 )
            // InternalPLhlcl.g:2381:3: rule__SetRefinement__VarsAssignment_2
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
    // InternalPLhlcl.g:2389:1: rule__SetRefinement__Group__3 : rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 ;
    public final void rule__SetRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2393:1: ( rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 )
            // InternalPLhlcl.g:2394:2: rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalPLhlcl.g:2401:1: rule__SetRefinement__Group__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2405:1: ( ( ')' ) )
            // InternalPLhlcl.g:2406:1: ( ')' )
            {
            // InternalPLhlcl.g:2406:1: ( ')' )
            // InternalPLhlcl.g:2407:2: ')'
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
    // InternalPLhlcl.g:2416:1: rule__SetRefinement__Group__4 : rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 ;
    public final void rule__SetRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2420:1: ( rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 )
            // InternalPLhlcl.g:2421:2: rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5
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
    // InternalPLhlcl.g:2428:1: rule__SetRefinement__Group__4__Impl : ( 'variants' ) ;
    public final void rule__SetRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2432:1: ( ( 'variants' ) )
            // InternalPLhlcl.g:2433:1: ( 'variants' )
            {
            // InternalPLhlcl.g:2433:1: ( 'variants' )
            // InternalPLhlcl.g:2434:2: 'variants'
            {
             before(grammarAccess.getSetRefinementAccess().getVariantsKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPLhlcl.g:2443:1: rule__SetRefinement__Group__5 : rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 ;
    public final void rule__SetRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2447:1: ( rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 )
            // InternalPLhlcl.g:2448:2: rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalPLhlcl.g:2455:1: rule__SetRefinement__Group__5__Impl : ( '[' ) ;
    public final void rule__SetRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2459:1: ( ( '[' ) )
            // InternalPLhlcl.g:2460:1: ( '[' )
            {
            // InternalPLhlcl.g:2460:1: ( '[' )
            // InternalPLhlcl.g:2461:2: '['
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
    // InternalPLhlcl.g:2470:1: rule__SetRefinement__Group__6 : rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 ;
    public final void rule__SetRefinement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2474:1: ( rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 )
            // InternalPLhlcl.g:2475:2: rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7
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
    // InternalPLhlcl.g:2482:1: rule__SetRefinement__Group__6__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2486:1: ( ( '(' ) )
            // InternalPLhlcl.g:2487:1: ( '(' )
            {
            // InternalPLhlcl.g:2487:1: ( '(' )
            // InternalPLhlcl.g:2488:2: '('
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
    // InternalPLhlcl.g:2497:1: rule__SetRefinement__Group__7 : rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 ;
    public final void rule__SetRefinement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2501:1: ( rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 )
            // InternalPLhlcl.g:2502:2: rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8
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
    // InternalPLhlcl.g:2509:1: rule__SetRefinement__Group__7__Impl : ( ( rule__SetRefinement__HeadAssignment_7 ) ) ;
    public final void rule__SetRefinement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2513:1: ( ( ( rule__SetRefinement__HeadAssignment_7 ) ) )
            // InternalPLhlcl.g:2514:1: ( ( rule__SetRefinement__HeadAssignment_7 ) )
            {
            // InternalPLhlcl.g:2514:1: ( ( rule__SetRefinement__HeadAssignment_7 ) )
            // InternalPLhlcl.g:2515:2: ( rule__SetRefinement__HeadAssignment_7 )
            {
             before(grammarAccess.getSetRefinementAccess().getHeadAssignment_7()); 
            // InternalPLhlcl.g:2516:2: ( rule__SetRefinement__HeadAssignment_7 )
            // InternalPLhlcl.g:2516:3: rule__SetRefinement__HeadAssignment_7
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
    // InternalPLhlcl.g:2524:1: rule__SetRefinement__Group__8 : rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 ;
    public final void rule__SetRefinement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2528:1: ( rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 )
            // InternalPLhlcl.g:2529:2: rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9
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
    // InternalPLhlcl.g:2536:1: rule__SetRefinement__Group__8__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2540:1: ( ( ')' ) )
            // InternalPLhlcl.g:2541:1: ( ')' )
            {
            // InternalPLhlcl.g:2541:1: ( ')' )
            // InternalPLhlcl.g:2542:2: ')'
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
    // InternalPLhlcl.g:2551:1: rule__SetRefinement__Group__9 : rule__SetRefinement__Group__9__Impl rule__SetRefinement__Group__10 ;
    public final void rule__SetRefinement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2555:1: ( rule__SetRefinement__Group__9__Impl rule__SetRefinement__Group__10 )
            // InternalPLhlcl.g:2556:2: rule__SetRefinement__Group__9__Impl rule__SetRefinement__Group__10
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
    // InternalPLhlcl.g:2563:1: rule__SetRefinement__Group__9__Impl : ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) ) ;
    public final void rule__SetRefinement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2567:1: ( ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) ) )
            // InternalPLhlcl.g:2568:1: ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) )
            {
            // InternalPLhlcl.g:2568:1: ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) )
            // InternalPLhlcl.g:2569:2: ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* )
            {
            // InternalPLhlcl.g:2569:2: ( ( rule__SetRefinement__Group_9__0 ) )
            // InternalPLhlcl.g:2570:3: ( rule__SetRefinement__Group_9__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_9()); 
            // InternalPLhlcl.g:2571:3: ( rule__SetRefinement__Group_9__0 )
            // InternalPLhlcl.g:2571:4: rule__SetRefinement__Group_9__0
            {
            pushFollow(FOLLOW_26);
            rule__SetRefinement__Group_9__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup_9()); 

            }

            // InternalPLhlcl.g:2574:2: ( ( rule__SetRefinement__Group_9__0 )* )
            // InternalPLhlcl.g:2575:3: ( rule__SetRefinement__Group_9__0 )*
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_9()); 
            // InternalPLhlcl.g:2576:3: ( rule__SetRefinement__Group_9__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPLhlcl.g:2576:4: rule__SetRefinement__Group_9__0
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalPLhlcl.g:2585:1: rule__SetRefinement__Group__10 : rule__SetRefinement__Group__10__Impl ;
    public final void rule__SetRefinement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2589:1: ( rule__SetRefinement__Group__10__Impl )
            // InternalPLhlcl.g:2590:2: rule__SetRefinement__Group__10__Impl
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
    // InternalPLhlcl.g:2596:1: rule__SetRefinement__Group__10__Impl : ( ']' ) ;
    public final void rule__SetRefinement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2600:1: ( ( ']' ) )
            // InternalPLhlcl.g:2601:1: ( ']' )
            {
            // InternalPLhlcl.g:2601:1: ( ']' )
            // InternalPLhlcl.g:2602:2: ']'
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
    // InternalPLhlcl.g:2612:1: rule__SetRefinement__Group_9__0 : rule__SetRefinement__Group_9__0__Impl rule__SetRefinement__Group_9__1 ;
    public final void rule__SetRefinement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2616:1: ( rule__SetRefinement__Group_9__0__Impl rule__SetRefinement__Group_9__1 )
            // InternalPLhlcl.g:2617:2: rule__SetRefinement__Group_9__0__Impl rule__SetRefinement__Group_9__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPLhlcl.g:2624:1: rule__SetRefinement__Group_9__0__Impl : ( ',' ) ;
    public final void rule__SetRefinement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2628:1: ( ( ',' ) )
            // InternalPLhlcl.g:2629:1: ( ',' )
            {
            // InternalPLhlcl.g:2629:1: ( ',' )
            // InternalPLhlcl.g:2630:2: ','
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
    // InternalPLhlcl.g:2639:1: rule__SetRefinement__Group_9__1 : rule__SetRefinement__Group_9__1__Impl rule__SetRefinement__Group_9__2 ;
    public final void rule__SetRefinement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2643:1: ( rule__SetRefinement__Group_9__1__Impl rule__SetRefinement__Group_9__2 )
            // InternalPLhlcl.g:2644:2: rule__SetRefinement__Group_9__1__Impl rule__SetRefinement__Group_9__2
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
    // InternalPLhlcl.g:2651:1: rule__SetRefinement__Group_9__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2655:1: ( ( '(' ) )
            // InternalPLhlcl.g:2656:1: ( '(' )
            {
            // InternalPLhlcl.g:2656:1: ( '(' )
            // InternalPLhlcl.g:2657:2: '('
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
    // InternalPLhlcl.g:2666:1: rule__SetRefinement__Group_9__2 : rule__SetRefinement__Group_9__2__Impl rule__SetRefinement__Group_9__3 ;
    public final void rule__SetRefinement__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2670:1: ( rule__SetRefinement__Group_9__2__Impl rule__SetRefinement__Group_9__3 )
            // InternalPLhlcl.g:2671:2: rule__SetRefinement__Group_9__2__Impl rule__SetRefinement__Group_9__3
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
    // InternalPLhlcl.g:2678:1: rule__SetRefinement__Group_9__2__Impl : ( ( rule__SetRefinement__TailAssignment_9_2 ) ) ;
    public final void rule__SetRefinement__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2682:1: ( ( ( rule__SetRefinement__TailAssignment_9_2 ) ) )
            // InternalPLhlcl.g:2683:1: ( ( rule__SetRefinement__TailAssignment_9_2 ) )
            {
            // InternalPLhlcl.g:2683:1: ( ( rule__SetRefinement__TailAssignment_9_2 ) )
            // InternalPLhlcl.g:2684:2: ( rule__SetRefinement__TailAssignment_9_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getTailAssignment_9_2()); 
            // InternalPLhlcl.g:2685:2: ( rule__SetRefinement__TailAssignment_9_2 )
            // InternalPLhlcl.g:2685:3: rule__SetRefinement__TailAssignment_9_2
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
    // InternalPLhlcl.g:2693:1: rule__SetRefinement__Group_9__3 : rule__SetRefinement__Group_9__3__Impl ;
    public final void rule__SetRefinement__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2697:1: ( rule__SetRefinement__Group_9__3__Impl )
            // InternalPLhlcl.g:2698:2: rule__SetRefinement__Group_9__3__Impl
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
    // InternalPLhlcl.g:2704:1: rule__SetRefinement__Group_9__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2708:1: ( ( ')' ) )
            // InternalPLhlcl.g:2709:1: ( ')' )
            {
            // InternalPLhlcl.g:2709:1: ( ')' )
            // InternalPLhlcl.g:2710:2: ')'
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
    // InternalPLhlcl.g:2720:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2724:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalPLhlcl.g:2725:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPLhlcl.g:2732:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2736:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalPLhlcl.g:2737:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalPLhlcl.g:2737:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalPLhlcl.g:2738:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalPLhlcl.g:2739:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalPLhlcl.g:2739:3: rule__Rule__ConditionAssignment_0
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
    // InternalPLhlcl.g:2747:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2751:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalPLhlcl.g:2752:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalPLhlcl.g:2759:1: rule__Rule__Group__1__Impl : ( '-->' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2763:1: ( ( '-->' ) )
            // InternalPLhlcl.g:2764:1: ( '-->' )
            {
            // InternalPLhlcl.g:2764:1: ( '-->' )
            // InternalPLhlcl.g:2765:2: '-->'
            {
             before(grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalPLhlcl.g:2774:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2778:1: ( rule__Rule__Group__2__Impl )
            // InternalPLhlcl.g:2779:2: rule__Rule__Group__2__Impl
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
    // InternalPLhlcl.g:2785:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConsequenceAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2789:1: ( ( ( rule__Rule__ConsequenceAssignment_2 ) ) )
            // InternalPLhlcl.g:2790:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            {
            // InternalPLhlcl.g:2790:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            // InternalPLhlcl.g:2791:2: ( rule__Rule__ConsequenceAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 
            // InternalPLhlcl.g:2792:2: ( rule__Rule__ConsequenceAssignment_2 )
            // InternalPLhlcl.g:2792:3: rule__Rule__ConsequenceAssignment_2
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
    // InternalPLhlcl.g:2801:1: rule__FodaUN__Group__0 : rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 ;
    public final void rule__FodaUN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2805:1: ( rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 )
            // InternalPLhlcl.g:2806:2: rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPLhlcl.g:2813:1: rule__FodaUN__Group__0__Impl : ( ( rule__FodaUN__Var1Assignment_0 ) ) ;
    public final void rule__FodaUN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2817:1: ( ( ( rule__FodaUN__Var1Assignment_0 ) ) )
            // InternalPLhlcl.g:2818:1: ( ( rule__FodaUN__Var1Assignment_0 ) )
            {
            // InternalPLhlcl.g:2818:1: ( ( rule__FodaUN__Var1Assignment_0 ) )
            // InternalPLhlcl.g:2819:2: ( rule__FodaUN__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaUNAccess().getVar1Assignment_0()); 
            // InternalPLhlcl.g:2820:2: ( rule__FodaUN__Var1Assignment_0 )
            // InternalPLhlcl.g:2820:3: rule__FodaUN__Var1Assignment_0
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
    // InternalPLhlcl.g:2828:1: rule__FodaUN__Group__1 : rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 ;
    public final void rule__FodaUN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2832:1: ( rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 )
            // InternalPLhlcl.g:2833:2: rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2
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
    // InternalPLhlcl.g:2840:1: rule__FodaUN__Group__1__Impl : ( 'is' ) ;
    public final void rule__FodaUN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2844:1: ( ( 'is' ) )
            // InternalPLhlcl.g:2845:1: ( 'is' )
            {
            // InternalPLhlcl.g:2845:1: ( 'is' )
            // InternalPLhlcl.g:2846:2: 'is'
            {
             before(grammarAccess.getFodaUNAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPLhlcl.g:2855:1: rule__FodaUN__Group__2 : rule__FodaUN__Group__2__Impl ;
    public final void rule__FodaUN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2859:1: ( rule__FodaUN__Group__2__Impl )
            // InternalPLhlcl.g:2860:2: rule__FodaUN__Group__2__Impl
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
    // InternalPLhlcl.g:2866:1: rule__FodaUN__Group__2__Impl : ( ( rule__FodaUN__OpAssignment_2 ) ) ;
    public final void rule__FodaUN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2870:1: ( ( ( rule__FodaUN__OpAssignment_2 ) ) )
            // InternalPLhlcl.g:2871:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            {
            // InternalPLhlcl.g:2871:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            // InternalPLhlcl.g:2872:2: ( rule__FodaUN__OpAssignment_2 )
            {
             before(grammarAccess.getFodaUNAccess().getOpAssignment_2()); 
            // InternalPLhlcl.g:2873:2: ( rule__FodaUN__OpAssignment_2 )
            // InternalPLhlcl.g:2873:3: rule__FodaUN__OpAssignment_2
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
    // InternalPLhlcl.g:2882:1: rule__FodaBin__Group__0 : rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 ;
    public final void rule__FodaBin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2886:1: ( rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 )
            // InternalPLhlcl.g:2887:2: rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1
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
    // InternalPLhlcl.g:2894:1: rule__FodaBin__Group__0__Impl : ( ( rule__FodaBin__Var1Assignment_0 ) ) ;
    public final void rule__FodaBin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2898:1: ( ( ( rule__FodaBin__Var1Assignment_0 ) ) )
            // InternalPLhlcl.g:2899:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            {
            // InternalPLhlcl.g:2899:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            // InternalPLhlcl.g:2900:2: ( rule__FodaBin__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaBinAccess().getVar1Assignment_0()); 
            // InternalPLhlcl.g:2901:2: ( rule__FodaBin__Var1Assignment_0 )
            // InternalPLhlcl.g:2901:3: rule__FodaBin__Var1Assignment_0
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
    // InternalPLhlcl.g:2909:1: rule__FodaBin__Group__1 : rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 ;
    public final void rule__FodaBin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2913:1: ( rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 )
            // InternalPLhlcl.g:2914:2: rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2
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
    // InternalPLhlcl.g:2921:1: rule__FodaBin__Group__1__Impl : ( ( rule__FodaBin__OpAssignment_1 ) ) ;
    public final void rule__FodaBin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2925:1: ( ( ( rule__FodaBin__OpAssignment_1 ) ) )
            // InternalPLhlcl.g:2926:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            {
            // InternalPLhlcl.g:2926:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            // InternalPLhlcl.g:2927:2: ( rule__FodaBin__OpAssignment_1 )
            {
             before(grammarAccess.getFodaBinAccess().getOpAssignment_1()); 
            // InternalPLhlcl.g:2928:2: ( rule__FodaBin__OpAssignment_1 )
            // InternalPLhlcl.g:2928:3: rule__FodaBin__OpAssignment_1
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
    // InternalPLhlcl.g:2936:1: rule__FodaBin__Group__2 : rule__FodaBin__Group__2__Impl ;
    public final void rule__FodaBin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2940:1: ( rule__FodaBin__Group__2__Impl )
            // InternalPLhlcl.g:2941:2: rule__FodaBin__Group__2__Impl
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
    // InternalPLhlcl.g:2947:1: rule__FodaBin__Group__2__Impl : ( ( rule__FodaBin__Var2Assignment_2 ) ) ;
    public final void rule__FodaBin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2951:1: ( ( ( rule__FodaBin__Var2Assignment_2 ) ) )
            // InternalPLhlcl.g:2952:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            {
            // InternalPLhlcl.g:2952:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            // InternalPLhlcl.g:2953:2: ( rule__FodaBin__Var2Assignment_2 )
            {
             before(grammarAccess.getFodaBinAccess().getVar2Assignment_2()); 
            // InternalPLhlcl.g:2954:2: ( rule__FodaBin__Var2Assignment_2 )
            // InternalPLhlcl.g:2954:3: rule__FodaBin__Var2Assignment_2
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
    // InternalPLhlcl.g:2963:1: rule__ListOfValues__Group__0 : rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 ;
    public final void rule__ListOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2967:1: ( rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 )
            // InternalPLhlcl.g:2968:2: rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1
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
    // InternalPLhlcl.g:2975:1: rule__ListOfValues__Group__0__Impl : ( ( rule__ListOfValues__ValuesAssignment_0 ) ) ;
    public final void rule__ListOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2979:1: ( ( ( rule__ListOfValues__ValuesAssignment_0 ) ) )
            // InternalPLhlcl.g:2980:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            {
            // InternalPLhlcl.g:2980:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            // InternalPLhlcl.g:2981:2: ( rule__ListOfValues__ValuesAssignment_0 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_0()); 
            // InternalPLhlcl.g:2982:2: ( rule__ListOfValues__ValuesAssignment_0 )
            // InternalPLhlcl.g:2982:3: rule__ListOfValues__ValuesAssignment_0
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
    // InternalPLhlcl.g:2990:1: rule__ListOfValues__Group__1 : rule__ListOfValues__Group__1__Impl ;
    public final void rule__ListOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2994:1: ( rule__ListOfValues__Group__1__Impl )
            // InternalPLhlcl.g:2995:2: rule__ListOfValues__Group__1__Impl
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
    // InternalPLhlcl.g:3001:1: rule__ListOfValues__Group__1__Impl : ( ( rule__ListOfValues__Group_1__0 )* ) ;
    public final void rule__ListOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3005:1: ( ( ( rule__ListOfValues__Group_1__0 )* ) )
            // InternalPLhlcl.g:3006:1: ( ( rule__ListOfValues__Group_1__0 )* )
            {
            // InternalPLhlcl.g:3006:1: ( ( rule__ListOfValues__Group_1__0 )* )
            // InternalPLhlcl.g:3007:2: ( rule__ListOfValues__Group_1__0 )*
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalPLhlcl.g:3008:2: ( rule__ListOfValues__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPLhlcl.g:3008:3: rule__ListOfValues__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalPLhlcl.g:3017:1: rule__ListOfValues__Group_1__0 : rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 ;
    public final void rule__ListOfValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3021:1: ( rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 )
            // InternalPLhlcl.g:3022:2: rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1
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
    // InternalPLhlcl.g:3029:1: rule__ListOfValues__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3033:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalPLhlcl.g:3034:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalPLhlcl.g:3034:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalPLhlcl.g:3035:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalPLhlcl.g:3035:2: ( ( ',' ) )
            // InternalPLhlcl.g:3036:3: ( ',' )
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:3037:3: ( ',' )
            // InternalPLhlcl.g:3037:4: ','
            {
            match(input,24,FOLLOW_26); 

            }

             after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 

            }

            // InternalPLhlcl.g:3040:2: ( ( ',' )* )
            // InternalPLhlcl.g:3041:3: ( ',' )*
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:3042:3: ( ',' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPLhlcl.g:3042:4: ','
            	    {
            	    match(input,24,FOLLOW_26); 

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
    // InternalPLhlcl.g:3051:1: rule__ListOfValues__Group_1__1 : rule__ListOfValues__Group_1__1__Impl ;
    public final void rule__ListOfValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3055:1: ( rule__ListOfValues__Group_1__1__Impl )
            // InternalPLhlcl.g:3056:2: rule__ListOfValues__Group_1__1__Impl
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
    // InternalPLhlcl.g:3062:1: rule__ListOfValues__Group_1__1__Impl : ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) ;
    public final void rule__ListOfValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3066:1: ( ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) )
            // InternalPLhlcl.g:3067:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            {
            // InternalPLhlcl.g:3067:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            // InternalPLhlcl.g:3068:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1()); 
            // InternalPLhlcl.g:3069:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            // InternalPLhlcl.g:3069:3: rule__ListOfValues__ValuesAssignment_1_1
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
    // InternalPLhlcl.g:3078:1: rule__ListOfIDs__Group__0 : rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 ;
    public final void rule__ListOfIDs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3082:1: ( rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 )
            // InternalPLhlcl.g:3083:2: rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1
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
    // InternalPLhlcl.g:3090:1: rule__ListOfIDs__Group__0__Impl : ( ( rule__ListOfIDs__IdsAssignment_0 ) ) ;
    public final void rule__ListOfIDs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3094:1: ( ( ( rule__ListOfIDs__IdsAssignment_0 ) ) )
            // InternalPLhlcl.g:3095:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            {
            // InternalPLhlcl.g:3095:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            // InternalPLhlcl.g:3096:2: ( rule__ListOfIDs__IdsAssignment_0 )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment_0()); 
            // InternalPLhlcl.g:3097:2: ( rule__ListOfIDs__IdsAssignment_0 )
            // InternalPLhlcl.g:3097:3: rule__ListOfIDs__IdsAssignment_0
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
    // InternalPLhlcl.g:3105:1: rule__ListOfIDs__Group__1 : rule__ListOfIDs__Group__1__Impl ;
    public final void rule__ListOfIDs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3109:1: ( rule__ListOfIDs__Group__1__Impl )
            // InternalPLhlcl.g:3110:2: rule__ListOfIDs__Group__1__Impl
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
    // InternalPLhlcl.g:3116:1: rule__ListOfIDs__Group__1__Impl : ( ( rule__ListOfIDs__Group_1__0 )* ) ;
    public final void rule__ListOfIDs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3120:1: ( ( ( rule__ListOfIDs__Group_1__0 )* ) )
            // InternalPLhlcl.g:3121:1: ( ( rule__ListOfIDs__Group_1__0 )* )
            {
            // InternalPLhlcl.g:3121:1: ( ( rule__ListOfIDs__Group_1__0 )* )
            // InternalPLhlcl.g:3122:2: ( rule__ListOfIDs__Group_1__0 )*
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalPLhlcl.g:3123:2: ( rule__ListOfIDs__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPLhlcl.g:3123:3: rule__ListOfIDs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalPLhlcl.g:3132:1: rule__ListOfIDs__Group_1__0 : rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 ;
    public final void rule__ListOfIDs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3136:1: ( rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 )
            // InternalPLhlcl.g:3137:2: rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1
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
    // InternalPLhlcl.g:3144:1: rule__ListOfIDs__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfIDs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3148:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalPLhlcl.g:3149:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalPLhlcl.g:3149:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalPLhlcl.g:3150:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalPLhlcl.g:3150:2: ( ( ',' ) )
            // InternalPLhlcl.g:3151:3: ( ',' )
            {
             before(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:3152:3: ( ',' )
            // InternalPLhlcl.g:3152:4: ','
            {
            match(input,24,FOLLOW_26); 

            }

             after(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 

            }

            // InternalPLhlcl.g:3155:2: ( ( ',' )* )
            // InternalPLhlcl.g:3156:3: ( ',' )*
            {
             before(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:3157:3: ( ',' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPLhlcl.g:3157:4: ','
            	    {
            	    match(input,24,FOLLOW_26); 

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
    // InternalPLhlcl.g:3166:1: rule__ListOfIDs__Group_1__1 : rule__ListOfIDs__Group_1__1__Impl ;
    public final void rule__ListOfIDs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3170:1: ( rule__ListOfIDs__Group_1__1__Impl )
            // InternalPLhlcl.g:3171:2: rule__ListOfIDs__Group_1__1__Impl
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
    // InternalPLhlcl.g:3177:1: rule__ListOfIDs__Group_1__1__Impl : ( ( rule__ListOfIDs__IdsAssignment_1_1 ) ) ;
    public final void rule__ListOfIDs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3181:1: ( ( ( rule__ListOfIDs__IdsAssignment_1_1 ) ) )
            // InternalPLhlcl.g:3182:1: ( ( rule__ListOfIDs__IdsAssignment_1_1 ) )
            {
            // InternalPLhlcl.g:3182:1: ( ( rule__ListOfIDs__IdsAssignment_1_1 ) )
            // InternalPLhlcl.g:3183:2: ( rule__ListOfIDs__IdsAssignment_1_1 )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment_1_1()); 
            // InternalPLhlcl.g:3184:2: ( rule__ListOfIDs__IdsAssignment_1_1 )
            // InternalPLhlcl.g:3184:3: rule__ListOfIDs__IdsAssignment_1_1
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
    // InternalPLhlcl.g:3193:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3197:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3198:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3198:2: ( RULE_ID )
            // InternalPLhlcl.g:3199:3: RULE_ID
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
    // InternalPLhlcl.g:3208:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3212:1: ( ( ruleVarDeclaration ) )
            // InternalPLhlcl.g:3213:2: ( ruleVarDeclaration )
            {
            // InternalPLhlcl.g:3213:2: ( ruleVarDeclaration )
            // InternalPLhlcl.g:3214:3: ruleVarDeclaration
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
    // InternalPLhlcl.g:3223:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3227:1: ( ( ruleConstraint ) )
            // InternalPLhlcl.g:3228:2: ( ruleConstraint )
            {
            // InternalPLhlcl.g:3228:2: ( ruleConstraint )
            // InternalPLhlcl.g:3229:3: ruleConstraint
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
    // InternalPLhlcl.g:3238:1: rule__VarDeclaration__InstantiableAssignment_0_0 : ( ( 'instantiable' ) ) ;
    public final void rule__VarDeclaration__InstantiableAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3242:1: ( ( ( 'instantiable' ) ) )
            // InternalPLhlcl.g:3243:2: ( ( 'instantiable' ) )
            {
            // InternalPLhlcl.g:3243:2: ( ( 'instantiable' ) )
            // InternalPLhlcl.g:3244:3: ( 'instantiable' )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 
            // InternalPLhlcl.g:3245:3: ( 'instantiable' )
            // InternalPLhlcl.g:3246:4: 'instantiable'
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalPLhlcl.g:3257:1: rule__VarDeclaration__MinAssignment_0_2 : ( ruleNumber ) ;
    public final void rule__VarDeclaration__MinAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3261:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3262:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3262:2: ( ruleNumber )
            // InternalPLhlcl.g:3263:3: ruleNumber
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
    // InternalPLhlcl.g:3272:1: rule__VarDeclaration__MaxAssignment_0_4 : ( ruleNumber ) ;
    public final void rule__VarDeclaration__MaxAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3276:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3277:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3277:2: ( ruleNumber )
            // InternalPLhlcl.g:3278:3: ruleNumber
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
    // InternalPLhlcl.g:3287:1: rule__VarDeclaration__TypeAssignment_1 : ( ruleVarType ) ;
    public final void rule__VarDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3291:1: ( ( ruleVarType ) )
            // InternalPLhlcl.g:3292:2: ( ruleVarType )
            {
            // InternalPLhlcl.g:3292:2: ( ruleVarType )
            // InternalPLhlcl.g:3293:3: ruleVarType
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
    // InternalPLhlcl.g:3302:1: rule__VarDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3306:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3307:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3307:2: ( RULE_ID )
            // InternalPLhlcl.g:3308:3: RULE_ID
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
    // InternalPLhlcl.g:3317:1: rule__VarDeclaration__VariantsAssignment_3_1 : ( ruleVariantDeclaration ) ;
    public final void rule__VarDeclaration__VariantsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3321:1: ( ( ruleVariantDeclaration ) )
            // InternalPLhlcl.g:3322:2: ( ruleVariantDeclaration )
            {
            // InternalPLhlcl.g:3322:2: ( ruleVariantDeclaration )
            // InternalPLhlcl.g:3323:3: ruleVariantDeclaration
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
    // InternalPLhlcl.g:3332:1: rule__VariantsInterval__StartAssignment_0 : ( ruleNumber ) ;
    public final void rule__VariantsInterval__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3336:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3337:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3337:2: ( ruleNumber )
            // InternalPLhlcl.g:3338:3: ruleNumber
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
    // InternalPLhlcl.g:3347:1: rule__VariantsInterval__EndAssignment_2 : ( ruleNumber ) ;
    public final void rule__VariantsInterval__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3351:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3352:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3352:2: ( ruleNumber )
            // InternalPLhlcl.g:3353:3: ruleNumber
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
    // InternalPLhlcl.g:3362:1: rule__VariantsEnumeration__ListAssignment_1 : ( ruleListOfValues ) ;
    public final void rule__VariantsEnumeration__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3366:1: ( ( ruleListOfValues ) )
            // InternalPLhlcl.g:3367:2: ( ruleListOfValues )
            {
            // InternalPLhlcl.g:3367:2: ( ruleListOfValues )
            // InternalPLhlcl.g:3368:3: ruleListOfValues
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
    // InternalPLhlcl.g:3377:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3381:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3382:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3382:2: ( RULE_ID )
            // InternalPLhlcl.g:3383:3: RULE_ID
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
    // InternalPLhlcl.g:3392:1: rule__Constraint__ExpAssignment_2 : ( ruleConsExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3396:1: ( ( ruleConsExpression ) )
            // InternalPLhlcl.g:3397:2: ( ruleConsExpression )
            {
            // InternalPLhlcl.g:3397:2: ( ruleConsExpression )
            // InternalPLhlcl.g:3398:3: ruleConsExpression
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
    // InternalPLhlcl.g:3407:1: rule__IDCons__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDCons__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3411:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3412:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3412:2: ( RULE_ID )
            // InternalPLhlcl.g:3413:3: RULE_ID
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
    // InternalPLhlcl.g:3422:1: rule__Structural__ParentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Structural__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3426:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3427:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3427:2: ( RULE_ID )
            // InternalPLhlcl.g:3428:3: RULE_ID
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
    // InternalPLhlcl.g:3437:1: rule__Structural__GroupAssignment_4 : ( ruleListOfIDs ) ;
    public final void rule__Structural__GroupAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3441:1: ( ( ruleListOfIDs ) )
            // InternalPLhlcl.g:3442:2: ( ruleListOfIDs )
            {
            // InternalPLhlcl.g:3442:2: ( ruleListOfIDs )
            // InternalPLhlcl.g:3443:3: ruleListOfIDs
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
    // InternalPLhlcl.g:3452:1: rule__Structural__MinAssignment_6_2 : ( ruleNumber ) ;
    public final void rule__Structural__MinAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3456:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3457:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3457:2: ( ruleNumber )
            // InternalPLhlcl.g:3458:3: ruleNumber
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
    // InternalPLhlcl.g:3467:1: rule__Structural__MaxAssignment_6_4 : ( ruleNumber ) ;
    public final void rule__Structural__MaxAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3471:1: ( ( ruleNumber ) )
            // InternalPLhlcl.g:3472:2: ( ruleNumber )
            {
            // InternalPLhlcl.g:3472:2: ( ruleNumber )
            // InternalPLhlcl.g:3473:3: ruleNumber
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


    // $ANTLR start "rule__Assignment__VarAssignment_0"
    // InternalPLhlcl.g:3482:1: rule__Assignment__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3486:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3487:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3487:2: ( RULE_ID )
            // InternalPLhlcl.g:3488:3: RULE_ID
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
    // InternalPLhlcl.g:3497:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3501:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3502:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3502:2: ( ruleValue )
            // InternalPLhlcl.g:3503:3: ruleValue
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
    // InternalPLhlcl.g:3512:1: rule__VarRefinement__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3516:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3517:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3517:2: ( RULE_ID )
            // InternalPLhlcl.g:3518:3: RULE_ID
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
    // InternalPLhlcl.g:3527:1: rule__VarRefinement__ValuesAssignment_2 : ( ruleVariantDeclaration ) ;
    public final void rule__VarRefinement__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3531:1: ( ( ruleVariantDeclaration ) )
            // InternalPLhlcl.g:3532:2: ( ruleVariantDeclaration )
            {
            // InternalPLhlcl.g:3532:2: ( ruleVariantDeclaration )
            // InternalPLhlcl.g:3533:3: ruleVariantDeclaration
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
    // InternalPLhlcl.g:3542:1: rule__SetRefinement__VarsAssignment_2 : ( ruleListOfIDs ) ;
    public final void rule__SetRefinement__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3546:1: ( ( ruleListOfIDs ) )
            // InternalPLhlcl.g:3547:2: ( ruleListOfIDs )
            {
            // InternalPLhlcl.g:3547:2: ( ruleListOfIDs )
            // InternalPLhlcl.g:3548:3: ruleListOfIDs
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
    // InternalPLhlcl.g:3557:1: rule__SetRefinement__HeadAssignment_7 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__HeadAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3561:1: ( ( ruleListOfValues ) )
            // InternalPLhlcl.g:3562:2: ( ruleListOfValues )
            {
            // InternalPLhlcl.g:3562:2: ( ruleListOfValues )
            // InternalPLhlcl.g:3563:3: ruleListOfValues
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
    // InternalPLhlcl.g:3572:1: rule__SetRefinement__TailAssignment_9_2 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__TailAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3576:1: ( ( ruleListOfValues ) )
            // InternalPLhlcl.g:3577:2: ( ruleListOfValues )
            {
            // InternalPLhlcl.g:3577:2: ( ruleListOfValues )
            // InternalPLhlcl.g:3578:3: ruleListOfValues
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
    // InternalPLhlcl.g:3587:1: rule__Rule__ConditionAssignment_0 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3591:1: ( ( ruleTerminalExp ) )
            // InternalPLhlcl.g:3592:2: ( ruleTerminalExp )
            {
            // InternalPLhlcl.g:3592:2: ( ruleTerminalExp )
            // InternalPLhlcl.g:3593:3: ruleTerminalExp
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
    // InternalPLhlcl.g:3602:1: rule__Rule__ConsequenceAssignment_2 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConsequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3606:1: ( ( ruleTerminalExp ) )
            // InternalPLhlcl.g:3607:2: ( ruleTerminalExp )
            {
            // InternalPLhlcl.g:3607:2: ( ruleTerminalExp )
            // InternalPLhlcl.g:3608:3: ruleTerminalExp
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
    // InternalPLhlcl.g:3617:1: rule__FodaUN__Var1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FodaUN__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3621:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3622:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3622:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3623:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaUNAccess().getVar1VarDeclarationCrossReference_0_0()); 
            // InternalPLhlcl.g:3624:3: ( RULE_ID )
            // InternalPLhlcl.g:3625:4: RULE_ID
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
    // InternalPLhlcl.g:3636:1: rule__FodaUN__OpAssignment_2 : ( ruleUnaryOp ) ;
    public final void rule__FodaUN__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3640:1: ( ( ruleUnaryOp ) )
            // InternalPLhlcl.g:3641:2: ( ruleUnaryOp )
            {
            // InternalPLhlcl.g:3641:2: ( ruleUnaryOp )
            // InternalPLhlcl.g:3642:3: ruleUnaryOp
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
    // InternalPLhlcl.g:3651:1: rule__FodaBin__Var1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FodaBin__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3655:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3656:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3656:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3657:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaBinAccess().getVar1VarDeclarationCrossReference_0_0()); 
            // InternalPLhlcl.g:3658:3: ( RULE_ID )
            // InternalPLhlcl.g:3659:4: RULE_ID
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
    // InternalPLhlcl.g:3670:1: rule__FodaBin__OpAssignment_1 : ( ruleBinOp ) ;
    public final void rule__FodaBin__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3674:1: ( ( ruleBinOp ) )
            // InternalPLhlcl.g:3675:2: ( ruleBinOp )
            {
            // InternalPLhlcl.g:3675:2: ( ruleBinOp )
            // InternalPLhlcl.g:3676:3: ruleBinOp
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
    // InternalPLhlcl.g:3685:1: rule__FodaBin__Var2Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FodaBin__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3689:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3690:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3690:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3691:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaBinAccess().getVar2VarDeclarationCrossReference_2_0()); 
            // InternalPLhlcl.g:3692:3: ( RULE_ID )
            // InternalPLhlcl.g:3693:4: RULE_ID
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
    // InternalPLhlcl.g:3704:1: rule__BoolVal__ValueAssignment : ( ( rule__BoolVal__ValueAlternatives_0 ) ) ;
    public final void rule__BoolVal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3708:1: ( ( ( rule__BoolVal__ValueAlternatives_0 ) ) )
            // InternalPLhlcl.g:3709:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            {
            // InternalPLhlcl.g:3709:2: ( ( rule__BoolVal__ValueAlternatives_0 ) )
            // InternalPLhlcl.g:3710:3: ( rule__BoolVal__ValueAlternatives_0 )
            {
             before(grammarAccess.getBoolValAccess().getValueAlternatives_0()); 
            // InternalPLhlcl.g:3711:3: ( rule__BoolVal__ValueAlternatives_0 )
            // InternalPLhlcl.g:3711:4: rule__BoolVal__ValueAlternatives_0
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
    // InternalPLhlcl.g:3719:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3723:1: ( ( RULE_INT ) )
            // InternalPLhlcl.g:3724:2: ( RULE_INT )
            {
            // InternalPLhlcl.g:3724:2: ( RULE_INT )
            // InternalPLhlcl.g:3725:3: RULE_INT
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
    // InternalPLhlcl.g:3734:1: rule__Symbol__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Symbol__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3738:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3739:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3739:2: ( RULE_ID )
            // InternalPLhlcl.g:3740:3: RULE_ID
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
    // InternalPLhlcl.g:3749:1: rule__ListOfValues__ValuesAssignment_0 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3753:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3754:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3754:2: ( ruleValue )
            // InternalPLhlcl.g:3755:3: ruleValue
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
    // InternalPLhlcl.g:3764:1: rule__ListOfValues__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3768:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3769:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3769:2: ( ruleValue )
            // InternalPLhlcl.g:3770:3: ruleValue
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
    // InternalPLhlcl.g:3779:1: rule__ListOfIDs__IdsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListOfIDs__IdsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3783:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3784:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3784:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3785:3: ( RULE_ID )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_0_0()); 
            // InternalPLhlcl.g:3786:3: ( RULE_ID )
            // InternalPLhlcl.g:3787:4: RULE_ID
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
    // InternalPLhlcl.g:3798:1: rule__ListOfIDs__IdsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListOfIDs__IdsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3802:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3803:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3803:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3804:3: ( RULE_ID )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_1_1_0()); 
            // InternalPLhlcl.g:3805:3: ( RULE_ID )
            // InternalPLhlcl.g:3806:4: RULE_ID
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000800040E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000800000E002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000800000E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000010A0000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000F0000L});

}