// $ANTLR 3.4 /Users/elliot/NetBeansProjects/Z/grammar/Java.g 2012-04-18 21:57:14

	package org.z.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int DOUBLE=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int FLOAT=9;
    public static final int HEX=10;
    public static final int HEX_DIGIT=11;
    public static final int ID=12;
    public static final int INT=13;
    public static final int K_ABSTRACT=14;
    public static final int K_BOOLEAN=15;
    public static final int K_BREAK=16;
    public static final int K_BYTE=17;
    public static final int K_CATCH=18;
    public static final int K_CHAR=19;
    public static final int K_CLASS=20;
    public static final int K_CONTINUE=21;
    public static final int K_DO=22;
    public static final int K_DOUBLE=23;
    public static final int K_ELSE=24;
    public static final int K_EXTENDS=25;
    public static final int K_FALSE=26;
    public static final int K_FINAL=27;
    public static final int K_FINALLY=28;
    public static final int K_FLOAT=29;
    public static final int K_FOR=30;
    public static final int K_IF=31;
    public static final int K_IMPLEMENTS=32;
    public static final int K_IMPORT=33;
    public static final int K_INSTANCEOF=34;
    public static final int K_INT=35;
    public static final int K_INTERFACE=36;
    public static final int K_LONG=37;
    public static final int K_NATIVE=38;
    public static final int K_NEW=39;
    public static final int K_NULL=40;
    public static final int K_PACKAGE=41;
    public static final int K_PRIVATE=42;
    public static final int K_PROTECTED=43;
    public static final int K_PUBLIC=44;
    public static final int K_RETURN=45;
    public static final int K_SHORT=46;
    public static final int K_STATIC=47;
    public static final int K_SUPER=48;
    public static final int K_SYNCHRONIZED=49;
    public static final int K_THIS=50;
    public static final int K_THROW=51;
    public static final int K_THROWS=52;
    public static final int K_TRANSIENT=53;
    public static final int K_TRUE=54;
    public static final int K_TRY=55;
    public static final int K_VOID=56;
    public static final int K_VOLATILE=57;
    public static final int K_WHILE=58;
    public static final int LONG=59;
    public static final int OCTAL_ESC=60;
    public static final int STRING=61;
    public static final int UNICODE_ESC=62;
    public static final int WS=63;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public JavaLexer() {} 
    public JavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/elliot/NetBeansProjects/Z/grammar/Java.g"; }

    // $ANTLR start "K_ABSTRACT"
    public final void mK_ABSTRACT() throws RecognitionException {
        try {
            int _type = K_ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:6:12: ( 'abstract' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:6:14: 'abstract'
            {
            match("abstract"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_ABSTRACT"

    // $ANTLR start "K_BOOLEAN"
    public final void mK_BOOLEAN() throws RecognitionException {
        try {
            int _type = K_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:7:11: ( 'boolean' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:7:13: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_BOOLEAN"

    // $ANTLR start "K_BREAK"
    public final void mK_BREAK() throws RecognitionException {
        try {
            int _type = K_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:8:9: ( 'break' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:8:11: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_BREAK"

    // $ANTLR start "K_BYTE"
    public final void mK_BYTE() throws RecognitionException {
        try {
            int _type = K_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:9:8: ( 'byte' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:9:10: 'byte'
            {
            match("byte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_BYTE"

    // $ANTLR start "K_CATCH"
    public final void mK_CATCH() throws RecognitionException {
        try {
            int _type = K_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:10:9: ( 'catch' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:10:11: 'catch'
            {
            match("catch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_CATCH"

    // $ANTLR start "K_CHAR"
    public final void mK_CHAR() throws RecognitionException {
        try {
            int _type = K_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:11:8: ( 'char' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:11:10: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_CHAR"

    // $ANTLR start "K_CLASS"
    public final void mK_CLASS() throws RecognitionException {
        try {
            int _type = K_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:12:9: ( 'class' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:12:11: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_CLASS"

    // $ANTLR start "K_CONTINUE"
    public final void mK_CONTINUE() throws RecognitionException {
        try {
            int _type = K_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:13:12: ( 'continue' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:13:14: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_CONTINUE"

    // $ANTLR start "K_DO"
    public final void mK_DO() throws RecognitionException {
        try {
            int _type = K_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:14:6: ( 'do' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:14:8: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_DO"

    // $ANTLR start "K_DOUBLE"
    public final void mK_DOUBLE() throws RecognitionException {
        try {
            int _type = K_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:15:10: ( 'double' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:15:12: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_DOUBLE"

    // $ANTLR start "K_ELSE"
    public final void mK_ELSE() throws RecognitionException {
        try {
            int _type = K_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:16:8: ( 'else' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:16:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_ELSE"

    // $ANTLR start "K_EXTENDS"
    public final void mK_EXTENDS() throws RecognitionException {
        try {
            int _type = K_EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:17:11: ( 'extends' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:17:13: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_EXTENDS"

    // $ANTLR start "K_FALSE"
    public final void mK_FALSE() throws RecognitionException {
        try {
            int _type = K_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:18:9: ( 'false' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:18:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_FALSE"

    // $ANTLR start "K_FINAL"
    public final void mK_FINAL() throws RecognitionException {
        try {
            int _type = K_FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:19:9: ( 'final' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:19:11: 'final'
            {
            match("final"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_FINAL"

    // $ANTLR start "K_FINALLY"
    public final void mK_FINALLY() throws RecognitionException {
        try {
            int _type = K_FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:20:11: ( 'finally' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:20:13: 'finally'
            {
            match("finally"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_FINALLY"

    // $ANTLR start "K_FLOAT"
    public final void mK_FLOAT() throws RecognitionException {
        try {
            int _type = K_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:21:9: ( 'float' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:21:11: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_FLOAT"

    // $ANTLR start "K_FOR"
    public final void mK_FOR() throws RecognitionException {
        try {
            int _type = K_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:22:7: ( 'for' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:22:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_FOR"

    // $ANTLR start "K_IF"
    public final void mK_IF() throws RecognitionException {
        try {
            int _type = K_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:23:6: ( 'if' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:23:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_IF"

    // $ANTLR start "K_IMPLEMENTS"
    public final void mK_IMPLEMENTS() throws RecognitionException {
        try {
            int _type = K_IMPLEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:24:14: ( 'implements' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:24:16: 'implements'
            {
            match("implements"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_IMPLEMENTS"

    // $ANTLR start "K_IMPORT"
    public final void mK_IMPORT() throws RecognitionException {
        try {
            int _type = K_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:25:10: ( 'import' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:25:12: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_IMPORT"

    // $ANTLR start "K_INSTANCEOF"
    public final void mK_INSTANCEOF() throws RecognitionException {
        try {
            int _type = K_INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:26:14: ( 'instanceof' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:26:16: 'instanceof'
            {
            match("instanceof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_INSTANCEOF"

    // $ANTLR start "K_INT"
    public final void mK_INT() throws RecognitionException {
        try {
            int _type = K_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:27:7: ( 'int' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:27:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_INT"

    // $ANTLR start "K_INTERFACE"
    public final void mK_INTERFACE() throws RecognitionException {
        try {
            int _type = K_INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:28:13: ( 'interface' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:28:15: 'interface'
            {
            match("interface"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_INTERFACE"

    // $ANTLR start "K_LONG"
    public final void mK_LONG() throws RecognitionException {
        try {
            int _type = K_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:29:8: ( 'long' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:29:10: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_LONG"

    // $ANTLR start "K_NATIVE"
    public final void mK_NATIVE() throws RecognitionException {
        try {
            int _type = K_NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:30:10: ( 'native' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:30:12: 'native'
            {
            match("native"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_NATIVE"

    // $ANTLR start "K_NEW"
    public final void mK_NEW() throws RecognitionException {
        try {
            int _type = K_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:31:7: ( 'new' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:31:9: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_NEW"

    // $ANTLR start "K_NULL"
    public final void mK_NULL() throws RecognitionException {
        try {
            int _type = K_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:32:8: ( 'null' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:32:10: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_NULL"

    // $ANTLR start "K_PACKAGE"
    public final void mK_PACKAGE() throws RecognitionException {
        try {
            int _type = K_PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:33:11: ( 'package' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:33:13: 'package'
            {
            match("package"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_PACKAGE"

    // $ANTLR start "K_PRIVATE"
    public final void mK_PRIVATE() throws RecognitionException {
        try {
            int _type = K_PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:34:11: ( 'private' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:34:13: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_PRIVATE"

    // $ANTLR start "K_PROTECTED"
    public final void mK_PROTECTED() throws RecognitionException {
        try {
            int _type = K_PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:35:13: ( 'protected' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:35:15: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_PROTECTED"

    // $ANTLR start "K_PUBLIC"
    public final void mK_PUBLIC() throws RecognitionException {
        try {
            int _type = K_PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:36:10: ( 'public' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:36:12: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_PUBLIC"

    // $ANTLR start "K_RETURN"
    public final void mK_RETURN() throws RecognitionException {
        try {
            int _type = K_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:37:10: ( 'return' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:37:12: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_RETURN"

    // $ANTLR start "K_SHORT"
    public final void mK_SHORT() throws RecognitionException {
        try {
            int _type = K_SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:38:9: ( 'short' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:38:11: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_SHORT"

    // $ANTLR start "K_STATIC"
    public final void mK_STATIC() throws RecognitionException {
        try {
            int _type = K_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:39:10: ( 'static' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:39:12: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_STATIC"

    // $ANTLR start "K_SUPER"
    public final void mK_SUPER() throws RecognitionException {
        try {
            int _type = K_SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:9: ( 'super' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:11: 'super'
            {
            match("super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_SUPER"

    // $ANTLR start "K_SYNCHRONIZED"
    public final void mK_SYNCHRONIZED() throws RecognitionException {
        try {
            int _type = K_SYNCHRONIZED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:41:16: ( 'synchronized' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:41:18: 'synchronized'
            {
            match("synchronized"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_SYNCHRONIZED"

    // $ANTLR start "K_THIS"
    public final void mK_THIS() throws RecognitionException {
        try {
            int _type = K_THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:42:8: ( 'this' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:42:10: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_THIS"

    // $ANTLR start "K_THROW"
    public final void mK_THROW() throws RecognitionException {
        try {
            int _type = K_THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:43:9: ( 'throw' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:43:11: 'throw'
            {
            match("throw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_THROW"

    // $ANTLR start "K_THROWS"
    public final void mK_THROWS() throws RecognitionException {
        try {
            int _type = K_THROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:44:10: ( 'throws' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:44:12: 'throws'
            {
            match("throws"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_THROWS"

    // $ANTLR start "K_TRANSIENT"
    public final void mK_TRANSIENT() throws RecognitionException {
        try {
            int _type = K_TRANSIENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:45:13: ( 'transient' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:45:15: 'transient'
            {
            match("transient"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_TRANSIENT"

    // $ANTLR start "K_TRUE"
    public final void mK_TRUE() throws RecognitionException {
        try {
            int _type = K_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:46:8: ( 'true' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:46:10: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_TRUE"

    // $ANTLR start "K_TRY"
    public final void mK_TRY() throws RecognitionException {
        try {
            int _type = K_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:47:7: ( 'try' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:47:9: 'try'
            {
            match("try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_TRY"

    // $ANTLR start "K_VOID"
    public final void mK_VOID() throws RecognitionException {
        try {
            int _type = K_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:48:8: ( 'void' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:48:10: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_VOID"

    // $ANTLR start "K_VOLATILE"
    public final void mK_VOLATILE() throws RecognitionException {
        try {
            int _type = K_VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:49:12: ( 'volatile' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:49:14: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_VOLATILE"

    // $ANTLR start "K_WHILE"
    public final void mK_WHILE() throws RecognitionException {
        try {
            int _type = K_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:50:9: ( 'while' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:50:11: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_WHILE"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:51:7: ( '!' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:51:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:52:7: ( '&' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:52:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:53:7: ( '(' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:53:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:54:7: ( ')' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:54:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:55:7: ( '*' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:55:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:56:7: ( '+' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:56:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:57:7: ( ',' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:57:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:58:7: ( '-' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:58:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:59:7: ( '.' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:59:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:60:7: ( '/' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:60:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:61:7: ( ':' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:61:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:62:7: ( ';' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:62:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:63:7: ( '<' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:63:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:64:7: ( '=' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:64:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:65:7: ( '>' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:65:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:66:7: ( '?' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:66:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:67:7: ( '@' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:67:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:68:7: ( '[' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:68:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:69:7: ( ']' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:69:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:70:7: ( '^' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:70:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:71:7: ( '{' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:71:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:72:7: ( '|' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:72:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:73:7: ( '}' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:73:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:7: ( '~' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:67:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:67:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:67:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:70:5: ( ( '0' .. '9' )+ )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:70:7: ( '0' .. '9' )+
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:70:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:2: ( ( '0' .. '9' )+ ( 'L' | 'l' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:4: ( '0' .. '9' )+ ( 'L' | 'l' )
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:4: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:78:2: ( '0x' ( HEX_DIGIT )+ )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:78:4: '0x' ( HEX_DIGIT )+
            {
            match("0x"); 



            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:78:9: ( HEX_DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'F')||(LA4_0 >= 'a' && LA4_0 <= 'f')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:82:5: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT ) ( 'F' | 'f' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:82:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT ) ( 'F' | 'f' )
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:82:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:82:8: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:82:8: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:82:24: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:82:36: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:82:36: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:13: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:25: ( EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:9: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:88:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:88:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:88:7: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:88:23: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:88:35: ( EXPONENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:88:35: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:89:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:89:13: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:89:25: ( EXPONENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:89:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:90:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:90:9: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='/') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='/') ) {
                    alt22=1;
                }
                else if ( (LA22_1=='*') ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:14: (~ ( '\\n' | '\\r' ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:28: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:95:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:95:14: ( options {greedy=false; } : . )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='*') ) {
                            int LA21_1 = input.LA(2);

                            if ( (LA21_1=='/') ) {
                                alt21=2;
                            }
                            else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '.')||(LA21_1 >= '0' && LA21_1 <= '\uFFFF')) ) {
                                alt21=1;
                            }


                        }
                        else if ( ((LA21_0 >= '\u0000' && LA21_0 <= ')')||(LA21_0 >= '+' && LA21_0 <= '\uFFFF')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:95:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:98:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:98:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:106:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:106:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:106:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\\') ) {
                    alt23=1;
                }
                else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '!')||(LA23_0 >= '#' && LA23_0 <= '[')||(LA23_0 >= ']' && LA23_0 <= '\uFFFF')) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:106:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:106:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:109:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )* '\\'' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:109:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match('\''); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:109:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\\') ) {
                    alt24=1;
                }
                else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '&')||(LA24_0 >= '(' && LA24_0 <= '[')||(LA24_0 >= ']' && LA24_0 <= '\uFFFF')) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:109:15: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:109:25: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:114:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:114:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:114:22: ( '+' | '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='+'||LA25_0=='-') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:114:33: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:117:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:121:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt27=1;
                    }
                    break;
                case 'u':
                    {
                    alt27=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt27=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:121:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:122:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:128:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1 >= '0' && LA28_1 <= '3')) ) {
                    int LA28_2 = input.LA(3);

                    if ( ((LA28_2 >= '0' && LA28_2 <= '7')) ) {
                        int LA28_4 = input.LA(4);

                        if ( ((LA28_4 >= '0' && LA28_4 <= '7')) ) {
                            alt28=1;
                        }
                        else {
                            alt28=2;
                        }
                    }
                    else {
                        alt28=3;
                    }
                }
                else if ( ((LA28_1 >= '4' && LA28_1 <= '7')) ) {
                    int LA28_3 = input.LA(3);

                    if ( ((LA28_3 >= '0' && LA28_3 <= '7')) ) {
                        alt28=2;
                    }
                    else {
                        alt28=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:128:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:129:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:130:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:135:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:135:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:8: ( K_ABSTRACT | K_BOOLEAN | K_BREAK | K_BYTE | K_CATCH | K_CHAR | K_CLASS | K_CONTINUE | K_DO | K_DOUBLE | K_ELSE | K_EXTENDS | K_FALSE | K_FINAL | K_FINALLY | K_FLOAT | K_FOR | K_IF | K_IMPLEMENTS | K_IMPORT | K_INSTANCEOF | K_INT | K_INTERFACE | K_LONG | K_NATIVE | K_NEW | K_NULL | K_PACKAGE | K_PRIVATE | K_PROTECTED | K_PUBLIC | K_RETURN | K_SHORT | K_STATIC | K_SUPER | K_SYNCHRONIZED | K_THIS | K_THROW | K_THROWS | K_TRANSIENT | K_TRUE | K_TRY | K_VOID | K_VOLATILE | K_WHILE | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | ID | INT | LONG | HEX | FLOAT | DOUBLE | COMMENT | WS | STRING | CHAR )
        int alt29=79;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:10: K_ABSTRACT
                {
                mK_ABSTRACT(); 


                }
                break;
            case 2 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:21: K_BOOLEAN
                {
                mK_BOOLEAN(); 


                }
                break;
            case 3 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:31: K_BREAK
                {
                mK_BREAK(); 


                }
                break;
            case 4 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:39: K_BYTE
                {
                mK_BYTE(); 


                }
                break;
            case 5 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:46: K_CATCH
                {
                mK_CATCH(); 


                }
                break;
            case 6 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:54: K_CHAR
                {
                mK_CHAR(); 


                }
                break;
            case 7 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:61: K_CLASS
                {
                mK_CLASS(); 


                }
                break;
            case 8 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:69: K_CONTINUE
                {
                mK_CONTINUE(); 


                }
                break;
            case 9 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:80: K_DO
                {
                mK_DO(); 


                }
                break;
            case 10 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:85: K_DOUBLE
                {
                mK_DOUBLE(); 


                }
                break;
            case 11 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:94: K_ELSE
                {
                mK_ELSE(); 


                }
                break;
            case 12 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:101: K_EXTENDS
                {
                mK_EXTENDS(); 


                }
                break;
            case 13 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:111: K_FALSE
                {
                mK_FALSE(); 


                }
                break;
            case 14 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:119: K_FINAL
                {
                mK_FINAL(); 


                }
                break;
            case 15 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:127: K_FINALLY
                {
                mK_FINALLY(); 


                }
                break;
            case 16 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:137: K_FLOAT
                {
                mK_FLOAT(); 


                }
                break;
            case 17 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:145: K_FOR
                {
                mK_FOR(); 


                }
                break;
            case 18 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:151: K_IF
                {
                mK_IF(); 


                }
                break;
            case 19 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:156: K_IMPLEMENTS
                {
                mK_IMPLEMENTS(); 


                }
                break;
            case 20 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:169: K_IMPORT
                {
                mK_IMPORT(); 


                }
                break;
            case 21 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:178: K_INSTANCEOF
                {
                mK_INSTANCEOF(); 


                }
                break;
            case 22 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:191: K_INT
                {
                mK_INT(); 


                }
                break;
            case 23 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:197: K_INTERFACE
                {
                mK_INTERFACE(); 


                }
                break;
            case 24 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:209: K_LONG
                {
                mK_LONG(); 


                }
                break;
            case 25 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:216: K_NATIVE
                {
                mK_NATIVE(); 


                }
                break;
            case 26 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:225: K_NEW
                {
                mK_NEW(); 


                }
                break;
            case 27 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:231: K_NULL
                {
                mK_NULL(); 


                }
                break;
            case 28 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:238: K_PACKAGE
                {
                mK_PACKAGE(); 


                }
                break;
            case 29 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:248: K_PRIVATE
                {
                mK_PRIVATE(); 


                }
                break;
            case 30 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:258: K_PROTECTED
                {
                mK_PROTECTED(); 


                }
                break;
            case 31 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:270: K_PUBLIC
                {
                mK_PUBLIC(); 


                }
                break;
            case 32 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:279: K_RETURN
                {
                mK_RETURN(); 


                }
                break;
            case 33 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:288: K_SHORT
                {
                mK_SHORT(); 


                }
                break;
            case 34 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:296: K_STATIC
                {
                mK_STATIC(); 


                }
                break;
            case 35 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:305: K_SUPER
                {
                mK_SUPER(); 


                }
                break;
            case 36 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:313: K_SYNCHRONIZED
                {
                mK_SYNCHRONIZED(); 


                }
                break;
            case 37 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:328: K_THIS
                {
                mK_THIS(); 


                }
                break;
            case 38 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:335: K_THROW
                {
                mK_THROW(); 


                }
                break;
            case 39 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:343: K_THROWS
                {
                mK_THROWS(); 


                }
                break;
            case 40 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:352: K_TRANSIENT
                {
                mK_TRANSIENT(); 


                }
                break;
            case 41 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:364: K_TRUE
                {
                mK_TRUE(); 


                }
                break;
            case 42 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:371: K_TRY
                {
                mK_TRY(); 


                }
                break;
            case 43 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:377: K_VOID
                {
                mK_VOID(); 


                }
                break;
            case 44 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:384: K_VOLATILE
                {
                mK_VOLATILE(); 


                }
                break;
            case 45 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:395: K_WHILE
                {
                mK_WHILE(); 


                }
                break;
            case 46 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:403: T__64
                {
                mT__64(); 


                }
                break;
            case 47 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:409: T__65
                {
                mT__65(); 


                }
                break;
            case 48 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:415: T__66
                {
                mT__66(); 


                }
                break;
            case 49 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:421: T__67
                {
                mT__67(); 


                }
                break;
            case 50 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:427: T__68
                {
                mT__68(); 


                }
                break;
            case 51 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:433: T__69
                {
                mT__69(); 


                }
                break;
            case 52 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:439: T__70
                {
                mT__70(); 


                }
                break;
            case 53 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:445: T__71
                {
                mT__71(); 


                }
                break;
            case 54 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:451: T__72
                {
                mT__72(); 


                }
                break;
            case 55 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:457: T__73
                {
                mT__73(); 


                }
                break;
            case 56 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:463: T__74
                {
                mT__74(); 


                }
                break;
            case 57 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:469: T__75
                {
                mT__75(); 


                }
                break;
            case 58 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:475: T__76
                {
                mT__76(); 


                }
                break;
            case 59 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:481: T__77
                {
                mT__77(); 


                }
                break;
            case 60 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:487: T__78
                {
                mT__78(); 


                }
                break;
            case 61 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:493: T__79
                {
                mT__79(); 


                }
                break;
            case 62 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:499: T__80
                {
                mT__80(); 


                }
                break;
            case 63 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:505: T__81
                {
                mT__81(); 


                }
                break;
            case 64 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:511: T__82
                {
                mT__82(); 


                }
                break;
            case 65 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:517: T__83
                {
                mT__83(); 


                }
                break;
            case 66 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:523: T__84
                {
                mT__84(); 


                }
                break;
            case 67 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:529: T__85
                {
                mT__85(); 


                }
                break;
            case 68 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:535: T__86
                {
                mT__86(); 


                }
                break;
            case 69 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:541: T__87
                {
                mT__87(); 


                }
                break;
            case 70 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:547: ID
                {
                mID(); 


                }
                break;
            case 71 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:550: INT
                {
                mINT(); 


                }
                break;
            case 72 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:554: LONG
                {
                mLONG(); 


                }
                break;
            case 73 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:559: HEX
                {
                mHEX(); 


                }
                break;
            case 74 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:563: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 75 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:569: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 76 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:576: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 77 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:584: WS
                {
                mWS(); 


                }
                break;
            case 78 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:587: STRING
                {
                mSTRING(); 


                }
                break;
            case 79 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:594: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA11_eotS =
        "\5\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "82:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )";
        }
    }
    static final String DFA18_eotS =
        "\5\uffff";
    static final String DFA18_eofS =
        "\5\uffff";
    static final String DFA18_minS =
        "\2\56\3\uffff";
    static final String DFA18_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA18_specialS =
        "\5\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "87:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA29_eotS =
        "\1\uffff\17\50\10\uffff\1\120\1\123\17\uffff\2\125\3\uffff\10\50"+
        "\1\142\6\50\1\151\22\50\1\uffff\1\u0084\5\uffff\1\u0084\1\uffff"+
        "\11\50\1\uffff\5\50\1\u0097\1\uffff\2\50\1\u009c\2\50\1\u009f\16"+
        "\50\1\u00ae\3\50\3\uffff\1\u0084\2\uffff\1\u0084\3\50\1\u00b9\1"+
        "\50\1\u00bb\3\50\1\u00bf\4\50\1\uffff\4\50\1\uffff\1\u00c8\1\50"+
        "\1\uffff\1\u00ca\11\50\1\u00d4\2\50\1\u00d7\1\uffff\1\u00d8\2\50"+
        "\1\uffff\1\u0084\1\uffff\1\u0084\2\50\1\u00dd\1\uffff\1\u00de\1"+
        "\uffff\1\u00df\2\50\1\uffff\1\50\1\u00e3\1\u00e5\1\u00e6\4\50\1"+
        "\uffff\1\50\1\uffff\5\50\1\u00f1\1\50\1\u00f3\1\50\1\uffff\1\u00f6"+
        "\1\50\2\uffff\1\50\1\u00f9\2\50\3\uffff\1\50\1\u00fd\1\50\1\uffff"+
        "\1\50\2\uffff\1\50\1\u0101\2\50\1\u0104\3\50\1\u0108\1\u0109\1\uffff"+
        "\1\u010a\1\uffff\1\50\1\u010c\1\uffff\2\50\1\uffff\1\50\1\u0110"+
        "\1\50\1\uffff\1\u0112\1\u0113\1\50\1\uffff\2\50\1\uffff\1\u0117"+
        "\1\u0118\1\50\3\uffff\1\50\1\uffff\2\50\1\u011d\1\uffff\1\u011e"+
        "\2\uffff\3\50\2\uffff\3\50\1\u0125\2\uffff\2\50\1\u0128\1\u0129"+
        "\1\50\1\u012b\1\uffff\1\u012c\1\u012d\2\uffff\1\50\3\uffff\1\50"+
        "\1\u0130\1\uffff";
    static final String DFA29_eofS =
        "\u0131\uffff";
    static final String DFA29_minS =
        "\1\11\1\142\1\157\1\141\1\157\1\154\1\141\1\146\1\157\2\141\1\145"+
        "\2\150\1\157\1\150\10\uffff\1\60\1\52\17\uffff\2\56\3\uffff\1\163"+
        "\1\157\1\145\2\164\2\141\1\156\1\60\1\163\1\164\1\154\1\156\1\157"+
        "\1\162\1\60\1\160\1\163\1\156\1\164\1\167\1\154\1\143\1\151\1\142"+
        "\1\164\1\157\1\141\1\160\1\156\1\151\1\141\2\151\1\uffff\1\60\5"+
        "\uffff\1\60\1\53\1\164\1\154\1\141\1\145\1\143\1\162\1\163\1\164"+
        "\1\142\1\uffff\2\145\1\163\2\141\1\60\1\uffff\1\154\1\164\1\60\1"+
        "\147\1\151\1\60\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164"+
        "\1\145\1\143\1\163\1\157\1\156\1\145\1\60\1\144\1\141\1\154\1\53"+
        "\2\uffff\1\60\1\53\2\60\1\162\1\145\1\153\1\60\1\150\1\60\1\163"+
        "\1\151\1\154\1\60\1\156\1\145\1\154\1\164\1\uffff\1\145\1\162\1"+
        "\141\1\162\1\uffff\1\60\1\166\1\uffff\1\60\2\141\1\145\1\151\1\162"+
        "\1\164\1\151\1\162\1\150\1\60\1\167\1\163\1\60\1\uffff\1\60\1\164"+
        "\1\145\4\60\2\141\1\60\1\uffff\1\60\1\uffff\1\60\1\156\1\145\1\uffff"+
        "\1\144\3\60\1\155\1\164\1\156\1\146\1\uffff\1\145\1\uffff\1\147"+
        "\1\164\2\143\1\156\1\60\1\143\1\60\1\162\1\uffff\1\60\1\151\2\uffff"+
        "\1\151\1\60\1\143\1\156\3\uffff\1\165\1\60\1\163\1\uffff\1\171\2"+
        "\uffff\1\145\1\60\1\143\1\141\1\60\2\145\1\164\2\60\1\uffff\1\60"+
        "\1\uffff\1\157\1\60\1\uffff\1\145\1\154\1\uffff\1\164\1\60\1\145"+
        "\1\uffff\2\60\1\156\1\uffff\1\145\1\143\1\uffff\2\60\1\145\3\uffff"+
        "\1\156\1\uffff\1\156\1\145\1\60\1\uffff\1\60\2\uffff\1\164\1\157"+
        "\1\145\2\uffff\1\144\1\151\1\164\1\60\2\uffff\1\163\1\146\2\60\1"+
        "\172\1\60\1\uffff\2\60\2\uffff\1\145\3\uffff\1\144\1\60\1\uffff";
    static final String DFA29_maxS =
        "\1\176\1\142\1\171\2\157\1\170\1\157\1\156\1\157\2\165\1\145\1\171"+
        "\1\162\1\157\1\150\10\uffff\1\71\1\57\17\uffff\1\170\1\154\3\uffff"+
        "\1\163\1\157\1\145\2\164\2\141\1\156\1\172\1\163\1\164\1\154\1\156"+
        "\1\157\1\162\1\172\1\160\1\164\1\156\1\164\1\167\1\154\1\143\1\157"+
        "\1\142\1\164\1\157\1\141\1\160\1\156\1\162\1\171\1\154\1\151\1\uffff"+
        "\1\146\5\uffff\1\146\1\71\1\164\1\154\1\141\1\145\1\143\1\162\1"+
        "\163\1\164\1\142\1\uffff\2\145\1\163\2\141\1\172\1\uffff\1\157\1"+
        "\164\1\172\1\147\1\151\1\172\1\154\1\153\1\166\1\164\1\154\1\165"+
        "\1\162\1\164\1\145\1\143\1\163\1\157\1\156\1\145\1\172\1\144\1\141"+
        "\1\154\1\71\2\uffff\1\146\2\71\1\146\1\162\1\145\1\153\1\172\1\150"+
        "\1\172\1\163\1\151\1\154\1\172\1\156\1\145\1\154\1\164\1\uffff\1"+
        "\145\1\162\1\141\1\162\1\uffff\1\172\1\166\1\uffff\1\172\2\141\1"+
        "\145\1\151\1\162\1\164\1\151\1\162\1\150\1\172\1\167\1\163\1\172"+
        "\1\uffff\1\172\1\164\1\145\1\71\1\146\1\71\1\146\2\141\1\172\1\uffff"+
        "\1\172\1\uffff\1\172\1\156\1\145\1\uffff\1\144\3\172\1\155\1\164"+
        "\1\156\1\146\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156\1\172"+
        "\1\143\1\172\1\162\1\uffff\1\172\1\151\2\uffff\1\151\1\172\1\143"+
        "\1\156\3\uffff\1\165\1\172\1\163\1\uffff\1\171\2\uffff\1\145\1\172"+
        "\1\143\1\141\1\172\2\145\1\164\2\172\1\uffff\1\172\1\uffff\1\157"+
        "\1\172\1\uffff\1\145\1\154\1\uffff\1\164\1\172\1\145\1\uffff\2\172"+
        "\1\156\1\uffff\1\145\1\143\1\uffff\2\172\1\145\3\uffff\1\156\1\uffff"+
        "\1\156\1\145\1\172\1\uffff\1\172\2\uffff\1\164\1\157\1\145\2\uffff"+
        "\1\144\1\151\1\164\1\172\2\uffff\1\163\1\146\4\172\1\uffff\2\172"+
        "\2\uffff\1\145\3\uffff\1\144\1\172\1\uffff";
    static final String DFA29_acceptS =
        "\20\uffff\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\2\uffff\1\70\1"+
        "\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104"+
        "\1\105\1\106\2\uffff\1\115\1\116\1\117\42\uffff\1\66\1\uffff\1\114"+
        "\1\67\1\111\1\107\1\110\13\uffff\1\11\6\uffff\1\22\31\uffff\1\112"+
        "\1\113\22\uffff\1\21\4\uffff\1\26\2\uffff\1\32\16\uffff\1\52\12"+
        "\uffff\1\4\1\uffff\1\6\3\uffff\1\13\10\uffff\1\30\1\uffff\1\33\11"+
        "\uffff\1\45\2\uffff\1\51\1\53\4\uffff\1\3\1\5\1\7\3\uffff\1\15\1"+
        "\uffff\1\16\1\20\12\uffff\1\41\1\uffff\1\43\2\uffff\1\46\2\uffff"+
        "\1\55\3\uffff\1\12\3\uffff\1\24\2\uffff\1\31\3\uffff\1\37\1\40\1"+
        "\42\1\uffff\1\47\3\uffff\1\2\1\uffff\1\14\1\17\3\uffff\1\34\1\35"+
        "\4\uffff\1\1\1\10\6\uffff\1\54\2\uffff\1\27\1\36\1\uffff\1\50\1"+
        "\23\1\25\2\uffff\1\44";
    static final String DFA29_specialS =
        "\u0131\uffff}>";
    static final String[] DFA29_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\20\1\54\3\uffff\1\21\1\55"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\51\11\52\1\32\1\33"+
            "\1\34\1\35\1\36\1\37\1\40\32\50\1\41\1\uffff\1\42\1\43\1\50"+
            "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\50\1\7\2\50\1\10\1\50\1\11"+
            "\1\50\1\12\1\50\1\13\1\14\1\15\1\50\1\16\1\17\3\50\1\44\1\45"+
            "\1\46\1\47",
            "\1\56",
            "\1\57\2\uffff\1\60\6\uffff\1\61",
            "\1\62\6\uffff\1\63\3\uffff\1\64\2\uffff\1\65",
            "\1\66",
            "\1\67\13\uffff\1\70",
            "\1\71\7\uffff\1\72\2\uffff\1\73\2\uffff\1\74",
            "\1\75\6\uffff\1\76\1\77",
            "\1\100",
            "\1\101\3\uffff\1\102\17\uffff\1\103",
            "\1\104\20\uffff\1\105\2\uffff\1\106",
            "\1\107",
            "\1\110\13\uffff\1\111\1\112\3\uffff\1\113",
            "\1\114\11\uffff\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\121",
            "\1\122\4\uffff\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127\1\uffff\12\52\13\uffff\1\130\6\uffff\1\126\30\uffff"+
            "\1\130\6\uffff\1\126\13\uffff\1\124",
            "\1\127\1\uffff\12\52\13\uffff\1\130\6\uffff\1\126\30\uffff"+
            "\1\130\6\uffff\1\126",
            "",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\141\5\50",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\152",
            "\1\153\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162\5\uffff\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172\10\uffff\1\173",
            "\1\174\23\uffff\1\175\3\uffff\1\176",
            "\1\177\2\uffff\1\u0080",
            "\1\u0081",
            "",
            "\12\121\13\uffff\1\u0082\1\u0083\36\uffff\1\u0082\1\u0083",
            "",
            "",
            "",
            "",
            "",
            "\12\u0085\13\uffff\1\u0086\1\u0083\36\uffff\1\u0086\1\u0083",
            "\1\u0087\1\uffff\1\u0087\2\uffff\12\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0098\2\uffff\1\u0099",
            "\1\u009a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u009b\25\50",
            "\1\u009d",
            "\1\u009e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\1\uffff\1\u00b2\2\uffff\12\u00b3",
            "",
            "",
            "\12\u0085\13\uffff\1\u0086\1\u0083\36\uffff\1\u0086\1\u0083",
            "\1\u00b4\1\uffff\1\u00b4\2\uffff\12\u00b5",
            "\12\u0088",
            "\12\u0088\14\uffff\1\u0083\37\uffff\1\u0083",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ba",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c9",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d5",
            "\1\u00d6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d9",
            "\1\u00da",
            "\12\u00b3",
            "\12\u00b3\14\uffff\1\u0083\37\uffff\1\u0083",
            "\12\u00b5",
            "\12\u00b5\14\uffff\1\u0083\37\uffff\1\u0083",
            "\1\u00db",
            "\1\u00dc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\u00e4\16"+
            "\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00f2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00f4",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00f5\7\50",
            "\1\u00f7",
            "",
            "",
            "\1\u00f8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "",
            "\1\u00fc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "",
            "",
            "\1\u0100",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0102",
            "\1\u0103",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u010b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0111",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0119",
            "",
            "",
            "",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u0126",
            "\1\u0127",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u012a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u012e",
            "",
            "",
            "",
            "\1\u012f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( K_ABSTRACT | K_BOOLEAN | K_BREAK | K_BYTE | K_CATCH | K_CHAR | K_CLASS | K_CONTINUE | K_DO | K_DOUBLE | K_ELSE | K_EXTENDS | K_FALSE | K_FINAL | K_FINALLY | K_FLOAT | K_FOR | K_IF | K_IMPLEMENTS | K_IMPORT | K_INSTANCEOF | K_INT | K_INTERFACE | K_LONG | K_NATIVE | K_NEW | K_NULL | K_PACKAGE | K_PRIVATE | K_PROTECTED | K_PUBLIC | K_RETURN | K_SHORT | K_STATIC | K_SUPER | K_SYNCHRONIZED | K_THIS | K_THROW | K_THROWS | K_TRANSIENT | K_TRUE | K_TRY | K_VOID | K_VOLATILE | K_WHILE | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | ID | INT | LONG | HEX | FLOAT | DOUBLE | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}