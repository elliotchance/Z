grammar Java;

tokens {
	K_CLASS = 'class';
	K_PUBLIC = 'public';
	K_PRIVATE = 'private';
	K_PROTECTED = 'protected';
	K_STATIC = 'static';
}

@parser::header {
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
    
run returns [org.z.lexer.grammar.File result]
	:	{
			$result = new org.z.lexer.grammar.File();
		}
		(def=classDefinition {
			$result.addClass(def.result);
		})*
		EOF
	;
    
classDefinition returns [org.z.lexer.grammar.Class result]
	:	isPublic=K_PUBLIC? K_CLASS className=ID '{'
		{
			$result = new org.z.lexer.grammar.Class();
			$result.setName(className.getText());
			$result.setIsPublic(isPublic != null);
		}
		(m=method {
			$result.addMethod(m.result);
		})*
		'}'
		EOF
	;
		
permission
	:	K_PUBLIC | K_PROTECTED | K_PRIVATE
	;
		
type returns [org.z.lexer.grammar.Type result]
	:	base=ID
		{
			$result = new org.z.lexer.grammar.Type();
			$result.setBase(base.getText());
		}
		('[]' {
			$result.setDepth($result.getDepth() + 1);
		})*
	;
	
method returns [org.z.lexer.grammar.Method result]
	:	thePermission=(permission?) isStatic=K_STATIC? returnType=type name=ID
		'(' args=argumentList ')'
		'{'
		stmts=statementList
		'}'
		{
			$result = new org.z.lexer.grammar.Method();
			if(thePermission != null)
				$result.setPermission(thePermission.getText());
			$result.setIsStatic(isStatic != null);
			$result.setReturnType(returnType.result);
			$result.setName(name.getText());
			$result.setArguments(args.result);
			if(stmts != null)
				$result.setStatements(stmts.result);
		}
	;
	
statementList returns [org.z.lexer.grammar.StatementList result]
	:	{
			$result = new org.z.lexer.grammar.StatementList();
		}
		(stmt=statement
		{
			$result.add(stmt.result);
		})*
	;
	
argumentList returns [org.z.lexer.grammar.ArgumentList result]
	:	{
			$result = new org.z.lexer.grammar.ArgumentList();
		}
		def=argument?
		{
			if(def != null)
				$result.add(def.result);
		}
		(',' def=argument
		{
			$result.add(def.result);
		})*
	;
	
argument returns [org.z.lexer.grammar.Argument result]
	:	theType=type name=ID
		{
			$result = new org.z.lexer.grammar.Argument();
			$result.setType(theType.result);
			$result.setName(name.getText());
		}
	;
	
statement returns [org.z.lexer.grammar.Statement result]
	:	stmt=simpleStatement
		{
			$result = stmt.result;
		}
	;

simpleStatement returns [org.z.lexer.grammar.SimpleStatement result]
	:	expr=expression
		{
			$result = new org.z.lexer.grammar.SimpleStatement();
			$result.setExpression(expr.result);
		}
		';'
	;

expression returns [org.z.lexer.grammar.Expression result]
	:	expr=functionCall
		{
			$result = expr.result;
		}
	;
		
functionCall returns [org.z.lexer.grammar.FunctionCall result]
	:	expr=objectAccess^
		{
			$result = new org.z.lexer.grammar.FunctionCall();
			$result.setExpression(expr.result);
		}
		('(' args=expressionList ')'
		{
			$result.setArguments(args.result);
		})?
	;
		
objectAccess returns [org.z.lexer.grammar.Expression result]
	:	{
			org.z.lexer.grammar.ObjectAccess o = new org.z.lexer.grammar.ObjectAccess();
		}
		(left=value^
		{
			o.setLeft(left.result);
		}
		('.'^ right=ID
		{
			o.addAccessor(new org.z.lexer.grammar.Identifier(right.getText()));
		})*)
		{
			// cancel objectAccess
			if(o.getAccessors().size() == 0)
				$result = o.getLeft();
			else
				$result = o;
		}
	;
	
unaryExpression returns [org.z.lexer.grammar.UnaryExpression result]
	:	expr=value
		{
			$result = expr.result;
		}
	;

value returns [org.z.lexer.grammar.Value result]
	:	{
			$result = new org.z.lexer.grammar.Value();
		}
		(x1=INT
		{
			$result.setValue(Integer.valueOf(x1.getText()));
		}
	|	x2=FLOAT
		{
			$result.setValue(Float.valueOf(x2.getText()));
		}
	|	x3=STRING
		{
			$result.setValue(x3.getText());
		}
	|	x4=CHAR
		{
			$result.setValue(new Character(x4.getText().charAt(0)));
		}
	|	x5=ID
		{
			$result.setValue(new org.z.lexer.grammar.Identifier(x5.getText()));
		})
	;

expressionList returns [org.z.lexer.grammar.ExpressionList result]
	:	expr=expression?
		{
			$result = new org.z.lexer.grammar.ExpressionList();
			if(expr != null)
				$result.add(expr.result);
		}
		(','
		expr=expression
		{
			$result.add(expr.result);
		}
		)*
	;
