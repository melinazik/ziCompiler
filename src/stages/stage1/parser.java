
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\056\000\002\002\004\000\002\003\015\000\002\004" +
    "\005\000\002\005\004\000\002\005\002\000\002\006\003" +
    "\000\002\006\003\000\002\006\003\000\002\006\003\000" +
    "\002\006\003\000\002\006\003\000\002\006\003\000\002" +
    "\006\007\000\002\014\005\000\002\015\003\000\002\015" +
    "\003\000\002\002\003\000\002\016\005\000\002\016\003" +
    "\000\002\007\004\000\002\017\005\000\002\030\003\000" +
    "\002\030\003\000\002\010\013\000\002\011\007\000\002" +
    "\012\010\000\002\013\004\000\002\013\002\000\002\024" +
    "\005\000\002\025\003\000\002\025\003\000\002\025\003" +
    "\000\002\025\003\000\002\025\003\000\002\025\003\000" +
    "\002\025\003\000\002\020\005\000\002\020\005\000\002" +
    "\020\003\000\002\026\005\000\002\026\005\000\002\026" +
    "\003\000\002\027\005\000\002\027\004\000\002\027\003" +
    "\000\002\027\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\140\000\004\005\004\001\002\000\004\036\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\017\010\001\002\000\004\006\011\001\002\000" +
    "\004\007\012\001\002\000\004\010\013\001\002\000\004" +
    "\011\014\001\002\000\004\015\015\001\002\000\004\016" +
    "\016\001\002\000\004\017\017\001\002\000\026\004\ufffd" +
    "\012\ufffd\013\ufffd\017\ufffd\020\ufffd\036\ufffd\037\ufffd\040" +
    "\ufffd\041\ufffd\042\ufffd\001\002\000\004\020\021\001\002" +
    "\000\004\002\000\001\002\000\026\004\023\012\024\013" +
    "\035\017\017\020\040\036\032\037\026\040\030\041\045" +
    "\042\042\001\002\000\030\004\ufff1\012\ufff1\013\ufff1\017" +
    "\ufff1\020\ufff1\036\ufff1\037\ufff1\040\ufff1\041\ufff1\042\ufff1" +
    "\043\ufff1\001\002\000\004\036\ufff3\001\002\000\030\004" +
    "\ufffb\012\ufffb\013\ufffb\017\ufffb\020\ufffb\036\ufffb\037\ufffb" +
    "\040\ufffb\041\ufffb\042\ufffb\043\ufffb\001\002\000\004\015" +
    "\137\001\002\000\026\004\ufffe\012\ufffe\013\ufffe\017\ufffe" +
    "\020\ufffe\036\ufffe\037\ufffe\040\ufffe\041\ufffe\042\ufffe\001" +
    "\002\000\004\015\116\001\002\000\030\004\ufffa\012\ufffa" +
    "\013\ufffa\017\ufffa\020\ufffa\036\ufffa\037\ufffa\040\ufffa\041" +
    "\ufffa\042\ufffa\043\ufffa\001\002\000\004\021\074\001\002" +
    "\000\030\004\ufffc\012\ufffc\013\ufffc\017\ufffc\020\ufffc\036" +
    "\ufffc\037\ufffc\040\ufffc\041\ufffc\042\ufffc\043\ufffc\001\002" +
    "\000\004\036\111\001\002\000\004\036\ufff2\001\002\000" +
    "\030\004\ufff9\012\ufff9\013\ufff9\017\ufff9\020\ufff9\036\ufff9" +
    "\037\ufff9\040\ufff9\041\ufff9\042\ufff9\043\ufff9\001\002\000" +
    "\030\004\ufff6\012\ufff6\013\ufff6\017\ufff6\020\ufff6\036\ufff6" +
    "\037\ufff6\040\ufff6\041\ufff6\042\ufff6\043\ufff6\001\002\000" +
    "\030\004\uffff\012\uffff\013\uffff\017\uffff\020\uffff\036\uffff" +
    "\037\uffff\040\uffff\041\uffff\042\uffff\043\uffff\001\002\000" +
    "\004\004\110\001\002\000\004\015\056\001\002\000\030" +
    "\004\ufff8\012\ufff8\013\ufff8\017\ufff8\020\ufff8\036\ufff8\037" +
    "\ufff8\040\ufff8\041\ufff8\042\ufff8\043\ufff8\001\002\000\030" +
    "\004\ufff7\012\ufff7\013\ufff7\017\ufff7\020\ufff7\036\ufff7\037" +
    "\ufff7\040\ufff7\041\ufff7\042\ufff7\043\ufff7\001\002\000\004" +
    "\015\046\001\002\000\002\001\002\000\004\004\050\001" +
    "\002\000\002\001\002\000\004\004\052\001\002\000\002" +
    "\001\002\000\004\016\054\001\002\000\024\004\023\012" +
    "\024\013\035\017\017\036\032\037\026\040\030\041\045" +
    "\042\042\001\002\000\030\004\uffea\012\uffea\013\uffea\017" +
    "\uffea\020\uffea\036\uffea\037\uffea\040\uffea\041\uffea\042\uffea" +
    "\043\uffea\001\002\000\012\015\067\031\061\035\057\036" +
    "\064\001\002\000\034\004\uffd4\016\uffd4\021\uffd4\022\uffd4" +
    "\023\uffd4\024\uffd4\025\uffd4\026\uffd4\027\uffd4\030\uffd4\031" +
    "\uffd4\032\uffd4\033\uffd4\001\002\000\034\004\uffdb\016\uffdb" +
    "\021\uffdb\022\uffdb\023\uffdb\024\uffdb\025\uffdb\026\uffdb\027" +
    "\uffdb\030\uffdb\031\uffdb\032\103\033\102\001\002\000\012" +
    "\015\067\031\061\035\057\036\100\001\002\000\034\004" +
    "\uffd8\016\uffd8\021\uffd8\022\uffd8\023\uffd8\024\uffd8\025\uffd8" +
    "\026\uffd8\027\uffd8\030\uffd8\031\uffd8\032\uffd8\033\uffd8\001" +
    "\002\000\030\004\uffeb\016\uffeb\021\uffeb\022\uffeb\023\uffeb" +
    "\024\uffeb\025\uffeb\026\uffeb\027\uffeb\030\076\031\077\001" +
    "\002\000\034\004\uffd5\016\uffd5\021\074\022\uffd5\023\uffd5" +
    "\024\uffd5\025\uffd5\026\uffd5\027\uffd5\030\uffd5\031\uffd5\032" +
    "\uffd5\033\uffd5\001\002\000\024\004\uffec\016\uffec\021\uffec" +
    "\022\uffec\023\uffec\024\uffec\025\uffec\026\uffec\027\uffec\001" +
    "\002\000\004\016\072\001\002\000\012\015\067\031\061" +
    "\035\057\036\064\001\002\000\004\016\071\001\002\000" +
    "\034\004\uffd7\016\uffd7\021\uffd7\022\uffd7\023\uffd7\024\uffd7" +
    "\025\uffd7\026\uffd7\027\uffd7\030\uffd7\031\uffd7\032\uffd7\033" +
    "\uffd7\001\002\000\004\004\073\001\002\000\030\004\ufff5" +
    "\012\ufff5\013\ufff5\017\ufff5\020\ufff5\036\ufff5\037\ufff5\040" +
    "\ufff5\041\ufff5\042\ufff5\043\ufff5\001\002\000\012\015\067" +
    "\031\061\035\057\036\064\001\002\000\024\004\uffed\016" +
    "\uffed\021\uffed\022\uffed\023\uffed\024\uffed\025\uffed\026\uffed" +
    "\027\uffed\001\002\000\012\015\067\031\061\035\057\036" +
    "\100\001\002\000\012\015\067\031\061\035\057\036\100" +
    "\001\002\000\034\004\uffd5\016\uffd5\021\uffd5\022\uffd5\023" +
    "\uffd5\024\uffd5\025\uffd5\026\uffd5\027\uffd5\030\uffd5\031\uffd5" +
    "\032\uffd5\033\uffd5\001\002\000\034\004\uffdc\016\uffdc\021" +
    "\uffdc\022\uffdc\023\uffdc\024\uffdc\025\uffdc\026\uffdc\027\uffdc" +
    "\030\uffdc\031\uffdc\032\103\033\102\001\002\000\012\015" +
    "\067\031\061\035\057\036\100\001\002\000\012\015\067" +
    "\031\061\035\057\036\100\001\002\000\034\004\uffda\016" +
    "\uffda\021\uffda\022\uffda\023\uffda\024\uffda\025\uffda\026\uffda" +
    "\027\uffda\030\uffda\031\uffda\032\uffda\033\uffda\001\002\000" +
    "\034\004\uffd9\016\uffd9\021\uffd9\022\uffd9\023\uffd9\024\uffd9" +
    "\025\uffd9\026\uffd9\027\uffd9\030\uffd9\031\uffd9\032\uffd9\033" +
    "\uffd9\001\002\000\034\004\uffdd\016\uffdd\021\uffdd\022\uffdd" +
    "\023\uffdd\024\uffdd\025\uffdd\026\uffdd\027\uffdd\030\uffdd\031" +
    "\uffdd\032\103\033\102\001\002\000\034\004\uffd6\016\uffd6" +
    "\021\uffd6\022\uffd6\023\uffd6\024\uffd6\025\uffd6\026\uffd6\027" +
    "\uffd6\030\uffd6\031\uffd6\032\uffd6\033\uffd6\001\002\000\030" +
    "\004\uffee\012\uffee\013\uffee\017\uffee\020\uffee\036\uffee\037" +
    "\uffee\040\uffee\041\uffee\042\uffee\043\uffee\001\002\000\006" +
    "\004\uffef\014\114\001\002\000\004\004\113\001\002\000" +
    "\030\004\ufff4\012\ufff4\013\ufff4\017\ufff4\020\ufff4\036\ufff4" +
    "\037\ufff4\040\ufff4\041\ufff4\042\ufff4\043\ufff4\001\002\000" +
    "\004\036\111\001\002\000\004\004\ufff0\001\002\000\012" +
    "\015\067\031\061\035\057\036\064\001\002\000\004\016" +
    "\132\001\002\000\020\021\130\022\127\023\124\024\123" +
    "\025\126\026\121\027\125\001\002\000\012\015\uffdf\031" +
    "\uffdf\035\uffdf\036\uffdf\001\002\000\012\015\067\031\061" +
    "\035\057\036\064\001\002\000\012\015\uffe2\031\uffe2\035" +
    "\uffe2\036\uffe2\001\002\000\012\015\uffe4\031\uffe4\035\uffe4" +
    "\036\uffe4\001\002\000\012\015\uffe0\031\uffe0\035\uffe0\036" +
    "\uffe0\001\002\000\012\015\uffe1\031\uffe1\035\uffe1\036\uffe1" +
    "\001\002\000\012\015\uffde\031\uffde\035\uffde\036\uffde\001" +
    "\002\000\012\015\uffe3\031\uffe3\035\uffe3\036\uffe3\001\002" +
    "\000\004\016\uffe5\001\002\000\024\004\023\012\024\013" +
    "\035\017\017\036\032\037\026\040\030\041\045\042\042" +
    "\001\002\000\030\004\uffe6\012\uffe6\013\uffe6\017\uffe6\020" +
    "\uffe6\036\uffe6\037\uffe6\040\uffe6\041\uffe6\042\uffe6\043\134" +
    "\001\002\000\024\004\023\012\024\013\035\017\017\036" +
    "\032\037\026\040\030\041\045\042\042\001\002\000\030" +
    "\004\uffe8\012\uffe8\013\uffe8\017\uffe8\020\uffe8\036\uffe8\037" +
    "\uffe8\040\uffe8\041\uffe8\042\uffe8\043\uffe8\001\002\000\030" +
    "\004\uffe7\012\uffe7\013\uffe7\017\uffe7\020\uffe7\036\uffe7\037" +
    "\uffe7\040\uffe7\041\uffe7\042\uffe7\043\uffe7\001\002\000\012" +
    "\015\067\031\061\035\057\036\064\001\002\000\004\016" +
    "\141\001\002\000\024\004\023\012\024\013\035\017\017" +
    "\036\032\037\026\040\030\041\045\042\042\001\002\000" +
    "\030\004\uffe9\012\uffe9\013\uffe9\017\uffe9\020\uffe9\036\uffe9" +
    "\037\uffe9\040\uffe9\041\uffe9\042\uffe9\043\uffe9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\140\000\004\003\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\017" +
    "\001\001\000\004\005\021\001\001\000\002\001\001\000" +
    "\002\001\001\000\026\002\036\004\042\006\026\007\032" +
    "\010\024\011\030\012\035\014\043\015\033\017\040\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\016\111\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\021\046\001\001\000\002\001\001\000\004" +
    "\023\050\001\001\000\002\001\001\000\004\021\052\001" +
    "\001\000\002\001\001\000\026\002\036\004\042\006\054" +
    "\007\032\010\024\011\030\012\035\014\043\015\033\017" +
    "\040\001\001\000\002\001\001\000\014\017\064\020\062" +
    "\026\057\027\061\030\065\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\027\106\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\017\064\020\062\026\057\027\061" +
    "\030\067\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\017\064\020\062" +
    "\026\057\027\061\030\074\001\001\000\002\001\001\000" +
    "\006\026\105\027\061\001\001\000\006\026\100\027\061" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\027" +
    "\104\001\001\000\004\027\103\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\016\114\001\001\000\002\001\001\000" +
    "\016\017\064\020\062\024\116\026\057\027\061\030\117" +
    "\001\001\000\002\001\001\000\004\025\121\001\001\000" +
    "\002\001\001\000\014\017\064\020\062\026\057\027\061" +
    "\030\130\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\026\002\036\004\042\006" +
    "\132\007\032\010\024\011\030\012\035\014\043\015\033" +
    "\017\040\001\001\000\004\013\134\001\001\000\026\002" +
    "\036\004\042\006\135\007\032\010\024\011\030\012\035" +
    "\014\043\015\033\017\040\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\017\064\020\062\024\137\026\057" +
    "\027\061\030\117\001\001\000\002\001\001\000\026\002" +
    "\036\004\042\006\141\007\032\010\024\011\030\012\035" +
    "\014\043\015\033\017\040\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    public void report_error(String message, Object info) {
   
        StringBuilder m = new StringBuilder("Error");
   
        if (info instanceof java_cup.runtime.Symbol) {

            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
   
            /* Check if the line number in the input is greater or
               equal to zero. */
            if (s.left >= 0) {                
                /* Add to the end of the StringBuilder error message
                   the line number of the error in the input. */
                m.append(" in line "+(s.left+1));   
                /* Check if the column number in the input is greater
                   or equal to zero. */
                if (s.right >= 0)                    
                    /* Add to the end of the StringBuilder error message
                       the column number of the error in the input. */
                    m.append(", column "+(s.right+1));
            }
        }
   
        /* Add to the end of the StringBuilder error message created in
           this method the message that was passed into this method. */
        m.append(" : "+message);
   
        System.err.println(m);
    }
   
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROGRAM EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROGRAM ::= MAINCLASS ID LCBRA PUBLIC STATIC VOID MAIN LPAREN RPAREN COMP_STMT RCBRA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROGRAM",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // COMP_STMT ::= LCBRA STMT_LIST RCBRA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("COMP_STMT",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // STMT_LIST ::= STMT_LIST STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT_LIST",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // STMT_LIST ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT_LIST",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // STMT ::= ASSIGN_STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // STMT ::= FOR_STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // STMT ::= WHILE_STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // STMT ::= IF_STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // STMT ::= COMP_STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // STMT ::= DECLARATION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // STMT ::= NULL_STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // STMT ::= PRINT LPAREN EXPR RPAREN SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DECLARATION ::= TYPE ID_LIST SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DECLARATION",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // TYPE ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TYPE",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // TYPE ::= FLOAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TYPE",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // NULL_STMT ::= SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NULL_STMT",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ID_LIST ::= ID COMMA ID_LIST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ID_LIST",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ID_LIST ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ID_LIST",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ASSIGN_STMT ::= ASSIGN_EXPR SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASSIGN_STMT",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ASSIGN_EXPR ::= ID ASSIGN EXPR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASSIGN_EXPR",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // EXPR ::= ASSIGN_EXPR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPR",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // EXPR ::= RVAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPR",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // FOR_STMT ::= FOR LPAREN OPASSIGN_EXPR SEMICOLON OPBOOL_EXPR SEMICOLON OPASSIGN_EXPR RPAREN STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FOR_STMT",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // WHILE_STMT ::= WHILE LPAREN BOOL_EXPR RPAREN STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("WHILE_STMT",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // IF_STMT ::= IF LPAREN BOOL_EXPR RPAREN STMT ELSE_PART 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IF_STMT",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // ELSE_PART ::= ELSE STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELSE_PART",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // ELSE_PART ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELSE_PART",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // BOOL_EXPR ::= EXPR C_OP EXPR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BOOL_EXPR",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // C_OP ::= EQUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C_OP",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // C_OP ::= ASSIGN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C_OP",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // C_OP ::= GREAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C_OP",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // C_OP ::= LESS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C_OP",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // C_OP ::= GREATQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C_OP",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // C_OP ::= LESSQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C_OP",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // C_OP ::= NOTEQUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C_OP",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // RVAL ::= RVAL ADD TERM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RVAL",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // RVAL ::= RVAL SUBSTRACT TERM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RVAL",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // RVAL ::= TERM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RVAL",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // TERM ::= TERM MULTI FACTOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERM",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // TERM ::= TERM DIV FACTOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERM",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // TERM ::= FACTOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERM",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // FACTOR ::= LPAREN EXPR RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // FACTOR ::= SUBSTRACT FACTOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // FACTOR ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // FACTOR ::= NUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}