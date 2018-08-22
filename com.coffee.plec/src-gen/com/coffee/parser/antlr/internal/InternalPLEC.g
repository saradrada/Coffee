/*
 * generated by Xtext 2.12.0
 */
grammar InternalPLEC;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.coffee.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.coffee.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.coffee.services.PLECGrammarAccess;

}

@parser::members {

 	private PLECGrammarAccess grammarAccess;

    public InternalPLECParser(TokenStream input, PLECGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected PLECGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='variables:'
		{
			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getVariablesKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_3_0());
				}
				lv_vars_3_0=ruleVarDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"vars",
						lv_vars_3_0,
						"com.coffee.PLEC.VarDeclaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='constraints:'
		{
			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getConstraintsKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_5_0());
				}
				lv_constraints_5_0=ruleConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"constraints",
						lv_constraints_5_0,
						"com.coffee.PLEC.Constraint");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleVarDeclaration
entryRuleVarDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarDeclarationRule()); }
	iv_ruleVarDeclaration=ruleVarDeclaration
	{ $current=$iv_ruleVarDeclaration.current; }
	EOF;

// Rule VarDeclaration
ruleVarDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_instantiable_0_0='instantiable'
					{
						newLeafNode(lv_instantiable_0_0, grammarAccess.getVarDeclarationAccess().getInstantiableInstantiableKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVarDeclarationRule());
						}
						setWithLastConsumed($current, "instantiable", lv_instantiable_0_0, "instantiable");
					}
				)
			)
			otherlv_1='['
			{
				newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getLeftSquareBracketKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVarDeclarationAccess().getMinNumberParserRuleCall_0_2_0());
					}
					lv_min_2_0=ruleNumber
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
						}
						set(
							$current,
							"min",
							lv_min_2_0,
							"com.coffee.PLEC.Number");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVarDeclarationAccess().getMaxNumberParserRuleCall_0_4_0());
					}
					lv_max_4_0=ruleNumber
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
						}
						set(
							$current,
							"max",
							lv_max_4_0,
							"com.coffee.PLEC.Number");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=']'
			{
				newLeafNode(otherlv_5, grammarAccess.getVarDeclarationAccess().getRightSquareBracketKeyword_0_5());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVarTypeParserRuleCall_1_0());
				}
				lv_type_6_0=ruleVarType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
					}
					set(
						$current,
						"type",
						lv_type_6_0,
						"com.coffee.PLEC.VarType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_7_0=RULE_ID
				{
					newLeafNode(lv_name_7_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_7_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_8='values:'
			{
				newLeafNode(otherlv_8, grammarAccess.getVarDeclarationAccess().getValuesKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVariantsVariantDeclarationParserRuleCall_3_1_0());
					}
					lv_variants_9_0=ruleVariantDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
						}
						set(
							$current,
							"variants",
							lv_variants_9_0,
							"com.coffee.PLEC.VariantDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleVariantDeclaration
entryRuleVariantDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariantDeclarationRule()); }
	iv_ruleVariantDeclaration=ruleVariantDeclaration
	{ $current=$iv_ruleVariantDeclaration.current; }
	EOF;

// Rule VariantDeclaration
ruleVariantDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVariantDeclarationAccess().getVariantsIntervalParserRuleCall_0());
		}
		this_VariantsInterval_0=ruleVariantsInterval
		{
			$current = $this_VariantsInterval_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariantDeclarationAccess().getVariantsEnumerationParserRuleCall_1());
		}
		this_VariantsEnumeration_1=ruleVariantsEnumeration
		{
			$current = $this_VariantsEnumeration_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVariantsInterval
entryRuleVariantsInterval returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariantsIntervalRule()); }
	iv_ruleVariantsInterval=ruleVariantsInterval
	{ $current=$iv_ruleVariantsInterval.current; }
	EOF;

// Rule VariantsInterval
ruleVariantsInterval returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getVariantsIntervalAccess().getStartNumberParserRuleCall_0_0());
				}
				lv_start_0_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariantsIntervalRule());
					}
					set(
						$current,
						"start",
						lv_start_0_0,
						"com.coffee.PLEC.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='..'
		{
			newLeafNode(otherlv_1, grammarAccess.getVariantsIntervalAccess().getFullStopFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariantsIntervalAccess().getEndNumberParserRuleCall_2_0());
				}
				lv_end_2_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariantsIntervalRule());
					}
					set(
						$current,
						"end",
						lv_end_2_0,
						"com.coffee.PLEC.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariantsEnumeration
entryRuleVariantsEnumeration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariantsEnumerationRule()); }
	iv_ruleVariantsEnumeration=ruleVariantsEnumeration
	{ $current=$iv_ruleVariantsEnumeration.current; }
	EOF;

