grammar Java;

tokens {
	K_CATCH = 'catch';
	K_CLASS = 'class';
	K_FINAL = 'final';
	K_FINALLY = 'finally';
	K_IF = 'if';
	K_IMPORT = 'import';
	K_NATIVE = 'native';
	K_NULL = 'null';
	K_PACKAGE = 'package';
	K_PUBLIC = 'public';
	K_PRIVATE = 'private';
	K_PROTECTED = 'protected';
	K_RETURN = 'return';
	K_STATIC = 'static';
	K_SYNCHRONIZED = 'synchronized';
	K_THROW = 'throw';
	K_THROWS = 'throws';
	K_TRY = 'try';
	K_VOLATILE = 'volatile';
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
		(
			(thePackageName=packageDefinition {
				$result.setPackageName(thePackageName.result);
			})?
			(theImportName=importDefinition {
				$result.addImport(theImportName.result);
			})*
			(def=classDefinition {
				$result.addClass(def.result);
			})*
		)
		EOF
	;
	
packageName
	:	ID ('.' ID)*
	;
		
className
	:	ID ('.' ID)*
	;
	
importName
	:	ID ('.' (ID | '*'))*
	;
	
packageDefinition returns [String result]
	:	K_PACKAGE thePackageName=packageName ';'
		{
			$result = thePackageName.toString();
		}
	; 
		
importDefinition returns [String result]
	:	K_IMPORT theImportName=importName ';'
		{
			$result = theImportName.toString();
		}
	;
	
instanceVariable returns [org.z.lexer.grammar.InstanceVariable result]
	:	{
			$result = new org.z.lexer.grammar.InstanceVariable();
		}
		(
			(thePermission=permission {
				$result.setPermission(thePermission.toString());
			})
			|
			(K_STATIC {
				$result.setIsStatic(true);
			})
			|
			(K_FINAL {
				$result.setIsFinal(true);
			})
			|
			(K_VOLATILE {
				$result.setIsVolatile(true);
			})
		)*
		(theType=type {
			$result.setType(theType.result);
		})
		(variableName=ID
		{
			$result.setName(variableName.getText());
		})
		(
			(
				'=' stmt=simpleStatement
				{
					$result.setStatement(stmt.result);
				}
			)
		)
		';'
	;
    
classDefinition returns [org.z.lexer.grammar.Class result]
	:	{
			$result = new org.z.lexer.grammar.Class();
		}
		(
			(K_PUBLIC {
				$result.setIsPublic(true);
			})
			|
			(K_FINAL {
				$result.setIsFinal(true);
			})
		)*
		K_CLASS
		(theClassName=ID {
			$result.setName(theClassName.getText());
		})
		'{'
		(
			(var=instanceVariable {
				$result.addInstanceVariable(var.result);
			})
			|
			(m=method {
				$result.addMethod(m.result);
			})
			|
			// static block
			('static' stmts=block {
				$result.setStaticBlock(stmts.result);
			})
		)*
		'}' EOF
	;
		
permission returns [String result]
	:	K_PUBLIC {
			$result = "public";
		}
	|	K_PROTECTED {
			$result = "protected";
		}
	|	K_PRIVATE {
			$result = "private";
		}
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
	:	{
			$result = new org.z.lexer.grammar.Method();
		}
		(
			(thePermission=permission {
				$result.setPermission(thePermission.result);
			})
			|
			(K_STATIC {
				$result.setIsStatic(true);
			})
			|
			(K_SYNCHRONIZED {
				$result.setIsSynchronized(true);
			})
			|
			(K_FINAL {
				$result.setIsFinal(true);
			})
			|
			(K_NATIVE {
				$result.setIsNative(true);
			})
		)*
		(returnType=type {
			$result.setReturnType(returnType.result);
		})?
		name=ID {
			$result.setName(name.getText());
		}
		('(' args=argumentList ')' {
			$result.setArguments(args.result);
		})
		(
			K_THROWS
			(
				(cn=className ','?) {
					$result.addThrows(cn.toString());
				}
			)*
		)?
		(
			(stmts=block {
				$result.setBlock(stmts.result);
				$result.setHasBody(true);
			})
			|
			(';' {
				$result.setHasBody(false);
			})
		)
	;
	
block returns [org.z.lexer.grammar.Block result]
	:	{
			$result = new org.z.lexer.grammar.Block();
		}
		('{'
		(stmt=statement {
			$result.add(stmt.result);
		})*
		'}')
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
	:	{
			$result = new org.z.lexer.grammar.Argument();
		}
		(K_FINAL {
			$result.setIsFinal(true);
		})?
		theType=type {
			$result.setType(theType.result);
		}
		name=ID
		{
			$result.setName(name.getText());
		}
	;
	
statement returns [org.z.lexer.grammar.Statement result]
	:	(stmt1=singleStatement {
			$result = stmt1.result;
		})
		|
		(stmt2=complexStatement {
			$result = stmt2.result;
		})
	;
	
complexStatement returns [org.z.lexer.grammar.ComplexStatement result]
	:	synchronizedStatement
	|	ifStatement
	|	exceptionStatement
	;

synchronizedStatement returns [org.z.lexer.grammar.SynchronizedStatement result]
	:	{
			$result = new org.z.lexer.grammar.SynchronizedStatement();
		}
		K_SYNCHRONIZED
		'('
		expr=expression {
			$result.setExpression(expr.result);
		}
		')'
		stmts=block
		{
			$result.setBlock(stmts.result);
		}
	;

exceptionStatement returns [org.z.lexer.grammar.ExceptionStatement result]
	:	{
			$result = new org.z.lexer.grammar.ExceptionStatement();
		}
		tryStmt=tryBlock {
			$result.setTryBlock(tryStmt.result);
		}
		(catchStmt=catchBlock {
			$result.addCatchBlock(catchStmt.result);
		})+
		(finallyStmt=finallyBlock {
			$result.setFinallyBlock(finallyStmt.result);
		})?
	;
	
tryBlock returns [org.z.lexer.grammar.TryBlock result]
	:	{
			$result = new org.z.lexer.grammar.TryBlock();
		}
		K_TRY
		tryStmt=block {
			$result = (org.z.lexer.grammar.TryBlock) tryStmt.result;
		}
	;
	
catchBlock returns [org.z.lexer.grammar.CatchBlock result]
	:	{
			$result = new org.z.lexer.grammar.CatchBlock();
		}
		K_CATCH
		catchStmt=block {
			$result = (org.z.lexer.grammar.CatchBlock) catchStmt.result;
		}
	;
	
finallyBlock returns [org.z.lexer.grammar.FinallyBlock result]
	:	{
			$result = new org.z.lexer.grammar.FinallyBlock();
		}
		K_FINALLY
		finallyStmt=block {
			$result = (org.z.lexer.grammar.FinallyBlock) finallyStmt.result;
		}
	;
	
ifStatement returns [org.z.lexer.grammar.IfStatement result]
	:	{
			$result = new org.z.lexer.grammar.IfStatement();
		}
		(K_IF '('
		theExpression=expression {
			$result.setCondition(theExpression.result);
		}
		')')
		{
			org.z.lexer.grammar.Block block = new org.z.lexer.grammar.Block();
		}
		(
			(singleStmt=statement {
				block.add(singleStmt.result);
			})
			|
			(theBlock=block {
				block = theBlock.result;
			})
		)
		{
			$result.setBlock(block);
		}
	;
	
singleStatement returns [org.z.lexer.grammar.SimpleStatement result]
	:	(
			(returnStmt=returnStatement {
				$result = returnStmt.result;
			})
			|
			(simpleStmt=simpleStatement {
				$result = simpleStmt.result;
			})
		)
		';'
	;

simpleStatement returns [org.z.lexer.grammar.SimpleStatement result]
	:	expr2=expression {
			$result = new org.z.lexer.grammar.SimpleStatement();
			$result.setExpression(expr2.result);
		}
	;
	
returnStatement returns [org.z.lexer.grammar.ReturnStatement result]
	:	K_RETURN
		expr=expression {
			$result = new org.z.lexer.grammar.ReturnStatement();
			$result.setExpression(expr.result);
		}
	;
 
expression returns [org.z.lexer.grammar.Expression result]
	:	(
			(K_NULL {
				$result = new org.z.lexer.grammar.NullExpression();
			})
			|
			(expr=objectAccess {
				$result = expr.result;
			})
		)
	;
			
objectAccess returns [org.z.lexer.grammar.ObjectAccess result]
	:	{
			$result = new org.z.lexer.grammar.ObjectAccess();
		}
		(
			left=functionCall {
				$result.setLeft(left.result);
			}
			('.'^ (
				K_CLASS {
					$result.addRight(new org.z.lexer.grammar.Right(".", new org.z.lexer.grammar.Identifier("class")));
				}
				|
				right=functionCall {
					$result.addRight(new org.z.lexer.grammar.Right(".", right.result));
				})
			)*
		)
	;
		
functionCall returns [org.z.lexer.grammar.FunctionCall result]
	:	expr=comparisonExpression
		{
			$result = new org.z.lexer.grammar.FunctionCall();
			$result.setExpression(expr.result);
		}
		('(' args=expressionList ')'
		{
			$result.setArguments(args.result);
		})?
	;
	
comparisonOperator
	:	('==' | '!=')
	;
	
comparisonExpression returns [org.z.lexer.grammar.ComparisonExpression result]
	:	expr1=assignmentExpression {
			$result = new org.z.lexer.grammar.ComparisonExpression();
			$result.setLeft(expr1.result);
		}
		(
			(
				op=comparisonOperator^ expr2=expression {
					$result.addRight(new org.z.lexer.grammar.Right(op.toString(), expr2.result));
				}
			)*
		)
	;

assignmentOperator
	:	('=' | '+=' | '-=' | '*=' | '/=')
	;

assignmentExpression returns [org.z.lexer.grammar.AssignmentExpression result]
	:	expr1=unaryExpression {
			$result = new org.z.lexer.grammar.AssignmentExpression();
			$result.setLeft(expr1.result);
		}
		(
			(
				op=assignmentOperator^ expr2=expression {
					$result.addRight(new org.z.lexer.grammar.Right(op.toString(), expr2.result));
				}
			)*
		)
	;
	
unaryExpression returns [org.z.lexer.grammar.UnaryExpression result]
	:	expr=value {
			$result = expr.result;
		}
	;

value returns [org.z.lexer.grammar.Value result]
	:	{
			$result = new org.z.lexer.grammar.Value();
		}
		(x1=INT {
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
