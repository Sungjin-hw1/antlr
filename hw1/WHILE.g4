/**
 * Define a grammar called Hello
 */
grammar WHILE;

@header {
	package generated;
	import hw1.Interpreter;
}

program : aexpr;

aexpr returns [int sv] 
	: N
	{
		String n = $N.getText();
		$sv = Integer.parseInt(n);
	}
	| IDENT
	{
		String id = $IDENT.getText();
		$sv = (Interpreter.get(id));
	}
	| a1=aexpr '*' a2=aexpr
	{$sv = ($a1.sv * $a2.sv); }
	| a1= aexpr '+' a2=aexpr
	{$sv = ($a1.sv + $a2.sv);}
	| a1=aexpr '-' a2=aexpr
	{$sv = ($a1.sv - $a2.sv); }
	;
	
N :   [0-9]+ ;
IDENT  :   [x] ;
WS  :   [ \t\r\n]+ -> skip ; 