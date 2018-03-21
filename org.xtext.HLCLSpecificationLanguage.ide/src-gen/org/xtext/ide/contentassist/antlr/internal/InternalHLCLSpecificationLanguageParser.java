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
    // InternalHLCLSpecificationLanguage.g:87:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:91:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:92:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:92:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:93:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:94:3: ( rule__VarDeclaration__Group__0 )
            // InternalHLCLSpecificationLanguage.g:94:4: rule__VarDeclaration__Group__0
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


    // $ANTLR start "entryRuleModifier"
    // InternalHLCLSpecificationLanguage.g:103:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:104:1: ( ruleModifier EOF )
            // InternalHLCLSpecificationLanguage.g:105:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalHLCLSpecificationLanguage.g:112:1: ruleModifier : ( ( rule__Modifier__UnorderedGroup ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:116:2: ( ( ( rule__Modifier__UnorderedGroup ) ) )
            // InternalHLCLSpecificationLanguage.g:117:2: ( ( rule__Modifier__UnorderedGroup ) )
            {
            // InternalHLCLSpecificationLanguage.g:117:2: ( ( rule__Modifier__UnorderedGroup ) )
            // InternalHLCLSpecificationLanguage.g:118:3: ( rule__Modifier__UnorderedGroup )
            {
             before(grammarAccess.getModifierAccess().getUnorderedGroup()); 
            // InternalHLCLSpecificationLanguage.g:119:3: ( rule__Modifier__UnorderedGroup )
            // InternalHLCLSpecificationLanguage.g:119:4: rule__Modifier__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleVariantDeclaration"
    // InternalHLCLSpecificationLanguage.g:128:1: entryRuleVariantDeclaration : ruleVariantDeclaration EOF ;
    public final void entryRuleVariantDeclaration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:129:1: ( ruleVariantDeclaration EOF )
            // InternalHLCLSpecificationLanguage.g:130:1: ruleVariantDeclaration EOF
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
    // InternalHLCLSpecificationLanguage.g:137:1: ruleVariantDeclaration : ( ( rule__VariantDeclaration__Alternatives ) ) ;
    public final void ruleVariantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:141:2: ( ( ( rule__VariantDeclaration__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:142:2: ( ( rule__VariantDeclaration__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:142:2: ( ( rule__VariantDeclaration__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:143:3: ( rule__VariantDeclaration__Alternatives )
            {
             before(grammarAccess.getVariantDeclarationAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:144:3: ( rule__VariantDeclaration__Alternatives )
            // InternalHLCLSpecificationLanguage.g:144:4: rule__VariantDeclaration__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:153:1: entryRulevariantsInterval : rulevariantsInterval EOF ;
    public final void entryRulevariantsInterval() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:154:1: ( rulevariantsInterval EOF )
            // InternalHLCLSpecificationLanguage.g:155:1: rulevariantsInterval EOF
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
    // InternalHLCLSpecificationLanguage.g:162:1: rulevariantsInterval : ( ( rule__VariantsInterval__Group__0 ) ) ;
    public final void rulevariantsInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:166:2: ( ( ( rule__VariantsInterval__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:167:2: ( ( rule__VariantsInterval__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:167:2: ( ( rule__VariantsInterval__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:168:3: ( rule__VariantsInterval__Group__0 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:169:3: ( rule__VariantsInterval__Group__0 )
            // InternalHLCLSpecificationLanguage.g:169:4: rule__VariantsInterval__Group__0
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
    // InternalHLCLSpecificationLanguage.g:178:1: entryRulevariantsEnumeration : rulevariantsEnumeration EOF ;
    public final void entryRulevariantsEnumeration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:179:1: ( rulevariantsEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:180:1: rulevariantsEnumeration EOF
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
    // InternalHLCLSpecificationLanguage.g:187:1: rulevariantsEnumeration : ( ( rule__VariantsEnumeration__Group__0 ) ) ;
    public final void rulevariantsEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:191:2: ( ( ( rule__VariantsEnumeration__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:192:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:192:2: ( ( rule__VariantsEnumeration__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:193:3: ( rule__VariantsEnumeration__Group__0 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:194:3: ( rule__VariantsEnumeration__Group__0 )
            // InternalHLCLSpecificationLanguage.g:194:4: rule__VariantsEnumeration__Group__0
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
    // InternalHLCLSpecificationLanguage.g:203:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:204:1: ( ruleEnumeration EOF )
            // InternalHLCLSpecificationLanguage.g:205:1: ruleEnumeration EOF
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
    // InternalHLCLSpecificationLanguage.g:212:1: ruleEnumeration : ( ( rule__Enumeration__Alternatives ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:216:2: ( ( ( rule__Enumeration__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:217:2: ( ( rule__Enumeration__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:217:2: ( ( rule__Enumeration__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:218:3: ( rule__Enumeration__Alternatives )
            {
             before(grammarAccess.getEnumerationAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:219:3: ( rule__Enumeration__Alternatives )
            // InternalHLCLSpecificationLanguage.g:219:4: rule__Enumeration__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:228:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:229:1: ( ruleConstraint EOF )
            // InternalHLCLSpecificationLanguage.g:230:1: ruleConstraint EOF
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
    // InternalHLCLSpecificationLanguage.g:237:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:241:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:242:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:242:2: ( ( rule__Constraint__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:243:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:244:3: ( rule__Constraint__Group__0 )
            // InternalHLCLSpecificationLanguage.g:244:4: rule__Constraint__Group__0
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
    // InternalHLCLSpecificationLanguage.g:253:1: entryRuleConsExpression : ruleConsExpression EOF ;
    public final void entryRuleConsExpression() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:254:1: ( ruleConsExpression EOF )
            // InternalHLCLSpecificationLanguage.g:255:1: ruleConsExpression EOF
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
    // InternalHLCLSpecificationLanguage.g:262:1: ruleConsExpression : ( ( rule__ConsExpression__Alternatives ) ) ;
    public final void ruleConsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:266:2: ( ( ( rule__ConsExpression__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:267:2: ( ( rule__ConsExpression__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:267:2: ( ( rule__ConsExpression__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:268:3: ( rule__ConsExpression__Alternatives )
            {
             before(grammarAccess.getConsExpressionAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:269:3: ( rule__ConsExpression__Alternatives )
            // InternalHLCLSpecificationLanguage.g:269:4: rule__ConsExpression__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:278:1: entryRuleTerminalExp : ruleTerminalExp EOF ;
    public final void entryRuleTerminalExp() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:279:1: ( ruleTerminalExp EOF )
            // InternalHLCLSpecificationLanguage.g:280:1: ruleTerminalExp EOF
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
    // InternalHLCLSpecificationLanguage.g:287:1: ruleTerminalExp : ( ( rule__TerminalExp__Alternatives ) ) ;
    public final void ruleTerminalExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:291:2: ( ( ( rule__TerminalExp__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:292:2: ( ( rule__TerminalExp__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:292:2: ( ( rule__TerminalExp__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:293:3: ( rule__TerminalExp__Alternatives )
            {
             before(grammarAccess.getTerminalExpAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:294:3: ( rule__TerminalExp__Alternatives )
            // InternalHLCLSpecificationLanguage.g:294:4: rule__TerminalExp__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:303:1: entryRuleIDCons : ruleIDCons EOF ;
    public final void entryRuleIDCons() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:304:1: ( ruleIDCons EOF )
            // InternalHLCLSpecificationLanguage.g:305:1: ruleIDCons EOF
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
    // InternalHLCLSpecificationLanguage.g:312:1: ruleIDCons : ( ( rule__IDCons__NameAssignment ) ) ;
    public final void ruleIDCons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:316:2: ( ( ( rule__IDCons__NameAssignment ) ) )
            // InternalHLCLSpecificationLanguage.g:317:2: ( ( rule__IDCons__NameAssignment ) )
            {
            // InternalHLCLSpecificationLanguage.g:317:2: ( ( rule__IDCons__NameAssignment ) )
            // InternalHLCLSpecificationLanguage.g:318:3: ( rule__IDCons__NameAssignment )
            {
             before(grammarAccess.getIDConsAccess().getNameAssignment()); 
            // InternalHLCLSpecificationLanguage.g:319:3: ( rule__IDCons__NameAssignment )
            // InternalHLCLSpecificationLanguage.g:319:4: rule__IDCons__NameAssignment
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
    // InternalHLCLSpecificationLanguage.g:328:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:329:1: ( ruleRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:330:1: ruleRefinement EOF
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
    // InternalHLCLSpecificationLanguage.g:337:1: ruleRefinement : ( ( rule__Refinement__Alternatives ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:341:2: ( ( ( rule__Refinement__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:342:2: ( ( rule__Refinement__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:342:2: ( ( rule__Refinement__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:343:3: ( rule__Refinement__Alternatives )
            {
             before(grammarAccess.getRefinementAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:344:3: ( rule__Refinement__Alternatives )
            // InternalHLCLSpecificationLanguage.g:344:4: rule__Refinement__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:353:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:354:1: ( ruleAssignment EOF )
            // InternalHLCLSpecificationLanguage.g:355:1: ruleAssignment EOF
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
    // InternalHLCLSpecificationLanguage.g:362:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:366:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:367:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:367:2: ( ( rule__Assignment__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:368:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:369:3: ( rule__Assignment__Group__0 )
            // InternalHLCLSpecificationLanguage.g:369:4: rule__Assignment__Group__0
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
    // InternalHLCLSpecificationLanguage.g:378:1: entryRuleVarRefinement : ruleVarRefinement EOF ;
    public final void entryRuleVarRefinement() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:379:1: ( ruleVarRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:380:1: ruleVarRefinement EOF
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
    // InternalHLCLSpecificationLanguage.g:387:1: ruleVarRefinement : ( ( rule__VarRefinement__Group__0 ) ) ;
    public final void ruleVarRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:391:2: ( ( ( rule__VarRefinement__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:392:2: ( ( rule__VarRefinement__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:392:2: ( ( rule__VarRefinement__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:393:3: ( rule__VarRefinement__Group__0 )
            {
             before(grammarAccess.getVarRefinementAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:394:3: ( rule__VarRefinement__Group__0 )
            // InternalHLCLSpecificationLanguage.g:394:4: rule__VarRefinement__Group__0
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
    // InternalHLCLSpecificationLanguage.g:403:1: entryRuleSetRefinement : ruleSetRefinement EOF ;
    public final void entryRuleSetRefinement() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:404:1: ( ruleSetRefinement EOF )
            // InternalHLCLSpecificationLanguage.g:405:1: ruleSetRefinement EOF
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
    // InternalHLCLSpecificationLanguage.g:412:1: ruleSetRefinement : ( ( rule__SetRefinement__Group__0 ) ) ;
    public final void ruleSetRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:416:2: ( ( ( rule__SetRefinement__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:417:2: ( ( rule__SetRefinement__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:417:2: ( ( rule__SetRefinement__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:418:3: ( rule__SetRefinement__Group__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:419:3: ( rule__SetRefinement__Group__0 )
            // InternalHLCLSpecificationLanguage.g:419:4: rule__SetRefinement__Group__0
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
    // InternalHLCLSpecificationLanguage.g:428:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:429:1: ( ruleRule EOF )
            // InternalHLCLSpecificationLanguage.g:430:1: ruleRule EOF
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
    // InternalHLCLSpecificationLanguage.g:437:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:441:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:442:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:442:2: ( ( rule__Rule__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:443:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:444:3: ( rule__Rule__Group__0 )
            // InternalHLCLSpecificationLanguage.g:444:4: rule__Rule__Group__0
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
    // InternalHLCLSpecificationLanguage.g:453:1: entryRuleSPLNotation : ruleSPLNotation EOF ;
    public final void entryRuleSPLNotation() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:454:1: ( ruleSPLNotation EOF )
            // InternalHLCLSpecificationLanguage.g:455:1: ruleSPLNotation EOF
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
    // InternalHLCLSpecificationLanguage.g:462:1: ruleSPLNotation : ( ( rule__SPLNotation__Group__0 ) ) ;
    public final void ruleSPLNotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:466:2: ( ( ( rule__SPLNotation__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:467:2: ( ( rule__SPLNotation__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:467:2: ( ( rule__SPLNotation__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:468:3: ( rule__SPLNotation__Group__0 )
            {
             before(grammarAccess.getSPLNotationAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:469:3: ( rule__SPLNotation__Group__0 )
            // InternalHLCLSpecificationLanguage.g:469:4: rule__SPLNotation__Group__0
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
    // InternalHLCLSpecificationLanguage.g:478:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:479:1: ( ruleValue EOF )
            // InternalHLCLSpecificationLanguage.g:480:1: ruleValue EOF
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
    // InternalHLCLSpecificationLanguage.g:487:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:491:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:492:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:492:2: ( ( rule__Value__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:493:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:494:3: ( rule__Value__Alternatives )
            // InternalHLCLSpecificationLanguage.g:494:4: rule__Value__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:503:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:504:1: ( ruleVarType EOF )
            // InternalHLCLSpecificationLanguage.g:505:1: ruleVarType EOF
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
    // InternalHLCLSpecificationLanguage.g:512:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:516:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( rule__VarType__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:518:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:519:3: ( rule__VarType__Alternatives )
            // InternalHLCLSpecificationLanguage.g:519:4: rule__VarType__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:528:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:529:1: ( ruleListOfValues EOF )
            // InternalHLCLSpecificationLanguage.g:530:1: ruleListOfValues EOF
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
    // InternalHLCLSpecificationLanguage.g:537:1: ruleListOfValues : ( ( rule__ListOfValues__Group__0 ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:541:2: ( ( ( rule__ListOfValues__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:542:2: ( ( rule__ListOfValues__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:542:2: ( ( rule__ListOfValues__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:543:3: ( rule__ListOfValues__Group__0 )
            {
             before(grammarAccess.getListOfValuesAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:544:3: ( rule__ListOfValues__Group__0 )
            // InternalHLCLSpecificationLanguage.g:544:4: rule__ListOfValues__Group__0
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
    // InternalHLCLSpecificationLanguage.g:553:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:554:1: ( ruleListOfIDs EOF )
            // InternalHLCLSpecificationLanguage.g:555:1: ruleListOfIDs EOF
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
    // InternalHLCLSpecificationLanguage.g:562:1: ruleListOfIDs : ( ( rule__ListOfIDs__Group__0 ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:566:2: ( ( ( rule__ListOfIDs__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:567:2: ( ( rule__ListOfIDs__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:567:2: ( ( rule__ListOfIDs__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:568:3: ( rule__ListOfIDs__Group__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:569:3: ( rule__ListOfIDs__Group__0 )
            // InternalHLCLSpecificationLanguage.g:569:4: rule__ListOfIDs__Group__0
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
    // InternalHLCLSpecificationLanguage.g:578:1: entryRuleSPLop : ruleSPLop EOF ;
    public final void entryRuleSPLop() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:579:1: ( ruleSPLop EOF )
            // InternalHLCLSpecificationLanguage.g:580:1: ruleSPLop EOF
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
    // InternalHLCLSpecificationLanguage.g:587:1: ruleSPLop : ( ( rule__SPLop__Alternatives ) ) ;
    public final void ruleSPLop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:591:2: ( ( ( rule__SPLop__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:592:2: ( ( rule__SPLop__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:592:2: ( ( rule__SPLop__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:593:3: ( rule__SPLop__Alternatives )
            {
             before(grammarAccess.getSPLopAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:594:3: ( rule__SPLop__Alternatives )
            // InternalHLCLSpecificationLanguage.g:594:4: rule__SPLop__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:602:1: rule__VariantDeclaration__Alternatives : ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) );
    public final void rule__VariantDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:606:1: ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT||(LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:607:2: ( rulevariantsInterval )
                    {
                    // InternalHLCLSpecificationLanguage.g:607:2: ( rulevariantsInterval )
                    // InternalHLCLSpecificationLanguage.g:608:3: rulevariantsInterval
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
                    // InternalHLCLSpecificationLanguage.g:613:2: ( rulevariantsEnumeration )
                    {
                    // InternalHLCLSpecificationLanguage.g:613:2: ( rulevariantsEnumeration )
                    // InternalHLCLSpecificationLanguage.g:614:3: rulevariantsEnumeration
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
    // InternalHLCLSpecificationLanguage.g:623:1: rule__Enumeration__Alternatives : ( ( ruleListOfValues ) | ( ruleListOfIDs ) );
    public final void rule__Enumeration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:627:1: ( ( ruleListOfValues ) | ( ruleListOfIDs ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||(LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:628:2: ( ruleListOfValues )
                    {
                    // InternalHLCLSpecificationLanguage.g:628:2: ( ruleListOfValues )
                    // InternalHLCLSpecificationLanguage.g:629:3: ruleListOfValues
                    {
                     before(grammarAccess.getEnumerationAccess().getListOfValuesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListOfValues();

                    state._fsp--;

                     after(grammarAccess.getEnumerationAccess().getListOfValuesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:634:2: ( ruleListOfIDs )
                    {
                    // InternalHLCLSpecificationLanguage.g:634:2: ( ruleListOfIDs )
                    // InternalHLCLSpecificationLanguage.g:635:3: ruleListOfIDs
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
    // InternalHLCLSpecificationLanguage.g:644:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleSPLNotation ) );
    public final void rule__ConsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:648:1: ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleSPLNotation ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 29:
                case 30:
                    {
                    alt3=2;
                    }
                    break;
                case 33:
                    {
                    alt3=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 28:
                    {
                    alt3=1;
                    }
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    {
                    alt3=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA3_0==27) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    int LA3_7 = input.LA(3);

                    if ( ((LA3_7>=15 && LA3_7<=18)||(LA3_7>=28 && LA3_7<=30)||LA3_7==33) ) {
                        alt3=3;
                    }
                    else if ( (LA3_7==32) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 7, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_2==27) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:649:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:649:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:650:3: ruleIDCons
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
                    // InternalHLCLSpecificationLanguage.g:655:2: ( ruleRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:655:2: ( ruleRefinement )
                    // InternalHLCLSpecificationLanguage.g:656:3: ruleRefinement
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
                    // InternalHLCLSpecificationLanguage.g:661:2: ( ruleRule )
                    {
                    // InternalHLCLSpecificationLanguage.g:661:2: ( ruleRule )
                    // InternalHLCLSpecificationLanguage.g:662:3: ruleRule
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
                    // InternalHLCLSpecificationLanguage.g:667:2: ( ruleSPLNotation )
                    {
                    // InternalHLCLSpecificationLanguage.g:667:2: ( ruleSPLNotation )
                    // InternalHLCLSpecificationLanguage.g:668:3: ruleSPLNotation
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
    // InternalHLCLSpecificationLanguage.g:677:1: rule__TerminalExp__Alternatives : ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) );
    public final void rule__TerminalExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:681:1: ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:682:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:682:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    // InternalHLCLSpecificationLanguage.g:683:3: ( rule__TerminalExp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpAccess().getGroup_0()); 
                    // InternalHLCLSpecificationLanguage.g:684:3: ( rule__TerminalExp__Group_0__0 )
                    // InternalHLCLSpecificationLanguage.g:684:4: rule__TerminalExp__Group_0__0
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
                    // InternalHLCLSpecificationLanguage.g:688:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:688:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:689:3: ruleIDCons
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
    // InternalHLCLSpecificationLanguage.g:698:1: rule__Refinement__Alternatives : ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) );
    public final void rule__Refinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:702:1: ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==29) ) {
                    alt5=1;
                }
                else if ( (LA5_1==30) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==27) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:703:2: ( ruleAssignment )
                    {
                    // InternalHLCLSpecificationLanguage.g:703:2: ( ruleAssignment )
                    // InternalHLCLSpecificationLanguage.g:704:3: ruleAssignment
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
                    // InternalHLCLSpecificationLanguage.g:709:2: ( ruleVarRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:709:2: ( ruleVarRefinement )
                    // InternalHLCLSpecificationLanguage.g:710:3: ruleVarRefinement
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
                    // InternalHLCLSpecificationLanguage.g:715:2: ( ruleSetRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:715:2: ( ruleSetRefinement )
                    // InternalHLCLSpecificationLanguage.g:716:3: ruleSetRefinement
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
    // InternalHLCLSpecificationLanguage.g:725:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:729:1: ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 11:
                {
                alt6=2;
                }
                break;
            case 12:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:730:2: ( RULE_INT )
                    {
                    // InternalHLCLSpecificationLanguage.g:730:2: ( RULE_INT )
                    // InternalHLCLSpecificationLanguage.g:731:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:736:2: ( 'selected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:736:2: ( 'selected' )
                    // InternalHLCLSpecificationLanguage.g:737:3: 'selected'
                    {
                     before(grammarAccess.getValueAccess().getSelectedKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSelectedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:742:2: ( 'unselected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:742:2: ( 'unselected' )
                    // InternalHLCLSpecificationLanguage.g:743:3: 'unselected'
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
    // InternalHLCLSpecificationLanguage.g:752:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'numeric' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:756:1: ( ( 'boolean' ) | ( 'numeric' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:757:2: ( 'boolean' )
                    {
                    // InternalHLCLSpecificationLanguage.g:757:2: ( 'boolean' )
                    // InternalHLCLSpecificationLanguage.g:758:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:763:2: ( 'numeric' )
                    {
                    // InternalHLCLSpecificationLanguage.g:763:2: ( 'numeric' )
                    // InternalHLCLSpecificationLanguage.g:764:3: 'numeric'
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
    // InternalHLCLSpecificationLanguage.g:773:1: rule__SPLop__Alternatives : ( ( 'optional' ) | ( 'mandatory' ) | ( 'requires' ) | ( 'excludes' ) );
    public final void rule__SPLop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:777:1: ( ( 'optional' ) | ( 'mandatory' ) | ( 'requires' ) | ( 'excludes' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:778:2: ( 'optional' )
                    {
                    // InternalHLCLSpecificationLanguage.g:778:2: ( 'optional' )
                    // InternalHLCLSpecificationLanguage.g:779:3: 'optional'
                    {
                     before(grammarAccess.getSPLopAccess().getOptionalKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getOptionalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:784:2: ( 'mandatory' )
                    {
                    // InternalHLCLSpecificationLanguage.g:784:2: ( 'mandatory' )
                    // InternalHLCLSpecificationLanguage.g:785:3: 'mandatory'
                    {
                     before(grammarAccess.getSPLopAccess().getMandatoryKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getMandatoryKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:790:2: ( 'requires' )
                    {
                    // InternalHLCLSpecificationLanguage.g:790:2: ( 'requires' )
                    // InternalHLCLSpecificationLanguage.g:791:3: 'requires'
                    {
                     before(grammarAccess.getSPLopAccess().getRequiresKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getRequiresKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHLCLSpecificationLanguage.g:796:2: ( 'excludes' )
                    {
                    // InternalHLCLSpecificationLanguage.g:796:2: ( 'excludes' )
                    // InternalHLCLSpecificationLanguage.g:797:3: 'excludes'
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
    // InternalHLCLSpecificationLanguage.g:806:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:810:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHLCLSpecificationLanguage.g:811:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalHLCLSpecificationLanguage.g:818:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:822:1: ( ( 'model' ) )
            // InternalHLCLSpecificationLanguage.g:823:1: ( 'model' )
            {
            // InternalHLCLSpecificationLanguage.g:823:1: ( 'model' )
            // InternalHLCLSpecificationLanguage.g:824:2: 'model'
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
    // InternalHLCLSpecificationLanguage.g:833:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:837:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalHLCLSpecificationLanguage.g:838:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalHLCLSpecificationLanguage.g:845:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:849:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:850:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:850:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:851:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:852:2: ( rule__Model__NameAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:852:3: rule__Model__NameAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:860:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:864:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalHLCLSpecificationLanguage.g:865:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalHLCLSpecificationLanguage.g:872:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:876:1: ( ( 'variables:' ) )
            // InternalHLCLSpecificationLanguage.g:877:1: ( 'variables:' )
            {
            // InternalHLCLSpecificationLanguage.g:877:1: ( 'variables:' )
            // InternalHLCLSpecificationLanguage.g:878:2: 'variables:'
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
    // InternalHLCLSpecificationLanguage.g:887:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:891:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalHLCLSpecificationLanguage.g:892:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalHLCLSpecificationLanguage.g:899:1: rule__Model__Group__3__Impl : ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:903:1: ( ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:904:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:904:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalHLCLSpecificationLanguage.g:905:2: ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalHLCLSpecificationLanguage.g:905:2: ( ( rule__Model__VarsAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:906:3: ( rule__Model__VarsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:907:3: ( rule__Model__VarsAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:907:4: rule__Model__VarsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Model__VarsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

            }

            // InternalHLCLSpecificationLanguage.g:910:2: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalHLCLSpecificationLanguage.g:911:3: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:912:3: ( rule__Model__VarsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=14)||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:912:4: rule__Model__VarsAssignment_3
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
    // InternalHLCLSpecificationLanguage.g:921:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:925:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalHLCLSpecificationLanguage.g:926:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalHLCLSpecificationLanguage.g:933:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:937:1: ( ( 'constraints:' ) )
            // InternalHLCLSpecificationLanguage.g:938:1: ( 'constraints:' )
            {
            // InternalHLCLSpecificationLanguage.g:938:1: ( 'constraints:' )
            // InternalHLCLSpecificationLanguage.g:939:2: 'constraints:'
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
    // InternalHLCLSpecificationLanguage.g:948:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:952:1: ( rule__Model__Group__5__Impl )
            // InternalHLCLSpecificationLanguage.g:953:2: rule__Model__Group__5__Impl
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
    // InternalHLCLSpecificationLanguage.g:959:1: rule__Model__Group__5__Impl : ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:963:1: ( ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:964:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:964:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalHLCLSpecificationLanguage.g:965:2: ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalHLCLSpecificationLanguage.g:965:2: ( ( rule__Model__ConstraintsAssignment_5 ) )
            // InternalHLCLSpecificationLanguage.g:966:3: ( rule__Model__ConstraintsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:967:3: ( rule__Model__ConstraintsAssignment_5 )
            // InternalHLCLSpecificationLanguage.g:967:4: rule__Model__ConstraintsAssignment_5
            {
            pushFollow(FOLLOW_8);
            rule__Model__ConstraintsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 

            }

            // InternalHLCLSpecificationLanguage.g:970:2: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalHLCLSpecificationLanguage.g:971:3: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:972:3: ( rule__Model__ConstraintsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:972:4: rule__Model__ConstraintsAssignment_5
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
    // InternalHLCLSpecificationLanguage.g:982:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:986:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalHLCLSpecificationLanguage.g:987:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalHLCLSpecificationLanguage.g:994:1: rule__VarDeclaration__Group__0__Impl : ( ruleModifier ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:998:1: ( ( ruleModifier ) )
            // InternalHLCLSpecificationLanguage.g:999:1: ( ruleModifier )
            {
            // InternalHLCLSpecificationLanguage.g:999:1: ( ruleModifier )
            // InternalHLCLSpecificationLanguage.g:1000:2: ruleModifier
            {
             before(grammarAccess.getVarDeclarationAccess().getModifierParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getModifierParserRuleCall_0()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1009:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1013:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1014:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHLCLSpecificationLanguage.g:1021:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1025:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1026:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1026:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1027:2: ( rule__VarDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1028:2: ( rule__VarDeclaration__NameAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1028:3: rule__VarDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1036:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1040:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1041:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalHLCLSpecificationLanguage.g:1048:1: rule__VarDeclaration__Group__2__Impl : ( 'variants:' ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1052:1: ( ( 'variants:' ) )
            // InternalHLCLSpecificationLanguage.g:1053:1: ( 'variants:' )
            {
            // InternalHLCLSpecificationLanguage.g:1053:1: ( 'variants:' )
            // InternalHLCLSpecificationLanguage.g:1054:2: 'variants:'
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getVariantsKeyword_2()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:1063:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1067:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1068:2: rule__VarDeclaration__Group__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1074:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__DomAssignment_3 ) ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1078:1: ( ( ( rule__VarDeclaration__DomAssignment_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1079:1: ( ( rule__VarDeclaration__DomAssignment_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1079:1: ( ( rule__VarDeclaration__DomAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:1080:2: ( rule__VarDeclaration__DomAssignment_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getDomAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:1081:2: ( rule__VarDeclaration__DomAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:1081:3: rule__VarDeclaration__DomAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__DomAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getDomAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__VariantsInterval__Group__0"
    // InternalHLCLSpecificationLanguage.g:1090:1: rule__VariantsInterval__Group__0 : rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 ;
    public final void rule__VariantsInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1094:1: ( rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1095:2: rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalHLCLSpecificationLanguage.g:1102:1: rule__VariantsInterval__Group__0__Impl : ( () ) ;
    public final void rule__VariantsInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1106:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1107:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1107:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1108:2: ()
            {
             before(grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1109:2: ()
            // InternalHLCLSpecificationLanguage.g:1109:3: 
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
    // InternalHLCLSpecificationLanguage.g:1117:1: rule__VariantsInterval__Group__1 : rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 ;
    public final void rule__VariantsInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1121:1: ( rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1122:2: rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalHLCLSpecificationLanguage.g:1129:1: rule__VariantsInterval__Group__1__Impl : ( ( rule__VariantsInterval__StartAssignment_1 ) ) ;
    public final void rule__VariantsInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1133:1: ( ( ( rule__VariantsInterval__StartAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1134:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1134:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1135:2: ( rule__VariantsInterval__StartAssignment_1 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1136:2: ( rule__VariantsInterval__StartAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1136:3: rule__VariantsInterval__StartAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:1144:1: rule__VariantsInterval__Group__2 : rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 ;
    public final void rule__VariantsInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1148:1: ( rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1149:2: rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalHLCLSpecificationLanguage.g:1156:1: rule__VariantsInterval__Group__2__Impl : ( '::' ) ;
    public final void rule__VariantsInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1160:1: ( ( '::' ) )
            // InternalHLCLSpecificationLanguage.g:1161:1: ( '::' )
            {
            // InternalHLCLSpecificationLanguage.g:1161:1: ( '::' )
            // InternalHLCLSpecificationLanguage.g:1162:2: '::'
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
    // InternalHLCLSpecificationLanguage.g:1171:1: rule__VariantsInterval__Group__3 : rule__VariantsInterval__Group__3__Impl ;
    public final void rule__VariantsInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1175:1: ( rule__VariantsInterval__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1176:2: rule__VariantsInterval__Group__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1182:1: rule__VariantsInterval__Group__3__Impl : ( ( rule__VariantsInterval__EndAssignment_3 ) ) ;
    public final void rule__VariantsInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1186:1: ( ( ( rule__VariantsInterval__EndAssignment_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1187:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1187:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:1188:2: ( rule__VariantsInterval__EndAssignment_3 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:1189:2: ( rule__VariantsInterval__EndAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:1189:3: rule__VariantsInterval__EndAssignment_3
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
    // InternalHLCLSpecificationLanguage.g:1198:1: rule__VariantsEnumeration__Group__0 : rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 ;
    public final void rule__VariantsEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1202:1: ( rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1203:2: rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1210:1: rule__VariantsEnumeration__Group__0__Impl : ( () ) ;
    public final void rule__VariantsEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1214:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1215:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1215:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1216:2: ()
            {
             before(grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1217:2: ()
            // InternalHLCLSpecificationLanguage.g:1217:3: 
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
    // InternalHLCLSpecificationLanguage.g:1225:1: rule__VariantsEnumeration__Group__1 : rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 ;
    public final void rule__VariantsEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1229:1: ( rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1230:2: rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1237:1: rule__VariantsEnumeration__Group__1__Impl : ( '[' ) ;
    public final void rule__VariantsEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1241:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1242:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1242:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1243:2: '['
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
    // InternalHLCLSpecificationLanguage.g:1252:1: rule__VariantsEnumeration__Group__2 : rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 ;
    public final void rule__VariantsEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1256:1: ( rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1257:2: rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalHLCLSpecificationLanguage.g:1264:1: rule__VariantsEnumeration__Group__2__Impl : ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) ;
    public final void rule__VariantsEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1268:1: ( ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1269:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1269:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1270:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1271:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1271:3: rule__VariantsEnumeration__ListAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1279:1: rule__VariantsEnumeration__Group__3 : rule__VariantsEnumeration__Group__3__Impl ;
    public final void rule__VariantsEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1283:1: ( rule__VariantsEnumeration__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1284:2: rule__VariantsEnumeration__Group__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1290:1: rule__VariantsEnumeration__Group__3__Impl : ( ']' ) ;
    public final void rule__VariantsEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1294:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1295:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1295:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1296:2: ']'
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
    // InternalHLCLSpecificationLanguage.g:1306:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1310:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1311:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalHLCLSpecificationLanguage.g:1318:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1322:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1323:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1323:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1324:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1325:2: ( rule__Constraint__NameAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1325:3: rule__Constraint__NameAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1333:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1337:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1338:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHLCLSpecificationLanguage.g:1345:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1349:1: ( ( ':' ) )
            // InternalHLCLSpecificationLanguage.g:1350:1: ( ':' )
            {
            // InternalHLCLSpecificationLanguage.g:1350:1: ( ':' )
            // InternalHLCLSpecificationLanguage.g:1351:2: ':'
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
    // InternalHLCLSpecificationLanguage.g:1360:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1364:1: ( rule__Constraint__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1365:2: rule__Constraint__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1371:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1375:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1376:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1376:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1377:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1378:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1378:3: rule__Constraint__ExpAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1387:1: rule__TerminalExp__Group_0__0 : rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 ;
    public final void rule__TerminalExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1391:1: ( rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 )
            // InternalHLCLSpecificationLanguage.g:1392:2: rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalHLCLSpecificationLanguage.g:1399:1: rule__TerminalExp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1403:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1404:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1404:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1405:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1414:1: rule__TerminalExp__Group_0__1 : rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 ;
    public final void rule__TerminalExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1418:1: ( rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 )
            // InternalHLCLSpecificationLanguage.g:1419:2: rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalHLCLSpecificationLanguage.g:1426:1: rule__TerminalExp__Group_0__1__Impl : ( ruleConsExpression ) ;
    public final void rule__TerminalExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1430:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:1431:1: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:1431:1: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:1432:2: ruleConsExpression
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
    // InternalHLCLSpecificationLanguage.g:1441:1: rule__TerminalExp__Group_0__2 : rule__TerminalExp__Group_0__2__Impl ;
    public final void rule__TerminalExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1445:1: ( rule__TerminalExp__Group_0__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1446:2: rule__TerminalExp__Group_0__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1452:1: rule__TerminalExp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1456:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1457:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1457:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1458:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1468:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1472:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1473:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalHLCLSpecificationLanguage.g:1480:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1484:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1485:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1485:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1486:2: ( rule__Assignment__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1487:2: ( rule__Assignment__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1487:3: rule__Assignment__VarAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1495:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1499:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1500:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalHLCLSpecificationLanguage.g:1507:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1511:1: ( ( 'is' ) )
            // InternalHLCLSpecificationLanguage.g:1512:1: ( 'is' )
            {
            // InternalHLCLSpecificationLanguage.g:1512:1: ( 'is' )
            // InternalHLCLSpecificationLanguage.g:1513:2: 'is'
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
    // InternalHLCLSpecificationLanguage.g:1522:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1526:1: ( rule__Assignment__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1527:2: rule__Assignment__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1533:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1537:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1538:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1538:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1539:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1540:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1540:3: rule__Assignment__ValueAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1549:1: rule__VarRefinement__Group__0 : rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 ;
    public final void rule__VarRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1553:1: ( rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1554:2: rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalHLCLSpecificationLanguage.g:1561:1: rule__VarRefinement__Group__0__Impl : ( ( rule__VarRefinement__VarAssignment_0 ) ) ;
    public final void rule__VarRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1565:1: ( ( ( rule__VarRefinement__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1566:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1566:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1567:2: ( rule__VarRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1568:2: ( rule__VarRefinement__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1568:3: rule__VarRefinement__VarAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1576:1: rule__VarRefinement__Group__1 : rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 ;
    public final void rule__VarRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1580:1: ( rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1581:2: rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1588:1: rule__VarRefinement__Group__1__Impl : ( 'in' ) ;
    public final void rule__VarRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1592:1: ( ( 'in' ) )
            // InternalHLCLSpecificationLanguage.g:1593:1: ( 'in' )
            {
            // InternalHLCLSpecificationLanguage.g:1593:1: ( 'in' )
            // InternalHLCLSpecificationLanguage.g:1594:2: 'in'
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
    // InternalHLCLSpecificationLanguage.g:1603:1: rule__VarRefinement__Group__2 : rule__VarRefinement__Group__2__Impl ;
    public final void rule__VarRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1607:1: ( rule__VarRefinement__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1608:2: rule__VarRefinement__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1614:1: rule__VarRefinement__Group__2__Impl : ( ( rule__VarRefinement__VariantsAssignment_2 ) ) ;
    public final void rule__VarRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1618:1: ( ( ( rule__VarRefinement__VariantsAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1619:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1619:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1620:2: ( rule__VarRefinement__VariantsAssignment_2 )
            {
             before(grammarAccess.getVarRefinementAccess().getVariantsAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1621:2: ( rule__VarRefinement__VariantsAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1621:3: rule__VarRefinement__VariantsAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1630:1: rule__SetRefinement__Group__0 : rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 ;
    public final void rule__SetRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1634:1: ( rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1635:2: rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalHLCLSpecificationLanguage.g:1642:1: rule__SetRefinement__Group__0__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1646:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1647:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1647:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1648:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1657:1: rule__SetRefinement__Group__1 : rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 ;
    public final void rule__SetRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1661:1: ( rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1662:2: rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalHLCLSpecificationLanguage.g:1669:1: rule__SetRefinement__Group__1__Impl : ( ( rule__SetRefinement__VarsAssignment_1 ) ) ;
    public final void rule__SetRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1673:1: ( ( ( rule__SetRefinement__VarsAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1674:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1674:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1675:2: ( rule__SetRefinement__VarsAssignment_1 )
            {
             before(grammarAccess.getSetRefinementAccess().getVarsAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1676:2: ( rule__SetRefinement__VarsAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1676:3: rule__SetRefinement__VarsAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:1684:1: rule__SetRefinement__Group__2 : rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 ;
    public final void rule__SetRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1688:1: ( rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1689:2: rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalHLCLSpecificationLanguage.g:1696:1: rule__SetRefinement__Group__2__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1700:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1701:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1701:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1702:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1711:1: rule__SetRefinement__Group__3 : rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 ;
    public final void rule__SetRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1715:1: ( rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 )
            // InternalHLCLSpecificationLanguage.g:1716:2: rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalHLCLSpecificationLanguage.g:1723:1: rule__SetRefinement__Group__3__Impl : ( 'variants' ) ;
    public final void rule__SetRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1727:1: ( ( 'variants' ) )
            // InternalHLCLSpecificationLanguage.g:1728:1: ( 'variants' )
            {
            // InternalHLCLSpecificationLanguage.g:1728:1: ( 'variants' )
            // InternalHLCLSpecificationLanguage.g:1729:2: 'variants'
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
    // InternalHLCLSpecificationLanguage.g:1738:1: rule__SetRefinement__Group__4 : rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 ;
    public final void rule__SetRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1742:1: ( rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 )
            // InternalHLCLSpecificationLanguage.g:1743:2: rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalHLCLSpecificationLanguage.g:1750:1: rule__SetRefinement__Group__4__Impl : ( '[' ) ;
    public final void rule__SetRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1754:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1755:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1755:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1756:2: '['
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
    // InternalHLCLSpecificationLanguage.g:1765:1: rule__SetRefinement__Group__5 : rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 ;
    public final void rule__SetRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1769:1: ( rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 )
            // InternalHLCLSpecificationLanguage.g:1770:2: rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalHLCLSpecificationLanguage.g:1777:1: rule__SetRefinement__Group__5__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1781:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1782:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1782:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1783:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1792:1: rule__SetRefinement__Group__6 : rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 ;
    public final void rule__SetRefinement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1796:1: ( rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 )
            // InternalHLCLSpecificationLanguage.g:1797:2: rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalHLCLSpecificationLanguage.g:1804:1: rule__SetRefinement__Group__6__Impl : ( ( rule__SetRefinement__HeadAssignment_6 ) ) ;
    public final void rule__SetRefinement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1808:1: ( ( ( rule__SetRefinement__HeadAssignment_6 ) ) )
            // InternalHLCLSpecificationLanguage.g:1809:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1809:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            // InternalHLCLSpecificationLanguage.g:1810:2: ( rule__SetRefinement__HeadAssignment_6 )
            {
             before(grammarAccess.getSetRefinementAccess().getHeadAssignment_6()); 
            // InternalHLCLSpecificationLanguage.g:1811:2: ( rule__SetRefinement__HeadAssignment_6 )
            // InternalHLCLSpecificationLanguage.g:1811:3: rule__SetRefinement__HeadAssignment_6
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
    // InternalHLCLSpecificationLanguage.g:1819:1: rule__SetRefinement__Group__7 : rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 ;
    public final void rule__SetRefinement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1823:1: ( rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 )
            // InternalHLCLSpecificationLanguage.g:1824:2: rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalHLCLSpecificationLanguage.g:1831:1: rule__SetRefinement__Group__7__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1835:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1836:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1836:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1837:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1846:1: rule__SetRefinement__Group__8 : rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 ;
    public final void rule__SetRefinement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1850:1: ( rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 )
            // InternalHLCLSpecificationLanguage.g:1851:2: rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalHLCLSpecificationLanguage.g:1858:1: rule__SetRefinement__Group__8__Impl : ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) ;
    public final void rule__SetRefinement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1862:1: ( ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:1863:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:1863:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:1864:2: ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:1864:2: ( ( rule__SetRefinement__Group_8__0 ) )
            // InternalHLCLSpecificationLanguage.g:1865:3: ( rule__SetRefinement__Group_8__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1866:3: ( rule__SetRefinement__Group_8__0 )
            // InternalHLCLSpecificationLanguage.g:1866:4: rule__SetRefinement__Group_8__0
            {
            pushFollow(FOLLOW_24);
            rule__SetRefinement__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup_8()); 

            }

            // InternalHLCLSpecificationLanguage.g:1869:2: ( ( rule__SetRefinement__Group_8__0 )* )
            // InternalHLCLSpecificationLanguage.g:1870:3: ( rule__SetRefinement__Group_8__0 )*
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1871:3: ( rule__SetRefinement__Group_8__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1871:4: rule__SetRefinement__Group_8__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SetRefinement__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalHLCLSpecificationLanguage.g:1880:1: rule__SetRefinement__Group__9 : rule__SetRefinement__Group__9__Impl ;
    public final void rule__SetRefinement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1884:1: ( rule__SetRefinement__Group__9__Impl )
            // InternalHLCLSpecificationLanguage.g:1885:2: rule__SetRefinement__Group__9__Impl
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
    // InternalHLCLSpecificationLanguage.g:1891:1: rule__SetRefinement__Group__9__Impl : ( ']' ) ;
    public final void rule__SetRefinement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1895:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1896:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1896:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1897:2: ']'
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
    // InternalHLCLSpecificationLanguage.g:1907:1: rule__SetRefinement__Group_8__0 : rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 ;
    public final void rule__SetRefinement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1911:1: ( rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 )
            // InternalHLCLSpecificationLanguage.g:1912:2: rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalHLCLSpecificationLanguage.g:1919:1: rule__SetRefinement__Group_8__0__Impl : ( ',' ) ;
    public final void rule__SetRefinement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1923:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:1924:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:1924:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:1925:2: ','
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
    // InternalHLCLSpecificationLanguage.g:1934:1: rule__SetRefinement__Group_8__1 : rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 ;
    public final void rule__SetRefinement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1938:1: ( rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 )
            // InternalHLCLSpecificationLanguage.g:1939:2: rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalHLCLSpecificationLanguage.g:1946:1: rule__SetRefinement__Group_8__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1950:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1951:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1951:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1952:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1961:1: rule__SetRefinement__Group_8__2 : rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 ;
    public final void rule__SetRefinement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1965:1: ( rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 )
            // InternalHLCLSpecificationLanguage.g:1966:2: rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalHLCLSpecificationLanguage.g:1973:1: rule__SetRefinement__Group_8__2__Impl : ( ( rule__SetRefinement__TailAssignment_8_2 ) ) ;
    public final void rule__SetRefinement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1977:1: ( ( ( rule__SetRefinement__TailAssignment_8_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1978:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1978:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            // InternalHLCLSpecificationLanguage.g:1979:2: ( rule__SetRefinement__TailAssignment_8_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getTailAssignment_8_2()); 
            // InternalHLCLSpecificationLanguage.g:1980:2: ( rule__SetRefinement__TailAssignment_8_2 )
            // InternalHLCLSpecificationLanguage.g:1980:3: rule__SetRefinement__TailAssignment_8_2
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
    // InternalHLCLSpecificationLanguage.g:1988:1: rule__SetRefinement__Group_8__3 : rule__SetRefinement__Group_8__3__Impl ;
    public final void rule__SetRefinement__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1992:1: ( rule__SetRefinement__Group_8__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1993:2: rule__SetRefinement__Group_8__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1999:1: rule__SetRefinement__Group_8__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2003:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:2004:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:2004:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:2005:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:2015:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2019:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2020:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalHLCLSpecificationLanguage.g:2027:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2031:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2032:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2032:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2033:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2034:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:2034:3: rule__Rule__ConditionAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:2042:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2046:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2047:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHLCLSpecificationLanguage.g:2054:1: rule__Rule__Group__1__Impl : ( '-->' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2058:1: ( ( '-->' ) )
            // InternalHLCLSpecificationLanguage.g:2059:1: ( '-->' )
            {
            // InternalHLCLSpecificationLanguage.g:2059:1: ( '-->' )
            // InternalHLCLSpecificationLanguage.g:2060:2: '-->'
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
    // InternalHLCLSpecificationLanguage.g:2069:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2073:1: ( rule__Rule__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2074:2: rule__Rule__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:2080:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConsequenceAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2084:1: ( ( ( rule__Rule__ConsequenceAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2085:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2085:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2086:2: ( rule__Rule__ConsequenceAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2087:2: ( rule__Rule__ConsequenceAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:2087:3: rule__Rule__ConsequenceAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:2096:1: rule__SPLNotation__Group__0 : rule__SPLNotation__Group__0__Impl rule__SPLNotation__Group__1 ;
    public final void rule__SPLNotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2100:1: ( rule__SPLNotation__Group__0__Impl rule__SPLNotation__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2101:2: rule__SPLNotation__Group__0__Impl rule__SPLNotation__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalHLCLSpecificationLanguage.g:2108:1: rule__SPLNotation__Group__0__Impl : ( ( rule__SPLNotation__Var1Assignment_0 ) ) ;
    public final void rule__SPLNotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2112:1: ( ( ( rule__SPLNotation__Var1Assignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2113:1: ( ( rule__SPLNotation__Var1Assignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2113:1: ( ( rule__SPLNotation__Var1Assignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2114:2: ( rule__SPLNotation__Var1Assignment_0 )
            {
             before(grammarAccess.getSPLNotationAccess().getVar1Assignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2115:2: ( rule__SPLNotation__Var1Assignment_0 )
            // InternalHLCLSpecificationLanguage.g:2115:3: rule__SPLNotation__Var1Assignment_0
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
    // InternalHLCLSpecificationLanguage.g:2123:1: rule__SPLNotation__Group__1 : rule__SPLNotation__Group__1__Impl rule__SPLNotation__Group__2 ;
    public final void rule__SPLNotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2127:1: ( rule__SPLNotation__Group__1__Impl rule__SPLNotation__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2128:2: rule__SPLNotation__Group__1__Impl rule__SPLNotation__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalHLCLSpecificationLanguage.g:2135:1: rule__SPLNotation__Group__1__Impl : ( ( rule__SPLNotation__OpAssignment_1 ) ) ;
    public final void rule__SPLNotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2139:1: ( ( ( rule__SPLNotation__OpAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:2140:1: ( ( rule__SPLNotation__OpAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2140:1: ( ( rule__SPLNotation__OpAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:2141:2: ( rule__SPLNotation__OpAssignment_1 )
            {
             before(grammarAccess.getSPLNotationAccess().getOpAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:2142:2: ( rule__SPLNotation__OpAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:2142:3: rule__SPLNotation__OpAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:2150:1: rule__SPLNotation__Group__2 : rule__SPLNotation__Group__2__Impl ;
    public final void rule__SPLNotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2154:1: ( rule__SPLNotation__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2155:2: rule__SPLNotation__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:2161:1: rule__SPLNotation__Group__2__Impl : ( ( rule__SPLNotation__Var2Assignment_2 ) ) ;
    public final void rule__SPLNotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2165:1: ( ( ( rule__SPLNotation__Var2Assignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2166:1: ( ( rule__SPLNotation__Var2Assignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2166:1: ( ( rule__SPLNotation__Var2Assignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2167:2: ( rule__SPLNotation__Var2Assignment_2 )
            {
             before(grammarAccess.getSPLNotationAccess().getVar2Assignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2168:2: ( rule__SPLNotation__Var2Assignment_2 )
            // InternalHLCLSpecificationLanguage.g:2168:3: rule__SPLNotation__Var2Assignment_2
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


    // $ANTLR start "rule__ListOfValues__Group__0"
    // InternalHLCLSpecificationLanguage.g:2177:1: rule__ListOfValues__Group__0 : rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 ;
    public final void rule__ListOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2181:1: ( rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2182:2: rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalHLCLSpecificationLanguage.g:2189:1: rule__ListOfValues__Group__0__Impl : ( ruleValue ) ;
    public final void rule__ListOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2193:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2194:1: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2194:1: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2195:2: ruleValue
            {
             before(grammarAccess.getListOfValuesAccess().getValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getListOfValuesAccess().getValueParserRuleCall_0()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:2204:1: rule__ListOfValues__Group__1 : rule__ListOfValues__Group__1__Impl ;
    public final void rule__ListOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2208:1: ( rule__ListOfValues__Group__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2209:2: rule__ListOfValues__Group__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2215:1: rule__ListOfValues__Group__1__Impl : ( ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* ) ) ;
    public final void rule__ListOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2219:1: ( ( ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:2220:1: ( ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:2220:1: ( ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:2221:2: ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:2221:2: ( ( rule__ListOfValues__Group_1__0 ) )
            // InternalHLCLSpecificationLanguage.g:2222:3: ( rule__ListOfValues__Group_1__0 )
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2223:3: ( rule__ListOfValues__Group_1__0 )
            // InternalHLCLSpecificationLanguage.g:2223:4: rule__ListOfValues__Group_1__0
            {
            pushFollow(FOLLOW_24);
            rule__ListOfValues__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfValuesAccess().getGroup_1()); 

            }

            // InternalHLCLSpecificationLanguage.g:2226:2: ( ( rule__ListOfValues__Group_1__0 )* )
            // InternalHLCLSpecificationLanguage.g:2227:3: ( rule__ListOfValues__Group_1__0 )*
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2228:3: ( rule__ListOfValues__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:2228:4: rule__ListOfValues__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ListOfValues__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

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
    // InternalHLCLSpecificationLanguage.g:2238:1: rule__ListOfValues__Group_1__0 : rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 ;
    public final void rule__ListOfValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2242:1: ( rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 )
            // InternalHLCLSpecificationLanguage.g:2243:2: rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalHLCLSpecificationLanguage.g:2250:1: rule__ListOfValues__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2254:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:2255:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:2255:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:2256:2: ','
            {
             before(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:2265:1: rule__ListOfValues__Group_1__1 : rule__ListOfValues__Group_1__1__Impl ;
    public final void rule__ListOfValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2269:1: ( rule__ListOfValues__Group_1__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2270:2: rule__ListOfValues__Group_1__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2276:1: rule__ListOfValues__Group_1__1__Impl : ( ruleValue ) ;
    public final void rule__ListOfValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2280:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2281:1: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2281:1: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2282:2: ruleValue
            {
             before(grammarAccess.getListOfValuesAccess().getValueParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getListOfValuesAccess().getValueParserRuleCall_1_1()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:2292:1: rule__ListOfIDs__Group__0 : rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 ;
    public final void rule__ListOfIDs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2296:1: ( rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2297:2: rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalHLCLSpecificationLanguage.g:2304:1: rule__ListOfIDs__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ListOfIDs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2308:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2309:1: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2309:1: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2310:2: RULE_ID
            {
             before(grammarAccess.getListOfIDsAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListOfIDsAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:2319:1: rule__ListOfIDs__Group__1 : rule__ListOfIDs__Group__1__Impl ;
    public final void rule__ListOfIDs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2323:1: ( rule__ListOfIDs__Group__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2324:2: rule__ListOfIDs__Group__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2330:1: rule__ListOfIDs__Group__1__Impl : ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) ) ;
    public final void rule__ListOfIDs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2334:1: ( ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:2335:1: ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:2335:1: ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:2336:2: ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:2336:2: ( ( rule__ListOfIDs__Group_1__0 ) )
            // InternalHLCLSpecificationLanguage.g:2337:3: ( rule__ListOfIDs__Group_1__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2338:3: ( rule__ListOfIDs__Group_1__0 )
            // InternalHLCLSpecificationLanguage.g:2338:4: rule__ListOfIDs__Group_1__0
            {
            pushFollow(FOLLOW_24);
            rule__ListOfIDs__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getGroup_1()); 

            }

            // InternalHLCLSpecificationLanguage.g:2341:2: ( ( rule__ListOfIDs__Group_1__0 )* )
            // InternalHLCLSpecificationLanguage.g:2342:3: ( rule__ListOfIDs__Group_1__0 )*
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2343:3: ( rule__ListOfIDs__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:2343:4: rule__ListOfIDs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
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
    // InternalHLCLSpecificationLanguage.g:2353:1: rule__ListOfIDs__Group_1__0 : rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 ;
    public final void rule__ListOfIDs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2357:1: ( rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 )
            // InternalHLCLSpecificationLanguage.g:2358:2: rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1
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
    // InternalHLCLSpecificationLanguage.g:2365:1: rule__ListOfIDs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfIDs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2369:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:2370:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:2370:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:2371:2: ','
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
    // InternalHLCLSpecificationLanguage.g:2380:1: rule__ListOfIDs__Group_1__1 : rule__ListOfIDs__Group_1__1__Impl ;
    public final void rule__ListOfIDs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2384:1: ( rule__ListOfIDs__Group_1__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2385:2: rule__ListOfIDs__Group_1__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2391:1: rule__ListOfIDs__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ListOfIDs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2395:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2396:1: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2396:1: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2397:2: RULE_ID
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


    // $ANTLR start "rule__Modifier__UnorderedGroup"
    // InternalHLCLSpecificationLanguage.g:2407:1: rule__Modifier__UnorderedGroup : rule__Modifier__UnorderedGroup__0 {...}?;
    public final void rule__Modifier__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getModifierAccess().getUnorderedGroup());
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2412:1: ( rule__Modifier__UnorderedGroup__0 {...}?)
            // InternalHLCLSpecificationLanguage.g:2413:2: rule__Modifier__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModifierAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Modifier__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getModifierAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getModifierAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__UnorderedGroup"


    // $ANTLR start "rule__Modifier__UnorderedGroup__Impl"
    // InternalHLCLSpecificationLanguage.g:2421:1: rule__Modifier__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Modifier__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__TypeAssignment_1 ) ) ) ) ) ;
    public final void rule__Modifier__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2426:1: ( ( ({...}? => ( ( ( rule__Modifier__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__TypeAssignment_1 ) ) ) ) ) )
            // InternalHLCLSpecificationLanguage.g:2427:3: ( ({...}? => ( ( ( rule__Modifier__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__TypeAssignment_1 ) ) ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:2427:3: ( ({...}? => ( ( ( rule__Modifier__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__TypeAssignment_1 ) ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 >= 13 && LA14_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:2428:3: ({...}? => ( ( ( rule__Modifier__InstantiableAssignment_0 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2428:3: ({...}? => ( ( ( rule__Modifier__InstantiableAssignment_0 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2429:4: {...}? => ( ( ( rule__Modifier__InstantiableAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Modifier__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2429:102: ( ( ( rule__Modifier__InstantiableAssignment_0 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2430:5: ( ( rule__Modifier__InstantiableAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2436:5: ( ( rule__Modifier__InstantiableAssignment_0 ) )
                    // InternalHLCLSpecificationLanguage.g:2437:6: ( rule__Modifier__InstantiableAssignment_0 )
                    {
                     before(grammarAccess.getModifierAccess().getInstantiableAssignment_0()); 
                    // InternalHLCLSpecificationLanguage.g:2438:6: ( rule__Modifier__InstantiableAssignment_0 )
                    // InternalHLCLSpecificationLanguage.g:2438:7: rule__Modifier__InstantiableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modifier__InstantiableAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getInstantiableAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:2443:3: ({...}? => ( ( ( rule__Modifier__TypeAssignment_1 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2443:3: ({...}? => ( ( ( rule__Modifier__TypeAssignment_1 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2444:4: {...}? => ( ( ( rule__Modifier__TypeAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Modifier__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2444:102: ( ( ( rule__Modifier__TypeAssignment_1 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2445:5: ( ( rule__Modifier__TypeAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2451:5: ( ( rule__Modifier__TypeAssignment_1 ) )
                    // InternalHLCLSpecificationLanguage.g:2452:6: ( rule__Modifier__TypeAssignment_1 )
                    {
                     before(grammarAccess.getModifierAccess().getTypeAssignment_1()); 
                    // InternalHLCLSpecificationLanguage.g:2453:6: ( rule__Modifier__TypeAssignment_1 )
                    // InternalHLCLSpecificationLanguage.g:2453:7: rule__Modifier__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modifier__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getTypeAssignment_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__UnorderedGroup__Impl"


    // $ANTLR start "rule__Modifier__UnorderedGroup__0"
    // InternalHLCLSpecificationLanguage.g:2466:1: rule__Modifier__UnorderedGroup__0 : rule__Modifier__UnorderedGroup__Impl ( rule__Modifier__UnorderedGroup__1 )? ;
    public final void rule__Modifier__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2470:1: ( rule__Modifier__UnorderedGroup__Impl ( rule__Modifier__UnorderedGroup__1 )? )
            // InternalHLCLSpecificationLanguage.g:2471:2: rule__Modifier__UnorderedGroup__Impl ( rule__Modifier__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_7);
            rule__Modifier__UnorderedGroup__Impl();

            state._fsp--;

            // InternalHLCLSpecificationLanguage.g:2472:2: ( rule__Modifier__UnorderedGroup__1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 >= 13 && LA15_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:2472:2: rule__Modifier__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modifier__UnorderedGroup__1();

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
    // $ANTLR end "rule__Modifier__UnorderedGroup__0"


    // $ANTLR start "rule__Modifier__UnorderedGroup__1"
    // InternalHLCLSpecificationLanguage.g:2478:1: rule__Modifier__UnorderedGroup__1 : rule__Modifier__UnorderedGroup__Impl ;
    public final void rule__Modifier__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2482:1: ( rule__Modifier__UnorderedGroup__Impl )
            // InternalHLCLSpecificationLanguage.g:2483:2: rule__Modifier__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__UnorderedGroup__1"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2490:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2494:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2495:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2495:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2496:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2505:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2509:1: ( ( ruleVarDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2510:2: ( ruleVarDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2510:2: ( ruleVarDeclaration )
            // InternalHLCLSpecificationLanguage.g:2511:3: ruleVarDeclaration
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
    // InternalHLCLSpecificationLanguage.g:2520:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2524:1: ( ( ruleConstraint ) )
            // InternalHLCLSpecificationLanguage.g:2525:2: ( ruleConstraint )
            {
            // InternalHLCLSpecificationLanguage.g:2525:2: ( ruleConstraint )
            // InternalHLCLSpecificationLanguage.g:2526:3: ruleConstraint
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


    // $ANTLR start "rule__VarDeclaration__NameAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2535:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2539:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2540:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2540:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2541:3: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__VarDeclaration__DomAssignment_3"
    // InternalHLCLSpecificationLanguage.g:2550:1: rule__VarDeclaration__DomAssignment_3 : ( ruleVariantDeclaration ) ;
    public final void rule__VarDeclaration__DomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2554:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2555:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2555:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2556:3: ruleVariantDeclaration
            {
             before(grammarAccess.getVarDeclarationAccess().getDomVariantDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariantDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getDomVariantDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__DomAssignment_3"


    // $ANTLR start "rule__Modifier__InstantiableAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2565:1: rule__Modifier__InstantiableAssignment_0 : ( ( 'instantiable' ) ) ;
    public final void rule__Modifier__InstantiableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2569:1: ( ( ( 'instantiable' ) ) )
            // InternalHLCLSpecificationLanguage.g:2570:2: ( ( 'instantiable' ) )
            {
            // InternalHLCLSpecificationLanguage.g:2570:2: ( ( 'instantiable' ) )
            // InternalHLCLSpecificationLanguage.g:2571:3: ( 'instantiable' )
            {
             before(grammarAccess.getModifierAccess().getInstantiableInstantiableKeyword_0_0()); 
            // InternalHLCLSpecificationLanguage.g:2572:3: ( 'instantiable' )
            // InternalHLCLSpecificationLanguage.g:2573:4: 'instantiable'
            {
             before(grammarAccess.getModifierAccess().getInstantiableInstantiableKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModifierAccess().getInstantiableInstantiableKeyword_0_0()); 

            }

             after(grammarAccess.getModifierAccess().getInstantiableInstantiableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__InstantiableAssignment_0"


    // $ANTLR start "rule__Modifier__TypeAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2584:1: rule__Modifier__TypeAssignment_1 : ( ruleVarType ) ;
    public final void rule__Modifier__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2588:1: ( ( ruleVarType ) )
            // InternalHLCLSpecificationLanguage.g:2589:2: ( ruleVarType )
            {
            // InternalHLCLSpecificationLanguage.g:2589:2: ( ruleVarType )
            // InternalHLCLSpecificationLanguage.g:2590:3: ruleVarType
            {
             before(grammarAccess.getModifierAccess().getTypeVarTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getModifierAccess().getTypeVarTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__TypeAssignment_1"


    // $ANTLR start "rule__VariantsInterval__StartAssignment_1"
    // InternalHLCLSpecificationLanguage.g:2599:1: rule__VariantsInterval__StartAssignment_1 : ( ruleValue ) ;
    public final void rule__VariantsInterval__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2603:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2604:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2604:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2605:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2614:1: rule__VariantsInterval__EndAssignment_3 : ( ruleValue ) ;
    public final void rule__VariantsInterval__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2618:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2619:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2619:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2620:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2629:1: rule__VariantsEnumeration__ListAssignment_2 : ( ruleEnumeration ) ;
    public final void rule__VariantsEnumeration__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2633:1: ( ( ruleEnumeration ) )
            // InternalHLCLSpecificationLanguage.g:2634:2: ( ruleEnumeration )
            {
            // InternalHLCLSpecificationLanguage.g:2634:2: ( ruleEnumeration )
            // InternalHLCLSpecificationLanguage.g:2635:3: ruleEnumeration
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


    // $ANTLR start "rule__Constraint__NameAssignment_0"
    // InternalHLCLSpecificationLanguage.g:2644:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2648:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2649:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2649:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2650:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2659:1: rule__Constraint__ExpAssignment_2 : ( ruleConsExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2663:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:2664:2: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:2664:2: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:2665:3: ruleConsExpression
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
    // InternalHLCLSpecificationLanguage.g:2674:1: rule__IDCons__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDCons__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2678:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2679:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2679:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2680:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2689:1: rule__Assignment__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2693:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2694:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2694:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2695:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2704:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2708:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2709:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2709:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2710:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2719:1: rule__VarRefinement__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2723:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2724:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2724:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2725:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2734:1: rule__VarRefinement__VariantsAssignment_2 : ( ruleVariantDeclaration ) ;
    public final void rule__VarRefinement__VariantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2738:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2739:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2739:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2740:3: ruleVariantDeclaration
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
    // InternalHLCLSpecificationLanguage.g:2749:1: rule__SetRefinement__VarsAssignment_1 : ( ruleListOfIDs ) ;
    public final void rule__SetRefinement__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2753:1: ( ( ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:2754:2: ( ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:2754:2: ( ruleListOfIDs )
            // InternalHLCLSpecificationLanguage.g:2755:3: ruleListOfIDs
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
    // InternalHLCLSpecificationLanguage.g:2764:1: rule__SetRefinement__HeadAssignment_6 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__HeadAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2768:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2769:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2769:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2770:3: ruleListOfValues
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
    // InternalHLCLSpecificationLanguage.g:2779:1: rule__SetRefinement__TailAssignment_8_2 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__TailAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2783:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2784:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2784:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2785:3: ruleListOfValues
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
    // InternalHLCLSpecificationLanguage.g:2794:1: rule__Rule__ConditionAssignment_0 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2798:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:2799:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:2799:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:2800:3: ruleTerminalExp
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
    // InternalHLCLSpecificationLanguage.g:2809:1: rule__Rule__ConsequenceAssignment_2 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConsequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2813:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:2814:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:2814:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:2815:3: ruleTerminalExp
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
    // InternalHLCLSpecificationLanguage.g:2824:1: rule__SPLNotation__Var1Assignment_0 : ( RULE_ID ) ;
    public final void rule__SPLNotation__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2828:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2829:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2829:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2830:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2839:1: rule__SPLNotation__OpAssignment_1 : ( ruleSPLop ) ;
    public final void rule__SPLNotation__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2843:1: ( ( ruleSPLop ) )
            // InternalHLCLSpecificationLanguage.g:2844:2: ( ruleSPLop )
            {
            // InternalHLCLSpecificationLanguage.g:2844:2: ( ruleSPLop )
            // InternalHLCLSpecificationLanguage.g:2845:3: ruleSPLop
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
    // InternalHLCLSpecificationLanguage.g:2854:1: rule__SPLNotation__Var2Assignment_2 : ( RULE_ID ) ;
    public final void rule__SPLNotation__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2858:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2859:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2859:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2860:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001001810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000078000L});

}
