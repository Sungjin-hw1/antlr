package hw1;

import generated.*;

public class WHILEWalker extends WHILEBaseListener {

	public void exitAexpr(WHILEParser.AexprContext ctx) {
	    System.out.println( "Exiting Aexpr" + ctx.sv );
	}
}