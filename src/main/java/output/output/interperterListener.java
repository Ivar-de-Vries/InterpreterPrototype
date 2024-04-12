// Generated from C:/Users/ivard/IdeaProjects/InterperterPrototype/src/main/java/grammers/interperter.g4 by ANTLR 4.13.1
package output;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link interperterParser}.
 */
public interface interperterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link interperterParser#interperter}.
	 * @param ctx the parse tree
	 */
	void enterInterperter(interperterParser.InterperterContext ctx);
	/**
	 * Exit a parse tree produced by {@link interperterParser#interperter}.
	 * @param ctx the parse tree
	 */
	void exitInterperter(interperterParser.InterperterContext ctx);
	/**
	 * Enter a parse tree produced by {@link interperterParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(interperterParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link interperterParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(interperterParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link interperterParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(interperterParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link interperterParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(interperterParser.DirectionContext ctx);
}