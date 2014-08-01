// Generated from /Users/August/Code/jokoscript/JokoScript/src/main/java/me/august/jokoscript/antlr/JokoScript.g4 by ANTLR 4.x

package me.august.jokoscript.antlr.gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JokoScriptParser}.
 */
public interface JokoScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JokoScriptParser#joko_function}.
	 * @param ctx the parse tree
	 */
	void enterJoko_function(@NotNull JokoScriptParser.Joko_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JokoScriptParser#joko_function}.
	 * @param ctx the parse tree
	 */
	void exitJoko_function(@NotNull JokoScriptParser.Joko_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JokoScriptParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(@NotNull JokoScriptParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JokoScriptParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(@NotNull JokoScriptParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JokoScriptParser#joko_main}.
	 * @param ctx the parse tree
	 */
	void enterJoko_main(@NotNull JokoScriptParser.Joko_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JokoScriptParser#joko_main}.
	 * @param ctx the parse tree
	 */
	void exitJoko_main(@NotNull JokoScriptParser.Joko_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JokoScriptParser#joko_call}.
	 * @param ctx the parse tree
	 */
	void enterJoko_call(@NotNull JokoScriptParser.Joko_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JokoScriptParser#joko_call}.
	 * @param ctx the parse tree
	 */
	void exitJoko_call(@NotNull JokoScriptParser.Joko_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link JokoScriptParser#joko_class}.
	 * @param ctx the parse tree
	 */
	void enterJoko_class(@NotNull JokoScriptParser.Joko_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link JokoScriptParser#joko_class}.
	 * @param ctx the parse tree
	 */
	void exitJoko_class(@NotNull JokoScriptParser.Joko_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link JokoScriptParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpr(@NotNull JokoScriptParser.ShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JokoScriptParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpr(@NotNull JokoScriptParser.ShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JokoScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull JokoScriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JokoScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull JokoScriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JokoScriptParser#scaleExpr}.
	 * @param ctx the parse tree
	 */
	void enterScaleExpr(@NotNull JokoScriptParser.ScaleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JokoScriptParser#scaleExpr}.
	 * @param ctx the parse tree
	 */
	void exitScaleExpr(@NotNull JokoScriptParser.ScaleExprContext ctx);
}