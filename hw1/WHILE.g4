/**
 * Define a grammar called Hello
 */
grammar WHILE;

@header {
	package generated;
	import main.StateToInt;
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
		$sv = (StateToInt.get(id));
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