// Rule VariantsEnumeration
ruleVariantsEnumeration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getVariantsEnumerationAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariantsEnumerationAccess().getListListOfValuesParserRuleCall_1_0());
				}
				lv_list_1_0=ruleListOfValues
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariantsEnumerationRule());
					}
					set(
						$current,
						"list",
						lv_list_1_0,
						"com.coffee.PLEC.ListOfValues");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=']'
		{
			newLeafNode(otherlv_2, grammarAccess.getVariantsEnumerationAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	iv_ruleConstraint=ruleConstraint
	{ $current=$iv_ruleConstraint.current; }
	EOF;

// Rule Constraint
ruleConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstraintAccess().getExpConsExpressionParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleConsExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstraintRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"com.coffee.PLEC.ConsExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleConsExpression
entryRuleConsExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConsExpressionRule()); }
	iv_ruleConsExpression=ruleConsExpression
	{ $current=$iv_ruleConsExpression.current; }
	EOF;

// Rule ConsExpression
ruleConsExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConsExpressionAccess().getIDConsParserRuleCall_0());
		}
		this_IDCons_0=ruleIDCons
		{
			$current = $this_IDCons_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConsExpressionAccess().getRefinementParserRuleCall_1());
		}
		this_Refinement_1=ruleRefinement
		{
			$current = $this_Refinement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConsExpressionAccess().getRuleParserRuleCall_2());
		}
		this_Rule_2=ruleRule
		{
			$current = $this_Rule_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConsExpressionAccess().getFodaBinParserRuleCall_3());
		}
		this_FodaBin_3=ruleFodaBin
		{
			$current = $this_FodaBin_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConsExpressionAccess().getStructuralParserRuleCall_4());
		}
		this_Structural_4=ruleStructural
		{
			$current = $this_Structural_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConsExpressionAccess().getFodaUNParserRuleCall_5());
		}
		this_FodaUN_5=ruleFodaUN
		{
			$current = $this_FodaUN_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConsExpressionAccess().getAttributesParserRuleCall_6());
		}
		this_Attributes_6=ruleAttributes
		{
			$current = $this_Attributes_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTerminalExp
entryRuleTerminalExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalExpRule()); }
	iv_ruleTerminalExp=ruleTerminalExp
	{ $current=$iv_ruleTerminalExp.current; }
	EOF;

// Rule TerminalExp
ruleTerminalExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getTerminalExpAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getTerminalExpAccess().getConsExpressionParserRuleCall_0_1());
			}
			this_ConsExpression_1=ruleConsExpression
			{
				$current = $this_ConsExpression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getTerminalExpAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getTerminalExpAccess().getIDConsParserRuleCall_1());
		}
		this_IDCons_3=ruleIDCons
		{
			$current = $this_IDCons_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIDCons
entryRuleIDCons returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIDConsRule()); }
	iv_ruleIDCons=ruleIDCons
	{ $current=$iv_ruleIDCons.current; }
	EOF;

// Rule IDCons
ruleIDCons returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getIDConsAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIDConsRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleStructural
entryRuleStructural returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStructuralRule()); }
	iv_ruleStructural=ruleStructural
	{ $current=$iv_ruleStructural.current; }
	EOF;

