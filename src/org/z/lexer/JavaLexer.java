// $ANTLR 3.4 /Users/elliot/NetBeansProjects/Z/grammar/Java.g 2012-04-07 16:35:42

	package org.z.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int FLOAT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int K_CATCH=12;
    public static final int K_CLASS=13;
    public static final int K_FINAL=14;
    public static final int K_FINALLY=15;
    public static final int K_IF=16;
    public static final int K_IMPORT=17;
    public static final int K_NATIVE=18;
    public static final int K_NULL=19;
    public static final int K_PACKAGE=20;
    public static final int K_PRIVATE=21;
    public static final int K_PROTECTED=22;
    public static final int K_PUBLIC=23;
    public static final int K_RETURN=24;
    public static final int K_STATIC=25;
    public static final int K_SYNCHRONIZED=26;
    public static final int K_THROW=27;
    public static final int K_THROWS=28;
    public static final int K_TRY=29;
    public static final int K_VOLATILE=30;
    public static final int OCTAL_ESC=31;
    public static final int STRING=32;
    public static final int UNICODE_ESC=33;
    public static final int WS=34;

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

    // $ANTLR start "K_CATCH"
    public final void mK_CATCH() throws RecognitionException {
        try {
            int _type = K_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:6:9: ( 'catch' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:6:11: 'catch'
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

    // $ANTLR start "K_CLASS"
    public final void mK_CLASS() throws RecognitionException {
        try {
            int _type = K_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:7:9: ( 'class' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:7:11: 'class'
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

    // $ANTLR start "K_FINAL"
    public final void mK_FINAL() throws RecognitionException {
        try {
            int _type = K_FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:8:9: ( 'final' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:8:11: 'final'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:9:11: ( 'finally' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:9:13: 'finally'
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

    // $ANTLR start "K_IF"
    public final void mK_IF() throws RecognitionException {
        try {
            int _type = K_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:10:6: ( 'if' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:10:8: 'if'
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

    // $ANTLR start "K_IMPORT"
    public final void mK_IMPORT() throws RecognitionException {
        try {
            int _type = K_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:11:10: ( 'import' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:11:12: 'import'
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

    // $ANTLR start "K_NATIVE"
    public final void mK_NATIVE() throws RecognitionException {
        try {
            int _type = K_NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:12:10: ( 'native' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:12:12: 'native'
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

    // $ANTLR start "K_NULL"
    public final void mK_NULL() throws RecognitionException {
        try {
            int _type = K_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:13:8: ( 'null' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:13:10: 'null'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:14:11: ( 'package' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:14:13: 'package'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:15:11: ( 'private' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:15:13: 'private'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:16:13: ( 'protected' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:16:15: 'protected'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:17:10: ( 'public' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:17:12: 'public'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:18:10: ( 'return' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:18:12: 'return'
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

    // $ANTLR start "K_STATIC"
    public final void mK_STATIC() throws RecognitionException {
        try {
            int _type = K_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:19:10: ( 'static' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:19:12: 'static'
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

    // $ANTLR start "K_SYNCHRONIZED"
    public final void mK_SYNCHRONIZED() throws RecognitionException {
        try {
            int _type = K_SYNCHRONIZED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:20:16: ( 'synchronized' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:20:18: 'synchronized'
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

    // $ANTLR start "K_THROW"
    public final void mK_THROW() throws RecognitionException {
        try {
            int _type = K_THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:21:9: ( 'throw' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:21:11: 'throw'
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:22:10: ( 'throws' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:22:12: 'throws'
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

    // $ANTLR start "K_TRY"
    public final void mK_TRY() throws RecognitionException {
        try {
            int _type = K_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:23:7: ( 'try' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:23:9: 'try'
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

    // $ANTLR start "K_VOLATILE"
    public final void mK_VOLATILE() throws RecognitionException {
        try {
            int _type = K_VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:24:12: ( 'volatile' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:24:14: 'volatile'
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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:25:7: ( '!=' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:25:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:26:7: ( '(' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:26:9: '('
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:27:7: ( ')' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:27:9: ')'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:28:7: ( '*' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:28:9: '*'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:29:7: ( '*=' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:29:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:30:7: ( '+=' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:30:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:31:7: ( ',' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:31:9: ','
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:32:7: ( '-=' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:32:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:33:7: ( '.' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:33:9: '.'
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:34:7: ( '/=' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:34:9: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:35:7: ( ';' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:35:9: ';'
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:36:7: ( '=' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:36:9: '='
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:37:7: ( '==' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:37:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:38:7: ( '[]' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:38:9: '[]'
            {
            match("[]"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:39:7: ( '{' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:39:9: '{'
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:7: ( '}' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:9: '}'
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
    // $ANTLR end "T__50"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:33:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:33:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:33:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:36:5: ( ( '0' .. '9' )+ )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:36:7: ( '0' .. '9' )+
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:36:7: ( '0' .. '9' )+
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

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:9: ( '0' .. '9' )+
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


                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
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
                    	    break loop4;
                        }
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:40:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:41:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:41:13: ( '0' .. '9' )+
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


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:41:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:41:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:42:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:42:9: ( '0' .. '9' )+
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
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:46:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='/') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='*') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:46:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:46:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
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
                    	    break loop10;
                        }
                    } while (true);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:46:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:46:28: '\\r'
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
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:47:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:47:14: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='/') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:47:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:50:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:50:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:58:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:58:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:58:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:58:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:58:24: ~ ( '\\\\' | '\"' )
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
            	    break loop14;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:61:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:61:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:61:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:61:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:61:25: ~ ( '\\'' | '\\\\' )
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

            }


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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
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


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:74:33: ( '0' .. '9' )+
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:77:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:81:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
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
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
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
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:81:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:82:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:9: OCTAL_ESC
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:88:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:88:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:89:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:90:9: '\\\\' ( '0' .. '7' )
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:95:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:95:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:8: ( K_CATCH | K_CLASS | K_FINAL | K_FINALLY | K_IF | K_IMPORT | K_NATIVE | K_NULL | K_PACKAGE | K_PRIVATE | K_PROTECTED | K_PUBLIC | K_RETURN | K_STATIC | K_SYNCHRONIZED | K_THROW | K_THROWS | K_TRY | K_VOLATILE | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt20=42;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:10: K_CATCH
                {
                mK_CATCH(); 


                }
                break;
            case 2 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:18: K_CLASS
                {
                mK_CLASS(); 


                }
                break;
            case 3 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:26: K_FINAL
                {
                mK_FINAL(); 


                }
                break;
            case 4 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:34: K_FINALLY
                {
                mK_FINALLY(); 


                }
                break;
            case 5 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:44: K_IF
                {
                mK_IF(); 


                }
                break;
            case 6 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:49: K_IMPORT
                {
                mK_IMPORT(); 


                }
                break;
            case 7 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:58: K_NATIVE
                {
                mK_NATIVE(); 


                }
                break;
            case 8 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:67: K_NULL
                {
                mK_NULL(); 


                }
                break;
            case 9 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:74: K_PACKAGE
                {
                mK_PACKAGE(); 


                }
                break;
            case 10 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:84: K_PRIVATE
                {
                mK_PRIVATE(); 


                }
                break;
            case 11 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:94: K_PROTECTED
                {
                mK_PROTECTED(); 


                }
                break;
            case 12 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:106: K_PUBLIC
                {
                mK_PUBLIC(); 


                }
                break;
            case 13 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:115: K_RETURN
                {
                mK_RETURN(); 


                }
                break;
            case 14 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:124: K_STATIC
                {
                mK_STATIC(); 


                }
                break;
            case 15 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:133: K_SYNCHRONIZED
                {
                mK_SYNCHRONIZED(); 


                }
                break;
            case 16 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:148: K_THROW
                {
                mK_THROW(); 


                }
                break;
            case 17 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:156: K_THROWS
                {
                mK_THROWS(); 


                }
                break;
            case 18 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:165: K_TRY
                {
                mK_TRY(); 


                }
                break;
            case 19 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:171: K_VOLATILE
                {
                mK_VOLATILE(); 


                }
                break;
            case 20 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:182: T__35
                {
                mT__35(); 


                }
                break;
            case 21 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:188: T__36
                {
                mT__36(); 


                }
                break;
            case 22 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:194: T__37
                {
                mT__37(); 


                }
                break;
            case 23 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:200: T__38
                {
                mT__38(); 


                }
                break;
            case 24 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:206: T__39
                {
                mT__39(); 


                }
                break;
            case 25 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:212: T__40
                {
                mT__40(); 


                }
                break;
            case 26 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:218: T__41
                {
                mT__41(); 


                }
                break;
            case 27 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:224: T__42
                {
                mT__42(); 


                }
                break;
            case 28 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:230: T__43
                {
                mT__43(); 


                }
                break;
            case 29 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:236: T__44
                {
                mT__44(); 


                }
                break;
            case 30 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:242: T__45
                {
                mT__45(); 


                }
                break;
            case 31 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:248: T__46
                {
                mT__46(); 


                }
                break;
            case 32 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:254: T__47
                {
                mT__47(); 


                }
                break;
            case 33 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:260: T__48
                {
                mT__48(); 


                }
                break;
            case 34 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:266: T__49
                {
                mT__49(); 


                }
                break;
            case 35 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:272: T__50
                {
                mT__50(); 


                }
                break;
            case 36 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:278: ID
                {
                mID(); 


                }
                break;
            case 37 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:281: INT
                {
                mINT(); 


                }
                break;
            case 38 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:285: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 39 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:291: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 40 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:299: WS
                {
                mWS(); 


                }
                break;
            case 41 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:302: STRING
                {
                mSTRING(); 


                }
                break;
            case 42 :
                // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:1:309: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "39:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\11\30\3\uffff\1\56\3\uffff\1\57\2\uffff\1\64\4\uffff\1"+
        "\65\3\uffff\3\30\1\71\14\30\11\uffff\3\30\1\uffff\13\30\1\125\6"+
        "\30\1\134\10\30\1\uffff\1\30\1\146\1\147\1\151\2\30\1\uffff\7\30"+
        "\1\164\1\30\2\uffff\1\30\1\uffff\1\167\1\170\3\30\1\174\1\175\1"+
        "\176\1\30\1\u0080\1\uffff\1\30\1\u0082\2\uffff\1\u0083\1\u0084\1"+
        "\30\3\uffff\1\30\1\uffff\1\30\3\uffff\2\30\1\u008a\1\u008b\1\30"+
        "\2\uffff\2\30\1\u008f\1\uffff";
    static final String DFA20_eofS =
        "\u0090\uffff";
    static final String DFA20_minS =
        "\1\11\1\141\1\151\1\146\2\141\1\145\1\164\1\150\1\157\3\uffff\1"+
        "\75\3\uffff\1\60\1\52\1\uffff\1\75\4\uffff\1\56\3\uffff\1\164\1"+
        "\141\1\156\1\60\1\160\1\164\1\154\1\143\1\151\1\142\1\164\1\141"+
        "\1\156\1\162\1\171\1\154\11\uffff\1\143\1\163\1\141\1\uffff\1\157"+
        "\1\151\1\154\1\153\1\166\1\164\1\154\1\165\1\164\1\143\1\157\1\60"+
        "\1\141\1\150\1\163\1\154\1\162\1\166\1\60\2\141\1\145\1\151\1\162"+
        "\1\151\1\150\1\167\1\uffff\1\164\3\60\1\164\1\145\1\uffff\1\147"+
        "\1\164\2\143\1\156\1\143\1\162\1\60\1\151\2\uffff\1\171\1\uffff"+
        "\2\60\2\145\1\164\3\60\1\157\1\60\1\uffff\1\154\1\60\2\uffff\2\60"+
        "\1\145\3\uffff\1\156\1\uffff\1\145\3\uffff\1\144\1\151\2\60\1\172"+
        "\2\uffff\1\145\1\144\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\175\1\154\1\151\1\155\2\165\1\145\1\171\1\162\1\157\3\uffff\1"+
        "\75\3\uffff\1\71\1\75\1\uffff\1\75\4\uffff\1\145\3\uffff\1\164\1"+
        "\141\1\156\1\172\1\160\1\164\1\154\1\143\1\157\1\142\1\164\1\141"+
        "\1\156\1\162\1\171\1\154\11\uffff\1\143\1\163\1\141\1\uffff\1\157"+
        "\1\151\1\154\1\153\1\166\1\164\1\154\1\165\1\164\1\143\1\157\1\172"+
        "\1\141\1\150\1\163\1\154\1\162\1\166\1\172\2\141\1\145\1\151\1\162"+
        "\1\151\1\150\1\167\1\uffff\1\164\3\172\1\164\1\145\1\uffff\1\147"+
        "\1\164\2\143\1\156\1\143\1\162\1\172\1\151\2\uffff\1\171\1\uffff"+
        "\2\172\2\145\1\164\3\172\1\157\1\172\1\uffff\1\154\1\172\2\uffff"+
        "\2\172\1\145\3\uffff\1\156\1\uffff\1\145\3\uffff\1\144\1\151\3\172"+
        "\2\uffff\1\145\1\144\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\12\uffff\1\24\1\25\1\26\1\uffff\1\31\1\32\1\33\2\uffff\1\36\1\uffff"+
        "\1\41\1\42\1\43\1\44\1\uffff\1\50\1\51\1\52\20\uffff\1\30\1\27\1"+
        "\34\1\46\1\35\1\47\1\40\1\37\1\45\3\uffff\1\5\33\uffff\1\22\6\uffff"+
        "\1\10\11\uffff\1\1\1\2\1\uffff\1\3\12\uffff\1\20\2\uffff\1\6\1\7"+
        "\3\uffff\1\14\1\15\1\16\1\uffff\1\21\1\uffff\1\4\1\11\1\12\5\uffff"+
        "\1\23\1\13\3\uffff\1\17";
    static final String DFA20_specialS =
        "\u0090\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\1\12\1\33\4\uffff\1\34\1\13"+
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\12\31\1\uffff\1\23\1\uffff"+
            "\1\24\3\uffff\32\30\1\25\3\uffff\1\30\1\uffff\2\30\1\1\2\30"+
            "\1\2\2\30\1\3\4\30\1\4\1\30\1\5\1\30\1\6\1\7\1\10\1\30\1\11"+
            "\4\30\1\26\1\uffff\1\27",
            "\1\35\12\uffff\1\36",
            "\1\37",
            "\1\40\6\uffff\1\41",
            "\1\42\23\uffff\1\43",
            "\1\44\20\uffff\1\45\2\uffff\1\46",
            "\1\47",
            "\1\50\4\uffff\1\51",
            "\1\52\11\uffff\1\53",
            "\1\54",
            "",
            "",
            "",
            "\1\55",
            "",
            "",
            "",
            "\12\60",
            "\1\62\4\uffff\1\62\15\uffff\1\61",
            "",
            "\1\63",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\31\13\uffff\1\60\37\uffff\1\60",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\5\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\13\30\1\150\16\30",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\22\30\1\163\7\30",
            "\1\165",
            "",
            "",
            "\1\166",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\177",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0081",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0085",
            "",
            "",
            "",
            "\1\u0086",
            "",
            "\1\u0087",
            "",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( K_CATCH | K_CLASS | K_FINAL | K_FINALLY | K_IF | K_IMPORT | K_NATIVE | K_NULL | K_PACKAGE | K_PRIVATE | K_PROTECTED | K_PUBLIC | K_RETURN | K_STATIC | K_SYNCHRONIZED | K_THROW | K_THROWS | K_TRY | K_VOLATILE | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}