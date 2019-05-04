// Generated from tinyrexx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tinyrexxParser}.
 */
public interface tinyrexxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tinyrexxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tinyrexxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(tinyrexxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(tinyrexxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(tinyrexxParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(tinyrexxParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(tinyrexxParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(tinyrexxParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(tinyrexxParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(tinyrexxParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#w_loop}.
	 * @param ctx the parse tree
	 */
	void enterW_loop(tinyrexxParser.W_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#w_loop}.
	 * @param ctx the parse tree
	 */
	void exitW_loop(tinyrexxParser.W_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(tinyrexxParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(tinyrexxParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#a_expr}.
	 * @param ctx the parse tree
	 */
	void enterA_expr(tinyrexxParser.A_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#a_expr}.
	 * @param ctx the parse tree
	 */
	void exitA_expr(tinyrexxParser.A_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#a_op}.
	 * @param ctx the parse tree
	 */
	void enterA_op(tinyrexxParser.A_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#a_op}.
	 * @param ctx the parse tree
	 */
	void exitA_op(tinyrexxParser.A_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#r_op}.
	 * @param ctx the parse tree
	 */
	void enterR_op(tinyrexxParser.R_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#r_op}.
	 * @param ctx the parse tree
	 */
	void exitR_op(tinyrexxParser.R_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#i_op}.
	 * @param ctx the parse tree
	 */
	void enterI_op(tinyrexxParser.I_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#i_op}.
	 * @param ctx the parse tree
	 */
	void exitI_op(tinyrexxParser.I_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyrexxParser#guardia}.
	 * @param ctx the parse tree
	 */
	void enterGuardia(tinyrexxParser.GuardiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyrexxParser#guardia}.
	 * @param ctx the parse tree
	 */
	void exitGuardia(tinyrexxParser.GuardiaContext ctx);
}