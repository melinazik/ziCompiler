/* --------------------------Usercode Section------------------------ */
import java_cup.runtime.*;
import java.io.*;
import java_cup.runtime.ComplexSymbolFactory.Location;


%%
   
/* -----------------Options and Declarations Section----------------- */
   
/* The name of the class JFlex will create will be Lexer.*/
%class Lexer

/* The current line number can be accessed with the variable yyline
  and the current column number with the variable yycolumn.*/
%line
%column
    
/* CUP parser */
%cup
   
/* declaration of member variables and functions that are used inside
  scanner actions. */
%{   
    public Lexer(FileReader fr, ComplexSymbolFactory sf){
	      this(fr);
        symbolFactory = sf;
    }

    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    
    public Symbol symbol(int code){
	      return symbolFactory.newSymbol(Integer.toString(code), code, new Location(yyline+1,yycolumn+1-yylength()),new Location(yyline+1,yycolumn+1));
    }

    public Symbol symbol(int code, String lexem){
	      return symbolFactory.newSymbol(Integer.toString(code), code, new Location(yyline+1, yycolumn +1), new Location(yyline+1,yycolumn+yylength()), lexem);
    }


      
    /* create java_cup.runtime.Symbol with information 
       about the current token, with no value*/
       
  //  private Symbol symbol(int type) {
  //     return new ComplexSymbol(type, yyline, yycolumn, yytext());
  //  }
    
    /* create java_cup.runtime.Symbol with information 
       about the current token, with value*/

   // private Symbol symbol(int type, Object value) {
   //    return new Symbol(type, yyline, yycolumn, value);
   // }

    
    private void print_debug(String text) {
        if(Main.Debug){
            System.out.println(text);
        }  
    }
%}
   
%init{
    yybegin( DEFAULTPARSERSTATE );
%init}


/* Macro Declarations */
/* A line terminator is \r, \n , or \r\n. */

LineTerminator = \r|\n|\r\n
   
/* White space is a line terminator, space, tab, or line feed. */

WhiteSpace = {LineTerminator} | [\ \t]
num = [0-9]+("."[0-9]*)?    
id = [A-Za-z]([A-Za-z]|[0-9]|"_")*

%state DEFAULTPARSERSTATE COMMENTLINESTATE COMMENTBLOCKSTATE ERRORSTATE
   
%%
/* ------------------------Lexical Rules Section---------------------- */
   
/* regular expressions and actions */
   
   <DEFAULTPARSERSTATE> {
    /* Return the token NULL-STMT declared in the class sym that was found. */
    ";"                {  print_debug(";");return symbol(sym.SEMICOLON); }
    {LineTerminator}   { }
    {WhiteSpace}       { }   
   
    /* Print  the token found that was declared in the class sym and then return it. */

      "+"                { print_debug("+"); return symbol(sym.ADD);}
      "-"                { print_debug("-"); return symbol(sym.MINUS);}
      "*"                { print_debug("*"); return symbol(sym.MULTI);}
      "/"                { print_debug("/"); return symbol(sym.DIV);}
      "("                { print_debug("("); return symbol(sym.LPAREN);}
      ")"                { print_debug(")"); return symbol(sym.RPAREN);}
      "{"                { print_debug("{"); return symbol(sym.LCBRA);}
      "}"                { print_debug("}"); return symbol(sym.RCBRA);}
      "="                { print_debug("="); return symbol(sym.ASSIGN);}
      "!="               { print_debug("!="); return symbol(sym.NOTEQUAL);}
      "=="               { print_debug("=="); return symbol(sym.EQUAL);}
      ">"                { print_debug(">"); return symbol(sym.GREAT);}
      "<"                { print_debug("<"); return symbol(sym.LESS);}
      "<="               { print_debug("<="); return symbol(sym.LESSQ);}
      ">="               { print_debug(">="); return symbol(sym.GREATQ);}
      "while"            { print_debug("while"); return symbol(sym.WHILE);}
      "for"              { print_debug("for"); return symbol(sym.FOR);}
      "if"               { print_debug("if"); return symbol(sym.IF);}
      "else"             { print_debug("else"); return symbol(sym.ELSE);}
      "println"          { print_debug("println"); return symbol(sym.PRINT);}
      "mainclass"        { print_debug("mainclass"); return symbol(sym.MAINCLASS);}
      "public"           { print_debug("public"); return symbol(sym.PUBLIC);}
      "static"           { print_debug("static"); return symbol(sym.STATIC);}
      "void"             { print_debug("void"); return symbol(sym.VOID);}
      "main"             { print_debug("main"); return symbol(sym.MAIN);}
      "int"              { print_debug("int"); return symbol(sym.INT);}
      "float"            { print_debug("float"); return symbol(sym.FLOAT);}
      ","                { print_debug(","); return symbol(sym.COMMA);}
    
    {num}                { print_debug(yytext());return symbol(sym.NUM, yytext());}
    {id}                 { print_debug(yytext());return symbol(sym.ID, yytext());}


    "//"                 {yybegin (COMMENTLINESTATE);}
    "/*"                 {yybegin (COMMENTBLOCKSTATE);}

    .                    {yybegin (ERRORSTATE); return symbol(sym.error);}
   }


  <COMMENTLINESTATE> {
    {LineTerminator}   {yybegin( DEFAULTPARSERSTATE ); }
    .                  { }
  }
  <COMMENTBLOCKSTATE> {
    "*/"             {yybegin( DEFAULTPARSERSTATE ); }
    {LineTerminator}   { }


    .                { }
  }

  <ERRORSTATE> {
    ";"        {yybegin( DEFAULTPARSERSTATE ); return symbol(sym.SEMICOLON);}  
    .                { }
  }

    <<EOF>>              {return symbol(sym.EOF);}