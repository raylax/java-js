// Generated from /Users/raylax/workspace/opensource/java-js/src/main/java/org/inurl/js/lexer/JsParser.g4 by ANTLR 4.9.1
package org.inurl.js.lexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsParser}.
 */
public interface JsParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(JsParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(JsParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(JsParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(JsParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(JsParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(JsParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(JsParser.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(JsParser.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void enterModuleItems(JsParser.ModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void exitModuleItems(JsParser.ModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void enterImportDefault(JsParser.ImportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void exitImportDefault(JsParser.ImportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(JsParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(JsParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(JsParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(JsParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(JsParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(JsParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JsParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(JsParser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JsParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(JsParser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JsParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDefaultDeclaration(JsParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JsParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDefaultDeclaration(JsParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterExportFromBlock(JsParser.ExportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitExportFromBlock(JsParser.ExportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JsParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JsParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(JsParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(JsParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(JsParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(JsParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JsParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JsParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JsParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JsParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JsParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JsParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JsParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JsParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JsParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JsParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JsParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JsParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JsParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JsParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(JsParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(JsParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfStatement(JsParser.ForOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link JsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfStatement(JsParser.ForOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(JsParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(JsParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JsParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JsParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JsParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JsParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JsParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JsParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(JsParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(JsParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(JsParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(JsParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JsParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JsParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(JsParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(JsParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(JsParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(JsParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(JsParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(JsParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(JsParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(JsParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(JsParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(JsParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JsParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JsParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JsParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JsParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(JsParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(JsParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(JsParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(JsParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(JsParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(JsParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JsParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JsParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JsParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JsParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#classTail}.
	 * @param ctx the parse tree
	 */
	void enterClassTail(JsParser.ClassTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#classTail}.
	 * @param ctx the parse tree
	 */
	void exitClassTail(JsParser.ClassTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(JsParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(JsParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(JsParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(JsParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JsParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JsParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(JsParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(JsParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(JsParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(JsParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(JsParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(JsParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(JsParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(JsParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(JsParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(JsParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(JsParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(JsParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(JsParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(JsParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(JsParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(JsParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(JsParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(JsParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProperty(JsParser.FunctionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProperty(JsParser.FunctionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetter(JsParser.PropertyGetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetter(JsParser.PropertyGetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetter(JsParser.PropertySetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetter(JsParser.PropertySetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(JsParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JsParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(JsParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(JsParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(JsParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JsParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JsParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(JsParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(JsParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(JsParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(JsParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringExpression(JsParser.TemplateStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringExpression(JsParser.TemplateStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(JsParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(JsParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(JsParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(JsParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(JsParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(JsParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JsParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JsParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(JsParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(JsParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMetaExpression(JsParser.MetaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMetaExpression(JsParser.MetaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(JsParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(JsParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(JsParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(JsParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(JsParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(JsParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(JsParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(JsParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(JsParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(JsParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpression(JsParser.AwaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpression(JsParser.AwaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(JsParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(JsParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(JsParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(JsParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(JsParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(JsParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JsParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JsParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(JsParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(JsParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(JsParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(JsParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(JsParser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(JsParser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(JsParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(JsParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(JsParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(JsParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterImportExpression(JsParser.ImportExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitImportExpression(JsParser.ImportExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JsParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JsParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(JsParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(JsParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(JsParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(JsParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(JsParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(JsParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(JsParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(JsParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JsParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JsParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JsParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JsParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JsParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JsParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterYieldExpression(JsParser.YieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitYieldExpression(JsParser.YieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitNotExpression(JsParser.BitNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitNotExpression(JsParser.BitNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(JsParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(JsParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(JsParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(JsParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(JsParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(JsParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(JsParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(JsParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(JsParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(JsParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(JsParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(JsParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(JsParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(JsParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(JsParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(JsParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(JsParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(JsParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(JsParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(JsParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterVoidExpression(JsParser.VoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitVoidExpression(JsParser.VoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoalesceExpression(JsParser.CoalesceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JsParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoalesceExpression(JsParser.CoalesceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(JsParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(JsParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(JsParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(JsParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link JsParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(JsParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link JsParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(JsParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link JsParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunctionDecl(JsParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link JsParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunctionDecl(JsParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JsParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(JsParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JsParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(JsParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionParameters(JsParser.ArrowFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionParameters(JsParser.ArrowFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(JsParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(JsParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JsParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JsParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(JsParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(JsParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBigintLiteral(JsParser.BigintLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBigintLiteral(JsParser.BigintLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(JsParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(JsParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(JsParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(JsParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(JsParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(JsParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JsParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JsParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(JsParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(JsParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(JsParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(JsParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#let_}.
	 * @param ctx the parse tree
	 */
	void enterLet_(JsParser.Let_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#let_}.
	 * @param ctx the parse tree
	 */
	void exitLet_(JsParser.Let_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JsParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(JsParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(JsParser.EosContext ctx);
}