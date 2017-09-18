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
    "\11\0\1\13\1\4\1\4\1\4\1\4\22\0\1\13\1\2\1\0"+
    "\1\32\2\0\1\31\1\0\1\14\1\16\1\0\1\25\1\0\1\3"+
    "\1\10\1\12\1\43\1\44\1\37\1\33\1\36\1\40\1\42\1\15"+
    "\1\34\1\41\1\22\1\35\1\1\1\0\1\5\1\0\1\7\32\11"+
    "\4\0\1\6\1\0\4\11\1\30\2\11\1\17\1\26\2\11\1\27"+
    "\3\11\1\21\3\11\1\20\2\11\1\23\3\11\12\0\1\4\32\0"+
    "\1\13\11\0\1\24\12\0\1\24\4\0\1\24\5\0\27\24\1\0"+
    "\37\24\1\0\u01ca\24\4\0\14\24\16\0\5\24\7\0\1\24\1\0"+
    "\1\24\21\0\165\24\1\0\2\24\2\0\4\24\1\0\1\24\6\0"+
    "\1\24\1\0\3\24\1\0\1\24\1\0\24\24\1\0\123\24\1\0"+
    "\213\24\1\0\255\24\1\0\46\24\2\0\1\24\7\0\47\24\11\0"+
    "\55\24\1\0\1\24\1\0\2\24\1\0\2\24\1\0\1\24\10\0"+
    "\33\24\5\0\3\24\35\0\13\24\5\0\112\24\4\0\146\24\1\0"+
    "\10\24\2\0\12\24\1\0\23\24\2\0\1\24\20\0\73\24\2\0"+
    "\145\24\16\0\66\24\4\0\1\24\5\0\56\24\22\0\34\24\104\0"+
    "\23\24\61\0\200\24\2\0\12\24\1\0\23\24\1\0\10\24\2\0"+
    "\2\24\2\0\26\24\1\0\7\24\1\0\1\24\3\0\4\24\2\0"+
    "\11\24\2\0\2\24\2\0\4\24\10\0\1\24\4\0\2\24\1\0"+
    "\5\24\2\0\14\24\17\0\3\24\1\0\6\24\4\0\2\24\2\0"+
    "\26\24\1\0\7\24\1\0\2\24\1\0\2\24\1\0\2\24\2\0"+
    "\1\24\1\0\5\24\4\0\2\24\2\0\3\24\3\0\1\24\7\0"+
    "\4\24\1\0\1\24\7\0\20\24\13\0\3\24\1\0\11\24\1\0"+
    "\3\24\1\0\26\24\1\0\7\24\1\0\2\24\1\0\5\24\2\0"+
    "\12\24\1\0\3\24\1\0\3\24\2\0\1\24\17\0\4\24\2\0"+
    "\12\24\21\0\3\24\1\0\10\24\2\0\2\24\2\0\26\24\1\0"+
    "\7\24\1\0\2\24\1\0\5\24\2\0\11\24\2\0\2\24\2\0"+
    "\3\24\10\0\2\24\4\0\2\24\1\0\5\24\2\0\12\24\1\0"+
    "\1\24\20\0\2\24\1\0\6\24\3\0\3\24\1\0\4\24\3\0"+
    "\2\24\1\0\1\24\1\0\2\24\3\0\2\24\3\0\3\24\3\0"+
    "\14\24\4\0\5\24\3\0\3\24\1\0\4\24\2\0\1\24\6\0"+
    "\1\24\16\0\12\24\20\0\4\24\1\0\10\24\1\0\3\24\1\0"+
    "\27\24\1\0\20\24\3\0\10\24\1\0\3\24\1\0\4\24\7\0"+
    "\2\24\1\0\2\24\6\0\4\24\2\0\12\24\21\0\3\24\1\0"+
    "\10\24\1\0\3\24\1\0\27\24\1\0\12\24\1\0\5\24\2\0"+
    "\11\24\1\0\3\24\1\0\4\24\7\0\2\24\7\0\1\24\1\0"+
    "\4\24\2\0\12\24\1\0\2\24\16\0\3\24\1\0\10\24\1\0"+
    "\3\24\1\0\51\24\2\0\10\24\1\0\3\24\1\0\5\24\10\0"+
    "\1\24\10\0\4\24\2\0\12\24\12\0\6\24\2\0\2\24\1\0"+
    "\22\24\3\0\30\24\1\0\11\24\1\0\1\24\2\0\7\24\3\0"+
    "\1\24\4\0\6\24\1\0\1\24\1\0\10\24\6\0\12\24\2\0"+
    "\2\24\15\0\72\24\5\0\17\24\1\0\12\24\47\0\2\24\1\0"+
    "\1\24\2\0\2\24\1\0\1\24\2\0\1\24\6\0\4\24\1\0"+
    "\7\24\1\0\3\24\1\0\1\24\1\0\1\24\2\0\2\24\1\0"+
    "\15\24\1\0\3\24\2\0\5\24\1\0\1\24\1\0\6\24\2\0"+
    "\12\24\2\0\4\24\40\0\1\24\27\0\2\24\6\0\12\24\13\0"+
    "\1\24\1\0\1\24\1\0\1\24\4\0\12\24\1\0\44\24\4\0"+
    "\24\24\1\0\22\24\1\0\44\24\11\0\1\24\71\0\112\24\6\0"+
    "\116\24\2\0\46\24\1\0\1\24\5\0\1\24\2\0\53\24\1\0"+
    "\u014d\24\1\0\4\24\2\0\7\24\1\0\1\24\1\0\4\24\2\0"+
    "\51\24\1\0\4\24\2\0\41\24\1\0\4\24\2\0\7\24\1\0"+
    "\1\24\1\0\4\24\2\0\17\24\1\0\71\24\1\0\4\24\2\0"+
    "\103\24\2\0\3\24\40\0\20\24\20\0\125\24\14\0\u026c\24\2\0"+
    "\21\24\1\13\32\24\5\0\113\24\3\0\13\24\7\0\15\24\1\0"+
    "\7\24\13\0\25\24\13\0\24\24\14\0\15\24\1\0\3\24\1\0"+
    "\2\24\14\0\124\24\3\0\1\24\4\0\2\24\2\0\12\24\41\0"+
    "\3\24\2\0\12\24\6\0\130\24\10\0\53\24\5\0\106\24\12\0"+
    "\37\24\1\0\14\24\4\0\14\24\12\0\50\24\2\0\5\24\13\0"+
    "\54\24\4\0\32\24\6\0\12\24\46\0\34\24\4\0\77\24\1\0"+
    "\35\24\2\0\13\24\6\0\12\24\15\0\1\24\10\0\17\24\101\0"+
    "\114\24\4\0\12\24\21\0\11\24\14\0\164\24\14\0\70\24\10\0"+
    "\12\24\3\0\61\24\122\0\3\24\1\0\43\24\1\0\2\24\6\0"+
    "\366\24\6\0\u011a\24\2\0\6\24\2\0\46\24\2\0\6\24\2\0"+
    "\10\24\1\0\1\24\1\0\1\24\1\0\1\24\1\0\37\24\2\0"+
    "\65\24\1\0\7\24\1\0\1\24\3\0\3\24\1\0\7\24\3\0"+
    "\4\24\2\0\6\24\4\0\15\24\5\0\3\24\1\0\7\24\3\0"+
    "\13\13\35\0\1\4\1\4\5\0\1\13\17\0\2\24\23\0\1\24"+
    "\12\0\1\13\21\0\1\24\15\0\1\24\20\0\15\24\63\0\41\24"+
    "\21\0\1\24\4\0\1\24\2\0\12\24\1\0\1\24\3\0\5\24"+
    "\6\0\1\24\1\0\1\24\1\0\1\24\1\0\4\24\1\0\13\24"+
    "\2\0\4\24\5\0\5\24\4\0\1\24\21\0\51\24\u032d\0\64\24"+
    "\u0716\0\57\24\1\0\57\24\1\0\205\24\6\0\11\24\14\0\46\24"+
    "\1\0\1\24\5\0\1\24\2\0\70\24\7\0\1\24\17\0\30\24"+
    "\11\0\7\24\1\0\7\24\1\0\7\24\1\0\7\24\1\0\7\24"+
    "\1\0\7\24\1\0\7\24\1\0\7\24\1\0\40\24\57\0\1\24"+
    "\u01d0\0\1\13\4\0\3\24\31\0\17\24\1\0\5\24\2\0\5\24"+
    "\4\0\126\24\2\0\2\24\2\0\3\24\1\0\132\24\1\0\4\24"+
    "\5\0\51\24\3\0\136\24\21\0\33\24\65\0\20\24\u0200\0\u19b6\24"+
    "\112\0\u51cd\24\63\0\u048d\24\103\0\56\24\2\0\u010d\24\3\0\34\24"+
    "\24\0\63\24\1\0\12\24\1\0\37\24\1\0\123\24\45\0\11\24"+
    "\2\0\147\24\2\0\4\24\1\0\36\24\2\0\2\24\105\0\61\24"+
    "\30\0\64\24\14\0\105\24\13\0\12\24\6\0\30\24\3\0\1\24"+
    "\4\0\56\24\2\0\44\24\14\0\35\24\3\0\101\24\16\0\13\24"+
    "\6\0\37\24\1\0\67\24\11\0\16\24\2\0\12\24\6\0\27\24"+
    "\3\0\111\24\30\0\3\24\2\0\20\24\2\0\5\24\12\0\6\24"+
    "\2\0\6\24\2\0\6\24\11\0\7\24\1\0\7\24\1\0\53\24"+
    "\1\0\4\24\4\0\2\24\132\0\53\24\1\0\2\24\2\0\12\24"+
    "\6\0\u2ba4\24\14\0\27\24\4\0\61\24\u2104\0\u016e\24\2\0\152\24"+
    "\46\0\7\24\14\0\5\24\5\0\14\24\1\0\15\24\1\0\5\24"+
    "\1\0\1\24\1\0\2\24\1\0\2\24\1\0\154\24\41\0\u016b\24"+
    "\22\0\100\24\2\0\66\24\50\0\14\24\4\0\20\24\20\0\16\24"+
    "\5\0\2\24\30\0\3\24\40\0\5\24\1\0\207\24\23\0\12\24"+
    "\7\0\32\24\4\0\1\24\1\0\32\24\13\0\131\24\3\0\6\24"+
    "\2\0\6\24\2\0\6\24\2\0\3\24\43\0\14\24\1\0\32\24"+
    "\1\0\23\24\1\0\2\24\1\0\17\24\2\0\16\24\42\0\173\24"+
    "\105\0\65\24\210\0\1\24\202\0\35\24\3\0\61\24\17\0\1\24"+
    "\37\0\40\24\20\0\33\24\5\0\53\24\5\0\36\24\2\0\44\24"+
    "\4\0\10\24\1\0\5\24\52\0\236\24\2\0\12\24\126\0\50\24"+
    "\10\0\64\24\234\0\u0137\24\11\0\26\24\12\0\10\24\230\0\6\24"+
    "\2\0\1\24\1\0\54\24\1\0\2\24\3\0\1\24\2\0\27\24"+
    "\12\0\27\24\11\0\37\24\141\0\26\24\12\0\32\24\106\0\70\24"+
    "\6\0\2\24\100\0\4\24\1\0\2\24\5\0\10\24\1\0\3\24"+
    "\1\0\33\24\4\0\3\24\4\0\1\24\40\0\35\24\3\0\35\24"+
    "\43\0\10\24\1\0\36\24\31\0\66\24\12\0\26\24\12\0\23\24"+
    "\15\0\22\24\156\0\111\24\u03b7\0\107\24\37\0\12\24\17\0\74\24"+
    "\25\0\31\24\7\0\12\24\6\0\65\24\1\0\12\24\20\0\44\24"+
    "\2\0\1\24\11\0\105\24\13\0\13\24\45\0\22\24\1\0\45\24"+
    "\170\0\73\24\5\0\12\24\7\0\3\24\1\0\10\24\2\0\2\24"+
    "\2\0\26\24\1\0\7\24\1\0\2\24\1\0\5\24\2\0\11\24"+
    "\2\0\2\24\2\0\3\24\11\0\1\24\5\0\7\24\2\0\7\24"+
    "\3\0\5\24\u010b\0\106\24\1\0\1\24\10\0\12\24\246\0\66\24"+
    "\2\0\11\24\77\0\101\24\3\0\1\24\13\0\12\24\46\0\70\24"+
    "\10\0\12\24\u01d6\0\112\24\25\0\1\24\u01c0\0\71\24\u0507\0\u0399\24"+
    "\147\0\157\24\u0b91\0\u042f\24\u33d1\0\u0239\24\7\0\37\24\1\0\12\24"+
    "\146\0\36\24\2\0\5\24\13\0\67\24\11\0\4\24\14\0\12\24"+
    "\11\0\25\24\5\0\23\24\u0370\0\105\24\13\0\57\24\20\0\21\24"+
    "\u4060\0\2\24\u0bfe\0\153\24\5\0\15\24\3\0\11\24\7\0\12\24"+
    "\3\0\2\24\u14c6\0\5\24\3\0\6\24\10\0\10\24\2\0\7\24"+
    "\36\0\4\24\224\0\3\24\u01bb\0\125\24\1\0\107\24\1\0\2\24"+
    "\2\0\1\24\2\0\2\24\2\0\4\24\1\0\14\24\1\0\1\24"+
    "\1\0\7\24\1\0\101\24\1\0\4\24\2\0\10\24\1\0\7\24"+
    "\1\0\34\24\1\0\4\24\1\0\5\24\1\0\1\24\3\0\7\24"+
    "\1\0\u0154\24\2\0\31\24\1\0\31\24\1\0\37\24\1\0\31\24"+
    "\1\0\37\24\1\0\31\24\1\0\37\24\1\0\31\24\1\0\37\24"+
    "\1\0\31\24\1\0\10\24\2\0\62\24\u1000\0\305\24\13\0\7\24"+
    "\u0529\0\4\24\1\0\33\24\1\0\2\24\1\0\1\24\2\0\1\24"+
    "\1\0\12\24\1\0\4\24\1\0\1\24\1\0\1\24\6\0\1\24"+
    "\4\0\1\24\1\0\1\24\1\0\1\24\1\0\3\24\1\0\2\24"+
    "\1\0\1\24\2\0\1\24\1\0\1\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\24\1\0\2\24\1\0\1\24\2\0\4\24\1\0\7\24"+
    "\1\0\4\24\1\0\4\24\1\0\1\24\1\0\12\24\1\0\21\24"+
    "\5\0\3\24\1\0\5\24\1\0\21\24\u0274\0\32\24\6\0\32\24"+
    "\6\0\32\24\u0e76\0\ua6d7\24\51\0\u1035\24\13\0\336\24\u3fe2\0\u021e\24"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
    "\360\24\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\11\1\5\0\1\2\11\0\1\3\15\0\1\4"+
    "\15\0\1\5\1\4\4\0\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\7\0\1\3\1\17"+
    "\2\0\1\3\6\0\4\17\1\0\2\17\1\0\2\17"+
    "\1\0\1\17\2\0\1\20";

  private static int [] zzUnpackAction() {
    int [] result = new int[101];
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
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\157\0\u0206"+
    "\0\224\0\u022b\0\u0250\0\u0275\0\336\0\u029a\0\u02bf\0\u02e4"+
    "\0\u0309\0\45\0\u032e\0\u0353\0\u0378\0\u039d\0\u03c2\0\u03e7"+
    "\0\u040c\0\u0431\0\u0456\0\u047b\0\u04a0\0\u04c5\0\u04ea\0\u0378"+
    "\0\u050f\0\u0534\0\u0559\0\u057e\0\u05a3\0\u05c8\0\u05ed\0\u0612"+
    "\0\u0637\0\u065c\0\u0681\0\u06a6\0\u06cb\0\u04c5\0\u04ea\0\u06f0"+
    "\0\u0715\0\u073a\0\u075f\0\45\0\45\0\45\0\45\0\45"+
    "\0\45\0\45\0\45\0\45\0\u0784\0\u07a9\0\u07ce\0\u07f3"+
    "\0\u0818\0\u083d\0\u0862\0\u0887\0\u08ac\0\u08d1\0\u08f6\0\u06a6"+
    "\0\u091b\0\u0887\0\u0940\0\u0965\0\u098a\0\u09af\0\u0940\0\u09d4"+
    "\0\u09f9\0\u0a1e\0\u0a43\0\u0a68\0\u0a8d\0\u0ab2\0\u0ad7\0\u0afc"+
    "\0\u0b21\0\u0b46\0\u0b6b\0\u0b90\0\45";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[101];
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
    "\2\2\1\6\1\7\1\2\1\10\2\5\1\2\1\11"+
    "\1\2\1\4\3\5\1\12\1\2\2\7\1\2\7\7"+
    "\47\0\1\13\1\0\1\14\1\0\1\14\2\0\1\14"+
    "\1\15\1\14\1\0\1\14\1\0\1\14\1\16\1\14"+
    "\1\0\2\14\1\0\3\14\2\0\2\14\1\0\7\14"+
    "\3\0\1\17\11\0\1\20\7\0\1\17\5\0\2\20"+
    "\1\0\7\20\6\0\1\21\1\22\1\0\1\21\3\0"+
    "\1\21\1\0\3\21\1\0\1\21\2\0\3\21\2\0"+
    "\2\21\1\0\7\21\15\0\1\23\15\0\2\23\1\0"+
    "\7\23\3\0\1\24\2\0\1\21\1\22\1\0\1\21"+
    "\3\0\1\25\1\24\3\21\1\0\1\21\2\0\3\21"+
    "\2\0\2\25\1\0\7\25\6\0\1\21\1\22\1\0"+
    "\1\21\3\0\1\21\1\0\1\21\1\26\1\21\1\0"+
    "\1\21\2\0\3\21\2\0\2\21\1\0\7\21\6\0"+
    "\1\21\1\22\1\0\1\21\3\0\1\21\1\0\3\21"+
    "\1\0\1\27\2\0\3\21\2\0\2\21\1\0\7\21"+
    "\32\0\1\30\15\0\1\31\45\0\1\14\1\32\1\14"+
    "\2\0\1\14\1\0\1\14\1\0\1\14\1\0\3\14"+
    "\1\0\2\14\1\0\3\14\2\0\2\14\1\0\7\14"+
    "\4\0\1\14\1\0\1\14\2\0\1\14\1\0\1\14"+
    "\1\0\1\14\1\0\3\14\1\0\2\14\1\0\3\14"+
    "\2\0\2\14\1\0\7\14\4\0\1\14\1\32\1\14"+
    "\2\0\1\14\1\0\1\14\1\0\1\14\1\0\3\14"+
    "\1\0\2\14\1\0\1\33\2\14\2\0\2\14\1\0"+
    "\7\14\15\0\1\20\15\0\2\20\1\0\7\20\6\0"+
    "\1\34\2\0\1\34\3\0\1\34\1\0\3\34\1\0"+
    "\1\34\2\0\3\34\2\0\2\34\1\0\7\34\3\0"+
    "\1\24\11\0\1\23\1\24\14\0\2\23\1\0\7\23"+
    "\3\0\1\24\11\0\1\35\1\24\14\0\2\35\1\0"+
    "\7\35\6\0\1\21\1\22\1\0\1\21\3\0\1\21"+
    "\1\0\1\21\1\36\1\21\1\0\1\21\2\0\3\21"+
    "\2\0\2\21\1\0\7\21\6\0\1\21\1\22\1\0"+
    "\1\21\3\0\1\21\1\0\3\21\1\0\1\37\2\0"+
    "\3\21\2\0\2\21\1\0\7\21\33\0\1\40\2\0"+
    "\1\41\1\0\1\42\1\0\1\43\5\0\1\44\45\0"+
    "\1\14\1\32\1\14\2\0\1\14\1\0\1\14\1\0"+
    "\1\14\1\0\1\14\1\45\1\14\1\0\2\14\1\0"+
    "\3\14\2\0\2\14\1\0\7\14\6\0\1\34\1\0"+
    "\1\46\1\34\3\0\1\34\1\0\3\34\1\0\1\34"+
    "\2\0\3\34\2\0\2\34\1\0\7\34\3\0\1\47"+
    "\11\0\1\50\15\0\2\50\1\0\7\50\6\0\1\21"+
    "\1\22\1\0\1\21\3\0\1\21\1\0\2\21\1\51"+
    "\1\0\1\21\2\0\3\21\2\0\2\21\1\0\7\21"+
    "\6\0\1\21\1\22\1\52\1\21\3\0\1\21\1\0"+
    "\3\21\1\0\1\21\2\0\3\21\2\0\2\21\1\0"+
    "\7\21\34\0\1\53\47\0\1\54\1\55\40\0\1\56"+
    "\4\0\1\57\36\0\1\60\3\0\1\61\3\0\1\62"+
    "\1\63\3\0\1\64\45\0\1\14\1\32\1\14\2\0"+
    "\1\14\1\0\1\14\1\0\1\14\1\0\3\14\1\0"+
    "\2\14\1\0\1\14\1\65\1\14\2\0\2\14\1\0"+
    "\7\14\11\0\1\66\5\0\3\66\1\0\1\66\2\0"+
    "\3\66\31\0\1\67\15\0\2\67\1\0\7\67\6\0"+
    "\1\21\1\22\1\0\1\21\3\0\1\21\1\0\3\21"+
    "\1\70\1\21\2\0\3\21\2\0\2\21\1\0\7\21"+
    "\6\0\1\71\2\0\1\71\3\0\1\71\1\0\1\72"+
    "\2\71\1\0\1\73\1\71\1\0\3\71\2\0\2\71"+
    "\1\0\7\71\35\0\1\74\44\0\1\75\44\0\1\76"+
    "\44\0\1\77\44\0\1\100\44\0\1\101\44\0\1\102"+
    "\44\0\1\103\44\0\1\104\7\0\3\64\1\105\1\0"+
    "\40\64\4\0\1\14\1\32\1\14\2\0\1\14\1\0"+
    "\1\14\1\0\1\14\1\0\3\14\1\0\2\14\1\0"+
    "\2\14\1\106\2\0\2\14\1\0\7\14\12\0\1\107"+
    "\40\0\1\71\1\0\1\110\1\71\3\0\1\71\1\0"+
    "\3\71\1\0\2\71\1\0\3\71\2\0\2\71\1\0"+
    "\7\71\6\0\1\71\1\0\1\110\1\71\3\0\1\71"+
    "\1\0\1\71\1\111\1\71\1\0\2\71\1\0\3\71"+
    "\2\0\2\71\1\0\7\71\6\0\1\71\1\0\1\110"+
    "\1\71\3\0\1\71\1\0\3\71\1\0\1\112\1\71"+
    "\1\0\3\71\2\0\2\71\1\0\7\71\3\64\1\113"+
    "\1\0\40\64\4\0\1\14\1\114\1\14\2\0\1\14"+
    "\1\0\1\14\1\0\1\14\1\0\3\14\1\0\2\14"+
    "\1\0\3\14\2\0\2\14\1\0\7\14\12\0\1\52"+
    "\40\0\1\115\2\0\1\115\3\0\1\115\1\0\3\115"+
    "\1\0\2\115\1\0\3\115\2\0\2\115\1\0\7\115"+
    "\6\0\1\71\1\0\1\110\1\71\3\0\1\71\1\0"+
    "\1\71\1\116\1\71\1\0\2\71\1\0\3\71\2\0"+
    "\2\71\1\0\7\71\6\0\1\71\1\0\1\110\1\71"+
    "\3\0\1\71\1\0\3\71\1\0\1\117\1\71\1\0"+
    "\3\71\2\0\2\71\1\0\7\71\3\64\1\113\1\0"+
    "\1\120\37\64\1\0\1\121\2\0\1\122\1\0\1\122"+
    "\2\0\1\122\1\0\1\122\1\0\1\122\1\0\3\122"+
    "\1\0\2\122\1\0\3\122\2\0\2\122\1\0\7\122"+
    "\6\0\1\115\1\0\1\123\1\115\3\0\1\115\1\0"+
    "\3\115\1\0\2\115\1\0\3\115\2\0\2\115\1\0"+
    "\7\115\6\0\1\71\1\0\1\110\1\71\3\0\1\71"+
    "\1\0\2\71\1\124\1\0\2\71\1\0\3\71\2\0"+
    "\2\71\1\0\7\71\6\0\1\71\1\0\1\125\1\71"+
    "\3\0\1\71\1\0\3\71\1\0\2\71\1\0\3\71"+
    "\2\0\2\71\1\0\7\71\12\0\1\126\40\0\1\127"+
    "\2\0\1\127\3\0\1\127\1\0\3\127\1\0\2\127"+
    "\1\0\3\127\2\0\2\127\1\0\7\127\6\0\1\71"+
    "\1\0\1\110\1\71\3\0\1\71\1\0\3\71\1\70"+
    "\2\71\1\0\3\71\2\0\2\71\1\0\7\71\6\0"+
    "\1\130\2\0\1\130\3\0\1\130\1\0\1\131\2\130"+
    "\1\0\1\132\1\130\1\0\3\130\2\0\2\130\1\0"+
    "\7\130\20\0\1\133\32\0\1\130\1\0\1\110\1\130"+
    "\3\0\1\130\1\0\3\130\1\0\2\130\1\0\3\130"+
    "\2\0\2\130\1\0\7\130\6\0\1\130\1\0\1\110"+
    "\1\130\3\0\1\130\1\0\1\130\1\134\1\130\1\0"+
    "\2\130\1\0\3\130\2\0\2\130\1\0\7\130\6\0"+
    "\1\130\1\0\1\110\1\130\3\0\1\130\1\0\3\130"+
    "\1\0\1\135\1\130\1\0\3\130\2\0\2\130\1\0"+
    "\7\130\26\0\1\136\24\0\1\130\1\0\1\110\1\130"+
    "\3\0\1\130\1\0\1\130\1\137\1\130\1\0\2\130"+
    "\1\0\3\130\2\0\2\130\1\0\7\130\6\0\1\130"+
    "\1\0\1\110\1\130\3\0\1\130\1\0\3\130\1\0"+
    "\1\140\1\130\1\0\3\130\2\0\2\130\1\0\7\130"+
    "\20\0\1\141\32\0\1\130\1\0\1\110\1\130\3\0"+
    "\1\130\1\0\2\130\1\142\1\0\2\130\1\0\3\130"+
    "\2\0\2\130\1\0\7\130\6\0\1\130\1\0\1\125"+
    "\1\130\3\0\1\130\1\0\3\130\1\0\2\130\1\0"+
    "\3\130\2\0\2\130\1\0\7\130\27\0\1\143\23\0"+
    "\1\130\1\0\1\110\1\130\3\0\1\130\1\0\3\130"+
    "\1\70\2\130\1\0\3\130\2\0\2\130\1\0\7\130"+
    "\30\0\1\144\21\0\1\145\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2997];
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
    "\1\0\1\11\10\1\5\0\1\1\11\0\1\11\15\0"+
    "\1\1\15\0\2\1\4\0\11\11\7\0\2\1\2\0"+
    "\1\1\6\0\4\1\1\0\2\1\1\0\2\1\1\0"+
    "\1\1\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[101];
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
    while (i < 2672) {
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
          case 17: break;
          case 2: 
            { System.out.print("SIGNED_NUM:" + yytext());
            }
          case 18: break;
          case 3: 
            { System.out.print("");
            }
          case 19: break;
          case 4: 
            { System.out.print("PHONE:" + yytext());
            }
          case 20: break;
          case 5: 
            { System.out.print("EMAIL:" + yytext());
            }
          case 21: break;
          case 6: 
            { System.out.print("&");
            }
          case 22: break;
          case 7: 
            { System.out.print("*");
            }
          case 23: break;
          case 8: 
            { System.out.print("-");
            }
          case 24: break;
          case 9: 
            { System.out.print(":");
            }
          case 25: break;
          case 10: 
            { System.out.print(";");
            }
          case 26: break;
          case 11: 
            { System.out.print("?");
            }
          case 27: break;
          case 12: 
            { System.out.print(">");
            }
          case 28: break;
          case 13: 
            { System.out.print("<");
            }
          case 29: break;
          case 14: 
            { System.out.print("=");
            }
          case 30: break;
          case 15: 
            { System.out.print("HIDDEN_LINK:" + yytext());
            }
          case 31: break;
          case 16: 
            { System.out.print("==="+yytext().substring(7, yytext().length()-8)+"===");
            }
          case 32: break;
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
