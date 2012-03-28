grammar Java;

tokens {
	K_CLASS = 'class';
	K_PUBLIC = 'public';
	K_PRIVATE = 'private';
	K_PROTECTED = 'protected';
	K_STATIC = 'static';
}

@header {
	package org.z.lexer;
}

@lexer::header {
	package org.z.lexer;
}

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;
    
/*VALUE
	:	INT
	| 	FLOAT
	|	STRING
	|	CHAR
	;
*/

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
    
class_def
	:	K_PUBLIC? K_CLASS ID '{' method* '}' EOF
	;
		
permission
	:	K_PUBLIC | K_PROTECTED | K_PRIVATE
	;
	
method
	:	permission? K_STATIC? ID ID '(' functionArg? (',' functionArg)* ')' '{' complexStatement '}'
	;
	
functionArg
	:	ID ID
	;
	
complexStatement
	:	simpleStatement ';'
	;

simpleStatement
	:	expression
	;

expression
	:	object_access
	|	function_call
	|	value
	;
	
object_access
	:	ID '.' (object_access | function_call)
	;

value
	:	INT
	|	FLOAT
	|	STRING
	|	CHAR
	;

function_call
	:	ID '(' expression? (',' expression)* ')'
	;
