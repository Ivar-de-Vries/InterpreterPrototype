// Generated from C:/Users/ivard/IdeaProjects/InterperterPrototype/src/main/java/grammers/interperter.g4 by ANTLR 4.13.1
package output;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link interperterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface interperterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link interperterParser#interperter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterperter(interperterParser.InterperterContext ctx);
	/**
	 * Visit a parse tree produced by {@link interperterParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(interperterParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interperterParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(interperterParser.DirectionContext ctx);
}