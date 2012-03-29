// $ANTLR 3.4 /Users/elliot/NetBeansProjects/Z/grammar/Java.g 2012-03-30 00:02:19

	package org.z.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "K_CLASS", "K_PRIVATE", "K_PROTECTED", "K_PUBLIC", "K_STATIC", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "')'", "','", "'.'", "';'", "'[]'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
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

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return JavaParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/elliot/NetBeansProjects/Z/grammar/Java.g"; }


    public static class run_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.File result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "run"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:83:1: run returns [org.z.lexer.grammar.File result] : (def= classDefinition )* EOF ;
    public final JavaParser.run_return run() throws RecognitionException {
        JavaParser.run_return retval = new JavaParser.run_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF1=null;
        JavaParser.classDefinition_return def =null;


        Object EOF1_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:2: ( (def= classDefinition )* EOF )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:84:4: (def= classDefinition )* EOF
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.File();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:87:3: (def= classDefinition )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==K_CLASS||LA1_0==K_PUBLIC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:87:4: def= classDefinition
            	    {
            	    pushFollow(FOLLOW_classDefinition_in_run641);
            	    def=classDefinition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, def.getTree());


            	    			retval.result.addClass(def.result);
            	    		

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            EOF1=(Token)match(input,EOF,FOLLOW_EOF_in_run649); 
            EOF1_tree = 
            (Object)adaptor.create(EOF1)
            ;
            adaptor.addChild(root_0, EOF1_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "run"


    public static class classDefinition_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Class result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:93:1: classDefinition returns [org.z.lexer.grammar.Class result] : (isPublic= K_PUBLIC )? K_CLASS className= ID '{' (m= method )* '}' EOF ;
    public final JavaParser.classDefinition_return classDefinition() throws RecognitionException {
        JavaParser.classDefinition_return retval = new JavaParser.classDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token isPublic=null;
        Token className=null;
        Token K_CLASS2=null;
        Token char_literal3=null;
        Token char_literal4=null;
        Token EOF5=null;
        JavaParser.method_return m =null;


        Object isPublic_tree=null;
        Object className_tree=null;
        Object K_CLASS2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal4_tree=null;
        Object EOF5_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:2: ( (isPublic= K_PUBLIC )? K_CLASS className= ID '{' (m= method )* '}' EOF )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:4: (isPublic= K_PUBLIC )? K_CLASS className= ID '{' (m= method )* '}' EOF
            {
            root_0 = (Object)adaptor.nil();


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:12: (isPublic= K_PUBLIC )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==K_PUBLIC) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:12: isPublic= K_PUBLIC
                    {
                    isPublic=(Token)match(input,K_PUBLIC,FOLLOW_K_PUBLIC_in_classDefinition670); 
                    isPublic_tree = 
                    (Object)adaptor.create(isPublic)
                    ;
                    adaptor.addChild(root_0, isPublic_tree);


                    }
                    break;

            }


            K_CLASS2=(Token)match(input,K_CLASS,FOLLOW_K_CLASS_in_classDefinition673); 
            K_CLASS2_tree = 
            (Object)adaptor.create(K_CLASS2)
            ;
            adaptor.addChild(root_0, K_CLASS2_tree);


            className=(Token)match(input,ID,FOLLOW_ID_in_classDefinition677); 
            className_tree = 
            (Object)adaptor.create(className)
            ;
            adaptor.addChild(root_0, className_tree);


            char_literal3=(Token)match(input,27,FOLLOW_27_in_classDefinition679); 
            char_literal3_tree = 
            (Object)adaptor.create(char_literal3)
            ;
            adaptor.addChild(root_0, char_literal3_tree);



            			retval.result = new org.z.lexer.grammar.Class();
            			retval.result.setName(className.getText());
            			retval.result.setIsPublic(isPublic != null);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:100:3: (m= method )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||(LA3_0 >= K_PRIVATE && LA3_0 <= K_STATIC)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:100:4: m= method
            	    {
            	    pushFollow(FOLLOW_method_in_classDefinition690);
            	    m=method();

            	    state._fsp--;

            	    adaptor.addChild(root_0, m.getTree());


            	    			retval.result.addMethod(m.result);
            	    		

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            char_literal4=(Token)match(input,28,FOLLOW_28_in_classDefinition698); 
            char_literal4_tree = 
            (Object)adaptor.create(char_literal4)
            ;
            adaptor.addChild(root_0, char_literal4_tree);


            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_classDefinition702); 
            EOF5_tree = 
            (Object)adaptor.create(EOF5)
            ;
            adaptor.addChild(root_0, EOF5_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDefinition"


    public static class permission_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "permission"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:107:1: permission : ( K_PUBLIC | K_PROTECTED | K_PRIVATE );
    public final JavaParser.permission_return permission() throws RecognitionException {
        JavaParser.permission_return retval = new JavaParser.permission_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set6=null;

        Object set6_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:108:2: ( K_PUBLIC | K_PROTECTED | K_PRIVATE )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            {
            root_0 = (Object)adaptor.nil();


            set6=(Token)input.LT(1);

            if ( (input.LA(1) >= K_PRIVATE && input.LA(1) <= K_PUBLIC) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set6)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "permission"


    public static class type_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Type result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:111:1: type returns [org.z.lexer.grammar.Type result] : base= ID ( '[]' )* ;
    public final JavaParser.type_return type() throws RecognitionException {
        JavaParser.type_return retval = new JavaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token base=null;
        Token string_literal7=null;

        Object base_tree=null;
        Object string_literal7_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:112:2: (base= ID ( '[]' )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:112:4: base= ID ( '[]' )*
            {
            root_0 = (Object)adaptor.nil();


            base=(Token)match(input,ID,FOLLOW_ID_in_type742); 
            base_tree = 
            (Object)adaptor.create(base)
            ;
            adaptor.addChild(root_0, base_tree);



            			retval.result = new org.z.lexer.grammar.Type();
            			retval.result.setBase(base.getText());
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:117:3: ( '[]' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:117:4: '[]'
            	    {
            	    string_literal7=(Token)match(input,26,FOLLOW_26_in_type751); 
            	    string_literal7_tree = 
            	    (Object)adaptor.create(string_literal7)
            	    ;
            	    adaptor.addChild(root_0, string_literal7_tree);



            	    			retval.result.setDepth(retval.result.getDepth() + 1);
            	    		

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class method_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Method result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:122:1: method returns [org.z.lexer.grammar.Method result] : thePermission= ( ( permission )? ) (isStatic= K_STATIC )? returnType= type name= ID '(' args= argumentList ')' '{' stmts= statementList '}' ;
    public final JavaParser.method_return method() throws RecognitionException {
        JavaParser.method_return retval = new JavaParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token thePermission=null;
        Token isStatic=null;
        Token name=null;
        Token char_literal9=null;
        Token char_literal10=null;
        Token char_literal11=null;
        Token char_literal12=null;
        JavaParser.type_return returnType =null;

        JavaParser.argumentList_return args =null;

        JavaParser.statementList_return stmts =null;

        JavaParser.permission_return permission8 =null;


        Object thePermission_tree=null;
        Object isStatic_tree=null;
        Object name_tree=null;
        Object char_literal9_tree=null;
        Object char_literal10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal12_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:2: (thePermission= ( ( permission )? ) (isStatic= K_STATIC )? returnType= type name= ID '(' args= argumentList ')' '{' stmts= statementList '}' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:4: thePermission= ( ( permission )? ) (isStatic= K_STATIC )? returnType= type name= ID '(' args= argumentList ')' '{' stmts= statementList '}'
            {
            root_0 = (Object)adaptor.nil();


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:18: ( ( permission )? )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:19: ( permission )?
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:19: ( permission )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= K_PRIVATE && LA5_0 <= K_PUBLIC)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:19: permission
                    {
                    pushFollow(FOLLOW_permission_in_method774);
                    permission8=permission();

                    state._fsp--;

                    adaptor.addChild(root_0, permission8.getTree());

                    }
                    break;

            }


            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:40: (isStatic= K_STATIC )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_STATIC) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:123:40: isStatic= K_STATIC
                    {
                    isStatic=(Token)match(input,K_STATIC,FOLLOW_K_STATIC_in_method780); 
                    isStatic_tree = 
                    (Object)adaptor.create(isStatic)
                    ;
                    adaptor.addChild(root_0, isStatic_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_type_in_method785);
            returnType=type();

            state._fsp--;

            adaptor.addChild(root_0, returnType.getTree());

            name=(Token)match(input,ID,FOLLOW_ID_in_method789); 
            name_tree = 
            (Object)adaptor.create(name)
            ;
            adaptor.addChild(root_0, name_tree);


            char_literal9=(Token)match(input,21,FOLLOW_21_in_method793); 
            char_literal9_tree = 
            (Object)adaptor.create(char_literal9)
            ;
            adaptor.addChild(root_0, char_literal9_tree);


            pushFollow(FOLLOW_argumentList_in_method797);
            args=argumentList();

            state._fsp--;

            adaptor.addChild(root_0, args.getTree());

            char_literal10=(Token)match(input,22,FOLLOW_22_in_method799); 
            char_literal10_tree = 
            (Object)adaptor.create(char_literal10)
            ;
            adaptor.addChild(root_0, char_literal10_tree);


            char_literal11=(Token)match(input,27,FOLLOW_27_in_method803); 
            char_literal11_tree = 
            (Object)adaptor.create(char_literal11)
            ;
            adaptor.addChild(root_0, char_literal11_tree);


            pushFollow(FOLLOW_statementList_in_method809);
            stmts=statementList();

            state._fsp--;

            adaptor.addChild(root_0, stmts.getTree());

            char_literal12=(Token)match(input,28,FOLLOW_28_in_method813); 
            char_literal12_tree = 
            (Object)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);



            			retval.result = new org.z.lexer.grammar.Method();
            			if(thePermission != null)
            				retval.result.setPermission(thePermission.getText());
            			retval.result.setIsStatic(isStatic != null);
            			retval.result.setReturnType(returnType.result);
            			retval.result.setName(name.getText());
            			retval.result.setArguments(args.result);
            			if(stmts != null)
            				retval.result.setStatements(stmts.result);
            		

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method"


    public static class statementList_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.StatementList result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statementList"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:141:1: statementList returns [org.z.lexer.grammar.StatementList result] : (stmt= statement )* ;
    public final JavaParser.statementList_return statementList() throws RecognitionException {
        JavaParser.statementList_return retval = new JavaParser.statementList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.statement_return stmt =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:142:2: ( (stmt= statement )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:142:4: (stmt= statement )*
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.StatementList();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:145:3: (stmt= statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CHAR||LA7_0==FLOAT||(LA7_0 >= ID && LA7_0 <= INT)||LA7_0==STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:145:4: stmt= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statementList840);
            	    stmt=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt.getTree());


            	    			retval.result.add(stmt.result);
            	    		

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statementList"


    public static class argumentList_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.ArgumentList result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argumentList"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:151:1: argumentList returns [org.z.lexer.grammar.ArgumentList result] : (def= argument )? ( ',' def= argument )* ;
    public final JavaParser.argumentList_return argumentList() throws RecognitionException {
        JavaParser.argumentList_return retval = new JavaParser.argumentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal13=null;
        JavaParser.argument_return def =null;


        Object char_literal13_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:152:2: ( (def= argument )? ( ',' def= argument )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:152:4: (def= argument )? ( ',' def= argument )*
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.ArgumentList();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:155:6: (def= argument )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:155:6: def= argument
                    {
                    pushFollow(FOLLOW_argument_in_argumentList868);
                    def=argument();

                    state._fsp--;

                    adaptor.addChild(root_0, def.getTree());

                    }
                    break;

            }



            			if(def != null)
            				retval.result.add(def.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:160:3: ( ',' def= argument )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:160:4: ',' def= argument
            	    {
            	    char_literal13=(Token)match(input,23,FOLLOW_23_in_argumentList878); 
            	    char_literal13_tree = 
            	    (Object)adaptor.create(char_literal13)
            	    ;
            	    adaptor.addChild(root_0, char_literal13_tree);


            	    pushFollow(FOLLOW_argument_in_argumentList882);
            	    def=argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, def.getTree());


            	    			retval.result.add(def.result);
            	    		

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argumentList"


    public static class argument_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Argument result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:166:1: argument returns [org.z.lexer.grammar.Argument result] : theType= type name= ID ;
    public final JavaParser.argument_return argument() throws RecognitionException {
        JavaParser.argument_return retval = new JavaParser.argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token name=null;
        JavaParser.type_return theType =null;


        Object name_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:167:2: (theType= type name= ID )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:167:4: theType= type name= ID
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument906);
            theType=type();

            state._fsp--;

            adaptor.addChild(root_0, theType.getTree());

            name=(Token)match(input,ID,FOLLOW_ID_in_argument910); 
            name_tree = 
            (Object)adaptor.create(name)
            ;
            adaptor.addChild(root_0, name_tree);



            			retval.result = new org.z.lexer.grammar.Argument();
            			retval.result.setType(theType.result);
            			retval.result.setName(name.getText());
            		

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument"


    public static class statement_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Statement result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:175:1: statement returns [org.z.lexer.grammar.Statement result] : stmt= simpleStatement ;
    public final JavaParser.statement_return statement() throws RecognitionException {
        JavaParser.statement_return retval = new JavaParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.simpleStatement_return stmt =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:176:2: (stmt= simpleStatement )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:176:4: stmt= simpleStatement
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_simpleStatement_in_statement932);
            stmt=simpleStatement();

            state._fsp--;

            adaptor.addChild(root_0, stmt.getTree());


            			retval.result = stmt.result;
            		

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class simpleStatement_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.SimpleStatement result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:182:1: simpleStatement returns [org.z.lexer.grammar.SimpleStatement result] : expr= expression ';' ;
    public final JavaParser.simpleStatement_return simpleStatement() throws RecognitionException {
        JavaParser.simpleStatement_return retval = new JavaParser.simpleStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal14=null;
        JavaParser.expression_return expr =null;


        Object char_literal14_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:183:2: (expr= expression ';' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:183:4: expr= expression ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_simpleStatement953);
            expr=expression();

            state._fsp--;

            adaptor.addChild(root_0, expr.getTree());


            			retval.result = new org.z.lexer.grammar.SimpleStatement();
            			retval.result.setExpression(expr.result);
            		

            char_literal14=(Token)match(input,25,FOLLOW_25_in_simpleStatement961); 
            char_literal14_tree = 
            (Object)adaptor.create(char_literal14)
            ;
            adaptor.addChild(root_0, char_literal14_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleStatement"


    public static class expression_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Expression result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:191:1: expression returns [org.z.lexer.grammar.Expression result] : expr= functionCall ;
    public final JavaParser.expression_return expression() throws RecognitionException {
        JavaParser.expression_return retval = new JavaParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.functionCall_return expr =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:192:2: (expr= functionCall )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:192:4: expr= functionCall
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_functionCall_in_expression978);
            expr=functionCall();

            state._fsp--;

            adaptor.addChild(root_0, expr.getTree());


            			retval.result = expr.result;
            		

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class functionCall_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.FunctionCall result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:198:1: functionCall returns [org.z.lexer.grammar.FunctionCall result] : expr= objectAccess ( '(' args= expressionList ')' )? ;
    public final JavaParser.functionCall_return functionCall() throws RecognitionException {
        JavaParser.functionCall_return retval = new JavaParser.functionCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal15=null;
        Token char_literal16=null;
        JavaParser.objectAccess_return expr =null;

        JavaParser.expressionList_return args =null;


        Object char_literal15_tree=null;
        Object char_literal16_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:199:2: (expr= objectAccess ( '(' args= expressionList ')' )? )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:199:4: expr= objectAccess ( '(' args= expressionList ')' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objectAccess_in_functionCall1001);
            expr=objectAccess();

            state._fsp--;

            adaptor.addChild(root_0, expr.getTree());


            			retval.result = new org.z.lexer.grammar.FunctionCall();
            			retval.result.setExpression(expr.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:204:3: ( '(' args= expressionList ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:204:4: '(' args= expressionList ')'
                    {
                    char_literal15=(Token)match(input,21,FOLLOW_21_in_functionCall1010); 
                    char_literal15_tree = 
                    (Object)adaptor.create(char_literal15)
                    ;
                    adaptor.addChild(root_0, char_literal15_tree);


                    pushFollow(FOLLOW_expressionList_in_functionCall1014);
                    args=expressionList();

                    state._fsp--;

                    adaptor.addChild(root_0, args.getTree());

                    char_literal16=(Token)match(input,22,FOLLOW_22_in_functionCall1016); 
                    char_literal16_tree = 
                    (Object)adaptor.create(char_literal16)
                    ;
                    adaptor.addChild(root_0, char_literal16_tree);



                    			retval.result.setArguments(args.result);
                    		

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class objectAccess_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.ObjectAccess result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objectAccess"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:210:1: objectAccess returns [org.z.lexer.grammar.ObjectAccess result] :left= value ( '.' ^right= expression )? ;
    public final JavaParser.objectAccess_return objectAccess() throws RecognitionException {
        JavaParser.objectAccess_return retval = new JavaParser.objectAccess_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal17=null;
        JavaParser.value_return left =null;

        JavaParser.expression_return right =null;


        Object char_literal17_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:211:2: (left= value ( '.' ^right= expression )? )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:211:4: left= value ( '.' ^right= expression )?
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.ObjectAccess();
            		

            pushFollow(FOLLOW_value_in_objectAccess1045);
            left=value();

            state._fsp--;

            adaptor.addChild(root_0, left.getTree());


            			retval.result.setLeft(left.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:218:3: ( '.' ^right= expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:218:4: '.' ^right= expression
                    {
                    char_literal17=(Token)match(input,24,FOLLOW_24_in_objectAccess1054); 
                    char_literal17_tree = 
                    (Object)adaptor.create(char_literal17)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal17_tree, root_0);


                    pushFollow(FOLLOW_expression_in_objectAccess1059);
                    right=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, right.getTree());


                    			retval.result.setRight(right.result);
                    		

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "objectAccess"


    public static class unaryExpression_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.UnaryExpression result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpression"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:224:1: unaryExpression returns [org.z.lexer.grammar.UnaryExpression result] : expr= value ;
    public final JavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JavaParser.unaryExpression_return retval = new JavaParser.unaryExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.value_return expr =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:225:2: (expr= value )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:225:4: expr= value
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_value_in_unaryExpression1083);
            expr=value();

            state._fsp--;

            adaptor.addChild(root_0, expr.getTree());


            			retval.result = expr.result;
            		

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"


    public static class value_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Value result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:231:1: value returns [org.z.lexer.grammar.Value result] : (x1= INT |x2= FLOAT |x3= STRING |x4= CHAR |x5= ID ) ;
    public final JavaParser.value_return value() throws RecognitionException {
        JavaParser.value_return retval = new JavaParser.value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token x1=null;
        Token x2=null;
        Token x3=null;
        Token x4=null;
        Token x5=null;

        Object x1_tree=null;
        Object x2_tree=null;
        Object x3_tree=null;
        Object x4_tree=null;
        Object x5_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:232:2: ( (x1= INT |x2= FLOAT |x3= STRING |x4= CHAR |x5= ID ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:232:4: (x1= INT |x2= FLOAT |x3= STRING |x4= CHAR |x5= ID )
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.Value();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:235:3: (x1= INT |x2= FLOAT |x3= STRING |x4= CHAR |x5= ID )
            int alt12=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt12=1;
                }
                break;
            case FLOAT:
                {
                alt12=2;
                }
                break;
            case STRING:
                {
                alt12=3;
                }
                break;
            case CHAR:
                {
                alt12=4;
                }
                break;
            case ID:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:235:4: x1= INT
                    {
                    x1=(Token)match(input,INT,FOLLOW_INT_in_value1109); 
                    x1_tree = 
                    (Object)adaptor.create(x1)
                    ;
                    adaptor.addChild(root_0, x1_tree);



                    			retval.result.setValue(Integer.valueOf(x1.getText()));
                    		

                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:239:4: x2= FLOAT
                    {
                    x2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value1120); 
                    x2_tree = 
                    (Object)adaptor.create(x2)
                    ;
                    adaptor.addChild(root_0, x2_tree);



                    			retval.result.setValue(Float.valueOf(x2.getText()));
                    		

                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:243:4: x3= STRING
                    {
                    x3=(Token)match(input,STRING,FOLLOW_STRING_in_value1131); 
                    x3_tree = 
                    (Object)adaptor.create(x3)
                    ;
                    adaptor.addChild(root_0, x3_tree);



                    			retval.result.setValue(x3.getText());
                    		

                    }
                    break;
                case 4 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:247:4: x4= CHAR
                    {
                    x4=(Token)match(input,CHAR,FOLLOW_CHAR_in_value1142); 
                    x4_tree = 
                    (Object)adaptor.create(x4)
                    ;
                    adaptor.addChild(root_0, x4_tree);



                    			retval.result.setValue(new Character(x4.getText().charAt(0)));
                    		

                    }
                    break;
                case 5 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:251:4: x5= ID
                    {
                    x5=(Token)match(input,ID,FOLLOW_ID_in_value1153); 
                    x5_tree = 
                    (Object)adaptor.create(x5)
                    ;
                    adaptor.addChild(root_0, x5_tree);



                    			retval.result.setValue(x5.getText());
                    		

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class expressionList_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.ExpressionList result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:257:1: expressionList returns [org.z.lexer.grammar.ExpressionList result] : (expr= expression )? ( ',' expr= expression )* ;
    public final JavaParser.expressionList_return expressionList() throws RecognitionException {
        JavaParser.expressionList_return retval = new JavaParser.expressionList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal18=null;
        JavaParser.expression_return expr =null;


        Object char_literal18_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:258:2: ( (expr= expression )? ( ',' expr= expression )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:258:4: (expr= expression )? ( ',' expr= expression )*
            {
            root_0 = (Object)adaptor.nil();


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:258:8: (expr= expression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==CHAR||LA13_0==FLOAT||(LA13_0 >= ID && LA13_0 <= INT)||LA13_0==STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:258:8: expr= expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionList1175);
                    expr=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expr.getTree());

                    }
                    break;

            }



            			retval.result = new org.z.lexer.grammar.ExpressionList();
            			if(expr != null)
            				retval.result.add(expr.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:264:3: ( ',' expr= expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:264:4: ',' expr= expression
            	    {
            	    char_literal18=(Token)match(input,23,FOLLOW_23_in_expressionList1185); 
            	    char_literal18_tree = 
            	    (Object)adaptor.create(char_literal18)
            	    ;
            	    adaptor.addChild(root_0, char_literal18_tree);


            	    pushFollow(FOLLOW_expression_in_expressionList1191);
            	    expr=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr.getTree());


            	    			retval.result.add(expr.result);
            	    		

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    // Delegated rules


 

    public static final BitSet FOLLOW_classDefinition_in_run641 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_EOF_in_run649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PUBLIC_in_classDefinition670 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_CLASS_in_classDefinition673 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classDefinition677 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_classDefinition679 = new BitSet(new long[]{0x000000001001E400L});
    public static final BitSet FOLLOW_method_in_classDefinition690 = new BitSet(new long[]{0x000000001001E400L});
    public static final BitSet FOLLOW_28_in_classDefinition698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_classDefinition702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type742 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_type751 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_permission_in_method774 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_K_STATIC_in_method780 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_type_in_method785 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_method789 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_method793 = new BitSet(new long[]{0x0000000000C00400L});
    public static final BitSet FOLLOW_argumentList_in_method797 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_method799 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_method803 = new BitSet(new long[]{0x0000000010040D10L});
    public static final BitSet FOLLOW_statementList_in_method809 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_method813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList840 = new BitSet(new long[]{0x0000000000040D12L});
    public static final BitSet FOLLOW_argument_in_argumentList868 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_argumentList878 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_argument_in_argumentList882 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_type_in_argument906 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_argument910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_statement932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_simpleStatement953 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_simpleStatement961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_expression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectAccess_in_functionCall1001 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_functionCall1010 = new BitSet(new long[]{0x0000000000C40D10L});
    public static final BitSet FOLLOW_expressionList_in_functionCall1014 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_functionCall1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_objectAccess1045 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_objectAccess1054 = new BitSet(new long[]{0x0000000000040D10L});
    public static final BitSet FOLLOW_expression_in_objectAccess1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_unaryExpression1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_value1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_value1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1175 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_expressionList1185 = new BitSet(new long[]{0x0000000000040D10L});
    public static final BitSet FOLLOW_expression_in_expressionList1191 = new BitSet(new long[]{0x0000000000800002L});

}