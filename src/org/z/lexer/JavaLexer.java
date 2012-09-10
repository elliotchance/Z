// $ANTLR 3.4 /Users/elliot/NetBeansProjects/Z/grammar/Java.g 2012-09-10 23:15:06

	package org.z.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int DOUBLE=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int FLOAT=9;
    public static final int HEX=10;
    public static final int HEX_DIGIT=11;
    public static final int HEX_LONG=12;
    public static final int ID=13;
    public static final int INT=14;
    public static final int K_ABSTRACT=15;
    public static final int K_ASSERT=16;
    public static final int K_BOOLEAN=17;
    public static final int K_BREAK=18;
    public static final int K_BYTE=19;
    public static final int K_CASE=20;
    public static final int K_CATCH=21;
    public static final int K_CHAR=22;
    public static final int K_CLASS=23;
    public static final int K_CONTINUE=24;
    public static final int K_DEFAULT=25;
    public static final int K_DO=26;
    public static final int K_DOUBLE=27;
    public static final int K_ELSE=28;
    public static final int K_ENUM=29;
    public static final int K_EXTENDS=30;
    public static final int K_FALSE=31;
    public static final int K_FINAL=32;
    public static final int K_FINALLY=33;
    public static final int K_FLOAT=34;
    public static final int K_FOR=35;
    public static final int K_IF=36;
    public static final int K_IMPLEMENTS=37;
    public static final int K_IMPORT=38;
    public static final int K_INSTANCEOF=39;
    public static final int K_INT=40;
    public static final int K_INTERFACE=41;
    public static final int K_LONG=42;
    public static final int K_NATIVE=43;
    public static final int K_NEW=44;
    public static final int K_NULL=45;
    public static final int K_PACKAGE=46;
    public static final int K_PRIVATE=47;
    public static final int K_PROTECTED=48;
    public static final int K_PUBLIC=49;
    public static final int K_RETURN=50;
    public static final int K_SHORT=51;
    public static final int K_STATIC=52;
    public static final int K_SUPER=53;
    public static final int K_SWITCH=54;
    public static final int K_SYNCHRONIZED=55;
    public static final int K_THIS=56;
    public static final int K_THROW=57;
    public static final int K_THROWS=58;
    public static final int K_TRANSIENT=59;
    public static final int K_TRUE=60;
    public static final int K_TRY=61;
    public static final int K_VOID=62;
    public static final int K_VOLATILE=63;
    public static final int K_WHILE=64;
    public static final int LONG=65;
    public static final int OCTAL_ESC=66;
    public static final int STRING=67;
    public static final int UNICODE_ESC=68;
    public static final int WS=69;

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

    // $ANTLR start "K_ASSERT"
    public final void mK_ASSERT() throws RecognitionException {
        try {
            int _type = K_ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:7:10: ( 'assert' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:7:12: 'assert'
            {
            match("assert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_ASSERT"

    // $ANTLR start "K_BOOLEAN"
    public final void mK_BOOLEAN() throws RecognitionException {
        try {
            int _type = K_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:8:11: ( 'boolean' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:8:13: 'boolean'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:9:9: ( 'break' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:9:11: 'break'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:10:8: ( 'byte' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:10:10: 'byte'
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

    // $ANTLR start "K_CASE"
    public final void mK_CASE() throws RecognitionException {
        try {
            int _type = K_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:11:8: ( 'case' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:11:10: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_CASE"

    // $ANTLR start "K_CATCH"
    public final void mK_CATCH() throws RecognitionException {
        try {
            int _type = K_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:12:9: ( 'catch' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:12:11: 'catch'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:13:8: ( 'char' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:13:10: 'char'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:14:9: ( 'class' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:14:11: 'class'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:15:12: ( 'continue' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:15:14: 'continue'
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

    // $ANTLR start "K_DEFAULT"
    public final void mK_DEFAULT() throws RecognitionException {
        try {
            int _type = K_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:16:11: ( 'default' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:16:13: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_DEFAULT"

    // $ANTLR start "K_DO"
    public final void mK_DO() throws RecognitionException {
        try {
            int _type = K_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:17:6: ( 'do' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:17:8: 'do'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:18:10: ( 'double' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:18:12: 'double'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:19:8: ( 'else' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:19:10: 'else'
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

    // $ANTLR start "K_ENUM"
    public final void mK_ENUM() throws RecognitionException {
        try {
            int _type = K_ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:20:8: ( 'enum' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:20:10: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_ENUM"

    // $ANTLR start "K_EXTENDS"
    public final void mK_EXTENDS() throws RecognitionException {
        try {
            int _type = K_EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:21:11: ( 'extends' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:21:13: 'extends'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:22:9: ( 'false' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:22:11: 'false'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:23:9: ( 'final' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:23:11: 'final'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:24:11: ( 'finally' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:24:13: 'finally'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:25:9: ( 'float' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:25:11: 'float'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:26:7: ( 'for' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:26:9: 'for'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:27:6: ( 'if' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:27:8: 'if'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:28:14: ( 'implements' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:28:16: 'implements'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:29:10: ( 'import' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:29:12: 'import'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:30:14: ( 'instanceof' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:30:16: 'instanceof'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:31:7: ( 'int' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:31:9: 'int'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:32:13: ( 'interface' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:32:15: 'interface'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:33:8: ( 'long' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:33:10: 'long'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:34:10: ( 'native' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:34:12: 'native'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:35:7: ( 'new' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:35:9: 'new'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:36:8: ( 'null' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:36:10: 'null'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:37:11: ( 'package' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:37:13: 'package'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:38:11: ( 'private' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:38:13: 'private'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:39:13: ( 'protected' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:39:15: 'protected'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:10: ( 'public' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:12: 'public'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:41:10: ( 'return' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:41:12: 'return'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:42:9: ( 'short' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:42:11: 'short'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:43:10: ( 'static' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:43:12: 'static'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:44:9: ( 'super' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:44:11: 'super'
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

    // $ANTLR start "K_SWITCH"
    public final void mK_SWITCH() throws RecognitionException {
        try {
            int _type = K_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:45:10: ( 'switch' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:45:12: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_SWITCH"

    // $ANTLR start "K_SYNCHRONIZED"
    public final void mK_SYNCHRONIZED() throws RecognitionException {
        try {
            int _type = K_SYNCHRONIZED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:46:16: ( 'synchronized' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:46:18: 'synchronized'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:47:8: ( 'this' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:47:10: 'this'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:48:9: ( 'throw' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:48:11: 'throw'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:49:10: ( 'throws' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:49:12: 'throws'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:50:13: ( 'transient' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:50:15: 'transient'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:51:8: ( 'true' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:51:10: 'true'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:52:7: ( 'try' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:52:9: 'try'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:53:8: ( 'void' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:53:10: 'void'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:54:12: ( 'volatile' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:54:14: 'volatile'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:55:9: ( 'while' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:55:11: 'while'
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

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:56:7: ( '!' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:56:9: '!'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:57:7: ( '%' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:57:9: '%'
            {
            match('%'); 

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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:58:7: ( '&' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:58:9: '&'
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:59:7: ( '(' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:59:9: '('
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:60:7: ( ')' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:60:9: ')'
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:61:7: ( '*' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:61:9: '*'
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:62:7: ( '+' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:62:9: '+'
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:63:7: ( ',' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:63:9: ','
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:64:7: ( '-' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:64:9: '-'
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:65:7: ( '.' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:65:9: '.'
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
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:66:7: ( '/' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:66:9: '/'
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:67:7: ( ':' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:67:9: ':'
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:68:7: ( ';' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:68:9: ';'
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:69:7: ( '<' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:69:9: '<'
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
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:70:7: ( '=' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:70:9: '='
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:71:7: ( '>' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:71:9: '>'
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:72:7: ( '?' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:72:9: '?'
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:73:7: ( '@' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:73:9: '@'
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:7: ( '[' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:9: '['
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:75:7: ( ']' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:75:9: ']'
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:76:7: ( '^' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:76:9: '^'
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:77:7: ( '{' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:77:9: '{'
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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:78:7: ( '|' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:78:9: '|'
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:79:7: ( '}' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:79:9: '}'
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:80:7: ( '~' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:80:9: '~'
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
    // $ANTLR end "T__94"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:72:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:72:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:72:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:75:5: ( ( '0' .. '9' )+ )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:75:7: ( '0' .. '9' )+
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:75:7: ( '0' .. '9' )+
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:79:2: ( ( '0' .. '9' )+ ( 'L' | 'l' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:79:4: ( '0' .. '9' )+ ( 'L' | 'l' )
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:79:4: ( '0' .. '9' )+
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

    // $ANTLR start "HEX_LONG"
    public final void mHEX_LONG() throws RecognitionException {
        try {
            int _type = HEX_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:2: ( '0x' ( HEX_DIGIT )+ 'L' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:4: '0x' ( HEX_DIGIT )+ 'L'
            {
            match("0x"); 



            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:9: ( HEX_DIGIT )+
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


            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_LONG"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:87:2: ( '0x' ( HEX_DIGIT )+ )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:87:4: '0x' ( HEX_DIGIT )+
            {
            match("0x"); 



            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:87:9: ( HEX_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'F')||(LA5_0 >= 'a' && LA5_0 <= 'f')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:91:5: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT ) ( 'F' | 'f' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:91:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT ) ( 'F' | 'f' )
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:91:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:91:8: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:91:8: ( '0' .. '9' )+
                    int cnt6=0;
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:91:24: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
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
                    	    break loop7;
                        }
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:91:36: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:91:36: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:13: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:25: ( EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:93:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:93:9: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
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
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:7: ( '0' .. '9' )+
                    int cnt13=0;
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
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:23: ( '0' .. '9' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
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
                    	    break loop14;
                        }
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:35: ( EXPONENT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:35: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:98:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:98:13: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
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
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:98:25: ( EXPONENT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:98:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:99:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:99:9: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
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
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:103:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='/') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='/') ) {
                    alt23=1;
                }
                else if ( (LA23_1=='*') ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:103:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:103:14: (~ ( '\\n' | '\\r' ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\t')||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||(LA20_0 >= '\u000E' && LA20_0 <= '\uFFFF')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
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
                    	    break loop20;
                        }
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:103:28: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:103:28: '\\r'
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
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:104:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:104:14: ( options {greedy=false; } : . )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='*') ) {
                            int LA22_1 = input.LA(2);

                            if ( (LA22_1=='/') ) {
                                alt22=2;
                            }
                            else if ( ((LA22_1 >= '\u0000' && LA22_1 <= '.')||(LA22_1 >= '0' && LA22_1 <= '\uFFFF')) ) {
                                alt22=1;
                            }


                        }
                        else if ( ((LA22_0 >= '\u0000' && LA22_0 <= ')')||(LA22_0 >= '+' && LA22_0 <= '\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:104:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:107:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:107:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:115:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:115:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:115:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\\') ) {
                    alt24=1;
                }
                else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '!')||(LA24_0 >= '#' && LA24_0 <= '[')||(LA24_0 >= ']' && LA24_0 <= '\uFFFF')) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:115:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:115:24: ~ ( '\\\\' | '\"' )
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
            	    break loop24;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:118:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )* '\\'' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:118:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match('\''); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:118:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\\') ) {
                    alt25=1;
                }
                else if ( ((LA25_0 >= '\u0000' && LA25_0 <= '&')||(LA25_0 >= '(' && LA25_0 <= '[')||(LA25_0 >= ']' && LA25_0 <= '\uFFFF')) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:118:15: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:118:25: ~ ( '\\'' | '\\\\' )
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
            	    break loop25;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:22: ( '+' | '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='+'||LA26_0=='-') ) {
                alt26=1;
            }
            switch (alt26) {
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


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:33: ( '0' .. '9' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0 >= '0' && LA27_0 <= '9')) ) {
                    alt27=1;
                }


                switch (alt27) {
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:126:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:130:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
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
                    alt28=1;
                    }
                    break;
                case 'u':
                    {
                    alt28=2;
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
                    alt28=3;
                    }
                    break;
                default:
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
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:130:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:131:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:132:9: OCTAL_ESC
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:137:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\\') ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1 >= '0' && LA29_1 <= '3')) ) {
                    int LA29_2 = input.LA(3);

                    if ( ((LA29_2 >= '0' && LA29_2 <= '7')) ) {
                        int LA29_4 = input.LA(4);

                        if ( ((LA29_4 >= '0' && LA29_4 <= '7')) ) {
                            alt29=1;
                        }
                        else {
                            alt29=2;
                        }
                    }
                    else {
                        alt29=3;
                    }
                }
                else if ( ((LA29_1 >= '4' && LA29_1 <= '7')) ) {
                    int LA29_3 = input.LA(3);

                    if ( ((LA29_3 >= '0' && LA29_3 <= '7')) ) {
                        alt29=2;
                    }
                    else {
                        alt29=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:137:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:138:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:139:9: '\\\\' ( '0' .. '7' )
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:144:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:144:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:8: ( K_ABSTRACT | K_ASSERT | K_BOOLEAN | K_BREAK | K_BYTE | K_CASE | K_CATCH | K_CHAR | K_CLASS | K_CONTINUE | K_DEFAULT | K_DO | K_DOUBLE | K_ELSE | K_ENUM | K_EXTENDS | K_FALSE | K_FINAL | K_FINALLY | K_FLOAT | K_FOR | K_IF | K_IMPLEMENTS | K_IMPORT | K_INSTANCEOF | K_INT | K_INTERFACE | K_LONG | K_NATIVE | K_NEW | K_NULL | K_PACKAGE | K_PRIVATE | K_PROTECTED | K_PUBLIC | K_RETURN | K_SHORT | K_STATIC | K_SUPER | K_SWITCH | K_SYNCHRONIZED | K_THIS | K_THROW | K_THROWS | K_TRANSIENT | K_TRUE | K_TRY | K_VOID | K_VOLATILE | K_WHILE | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | ID | INT | LONG | HEX_LONG | HEX | FLOAT | DOUBLE | COMMENT | WS | STRING | CHAR )
        int alt30=86;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:10: K_ABSTRACT
                {
                mK_ABSTRACT(); 


                }
                break;
            case 2 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:21: K_ASSERT
                {
                mK_ASSERT(); 


                }
                break;
            case 3 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:30: K_BOOLEAN
                {
                mK_BOOLEAN(); 


                }
                break;
            case 4 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:40: K_BREAK
                {
                mK_BREAK(); 


                }
                break;
            case 5 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:48: K_BYTE
                {
                mK_BYTE(); 


                }
                break;
            case 6 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:55: K_CASE
                {
                mK_CASE(); 


                }
                break;
            case 7 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:62: K_CATCH
                {
                mK_CATCH(); 


                }
                break;
            case 8 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:70: K_CHAR
                {
                mK_CHAR(); 


                }
                break;
            case 9 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:77: K_CLASS
                {
                mK_CLASS(); 


                }
                break;
            case 10 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:85: K_CONTINUE
                {
                mK_CONTINUE(); 


                }
                break;
            case 11 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:96: K_DEFAULT
                {
                mK_DEFAULT(); 


                }
                break;
            case 12 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:106: K_DO
                {
                mK_DO(); 


                }
                break;
            case 13 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:111: K_DOUBLE
                {
                mK_DOUBLE(); 


                }
                break;
            case 14 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:120: K_ELSE
                {
                mK_ELSE(); 


                }
                break;
            case 15 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:127: K_ENUM
                {
                mK_ENUM(); 


                }
                break;
            case 16 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:134: K_EXTENDS
                {
                mK_EXTENDS(); 


                }
                break;
            case 17 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:144: K_FALSE
                {
                mK_FALSE(); 


                }
                break;
            case 18 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:152: K_FINAL
                {
                mK_FINAL(); 


                }
                break;
            case 19 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:160: K_FINALLY
                {
                mK_FINALLY(); 


                }
                break;
            case 20 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:170: K_FLOAT
                {
                mK_FLOAT(); 


                }
                break;
            case 21 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:178: K_FOR
                {
                mK_FOR(); 


                }
                break;
            case 22 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:184: K_IF
                {
                mK_IF(); 


                }
                break;
            case 23 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:189: K_IMPLEMENTS
                {
                mK_IMPLEMENTS(); 


                }
                break;
            case 24 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:202: K_IMPORT
                {
                mK_IMPORT(); 


                }
                break;
            case 25 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:211: K_INSTANCEOF
                {
                mK_INSTANCEOF(); 


                }
                break;
            case 26 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:224: K_INT
                {
                mK_INT(); 


                }
                break;
            case 27 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:230: K_INTERFACE
                {
                mK_INTERFACE(); 


                }
                break;
            case 28 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:242: K_LONG
                {
                mK_LONG(); 


                }
                break;
            case 29 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:249: K_NATIVE
                {
                mK_NATIVE(); 


                }
                break;
            case 30 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:258: K_NEW
                {
                mK_NEW(); 


                }
                break;
            case 31 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:264: K_NULL
                {
                mK_NULL(); 


                }
                break;
            case 32 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:271: K_PACKAGE
                {
                mK_PACKAGE(); 


                }
                break;
            case 33 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:281: K_PRIVATE
                {
                mK_PRIVATE(); 


                }
                break;
            case 34 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:291: K_PROTECTED
                {
                mK_PROTECTED(); 


                }
                break;
            case 35 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:303: K_PUBLIC
                {
                mK_PUBLIC(); 


                }
                break;
            case 36 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:312: K_RETURN
                {
                mK_RETURN(); 


                }
                break;
            case 37 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:321: K_SHORT
                {
                mK_SHORT(); 


                }
                break;
            case 38 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:329: K_STATIC
                {
                mK_STATIC(); 


                }
                break;
            case 39 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:338: K_SUPER
                {
                mK_SUPER(); 


                }
                break;
            case 40 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:346: K_SWITCH
                {
                mK_SWITCH(); 


                }
                break;
            case 41 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:355: K_SYNCHRONIZED
                {
                mK_SYNCHRONIZED(); 


                }
                break;
            case 42 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:370: K_THIS
                {
                mK_THIS(); 


                }
                break;
            case 43 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:377: K_THROW
                {
                mK_THROW(); 


                }
                break;
            case 44 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:385: K_THROWS
                {
                mK_THROWS(); 


                }
                break;
            case 45 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:394: K_TRANSIENT
                {
                mK_TRANSIENT(); 


                }
                break;
            case 46 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:406: K_TRUE
                {
                mK_TRUE(); 


                }
                break;
            case 47 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:413: K_TRY
                {
                mK_TRY(); 


                }
                break;
            case 48 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:419: K_VOID
                {
                mK_VOID(); 


                }
                break;
            case 49 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:426: K_VOLATILE
                {
                mK_VOLATILE(); 


                }
                break;
            case 50 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:437: K_WHILE
                {
                mK_WHILE(); 


                }
                break;
            case 51 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:445: T__70
                {
                mT__70(); 


                }
                break;
            case 52 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:451: T__71
                {
                mT__71(); 


                }
                break;
            case 53 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:457: T__72
                {
                mT__72(); 


                }
                break;
            case 54 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:463: T__73
                {
                mT__73(); 


                }
                break;
            case 55 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:469: T__74
                {
                mT__74(); 


                }
                break;
            case 56 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:475: T__75
                {
                mT__75(); 


                }
                break;
            case 57 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:481: T__76
                {
                mT__76(); 


                }
                break;
            case 58 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:487: T__77
                {
                mT__77(); 


                }
                break;
            case 59 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:493: T__78
                {
                mT__78(); 


                }
                break;
            case 60 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:499: T__79
                {
                mT__79(); 


                }
                break;
            case 61 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:505: T__80
                {
                mT__80(); 


                }
                break;
            case 62 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:511: T__81
                {
                mT__81(); 


                }
                break;
            case 63 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:517: T__82
                {
                mT__82(); 


                }
                break;
            case 64 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:523: T__83
                {
                mT__83(); 


                }
                break;
            case 65 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:529: T__84
                {
                mT__84(); 


                }
                break;
            case 66 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:535: T__85
                {
                mT__85(); 


                }
                break;
            case 67 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:541: T__86
                {
                mT__86(); 


                }
                break;
            case 68 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:547: T__87
                {
                mT__87(); 


                }
                break;
            case 69 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:553: T__88
                {
                mT__88(); 


                }
                break;
            case 70 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:559: T__89
                {
                mT__89(); 


                }
                break;
            case 71 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:565: T__90
                {
                mT__90(); 


                }
                break;
            case 72 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:571: T__91
                {
                mT__91(); 


                }
                break;
            case 73 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:577: T__92
                {
                mT__92(); 


                }
                break;
            case 74 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:583: T__93
                {
                mT__93(); 


                }
                break;
            case 75 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:589: T__94
                {
                mT__94(); 


                }
                break;
            case 76 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:595: ID
                {
                mID(); 


                }
                break;
            case 77 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:598: INT
                {
                mINT(); 


                }
                break;
            case 78 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:602: LONG
                {
                mLONG(); 


                }
                break;
            case 79 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:607: HEX_LONG
                {
                mHEX_LONG(); 


                }
                break;
            case 80 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:616: HEX
                {
                mHEX(); 


                }
                break;
            case 81 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:620: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 82 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:626: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 83 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:633: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 84 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:641: WS
                {
                mWS(); 


                }
                break;
            case 85 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:644: STRING
                {
                mSTRING(); 


                }
                break;
            case 86 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:651: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA12_eotS =
        "\5\uffff";
    static final String DFA12_eofS =
        "\5\uffff";
    static final String DFA12_minS =
        "\2\56\3\uffff";
    static final String DFA12_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA12_specialS =
        "\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "91:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )";
        }
    }
    static final String DFA19_eotS =
        "\5\uffff";
    static final String DFA19_eofS =
        "\5\uffff";
    static final String DFA19_minS =
        "\2\56\3\uffff";
    static final String DFA19_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA19_specialS =
        "\5\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "96:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA30_eotS =
        "\1\uffff\17\51\11\uffff\1\125\1\130\17\uffff\2\132\3\uffff\12\51"+
        "\1\152\7\51\1\162\23\51\1\uffff\1\u008e\5\uffff\1\u008e\1\uffff"+
        "\14\51\1\uffff\6\51\1\u00a6\1\uffff\2\51\1\u00ab\2\51\1\u00ae\17"+
        "\51\1\u00be\3\51\3\uffff\1\u00c5\1\u008e\2\uffff\1\u008e\4\51\1"+
        "\u00cc\1\u00cd\1\51\1\u00cf\4\51\1\u00d4\1\u00d5\4\51\1\uffff\4"+
        "\51\1\uffff\1\u00de\1\51\1\uffff\1\u00e0\12\51\1\u00eb\2\51\1\u00ee"+
        "\1\uffff\1\u00ef\2\51\1\uffff\1\u008e\3\uffff\1\u008e\3\51\1\u00f5"+
        "\2\uffff\1\u00f6\1\uffff\1\u00f7\3\51\2\uffff\1\51\1\u00fc\1\u00fe"+
        "\1\u00ff\4\51\1\uffff\1\51\1\uffff\5\51\1\u010a\1\51\1\u010c\2\51"+
        "\1\uffff\1\u0110\1\51\2\uffff\1\51\1\u0113\1\51\1\u0115\1\51\3\uffff"+
        "\2\51\1\u0119\1\51\1\uffff\1\51\2\uffff\1\51\1\u011d\2\51\1\u0120"+
        "\3\51\1\u0124\1\u0125\1\uffff\1\u0126\1\uffff\1\u0127\1\51\1\u0129"+
        "\1\uffff\2\51\1\uffff\1\51\1\uffff\1\u012d\1\51\1\u012f\1\uffff"+
        "\1\u0130\1\u0131\1\51\1\uffff\2\51\1\uffff\1\u0135\1\u0136\1\51"+
        "\4\uffff\1\51\1\uffff\2\51\1\u013b\1\uffff\1\u013c\3\uffff\3\51"+
        "\2\uffff\3\51\1\u0143\2\uffff\2\51\1\u0146\1\u0147\1\51\1\u0149"+
        "\1\uffff\1\u014a\1\u014b\2\uffff\1\51\3\uffff\1\51\1\u014e\1\uffff";
    static final String DFA30_eofS =
        "\u014f\uffff";
    static final String DFA30_minS =
        "\1\11\1\142\1\157\1\141\1\145\1\154\1\141\1\146\1\157\2\141\1\145"+
        "\2\150\1\157\1\150\11\uffff\1\60\1\52\17\uffff\2\56\3\uffff\2\163"+
        "\1\157\1\145\1\164\1\163\2\141\1\156\1\146\1\60\1\163\1\165\1\164"+
        "\1\154\1\156\1\157\1\162\1\60\1\160\1\163\1\156\1\164\1\167\1\154"+
        "\1\143\1\151\1\142\1\164\1\157\1\141\1\160\1\151\1\156\1\151\1\141"+
        "\2\151\1\uffff\1\60\2\uffff\1\60\2\uffff\1\60\1\53\1\164\1\145\1"+
        "\154\1\141\2\145\1\143\1\162\1\163\1\164\1\141\1\142\1\uffff\1\145"+
        "\1\155\1\145\1\163\2\141\1\60\1\uffff\1\154\1\164\1\60\1\147\1\151"+
        "\1\60\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164\1\145\1\164"+
        "\1\143\1\163\1\157\1\156\1\145\1\60\1\144\1\141\1\154\1\53\2\uffff"+
        "\2\60\1\53\2\60\2\162\1\145\1\153\2\60\1\150\1\60\1\163\1\151\1"+
        "\165\1\154\2\60\1\156\1\145\1\154\1\164\1\uffff\1\145\1\162\1\141"+
        "\1\162\1\uffff\1\60\1\166\1\uffff\1\60\2\141\1\145\1\151\1\162\1"+
        "\164\1\151\1\162\1\143\1\150\1\60\1\167\1\163\1\60\1\uffff\1\60"+
        "\1\164\1\145\2\60\2\uffff\2\60\1\141\1\164\1\141\1\60\2\uffff\1"+
        "\60\1\uffff\1\60\1\156\1\154\1\145\2\uffff\1\144\3\60\1\155\1\164"+
        "\1\156\1\146\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156\1\60"+
        "\1\143\1\60\1\150\1\162\1\uffff\1\60\1\151\2\uffff\1\151\1\60\1"+
        "\143\1\60\1\156\3\uffff\1\165\1\164\1\60\1\163\1\uffff\1\171\2\uffff"+
        "\1\145\1\60\1\143\1\141\1\60\2\145\1\164\2\60\1\uffff\1\60\1\uffff"+
        "\1\60\1\157\1\60\1\uffff\1\145\1\154\1\uffff\1\164\1\uffff\1\60"+
        "\1\145\1\60\1\uffff\2\60\1\156\1\uffff\1\145\1\143\1\uffff\2\60"+
        "\1\145\4\uffff\1\156\1\uffff\1\156\1\145\1\60\1\uffff\1\60\3\uffff"+
        "\1\164\1\157\1\145\2\uffff\1\144\1\151\1\164\1\60\2\uffff\1\163"+
        "\1\146\2\60\1\172\1\60\1\uffff\2\60\2\uffff\1\145\3\uffff\1\144"+
        "\1\60\1\uffff";
    static final String DFA30_maxS =
        "\1\176\1\163\1\171\2\157\1\170\1\157\1\156\1\157\2\165\1\145\1\171"+
        "\1\162\1\157\1\150\11\uffff\1\71\1\57\17\uffff\1\170\1\154\3\uffff"+
        "\2\163\1\157\1\145\2\164\2\141\1\156\1\146\1\172\1\163\1\165\1\164"+
        "\1\154\1\156\1\157\1\162\1\172\1\160\1\164\1\156\1\164\1\167\1\154"+
        "\1\143\1\157\1\142\1\164\1\157\1\141\1\160\1\151\1\156\1\162\1\171"+
        "\1\154\1\151\1\uffff\1\146\2\uffff\1\146\2\uffff\1\146\1\71\1\164"+
        "\1\145\1\154\1\141\2\145\1\143\1\162\1\163\1\164\1\141\1\142\1\uffff"+
        "\1\145\1\155\1\145\1\163\2\141\1\172\1\uffff\1\157\1\164\1\172\1"+
        "\147\1\151\1\172\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164"+
        "\1\145\1\164\1\143\1\163\1\157\1\156\1\145\1\172\1\144\1\141\1\154"+
        "\1\71\2\uffff\2\146\2\71\1\146\2\162\1\145\1\153\2\172\1\150\1\172"+
        "\1\163\1\151\1\165\1\154\2\172\1\156\1\145\1\154\1\164\1\uffff\1"+
        "\145\1\162\1\141\1\162\1\uffff\1\172\1\166\1\uffff\1\172\2\141\1"+
        "\145\1\151\1\162\1\164\1\151\1\162\1\143\1\150\1\172\1\167\1\163"+
        "\1\172\1\uffff\1\172\1\164\1\145\1\71\1\146\2\uffff\1\71\1\146\1"+
        "\141\1\164\1\141\1\172\2\uffff\1\172\1\uffff\1\172\1\156\1\154\1"+
        "\145\2\uffff\1\144\3\172\1\155\1\164\1\156\1\146\1\uffff\1\145\1"+
        "\uffff\1\147\1\164\2\143\1\156\1\172\1\143\1\172\1\150\1\162\1\uffff"+
        "\1\172\1\151\2\uffff\1\151\1\172\1\143\1\172\1\156\3\uffff\1\165"+
        "\1\164\1\172\1\163\1\uffff\1\171\2\uffff\1\145\1\172\1\143\1\141"+
        "\1\172\2\145\1\164\2\172\1\uffff\1\172\1\uffff\1\172\1\157\1\172"+
        "\1\uffff\1\145\1\154\1\uffff\1\164\1\uffff\1\172\1\145\1\172\1\uffff"+
        "\2\172\1\156\1\uffff\1\145\1\143\1\uffff\2\172\1\145\4\uffff\1\156"+
        "\1\uffff\1\156\1\145\1\172\1\uffff\1\172\3\uffff\1\164\1\157\1\145"+
        "\2\uffff\1\144\1\151\1\164\1\172\2\uffff\1\163\1\146\4\172\1\uffff"+
        "\2\172\2\uffff\1\145\3\uffff\1\144\1\172\1\uffff";
    static final String DFA30_acceptS =
        "\20\uffff\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\2\uffff\1"+
        "\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1"+
        "\111\1\112\1\113\1\114\2\uffff\1\124\1\125\1\126\46\uffff\1\74\1"+
        "\uffff\1\123\1\75\1\uffff\1\115\1\116\16\uffff\1\14\7\uffff\1\26"+
        "\32\uffff\1\121\1\122\27\uffff\1\25\4\uffff\1\32\2\uffff\1\36\17"+
        "\uffff\1\57\5\uffff\1\117\1\120\6\uffff\1\5\1\6\1\uffff\1\10\4\uffff"+
        "\1\16\1\17\10\uffff\1\34\1\uffff\1\37\12\uffff\1\52\2\uffff\1\56"+
        "\1\60\5\uffff\1\4\1\7\1\11\4\uffff\1\21\1\uffff\1\22\1\24\12\uffff"+
        "\1\45\1\uffff\1\47\3\uffff\1\53\2\uffff\1\62\1\uffff\1\2\3\uffff"+
        "\1\15\3\uffff\1\30\2\uffff\1\35\3\uffff\1\43\1\44\1\46\1\50\1\uffff"+
        "\1\54\3\uffff\1\3\1\uffff\1\13\1\20\1\23\3\uffff\1\40\1\41\4\uffff"+
        "\1\1\1\12\6\uffff\1\61\2\uffff\1\33\1\42\1\uffff\1\55\1\27\1\31"+
        "\2\uffff\1\51";
    static final String DFA30_specialS =
        "\u014f\uffff}>";
    static final String[] DFA30_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\20\1\55\2\uffff\1\21\1\22"+
            "\1\56\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\52\11\53\1\33"+
            "\1\34\1\35\1\36\1\37\1\40\1\41\32\51\1\42\1\uffff\1\43\1\44"+
            "\1\51\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\51\1\7\2\51\1\10\1\51"+
            "\1\11\1\51\1\12\1\51\1\13\1\14\1\15\1\51\1\16\1\17\3\51\1\45"+
            "\1\46\1\47\1\50",
            "\1\57\20\uffff\1\60",
            "\1\61\2\uffff\1\62\6\uffff\1\63",
            "\1\64\6\uffff\1\65\3\uffff\1\66\2\uffff\1\67",
            "\1\70\11\uffff\1\71",
            "\1\72\1\uffff\1\73\11\uffff\1\74",
            "\1\75\7\uffff\1\76\2\uffff\1\77\2\uffff\1\100",
            "\1\101\6\uffff\1\102\1\103",
            "\1\104",
            "\1\105\3\uffff\1\106\17\uffff\1\107",
            "\1\110\20\uffff\1\111\2\uffff\1\112",
            "\1\113",
            "\1\114\13\uffff\1\115\1\116\1\uffff\1\117\1\uffff\1\120",
            "\1\121\11\uffff\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\126",
            "\1\127\4\uffff\1\127",
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
            "\1\134\1\uffff\12\53\13\uffff\1\135\6\uffff\1\133\30\uffff"+
            "\1\135\6\uffff\1\133\13\uffff\1\131",
            "\1\134\1\uffff\12\53\13\uffff\1\135\6\uffff\1\133\30\uffff"+
            "\1\135\6\uffff\1\133",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\24\51\1\151\5\51",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\163",
            "\1\164\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173\5\uffff\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084\10\uffff\1\u0085",
            "\1\u0086\23\uffff\1\u0087\3\uffff\1\u0088",
            "\1\u0089\2\uffff\1\u008a",
            "\1\u008b",
            "",
            "\12\126\13\uffff\1\u008c\1\u008d\36\uffff\1\u008c\1\u008d",
            "",
            "",
            "\12\u008f\7\uffff\6\u008f\32\uffff\6\u008f",
            "",
            "",
            "\12\u0090\13\uffff\1\u0091\1\u008d\36\uffff\1\u0091\1\u008d",
            "\1\u0092\1\uffff\1\u0092\2\uffff\12\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00a7\2\uffff\1\u00a8",
            "\1\u00a9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\4\51\1\u00aa\25\51",
            "\1\u00ac",
            "\1\u00ad",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2\1\uffff\1\u00c2\2\uffff\12\u00c3",
            "",
            "",
            "\12\u008f\7\uffff\6\u008f\5\uffff\1\u00c4\24\uffff\6\u008f",
            "\12\u0090\13\uffff\1\u0091\1\u008d\36\uffff\1\u0091\1\u008d",
            "\1\u00c6\1\uffff\1\u00c6\2\uffff\12\u00c7",
            "\12\u0093",
            "\12\u0093\14\uffff\1\u008d\37\uffff\1\u008d",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ce",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00df",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ec",
            "\1\u00ed",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f0",
            "\1\u00f1",
            "\12\u00c3",
            "\12\u00c3\14\uffff\1\u008d\37\uffff\1\u008d",
            "",
            "",
            "\12\u00c7",
            "\12\u00c7\14\uffff\1\u008d\37\uffff\1\u008d",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "",
            "\1\u00fb",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\13\51\1\u00fd\16"+
            "\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010d",
            "\1\u010e",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\22\51\1\u010f\7\51",
            "\1\u0111",
            "",
            "",
            "\1\u0112",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0114",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0116",
            "",
            "",
            "",
            "\1\u0117",
            "\1\u0118",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u011a",
            "",
            "\1\u011b",
            "",
            "",
            "\1\u011c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u011e",
            "\1\u011f",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0128",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u012e",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0137",
            "",
            "",
            "",
            "",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u0144",
            "\1\u0145",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0148",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u014c",
            "",
            "",
            "",
            "\1\u014d",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( K_ABSTRACT | K_ASSERT | K_BOOLEAN | K_BREAK | K_BYTE | K_CASE | K_CATCH | K_CHAR | K_CLASS | K_CONTINUE | K_DEFAULT | K_DO | K_DOUBLE | K_ELSE | K_ENUM | K_EXTENDS | K_FALSE | K_FINAL | K_FINALLY | K_FLOAT | K_FOR | K_IF | K_IMPLEMENTS | K_IMPORT | K_INSTANCEOF | K_INT | K_INTERFACE | K_LONG | K_NATIVE | K_NEW | K_NULL | K_PACKAGE | K_PRIVATE | K_PROTECTED | K_PUBLIC | K_RETURN | K_SHORT | K_STATIC | K_SUPER | K_SWITCH | K_SYNCHRONIZED | K_THIS | K_THROW | K_THROWS | K_TRANSIENT | K_TRUE | K_TRY | K_VOID | K_VOLATILE | K_WHILE | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | ID | INT | LONG | HEX_LONG | HEX | FLOAT | DOUBLE | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}