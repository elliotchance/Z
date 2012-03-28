// $ANTLR 3.4 /Users/elliot/NetBeansProjects/Z/grammar/Java.g 2012-03-28 21:27:19

	package org.z.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "K_CLASS", "K_PRIVATE", "K_PROTECTED", "K_PUBLIC", "K_STATIC", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "')'", "','", "'.'", "';'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int FLOAT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int K_CLASS=12;
    public static final int K_PRIVATE=13;
    public static final int K_PROTECTED=14;
    public static final int K_PUBLIC=15;
    public static final int K_STATIC=16;
    public static final int OCTAL_ESC=17;
    public static final int STRING=18;
    public static final int UNICODE_ESC=19;
    public static final int WS=20;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public JavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return JavaParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/elliot/NetBeansProjects/Z/grammar/Java.g"; }



    // $ANTLR start "class_def"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:1: class_def : ( K_PUBLIC )? K_CLASS ID '{' ( method )* '}' EOF ;
    public final void class_def() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:2: ( ( K_PUBLIC )? K_CLASS ID '{' ( method )* '}' EOF )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:4: ( K_PUBLIC )? K_CLASS ID '{' ( method )* '}' EOF
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:4: ( K_PUBLIC )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==K_PUBLIC) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:4: K_PUBLIC
                    {
                    match(input,K_PUBLIC,FOLLOW_K_PUBLIC_in_class_def627); 

                    }
                    break;

            }


            match(input,K_CLASS,FOLLOW_K_CLASS_in_class_def630); 

            match(input,ID,FOLLOW_ID_in_class_def632); 

            match(input,26,FOLLOW_26_in_class_def634); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:29: ( method )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID||(LA2_0 >= K_PRIVATE && LA2_0 <= K_STATIC)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:29: method
            	    {
            	    pushFollow(FOLLOW_method_in_class_def636);
            	    method();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,27,FOLLOW_27_in_class_def639); 

            match(input,EOF,FOLLOW_EOF_in_class_def641); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "class_def"



    // $ANTLR start "permission"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:87:1: permission : ( K_PUBLIC | K_PROTECTED | K_PRIVATE );
    public final void permission() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:88:2: ( K_PUBLIC | K_PROTECTED | K_PRIVATE )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            {
            if ( (input.LA(1) >= K_PRIVATE && input.LA(1) <= K_PUBLIC) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "permission"



    // $ANTLR start "method"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:91:1: method : ( permission )? ( K_STATIC )? ID ID '(' ( functionArg )? ( ',' functionArg )* ')' '{' complexStatement '}' ;
    public final void method() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:2: ( ( permission )? ( K_STATIC )? ID ID '(' ( functionArg )? ( ',' functionArg )* ')' '{' complexStatement '}' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:4: ( permission )? ( K_STATIC )? ID ID '(' ( functionArg )? ( ',' functionArg )* ')' '{' complexStatement '}'
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:4: ( permission )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= K_PRIVATE && LA3_0 <= K_PUBLIC)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:4: permission
                    {
                    pushFollow(FOLLOW_permission_in_method674);
                    permission();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:16: ( K_STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==K_STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:16: K_STATIC
                    {
                    match(input,K_STATIC,FOLLOW_K_STATIC_in_method677); 

                    }
                    break;

            }


            match(input,ID,FOLLOW_ID_in_method680); 

            match(input,ID,FOLLOW_ID_in_method682); 

            match(input,21,FOLLOW_21_in_method684); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:36: ( functionArg )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:36: functionArg
                    {
                    pushFollow(FOLLOW_functionArg_in_method686);
                    functionArg();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:49: ( ',' functionArg )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:92:50: ',' functionArg
            	    {
            	    match(input,23,FOLLOW_23_in_method690); 

            	    pushFollow(FOLLOW_functionArg_in_method692);
            	    functionArg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,22,FOLLOW_22_in_method696); 

            match(input,26,FOLLOW_26_in_method698); 

            pushFollow(FOLLOW_complexStatement_in_method700);
            complexStatement();

            state._fsp--;


            match(input,27,FOLLOW_27_in_method702); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "method"



    // $ANTLR start "functionArg"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:95:1: functionArg : ID ID ;
    public final void functionArg() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:96:2: ( ID ID )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:96:4: ID ID
            {
            match(input,ID,FOLLOW_ID_in_functionArg714); 

            match(input,ID,FOLLOW_ID_in_functionArg716); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functionArg"



    // $ANTLR start "complexStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:99:1: complexStatement : simpleStatement ';' ;
    public final void complexStatement() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:100:2: ( simpleStatement ';' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:100:4: simpleStatement ';'
            {
            pushFollow(FOLLOW_simpleStatement_in_complexStatement728);
            simpleStatement();

            state._fsp--;


            match(input,25,FOLLOW_25_in_complexStatement730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "complexStatement"



    // $ANTLR start "simpleStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:103:1: simpleStatement : expression ;
    public final void simpleStatement() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:104:2: ( expression )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:104:4: expression
            {
            pushFollow(FOLLOW_expression_in_simpleStatement741);
            expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "simpleStatement"



    // $ANTLR start "expression"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:107:1: expression : ( object_access | function_call | value );
    public final void expression() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:108:2: ( object_access | function_call | value )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==24) ) {
                    alt7=1;
                }
                else if ( (LA7_1==21) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA7_0==CHAR||LA7_0==FLOAT||LA7_0==INT||LA7_0==STRING) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:108:4: object_access
                    {
                    pushFollow(FOLLOW_object_access_in_expression752);
                    object_access();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:109:4: function_call
                    {
                    pushFollow(FOLLOW_function_call_in_expression757);
                    function_call();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:110:4: value
                    {
                    pushFollow(FOLLOW_value_in_expression762);
                    value();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "object_access"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:113:1: object_access : ID '.' ( object_access | function_call ) ;
    public final void object_access() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:114:2: ( ID '.' ( object_access | function_call ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:114:4: ID '.' ( object_access | function_call )
            {
            match(input,ID,FOLLOW_ID_in_object_access774); 

            match(input,24,FOLLOW_24_in_object_access776); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:114:11: ( object_access | function_call )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==24) ) {
                    alt8=1;
                }
                else if ( (LA8_1==21) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:114:12: object_access
                    {
                    pushFollow(FOLLOW_object_access_in_object_access779);
                    object_access();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:114:28: function_call
                    {
                    pushFollow(FOLLOW_function_call_in_object_access783);
                    function_call();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "object_access"



    // $ANTLR start "value"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:117:1: value : ( INT | FLOAT | STRING | CHAR );
    public final void value() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:118:2: ( INT | FLOAT | STRING | CHAR )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            {
            if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "value"



    // $ANTLR start "function_call"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:124:1: function_call : ID '(' ( expression )? ( ',' expression )* ')' ;
    public final void function_call() throws RecognitionException {
        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:125:2: ( ID '(' ( expression )? ( ',' expression )* ')' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:125:4: ID '(' ( expression )? ( ',' expression )* ')'
            {
            match(input,ID,FOLLOW_ID_in_function_call821); 

            match(input,21,FOLLOW_21_in_function_call823); 

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:125:11: ( expression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CHAR||LA9_0==FLOAT||(LA9_0 >= ID && LA9_0 <= INT)||LA9_0==STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:125:11: expression
                    {
                    pushFollow(FOLLOW_expression_in_function_call825);
                    expression();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:125:23: ( ',' expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:125:24: ',' expression
            	    {
            	    match(input,23,FOLLOW_23_in_function_call829); 

            	    pushFollow(FOLLOW_expression_in_function_call831);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input,22,FOLLOW_22_in_function_call835); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "function_call"

    // Delegated rules


 

    public static final BitSet FOLLOW_K_PUBLIC_in_class_def627 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_CLASS_in_class_def630 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_class_def632 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_class_def634 = new BitSet(new long[]{0x000000000801E400L});
    public static final BitSet FOLLOW_method_in_class_def636 = new BitSet(new long[]{0x000000000801E400L});
    public static final BitSet FOLLOW_27_in_class_def639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_class_def641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_permission_in_method674 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_K_STATIC_in_method677 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_method680 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_method682 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_method684 = new BitSet(new long[]{0x0000000000C00400L});
    public static final BitSet FOLLOW_functionArg_in_method686 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_method690 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_functionArg_in_method692 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_method696 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_method698 = new BitSet(new long[]{0x0000000000040D10L});
    public static final BitSet FOLLOW_complexStatement_in_method700 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_method702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionArg714 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_functionArg716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_complexStatement728 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_complexStatement730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_simpleStatement741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_access_in_expression752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_expression757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_expression762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object_access774 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_object_access776 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_object_access_in_object_access779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_object_access783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_call821 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_function_call823 = new BitSet(new long[]{0x0000000000C40D10L});
    public static final BitSet FOLLOW_expression_in_function_call825 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_function_call829 = new BitSet(new long[]{0x0000000000040D10L});
    public static final BitSet FOLLOW_expression_in_function_call831 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_function_call835 = new BitSet(new long[]{0x0000000000000002L});

}