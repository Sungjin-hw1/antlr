package hw1;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap; 

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import generated.*;

public class Interpreter {

	static public Map<String, Integer> mapForIDENT = new HashMap<String, Integer>()
	{
		{
			put("x", 70);
		}
	};
	
	static public int get(String id)
	{
		return mapForIDENT.get(id);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CharStream codeCharStream =
				CharStreams.fromFileName("test.wh");
		WHILELexer lexer = new WHILELexer( codeCharStream);
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		WHILEParser parser = new WHILEParser( tokens );
		ParseTree tree = parser.program();
		ParseTreeWalker walker = new ParseTreeWalker();
	    walker.walk( new WHILEWalker(), tree );
	}

}
