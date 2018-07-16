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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'selected'", "'unselected'", "'boolean'", "'integer'", "'requires'", "'excludes'", "'optional'", "'mandatory'", "'model'", "'variables:'", "'constraints:'", "'variants:'", "'['", "','", "']'", "'..'", "':'", "'('", "')'", "'is'", "'in'", "'vars:'", "'variants'", "'-->'", "'structural:'", "'card:'", "'instantiable'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleRefinement"
    // InternalPLhlcl.g:278:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalPLhlcl.g:279:1: ( ruleRefinement EOF )
            // InternalPLhlcl.g:280:1: ruleRefinement EOF
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
    // InternalPLhlcl.g:287:1: ruleRefinement : ( ( rule__Refinement__Alternatives ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:291:2: ( ( ( rule__Refinement__Alternatives ) ) )
            // InternalPLhlcl.g:292:2: ( ( rule__Refinement__Alternatives ) )
            {
            // InternalPLhlcl.g:292:2: ( ( rule__Refinement__Alternatives ) )
            // InternalPLhlcl.g:293:3: ( rule__Refinement__Alternatives )
            {
             before(grammarAccess.getRefinementAccess().getAlternatives()); 
            // InternalPLhlcl.g:294:3: ( rule__Refinement__Alternatives )
            // InternalPLhlcl.g:294:4: rule__Refinement__Alternatives
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
    // InternalPLhlcl.g:303:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPLhlcl.g:304:1: ( ruleAssignment EOF )
            // InternalPLhlcl.g:305:1: ruleAssignment EOF
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
    // InternalPLhlcl.g:312:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:316:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalPLhlcl.g:317:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalPLhlcl.g:317:2: ( ( rule__Assignment__Group__0 ) )
            // InternalPLhlcl.g:318:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalPLhlcl.g:319:3: ( rule__Assignment__Group__0 )
            // InternalPLhlcl.g:319:4: rule__Assignment__Group__0
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
    // InternalPLhlcl.g:328:1: entryRuleVarRefinement : ruleVarRefinement EOF ;
    public final void entryRuleVarRefinement() throws RecognitionException {
        try {
            // InternalPLhlcl.g:329:1: ( ruleVarRefinement EOF )
            // InternalPLhlcl.g:330:1: ruleVarRefinement EOF
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
    // InternalPLhlcl.g:337:1: ruleVarRefinement : ( ( rule__VarRefinement__Group__0 ) ) ;
    public final void ruleVarRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:341:2: ( ( ( rule__VarRefinement__Group__0 ) ) )
            // InternalPLhlcl.g:342:2: ( ( rule__VarRefinement__Group__0 ) )
            {
            // InternalPLhlcl.g:342:2: ( ( rule__VarRefinement__Group__0 ) )
            // InternalPLhlcl.g:343:3: ( rule__VarRefinement__Group__0 )
            {
             before(grammarAccess.getVarRefinementAccess().getGroup()); 
            // InternalPLhlcl.g:344:3: ( rule__VarRefinement__Group__0 )
            // InternalPLhlcl.g:344:4: rule__VarRefinement__Group__0
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
    // InternalPLhlcl.g:353:1: entryRuleSetRefinement : ruleSetRefinement EOF ;
    public final void entryRuleSetRefinement() throws RecognitionException {
        try {
            // InternalPLhlcl.g:354:1: ( ruleSetRefinement EOF )
            // InternalPLhlcl.g:355:1: ruleSetRefinement EOF
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
    // InternalPLhlcl.g:362:1: ruleSetRefinement : ( ( rule__SetRefinement__Group__0 ) ) ;
    public final void ruleSetRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:366:2: ( ( ( rule__SetRefinement__Group__0 ) ) )
            // InternalPLhlcl.g:367:2: ( ( rule__SetRefinement__Group__0 ) )
            {
            // InternalPLhlcl.g:367:2: ( ( rule__SetRefinement__Group__0 ) )
            // InternalPLhlcl.g:368:3: ( rule__SetRefinement__Group__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup()); 
            // InternalPLhlcl.g:369:3: ( rule__SetRefinement__Group__0 )
            // InternalPLhlcl.g:369:4: rule__SetRefinement__Group__0
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
    // InternalPLhlcl.g:378:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalPLhlcl.g:379:1: ( ruleRule EOF )
            // InternalPLhlcl.g:380:1: ruleRule EOF
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
    // InternalPLhlcl.g:387:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:391:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalPLhlcl.g:392:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalPLhlcl.g:392:2: ( ( rule__Rule__Group__0 ) )
            // InternalPLhlcl.g:393:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalPLhlcl.g:394:3: ( rule__Rule__Group__0 )
            // InternalPLhlcl.g:394:4: rule__Rule__Group__0
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
    // InternalPLhlcl.g:403:1: entryRuleFodaUN : ruleFodaUN EOF ;
    public final void entryRuleFodaUN() throws RecognitionException {
        try {
            // InternalPLhlcl.g:404:1: ( ruleFodaUN EOF )
            // InternalPLhlcl.g:405:1: ruleFodaUN EOF
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
    // InternalPLhlcl.g:412:1: ruleFodaUN : ( ( rule__FodaUN__Group__0 ) ) ;
    public final void ruleFodaUN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:416:2: ( ( ( rule__FodaUN__Group__0 ) ) )
            // InternalPLhlcl.g:417:2: ( ( rule__FodaUN__Group__0 ) )
            {
            // InternalPLhlcl.g:417:2: ( ( rule__FodaUN__Group__0 ) )
            // InternalPLhlcl.g:418:3: ( rule__FodaUN__Group__0 )
            {
             before(grammarAccess.getFodaUNAccess().getGroup()); 
            // InternalPLhlcl.g:419:3: ( rule__FodaUN__Group__0 )
            // InternalPLhlcl.g:419:4: rule__FodaUN__Group__0
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
    // InternalPLhlcl.g:428:1: entryRuleFodaBin : ruleFodaBin EOF ;
    public final void entryRuleFodaBin() throws RecognitionException {
        try {
            // InternalPLhlcl.g:429:1: ( ruleFodaBin EOF )
            // InternalPLhlcl.g:430:1: ruleFodaBin EOF
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
    // InternalPLhlcl.g:437:1: ruleFodaBin : ( ( rule__FodaBin__Group__0 ) ) ;
    public final void ruleFodaBin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:441:2: ( ( ( rule__FodaBin__Group__0 ) ) )
            // InternalPLhlcl.g:442:2: ( ( rule__FodaBin__Group__0 ) )
            {
            // InternalPLhlcl.g:442:2: ( ( rule__FodaBin__Group__0 ) )
            // InternalPLhlcl.g:443:3: ( rule__FodaBin__Group__0 )
            {
             before(grammarAccess.getFodaBinAccess().getGroup()); 
            // InternalPLhlcl.g:444:3: ( rule__FodaBin__Group__0 )
            // InternalPLhlcl.g:444:4: rule__FodaBin__Group__0
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


    // $ANTLR start "entryRuleStructural"
    // InternalPLhlcl.g:453:1: entryRuleStructural : ruleStructural EOF ;
    public final void entryRuleStructural() throws RecognitionException {
        try {
            // InternalPLhlcl.g:454:1: ( ruleStructural EOF )
            // InternalPLhlcl.g:455:1: ruleStructural EOF
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
    // InternalPLhlcl.g:462:1: ruleStructural : ( ( rule__Structural__Group__0 ) ) ;
    public final void ruleStructural() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:466:2: ( ( ( rule__Structural__Group__0 ) ) )
            // InternalPLhlcl.g:467:2: ( ( rule__Structural__Group__0 ) )
            {
            // InternalPLhlcl.g:467:2: ( ( rule__Structural__Group__0 ) )
            // InternalPLhlcl.g:468:3: ( rule__Structural__Group__0 )
            {
             before(grammarAccess.getStructuralAccess().getGroup()); 
            // InternalPLhlcl.g:469:3: ( rule__Structural__Group__0 )
            // InternalPLhlcl.g:469:4: rule__Structural__Group__0
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


    // $ANTLR start "entryRuleValue"
    // InternalPLhlcl.g:478:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalPLhlcl.g:479:1: ( ruleValue EOF )
            // InternalPLhlcl.g:480:1: ruleValue EOF
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
    // InternalPLhlcl.g:487:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:491:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalPLhlcl.g:492:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalPLhlcl.g:492:2: ( ( rule__Value__Alternatives ) )
            // InternalPLhlcl.g:493:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalPLhlcl.g:494:3: ( rule__Value__Alternatives )
            // InternalPLhlcl.g:494:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleVarType"
    // InternalPLhlcl.g:503:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalPLhlcl.g:504:1: ( ruleVarType EOF )
            // InternalPLhlcl.g:505:1: ruleVarType EOF
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
    // InternalPLhlcl.g:512:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:516:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalPLhlcl.g:517:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalPLhlcl.g:517:2: ( ( rule__VarType__Alternatives ) )
            // InternalPLhlcl.g:518:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalPLhlcl.g:519:3: ( rule__VarType__Alternatives )
            // InternalPLhlcl.g:519:4: rule__VarType__Alternatives
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
    // InternalPLhlcl.g:528:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalPLhlcl.g:529:1: ( ruleListOfValues EOF )
            // InternalPLhlcl.g:530:1: ruleListOfValues EOF
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
    // InternalPLhlcl.g:537:1: ruleListOfValues : ( ( rule__ListOfValues__Group__0 ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:541:2: ( ( ( rule__ListOfValues__Group__0 ) ) )
            // InternalPLhlcl.g:542:2: ( ( rule__ListOfValues__Group__0 ) )
            {
            // InternalPLhlcl.g:542:2: ( ( rule__ListOfValues__Group__0 ) )
            // InternalPLhlcl.g:543:3: ( rule__ListOfValues__Group__0 )
            {
             before(grammarAccess.getListOfValuesAccess().getGroup()); 
            // InternalPLhlcl.g:544:3: ( rule__ListOfValues__Group__0 )
            // InternalPLhlcl.g:544:4: rule__ListOfValues__Group__0
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
    // InternalPLhlcl.g:553:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalPLhlcl.g:554:1: ( ruleListOfIDs EOF )
            // InternalPLhlcl.g:555:1: ruleListOfIDs EOF
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
    // InternalPLhlcl.g:562:1: ruleListOfIDs : ( ( rule__ListOfIDs__Group__0 ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:566:2: ( ( ( rule__ListOfIDs__Group__0 ) ) )
            // InternalPLhlcl.g:567:2: ( ( rule__ListOfIDs__Group__0 ) )
            {
            // InternalPLhlcl.g:567:2: ( ( rule__ListOfIDs__Group__0 ) )
            // InternalPLhlcl.g:568:3: ( rule__ListOfIDs__Group__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup()); 
            // InternalPLhlcl.g:569:3: ( rule__ListOfIDs__Group__0 )
            // InternalPLhlcl.g:569:4: rule__ListOfIDs__Group__0
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
    // InternalPLhlcl.g:578:1: entryRuleBinOp : ruleBinOp EOF ;
    public final void entryRuleBinOp() throws RecognitionException {
        try {
            // InternalPLhlcl.g:579:1: ( ruleBinOp EOF )
            // InternalPLhlcl.g:580:1: ruleBinOp EOF
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
    // InternalPLhlcl.g:587:1: ruleBinOp : ( ( rule__BinOp__Alternatives ) ) ;
    public final void ruleBinOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:591:2: ( ( ( rule__BinOp__Alternatives ) ) )
            // InternalPLhlcl.g:592:2: ( ( rule__BinOp__Alternatives ) )
            {
            // InternalPLhlcl.g:592:2: ( ( rule__BinOp__Alternatives ) )
            // InternalPLhlcl.g:593:3: ( rule__BinOp__Alternatives )
            {
             before(grammarAccess.getBinOpAccess().getAlternatives()); 
            // InternalPLhlcl.g:594:3: ( rule__BinOp__Alternatives )
            // InternalPLhlcl.g:594:4: rule__BinOp__Alternatives
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
    // InternalPLhlcl.g:603:1: entryRuleUnaryOp : ruleUnaryOp EOF ;
    public final void entryRuleUnaryOp() throws RecognitionException {
        try {
            // InternalPLhlcl.g:604:1: ( ruleUnaryOp EOF )
            // InternalPLhlcl.g:605:1: ruleUnaryOp EOF
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
    // InternalPLhlcl.g:612:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:616:2: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // InternalPLhlcl.g:617:2: ( ( rule__UnaryOp__Alternatives ) )
            {
            // InternalPLhlcl.g:617:2: ( ( rule__UnaryOp__Alternatives ) )
            // InternalPLhlcl.g:618:3: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // InternalPLhlcl.g:619:3: ( rule__UnaryOp__Alternatives )
            // InternalPLhlcl.g:619:4: rule__UnaryOp__Alternatives
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
    // InternalPLhlcl.g:627:1: rule__VariantDeclaration__Alternatives : ( ( ruleVariantsInterval ) | ( ruleVariantsEnumeration ) );
    public final void rule__VariantDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:631:1: ( ( ruleVariantsInterval ) | ( ruleVariantsEnumeration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT||(LA1_0>=11 && LA1_0<=12)) ) {
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
                    // InternalPLhlcl.g:632:2: ( ruleVariantsInterval )
                    {
                    // InternalPLhlcl.g:632:2: ( ruleVariantsInterval )
                    // InternalPLhlcl.g:633:3: ruleVariantsInterval
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
                    // InternalPLhlcl.g:638:2: ( ruleVariantsEnumeration )
                    {
                    // InternalPLhlcl.g:638:2: ( ruleVariantsEnumeration )
                    // InternalPLhlcl.g:639:3: ruleVariantsEnumeration
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
    // InternalPLhlcl.g:648:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) );
    public final void rule__ConsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:652:1: ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleStructural ) | ( ruleFodaUN ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==RULE_INT||(LA2_5>=11 && LA2_5<=12)) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_5>=17 && LA2_5<=18)) ) {
                        alt2=6;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    {
                    alt2=4;
                    }
                    break;
                case 31:
                    {
                    alt2=2;
                    }
                    break;
                case 34:
                    {
                    alt2=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 29:
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
            case 32:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 35:
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
                    // InternalPLhlcl.g:653:2: ( ruleIDCons )
                    {
                    // InternalPLhlcl.g:653:2: ( ruleIDCons )
                    // InternalPLhlcl.g:654:3: ruleIDCons
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
                    // InternalPLhlcl.g:659:2: ( ruleRefinement )
                    {
                    // InternalPLhlcl.g:659:2: ( ruleRefinement )
                    // InternalPLhlcl.g:660:3: ruleRefinement
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
                    // InternalPLhlcl.g:665:2: ( ruleRule )
                    {
                    // InternalPLhlcl.g:665:2: ( ruleRule )
                    // InternalPLhlcl.g:666:3: ruleRule
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
                    // InternalPLhlcl.g:671:2: ( ruleFodaBin )
                    {
                    // InternalPLhlcl.g:671:2: ( ruleFodaBin )
                    // InternalPLhlcl.g:672:3: ruleFodaBin
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
                    // InternalPLhlcl.g:677:2: ( ruleStructural )
                    {
                    // InternalPLhlcl.g:677:2: ( ruleStructural )
                    // InternalPLhlcl.g:678:3: ruleStructural
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
                    // InternalPLhlcl.g:683:2: ( ruleFodaUN )
                    {
                    // InternalPLhlcl.g:683:2: ( ruleFodaUN )
                    // InternalPLhlcl.g:684:3: ruleFodaUN
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
    // InternalPLhlcl.g:693:1: rule__TerminalExp__Alternatives : ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) );
    public final void rule__TerminalExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:697:1: ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
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
                    // InternalPLhlcl.g:698:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    {
                    // InternalPLhlcl.g:698:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    // InternalPLhlcl.g:699:3: ( rule__TerminalExp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpAccess().getGroup_0()); 
                    // InternalPLhlcl.g:700:3: ( rule__TerminalExp__Group_0__0 )
                    // InternalPLhlcl.g:700:4: rule__TerminalExp__Group_0__0
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
                    // InternalPLhlcl.g:704:2: ( ruleIDCons )
                    {
                    // InternalPLhlcl.g:704:2: ( ruleIDCons )
                    // InternalPLhlcl.g:705:3: ruleIDCons
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
    // InternalPLhlcl.g:714:1: rule__Refinement__Alternatives : ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) );
    public final void rule__Refinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:718:1: ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==31) ) {
                    alt4=2;
                }
                else if ( (LA4_1==30) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==32) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPLhlcl.g:719:2: ( ruleAssignment )
                    {
                    // InternalPLhlcl.g:719:2: ( ruleAssignment )
                    // InternalPLhlcl.g:720:3: ruleAssignment
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
                    // InternalPLhlcl.g:725:2: ( ruleVarRefinement )
                    {
                    // InternalPLhlcl.g:725:2: ( ruleVarRefinement )
                    // InternalPLhlcl.g:726:3: ruleVarRefinement
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
                    // InternalPLhlcl.g:731:2: ( ruleSetRefinement )
                    {
                    // InternalPLhlcl.g:731:2: ( ruleSetRefinement )
                    // InternalPLhlcl.g:732:3: ruleSetRefinement
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


    // $ANTLR start "rule__Value__Alternatives"
    // InternalPLhlcl.g:741:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:745:1: ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case 11:
                {
                alt5=2;
                }
                break;
            case 12:
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
                    // InternalPLhlcl.g:746:2: ( RULE_INT )
                    {
                    // InternalPLhlcl.g:746:2: ( RULE_INT )
                    // InternalPLhlcl.g:747:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:752:2: ( 'selected' )
                    {
                    // InternalPLhlcl.g:752:2: ( 'selected' )
                    // InternalPLhlcl.g:753:3: 'selected'
                    {
                     before(grammarAccess.getValueAccess().getSelectedKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSelectedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:758:2: ( 'unselected' )
                    {
                    // InternalPLhlcl.g:758:2: ( 'unselected' )
                    // InternalPLhlcl.g:759:3: 'unselected'
                    {
                     before(grammarAccess.getValueAccess().getUnselectedKeyword_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getUnselectedKeyword_2()); 

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


    // $ANTLR start "rule__VarType__Alternatives"
    // InternalPLhlcl.g:768:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'integer' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:772:1: ( ( 'boolean' ) | ( 'integer' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPLhlcl.g:773:2: ( 'boolean' )
                    {
                    // InternalPLhlcl.g:773:2: ( 'boolean' )
                    // InternalPLhlcl.g:774:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:779:2: ( 'integer' )
                    {
                    // InternalPLhlcl.g:779:2: ( 'integer' )
                    // InternalPLhlcl.g:780:3: 'integer'
                    {
                     before(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getIntegerKeyword_1()); 

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
    // InternalPLhlcl.g:789:1: rule__BinOp__Alternatives : ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__BinOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:793:1: ( ( 'requires' ) | ( 'excludes' ) | ( 'optional' ) | ( 'mandatory' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPLhlcl.g:794:2: ( 'requires' )
                    {
                    // InternalPLhlcl.g:794:2: ( 'requires' )
                    // InternalPLhlcl.g:795:3: 'requires'
                    {
                     before(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:800:2: ( 'excludes' )
                    {
                    // InternalPLhlcl.g:800:2: ( 'excludes' )
                    // InternalPLhlcl.g:801:3: 'excludes'
                    {
                     before(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPLhlcl.g:806:2: ( 'optional' )
                    {
                    // InternalPLhlcl.g:806:2: ( 'optional' )
                    // InternalPLhlcl.g:807:3: 'optional'
                    {
                     before(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getOptionalKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPLhlcl.g:812:2: ( 'mandatory' )
                    {
                    // InternalPLhlcl.g:812:2: ( 'mandatory' )
                    // InternalPLhlcl.g:813:3: 'mandatory'
                    {
                     before(grammarAccess.getBinOpAccess().getMandatoryKeyword_3()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalPLhlcl.g:822:1: rule__UnaryOp__Alternatives : ( ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:826:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPLhlcl.g:827:2: ( 'optional' )
                    {
                    // InternalPLhlcl.g:827:2: ( 'optional' )
                    // InternalPLhlcl.g:828:3: 'optional'
                    {
                     before(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPLhlcl.g:833:2: ( 'mandatory' )
                    {
                    // InternalPLhlcl.g:833:2: ( 'mandatory' )
                    // InternalPLhlcl.g:834:3: 'mandatory'
                    {
                     before(grammarAccess.getUnaryOpAccess().getMandatoryKeyword_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalPLhlcl.g:843:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:847:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPLhlcl.g:848:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPLhlcl.g:855:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:859:1: ( ( 'model' ) )
            // InternalPLhlcl.g:860:1: ( 'model' )
            {
            // InternalPLhlcl.g:860:1: ( 'model' )
            // InternalPLhlcl.g:861:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPLhlcl.g:870:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:874:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPLhlcl.g:875:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalPLhlcl.g:882:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:886:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalPLhlcl.g:887:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalPLhlcl.g:887:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalPLhlcl.g:888:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalPLhlcl.g:889:2: ( rule__Model__NameAssignment_1 )
            // InternalPLhlcl.g:889:3: rule__Model__NameAssignment_1
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
    // InternalPLhlcl.g:897:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:901:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPLhlcl.g:902:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalPLhlcl.g:909:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:913:1: ( ( 'variables:' ) )
            // InternalPLhlcl.g:914:1: ( 'variables:' )
            {
            // InternalPLhlcl.g:914:1: ( 'variables:' )
            // InternalPLhlcl.g:915:2: 'variables:'
            {
             before(grammarAccess.getModelAccess().getVariablesKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalPLhlcl.g:924:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:928:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalPLhlcl.g:929:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalPLhlcl.g:936:1: rule__Model__Group__3__Impl : ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:940:1: ( ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) )
            // InternalPLhlcl.g:941:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            {
            // InternalPLhlcl.g:941:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalPLhlcl.g:942:2: ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalPLhlcl.g:942:2: ( ( rule__Model__VarsAssignment_3 ) )
            // InternalPLhlcl.g:943:3: ( rule__Model__VarsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalPLhlcl.g:944:3: ( rule__Model__VarsAssignment_3 )
            // InternalPLhlcl.g:944:4: rule__Model__VarsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Model__VarsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

            }

            // InternalPLhlcl.g:947:2: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalPLhlcl.g:948:3: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalPLhlcl.g:949:3: ( rule__Model__VarsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=14)||LA9_0==23||LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPLhlcl.g:949:4: rule__Model__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__VarsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

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
    // InternalPLhlcl.g:958:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:962:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalPLhlcl.g:963:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalPLhlcl.g:970:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:974:1: ( ( 'constraints:' ) )
            // InternalPLhlcl.g:975:1: ( 'constraints:' )
            {
            // InternalPLhlcl.g:975:1: ( 'constraints:' )
            // InternalPLhlcl.g:976:2: 'constraints:'
            {
             before(grammarAccess.getModelAccess().getConstraintsKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalPLhlcl.g:985:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:989:1: ( rule__Model__Group__5__Impl )
            // InternalPLhlcl.g:990:2: rule__Model__Group__5__Impl
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
    // InternalPLhlcl.g:996:1: rule__Model__Group__5__Impl : ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1000:1: ( ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) )
            // InternalPLhlcl.g:1001:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            {
            // InternalPLhlcl.g:1001:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalPLhlcl.g:1002:2: ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalPLhlcl.g:1002:2: ( ( rule__Model__ConstraintsAssignment_5 ) )
            // InternalPLhlcl.g:1003:3: ( rule__Model__ConstraintsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalPLhlcl.g:1004:3: ( rule__Model__ConstraintsAssignment_5 )
            // InternalPLhlcl.g:1004:4: rule__Model__ConstraintsAssignment_5
            {
            pushFollow(FOLLOW_8);
            rule__Model__ConstraintsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 

            }

            // InternalPLhlcl.g:1007:2: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalPLhlcl.g:1008:3: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalPLhlcl.g:1009:3: ( rule__Model__ConstraintsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPLhlcl.g:1009:4: rule__Model__ConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__ConstraintsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 

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


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalPLhlcl.g:1019:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1023:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPLhlcl.g:1024:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalPLhlcl.g:1031:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__Group_0__0 )? ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1035:1: ( ( ( rule__VarDeclaration__Group_0__0 )? ) )
            // InternalPLhlcl.g:1036:1: ( ( rule__VarDeclaration__Group_0__0 )? )
            {
            // InternalPLhlcl.g:1036:1: ( ( rule__VarDeclaration__Group_0__0 )? )
            // InternalPLhlcl.g:1037:2: ( rule__VarDeclaration__Group_0__0 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup_0()); 
            // InternalPLhlcl.g:1038:2: ( rule__VarDeclaration__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23||LA11_0==37) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPLhlcl.g:1038:3: rule__VarDeclaration__Group_0__0
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
    // InternalPLhlcl.g:1046:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1050:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalPLhlcl.g:1051:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
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
    // InternalPLhlcl.g:1058:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1062:1: ( ( ( rule__VarDeclaration__TypeAssignment_1 ) ) )
            // InternalPLhlcl.g:1063:1: ( ( rule__VarDeclaration__TypeAssignment_1 ) )
            {
            // InternalPLhlcl.g:1063:1: ( ( rule__VarDeclaration__TypeAssignment_1 ) )
            // InternalPLhlcl.g:1064:2: ( rule__VarDeclaration__TypeAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1()); 
            // InternalPLhlcl.g:1065:2: ( rule__VarDeclaration__TypeAssignment_1 )
            // InternalPLhlcl.g:1065:3: rule__VarDeclaration__TypeAssignment_1
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
    // InternalPLhlcl.g:1073:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1077:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalPLhlcl.g:1078:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
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
    // InternalPLhlcl.g:1085:1: rule__VarDeclaration__Group__2__Impl : ( ( rule__VarDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1089:1: ( ( ( rule__VarDeclaration__NameAssignment_2 ) ) )
            // InternalPLhlcl.g:1090:1: ( ( rule__VarDeclaration__NameAssignment_2 ) )
            {
            // InternalPLhlcl.g:1090:1: ( ( rule__VarDeclaration__NameAssignment_2 ) )
            // InternalPLhlcl.g:1091:2: ( rule__VarDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_2()); 
            // InternalPLhlcl.g:1092:2: ( rule__VarDeclaration__NameAssignment_2 )
            // InternalPLhlcl.g:1092:3: rule__VarDeclaration__NameAssignment_2
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
    // InternalPLhlcl.g:1100:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl rule__VarDeclaration__Group__4 ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1104:1: ( rule__VarDeclaration__Group__3__Impl rule__VarDeclaration__Group__4 )
            // InternalPLhlcl.g:1105:2: rule__VarDeclaration__Group__3__Impl rule__VarDeclaration__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__VarDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__4();

            state._fsp--;


            }

        }
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
    // InternalPLhlcl.g:1112:1: rule__VarDeclaration__Group__3__Impl : ( 'variants:' ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1116:1: ( ( 'variants:' ) )
            // InternalPLhlcl.g:1117:1: ( 'variants:' )
            {
            // InternalPLhlcl.g:1117:1: ( 'variants:' )
            // InternalPLhlcl.g:1118:2: 'variants:'
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getVariantsKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__VarDeclaration__Group__4"
    // InternalPLhlcl.g:1127:1: rule__VarDeclaration__Group__4 : rule__VarDeclaration__Group__4__Impl ;
    public final void rule__VarDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1131:1: ( rule__VarDeclaration__Group__4__Impl )
            // InternalPLhlcl.g:1132:2: rule__VarDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__4"


    // $ANTLR start "rule__VarDeclaration__Group__4__Impl"
    // InternalPLhlcl.g:1138:1: rule__VarDeclaration__Group__4__Impl : ( ( rule__VarDeclaration__VariantsAssignment_4 ) ) ;
    public final void rule__VarDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1142:1: ( ( ( rule__VarDeclaration__VariantsAssignment_4 ) ) )
            // InternalPLhlcl.g:1143:1: ( ( rule__VarDeclaration__VariantsAssignment_4 ) )
            {
            // InternalPLhlcl.g:1143:1: ( ( rule__VarDeclaration__VariantsAssignment_4 ) )
            // InternalPLhlcl.g:1144:2: ( rule__VarDeclaration__VariantsAssignment_4 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_4()); 
            // InternalPLhlcl.g:1145:2: ( rule__VarDeclaration__VariantsAssignment_4 )
            // InternalPLhlcl.g:1145:3: rule__VarDeclaration__VariantsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VariantsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__4__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0__0"
    // InternalPLhlcl.g:1154:1: rule__VarDeclaration__Group_0__0 : rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 ;
    public final void rule__VarDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1158:1: ( rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 )
            // InternalPLhlcl.g:1159:2: rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalPLhlcl.g:1166:1: rule__VarDeclaration__Group_0__0__Impl : ( ( rule__VarDeclaration__InstantiableAssignment_0_0 )? ) ;
    public final void rule__VarDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1170:1: ( ( ( rule__VarDeclaration__InstantiableAssignment_0_0 )? ) )
            // InternalPLhlcl.g:1171:1: ( ( rule__VarDeclaration__InstantiableAssignment_0_0 )? )
            {
            // InternalPLhlcl.g:1171:1: ( ( rule__VarDeclaration__InstantiableAssignment_0_0 )? )
            // InternalPLhlcl.g:1172:2: ( rule__VarDeclaration__InstantiableAssignment_0_0 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0_0()); 
            // InternalPLhlcl.g:1173:2: ( rule__VarDeclaration__InstantiableAssignment_0_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPLhlcl.g:1173:3: rule__VarDeclaration__InstantiableAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__InstantiableAssignment_0_0();

                    state._fsp--;


                    }
                    break;

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
    // InternalPLhlcl.g:1181:1: rule__VarDeclaration__Group_0__1 : rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2 ;
    public final void rule__VarDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1185:1: ( rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2 )
            // InternalPLhlcl.g:1186:2: rule__VarDeclaration__Group_0__1__Impl rule__VarDeclaration__Group_0__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalPLhlcl.g:1193:1: rule__VarDeclaration__Group_0__1__Impl : ( '[' ) ;
    public final void rule__VarDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1197:1: ( ( '[' ) )
            // InternalPLhlcl.g:1198:1: ( '[' )
            {
            // InternalPLhlcl.g:1198:1: ( '[' )
            // InternalPLhlcl.g:1199:2: '['
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
    // InternalPLhlcl.g:1208:1: rule__VarDeclaration__Group_0__2 : rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3 ;
    public final void rule__VarDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1212:1: ( rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3 )
            // InternalPLhlcl.g:1213:2: rule__VarDeclaration__Group_0__2__Impl rule__VarDeclaration__Group_0__3
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
    // InternalPLhlcl.g:1220:1: rule__VarDeclaration__Group_0__2__Impl : ( ( rule__VarDeclaration__MinAssignment_0_2 )? ) ;
    public final void rule__VarDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1224:1: ( ( ( rule__VarDeclaration__MinAssignment_0_2 )? ) )
            // InternalPLhlcl.g:1225:1: ( ( rule__VarDeclaration__MinAssignment_0_2 )? )
            {
            // InternalPLhlcl.g:1225:1: ( ( rule__VarDeclaration__MinAssignment_0_2 )? )
            // InternalPLhlcl.g:1226:2: ( rule__VarDeclaration__MinAssignment_0_2 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getMinAssignment_0_2()); 
            // InternalPLhlcl.g:1227:2: ( rule__VarDeclaration__MinAssignment_0_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPLhlcl.g:1227:3: rule__VarDeclaration__MinAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__MinAssignment_0_2();

                    state._fsp--;


                    }
                    break;

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
    // InternalPLhlcl.g:1235:1: rule__VarDeclaration__Group_0__3 : rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4 ;
    public final void rule__VarDeclaration__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1239:1: ( rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4 )
            // InternalPLhlcl.g:1240:2: rule__VarDeclaration__Group_0__3__Impl rule__VarDeclaration__Group_0__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalPLhlcl.g:1247:1: rule__VarDeclaration__Group_0__3__Impl : ( ',' ) ;
    public final void rule__VarDeclaration__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1251:1: ( ( ',' ) )
            // InternalPLhlcl.g:1252:1: ( ',' )
            {
            // InternalPLhlcl.g:1252:1: ( ',' )
            // InternalPLhlcl.g:1253:2: ','
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
    // InternalPLhlcl.g:1262:1: rule__VarDeclaration__Group_0__4 : rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5 ;
    public final void rule__VarDeclaration__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1266:1: ( rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5 )
            // InternalPLhlcl.g:1267:2: rule__VarDeclaration__Group_0__4__Impl rule__VarDeclaration__Group_0__5
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
    // InternalPLhlcl.g:1274:1: rule__VarDeclaration__Group_0__4__Impl : ( ( rule__VarDeclaration__MaxAssignment_0_4 )? ) ;
    public final void rule__VarDeclaration__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1278:1: ( ( ( rule__VarDeclaration__MaxAssignment_0_4 )? ) )
            // InternalPLhlcl.g:1279:1: ( ( rule__VarDeclaration__MaxAssignment_0_4 )? )
            {
            // InternalPLhlcl.g:1279:1: ( ( rule__VarDeclaration__MaxAssignment_0_4 )? )
            // InternalPLhlcl.g:1280:2: ( rule__VarDeclaration__MaxAssignment_0_4 )?
            {
             before(grammarAccess.getVarDeclarationAccess().getMaxAssignment_0_4()); 
            // InternalPLhlcl.g:1281:2: ( rule__VarDeclaration__MaxAssignment_0_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPLhlcl.g:1281:3: rule__VarDeclaration__MaxAssignment_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__MaxAssignment_0_4();

                    state._fsp--;


                    }
                    break;

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
    // InternalPLhlcl.g:1289:1: rule__VarDeclaration__Group_0__5 : rule__VarDeclaration__Group_0__5__Impl ;
    public final void rule__VarDeclaration__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1293:1: ( rule__VarDeclaration__Group_0__5__Impl )
            // InternalPLhlcl.g:1294:2: rule__VarDeclaration__Group_0__5__Impl
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
    // InternalPLhlcl.g:1300:1: rule__VarDeclaration__Group_0__5__Impl : ( ']' ) ;
    public final void rule__VarDeclaration__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1304:1: ( ( ']' ) )
            // InternalPLhlcl.g:1305:1: ( ']' )
            {
            // InternalPLhlcl.g:1305:1: ( ']' )
            // InternalPLhlcl.g:1306:2: ']'
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


    // $ANTLR start "rule__VariantsInterval__Group__0"
    // InternalPLhlcl.g:1316:1: rule__VariantsInterval__Group__0 : rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 ;
    public final void rule__VariantsInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1320:1: ( rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 )
            // InternalPLhlcl.g:1321:2: rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPLhlcl.g:1328:1: rule__VariantsInterval__Group__0__Impl : ( () ) ;
    public final void rule__VariantsInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1332:1: ( ( () ) )
            // InternalPLhlcl.g:1333:1: ( () )
            {
            // InternalPLhlcl.g:1333:1: ( () )
            // InternalPLhlcl.g:1334:2: ()
            {
             before(grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0()); 
            // InternalPLhlcl.g:1335:2: ()
            // InternalPLhlcl.g:1335:3: 
            {
            }

             after(grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__0__Impl"


    // $ANTLR start "rule__VariantsInterval__Group__1"
    // InternalPLhlcl.g:1343:1: rule__VariantsInterval__Group__1 : rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 ;
    public final void rule__VariantsInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1347:1: ( rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 )
            // InternalPLhlcl.g:1348:2: rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalPLhlcl.g:1355:1: rule__VariantsInterval__Group__1__Impl : ( ( rule__VariantsInterval__StartAssignment_1 ) ) ;
    public final void rule__VariantsInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1359:1: ( ( ( rule__VariantsInterval__StartAssignment_1 ) ) )
            // InternalPLhlcl.g:1360:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            {
            // InternalPLhlcl.g:1360:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            // InternalPLhlcl.g:1361:2: ( rule__VariantsInterval__StartAssignment_1 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartAssignment_1()); 
            // InternalPLhlcl.g:1362:2: ( rule__VariantsInterval__StartAssignment_1 )
            // InternalPLhlcl.g:1362:3: rule__VariantsInterval__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariantsIntervalAccess().getStartAssignment_1()); 

            }


            }

        }
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
    // InternalPLhlcl.g:1370:1: rule__VariantsInterval__Group__2 : rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 ;
    public final void rule__VariantsInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1374:1: ( rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 )
            // InternalPLhlcl.g:1375:2: rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__VariantsInterval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__3();

            state._fsp--;


            }

        }
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
    // InternalPLhlcl.g:1382:1: rule__VariantsInterval__Group__2__Impl : ( '..' ) ;
    public final void rule__VariantsInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1386:1: ( ( '..' ) )
            // InternalPLhlcl.g:1387:1: ( '..' )
            {
            // InternalPLhlcl.g:1387:1: ( '..' )
            // InternalPLhlcl.g:1388:2: '..'
            {
             before(grammarAccess.getVariantsIntervalAccess().getFullStopFullStopKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVariantsIntervalAccess().getFullStopFullStopKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__VariantsInterval__Group__3"
    // InternalPLhlcl.g:1397:1: rule__VariantsInterval__Group__3 : rule__VariantsInterval__Group__3__Impl ;
    public final void rule__VariantsInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1401:1: ( rule__VariantsInterval__Group__3__Impl )
            // InternalPLhlcl.g:1402:2: rule__VariantsInterval__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__3"


    // $ANTLR start "rule__VariantsInterval__Group__3__Impl"
    // InternalPLhlcl.g:1408:1: rule__VariantsInterval__Group__3__Impl : ( ( rule__VariantsInterval__EndAssignment_3 ) ) ;
    public final void rule__VariantsInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1412:1: ( ( ( rule__VariantsInterval__EndAssignment_3 ) ) )
            // InternalPLhlcl.g:1413:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            {
            // InternalPLhlcl.g:1413:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            // InternalPLhlcl.g:1414:2: ( rule__VariantsInterval__EndAssignment_3 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndAssignment_3()); 
            // InternalPLhlcl.g:1415:2: ( rule__VariantsInterval__EndAssignment_3 )
            // InternalPLhlcl.g:1415:3: rule__VariantsInterval__EndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariantsInterval__EndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariantsIntervalAccess().getEndAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__Group__3__Impl"


    // $ANTLR start "rule__VariantsEnumeration__Group__0"
    // InternalPLhlcl.g:1424:1: rule__VariantsEnumeration__Group__0 : rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 ;
    public final void rule__VariantsEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1428:1: ( rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 )
            // InternalPLhlcl.g:1429:2: rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPLhlcl.g:1436:1: rule__VariantsEnumeration__Group__0__Impl : ( () ) ;
    public final void rule__VariantsEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1440:1: ( ( () ) )
            // InternalPLhlcl.g:1441:1: ( () )
            {
            // InternalPLhlcl.g:1441:1: ( () )
            // InternalPLhlcl.g:1442:2: ()
            {
             before(grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0()); 
            // InternalPLhlcl.g:1443:2: ()
            // InternalPLhlcl.g:1443:3: 
            {
            }

             after(grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__0__Impl"


    // $ANTLR start "rule__VariantsEnumeration__Group__1"
    // InternalPLhlcl.g:1451:1: rule__VariantsEnumeration__Group__1 : rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 ;
    public final void rule__VariantsEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1455:1: ( rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 )
            // InternalPLhlcl.g:1456:2: rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalPLhlcl.g:1463:1: rule__VariantsEnumeration__Group__1__Impl : ( '[' ) ;
    public final void rule__VariantsEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1467:1: ( ( '[' ) )
            // InternalPLhlcl.g:1468:1: ( '[' )
            {
            // InternalPLhlcl.g:1468:1: ( '[' )
            // InternalPLhlcl.g:1469:2: '['
            {
             before(grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
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
    // InternalPLhlcl.g:1478:1: rule__VariantsEnumeration__Group__2 : rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 ;
    public final void rule__VariantsEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1482:1: ( rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 )
            // InternalPLhlcl.g:1483:2: rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__VariantsEnumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__3();

            state._fsp--;


            }

        }
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
    // InternalPLhlcl.g:1490:1: rule__VariantsEnumeration__Group__2__Impl : ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) ;
    public final void rule__VariantsEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1494:1: ( ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) )
            // InternalPLhlcl.g:1495:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            {
            // InternalPLhlcl.g:1495:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            // InternalPLhlcl.g:1496:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListAssignment_2()); 
            // InternalPLhlcl.g:1497:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            // InternalPLhlcl.g:1497:3: rule__VariantsEnumeration__ListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariantsEnumerationAccess().getListAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__VariantsEnumeration__Group__3"
    // InternalPLhlcl.g:1505:1: rule__VariantsEnumeration__Group__3 : rule__VariantsEnumeration__Group__3__Impl ;
    public final void rule__VariantsEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1509:1: ( rule__VariantsEnumeration__Group__3__Impl )
            // InternalPLhlcl.g:1510:2: rule__VariantsEnumeration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariantsEnumeration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__3"


    // $ANTLR start "rule__VariantsEnumeration__Group__3__Impl"
    // InternalPLhlcl.g:1516:1: rule__VariantsEnumeration__Group__3__Impl : ( ']' ) ;
    public final void rule__VariantsEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1520:1: ( ( ']' ) )
            // InternalPLhlcl.g:1521:1: ( ']' )
            {
            // InternalPLhlcl.g:1521:1: ( ']' )
            // InternalPLhlcl.g:1522:2: ']'
            {
             before(grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalPLhlcl.g:1532:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1536:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalPLhlcl.g:1537:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalPLhlcl.g:1544:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1548:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalPLhlcl.g:1549:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalPLhlcl.g:1549:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalPLhlcl.g:1550:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalPLhlcl.g:1551:2: ( rule__Constraint__NameAssignment_0 )
            // InternalPLhlcl.g:1551:3: rule__Constraint__NameAssignment_0
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
    // InternalPLhlcl.g:1559:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1563:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalPLhlcl.g:1564:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalPLhlcl.g:1571:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1575:1: ( ( ':' ) )
            // InternalPLhlcl.g:1576:1: ( ':' )
            {
            // InternalPLhlcl.g:1576:1: ( ':' )
            // InternalPLhlcl.g:1577:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPLhlcl.g:1586:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1590:1: ( rule__Constraint__Group__2__Impl )
            // InternalPLhlcl.g:1591:2: rule__Constraint__Group__2__Impl
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
    // InternalPLhlcl.g:1597:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1601:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalPLhlcl.g:1602:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalPLhlcl.g:1602:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalPLhlcl.g:1603:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalPLhlcl.g:1604:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalPLhlcl.g:1604:3: rule__Constraint__ExpAssignment_2
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
    // InternalPLhlcl.g:1613:1: rule__TerminalExp__Group_0__0 : rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 ;
    public final void rule__TerminalExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1617:1: ( rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 )
            // InternalPLhlcl.g:1618:2: rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1
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
    // InternalPLhlcl.g:1625:1: rule__TerminalExp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1629:1: ( ( '(' ) )
            // InternalPLhlcl.g:1630:1: ( '(' )
            {
            // InternalPLhlcl.g:1630:1: ( '(' )
            // InternalPLhlcl.g:1631:2: '('
            {
             before(grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPLhlcl.g:1640:1: rule__TerminalExp__Group_0__1 : rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 ;
    public final void rule__TerminalExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1644:1: ( rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 )
            // InternalPLhlcl.g:1645:2: rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2
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
    // InternalPLhlcl.g:1652:1: rule__TerminalExp__Group_0__1__Impl : ( ruleConsExpression ) ;
    public final void rule__TerminalExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1656:1: ( ( ruleConsExpression ) )
            // InternalPLhlcl.g:1657:1: ( ruleConsExpression )
            {
            // InternalPLhlcl.g:1657:1: ( ruleConsExpression )
            // InternalPLhlcl.g:1658:2: ruleConsExpression
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
    // InternalPLhlcl.g:1667:1: rule__TerminalExp__Group_0__2 : rule__TerminalExp__Group_0__2__Impl ;
    public final void rule__TerminalExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1671:1: ( rule__TerminalExp__Group_0__2__Impl )
            // InternalPLhlcl.g:1672:2: rule__TerminalExp__Group_0__2__Impl
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
    // InternalPLhlcl.g:1678:1: rule__TerminalExp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1682:1: ( ( ')' ) )
            // InternalPLhlcl.g:1683:1: ( ')' )
            {
            // InternalPLhlcl.g:1683:1: ( ')' )
            // InternalPLhlcl.g:1684:2: ')'
            {
             before(grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2()); 
            match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalPLhlcl.g:1694:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1698:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalPLhlcl.g:1699:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalPLhlcl.g:1706:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1710:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalPLhlcl.g:1711:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalPLhlcl.g:1711:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalPLhlcl.g:1712:2: ( rule__Assignment__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            // InternalPLhlcl.g:1713:2: ( rule__Assignment__VarAssignment_0 )
            // InternalPLhlcl.g:1713:3: rule__Assignment__VarAssignment_0
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
    // InternalPLhlcl.g:1721:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1725:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalPLhlcl.g:1726:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalPLhlcl.g:1733:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1737:1: ( ( 'is' ) )
            // InternalPLhlcl.g:1738:1: ( 'is' )
            {
            // InternalPLhlcl.g:1738:1: ( 'is' )
            // InternalPLhlcl.g:1739:2: 'is'
            {
             before(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPLhlcl.g:1748:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1752:1: ( rule__Assignment__Group__2__Impl )
            // InternalPLhlcl.g:1753:2: rule__Assignment__Group__2__Impl
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
    // InternalPLhlcl.g:1759:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1763:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalPLhlcl.g:1764:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalPLhlcl.g:1764:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalPLhlcl.g:1765:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalPLhlcl.g:1766:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalPLhlcl.g:1766:3: rule__Assignment__ValueAssignment_2
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
    // InternalPLhlcl.g:1775:1: rule__VarRefinement__Group__0 : rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 ;
    public final void rule__VarRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1779:1: ( rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 )
            // InternalPLhlcl.g:1780:2: rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalPLhlcl.g:1787:1: rule__VarRefinement__Group__0__Impl : ( ( rule__VarRefinement__VarAssignment_0 ) ) ;
    public final void rule__VarRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1791:1: ( ( ( rule__VarRefinement__VarAssignment_0 ) ) )
            // InternalPLhlcl.g:1792:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            {
            // InternalPLhlcl.g:1792:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            // InternalPLhlcl.g:1793:2: ( rule__VarRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 
            // InternalPLhlcl.g:1794:2: ( rule__VarRefinement__VarAssignment_0 )
            // InternalPLhlcl.g:1794:3: rule__VarRefinement__VarAssignment_0
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
    // InternalPLhlcl.g:1802:1: rule__VarRefinement__Group__1 : rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 ;
    public final void rule__VarRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1806:1: ( rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 )
            // InternalPLhlcl.g:1807:2: rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalPLhlcl.g:1814:1: rule__VarRefinement__Group__1__Impl : ( 'in' ) ;
    public final void rule__VarRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1818:1: ( ( 'in' ) )
            // InternalPLhlcl.g:1819:1: ( 'in' )
            {
            // InternalPLhlcl.g:1819:1: ( 'in' )
            // InternalPLhlcl.g:1820:2: 'in'
            {
             before(grammarAccess.getVarRefinementAccess().getInKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPLhlcl.g:1829:1: rule__VarRefinement__Group__2 : rule__VarRefinement__Group__2__Impl ;
    public final void rule__VarRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1833:1: ( rule__VarRefinement__Group__2__Impl )
            // InternalPLhlcl.g:1834:2: rule__VarRefinement__Group__2__Impl
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
    // InternalPLhlcl.g:1840:1: rule__VarRefinement__Group__2__Impl : ( ( rule__VarRefinement__ValuesAssignment_2 ) ) ;
    public final void rule__VarRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1844:1: ( ( ( rule__VarRefinement__ValuesAssignment_2 ) ) )
            // InternalPLhlcl.g:1845:1: ( ( rule__VarRefinement__ValuesAssignment_2 ) )
            {
            // InternalPLhlcl.g:1845:1: ( ( rule__VarRefinement__ValuesAssignment_2 ) )
            // InternalPLhlcl.g:1846:2: ( rule__VarRefinement__ValuesAssignment_2 )
            {
             before(grammarAccess.getVarRefinementAccess().getValuesAssignment_2()); 
            // InternalPLhlcl.g:1847:2: ( rule__VarRefinement__ValuesAssignment_2 )
            // InternalPLhlcl.g:1847:3: rule__VarRefinement__ValuesAssignment_2
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
    // InternalPLhlcl.g:1856:1: rule__SetRefinement__Group__0 : rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 ;
    public final void rule__SetRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1860:1: ( rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 )
            // InternalPLhlcl.g:1861:2: rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPLhlcl.g:1868:1: rule__SetRefinement__Group__0__Impl : ( 'vars:' ) ;
    public final void rule__SetRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1872:1: ( ( 'vars:' ) )
            // InternalPLhlcl.g:1873:1: ( 'vars:' )
            {
            // InternalPLhlcl.g:1873:1: ( 'vars:' )
            // InternalPLhlcl.g:1874:2: 'vars:'
            {
             before(grammarAccess.getSetRefinementAccess().getVarsKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPLhlcl.g:1883:1: rule__SetRefinement__Group__1 : rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 ;
    public final void rule__SetRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1887:1: ( rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 )
            // InternalPLhlcl.g:1888:2: rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2
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
    // InternalPLhlcl.g:1895:1: rule__SetRefinement__Group__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1899:1: ( ( '(' ) )
            // InternalPLhlcl.g:1900:1: ( '(' )
            {
            // InternalPLhlcl.g:1900:1: ( '(' )
            // InternalPLhlcl.g:1901:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPLhlcl.g:1910:1: rule__SetRefinement__Group__2 : rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 ;
    public final void rule__SetRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1914:1: ( rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 )
            // InternalPLhlcl.g:1915:2: rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3
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
    // InternalPLhlcl.g:1922:1: rule__SetRefinement__Group__2__Impl : ( ( rule__SetRefinement__VarsAssignment_2 ) ) ;
    public final void rule__SetRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1926:1: ( ( ( rule__SetRefinement__VarsAssignment_2 ) ) )
            // InternalPLhlcl.g:1927:1: ( ( rule__SetRefinement__VarsAssignment_2 ) )
            {
            // InternalPLhlcl.g:1927:1: ( ( rule__SetRefinement__VarsAssignment_2 ) )
            // InternalPLhlcl.g:1928:2: ( rule__SetRefinement__VarsAssignment_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getVarsAssignment_2()); 
            // InternalPLhlcl.g:1929:2: ( rule__SetRefinement__VarsAssignment_2 )
            // InternalPLhlcl.g:1929:3: rule__SetRefinement__VarsAssignment_2
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
    // InternalPLhlcl.g:1937:1: rule__SetRefinement__Group__3 : rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 ;
    public final void rule__SetRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1941:1: ( rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 )
            // InternalPLhlcl.g:1942:2: rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalPLhlcl.g:1949:1: rule__SetRefinement__Group__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1953:1: ( ( ')' ) )
            // InternalPLhlcl.g:1954:1: ( ')' )
            {
            // InternalPLhlcl.g:1954:1: ( ')' )
            // InternalPLhlcl.g:1955:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPLhlcl.g:1964:1: rule__SetRefinement__Group__4 : rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 ;
    public final void rule__SetRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1968:1: ( rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 )
            // InternalPLhlcl.g:1969:2: rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalPLhlcl.g:1976:1: rule__SetRefinement__Group__4__Impl : ( 'variants' ) ;
    public final void rule__SetRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1980:1: ( ( 'variants' ) )
            // InternalPLhlcl.g:1981:1: ( 'variants' )
            {
            // InternalPLhlcl.g:1981:1: ( 'variants' )
            // InternalPLhlcl.g:1982:2: 'variants'
            {
             before(grammarAccess.getSetRefinementAccess().getVariantsKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPLhlcl.g:1991:1: rule__SetRefinement__Group__5 : rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 ;
    public final void rule__SetRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:1995:1: ( rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 )
            // InternalPLhlcl.g:1996:2: rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalPLhlcl.g:2003:1: rule__SetRefinement__Group__5__Impl : ( '[' ) ;
    public final void rule__SetRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2007:1: ( ( '[' ) )
            // InternalPLhlcl.g:2008:1: ( '[' )
            {
            // InternalPLhlcl.g:2008:1: ( '[' )
            // InternalPLhlcl.g:2009:2: '['
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
    // InternalPLhlcl.g:2018:1: rule__SetRefinement__Group__6 : rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 ;
    public final void rule__SetRefinement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2022:1: ( rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 )
            // InternalPLhlcl.g:2023:2: rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalPLhlcl.g:2030:1: rule__SetRefinement__Group__6__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2034:1: ( ( '(' ) )
            // InternalPLhlcl.g:2035:1: ( '(' )
            {
            // InternalPLhlcl.g:2035:1: ( '(' )
            // InternalPLhlcl.g:2036:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPLhlcl.g:2045:1: rule__SetRefinement__Group__7 : rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 ;
    public final void rule__SetRefinement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2049:1: ( rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 )
            // InternalPLhlcl.g:2050:2: rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8
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
    // InternalPLhlcl.g:2057:1: rule__SetRefinement__Group__7__Impl : ( ( rule__SetRefinement__HeadAssignment_7 ) ) ;
    public final void rule__SetRefinement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2061:1: ( ( ( rule__SetRefinement__HeadAssignment_7 ) ) )
            // InternalPLhlcl.g:2062:1: ( ( rule__SetRefinement__HeadAssignment_7 ) )
            {
            // InternalPLhlcl.g:2062:1: ( ( rule__SetRefinement__HeadAssignment_7 ) )
            // InternalPLhlcl.g:2063:2: ( rule__SetRefinement__HeadAssignment_7 )
            {
             before(grammarAccess.getSetRefinementAccess().getHeadAssignment_7()); 
            // InternalPLhlcl.g:2064:2: ( rule__SetRefinement__HeadAssignment_7 )
            // InternalPLhlcl.g:2064:3: rule__SetRefinement__HeadAssignment_7
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
    // InternalPLhlcl.g:2072:1: rule__SetRefinement__Group__8 : rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 ;
    public final void rule__SetRefinement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2076:1: ( rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 )
            // InternalPLhlcl.g:2077:2: rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalPLhlcl.g:2084:1: rule__SetRefinement__Group__8__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2088:1: ( ( ')' ) )
            // InternalPLhlcl.g:2089:1: ( ')' )
            {
            // InternalPLhlcl.g:2089:1: ( ')' )
            // InternalPLhlcl.g:2090:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPLhlcl.g:2099:1: rule__SetRefinement__Group__9 : rule__SetRefinement__Group__9__Impl rule__SetRefinement__Group__10 ;
    public final void rule__SetRefinement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2103:1: ( rule__SetRefinement__Group__9__Impl rule__SetRefinement__Group__10 )
            // InternalPLhlcl.g:2104:2: rule__SetRefinement__Group__9__Impl rule__SetRefinement__Group__10
            {
            pushFollow(FOLLOW_16);
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
    // InternalPLhlcl.g:2111:1: rule__SetRefinement__Group__9__Impl : ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) ) ;
    public final void rule__SetRefinement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2115:1: ( ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) ) )
            // InternalPLhlcl.g:2116:1: ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) )
            {
            // InternalPLhlcl.g:2116:1: ( ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* ) )
            // InternalPLhlcl.g:2117:2: ( ( rule__SetRefinement__Group_9__0 ) ) ( ( rule__SetRefinement__Group_9__0 )* )
            {
            // InternalPLhlcl.g:2117:2: ( ( rule__SetRefinement__Group_9__0 ) )
            // InternalPLhlcl.g:2118:3: ( rule__SetRefinement__Group_9__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_9()); 
            // InternalPLhlcl.g:2119:3: ( rule__SetRefinement__Group_9__0 )
            // InternalPLhlcl.g:2119:4: rule__SetRefinement__Group_9__0
            {
            pushFollow(FOLLOW_26);
            rule__SetRefinement__Group_9__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup_9()); 

            }

            // InternalPLhlcl.g:2122:2: ( ( rule__SetRefinement__Group_9__0 )* )
            // InternalPLhlcl.g:2123:3: ( rule__SetRefinement__Group_9__0 )*
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_9()); 
            // InternalPLhlcl.g:2124:3: ( rule__SetRefinement__Group_9__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPLhlcl.g:2124:4: rule__SetRefinement__Group_9__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__SetRefinement__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalPLhlcl.g:2133:1: rule__SetRefinement__Group__10 : rule__SetRefinement__Group__10__Impl ;
    public final void rule__SetRefinement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2137:1: ( rule__SetRefinement__Group__10__Impl )
            // InternalPLhlcl.g:2138:2: rule__SetRefinement__Group__10__Impl
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
    // InternalPLhlcl.g:2144:1: rule__SetRefinement__Group__10__Impl : ( ']' ) ;
    public final void rule__SetRefinement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2148:1: ( ( ']' ) )
            // InternalPLhlcl.g:2149:1: ( ']' )
            {
            // InternalPLhlcl.g:2149:1: ( ']' )
            // InternalPLhlcl.g:2150:2: ']'
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
    // InternalPLhlcl.g:2160:1: rule__SetRefinement__Group_9__0 : rule__SetRefinement__Group_9__0__Impl rule__SetRefinement__Group_9__1 ;
    public final void rule__SetRefinement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2164:1: ( rule__SetRefinement__Group_9__0__Impl rule__SetRefinement__Group_9__1 )
            // InternalPLhlcl.g:2165:2: rule__SetRefinement__Group_9__0__Impl rule__SetRefinement__Group_9__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPLhlcl.g:2172:1: rule__SetRefinement__Group_9__0__Impl : ( ',' ) ;
    public final void rule__SetRefinement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2176:1: ( ( ',' ) )
            // InternalPLhlcl.g:2177:1: ( ',' )
            {
            // InternalPLhlcl.g:2177:1: ( ',' )
            // InternalPLhlcl.g:2178:2: ','
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
    // InternalPLhlcl.g:2187:1: rule__SetRefinement__Group_9__1 : rule__SetRefinement__Group_9__1__Impl rule__SetRefinement__Group_9__2 ;
    public final void rule__SetRefinement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2191:1: ( rule__SetRefinement__Group_9__1__Impl rule__SetRefinement__Group_9__2 )
            // InternalPLhlcl.g:2192:2: rule__SetRefinement__Group_9__1__Impl rule__SetRefinement__Group_9__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalPLhlcl.g:2199:1: rule__SetRefinement__Group_9__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2203:1: ( ( '(' ) )
            // InternalPLhlcl.g:2204:1: ( '(' )
            {
            // InternalPLhlcl.g:2204:1: ( '(' )
            // InternalPLhlcl.g:2205:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPLhlcl.g:2214:1: rule__SetRefinement__Group_9__2 : rule__SetRefinement__Group_9__2__Impl rule__SetRefinement__Group_9__3 ;
    public final void rule__SetRefinement__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2218:1: ( rule__SetRefinement__Group_9__2__Impl rule__SetRefinement__Group_9__3 )
            // InternalPLhlcl.g:2219:2: rule__SetRefinement__Group_9__2__Impl rule__SetRefinement__Group_9__3
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
    // InternalPLhlcl.g:2226:1: rule__SetRefinement__Group_9__2__Impl : ( ( rule__SetRefinement__TailAssignment_9_2 ) ) ;
    public final void rule__SetRefinement__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2230:1: ( ( ( rule__SetRefinement__TailAssignment_9_2 ) ) )
            // InternalPLhlcl.g:2231:1: ( ( rule__SetRefinement__TailAssignment_9_2 ) )
            {
            // InternalPLhlcl.g:2231:1: ( ( rule__SetRefinement__TailAssignment_9_2 ) )
            // InternalPLhlcl.g:2232:2: ( rule__SetRefinement__TailAssignment_9_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getTailAssignment_9_2()); 
            // InternalPLhlcl.g:2233:2: ( rule__SetRefinement__TailAssignment_9_2 )
            // InternalPLhlcl.g:2233:3: rule__SetRefinement__TailAssignment_9_2
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
    // InternalPLhlcl.g:2241:1: rule__SetRefinement__Group_9__3 : rule__SetRefinement__Group_9__3__Impl ;
    public final void rule__SetRefinement__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2245:1: ( rule__SetRefinement__Group_9__3__Impl )
            // InternalPLhlcl.g:2246:2: rule__SetRefinement__Group_9__3__Impl
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
    // InternalPLhlcl.g:2252:1: rule__SetRefinement__Group_9__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2256:1: ( ( ')' ) )
            // InternalPLhlcl.g:2257:1: ( ')' )
            {
            // InternalPLhlcl.g:2257:1: ( ')' )
            // InternalPLhlcl.g:2258:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_9_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPLhlcl.g:2268:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2272:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalPLhlcl.g:2273:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalPLhlcl.g:2280:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2284:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalPLhlcl.g:2285:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalPLhlcl.g:2285:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalPLhlcl.g:2286:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalPLhlcl.g:2287:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalPLhlcl.g:2287:3: rule__Rule__ConditionAssignment_0
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
    // InternalPLhlcl.g:2295:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2299:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalPLhlcl.g:2300:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalPLhlcl.g:2307:1: rule__Rule__Group__1__Impl : ( '-->' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2311:1: ( ( '-->' ) )
            // InternalPLhlcl.g:2312:1: ( '-->' )
            {
            // InternalPLhlcl.g:2312:1: ( '-->' )
            // InternalPLhlcl.g:2313:2: '-->'
            {
             before(grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPLhlcl.g:2322:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2326:1: ( rule__Rule__Group__2__Impl )
            // InternalPLhlcl.g:2327:2: rule__Rule__Group__2__Impl
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
    // InternalPLhlcl.g:2333:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConsequenceAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2337:1: ( ( ( rule__Rule__ConsequenceAssignment_2 ) ) )
            // InternalPLhlcl.g:2338:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            {
            // InternalPLhlcl.g:2338:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            // InternalPLhlcl.g:2339:2: ( rule__Rule__ConsequenceAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 
            // InternalPLhlcl.g:2340:2: ( rule__Rule__ConsequenceAssignment_2 )
            // InternalPLhlcl.g:2340:3: rule__Rule__ConsequenceAssignment_2
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
    // InternalPLhlcl.g:2349:1: rule__FodaUN__Group__0 : rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 ;
    public final void rule__FodaUN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2353:1: ( rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 )
            // InternalPLhlcl.g:2354:2: rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalPLhlcl.g:2361:1: rule__FodaUN__Group__0__Impl : ( ( rule__FodaUN__Var1Assignment_0 ) ) ;
    public final void rule__FodaUN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2365:1: ( ( ( rule__FodaUN__Var1Assignment_0 ) ) )
            // InternalPLhlcl.g:2366:1: ( ( rule__FodaUN__Var1Assignment_0 ) )
            {
            // InternalPLhlcl.g:2366:1: ( ( rule__FodaUN__Var1Assignment_0 ) )
            // InternalPLhlcl.g:2367:2: ( rule__FodaUN__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaUNAccess().getVar1Assignment_0()); 
            // InternalPLhlcl.g:2368:2: ( rule__FodaUN__Var1Assignment_0 )
            // InternalPLhlcl.g:2368:3: rule__FodaUN__Var1Assignment_0
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
    // InternalPLhlcl.g:2376:1: rule__FodaUN__Group__1 : rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 ;
    public final void rule__FodaUN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2380:1: ( rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 )
            // InternalPLhlcl.g:2381:2: rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2
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
    // InternalPLhlcl.g:2388:1: rule__FodaUN__Group__1__Impl : ( 'is' ) ;
    public final void rule__FodaUN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2392:1: ( ( 'is' ) )
            // InternalPLhlcl.g:2393:1: ( 'is' )
            {
            // InternalPLhlcl.g:2393:1: ( 'is' )
            // InternalPLhlcl.g:2394:2: 'is'
            {
             before(grammarAccess.getFodaUNAccess().getIsKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPLhlcl.g:2403:1: rule__FodaUN__Group__2 : rule__FodaUN__Group__2__Impl ;
    public final void rule__FodaUN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2407:1: ( rule__FodaUN__Group__2__Impl )
            // InternalPLhlcl.g:2408:2: rule__FodaUN__Group__2__Impl
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
    // InternalPLhlcl.g:2414:1: rule__FodaUN__Group__2__Impl : ( ( rule__FodaUN__OpAssignment_2 ) ) ;
    public final void rule__FodaUN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2418:1: ( ( ( rule__FodaUN__OpAssignment_2 ) ) )
            // InternalPLhlcl.g:2419:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            {
            // InternalPLhlcl.g:2419:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            // InternalPLhlcl.g:2420:2: ( rule__FodaUN__OpAssignment_2 )
            {
             before(grammarAccess.getFodaUNAccess().getOpAssignment_2()); 
            // InternalPLhlcl.g:2421:2: ( rule__FodaUN__OpAssignment_2 )
            // InternalPLhlcl.g:2421:3: rule__FodaUN__OpAssignment_2
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
    // InternalPLhlcl.g:2430:1: rule__FodaBin__Group__0 : rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 ;
    public final void rule__FodaBin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2434:1: ( rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 )
            // InternalPLhlcl.g:2435:2: rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1
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
    // InternalPLhlcl.g:2442:1: rule__FodaBin__Group__0__Impl : ( ( rule__FodaBin__Var1Assignment_0 ) ) ;
    public final void rule__FodaBin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2446:1: ( ( ( rule__FodaBin__Var1Assignment_0 ) ) )
            // InternalPLhlcl.g:2447:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            {
            // InternalPLhlcl.g:2447:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            // InternalPLhlcl.g:2448:2: ( rule__FodaBin__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaBinAccess().getVar1Assignment_0()); 
            // InternalPLhlcl.g:2449:2: ( rule__FodaBin__Var1Assignment_0 )
            // InternalPLhlcl.g:2449:3: rule__FodaBin__Var1Assignment_0
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
    // InternalPLhlcl.g:2457:1: rule__FodaBin__Group__1 : rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 ;
    public final void rule__FodaBin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2461:1: ( rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 )
            // InternalPLhlcl.g:2462:2: rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2
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
    // InternalPLhlcl.g:2469:1: rule__FodaBin__Group__1__Impl : ( ( rule__FodaBin__OpAssignment_1 ) ) ;
    public final void rule__FodaBin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2473:1: ( ( ( rule__FodaBin__OpAssignment_1 ) ) )
            // InternalPLhlcl.g:2474:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            {
            // InternalPLhlcl.g:2474:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            // InternalPLhlcl.g:2475:2: ( rule__FodaBin__OpAssignment_1 )
            {
             before(grammarAccess.getFodaBinAccess().getOpAssignment_1()); 
            // InternalPLhlcl.g:2476:2: ( rule__FodaBin__OpAssignment_1 )
            // InternalPLhlcl.g:2476:3: rule__FodaBin__OpAssignment_1
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
    // InternalPLhlcl.g:2484:1: rule__FodaBin__Group__2 : rule__FodaBin__Group__2__Impl ;
    public final void rule__FodaBin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2488:1: ( rule__FodaBin__Group__2__Impl )
            // InternalPLhlcl.g:2489:2: rule__FodaBin__Group__2__Impl
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
    // InternalPLhlcl.g:2495:1: rule__FodaBin__Group__2__Impl : ( ( rule__FodaBin__Var2Assignment_2 ) ) ;
    public final void rule__FodaBin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2499:1: ( ( ( rule__FodaBin__Var2Assignment_2 ) ) )
            // InternalPLhlcl.g:2500:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            {
            // InternalPLhlcl.g:2500:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            // InternalPLhlcl.g:2501:2: ( rule__FodaBin__Var2Assignment_2 )
            {
             before(grammarAccess.getFodaBinAccess().getVar2Assignment_2()); 
            // InternalPLhlcl.g:2502:2: ( rule__FodaBin__Var2Assignment_2 )
            // InternalPLhlcl.g:2502:3: rule__FodaBin__Var2Assignment_2
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


    // $ANTLR start "rule__Structural__Group__0"
    // InternalPLhlcl.g:2511:1: rule__Structural__Group__0 : rule__Structural__Group__0__Impl rule__Structural__Group__1 ;
    public final void rule__Structural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2515:1: ( rule__Structural__Group__0__Impl rule__Structural__Group__1 )
            // InternalPLhlcl.g:2516:2: rule__Structural__Group__0__Impl rule__Structural__Group__1
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
    // InternalPLhlcl.g:2523:1: rule__Structural__Group__0__Impl : ( 'structural:' ) ;
    public final void rule__Structural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2527:1: ( ( 'structural:' ) )
            // InternalPLhlcl.g:2528:1: ( 'structural:' )
            {
            // InternalPLhlcl.g:2528:1: ( 'structural:' )
            // InternalPLhlcl.g:2529:2: 'structural:'
            {
             before(grammarAccess.getStructuralAccess().getStructuralKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPLhlcl.g:2538:1: rule__Structural__Group__1 : rule__Structural__Group__1__Impl rule__Structural__Group__2 ;
    public final void rule__Structural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2542:1: ( rule__Structural__Group__1__Impl rule__Structural__Group__2 )
            // InternalPLhlcl.g:2543:2: rule__Structural__Group__1__Impl rule__Structural__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalPLhlcl.g:2550:1: rule__Structural__Group__1__Impl : ( ( rule__Structural__ParentAssignment_1 ) ) ;
    public final void rule__Structural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2554:1: ( ( ( rule__Structural__ParentAssignment_1 ) ) )
            // InternalPLhlcl.g:2555:1: ( ( rule__Structural__ParentAssignment_1 ) )
            {
            // InternalPLhlcl.g:2555:1: ( ( rule__Structural__ParentAssignment_1 ) )
            // InternalPLhlcl.g:2556:2: ( rule__Structural__ParentAssignment_1 )
            {
             before(grammarAccess.getStructuralAccess().getParentAssignment_1()); 
            // InternalPLhlcl.g:2557:2: ( rule__Structural__ParentAssignment_1 )
            // InternalPLhlcl.g:2557:3: rule__Structural__ParentAssignment_1
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
    // InternalPLhlcl.g:2565:1: rule__Structural__Group__2 : rule__Structural__Group__2__Impl rule__Structural__Group__3 ;
    public final void rule__Structural__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2569:1: ( rule__Structural__Group__2__Impl rule__Structural__Group__3 )
            // InternalPLhlcl.g:2570:2: rule__Structural__Group__2__Impl rule__Structural__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalPLhlcl.g:2577:1: rule__Structural__Group__2__Impl : ( 'variants:' ) ;
    public final void rule__Structural__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2581:1: ( ( 'variants:' ) )
            // InternalPLhlcl.g:2582:1: ( 'variants:' )
            {
            // InternalPLhlcl.g:2582:1: ( 'variants:' )
            // InternalPLhlcl.g:2583:2: 'variants:'
            {
             before(grammarAccess.getStructuralAccess().getVariantsKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPLhlcl.g:2592:1: rule__Structural__Group__3 : rule__Structural__Group__3__Impl rule__Structural__Group__4 ;
    public final void rule__Structural__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2596:1: ( rule__Structural__Group__3__Impl rule__Structural__Group__4 )
            // InternalPLhlcl.g:2597:2: rule__Structural__Group__3__Impl rule__Structural__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalPLhlcl.g:2604:1: rule__Structural__Group__3__Impl : ( ( rule__Structural__GroupAssignment_3 ) ) ;
    public final void rule__Structural__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2608:1: ( ( ( rule__Structural__GroupAssignment_3 ) ) )
            // InternalPLhlcl.g:2609:1: ( ( rule__Structural__GroupAssignment_3 ) )
            {
            // InternalPLhlcl.g:2609:1: ( ( rule__Structural__GroupAssignment_3 ) )
            // InternalPLhlcl.g:2610:2: ( rule__Structural__GroupAssignment_3 )
            {
             before(grammarAccess.getStructuralAccess().getGroupAssignment_3()); 
            // InternalPLhlcl.g:2611:2: ( rule__Structural__GroupAssignment_3 )
            // InternalPLhlcl.g:2611:3: rule__Structural__GroupAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Structural__GroupAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStructuralAccess().getGroupAssignment_3()); 

            }


            }

        }
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
    // InternalPLhlcl.g:2619:1: rule__Structural__Group__4 : rule__Structural__Group__4__Impl ;
    public final void rule__Structural__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2623:1: ( rule__Structural__Group__4__Impl )
            // InternalPLhlcl.g:2624:2: rule__Structural__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structural__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalPLhlcl.g:2630:1: rule__Structural__Group__4__Impl : ( ( rule__Structural__Group_4__0 )? ) ;
    public final void rule__Structural__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2634:1: ( ( ( rule__Structural__Group_4__0 )? ) )
            // InternalPLhlcl.g:2635:1: ( ( rule__Structural__Group_4__0 )? )
            {
            // InternalPLhlcl.g:2635:1: ( ( rule__Structural__Group_4__0 )? )
            // InternalPLhlcl.g:2636:2: ( rule__Structural__Group_4__0 )?
            {
             before(grammarAccess.getStructuralAccess().getGroup_4()); 
            // InternalPLhlcl.g:2637:2: ( rule__Structural__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPLhlcl.g:2637:3: rule__Structural__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structural__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructuralAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Structural__Group_4__0"
    // InternalPLhlcl.g:2646:1: rule__Structural__Group_4__0 : rule__Structural__Group_4__0__Impl rule__Structural__Group_4__1 ;
    public final void rule__Structural__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2650:1: ( rule__Structural__Group_4__0__Impl rule__Structural__Group_4__1 )
            // InternalPLhlcl.g:2651:2: rule__Structural__Group_4__0__Impl rule__Structural__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Structural__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__0"


    // $ANTLR start "rule__Structural__Group_4__0__Impl"
    // InternalPLhlcl.g:2658:1: rule__Structural__Group_4__0__Impl : ( 'card:' ) ;
    public final void rule__Structural__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2662:1: ( ( 'card:' ) )
            // InternalPLhlcl.g:2663:1: ( 'card:' )
            {
            // InternalPLhlcl.g:2663:1: ( 'card:' )
            // InternalPLhlcl.g:2664:2: 'card:'
            {
             before(grammarAccess.getStructuralAccess().getCardKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getCardKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__0__Impl"


    // $ANTLR start "rule__Structural__Group_4__1"
    // InternalPLhlcl.g:2673:1: rule__Structural__Group_4__1 : rule__Structural__Group_4__1__Impl rule__Structural__Group_4__2 ;
    public final void rule__Structural__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2677:1: ( rule__Structural__Group_4__1__Impl rule__Structural__Group_4__2 )
            // InternalPLhlcl.g:2678:2: rule__Structural__Group_4__1__Impl rule__Structural__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Structural__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__1"


    // $ANTLR start "rule__Structural__Group_4__1__Impl"
    // InternalPLhlcl.g:2685:1: rule__Structural__Group_4__1__Impl : ( '[' ) ;
    public final void rule__Structural__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2689:1: ( ( '[' ) )
            // InternalPLhlcl.g:2690:1: ( '[' )
            {
            // InternalPLhlcl.g:2690:1: ( '[' )
            // InternalPLhlcl.g:2691:2: '['
            {
             before(grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__1__Impl"


    // $ANTLR start "rule__Structural__Group_4__2"
    // InternalPLhlcl.g:2700:1: rule__Structural__Group_4__2 : rule__Structural__Group_4__2__Impl rule__Structural__Group_4__3 ;
    public final void rule__Structural__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2704:1: ( rule__Structural__Group_4__2__Impl rule__Structural__Group_4__3 )
            // InternalPLhlcl.g:2705:2: rule__Structural__Group_4__2__Impl rule__Structural__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__Structural__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__2"


    // $ANTLR start "rule__Structural__Group_4__2__Impl"
    // InternalPLhlcl.g:2712:1: rule__Structural__Group_4__2__Impl : ( ( rule__Structural__MinAssignment_4_2 )? ) ;
    public final void rule__Structural__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2716:1: ( ( ( rule__Structural__MinAssignment_4_2 )? ) )
            // InternalPLhlcl.g:2717:1: ( ( rule__Structural__MinAssignment_4_2 )? )
            {
            // InternalPLhlcl.g:2717:1: ( ( rule__Structural__MinAssignment_4_2 )? )
            // InternalPLhlcl.g:2718:2: ( rule__Structural__MinAssignment_4_2 )?
            {
             before(grammarAccess.getStructuralAccess().getMinAssignment_4_2()); 
            // InternalPLhlcl.g:2719:2: ( rule__Structural__MinAssignment_4_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPLhlcl.g:2719:3: rule__Structural__MinAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structural__MinAssignment_4_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructuralAccess().getMinAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__2__Impl"


    // $ANTLR start "rule__Structural__Group_4__3"
    // InternalPLhlcl.g:2727:1: rule__Structural__Group_4__3 : rule__Structural__Group_4__3__Impl rule__Structural__Group_4__4 ;
    public final void rule__Structural__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2731:1: ( rule__Structural__Group_4__3__Impl rule__Structural__Group_4__4 )
            // InternalPLhlcl.g:2732:2: rule__Structural__Group_4__3__Impl rule__Structural__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__Structural__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__3"


    // $ANTLR start "rule__Structural__Group_4__3__Impl"
    // InternalPLhlcl.g:2739:1: rule__Structural__Group_4__3__Impl : ( ',' ) ;
    public final void rule__Structural__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2743:1: ( ( ',' ) )
            // InternalPLhlcl.g:2744:1: ( ',' )
            {
            // InternalPLhlcl.g:2744:1: ( ',' )
            // InternalPLhlcl.g:2745:2: ','
            {
             before(grammarAccess.getStructuralAccess().getCommaKeyword_4_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getCommaKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__3__Impl"


    // $ANTLR start "rule__Structural__Group_4__4"
    // InternalPLhlcl.g:2754:1: rule__Structural__Group_4__4 : rule__Structural__Group_4__4__Impl rule__Structural__Group_4__5 ;
    public final void rule__Structural__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2758:1: ( rule__Structural__Group_4__4__Impl rule__Structural__Group_4__5 )
            // InternalPLhlcl.g:2759:2: rule__Structural__Group_4__4__Impl rule__Structural__Group_4__5
            {
            pushFollow(FOLLOW_13);
            rule__Structural__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structural__Group_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__4"


    // $ANTLR start "rule__Structural__Group_4__4__Impl"
    // InternalPLhlcl.g:2766:1: rule__Structural__Group_4__4__Impl : ( ( rule__Structural__MaxAssignment_4_4 )? ) ;
    public final void rule__Structural__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2770:1: ( ( ( rule__Structural__MaxAssignment_4_4 )? ) )
            // InternalPLhlcl.g:2771:1: ( ( rule__Structural__MaxAssignment_4_4 )? )
            {
            // InternalPLhlcl.g:2771:1: ( ( rule__Structural__MaxAssignment_4_4 )? )
            // InternalPLhlcl.g:2772:2: ( rule__Structural__MaxAssignment_4_4 )?
            {
             before(grammarAccess.getStructuralAccess().getMaxAssignment_4_4()); 
            // InternalPLhlcl.g:2773:2: ( rule__Structural__MaxAssignment_4_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPLhlcl.g:2773:3: rule__Structural__MaxAssignment_4_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structural__MaxAssignment_4_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructuralAccess().getMaxAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__4__Impl"


    // $ANTLR start "rule__Structural__Group_4__5"
    // InternalPLhlcl.g:2781:1: rule__Structural__Group_4__5 : rule__Structural__Group_4__5__Impl ;
    public final void rule__Structural__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2785:1: ( rule__Structural__Group_4__5__Impl )
            // InternalPLhlcl.g:2786:2: rule__Structural__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structural__Group_4__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__5"


    // $ANTLR start "rule__Structural__Group_4__5__Impl"
    // InternalPLhlcl.g:2792:1: rule__Structural__Group_4__5__Impl : ( ']' ) ;
    public final void rule__Structural__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2796:1: ( ( ']' ) )
            // InternalPLhlcl.g:2797:1: ( ']' )
            {
            // InternalPLhlcl.g:2797:1: ( ']' )
            // InternalPLhlcl.g:2798:2: ']'
            {
             before(grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_4_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__Group_4__5__Impl"


    // $ANTLR start "rule__ListOfValues__Group__0"
    // InternalPLhlcl.g:2808:1: rule__ListOfValues__Group__0 : rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 ;
    public final void rule__ListOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2812:1: ( rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 )
            // InternalPLhlcl.g:2813:2: rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPLhlcl.g:2820:1: rule__ListOfValues__Group__0__Impl : ( ( rule__ListOfValues__ValuesAssignment_0 ) ) ;
    public final void rule__ListOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2824:1: ( ( ( rule__ListOfValues__ValuesAssignment_0 ) ) )
            // InternalPLhlcl.g:2825:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            {
            // InternalPLhlcl.g:2825:1: ( ( rule__ListOfValues__ValuesAssignment_0 ) )
            // InternalPLhlcl.g:2826:2: ( rule__ListOfValues__ValuesAssignment_0 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_0()); 
            // InternalPLhlcl.g:2827:2: ( rule__ListOfValues__ValuesAssignment_0 )
            // InternalPLhlcl.g:2827:3: rule__ListOfValues__ValuesAssignment_0
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
    // InternalPLhlcl.g:2835:1: rule__ListOfValues__Group__1 : rule__ListOfValues__Group__1__Impl ;
    public final void rule__ListOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2839:1: ( rule__ListOfValues__Group__1__Impl )
            // InternalPLhlcl.g:2840:2: rule__ListOfValues__Group__1__Impl
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
    // InternalPLhlcl.g:2846:1: rule__ListOfValues__Group__1__Impl : ( ( rule__ListOfValues__Group_1__0 )* ) ;
    public final void rule__ListOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2850:1: ( ( ( rule__ListOfValues__Group_1__0 )* ) )
            // InternalPLhlcl.g:2851:1: ( ( rule__ListOfValues__Group_1__0 )* )
            {
            // InternalPLhlcl.g:2851:1: ( ( rule__ListOfValues__Group_1__0 )* )
            // InternalPLhlcl.g:2852:2: ( rule__ListOfValues__Group_1__0 )*
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalPLhlcl.g:2853:2: ( rule__ListOfValues__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPLhlcl.g:2853:3: rule__ListOfValues__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ListOfValues__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalPLhlcl.g:2862:1: rule__ListOfValues__Group_1__0 : rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 ;
    public final void rule__ListOfValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2866:1: ( rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 )
            // InternalPLhlcl.g:2867:2: rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1
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
    // InternalPLhlcl.g:2874:1: rule__ListOfValues__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2878:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalPLhlcl.g:2879:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalPLhlcl.g:2879:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalPLhlcl.g:2880:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalPLhlcl.g:2880:2: ( ( ',' ) )
            // InternalPLhlcl.g:2881:3: ( ',' )
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:2882:3: ( ',' )
            // InternalPLhlcl.g:2882:4: ','
            {
            match(input,24,FOLLOW_26); 

            }

             after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 

            }

            // InternalPLhlcl.g:2885:2: ( ( ',' )* )
            // InternalPLhlcl.g:2886:3: ( ',' )*
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:2887:3: ( ',' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPLhlcl.g:2887:4: ','
            	    {
            	    match(input,24,FOLLOW_26); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalPLhlcl.g:2896:1: rule__ListOfValues__Group_1__1 : rule__ListOfValues__Group_1__1__Impl ;
    public final void rule__ListOfValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2900:1: ( rule__ListOfValues__Group_1__1__Impl )
            // InternalPLhlcl.g:2901:2: rule__ListOfValues__Group_1__1__Impl
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
    // InternalPLhlcl.g:2907:1: rule__ListOfValues__Group_1__1__Impl : ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) ;
    public final void rule__ListOfValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2911:1: ( ( ( rule__ListOfValues__ValuesAssignment_1_1 ) ) )
            // InternalPLhlcl.g:2912:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            {
            // InternalPLhlcl.g:2912:1: ( ( rule__ListOfValues__ValuesAssignment_1_1 ) )
            // InternalPLhlcl.g:2913:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1()); 
            // InternalPLhlcl.g:2914:2: ( rule__ListOfValues__ValuesAssignment_1_1 )
            // InternalPLhlcl.g:2914:3: rule__ListOfValues__ValuesAssignment_1_1
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
    // InternalPLhlcl.g:2923:1: rule__ListOfIDs__Group__0 : rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 ;
    public final void rule__ListOfIDs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2927:1: ( rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 )
            // InternalPLhlcl.g:2928:2: rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPLhlcl.g:2935:1: rule__ListOfIDs__Group__0__Impl : ( ( rule__ListOfIDs__IdsAssignment_0 ) ) ;
    public final void rule__ListOfIDs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2939:1: ( ( ( rule__ListOfIDs__IdsAssignment_0 ) ) )
            // InternalPLhlcl.g:2940:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            {
            // InternalPLhlcl.g:2940:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            // InternalPLhlcl.g:2941:2: ( rule__ListOfIDs__IdsAssignment_0 )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment_0()); 
            // InternalPLhlcl.g:2942:2: ( rule__ListOfIDs__IdsAssignment_0 )
            // InternalPLhlcl.g:2942:3: rule__ListOfIDs__IdsAssignment_0
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
    // InternalPLhlcl.g:2950:1: rule__ListOfIDs__Group__1 : rule__ListOfIDs__Group__1__Impl ;
    public final void rule__ListOfIDs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2954:1: ( rule__ListOfIDs__Group__1__Impl )
            // InternalPLhlcl.g:2955:2: rule__ListOfIDs__Group__1__Impl
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
    // InternalPLhlcl.g:2961:1: rule__ListOfIDs__Group__1__Impl : ( ( rule__ListOfIDs__Group_1__0 )* ) ;
    public final void rule__ListOfIDs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2965:1: ( ( ( rule__ListOfIDs__Group_1__0 )* ) )
            // InternalPLhlcl.g:2966:1: ( ( rule__ListOfIDs__Group_1__0 )* )
            {
            // InternalPLhlcl.g:2966:1: ( ( rule__ListOfIDs__Group_1__0 )* )
            // InternalPLhlcl.g:2967:2: ( rule__ListOfIDs__Group_1__0 )*
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalPLhlcl.g:2968:2: ( rule__ListOfIDs__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPLhlcl.g:2968:3: rule__ListOfIDs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ListOfIDs__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalPLhlcl.g:2977:1: rule__ListOfIDs__Group_1__0 : rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 ;
    public final void rule__ListOfIDs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2981:1: ( rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 )
            // InternalPLhlcl.g:2982:2: rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1
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
    // InternalPLhlcl.g:2989:1: rule__ListOfIDs__Group_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__ListOfIDs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:2993:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalPLhlcl.g:2994:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalPLhlcl.g:2994:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalPLhlcl.g:2995:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalPLhlcl.g:2995:2: ( ( ',' ) )
            // InternalPLhlcl.g:2996:3: ( ',' )
            {
             before(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:2997:3: ( ',' )
            // InternalPLhlcl.g:2997:4: ','
            {
            match(input,24,FOLLOW_26); 

            }

             after(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 

            }

            // InternalPLhlcl.g:3000:2: ( ( ',' )* )
            // InternalPLhlcl.g:3001:3: ( ',' )*
            {
             before(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 
            // InternalPLhlcl.g:3002:3: ( ',' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPLhlcl.g:3002:4: ','
            	    {
            	    match(input,24,FOLLOW_26); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalPLhlcl.g:3011:1: rule__ListOfIDs__Group_1__1 : rule__ListOfIDs__Group_1__1__Impl ;
    public final void rule__ListOfIDs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3015:1: ( rule__ListOfIDs__Group_1__1__Impl )
            // InternalPLhlcl.g:3016:2: rule__ListOfIDs__Group_1__1__Impl
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
    // InternalPLhlcl.g:3022:1: rule__ListOfIDs__Group_1__1__Impl : ( ( rule__ListOfIDs__IdsAssignment_1_1 ) ) ;
    public final void rule__ListOfIDs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3026:1: ( ( ( rule__ListOfIDs__IdsAssignment_1_1 ) ) )
            // InternalPLhlcl.g:3027:1: ( ( rule__ListOfIDs__IdsAssignment_1_1 ) )
            {
            // InternalPLhlcl.g:3027:1: ( ( rule__ListOfIDs__IdsAssignment_1_1 ) )
            // InternalPLhlcl.g:3028:2: ( rule__ListOfIDs__IdsAssignment_1_1 )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment_1_1()); 
            // InternalPLhlcl.g:3029:2: ( rule__ListOfIDs__IdsAssignment_1_1 )
            // InternalPLhlcl.g:3029:3: rule__ListOfIDs__IdsAssignment_1_1
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
    // InternalPLhlcl.g:3038:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3042:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3043:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3043:2: ( RULE_ID )
            // InternalPLhlcl.g:3044:3: RULE_ID
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
    // InternalPLhlcl.g:3053:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3057:1: ( ( ruleVarDeclaration ) )
            // InternalPLhlcl.g:3058:2: ( ruleVarDeclaration )
            {
            // InternalPLhlcl.g:3058:2: ( ruleVarDeclaration )
            // InternalPLhlcl.g:3059:3: ruleVarDeclaration
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
    // InternalPLhlcl.g:3068:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3072:1: ( ( ruleConstraint ) )
            // InternalPLhlcl.g:3073:2: ( ruleConstraint )
            {
            // InternalPLhlcl.g:3073:2: ( ruleConstraint )
            // InternalPLhlcl.g:3074:3: ruleConstraint
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
    // InternalPLhlcl.g:3083:1: rule__VarDeclaration__InstantiableAssignment_0_0 : ( ( 'instantiable' ) ) ;
    public final void rule__VarDeclaration__InstantiableAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3087:1: ( ( ( 'instantiable' ) ) )
            // InternalPLhlcl.g:3088:2: ( ( 'instantiable' ) )
            {
            // InternalPLhlcl.g:3088:2: ( ( 'instantiable' ) )
            // InternalPLhlcl.g:3089:3: ( 'instantiable' )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 
            // InternalPLhlcl.g:3090:3: ( 'instantiable' )
            // InternalPLhlcl.g:3091:4: 'instantiable'
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPLhlcl.g:3102:1: rule__VarDeclaration__MinAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__VarDeclaration__MinAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3106:1: ( ( RULE_INT ) )
            // InternalPLhlcl.g:3107:2: ( RULE_INT )
            {
            // InternalPLhlcl.g:3107:2: ( RULE_INT )
            // InternalPLhlcl.g:3108:3: RULE_INT
            {
             before(grammarAccess.getVarDeclarationAccess().getMinINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getMinINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
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
    // InternalPLhlcl.g:3117:1: rule__VarDeclaration__MaxAssignment_0_4 : ( RULE_INT ) ;
    public final void rule__VarDeclaration__MaxAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3121:1: ( ( RULE_INT ) )
            // InternalPLhlcl.g:3122:2: ( RULE_INT )
            {
            // InternalPLhlcl.g:3122:2: ( RULE_INT )
            // InternalPLhlcl.g:3123:3: RULE_INT
            {
             before(grammarAccess.getVarDeclarationAccess().getMaxINTTerminalRuleCall_0_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getMaxINTTerminalRuleCall_0_4_0()); 

            }


            }

        }
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
    // InternalPLhlcl.g:3132:1: rule__VarDeclaration__TypeAssignment_1 : ( ruleVarType ) ;
    public final void rule__VarDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3136:1: ( ( ruleVarType ) )
            // InternalPLhlcl.g:3137:2: ( ruleVarType )
            {
            // InternalPLhlcl.g:3137:2: ( ruleVarType )
            // InternalPLhlcl.g:3138:3: ruleVarType
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
    // InternalPLhlcl.g:3147:1: rule__VarDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3151:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3152:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3152:2: ( RULE_ID )
            // InternalPLhlcl.g:3153:3: RULE_ID
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


    // $ANTLR start "rule__VarDeclaration__VariantsAssignment_4"
    // InternalPLhlcl.g:3162:1: rule__VarDeclaration__VariantsAssignment_4 : ( ruleVariantDeclaration ) ;
    public final void rule__VarDeclaration__VariantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3166:1: ( ( ruleVariantDeclaration ) )
            // InternalPLhlcl.g:3167:2: ( ruleVariantDeclaration )
            {
            // InternalPLhlcl.g:3167:2: ( ruleVariantDeclaration )
            // InternalPLhlcl.g:3168:3: ruleVariantDeclaration
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__VariantsAssignment_4"


    // $ANTLR start "rule__VariantsInterval__StartAssignment_1"
    // InternalPLhlcl.g:3177:1: rule__VariantsInterval__StartAssignment_1 : ( ruleValue ) ;
    public final void rule__VariantsInterval__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3181:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3182:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3182:2: ( ruleValue )
            // InternalPLhlcl.g:3183:3: ruleValue
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getVariantsIntervalAccess().getStartValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__StartAssignment_1"


    // $ANTLR start "rule__VariantsInterval__EndAssignment_3"
    // InternalPLhlcl.g:3192:1: rule__VariantsInterval__EndAssignment_3 : ( ruleValue ) ;
    public final void rule__VariantsInterval__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3196:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3197:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3197:2: ( ruleValue )
            // InternalPLhlcl.g:3198:3: ruleValue
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getVariantsIntervalAccess().getEndValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsInterval__EndAssignment_3"


    // $ANTLR start "rule__VariantsEnumeration__ListAssignment_2"
    // InternalPLhlcl.g:3207:1: rule__VariantsEnumeration__ListAssignment_2 : ( ruleListOfValues ) ;
    public final void rule__VariantsEnumeration__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3211:1: ( ( ruleListOfValues ) )
            // InternalPLhlcl.g:3212:2: ( ruleListOfValues )
            {
            // InternalPLhlcl.g:3212:2: ( ruleListOfValues )
            // InternalPLhlcl.g:3213:3: ruleListOfValues
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListListOfValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getVariantsEnumerationAccess().getListListOfValuesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsEnumeration__ListAssignment_2"


    // $ANTLR start "rule__Constraint__NameAssignment_0"
    // InternalPLhlcl.g:3222:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3226:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3227:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3227:2: ( RULE_ID )
            // InternalPLhlcl.g:3228:3: RULE_ID
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
    // InternalPLhlcl.g:3237:1: rule__Constraint__ExpAssignment_2 : ( ruleConsExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3241:1: ( ( ruleConsExpression ) )
            // InternalPLhlcl.g:3242:2: ( ruleConsExpression )
            {
            // InternalPLhlcl.g:3242:2: ( ruleConsExpression )
            // InternalPLhlcl.g:3243:3: ruleConsExpression
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
    // InternalPLhlcl.g:3252:1: rule__IDCons__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDCons__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3256:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3257:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3257:2: ( RULE_ID )
            // InternalPLhlcl.g:3258:3: RULE_ID
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


    // $ANTLR start "rule__Assignment__VarAssignment_0"
    // InternalPLhlcl.g:3267:1: rule__Assignment__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3271:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3272:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3272:2: ( RULE_ID )
            // InternalPLhlcl.g:3273:3: RULE_ID
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
    // InternalPLhlcl.g:3282:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3286:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3287:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3287:2: ( ruleValue )
            // InternalPLhlcl.g:3288:3: ruleValue
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
    // InternalPLhlcl.g:3297:1: rule__VarRefinement__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3301:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3302:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3302:2: ( RULE_ID )
            // InternalPLhlcl.g:3303:3: RULE_ID
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
    // InternalPLhlcl.g:3312:1: rule__VarRefinement__ValuesAssignment_2 : ( ruleVariantDeclaration ) ;
    public final void rule__VarRefinement__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3316:1: ( ( ruleVariantDeclaration ) )
            // InternalPLhlcl.g:3317:2: ( ruleVariantDeclaration )
            {
            // InternalPLhlcl.g:3317:2: ( ruleVariantDeclaration )
            // InternalPLhlcl.g:3318:3: ruleVariantDeclaration
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
    // InternalPLhlcl.g:3327:1: rule__SetRefinement__VarsAssignment_2 : ( ruleListOfIDs ) ;
    public final void rule__SetRefinement__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3331:1: ( ( ruleListOfIDs ) )
            // InternalPLhlcl.g:3332:2: ( ruleListOfIDs )
            {
            // InternalPLhlcl.g:3332:2: ( ruleListOfIDs )
            // InternalPLhlcl.g:3333:3: ruleListOfIDs
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
    // InternalPLhlcl.g:3342:1: rule__SetRefinement__HeadAssignment_7 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__HeadAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3346:1: ( ( ruleListOfValues ) )
            // InternalPLhlcl.g:3347:2: ( ruleListOfValues )
            {
            // InternalPLhlcl.g:3347:2: ( ruleListOfValues )
            // InternalPLhlcl.g:3348:3: ruleListOfValues
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
    // InternalPLhlcl.g:3357:1: rule__SetRefinement__TailAssignment_9_2 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__TailAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3361:1: ( ( ruleListOfValues ) )
            // InternalPLhlcl.g:3362:2: ( ruleListOfValues )
            {
            // InternalPLhlcl.g:3362:2: ( ruleListOfValues )
            // InternalPLhlcl.g:3363:3: ruleListOfValues
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
    // InternalPLhlcl.g:3372:1: rule__Rule__ConditionAssignment_0 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3376:1: ( ( ruleTerminalExp ) )
            // InternalPLhlcl.g:3377:2: ( ruleTerminalExp )
            {
            // InternalPLhlcl.g:3377:2: ( ruleTerminalExp )
            // InternalPLhlcl.g:3378:3: ruleTerminalExp
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
    // InternalPLhlcl.g:3387:1: rule__Rule__ConsequenceAssignment_2 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConsequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3391:1: ( ( ruleTerminalExp ) )
            // InternalPLhlcl.g:3392:2: ( ruleTerminalExp )
            {
            // InternalPLhlcl.g:3392:2: ( ruleTerminalExp )
            // InternalPLhlcl.g:3393:3: ruleTerminalExp
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
    // InternalPLhlcl.g:3402:1: rule__FodaUN__Var1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FodaUN__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3406:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3407:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3407:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3408:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaUNAccess().getVar1VarDeclarationCrossReference_0_0()); 
            // InternalPLhlcl.g:3409:3: ( RULE_ID )
            // InternalPLhlcl.g:3410:4: RULE_ID
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
    // InternalPLhlcl.g:3421:1: rule__FodaUN__OpAssignment_2 : ( ruleUnaryOp ) ;
    public final void rule__FodaUN__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3425:1: ( ( ruleUnaryOp ) )
            // InternalPLhlcl.g:3426:2: ( ruleUnaryOp )
            {
            // InternalPLhlcl.g:3426:2: ( ruleUnaryOp )
            // InternalPLhlcl.g:3427:3: ruleUnaryOp
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
    // InternalPLhlcl.g:3436:1: rule__FodaBin__Var1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FodaBin__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3440:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3441:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3441:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3442:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaBinAccess().getVar1VarDeclarationCrossReference_0_0()); 
            // InternalPLhlcl.g:3443:3: ( RULE_ID )
            // InternalPLhlcl.g:3444:4: RULE_ID
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
    // InternalPLhlcl.g:3455:1: rule__FodaBin__OpAssignment_1 : ( ruleBinOp ) ;
    public final void rule__FodaBin__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3459:1: ( ( ruleBinOp ) )
            // InternalPLhlcl.g:3460:2: ( ruleBinOp )
            {
            // InternalPLhlcl.g:3460:2: ( ruleBinOp )
            // InternalPLhlcl.g:3461:3: ruleBinOp
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
    // InternalPLhlcl.g:3470:1: rule__FodaBin__Var2Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FodaBin__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3474:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3475:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3475:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3476:3: ( RULE_ID )
            {
             before(grammarAccess.getFodaBinAccess().getVar2VarDeclarationCrossReference_2_0()); 
            // InternalPLhlcl.g:3477:3: ( RULE_ID )
            // InternalPLhlcl.g:3478:4: RULE_ID
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


    // $ANTLR start "rule__Structural__ParentAssignment_1"
    // InternalPLhlcl.g:3489:1: rule__Structural__ParentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Structural__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3493:1: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3494:2: ( RULE_ID )
            {
            // InternalPLhlcl.g:3494:2: ( RULE_ID )
            // InternalPLhlcl.g:3495:3: RULE_ID
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


    // $ANTLR start "rule__Structural__GroupAssignment_3"
    // InternalPLhlcl.g:3504:1: rule__Structural__GroupAssignment_3 : ( ruleListOfIDs ) ;
    public final void rule__Structural__GroupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3508:1: ( ( ruleListOfIDs ) )
            // InternalPLhlcl.g:3509:2: ( ruleListOfIDs )
            {
            // InternalPLhlcl.g:3509:2: ( ruleListOfIDs )
            // InternalPLhlcl.g:3510:3: ruleListOfIDs
            {
             before(grammarAccess.getStructuralAccess().getGroupListOfIDsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getStructuralAccess().getGroupListOfIDsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__GroupAssignment_3"


    // $ANTLR start "rule__Structural__MinAssignment_4_2"
    // InternalPLhlcl.g:3519:1: rule__Structural__MinAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__Structural__MinAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3523:1: ( ( RULE_INT ) )
            // InternalPLhlcl.g:3524:2: ( RULE_INT )
            {
            // InternalPLhlcl.g:3524:2: ( RULE_INT )
            // InternalPLhlcl.g:3525:3: RULE_INT
            {
             before(grammarAccess.getStructuralAccess().getMinINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getMinINTTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__MinAssignment_4_2"


    // $ANTLR start "rule__Structural__MaxAssignment_4_4"
    // InternalPLhlcl.g:3534:1: rule__Structural__MaxAssignment_4_4 : ( RULE_INT ) ;
    public final void rule__Structural__MaxAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3538:1: ( ( RULE_INT ) )
            // InternalPLhlcl.g:3539:2: ( RULE_INT )
            {
            // InternalPLhlcl.g:3539:2: ( RULE_INT )
            // InternalPLhlcl.g:3540:3: RULE_INT
            {
             before(grammarAccess.getStructuralAccess().getMaxINTTerminalRuleCall_4_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStructuralAccess().getMaxINTTerminalRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structural__MaxAssignment_4_4"


    // $ANTLR start "rule__ListOfValues__ValuesAssignment_0"
    // InternalPLhlcl.g:3549:1: rule__ListOfValues__ValuesAssignment_0 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3553:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3554:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3554:2: ( ruleValue )
            // InternalPLhlcl.g:3555:3: ruleValue
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
    // InternalPLhlcl.g:3564:1: rule__ListOfValues__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3568:1: ( ( ruleValue ) )
            // InternalPLhlcl.g:3569:2: ( ruleValue )
            {
            // InternalPLhlcl.g:3569:2: ( ruleValue )
            // InternalPLhlcl.g:3570:3: ruleValue
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
    // InternalPLhlcl.g:3579:1: rule__ListOfIDs__IdsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListOfIDs__IdsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3583:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3584:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3584:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3585:3: ( RULE_ID )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_0_0()); 
            // InternalPLhlcl.g:3586:3: ( RULE_ID )
            // InternalPLhlcl.g:3587:4: RULE_ID
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
    // InternalPLhlcl.g:3598:1: rule__ListOfIDs__IdsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListOfIDs__IdsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPLhlcl.g:3602:1: ( ( ( RULE_ID ) ) )
            // InternalPLhlcl.g:3603:2: ( ( RULE_ID ) )
            {
            // InternalPLhlcl.g:3603:2: ( ( RULE_ID ) )
            // InternalPLhlcl.g:3604:3: ( RULE_ID )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_1_1_0()); 
            // InternalPLhlcl.g:3605:3: ( RULE_ID )
            // InternalPLhlcl.g:3606:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000806000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000806002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000801810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000910000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});

}