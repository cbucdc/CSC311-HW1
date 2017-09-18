/* The following code was generated by JFlex 1.6.1 */

/* The lexer for scanning HTML source. */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>in-class1.flex</tt>
 */
class HTMLScanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\4\1\4\1\4\1\4\23\0\1\2\1\0\1\17\2\0"+
    "\1\16\1\0\1\13\1\15\1\0\1\27\1\0\1\3\1\10\1\12"+
    "\1\37\1\40\1\33\1\30\1\32\1\34\1\36\1\14\1\31\1\35"+
    "\1\24\1\20\1\1\1\0\1\5\1\0\1\7\32\11\4\0\1\6"+
    "\1\0\7\11\1\21\7\11\1\23\3\11\1\22\2\11\1\25\3\11"+
    "\12\0\1\4\44\0\1\26\12\0\1\26\4\0\1\26\5\0\27\26"+
    "\1\0\37\26\1\0\u01ca\26\4\0\14\26\16\0\5\26\7\0\1\26"+
    "\1\0\1\26\21\0\165\26\1\0\2\26\2\0\4\26\1\0\1\26"+
    "\6\0\1\26\1\0\3\26\1\0\1\26\1\0\24\26\1\0\123\26"+
    "\1\0\213\26\1\0\255\26\1\0\46\26\2\0\1\26\7\0\47\26"+
    "\11\0\55\26\1\0\1\26\1\0\2\26\1\0\2\26\1\0\1\26"+
    "\10\0\33\26\5\0\3\26\35\0\13\26\5\0\112\26\4\0\146\26"+
    "\1\0\10\26\2\0\12\26\1\0\23\26\2\0\1\26\20\0\73\26"+
    "\2\0\145\26\16\0\66\26\4\0\1\26\5\0\56\26\22\0\34\26"+
    "\104\0\23\26\61\0\200\26\2\0\12\26\1\0\23\26\1\0\10\26"+
    "\2\0\2\26\2\0\26\26\1\0\7\26\1\0\1\26\3\0\4\26"+
    "\2\0\11\26\2\0\2\26\2\0\4\26\10\0\1\26\4\0\2\26"+
    "\1\0\5\26\2\0\14\26\17\0\3\26\1\0\6\26\4\0\2\26"+
    "\2\0\26\26\1\0\7\26\1\0\2\26\1\0\2\26\1\0\2\26"+
    "\2\0\1\26\1\0\5\26\4\0\2\26\2\0\3\26\3\0\1\26"+
    "\7\0\4\26\1\0\1\26\7\0\20\26\13\0\3\26\1\0\11\26"+
    "\1\0\3\26\1\0\26\26\1\0\7\26\1\0\2\26\1\0\5\26"+
    "\2\0\12\26\1\0\3\26\1\0\3\26\2\0\1\26\17\0\4\26"+
    "\2\0\12\26\21\0\3\26\1\0\10\26\2\0\2\26\2\0\26\26"+
    "\1\0\7\26\1\0\2\26\1\0\5\26\2\0\11\26\2\0\2\26"+
    "\2\0\3\26\10\0\2\26\4\0\2\26\1\0\5\26\2\0\12\26"+
    "\1\0\1\26\20\0\2\26\1\0\6\26\3\0\3\26\1\0\4\26"+
    "\3\0\2\26\1\0\1\26\1\0\2\26\3\0\2\26\3\0\3\26"+
    "\3\0\14\26\4\0\5\26\3\0\3\26\1\0\4\26\2\0\1\26"+
    "\6\0\1\26\16\0\12\26\20\0\4\26\1\0\10\26\1\0\3\26"+
    "\1\0\27\26\1\0\20\26\3\0\10\26\1\0\3\26\1\0\4\26"+
    "\7\0\2\26\1\0\2\26\6\0\4\26\2\0\12\26\21\0\3\26"+
    "\1\0\10\26\1\0\3\26\1\0\27\26\1\0\12\26\1\0\5\26"+
    "\2\0\11\26\1\0\3\26\1\0\4\26\7\0\2\26\7\0\1\26"+
    "\1\0\4\26\2\0\12\26\1\0\2\26\16\0\3\26\1\0\10\26"+
    "\1\0\3\26\1\0\51\26\2\0\10\26\1\0\3\26\1\0\5\26"+
    "\10\0\1\26\10\0\4\26\2\0\12\26\12\0\6\26\2\0\2\26"+
    "\1\0\22\26\3\0\30\26\1\0\11\26\1\0\1\26\2\0\7\26"+
    "\3\0\1\26\4\0\6\26\1\0\1\26\1\0\10\26\6\0\12\26"+
    "\2\0\2\26\15\0\72\26\5\0\17\26\1\0\12\26\47\0\2\26"+
    "\1\0\1\26\2\0\2\26\1\0\1\26\2\0\1\26\6\0\4\26"+
    "\1\0\7\26\1\0\3\26\1\0\1\26\1\0\1\26\2\0\2\26"+
    "\1\0\15\26\1\0\3\26\2\0\5\26\1\0\1\26\1\0\6\26"+
    "\2\0\12\26\2\0\4\26\40\0\1\26\27\0\2\26\6\0\12\26"+
    "\13\0\1\26\1\0\1\26\1\0\1\26\4\0\12\26\1\0\44\26"+
    "\4\0\24\26\1\0\22\26\1\0\44\26\11\0\1\26\71\0\112\26"+
    "\6\0\116\26\2\0\46\26\1\0\1\26\5\0\1\26\2\0\53\26"+
    "\1\0\u014d\26\1\0\4\26\2\0\7\26\1\0\1\26\1\0\4\26"+
    "\2\0\51\26\1\0\4\26\2\0\41\26\1\0\4\26\2\0\7\26"+
    "\1\0\1\26\1\0\4\26\2\0\17\26\1\0\71\26\1\0\4\26"+
    "\2\0\103\26\2\0\3\26\40\0\20\26\20\0\125\26\14\0\u026c\26"+
    "\2\0\21\26\1\0\32\26\5\0\113\26\3\0\13\26\7\0\15\26"+
    "\1\0\7\26\13\0\25\26\13\0\24\26\14\0\15\26\1\0\3\26"+
    "\1\0\2\26\14\0\124\26\3\0\1\26\4\0\2\26\2\0\12\26"+
    "\41\0\3\26\2\0\12\26\6\0\130\26\10\0\53\26\5\0\106\26"+
    "\12\0\37\26\1\0\14\26\4\0\14\26\12\0\50\26\2\0\5\26"+
    "\13\0\54\26\4\0\32\26\6\0\12\26\46\0\34\26\4\0\77\26"+
    "\1\0\35\26\2\0\13\26\6\0\12\26\15\0\1\26\10\0\17\26"+
    "\101\0\114\26\4\0\12\26\21\0\11\26\14\0\164\26\14\0\70\26"+
    "\10\0\12\26\3\0\61\26\122\0\3\26\1\0\43\26\1\0\2\26"+
    "\6\0\366\26\6\0\u011a\26\2\0\6\26\2\0\46\26\2\0\6\26"+
    "\2\0\10\26\1\0\1\26\1\0\1\26\1\0\1\26\1\0\37\26"+
    "\2\0\65\26\1\0\7\26\1\0\1\26\3\0\3\26\1\0\7\26"+
    "\3\0\4\26\2\0\6\26\4\0\15\26\5\0\3\26\1\0\7\26"+
    "\53\0\1\4\1\4\25\0\2\26\23\0\1\26\34\0\1\26\15\0"+
    "\1\26\20\0\15\26\63\0\41\26\21\0\1\26\4\0\1\26\2\0"+
    "\12\26\1\0\1\26\3\0\5\26\6\0\1\26\1\0\1\26\1\0"+
    "\1\26\1\0\4\26\1\0\13\26\2\0\4\26\5\0\5\26\4\0"+
    "\1\26\21\0\51\26\u032d\0\64\26\u0716\0\57\26\1\0\57\26\1\0"+
    "\205\26\6\0\11\26\14\0\46\26\1\0\1\26\5\0\1\26\2\0"+
    "\70\26\7\0\1\26\17\0\30\26\11\0\7\26\1\0\7\26\1\0"+
    "\7\26\1\0\7\26\1\0\7\26\1\0\7\26\1\0\7\26\1\0"+
    "\7\26\1\0\40\26\57\0\1\26\u01d5\0\3\26\31\0\17\26\1\0"+
    "\5\26\2\0\5\26\4\0\126\26\2\0\2\26\2\0\3\26\1\0"+
    "\132\26\1\0\4\26\5\0\51\26\3\0\136\26\21\0\33\26\65\0"+
    "\20\26\u0200\0\u19b6\26\112\0\u51cd\26\63\0\u048d\26\103\0\56\26\2\0"+
    "\u010d\26\3\0\34\26\24\0\63\26\1\0\12\26\1\0\37\26\1\0"+
    "\123\26\45\0\11\26\2\0\147\26\2\0\4\26\1\0\36\26\2\0"+
    "\2\26\105\0\61\26\30\0\64\26\14\0\105\26\13\0\12\26\6\0"+
    "\30\26\3\0\1\26\4\0\56\26\2\0\44\26\14\0\35\26\3\0"+
    "\101\26\16\0\13\26\6\0\37\26\1\0\67\26\11\0\16\26\2\0"+
    "\12\26\6\0\27\26\3\0\111\26\30\0\3\26\2\0\20\26\2\0"+
    "\5\26\12\0\6\26\2\0\6\26\2\0\6\26\11\0\7\26\1\0"+
    "\7\26\1\0\53\26\1\0\4\26\4\0\2\26\132\0\53\26\1\0"+
    "\2\26\2\0\12\26\6\0\u2ba4\26\14\0\27\26\4\0\61\26\u2104\0"+
    "\u016e\26\2\0\152\26\46\0\7\26\14\0\5\26\5\0\14\26\1\0"+
    "\15\26\1\0\5\26\1\0\1\26\1\0\2\26\1\0\2\26\1\0"+
    "\154\26\41\0\u016b\26\22\0\100\26\2\0\66\26\50\0\14\26\4\0"+
    "\20\26\20\0\16\26\5\0\2\26\30\0\3\26\40\0\5\26\1\0"+
    "\207\26\23\0\12\26\7\0\32\26\4\0\1\26\1\0\32\26\13\0"+
    "\131\26\3\0\6\26\2\0\6\26\2\0\6\26\2\0\3\26\43\0"+
    "\14\26\1\0\32\26\1\0\23\26\1\0\2\26\1\0\17\26\2\0"+
    "\16\26\42\0\173\26\105\0\65\26\210\0\1\26\202\0\35\26\3\0"+
    "\61\26\17\0\1\26\37\0\40\26\20\0\33\26\5\0\53\26\5\0"+
    "\36\26\2\0\44\26\4\0\10\26\1\0\5\26\52\0\236\26\2\0"+
    "\12\26\126\0\50\26\10\0\64\26\234\0\u0137\26\11\0\26\26\12\0"+
    "\10\26\230\0\6\26\2\0\1\26\1\0\54\26\1\0\2\26\3\0"+
    "\1\26\2\0\27\26\12\0\27\26\11\0\37\26\141\0\26\26\12\0"+
    "\32\26\106\0\70\26\6\0\2\26\100\0\4\26\1\0\2\26\5\0"+
    "\10\26\1\0\3\26\1\0\33\26\4\0\3\26\4\0\1\26\40\0"+
    "\35\26\3\0\35\26\43\0\10\26\1\0\36\26\31\0\66\26\12\0"+
    "\26\26\12\0\23\26\15\0\22\26\156\0\111\26\u03b7\0\107\26\37\0"+
    "\12\26\17\0\74\26\25\0\31\26\7\0\12\26\6\0\65\26\1\0"+
    "\12\26\20\0\44\26\2\0\1\26\11\0\105\26\13\0\13\26\45\0"+
    "\22\26\1\0\45\26\170\0\73\26\5\0\12\26\7\0\3\26\1\0"+
    "\10\26\2\0\2\26\2\0\26\26\1\0\7\26\1\0\2\26\1\0"+
    "\5\26\2\0\11\26\2\0\2\26\2\0\3\26\11\0\1\26\5\0"+
    "\7\26\2\0\7\26\3\0\5\26\u010b\0\106\26\1\0\1\26\10\0"+
    "\12\26\246\0\66\26\2\0\11\26\77\0\101\26\3\0\1\26\13\0"+
    "\12\26\46\0\70\26\10\0\12\26\u01d6\0\112\26\25\0\1\26\u01c0\0"+
    "\71\26\u0507\0\u0399\26\147\0\157\26\u0b91\0\u042f\26\u33d1\0\u0239\26\7\0"+
    "\37\26\1\0\12\26\146\0\36\26\2\0\5\26\13\0\67\26\11\0"+
    "\4\26\14\0\12\26\11\0\25\26\5\0\23\26\u0370\0\105\26\13\0"+
    "\57\26\20\0\21\26\u4060\0\2\26\u0bfe\0\153\26\5\0\15\26\3\0"+
    "\11\26\7\0\12\26\3\0\2\26\u14c6\0\5\26\3\0\6\26\10\0"+
    "\10\26\2\0\7\26\36\0\4\26\224\0\3\26\u01bb\0\125\26\1\0"+
    "\107\26\1\0\2\26\2\0\1\26\2\0\2\26\2\0\4\26\1\0"+
    "\14\26\1\0\1\26\1\0\7\26\1\0\101\26\1\0\4\26\2\0"+
    "\10\26\1\0\7\26\1\0\34\26\1\0\4\26\1\0\5\26\1\0"+
    "\1\26\3\0\7\26\1\0\u0154\26\2\0\31\26\1\0\31\26\1\0"+
    "\37\26\1\0\31\26\1\0\37\26\1\0\31\26\1\0\37\26\1\0"+
    "\31\26\1\0\37\26\1\0\31\26\1\0\10\26\2\0\62\26\u1000\0"+
    "\305\26\13\0\7\26\u0529\0\4\26\1\0\33\26\1\0\2\26\1\0"+
    "\1\26\2\0\1\26\1\0\12\26\1\0\4\26\1\0\1\26\1\0"+
    "\1\26\6\0\1\26\4\0\1\26\1\0\1\26\1\0\1\26\1\0"+
    "\3\26\1\0\2\26\1\0\1\26\2\0\1\26\1\0\1\26\1\0"+
    "\1\26\1\0\1\26\1\0\1\26\1\0\2\26\1\0\1\26\2\0"+
    "\4\26\1\0\7\26\1\0\4\26\1\0\4\26\1\0\1\26\1\0"+
    "\12\26\1\0\21\26\5\0\3\26\1\0\5\26\1\0\21\26\u0274\0"+
    "\32\26\6\0\32\26\6\0\32\26\u0e76\0\ua6d7\26\51\0\u1035\26\13\0"+
    "\336\26\u3fe2\0\u021e\26\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
    "\360\26\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\5\1\1\2\3\1\3\0\1\2\12\0\1\3"+
    "\1\0\1\2\13\0\1\4\1\0\1\4\20\0\1\5"+
    "\1\4\1\0\3\4\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\5\0\1\5\1\4\1\0"+
    "\1\4\12\0\1\3\2\0\1\17\3\0\2\17\3\0"+
    "\3\17\1\0\22\17\1\0\5\17\1\0\3\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\102\0\143\0\204\0\245\0\306\0\347"+
    "\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c\0\u01ad\0\204\0\u01ce"+
    "\0\u01ef\0\u0210\0\u0231\0\143\0\u0252\0\u0273\0\u0294\0\u02b5"+
    "\0\u02d6\0\u02f7\0\u0318\0\u0339\0\u035a\0\u037b\0\u039c\0\u03bd"+
    "\0\u03de\0\u03ff\0\u0420\0\u0441\0\u0462\0\u0483\0\u04a4\0\u04c5"+
    "\0\u04e6\0\u0507\0\u0528\0\u0549\0\u056a\0\u058b\0\u05ac\0\u05cd"+
    "\0\u05ee\0\u060f\0\u0630\0\u0651\0\u0672\0\u0693\0\u06b4\0\u06d5"+
    "\0\u06f6\0\u0717\0\u0738\0\245\0\u0759\0\u077a\0\u079b\0\u0507"+
    "\0\u0528\0\u0549\0\u056a\0\u058b\0\u05ac\0\u05cd\0\u05ee\0\u060f"+
    "\0\u07bc\0\u07dd\0\u07fe\0\u081f\0\u0840\0\u0861\0\u0882\0\u08a3"+
    "\0\u08c4\0\u08e5\0\u0906\0\u0927\0\u0948\0\u0969\0\u098a\0\u09ab"+
    "\0\u09cc\0\u09ed\0\u0a0e\0\u06f6\0\u0a2f\0\u0a50\0\u0a71\0\u0a92"+
    "\0\u0ab3\0\u0ad4\0\u0af5\0\u0b16\0\u0b37\0\u0b58\0\u0b79\0\u0b9a"+
    "\0\u0bbb\0\u0bdc\0\u0bfd\0\u0c1e\0\u0c3f\0\u0c60\0\u0c81\0\u0ca2"+
    "\0\u0cc3\0\u0ce4\0\u0d05\0\u0d26\0\u0d47\0\u0d68\0\u0d89\0\u0daa"+
    "\0\u0dcb\0\u0dec\0\u0e0d\0\u0e2e\0\u0e4f\0\u0e70\0\u0e91\0\u0eb2"+
    "\0\u0ed3\0\u0ef4\0\u0f15\0\u0f36\0\u0f57\0\u0f78\0\u0f99";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\2\2\1\5\2\2\1\5"+
    "\1\2\1\6\1\7\1\2\1\10\2\2\1\11\2\5"+
    "\1\2\1\12\1\2\1\4\11\7\43\0\1\13\3\0"+
    "\1\14\2\0\1\14\1\15\1\0\1\14\4\0\3\14"+
    "\1\0\1\14\2\0\11\14\14\0\1\16\13\0\11\16"+
    "\6\0\1\17\1\20\1\0\1\17\2\0\1\17\4\0"+
    "\3\17\1\0\1\17\2\0\11\17\14\0\1\21\13\0"+
    "\11\21\3\0\1\22\2\0\1\17\1\20\1\0\1\17"+
    "\2\0\1\7\1\23\3\0\3\17\1\0\1\17\1\0"+
    "\1\24\11\7\17\0\1\25\27\0\1\17\1\20\1\0"+
    "\1\17\2\0\1\17\4\0\1\17\1\26\1\17\1\0"+
    "\1\17\2\0\11\17\6\0\1\17\1\20\1\0\1\17"+
    "\2\0\1\17\4\0\3\17\1\0\1\27\2\0\11\17"+
    "\3\0\1\30\42\0\1\31\1\14\2\0\1\14\2\0"+
    "\1\14\4\0\3\14\1\0\1\14\2\0\11\14\6\0"+
    "\1\14\2\0\1\14\2\0\1\14\4\0\3\14\1\0"+
    "\1\14\2\0\11\14\3\0\1\24\10\0\1\16\12\0"+
    "\1\24\11\16\6\0\1\32\2\0\1\32\2\0\1\32"+
    "\4\0\3\32\1\0\1\32\2\0\11\32\3\0\1\23"+
    "\10\0\1\21\1\23\12\0\11\21\3\0\1\23\10\0"+
    "\1\33\1\23\12\0\11\33\3\0\1\23\10\0\1\34"+
    "\1\23\12\0\11\34\30\0\1\35\1\0\1\36\1\0"+
    "\1\37\1\0\1\40\10\0\1\17\1\20\1\0\1\17"+
    "\2\0\1\17\4\0\1\17\1\41\1\17\1\0\1\17"+
    "\2\0\11\17\6\0\1\17\1\20\1\0\1\17\2\0"+
    "\1\17\4\0\3\17\1\0\1\42\2\0\11\17\3\0"+
    "\1\43\36\0\1\44\45\0\1\32\1\0\1\45\1\32"+
    "\2\0\1\32\4\0\3\32\1\0\1\32\2\0\11\32"+
    "\3\0\1\46\10\0\1\47\12\0\1\24\11\47\3\0"+
    "\1\50\10\0\1\51\13\0\11\51\31\0\1\52\42\0"+
    "\1\53\1\54\35\0\1\55\3\0\1\56\33\0\1\57"+
    "\2\0\1\60\3\0\1\61\1\62\6\0\1\17\1\20"+
    "\1\0\1\17\2\0\1\17\4\0\2\17\1\63\1\0"+
    "\1\17\2\0\11\17\6\0\1\64\1\20\1\65\1\64"+
    "\2\0\1\64\4\0\1\66\2\64\1\0\1\67\1\70"+
    "\1\0\11\64\3\0\1\71\43\0\1\14\2\0\1\14"+
    "\1\15\1\0\1\14\4\0\3\14\1\0\1\14\2\0"+
    "\11\14\11\0\1\72\7\0\3\72\1\0\1\72\27\0"+
    "\1\73\13\0\11\73\3\0\1\46\7\0\1\74\1\75"+
    "\12\0\1\24\11\75\14\0\1\76\13\0\11\76\3\0"+
    "\1\50\7\0\1\74\1\77\13\0\11\77\20\0\1\100"+
    "\40\0\1\101\40\0\1\102\40\0\1\103\40\0\1\104"+
    "\40\0\1\105\40\0\1\106\40\0\1\107\40\0\1\110"+
    "\26\0\1\17\1\20\1\0\1\17\2\0\1\17\4\0"+
    "\3\17\1\111\1\17\2\0\11\17\6\0\1\64\1\20"+
    "\1\112\1\64\2\0\1\64\4\0\3\64\1\0\1\64"+
    "\1\70\1\0\11\64\6\0\1\70\2\0\1\70\2\0"+
    "\1\70\4\0\3\70\1\0\2\70\1\0\11\70\6\0"+
    "\1\64\1\20\1\112\1\64\2\0\1\64\4\0\1\64"+
    "\1\113\1\64\1\0\1\64\1\70\1\0\11\64\6\0"+
    "\1\64\1\20\1\112\1\64\2\0\1\64\4\0\3\64"+
    "\1\0\1\114\1\70\1\0\11\64\6\0\1\70\1\0"+
    "\1\112\1\70\2\0\1\70\4\0\3\70\1\0\2\70"+
    "\1\0\11\70\3\71\1\115\1\0\34\71\6\0\1\17"+
    "\2\0\1\116\2\0\1\17\4\0\3\116\1\0\1\116"+
    "\2\0\11\17\3\0\1\24\7\0\1\74\1\117\12\0"+
    "\1\24\11\117\3\0\1\120\7\0\1\74\1\75\1\23"+
    "\11\0\1\24\11\75\13\0\1\74\1\121\13\0\11\121"+
    "\3\0\1\122\7\0\1\74\1\77\1\23\12\0\11\77"+
    "\12\0\1\123\34\0\1\124\2\0\1\124\2\0\1\124"+
    "\4\0\3\124\1\0\2\124\1\0\11\124\6\0\1\64"+
    "\1\20\1\112\1\64\2\0\1\64\4\0\1\64\1\125"+
    "\1\64\1\0\1\64\1\70\1\0\11\64\6\0\1\64"+
    "\1\20\1\112\1\64\2\0\1\64\4\0\3\64\1\0"+
    "\1\126\1\70\1\0\11\64\3\71\1\127\1\0\34\71"+
    "\6\0\1\17\1\20\1\0\1\116\2\0\1\17\4\0"+
    "\3\116\1\0\1\116\2\0\11\17\3\0\1\22\7\0"+
    "\1\74\1\117\1\23\11\0\1\24\11\117\3\0\1\23"+
    "\10\0\1\47\1\23\12\0\11\47\3\0\1\23\7\0"+
    "\1\74\1\121\1\23\12\0\11\121\3\0\1\23\10\0"+
    "\1\51\1\23\12\0\11\51\12\0\1\130\34\0\1\124"+
    "\1\0\1\131\1\124\2\0\1\124\4\0\3\124\1\0"+
    "\2\124\1\0\11\124\6\0\1\64\1\20\1\112\1\64"+
    "\2\0\1\64\4\0\2\64\1\132\1\0\1\64\1\70"+
    "\1\0\11\64\6\0\1\64\1\20\1\133\1\64\2\0"+
    "\1\64\4\0\1\66\2\64\1\0\1\67\1\70\1\0"+
    "\11\64\3\71\1\127\1\0\1\134\33\71\6\0\1\70"+
    "\1\0\1\65\1\70\2\0\1\70\4\0\1\135\2\70"+
    "\1\0\1\136\1\70\1\0\11\70\6\0\1\137\2\0"+
    "\1\137\2\0\1\137\4\0\3\137\1\0\2\137\1\0"+
    "\11\137\6\0\1\64\1\20\1\112\1\64\2\0\1\64"+
    "\4\0\3\64\1\111\1\64\1\70\1\0\11\64\6\0"+
    "\1\140\2\0\1\140\2\0\1\140\4\0\3\140\1\0"+
    "\2\140\1\0\11\140\6\0\1\70\1\0\1\112\1\70"+
    "\2\0\1\70\4\0\1\70\1\141\1\70\1\0\2\70"+
    "\1\0\11\70\6\0\1\70\1\0\1\112\1\70\2\0"+
    "\1\70\4\0\3\70\1\0\1\142\1\70\1\0\11\70"+
    "\6\0\1\137\2\0\1\137\2\0\1\137\4\0\1\143"+
    "\2\137\1\0\1\144\1\137\1\0\11\137\6\0\1\140"+
    "\1\0\1\145\1\140\2\0\1\140\4\0\3\140\1\0"+
    "\2\140\1\0\11\140\6\0\1\70\1\0\1\112\1\70"+
    "\2\0\1\70\4\0\1\70\1\146\1\70\1\0\2\70"+
    "\1\0\11\70\6\0\1\70\1\0\1\112\1\70\2\0"+
    "\1\70\4\0\3\70\1\0\1\147\1\70\1\0\11\70"+
    "\6\0\1\137\2\0\1\137\2\0\1\137\4\0\1\143"+
    "\1\150\1\137\1\0\1\144\1\137\1\0\11\137\6\0"+
    "\1\137\2\0\1\137\2\0\1\137\4\0\1\143\2\137"+
    "\1\0\1\151\1\137\1\0\11\137\6\0\1\152\2\0"+
    "\1\152\2\0\1\152\4\0\3\152\1\0\2\152\1\0"+
    "\11\152\6\0\1\70\1\0\1\112\1\70\2\0\1\70"+
    "\4\0\2\70\1\153\1\0\2\70\1\0\11\70\6\0"+
    "\1\70\1\0\1\133\1\70\2\0\1\70\4\0\1\135"+
    "\2\70\1\0\1\136\1\70\1\0\11\70\6\0\1\137"+
    "\2\0\1\137\2\0\1\137\4\0\1\143\1\154\1\137"+
    "\1\0\1\144\1\137\1\0\11\137\6\0\1\137\2\0"+
    "\1\137\2\0\1\137\4\0\1\143\2\137\1\0\1\155"+
    "\1\137\1\0\11\137\6\0\1\152\1\0\1\131\1\152"+
    "\2\0\1\152\4\0\1\156\2\152\1\0\1\157\1\152"+
    "\1\0\11\152\6\0\1\70\1\0\1\112\1\70\2\0"+
    "\1\70\4\0\3\70\1\111\2\70\1\0\11\70\6\0"+
    "\1\137\2\0\1\137\2\0\1\137\4\0\1\143\1\137"+
    "\1\160\1\0\1\144\1\137\1\0\11\137\6\0\1\161"+
    "\1\0\1\65\1\161\2\0\1\161\4\0\1\162\2\161"+
    "\1\0\1\163\1\161\1\0\11\161\6\0\1\152\1\0"+
    "\1\131\1\152\2\0\1\152\4\0\1\156\1\164\1\152"+
    "\1\0\1\157\1\152\1\0\11\152\6\0\1\152\1\0"+
    "\1\131\1\152\2\0\1\152\4\0\1\156\2\152\1\0"+
    "\1\165\1\152\1\0\11\152\6\0\1\137\2\0\1\137"+
    "\2\0\1\137\4\0\1\143\2\137\1\111\1\144\1\137"+
    "\1\0\11\137\6\0\1\161\1\0\1\112\1\161\2\0"+
    "\1\161\4\0\1\162\2\161\1\0\1\166\1\161\1\0"+
    "\11\161\6\0\1\161\1\0\1\112\1\161\2\0\1\161"+
    "\4\0\1\162\1\167\1\161\1\0\1\166\1\161\1\0"+
    "\11\161\6\0\1\161\1\0\1\133\1\161\2\0\1\161"+
    "\4\0\1\162\2\161\1\0\1\163\1\161\1\0\11\161"+
    "\6\0\1\152\1\0\1\131\1\152\2\0\1\152\4\0"+
    "\1\156\1\170\1\152\1\0\1\157\1\152\1\0\11\152"+
    "\6\0\1\152\1\0\1\131\1\152\2\0\1\152\4\0"+
    "\1\156\2\152\1\0\1\171\1\152\1\0\11\152\6\0"+
    "\1\161\1\0\1\112\1\161\2\0\1\161\4\0\1\162"+
    "\2\161\1\0\1\172\1\161\1\0\11\161\6\0\1\161"+
    "\1\0\1\112\1\161\2\0\1\161\4\0\1\162\1\173"+
    "\1\161\1\0\1\166\1\161\1\0\11\161\6\0\1\152"+
    "\1\0\1\131\1\152\2\0\1\152\4\0\1\156\1\152"+
    "\1\174\1\0\1\157\1\152\1\0\11\152\6\0\1\175"+
    "\1\0\1\176\1\175\2\0\1\175\4\0\1\177\2\175"+
    "\1\0\1\200\1\175\1\0\11\175\6\0\1\161\1\0"+
    "\1\112\1\161\2\0\1\161\4\0\1\162\2\161\1\0"+
    "\1\163\1\161\1\0\11\161\6\0\1\161\1\0\1\112"+
    "\1\161\2\0\1\161\4\0\1\162\1\161\1\201\1\0"+
    "\1\166\1\161\1\0\11\161\6\0\1\152\1\0\1\131"+
    "\1\152\2\0\1\152\4\0\1\156\2\152\1\111\1\157"+
    "\1\152\1\0\11\152\6\0\1\175\1\0\1\145\1\175"+
    "\2\0\1\175\4\0\1\177\2\175\1\0\1\202\1\175"+
    "\1\0\11\175\6\0\1\161\2\0\1\161\2\0\1\161"+
    "\4\0\3\161\1\0\2\161\1\0\11\161\6\0\1\175"+
    "\1\0\1\145\1\175\2\0\1\175\4\0\1\177\1\203"+
    "\1\175\1\0\1\202\1\175\1\0\11\175\6\0\1\175"+
    "\1\0\1\204\1\175\2\0\1\175\4\0\1\177\2\175"+
    "\1\0\1\200\1\175\1\0\11\175\6\0\1\161\1\0"+
    "\1\112\1\161\2\0\1\161\4\0\1\162\2\161\1\111"+
    "\1\166\1\161\1\0\11\161\6\0\1\175\1\0\1\145"+
    "\1\175\2\0\1\175\4\0\1\177\2\175\1\0\1\205"+
    "\1\175\1\0\11\175\6\0\1\175\1\0\1\145\1\175"+
    "\2\0\1\175\4\0\1\177\1\206\1\175\1\0\1\202"+
    "\1\175\1\0\11\175\6\0\1\175\2\0\1\175\2\0"+
    "\1\175\4\0\3\175\1\0\2\175\1\0\11\175\6\0"+
    "\1\175\1\0\1\145\1\175\2\0\1\175\4\0\1\177"+
    "\2\175\1\0\1\200\1\175\1\0\11\175\6\0\1\175"+
    "\1\0\1\145\1\175\2\0\1\175\4\0\1\177\1\175"+
    "\1\207\1\0\1\202\1\175\1\0\11\175\6\0\1\175"+
    "\1\0\1\145\1\175\2\0\1\175\4\0\1\177\2\175"+
    "\1\111\1\202\1\175\1\0\11\175";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4026];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\10\1\3\0\1\1\12\0\1\1\1\0"+
    "\1\1\13\0\1\1\1\0\1\1\20\0\2\1\1\0"+
    "\14\1\5\0\2\1\1\0\1\1\12\0\1\1\2\0"+
    "\1\1\3\0\2\1\3\0\3\1\1\0\22\1\1\0"+
    "\5\1\1\0\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  HTMLScanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2638) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print(yytext());
            }
          case 16: break;
          case 2: 
            { System.out.println("SIGNED_NUM:" + yytext() + "\n");
            }
          case 17: break;
          case 3: 
            { System.out.print("");
            }
          case 18: break;
          case 4: 
            { System.out.println("PHONE:" + yytext() + "\n");
            }
          case 19: break;
          case 5: 
            { System.out.println("EMAIL:" + yytext() + "\n");
            }
          case 20: break;
          case 6: 
            { System.out.print("&");
            }
          case 21: break;
          case 7: 
            { System.out.print("*");
            }
          case 22: break;
          case 8: 
            { System.out.print("-");
            }
          case 23: break;
          case 9: 
            { System.out.print(":");
            }
          case 24: break;
          case 10: 
            { System.out.print(";");
            }
          case 25: break;
          case 11: 
            { System.out.print("?");
            }
          case 26: break;
          case 12: 
            { System.out.print(">");
            }
          case 27: break;
          case 13: 
            { System.out.print("<");
            }
          case 28: break;
          case 14: 
            { System.out.print("=");
            }
          case 29: break;
          case 15: 
            { System.out.println("HIDDEN_LINK:" + yytext() + "\n");
            }
          case 30: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java HTMLScanner [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        HTMLScanner scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new HTMLScanner(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
