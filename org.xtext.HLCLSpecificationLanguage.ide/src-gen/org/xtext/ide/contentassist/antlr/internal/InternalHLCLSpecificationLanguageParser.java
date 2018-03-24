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
    // InternalHLCLSpecificationLanguage.g:512:1: ruleListOfValues : ( ( rule__ListOfValues__Group__0 ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:516:2: ( ( ( rule__ListOfValues__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( rule__ListOfValues__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( rule__ListOfValues__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:518:3: ( rule__ListOfValues__Group__0 )
            {
             before(grammarAccess.getListOfValuesAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:519:3: ( rule__ListOfValues__Group__0 )
            // InternalHLCLSpecificationLanguage.g:519:4: rule__ListOfValues__Group__0
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
    // InternalHLCLSpecificationLanguage.g:528:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:529:1: ( ruleListOfIDs EOF )
            // InternalHLCLSpecificationLanguage.g:530:1: ruleListOfIDs EOF
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
    // InternalHLCLSpecificationLanguage.g:537:1: ruleListOfIDs : ( ( rule__ListOfIDs__Group__0 ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:541:2: ( ( ( rule__ListOfIDs__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:542:2: ( ( rule__ListOfIDs__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:542:2: ( ( rule__ListOfIDs__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:543:3: ( rule__ListOfIDs__Group__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:544:3: ( rule__ListOfIDs__Group__0 )
            // InternalHLCLSpecificationLanguage.g:544:4: rule__ListOfIDs__Group__0
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
    // InternalHLCLSpecificationLanguage.g:553:1: entryRuleSPLop : ruleSPLop EOF ;
    public final void entryRuleSPLop() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:554:1: ( ruleSPLop EOF )
            // InternalHLCLSpecificationLanguage.g:555:1: ruleSPLop EOF
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
    // InternalHLCLSpecificationLanguage.g:562:1: ruleSPLop : ( ( rule__SPLop__Alternatives ) ) ;
    public final void ruleSPLop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:566:2: ( ( ( rule__SPLop__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:567:2: ( ( rule__SPLop__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:567:2: ( ( rule__SPLop__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:568:3: ( rule__SPLop__Alternatives )
            {
             before(grammarAccess.getSPLopAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:569:3: ( rule__SPLop__Alternatives )
            // InternalHLCLSpecificationLanguage.g:569:4: rule__SPLop__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:577:1: rule__VariantDeclaration__Alternatives : ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) );
    public final void rule__VariantDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:581:1: ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) )
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
                    // InternalHLCLSpecificationLanguage.g:582:2: ( rulevariantsInterval )
                    {
                    // InternalHLCLSpecificationLanguage.g:582:2: ( rulevariantsInterval )
                    // InternalHLCLSpecificationLanguage.g:583:3: rulevariantsInterval
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
                    // InternalHLCLSpecificationLanguage.g:588:2: ( rulevariantsEnumeration )
                    {
                    // InternalHLCLSpecificationLanguage.g:588:2: ( rulevariantsEnumeration )
                    // InternalHLCLSpecificationLanguage.g:589:3: rulevariantsEnumeration
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
    // InternalHLCLSpecificationLanguage.g:598:1: rule__Enumeration__Alternatives : ( ( ruleListOfValues ) | ( ruleListOfIDs ) );
    public final void rule__Enumeration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:602:1: ( ( ruleListOfValues ) | ( ruleListOfIDs ) )
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
                    // InternalHLCLSpecificationLanguage.g:603:2: ( ruleListOfValues )
                    {
                    // InternalHLCLSpecificationLanguage.g:603:2: ( ruleListOfValues )
                    // InternalHLCLSpecificationLanguage.g:604:3: ruleListOfValues
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
                    // InternalHLCLSpecificationLanguage.g:609:2: ( ruleListOfIDs )
                    {
                    // InternalHLCLSpecificationLanguage.g:609:2: ( ruleListOfIDs )
                    // InternalHLCLSpecificationLanguage.g:610:3: ruleListOfIDs
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
    // InternalHLCLSpecificationLanguage.g:619:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleSPLNotation ) );
    public final void rule__ConsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:623:1: ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleSPLNotation ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
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
                case 29:
                case 30:
                    {
                    alt3=2;
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
                    // InternalHLCLSpecificationLanguage.g:624:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:624:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:625:3: ruleIDCons
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
                    // InternalHLCLSpecificationLanguage.g:630:2: ( ruleRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:630:2: ( ruleRefinement )
                    // InternalHLCLSpecificationLanguage.g:631:3: ruleRefinement
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
                    // InternalHLCLSpecificationLanguage.g:636:2: ( ruleRule )
                    {
                    // InternalHLCLSpecificationLanguage.g:636:2: ( ruleRule )
                    // InternalHLCLSpecificationLanguage.g:637:3: ruleRule
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
                    // InternalHLCLSpecificationLanguage.g:642:2: ( ruleSPLNotation )
                    {
                    // InternalHLCLSpecificationLanguage.g:642:2: ( ruleSPLNotation )
                    // InternalHLCLSpecificationLanguage.g:643:3: ruleSPLNotation
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
    // InternalHLCLSpecificationLanguage.g:652:1: rule__TerminalExp__Alternatives : ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) );
    public final void rule__TerminalExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:656:1: ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) )
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
                    // InternalHLCLSpecificationLanguage.g:657:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:657:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    // InternalHLCLSpecificationLanguage.g:658:3: ( rule__TerminalExp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpAccess().getGroup_0()); 
                    // InternalHLCLSpecificationLanguage.g:659:3: ( rule__TerminalExp__Group_0__0 )
                    // InternalHLCLSpecificationLanguage.g:659:4: rule__TerminalExp__Group_0__0
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
                    // InternalHLCLSpecificationLanguage.g:663:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:663:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:664:3: ruleIDCons
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
    // InternalHLCLSpecificationLanguage.g:673:1: rule__Refinement__Alternatives : ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) );
    public final void rule__Refinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:677:1: ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) )
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
                    // InternalHLCLSpecificationLanguage.g:678:2: ( ruleAssignment )
                    {
                    // InternalHLCLSpecificationLanguage.g:678:2: ( ruleAssignment )
                    // InternalHLCLSpecificationLanguage.g:679:3: ruleAssignment
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
                    // InternalHLCLSpecificationLanguage.g:684:2: ( ruleVarRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:684:2: ( ruleVarRefinement )
                    // InternalHLCLSpecificationLanguage.g:685:3: ruleVarRefinement
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
                    // InternalHLCLSpecificationLanguage.g:690:2: ( ruleSetRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:690:2: ( ruleSetRefinement )
                    // InternalHLCLSpecificationLanguage.g:691:3: ruleSetRefinement
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
    // InternalHLCLSpecificationLanguage.g:700:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:704:1: ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) )
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
                    // InternalHLCLSpecificationLanguage.g:705:2: ( RULE_INT )
                    {
                    // InternalHLCLSpecificationLanguage.g:705:2: ( RULE_INT )
                    // InternalHLCLSpecificationLanguage.g:706:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:711:2: ( 'selected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:711:2: ( 'selected' )
                    // InternalHLCLSpecificationLanguage.g:712:3: 'selected'
                    {
                     before(grammarAccess.getValueAccess().getSelectedKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSelectedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:717:2: ( 'unselected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:717:2: ( 'unselected' )
                    // InternalHLCLSpecificationLanguage.g:718:3: 'unselected'
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
    // InternalHLCLSpecificationLanguage.g:727:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'numeric' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:731:1: ( ( 'boolean' ) | ( 'numeric' ) )
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
                    // InternalHLCLSpecificationLanguage.g:732:2: ( 'boolean' )
                    {
                    // InternalHLCLSpecificationLanguage.g:732:2: ( 'boolean' )
                    // InternalHLCLSpecificationLanguage.g:733:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:738:2: ( 'numeric' )
                    {
                    // InternalHLCLSpecificationLanguage.g:738:2: ( 'numeric' )
                    // InternalHLCLSpecificationLanguage.g:739:3: 'numeric'
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
    // InternalHLCLSpecificationLanguage.g:748:1: rule__SPLop__Alternatives : ( ( 'optional' ) | ( 'mandatory' ) | ( 'requires' ) | ( 'excludes' ) );
    public final void rule__SPLop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:752:1: ( ( 'optional' ) | ( 'mandatory' ) | ( 'requires' ) | ( 'excludes' ) )
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
                    // InternalHLCLSpecificationLanguage.g:753:2: ( 'optional' )
                    {
                    // InternalHLCLSpecificationLanguage.g:753:2: ( 'optional' )
                    // InternalHLCLSpecificationLanguage.g:754:3: 'optional'
                    {
                     before(grammarAccess.getSPLopAccess().getOptionalKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getOptionalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:759:2: ( 'mandatory' )
                    {
                    // InternalHLCLSpecificationLanguage.g:759:2: ( 'mandatory' )
                    // InternalHLCLSpecificationLanguage.g:760:3: 'mandatory'
                    {
                     before(grammarAccess.getSPLopAccess().getMandatoryKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getMandatoryKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:765:2: ( 'requires' )
                    {
                    // InternalHLCLSpecificationLanguage.g:765:2: ( 'requires' )
                    // InternalHLCLSpecificationLanguage.g:766:3: 'requires'
                    {
                     before(grammarAccess.getSPLopAccess().getRequiresKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSPLopAccess().getRequiresKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHLCLSpecificationLanguage.g:771:2: ( 'excludes' )
                    {
                    // InternalHLCLSpecificationLanguage.g:771:2: ( 'excludes' )
                    // InternalHLCLSpecificationLanguage.g:772:3: 'excludes'
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
    // InternalHLCLSpecificationLanguage.g:781:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:785:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHLCLSpecificationLanguage.g:786:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalHLCLSpecificationLanguage.g:793:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:797:1: ( ( 'model' ) )
            // InternalHLCLSpecificationLanguage.g:798:1: ( 'model' )
            {
            // InternalHLCLSpecificationLanguage.g:798:1: ( 'model' )
            // InternalHLCLSpecificationLanguage.g:799:2: 'model'
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
    // InternalHLCLSpecificationLanguage.g:808:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:812:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalHLCLSpecificationLanguage.g:813:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalHLCLSpecificationLanguage.g:820:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:824:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:825:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:825:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:826:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:827:2: ( rule__Model__NameAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:827:3: rule__Model__NameAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:835:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:839:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalHLCLSpecificationLanguage.g:840:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalHLCLSpecificationLanguage.g:847:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:851:1: ( ( 'variables:' ) )
            // InternalHLCLSpecificationLanguage.g:852:1: ( 'variables:' )
            {
            // InternalHLCLSpecificationLanguage.g:852:1: ( 'variables:' )
            // InternalHLCLSpecificationLanguage.g:853:2: 'variables:'
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
    // InternalHLCLSpecificationLanguage.g:862:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:866:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalHLCLSpecificationLanguage.g:867:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalHLCLSpecificationLanguage.g:874:1: rule__Model__Group__3__Impl : ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:878:1: ( ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:879:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:879:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalHLCLSpecificationLanguage.g:880:2: ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalHLCLSpecificationLanguage.g:880:2: ( ( rule__Model__VarsAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:881:3: ( rule__Model__VarsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:882:3: ( rule__Model__VarsAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:882:4: rule__Model__VarsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Model__VarsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

            }

            // InternalHLCLSpecificationLanguage.g:885:2: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalHLCLSpecificationLanguage.g:886:3: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:887:3: ( rule__Model__VarsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=14)||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:887:4: rule__Model__VarsAssignment_3
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
    // InternalHLCLSpecificationLanguage.g:896:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:900:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalHLCLSpecificationLanguage.g:901:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalHLCLSpecificationLanguage.g:908:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:912:1: ( ( 'constraints:' ) )
            // InternalHLCLSpecificationLanguage.g:913:1: ( 'constraints:' )
            {
            // InternalHLCLSpecificationLanguage.g:913:1: ( 'constraints:' )
            // InternalHLCLSpecificationLanguage.g:914:2: 'constraints:'
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
    // InternalHLCLSpecificationLanguage.g:923:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:927:1: ( rule__Model__Group__5__Impl )
            // InternalHLCLSpecificationLanguage.g:928:2: rule__Model__Group__5__Impl
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
    // InternalHLCLSpecificationLanguage.g:934:1: rule__Model__Group__5__Impl : ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:938:1: ( ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:939:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:939:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalHLCLSpecificationLanguage.g:940:2: ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalHLCLSpecificationLanguage.g:940:2: ( ( rule__Model__ConstraintsAssignment_5 ) )
            // InternalHLCLSpecificationLanguage.g:941:3: ( rule__Model__ConstraintsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:942:3: ( rule__Model__ConstraintsAssignment_5 )
            // InternalHLCLSpecificationLanguage.g:942:4: rule__Model__ConstraintsAssignment_5
            {
            pushFollow(FOLLOW_8);
            rule__Model__ConstraintsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 

            }

            // InternalHLCLSpecificationLanguage.g:945:2: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalHLCLSpecificationLanguage.g:946:3: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:947:3: ( rule__Model__ConstraintsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:947:4: rule__Model__ConstraintsAssignment_5
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


    // $ANTLR start "rule__VarDeclaration__Group_1__0"
    // InternalHLCLSpecificationLanguage.g:957:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:961:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalHLCLSpecificationLanguage.g:962:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalHLCLSpecificationLanguage.g:969:1: rule__VarDeclaration__Group_1__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_1_0 ) ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:973:1: ( ( ( rule__VarDeclaration__TypeAssignment_1_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:974:1: ( ( rule__VarDeclaration__TypeAssignment_1_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:974:1: ( ( rule__VarDeclaration__TypeAssignment_1_0 ) )
            // InternalHLCLSpecificationLanguage.g:975:2: ( rule__VarDeclaration__TypeAssignment_1_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1_0()); 
            // InternalHLCLSpecificationLanguage.g:976:2: ( rule__VarDeclaration__TypeAssignment_1_0 )
            // InternalHLCLSpecificationLanguage.g:976:3: rule__VarDeclaration__TypeAssignment_1_0
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
    // InternalHLCLSpecificationLanguage.g:984:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2 ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:988:1: ( rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2 )
            // InternalHLCLSpecificationLanguage.g:989:2: rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHLCLSpecificationLanguage.g:996:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1000:1: ( ( ( rule__VarDeclaration__NameAssignment_1_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1001:1: ( ( rule__VarDeclaration__NameAssignment_1_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1001:1: ( ( rule__VarDeclaration__NameAssignment_1_1 ) )
            // InternalHLCLSpecificationLanguage.g:1002:2: ( rule__VarDeclaration__NameAssignment_1_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1_1()); 
            // InternalHLCLSpecificationLanguage.g:1003:2: ( rule__VarDeclaration__NameAssignment_1_1 )
            // InternalHLCLSpecificationLanguage.g:1003:3: rule__VarDeclaration__NameAssignment_1_1
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
    // InternalHLCLSpecificationLanguage.g:1011:1: rule__VarDeclaration__Group_1__2 : rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3 ;
    public final void rule__VarDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1015:1: ( rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3 )
            // InternalHLCLSpecificationLanguage.g:1016:2: rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalHLCLSpecificationLanguage.g:1023:1: rule__VarDeclaration__Group_1__2__Impl : ( 'variants:' ) ;
    public final void rule__VarDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1027:1: ( ( 'variants:' ) )
            // InternalHLCLSpecificationLanguage.g:1028:1: ( 'variants:' )
            {
            // InternalHLCLSpecificationLanguage.g:1028:1: ( 'variants:' )
            // InternalHLCLSpecificationLanguage.g:1029:2: 'variants:'
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
    // InternalHLCLSpecificationLanguage.g:1038:1: rule__VarDeclaration__Group_1__3 : rule__VarDeclaration__Group_1__3__Impl ;
    public final void rule__VarDeclaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1042:1: ( rule__VarDeclaration__Group_1__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1043:2: rule__VarDeclaration__Group_1__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1049:1: rule__VarDeclaration__Group_1__3__Impl : ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) ) ;
    public final void rule__VarDeclaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1053:1: ( ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1054:1: ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1054:1: ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) )
            // InternalHLCLSpecificationLanguage.g:1055:2: ( rule__VarDeclaration__VariantsAssignment_1_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_1_3()); 
            // InternalHLCLSpecificationLanguage.g:1056:2: ( rule__VarDeclaration__VariantsAssignment_1_3 )
            // InternalHLCLSpecificationLanguage.g:1056:3: rule__VarDeclaration__VariantsAssignment_1_3
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
    // InternalHLCLSpecificationLanguage.g:1065:1: rule__VariantsInterval__Group__0 : rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 ;
    public final void rule__VariantsInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1069:1: ( rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1070:2: rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1077:1: rule__VariantsInterval__Group__0__Impl : ( () ) ;
    public final void rule__VariantsInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1081:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1082:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1082:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1083:2: ()
            {
             before(grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1084:2: ()
            // InternalHLCLSpecificationLanguage.g:1084:3: 
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
    // InternalHLCLSpecificationLanguage.g:1092:1: rule__VariantsInterval__Group__1 : rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 ;
    public final void rule__VariantsInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1096:1: ( rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1097:2: rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1104:1: rule__VariantsInterval__Group__1__Impl : ( ( rule__VariantsInterval__StartAssignment_1 ) ) ;
    public final void rule__VariantsInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1108:1: ( ( ( rule__VariantsInterval__StartAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1109:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1109:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1110:2: ( rule__VariantsInterval__StartAssignment_1 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1111:2: ( rule__VariantsInterval__StartAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1111:3: rule__VariantsInterval__StartAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:1119:1: rule__VariantsInterval__Group__2 : rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 ;
    public final void rule__VariantsInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1123:1: ( rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1124:2: rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3
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
    // InternalHLCLSpecificationLanguage.g:1131:1: rule__VariantsInterval__Group__2__Impl : ( '::' ) ;
    public final void rule__VariantsInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1135:1: ( ( '::' ) )
            // InternalHLCLSpecificationLanguage.g:1136:1: ( '::' )
            {
            // InternalHLCLSpecificationLanguage.g:1136:1: ( '::' )
            // InternalHLCLSpecificationLanguage.g:1137:2: '::'
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
    // InternalHLCLSpecificationLanguage.g:1146:1: rule__VariantsInterval__Group__3 : rule__VariantsInterval__Group__3__Impl ;
    public final void rule__VariantsInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1150:1: ( rule__VariantsInterval__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1151:2: rule__VariantsInterval__Group__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1157:1: rule__VariantsInterval__Group__3__Impl : ( ( rule__VariantsInterval__EndAssignment_3 ) ) ;
    public final void rule__VariantsInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1161:1: ( ( ( rule__VariantsInterval__EndAssignment_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1162:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1162:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:1163:2: ( rule__VariantsInterval__EndAssignment_3 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:1164:2: ( rule__VariantsInterval__EndAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:1164:3: rule__VariantsInterval__EndAssignment_3
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
    // InternalHLCLSpecificationLanguage.g:1173:1: rule__VariantsEnumeration__Group__0 : rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 ;
    public final void rule__VariantsEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1177:1: ( rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1178:2: rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1185:1: rule__VariantsEnumeration__Group__0__Impl : ( () ) ;
    public final void rule__VariantsEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1189:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1190:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1190:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1191:2: ()
            {
             before(grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1192:2: ()
            // InternalHLCLSpecificationLanguage.g:1192:3: 
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
    // InternalHLCLSpecificationLanguage.g:1200:1: rule__VariantsEnumeration__Group__1 : rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 ;
    public final void rule__VariantsEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1204:1: ( rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1205:2: rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1212:1: rule__VariantsEnumeration__Group__1__Impl : ( '[' ) ;
    public final void rule__VariantsEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1216:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1217:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1217:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1218:2: '['
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
    // InternalHLCLSpecificationLanguage.g:1227:1: rule__VariantsEnumeration__Group__2 : rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 ;
    public final void rule__VariantsEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1231:1: ( rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1232:2: rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3
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
    // InternalHLCLSpecificationLanguage.g:1239:1: rule__VariantsEnumeration__Group__2__Impl : ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) ;
    public final void rule__VariantsEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1243:1: ( ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1244:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1244:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1245:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1246:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1246:3: rule__VariantsEnumeration__ListAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1254:1: rule__VariantsEnumeration__Group__3 : rule__VariantsEnumeration__Group__3__Impl ;
    public final void rule__VariantsEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1258:1: ( rule__VariantsEnumeration__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1259:2: rule__VariantsEnumeration__Group__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1265:1: rule__VariantsEnumeration__Group__3__Impl : ( ']' ) ;
    public final void rule__VariantsEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1269:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1270:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1270:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1271:2: ']'
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
    // InternalHLCLSpecificationLanguage.g:1281:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1285:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1286:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1293:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1297:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1298:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1298:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1299:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1300:2: ( rule__Constraint__NameAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1300:3: rule__Constraint__NameAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1308:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1312:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1313:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1320:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1324:1: ( ( ':' ) )
            // InternalHLCLSpecificationLanguage.g:1325:1: ( ':' )
            {
            // InternalHLCLSpecificationLanguage.g:1325:1: ( ':' )
            // InternalHLCLSpecificationLanguage.g:1326:2: ':'
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
    // InternalHLCLSpecificationLanguage.g:1335:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1339:1: ( rule__Constraint__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1340:2: rule__Constraint__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1346:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1350:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1351:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1351:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1352:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1353:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1353:3: rule__Constraint__ExpAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1362:1: rule__TerminalExp__Group_0__0 : rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 ;
    public final void rule__TerminalExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1366:1: ( rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 )
            // InternalHLCLSpecificationLanguage.g:1367:2: rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1
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
    // InternalHLCLSpecificationLanguage.g:1374:1: rule__TerminalExp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1378:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1379:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1379:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1380:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1389:1: rule__TerminalExp__Group_0__1 : rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 ;
    public final void rule__TerminalExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1393:1: ( rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 )
            // InternalHLCLSpecificationLanguage.g:1394:2: rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2
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
    // InternalHLCLSpecificationLanguage.g:1401:1: rule__TerminalExp__Group_0__1__Impl : ( ruleConsExpression ) ;
    public final void rule__TerminalExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1405:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:1406:1: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:1406:1: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:1407:2: ruleConsExpression
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
    // InternalHLCLSpecificationLanguage.g:1416:1: rule__TerminalExp__Group_0__2 : rule__TerminalExp__Group_0__2__Impl ;
    public final void rule__TerminalExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1420:1: ( rule__TerminalExp__Group_0__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1421:2: rule__TerminalExp__Group_0__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1427:1: rule__TerminalExp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1431:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1432:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1432:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1433:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1443:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1447:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1448:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1455:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1459:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1460:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1460:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1461:2: ( rule__Assignment__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1462:2: ( rule__Assignment__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1462:3: rule__Assignment__VarAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1470:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1474:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1475:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1482:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1486:1: ( ( 'is' ) )
            // InternalHLCLSpecificationLanguage.g:1487:1: ( 'is' )
            {
            // InternalHLCLSpecificationLanguage.g:1487:1: ( 'is' )
            // InternalHLCLSpecificationLanguage.g:1488:2: 'is'
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
    // InternalHLCLSpecificationLanguage.g:1497:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1501:1: ( rule__Assignment__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1502:2: rule__Assignment__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1508:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1512:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1513:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1513:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1514:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1515:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1515:3: rule__Assignment__ValueAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1524:1: rule__VarRefinement__Group__0 : rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 ;
    public final void rule__VarRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1528:1: ( rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1529:2: rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1536:1: rule__VarRefinement__Group__0__Impl : ( ( rule__VarRefinement__VarAssignment_0 ) ) ;
    public final void rule__VarRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1540:1: ( ( ( rule__VarRefinement__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1541:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1541:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1542:2: ( rule__VarRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1543:2: ( rule__VarRefinement__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1543:3: rule__VarRefinement__VarAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1551:1: rule__VarRefinement__Group__1 : rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 ;
    public final void rule__VarRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1555:1: ( rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1556:2: rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1563:1: rule__VarRefinement__Group__1__Impl : ( 'in' ) ;
    public final void rule__VarRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1567:1: ( ( 'in' ) )
            // InternalHLCLSpecificationLanguage.g:1568:1: ( 'in' )
            {
            // InternalHLCLSpecificationLanguage.g:1568:1: ( 'in' )
            // InternalHLCLSpecificationLanguage.g:1569:2: 'in'
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
    // InternalHLCLSpecificationLanguage.g:1578:1: rule__VarRefinement__Group__2 : rule__VarRefinement__Group__2__Impl ;
    public final void rule__VarRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1582:1: ( rule__VarRefinement__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1583:2: rule__VarRefinement__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1589:1: rule__VarRefinement__Group__2__Impl : ( ( rule__VarRefinement__VariantsAssignment_2 ) ) ;
    public final void rule__VarRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1593:1: ( ( ( rule__VarRefinement__VariantsAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1594:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1594:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1595:2: ( rule__VarRefinement__VariantsAssignment_2 )
            {
             before(grammarAccess.getVarRefinementAccess().getVariantsAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1596:2: ( rule__VarRefinement__VariantsAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1596:3: rule__VarRefinement__VariantsAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1605:1: rule__SetRefinement__Group__0 : rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 ;
    public final void rule__SetRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1609:1: ( rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1610:2: rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1617:1: rule__SetRefinement__Group__0__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1621:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1622:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1622:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1623:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1632:1: rule__SetRefinement__Group__1 : rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 ;
    public final void rule__SetRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1636:1: ( rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1637:2: rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1644:1: rule__SetRefinement__Group__1__Impl : ( ( rule__SetRefinement__VarsAssignment_1 ) ) ;
    public final void rule__SetRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1648:1: ( ( ( rule__SetRefinement__VarsAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1649:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1649:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1650:2: ( rule__SetRefinement__VarsAssignment_1 )
            {
             before(grammarAccess.getSetRefinementAccess().getVarsAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1651:2: ( rule__SetRefinement__VarsAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1651:3: rule__SetRefinement__VarsAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:1659:1: rule__SetRefinement__Group__2 : rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 ;
    public final void rule__SetRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1663:1: ( rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1664:2: rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3
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
    // InternalHLCLSpecificationLanguage.g:1671:1: rule__SetRefinement__Group__2__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1675:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1676:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1676:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1677:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1686:1: rule__SetRefinement__Group__3 : rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 ;
    public final void rule__SetRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1690:1: ( rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 )
            // InternalHLCLSpecificationLanguage.g:1691:2: rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4
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
    // InternalHLCLSpecificationLanguage.g:1698:1: rule__SetRefinement__Group__3__Impl : ( 'variants' ) ;
    public final void rule__SetRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1702:1: ( ( 'variants' ) )
            // InternalHLCLSpecificationLanguage.g:1703:1: ( 'variants' )
            {
            // InternalHLCLSpecificationLanguage.g:1703:1: ( 'variants' )
            // InternalHLCLSpecificationLanguage.g:1704:2: 'variants'
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
    // InternalHLCLSpecificationLanguage.g:1713:1: rule__SetRefinement__Group__4 : rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 ;
    public final void rule__SetRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1717:1: ( rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 )
            // InternalHLCLSpecificationLanguage.g:1718:2: rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5
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
    // InternalHLCLSpecificationLanguage.g:1725:1: rule__SetRefinement__Group__4__Impl : ( '[' ) ;
    public final void rule__SetRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1729:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1730:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1730:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1731:2: '['
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
    // InternalHLCLSpecificationLanguage.g:1740:1: rule__SetRefinement__Group__5 : rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 ;
    public final void rule__SetRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1744:1: ( rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 )
            // InternalHLCLSpecificationLanguage.g:1745:2: rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6
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
    // InternalHLCLSpecificationLanguage.g:1752:1: rule__SetRefinement__Group__5__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1756:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1757:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1757:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1758:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1767:1: rule__SetRefinement__Group__6 : rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 ;
    public final void rule__SetRefinement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1771:1: ( rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 )
            // InternalHLCLSpecificationLanguage.g:1772:2: rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7
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
    // InternalHLCLSpecificationLanguage.g:1779:1: rule__SetRefinement__Group__6__Impl : ( ( rule__SetRefinement__HeadAssignment_6 ) ) ;
    public final void rule__SetRefinement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1783:1: ( ( ( rule__SetRefinement__HeadAssignment_6 ) ) )
            // InternalHLCLSpecificationLanguage.g:1784:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1784:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            // InternalHLCLSpecificationLanguage.g:1785:2: ( rule__SetRefinement__HeadAssignment_6 )
            {
             before(grammarAccess.getSetRefinementAccess().getHeadAssignment_6()); 
            // InternalHLCLSpecificationLanguage.g:1786:2: ( rule__SetRefinement__HeadAssignment_6 )
            // InternalHLCLSpecificationLanguage.g:1786:3: rule__SetRefinement__HeadAssignment_6
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
    // InternalHLCLSpecificationLanguage.g:1794:1: rule__SetRefinement__Group__7 : rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 ;
    public final void rule__SetRefinement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1798:1: ( rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 )
            // InternalHLCLSpecificationLanguage.g:1799:2: rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8
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
    // InternalHLCLSpecificationLanguage.g:1806:1: rule__SetRefinement__Group__7__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1810:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1811:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1811:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1812:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1821:1: rule__SetRefinement__Group__8 : rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 ;
    public final void rule__SetRefinement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1825:1: ( rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 )
            // InternalHLCLSpecificationLanguage.g:1826:2: rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9
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
    // InternalHLCLSpecificationLanguage.g:1833:1: rule__SetRefinement__Group__8__Impl : ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) ;
    public final void rule__SetRefinement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1837:1: ( ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:1838:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:1838:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:1839:2: ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:1839:2: ( ( rule__SetRefinement__Group_8__0 ) )
            // InternalHLCLSpecificationLanguage.g:1840:3: ( rule__SetRefinement__Group_8__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1841:3: ( rule__SetRefinement__Group_8__0 )
            // InternalHLCLSpecificationLanguage.g:1841:4: rule__SetRefinement__Group_8__0
            {
            pushFollow(FOLLOW_24);
            rule__SetRefinement__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup_8()); 

            }

            // InternalHLCLSpecificationLanguage.g:1844:2: ( ( rule__SetRefinement__Group_8__0 )* )
            // InternalHLCLSpecificationLanguage.g:1845:3: ( rule__SetRefinement__Group_8__0 )*
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1846:3: ( rule__SetRefinement__Group_8__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1846:4: rule__SetRefinement__Group_8__0
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
    // InternalHLCLSpecificationLanguage.g:1855:1: rule__SetRefinement__Group__9 : rule__SetRefinement__Group__9__Impl ;
    public final void rule__SetRefinement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1859:1: ( rule__SetRefinement__Group__9__Impl )
            // InternalHLCLSpecificationLanguage.g:1860:2: rule__SetRefinement__Group__9__Impl
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
    // InternalHLCLSpecificationLanguage.g:1866:1: rule__SetRefinement__Group__9__Impl : ( ']' ) ;
    public final void rule__SetRefinement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1870:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1871:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1871:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1872:2: ']'
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
    // InternalHLCLSpecificationLanguage.g:1882:1: rule__SetRefinement__Group_8__0 : rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 ;
    public final void rule__SetRefinement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1886:1: ( rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 )
            // InternalHLCLSpecificationLanguage.g:1887:2: rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1
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
    // InternalHLCLSpecificationLanguage.g:1894:1: rule__SetRefinement__Group_8__0__Impl : ( ',' ) ;
    public final void rule__SetRefinement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1898:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:1899:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:1899:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:1900:2: ','
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
    // InternalHLCLSpecificationLanguage.g:1909:1: rule__SetRefinement__Group_8__1 : rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 ;
    public final void rule__SetRefinement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1913:1: ( rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 )
            // InternalHLCLSpecificationLanguage.g:1914:2: rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2
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
    // InternalHLCLSpecificationLanguage.g:1921:1: rule__SetRefinement__Group_8__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1925:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1926:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1926:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1927:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1936:1: rule__SetRefinement__Group_8__2 : rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 ;
    public final void rule__SetRefinement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1940:1: ( rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 )
            // InternalHLCLSpecificationLanguage.g:1941:2: rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3
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
    // InternalHLCLSpecificationLanguage.g:1948:1: rule__SetRefinement__Group_8__2__Impl : ( ( rule__SetRefinement__TailAssignment_8_2 ) ) ;
    public final void rule__SetRefinement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1952:1: ( ( ( rule__SetRefinement__TailAssignment_8_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1953:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1953:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            // InternalHLCLSpecificationLanguage.g:1954:2: ( rule__SetRefinement__TailAssignment_8_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getTailAssignment_8_2()); 
            // InternalHLCLSpecificationLanguage.g:1955:2: ( rule__SetRefinement__TailAssignment_8_2 )
            // InternalHLCLSpecificationLanguage.g:1955:3: rule__SetRefinement__TailAssignment_8_2
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
    // InternalHLCLSpecificationLanguage.g:1963:1: rule__SetRefinement__Group_8__3 : rule__SetRefinement__Group_8__3__Impl ;
    public final void rule__SetRefinement__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1967:1: ( rule__SetRefinement__Group_8__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1968:2: rule__SetRefinement__Group_8__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1974:1: rule__SetRefinement__Group_8__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1978:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1979:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1979:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1980:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1990:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1994:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1995:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalHLCLSpecificationLanguage.g:2002:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2006:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2007:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2007:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2008:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2009:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:2009:3: rule__Rule__ConditionAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:2017:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2021:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2022:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalHLCLSpecificationLanguage.g:2029:1: rule__Rule__Group__1__Impl : ( '-->' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2033:1: ( ( '-->' ) )
            // InternalHLCLSpecificationLanguage.g:2034:1: ( '-->' )
            {
            // InternalHLCLSpecificationLanguage.g:2034:1: ( '-->' )
            // InternalHLCLSpecificationLanguage.g:2035:2: '-->'
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
    // InternalHLCLSpecificationLanguage.g:2044:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2048:1: ( rule__Rule__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2049:2: rule__Rule__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:2055:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConsequenceAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2059:1: ( ( ( rule__Rule__ConsequenceAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2060:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2060:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2061:2: ( rule__Rule__ConsequenceAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2062:2: ( rule__Rule__ConsequenceAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:2062:3: rule__Rule__ConsequenceAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:2071:1: rule__SPLNotation__Group__0 : rule__SPLNotation__Group__0__Impl rule__SPLNotation__Group__1 ;
    public final void rule__SPLNotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2075:1: ( rule__SPLNotation__Group__0__Impl rule__SPLNotation__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2076:2: rule__SPLNotation__Group__0__Impl rule__SPLNotation__Group__1
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
    // InternalHLCLSpecificationLanguage.g:2083:1: rule__SPLNotation__Group__0__Impl : ( ( rule__SPLNotation__Var1Assignment_0 ) ) ;
    public final void rule__SPLNotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2087:1: ( ( ( rule__SPLNotation__Var1Assignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2088:1: ( ( rule__SPLNotation__Var1Assignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2088:1: ( ( rule__SPLNotation__Var1Assignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2089:2: ( rule__SPLNotation__Var1Assignment_0 )
            {
             before(grammarAccess.getSPLNotationAccess().getVar1Assignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2090:2: ( rule__SPLNotation__Var1Assignment_0 )
            // InternalHLCLSpecificationLanguage.g:2090:3: rule__SPLNotation__Var1Assignment_0
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
    // InternalHLCLSpecificationLanguage.g:2098:1: rule__SPLNotation__Group__1 : rule__SPLNotation__Group__1__Impl rule__SPLNotation__Group__2 ;
    public final void rule__SPLNotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2102:1: ( rule__SPLNotation__Group__1__Impl rule__SPLNotation__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2103:2: rule__SPLNotation__Group__1__Impl rule__SPLNotation__Group__2
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
    // InternalHLCLSpecificationLanguage.g:2110:1: rule__SPLNotation__Group__1__Impl : ( ( rule__SPLNotation__OpAssignment_1 ) ) ;
    public final void rule__SPLNotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2114:1: ( ( ( rule__SPLNotation__OpAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:2115:1: ( ( rule__SPLNotation__OpAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2115:1: ( ( rule__SPLNotation__OpAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:2116:2: ( rule__SPLNotation__OpAssignment_1 )
            {
             before(grammarAccess.getSPLNotationAccess().getOpAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:2117:2: ( rule__SPLNotation__OpAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:2117:3: rule__SPLNotation__OpAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:2125:1: rule__SPLNotation__Group__2 : rule__SPLNotation__Group__2__Impl ;
    public final void rule__SPLNotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2129:1: ( rule__SPLNotation__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2130:2: rule__SPLNotation__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:2136:1: rule__SPLNotation__Group__2__Impl : ( ( rule__SPLNotation__Var2Assignment_2 ) ) ;
    public final void rule__SPLNotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2140:1: ( ( ( rule__SPLNotation__Var2Assignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2141:1: ( ( rule__SPLNotation__Var2Assignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2141:1: ( ( rule__SPLNotation__Var2Assignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2142:2: ( rule__SPLNotation__Var2Assignment_2 )
            {
             before(grammarAccess.getSPLNotationAccess().getVar2Assignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2143:2: ( rule__SPLNotation__Var2Assignment_2 )
            // InternalHLCLSpecificationLanguage.g:2143:3: rule__SPLNotation__Var2Assignment_2
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
    // InternalHLCLSpecificationLanguage.g:2152:1: rule__ListOfValues__Group__0 : rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 ;
    public final void rule__ListOfValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2156:1: ( rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2157:2: rule__ListOfValues__Group__0__Impl rule__ListOfValues__Group__1
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
    // InternalHLCLSpecificationLanguage.g:2164:1: rule__ListOfValues__Group__0__Impl : ( ruleValue ) ;
    public final void rule__ListOfValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2168:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2169:1: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2169:1: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2170:2: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2179:1: rule__ListOfValues__Group__1 : rule__ListOfValues__Group__1__Impl ;
    public final void rule__ListOfValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2183:1: ( rule__ListOfValues__Group__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2184:2: rule__ListOfValues__Group__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2190:1: rule__ListOfValues__Group__1__Impl : ( ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* ) ) ;
    public final void rule__ListOfValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2194:1: ( ( ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:2195:1: ( ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:2195:1: ( ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:2196:2: ( ( rule__ListOfValues__Group_1__0 ) ) ( ( rule__ListOfValues__Group_1__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:2196:2: ( ( rule__ListOfValues__Group_1__0 ) )
            // InternalHLCLSpecificationLanguage.g:2197:3: ( rule__ListOfValues__Group_1__0 )
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2198:3: ( rule__ListOfValues__Group_1__0 )
            // InternalHLCLSpecificationLanguage.g:2198:4: rule__ListOfValues__Group_1__0
            {
            pushFollow(FOLLOW_24);
            rule__ListOfValues__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfValuesAccess().getGroup_1()); 

            }

            // InternalHLCLSpecificationLanguage.g:2201:2: ( ( rule__ListOfValues__Group_1__0 )* )
            // InternalHLCLSpecificationLanguage.g:2202:3: ( rule__ListOfValues__Group_1__0 )*
            {
             before(grammarAccess.getListOfValuesAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2203:3: ( rule__ListOfValues__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:2203:4: rule__ListOfValues__Group_1__0
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
    // InternalHLCLSpecificationLanguage.g:2213:1: rule__ListOfValues__Group_1__0 : rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 ;
    public final void rule__ListOfValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2217:1: ( rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1 )
            // InternalHLCLSpecificationLanguage.g:2218:2: rule__ListOfValues__Group_1__0__Impl rule__ListOfValues__Group_1__1
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
    // InternalHLCLSpecificationLanguage.g:2225:1: rule__ListOfValues__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2229:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:2230:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:2230:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:2231:2: ','
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
    // InternalHLCLSpecificationLanguage.g:2240:1: rule__ListOfValues__Group_1__1 : rule__ListOfValues__Group_1__1__Impl ;
    public final void rule__ListOfValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2244:1: ( rule__ListOfValues__Group_1__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2245:2: rule__ListOfValues__Group_1__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2251:1: rule__ListOfValues__Group_1__1__Impl : ( ruleValue ) ;
    public final void rule__ListOfValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2255:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2256:1: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2256:1: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2257:2: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2267:1: rule__ListOfIDs__Group__0 : rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 ;
    public final void rule__ListOfIDs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2271:1: ( rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2272:2: rule__ListOfIDs__Group__0__Impl rule__ListOfIDs__Group__1
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
    // InternalHLCLSpecificationLanguage.g:2279:1: rule__ListOfIDs__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ListOfIDs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2283:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2284:1: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2284:1: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2285:2: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2294:1: rule__ListOfIDs__Group__1 : rule__ListOfIDs__Group__1__Impl ;
    public final void rule__ListOfIDs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2298:1: ( rule__ListOfIDs__Group__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2299:2: rule__ListOfIDs__Group__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2305:1: rule__ListOfIDs__Group__1__Impl : ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) ) ;
    public final void rule__ListOfIDs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2309:1: ( ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:2310:1: ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:2310:1: ( ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:2311:2: ( ( rule__ListOfIDs__Group_1__0 ) ) ( ( rule__ListOfIDs__Group_1__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:2311:2: ( ( rule__ListOfIDs__Group_1__0 ) )
            // InternalHLCLSpecificationLanguage.g:2312:3: ( rule__ListOfIDs__Group_1__0 )
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2313:3: ( rule__ListOfIDs__Group_1__0 )
            // InternalHLCLSpecificationLanguage.g:2313:4: rule__ListOfIDs__Group_1__0
            {
            pushFollow(FOLLOW_24);
            rule__ListOfIDs__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getGroup_1()); 

            }

            // InternalHLCLSpecificationLanguage.g:2316:2: ( ( rule__ListOfIDs__Group_1__0 )* )
            // InternalHLCLSpecificationLanguage.g:2317:3: ( rule__ListOfIDs__Group_1__0 )*
            {
             before(grammarAccess.getListOfIDsAccess().getGroup_1()); 
            // InternalHLCLSpecificationLanguage.g:2318:3: ( rule__ListOfIDs__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:2318:4: rule__ListOfIDs__Group_1__0
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
    // InternalHLCLSpecificationLanguage.g:2328:1: rule__ListOfIDs__Group_1__0 : rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 ;
    public final void rule__ListOfIDs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2332:1: ( rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1 )
            // InternalHLCLSpecificationLanguage.g:2333:2: rule__ListOfIDs__Group_1__0__Impl rule__ListOfIDs__Group_1__1
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
    // InternalHLCLSpecificationLanguage.g:2340:1: rule__ListOfIDs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfIDs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2344:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:2345:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:2345:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:2346:2: ','
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
    // InternalHLCLSpecificationLanguage.g:2355:1: rule__ListOfIDs__Group_1__1 : rule__ListOfIDs__Group_1__1__Impl ;
    public final void rule__ListOfIDs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2359:1: ( rule__ListOfIDs__Group_1__1__Impl )
            // InternalHLCLSpecificationLanguage.g:2360:2: rule__ListOfIDs__Group_1__1__Impl
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
    // InternalHLCLSpecificationLanguage.g:2366:1: rule__ListOfIDs__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ListOfIDs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2370:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2371:1: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2371:1: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2372:2: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2382:1: rule__VarDeclaration__UnorderedGroup : rule__VarDeclaration__UnorderedGroup__0 {...}?;
    public final void rule__VarDeclaration__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2387:1: ( rule__VarDeclaration__UnorderedGroup__0 {...}?)
            // InternalHLCLSpecificationLanguage.g:2388:2: rule__VarDeclaration__UnorderedGroup__0 {...}?
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
    // InternalHLCLSpecificationLanguage.g:2396:1: rule__VarDeclaration__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) ) ;
    public final void rule__VarDeclaration__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2401:1: ( ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) ) )
            // InternalHLCLSpecificationLanguage.g:2402:3: ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:2402:3: ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) )
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
                    // InternalHLCLSpecificationLanguage.g:2403:3: ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2403:3: ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2404:4: {...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2404:108: ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2405:5: ( ( rule__VarDeclaration__InstantiableAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2411:5: ( ( rule__VarDeclaration__InstantiableAssignment_0 ) )
                    // InternalHLCLSpecificationLanguage.g:2412:6: ( rule__VarDeclaration__InstantiableAssignment_0 )
                    {
                     before(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0()); 
                    // InternalHLCLSpecificationLanguage.g:2413:6: ( rule__VarDeclaration__InstantiableAssignment_0 )
                    // InternalHLCLSpecificationLanguage.g:2413:7: rule__VarDeclaration__InstantiableAssignment_0
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
                    // InternalHLCLSpecificationLanguage.g:2418:3: ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2418:3: ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2419:4: {...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2419:108: ( ( ( rule__VarDeclaration__Group_1__0 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2420:5: ( ( rule__VarDeclaration__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2426:5: ( ( rule__VarDeclaration__Group_1__0 ) )
                    // InternalHLCLSpecificationLanguage.g:2427:6: ( rule__VarDeclaration__Group_1__0 )
                    {
                     before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
                    // InternalHLCLSpecificationLanguage.g:2428:6: ( rule__VarDeclaration__Group_1__0 )
                    // InternalHLCLSpecificationLanguage.g:2428:7: rule__VarDeclaration__Group_1__0
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
    // InternalHLCLSpecificationLanguage.g:2441:1: rule__VarDeclaration__UnorderedGroup__0 : rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )? ;
    public final void rule__VarDeclaration__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2445:1: ( rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )? )
            // InternalHLCLSpecificationLanguage.g:2446:2: rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_7);
            rule__VarDeclaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalHLCLSpecificationLanguage.g:2447:2: ( rule__VarDeclaration__UnorderedGroup__1 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:2447:2: rule__VarDeclaration__UnorderedGroup__1
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
    // InternalHLCLSpecificationLanguage.g:2453:1: rule__VarDeclaration__UnorderedGroup__1 : rule__VarDeclaration__UnorderedGroup__Impl ;
    public final void rule__VarDeclaration__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2457:1: ( rule__VarDeclaration__UnorderedGroup__Impl )
            // InternalHLCLSpecificationLanguage.g:2458:2: rule__VarDeclaration__UnorderedGroup__Impl
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
    // InternalHLCLSpecificationLanguage.g:2465:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2469:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2470:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2470:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2471:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2480:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2484:1: ( ( ruleVarDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2485:2: ( ruleVarDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2485:2: ( ruleVarDeclaration )
            // InternalHLCLSpecificationLanguage.g:2486:3: ruleVarDeclaration
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
    // InternalHLCLSpecificationLanguage.g:2495:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2499:1: ( ( ruleConstraint ) )
            // InternalHLCLSpecificationLanguage.g:2500:2: ( ruleConstraint )
            {
            // InternalHLCLSpecificationLanguage.g:2500:2: ( ruleConstraint )
            // InternalHLCLSpecificationLanguage.g:2501:3: ruleConstraint
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
    // InternalHLCLSpecificationLanguage.g:2510:1: rule__VarDeclaration__InstantiableAssignment_0 : ( ( 'instantiable' ) ) ;
    public final void rule__VarDeclaration__InstantiableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2514:1: ( ( ( 'instantiable' ) ) )
            // InternalHLCLSpecificationLanguage.g:2515:2: ( ( 'instantiable' ) )
            {
            // InternalHLCLSpecificationLanguage.g:2515:2: ( ( 'instantiable' ) )
            // InternalHLCLSpecificationLanguage.g:2516:3: ( 'instantiable' )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 
            // InternalHLCLSpecificationLanguage.g:2517:3: ( 'instantiable' )
            // InternalHLCLSpecificationLanguage.g:2518:4: 'instantiable'
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
    // InternalHLCLSpecificationLanguage.g:2529:1: rule__VarDeclaration__TypeAssignment_1_0 : ( ruleVarType ) ;
    public final void rule__VarDeclaration__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2533:1: ( ( ruleVarType ) )
            // InternalHLCLSpecificationLanguage.g:2534:2: ( ruleVarType )
            {
            // InternalHLCLSpecificationLanguage.g:2534:2: ( ruleVarType )
            // InternalHLCLSpecificationLanguage.g:2535:3: ruleVarType
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
    // InternalHLCLSpecificationLanguage.g:2544:1: rule__VarDeclaration__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2548:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2549:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2549:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2550:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2559:1: rule__VarDeclaration__VariantsAssignment_1_3 : ( ruleVariantDeclaration ) ;
    public final void rule__VarDeclaration__VariantsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2563:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2564:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2564:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2565:3: ruleVariantDeclaration
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
    // InternalHLCLSpecificationLanguage.g:2574:1: rule__VariantsInterval__StartAssignment_1 : ( ruleValue ) ;
    public final void rule__VariantsInterval__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2578:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2579:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2579:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2580:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2589:1: rule__VariantsInterval__EndAssignment_3 : ( ruleValue ) ;
    public final void rule__VariantsInterval__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2593:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2594:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2594:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2595:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2604:1: rule__VariantsEnumeration__ListAssignment_2 : ( ruleEnumeration ) ;
    public final void rule__VariantsEnumeration__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2608:1: ( ( ruleEnumeration ) )
            // InternalHLCLSpecificationLanguage.g:2609:2: ( ruleEnumeration )
            {
            // InternalHLCLSpecificationLanguage.g:2609:2: ( ruleEnumeration )
            // InternalHLCLSpecificationLanguage.g:2610:3: ruleEnumeration
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
    // InternalHLCLSpecificationLanguage.g:2619:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2623:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2624:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2624:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2625:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2634:1: rule__Constraint__ExpAssignment_2 : ( ruleConsExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2638:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:2639:2: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:2639:2: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:2640:3: ruleConsExpression
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
    // InternalHLCLSpecificationLanguage.g:2649:1: rule__IDCons__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDCons__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2653:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2654:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2654:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2655:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2664:1: rule__Assignment__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2668:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2669:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2669:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2670:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2679:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2683:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2684:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2684:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2685:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2694:1: rule__VarRefinement__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2698:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2699:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2699:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2700:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2709:1: rule__VarRefinement__VariantsAssignment_2 : ( ruleVariantDeclaration ) ;
    public final void rule__VarRefinement__VariantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2713:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2714:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2714:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2715:3: ruleVariantDeclaration
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
    // InternalHLCLSpecificationLanguage.g:2724:1: rule__SetRefinement__VarsAssignment_1 : ( ruleListOfIDs ) ;
    public final void rule__SetRefinement__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2728:1: ( ( ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:2729:2: ( ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:2729:2: ( ruleListOfIDs )
            // InternalHLCLSpecificationLanguage.g:2730:3: ruleListOfIDs
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
    // InternalHLCLSpecificationLanguage.g:2739:1: rule__SetRefinement__HeadAssignment_6 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__HeadAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2743:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2744:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2744:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2745:3: ruleListOfValues
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
    // InternalHLCLSpecificationLanguage.g:2754:1: rule__SetRefinement__TailAssignment_8_2 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__TailAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2758:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2759:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2759:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2760:3: ruleListOfValues
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
    // InternalHLCLSpecificationLanguage.g:2769:1: rule__Rule__ConditionAssignment_0 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2773:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:2774:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:2774:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:2775:3: ruleTerminalExp
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
    // InternalHLCLSpecificationLanguage.g:2784:1: rule__Rule__ConsequenceAssignment_2 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConsequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2788:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:2789:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:2789:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:2790:3: ruleTerminalExp
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
    // InternalHLCLSpecificationLanguage.g:2799:1: rule__SPLNotation__Var1Assignment_0 : ( RULE_ID ) ;
    public final void rule__SPLNotation__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2803:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2804:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2804:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2805:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2814:1: rule__SPLNotation__OpAssignment_1 : ( ruleSPLop ) ;
    public final void rule__SPLNotation__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2818:1: ( ( ruleSPLop ) )
            // InternalHLCLSpecificationLanguage.g:2819:2: ( ruleSPLop )
            {
            // InternalHLCLSpecificationLanguage.g:2819:2: ( ruleSPLop )
            // InternalHLCLSpecificationLanguage.g:2820:3: ruleSPLop
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
    // InternalHLCLSpecificationLanguage.g:2829:1: rule__SPLNotation__Var2Assignment_2 : ( RULE_ID ) ;
    public final void rule__SPLNotation__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2833:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2834:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2834:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2835:3: RULE_ID
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


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\41\uffff";
    static final String dfa_2s = "\1\4\40\uffff";
    static final String dfa_3s = "\1\15\1\0\2\5\2\uffff\1\26\1\4\3\27\2\4\4\40\3\0\1\4\1\5\4\31\1\4\1\0\1\5\4\31";
    static final String dfa_4s = "\1\42\1\0\2\5\2\uffff\1\26\1\30\3\27\2\14\4\40\3\0\1\14\1\5\4\40\1\14\1\0\1\5\4\40";
    static final String dfa_5s = "\4\uffff\1\2\1\1\33\uffff";
    static final String dfa_6s = "\1\uffff\1\2\17\uffff\1\4\1\1\1\3\7\uffff\1\0\5\uffff}>";
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
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\25",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\26\6\uffff\1\27\1\30",
            "\1\31",
            "\1\33\6\uffff\1\32",
            "\1\33\6\uffff\1\32",
            "\1\33\6\uffff\1\32",
            "\1\33\6\uffff\1\34",
            "\1\35\6\uffff\1\36\1\37",
            "\1\uffff",
            "\1\40",
            "\1\33\6\uffff\1\32",
            "\1\33\6\uffff\1\32",
            "\1\33\6\uffff\1\32",
            "\1\33\6\uffff\1\34"
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
            return "2447:2: ( rule__VarDeclaration__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_27 = input.LA(1);

                         
                        int index15_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_27);
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
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_19 = input.LA(1);

                         
                        int index15_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_19);
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