// Rule Structural
ruleStructural returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='structural:'
		{
			newLeafNode(otherlv_0, grammarAccess.getStructuralAccess().getStructuralKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStructuralRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStructuralAccess().getParentVarDeclarationCrossReference_1_0());
				}
				ruleParent
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='variants:'
		{
			newLeafNode(otherlv_2, grammarAccess.getStructuralAccess().getVariantsKeyword_2());
		}
		otherlv_3='['
		{
			newLeafNode(otherlv_3, grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStructuralAccess().getGroupListOfIDsParserRuleCall_4_0());
				}
				lv_group_4_0=ruleListOfIDs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStructuralRule());
					}
					set(
						$current,
						"group",
						lv_group_4_0,
						"com.coffee.PLEC.ListOfIDs");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=']'
		{
			newLeafNode(otherlv_5, grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_5());
		}
		(
			otherlv_6='card:'
			{
				newLeafNode(otherlv_6, grammarAccess.getStructuralAccess().getCardKeyword_6_0());
			}
			otherlv_7='['
			{
				newLeafNode(otherlv_7, grammarAccess.getStructuralAccess().getLeftSquareBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStructuralAccess().getMinNumberParserRuleCall_6_2_0());
					}
					lv_min_8_0=ruleNumber
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStructuralRule());
						}
						set(
							$current,
							"min",
							lv_min_8_0,
							"com.coffee.PLEC.Number");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=','
			{
				newLeafNode(otherlv_9, grammarAccess.getStructuralAccess().getCommaKeyword_6_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStructuralAccess().getMaxNumberParserRuleCall_6_4_0());
					}
					lv_max_10_0=ruleNumber
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStructuralRule());
						}
						set(
							$current,
							"max",
							lv_max_10_0,
							"com.coffee.PLEC.Number");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_11=']'
			{
				newLeafNode(otherlv_11, grammarAccess.getStructuralAccess().getRightSquareBracketKeyword_6_5());
			}
		)?
	)
;

// Entry rule entryRuleParent
entryRuleParent returns [String current=null]:
	{ newCompositeNode(grammarAccess.getParentRule()); }
	iv_ruleParent=ruleParent
	{ $current=$iv_ruleParent.current.getText(); }
	EOF;

// Rule Parent
ruleParent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getParentAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleAttributes
entryRuleAttributes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributesRule()); }
	iv_ruleAttributes=ruleAttributes
	{ $current=$iv_ruleAttributes.current; }
	EOF;

// Rule Attributes
ruleAttributes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='attributes:'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
		}
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributesAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributesAccess().getAttListOfIDsParserRuleCall_2_0());
				}
				lv_att_2_0=ruleListOfIDs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributesRule());
					}
					set(
						$current,
						"att",
						lv_att_2_0,
						"com.coffee.PLEC.ListOfIDs");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getAttributesAccess().getRightSquareBracketKeyword_3());
		}
		otherlv_4='of'
		{
			newLeafNode(otherlv_4, grammarAccess.getAttributesAccess().getOfKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributesRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getAttributesAccess().getVar1VarDeclarationCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleRefinement
entryRuleRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefinementRule()); }
	iv_ruleRefinement=ruleRefinement
	{ $current=$iv_ruleRefinement.current; }
	EOF;

// Rule Refinement
ruleRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRefinementAccess().getAssignmentParserRuleCall_0());
		}
		this_Assignment_0=ruleAssignment
		{
			$current = $this_Assignment_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefinementAccess().getVarRefinementParserRuleCall_1());
		}
		this_VarRefinement_1=ruleVarRefinement
		{
			$current = $this_VarRefinement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefinementAccess().getSetRefinementParserRuleCall_2());
		}
		this_SetRefinement_2=ruleSetRefinement
		{
			$current = $this_SetRefinement_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentRule()); }
	iv_ruleAssignment=ruleAssignment
	{ $current=$iv_ruleAssignment.current; }
	EOF;

// Rule Assignment
ruleAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_var_0_0=RULE_ID
				{
					newLeafNode(lv_var_0_0, grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignmentRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='is'
		{
			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getIsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0());
				}
				lv_value_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignmentRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.coffee.PLEC.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVarRefinement
entryRuleVarRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarRefinementRule()); }
	iv_ruleVarRefinement=ruleVarRefinement
	{ $current=$iv_ruleVarRefinement.current; }
	EOF;

// Rule VarRefinement
ruleVarRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_var_0_0=RULE_ID
				{
					newLeafNode(lv_var_0_0, grammarAccess.getVarRefinementAccess().getVarIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarRefinementRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='in'
		{
			newLeafNode(otherlv_1, grammarAccess.getVarRefinementAccess().getInKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVarRefinementAccess().getValuesVariantDeclarationParserRuleCall_2_0());
				}
				lv_values_2_0=ruleVariantDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarRefinementRule());
					}
					set(
						$current,
						"values",
						lv_values_2_0,
						"com.coffee.PLEC.VariantDeclaration");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSetRefinement
entryRuleSetRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSetRefinementRule()); }
	iv_ruleSetRefinement=ruleSetRefinement
	{ $current=$iv_ruleSetRefinement.current; }
	EOF;

