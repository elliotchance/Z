// $ANTLR 3.4 /Users/elliot/NetBeansProjects/Z/grammar/Java.g 2012-04-09 01:19:21

	package org.z.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "K_CATCH", "K_CLASS", "K_FINAL", "K_FINALLY", "K_IF", "K_IMPORT", "K_NATIVE", "K_NULL", "K_PACKAGE", "K_PRIVATE", "K_PROTECTED", "K_PUBLIC", "K_RETURN", "K_STATIC", "K_SYNCHRONIZED", "K_THROW", "K_THROWS", "K_TRY", "K_VOLATILE", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'!='", "'('", "')'", "'*'", "'*='", "'+='", "','", "'-='", "'.'", "'/='", "';'", "'='", "'=='", "'[]'", "'{'", "'}'"
    };

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


    	private String activePackageName = null;


    public static class fullName_return extends ParserRuleReturnScope {
        public java.lang.String result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fullName"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:93:1: fullName returns [java.lang.String result] : x= ID ( ( '.' x= ID ) )* ;
    public final JavaParser.fullName_return fullName() throws RecognitionException {
        JavaParser.fullName_return retval = new JavaParser.fullName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token x=null;
        Token char_literal1=null;

        Object x_tree=null;
        Object char_literal1_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:2: (x= ID ( ( '.' x= ID ) )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:94:4: x= ID ( ( '.' x= ID ) )*
            {
            root_0 = (Object)adaptor.nil();


            x=(Token)match(input,ID,FOLLOW_ID_in_fullName753); 
            x_tree = 
            (Object)adaptor.create(x)
            ;
            adaptor.addChild(root_0, x_tree);



            			retval.result = x.getText();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:3: ( ( '.' x= ID ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==43) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:4: ( '.' x= ID )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:4: ( '.' x= ID )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:97:5: '.' x= ID
            	    {
            	    char_literal1=(Token)match(input,43,FOLLOW_43_in_fullName761); 
            	    char_literal1_tree = 
            	    (Object)adaptor.create(char_literal1)
            	    ;
            	    adaptor.addChild(root_0, char_literal1_tree);


            	    x=(Token)match(input,ID,FOLLOW_ID_in_fullName765); 
            	    x_tree = 
            	    (Object)adaptor.create(x)
            	    ;
            	    adaptor.addChild(root_0, x_tree);


            	    }



            	    			retval.result += "." + x.getText();
            	    		

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "fullName"


    public static class importName_return extends ParserRuleReturnScope {
        public java.lang.String result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importName"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:102:1: importName returns [java.lang.String result] : x= ID ( '.' ( (x= ID ) | (x= '*' ) ) )* ;
    public final JavaParser.importName_return importName() throws RecognitionException {
        JavaParser.importName_return retval = new JavaParser.importName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token x=null;
        Token char_literal2=null;

        Object x_tree=null;
        Object char_literal2_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:103:2: (x= ID ( '.' ( (x= ID ) | (x= '*' ) ) )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:103:4: x= ID ( '.' ( (x= ID ) | (x= '*' ) ) )*
            {
            root_0 = (Object)adaptor.nil();


            x=(Token)match(input,ID,FOLLOW_ID_in_importName788); 
            x_tree = 
            (Object)adaptor.create(x)
            ;
            adaptor.addChild(root_0, x_tree);



            			retval.result = x.getText();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:106:3: ( '.' ( (x= ID ) | (x= '*' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==43) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:107:4: '.' ( (x= ID ) | (x= '*' ) )
            	    {
            	    char_literal2=(Token)match(input,43,FOLLOW_43_in_importName801); 
            	    char_literal2_tree = 
            	    (Object)adaptor.create(char_literal2)
            	    ;
            	    adaptor.addChild(root_0, char_literal2_tree);


            	     retval.result += "."; 

            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:108:4: ( (x= ID ) | (x= '*' ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==ID) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==38) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:109:5: (x= ID )
            	            {
            	            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:109:5: (x= ID )
            	            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:109:6: x= ID
            	            {
            	            x=(Token)match(input,ID,FOLLOW_ID_in_importName817); 
            	            x_tree = 
            	            (Object)adaptor.create(x)
            	            ;
            	            adaptor.addChild(root_0, x_tree);


            	             retval.result += x.getText(); 

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:111:5: (x= '*' )
            	            {
            	            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:111:5: (x= '*' )
            	            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:111:6: x= '*'
            	            {
            	            x=(Token)match(input,38,FOLLOW_38_in_importName835); 
            	            x_tree = 
            	            (Object)adaptor.create(x)
            	            ;
            	            adaptor.addChild(root_0, x_tree);


            	             retval.result += x.getText(); 

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "importName"


    public static class run_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.File result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "run"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:116:1: run returns [org.z.lexer.grammar.File result] : ( (thePackageName= packageDefinition ) | (theImportName= importDefinition ) | (def= classDefinition ) )* ;
    public final JavaParser.run_return run() throws RecognitionException {
        JavaParser.run_return retval = new JavaParser.run_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.packageDefinition_return thePackageName =null;

        JavaParser.importDefinition_return theImportName =null;

        JavaParser.classDefinition_return def =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:117:2: ( ( (thePackageName= packageDefinition ) | (theImportName= importDefinition ) | (def= classDefinition ) )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:117:4: ( (thePackageName= packageDefinition ) | (theImportName= importDefinition ) | (def= classDefinition ) )*
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.File();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:120:3: ( (thePackageName= packageDefinition ) | (theImportName= importDefinition ) | (def= classDefinition ) )*
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case K_PACKAGE:
                    {
                    alt4=1;
                    }
                    break;
                case K_IMPORT:
                    {
                    alt4=2;
                    }
                    break;
                case K_CLASS:
                case K_FINAL:
                case K_PUBLIC:
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:121:4: (thePackageName= packageDefinition )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:121:4: (thePackageName= packageDefinition )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:121:5: thePackageName= packageDefinition
            	    {
            	    pushFollow(FOLLOW_packageDefinition_in_run879);
            	    thePackageName=packageDefinition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, thePackageName.getTree());


            	    				retval.result.setPackageName(thePackageName.result);
            	    				activePackageName = thePackageName.result;
            	    			

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:126:4: (theImportName= importDefinition )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:126:4: (theImportName= importDefinition )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:126:5: theImportName= importDefinition
            	    {
            	    pushFollow(FOLLOW_importDefinition_in_run895);
            	    theImportName=importDefinition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, theImportName.getTree());


            	    				retval.result.addImport(theImportName.result);
            	    			

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:130:4: (def= classDefinition )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:130:4: (def= classDefinition )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:130:5: def= classDefinition
            	    {
            	    pushFollow(FOLLOW_classDefinition_in_run911);
            	    def=classDefinition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, def.getTree());


            	    				retval.result.addClass(def.result);
            	    			

            	    }


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
    // $ANTLR end "run"


    public static class packageDefinition_return extends ParserRuleReturnScope {
        public String result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "packageDefinition"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:136:1: packageDefinition returns [String result] : K_PACKAGE thePackageName= fullName ';' ;
    public final JavaParser.packageDefinition_return packageDefinition() throws RecognitionException {
        JavaParser.packageDefinition_return retval = new JavaParser.packageDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_PACKAGE3=null;
        Token char_literal4=null;
        JavaParser.fullName_return thePackageName =null;


        Object K_PACKAGE3_tree=null;
        Object char_literal4_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:137:2: ( K_PACKAGE thePackageName= fullName ';' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:137:4: K_PACKAGE thePackageName= fullName ';'
            {
            root_0 = (Object)adaptor.nil();


            K_PACKAGE3=(Token)match(input,K_PACKAGE,FOLLOW_K_PACKAGE_in_packageDefinition935); 
            K_PACKAGE3_tree = 
            (Object)adaptor.create(K_PACKAGE3)
            ;
            adaptor.addChild(root_0, K_PACKAGE3_tree);


            pushFollow(FOLLOW_fullName_in_packageDefinition941);
            thePackageName=fullName();

            state._fsp--;

            adaptor.addChild(root_0, thePackageName.getTree());


            			retval.result = thePackageName.result;
            		

            char_literal4=(Token)match(input,45,FOLLOW_45_in_packageDefinition947); 
            char_literal4_tree = 
            (Object)adaptor.create(char_literal4)
            ;
            adaptor.addChild(root_0, char_literal4_tree);


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
    // $ANTLR end "packageDefinition"


    public static class importDefinition_return extends ParserRuleReturnScope {
        public String result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importDefinition"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:144:1: importDefinition returns [String result] : K_IMPORT theImportName= importName ';' ;
    public final JavaParser.importDefinition_return importDefinition() throws RecognitionException {
        JavaParser.importDefinition_return retval = new JavaParser.importDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_IMPORT5=null;
        Token char_literal6=null;
        JavaParser.importName_return theImportName =null;


        Object K_IMPORT5_tree=null;
        Object char_literal6_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:145:2: ( K_IMPORT theImportName= importName ';' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:145:4: K_IMPORT theImportName= importName ';'
            {
            root_0 = (Object)adaptor.nil();


            K_IMPORT5=(Token)match(input,K_IMPORT,FOLLOW_K_IMPORT_in_importDefinition965); 
            K_IMPORT5_tree = 
            (Object)adaptor.create(K_IMPORT5)
            ;
            adaptor.addChild(root_0, K_IMPORT5_tree);


            pushFollow(FOLLOW_importName_in_importDefinition971);
            theImportName=importName();

            state._fsp--;

            adaptor.addChild(root_0, theImportName.getTree());


            			retval.result = theImportName.result;
            		

            char_literal6=(Token)match(input,45,FOLLOW_45_in_importDefinition979); 
            char_literal6_tree = 
            (Object)adaptor.create(char_literal6)
            ;
            adaptor.addChild(root_0, char_literal6_tree);


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
    // $ANTLR end "importDefinition"


    public static class instanceVariable_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.InstanceVariable result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instanceVariable"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:153:1: instanceVariable returns [org.z.lexer.grammar.InstanceVariable result] : ( (thePermission= permission ) | ( K_STATIC ) | ( K_FINAL ) | ( K_VOLATILE ) )* (theType= type ) (variableName= ID ) ( ( '=' stmt= simpleStatement ) ) ';' ;
    public final JavaParser.instanceVariable_return instanceVariable() throws RecognitionException {
        JavaParser.instanceVariable_return retval = new JavaParser.instanceVariable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token variableName=null;
        Token K_STATIC7=null;
        Token K_FINAL8=null;
        Token K_VOLATILE9=null;
        Token char_literal10=null;
        Token char_literal11=null;
        JavaParser.permission_return thePermission =null;

        JavaParser.type_return theType =null;

        JavaParser.simpleStatement_return stmt =null;


        Object variableName_tree=null;
        Object K_STATIC7_tree=null;
        Object K_FINAL8_tree=null;
        Object K_VOLATILE9_tree=null;
        Object char_literal10_tree=null;
        Object char_literal11_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:154:2: ( ( (thePermission= permission ) | ( K_STATIC ) | ( K_FINAL ) | ( K_VOLATILE ) )* (theType= type ) (variableName= ID ) ( ( '=' stmt= simpleStatement ) ) ';' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:154:4: ( (thePermission= permission ) | ( K_STATIC ) | ( K_FINAL ) | ( K_VOLATILE ) )* (theType= type ) (variableName= ID ) ( ( '=' stmt= simpleStatement ) ) ';'
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.InstanceVariable();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:157:3: ( (thePermission= permission ) | ( K_STATIC ) | ( K_FINAL ) | ( K_VOLATILE ) )*
            loop5:
            do {
                int alt5=5;
                switch ( input.LA(1) ) {
                case K_PRIVATE:
                case K_PROTECTED:
                case K_PUBLIC:
                    {
                    alt5=1;
                    }
                    break;
                case K_STATIC:
                    {
                    alt5=2;
                    }
                    break;
                case K_FINAL:
                    {
                    alt5=3;
                    }
                    break;
                case K_VOLATILE:
                    {
                    alt5=4;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:158:4: (thePermission= permission )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:158:4: (thePermission= permission )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:158:5: thePermission= permission
            	    {
            	    pushFollow(FOLLOW_permission_in_instanceVariable1007);
            	    thePermission=permission();

            	    state._fsp--;

            	    adaptor.addChild(root_0, thePermission.getTree());


            	    				retval.result.setPermission(thePermission.toString());
            	    			

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:162:4: ( K_STATIC )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:162:4: ( K_STATIC )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:162:5: K_STATIC
            	    {
            	    K_STATIC7=(Token)match(input,K_STATIC,FOLLOW_K_STATIC_in_instanceVariable1021); 
            	    K_STATIC7_tree = 
            	    (Object)adaptor.create(K_STATIC7)
            	    ;
            	    adaptor.addChild(root_0, K_STATIC7_tree);



            	    				retval.result.setIsStatic(true);
            	    			

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:166:4: ( K_FINAL )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:166:4: ( K_FINAL )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:166:5: K_FINAL
            	    {
            	    K_FINAL8=(Token)match(input,K_FINAL,FOLLOW_K_FINAL_in_instanceVariable1035); 
            	    K_FINAL8_tree = 
            	    (Object)adaptor.create(K_FINAL8)
            	    ;
            	    adaptor.addChild(root_0, K_FINAL8_tree);



            	    				retval.result.setIsFinal(true);
            	    			

            	    }


            	    }
            	    break;
            	case 4 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:170:4: ( K_VOLATILE )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:170:4: ( K_VOLATILE )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:170:5: K_VOLATILE
            	    {
            	    K_VOLATILE9=(Token)match(input,K_VOLATILE,FOLLOW_K_VOLATILE_in_instanceVariable1049); 
            	    K_VOLATILE9_tree = 
            	    (Object)adaptor.create(K_VOLATILE9)
            	    ;
            	    adaptor.addChild(root_0, K_VOLATILE9_tree);



            	    				retval.result.setIsVolatile(true);
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:174:3: (theType= type )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:174:4: theType= type
            {
            pushFollow(FOLLOW_type_in_instanceVariable1064);
            theType=type();

            state._fsp--;

            adaptor.addChild(root_0, theType.getTree());


            			retval.result.setType(theType.result);
            		

            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:177:3: (variableName= ID )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:177:4: variableName= ID
            {
            variableName=(Token)match(input,ID,FOLLOW_ID_in_instanceVariable1074); 
            variableName_tree = 
            (Object)adaptor.create(variableName)
            ;
            adaptor.addChild(root_0, variableName_tree);



            			retval.result.setName(variableName.getText());
            		

            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:181:3: ( ( '=' stmt= simpleStatement ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:182:4: ( '=' stmt= simpleStatement )
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:182:4: ( '=' stmt= simpleStatement )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:183:5: '=' stmt= simpleStatement
            {
            char_literal10=(Token)match(input,46,FOLLOW_46_in_instanceVariable1094); 
            char_literal10_tree = 
            (Object)adaptor.create(char_literal10)
            ;
            adaptor.addChild(root_0, char_literal10_tree);


            pushFollow(FOLLOW_simpleStatement_in_instanceVariable1098);
            stmt=simpleStatement();

            state._fsp--;

            adaptor.addChild(root_0, stmt.getTree());


            					retval.result.setStatement(stmt.result);
            				

            }


            }


            char_literal11=(Token)match(input,45,FOLLOW_45_in_instanceVariable1117); 
            char_literal11_tree = 
            (Object)adaptor.create(char_literal11)
            ;
            adaptor.addChild(root_0, char_literal11_tree);


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
    // $ANTLR end "instanceVariable"


    public static class classDefinition_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Class result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:192:1: classDefinition returns [org.z.lexer.grammar.Class result] : ( ( K_PUBLIC ) | ( K_FINAL ) )* K_CLASS (theClassName= ID ) '{' ( (var= instanceVariable ) | (m= method ) | ( 'static' stmts= block ) )* '}' ;
    public final JavaParser.classDefinition_return classDefinition() throws RecognitionException {
        JavaParser.classDefinition_return retval = new JavaParser.classDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token theClassName=null;
        Token K_PUBLIC12=null;
        Token K_FINAL13=null;
        Token K_CLASS14=null;
        Token char_literal15=null;
        Token string_literal16=null;
        Token char_literal17=null;
        JavaParser.instanceVariable_return var =null;

        JavaParser.method_return m =null;

        JavaParser.block_return stmts =null;


        Object theClassName_tree=null;
        Object K_PUBLIC12_tree=null;
        Object K_FINAL13_tree=null;
        Object K_CLASS14_tree=null;
        Object char_literal15_tree=null;
        Object string_literal16_tree=null;
        Object char_literal17_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:193:2: ( ( ( K_PUBLIC ) | ( K_FINAL ) )* K_CLASS (theClassName= ID ) '{' ( (var= instanceVariable ) | (m= method ) | ( 'static' stmts= block ) )* '}' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:193:4: ( ( K_PUBLIC ) | ( K_FINAL ) )* K_CLASS (theClassName= ID ) '{' ( (var= instanceVariable ) | (m= method ) | ( 'static' stmts= block ) )* '}'
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.Class();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:196:3: ( ( K_PUBLIC ) | ( K_FINAL ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==K_PUBLIC) ) {
                    alt6=1;
                }
                else if ( (LA6_0==K_FINAL) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:197:4: ( K_PUBLIC )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:197:4: ( K_PUBLIC )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:197:5: K_PUBLIC
            	    {
            	    K_PUBLIC12=(Token)match(input,K_PUBLIC,FOLLOW_K_PUBLIC_in_classDefinition1146); 
            	    K_PUBLIC12_tree = 
            	    (Object)adaptor.create(K_PUBLIC12)
            	    ;
            	    adaptor.addChild(root_0, K_PUBLIC12_tree);



            	    				retval.result.setIsPublic(true);
            	    			

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:201:4: ( K_FINAL )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:201:4: ( K_FINAL )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:201:5: K_FINAL
            	    {
            	    K_FINAL13=(Token)match(input,K_FINAL,FOLLOW_K_FINAL_in_classDefinition1160); 
            	    K_FINAL13_tree = 
            	    (Object)adaptor.create(K_FINAL13)
            	    ;
            	    adaptor.addChild(root_0, K_FINAL13_tree);



            	    				retval.result.setIsFinal(true);
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            K_CLASS14=(Token)match(input,K_CLASS,FOLLOW_K_CLASS_in_classDefinition1172); 
            K_CLASS14_tree = 
            (Object)adaptor.create(K_CLASS14)
            ;
            adaptor.addChild(root_0, K_CLASS14_tree);


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:206:3: (theClassName= ID )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:206:4: theClassName= ID
            {
            theClassName=(Token)match(input,ID,FOLLOW_ID_in_classDefinition1179); 
            theClassName_tree = 
            (Object)adaptor.create(theClassName)
            ;
            adaptor.addChild(root_0, theClassName_tree);



            			if(activePackageName != null)
            				retval.result.setName(activePackageName + "." + theClassName.getText());
            			else
            				retval.result.setName(theClassName.getText());
            		

            }


            char_literal15=(Token)match(input,49,FOLLOW_49_in_classDefinition1186); 
            char_literal15_tree = 
            (Object)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:213:3: ( (var= instanceVariable ) | (m= method ) | ( 'static' stmts= block ) )*
            loop7:
            do {
                int alt7=4;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:214:4: (var= instanceVariable )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:214:4: (var= instanceVariable )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:214:5: var= instanceVariable
            	    {
            	    pushFollow(FOLLOW_instanceVariable_in_classDefinition1198);
            	    var=instanceVariable();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var.getTree());


            	    				retval.result.addInstanceVariable(var.result);
            	    			

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:218:4: (m= method )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:218:4: (m= method )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:218:5: m= method
            	    {
            	    pushFollow(FOLLOW_method_in_classDefinition1214);
            	    m=method();

            	    state._fsp--;

            	    adaptor.addChild(root_0, m.getTree());


            	    				retval.result.addMethod(m.result);
            	    			

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:223:4: ( 'static' stmts= block )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:223:4: ( 'static' stmts= block )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:223:5: 'static' stmts= block
            	    {
            	    string_literal16=(Token)match(input,K_STATIC,FOLLOW_K_STATIC_in_classDefinition1232); 
            	    string_literal16_tree = 
            	    (Object)adaptor.create(string_literal16)
            	    ;
            	    adaptor.addChild(root_0, string_literal16_tree);


            	    pushFollow(FOLLOW_block_in_classDefinition1236);
            	    stmts=block();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmts.getTree());


            	    				retval.result.setStaticBlock(stmts.result);
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            char_literal17=(Token)match(input,50,FOLLOW_50_in_classDefinition1248); 
            char_literal17_tree = 
            (Object)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


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
        public String result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "permission"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:230:1: permission returns [String result] : ( K_PUBLIC | K_PROTECTED | K_PRIVATE );
    public final JavaParser.permission_return permission() throws RecognitionException {
        JavaParser.permission_return retval = new JavaParser.permission_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_PUBLIC18=null;
        Token K_PROTECTED19=null;
        Token K_PRIVATE20=null;

        Object K_PUBLIC18_tree=null;
        Object K_PROTECTED19_tree=null;
        Object K_PRIVATE20_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:231:2: ( K_PUBLIC | K_PROTECTED | K_PRIVATE )
            int alt8=3;
            switch ( input.LA(1) ) {
            case K_PUBLIC:
                {
                alt8=1;
                }
                break;
            case K_PROTECTED:
                {
                alt8=2;
                }
                break;
            case K_PRIVATE:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:231:4: K_PUBLIC
                    {
                    root_0 = (Object)adaptor.nil();


                    K_PUBLIC18=(Token)match(input,K_PUBLIC,FOLLOW_K_PUBLIC_in_permission1265); 
                    K_PUBLIC18_tree = 
                    (Object)adaptor.create(K_PUBLIC18)
                    ;
                    adaptor.addChild(root_0, K_PUBLIC18_tree);



                    			retval.result = "public";
                    		

                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:234:4: K_PROTECTED
                    {
                    root_0 = (Object)adaptor.nil();


                    K_PROTECTED19=(Token)match(input,K_PROTECTED,FOLLOW_K_PROTECTED_in_permission1272); 
                    K_PROTECTED19_tree = 
                    (Object)adaptor.create(K_PROTECTED19)
                    ;
                    adaptor.addChild(root_0, K_PROTECTED19_tree);



                    			retval.result = "protected";
                    		

                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:237:4: K_PRIVATE
                    {
                    root_0 = (Object)adaptor.nil();


                    K_PRIVATE20=(Token)match(input,K_PRIVATE,FOLLOW_K_PRIVATE_in_permission1279); 
                    K_PRIVATE20_tree = 
                    (Object)adaptor.create(K_PRIVATE20)
                    ;
                    adaptor.addChild(root_0, K_PRIVATE20_tree);



                    			retval.result = "private";
                    		

                    }
                    break;

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
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:242:1: type returns [org.z.lexer.grammar.Type result] : base= ID ( '[]' )* ;
    public final JavaParser.type_return type() throws RecognitionException {
        JavaParser.type_return retval = new JavaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token base=null;
        Token string_literal21=null;

        Object base_tree=null;
        Object string_literal21_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:243:2: (base= ID ( '[]' )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:243:4: base= ID ( '[]' )*
            {
            root_0 = (Object)adaptor.nil();


            base=(Token)match(input,ID,FOLLOW_ID_in_type1300); 
            base_tree = 
            (Object)adaptor.create(base)
            ;
            adaptor.addChild(root_0, base_tree);



            			retval.result = new org.z.lexer.grammar.Type();
            			retval.result.setBase(base.getText());
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:248:3: ( '[]' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==48) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:248:4: '[]'
            	    {
            	    string_literal21=(Token)match(input,48,FOLLOW_48_in_type1309); 
            	    string_literal21_tree = 
            	    (Object)adaptor.create(string_literal21)
            	    ;
            	    adaptor.addChild(root_0, string_literal21_tree);



            	    			retval.result.setDepth(retval.result.getDepth() + 1);
            	    		

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
    // $ANTLR end "type"


    public static class method_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Method result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:253:1: method returns [org.z.lexer.grammar.Method result] : ( (thePermission= permission ) | ( K_STATIC ) | ( K_SYNCHRONIZED ) | ( K_FINAL ) | ( K_NATIVE ) )* (returnType= type )? name= ID ( '(' args= argumentList ')' ) ( K_THROWS ( (cn= fullName ( ',' )? ) )* )? ( (stmts= block ) | ( ';' ) ) ;
    public final JavaParser.method_return method() throws RecognitionException {
        JavaParser.method_return retval = new JavaParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token name=null;
        Token K_STATIC22=null;
        Token K_SYNCHRONIZED23=null;
        Token K_FINAL24=null;
        Token K_NATIVE25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token K_THROWS28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        JavaParser.permission_return thePermission =null;

        JavaParser.type_return returnType =null;

        JavaParser.argumentList_return args =null;

        JavaParser.fullName_return cn =null;

        JavaParser.block_return stmts =null;


        Object name_tree=null;
        Object K_STATIC22_tree=null;
        Object K_SYNCHRONIZED23_tree=null;
        Object K_FINAL24_tree=null;
        Object K_NATIVE25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal27_tree=null;
        Object K_THROWS28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:254:2: ( ( (thePermission= permission ) | ( K_STATIC ) | ( K_SYNCHRONIZED ) | ( K_FINAL ) | ( K_NATIVE ) )* (returnType= type )? name= ID ( '(' args= argumentList ')' ) ( K_THROWS ( (cn= fullName ( ',' )? ) )* )? ( (stmts= block ) | ( ';' ) ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:254:4: ( (thePermission= permission ) | ( K_STATIC ) | ( K_SYNCHRONIZED ) | ( K_FINAL ) | ( K_NATIVE ) )* (returnType= type )? name= ID ( '(' args= argumentList ')' ) ( K_THROWS ( (cn= fullName ( ',' )? ) )* )? ( (stmts= block ) | ( ';' ) )
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.Method();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:257:3: ( (thePermission= permission ) | ( K_STATIC ) | ( K_SYNCHRONIZED ) | ( K_FINAL ) | ( K_NATIVE ) )*
            loop10:
            do {
                int alt10=6;
                switch ( input.LA(1) ) {
                case K_PRIVATE:
                case K_PROTECTED:
                case K_PUBLIC:
                    {
                    alt10=1;
                    }
                    break;
                case K_STATIC:
                    {
                    alt10=2;
                    }
                    break;
                case K_SYNCHRONIZED:
                    {
                    alt10=3;
                    }
                    break;
                case K_FINAL:
                    {
                    alt10=4;
                    }
                    break;
                case K_NATIVE:
                    {
                    alt10=5;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:258:4: (thePermission= permission )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:258:4: (thePermission= permission )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:258:5: thePermission= permission
            	    {
            	    pushFollow(FOLLOW_permission_in_method1341);
            	    thePermission=permission();

            	    state._fsp--;

            	    adaptor.addChild(root_0, thePermission.getTree());


            	    				retval.result.setPermission(thePermission.result);
            	    			

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:262:4: ( K_STATIC )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:262:4: ( K_STATIC )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:262:5: K_STATIC
            	    {
            	    K_STATIC22=(Token)match(input,K_STATIC,FOLLOW_K_STATIC_in_method1355); 
            	    K_STATIC22_tree = 
            	    (Object)adaptor.create(K_STATIC22)
            	    ;
            	    adaptor.addChild(root_0, K_STATIC22_tree);



            	    				retval.result.setIsStatic(true);
            	    			

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:266:4: ( K_SYNCHRONIZED )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:266:4: ( K_SYNCHRONIZED )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:266:5: K_SYNCHRONIZED
            	    {
            	    K_SYNCHRONIZED23=(Token)match(input,K_SYNCHRONIZED,FOLLOW_K_SYNCHRONIZED_in_method1369); 
            	    K_SYNCHRONIZED23_tree = 
            	    (Object)adaptor.create(K_SYNCHRONIZED23)
            	    ;
            	    adaptor.addChild(root_0, K_SYNCHRONIZED23_tree);



            	    				retval.result.setIsSynchronized(true);
            	    			

            	    }


            	    }
            	    break;
            	case 4 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:270:4: ( K_FINAL )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:270:4: ( K_FINAL )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:270:5: K_FINAL
            	    {
            	    K_FINAL24=(Token)match(input,K_FINAL,FOLLOW_K_FINAL_in_method1383); 
            	    K_FINAL24_tree = 
            	    (Object)adaptor.create(K_FINAL24)
            	    ;
            	    adaptor.addChild(root_0, K_FINAL24_tree);



            	    				retval.result.setIsFinal(true);
            	    			

            	    }


            	    }
            	    break;
            	case 5 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:274:4: ( K_NATIVE )
            	    {
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:274:4: ( K_NATIVE )
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:274:5: K_NATIVE
            	    {
            	    K_NATIVE25=(Token)match(input,K_NATIVE,FOLLOW_K_NATIVE_in_method1397); 
            	    K_NATIVE25_tree = 
            	    (Object)adaptor.create(K_NATIVE25)
            	    ;
            	    adaptor.addChild(root_0, K_NATIVE25_tree);



            	    				retval.result.setIsNative(true);
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:278:3: (returnType= type )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==ID||LA11_1==48) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:278:4: returnType= type
                    {
                    pushFollow(FOLLOW_type_in_method1412);
                    returnType=type();

                    state._fsp--;

                    adaptor.addChild(root_0, returnType.getTree());


                    			retval.result.setReturnType(returnType.result);
                    		

                    }
                    break;

            }


            name=(Token)match(input,ID,FOLLOW_ID_in_method1422); 
            name_tree = 
            (Object)adaptor.create(name)
            ;
            adaptor.addChild(root_0, name_tree);



            			retval.result.setName(name.getText());
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:284:3: ( '(' args= argumentList ')' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:284:4: '(' args= argumentList ')'
            {
            char_literal26=(Token)match(input,36,FOLLOW_36_in_method1429); 
            char_literal26_tree = 
            (Object)adaptor.create(char_literal26)
            ;
            adaptor.addChild(root_0, char_literal26_tree);


            pushFollow(FOLLOW_argumentList_in_method1433);
            args=argumentList();

            state._fsp--;

            adaptor.addChild(root_0, args.getTree());

            char_literal27=(Token)match(input,37,FOLLOW_37_in_method1435); 
            char_literal27_tree = 
            (Object)adaptor.create(char_literal27)
            ;
            adaptor.addChild(root_0, char_literal27_tree);



            			retval.result.setArguments(args.result);
            		

            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:287:3: ( K_THROWS ( (cn= fullName ( ',' )? ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==K_THROWS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:288:4: K_THROWS ( (cn= fullName ( ',' )? ) )*
                    {
                    K_THROWS28=(Token)match(input,K_THROWS,FOLLOW_K_THROWS_in_method1447); 
                    K_THROWS28_tree = 
                    (Object)adaptor.create(K_THROWS28)
                    ;
                    adaptor.addChild(root_0, K_THROWS28_tree);


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:289:4: ( (cn= fullName ( ',' )? ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:290:5: (cn= fullName ( ',' )? )
                    	    {
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:290:5: (cn= fullName ( ',' )? )
                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:290:6: cn= fullName ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_fullName_in_method1461);
                    	    cn=fullName();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, cn.getTree());

                    	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:290:18: ( ',' )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0==41) ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:290:18: ','
                    	            {
                    	            char_literal29=(Token)match(input,41,FOLLOW_41_in_method1463); 
                    	            char_literal29_tree = 
                    	            (Object)adaptor.create(char_literal29)
                    	            ;
                    	            adaptor.addChild(root_0, char_literal29_tree);


                    	            }
                    	            break;

                    	    }


                    	    }



                    	    					retval.result.addThrows(cn.result);
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:295:3: ( (stmts= block ) | ( ';' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            else if ( (LA15_0==45) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:296:4: (stmts= block )
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:296:4: (stmts= block )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:296:5: stmts= block
                    {
                    pushFollow(FOLLOW_block_in_method1490);
                    stmts=block();

                    state._fsp--;

                    adaptor.addChild(root_0, stmts.getTree());


                    				retval.result.setBlock(stmts.result);
                    				retval.result.setHasBody(true);
                    			

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:301:4: ( ';' )
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:301:4: ( ';' )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:301:5: ';'
                    {
                    char_literal30=(Token)match(input,45,FOLLOW_45_in_method1504); 
                    char_literal30_tree = 
                    (Object)adaptor.create(char_literal30)
                    ;
                    adaptor.addChild(root_0, char_literal30_tree);



                    				retval.result.setHasBody(false);
                    			

                    }


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
    // $ANTLR end "method"


    public static class block_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Block result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:307:1: block returns [org.z.lexer.grammar.Block result] : ( '{' (stmt= statement )* '}' ) ;
    public final JavaParser.block_return block() throws RecognitionException {
        JavaParser.block_return retval = new JavaParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal31=null;
        Token char_literal32=null;
        JavaParser.statement_return stmt =null;


        Object char_literal31_tree=null;
        Object char_literal32_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:308:2: ( ( '{' (stmt= statement )* '}' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:308:4: ( '{' (stmt= statement )* '}' )
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.Block();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:311:3: ( '{' (stmt= statement )* '}' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:311:4: '{' (stmt= statement )* '}'
            {
            char_literal31=(Token)match(input,49,FOLLOW_49_in_block1532); 
            char_literal31_tree = 
            (Object)adaptor.create(char_literal31)
            ;
            adaptor.addChild(root_0, char_literal31_tree);


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:312:3: (stmt= statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CHAR||LA16_0==FLOAT||(LA16_0 >= ID && LA16_0 <= INT)||LA16_0==K_IF||LA16_0==K_NULL||LA16_0==K_RETURN||LA16_0==K_SYNCHRONIZED||LA16_0==K_TRY||LA16_0==STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:312:4: stmt= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block1539);
            	    stmt=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt.getTree());


            	    			retval.result.add(stmt.result);
            	    		

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            char_literal32=(Token)match(input,50,FOLLOW_50_in_block1547); 
            char_literal32_tree = 
            (Object)adaptor.create(char_literal32)
            ;
            adaptor.addChild(root_0, char_literal32_tree);


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
    // $ANTLR end "block"


    public static class argumentList_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.ArgumentList result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argumentList"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:318:1: argumentList returns [org.z.lexer.grammar.ArgumentList result] : (def= argument )? ( ',' def= argument )* ;
    public final JavaParser.argumentList_return argumentList() throws RecognitionException {
        JavaParser.argumentList_return retval = new JavaParser.argumentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal33=null;
        JavaParser.argument_return def =null;


        Object char_literal33_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:319:2: ( (def= argument )? ( ',' def= argument )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:319:4: (def= argument )? ( ',' def= argument )*
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.ArgumentList();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:322:6: (def= argument )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||LA17_0==K_FINAL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:322:6: def= argument
                    {
                    pushFollow(FOLLOW_argument_in_argumentList1570);
                    def=argument();

                    state._fsp--;

                    adaptor.addChild(root_0, def.getTree());

                    }
                    break;

            }



            			if(def != null)
            				retval.result.add(def.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:327:3: ( ',' def= argument )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:327:4: ',' def= argument
            	    {
            	    char_literal33=(Token)match(input,41,FOLLOW_41_in_argumentList1580); 
            	    char_literal33_tree = 
            	    (Object)adaptor.create(char_literal33)
            	    ;
            	    adaptor.addChild(root_0, char_literal33_tree);


            	    pushFollow(FOLLOW_argument_in_argumentList1584);
            	    def=argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, def.getTree());


            	    			retval.result.add(def.result);
            	    		

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:333:1: argument returns [org.z.lexer.grammar.Argument result] : ( K_FINAL )? theType= type name= ID ;
    public final JavaParser.argument_return argument() throws RecognitionException {
        JavaParser.argument_return retval = new JavaParser.argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token name=null;
        Token K_FINAL34=null;
        JavaParser.type_return theType =null;


        Object name_tree=null;
        Object K_FINAL34_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:334:2: ( ( K_FINAL )? theType= type name= ID )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:334:4: ( K_FINAL )? theType= type name= ID
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.Argument();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:337:3: ( K_FINAL )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==K_FINAL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:337:4: K_FINAL
                    {
                    K_FINAL34=(Token)match(input,K_FINAL,FOLLOW_K_FINAL_in_argument1611); 
                    K_FINAL34_tree = 
                    (Object)adaptor.create(K_FINAL34)
                    ;
                    adaptor.addChild(root_0, K_FINAL34_tree);



                    			retval.result.setIsFinal(true);
                    		

                    }
                    break;

            }


            pushFollow(FOLLOW_type_in_argument1621);
            theType=type();

            state._fsp--;

            adaptor.addChild(root_0, theType.getTree());


            			retval.result.setType(theType.result);
            		

            name=(Token)match(input,ID,FOLLOW_ID_in_argument1629); 
            name_tree = 
            (Object)adaptor.create(name)
            ;
            adaptor.addChild(root_0, name_tree);



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
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:349:1: statement returns [org.z.lexer.grammar.Statement result] : ( (stmt1= singleStatement ) | (stmt2= complexStatement ) );
    public final JavaParser.statement_return statement() throws RecognitionException {
        JavaParser.statement_return retval = new JavaParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.singleStatement_return stmt1 =null;

        JavaParser.complexStatement_return stmt2 =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:350:2: ( (stmt1= singleStatement ) | (stmt2= complexStatement ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==CHAR||LA20_0==FLOAT||(LA20_0 >= ID && LA20_0 <= INT)||LA20_0==K_NULL||LA20_0==K_RETURN||LA20_0==STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==K_IF||LA20_0==K_SYNCHRONIZED||LA20_0==K_TRY) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:350:4: (stmt1= singleStatement )
                    {
                    root_0 = (Object)adaptor.nil();


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:350:4: (stmt1= singleStatement )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:350:5: stmt1= singleStatement
                    {
                    pushFollow(FOLLOW_singleStatement_in_statement1652);
                    stmt1=singleStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, stmt1.getTree());


                    			retval.result = stmt1.result;
                    		

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:354:3: (stmt2= complexStatement )
                    {
                    root_0 = (Object)adaptor.nil();


                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:354:3: (stmt2= complexStatement )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:354:4: stmt2= complexStatement
                    {
                    pushFollow(FOLLOW_complexStatement_in_statement1666);
                    stmt2=complexStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, stmt2.getTree());


                    			retval.result = stmt2.result;
                    		

                    }


                    }
                    break;

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


    public static class complexStatement_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.ComplexStatement result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "complexStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:359:1: complexStatement returns [org.z.lexer.grammar.ComplexStatement result] : ( synchronizedStatement | ifStatement | exceptionStatement );
    public final JavaParser.complexStatement_return complexStatement() throws RecognitionException {
        JavaParser.complexStatement_return retval = new JavaParser.complexStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.synchronizedStatement_return synchronizedStatement35 =null;

        JavaParser.ifStatement_return ifStatement36 =null;

        JavaParser.exceptionStatement_return exceptionStatement37 =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:360:2: ( synchronizedStatement | ifStatement | exceptionStatement )
            int alt21=3;
            switch ( input.LA(1) ) {
            case K_SYNCHRONIZED:
                {
                alt21=1;
                }
                break;
            case K_IF:
                {
                alt21=2;
                }
                break;
            case K_TRY:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:360:4: synchronizedStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_synchronizedStatement_in_complexStatement1685);
                    synchronizedStatement35=synchronizedStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, synchronizedStatement35.getTree());

                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:361:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifStatement_in_complexStatement1690);
                    ifStatement36=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement36.getTree());

                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:362:4: exceptionStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_exceptionStatement_in_complexStatement1695);
                    exceptionStatement37=exceptionStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, exceptionStatement37.getTree());

                    }
                    break;

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
    // $ANTLR end "complexStatement"


    public static class synchronizedStatement_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.SynchronizedStatement result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "synchronizedStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:365:1: synchronizedStatement returns [org.z.lexer.grammar.SynchronizedStatement result] : K_SYNCHRONIZED '(' expr= expression ')' stmts= block ;
    public final JavaParser.synchronizedStatement_return synchronizedStatement() throws RecognitionException {
        JavaParser.synchronizedStatement_return retval = new JavaParser.synchronizedStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_SYNCHRONIZED38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        JavaParser.expression_return expr =null;

        JavaParser.block_return stmts =null;


        Object K_SYNCHRONIZED38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal40_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:366:2: ( K_SYNCHRONIZED '(' expr= expression ')' stmts= block )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:366:4: K_SYNCHRONIZED '(' expr= expression ')' stmts= block
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.SynchronizedStatement();
            		

            K_SYNCHRONIZED38=(Token)match(input,K_SYNCHRONIZED,FOLLOW_K_SYNCHRONIZED_in_synchronizedStatement1714); 
            K_SYNCHRONIZED38_tree = 
            (Object)adaptor.create(K_SYNCHRONIZED38)
            ;
            adaptor.addChild(root_0, K_SYNCHRONIZED38_tree);


            char_literal39=(Token)match(input,36,FOLLOW_36_in_synchronizedStatement1718); 
            char_literal39_tree = 
            (Object)adaptor.create(char_literal39)
            ;
            adaptor.addChild(root_0, char_literal39_tree);


            pushFollow(FOLLOW_expression_in_synchronizedStatement1724);
            expr=expression();

            state._fsp--;

            adaptor.addChild(root_0, expr.getTree());


            			retval.result.setExpression(expr.result);
            		

            char_literal40=(Token)match(input,37,FOLLOW_37_in_synchronizedStatement1730); 
            char_literal40_tree = 
            (Object)adaptor.create(char_literal40)
            ;
            adaptor.addChild(root_0, char_literal40_tree);


            pushFollow(FOLLOW_block_in_synchronizedStatement1736);
            stmts=block();

            state._fsp--;

            adaptor.addChild(root_0, stmts.getTree());


            			retval.result.setBlock(stmts.result);
            		

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
    // $ANTLR end "synchronizedStatement"


    public static class exceptionStatement_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.ExceptionStatement result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exceptionStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:381:1: exceptionStatement returns [org.z.lexer.grammar.ExceptionStatement result] :tryStmt= tryBlock (catchStmt= catchBlock )+ (finallyStmt= finallyBlock )? ;
    public final JavaParser.exceptionStatement_return exceptionStatement() throws RecognitionException {
        JavaParser.exceptionStatement_return retval = new JavaParser.exceptionStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.tryBlock_return tryStmt =null;

        JavaParser.catchBlock_return catchStmt =null;

        JavaParser.finallyBlock_return finallyStmt =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:382:2: (tryStmt= tryBlock (catchStmt= catchBlock )+ (finallyStmt= finallyBlock )? )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:382:4: tryStmt= tryBlock (catchStmt= catchBlock )+ (finallyStmt= finallyBlock )?
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.ExceptionStatement();
            		

            pushFollow(FOLLOW_tryBlock_in_exceptionStatement1761);
            tryStmt=tryBlock();

            state._fsp--;

            adaptor.addChild(root_0, tryStmt.getTree());


            			retval.result.setTryBlock(tryStmt.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:388:3: (catchStmt= catchBlock )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==K_CATCH) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:388:4: catchStmt= catchBlock
            	    {
            	    pushFollow(FOLLOW_catchBlock_in_exceptionStatement1770);
            	    catchStmt=catchBlock();

            	    state._fsp--;

            	    adaptor.addChild(root_0, catchStmt.getTree());


            	    			retval.result.addCatchBlock(catchStmt.result);
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:391:3: (finallyStmt= finallyBlock )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==K_FINALLY) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:391:4: finallyStmt= finallyBlock
                    {
                    pushFollow(FOLLOW_finallyBlock_in_exceptionStatement1781);
                    finallyStmt=finallyBlock();

                    state._fsp--;

                    adaptor.addChild(root_0, finallyStmt.getTree());


                    			retval.result.setFinallyBlock(finallyStmt.result);
                    		

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
    // $ANTLR end "exceptionStatement"


    public static class tryBlock_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.TryBlock result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tryBlock"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:396:1: tryBlock returns [org.z.lexer.grammar.TryBlock result] : K_TRY tryStmt= block ;
    public final JavaParser.tryBlock_return tryBlock() throws RecognitionException {
        JavaParser.tryBlock_return retval = new JavaParser.tryBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_TRY41=null;
        JavaParser.block_return tryStmt =null;


        Object K_TRY41_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:397:2: ( K_TRY tryStmt= block )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:397:4: K_TRY tryStmt= block
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.TryBlock();
            		

            K_TRY41=(Token)match(input,K_TRY,FOLLOW_K_TRY_in_tryBlock1805); 
            K_TRY41_tree = 
            (Object)adaptor.create(K_TRY41)
            ;
            adaptor.addChild(root_0, K_TRY41_tree);


            pushFollow(FOLLOW_block_in_tryBlock1811);
            tryStmt=block();

            state._fsp--;

            adaptor.addChild(root_0, tryStmt.getTree());


            			retval.result = (org.z.lexer.grammar.TryBlock) tryStmt.result;
            		

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
    // $ANTLR end "tryBlock"


    public static class catchBlock_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.CatchBlock result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catchBlock"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:406:1: catchBlock returns [org.z.lexer.grammar.CatchBlock result] : K_CATCH catchStmt= block ;
    public final JavaParser.catchBlock_return catchBlock() throws RecognitionException {
        JavaParser.catchBlock_return retval = new JavaParser.catchBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_CATCH42=null;
        JavaParser.block_return catchStmt =null;


        Object K_CATCH42_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:407:2: ( K_CATCH catchStmt= block )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:407:4: K_CATCH catchStmt= block
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.CatchBlock();
            		

            K_CATCH42=(Token)match(input,K_CATCH,FOLLOW_K_CATCH_in_catchBlock1833); 
            K_CATCH42_tree = 
            (Object)adaptor.create(K_CATCH42)
            ;
            adaptor.addChild(root_0, K_CATCH42_tree);


            pushFollow(FOLLOW_block_in_catchBlock1839);
            catchStmt=block();

            state._fsp--;

            adaptor.addChild(root_0, catchStmt.getTree());


            			retval.result = (org.z.lexer.grammar.CatchBlock) catchStmt.result;
            		

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
    // $ANTLR end "catchBlock"


    public static class finallyBlock_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.FinallyBlock result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "finallyBlock"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:416:1: finallyBlock returns [org.z.lexer.grammar.FinallyBlock result] : K_FINALLY finallyStmt= block ;
    public final JavaParser.finallyBlock_return finallyBlock() throws RecognitionException {
        JavaParser.finallyBlock_return retval = new JavaParser.finallyBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_FINALLY43=null;
        JavaParser.block_return finallyStmt =null;


        Object K_FINALLY43_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:417:2: ( K_FINALLY finallyStmt= block )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:417:4: K_FINALLY finallyStmt= block
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.FinallyBlock();
            		

            K_FINALLY43=(Token)match(input,K_FINALLY,FOLLOW_K_FINALLY_in_finallyBlock1861); 
            K_FINALLY43_tree = 
            (Object)adaptor.create(K_FINALLY43)
            ;
            adaptor.addChild(root_0, K_FINALLY43_tree);


            pushFollow(FOLLOW_block_in_finallyBlock1867);
            finallyStmt=block();

            state._fsp--;

            adaptor.addChild(root_0, finallyStmt.getTree());


            			retval.result = (org.z.lexer.grammar.FinallyBlock) finallyStmt.result;
            		

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
    // $ANTLR end "finallyBlock"


    public static class ifStatement_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.IfStatement result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:426:1: ifStatement returns [org.z.lexer.grammar.IfStatement result] : ( K_IF '(' theExpression= expression ')' ) ( (singleStmt= statement ) | (theBlock= block ) ) ;
    public final JavaParser.ifStatement_return ifStatement() throws RecognitionException {
        JavaParser.ifStatement_return retval = new JavaParser.ifStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_IF44=null;
        Token char_literal45=null;
        Token char_literal46=null;
        JavaParser.expression_return theExpression =null;

        JavaParser.statement_return singleStmt =null;

        JavaParser.block_return theBlock =null;


        Object K_IF44_tree=null;
        Object char_literal45_tree=null;
        Object char_literal46_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:427:2: ( ( K_IF '(' theExpression= expression ')' ) ( (singleStmt= statement ) | (theBlock= block ) ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:427:4: ( K_IF '(' theExpression= expression ')' ) ( (singleStmt= statement ) | (theBlock= block ) )
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.IfStatement();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:430:3: ( K_IF '(' theExpression= expression ')' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:430:4: K_IF '(' theExpression= expression ')'
            {
            K_IF44=(Token)match(input,K_IF,FOLLOW_K_IF_in_ifStatement1890); 
            K_IF44_tree = 
            (Object)adaptor.create(K_IF44)
            ;
            adaptor.addChild(root_0, K_IF44_tree);


            char_literal45=(Token)match(input,36,FOLLOW_36_in_ifStatement1892); 
            char_literal45_tree = 
            (Object)adaptor.create(char_literal45)
            ;
            adaptor.addChild(root_0, char_literal45_tree);


            pushFollow(FOLLOW_expression_in_ifStatement1898);
            theExpression=expression();

            state._fsp--;

            adaptor.addChild(root_0, theExpression.getTree());


            			retval.result.setCondition(theExpression.result);
            		

            char_literal46=(Token)match(input,37,FOLLOW_37_in_ifStatement1904); 
            char_literal46_tree = 
            (Object)adaptor.create(char_literal46)
            ;
            adaptor.addChild(root_0, char_literal46_tree);


            }



            			org.z.lexer.grammar.Block block = new org.z.lexer.grammar.Block();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:438:3: ( (singleStmt= statement ) | (theBlock= block ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==CHAR||LA24_0==FLOAT||(LA24_0 >= ID && LA24_0 <= INT)||LA24_0==K_IF||LA24_0==K_NULL||LA24_0==K_RETURN||LA24_0==K_SYNCHRONIZED||LA24_0==K_TRY||LA24_0==STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==49) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:439:4: (singleStmt= statement )
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:439:4: (singleStmt= statement )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:439:5: singleStmt= statement
                    {
                    pushFollow(FOLLOW_statement_in_ifStatement1921);
                    singleStmt=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, singleStmt.getTree());


                    				block.add(singleStmt.result);
                    			

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:443:4: (theBlock= block )
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:443:4: (theBlock= block )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:443:5: theBlock= block
                    {
                    pushFollow(FOLLOW_block_in_ifStatement1937);
                    theBlock=block();

                    state._fsp--;

                    adaptor.addChild(root_0, theBlock.getTree());


                    				block = theBlock.result;
                    			

                    }


                    }
                    break;

            }



            			retval.result.setBlock(block);
            		

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
    // $ANTLR end "ifStatement"


    public static class singleStatement_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.SimpleStatement result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "singleStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:452:1: singleStatement returns [org.z.lexer.grammar.SimpleStatement result] : ( (returnStmt= returnStatement ) | (simpleStmt= simpleStatement ) ) ';' ;
    public final JavaParser.singleStatement_return singleStatement() throws RecognitionException {
        JavaParser.singleStatement_return retval = new JavaParser.singleStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal47=null;
        JavaParser.returnStatement_return returnStmt =null;

        JavaParser.simpleStatement_return simpleStmt =null;


        Object char_literal47_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:453:2: ( ( (returnStmt= returnStatement ) | (simpleStmt= simpleStatement ) ) ';' )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:453:4: ( (returnStmt= returnStatement ) | (simpleStmt= simpleStatement ) ) ';'
            {
            root_0 = (Object)adaptor.nil();


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:453:4: ( (returnStmt= returnStatement ) | (simpleStmt= simpleStatement ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==K_RETURN) ) {
                alt25=1;
            }
            else if ( (LA25_0==CHAR||LA25_0==FLOAT||(LA25_0 >= ID && LA25_0 <= INT)||LA25_0==K_NULL||LA25_0==STRING) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:454:4: (returnStmt= returnStatement )
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:454:4: (returnStmt= returnStatement )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:454:5: returnStmt= returnStatement
                    {
                    pushFollow(FOLLOW_returnStatement_in_singleStatement1972);
                    returnStmt=returnStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, returnStmt.getTree());


                    				retval.result = returnStmt.result;
                    			

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:458:4: (simpleStmt= simpleStatement )
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:458:4: (simpleStmt= simpleStatement )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:458:5: simpleStmt= simpleStatement
                    {
                    pushFollow(FOLLOW_simpleStatement_in_singleStatement1988);
                    simpleStmt=simpleStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleStmt.getTree());


                    				retval.result = simpleStmt.result;
                    			

                    }


                    }
                    break;

            }


            char_literal47=(Token)match(input,45,FOLLOW_45_in_singleStatement1999); 
            char_literal47_tree = 
            (Object)adaptor.create(char_literal47)
            ;
            adaptor.addChild(root_0, char_literal47_tree);


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
    // $ANTLR end "singleStatement"


    public static class simpleStatement_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.SimpleStatement result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:465:1: simpleStatement returns [org.z.lexer.grammar.SimpleStatement result] : expr2= expression ;
    public final JavaParser.simpleStatement_return simpleStatement() throws RecognitionException {
        JavaParser.simpleStatement_return retval = new JavaParser.simpleStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.expression_return expr2 =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:466:2: (expr2= expression )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:466:4: expr2= expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_simpleStatement2016);
            expr2=expression();

            state._fsp--;

            adaptor.addChild(root_0, expr2.getTree());


            			retval.result = new org.z.lexer.grammar.SimpleStatement();
            			retval.result.setExpression(expr2.result);
            		

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


    public static class returnStatement_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.ReturnStatement result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnStatement"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:472:1: returnStatement returns [org.z.lexer.grammar.ReturnStatement result] : K_RETURN expr= expression ;
    public final JavaParser.returnStatement_return returnStatement() throws RecognitionException {
        JavaParser.returnStatement_return retval = new JavaParser.returnStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_RETURN48=null;
        JavaParser.expression_return expr =null;


        Object K_RETURN48_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:473:2: ( K_RETURN expr= expression )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:473:4: K_RETURN expr= expression
            {
            root_0 = (Object)adaptor.nil();


            K_RETURN48=(Token)match(input,K_RETURN,FOLLOW_K_RETURN_in_returnStatement2034); 
            K_RETURN48_tree = 
            (Object)adaptor.create(K_RETURN48)
            ;
            adaptor.addChild(root_0, K_RETURN48_tree);


            pushFollow(FOLLOW_expression_in_returnStatement2040);
            expr=expression();

            state._fsp--;

            adaptor.addChild(root_0, expr.getTree());


            			retval.result = new org.z.lexer.grammar.ReturnStatement();
            			retval.result.setExpression(expr.result);
            		

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
    // $ANTLR end "returnStatement"


    public static class expression_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.Expression result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:480:1: expression returns [org.z.lexer.grammar.Expression result] : ( ( K_NULL ) | (expr= objectAccess ) ) ;
    public final JavaParser.expression_return expression() throws RecognitionException {
        JavaParser.expression_return retval = new JavaParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token K_NULL49=null;
        JavaParser.objectAccess_return expr =null;


        Object K_NULL49_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:481:2: ( ( ( K_NULL ) | (expr= objectAccess ) ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:481:4: ( ( K_NULL ) | (expr= objectAccess ) )
            {
            root_0 = (Object)adaptor.nil();


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:481:4: ( ( K_NULL ) | (expr= objectAccess ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==K_NULL) ) {
                alt26=1;
            }
            else if ( (LA26_0==CHAR||LA26_0==FLOAT||(LA26_0 >= ID && LA26_0 <= INT)||LA26_0==STRING) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:482:4: ( K_NULL )
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:482:4: ( K_NULL )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:482:5: K_NULL
                    {
                    K_NULL49=(Token)match(input,K_NULL,FOLLOW_K_NULL_in_expression2064); 
                    K_NULL49_tree = 
                    (Object)adaptor.create(K_NULL49)
                    ;
                    adaptor.addChild(root_0, K_NULL49_tree);



                    				retval.result = new org.z.lexer.grammar.NullExpression();
                    			

                    }


                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:486:4: (expr= objectAccess )
                    {
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:486:4: (expr= objectAccess )
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:486:5: expr= objectAccess
                    {
                    pushFollow(FOLLOW_objectAccess_in_expression2080);
                    expr=objectAccess();

                    state._fsp--;

                    adaptor.addChild(root_0, expr.getTree());


                    				retval.result = expr.result;
                    			

                    }


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
    // $ANTLR end "expression"


    public static class objectAccess_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.ObjectAccess result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objectAccess"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:492:1: objectAccess returns [org.z.lexer.grammar.ObjectAccess result] : (left= functionCall ( '.' ^ ( K_CLASS |right= functionCall ) )* ) ;
    public final JavaParser.objectAccess_return objectAccess() throws RecognitionException {
        JavaParser.objectAccess_return retval = new JavaParser.objectAccess_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal50=null;
        Token K_CLASS51=null;
        JavaParser.functionCall_return left =null;

        JavaParser.functionCall_return right =null;


        Object char_literal50_tree=null;
        Object K_CLASS51_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:493:2: ( (left= functionCall ( '.' ^ ( K_CLASS |right= functionCall ) )* ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:493:4: (left= functionCall ( '.' ^ ( K_CLASS |right= functionCall ) )* )
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.ObjectAccess();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:496:3: (left= functionCall ( '.' ^ ( K_CLASS |right= functionCall ) )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:497:4: left= functionCall ( '.' ^ ( K_CLASS |right= functionCall ) )*
            {
            pushFollow(FOLLOW_functionCall_in_objectAccess2116);
            left=functionCall();

            state._fsp--;

            adaptor.addChild(root_0, left.getTree());


            				retval.result.setLeft(left.result);
            			

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:500:4: ( '.' ^ ( K_CLASS |right= functionCall ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:500:5: '.' ^ ( K_CLASS |right= functionCall )
            	    {
            	    char_literal50=(Token)match(input,43,FOLLOW_43_in_objectAccess2124); 
            	    char_literal50_tree = 
            	    (Object)adaptor.create(char_literal50)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal50_tree, root_0);


            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:500:10: ( K_CLASS |right= functionCall )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==K_CLASS) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==CHAR||LA27_0==FLOAT||(LA27_0 >= ID && LA27_0 <= INT)||LA27_0==STRING) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:501:5: K_CLASS
            	            {
            	            K_CLASS51=(Token)match(input,K_CLASS,FOLLOW_K_CLASS_in_objectAccess2133); 
            	            K_CLASS51_tree = 
            	            (Object)adaptor.create(K_CLASS51)
            	            ;
            	            adaptor.addChild(root_0, K_CLASS51_tree);



            	            					retval.result.addRight(new org.z.lexer.grammar.Right(".", new org.z.lexer.grammar.Identifier("class")));
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:505:5: right= functionCall
            	            {
            	            pushFollow(FOLLOW_functionCall_in_objectAccess2149);
            	            right=functionCall();

            	            state._fsp--;

            	            adaptor.addChild(root_0, right.getTree());


            	            					retval.result.addRight(new org.z.lexer.grammar.Right(".", right.result));
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


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


    public static class functionCall_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.FunctionCall result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:512:1: functionCall returns [org.z.lexer.grammar.FunctionCall result] : expr= comparisonExpression ( '(' args= expressionList ')' )? ;
    public final JavaParser.functionCall_return functionCall() throws RecognitionException {
        JavaParser.functionCall_return retval = new JavaParser.functionCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal52=null;
        Token char_literal53=null;
        JavaParser.comparisonExpression_return expr =null;

        JavaParser.expressionList_return args =null;


        Object char_literal52_tree=null;
        Object char_literal53_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:513:2: (expr= comparisonExpression ( '(' args= expressionList ')' )? )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:513:4: expr= comparisonExpression ( '(' args= expressionList ')' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_comparisonExpression_in_functionCall2181);
            expr=comparisonExpression();

            state._fsp--;

            adaptor.addChild(root_0, expr.getTree());


            			retval.result = new org.z.lexer.grammar.FunctionCall();
            			retval.result.setExpression(expr.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:518:3: ( '(' args= expressionList ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:518:4: '(' args= expressionList ')'
                    {
                    char_literal52=(Token)match(input,36,FOLLOW_36_in_functionCall2190); 
                    char_literal52_tree = 
                    (Object)adaptor.create(char_literal52)
                    ;
                    adaptor.addChild(root_0, char_literal52_tree);


                    pushFollow(FOLLOW_expressionList_in_functionCall2194);
                    args=expressionList();

                    state._fsp--;

                    adaptor.addChild(root_0, args.getTree());

                    char_literal53=(Token)match(input,37,FOLLOW_37_in_functionCall2196); 
                    char_literal53_tree = 
                    (Object)adaptor.create(char_literal53)
                    ;
                    adaptor.addChild(root_0, char_literal53_tree);



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


    public static class comparisonOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparisonOperator"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:524:1: comparisonOperator : ( '==' | '!=' ) ;
    public final JavaParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
        JavaParser.comparisonOperator_return retval = new JavaParser.comparisonOperator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set54=null;

        Object set54_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:525:2: ( ( '==' | '!=' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            {
            root_0 = (Object)adaptor.nil();


            set54=(Token)input.LT(1);

            if ( input.LA(1)==35||input.LA(1)==47 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set54)
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
    // $ANTLR end "comparisonOperator"


    public static class comparisonExpression_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.ComparisonExpression result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparisonExpression"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:528:1: comparisonExpression returns [org.z.lexer.grammar.ComparisonExpression result] : expr1= assignmentExpression ( (op= comparisonOperator ^expr2= expression )* ) ;
    public final JavaParser.comparisonExpression_return comparisonExpression() throws RecognitionException {
        JavaParser.comparisonExpression_return retval = new JavaParser.comparisonExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.assignmentExpression_return expr1 =null;

        JavaParser.comparisonOperator_return op =null;

        JavaParser.expression_return expr2 =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:529:2: (expr1= assignmentExpression ( (op= comparisonOperator ^expr2= expression )* ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:529:4: expr1= assignmentExpression ( (op= comparisonOperator ^expr2= expression )* )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignmentExpression_in_comparisonExpression2238);
            expr1=assignmentExpression();

            state._fsp--;

            adaptor.addChild(root_0, expr1.getTree());


            			retval.result = new org.z.lexer.grammar.ComparisonExpression();
            			retval.result.setLeft(expr1.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:533:3: ( (op= comparisonOperator ^expr2= expression )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:534:4: (op= comparisonOperator ^expr2= expression )*
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:534:4: (op= comparisonOperator ^expr2= expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==35||LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:535:5: op= comparisonOperator ^expr2= expression
            	    {
            	    pushFollow(FOLLOW_comparisonOperator_in_comparisonExpression2257);
            	    op=comparisonOperator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(op.getTree(), root_0);

            	    pushFollow(FOLLOW_expression_in_comparisonExpression2262);
            	    expr2=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr2.getTree());


            	    					retval.result.addRight(new org.z.lexer.grammar.Right(op.toString(), expr2.result));
            	    				

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


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
    // $ANTLR end "comparisonExpression"


    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentOperator"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:542:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' ) ;
    public final JavaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JavaParser.assignmentOperator_return retval = new JavaParser.assignmentOperator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set55=null;

        Object set55_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:543:2: ( ( '=' | '+=' | '-=' | '*=' | '/=' ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:
            {
            root_0 = (Object)adaptor.nil();


            set55=(Token)input.LT(1);

            if ( (input.LA(1) >= 39 && input.LA(1) <= 40)||input.LA(1)==42||input.LA(1)==44||input.LA(1)==46 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set55)
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
    // $ANTLR end "assignmentOperator"


    public static class assignmentExpression_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.AssignmentExpression result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentExpression"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:546:1: assignmentExpression returns [org.z.lexer.grammar.AssignmentExpression result] : expr1= unaryExpression ( (op= assignmentOperator ^expr2= expression )* ) ;
    public final JavaParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        JavaParser.assignmentExpression_return retval = new JavaParser.assignmentExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.unaryExpression_return expr1 =null;

        JavaParser.assignmentOperator_return op =null;

        JavaParser.expression_return expr2 =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:547:2: (expr1= unaryExpression ( (op= assignmentOperator ^expr2= expression )* ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:547:4: expr1= unaryExpression ( (op= assignmentOperator ^expr2= expression )* )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unaryExpression_in_assignmentExpression2320);
            expr1=unaryExpression();

            state._fsp--;

            adaptor.addChild(root_0, expr1.getTree());


            			retval.result = new org.z.lexer.grammar.AssignmentExpression();
            			retval.result.setLeft(expr1.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:551:3: ( (op= assignmentOperator ^expr2= expression )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:552:4: (op= assignmentOperator ^expr2= expression )*
            {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:552:4: (op= assignmentOperator ^expr2= expression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0 >= 39 && LA31_0 <= 40)||LA31_0==42||LA31_0==44||LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:553:5: op= assignmentOperator ^expr2= expression
            	    {
            	    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression2339);
            	    op=assignmentOperator();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(op.getTree(), root_0);

            	    pushFollow(FOLLOW_expression_in_assignmentExpression2344);
            	    expr2=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr2.getTree());


            	    					retval.result.addRight(new org.z.lexer.grammar.Right(op.toString(), expr2.result));
            	    				

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


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
    // $ANTLR end "assignmentExpression"


    public static class unaryExpression_return extends ParserRuleReturnScope {
        public org.z.lexer.grammar.UnaryExpression result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpression"
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:560:1: unaryExpression returns [org.z.lexer.grammar.UnaryExpression result] : expr= value ;
    public final JavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JavaParser.unaryExpression_return retval = new JavaParser.unaryExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.value_return expr =null;



        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:561:2: (expr= value )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:561:4: expr= value
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_value_in_unaryExpression2374);
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
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:566:1: value returns [org.z.lexer.grammar.Value result] : (x1= INT |x2= FLOAT |x3= STRING |x4= CHAR |x5= ID ) ;
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
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:567:2: ( (x1= INT |x2= FLOAT |x3= STRING |x4= CHAR |x5= ID ) )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:567:4: (x1= INT |x2= FLOAT |x3= STRING |x4= CHAR |x5= ID )
            {
            root_0 = (Object)adaptor.nil();



            			retval.result = new org.z.lexer.grammar.Value();
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:570:3: (x1= INT |x2= FLOAT |x3= STRING |x4= CHAR |x5= ID )
            int alt32=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt32=1;
                }
                break;
            case FLOAT:
                {
                alt32=2;
                }
                break;
            case STRING:
                {
                alt32=3;
                }
                break;
            case CHAR:
                {
                alt32=4;
                }
                break;
            case ID:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:570:4: x1= INT
                    {
                    x1=(Token)match(input,INT,FOLLOW_INT_in_value2398); 
                    x1_tree = 
                    (Object)adaptor.create(x1)
                    ;
                    adaptor.addChild(root_0, x1_tree);



                    			retval.result.setValue(Integer.valueOf(x1.getText()));
                    		

                    }
                    break;
                case 2 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:573:4: x2= FLOAT
                    {
                    x2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value2407); 
                    x2_tree = 
                    (Object)adaptor.create(x2)
                    ;
                    adaptor.addChild(root_0, x2_tree);



                    			retval.result.setValue(Float.valueOf(x2.getText()));
                    		

                    }
                    break;
                case 3 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:577:4: x3= STRING
                    {
                    x3=(Token)match(input,STRING,FOLLOW_STRING_in_value2418); 
                    x3_tree = 
                    (Object)adaptor.create(x3)
                    ;
                    adaptor.addChild(root_0, x3_tree);



                    			retval.result.setValue(x3.getText());
                    		

                    }
                    break;
                case 4 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:581:4: x4= CHAR
                    {
                    x4=(Token)match(input,CHAR,FOLLOW_CHAR_in_value2429); 
                    x4_tree = 
                    (Object)adaptor.create(x4)
                    ;
                    adaptor.addChild(root_0, x4_tree);



                    			retval.result.setValue(new Character(x4.getText().charAt(0)));
                    		

                    }
                    break;
                case 5 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:585:4: x5= ID
                    {
                    x5=(Token)match(input,ID,FOLLOW_ID_in_value2440); 
                    x5_tree = 
                    (Object)adaptor.create(x5)
                    ;
                    adaptor.addChild(root_0, x5_tree);



                    			retval.result.setValue(new org.z.lexer.grammar.Identifier(x5.getText()));
                    		

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
    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:591:1: expressionList returns [org.z.lexer.grammar.ExpressionList result] : (expr= expression )? ( ',' expr= expression )* ;
    public final JavaParser.expressionList_return expressionList() throws RecognitionException {
        JavaParser.expressionList_return retval = new JavaParser.expressionList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal56=null;
        JavaParser.expression_return expr =null;


        Object char_literal56_tree=null;

        try {
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:592:2: ( (expr= expression )? ( ',' expr= expression )* )
            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:592:4: (expr= expression )? ( ',' expr= expression )*
            {
            root_0 = (Object)adaptor.nil();


            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:592:8: (expr= expression )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==CHAR||LA33_0==FLOAT||(LA33_0 >= ID && LA33_0 <= INT)||LA33_0==K_NULL||LA33_0==STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:592:8: expr= expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionList2462);
                    expr=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expr.getTree());

                    }
                    break;

            }



            			retval.result = new org.z.lexer.grammar.ExpressionList();
            			if(expr != null)
            				retval.result.add(expr.result);
            		

            // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:598:3: ( ',' expr= expression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==41) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/elliot/NetBeansProjects/Z/grammar/Java.g:598:4: ',' expr= expression
            	    {
            	    char_literal56=(Token)match(input,41,FOLLOW_41_in_expressionList2472); 
            	    char_literal56_tree = 
            	    (Object)adaptor.create(char_literal56)
            	    ;
            	    adaptor.addChild(root_0, char_literal56_tree);


            	    pushFollow(FOLLOW_expression_in_expressionList2478);
            	    expr=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr.getTree());


            	    			retval.result.add(expr.result);
            	    		

            	    }
            	    break;

            	default :
            	    break loop34;
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


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\16\uffff";
    static final String DFA7_eofS =
        "\16\uffff";
    static final String DFA7_minS =
        "\1\12\1\uffff\5\12\1\uffff\1\12\1\uffff\1\12\1\uffff\1\12\1\44";
    static final String DFA7_maxS =
        "\1\62\1\uffff\3\36\1\61\1\36\1\uffff\1\60\1\uffff\1\36\1\uffff\1"+
        "\60\1\56";
    static final String DFA7_acceptS =
        "\1\uffff\1\4\5\uffff\1\1\1\uffff\1\2\1\uffff\1\3\2\uffff";
    static final String DFA7_specialS =
        "\16\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\10\3\uffff\1\6\3\uffff\1\11\2\uffff\1\4\1\3\1\2\1\uffff\1"+
            "\5\1\11\3\uffff\1\7\23\uffff\1\1",
            "",
            "\1\10\3\uffff\1\6\3\uffff\1\11\2\uffff\1\4\1\3\1\2\1\uffff"+
            "\1\12\1\11\3\uffff\1\7",
            "\1\10\3\uffff\1\6\3\uffff\1\11\2\uffff\1\4\1\3\1\2\1\uffff"+
            "\1\12\1\11\3\uffff\1\7",
            "\1\10\3\uffff\1\6\3\uffff\1\11\2\uffff\1\4\1\3\1\2\1\uffff"+
            "\1\12\1\11\3\uffff\1\7",
            "\1\10\3\uffff\1\6\3\uffff\1\11\2\uffff\1\4\1\3\1\2\1\uffff"+
            "\1\12\1\11\3\uffff\1\7\22\uffff\1\13",
            "\1\10\3\uffff\1\6\3\uffff\1\11\2\uffff\1\4\1\3\1\2\1\uffff"+
            "\1\12\1\11\3\uffff\1\7",
            "",
            "\1\15\31\uffff\1\11\13\uffff\1\14",
            "",
            "\1\10\3\uffff\1\6\3\uffff\1\11\2\uffff\1\4\1\3\1\2\1\uffff"+
            "\1\12\1\11\3\uffff\1\7",
            "",
            "\1\15\45\uffff\1\14",
            "\1\11\11\uffff\1\7"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 213:3: ( (var= instanceVariable ) | (m= method ) | ( 'static' stmts= block ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ID_in_fullName753 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_fullName761 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_fullName765 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ID_in_importName788 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_importName801 = new BitSet(new long[]{0x0000004000000400L});
    public static final BitSet FOLLOW_ID_in_importName817 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_38_in_importName835 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_packageDefinition_in_run879 = new BitSet(new long[]{0x0000000000926002L});
    public static final BitSet FOLLOW_importDefinition_in_run895 = new BitSet(new long[]{0x0000000000926002L});
    public static final BitSet FOLLOW_classDefinition_in_run911 = new BitSet(new long[]{0x0000000000926002L});
    public static final BitSet FOLLOW_K_PACKAGE_in_packageDefinition935 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_fullName_in_packageDefinition941 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_packageDefinition947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_IMPORT_in_importDefinition965 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_importName_in_importDefinition971 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_importDefinition979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_permission_in_instanceVariable1007 = new BitSet(new long[]{0x0000000042E04400L});
    public static final BitSet FOLLOW_K_STATIC_in_instanceVariable1021 = new BitSet(new long[]{0x0000000042E04400L});
    public static final BitSet FOLLOW_K_FINAL_in_instanceVariable1035 = new BitSet(new long[]{0x0000000042E04400L});
    public static final BitSet FOLLOW_K_VOLATILE_in_instanceVariable1049 = new BitSet(new long[]{0x0000000042E04400L});
    public static final BitSet FOLLOW_type_in_instanceVariable1064 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_instanceVariable1074 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_instanceVariable1094 = new BitSet(new long[]{0x0000000100080D10L});
    public static final BitSet FOLLOW_simpleStatement_in_instanceVariable1098 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_instanceVariable1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PUBLIC_in_classDefinition1146 = new BitSet(new long[]{0x0000000000806000L});
    public static final BitSet FOLLOW_K_FINAL_in_classDefinition1160 = new BitSet(new long[]{0x0000000000806000L});
    public static final BitSet FOLLOW_K_CLASS_in_classDefinition1172 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classDefinition1179 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_classDefinition1186 = new BitSet(new long[]{0x0004000046E44400L});
    public static final BitSet FOLLOW_instanceVariable_in_classDefinition1198 = new BitSet(new long[]{0x0004000046E44400L});
    public static final BitSet FOLLOW_method_in_classDefinition1214 = new BitSet(new long[]{0x0004000046E44400L});
    public static final BitSet FOLLOW_K_STATIC_in_classDefinition1232 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_classDefinition1236 = new BitSet(new long[]{0x0004000046E44400L});
    public static final BitSet FOLLOW_50_in_classDefinition1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PUBLIC_in_permission1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PROTECTED_in_permission1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRIVATE_in_permission1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type1300 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_type1309 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_permission_in_method1341 = new BitSet(new long[]{0x0000000006E44400L});
    public static final BitSet FOLLOW_K_STATIC_in_method1355 = new BitSet(new long[]{0x0000000006E44400L});
    public static final BitSet FOLLOW_K_SYNCHRONIZED_in_method1369 = new BitSet(new long[]{0x0000000006E44400L});
    public static final BitSet FOLLOW_K_FINAL_in_method1383 = new BitSet(new long[]{0x0000000006E44400L});
    public static final BitSet FOLLOW_K_NATIVE_in_method1397 = new BitSet(new long[]{0x0000000006E44400L});
    public static final BitSet FOLLOW_type_in_method1412 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_method1422 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_method1429 = new BitSet(new long[]{0x0000022000004400L});
    public static final BitSet FOLLOW_argumentList_in_method1433 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_method1435 = new BitSet(new long[]{0x0002200010000000L});
    public static final BitSet FOLLOW_K_THROWS_in_method1447 = new BitSet(new long[]{0x0002200000000400L});
    public static final BitSet FOLLOW_fullName_in_method1461 = new BitSet(new long[]{0x0002220000000400L});
    public static final BitSet FOLLOW_41_in_method1463 = new BitSet(new long[]{0x0002200000000400L});
    public static final BitSet FOLLOW_block_in_method1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_method1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_block1532 = new BitSet(new long[]{0x0004000125090D10L});
    public static final BitSet FOLLOW_statement_in_block1539 = new BitSet(new long[]{0x0004000125090D10L});
    public static final BitSet FOLLOW_50_in_block1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_argumentList1570 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_argumentList1580 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_argument_in_argumentList1584 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_K_FINAL_in_argument1611 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_type_in_argument1621 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_argument1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStatement_in_statement1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexStatement_in_statement1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_synchronizedStatement_in_complexStatement1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_complexStatement1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exceptionStatement_in_complexStatement1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SYNCHRONIZED_in_synchronizedStatement1714 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_synchronizedStatement1718 = new BitSet(new long[]{0x0000000100080D10L});
    public static final BitSet FOLLOW_expression_in_synchronizedStatement1724 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synchronizedStatement1730 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_synchronizedStatement1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryBlock_in_exceptionStatement1761 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_catchBlock_in_exceptionStatement1770 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_finallyBlock_in_exceptionStatement1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TRY_in_tryBlock1805 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_tryBlock1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CATCH_in_catchBlock1833 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_catchBlock1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_FINALLY_in_finallyBlock1861 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_finallyBlock1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_IF_in_ifStatement1890 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ifStatement1892 = new BitSet(new long[]{0x0000000100080D10L});
    public static final BitSet FOLLOW_expression_in_ifStatement1898 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ifStatement1904 = new BitSet(new long[]{0x0002000125090D10L});
    public static final BitSet FOLLOW_statement_in_ifStatement1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_ifStatement1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_singleStatement1972 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_simpleStatement_in_singleStatement1988 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_singleStatement1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_RETURN_in_returnStatement2034 = new BitSet(new long[]{0x0000000100080D10L});
    public static final BitSet FOLLOW_expression_in_returnStatement2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NULL_in_expression2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectAccess_in_expression2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_objectAccess2116 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_objectAccess2124 = new BitSet(new long[]{0x0000000100002D10L});
    public static final BitSet FOLLOW_K_CLASS_in_objectAccess2133 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_functionCall_in_objectAccess2149 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_comparisonExpression_in_functionCall2181 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_functionCall2190 = new BitSet(new long[]{0x0000022100080D10L});
    public static final BitSet FOLLOW_expressionList_in_functionCall2194 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_functionCall2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_comparisonExpression2238 = new BitSet(new long[]{0x0000800800000002L});
    public static final BitSet FOLLOW_comparisonOperator_in_comparisonExpression2257 = new BitSet(new long[]{0x0000000100080D10L});
    public static final BitSet FOLLOW_expression_in_comparisonExpression2262 = new BitSet(new long[]{0x0000800800000002L});
    public static final BitSet FOLLOW_unaryExpression_in_assignmentExpression2320 = new BitSet(new long[]{0x0000558000000002L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression2339 = new BitSet(new long[]{0x0000000100080D10L});
    public static final BitSet FOLLOW_expression_in_assignmentExpression2344 = new BitSet(new long[]{0x0000558000000002L});
    public static final BitSet FOLLOW_value_in_unaryExpression2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_value2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_value2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList2462 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expressionList2472 = new BitSet(new long[]{0x0000000100080D10L});
    public static final BitSet FOLLOW_expression_in_expressionList2478 = new BitSet(new long[]{0x0000020000000002L});

}