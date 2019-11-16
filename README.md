# ANTLR4를 이용한 간단한 계산기 예제

## 1. Eclipse 및 ANTLRL4 설치 
ANTLR4를 이용한 코드작성을 하려면 개발환경이 필요하다.
ANTLR4를 지원하는 언어 및 개발환경은 JAVA, C#, python 등 여러가지가 있는데,
본 예제에서는 JAVA 기반의 환경을 활용하였다.
JAVA 및 ANTLR4를 활용하기 위한 환경설치를 위하여 아래 링크를 참고하였다.

[Eclipse 설치(ANTLR4 IDE)](https://github.com/jknack/antlr4ide)

[최신 ANTLR4 설치(JAR)](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md)

## 2. ANTLR4 컴파일 및 실행환경 설정
프로젝트가 정상적으로 컴파일 및 동작하려면,
추가로 몇가지 프로젝트 환경설정을 해주어야 한다.
아래 그림을 참고하여 프로젝트 환경설정을 해준다.

![프로젝트파일구성](./doc/images/antlr_tool.png)
![프로젝트파일구성](./doc/images/antlr4_jar추가.png)

## 3. ANTLR4 프로젝트 새로 생성
Eclipse 및 ANTLR4 설치 후, 아래 그림과 같이 새로운 ANTLR4 프로젝트를 생성한다.

![프로젝트생성](./doc/images/프로젝트생성.png)
![프로젝트선택](./doc/images/ANTLR프로젝트선택.png)
![프로젝트파일구성](./doc/images/project_facets.png)

## 4. 계산기 예제 프로젝트 구현
github repository에 올려둔 소스코드의 "WHILE.g4" 와 같이 코드를 작성하여 컴파일하면, "src" 하위로 "generated" 패키지가 생성되면서 자동으로 JAVA, interp, tokens 등의 파일이 생성된다.

![프로젝트파일구성](./doc/images/프로젝트파일구성.png)

### [WHILE.g4]
```antlr
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
```

이때, 앞서 언급한 "2. ANTLR4 컴파일 및 실행환경 설정"에서 ANTLR4>TOOL 의 경로설정이 "./src/" 로 되어있어야 설명처럼 동작한다.

예제의 WHILE.g4는 전역 MAP을 활용하기 위해서 "src/main/" 패키지의 StateToInt.java를 import하도록 구현되었다.

### [StateToInt.java]
```java
package main;

import java.util.HashMap;
import java.util.Map;

public class StateToInt {
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
}
```

"src/main" 패키지의 Interpreter.java는 main함수를 포함하고 있다.

### [Interpreter.java]
```java
package main;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap; 

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import generated.*;

public class Interpreter {

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
```

마지막으로 계산기 예제코드의 연산결과를 출력하기위하여,
"src/hw1" 하위로 WHILEWalker.java를 구현하였다.

### [WHILEWalker.java]
```java
package main;

import generated.*;

public class WHILEWalker extends WHILEBaseListener {

	public void exitAexpr(WHILEParser.AexprContext ctx) {
	    System.out.println( "Exiting Aexpr" + ctx.sv );
	}
}
```

## 5. 계산기 예제 동작 화면
모든 설정이 정상적으로 완료되었다면,
아래 그림과 같이 ANTLR예제가 정상적으로 실행되는 것을 확인할 수 있다.

![실행화면](./doc/images/실행화면.png)

다음은 WHILE.g4에 대한 Syntax Diagram 화면이다.

![Syntax_Diagram](./doc/images/Syntax_Diagram.png)

Eclipse에서 위의 Syntax diagram창은 다음과 같이 설정하여 활성화할 수 있다.

![Syntax_Diagram](./doc/images/syntax_diagram창_설정1.png)
![Syntax_Diagram](./doc/images/syntax_diagram창_설정2.png)
