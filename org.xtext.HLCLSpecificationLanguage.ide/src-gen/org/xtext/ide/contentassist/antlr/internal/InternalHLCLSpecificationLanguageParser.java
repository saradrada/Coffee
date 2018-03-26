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
import org.xtext.services.HLCLSpecificationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHLCLSpecificationLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'selected'", "'unselected'", "'boolean'", "'numeric'", "'optional'", "'mandatory'", "'requires'", "'excludes'", "'model'", "'variables:'", "'constraints:'", "'variants:'", "'::'", "'['", "']'", "':'", "'('", "')'", "'is'", "'in'", "'variants'", "','", "'-->'", "'instantiable'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalHLCLSpecificationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHLCLSpecificationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHLCLSpecificationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHLCLSpecificationLanguage.g"; }


    	private HLCLSpecificationLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(HLCLSpecificationLanguageGrammarAccess grammarAccess) {
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
    // InternalHLCLSpecificationLanguage.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:54:1: ( ruleModel EOF )
            // InternalHLCLSpecificationLanguage.g:55:1: ruleModel EOF
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
    // InternalHLCLSpecificationLanguage.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:69:3: ( rule__Model__Group__0 )
            // InternalHLCLSpecificationLanguage.g:69:4: rule__Model__Group__0
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
    // InternalHLCLSpecificationLanguage.g:78:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:79:1: ( ruleVarDeclaration EOF )
            // InternalHLCLSpecificationLanguage.g:80:1: ruleVarDeclaration EOF
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
    // InternalHLCLSpecificationLanguage.g:87:1: ruleVarDeclaration : ( ( rule__VarDeclaration__UnorderedGroup ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:91:2: ( ( ( rule__VarDeclaration__UnorderedGroup ) ) )
            // InternalHLCLSpecificationLanguage.g:92:2: ( ( rule__VarDeclaration__UnorderedGroup ) )
            {
            // InternalHLCLSpecificationLanguage.g:92:2: ( ( rule__VarDeclaration__UnorderedGroup ) )
            // InternalHLCLSpecificationLanguage.g:93:3: ( rule__VarDeclaration__UnorderedGroup )
            {
             before(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()); 
            // InternalHLCLSpecificationLanguage.g:94:3: ( rule__VarDeclaration__UnorderedGroup )
            // InternalHLCLSpecificationLanguage.g:94:4: rule__VarDeclaration__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:103:1: entryRuleVariantDeclaration : ruleVariantDeclaration EOF ;
    public final void entryRuleVariantDeclaration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:104:1: ( ruleVariantDeclaration EOF )
            // InternalHLCLSpecificationLanguage.g:105:1: ruleVariantDeclaration EOF
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
    // InternalHLCLSpecificationLanguage.g:112:1: ruleVariantDeclaration : ( ( rule__VariantDeclaration__Alternatives ) ) ;
    public final void ruleVariantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:116:2: ( ( ( rule__VariantDeclaration__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:117:2: ( ( rule__VariantDeclaration__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:117:2: ( ( rule__VariantDeclaration__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:118:3: ( rule__VariantDeclaration__Alternatives )
            {
             before(grammarAccess.getVariantDeclarationAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:119:3: ( rule__VariantDeclaration__Alternatives )
            // InternalHLCLSpecificationLanguage.g:119:4: rule__VariantDeclaration__Alternatives
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


    // $ANTLR start "entryRulevariantsInterval"
    // InternalHLCLSpecificationLanguage.g:128:1: entryRulevariantsInterval : rulevariantsInterval EOF ;
    public final void entryRulevariantsInterval() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:129:1: ( rulevariantsInterval EOF )
            // InternalHLCLSpecificationLanguage.g:130:1: rulevariantsInterval EOF
            {
             before(grammarAccess.getVariantsIntervalRule()); 
            pushFollow(FOLLOW_1);
            rulevariantsInterval();

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
    // $ANTLR end "entryRulevariantsInterval"


    // $ANTLR start "rulevariantsInterval"
    // InternalHLCLSpecificationLanguage.g:137:1: rulevariantsInterval : ( ( rule__VariantsInterval__Group__0 ) ) ;
    public final void rulevariantsInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:141:2: ( ( ( rule__VariantsInterval__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:142:2: ( ( rule__VariantsInterval__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:142:2: ( ( rule__VariantsInterval__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:143:3: ( rule__VariantsInterval__Group__0 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:144:3: ( rule__VariantsInterval__Group__0 )
            // InternalHLCLSpecificationLanguage.g:144:4: rule__VariantsInterval__Group__0
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
    // $ANTLR end "rulevariantsInterval"


    // $ANTLR start "entryRulevariantsEnumeration"
    // InternalHLCLSpecificationLanguage.g:153:1: entryRulevariantsEnumeration : rulevariantsEnumeration EOF ;
    public final void entryRulevariantsEnumeration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:154:1: ( rulevariantsEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:155:1: rulevariantsEnumeration EOF
            {
             before(grammarAccess.getVariantsEnumerationRule()); 
            pushFollow(FOLLOW_1);
            rulevariantsEnumeration();

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
    // $ANTLR end "entryRulevariantsEnumeration"


    // $ANTLR start "rulevariantsEnumeration"
    // InternalHLCLSpecificationLanguage.g:162:1: rulevariantsEnumeration : ( ( rule__VariantsEnumeration__Group__0 ) ) ;
    public final void rulevariantsEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:166:2: ( ( ( rule__VariantsEnumeration__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:167:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:167:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:168:3: ( rule__VariantsEnumeration__Group__0 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:169:3: ( rule__VariantsEnumeration__Group__0 )
            // InternalHLCLSpecificationLanguage.g:169:4: rule__VariantsEnumeration__Group__0
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
    // $ANTLR end "rulevariantsEnumeration"


    // $ANTLR start "entryRuleEnumeration"
    // InternalHLCLSpecificationLanguage.g:178:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:179:1: ( ruleEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:180:1: ruleEnumeration EOF
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
    // InternalHLCLSpecificationLanguage.g:187:1: ruleEnumeration : ( ( rule__Enumeration__Alternatives ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:191:2: ( ( ( rule__Enumeration__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:192:2: ( ( rule__Enumeration__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:192:2: ( ( rule__Enumeration__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:193:3: ( rule__Enumeration__Alternatives )
            {
             before(grammarAccess.getEnumerationAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:194:3: ( rule__Enumeration__Alternatives )
            // InternalHLCLSpecificationLanguage.g:194:4: rule__Enumeration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:203:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:204:1: ( ruleConstraint EOF )
            // InternalHLCLSpecificationLanguage.g:205:1: ruleConstraint EOF
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
    // InternalHLCLSpecificationLanguage.g:212:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:216:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:217:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:217:2: ( ( rule__Constraint__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:218:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:219:3: ( rule__Constraint__Group__0 )
            // InternalHLCLSpecificationLanguage.g:219:4: rule__Constraint__Group__0
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
    // InternalHLCLSpecificationLanguage.g:228:1: entryRuleConsExpression : ruleConsExpression EOF ;
    public final void entryRuleConsExpression() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:229:1: ( ruleConsExpression EOF )
            // InternalHLCLSpecificationLanguage.g:230:1: ruleConsExpression EOF
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
    // InternalHLCLSpecificationLanguage.g:237:1: ruleConsExpression : ( ( rule__ConsExpression__Alternatives ) ) ;
    public final void ruleConsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:241:2: ( ( ( rule__ConsExpression__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:242:2: ( ( rule__ConsExpression__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:242:2: ( ( rule__ConsExpression__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:243:3: ( rule__ConsExpression__Alternatives )
            {
             before(grammarAccess.getConsExpressionAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:244:3: ( rule__ConsExpression__Alternatives )
            // InternalHLCLSpecificationLanguage.g:244:4: rule__ConsExpression__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:253:1: entryRuleTerminalExp : ruleTerminalExp EOF ;
    public final void entryRuleTerminalExp() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:254:1: ( ruleTerminalExp EOF )
            // InternalHLCLSpecificationLanguage.g:255:1: ruleTerminalExp EOF
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
    // InternalHLCLSpecificationLanguage.g:262:1: ruleTerminalExp : ( ( rule__TerminalExp__Alternatives ) ) ;
    public final void ruleTerminalExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:266:2: ( ( ( rule__TerminalExp__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:267:2: ( ( rule__TerminalExp__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:267:2: ( ( rule__TerminalExp__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:268:3: ( rule__TerminalExp__Alternatives )
            {
             before(grammarAccess.getTerminalExpAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:269:3: ( rule__TerminalExp__Alternatives )
            // InternalHLCLSpecificationLanguage.g:269:4: rule__TerminalExp__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:278:1: entryRuleIDCons : ruleIDCons EOF ;
    public final void entryRuleIDCons() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:279:1: ( ruleIDCons EOF )
            // InternalHLCLSpecificationLanguage.g:280:1: ruleIDCons EOF
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
    // InternalHLCLSpecificationLanguage.g:287:1: ruleIDCons : ( ( rule__IDCons__NameAssignment ) ) ;
    public final void ruleIDCons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:291:2: ( ( ( rule__IDCons__NameAssignment ) ) )
            // InternalHLCLSpecificationLanguage.g:292:2: ( ( rule__IDCons__NameAssignment ) )
            {
            // InternalHLCLSpecificationLanguage.g:292:2: ( ( rule__IDCons__NameAssignment ) )
            // InternalHLCLSpecificationLanguage.g:293:3: ( rule__IDCons__NameAssignment )
            {
             before(grammarAccess.getIDConsAccess().getNameAssignment()); 
            // InternalHLCLSpecificationLanguage.g:294:3: ( rule__IDCons__NameAssignment )
            // InternalHLCLSpecificationLanguage.g:294:4: rule__IDCons__NameAssignment
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
    // InternalHLCLSpecificationLanguage.g:303:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:304:1: ( ruleRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:305:1: ruleRefinement EOF
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
    // InternalHLCLSpecificationLanguage.g:312:1: ruleRefinement : ( ( rule__Refinement__Alternatives ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:316:2: ( ( ( rule__Refinement__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:317:2: ( ( rule__Refinement__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:317:2: ( ( rule__Refinement__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:318:3: ( rule__Refinement__Alternatives )
            {
             before(grammarAccess.getRefinementAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:319:3: ( rule__Refinement__Alternatives )
            // InternalHLCLSpecificationLanguage.g:319:4: rule__Refinement__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:328:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:329:1: ( ruleAssignment EOF )
            // InternalHLCLSpecificationLanguage.g:330:1: ruleAssignment EOF
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
    // InternalHLCLSpecificationLanguage.g:337:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:341:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:342:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:342:2: ( ( rule__Assignment__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:343:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:344:3: ( rule__Assignment__Group__0 )
            // InternalHLCLSpecificationLanguage.g:344:4: rule__Assignment__Group__0
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
    // InternalHLCLSpecificationLanguage.g:353:1: entryRuleVarRefinement : ruleVarRefinement EOF ;
    public final void entryRuleVarRefinement() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:354:1: ( ruleVarRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:355:1: ruleVarRefinement EOF
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
    // InternalHLCLSpecificationLanguage.g:362:1: ruleVarRefinement : ( ( rule__VarRefinement__Group__0 ) ) ;
    public final void ruleVarRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:366:2: ( ( ( rule__VarRefinement__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:367:2: ( ( rule__VarRefinement__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:367:2: ( ( rule__VarRefinement__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:368:3: ( rule__VarRefinement__Group__0 )
            {
             before(grammarAccess.getVarRefinementAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:369:3: ( rule__VarRefinement__Group__0 )
            // InternalHLCLSpecificationLanguage.g:369:4: rule__VarRefinement__Group__0
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
    // InternalHLCLSpecificationLanguage.g:378:1: entryRuleSetRefinement : ruleSetRefinement EOF ;
    public final void entryRuleSetRefinement() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:379:1: ( ruleSetRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:380:1: ruleSetRefinement EOF
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
    // InternalHLCLSpecificationLanguage.g:387:1: ruleSetRefinement : ( ( rule__SetRefinement__Group__0 ) ) ;
    public final void ruleSetRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:391:2: ( ( ( rule__SetRefinement__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:392:2: ( ( rule__SetRefinement__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:392:2: ( ( rule__SetRefinement__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:393:3: ( rule__SetRefinement__Group__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:394:3: ( rule__SetRefinement__Group__0 )
            // InternalHLCLSpecificationLanguage.g:394:4: rule__SetRefinement__Group__0
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
    // InternalHLCLSpecificationLanguage.g:403:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:404:1: ( ruleRule EOF )
            // InternalHLCLSpecificationLanguage.g:405:1: ruleRule EOF
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
    // InternalHLCLSpecificationLanguage.g:412:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:416:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:417:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:417:2: ( ( rule__Rule__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:418:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:419:3: ( rule__Rule__Group__0 )
            // InternalHLCLSpecificationLanguage.g:419:4: rule__Rule__Group__0
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


    // $ANTLR start "entryRuleSPLNotation"
    // InternalHLCLSpecificationLanguage.g:428:1: entryRuleSPLNotation : ruleSPLNotation EOF ;
    public final void entryRuleSPLNotation() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:429:1: ( ruleSPLNotation EOF )
            // InternalHLCLSpecificationLanguage.g:430:1: ruleSPLNotation EOF
            {
             before(grammarAccess.getSPLNotationRule()); 
            pushFollow(FOLLOW_1);
            ruleSPLNotation();

            state._fsp--;

             after(grammarAccess.getSPLNotationRule()); 
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
    // $ANTLR end "entryRuleSPLNotation"


    // $ANTLR start "ruleSPLNotation"
    // InternalHLCLSpecificationLanguage.g:437:1: ruleSPLNotation : ( ( rule__SPLNotation__Group__0 ) ) ;
    public final void ruleSPLNotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:441:2: ( ( ( rule__SPLNotation__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:442:2: ( ( rule__SPLNotation__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:442:2: ( ( rule__SPLNotation__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:443:3: ( rule__SPLNotation__Group__0 )
            {
             before(grammarAccess.getSPLNotationAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:444:3: ( rule__SPLNotation__Group__0 )
            // InternalHLCLSpecificationLanguage.g:444:4: rule__SPLNotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SPLNotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSPLNotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPLNotation"


    // $ANTLR start "entryRuleValue"
    // InternalHLCLSpecificationLanguage.g:453:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:454:1: ( ruleValue EOF )
            // InternalHLCLSpecificationLanguage.g:455:1: ruleValue EOF
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
    // InternalHLCLSpecificationLanguage.g:462:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:466:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:467:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:467:2: ( ( rule__Value__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:468:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:469:3: ( rule__Value__Alternatives )
            // InternalHLCLSpecificationLanguage.g:469:4: rule__Value__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:478:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:479:1: ( ruleVarType EOF )
            // InternalHLCLSpecificationLanguage.g:480:1: ruleVarType EOF
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
    // InternalHLCLSpecificationLanguage.g:487:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:491:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:492:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:492:2: ( ( rule__VarType__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:493:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:494:3: ( rule__VarType__Alternatives )
            // InternalHLCLSpecificationLanguage.g:494:4: rule__VarType__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:503:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:504:1: ( ruleListOfValues EOF )
            // InternalHLCLSpecificationLanguage.g:505:1: ruleListOfValues EOF
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
    // InternalHLCLSpecificationLanguage.g:512:1: ruleListOfValues : ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:516:2: ( ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) ) )
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) )
            // InternalHLCLSpecificationLanguage.g:518:3: ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* )
            {
            // InternalHLCLSpecificationLanguage.g:518:3: ( ( rule__ListOfValues__ValuesAssignment ) )
            // InternalHLCLSpecificationLanguage.g:519:4: ( rule__ListOfValues__ValuesAssignment )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 
            // InternalHLCLSpecificationLanguage.g:520:4: ( rule__ListOfValues__ValuesAssignment )
            // InternalHLCLSpecificationLanguage.g:520:5: rule__ListOfValues__ValuesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ListOfValues__ValuesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 

            }

            // InternalHLCLSpecificationLanguage.g:523:3: ( ( rule__ListOfValues__ValuesAssignment )* )
            // InternalHLCLSpecificationLanguage.g:524:4: ( rule__ListOfValues__ValuesAssignment )*
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 
            // InternalHLCLSpecificationLanguage.g:525:4: ( rule__ListOfValues__ValuesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||(LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:525:5: rule__ListOfValues__ValuesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ListOfValues__ValuesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 

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
    // InternalHLCLSpecificationLanguage.g:535:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:536:1: ( ruleListOfIDs EOF )
            // InternalHLCLSpecificationLanguage.g:537:1: ruleListOfIDs EOF
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
    // InternalHLCLSpecificationLanguage.g:544:1: ruleListOfIDs : ( ( rule__ListOfIDs__Group__0 ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:548:2: ( ( ( rule__ListOfIDs__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:549:2: ( ( rule__ListOfIDs__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:549:2: ( ( rule__ListOfIDs__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:550:3: ( rule__ListOfIDs__Group__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:551:3: ( rule__ListOfIDs__Group__0 )
            // InternalHLCLSpecificationLanguage.g:551:4: rule__ListOfIDs__Group__0
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


    // $ANTLR start "entryRuleSPLop"
    // InternalHLCLSpecificationLanguage.g:560:1: entryRuleSPLop : ruleSPLop EOF ;
    public final void entryRuleSPLop() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:561:1: ( ruleSPLop EOF )
            // InternalHLCLSpecificationLanguage.g:562:1: ruleSPLop EOF
            {
             before(grammarAccess.getSPLopRule()); 
            pushFollow(FOLLOW_1);
            ruleSPLop();

            state._fsp--;

             after(grammarAccess.getSPLopRule()); 
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
    // $ANTLR end "entryRuleSPLop"


    // $ANTLR start "ruleSPLop"
    // InternalHLCLSpecificationLanguage.g:569:1: ruleSPLop : ( ( rule__SPLop__Alternatives ) ) ;
    public final void ruleSPLop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:573:2: ( ( ( rule__SPLop__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:574:2: ( ( rule__SPLop__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:574:2: ( ( rule__SPLop__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:575:3: ( rule__SPLop__Alternatives )
            {
             before(grammarAccess.getSPLopAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:576:3: ( rule__SPLop__Alternatives )
            // InternalHLCLSpecificationLanguage.g:576:4: rule__SPLop__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SPLop__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSPLopAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPLop"


    // $ANTLR start "rule__VariantDeclaration__Alternatives"
    // InternalHLCLSpecificationLanguage.g:584:1: rule__VariantDeclaration__Alternatives : ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) );
    public final void rule__VariantDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:588:1: ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||(LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:589:2: ( rulevariantsInterval )
                    {
                    // InternalHLCLSpecificationLanguage.g:589:2: ( rulevariantsInterval )
                    // InternalHLCLSpecificationLanguage.g:590:3: rulevariantsInterval
                    {
                     before(grammarAccess.getVariantDeclarationAccess().getVariantsIntervalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulevariantsInterval();

                    state._fsp--;

                     after(grammarAccess.getVariantDeclarationAccess().getVariantsIntervalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:595:2: ( rulevariantsEnumeration )
                    {
                    // InternalHLCLSpecificationLanguage.g:595:2: ( rulevariantsEnumeration )
                    // InternalHLCLSpecificationLanguage.g:596:3: rulevariantsEnumeration
                    {
                     before(grammarAccess.getVariantDeclarationAccess().getVariantsEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulevariantsEnumeration();

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


    // $ANTLR start "rule__Enumeration__Alternatives"
    // InternalHLCLSpecificationLanguage.g:605:1: rule__Enumeration__Alternatives : ( ( ( rule__Enumeration__ValuesAssignment_0 ) ) | ( ruleListOfIDs ) );
    public final void rule__Enumeration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:609:1: ( ( ( rule__Enumeration__ValuesAssignment_0 ) ) | ( ruleListOfIDs ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||(LA3_0>=11 && LA3_0<=12)) ) {
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
                    // InternalHLCLSpecificationLanguage.g:610:2: ( ( rule__Enumeration__ValuesAssignment_0 ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:610:2: ( ( rule__Enumeration__ValuesAssignment_0 ) )
                    // InternalHLCLSpecificationLanguage.g:611:3: ( rule__Enumeration__ValuesAssignment_0 )
                    {
                     before(grammarAccess.getEnumerationAccess().getValuesAssignment_0()); 
                    // InternalHLCLSpecificationLanguage.g:612:3: ( rule__Enumeration__ValuesAssignment_0 )
                    // InternalHLCLSpecificationLanguage.g:612:4: rule__Enumeration__ValuesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enumeration__ValuesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumerationAccess().getValuesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:616:2: ( ruleListOfIDs )
                    {
                    // InternalHLCLSpecificationLanguage.g:616:2: ( ruleListOfIDs )
                    // InternalHLCLSpecificationLanguage.g:617:3: ruleListOfIDs
                    {
                     before(grammarAccess.getEnumerationAccess().getListOfIDsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListOfIDs();

                    state._fsp--;

                     after(grammarAccess.getEnumerationAccess().getListOfIDsParserRuleCall_1()); 

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
    // $ANTLR end "rule__Enumeration__Alternatives"


    // $ANTLR start "rule__ConsExpression__Alternatives"
    // InternalHLCLSpecificationLanguage.g:626:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleSPLNotation ) );
    public final void rule__ConsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:630:1: ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleSPLNotation ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 29:
                case 30:
                    {
                    alt4=2;
                    }
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    {
                    alt4=4;
                    }
                    break;
                case 33:
                    {
                    alt4=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 28:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA4_0==27) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_ID) ) {
                    int LA4_7 = input.LA(3);

                    if ( ((LA4_7>=15 && LA4_7<=18)||(LA4_7>=28 && LA4_7<=30)||LA4_7==33) ) {
                        alt4=3;
                    }
                    else if ( (LA4_7==32) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 7, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==27) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:631:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:631:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:632:3: ruleIDCons
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
                    // InternalHLCLSpecificationLanguage.g:637:2: ( ruleRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:637:2: ( ruleRefinement )
                    // InternalHLCLSpecificationLanguage.g:638:3: ruleRefinement
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
                    // InternalHLCLSpecificationLanguage.g:643:2: ( ruleRule )
                    {
                    // InternalHLCLSpecificationLanguage.g:643:2: ( ruleRule )
                    // InternalHLCLSpecificationLanguage.g:644:3: ruleRule
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
                    // InternalHLCLSpecificationLanguage.g:649:2: ( ruleSPLNotation )
                    {
                    // InternalHLCLSpecificationLanguage.g:649:2: ( ruleSPLNotation )
                    // InternalHLCLSpecificationLanguage.g:650:3: ruleSPLNotation
                    {
                     before(grammarAccess.getConsExpressionAccess().getSPLNotationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSPLNotation();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getSPLNotationParserRuleCall_3()); 

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
    // InternalHLCLSpecificationLanguage.g:659:1: rule__TerminalExp__Alternatives : ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) );
    public final void rule__TerminalExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:663:1: ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:664:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:664:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    // InternalHLCLSpecificationLanguage.g:665:3: ( rule__TerminalExp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpAccess().getGroup_0()); 
                    // InternalHLCLSpecificationLanguage.g:666:3: ( rule__TerminalExp__Group_0__0 )
                    // InternalHLCLSpecificationLanguage.g:666:4: rule__TerminalExp__Group_0__0
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
                    // InternalHLCLSpecificationLanguage.g:670:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:670:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:671:3: ruleIDCons
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
    // InternalHLCLSpecificationLanguage.g:680:1: rule__Refinement__Alternatives : ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) );
    public final void rule__Refinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:684:1: ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==30) ) {
                    alt6=2;
                }
                else if ( (LA6_1==29) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==27) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:685:2: ( ruleAssignment )
                    {
                    // InternalHLCLSpecificationLanguage.g:685:2: ( ruleAssignment )
                    // InternalHLCLSpecificationLanguage.g:686:3: ruleAssignment
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
                    // InternalHLCLSpecificationLanguage.g:691:2: ( ruleVarRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:691:2: ( ruleVarRefinement )
                    // InternalHLCLSpecificationLanguage.g:692:3: ruleVarRefinement
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
                    // InternalHLCLSpecificationLanguage.g:697:2: ( ruleSetRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:697:2: ( ruleSetRefinement )
                    // InternalHLCLSpecificationLanguage.g:698:3: ruleSetRefinement
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
    // InternalHLCLSpecificationLanguage.g:707:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:711:1: ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case 11:
                {
                alt7=2;
                }
                break;
            case 12:
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
                    // InternalHLCLSpecificationLanguage.g:712:2: ( RULE_INT )
                    {
                    // InternalHLCLSpecificationLanguage.g:712:2: ( RULE_INT )
                    // InternalHLCLSpecificationLanguage.g:713:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:718:2: ( 'selected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:718:2: ( 'selected' )
                    // InternalHLCLSpecificationLanguage.g:719:3: 'selected'
                    {
                     before(grammarAccess.getValueAccess().getSelectedKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSelectedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:724:2: ( 'unselected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:724:2: ( 'unselected' )
                    // InternalHLCLSpecificationLanguage.g:725:3: 'unselected'
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
    // InternalHLCLSpecificationLanguage.g:734:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'numeric' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:738:1: ( ( 'boolean' ) | ( 'numeric' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:739:2: ( 'boolean' )
                    {
                    // InternalHLCLSpecificationLanguage.g:739:2: ( 'boolean' )
                    // InternalHLCLSpecificationLanguage.g:740:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:745:2: ( 'numeric' )
                    {
                    // InternalHLCLSpecificationLanguage.g:745:2: ( 'numeric' )
                    // InternalHLCLSpecificationLanguage.g:746:3: 'numeric'
                    {
                     before(grammarAccess.getVarTypeAccess().getNumericKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getNumericKeyword_1()); 

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


    // $ANTLR start "rule__SPLop__Alternatives"
    // InternalHLCLSpecificationLanguage.g:755:1: rule__SPLop__Alternatives : ( ( 'optional' ) | ( 'mandatory' ) | ( 'requires' ) | ( 'excludes' ) );
    public final void rule__SPLop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:759:1: ( ( 'optional' ) | ( 'mandatory' ) | ( 'requires' ) | ( 'excludes' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
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
                    // InternalHLCLSpecificationLanguage.g:760:2: ( 'optional' )
                    {
                    // InternalHLCLSpecificationLanguage.g:760:2: ( 'optional' )
                    // InternalHLCLSpecificationLanguage.g:761:3: 'optional'
                    {
                     before(grammarAccess.getSPLopAccess().getOptionalKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getOptionalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:766:2: ( 'mandatory' )
                    {
                    // InternalHLCLSpecificationLanguage.g:766:2: ( 'mandatory' )
                    // InternalHLCLSpecificationLanguage.g:767:3: 'mandatory'
                    {
                     before(grammarAccess.getSPLopAccess().getMandatoryKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getMandatoryKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:772:2: ( 'requires' )
                    {
                    // InternalHLCLSpecificationLanguage.g:772:2: ( 'requires' )
                    // InternalHLCLSpecificationLanguage.g:773:3: 'requires'
                    {
                     before(grammarAccess.getSPLopAccess().getRequiresKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getRequiresKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHLCLSpecificationLanguage.g:778:2: ( 'excludes' )
                    {
                    // InternalHLCLSpecificationLanguage.g:778:2: ( 'excludes' )
                    // InternalHLCLSpecificationLanguage.g:779:3: 'excludes'
                    {
                     before(grammarAccess.getSPLopAccess().getExcludesKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getExcludesKeyword_3()); 

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
    // $ANTLR end "rule__SPLop__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalHLCLSpecificationLanguage.g:788:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:792:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHLCLSpecificationLanguage.g:793:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalHLCLSpecificationLanguage.g:800:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:804:1: ( ( 'model' ) )
            // InternalHLCLSpecificationLanguage.g:805:1: ( 'model' )
            {
            // InternalHLCLSpecificationLanguage.g:805:1: ( 'model' )
            // InternalHLCLSpecificationLanguage.g:806:2: 'model'
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
    // InternalHLCLSpecificationLanguage.g:815:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:819:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalHLCLSpecificationLanguage.g:820:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalHLCLSpecificationLanguage.g:827:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:831:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:832:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:832:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:833:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:834:2: ( rule__Model__NameAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:834:3: rule__Model__NameAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:842:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:846:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalHLCLSpecificationLanguage.g:847:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalHLCLSpecificationLanguage.g:854:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:858:1: ( ( 'variables:' ) )
            // InternalHLCLSpecificationLanguage.g:859:1: ( 'variables:' )
            {
            // InternalHLCLSpecificationLanguage.g:859:1: ( 'variables:' )
            // InternalHLCLSpecificationLanguage.g:860:2: 'variables:'
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
    // InternalHLCLSpecificationLanguage.g:869:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:873:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalHLCLSpecificationLanguage.g:874:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalHLCLSpecificationLanguage.g:881:1: rule__Model__Group__3__Impl : ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:885:1: ( ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:886:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:886:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalHLCLSpecificationLanguage.g:887:2: ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalHLCLSpecificationLanguage.g:887:2: ( ( rule__Model__VarsAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:888:3: ( rule__Model__VarsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:889:3: ( rule__Model__VarsAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:889:4: rule__Model__VarsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Model__VarsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

            }

            // InternalHLCLSpecificationLanguage.g:892:2: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalHLCLSpecificationLanguage.g:893:3: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:894:3: ( rule__Model__VarsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=14)||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:894:4: rule__Model__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__VarsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalHLCLSpecificationLanguage.g:903:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:907:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalHLCLSpecificationLanguage.g:908:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalHLCLSpecificationLanguage.g:915:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:919:1: ( ( 'constraints:' ) )
            // InternalHLCLSpecificationLanguage.g:920:1: ( 'constraints:' )
            {
            // InternalHLCLSpecificationLanguage.g:920:1: ( 'constraints:' )
            // InternalHLCLSpecificationLanguage.g:921:2: 'constraints:'
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
    // InternalHLCLSpecificationLanguage.g:930:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:934:1: ( rule__Model__Group__5__Impl )
            // InternalHLCLSpecificationLanguage.g:935:2: rule__Model__Group__5__Impl
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
    // InternalHLCLSpecificationLanguage.g:941:1: rule__Model__Group__5__Impl : ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:945:1: ( ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:946:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:946:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalHLCLSpecificationLanguage.g:947:2: ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalHLCLSpecificationLanguage.g:947:2: ( ( rule__Model__ConstraintsAssignment_5 ) )
            // InternalHLCLSpecificationLanguage.g:948:3: ( rule__Model__ConstraintsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:949:3: ( rule__Model__ConstraintsAssignment_5 )
            // InternalHLCLSpecificationLanguage.g:949:4: rule__Model__ConstraintsAssignment_5
            {
            pushFollow(FOLLOW_9);
            rule__Model__ConstraintsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 

            }

            // InternalHLCLSpecificationLanguage.g:952:2: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalHLCLSpecificationLanguage.g:953:3: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:954:3: ( rule__Model__ConstraintsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:954:4: rule__Model__ConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__ConstraintsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "rule__VarDeclaration__Group_1__0"
    // InternalHLCLSpecificationLanguage.g:964:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:968:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalHLCLSpecificationLanguage.g:969:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__VarDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__0"


    // $ANTLR start "rule__VarDeclaration__Group_1__0__Impl"
    // InternalHLCLSpecificationLanguage.g:976:1: rule__VarDeclaration__Group_1__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_1_0 ) ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:980:1: ( ( ( rule__VarDeclaration__TypeAssignment_1_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:981:1: ( ( rule__VarDeclaration__TypeAssignment_1_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:981:1: ( ( rule__VarDeclaration__TypeAssignment_1_0 ) )
            // InternalHLCLSpecificationLanguage.g:982:2: ( rule__VarDeclaration__TypeAssignment_1_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1_0()); 
            // InternalHLCLSpecificationLanguage.g:983:2: ( rule__VarDeclaration__TypeAssignment_1_0 )
            // InternalHLCLSpecificationLanguage.g:983:3: rule__VarDeclaration__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_1__1"
    // InternalHLCLSpecificationLanguage.g:991:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2 ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:995:1: ( rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2 )
            // InternalHLCLSpecificationLanguage.g:996:2: rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__VarDeclaration__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__1"


    // $ANTLR start "rule__VarDeclaration__Group_1__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1003:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1007:1: ( ( ( rule__VarDeclaration__NameAssignment_1_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1008:1: ( ( rule__VarDeclaration__NameAssignment_1_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1008:1: ( ( rule__VarDeclaration__NameAssignment_1_1 ) )
            // InternalHLCLSpecificationLanguage.g:1009:2: ( rule__VarDeclaration__NameAssignment_1_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1_1()); 
            // InternalHLCLSpecificationLanguage.g:1010:2: ( rule__VarDeclaration__NameAssignment_1_1 )
            // InternalHLCLSpecificationLanguage.g:1010:3: rule__VarDeclaration__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_1__2"
    // InternalHLCLSpecificationLanguage.g:1018:1: rule__VarDeclaration__Group_1__2 : rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3 ;
    public final void rule__VarDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1022:1: ( rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3 )
            // InternalHLCLSpecificationLanguage.g:1023:2: rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__VarDeclaration__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__2"


    // $ANTLR start "rule__VarDeclaration__Group_1__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1030:1: rule__VarDeclaration__Group_1__2__Impl : ( 'variants:' ) ;
    public final void rule__VarDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1034:1: ( ( 'variants:' ) )
            // InternalHLCLSpecificationLanguage.g:1035:1: ( 'variants:' )
            {
            // InternalHLCLSpecificationLanguage.g:1035:1: ( 'variants:' )
            // InternalHLCLSpecificationLanguage.g:1036:2: 'variants:'
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getVariantsKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_1__3"
    // InternalHLCLSpecificationLanguage.g:1045:1: rule__VarDeclaration__Group_1__3 : rule__VarDeclaration__Group_1__3__Impl ;
    public final void rule__VarDeclaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1049:1: ( rule__VarDeclaration__Group_1__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1050:2: rule__VarDeclaration__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__3"


    // $ANTLR start "rule__VarDeclaration__Group_1__3__Impl"
    // InternalHLCLSpecificationLanguage.g:1056:1: rule__VarDeclaration__Group_1__3__Impl : ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) ) ;
    public final void rule__VarDeclaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1060:1: ( ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1061:1: ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1061:1: ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) )
            // InternalHLCLSpecificationLanguage.g:1062:2: ( rule__VarDeclaration__VariantsAssignment_1_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_1_3()); 
            // InternalHLCLSpecificationLanguage.g:1063:2: ( rule__VarDeclaration__VariantsAssignment_1_3 )
            // InternalHLCLSpecificationLanguage.g:1063:3: rule__VarDeclaration__VariantsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VariantsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_1__3__Impl"


    // $ANTLR start "rule__VariantsInterval__Group__0"
    // InternalHLCLSpecificationLanguage.g:1072:1: rule__VariantsInterval__Group__0 : rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 ;
    public final void rule__VariantsInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1076:1: ( rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1077:2: rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalHLCLSpecificationLanguage.g:1084:1: rule__VariantsInterval__Group__0__Impl : ( () ) ;
    public final void rule__VariantsInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1088:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1089:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1089:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1090:2: ()
            {
             before(grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1091:2: ()
            // InternalHLCLSpecificationLanguage.g:1091:3: 
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
    // InternalHLCLSpecificationLanguage.g:1099:1: rule__VariantsInterval__Group__1 : rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 ;
    public final void rule__VariantsInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1103:1: ( rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1104:2: rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalHLCLSpecificationLanguage.g:1111:1: rule__VariantsInterval__Group__1__Impl : ( ( rule__VariantsInterval__StartAssignment_1 ) ) ;
    public final void rule__VariantsInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1115:1: ( ( ( rule__VariantsInterval__StartAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1116:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1116:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1117:2: ( rule__VariantsInterval__StartAssignment_1 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1118:2: ( rule__VariantsInterval__StartAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1118:3: rule__VariantsInterval__StartAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:1126:1: rule__VariantsInterval__Group__2 : rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 ;
    public final void rule__VariantsInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1130:1: ( rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1131:2: rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalHLCLSpecificationLanguage.g:1138:1: rule__VariantsInterval__Group__2__Impl : ( '::' ) ;
    public final void rule__VariantsInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1142:1: ( ( '::' ) )
            // InternalHLCLSpecificationLanguage.g:1143:1: ( '::' )
            {
            // InternalHLCLSpecificationLanguage.g:1143:1: ( '::' )
            // InternalHLCLSpecificationLanguage.g:1144:2: '::'
            {
             before(grammarAccess.getVariantsIntervalAccess().getColonColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVariantsIntervalAccess().getColonColonKeyword_2()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1153:1: rule__VariantsInterval__Group__3 : rule__VariantsInterval__Group__3__Impl ;
    public final void rule__VariantsInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1157:1: ( rule__VariantsInterval__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1158:2: rule__VariantsInterval__Group__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1164:1: rule__VariantsInterval__Group__3__Impl : ( ( rule__VariantsInterval__EndAssignment_3 ) ) ;
    public final void rule__VariantsInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1168:1: ( ( ( rule__VariantsInterval__EndAssignment_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1169:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1169:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:1170:2: ( rule__VariantsInterval__EndAssignment_3 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:1171:2: ( rule__VariantsInterval__EndAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:1171:3: rule__VariantsInterval__EndAssignment_3
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
    // InternalHLCLSpecificationLanguage.g:1180:1: rule__VariantsEnumeration__Group__0 : rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 ;
    public final void rule__VariantsEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1184:1: ( rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1185:2: rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalHLCLSpecificationLanguage.g:1192:1: rule__VariantsEnumeration__Group__0__Impl : ( () ) ;
    public final void rule__VariantsEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1196:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1197:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1197:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1198:2: ()
            {
             before(grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1199:2: ()
            // InternalHLCLSpecificationLanguage.g:1199:3: 
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
    // InternalHLCLSpecificationLanguage.g:1207:1: rule__VariantsEnumeration__Group__1 : rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 ;
    public final void rule__VariantsEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1211:1: ( rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1212:2: rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1219:1: rule__VariantsEnumeration__Group__1__Impl : ( '[' ) ;
    public final void rule__VariantsEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1223:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1224:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1224:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1225:2: '['
            {
             before(grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalHLCLSpecificationLanguage.g:1234:1: rule__VariantsEnumeration__Group__2 : rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 ;
    public final void rule__VariantsEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1238:1: ( rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1239:2: rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalHLCLSpecificationLanguage.g:1246:1: rule__VariantsEnumeration__Group__2__Impl : ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) ;
    public final void rule__VariantsEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1250:1: ( ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1251:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1251:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1252:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1253:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1253:3: rule__VariantsEnumeration__ListAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1261:1: rule__VariantsEnumeration__Group__3 : rule__VariantsEnumeration__Group__3__Impl ;
    public final void rule__VariantsEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1265:1: ( rule__VariantsEnumeration__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1266:2: rule__VariantsEnumeration__Group__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1272:1: rule__VariantsEnumeration__Group__3__Impl : ( ']' ) ;
    public final void rule__VariantsEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1276:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1277:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1277:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1278:2: ']'
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
    // InternalHLCLSpecificationLanguage.g:1288:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1292:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1293:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1300:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1304:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1305:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1305:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1306:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1307:2: ( rule__Constraint__NameAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1307:3: rule__Constraint__NameAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1315:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1319:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1320:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1327:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1331:1: ( ( ':' ) )
            // InternalHLCLSpecificationLanguage.g:1332:1: ( ':' )
            {
            // InternalHLCLSpecificationLanguage.g:1332:1: ( ':' )
            // InternalHLCLSpecificationLanguage.g:1333:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalHLCLSpecificationLanguage.g:1342:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1346:1: ( rule__Constraint__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1347:2: rule__Constraint__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1353:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1357:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1358:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1358:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1359:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1360:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1360:3: rule__Constraint__ExpAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1369:1: rule__TerminalExp__Group_0__0 : rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 ;
    public final void rule__TerminalExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1373:1: ( rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 )
            // InternalHLCLSpecificationLanguage.g:1374:2: rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalHLCLSpecificationLanguage.g:1381:1: rule__TerminalExp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1385:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1386:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1386:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1387:2: '('
            {
             before(grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalHLCLSpecificationLanguage.g:1396:1: rule__TerminalExp__Group_0__1 : rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 ;
    public final void rule__TerminalExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1400:1: ( rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 )
            // InternalHLCLSpecificationLanguage.g:1401:2: rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalHLCLSpecificationLanguage.g:1408:1: rule__TerminalExp__Group_0__1__Impl : ( ruleConsExpression ) ;
    public final void rule__TerminalExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1412:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:1413:1: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:1413:1: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:1414:2: ruleConsExpression
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
    // InternalHLCLSpecificationLanguage.g:1423:1: rule__TerminalExp__Group_0__2 : rule__TerminalExp__Group_0__2__Impl ;
    public final void rule__TerminalExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1427:1: ( rule__TerminalExp__Group_0__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1428:2: rule__TerminalExp__Group_0__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1434:1: rule__TerminalExp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1438:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1439:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1439:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1440:2: ')'
            {
             before(grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalHLCLSpecificationLanguage.g:1450:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1454:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1455:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalHLCLSpecificationLanguage.g:1462:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1466:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1467:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1467:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1468:2: ( rule__Assignment__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1469:2: ( rule__Assignment__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1469:3: rule__Assignment__VarAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1477:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1481:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1482:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalHLCLSpecificationLanguage.g:1489:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1493:1: ( ( 'is' ) )
            // InternalHLCLSpecificationLanguage.g:1494:1: ( 'is' )
            {
            // InternalHLCLSpecificationLanguage.g:1494:1: ( 'is' )
            // InternalHLCLSpecificationLanguage.g:1495:2: 'is'
            {
             before(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalHLCLSpecificationLanguage.g:1504:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1508:1: ( rule__Assignment__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1509:2: rule__Assignment__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1515:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1519:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1520:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1520:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1521:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1522:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1522:3: rule__Assignment__ValueAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1531:1: rule__VarRefinement__Group__0 : rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 ;
    public final void rule__VarRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1535:1: ( rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1536:2: rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalHLCLSpecificationLanguage.g:1543:1: rule__VarRefinement__Group__0__Impl : ( ( rule__VarRefinement__VarAssignment_0 ) ) ;
    public final void rule__VarRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1547:1: ( ( ( rule__VarRefinement__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1548:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1548:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1549:2: ( rule__VarRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1550:2: ( rule__VarRefinement__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1550:3: rule__VarRefinement__VarAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1558:1: rule__VarRefinement__Group__1 : rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 ;
    public final void rule__VarRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1562:1: ( rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1563:2: rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalHLCLSpecificationLanguage.g:1570:1: rule__VarRefinement__Group__1__Impl : ( 'in' ) ;
    public final void rule__VarRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1574:1: ( ( 'in' ) )
            // InternalHLCLSpecificationLanguage.g:1575:1: ( 'in' )
            {
            // InternalHLCLSpecificationLanguage.g:1575:1: ( 'in' )
            // InternalHLCLSpecificationLanguage.g:1576:2: 'in'
            {
             before(grammarAccess.getVarRefinementAccess().getInKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalHLCLSpecificationLanguage.g:1585:1: rule__VarRefinement__Group__2 : rule__VarRefinement__Group__2__Impl ;
    public final void rule__VarRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1589:1: ( rule__VarRefinement__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1590:2: rule__VarRefinement__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1596:1: rule__VarRefinement__Group__2__Impl : ( ( rule__VarRefinement__VariantsAssignment_2 ) ) ;
    public final void rule__VarRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1600:1: ( ( ( rule__VarRefinement__VariantsAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1601:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1601:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1602:2: ( rule__VarRefinement__VariantsAssignment_2 )
            {
             before(grammarAccess.getVarRefinementAccess().getVariantsAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1603:2: ( rule__VarRefinement__VariantsAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1603:3: rule__VarRefinement__VariantsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarRefinement__VariantsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarRefinementAccess().getVariantsAssignment_2()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1612:1: rule__SetRefinement__Group__0 : rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 ;
    public final void rule__SetRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1616:1: ( rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1617:2: rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalHLCLSpecificationLanguage.g:1624:1: rule__SetRefinement__Group__0__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1628:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1629:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1629:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1630:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1639:1: rule__SetRefinement__Group__1 : rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 ;
    public final void rule__SetRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1643:1: ( rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1644:2: rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalHLCLSpecificationLanguage.g:1651:1: rule__SetRefinement__Group__1__Impl : ( ( rule__SetRefinement__VarsAssignment_1 ) ) ;
    public final void rule__SetRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1655:1: ( ( ( rule__SetRefinement__VarsAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1656:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1656:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1657:2: ( rule__SetRefinement__VarsAssignment_1 )
            {
             before(grammarAccess.getSetRefinementAccess().getVarsAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1658:2: ( rule__SetRefinement__VarsAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1658:3: rule__SetRefinement__VarsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__VarsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getVarsAssignment_1()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1666:1: rule__SetRefinement__Group__2 : rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 ;
    public final void rule__SetRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1670:1: ( rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1671:2: rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalHLCLSpecificationLanguage.g:1678:1: rule__SetRefinement__Group__2__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1682:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1683:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1683:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1684:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1693:1: rule__SetRefinement__Group__3 : rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 ;
    public final void rule__SetRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1697:1: ( rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 )
            // InternalHLCLSpecificationLanguage.g:1698:2: rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalHLCLSpecificationLanguage.g:1705:1: rule__SetRefinement__Group__3__Impl : ( 'variants' ) ;
    public final void rule__SetRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1709:1: ( ( 'variants' ) )
            // InternalHLCLSpecificationLanguage.g:1710:1: ( 'variants' )
            {
            // InternalHLCLSpecificationLanguage.g:1710:1: ( 'variants' )
            // InternalHLCLSpecificationLanguage.g:1711:2: 'variants'
            {
             before(grammarAccess.getSetRefinementAccess().getVariantsKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getVariantsKeyword_3()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1720:1: rule__SetRefinement__Group__4 : rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 ;
    public final void rule__SetRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1724:1: ( rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 )
            // InternalHLCLSpecificationLanguage.g:1725:2: rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalHLCLSpecificationLanguage.g:1732:1: rule__SetRefinement__Group__4__Impl : ( '[' ) ;
    public final void rule__SetRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1736:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1737:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1737:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1738:2: '['
            {
             before(grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1747:1: rule__SetRefinement__Group__5 : rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 ;
    public final void rule__SetRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1751:1: ( rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 )
            // InternalHLCLSpecificationLanguage.g:1752:2: rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalHLCLSpecificationLanguage.g:1759:1: rule__SetRefinement__Group__5__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1763:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1764:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1764:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1765:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1774:1: rule__SetRefinement__Group__6 : rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 ;
    public final void rule__SetRefinement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1778:1: ( rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 )
            // InternalHLCLSpecificationLanguage.g:1779:2: rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalHLCLSpecificationLanguage.g:1786:1: rule__SetRefinement__Group__6__Impl : ( ( rule__SetRefinement__HeadAssignment_6 ) ) ;
    public final void rule__SetRefinement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1790:1: ( ( ( rule__SetRefinement__HeadAssignment_6 ) ) )
            // InternalHLCLSpecificationLanguage.g:1791:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1791:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            // InternalHLCLSpecificationLanguage.g:1792:2: ( rule__SetRefinement__HeadAssignment_6 )
            {
             before(grammarAccess.getSetRefinementAccess().getHeadAssignment_6()); 
            // InternalHLCLSpecificationLanguage.g:1793:2: ( rule__SetRefinement__HeadAssignment_6 )
            // InternalHLCLSpecificationLanguage.g:1793:3: rule__SetRefinement__HeadAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__HeadAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getHeadAssignment_6()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1801:1: rule__SetRefinement__Group__7 : rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 ;
    public final void rule__SetRefinement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1805:1: ( rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 )
            // InternalHLCLSpecificationLanguage.g:1806:2: rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalHLCLSpecificationLanguage.g:1813:1: rule__SetRefinement__Group__7__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1817:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1818:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1818:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1819:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1828:1: rule__SetRefinement__Group__8 : rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 ;
    public final void rule__SetRefinement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1832:1: ( rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 )
            // InternalHLCLSpecificationLanguage.g:1833:2: rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalHLCLSpecificationLanguage.g:1840:1: rule__SetRefinement__Group__8__Impl : ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) ;
    public final void rule__SetRefinement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1844:1: ( ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:1845:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:1845:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:1846:2: ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:1846:2: ( ( rule__SetRefinement__Group_8__0 ) )
            // InternalHLCLSpecificationLanguage.g:1847:3: ( rule__SetRefinement__Group_8__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1848:3: ( rule__SetRefinement__Group_8__0 )
            // InternalHLCLSpecificationLanguage.g:1848:4: rule__SetRefinement__Group_8__0
            {
            pushFollow(FOLLOW_25);
            rule__SetRefinement__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup_8()); 

            }

            // InternalHLCLSpecificationLanguage.g:1851:2: ( ( rule__SetRefinement__Group_8__0 )* )
            // InternalHLCLSpecificationLanguage.g:1852:3: ( rule__SetRefinement__Group_8__0 )*
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1853:3: ( rule__SetRefinement__Group_8__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1853:4: rule__SetRefinement__Group_8__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SetRefinement__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSetRefinementAccess().getGroup_8()); 

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
    // $ANTLR end "rule__SetRefinement__Group__8__Impl"


    // $ANTLR start "rule__SetRefinement__Group__9"
    // InternalHLCLSpecificationLanguage.g:1862:1: rule__SetRefinement__Group__9 : rule__SetRefinement__Group__9__Impl ;
    public final void rule__SetRefinement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1866:1: ( rule__SetRefinement__Group__9__Impl )
            // InternalHLCLSpecificationLanguage.g:1867:2: rule__SetRefinement__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1873:1: rule__SetRefinement__Group__9__Impl : ( ']' ) ;
    public final void rule__SetRefinement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1877:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1878:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1878:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1879:2: ']'
            {
             before(grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__SetRefinement__Group_8__0"
    // InternalHLCLSpecificationLanguage.g:1889:1: rule__SetRefinement__Group_8__0 : rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 ;
    public final void rule__SetRefinement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1893:1: ( rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 )
            // InternalHLCLSpecificationLanguage.g:1894:2: rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1
            {
            pushFollow(FOLLOW_23);
            rule__SetRefinement__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__0"


    // $ANTLR start "rule__SetRefinement__Group_8__0__Impl"
    // InternalHLCLSpecificationLanguage.g:1901:1: rule__SetRefinement__Group_8__0__Impl : ( ',' ) ;
    public final void rule__SetRefinement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1905:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:1906:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:1906:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:1907:2: ','
            {
             before(grammarAccess.getSetRefinementAccess().getCommaKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__0__Impl"


    // $ANTLR start "rule__SetRefinement__Group_8__1"
    // InternalHLCLSpecificationLanguage.g:1916:1: rule__SetRefinement__Group_8__1 : rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 ;
    public final void rule__SetRefinement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1920:1: ( rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 )
            // InternalHLCLSpecificationLanguage.g:1921:2: rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__SetRefinement__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__1"


    // $ANTLR start "rule__SetRefinement__Group_8__1__Impl"
    // InternalHLCLSpecificationLanguage.g:1928:1: rule__SetRefinement__Group_8__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1932:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1933:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1933:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1934:2: '('
            {
             before(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__1__Impl"


    // $ANTLR start "rule__SetRefinement__Group_8__2"
    // InternalHLCLSpecificationLanguage.g:1943:1: rule__SetRefinement__Group_8__2 : rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 ;
    public final void rule__SetRefinement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1947:1: ( rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 )
            // InternalHLCLSpecificationLanguage.g:1948:2: rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3
            {
            pushFollow(FOLLOW_18);
            rule__SetRefinement__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__2"


    // $ANTLR start "rule__SetRefinement__Group_8__2__Impl"
    // InternalHLCLSpecificationLanguage.g:1955:1: rule__SetRefinement__Group_8__2__Impl : ( ( rule__SetRefinement__TailAssignment_8_2 ) ) ;
    public final void rule__SetRefinement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1959:1: ( ( ( rule__SetRefinement__TailAssignment_8_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1960:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1960:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            // InternalHLCLSpecificationLanguage.g:1961:2: ( rule__SetRefinement__TailAssignment_8_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getTailAssignment_8_2()); 
            // InternalHLCLSpecificationLanguage.g:1962:2: ( rule__SetRefinement__TailAssignment_8_2 )
            // InternalHLCLSpecificationLanguage.g:1962:3: rule__SetRefinement__TailAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__TailAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getTailAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__2__Impl"


    // $ANTLR start "rule__SetRefinement__Group_8__3"
    // InternalHLCLSpecificationLanguage.g:1970:1: rule__SetRefinement__Group_8__3 : rule__SetRefinement__Group_8__3__Impl ;
    public final void rule__SetRefinement__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1974:1: ( rule__SetRefinement__Group_8__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1975:2: rule__SetRefinement__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetRefinement__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__3"


    // $ANTLR start "rule__SetRefinement__Group_8__3__Impl"
    // InternalHLCLSpecificationLanguage.g:1981:1: rule__SetRefinement__Group_8__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1985:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1986:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1986:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1987:2: ')'
            {
             before(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__Group_8__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalHLCLSpecificationLanguage.g:1997:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2001:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2002:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalHLCLSpecificationLanguage.g:2009:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2013:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2014:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2014:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2015:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2016:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:2016:3: rule__Rule__ConditionAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:2024:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2028:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2029:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalHLCLSpecificationLanguage.g:2036:1: rule__Rule__Group__1__Impl : ( '-->' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2040:1: ( ( '-->' ) )
            // InternalHLCLSpecificationLanguage.g:2041:1: ( '-->' )
            {
            // InternalHLCLSpecificationLanguage.g:2041:1: ( '-->' )
            // InternalHLCLSpecificationLanguage.g:2042:2: '-->'
            {
             before(grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalHLCLSpecificationLanguage.g:2051:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2055:1: ( rule__Rule__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2056:2: rule__Rule__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:2062:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConsequenceAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2066:1: ( ( ( rule__Rule__ConsequenceAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2067:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2067:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2068:2: ( rule__Rule__ConsequenceAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2069:2: ( rule__Rule__ConsequenceAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:2069:3: rule__Rule__ConsequenceAssignment_2
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


    // $ANTLR start "rule__SPLNotation__Group__0"
    // InternalHLCLSpecificationLanguage.g:2078:1: rule__SPLNotation__Group__0 : rule__SPLNotation__Group__0__Impl rule__SPLNotation__Group__1 ;
    public final void rule__SPLNotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2082:1: ( rule__SPLNotation__Group__0__Impl rule__SPLNotation__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2083:2: rule__SPLNotation__Group__0__Impl rule__SPLNotation__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__SPLNotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPLNotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLNotation__Group__0"


    // $ANTLR start "rule__SPLNotation__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:2090:1: rule__SPLNotation__Group__0__Impl : ( ( rule__SPLNotation__Var1Assignment_0 ) ) ;
    public final void rule__SPLNotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2094:1: ( ( ( rule__SPLNotation__Var1Assignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2095:1: ( ( rule__SPLNotation__Var1Assignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2095:1: ( ( rule__SPLNotation__Var1Assignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2096:2: ( rule__SPLNotation__Var1Assignment_0 )
            {
             before(grammarAccess.getSPLNotationAccess().getVar1Assignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2097:2: ( rule__SPLNotation__Var1Assignment_0 )
            // InternalHLCLSpecificationLanguage.g:2097:3: rule__SPLNotation__Var1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SPLNotation__Var1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSPLNotationAccess().getVar1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLNotation__Group__0__Impl"


    // $ANTLR start "rule__SPLNotation__Group__1"
    // InternalHLCLSpecificationLanguage.g:2105:1: rule__SPLNotation__Group__1 : rule__SPLNotation__Group__1__Impl rule__SPLNotation__Group__2 ;
    public final void rule__SPLNotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2109:1: ( rule__SPLNotation__Group__1__Impl rule__SPLNotation__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2110:2: rule__SPLNotation__Group__1__Impl rule__SPLNotation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SPLNotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPLNotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLNotation__Group__1"


    // $ANTLR start "rule__SPLNotation__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:2117:1: rule__SPLNotation__Group__1__Impl : ( ( rule__SPLNotation__OpAssignment_1 ) ) ;
    public final void rule__SPLNotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2121:1: ( ( ( rule__SPLNotation__OpAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:2122:1: ( ( rule__SPLNotation__OpAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2122:1: ( ( rule__SPLNotation__OpAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:2123:2: ( rule__SPLNotation__OpAssignment_1 )
            {
             before(grammarAccess.getSPLNotationAccess().getOpAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:2124:2: ( rule__SPLNotation__OpAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:2124:3: rule__SPLNotation__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SPLNotation__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSPLNotationAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLNotation__Group__1__Impl"


    // $ANTLR start "rule__SPLNotation__Group__2"
    // InternalHLCLSpecificationLanguage.g:2132:1: rule__SPLNotation__Group__2 : rule__SPLNotation__Group__2__Impl ;
    public final void rule__SPLNotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2136:1: ( rule__SPLNotation__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2137:2: rule__SPLNotation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPLNotation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLNotation__Group__2"


    // $ANTLR start "rule__SPLNotation__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:2143:1: rule__SPLNotation__Group__2__Impl : ( ( rule__SPLNotation__Var2Assignment_2 ) ) ;
    public final void rule__SPLNotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2147:1: ( ( ( rule__SPLNotation__Var2Assignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2148:1: ( ( rule__SPLNotation__Var2Assignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2148:1: ( ( rule__SPLNotation__Var2Assignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2149:2: ( rule__SPLNotation__Var2Assignment_2 )
            {
             before(grammarAccess.getSPLNotationAccess().getVar2Assignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2150:2: ( rule__SPLNotation__Var2Assignment_2 )
            // InternalHLCLSpecificationLanguage.g:2150:3: rule__SPLNotation__Var2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SPLNotation__Var2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSPLNotationAccess().getVar2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLNotation__Group__2__Impl"


    // $ANTLR start "rule__ListOfIDs__Group__0"
    // InternalHLCLSpecificationLanguage.g:2159:1: rule__ListOfIDs__Group__0 : rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 ;
    public final void rule__ListOfIDs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2163:1: ( rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2164:2: rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalHLCLSpecificationLanguage.g:2171:1: rule__ListOfIDs__Group__0__Impl : ( ( rule__ListOfIDs__IdsAssignment_0 ) ) ;
    public final void rule__ListOfIDs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2175:1: ( ( ( rule__ListOfIDs__IdsAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2176:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2176:1: ( ( rule__ListOfIDs__IdsAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2177:2: ( rule__ListOfIDs__IdsAssignment_0 )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2178:2: ( rule__ListOfIDs__IdsAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:2178:3: rule__ListOfIDs__IdsAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:2186:1: rule__ListOfIDs__Group__1 : rule__ListOfIDs__Group__1__Impl ;
    public final void rule__ListOfIDs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2190:1: ( rule__ListOfIDs__Group__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2191:2: rule__ListOfIDs__Group__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2197:1: rule__ListOfIDs__Group__1__Impl : ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) ) ;
    public final void rule__ListOfIDs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2201:1: ( ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:2202:1: ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:2202:1: ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:2203:2: ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:2203:2: ( ( rule__ListOfIDs__Group_1__0 ) )
            // InternalHLCLSpecificationLanguage.g:2204:3: ( rule__ListOfIDs__Group_1__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2205:3: ( rule__ListOfIDs__Group_1__0 )
            // InternalHLCLSpecificationLanguage.g:2205:4: rule__ListOfIDs__Group_1__0
            {
            pushFollow(FOLLOW_25);
            rule__ListOfIDs__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getGroup_1()); 

            }

            // InternalHLCLSpecificationLanguage.g:2208:2: ( ( rule__ListOfIDs__Group_1__0 )* )
            // InternalHLCLSpecificationLanguage.g:2209:3: ( rule__ListOfIDs__Group_1__0 )*
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2210:3: ( rule__ListOfIDs__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:2210:4: rule__ListOfIDs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ListOfIDs__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getListOfIDsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ListOfIDs__Group__1__Impl"


    // $ANTLR start "rule__ListOfIDs__Group_1__0"
    // InternalHLCLSpecificationLanguage.g:2220:1: rule__ListOfIDs__Group_1__0 : rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 ;
    public final void rule__ListOfIDs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2224:1: ( rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 )
            // InternalHLCLSpecificationLanguage.g:2225:2: rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalHLCLSpecificationLanguage.g:2232:1: rule__ListOfIDs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfIDs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2236:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:2237:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:2237:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:2238:2: ','
            {
             before(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:2247:1: rule__ListOfIDs__Group_1__1 : rule__ListOfIDs__Group_1__1__Impl ;
    public final void rule__ListOfIDs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2251:1: ( rule__ListOfIDs__Group_1__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2252:2: rule__ListOfIDs__Group_1__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2258:1: rule__ListOfIDs__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ListOfIDs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2262:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2263:1: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2263:1: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2264:2: RULE_ID
            {
             before(grammarAccess.getListOfIDsAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListOfIDsAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__VarDeclaration__UnorderedGroup"
    // InternalHLCLSpecificationLanguage.g:2274:1: rule__VarDeclaration__UnorderedGroup : rule__VarDeclaration__UnorderedGroup__0 {...}?;
    public final void rule__VarDeclaration__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2279:1: ( rule__VarDeclaration__UnorderedGroup__0 {...}?)
            // InternalHLCLSpecificationLanguage.g:2280:2: rule__VarDeclaration__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__UnorderedGroup"


    // $ANTLR start "rule__VarDeclaration__UnorderedGroup__Impl"
    // InternalHLCLSpecificationLanguage.g:2288:1: rule__VarDeclaration__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) ) ;
    public final void rule__VarDeclaration__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2293:1: ( ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) ) )
            // InternalHLCLSpecificationLanguage.g:2294:3: ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:2294:3: ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 >= 13 && LA14_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:2295:3: ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2295:3: ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2296:4: {...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2296:108: ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2297:5: ( ( rule__VarDeclaration__InstantiableAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2303:5: ( ( rule__VarDeclaration__InstantiableAssignment_0 ) )
                    // InternalHLCLSpecificationLanguage.g:2304:6: ( rule__VarDeclaration__InstantiableAssignment_0 )
                    {
                     before(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0()); 
                    // InternalHLCLSpecificationLanguage.g:2305:6: ( rule__VarDeclaration__InstantiableAssignment_0 )
                    // InternalHLCLSpecificationLanguage.g:2305:7: rule__VarDeclaration__InstantiableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__InstantiableAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:2310:3: ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2310:3: ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2311:4: {...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2311:108: ( ( ( rule__VarDeclaration__Group_1__0 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2312:5: ( ( rule__VarDeclaration__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2318:5: ( ( rule__VarDeclaration__Group_1__0 ) )
                    // InternalHLCLSpecificationLanguage.g:2319:6: ( rule__VarDeclaration__Group_1__0 )
                    {
                     before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
                    // InternalHLCLSpecificationLanguage.g:2320:6: ( rule__VarDeclaration__Group_1__0 )
                    // InternalHLCLSpecificationLanguage.g:2320:7: rule__VarDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDeclarationAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__UnorderedGroup__Impl"


    // $ANTLR start "rule__VarDeclaration__UnorderedGroup__0"
    // InternalHLCLSpecificationLanguage.g:2333:1: rule__VarDeclaration__UnorderedGroup__0 : rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )? ;
    public final void rule__VarDeclaration__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2337:1: ( rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )? )
            // InternalHLCLSpecificationLanguage.g:2338:2: rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_8);
            rule__VarDeclaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalHLCLSpecificationLanguage.g:2339:2: ( rule__VarDeclaration__UnorderedGroup__1 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:2339:2: rule__VarDeclaration__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclaration__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__UnorderedGroup__0"


    // $ANTLR start "rule__VarDeclaration__UnorderedGroup__1"
    // InternalHLCLSpecificationLanguage.g:2345:1: rule__VarDeclaration__UnorderedGroup__1 : rule__VarDeclaration__UnorderedGroup__Impl ;
    public final void rule__VarDeclaration__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2349:1: ( rule__VarDeclaration__UnorderedGroup__Impl )
            // InternalHLCLSpecificationLanguage.g:2350:2: rule__VarDeclaration__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__UnorderedGroup__1"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2357:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2361:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2362:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2362:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2363:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2372:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2376:1: ( ( ruleVarDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2377:2: ( ruleVarDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2377:2: ( ruleVarDeclaration )
            // InternalHLCLSpecificationLanguage.g:2378:3: ruleVarDeclaration
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
    // InternalHLCLSpecificationLanguage.g:2387:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2391:1: ( ( ruleConstraint ) )
            // InternalHLCLSpecificationLanguage.g:2392:2: ( ruleConstraint )
            {
            // InternalHLCLSpecificationLanguage.g:2392:2: ( ruleConstraint )
            // InternalHLCLSpecificationLanguage.g:2393:3: ruleConstraint
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


    // $ANTLR start "rule__VarDeclaration__InstantiableAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2402:1: rule__VarDeclaration__InstantiableAssignment_0 : ( ( 'instantiable' ) ) ;
    public final void rule__VarDeclaration__InstantiableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2406:1: ( ( ( 'instantiable' ) ) )
            // InternalHLCLSpecificationLanguage.g:2407:2: ( ( 'instantiable' ) )
            {
            // InternalHLCLSpecificationLanguage.g:2407:2: ( ( 'instantiable' ) )
            // InternalHLCLSpecificationLanguage.g:2408:3: ( 'instantiable' )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 
            // InternalHLCLSpecificationLanguage.g:2409:3: ( 'instantiable' )
            // InternalHLCLSpecificationLanguage.g:2410:4: 'instantiable'
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 

            }

             after(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__InstantiableAssignment_0"


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_1_0"
    // InternalHLCLSpecificationLanguage.g:2421:1: rule__VarDeclaration__TypeAssignment_1_0 : ( ruleVarType ) ;
    public final void rule__VarDeclaration__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2425:1: ( ( ruleVarType ) )
            // InternalHLCLSpecificationLanguage.g:2426:2: ( ruleVarType )
            {
            // InternalHLCLSpecificationLanguage.g:2426:2: ( ruleVarType )
            // InternalHLCLSpecificationLanguage.g:2427:3: ruleVarType
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__TypeAssignment_1_0"


    // $ANTLR start "rule__VarDeclaration__NameAssignment_1_1"
    // InternalHLCLSpecificationLanguage.g:2436:1: rule__VarDeclaration__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2440:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2441:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2441:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2442:3: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__NameAssignment_1_1"


    // $ANTLR start "rule__VarDeclaration__VariantsAssignment_1_3"
    // InternalHLCLSpecificationLanguage.g:2451:1: rule__VarDeclaration__VariantsAssignment_1_3 : ( ruleVariantDeclaration ) ;
    public final void rule__VarDeclaration__VariantsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2455:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2456:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2456:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2457:3: ruleVariantDeclaration
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__VariantsAssignment_1_3"


    // $ANTLR start "rule__VariantsInterval__StartAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2466:1: rule__VariantsInterval__StartAssignment_1 : ( ruleValue ) ;
    public final void rule__VariantsInterval__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2470:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2471:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2471:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2472:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2481:1: rule__VariantsInterval__EndAssignment_3 : ( ruleValue ) ;
    public final void rule__VariantsInterval__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2485:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2486:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2486:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2487:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2496:1: rule__VariantsEnumeration__ListAssignment_2 : ( ruleEnumeration ) ;
    public final void rule__VariantsEnumeration__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2500:1: ( ( ruleEnumeration ) )
            // InternalHLCLSpecificationLanguage.g:2501:2: ( ruleEnumeration )
            {
            // InternalHLCLSpecificationLanguage.g:2501:2: ( ruleEnumeration )
            // InternalHLCLSpecificationLanguage.g:2502:3: ruleEnumeration
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListEnumerationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getVariantsEnumerationAccess().getListEnumerationParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Enumeration__ValuesAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2511:1: rule__Enumeration__ValuesAssignment_0 : ( ruleListOfValues ) ;
    public final void rule__Enumeration__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2515:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2516:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2516:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2517:3: ruleListOfValues
            {
             before(grammarAccess.getEnumerationAccess().getValuesListOfValuesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValuesListOfValuesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValuesAssignment_0"


    // $ANTLR start "rule__Constraint__NameAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2526:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2530:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2531:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2531:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2532:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2541:1: rule__Constraint__ExpAssignment_2 : ( ruleConsExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2545:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:2546:2: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:2546:2: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:2547:3: ruleConsExpression
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
    // InternalHLCLSpecificationLanguage.g:2556:1: rule__IDCons__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDCons__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2560:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2561:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2561:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2562:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2571:1: rule__Assignment__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2575:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2576:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2576:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2577:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2586:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2590:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2591:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2591:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2592:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2601:1: rule__VarRefinement__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2605:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2606:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2606:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2607:3: RULE_ID
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


    // $ANTLR start "rule__VarRefinement__VariantsAssignment_2"
    // InternalHLCLSpecificationLanguage.g:2616:1: rule__VarRefinement__VariantsAssignment_2 : ( ruleVariantDeclaration ) ;
    public final void rule__VarRefinement__VariantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2620:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2621:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2621:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2622:3: ruleVariantDeclaration
            {
             before(grammarAccess.getVarRefinementAccess().getVariantsVariantDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVarRefinementAccess().getVariantsVariantDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefinement__VariantsAssignment_2"


    // $ANTLR start "rule__SetRefinement__VarsAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2631:1: rule__SetRefinement__VarsAssignment_1 : ( ruleListOfIDs ) ;
    public final void rule__SetRefinement__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2635:1: ( ( ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:2636:2: ( ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:2636:2: ( ruleListOfIDs )
            // InternalHLCLSpecificationLanguage.g:2637:3: ruleListOfIDs
            {
             before(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__VarsAssignment_1"


    // $ANTLR start "rule__SetRefinement__HeadAssignment_6"
    // InternalHLCLSpecificationLanguage.g:2646:1: rule__SetRefinement__HeadAssignment_6 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__HeadAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2650:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2651:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2651:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2652:3: ruleListOfValues
            {
             before(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__HeadAssignment_6"


    // $ANTLR start "rule__SetRefinement__TailAssignment_8_2"
    // InternalHLCLSpecificationLanguage.g:2661:1: rule__SetRefinement__TailAssignment_8_2 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__TailAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2665:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2666:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2666:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2667:3: ruleListOfValues
            {
             before(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfValues();

            state._fsp--;

             after(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRefinement__TailAssignment_8_2"


    // $ANTLR start "rule__Rule__ConditionAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2676:1: rule__Rule__ConditionAssignment_0 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2680:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:2681:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:2681:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:2682:3: ruleTerminalExp
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
    // InternalHLCLSpecificationLanguage.g:2691:1: rule__Rule__ConsequenceAssignment_2 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConsequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2695:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:2696:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:2696:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:2697:3: ruleTerminalExp
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


    // $ANTLR start "rule__SPLNotation__Var1Assignment_0"
    // InternalHLCLSpecificationLanguage.g:2706:1: rule__SPLNotation__Var1Assignment_0 : ( RULE_ID ) ;
    public final void rule__SPLNotation__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2710:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2711:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2711:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2712:3: RULE_ID
            {
             before(grammarAccess.getSPLNotationAccess().getVar1IDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPLNotationAccess().getVar1IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLNotation__Var1Assignment_0"


    // $ANTLR start "rule__SPLNotation__OpAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2721:1: rule__SPLNotation__OpAssignment_1 : ( ruleSPLop ) ;
    public final void rule__SPLNotation__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2725:1: ( ( ruleSPLop ) )
            // InternalHLCLSpecificationLanguage.g:2726:2: ( ruleSPLop )
            {
            // InternalHLCLSpecificationLanguage.g:2726:2: ( ruleSPLop )
            // InternalHLCLSpecificationLanguage.g:2727:3: ruleSPLop
            {
             before(grammarAccess.getSPLNotationAccess().getOpSPLopParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSPLop();

            state._fsp--;

             after(grammarAccess.getSPLNotationAccess().getOpSPLopParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLNotation__OpAssignment_1"


    // $ANTLR start "rule__SPLNotation__Var2Assignment_2"
    // InternalHLCLSpecificationLanguage.g:2736:1: rule__SPLNotation__Var2Assignment_2 : ( RULE_ID ) ;
    public final void rule__SPLNotation__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2740:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2741:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2741:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2742:3: RULE_ID
            {
             before(grammarAccess.getSPLNotationAccess().getVar2IDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPLNotationAccess().getVar2IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLNotation__Var2Assignment_2"


    // $ANTLR start "rule__ListOfValues__ValuesAssignment"
    // InternalHLCLSpecificationLanguage.g:2751:1: rule__ListOfValues__ValuesAssignment : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2755:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2756:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2756:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2757:3: ruleValue
            {
             before(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfValues__ValuesAssignment"


    // $ANTLR start "rule__ListOfIDs__IdsAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2766:1: rule__ListOfIDs__IdsAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListOfIDs__IdsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2770:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2771:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2771:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2772:3: RULE_ID
            {
             before(grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListOfIDsAccess().getIdsIDTerminalRuleCall_0_0()); 

            }


            }

        }
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

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\4\33\uffff";
    static final String dfa_3s = "\1\15\1\0\2\5\2\uffff\1\26\1\4\3\27\5\4\1\40\3\0\3\4\1\0\1\5\1\31\1\5\1\31";
    static final String dfa_4s = "\1\42\1\0\2\5\2\uffff\1\26\1\30\3\27\2\14\3\31\1\40\3\0\3\31\1\0\1\5\1\40\1\5\1\40";
    static final String dfa_5s = "\4\uffff\1\2\1\1\26\uffff";
    static final String dfa_6s = "\1\uffff\1\0\17\uffff\1\4\1\1\1\2\3\uffff\1\3\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\6\uffff\1\4\14\uffff\1\1",
            "\1\uffff",
            "\1\6",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\10\6\uffff\1\11\1\12\13\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\15\1\20\5\uffff\1\16\1\17",
            "\1\21\6\uffff\1\22\1\23",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\30",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\uffff",
            "\1\31",
            "\1\27\6\uffff\1\32",
            "\1\33",
            "\1\27\6\uffff\1\32"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2339:2: ( rule__VarDeclaration__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_18 = input.LA(1);

                         
                        int index15_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_19 = input.LA(1);

                         
                        int index15_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_23 = input.LA(1);

                         
                        int index15_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_17 = input.LA(1);

                         
                        int index15_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_17);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400006002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001001810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000078000L});

}
