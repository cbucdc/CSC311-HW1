/* The lexer for scanning HTML source. */
%%

%class HTMLScanner
%standalone
%line
Comment = <\!---.*-->
Email = [a-zA-Z_0-9]+@[a-zA-Z_0-9]+\.[a-zA-Z]+
Tag =  <[\/]?[\w\s]+>
Phone = [(]?[0-9]+[)-]+[0-9]+[-]?[0-9]+
Link =(http:\/\/|www\.)+[\w]+\.[\w]+(\.[\w]+)?
SignedNum = [+-]+[0-9]+
TitleTag =<title>[\w\s ]*<\/title>
%%


{Comment}+ {System.out.print(""); }
{Email} {System.out.print("EMAIL:" + yytext()); }
{Tag} {System.out.print(""); }
{Phone} {System.out.print("PHONE:" + yytext()); }
{Link} {System.out.print("HIDDEN_LINK:" + yytext()); }
{SignedNum} {System.out.print("SIGNED_NUM:" + yytext()); }
{TitleTag} {System.out.print("==="+yytext().substring(7, yytext().length()-8)+"==="); }

&#38; {System.out.print("&");}
&#42; {System.out.print("*");}
&#45; {System.out.print("-");}
&#58; {System.out.print(":");}
&#59; {System.out.print(";");}
&#60; {System.out.print("<");}
&#61; {System.out.print("=");}
&#62; {System.out.print(">");}
&#63; {System.out.print("?");}

