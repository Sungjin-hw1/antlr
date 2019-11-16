// Generated from WHILE.g4 by ANTLR 4.7.2

	package generated;
	import main.StateToInt;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WHILEParser}.
 */
public interface WHILEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(WHILEParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(WHILEParser.AexprContext ctx);
}