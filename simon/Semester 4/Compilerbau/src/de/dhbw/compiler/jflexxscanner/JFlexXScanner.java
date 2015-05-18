/* The following code was generated by JFlex 1.4.3 on 18.05.15 10:26 */

/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * �bungsbeispiel X-Scanner mit JFlex
 * 
 * **********************************************
 */


package de.dhbw.compiler.jflexxscanner;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 18.05.15 10:26 from the specification file
 * <tt>C:/Users/Simon/Documents/GitHub/tinf13b4/simon/Semester 4/Compilerbau/src/de/dhbw/compiler/jflexxscanner/JFlexXScanner.lex</tt>
 */
public final class JFlexXScanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int FRACTION = 4;
  public static final int STRING = 10;
  public static final int YYINITIAL = 0;
  public static final int EXP = 8;
  public static final int EXPVZ = 6;
  public static final int INT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\3\42\1\0\2\42\22\0\1\43\1\0\1\41\5\0\1\24"+
    "\1\25\1\20\1\16\1\0\1\17\1\35\1\21\1\40\11\37\1\22"+
    "\1\32\1\26\1\23\1\27\2\0\4\36\1\45\25\36\1\0\1\44"+
    "\4\0\1\3\1\33\1\36\1\4\1\2\1\11\1\15\1\30\1\6"+
    "\2\36\1\12\1\34\1\7\1\13\1\5\1\36\1\1\1\14\1\10"+
    "\2\36\1\31\3\36\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\10\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\2\1\15\1\2"+
    "\1\16\1\17\1\20\1\21\1\22\2\23\1\24\1\25"+
    "\1\26\1\27\1\30\2\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\36\5\2\1\41\4\2\1\0"+
    "\1\42\2\2\1\43\1\44\1\45\1\2\1\46\3\2"+
    "\1\47\2\2\1\50\1\2\1\0\2\2\1\51\1\52"+
    "\2\2\1\53\2\2\1\54\2\2\1\55\1\2\1\56"+
    "\1\2\1\57\1\60\1\2\1\61\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[99];
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
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\344\0\u010a"+
    "\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214\0\344"+
    "\0\344\0\344\0\u023a\0\u0260\0\344\0\344\0\344\0\344"+
    "\0\344\0\u0286\0\344\0\u02ac\0\344\0\344\0\344\0\344"+
    "\0\u02d2\0\344\0\u02f8\0\344\0\344\0\344\0\344\0\344"+
    "\0\344\0\u031e\0\344\0\344\0\344\0\344\0\344\0\344"+
    "\0\344\0\u0344\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\u0156"+
    "\0\u0428\0\u044e\0\u0474\0\u049a\0\u04c0\0\344\0\u04e6\0\u050c"+
    "\0\344\0\344\0\344\0\u0532\0\u0156\0\u0558\0\u057e\0\u05a4"+
    "\0\u0156\0\u05ca\0\u05f0\0\u0156\0\u0616\0\u063c\0\u0662\0\u0688"+
    "\0\u0156\0\u0156\0\u06ae\0\u06d4\0\u0156\0\u06fa\0\u0720\0\344"+
    "\0\u0746\0\u076c\0\u0156\0\u0792\0\u0156\0\u07b8\0\u0156\0\u0156"+
    "\0\u07de\0\u0156\0\u0156";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[99];
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
    "\1\7\1\10\1\11\2\12\1\13\1\14\1\12\1\15"+
    "\1\16\2\12\1\17\1\12\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\12\1\32"+
    "\1\33\1\34\1\12\1\35\1\12\1\36\1\37\1\40"+
    "\2\41\1\7\1\12\2\42\1\43\32\42\1\44\1\42"+
    "\2\45\4\42\1\43\2\46\1\47\34\46\2\50\4\46"+
    "\1\47\17\51\1\52\17\51\1\53\1\54\5\51\37\55"+
    "\2\56\5\55\1\57\15\60\4\57\1\60\5\57\2\60"+
    "\1\57\4\60\2\57\1\61\1\57\1\60\1\62\1\60"+
    "\47\0\1\12\1\63\13\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\6\12\1\64\2\12"+
    "\1\65\3\12\12\0\2\12\1\0\2\12\1\0\3\12"+
    "\4\0\1\12\1\0\15\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\1\66\14\12\12\0"+
    "\2\12\1\0\2\12\1\0\3\12\4\0\1\12\1\0"+
    "\6\12\1\67\1\12\1\70\4\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\15\12\12\0"+
    "\1\71\1\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\11\12\1\72\1\73\2\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\7\12\1\74"+
    "\5\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\20\0\1\75\50\0\1\76\23\0\15\12\12\0"+
    "\1\77\1\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\1\12\1\100\13\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\42\0\2\41\21\0\1\101"+
    "\17\0\2\101\44\0\1\102\1\54\46\0\1\103\5\0"+
    "\2\12\1\104\12\12\12\0\2\12\1\0\2\12\1\0"+
    "\3\12\4\0\1\12\1\0\3\12\1\105\11\12\12\0"+
    "\2\12\1\0\2\12\1\0\3\12\4\0\1\12\1\0"+
    "\13\12\1\106\1\12\12\0\2\12\1\0\2\12\1\0"+
    "\3\12\4\0\1\12\1\0\5\12\1\107\4\12\1\110"+
    "\2\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\7\12\1\111\5\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\1\12\1\112"+
    "\13\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\12\12\1\113\2\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\1\114\14\12"+
    "\12\0\2\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\1\115\14\12\12\0\2\12\1\0\2\12\1\0"+
    "\3\12\4\0\1\12\20\75\1\116\25\75\1\0\5\12"+
    "\1\117\7\12\12\0\2\12\1\0\2\12\1\0\3\12"+
    "\4\0\1\12\1\0\14\12\1\120\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\3\12\1\121"+
    "\11\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\1\12\1\122\13\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\6\12\1\123"+
    "\6\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\14\12\1\124\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\6\12\1\125\6\12"+
    "\12\0\2\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\2\12\1\126\12\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\5\12\1\127\7\12"+
    "\12\0\2\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\20\75\1\116\1\130\24\75\1\0\11\12\1\131\3\12"+
    "\12\0\2\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\5\12\1\132\7\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\7\12\1\133\5\12"+
    "\12\0\2\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\1\134\14\12\12\0\2\12\1\0\2\12\1\0"+
    "\3\12\4\0\1\12\1\0\7\12\1\135\5\12\12\0"+
    "\2\12\1\0\2\12\1\0\3\12\4\0\1\12\1\0"+
    "\6\12\1\136\6\12\12\0\2\12\1\0\2\12\1\0"+
    "\3\12\4\0\1\12\1\0\1\12\1\137\13\12\12\0"+
    "\2\12\1\0\2\12\1\0\3\12\4\0\1\12\1\0"+
    "\6\12\1\140\6\12\12\0\2\12\1\0\2\12\1\0"+
    "\3\12\4\0\1\12\1\0\2\12\1\141\12\12\12\0"+
    "\2\12\1\0\2\12\1\0\3\12\4\0\1\12\1\0"+
    "\14\12\1\142\12\0\2\12\1\0\2\12\1\0\3\12"+
    "\4\0\1\12\1\0\15\12\12\0\2\12\1\0\1\12"+
    "\1\143\1\0\3\12\4\0\1\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2052];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\1\11\10\1\3\11\2\1\5\11\1\1\1\11"+
    "\1\1\4\11\1\1\1\11\1\1\6\11\1\1\7\11"+
    "\13\1\1\0\1\11\2\1\3\11\12\1\1\0\11\1"+
    "\1\11\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[99];
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

  /* user code: */
	private int intvalue=0;
	private String textvalue ="";
	private int fracvalue=0;
	private int fraclength=0;
	private int expvalue=0;
	private int expsign=1;
	private int startline =0;
	private int startcolumn =0;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public JFlexXScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public JFlexXScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 108) {
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public Token nextToken() throws java.io.IOException {
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
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { return new KeyWordToken(Token.MINUS, yyline+1, yycolumn+1);
          }
        case 51: break;
        case 40: 
          { return new KeyWordToken(Token.FOR, yyline+1, yycolumn+1);
          }
        case 52: break;
        case 21: 
          { intvalue = 10*intvalue + yytext().charAt(0)-'0'; 
							  textvalue+=yytext();
          }
        case 53: break;
        case 3: 
          { return new KeyWordToken(Token.PLUS, yyline+1, yycolumn+1);
          }
        case 54: break;
        case 7: 
          { return new KeyWordToken(Token.COLON, yyline+1, yycolumn+1);
          }
        case 55: break;
        case 29: 
          { expvalue = 10* expvalue + yytext().charAt(0)-'0';
          }
        case 56: break;
        case 2: 
          { return new IdToken(Token.ID, yytext(), yyline+1, yycolumn+1);
          }
        case 57: break;
        case 13: 
          { return new KeyWordToken(Token.SEMICOLON, yyline+1, yycolumn+1);
          }
        case 58: break;
        case 10: 
          { return new KeyWordToken(Token.RBR, yyline+1, yycolumn+1);
          }
        case 59: break;
        case 26: 
          { yybegin(EXP); expvalue=yytext().charAt(0)-'0'; expsign=1;
          }
        case 60: break;
        case 1: 
          { return new InvalidToken(Token.INVALID,  yytext(), yyline+1, yycolumn+1);
          }
        case 61: break;
        case 15: 
          { yybegin(INT); textvalue=yytext(); startline=yyline+1; startcolumn=yycolumn+1;
						  intvalue=yytext().charAt(0)-'0'; fracvalue=0; fraclength=0; expvalue=0;
          }
        case 62: break;
        case 34: 
          { return new KeyWordToken(Token.ASSIGN, yyline+1, yycolumn+1);
          }
        case 63: break;
        case 6: 
          { return new KeyWordToken(Token.DIV, yyline+1, yycolumn+1);
          }
        case 64: break;
        case 8: 
          { return new KeyWordToken(Token.EQUALS, yyline+1, yycolumn+1);
          }
        case 65: break;
        case 32: 
          { yybegin(YYINITIAL); return new StringToken(Token.STRINGCONST, textvalue, startline, startcolumn);
          }
        case 66: break;
        case 45: 
          { return new KeyWordToken(Token.PRINT, yyline+1, yycolumn+1);
          }
        case 67: break;
        case 22: 
          { yybegin(YYINITIAL); 
					  		  yypushback(1); 
					  		  return new FloatToken(Token.FLOATCONST,intvalue+fracvalue/Math.pow(10,fraclength), startline, startcolumn);
          }
        case 68: break;
        case 31: 
          { textvalue+=yytext();
          }
        case 69: break;
        case 47: 
          { return new KeyWordToken(Token.WHILE, yyline+1, yycolumn+1);
          }
        case 70: break;
        case 18: 
          { /* eat whitespace */
          }
        case 71: break;
        case 44: 
          { /* eat comments */
          }
        case 72: break;
        case 20: 
          { yybegin(FRACTION); 
							  textvalue+=yytext();
          }
        case 73: break;
        case 16: 
          { return new IntToken(Token.INTCONST, 0, yyline+1, yycolumn+1);
          }
        case 74: break;
        case 38: 
          { return new KeyWordToken(Token.END, yyline+1, yycolumn+1);
          }
        case 75: break;
        case 42: 
          { return new KeyWordToken(Token.ELSE, yyline+1, yycolumn+1);
          }
        case 76: break;
        case 36: 
          { yybegin(EXP); expvalue=yytext().charAt(1)-'0'; expsign=-1;
          }
        case 77: break;
        case 14: 
          { return new KeyWordToken(Token.DOT, yyline+1, yycolumn+1);
          }
        case 78: break;
        case 37: 
          { textvalue+="\"";
          }
        case 79: break;
        case 46: 
          { return new KeyWordToken(Token.FLOAT, yyline+1, yycolumn+1);
          }
        case 80: break;
        case 33: 
          { return new KeyWordToken(Token.IF, yyline+1, yycolumn+1);
          }
        case 81: break;
        case 43: 
          { return new KeyWordToken(Token.THEN, yyline+1, yycolumn+1);
          }
        case 82: break;
        case 25: 
          { yybegin(YYINITIAL); 
					  		  yypushback(1); 
					  		  return new InvalidToken(Token.INVALID, textvalue, startline, startcolumn);
          }
        case 83: break;
        case 23: 
          { yybegin(EXPVZ); 
							  textvalue+=yytext();
          }
        case 84: break;
        case 35: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { yybegin(EXPVZ);
          }
        case 85: break;
        case 24: 
          { fracvalue= 10*fracvalue+ yytext().charAt(0)-'0'; 
							  fraclength++;
							  textvalue+=yytext();
          }
        case 86: break;
        case 28: 
          { yybegin(YYINITIAL); 
					  		  yypushback(1); 
					  		  return new FloatToken(Token.FLOATCONST,(intvalue+fracvalue/Math.pow(10,fraclength))*Math.pow(10,expvalue*expsign), startline, startcolumn);
          }
        case 87: break;
        case 41: 
          { return new KeyWordToken(Token.READ, yyline+1, yycolumn+1);
          }
        case 88: break;
        case 19: 
          { yybegin(YYINITIAL); 
					  		  yypushback(1); 
					  		  return new IntToken(Token.INTCONST, intvalue, startline, startcolumn);
          }
        case 89: break;
        case 39: 
          { return new KeyWordToken(Token.INT, yyline+1, yycolumn+1);
          }
        case 90: break;
        case 12: 
          { return new KeyWordToken(Token.MORE, yyline+1, yycolumn+1);
          }
        case 91: break;
        case 30: 
          { yybegin(YYINITIAL); return new InvalidToken(Token.INVALID, "\""+textvalue, startline, startcolumn);
          }
        case 92: break;
        case 11: 
          { return new KeyWordToken(Token.LESS, yyline+1, yycolumn+1);
          }
        case 93: break;
        case 9: 
          { return new KeyWordToken(Token.LBR, yyline+1, yycolumn+1);
          }
        case 94: break;
        case 5: 
          { return new KeyWordToken(Token.MULT, yyline+1, yycolumn+1);
          }
        case 95: break;
        case 49: 
          { return new KeyWordToken(Token.STRING, yyline+1, yycolumn+1);
          }
        case 96: break;
        case 50: 
          { return new KeyWordToken(Token.PROGRAM, yyline+1, yycolumn+1);
          }
        case 97: break;
        case 17: 
          { yybegin(STRING); textvalue=""; startline=yyline+1; startcolumn=yycolumn+1;
          }
        case 98: break;
        case 48: 
          { return new KeyWordToken(Token.BEGIN, yyline+1, yycolumn+1);
          }
        case 99: break;
        case 27: 
          { yybegin(YYINITIAL);
							  return new FloatToken(Token.FLOATCONST,intvalue+fracvalue/Math.pow(10,fraclength), startline, startcolumn);
          }
        case 100: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case FRACTION: {
              yybegin(YYINITIAL); 
					  		  yypushback(1); 
					  		  return new FloatToken(Token.FLOATCONST,intvalue+fracvalue/Math.pow(10,fraclength), startline, startcolumn);
            }
            case 100: break;
            case STRING: {
              yybegin(YYINITIAL); return new InvalidToken(Token.INVALID, "\""+textvalue, startline, startcolumn);
            }
            case 101: break;
            case EXP: {
              yybegin(YYINITIAL); 
					  		  yypushback(1); 
					  		  return new FloatToken(Token.FLOATCONST,(intvalue+fracvalue/Math.pow(10,fraclength))*Math.pow(10,expvalue*expsign), startline, startcolumn);
            }
            case 102: break;
            case EXPVZ: {
              yybegin(YYINITIAL); 
					  		  yypushback(1); 
					  		  return new InvalidToken(Token.INVALID, textvalue, startline, startcolumn);
            }
            case 103: break;
            case INT: {
              yybegin(YYINITIAL); 
					  		  yypushback(1); 
					  		  return new IntToken(Token.INTCONST, intvalue, startline, startcolumn);
            }
            case 104: break;
            default:
              {
                return new KeyWordToken(Token.EOF, yyline+1, yycolumn+1);
              }
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
