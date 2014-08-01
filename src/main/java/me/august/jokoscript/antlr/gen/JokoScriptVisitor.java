// Generated from /Users/August/Code/jokoscript/JokoScript/src/main/java/me/august/jokoscript/antlr/JokoScript.g4 by ANTLR 4.x

package me.august.jokoscript.antlr.gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JokoScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JokoScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JokoScriptParser#joko_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoko_function(@NotNull JokoScriptParser.Joko_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JokoScriptParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(@NotNull JokoScriptParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JokoScriptParser#joko_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoko_main(@NotNull JokoScriptParser.Joko_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JokoScriptParser#joko_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoko_call(@NotNull JokoScriptParser.Joko_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JokoScriptParser#joko_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoko_class(@NotNull JokoScriptParser.Joko_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link JokoScriptParser#shiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpr(@NotNull JokoScriptParser.ShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JokoScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull JokoScriptParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JokoScriptParser#scaleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleExpr(@NotNull JokoScriptParser.ScaleExprContext ctx);
}