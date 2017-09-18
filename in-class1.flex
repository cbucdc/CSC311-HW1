/* The lexer for scanning HTML source. */
%%

%class HTMLScanner
%standalone
%line
Comment = <\!---.*-->
Email = [a-zA-Z_0-9]+@[a-zA-Z_0-9]+\.[a-zA-Z]+
Tag =  <[/]?[a-zA-Z0-9_]+>
Phone = [(]?[0-9]+[)-]+[0-9]+[-]?[0-9]+
SafeChar = &#[0-9]+;
Link = (http:\/\/|www)+\.?[\w]+\.[\w]+\.[\w]+
SignedNum = [+-]?[0-9]+
%%

{Comment}+ {System.out.print(""); }
{Email}+ {System.out.println("EMAIL:" + yytext() + "\n"); }
{Tag}+ {System.out.print(""); }
{Phone}+ {System.out.println("PHONE:" + yytext() + "\n"); }
{Link}+ {System.out.println("HIDDEN_LINK:" + yytext() + "\n"); }
{SignedNum}+ {System.out.println("SIGNED_NUM:" + yytext() + "\n"); }

&#38;+ {System.out.print("&");}
&#42;+ {System.out.print("*");}
&#45;+ {System.out.print("-");}
&#58;+ {System.out.print(":");}
&#59;+ {System.out.print(";");}
&#60;+ {System.out.print("<");}
&#61;+ {System.out.print("=");}
&#62;+ {System.out.print(">");}
&#63;+ {System.out.print("?");}