// Rule SetRefinement
ruleSetRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='vars:'
		{
			newLeafNode(otherlv_0, grammarAccess.getSetRefinementAccess().getVarsKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSetRefinementAccess().getVarsListOfIDsParserRuleCall_2_0());
				}
				lv_vars_2_0=ruleListOfIDs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSetRefinementRule());
					}
					set(
						$current,
						"vars",
						lv_vars_2_0,
						"com.coffee.PLEC.ListOfIDs");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_3());
		}
		otherlv_4='variants'
		{
			newLeafNode(otherlv_4, grammarAccess.getSetRefinementAccess().getVariantsKeyword_4());
		}
		otherlv_5='['
		{
			newLeafNode(otherlv_5, grammarAccess.getSetRefinementAccess().getLeftSquareBracketKeyword_5());
		}
		otherlv_6='('
		{
			newLeafNode(otherlv_6, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSetRefinementAccess().getHeadListOfValuesParserRuleCall_7_0());
				}
				lv_head_7_0=ruleListOfValues
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSetRefinementRule());
					}
					set(
						$current,
						"head",
						lv_head_7_0,
						"com.coffee.PLEC.ListOfValues");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_8());
		}
		(
			otherlv_9=','
			{
				newLeafNode(otherlv_9, grammarAccess.getSetRefinementAccess().getCommaKeyword_9_0());
			}
			otherlv_10='('
			{
				newLeafNode(otherlv_10, grammarAccess.getSetRefinementAccess().getLeftParenthesisKeyword_9_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSetRefinementAccess().getTailListOfValuesParserRuleCall_9_2_0());
					}
					lv_tail_11_0=ruleListOfValues
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSetRefinementRule());
						}
						add(
							$current,
							"tail",
							lv_tail_11_0,
							"com.coffee.PLEC.ListOfValues");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_12=')'
			{
				newLeafNode(otherlv_12, grammarAccess.getSetRefinementAccess().getRightParenthesisKeyword_9_3());
			}
		)+
		otherlv_13=']'
		{
			newLeafNode(otherlv_13, grammarAccess.getSetRefinementAccess().getRightSquareBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getConditionTerminalExpParserRuleCall_0_0());
				}
				lv_condition_0_0=ruleTerminalExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"condition",
						lv_condition_0_0,
						"com.coffee.PLEC.TerminalExp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='-->'
		{
			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getConsequenceTerminalExpParserRuleCall_2_0());
				}
				lv_consequence_2_0=ruleTerminalExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"consequence",
						lv_consequence_2_0,
						"com.coffee.PLEC.TerminalExp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFodaUN
entryRuleFodaUN returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFodaUNRule()); }
	iv_ruleFodaUN=ruleFodaUN
	{ $current=$iv_ruleFodaUN.current; }
	EOF;

// Rule FodaUN
ruleFodaUN returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFodaUNRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFodaUNAccess().getVar1VarDeclarationCrossReference_0_0());
				}
			)
		)
		otherlv_1='is'
		{
			newLeafNode(otherlv_1, grammarAccess.getFodaUNAccess().getIsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFodaUNAccess().getOpUnaryOpParserRuleCall_2_0());
				}
				lv_op_2_0=ruleUnaryOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFodaUNRule());
					}
					set(
						$current,
						"op",
						lv_op_2_0,
						"com.coffee.PLEC.UnaryOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFodaBin
entryRuleFodaBin returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFodaBinRule()); }
	iv_ruleFodaBin=ruleFodaBin
	{ $current=$iv_ruleFodaBin.current; }
	EOF;

// Rule FodaBin
ruleFodaBin returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFodaBinRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFodaBinAccess().getVar1VarDeclarationCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFodaBinAccess().getOpBinOpParserRuleCall_1_0());
				}
				lv_op_1_0=ruleBinOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFodaBinRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.coffee.PLEC.BinOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFodaBinRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getFodaBinAccess().getVar2VarDeclarationCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleBoolVal
entryRuleBoolVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoolValRule()); }
	iv_ruleBoolVal=ruleBoolVal
	{ $current=$iv_ruleBoolVal.current; }
	EOF;

// Rule BoolVal
ruleBoolVal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_value_0_1='true'
				{
					newLeafNode(lv_value_0_1, grammarAccess.getBoolValAccess().getValueTrueKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBoolValRule());
					}
					setWithLastConsumed($current, "value", lv_value_0_1, null);
				}
				    |
				lv_value_0_2='false'
				{
					newLeafNode(lv_value_0_2, grammarAccess.getBoolValAccess().getValueFalseKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBoolValRule());
					}
					setWithLastConsumed($current, "value", lv_value_0_2, null);
				}
			)
		)
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current; }
	EOF;

