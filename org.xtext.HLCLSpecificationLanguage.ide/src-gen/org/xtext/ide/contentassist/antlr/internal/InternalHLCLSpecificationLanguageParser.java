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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'selected'", "'unselected'", "'boolean'", "'numeric'", "'requires'", "'excludes'", "'optional'", "'mandatory'", "'model'", "'variables:'", "'constraints:'", "'variants:'", "'::'", "'['", "']'", "':'", "'('", "')'", "'is'", "'in'", "'variants'", "','", "'-->'", "'parent:'", "'group:'", "'card:'", "'instantiable'"
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


    // $ANTLR start "entryRuleFodaUN"
    // InternalHLCLSpecificationLanguage.g:428:1: entryRuleFodaUN : ruleFodaUN EOF ;
    public final void entryRuleFodaUN() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:429:1: ( ruleFodaUN EOF )
            // InternalHLCLSpecificationLanguage.g:430:1: ruleFodaUN EOF
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
    // InternalHLCLSpecificationLanguage.g:437:1: ruleFodaUN : ( ( rule__FodaUN__Group__0 ) ) ;
    public final void ruleFodaUN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:441:2: ( ( ( rule__FodaUN__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:442:2: ( ( rule__FodaUN__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:442:2: ( ( rule__FodaUN__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:443:3: ( rule__FodaUN__Group__0 )
            {
             before(grammarAccess.getFodaUNAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:444:3: ( rule__FodaUN__Group__0 )
            // InternalHLCLSpecificationLanguage.g:444:4: rule__FodaUN__Group__0
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
    // InternalHLCLSpecificationLanguage.g:453:1: entryRuleFodaBin : ruleFodaBin EOF ;
    public final void entryRuleFodaBin() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:454:1: ( ruleFodaBin EOF )
            // InternalHLCLSpecificationLanguage.g:455:1: ruleFodaBin EOF
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
    // InternalHLCLSpecificationLanguage.g:462:1: ruleFodaBin : ( ( rule__FodaBin__Group__0 ) ) ;
    public final void ruleFodaBin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:466:2: ( ( ( rule__FodaBin__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:467:2: ( ( rule__FodaBin__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:467:2: ( ( rule__FodaBin__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:468:3: ( rule__FodaBin__Group__0 )
            {
             before(grammarAccess.getFodaBinAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:469:3: ( rule__FodaBin__Group__0 )
            // InternalHLCLSpecificationLanguage.g:469:4: rule__FodaBin__Group__0
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


    // $ANTLR start "entryRuleFodaNary"
    // InternalHLCLSpecificationLanguage.g:478:1: entryRuleFodaNary : ruleFodaNary EOF ;
    public final void entryRuleFodaNary() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:479:1: ( ruleFodaNary EOF )
            // InternalHLCLSpecificationLanguage.g:480:1: ruleFodaNary EOF
            {
             before(grammarAccess.getFodaNaryRule()); 
            pushFollow(FOLLOW_1);
            ruleFodaNary();

            state._fsp--;

             after(grammarAccess.getFodaNaryRule()); 
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
    // $ANTLR end "entryRuleFodaNary"


    // $ANTLR start "ruleFodaNary"
    // InternalHLCLSpecificationLanguage.g:487:1: ruleFodaNary : ( ( rule__FodaNary__Group__0 ) ) ;
    public final void ruleFodaNary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:491:2: ( ( ( rule__FodaNary__Group__0 ) ) )
            // InternalHLCLSpecificationLanguage.g:492:2: ( ( rule__FodaNary__Group__0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:492:2: ( ( rule__FodaNary__Group__0 ) )
            // InternalHLCLSpecificationLanguage.g:493:3: ( rule__FodaNary__Group__0 )
            {
             before(grammarAccess.getFodaNaryAccess().getGroup()); 
            // InternalHLCLSpecificationLanguage.g:494:3: ( rule__FodaNary__Group__0 )
            // InternalHLCLSpecificationLanguage.g:494:4: rule__FodaNary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFodaNary"


    // $ANTLR start "entryRuleValue"
    // InternalHLCLSpecificationLanguage.g:503:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:504:1: ( ruleValue EOF )
            // InternalHLCLSpecificationLanguage.g:505:1: ruleValue EOF
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
    // InternalHLCLSpecificationLanguage.g:512:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:516:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:517:2: ( ( rule__Value__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:518:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:519:3: ( rule__Value__Alternatives )
            // InternalHLCLSpecificationLanguage.g:519:4: rule__Value__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:528:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:529:1: ( ruleVarType EOF )
            // InternalHLCLSpecificationLanguage.g:530:1: ruleVarType EOF
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
    // InternalHLCLSpecificationLanguage.g:537:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:541:2: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:542:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:542:2: ( ( rule__VarType__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:543:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:544:3: ( rule__VarType__Alternatives )
            // InternalHLCLSpecificationLanguage.g:544:4: rule__VarType__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:553:1: entryRuleListOfValues : ruleListOfValues EOF ;
    public final void entryRuleListOfValues() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:554:1: ( ruleListOfValues EOF )
            // InternalHLCLSpecificationLanguage.g:555:1: ruleListOfValues EOF
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
    // InternalHLCLSpecificationLanguage.g:562:1: ruleListOfValues : ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) ) ;
    public final void ruleListOfValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:566:2: ( ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) ) )
            // InternalHLCLSpecificationLanguage.g:567:2: ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:567:2: ( ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* ) )
            // InternalHLCLSpecificationLanguage.g:568:3: ( ( rule__ListOfValues__ValuesAssignment ) ) ( ( rule__ListOfValues__ValuesAssignment )* )
            {
            // InternalHLCLSpecificationLanguage.g:568:3: ( ( rule__ListOfValues__ValuesAssignment ) )
            // InternalHLCLSpecificationLanguage.g:569:4: ( rule__ListOfValues__ValuesAssignment )
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 
            // InternalHLCLSpecificationLanguage.g:570:4: ( rule__ListOfValues__ValuesAssignment )
            // InternalHLCLSpecificationLanguage.g:570:5: rule__ListOfValues__ValuesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ListOfValues__ValuesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 

            }

            // InternalHLCLSpecificationLanguage.g:573:3: ( ( rule__ListOfValues__ValuesAssignment )* )
            // InternalHLCLSpecificationLanguage.g:574:4: ( rule__ListOfValues__ValuesAssignment )*
            {
             before(grammarAccess.getListOfValuesAccess().getValuesAssignment()); 
            // InternalHLCLSpecificationLanguage.g:575:4: ( rule__ListOfValues__ValuesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||(LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:575:5: rule__ListOfValues__ValuesAssignment
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
    // InternalHLCLSpecificationLanguage.g:585:1: entryRuleListOfIDs : ruleListOfIDs EOF ;
    public final void entryRuleListOfIDs() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:586:1: ( ruleListOfIDs EOF )
            // InternalHLCLSpecificationLanguage.g:587:1: ruleListOfIDs EOF
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
    // InternalHLCLSpecificationLanguage.g:594:1: ruleListOfIDs : ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) ;
    public final void ruleListOfIDs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:598:2: ( ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) ) )
            // InternalHLCLSpecificationLanguage.g:599:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:599:2: ( ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* ) )
            // InternalHLCLSpecificationLanguage.g:600:3: ( ( rule__ListOfIDs__IdsAssignment ) ) ( ( rule__ListOfIDs__IdsAssignment )* )
            {
            // InternalHLCLSpecificationLanguage.g:600:3: ( ( rule__ListOfIDs__IdsAssignment ) )
            // InternalHLCLSpecificationLanguage.g:601:4: ( rule__ListOfIDs__IdsAssignment )
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            // InternalHLCLSpecificationLanguage.g:602:4: ( rule__ListOfIDs__IdsAssignment )
            // InternalHLCLSpecificationLanguage.g:602:5: rule__ListOfIDs__IdsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__ListOfIDs__IdsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 

            }

            // InternalHLCLSpecificationLanguage.g:605:3: ( ( rule__ListOfIDs__IdsAssignment )* )
            // InternalHLCLSpecificationLanguage.g:606:4: ( rule__ListOfIDs__IdsAssignment )*
            {
             before(grammarAccess.getListOfIDsAccess().getIdsAssignment()); 
            // InternalHLCLSpecificationLanguage.g:607:4: ( rule__ListOfIDs__IdsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:607:5: rule__ListOfIDs__IdsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ListOfIDs__IdsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleBinOp"
    // InternalHLCLSpecificationLanguage.g:617:1: entryRuleBinOp : ruleBinOp EOF ;
    public final void entryRuleBinOp() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:618:1: ( ruleBinOp EOF )
            // InternalHLCLSpecificationLanguage.g:619:1: ruleBinOp EOF
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
    // InternalHLCLSpecificationLanguage.g:626:1: ruleBinOp : ( ( rule__BinOp__Alternatives ) ) ;
    public final void ruleBinOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:630:2: ( ( ( rule__BinOp__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:631:2: ( ( rule__BinOp__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:631:2: ( ( rule__BinOp__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:632:3: ( rule__BinOp__Alternatives )
            {
             before(grammarAccess.getBinOpAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:633:3: ( rule__BinOp__Alternatives )
            // InternalHLCLSpecificationLanguage.g:633:4: rule__BinOp__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:642:1: entryRuleUnaryOp : ruleUnaryOp EOF ;
    public final void entryRuleUnaryOp() throws RecognitionException {
        try {
            // InternalHLCLSpecificationLanguage.g:643:1: ( ruleUnaryOp EOF )
            // InternalHLCLSpecificationLanguage.g:644:1: ruleUnaryOp EOF
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
    // InternalHLCLSpecificationLanguage.g:651:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:655:2: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // InternalHLCLSpecificationLanguage.g:656:2: ( ( rule__UnaryOp__Alternatives ) )
            {
            // InternalHLCLSpecificationLanguage.g:656:2: ( ( rule__UnaryOp__Alternatives ) )
            // InternalHLCLSpecificationLanguage.g:657:3: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // InternalHLCLSpecificationLanguage.g:658:3: ( rule__UnaryOp__Alternatives )
            // InternalHLCLSpecificationLanguage.g:658:4: rule__UnaryOp__Alternatives
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
    // InternalHLCLSpecificationLanguage.g:666:1: rule__VariantDeclaration__Alternatives : ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) );
    public final void rule__VariantDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:670:1: ( ( rulevariantsInterval ) | ( rulevariantsEnumeration ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||(LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:671:2: ( rulevariantsInterval )
                    {
                    // InternalHLCLSpecificationLanguage.g:671:2: ( rulevariantsInterval )
                    // InternalHLCLSpecificationLanguage.g:672:3: rulevariantsInterval
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
                    // InternalHLCLSpecificationLanguage.g:677:2: ( rulevariantsEnumeration )
                    {
                    // InternalHLCLSpecificationLanguage.g:677:2: ( rulevariantsEnumeration )
                    // InternalHLCLSpecificationLanguage.g:678:3: rulevariantsEnumeration
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
    // InternalHLCLSpecificationLanguage.g:687:1: rule__Enumeration__Alternatives : ( ( ( rule__Enumeration__ValuesAssignment_0 ) ) | ( ruleListOfIDs ) );
    public final void rule__Enumeration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:691:1: ( ( ( rule__Enumeration__ValuesAssignment_0 ) ) | ( ruleListOfIDs ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||(LA4_0>=11 && LA4_0<=12)) ) {
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
                    // InternalHLCLSpecificationLanguage.g:692:2: ( ( rule__Enumeration__ValuesAssignment_0 ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:692:2: ( ( rule__Enumeration__ValuesAssignment_0 ) )
                    // InternalHLCLSpecificationLanguage.g:693:3: ( rule__Enumeration__ValuesAssignment_0 )
                    {
                     before(grammarAccess.getEnumerationAccess().getValuesAssignment_0()); 
                    // InternalHLCLSpecificationLanguage.g:694:3: ( rule__Enumeration__ValuesAssignment_0 )
                    // InternalHLCLSpecificationLanguage.g:694:4: rule__Enumeration__ValuesAssignment_0
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
                    // InternalHLCLSpecificationLanguage.g:698:2: ( ruleListOfIDs )
                    {
                    // InternalHLCLSpecificationLanguage.g:698:2: ( ruleListOfIDs )
                    // InternalHLCLSpecificationLanguage.g:699:3: ruleListOfIDs
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
    // InternalHLCLSpecificationLanguage.g:708:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleFodaNary ) | ( ruleFodaUN ) );
    public final void rule__ConsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:712:1: ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleFodaNary ) | ( ruleFodaUN ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:713:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:713:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:714:3: ruleIDCons
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
                    // InternalHLCLSpecificationLanguage.g:719:2: ( ruleRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:719:2: ( ruleRefinement )
                    // InternalHLCLSpecificationLanguage.g:720:3: ruleRefinement
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
                    // InternalHLCLSpecificationLanguage.g:725:2: ( ruleRule )
                    {
                    // InternalHLCLSpecificationLanguage.g:725:2: ( ruleRule )
                    // InternalHLCLSpecificationLanguage.g:726:3: ruleRule
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
                    // InternalHLCLSpecificationLanguage.g:731:2: ( ruleFodaBin )
                    {
                    // InternalHLCLSpecificationLanguage.g:731:2: ( ruleFodaBin )
                    // InternalHLCLSpecificationLanguage.g:732:3: ruleFodaBin
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
                    // InternalHLCLSpecificationLanguage.g:737:2: ( ruleFodaNary )
                    {
                    // InternalHLCLSpecificationLanguage.g:737:2: ( ruleFodaNary )
                    // InternalHLCLSpecificationLanguage.g:738:3: ruleFodaNary
                    {
                     before(grammarAccess.getConsExpressionAccess().getFodaNaryParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFodaNary();

                    state._fsp--;

                     after(grammarAccess.getConsExpressionAccess().getFodaNaryParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHLCLSpecificationLanguage.g:743:2: ( ruleFodaUN )
                    {
                    // InternalHLCLSpecificationLanguage.g:743:2: ( ruleFodaUN )
                    // InternalHLCLSpecificationLanguage.g:744:3: ruleFodaUN
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
    // InternalHLCLSpecificationLanguage.g:753:1: rule__TerminalExp__Alternatives : ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) );
    public final void rule__TerminalExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:757:1: ( ( ( rule__TerminalExp__Group_0__0 ) ) | ( ruleIDCons ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:758:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:758:2: ( ( rule__TerminalExp__Group_0__0 ) )
                    // InternalHLCLSpecificationLanguage.g:759:3: ( rule__TerminalExp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpAccess().getGroup_0()); 
                    // InternalHLCLSpecificationLanguage.g:760:3: ( rule__TerminalExp__Group_0__0 )
                    // InternalHLCLSpecificationLanguage.g:760:4: rule__TerminalExp__Group_0__0
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
                    // InternalHLCLSpecificationLanguage.g:764:2: ( ruleIDCons )
                    {
                    // InternalHLCLSpecificationLanguage.g:764:2: ( ruleIDCons )
                    // InternalHLCLSpecificationLanguage.g:765:3: ruleIDCons
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
    // InternalHLCLSpecificationLanguage.g:774:1: rule__Refinement__Alternatives : ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) );
    public final void rule__Refinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:778:1: ( ( ruleAssignment ) | ( ruleVarRefinement ) | ( ruleSetRefinement ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==30) ) {
                    alt7=2;
                }
                else if ( (LA7_1==29) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==27) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:779:2: ( ruleAssignment )
                    {
                    // InternalHLCLSpecificationLanguage.g:779:2: ( ruleAssignment )
                    // InternalHLCLSpecificationLanguage.g:780:3: ruleAssignment
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
                    // InternalHLCLSpecificationLanguage.g:785:2: ( ruleVarRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:785:2: ( ruleVarRefinement )
                    // InternalHLCLSpecificationLanguage.g:786:3: ruleVarRefinement
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
                    // InternalHLCLSpecificationLanguage.g:791:2: ( ruleSetRefinement )
                    {
                    // InternalHLCLSpecificationLanguage.g:791:2: ( ruleSetRefinement )
                    // InternalHLCLSpecificationLanguage.g:792:3: ruleSetRefinement
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
    // InternalHLCLSpecificationLanguage.g:801:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:805:1: ( ( RULE_INT ) | ( 'selected' ) | ( 'unselected' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 11:
                {
                alt8=2;
                }
                break;
            case 12:
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
                    // InternalHLCLSpecificationLanguage.g:806:2: ( RULE_INT )
                    {
                    // InternalHLCLSpecificationLanguage.g:806:2: ( RULE_INT )
                    // InternalHLCLSpecificationLanguage.g:807:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:812:2: ( 'selected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:812:2: ( 'selected' )
                    // InternalHLCLSpecificationLanguage.g:813:3: 'selected'
                    {
                     before(grammarAccess.getValueAccess().getSelectedKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSelectedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHLCLSpecificationLanguage.g:818:2: ( 'unselected' )
                    {
                    // InternalHLCLSpecificationLanguage.g:818:2: ( 'unselected' )
                    // InternalHLCLSpecificationLanguage.g:819:3: 'unselected'
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
    // InternalHLCLSpecificationLanguage.g:828:1: rule__VarType__Alternatives : ( ( 'boolean' ) | ( 'numeric' ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:832:1: ( ( 'boolean' ) | ( 'numeric' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:833:2: ( 'boolean' )
                    {
                    // InternalHLCLSpecificationLanguage.g:833:2: ( 'boolean' )
                    // InternalHLCLSpecificationLanguage.g:834:3: 'boolean'
                    {
                     before(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:839:2: ( 'numeric' )
                    {
                    // InternalHLCLSpecificationLanguage.g:839:2: ( 'numeric' )
                    // InternalHLCLSpecificationLanguage.g:840:3: 'numeric'
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


    // $ANTLR start "rule__BinOp__Alternatives"
    // InternalHLCLSpecificationLanguage.g:849:1: rule__BinOp__Alternatives : ( ( 'requires' ) | ( 'excludes' ) );
    public final void rule__BinOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:853:1: ( ( 'requires' ) | ( 'excludes' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:854:2: ( 'requires' )
                    {
                    // InternalHLCLSpecificationLanguage.g:854:2: ( 'requires' )
                    // InternalHLCLSpecificationLanguage.g:855:3: 'requires'
                    {
                     before(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getRequiresKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:860:2: ( 'excludes' )
                    {
                    // InternalHLCLSpecificationLanguage.g:860:2: ( 'excludes' )
                    // InternalHLCLSpecificationLanguage.g:861:3: 'excludes'
                    {
                     before(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getExcludesKeyword_1()); 

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
    // InternalHLCLSpecificationLanguage.g:870:1: rule__UnaryOp__Alternatives : ( ( 'optional' ) | ( 'mandatory' ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:874:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( (LA11_0==18) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:875:2: ( 'optional' )
                    {
                    // InternalHLCLSpecificationLanguage.g:875:2: ( 'optional' )
                    // InternalHLCLSpecificationLanguage.g:876:3: 'optional'
                    {
                     before(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getUnaryOpAccess().getOptionalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHLCLSpecificationLanguage.g:881:2: ( 'mandatory' )
                    {
                    // InternalHLCLSpecificationLanguage.g:881:2: ( 'mandatory' )
                    // InternalHLCLSpecificationLanguage.g:882:3: 'mandatory'
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
    // InternalHLCLSpecificationLanguage.g:891:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:895:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHLCLSpecificationLanguage.g:896:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHLCLSpecificationLanguage.g:903:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:907:1: ( ( 'model' ) )
            // InternalHLCLSpecificationLanguage.g:908:1: ( 'model' )
            {
            // InternalHLCLSpecificationLanguage.g:908:1: ( 'model' )
            // InternalHLCLSpecificationLanguage.g:909:2: 'model'
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
    // InternalHLCLSpecificationLanguage.g:918:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:922:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalHLCLSpecificationLanguage.g:923:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHLCLSpecificationLanguage.g:930:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:934:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:935:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:935:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:936:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:937:2: ( rule__Model__NameAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:937:3: rule__Model__NameAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:945:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:949:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalHLCLSpecificationLanguage.g:950:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalHLCLSpecificationLanguage.g:957:1: rule__Model__Group__2__Impl : ( 'variables:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:961:1: ( ( 'variables:' ) )
            // InternalHLCLSpecificationLanguage.g:962:1: ( 'variables:' )
            {
            // InternalHLCLSpecificationLanguage.g:962:1: ( 'variables:' )
            // InternalHLCLSpecificationLanguage.g:963:2: 'variables:'
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
    // InternalHLCLSpecificationLanguage.g:972:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:976:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalHLCLSpecificationLanguage.g:977:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalHLCLSpecificationLanguage.g:984:1: rule__Model__Group__3__Impl : ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:988:1: ( ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:989:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:989:1: ( ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalHLCLSpecificationLanguage.g:990:2: ( ( rule__Model__VarsAssignment_3 ) ) ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalHLCLSpecificationLanguage.g:990:2: ( ( rule__Model__VarsAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:991:3: ( rule__Model__VarsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:992:3: ( rule__Model__VarsAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:992:4: rule__Model__VarsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Model__VarsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

            }

            // InternalHLCLSpecificationLanguage.g:995:2: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalHLCLSpecificationLanguage.g:996:3: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:997:3: ( rule__Model__VarsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)||LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:997:4: rule__Model__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
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

        }
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
    // InternalHLCLSpecificationLanguage.g:1006:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1010:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalHLCLSpecificationLanguage.g:1011:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalHLCLSpecificationLanguage.g:1018:1: rule__Model__Group__4__Impl : ( 'constraints:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1022:1: ( ( 'constraints:' ) )
            // InternalHLCLSpecificationLanguage.g:1023:1: ( 'constraints:' )
            {
            // InternalHLCLSpecificationLanguage.g:1023:1: ( 'constraints:' )
            // InternalHLCLSpecificationLanguage.g:1024:2: 'constraints:'
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
    // InternalHLCLSpecificationLanguage.g:1033:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1037:1: ( rule__Model__Group__5__Impl )
            // InternalHLCLSpecificationLanguage.g:1038:2: rule__Model__Group__5__Impl
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
    // InternalHLCLSpecificationLanguage.g:1044:1: rule__Model__Group__5__Impl : ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1048:1: ( ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:1049:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:1049:1: ( ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* ) )
            // InternalHLCLSpecificationLanguage.g:1050:2: ( ( rule__Model__ConstraintsAssignment_5 ) ) ( ( rule__Model__ConstraintsAssignment_5 )* )
            {
            // InternalHLCLSpecificationLanguage.g:1050:2: ( ( rule__Model__ConstraintsAssignment_5 ) )
            // InternalHLCLSpecificationLanguage.g:1051:3: ( rule__Model__ConstraintsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:1052:3: ( rule__Model__ConstraintsAssignment_5 )
            // InternalHLCLSpecificationLanguage.g:1052:4: rule__Model__ConstraintsAssignment_5
            {
            pushFollow(FOLLOW_4);
            rule__Model__ConstraintsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 

            }

            // InternalHLCLSpecificationLanguage.g:1055:2: ( ( rule__Model__ConstraintsAssignment_5 )* )
            // InternalHLCLSpecificationLanguage.g:1056:3: ( rule__Model__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_5()); 
            // InternalHLCLSpecificationLanguage.g:1057:3: ( rule__Model__ConstraintsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1057:4: rule__Model__ConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_4);
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

        }
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
    // InternalHLCLSpecificationLanguage.g:1067:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1071:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalHLCLSpecificationLanguage.g:1072:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHLCLSpecificationLanguage.g:1079:1: rule__VarDeclaration__Group_1__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_1_0 ) ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1083:1: ( ( ( rule__VarDeclaration__TypeAssignment_1_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1084:1: ( ( rule__VarDeclaration__TypeAssignment_1_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1084:1: ( ( rule__VarDeclaration__TypeAssignment_1_0 ) )
            // InternalHLCLSpecificationLanguage.g:1085:2: ( rule__VarDeclaration__TypeAssignment_1_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1_0()); 
            // InternalHLCLSpecificationLanguage.g:1086:2: ( rule__VarDeclaration__TypeAssignment_1_0 )
            // InternalHLCLSpecificationLanguage.g:1086:3: rule__VarDeclaration__TypeAssignment_1_0
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
    // InternalHLCLSpecificationLanguage.g:1094:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2 ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1098:1: ( rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2 )
            // InternalHLCLSpecificationLanguage.g:1099:2: rule__VarDeclaration__Group_1__1__Impl rule__VarDeclaration__Group_1__2
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
    // InternalHLCLSpecificationLanguage.g:1106:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1110:1: ( ( ( rule__VarDeclaration__NameAssignment_1_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1111:1: ( ( rule__VarDeclaration__NameAssignment_1_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1111:1: ( ( rule__VarDeclaration__NameAssignment_1_1 ) )
            // InternalHLCLSpecificationLanguage.g:1112:2: ( rule__VarDeclaration__NameAssignment_1_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1_1()); 
            // InternalHLCLSpecificationLanguage.g:1113:2: ( rule__VarDeclaration__NameAssignment_1_1 )
            // InternalHLCLSpecificationLanguage.g:1113:3: rule__VarDeclaration__NameAssignment_1_1
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
    // InternalHLCLSpecificationLanguage.g:1121:1: rule__VarDeclaration__Group_1__2 : rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3 ;
    public final void rule__VarDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1125:1: ( rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3 )
            // InternalHLCLSpecificationLanguage.g:1126:2: rule__VarDeclaration__Group_1__2__Impl rule__VarDeclaration__Group_1__3
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
    // InternalHLCLSpecificationLanguage.g:1133:1: rule__VarDeclaration__Group_1__2__Impl : ( 'variants:' ) ;
    public final void rule__VarDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1137:1: ( ( 'variants:' ) )
            // InternalHLCLSpecificationLanguage.g:1138:1: ( 'variants:' )
            {
            // InternalHLCLSpecificationLanguage.g:1138:1: ( 'variants:' )
            // InternalHLCLSpecificationLanguage.g:1139:2: 'variants:'
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
    // InternalHLCLSpecificationLanguage.g:1148:1: rule__VarDeclaration__Group_1__3 : rule__VarDeclaration__Group_1__3__Impl ;
    public final void rule__VarDeclaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1152:1: ( rule__VarDeclaration__Group_1__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1153:2: rule__VarDeclaration__Group_1__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1159:1: rule__VarDeclaration__Group_1__3__Impl : ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) ) ;
    public final void rule__VarDeclaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1163:1: ( ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1164:1: ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1164:1: ( ( rule__VarDeclaration__VariantsAssignment_1_3 ) )
            // InternalHLCLSpecificationLanguage.g:1165:2: ( rule__VarDeclaration__VariantsAssignment_1_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_1_3()); 
            // InternalHLCLSpecificationLanguage.g:1166:2: ( rule__VarDeclaration__VariantsAssignment_1_3 )
            // InternalHLCLSpecificationLanguage.g:1166:3: rule__VarDeclaration__VariantsAssignment_1_3
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
    // InternalHLCLSpecificationLanguage.g:1175:1: rule__VariantsInterval__Group__0 : rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 ;
    public final void rule__VariantsInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1179:1: ( rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1180:2: rule__VariantsInterval__Group__0__Impl rule__VariantsInterval__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1187:1: rule__VariantsInterval__Group__0__Impl : ( () ) ;
    public final void rule__VariantsInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1191:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1192:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1192:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1193:2: ()
            {
             before(grammarAccess.getVariantsIntervalAccess().getVariantsIntervalAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1194:2: ()
            // InternalHLCLSpecificationLanguage.g:1194:3: 
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
    // InternalHLCLSpecificationLanguage.g:1202:1: rule__VariantsInterval__Group__1 : rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 ;
    public final void rule__VariantsInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1206:1: ( rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1207:2: rule__VariantsInterval__Group__1__Impl rule__VariantsInterval__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1214:1: rule__VariantsInterval__Group__1__Impl : ( ( rule__VariantsInterval__StartAssignment_1 ) ) ;
    public final void rule__VariantsInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1218:1: ( ( ( rule__VariantsInterval__StartAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1219:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1219:1: ( ( rule__VariantsInterval__StartAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1220:2: ( rule__VariantsInterval__StartAssignment_1 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getStartAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1221:2: ( rule__VariantsInterval__StartAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1221:3: rule__VariantsInterval__StartAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:1229:1: rule__VariantsInterval__Group__2 : rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 ;
    public final void rule__VariantsInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1233:1: ( rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1234:2: rule__VariantsInterval__Group__2__Impl rule__VariantsInterval__Group__3
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
    // InternalHLCLSpecificationLanguage.g:1241:1: rule__VariantsInterval__Group__2__Impl : ( '::' ) ;
    public final void rule__VariantsInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1245:1: ( ( '::' ) )
            // InternalHLCLSpecificationLanguage.g:1246:1: ( '::' )
            {
            // InternalHLCLSpecificationLanguage.g:1246:1: ( '::' )
            // InternalHLCLSpecificationLanguage.g:1247:2: '::'
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
    // InternalHLCLSpecificationLanguage.g:1256:1: rule__VariantsInterval__Group__3 : rule__VariantsInterval__Group__3__Impl ;
    public final void rule__VariantsInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1260:1: ( rule__VariantsInterval__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1261:2: rule__VariantsInterval__Group__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1267:1: rule__VariantsInterval__Group__3__Impl : ( ( rule__VariantsInterval__EndAssignment_3 ) ) ;
    public final void rule__VariantsInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1271:1: ( ( ( rule__VariantsInterval__EndAssignment_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:1272:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1272:1: ( ( rule__VariantsInterval__EndAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:1273:2: ( rule__VariantsInterval__EndAssignment_3 )
            {
             before(grammarAccess.getVariantsIntervalAccess().getEndAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:1274:2: ( rule__VariantsInterval__EndAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:1274:3: rule__VariantsInterval__EndAssignment_3
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
    // InternalHLCLSpecificationLanguage.g:1283:1: rule__VariantsEnumeration__Group__0 : rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 ;
    public final void rule__VariantsEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1287:1: ( rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1288:2: rule__VariantsEnumeration__Group__0__Impl rule__VariantsEnumeration__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1295:1: rule__VariantsEnumeration__Group__0__Impl : ( () ) ;
    public final void rule__VariantsEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1299:1: ( ( () ) )
            // InternalHLCLSpecificationLanguage.g:1300:1: ( () )
            {
            // InternalHLCLSpecificationLanguage.g:1300:1: ( () )
            // InternalHLCLSpecificationLanguage.g:1301:2: ()
            {
             before(grammarAccess.getVariantsEnumerationAccess().getVariantsEnumerationAction_0()); 
            // InternalHLCLSpecificationLanguage.g:1302:2: ()
            // InternalHLCLSpecificationLanguage.g:1302:3: 
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
    // InternalHLCLSpecificationLanguage.g:1310:1: rule__VariantsEnumeration__Group__1 : rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 ;
    public final void rule__VariantsEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1314:1: ( rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1315:2: rule__VariantsEnumeration__Group__1__Impl rule__VariantsEnumeration__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1322:1: rule__VariantsEnumeration__Group__1__Impl : ( '[' ) ;
    public final void rule__VariantsEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1326:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1327:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1327:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1328:2: '['
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
    // InternalHLCLSpecificationLanguage.g:1337:1: rule__VariantsEnumeration__Group__2 : rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 ;
    public final void rule__VariantsEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1341:1: ( rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1342:2: rule__VariantsEnumeration__Group__2__Impl rule__VariantsEnumeration__Group__3
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
    // InternalHLCLSpecificationLanguage.g:1349:1: rule__VariantsEnumeration__Group__2__Impl : ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) ;
    public final void rule__VariantsEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1353:1: ( ( ( rule__VariantsEnumeration__ListAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1354:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1354:1: ( ( rule__VariantsEnumeration__ListAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1355:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            {
             before(grammarAccess.getVariantsEnumerationAccess().getListAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1356:2: ( rule__VariantsEnumeration__ListAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1356:3: rule__VariantsEnumeration__ListAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1364:1: rule__VariantsEnumeration__Group__3 : rule__VariantsEnumeration__Group__3__Impl ;
    public final void rule__VariantsEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1368:1: ( rule__VariantsEnumeration__Group__3__Impl )
            // InternalHLCLSpecificationLanguage.g:1369:2: rule__VariantsEnumeration__Group__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:1375:1: rule__VariantsEnumeration__Group__3__Impl : ( ']' ) ;
    public final void rule__VariantsEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1379:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1380:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1380:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1381:2: ']'
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
    // InternalHLCLSpecificationLanguage.g:1391:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1395:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1396:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1403:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1407:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1408:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1408:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1409:2: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1410:2: ( rule__Constraint__NameAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1410:3: rule__Constraint__NameAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1418:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1422:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1423:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1430:1: rule__Constraint__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1434:1: ( ( ':' ) )
            // InternalHLCLSpecificationLanguage.g:1435:1: ( ':' )
            {
            // InternalHLCLSpecificationLanguage.g:1435:1: ( ':' )
            // InternalHLCLSpecificationLanguage.g:1436:2: ':'
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
    // InternalHLCLSpecificationLanguage.g:1445:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1449:1: ( rule__Constraint__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1450:2: rule__Constraint__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1456:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1460:1: ( ( ( rule__Constraint__ExpAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1461:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1461:1: ( ( rule__Constraint__ExpAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1462:2: ( rule__Constraint__ExpAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1463:2: ( rule__Constraint__ExpAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1463:3: rule__Constraint__ExpAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1472:1: rule__TerminalExp__Group_0__0 : rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 ;
    public final void rule__TerminalExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1476:1: ( rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1 )
            // InternalHLCLSpecificationLanguage.g:1477:2: rule__TerminalExp__Group_0__0__Impl rule__TerminalExp__Group_0__1
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
    // InternalHLCLSpecificationLanguage.g:1484:1: rule__TerminalExp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1488:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1489:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1489:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1490:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1499:1: rule__TerminalExp__Group_0__1 : rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 ;
    public final void rule__TerminalExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1503:1: ( rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2 )
            // InternalHLCLSpecificationLanguage.g:1504:2: rule__TerminalExp__Group_0__1__Impl rule__TerminalExp__Group_0__2
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
    // InternalHLCLSpecificationLanguage.g:1511:1: rule__TerminalExp__Group_0__1__Impl : ( ruleConsExpression ) ;
    public final void rule__TerminalExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1515:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:1516:1: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:1516:1: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:1517:2: ruleConsExpression
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
    // InternalHLCLSpecificationLanguage.g:1526:1: rule__TerminalExp__Group_0__2 : rule__TerminalExp__Group_0__2__Impl ;
    public final void rule__TerminalExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1530:1: ( rule__TerminalExp__Group_0__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1531:2: rule__TerminalExp__Group_0__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1537:1: rule__TerminalExp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1541:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1542:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1542:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1543:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1553:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1557:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1558:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1565:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1569:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1570:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1570:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1571:2: ( rule__Assignment__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1572:2: ( rule__Assignment__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1572:3: rule__Assignment__VarAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1580:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1584:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1585:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1592:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1596:1: ( ( 'is' ) )
            // InternalHLCLSpecificationLanguage.g:1597:1: ( 'is' )
            {
            // InternalHLCLSpecificationLanguage.g:1597:1: ( 'is' )
            // InternalHLCLSpecificationLanguage.g:1598:2: 'is'
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
    // InternalHLCLSpecificationLanguage.g:1607:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1611:1: ( rule__Assignment__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1612:2: rule__Assignment__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1618:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1622:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1623:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1623:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1624:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1625:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1625:3: rule__Assignment__ValueAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1634:1: rule__VarRefinement__Group__0 : rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 ;
    public final void rule__VarRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1638:1: ( rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1639:2: rule__VarRefinement__Group__0__Impl rule__VarRefinement__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1646:1: rule__VarRefinement__Group__0__Impl : ( ( rule__VarRefinement__VarAssignment_0 ) ) ;
    public final void rule__VarRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1650:1: ( ( ( rule__VarRefinement__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:1651:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1651:1: ( ( rule__VarRefinement__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:1652:2: ( rule__VarRefinement__VarAssignment_0 )
            {
             before(grammarAccess.getVarRefinementAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:1653:2: ( rule__VarRefinement__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:1653:3: rule__VarRefinement__VarAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:1661:1: rule__VarRefinement__Group__1 : rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 ;
    public final void rule__VarRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1665:1: ( rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1666:2: rule__VarRefinement__Group__1__Impl rule__VarRefinement__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1673:1: rule__VarRefinement__Group__1__Impl : ( 'in' ) ;
    public final void rule__VarRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1677:1: ( ( 'in' ) )
            // InternalHLCLSpecificationLanguage.g:1678:1: ( 'in' )
            {
            // InternalHLCLSpecificationLanguage.g:1678:1: ( 'in' )
            // InternalHLCLSpecificationLanguage.g:1679:2: 'in'
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
    // InternalHLCLSpecificationLanguage.g:1688:1: rule__VarRefinement__Group__2 : rule__VarRefinement__Group__2__Impl ;
    public final void rule__VarRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1692:1: ( rule__VarRefinement__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:1693:2: rule__VarRefinement__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:1699:1: rule__VarRefinement__Group__2__Impl : ( ( rule__VarRefinement__VariantsAssignment_2 ) ) ;
    public final void rule__VarRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1703:1: ( ( ( rule__VarRefinement__VariantsAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:1704:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1704:1: ( ( rule__VarRefinement__VariantsAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:1705:2: ( rule__VarRefinement__VariantsAssignment_2 )
            {
             before(grammarAccess.getVarRefinementAccess().getVariantsAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:1706:2: ( rule__VarRefinement__VariantsAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:1706:3: rule__VarRefinement__VariantsAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:1715:1: rule__SetRefinement__Group__0 : rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 ;
    public final void rule__SetRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1719:1: ( rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1 )
            // InternalHLCLSpecificationLanguage.g:1720:2: rule__SetRefinement__Group__0__Impl rule__SetRefinement__Group__1
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
    // InternalHLCLSpecificationLanguage.g:1727:1: rule__SetRefinement__Group__0__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1731:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1732:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1732:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1733:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1742:1: rule__SetRefinement__Group__1 : rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 ;
    public final void rule__SetRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1746:1: ( rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2 )
            // InternalHLCLSpecificationLanguage.g:1747:2: rule__SetRefinement__Group__1__Impl rule__SetRefinement__Group__2
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
    // InternalHLCLSpecificationLanguage.g:1754:1: rule__SetRefinement__Group__1__Impl : ( ( rule__SetRefinement__VarsAssignment_1 ) ) ;
    public final void rule__SetRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1758:1: ( ( ( rule__SetRefinement__VarsAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:1759:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1759:1: ( ( rule__SetRefinement__VarsAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:1760:2: ( rule__SetRefinement__VarsAssignment_1 )
            {
             before(grammarAccess.getSetRefinementAccess().getVarsAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:1761:2: ( rule__SetRefinement__VarsAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:1761:3: rule__SetRefinement__VarsAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:1769:1: rule__SetRefinement__Group__2 : rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 ;
    public final void rule__SetRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1773:1: ( rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3 )
            // InternalHLCLSpecificationLanguage.g:1774:2: rule__SetRefinement__Group__2__Impl rule__SetRefinement__Group__3
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
    // InternalHLCLSpecificationLanguage.g:1781:1: rule__SetRefinement__Group__2__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1785:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1786:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1786:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1787:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1796:1: rule__SetRefinement__Group__3 : rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 ;
    public final void rule__SetRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1800:1: ( rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4 )
            // InternalHLCLSpecificationLanguage.g:1801:2: rule__SetRefinement__Group__3__Impl rule__SetRefinement__Group__4
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
    // InternalHLCLSpecificationLanguage.g:1808:1: rule__SetRefinement__Group__3__Impl : ( 'variants' ) ;
    public final void rule__SetRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1812:1: ( ( 'variants' ) )
            // InternalHLCLSpecificationLanguage.g:1813:1: ( 'variants' )
            {
            // InternalHLCLSpecificationLanguage.g:1813:1: ( 'variants' )
            // InternalHLCLSpecificationLanguage.g:1814:2: 'variants'
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
    // InternalHLCLSpecificationLanguage.g:1823:1: rule__SetRefinement__Group__4 : rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 ;
    public final void rule__SetRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1827:1: ( rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5 )
            // InternalHLCLSpecificationLanguage.g:1828:2: rule__SetRefinement__Group__4__Impl rule__SetRefinement__Group__5
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
    // InternalHLCLSpecificationLanguage.g:1835:1: rule__SetRefinement__Group__4__Impl : ( '[' ) ;
    public final void rule__SetRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1839:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:1840:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:1840:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:1841:2: '['
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
    // InternalHLCLSpecificationLanguage.g:1850:1: rule__SetRefinement__Group__5 : rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 ;
    public final void rule__SetRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1854:1: ( rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6 )
            // InternalHLCLSpecificationLanguage.g:1855:2: rule__SetRefinement__Group__5__Impl rule__SetRefinement__Group__6
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
    // InternalHLCLSpecificationLanguage.g:1862:1: rule__SetRefinement__Group__5__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1866:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:1867:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:1867:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:1868:2: '('
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
    // InternalHLCLSpecificationLanguage.g:1877:1: rule__SetRefinement__Group__6 : rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 ;
    public final void rule__SetRefinement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1881:1: ( rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7 )
            // InternalHLCLSpecificationLanguage.g:1882:2: rule__SetRefinement__Group__6__Impl rule__SetRefinement__Group__7
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
    // InternalHLCLSpecificationLanguage.g:1889:1: rule__SetRefinement__Group__6__Impl : ( ( rule__SetRefinement__HeadAssignment_6 ) ) ;
    public final void rule__SetRefinement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1893:1: ( ( ( rule__SetRefinement__HeadAssignment_6 ) ) )
            // InternalHLCLSpecificationLanguage.g:1894:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            {
            // InternalHLCLSpecificationLanguage.g:1894:1: ( ( rule__SetRefinement__HeadAssignment_6 ) )
            // InternalHLCLSpecificationLanguage.g:1895:2: ( rule__SetRefinement__HeadAssignment_6 )
            {
             before(grammarAccess.getSetRefinementAccess().getHeadAssignment_6()); 
            // InternalHLCLSpecificationLanguage.g:1896:2: ( rule__SetRefinement__HeadAssignment_6 )
            // InternalHLCLSpecificationLanguage.g:1896:3: rule__SetRefinement__HeadAssignment_6
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
    // InternalHLCLSpecificationLanguage.g:1904:1: rule__SetRefinement__Group__7 : rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 ;
    public final void rule__SetRefinement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1908:1: ( rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8 )
            // InternalHLCLSpecificationLanguage.g:1909:2: rule__SetRefinement__Group__7__Impl rule__SetRefinement__Group__8
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
    // InternalHLCLSpecificationLanguage.g:1916:1: rule__SetRefinement__Group__7__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1920:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:1921:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:1921:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:1922:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:1931:1: rule__SetRefinement__Group__8 : rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 ;
    public final void rule__SetRefinement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1935:1: ( rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9 )
            // InternalHLCLSpecificationLanguage.g:1936:2: rule__SetRefinement__Group__8__Impl rule__SetRefinement__Group__9
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
    // InternalHLCLSpecificationLanguage.g:1943:1: rule__SetRefinement__Group__8__Impl : ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) ;
    public final void rule__SetRefinement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1947:1: ( ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) ) )
            // InternalHLCLSpecificationLanguage.g:1948:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            {
            // InternalHLCLSpecificationLanguage.g:1948:1: ( ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* ) )
            // InternalHLCLSpecificationLanguage.g:1949:2: ( ( rule__SetRefinement__Group_8__0 ) ) ( ( rule__SetRefinement__Group_8__0 )* )
            {
            // InternalHLCLSpecificationLanguage.g:1949:2: ( ( rule__SetRefinement__Group_8__0 ) )
            // InternalHLCLSpecificationLanguage.g:1950:3: ( rule__SetRefinement__Group_8__0 )
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1951:3: ( rule__SetRefinement__Group_8__0 )
            // InternalHLCLSpecificationLanguage.g:1951:4: rule__SetRefinement__Group_8__0
            {
            pushFollow(FOLLOW_25);
            rule__SetRefinement__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRefinementAccess().getGroup_8()); 

            }

            // InternalHLCLSpecificationLanguage.g:1954:2: ( ( rule__SetRefinement__Group_8__0 )* )
            // InternalHLCLSpecificationLanguage.g:1955:3: ( rule__SetRefinement__Group_8__0 )*
            {
             before(grammarAccess.getSetRefinementAccess().getGroup_8()); 
            // InternalHLCLSpecificationLanguage.g:1956:3: ( rule__SetRefinement__Group_8__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHLCLSpecificationLanguage.g:1956:4: rule__SetRefinement__Group_8__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SetRefinement__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalHLCLSpecificationLanguage.g:1965:1: rule__SetRefinement__Group__9 : rule__SetRefinement__Group__9__Impl ;
    public final void rule__SetRefinement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1969:1: ( rule__SetRefinement__Group__9__Impl )
            // InternalHLCLSpecificationLanguage.g:1970:2: rule__SetRefinement__Group__9__Impl
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
    // InternalHLCLSpecificationLanguage.g:1976:1: rule__SetRefinement__Group__9__Impl : ( ']' ) ;
    public final void rule__SetRefinement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1980:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:1981:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:1981:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:1982:2: ']'
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
    // InternalHLCLSpecificationLanguage.g:1992:1: rule__SetRefinement__Group_8__0 : rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 ;
    public final void rule__SetRefinement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:1996:1: ( rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1 )
            // InternalHLCLSpecificationLanguage.g:1997:2: rule__SetRefinement__Group_8__0__Impl rule__SetRefinement__Group_8__1
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
    // InternalHLCLSpecificationLanguage.g:2004:1: rule__SetRefinement__Group_8__0__Impl : ( ',' ) ;
    public final void rule__SetRefinement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2008:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:2009:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:2009:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:2010:2: ','
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
    // InternalHLCLSpecificationLanguage.g:2019:1: rule__SetRefinement__Group_8__1 : rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 ;
    public final void rule__SetRefinement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2023:1: ( rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2 )
            // InternalHLCLSpecificationLanguage.g:2024:2: rule__SetRefinement__Group_8__1__Impl rule__SetRefinement__Group_8__2
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
    // InternalHLCLSpecificationLanguage.g:2031:1: rule__SetRefinement__Group_8__1__Impl : ( '(' ) ;
    public final void rule__SetRefinement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2035:1: ( ( '(' ) )
            // InternalHLCLSpecificationLanguage.g:2036:1: ( '(' )
            {
            // InternalHLCLSpecificationLanguage.g:2036:1: ( '(' )
            // InternalHLCLSpecificationLanguage.g:2037:2: '('
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
    // InternalHLCLSpecificationLanguage.g:2046:1: rule__SetRefinement__Group_8__2 : rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 ;
    public final void rule__SetRefinement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2050:1: ( rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3 )
            // InternalHLCLSpecificationLanguage.g:2051:2: rule__SetRefinement__Group_8__2__Impl rule__SetRefinement__Group_8__3
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
    // InternalHLCLSpecificationLanguage.g:2058:1: rule__SetRefinement__Group_8__2__Impl : ( ( rule__SetRefinement__TailAssignment_8_2 ) ) ;
    public final void rule__SetRefinement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2062:1: ( ( ( rule__SetRefinement__TailAssignment_8_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2063:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2063:1: ( ( rule__SetRefinement__TailAssignment_8_2 ) )
            // InternalHLCLSpecificationLanguage.g:2064:2: ( rule__SetRefinement__TailAssignment_8_2 )
            {
             before(grammarAccess.getSetRefinementAccess().getTailAssignment_8_2()); 
            // InternalHLCLSpecificationLanguage.g:2065:2: ( rule__SetRefinement__TailAssignment_8_2 )
            // InternalHLCLSpecificationLanguage.g:2065:3: rule__SetRefinement__TailAssignment_8_2
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
    // InternalHLCLSpecificationLanguage.g:2073:1: rule__SetRefinement__Group_8__3 : rule__SetRefinement__Group_8__3__Impl ;
    public final void rule__SetRefinement__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2077:1: ( rule__SetRefinement__Group_8__3__Impl )
            // InternalHLCLSpecificationLanguage.g:2078:2: rule__SetRefinement__Group_8__3__Impl
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
    // InternalHLCLSpecificationLanguage.g:2084:1: rule__SetRefinement__Group_8__3__Impl : ( ')' ) ;
    public final void rule__SetRefinement__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2088:1: ( ( ')' ) )
            // InternalHLCLSpecificationLanguage.g:2089:1: ( ')' )
            {
            // InternalHLCLSpecificationLanguage.g:2089:1: ( ')' )
            // InternalHLCLSpecificationLanguage.g:2090:2: ')'
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
    // InternalHLCLSpecificationLanguage.g:2100:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2104:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2105:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalHLCLSpecificationLanguage.g:2112:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2116:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2117:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2117:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2118:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2119:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:2119:3: rule__Rule__ConditionAssignment_0
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
    // InternalHLCLSpecificationLanguage.g:2127:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2131:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2132:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalHLCLSpecificationLanguage.g:2139:1: rule__Rule__Group__1__Impl : ( '-->' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2143:1: ( ( '-->' ) )
            // InternalHLCLSpecificationLanguage.g:2144:1: ( '-->' )
            {
            // InternalHLCLSpecificationLanguage.g:2144:1: ( '-->' )
            // InternalHLCLSpecificationLanguage.g:2145:2: '-->'
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
    // InternalHLCLSpecificationLanguage.g:2154:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2158:1: ( rule__Rule__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2159:2: rule__Rule__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:2165:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConsequenceAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2169:1: ( ( ( rule__Rule__ConsequenceAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2170:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2170:1: ( ( rule__Rule__ConsequenceAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2171:2: ( rule__Rule__ConsequenceAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConsequenceAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2172:2: ( rule__Rule__ConsequenceAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:2172:3: rule__Rule__ConsequenceAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:2181:1: rule__FodaUN__Group__0 : rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 ;
    public final void rule__FodaUN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2185:1: ( rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2186:2: rule__FodaUN__Group__0__Impl rule__FodaUN__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalHLCLSpecificationLanguage.g:2193:1: rule__FodaUN__Group__0__Impl : ( ( rule__FodaUN__VarAssignment_0 ) ) ;
    public final void rule__FodaUN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2197:1: ( ( ( rule__FodaUN__VarAssignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2198:1: ( ( rule__FodaUN__VarAssignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2198:1: ( ( rule__FodaUN__VarAssignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2199:2: ( rule__FodaUN__VarAssignment_0 )
            {
             before(grammarAccess.getFodaUNAccess().getVarAssignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2200:2: ( rule__FodaUN__VarAssignment_0 )
            // InternalHLCLSpecificationLanguage.g:2200:3: rule__FodaUN__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FodaUN__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFodaUNAccess().getVarAssignment_0()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:2208:1: rule__FodaUN__Group__1 : rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 ;
    public final void rule__FodaUN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2212:1: ( rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2213:2: rule__FodaUN__Group__1__Impl rule__FodaUN__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalHLCLSpecificationLanguage.g:2220:1: rule__FodaUN__Group__1__Impl : ( 'is' ) ;
    public final void rule__FodaUN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2224:1: ( ( 'is' ) )
            // InternalHLCLSpecificationLanguage.g:2225:1: ( 'is' )
            {
            // InternalHLCLSpecificationLanguage.g:2225:1: ( 'is' )
            // InternalHLCLSpecificationLanguage.g:2226:2: 'is'
            {
             before(grammarAccess.getFodaUNAccess().getIsKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalHLCLSpecificationLanguage.g:2235:1: rule__FodaUN__Group__2 : rule__FodaUN__Group__2__Impl ;
    public final void rule__FodaUN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2239:1: ( rule__FodaUN__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2240:2: rule__FodaUN__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:2246:1: rule__FodaUN__Group__2__Impl : ( ( rule__FodaUN__OpAssignment_2 ) ) ;
    public final void rule__FodaUN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2250:1: ( ( ( rule__FodaUN__OpAssignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2251:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2251:1: ( ( rule__FodaUN__OpAssignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2252:2: ( rule__FodaUN__OpAssignment_2 )
            {
             before(grammarAccess.getFodaUNAccess().getOpAssignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2253:2: ( rule__FodaUN__OpAssignment_2 )
            // InternalHLCLSpecificationLanguage.g:2253:3: rule__FodaUN__OpAssignment_2
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
    // InternalHLCLSpecificationLanguage.g:2262:1: rule__FodaBin__Group__0 : rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 ;
    public final void rule__FodaBin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2266:1: ( rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2267:2: rule__FodaBin__Group__0__Impl rule__FodaBin__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalHLCLSpecificationLanguage.g:2274:1: rule__FodaBin__Group__0__Impl : ( ( rule__FodaBin__Var1Assignment_0 ) ) ;
    public final void rule__FodaBin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2278:1: ( ( ( rule__FodaBin__Var1Assignment_0 ) ) )
            // InternalHLCLSpecificationLanguage.g:2279:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2279:1: ( ( rule__FodaBin__Var1Assignment_0 ) )
            // InternalHLCLSpecificationLanguage.g:2280:2: ( rule__FodaBin__Var1Assignment_0 )
            {
             before(grammarAccess.getFodaBinAccess().getVar1Assignment_0()); 
            // InternalHLCLSpecificationLanguage.g:2281:2: ( rule__FodaBin__Var1Assignment_0 )
            // InternalHLCLSpecificationLanguage.g:2281:3: rule__FodaBin__Var1Assignment_0
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
    // InternalHLCLSpecificationLanguage.g:2289:1: rule__FodaBin__Group__1 : rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 ;
    public final void rule__FodaBin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2293:1: ( rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2294:2: rule__FodaBin__Group__1__Impl rule__FodaBin__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalHLCLSpecificationLanguage.g:2301:1: rule__FodaBin__Group__1__Impl : ( ( rule__FodaBin__OpAssignment_1 ) ) ;
    public final void rule__FodaBin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2305:1: ( ( ( rule__FodaBin__OpAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:2306:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2306:1: ( ( rule__FodaBin__OpAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:2307:2: ( rule__FodaBin__OpAssignment_1 )
            {
             before(grammarAccess.getFodaBinAccess().getOpAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:2308:2: ( rule__FodaBin__OpAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:2308:3: rule__FodaBin__OpAssignment_1
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
    // InternalHLCLSpecificationLanguage.g:2316:1: rule__FodaBin__Group__2 : rule__FodaBin__Group__2__Impl ;
    public final void rule__FodaBin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2320:1: ( rule__FodaBin__Group__2__Impl )
            // InternalHLCLSpecificationLanguage.g:2321:2: rule__FodaBin__Group__2__Impl
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
    // InternalHLCLSpecificationLanguage.g:2327:1: rule__FodaBin__Group__2__Impl : ( ( rule__FodaBin__Var2Assignment_2 ) ) ;
    public final void rule__FodaBin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2331:1: ( ( ( rule__FodaBin__Var2Assignment_2 ) ) )
            // InternalHLCLSpecificationLanguage.g:2332:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2332:1: ( ( rule__FodaBin__Var2Assignment_2 ) )
            // InternalHLCLSpecificationLanguage.g:2333:2: ( rule__FodaBin__Var2Assignment_2 )
            {
             before(grammarAccess.getFodaBinAccess().getVar2Assignment_2()); 
            // InternalHLCLSpecificationLanguage.g:2334:2: ( rule__FodaBin__Var2Assignment_2 )
            // InternalHLCLSpecificationLanguage.g:2334:3: rule__FodaBin__Var2Assignment_2
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


    // $ANTLR start "rule__FodaNary__Group__0"
    // InternalHLCLSpecificationLanguage.g:2343:1: rule__FodaNary__Group__0 : rule__FodaNary__Group__0__Impl rule__FodaNary__Group__1 ;
    public final void rule__FodaNary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2347:1: ( rule__FodaNary__Group__0__Impl rule__FodaNary__Group__1 )
            // InternalHLCLSpecificationLanguage.g:2348:2: rule__FodaNary__Group__0__Impl rule__FodaNary__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FodaNary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__0"


    // $ANTLR start "rule__FodaNary__Group__0__Impl"
    // InternalHLCLSpecificationLanguage.g:2355:1: rule__FodaNary__Group__0__Impl : ( 'parent:' ) ;
    public final void rule__FodaNary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2359:1: ( ( 'parent:' ) )
            // InternalHLCLSpecificationLanguage.g:2360:1: ( 'parent:' )
            {
            // InternalHLCLSpecificationLanguage.g:2360:1: ( 'parent:' )
            // InternalHLCLSpecificationLanguage.g:2361:2: 'parent:'
            {
             before(grammarAccess.getFodaNaryAccess().getParentKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getParentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__0__Impl"


    // $ANTLR start "rule__FodaNary__Group__1"
    // InternalHLCLSpecificationLanguage.g:2370:1: rule__FodaNary__Group__1 : rule__FodaNary__Group__1__Impl rule__FodaNary__Group__2 ;
    public final void rule__FodaNary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2374:1: ( rule__FodaNary__Group__1__Impl rule__FodaNary__Group__2 )
            // InternalHLCLSpecificationLanguage.g:2375:2: rule__FodaNary__Group__1__Impl rule__FodaNary__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__FodaNary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__1"


    // $ANTLR start "rule__FodaNary__Group__1__Impl"
    // InternalHLCLSpecificationLanguage.g:2382:1: rule__FodaNary__Group__1__Impl : ( ( rule__FodaNary__ParentAssignment_1 ) ) ;
    public final void rule__FodaNary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2386:1: ( ( ( rule__FodaNary__ParentAssignment_1 ) ) )
            // InternalHLCLSpecificationLanguage.g:2387:1: ( ( rule__FodaNary__ParentAssignment_1 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2387:1: ( ( rule__FodaNary__ParentAssignment_1 ) )
            // InternalHLCLSpecificationLanguage.g:2388:2: ( rule__FodaNary__ParentAssignment_1 )
            {
             before(grammarAccess.getFodaNaryAccess().getParentAssignment_1()); 
            // InternalHLCLSpecificationLanguage.g:2389:2: ( rule__FodaNary__ParentAssignment_1 )
            // InternalHLCLSpecificationLanguage.g:2389:3: rule__FodaNary__ParentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__ParentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getParentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__1__Impl"


    // $ANTLR start "rule__FodaNary__Group__2"
    // InternalHLCLSpecificationLanguage.g:2397:1: rule__FodaNary__Group__2 : rule__FodaNary__Group__2__Impl rule__FodaNary__Group__3 ;
    public final void rule__FodaNary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2401:1: ( rule__FodaNary__Group__2__Impl rule__FodaNary__Group__3 )
            // InternalHLCLSpecificationLanguage.g:2402:2: rule__FodaNary__Group__2__Impl rule__FodaNary__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__FodaNary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__2"


    // $ANTLR start "rule__FodaNary__Group__2__Impl"
    // InternalHLCLSpecificationLanguage.g:2409:1: rule__FodaNary__Group__2__Impl : ( 'group:' ) ;
    public final void rule__FodaNary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2413:1: ( ( 'group:' ) )
            // InternalHLCLSpecificationLanguage.g:2414:1: ( 'group:' )
            {
            // InternalHLCLSpecificationLanguage.g:2414:1: ( 'group:' )
            // InternalHLCLSpecificationLanguage.g:2415:2: 'group:'
            {
             before(grammarAccess.getFodaNaryAccess().getGroupKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getGroupKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__2__Impl"


    // $ANTLR start "rule__FodaNary__Group__3"
    // InternalHLCLSpecificationLanguage.g:2424:1: rule__FodaNary__Group__3 : rule__FodaNary__Group__3__Impl rule__FodaNary__Group__4 ;
    public final void rule__FodaNary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2428:1: ( rule__FodaNary__Group__3__Impl rule__FodaNary__Group__4 )
            // InternalHLCLSpecificationLanguage.g:2429:2: rule__FodaNary__Group__3__Impl rule__FodaNary__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__FodaNary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__3"


    // $ANTLR start "rule__FodaNary__Group__3__Impl"
    // InternalHLCLSpecificationLanguage.g:2436:1: rule__FodaNary__Group__3__Impl : ( ( rule__FodaNary__GroupAssignment_3 ) ) ;
    public final void rule__FodaNary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2440:1: ( ( ( rule__FodaNary__GroupAssignment_3 ) ) )
            // InternalHLCLSpecificationLanguage.g:2441:1: ( ( rule__FodaNary__GroupAssignment_3 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2441:1: ( ( rule__FodaNary__GroupAssignment_3 ) )
            // InternalHLCLSpecificationLanguage.g:2442:2: ( rule__FodaNary__GroupAssignment_3 )
            {
             before(grammarAccess.getFodaNaryAccess().getGroupAssignment_3()); 
            // InternalHLCLSpecificationLanguage.g:2443:2: ( rule__FodaNary__GroupAssignment_3 )
            // InternalHLCLSpecificationLanguage.g:2443:3: rule__FodaNary__GroupAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__GroupAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getGroupAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__3__Impl"


    // $ANTLR start "rule__FodaNary__Group__4"
    // InternalHLCLSpecificationLanguage.g:2451:1: rule__FodaNary__Group__4 : rule__FodaNary__Group__4__Impl rule__FodaNary__Group__5 ;
    public final void rule__FodaNary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2455:1: ( rule__FodaNary__Group__4__Impl rule__FodaNary__Group__5 )
            // InternalHLCLSpecificationLanguage.g:2456:2: rule__FodaNary__Group__4__Impl rule__FodaNary__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__FodaNary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__4"


    // $ANTLR start "rule__FodaNary__Group__4__Impl"
    // InternalHLCLSpecificationLanguage.g:2463:1: rule__FodaNary__Group__4__Impl : ( 'card:' ) ;
    public final void rule__FodaNary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2467:1: ( ( 'card:' ) )
            // InternalHLCLSpecificationLanguage.g:2468:1: ( 'card:' )
            {
            // InternalHLCLSpecificationLanguage.g:2468:1: ( 'card:' )
            // InternalHLCLSpecificationLanguage.g:2469:2: 'card:'
            {
             before(grammarAccess.getFodaNaryAccess().getCardKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getCardKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__4__Impl"


    // $ANTLR start "rule__FodaNary__Group__5"
    // InternalHLCLSpecificationLanguage.g:2478:1: rule__FodaNary__Group__5 : rule__FodaNary__Group__5__Impl rule__FodaNary__Group__6 ;
    public final void rule__FodaNary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2482:1: ( rule__FodaNary__Group__5__Impl rule__FodaNary__Group__6 )
            // InternalHLCLSpecificationLanguage.g:2483:2: rule__FodaNary__Group__5__Impl rule__FodaNary__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__FodaNary__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__5"


    // $ANTLR start "rule__FodaNary__Group__5__Impl"
    // InternalHLCLSpecificationLanguage.g:2490:1: rule__FodaNary__Group__5__Impl : ( '[' ) ;
    public final void rule__FodaNary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2494:1: ( ( '[' ) )
            // InternalHLCLSpecificationLanguage.g:2495:1: ( '[' )
            {
            // InternalHLCLSpecificationLanguage.g:2495:1: ( '[' )
            // InternalHLCLSpecificationLanguage.g:2496:2: '['
            {
             before(grammarAccess.getFodaNaryAccess().getLeftSquareBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__5__Impl"


    // $ANTLR start "rule__FodaNary__Group__6"
    // InternalHLCLSpecificationLanguage.g:2505:1: rule__FodaNary__Group__6 : rule__FodaNary__Group__6__Impl rule__FodaNary__Group__7 ;
    public final void rule__FodaNary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2509:1: ( rule__FodaNary__Group__6__Impl rule__FodaNary__Group__7 )
            // InternalHLCLSpecificationLanguage.g:2510:2: rule__FodaNary__Group__6__Impl rule__FodaNary__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__FodaNary__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__6"


    // $ANTLR start "rule__FodaNary__Group__6__Impl"
    // InternalHLCLSpecificationLanguage.g:2517:1: rule__FodaNary__Group__6__Impl : ( ( rule__FodaNary__MinAssignment_6 ) ) ;
    public final void rule__FodaNary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2521:1: ( ( ( rule__FodaNary__MinAssignment_6 ) ) )
            // InternalHLCLSpecificationLanguage.g:2522:1: ( ( rule__FodaNary__MinAssignment_6 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2522:1: ( ( rule__FodaNary__MinAssignment_6 ) )
            // InternalHLCLSpecificationLanguage.g:2523:2: ( rule__FodaNary__MinAssignment_6 )
            {
             before(grammarAccess.getFodaNaryAccess().getMinAssignment_6()); 
            // InternalHLCLSpecificationLanguage.g:2524:2: ( rule__FodaNary__MinAssignment_6 )
            // InternalHLCLSpecificationLanguage.g:2524:3: rule__FodaNary__MinAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__MinAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getMinAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__6__Impl"


    // $ANTLR start "rule__FodaNary__Group__7"
    // InternalHLCLSpecificationLanguage.g:2532:1: rule__FodaNary__Group__7 : rule__FodaNary__Group__7__Impl rule__FodaNary__Group__8 ;
    public final void rule__FodaNary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2536:1: ( rule__FodaNary__Group__7__Impl rule__FodaNary__Group__8 )
            // InternalHLCLSpecificationLanguage.g:2537:2: rule__FodaNary__Group__7__Impl rule__FodaNary__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__FodaNary__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__7"


    // $ANTLR start "rule__FodaNary__Group__7__Impl"
    // InternalHLCLSpecificationLanguage.g:2544:1: rule__FodaNary__Group__7__Impl : ( ',' ) ;
    public final void rule__FodaNary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2548:1: ( ( ',' ) )
            // InternalHLCLSpecificationLanguage.g:2549:1: ( ',' )
            {
            // InternalHLCLSpecificationLanguage.g:2549:1: ( ',' )
            // InternalHLCLSpecificationLanguage.g:2550:2: ','
            {
             before(grammarAccess.getFodaNaryAccess().getCommaKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__7__Impl"


    // $ANTLR start "rule__FodaNary__Group__8"
    // InternalHLCLSpecificationLanguage.g:2559:1: rule__FodaNary__Group__8 : rule__FodaNary__Group__8__Impl rule__FodaNary__Group__9 ;
    public final void rule__FodaNary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2563:1: ( rule__FodaNary__Group__8__Impl rule__FodaNary__Group__9 )
            // InternalHLCLSpecificationLanguage.g:2564:2: rule__FodaNary__Group__8__Impl rule__FodaNary__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__FodaNary__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__8"


    // $ANTLR start "rule__FodaNary__Group__8__Impl"
    // InternalHLCLSpecificationLanguage.g:2571:1: rule__FodaNary__Group__8__Impl : ( ( rule__FodaNary__MaxAssignment_8 ) ) ;
    public final void rule__FodaNary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2575:1: ( ( ( rule__FodaNary__MaxAssignment_8 ) ) )
            // InternalHLCLSpecificationLanguage.g:2576:1: ( ( rule__FodaNary__MaxAssignment_8 ) )
            {
            // InternalHLCLSpecificationLanguage.g:2576:1: ( ( rule__FodaNary__MaxAssignment_8 ) )
            // InternalHLCLSpecificationLanguage.g:2577:2: ( rule__FodaNary__MaxAssignment_8 )
            {
             before(grammarAccess.getFodaNaryAccess().getMaxAssignment_8()); 
            // InternalHLCLSpecificationLanguage.g:2578:2: ( rule__FodaNary__MaxAssignment_8 )
            // InternalHLCLSpecificationLanguage.g:2578:3: rule__FodaNary__MaxAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__MaxAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFodaNaryAccess().getMaxAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__8__Impl"


    // $ANTLR start "rule__FodaNary__Group__9"
    // InternalHLCLSpecificationLanguage.g:2586:1: rule__FodaNary__Group__9 : rule__FodaNary__Group__9__Impl ;
    public final void rule__FodaNary__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2590:1: ( rule__FodaNary__Group__9__Impl )
            // InternalHLCLSpecificationLanguage.g:2591:2: rule__FodaNary__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FodaNary__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__9"


    // $ANTLR start "rule__FodaNary__Group__9__Impl"
    // InternalHLCLSpecificationLanguage.g:2597:1: rule__FodaNary__Group__9__Impl : ( ']' ) ;
    public final void rule__FodaNary__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2601:1: ( ( ']' ) )
            // InternalHLCLSpecificationLanguage.g:2602:1: ( ']' )
            {
            // InternalHLCLSpecificationLanguage.g:2602:1: ( ']' )
            // InternalHLCLSpecificationLanguage.g:2603:2: ']'
            {
             before(grammarAccess.getFodaNaryAccess().getRightSquareBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__Group__9__Impl"


    // $ANTLR start "rule__VarDeclaration__UnorderedGroup"
    // InternalHLCLSpecificationLanguage.g:2613:1: rule__VarDeclaration__UnorderedGroup : rule__VarDeclaration__UnorderedGroup__0 {...}?;
    public final void rule__VarDeclaration__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getVarDeclarationAccess().getUnorderedGroup());
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2618:1: ( rule__VarDeclaration__UnorderedGroup__0 {...}?)
            // InternalHLCLSpecificationLanguage.g:2619:2: rule__VarDeclaration__UnorderedGroup__0 {...}?
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
    // InternalHLCLSpecificationLanguage.g:2627:1: rule__VarDeclaration__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) ) ;
    public final void rule__VarDeclaration__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2632:1: ( ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) ) )
            // InternalHLCLSpecificationLanguage.g:2633:3: ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) )
            {
            // InternalHLCLSpecificationLanguage.g:2633:3: ( ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 >= 13 && LA15_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:2634:3: ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2634:3: ({...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2635:4: {...}? => ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2635:108: ( ( ( rule__VarDeclaration__InstantiableAssignment_0 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2636:5: ( ( rule__VarDeclaration__InstantiableAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2642:5: ( ( rule__VarDeclaration__InstantiableAssignment_0 ) )
                    // InternalHLCLSpecificationLanguage.g:2643:6: ( rule__VarDeclaration__InstantiableAssignment_0 )
                    {
                     before(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0()); 
                    // InternalHLCLSpecificationLanguage.g:2644:6: ( rule__VarDeclaration__InstantiableAssignment_0 )
                    // InternalHLCLSpecificationLanguage.g:2644:7: rule__VarDeclaration__InstantiableAssignment_0
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
                    // InternalHLCLSpecificationLanguage.g:2649:3: ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) )
                    {
                    // InternalHLCLSpecificationLanguage.g:2649:3: ({...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) ) )
                    // InternalHLCLSpecificationLanguage.g:2650:4: {...}? => ( ( ( rule__VarDeclaration__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__VarDeclaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalHLCLSpecificationLanguage.g:2650:108: ( ( ( rule__VarDeclaration__Group_1__0 ) ) )
                    // InternalHLCLSpecificationLanguage.g:2651:5: ( ( rule__VarDeclaration__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalHLCLSpecificationLanguage.g:2657:5: ( ( rule__VarDeclaration__Group_1__0 ) )
                    // InternalHLCLSpecificationLanguage.g:2658:6: ( rule__VarDeclaration__Group_1__0 )
                    {
                     before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
                    // InternalHLCLSpecificationLanguage.g:2659:6: ( rule__VarDeclaration__Group_1__0 )
                    // InternalHLCLSpecificationLanguage.g:2659:7: rule__VarDeclaration__Group_1__0
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
    // InternalHLCLSpecificationLanguage.g:2672:1: rule__VarDeclaration__UnorderedGroup__0 : rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )? ;
    public final void rule__VarDeclaration__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2676:1: ( rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )? )
            // InternalHLCLSpecificationLanguage.g:2677:2: rule__VarDeclaration__UnorderedGroup__Impl ( rule__VarDeclaration__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_9);
            rule__VarDeclaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalHLCLSpecificationLanguage.g:2678:2: ( rule__VarDeclaration__UnorderedGroup__1 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalHLCLSpecificationLanguage.g:2678:2: rule__VarDeclaration__UnorderedGroup__1
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
    // InternalHLCLSpecificationLanguage.g:2684:1: rule__VarDeclaration__UnorderedGroup__1 : rule__VarDeclaration__UnorderedGroup__Impl ;
    public final void rule__VarDeclaration__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2688:1: ( rule__VarDeclaration__UnorderedGroup__Impl )
            // InternalHLCLSpecificationLanguage.g:2689:2: rule__VarDeclaration__UnorderedGroup__Impl
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
    // InternalHLCLSpecificationLanguage.g:2696:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2700:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2701:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2701:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2702:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2711:1: rule__Model__VarsAssignment_3 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2715:1: ( ( ruleVarDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2716:2: ( ruleVarDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2716:2: ( ruleVarDeclaration )
            // InternalHLCLSpecificationLanguage.g:2717:3: ruleVarDeclaration
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
    // InternalHLCLSpecificationLanguage.g:2726:1: rule__Model__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2730:1: ( ( ruleConstraint ) )
            // InternalHLCLSpecificationLanguage.g:2731:2: ( ruleConstraint )
            {
            // InternalHLCLSpecificationLanguage.g:2731:2: ( ruleConstraint )
            // InternalHLCLSpecificationLanguage.g:2732:3: ruleConstraint
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
    // InternalHLCLSpecificationLanguage.g:2741:1: rule__VarDeclaration__InstantiableAssignment_0 : ( ( 'instantiable' ) ) ;
    public final void rule__VarDeclaration__InstantiableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2745:1: ( ( ( 'instantiable' ) ) )
            // InternalHLCLSpecificationLanguage.g:2746:2: ( ( 'instantiable' ) )
            {
            // InternalHLCLSpecificationLanguage.g:2746:2: ( ( 'instantiable' ) )
            // InternalHLCLSpecificationLanguage.g:2747:3: ( 'instantiable' )
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 
            // InternalHLCLSpecificationLanguage.g:2748:3: ( 'instantiable' )
            // InternalHLCLSpecificationLanguage.g:2749:4: 'instantiable'
            {
             before(grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalHLCLSpecificationLanguage.g:2760:1: rule__VarDeclaration__TypeAssignment_1_0 : ( ruleVarType ) ;
    public final void rule__VarDeclaration__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2764:1: ( ( ruleVarType ) )
            // InternalHLCLSpecificationLanguage.g:2765:2: ( ruleVarType )
            {
            // InternalHLCLSpecificationLanguage.g:2765:2: ( ruleVarType )
            // InternalHLCLSpecificationLanguage.g:2766:3: ruleVarType
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
    // InternalHLCLSpecificationLanguage.g:2775:1: rule__VarDeclaration__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2779:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2780:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2780:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2781:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2790:1: rule__VarDeclaration__VariantsAssignment_1_3 : ( ruleVariantDeclaration ) ;
    public final void rule__VarDeclaration__VariantsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2794:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2795:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2795:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2796:3: ruleVariantDeclaration
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
    // InternalHLCLSpecificationLanguage.g:2805:1: rule__VariantsInterval__StartAssignment_1 : ( ruleValue ) ;
    public final void rule__VariantsInterval__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2809:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2810:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2810:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2811:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2820:1: rule__VariantsInterval__EndAssignment_3 : ( ruleValue ) ;
    public final void rule__VariantsInterval__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2824:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2825:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2825:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2826:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2835:1: rule__VariantsEnumeration__ListAssignment_2 : ( ruleEnumeration ) ;
    public final void rule__VariantsEnumeration__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2839:1: ( ( ruleEnumeration ) )
            // InternalHLCLSpecificationLanguage.g:2840:2: ( ruleEnumeration )
            {
            // InternalHLCLSpecificationLanguage.g:2840:2: ( ruleEnumeration )
            // InternalHLCLSpecificationLanguage.g:2841:3: ruleEnumeration
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
    // InternalHLCLSpecificationLanguage.g:2850:1: rule__Enumeration__ValuesAssignment_0 : ( ruleListOfValues ) ;
    public final void rule__Enumeration__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2854:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2855:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2855:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2856:3: ruleListOfValues
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
    // InternalHLCLSpecificationLanguage.g:2865:1: rule__Constraint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2869:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2870:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2870:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2871:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2880:1: rule__Constraint__ExpAssignment_2 : ( ruleConsExpression ) ;
    public final void rule__Constraint__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2884:1: ( ( ruleConsExpression ) )
            // InternalHLCLSpecificationLanguage.g:2885:2: ( ruleConsExpression )
            {
            // InternalHLCLSpecificationLanguage.g:2885:2: ( ruleConsExpression )
            // InternalHLCLSpecificationLanguage.g:2886:3: ruleConsExpression
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
    // InternalHLCLSpecificationLanguage.g:2895:1: rule__IDCons__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDCons__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2899:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2900:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2900:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2901:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2910:1: rule__Assignment__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2914:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2915:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2915:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2916:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2925:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2929:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:2930:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:2930:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:2931:3: ruleValue
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
    // InternalHLCLSpecificationLanguage.g:2940:1: rule__VarRefinement__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarRefinement__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2944:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:2945:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:2945:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:2946:3: RULE_ID
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
    // InternalHLCLSpecificationLanguage.g:2955:1: rule__VarRefinement__VariantsAssignment_2 : ( ruleVariantDeclaration ) ;
    public final void rule__VarRefinement__VariantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2959:1: ( ( ruleVariantDeclaration ) )
            // InternalHLCLSpecificationLanguage.g:2960:2: ( ruleVariantDeclaration )
            {
            // InternalHLCLSpecificationLanguage.g:2960:2: ( ruleVariantDeclaration )
            // InternalHLCLSpecificationLanguage.g:2961:3: ruleVariantDeclaration
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
    // InternalHLCLSpecificationLanguage.g:2970:1: rule__SetRefinement__VarsAssignment_1 : ( ruleListOfIDs ) ;
    public final void rule__SetRefinement__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2974:1: ( ( ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:2975:2: ( ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:2975:2: ( ruleListOfIDs )
            // InternalHLCLSpecificationLanguage.g:2976:3: ruleListOfIDs
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
    // InternalHLCLSpecificationLanguage.g:2985:1: rule__SetRefinement__HeadAssignment_6 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__HeadAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:2989:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:2990:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:2990:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:2991:3: ruleListOfValues
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
    // InternalHLCLSpecificationLanguage.g:3000:1: rule__SetRefinement__TailAssignment_8_2 : ( ruleListOfValues ) ;
    public final void rule__SetRefinement__TailAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3004:1: ( ( ruleListOfValues ) )
            // InternalHLCLSpecificationLanguage.g:3005:2: ( ruleListOfValues )
            {
            // InternalHLCLSpecificationLanguage.g:3005:2: ( ruleListOfValues )
            // InternalHLCLSpecificationLanguage.g:3006:3: ruleListOfValues
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
    // InternalHLCLSpecificationLanguage.g:3015:1: rule__Rule__ConditionAssignment_0 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3019:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:3020:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:3020:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:3021:3: ruleTerminalExp
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
    // InternalHLCLSpecificationLanguage.g:3030:1: rule__Rule__ConsequenceAssignment_2 : ( ruleTerminalExp ) ;
    public final void rule__Rule__ConsequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3034:1: ( ( ruleTerminalExp ) )
            // InternalHLCLSpecificationLanguage.g:3035:2: ( ruleTerminalExp )
            {
            // InternalHLCLSpecificationLanguage.g:3035:2: ( ruleTerminalExp )
            // InternalHLCLSpecificationLanguage.g:3036:3: ruleTerminalExp
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


    // $ANTLR start "rule__FodaUN__VarAssignment_0"
    // InternalHLCLSpecificationLanguage.g:3045:1: rule__FodaUN__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__FodaUN__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3049:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3050:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3050:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3051:3: RULE_ID
            {
             before(grammarAccess.getFodaUNAccess().getVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaUNAccess().getVarIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaUN__VarAssignment_0"


    // $ANTLR start "rule__FodaUN__OpAssignment_2"
    // InternalHLCLSpecificationLanguage.g:3060:1: rule__FodaUN__OpAssignment_2 : ( ruleUnaryOp ) ;
    public final void rule__FodaUN__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3064:1: ( ( ruleUnaryOp ) )
            // InternalHLCLSpecificationLanguage.g:3065:2: ( ruleUnaryOp )
            {
            // InternalHLCLSpecificationLanguage.g:3065:2: ( ruleUnaryOp )
            // InternalHLCLSpecificationLanguage.g:3066:3: ruleUnaryOp
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
    // InternalHLCLSpecificationLanguage.g:3075:1: rule__FodaBin__Var1Assignment_0 : ( RULE_ID ) ;
    public final void rule__FodaBin__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3079:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3080:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3080:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3081:3: RULE_ID
            {
             before(grammarAccess.getFodaBinAccess().getVar1IDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaBinAccess().getVar1IDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalHLCLSpecificationLanguage.g:3090:1: rule__FodaBin__OpAssignment_1 : ( ruleBinOp ) ;
    public final void rule__FodaBin__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3094:1: ( ( ruleBinOp ) )
            // InternalHLCLSpecificationLanguage.g:3095:2: ( ruleBinOp )
            {
            // InternalHLCLSpecificationLanguage.g:3095:2: ( ruleBinOp )
            // InternalHLCLSpecificationLanguage.g:3096:3: ruleBinOp
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
    // InternalHLCLSpecificationLanguage.g:3105:1: rule__FodaBin__Var2Assignment_2 : ( RULE_ID ) ;
    public final void rule__FodaBin__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3109:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3110:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3110:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3111:3: RULE_ID
            {
             before(grammarAccess.getFodaBinAccess().getVar2IDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaBinAccess().getVar2IDTerminalRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__FodaNary__ParentAssignment_1"
    // InternalHLCLSpecificationLanguage.g:3120:1: rule__FodaNary__ParentAssignment_1 : ( RULE_ID ) ;
    public final void rule__FodaNary__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3124:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3125:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3125:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3126:3: RULE_ID
            {
             before(grammarAccess.getFodaNaryAccess().getParentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getParentIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__ParentAssignment_1"


    // $ANTLR start "rule__FodaNary__GroupAssignment_3"
    // InternalHLCLSpecificationLanguage.g:3135:1: rule__FodaNary__GroupAssignment_3 : ( ruleListOfIDs ) ;
    public final void rule__FodaNary__GroupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3139:1: ( ( ruleListOfIDs ) )
            // InternalHLCLSpecificationLanguage.g:3140:2: ( ruleListOfIDs )
            {
            // InternalHLCLSpecificationLanguage.g:3140:2: ( ruleListOfIDs )
            // InternalHLCLSpecificationLanguage.g:3141:3: ruleListOfIDs
            {
             before(grammarAccess.getFodaNaryAccess().getGroupListOfIDsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfIDs();

            state._fsp--;

             after(grammarAccess.getFodaNaryAccess().getGroupListOfIDsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__GroupAssignment_3"


    // $ANTLR start "rule__FodaNary__MinAssignment_6"
    // InternalHLCLSpecificationLanguage.g:3150:1: rule__FodaNary__MinAssignment_6 : ( RULE_INT ) ;
    public final void rule__FodaNary__MinAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3154:1: ( ( RULE_INT ) )
            // InternalHLCLSpecificationLanguage.g:3155:2: ( RULE_INT )
            {
            // InternalHLCLSpecificationLanguage.g:3155:2: ( RULE_INT )
            // InternalHLCLSpecificationLanguage.g:3156:3: RULE_INT
            {
             before(grammarAccess.getFodaNaryAccess().getMinINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getMinINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__MinAssignment_6"


    // $ANTLR start "rule__FodaNary__MaxAssignment_8"
    // InternalHLCLSpecificationLanguage.g:3165:1: rule__FodaNary__MaxAssignment_8 : ( RULE_INT ) ;
    public final void rule__FodaNary__MaxAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3169:1: ( ( RULE_INT ) )
            // InternalHLCLSpecificationLanguage.g:3170:2: ( RULE_INT )
            {
            // InternalHLCLSpecificationLanguage.g:3170:2: ( RULE_INT )
            // InternalHLCLSpecificationLanguage.g:3171:3: RULE_INT
            {
             before(grammarAccess.getFodaNaryAccess().getMaxINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFodaNaryAccess().getMaxINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FodaNary__MaxAssignment_8"


    // $ANTLR start "rule__ListOfValues__ValuesAssignment"
    // InternalHLCLSpecificationLanguage.g:3180:1: rule__ListOfValues__ValuesAssignment : ( ruleValue ) ;
    public final void rule__ListOfValues__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3184:1: ( ( ruleValue ) )
            // InternalHLCLSpecificationLanguage.g:3185:2: ( ruleValue )
            {
            // InternalHLCLSpecificationLanguage.g:3185:2: ( ruleValue )
            // InternalHLCLSpecificationLanguage.g:3186:3: ruleValue
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


    // $ANTLR start "rule__ListOfIDs__IdsAssignment"
    // InternalHLCLSpecificationLanguage.g:3195:1: rule__ListOfIDs__IdsAssignment : ( RULE_ID ) ;
    public final void rule__ListOfIDs__IdsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHLCLSpecificationLanguage.g:3199:1: ( ( RULE_ID ) )
            // InternalHLCLSpecificationLanguage.g:3200:2: ( RULE_ID )
            {
            // InternalHLCLSpecificationLanguage.g:3200:2: ( RULE_ID )
            // InternalHLCLSpecificationLanguage.g:3201:3: RULE_ID
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\6\12\uffff";
    static final String dfa_3s = "\3\5\2\uffff\1\4\3\uffff\1\5\1\uffff\1\37";
    static final String dfa_4s = "\1\42\1\41\1\42\2\uffff\1\22\3\uffff\1\41\1\uffff\1\41";
    static final String dfa_5s = "\3\uffff\1\5\1\4\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\25\uffff\1\2\6\uffff\1\3",
            "\1\6\11\uffff\2\4\13\uffff\1\6\1\5\1\7\2\uffff\1\10",
            "\1\11\25\uffff\1\10\6\uffff\1\10",
            "",
            "",
            "\1\7\6\uffff\2\7\4\uffff\2\12",
            "",
            "",
            "",
            "\1\7\11\uffff\2\10\13\uffff\1\13\2\10\2\uffff\1\10",
            "",
            "\1\7\1\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "708:1: rule__ConsExpression__Alternatives : ( ( ruleIDCons ) | ( ruleRefinement ) | ( ruleRule ) | ( ruleFodaBin ) | ( ruleFodaNary ) | ( ruleFodaUN ) );";
        }
    }
    static final String dfa_8s = "\31\uffff";
    static final String dfa_9s = "\1\4\30\uffff";
    static final String dfa_10s = "\1\15\1\0\2\5\2\uffff\1\26\1\4\3\27\5\4\1\5\3\0\3\4\1\0\1\5";
    static final String dfa_11s = "\1\45\1\0\2\5\2\uffff\1\26\1\30\3\27\2\14\4\31\3\0\3\31\1\0\1\31";
    static final String dfa_12s = "\4\uffff\1\2\1\1\23\uffff";
    static final String dfa_13s = "\1\uffff\1\4\17\uffff\1\3\1\0\1\2\3\uffff\1\1\1\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\3\6\uffff\1\4\17\uffff\1\1",
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
            "\1\30\23\uffff\1\27",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\24\6\uffff\1\25\1\26\14\uffff\1\27",
            "\1\uffff",
            "\1\30\23\uffff\1\27"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2678:2: ( rule__VarDeclaration__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_18 = input.LA(1);

                         
                        int index16_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_23 = input.LA(1);

                         
                        int index16_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_23);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_19 = input.LA(1);

                         
                        int index16_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_17 = input.LA(1);

                         
                        int index16_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 1) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), 0) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVarDeclarationAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000006002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001001810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000408000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L});

}