// Rule Number
ruleNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNumberRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleSymbol
entryRuleSymbol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSymbolRule()); }
	iv_ruleSymbol=ruleSymbol
	{ $current=$iv_ruleSymbol.current; }
	EOF;

// Rule Symbol
ruleSymbol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_ID
			{
				newLeafNode(lv_value_0_0, grammarAccess.getSymbolAccess().getValueIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSymbolRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValueAccess().getNumberParserRuleCall_0());
		}
		this_Number_0=ruleNumber
		{
			$current = $this_Number_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getNonEnumerableValueParserRuleCall_1());
		}
		this_NonEnumerableValue_1=ruleNonEnumerableValue
		{
			$current = $this_NonEnumerableValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNonEnumerableValue
entryRuleNonEnumerableValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNonEnumerableValueRule()); }
	iv_ruleNonEnumerableValue=ruleNonEnumerableValue
	{ $current=$iv_ruleNonEnumerableValue.current; }
	EOF;

// Rule NonEnumerableValue
ruleNonEnumerableValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNonEnumerableValueAccess().getBoolValParserRuleCall_0());
		}
		this_BoolVal_0=ruleBoolVal
		{
			$current = $this_BoolVal_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNonEnumerableValueAccess().getSymbolParserRuleCall_1());
		}
		this_Symbol_1=ruleSymbol
		{
			$current = $this_Symbol_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVarType
entryRuleVarType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVarTypeRule()); }
	iv_ruleVarType=ruleVarType
	{ $current=$iv_ruleVarType.current.getText(); }
	EOF;

// Rule VarType
ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='boolean'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVarTypeAccess().getBooleanKeyword_0());
		}
		    |
		kw='integer'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVarTypeAccess().getIntegerKeyword_1());
		}
		    |
		kw='symbolic'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVarTypeAccess().getSymbolicKeyword_2());
		}
	)
;

// Entry rule entryRuleListOfValues
entryRuleListOfValues returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListOfValuesRule()); }
	iv_ruleListOfValues=ruleListOfValues
	{ $current=$iv_ruleListOfValues.current; }
	EOF;

// Rule ListOfValues
ruleListOfValues returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_0_0());
				}
				lv_values_0_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListOfValuesRule());
					}
					add(
						$current,
						"values",
						lv_values_0_0,
						"com.coffee.PLEC.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_1=','
				{
					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
				}
			)+
			(
				(
					{
						newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesValueParserRuleCall_1_1_0());
					}
					lv_values_2_0=ruleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getListOfValuesRule());
						}
						add(
							$current,
							"values",
							lv_values_2_0,
							"com.coffee.PLEC.Value");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleListOfIDs
entryRuleListOfIDs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListOfIDsRule()); }
	iv_ruleListOfIDs=ruleListOfIDs
	{ $current=$iv_ruleListOfIDs.current; }
	EOF;

// Rule ListOfIDs
ruleListOfIDs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListOfIDsRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_0_0());
				}
			)
		)
		(
			(
				otherlv_1=','
				{
					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0());
				}
			)+
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getListOfIDsRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getListOfIDsAccess().getIdsVarDeclarationCrossReference_1_1_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleBinOp
entryRuleBinOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBinOpRule()); }
	iv_ruleBinOp=ruleBinOp
	{ $current=$iv_ruleBinOp.current.getText(); }
	EOF;

// Rule BinOp
ruleBinOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='requires'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBinOpAccess().getRequiresKeyword_0());
		}
		    |
		kw='excludes'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBinOpAccess().getExcludesKeyword_1());
		}
		    |
		kw='optional'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBinOpAccess().getOptionalKeyword_2());
		}
		    |
		kw='mandatory'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBinOpAccess().getMandatoryKeyword_3());
		}
	)
;

// Entry rule entryRuleUnaryOp
entryRuleUnaryOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUnaryOpRule()); }
	iv_ruleUnaryOp=ruleUnaryOp
	{ $current=$iv_ruleUnaryOp.current.getText(); }
	EOF;

// Rule UnaryOp
ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='optional'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getOptionalKeyword_0());
		}
		    |
		kw='mandatory'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnaryOpAccess().getMandatoryKeyword_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
